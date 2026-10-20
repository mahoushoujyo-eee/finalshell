/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ob_1;

/*
 * Renamed from com.Sy
 */
class sy_0 {
    static final int[] s = new int[ob_1.values().length];

    static {
        try {
            sy_0.s[ob_1.step.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sy_0.s[ob_1.progress.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

