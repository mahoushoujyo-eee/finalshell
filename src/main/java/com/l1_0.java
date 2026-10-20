/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S6;

/*
 * Renamed from com.l1
 */
class l1_0 {
    static final int[] U;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 6331593490958894143L;
        long l3 = 0x8F21C62FDAC7C439L ^ l2;
        U = new int[S6.values().length];
        try {
            l1_0.U[S6.EQ.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l1_0.U[S6.NE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l1_0.U[S6.GE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l1_0.U[S6.GT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l1_0.U[S6.LE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            l1_0.U[S6.LT.ordinal()] = (int)l3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

