/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B1;

/*
 * Renamed from com.lB
 */
class lb_1 {
    static final int[] z = new int[B1.values().length];

    static {
        try {
            lb_1.z[B1.up.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lb_1.z[B1.down.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lb_1.z[B1.left.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lb_1.z[B1.right.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

