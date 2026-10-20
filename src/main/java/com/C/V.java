/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.el_1;

class V {
    static final int[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 3181676203567534080L;
        long l3 = 0xB246DFFE5FF4D006L ^ l2;
        c = new int[el_1.values().length];
        try {
            V.c[el_1.aboveStart.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            V.c[el_1.aboveMiddle.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            V.c[el_1.aboveEnd.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            V.c[el_1.belowStart.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            V.c[el_1.belowMiddle.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            V.c[el_1.belowEnd.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

