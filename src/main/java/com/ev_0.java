/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Ev
 */
public class ev_0 {
    private static boolean A;

    public static void f(boolean bl) {
        A = bl;
    }

    public static boolean x() {
        return A;
    }

    public static boolean K() {
        boolean bl = ev_0.x();
        return !bl;
    }

    static {
        if (!ev_0.x()) {
            ev_0.f(true);
        }
    }
}

