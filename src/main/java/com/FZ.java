/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.iz_0;

public class FZ {
    public final iz_0 m;
    public final iz_0 l;
    private static String[] d;

    public FZ(iz_0 iz_02, iz_0 iz_03) {
        this.m = iz_02;
        this.l = iz_03;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String[] stringArray = FZ.G();
        boolean bl = object instanceof FZ;
        if (stringArray == null) return bl;
        if (!bl) return false;
        FZ fZ2 = (FZ)object;
        iz_0 iz_02 = fZ2.m;
        iz_0 iz_03 = this.m;
        if (stringArray != null) {
            if (iz_02 != iz_03) return false;
            iz_02 = fZ2.l;
            iz_03 = this.l;
        }
        if (iz_02 != iz_03) return false;
        return true;
    }

    public static void r(String[] stringArray) {
        d = stringArray;
    }

    public static String[] G() {
        return d;
    }

    static {
        if (FZ.G() == null) {
            FZ.r(new String[2]);
        }
    }
}

