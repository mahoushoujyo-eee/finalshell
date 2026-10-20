/*
 * Decompiled with CFR 0.152.
 */
package org.w;

import java.lang.reflect.Method;

public final class d {
    private static int[] Y;

    private d() {
    }

    public static Class Z(String string) {
        return d.M(ClassLoader.getSystemClassLoader(), string);
    }

    public static Class M(ClassLoader classLoader, String string) {
        try {
            return classLoader.loadClass(string);
        }
        catch (Exception exception) {
            throw new AssertionError((Object)exception);
        }
    }

    public static Method z(Class clazz, String string, Class[] classArray) {
        try {
            return clazz.getDeclaredMethod(string, classArray);
        }
        catch (Exception exception) {
            throw new AssertionError((Object)exception);
        }
    }

    public static void P(int[] nArray) {
        Y = nArray;
    }

    public static int[] q() {
        return Y;
    }

    static {
        if (d.q() != null) {
            d.P(new int[2]);
        }
    }
}

