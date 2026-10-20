/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.zo_0;

/*
 * Renamed from com.pd
 */
class pd_2 {
    static final int[] T = new int[zo_0.values().length];

    static {
        try {
            pd_2.T[zo_0.url.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            pd_2.T[zo_0.filePath.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            pd_2.T[zo_0.nearClass.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

