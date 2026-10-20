/*
 * Decompiled with CFR 0.152.
 */
package org.T;

import org.F.c;

public final class E {
    private E() {
    }

    public static boolean Q(Class clazz, String string) {
        return E.o(clazz, string, false);
    }

    public static boolean o(Class clazz, String string, boolean bl) {
        String string2 = E.T(clazz, string);
        return string2 != null ? Boolean.parseBoolean(string2) : bl;
    }

    public static int V(Class clazz, String string, int n10) {
        String string2 = E.T(clazz, string);
        return string2 != null ? Integer.parseInt(string2) : n10;
    }

    @c
    public static String T(Class clazz, String string) {
        return E.g(clazz, string, null);
    }

    @c
    public static String g(Class clazz, String string, @c String string2) {
        String string3 = System.getProperty(clazz.getName() + "." + string);
        if (string3 != null) {
            return string3;
        }
        string3 = System.getProperty(clazz.getSimpleName() + "." + string);
        if (string3 != null) {
            return string3;
        }
        return string2;
    }
}

