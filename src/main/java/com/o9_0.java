/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.rp_1;

/*
 * Renamed from com.o9
 */
class o9_0 {
    static final int[] Q;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 2823886493354802591L;
        long l3 = 0x88907455DA6FBD99L ^ l2;
        Q = new int[rp_1.values().length];
        try {
            o9_0.Q[rp_1.BLINK_BLOCK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o9_0.Q[rp_1.STEADY_BLOCK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o9_0.Q[rp_1.BLINK_UNDERLINE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o9_0.Q[rp_1.STEADY_UNDERLINE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o9_0.Q[rp_1.BLINK_VERTICAL_BAR.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o9_0.Q[rp_1.STEADY_VERTICAL_BAR.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

