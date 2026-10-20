/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.lang.annotation.Annotation;
import java.lang.constant.Constable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import org.F.c;
import org.P;
import org.b_0;
import org.v.Hk;
import org.v.RG;
import org.v._J;
import org.v._L;
import org.v._S;
import org.v._t_0;
import org.v.f0;
import org.v.h4;
import org.v.hC;
import org.v.hP;
import org.v.ha_0;
import org.v.hd_0;
import org.v.ho_0;
import org.v.hv_0;
import org.v.i_1;
import org.v.q_2;
import org.v.u_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class hA
extends hd_0 {
    private final Class J;
    private final _L P;
    private static final String[] a;
    private static final String[] c;

    hA(Class clazz, _L _L2) {
        this.J = clazz;
        clazz.getTypeParameters();
        this.P = _L2;
    }

    @Override
    public _J[] V() {
        _J[] _JArray;
        block4: {
            TypeVariable<Class<T>>[] typeVariableArray = this.J.getTypeParameters();
            _J[] _JArray2 = new _J[typeVariableArray.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < _JArray2.length; ++i2) {
                try {
                    _JArray = _JArray2;
                    if (stringArray != null) {
                        _JArray[i2] = this.z(typeVariableArray[i2]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (P p2) {
                    throw hA.a(p2);
                }
            }
            _JArray = _JArray2;
        }
        return _JArray;
    }

    private _J z(TypeVariable typeVariable) {
        return new _t_0(this, typeVariable);
    }

    private q_2[] R(Type[] typeArray) throws b_0 {
        q_2[] q_2Array;
        block4: {
            q_2[] q_2Array2 = new q_2[typeArray.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < q_2Array2.length; ++i2) {
                try {
                    q_2Array = q_2Array2;
                    if (stringArray != null) {
                        q_2Array[i2] = this.j(typeArray[i2]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (b_0 b_02) {
                    throw hA.a(b_02);
                }
            }
            q_2Array = q_2Array2;
        }
        return q_2Array;
    }

    private q_2 j(Type type) throws b_0 {
        boolean bl;
        block31: {
            block32: {
                String[] stringArray;
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                block23: {
                                    block24: {
                                        hd_0 hd_02;
                                        block25: {
                                            hd_0 hd_03;
                                            block26: {
                                                stringArray = RG.C();
                                                try {
                                                    bl = type instanceof Class;
                                                    if (stringArray == null) break block23;
                                                    if (!bl) break block24;
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    throw hA.a(classNotFoundException);
                                                }
                                                try {
                                                    hd_03 = this.P.X(f0.n(((Class)type).getName()));
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    throw new b_0(hA.b(-11968, 1945) + type + "\"", null, classNotFoundException);
                                                }
                                                try {
                                                    try {
                                                        hd_02 = hd_03;
                                                        if (stringArray == null) break block25;
                                                        if (hd_02 != null) break block26;
                                                    }
                                                    catch (ClassNotFoundException classNotFoundException) {
                                                        throw hA.a(classNotFoundException);
                                                    }
                                                    throw new b_0(hA.b(-11953, -18531) + type + "\"", null);
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    throw hA.a(classNotFoundException);
                                                }
                                            }
                                            hd_02 = hd_03;
                                        }
                                        return hd_02;
                                    }
                                    bl = type instanceof GenericArrayType;
                                }
                                try {
                                    try {
                                        if (stringArray == null) break block27;
                                        if (!bl) break block28;
                                    }
                                    catch (ClassNotFoundException classNotFoundException) {
                                        throw hA.a(classNotFoundException);
                                    }
                                    throw new AssertionError((Object)hA.b(-11966, 21141));
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    throw hA.a(classNotFoundException);
                                }
                            }
                            bl = type instanceof ParameterizedType;
                        }
                        try {
                            try {
                                if (stringArray == null) break block29;
                                if (!bl) break block30;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                throw hA.a(classNotFoundException);
                            }
                            throw new AssertionError((Object)hA.b(-11954, 20175));
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            throw hA.a(classNotFoundException);
                        }
                    }
                    bl = type instanceof TypeVariable;
                }
                try {
                    try {
                        if (stringArray == null) break block31;
                        if (!bl) break block32;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw hA.a(classNotFoundException);
                    }
                    throw new AssertionError((Object)hA.b(-11954, 20175));
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw hA.a(classNotFoundException);
                }
            }
            bl = type instanceof WildcardType;
        }
        try {
            if (bl) {
                throw new AssertionError((Object)hA.b(-11954, 20175));
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw hA.a(classNotFoundException);
        }
        throw new AssertionError(type.getClass());
    }

    @Override
    protected hv_0[] C() {
        hv_0[] hv_0Array;
        block4: {
            Constructor<?>[] constructorArray = this.J.getDeclaredConstructors();
            hv_0[] hv_0Array2 = new hv_0[constructorArray.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < constructorArray.length; ++i2) {
                try {
                    hv_0Array = hv_0Array2;
                    if (stringArray != null) {
                        hv_0Array[i2] = new ho_0(this, constructorArray[i2]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (P p2) {
                    throw hA.a(p2);
                }
            }
            hv_0Array = hv_0Array2;
        }
        return hv_0Array;
    }

    @Override
    protected hP[] H() {
        hA hA2;
        Method[] methodArray;
        block11: {
            block10: {
                int n10;
                block9: {
                    methodArray = this.J.getDeclaredMethods();
                    String[] stringArray = RG.C();
                    try {
                        try {
                            try {
                                n10 = methodArray.length;
                                if (stringArray == null) break block9;
                                if (n10 != 0) break block10;
                            }
                            catch (P p2) {
                                throw hA.a(p2);
                            }
                            hA2 = this;
                            if (stringArray == null) break block11;
                        }
                        catch (P p3) {
                            throw hA.a(p3);
                        }
                        n10 = hA2.J.isArray() ? 1 : 0;
                    }
                    catch (P p5) {
                        throw hA.a(p5);
                    }
                }
                try {
                    if (n10 != 0) {
                        return new hP[]{new hC(this)};
                    }
                }
                catch (P p6) {
                    throw hA.a(p6);
                }
            }
            hA2 = this;
        }
        return hA2.V(methodArray);
    }

    @Override
    protected u_1[] A() {
        return this.V(this.J.getDeclaredFields());
    }

    @Override
    protected hd_0[] j() {
        return this.h(this.J.getDeclaredClasses());
    }

    @Override
    @c
    protected hd_0 V() {
        hd_0 hd_02;
        Class<?> clazz = this.J.getDeclaringClass();
        try {
            hd_02 = clazz == null ? null : this.X(clazz);
        }
        catch (P p2) {
            throw hA.a(p2);
        }
        return hd_02;
    }

    @Override
    @c
    protected hd_0 l() throws b_0 {
        hd_0 hd_02;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        hd_02 = this;
                        if (stringArray == null) break block4;
                        if (!Modifier.isStatic(hd_02.J.getModifiers())) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hA.a(b_02);
                    }
                    return null;
                }
                catch (b_0 b_03) {
                    throw hA.a(b_03);
                }
            }
            hd_02 = this.L();
        }
        return hd_02;
    }

    @Override
    @c
    protected hd_0 g() {
        hd_0 hd_02;
        Class clazz = this.J.getSuperclass();
        try {
            hd_02 = clazz == null ? null : this.X(clazz);
        }
        catch (P p2) {
            throw hA.a(p2);
        }
        return hd_02;
    }

    @Override
    @c
    protected hd_0 G() {
        hd_0 hd_02;
        Class<?> clazz = this.J.getComponentType();
        try {
            hd_02 = clazz == null ? null : this.X(clazz);
        }
        catch (P p2) {
            throw hA.a(p2);
        }
        return hd_02;
    }

    @Override
    protected hd_0[] l() {
        return this.h(this.J.getInterfaces());
    }

    @Override
    protected String J() {
        return f0.n(this.J.getName());
    }

    @Override
    public _S r() {
        return hA.C(this.J.getModifiers());
    }

    @Override
    public boolean M() {
        return Modifier.isFinal(this.J.getModifiers());
    }

    @Override
    public boolean s() {
        return this.J.isEnum();
    }

    @Override
    public boolean P() {
        return this.J.isInterface();
    }

    @Override
    public boolean B() {
        return Modifier.isAbstract(this.J.getModifiers());
    }

    @Override
    public boolean q() {
        return this.J.isArray();
    }

    @Override
    public boolean o() {
        return this.J.isPrimitive();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean p() {
        Class<Constable> clazz;
        Class clazz2;
        block31: {
            String[] stringArray;
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                stringArray = RG.C();
                                try {
                                    try {
                                        clazz2 = this.J;
                                        clazz = Byte.TYPE;
                                        if (stringArray == null) break block26;
                                        if (clazz2 == clazz) return true;
                                    }
                                    catch (P p2) {
                                        throw hA.a(p2);
                                    }
                                    clazz2 = this.J;
                                    clazz = Short.TYPE;
                                }
                                catch (P p3) {
                                    throw hA.a(p3);
                                }
                            }
                            try {
                                try {
                                    if (stringArray == null) break block27;
                                    if (clazz2 == clazz) return true;
                                }
                                catch (P p5) {
                                    throw hA.a(p5);
                                }
                                clazz2 = this.J;
                                clazz = Integer.TYPE;
                            }
                            catch (P p6) {
                                throw hA.a(p6);
                            }
                        }
                        try {
                            try {
                                if (stringArray == null) break block28;
                                if (clazz2 == clazz) return true;
                            }
                            catch (P p7) {
                                throw hA.a(p7);
                            }
                            clazz2 = this.J;
                            clazz = Long.TYPE;
                        }
                        catch (P p8) {
                            throw hA.a(p8);
                        }
                    }
                    try {
                        try {
                            if (stringArray == null) break block29;
                            if (clazz2 == clazz) return true;
                        }
                        catch (P p9) {
                            throw hA.a(p9);
                        }
                        clazz2 = this.J;
                        clazz = Character.TYPE;
                    }
                    catch (P p10) {
                        throw hA.a(p10);
                    }
                }
                try {
                    try {
                        if (stringArray == null) break block30;
                        if (clazz2 == clazz) return true;
                    }
                    catch (P p11) {
                        throw hA.a(p11);
                    }
                    clazz2 = this.J;
                    clazz = Float.TYPE;
                }
                catch (P p12) {
                    throw hA.a(p12);
                }
            }
            try {
                try {
                    if (stringArray == null) break block31;
                    if (clazz2 == clazz) return true;
                }
                catch (P p13) {
                    throw hA.a(p13);
                }
                clazz2 = this.J;
                clazz = Double.TYPE;
            }
            catch (P p14) {
                throw hA.a(p14);
            }
        }
        try {
            if (clazz2 != clazz) return false;
            return true;
        }
        catch (P p15) {
            throw hA.a(p15);
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public h4[] a() throws b_0 {
        int n10;
        String[] stringArray;
        Annotation[] annotationArray;
        block10: {
            block11: {
                annotationArray = this.J.getAnnotations();
                stringArray = RG.C();
                n10 = annotationArray.length;
                if (stringArray == null) break block10;
                try {
                    block12: {
                        if (n10 != 0) break block11;
                        break block12;
                        catch (ClassNotFoundException classNotFoundException) {
                            throw hA.a(classNotFoundException);
                        }
                    }
                    return hd_0.u;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw hA.a(classNotFoundException);
                }
            }
            n10 = annotationArray.length;
        }
        h4[] h4Array = new h4[n10];
        for (int i2 = 0; i2 < annotationArray.length; ++i2) {
            hd_0 hd_02;
            Annotation annotation = annotationArray[i2];
            Class<? extends Annotation> clazz = annotation.annotationType();
            try {
                hd_02 = this.P.X(f0.n(clazz.getName()));
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new b_0(hA.b(-11955, -24032), null, classNotFoundException);
            }
            try {
                if (hd_02 == null) {
                    throw new b_0(hA.b(-11960, 21567) + clazz.getName() + "\"", null);
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw hA.a(classNotFoundException);
            }
            h4Array[i2] = new Hk(this, hd_02, annotation, clazz);
            if (stringArray != null) continue;
        }
        return h4Array;
    }

    public Class w() {
        return this.J;
    }

    @Override
    public String toString() {
        String string;
        block5: {
            Class<?> clazz;
            String[] stringArray;
            int n10;
            block4: {
                n10 = 0;
                Class<?> clazz2 = this.J;
                stringArray = RG.C();
                while (clazz2.isArray()) {
                    ++n10;
                    clazz = clazz2.getComponentType();
                    if (stringArray != null) {
                        clazz2 = clazz;
                        if (stringArray != null) continue;
                    }
                    break block4;
                }
                clazz = clazz2;
            }
            String string2 = clazz.getName();
            while (n10-- > 0) {
                string = string2 + hA.b(-11965, 2977);
                if (stringArray != null) {
                    string2 = string;
                    if (stringArray != null) continue;
                }
                break block5;
            }
            string = string2;
        }
        return string;
    }

    private hd_0 X(Class clazz) {
        hd_0 hd_02;
        block6: {
            hd_0 hd_03;
            block7: {
                String[] stringArray = RG.C();
                try {
                    hd_03 = this.P.X(f0.n(clazz.getName()));
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new P(hA.b(-11956, 10975) + clazz.getName() + hA.b(-11959, -2286) + classNotFoundException);
                }
                try {
                    try {
                        hd_02 = hd_03;
                        if (stringArray == null) break block6;
                        if (hd_02 != null) break block7;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw hA.a(classNotFoundException);
                    }
                    throw new P(hA.b(-11958, 28796) + clazz.getName() + hA.b(-11957, 24617));
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw hA.a(classNotFoundException);
                }
            }
            hd_02 = hd_03;
        }
        return hd_02;
    }

    private hd_0[] h(Class[] classArray) {
        hd_0[] hd_0Array;
        block4: {
            hd_0[] hd_0Array2 = new hd_0[classArray.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < classArray.length; ++i2) {
                try {
                    hd_0Array = hd_0Array2;
                    if (stringArray != null) {
                        hd_0Array[i2] = this.X(classArray[i2]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (P p2) {
                    throw hA.a(p2);
                }
            }
            hd_0Array = hd_0Array2;
        }
        return hd_0Array;
    }

    private hP[] V(Method[] methodArray) {
        hP[] hPArray;
        block4: {
            hP[] hPArray2 = new hP[methodArray.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < hPArray2.length; ++i2) {
                try {
                    hPArray = hPArray2;
                    if (stringArray != null) {
                        hPArray[i2] = new ha_0(this, methodArray[i2]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (P p2) {
                    throw hA.a(p2);
                }
            }
            hPArray = hPArray2;
        }
        return hPArray;
    }

    private u_1[] V(Field[] fieldArray) {
        u_1[] u_1Array;
        block4: {
            u_1[] u_1Array2 = new u_1[fieldArray.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < fieldArray.length; ++i2) {
                try {
                    u_1Array = u_1Array2;
                    if (stringArray != null) {
                        u_1Array[i2] = new i_1(this, fieldArray[i2]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (P p2) {
                    throw hA.a(p2);
                }
            }
            u_1Array = u_1Array2;
        }
        return u_1Array;
    }

    private static _S C(int n10) {
        _S _S2;
        block12: {
            boolean bl;
            block13: {
                block14: {
                    String[] stringArray;
                    block10: {
                        block11: {
                            stringArray = RG.C();
                            try {
                                try {
                                    bl = Modifier.isPrivate(n10);
                                    if (stringArray == null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (P p2) {
                                    throw hA.a(p2);
                                }
                                _S2 = _S.PRIVATE;
                                break block12;
                            }
                            catch (P p3) {
                                throw hA.a(p3);
                            }
                        }
                        bl = Modifier.isProtected(n10);
                    }
                    try {
                        try {
                            if (stringArray == null) break block13;
                            if (!bl) break block14;
                        }
                        catch (P p5) {
                            throw hA.a(p5);
                        }
                        _S2 = _S.PROTECTED;
                        break block12;
                    }
                    catch (P p6) {
                        throw hA.a(p6);
                    }
                }
                bl = Modifier.isPublic(n10);
            }
            try {
                _S2 = bl ? _S.PUBLIC : _S.DEFAULT;
            }
            catch (P p7) {
                throw hA.a(p7);
            }
        }
        return _S2;
    }

    static q_2[] f(hA hA2, Type[] typeArray) throws b_0 {
        return hA2.R(typeArray);
    }

    static _L v(hA hA2) {
        return hA2.P;
    }

    static hd_0 r(hA hA2, Class clazz) {
        return hA2.X(clazz);
    }

    static _S J(int n10) {
        return hA.C(n10);
    }

    static hd_0[] f(hA hA2, Class[] classArray) {
        return hA2.h(classArray);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[11];
                var3_1 = 0;
                var2_2 = "\u00d0Tm\u00b9b\u0092\u00b5u{\u001c\u0099\u00ed\u00ca\u00ae\u0086\u00c1\u00dc\u0015\u00a7\u001f\u00efd\u00dd\u00d00b\u0014\u0018\u00b7\u009a\u00f7\u001c\u0013\u009d}x`>\u00d9\\\u0080r\u00dc\u00ee\u00b5\u008f\u00b6\u000e\u0081o\u0098\u0010\u00ee\u00ed\u00b1C\u008a\u00db\u008c\u0081\u00c0\u00a0\u009e\\!6\u00f8\u008a\u0003I&]\u0003\u008dGM\u0010Q\u0005F^txS\u00f5;.\u00e1\u008d\u00ce\f\u0005\u00cd\u0010wMx_(\u001f}\u00d1\u00eboa\u00a4\u00cc\u00f1\u0015\u0087\u0017\u00e9f\u00ab:R\u00b32D*\u00f0v\u00d1k\u0082R\u00f2\u00edd\u001c)\u0085\u001e\u0005\u0003\u00d7/\u0006";
                var4_3 = "\u00d0Tm\u00b9b\u0092\u00b5u{\u001c\u0099\u00ed\u00ca\u00ae\u0086\u00c1\u00dc\u0015\u00a7\u001f\u00efd\u00dd\u00d00b\u0014\u0018\u00b7\u009a\u00f7\u001c\u0013\u009d}x`>\u00d9\\\u0080r\u00dc\u00ee\u00b5\u008f\u00b6\u000e\u0081o\u0098\u0010\u00ee\u00ed\u00b1C\u008a\u00db\u008c\u0081\u00c0\u00a0\u009e\\!6\u00f8\u008a\u0003I&]\u0003\u008dGM\u0010Q\u0005F^txS\u00f5;.\u00e1\u008d\u00ce\f\u0005\u00cd\u0010wMx_(\u001f}\u00d1\u00eboa\u00a4\u00cc\u00f1\u0015\u0087\u0017\u00e9f\u00ab:R\u00b32D*\u00f0v\u00d1k\u0082R\u00f2\u00edd\u001c)\u0085\u001e\u0005\u0003\u00d7/\u0006".length();
                var1_4 = 19;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 89;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00c1#\tts\u00db[\u009f\\Hz\u00e5";
                    var4_3 = "\u00c1#\tts\u00db[\u009f\\Hz\u00e5".length();
                    var1_4 = 2;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 126;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 66;
                            break;
                        }
                        case 1: {
                            v15 = 16;
                            break;
                        }
                        case 2: {
                            v15 = 8;
                            break;
                        }
                        case 3: {
                            v15 = 96;
                            break;
                        }
                        case 4: {
                            v15 = 112;
                            break;
                        }
                        case 5: {
                            v15 = 12;
                            break;
                        }
                        default: {
                            v15 = 39;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        hA.a = var5;
        hA.c = new String[11];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD14A) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 144;
                    break;
                }
                case 1: {
                    n14 = 206;
                    break;
                }
                case 2: {
                    n14 = 23;
                    break;
                }
                case 3: {
                    n14 = 234;
                    break;
                }
                case 4: {
                    n14 = 61;
                    break;
                }
                case 5: {
                    n14 = 27;
                    break;
                }
                case 6: {
                    n14 = 120;
                    break;
                }
                case 7: {
                    n14 = 40;
                    break;
                }
                case 8: {
                    n14 = 223;
                    break;
                }
                case 9: {
                    n14 = 177;
                    break;
                }
                case 10: {
                    n14 = 246;
                    break;
                }
                case 11: {
                    n14 = 185;
                    break;
                }
                case 12: {
                    n14 = 212;
                    break;
                }
                case 13: {
                    n14 = 8;
                    break;
                }
                case 14: {
                    n14 = 11;
                    break;
                }
                case 15: {
                    n14 = 114;
                    break;
                }
                case 16: {
                    n14 = 176;
                    break;
                }
                case 17: {
                    n14 = 250;
                    break;
                }
                case 18: {
                    n14 = 21;
                    break;
                }
                case 19: {
                    n14 = 87;
                    break;
                }
                case 20: {
                    n14 = 160;
                    break;
                }
                case 21: {
                    n14 = 35;
                    break;
                }
                case 22: {
                    n14 = 165;
                    break;
                }
                case 23: {
                    n14 = 51;
                    break;
                }
                case 24: {
                    n14 = 100;
                    break;
                }
                case 25: {
                    n14 = 85;
                    break;
                }
                case 26: {
                    n14 = 174;
                    break;
                }
                case 27: {
                    n14 = 14;
                    break;
                }
                case 28: {
                    n14 = 9;
                    break;
                }
                case 29: {
                    n14 = 188;
                    break;
                }
                case 30: {
                    n14 = 129;
                    break;
                }
                case 31: {
                    n14 = 232;
                    break;
                }
                case 32: {
                    n14 = 208;
                    break;
                }
                case 33: {
                    n14 = 104;
                    break;
                }
                case 34: {
                    n14 = 194;
                    break;
                }
                case 35: {
                    n14 = 82;
                    break;
                }
                case 36: {
                    n14 = 18;
                    break;
                }
                case 37: {
                    n14 = 236;
                    break;
                }
                case 38: {
                    n14 = 93;
                    break;
                }
                case 39: {
                    n14 = 52;
                    break;
                }
                case 40: {
                    n14 = 158;
                    break;
                }
                case 41: {
                    n14 = 103;
                    break;
                }
                case 42: {
                    n14 = 181;
                    break;
                }
                case 43: {
                    n14 = 125;
                    break;
                }
                case 44: {
                    n14 = 226;
                    break;
                }
                case 45: {
                    n14 = 175;
                    break;
                }
                case 46: {
                    n14 = 89;
                    break;
                }
                case 47: {
                    n14 = 13;
                    break;
                }
                case 48: {
                    n14 = 65;
                    break;
                }
                case 49: {
                    n14 = 22;
                    break;
                }
                case 50: {
                    n14 = 142;
                    break;
                }
                case 51: {
                    n14 = 229;
                    break;
                }
                case 52: {
                    n14 = 81;
                    break;
                }
                case 53: {
                    n14 = 43;
                    break;
                }
                case 54: {
                    n14 = 166;
                    break;
                }
                case 55: {
                    n14 = 128;
                    break;
                }
                case 56: {
                    n14 = 58;
                    break;
                }
                case 57: {
                    n14 = 7;
                    break;
                }
                case 58: {
                    n14 = 225;
                    break;
                }
                case 59: {
                    n14 = 231;
                    break;
                }
                case 60: {
                    n14 = 92;
                    break;
                }
                case 61: {
                    n14 = 202;
                    break;
                }
                case 62: {
                    n14 = 179;
                    break;
                }
                case 63: {
                    n14 = 143;
                    break;
                }
                case 64: {
                    n14 = 127;
                    break;
                }
                case 65: {
                    n14 = 84;
                    break;
                }
                case 66: {
                    n14 = 122;
                    break;
                }
                case 67: {
                    n14 = 233;
                    break;
                }
                case 68: {
                    n14 = 44;
                    break;
                }
                case 69: {
                    n14 = 38;
                    break;
                }
                case 70: {
                    n14 = 170;
                    break;
                }
                case 71: {
                    n14 = 133;
                    break;
                }
                case 72: {
                    n14 = 149;
                    break;
                }
                case 73: {
                    n14 = 164;
                    break;
                }
                case 74: {
                    n14 = 148;
                    break;
                }
                case 75: {
                    n14 = 86;
                    break;
                }
                case 76: {
                    n14 = 1;
                    break;
                }
                case 77: {
                    n14 = 6;
                    break;
                }
                case 78: {
                    n14 = 169;
                    break;
                }
                case 79: {
                    n14 = 0;
                    break;
                }
                case 80: {
                    n14 = 15;
                    break;
                }
                case 81: {
                    n14 = 221;
                    break;
                }
                case 82: {
                    n14 = 162;
                    break;
                }
                case 83: {
                    n14 = 159;
                    break;
                }
                case 84: {
                    n14 = 239;
                    break;
                }
                case 85: {
                    n14 = 57;
                    break;
                }
                case 86: {
                    n14 = 241;
                    break;
                }
                case 87: {
                    n14 = 74;
                    break;
                }
                case 88: {
                    n14 = 20;
                    break;
                }
                case 89: {
                    n14 = 39;
                    break;
                }
                case 90: {
                    n14 = 217;
                    break;
                }
                case 91: {
                    n14 = 215;
                    break;
                }
                case 92: {
                    n14 = 200;
                    break;
                }
                case 93: {
                    n14 = 62;
                    break;
                }
                case 94: {
                    n14 = 245;
                    break;
                }
                case 95: {
                    n14 = 10;
                    break;
                }
                case 96: {
                    n14 = 252;
                    break;
                }
                case 97: {
                    n14 = 227;
                    break;
                }
                case 98: {
                    n14 = 193;
                    break;
                }
                case 99: {
                    n14 = 157;
                    break;
                }
                case 100: {
                    n14 = 238;
                    break;
                }
                case 101: {
                    n14 = 47;
                    break;
                }
                case 102: {
                    n14 = 192;
                    break;
                }
                case 103: {
                    n14 = 31;
                    break;
                }
                case 104: {
                    n14 = 88;
                    break;
                }
                case 105: {
                    n14 = 97;
                    break;
                }
                case 106: {
                    n14 = 187;
                    break;
                }
                case 107: {
                    n14 = 73;
                    break;
                }
                case 108: {
                    n14 = 191;
                    break;
                }
                case 109: {
                    n14 = 155;
                    break;
                }
                case 110: {
                    n14 = 186;
                    break;
                }
                case 111: {
                    n14 = 25;
                    break;
                }
                case 112: {
                    n14 = 116;
                    break;
                }
                case 113: {
                    n14 = 211;
                    break;
                }
                case 114: {
                    n14 = 222;
                    break;
                }
                case 115: {
                    n14 = 50;
                    break;
                }
                case 116: {
                    n14 = 195;
                    break;
                }
                case 117: {
                    n14 = 131;
                    break;
                }
                case 118: {
                    n14 = 102;
                    break;
                }
                case 119: {
                    n14 = 45;
                    break;
                }
                case 120: {
                    n14 = 30;
                    break;
                }
                case 121: {
                    n14 = 99;
                    break;
                }
                case 122: {
                    n14 = 209;
                    break;
                }
                case 123: {
                    n14 = 147;
                    break;
                }
                case 124: {
                    n14 = 17;
                    break;
                }
                case 125: {
                    n14 = 182;
                    break;
                }
                case 126: {
                    n14 = 67;
                    break;
                }
                case 127: {
                    n14 = 197;
                    break;
                }
                case 128: {
                    n14 = 235;
                    break;
                }
                case 129: {
                    n14 = 115;
                    break;
                }
                case 130: {
                    n14 = 237;
                    break;
                }
                case 131: {
                    n14 = 141;
                    break;
                }
                case 132: {
                    n14 = 101;
                    break;
                }
                case 133: {
                    n14 = 121;
                    break;
                }
                case 134: {
                    n14 = 172;
                    break;
                }
                case 135: {
                    n14 = 70;
                    break;
                }
                case 136: {
                    n14 = 32;
                    break;
                }
                case 137: {
                    n14 = 49;
                    break;
                }
                case 138: {
                    n14 = 199;
                    break;
                }
                case 139: {
                    n14 = 210;
                    break;
                }
                case 140: {
                    n14 = 243;
                    break;
                }
                case 141: {
                    n14 = 255;
                    break;
                }
                case 142: {
                    n14 = 216;
                    break;
                }
                case 143: {
                    n14 = 56;
                    break;
                }
                case 144: {
                    n14 = 184;
                    break;
                }
                case 145: {
                    n14 = 78;
                    break;
                }
                case 146: {
                    n14 = 218;
                    break;
                }
                case 147: {
                    n14 = 190;
                    break;
                }
                case 148: {
                    n14 = 123;
                    break;
                }
                case 149: {
                    n14 = 41;
                    break;
                }
                case 150: {
                    n14 = 247;
                    break;
                }
                case 151: {
                    n14 = 64;
                    break;
                }
                case 152: {
                    n14 = 132;
                    break;
                }
                case 153: {
                    n14 = 219;
                    break;
                }
                case 154: {
                    n14 = 153;
                    break;
                }
                case 155: {
                    n14 = 224;
                    break;
                }
                case 156: {
                    n14 = 80;
                    break;
                }
                case 157: {
                    n14 = 109;
                    break;
                }
                case 158: {
                    n14 = 24;
                    break;
                }
                case 159: {
                    n14 = 230;
                    break;
                }
                case 160: {
                    n14 = 180;
                    break;
                }
                case 161: {
                    n14 = 213;
                    break;
                }
                case 162: {
                    n14 = 117;
                    break;
                }
                case 163: {
                    n14 = 249;
                    break;
                }
                case 164: {
                    n14 = 37;
                    break;
                }
                case 165: {
                    n14 = 90;
                    break;
                }
                case 166: {
                    n14 = 68;
                    break;
                }
                case 167: {
                    n14 = 113;
                    break;
                }
                case 168: {
                    n14 = 34;
                    break;
                }
                case 169: {
                    n14 = 136;
                    break;
                }
                case 170: {
                    n14 = 2;
                    break;
                }
                case 171: {
                    n14 = 167;
                    break;
                }
                case 172: {
                    n14 = 207;
                    break;
                }
                case 173: {
                    n14 = 59;
                    break;
                }
                case 174: {
                    n14 = 173;
                    break;
                }
                case 175: {
                    n14 = 220;
                    break;
                }
                case 176: {
                    n14 = 135;
                    break;
                }
                case 177: {
                    n14 = 72;
                    break;
                }
                case 178: {
                    n14 = 201;
                    break;
                }
                case 179: {
                    n14 = 53;
                    break;
                }
                case 180: {
                    n14 = 42;
                    break;
                }
                case 181: {
                    n14 = 178;
                    break;
                }
                case 182: {
                    n14 = 71;
                    break;
                }
                case 183: {
                    n14 = 139;
                    break;
                }
                case 184: {
                    n14 = 126;
                    break;
                }
                case 185: {
                    n14 = 204;
                    break;
                }
                case 186: {
                    n14 = 69;
                    break;
                }
                case 187: {
                    n14 = 242;
                    break;
                }
                case 188: {
                    n14 = 112;
                    break;
                }
                case 189: {
                    n14 = 154;
                    break;
                }
                case 190: {
                    n14 = 134;
                    break;
                }
                case 191: {
                    n14 = 138;
                    break;
                }
                case 192: {
                    n14 = 145;
                    break;
                }
                case 193: {
                    n14 = 119;
                    break;
                }
                case 194: {
                    n14 = 189;
                    break;
                }
                case 195: {
                    n14 = 33;
                    break;
                }
                case 196: {
                    n14 = 5;
                    break;
                }
                case 197: {
                    n14 = 46;
                    break;
                }
                case 198: {
                    n14 = 66;
                    break;
                }
                case 199: {
                    n14 = 77;
                    break;
                }
                case 200: {
                    n14 = 75;
                    break;
                }
                case 201: {
                    n14 = 161;
                    break;
                }
                case 202: {
                    n14 = 91;
                    break;
                }
                case 203: {
                    n14 = 244;
                    break;
                }
                case 204: {
                    n14 = 19;
                    break;
                }
                case 205: {
                    n14 = 124;
                    break;
                }
                case 206: {
                    n14 = 248;
                    break;
                }
                case 207: {
                    n14 = 214;
                    break;
                }
                case 208: {
                    n14 = 96;
                    break;
                }
                case 209: {
                    n14 = 140;
                    break;
                }
                case 210: {
                    n14 = 168;
                    break;
                }
                case 211: {
                    n14 = 146;
                    break;
                }
                case 212: {
                    n14 = 196;
                    break;
                }
                case 213: {
                    n14 = 163;
                    break;
                }
                case 214: {
                    n14 = 150;
                    break;
                }
                case 215: {
                    n14 = 203;
                    break;
                }
                case 216: {
                    n14 = 240;
                    break;
                }
                case 217: {
                    n14 = 76;
                    break;
                }
                case 218: {
                    n14 = 105;
                    break;
                }
                case 219: {
                    n14 = 254;
                    break;
                }
                case 220: {
                    n14 = 48;
                    break;
                }
                case 221: {
                    n14 = 28;
                    break;
                }
                case 222: {
                    n14 = 4;
                    break;
                }
                case 223: {
                    n14 = 26;
                    break;
                }
                case 224: {
                    n14 = 205;
                    break;
                }
                case 225: {
                    n14 = 107;
                    break;
                }
                case 226: {
                    n14 = 95;
                    break;
                }
                case 227: {
                    n14 = 111;
                    break;
                }
                case 228: {
                    n14 = 156;
                    break;
                }
                case 229: {
                    n14 = 79;
                    break;
                }
                case 230: {
                    n14 = 110;
                    break;
                }
                case 231: {
                    n14 = 183;
                    break;
                }
                case 232: {
                    n14 = 60;
                    break;
                }
                case 233: {
                    n14 = 253;
                    break;
                }
                case 234: {
                    n14 = 55;
                    break;
                }
                case 235: {
                    n14 = 106;
                    break;
                }
                case 236: {
                    n14 = 63;
                    break;
                }
                case 237: {
                    n14 = 54;
                    break;
                }
                case 238: {
                    n14 = 108;
                    break;
                }
                case 239: {
                    n14 = 36;
                    break;
                }
                case 240: {
                    n14 = 3;
                    break;
                }
                case 241: {
                    n14 = 152;
                    break;
                }
                case 242: {
                    n14 = 98;
                    break;
                }
                case 243: {
                    n14 = 29;
                    break;
                }
                case 244: {
                    n14 = 83;
                    break;
                }
                case 245: {
                    n14 = 137;
                    break;
                }
                case 246: {
                    n14 = 94;
                    break;
                }
                case 247: {
                    n14 = 228;
                    break;
                }
                case 248: {
                    n14 = 118;
                    break;
                }
                case 249: {
                    n14 = 12;
                    break;
                }
                case 250: {
                    n14 = 198;
                    break;
                }
                case 251: {
                    n14 = 171;
                    break;
                }
                case 252: {
                    n14 = 151;
                    break;
                }
                case 253: {
                    n14 = 251;
                    break;
                }
                case 254: {
                    n14 = 130;
                    break;
                }
                default: {
                    n14 = 16;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            hA.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

