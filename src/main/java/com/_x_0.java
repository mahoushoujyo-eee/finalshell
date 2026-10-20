/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import java.awt.Polygon;

/*
 * Renamed from com._x
 */
public class _x_0
extends Polygon {
    private static int Z;

    public _x_0(int n10, int n11, int n12, int n13, int n14) {
        this(n10, n11, n12, n13, n14, 0.0);
    }

    public _x_0(int n10, int n11, int n12, int n13, int n14, double d2) {
        super(_x_0.T(n10, n11, n12, n13, n14, d2), _x_0.u(n10, n11, n12, n13, n14, d2), n14 * 2);
    }

    protected static int[] T(int n10, int n11, int n12, int n13, int n14, double d2) {
        int[] nArray;
        int n15;
        block3: {
            int[] nArray2 = new int[n14 * 2];
            double d3 = Math.PI * 2 / (double)n14;
            double d4 = d2;
            double d5 = d2 + Math.PI / (double)n14;
            n15 = _x_0.w();
            for (int i2 = 0; i2 < n14; ++i2) {
                nArray2[i2 * 2] = (int)Math.round((double)n12 * Math.cos(d4)) + n10;
                d4 += d3;
                nArray = nArray2;
                if (n15 == 0) {
                    nArray[i2 * 2 + 1] = (int)Math.round((double)n13 * Math.cos(d5)) + n10;
                    d5 += d3;
                    if (n15 == 0) continue;
                }
                break block3;
            }
            nArray = nArray2;
        }
        if (ky_2.F() != null) {
            _x_0.p(++n15);
        }
        return nArray;
    }

    protected static int[] u(int n10, int n11, int n12, int n13, int n14, double d2) {
        int[] nArray;
        block2: {
            int[] nArray2 = new int[n14 * 2];
            double d3 = Math.PI * 2 / (double)n14;
            double d4 = d2;
            int n15 = _x_0.a();
            double d5 = d2 + Math.PI / (double)n14;
            for (int i2 = 0; i2 < n14; ++i2) {
                nArray2[i2 * 2] = (int)Math.round((double)n12 * Math.sin(d4)) + n11;
                d4 += d3;
                nArray = nArray2;
                if (n15 != 0) {
                    nArray[i2 * 2 + 1] = (int)Math.round((double)n13 * Math.sin(d5)) + n11;
                    d5 += d3;
                    if (n15 != 0) continue;
                    ky_2.K(new String[4]);
                    break;
                }
                break block2;
            }
            nArray = nArray2;
        }
        return nArray;
    }

    public static void p(int n10) {
        Z = n10;
    }

    public static int w() {
        return Z;
    }

    public static int a() {
        int n10 = _x_0.w();
        if (n10 == 0) {
            return 6;
        }
        return 0;
    }

    static {
        if (_x_0.w() != 0) {
            _x_0.p(125);
        }
    }
}

