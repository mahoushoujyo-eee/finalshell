/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_1;

/*
 * Renamed from com.cn
 */
class cn_2 {
    static final int[] V = new int[kz_1.values().length];

    static {
        try {
            cn_2.V[kz_1.any.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cn_2.V[kz_1.before.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cn_2.V[kz_1.after.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

