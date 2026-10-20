/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ew_0;

class BB {
    static final int[] h = new int[ew_0.values().length];

    static {
        try {
            BB.h[ew_0.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BB.h[ew_0.h.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BB.h[ew_0.m.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BB.h[ew_0.s.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BB.h[ew_0.ms.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

