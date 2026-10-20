/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OV;

/*
 * Renamed from com.nG
 */
class ng_1 {
    static final int[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 235052728393233188L;
        long l3 = 0xCD38D6870B5D7322L ^ l2;
        c = new int[OV.values().length];
        try {
            ng_1.c[OV.none.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ng_1.c[OV.fillFirst.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ng_1.c[OV.fillMiddle.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ng_1.c[OV.fillLast.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ng_1.c[OV.fillFirstAndLast.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ng_1.c[OV.fillAll.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

