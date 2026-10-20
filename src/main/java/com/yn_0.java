/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pt_0;

/*
 * Renamed from com.Yn
 */
class yn_0 {
    static final int[] M = new int[pt_0.values().length];

    static {
        try {
            yn_0.M[pt_0.unchecked.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            yn_0.M[pt_0.checked.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            yn_0.M[pt_0.mixed.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

