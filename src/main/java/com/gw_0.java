/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.util.Random;

/*
 * Renamed from com.Gw
 */
public final class gw_0 {
    private static Random g;
    private static final long a;

    public static int U() {
        return g.nextInt((int)a);
    }

    public static int K(int n10) {
        return g.nextInt(n10);
    }

    public static int d(int n10, int n11) {
        return n10 + g.nextInt(Math.abs(n11 + 1 - n10));
    }

    public static int J(int[] nArray) {
        return nArray[gw_0.d(0, nArray.length - 1)];
    }

    public static int t(int n10) {
        return n10 * n10;
    }

    public static float d(float f10) {
        return f10 * f10;
    }

    public static int t(double d2) {
        return (int)Math.round(Math.sqrt(d2));
    }

    public static int B(int n10, int n11, int n12) {
        return Math.max(n11, Math.min(n10, n12));
    }

    public static int E(int[] nArray) {
        int n10;
        block2: {
            int n11 = nArray[0];
            String string = FV.D();
            for (int i2 = 1; i2 < nArray.length; ++i2) {
                n10 = Math.max(n11, nArray[i2]);
                if (string == null) {
                    n11 = n10;
                    if (string == null) continue;
                }
                break block2;
            }
            n10 = n11;
        }
        return n10;
    }

    public static int G(int[] nArray) {
        int n10;
        block2: {
            int n11 = nArray[0];
            String string = FV.D();
            for (int i2 = 1; i2 < nArray.length; ++i2) {
                n10 = Math.min(n11, nArray[i2]);
                if (string == null) {
                    n11 = n10;
                    if (string == null) continue;
                }
                break block2;
            }
            n10 = n11;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2401441949717262167L;
        a = 0xFE55A867D99E6F32L ^ l2;
        g = new Random();
    }
}

