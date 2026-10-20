/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xx_0;

class aH {
    static final int[] H = new int[xx_0.values().length];

    static {
        try {
            aH.H[xx_0.preferred.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aH.H[xx_0.fitComponent.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aH.H[xx_0.repeat.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

