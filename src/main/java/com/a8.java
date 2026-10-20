/*
 * Decompiled with CFR 0.152.
 */
package com;

import javax.swing.SortOrder;

class a8 {
    static final int[] e = new int[SortOrder.values().length];

    static {
        try {
            a8.e[SortOrder.ASCENDING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            a8.e[SortOrder.DESCENDING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            a8.e[SortOrder.UNSORTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

