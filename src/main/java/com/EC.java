/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;

public class EC {
    private final int F;
    private final int Q;
    private static boolean U;

    public EC(int n10, int n11) {
        this.F = n10;
        this.Q = n11;
        boolean bl = EC.x();
        if (!bl) {
            ky_2.K(new String[3]);
        }
    }

    public int O() {
        return this.F;
    }

    public int C() {
        return this.Q;
    }

    public static void S(boolean bl) {
        U = bl;
    }

    public static boolean j() {
        return U;
    }

    public static boolean x() {
        boolean bl = EC.j();
        return !bl;
    }

    static {
        if (EC.j()) {
            EC.S(true);
        }
    }
}

