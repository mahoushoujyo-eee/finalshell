/*
 * Decompiled with CFR 0.152.
 */
package org.v;

public final class f6 {
    private static int H;

    private f6() {
    }

    public static void m(int n10) {
        H = n10;
    }

    public static int k() {
        return H;
    }

    public static int P() {
        int n10 = f6.k();
        if (n10 == 0) {
            return 31;
        }
        return 0;
    }

    static {
        if (f6.k() == 0) {
            f6.m(54);
        }
    }
}

