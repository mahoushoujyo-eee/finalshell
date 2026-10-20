/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pt_0;

class _6 {
    static final int[] g = new int[pt_0.values().length];

    static {
        try {
            _6.g[pt_0.mixed.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _6.g[pt_0.unchecked.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _6.g[pt_0.checked.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

