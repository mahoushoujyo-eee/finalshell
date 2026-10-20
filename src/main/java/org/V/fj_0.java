/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v.f_0;

/*
 * Renamed from org.v.fj
 */
class fj_0 {
    static final int[] Z = new int[f_0.values().length];

    static {
        try {
            fj_0.Z[f_0.WHITE_SPACE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            fj_0.Z[f_0.C_PLUS_PLUS_STYLE_COMMENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            fj_0.Z[f_0.C_STYLE_COMMENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

