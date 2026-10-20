/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.el_1;

/*
 * Renamed from com.Sf
 */
class sf_0 {
    static final int[] s;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 427997150341841222L;
        long l3 = 0xA0B8C7A8FF014140L ^ l2;
        s = new int[el_1.values().length];
        try {
            sf_0.s[el_1.aboveStart.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sf_0.s[el_1.aboveMiddle.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sf_0.s[el_1.aboveEnd.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sf_0.s[el_1.belowStart.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sf_0.s[el_1.belowMiddle.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            sf_0.s[el_1.belowEnd.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

