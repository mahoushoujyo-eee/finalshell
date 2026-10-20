/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GQ;

class D_ {
    static final int[] K = new int[GQ.values().length];

    static {
        try {
            D_.K[GQ.root.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            D_.K[GQ.folder.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            D_.K[GQ.leaf.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

