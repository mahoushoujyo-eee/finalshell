/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.fj_0;

/*
 * Renamed from com.iN
 */
class in_1 {
    static final int[] u = new int[fj_0.values().length];

    static {
        try {
            in_1.u[fj_0.horizontalStretch.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            in_1.u[fj_0.verticalStretch.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            in_1.u[fj_0.horizontalContent.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            in_1.u[fj_0.verticalContent.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

