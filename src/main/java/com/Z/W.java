/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.z.m_0;

class W {
    static final int[] z = new int[m_0.values().length];

    static {
        try {
            W.z[m_0.icons.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            W.z[m_0.tiles.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            W.z[m_0.table.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

