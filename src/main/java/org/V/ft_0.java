/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v.f_0;

/*
 * Renamed from org.v.ft
 */
class ft_0 {
    static final int[] p;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 3904304331567693426L;
        long l3 = 0xE19875748A1C7E74L ^ l2;
        p = new int[f_0.values().length];
        try {
            ft_0.p[f_0.INTEGER_LITERAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ft_0.p[f_0.FLOATING_POINT_LITERAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ft_0.p[f_0.BOOLEAN_LITERAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ft_0.p[f_0.CHARACTER_LITERAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ft_0.p[f_0.STRING_LITERAL.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ft_0.p[f_0.NULL_LITERAL.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

