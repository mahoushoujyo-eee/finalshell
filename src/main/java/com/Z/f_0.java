/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.z.m_0;

/*
 * Renamed from com.Z.f
 */
class f_0 {
    static final int[] j = new int[m_0.values().length];

    static {
        try {
            f_0.j[m_0.icons.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            f_0.j[m_0.tiles.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            f_0.j[m_0.table.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

