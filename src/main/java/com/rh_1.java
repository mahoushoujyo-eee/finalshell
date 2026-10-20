/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D;

/*
 * Renamed from com.rH
 */
class rh_1 {
    static final int[] v;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 1379622557036702169L;
        long l3 = 0xFC16A4FFF449E9DFL ^ l2;
        v = new int[D.values().length];
        try {
            rh_1.v[D.SnakeCase.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rh_1.v[D.KebabCase.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rh_1.v[D.PascalCase.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rh_1.v[D.CamelCase.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rh_1.v[D.NoChange.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rh_1.v[D.NeverUseThisValueExceptDefaultValue.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

