/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import org.l.M;

/*
 * Renamed from org.l.f
 */
class f_0 {
    static final int[] O = new int[M.values().length];

    static {
        try {
            f_0.O[M.DEFAULT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            f_0.O[M.READ_AHEAD.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            f_0.O[M.AT_END.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

