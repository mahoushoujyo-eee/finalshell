/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_1;

/*
 * Renamed from com.dy
 */
class dy_2 {
    static final int[] B = new int[kz_1.values().length];

    static {
        try {
            dy_2.B[kz_1.before.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dy_2.B[kz_1.any.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dy_2.B[kz_1.after.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

