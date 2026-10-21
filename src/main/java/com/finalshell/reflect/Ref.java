package com.finalshell.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射调用辅助类（手工补全，非反编译产物）。
 *
 * <p>混淆器把普通的静态/实例方法调用改写成"查表 + 反射调用"两步：
 * <pre>
 *     Method m = com.c.d(key);      // 按 key 从 com.c 的注册表里取出 Method
 *     Object r = m.invoke(target, argsPack);
 * </pre>
 * 其中 {@code argsPack} 是 {@code com.c.a(...)} 打包出来的 {@code Object[]}。
 *
 * <p>反编译器处理这一串 {@code swap}/{@code dup} 栈调整指令时，会把同一个
 * 局部变量槽同时当成 {@code Method} 和 {@code Object[]}，产生
 * {@code Method 不能转成 Object[]} 这类无法编译的代码（占全部编译错误的近八成）。
 *
 * <p>本类把反射调用收敛到一个入口，调用点只剩一次方法调用，类型不再冲突。
 * 运行时行为与原程序完全一致：{@code InvocationTargetException} 仍按原样透出，
 * 由调用点原有的 catch 块转抛目标异常。
 */
public final class Ref {

    private Ref() {
    }

    /**
     * 调用注册表 key 对应的方法（实例方法或静态方法）。
     *
     * @param key    com.c 注册表中的方法键
     * @param target 接收者；静态方法传 null
     * @param args   实参数组
     */
    /**
     * 调用注册表 key 对应的方法。
     *
     * <p>两个 Object 参数里必然有一个是实参数组（{@code Object[]}），另一个是接收者
     * （静态方法时为 null）。这里在运行时判定谁是 args，因此调用点不必关心
     * 字节码栈上的先后顺序 —— 那是编译器的事，源码里不该泄漏这种细节。
     *
     * <p><b>参数顺序必须与字节码改写器生成的一致：key 在最前。</b>
     * 调用点形如 {@code Ref.h(614246546767074737L, var3, var4)}，
     * key 是 long 字面量，接收者和实参数组在后。
     *
     * @param key    com.c 注册表中的方法键
     * @param target 接收者；静态方法传 null
     * @param args   实参数组
     */
    public static <T> T h(long key, Object target, Object args) throws InvocationTargetException {
        Object[] a = (args instanceof Object[]) ? (Object[]) args : (Object[]) target;
        Object t = (args instanceof Object[]) ? target : args;
        try {
            Method m = Registry.lookupMethod(key);
            return cast(m.invoke(t, a));
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * 调用注册表 key 对应的静态方法（接收者为 null）。参数顺序同 {@link #h}。
     *
     * <p>第二个参数放宽成 {@code Object}：调用点上它是混淆器打包出来的实参数组，
     * 但反编译出来的静态类型未必还是 {@code Object[]}，放宽后不必逐个强转。
     */
    public static <T> T h2(long key, Object args) throws InvocationTargetException {
        Object[] a = (args instanceof Object[]) ? (Object[]) args
                : (args == null ? new Object[0] : new Object[]{args});
        try {
            Method m = Registry.lookupMethod(key);
            return cast(m.invoke(null, a));
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new IllegalStateException(e);
        }
    }

    /** 写注册表 key 对应的字段。参数顺序同 {@link #h}。 */
    public static void s(long key, Object obj, Object val) {
        try {
            Field f = Registry.lookupField(key);
            f.set(obj, val);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new IllegalStateException(e);
        }
    }

    /** 读注册表 key 对应的字段。 */
    public static <T> T g(long key, Object obj) {
        try {
            Field f = Registry.lookupField(key);
            return cast(f.get(obj));
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     *  unchecked 转型。泛型参数只影响编译期，运行时擦除成 Object，
     *  因此实际拿到的还是原对象。
     */
    @SuppressWarnings("unchecked")
    private static <T> T cast(Object o) {
        return (T) o;
    }

    /**
     * 不改变异常实际类型地把一个受检异常抛出去。
     *
     * <p>泛型参数只影响编译期；运行时擦除成 Throwable，因此抛出的仍是原异常对象。
     * 显式给出类型实参 {@code RuntimeException} 后，编译器认为该调用不抛受检异常，
     * 于是可以出现在不允许声明受检异常的方法里（例如实现 Runnable.run）。
     */
    @SuppressWarnings("unchecked")
    public static <E extends Throwable> RuntimeException sneaky(Throwable t) throws E {
        throw (E) t;
    }
}
