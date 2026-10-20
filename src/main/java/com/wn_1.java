/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QE;

/*
 * Renamed from com.wN
 */
class wn_1 {
    static final int[] Z = new int[QE.values().length];

    static {
        try {
            wn_1.Z[QE.list.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            wn_1.Z[QE.roll.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            wn_1.Z[QE.star.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            wn_1.Z[QE.shutter.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            wn_1.Z[QE.fade.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

