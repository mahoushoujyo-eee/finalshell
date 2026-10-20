/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.M;

/*
 * Renamed from com.C.c
 */
class c_0 {
    static final int[] q = new int[M.values().length];

    static {
        try {
            c_0.q[M.simple.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            c_0.q[M.dropdown.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

