/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wq_0;
import java.util.Arrays;

/*
 * Renamed from com.Rp
 */
class rp_0 {
    private final byte[] X;

    rp_0(int[] nArray) {
        this.X = rp_0.e(nArray);
    }

    rp_0(byte[] byArray) {
        this.X = byArray;
    }

    public boolean equals(Object object) {
        String[] stringArray = wq_0.y();
        Object object2 = this;
        if (stringArray == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (stringArray == null) {
            if (!(object2 instanceof rp_0)) {
                return false;
            }
            object2 = object;
        }
        rp_0 rp_02 = (rp_0)object2;
        return Arrays.equals(this.X, rp_02.X);
    }

    public int hashCode() {
        return Arrays.hashCode(this.X);
    }

    private static byte[] e(int[] nArray) {
        byte[] byArray = new byte[nArray.length];
        int n10 = 0;
        for (int n11 : nArray) {
            byArray[n10] = (byte)n11;
            ++n10;
        }
        return byArray;
    }
}

