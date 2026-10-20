/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GQ;

/*
 * Renamed from com.oO
 */
class oo_1 {
    static final int[] n = new int[GQ.values().length];

    static {
        try {
            oo_1.n[GQ.root.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            oo_1.n[GQ.folder.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

