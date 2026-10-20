/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D6;

class GZ {
    static final int[] T;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 3430826351735201960L;
        long l3 = 0x3EC94C69BD39E0AEL ^ l2;
        T = new int[D6.values().length];
        try {
            GZ.T[D6.add.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GZ.T[D6.replace.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GZ.T[D6.remove.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GZ.T[D6.copy.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GZ.T[D6.move.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            GZ.T[D6.test.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

