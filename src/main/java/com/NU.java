/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.we_2;

class NU {
    static final int[] N = new int[we_2.values().length];

    static {
        try {
            NU.N[we_2.loading.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NU.N[we_2.loaded.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NU.N[we_2.failed.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

