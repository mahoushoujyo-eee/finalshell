/*
 * Decompiled with CFR 0.152.
 */
package org.i;

import org.i.u;

/*
 * Renamed from org.i.w
 */
class w_0 {
    static final int[] Q = new int[u.values().length];

    static {
        try {
            w_0.Q[u.EXTENDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            w_0.Q[u.SUPER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            w_0.Q[u.ANY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            w_0.Q[u.NONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

