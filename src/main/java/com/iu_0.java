/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.on_2;

/*
 * Renamed from com.Iu
 */
class iu_0 {
    static final int[] P = new int[on_2.values().length];

    static {
        try {
            iu_0.P[on_2.MOUSE_FORMAT_XTERM_EXT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            iu_0.P[on_2.MOUSE_FORMAT_URXVT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            iu_0.P[on_2.MOUSE_FORMAT_SGR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            iu_0.P[on_2.MOUSE_FORMAT_XTERM.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

