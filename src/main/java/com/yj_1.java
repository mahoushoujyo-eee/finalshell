/*
 * Decompiled with CFR 0.152.
 */
package com;

import javax.swing.LayoutStyle;

/*
 * Renamed from com.yJ
 */
class yj_1 {
    static final int[] W = new int[LayoutStyle.ComponentPlacement.values().length];

    static {
        try {
            yj_1.W[LayoutStyle.ComponentPlacement.INDENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            yj_1.W[LayoutStyle.ComponentPlacement.RELATED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            yj_1.W[LayoutStyle.ComponentPlacement.UNRELATED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

