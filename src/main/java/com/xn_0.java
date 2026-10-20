/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Xn
 */
class xn_0
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public xn_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
        super(f10, colorModel, colorModel2);
    }

    @Override
    public void G(int[] nArray, int[] nArray2, float f10) {
        int n10 = nArray.length;
        String string = ra_1.c();
        for (int i2 = 0; i2 < n10; i2 += 4) {
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            block9: {
                int n19;
                block8: {
                    int n20 = nArray[i2];
                    n18 = nArray2[i2];
                    int n21 = nArray[i2 + 1];
                    n17 = nArray2[i2 + 1];
                    int n22 = nArray[i2 + 2];
                    n16 = nArray2[i2 + 2];
                    n15 = nArray[i2 + 3];
                    n14 = nArray2[i2 + 3];
                    int n23 = n13 = n18 + n20;
                    int n24 = xn_0.b(24816, 6031740720206631332L);
                    if (string == null) {
                        if (n23 > n24) {
                            n13 = xn_0.b(19215, 8587522932618984026L);
                        }
                        n23 = n17;
                        n24 = n21;
                    }
                    int n25 = n12 = n23 + n24;
                    int n26 = xn_0.b(19215, 8587522932618984026L);
                    if (string == null) {
                        if (n25 > n26) {
                            n12 = xn_0.b(19215, 8587522932618984026L);
                        }
                        n25 = n16;
                        n26 = n22;
                    }
                    n19 = n11 = n25 + n26;
                    if (string != null) break block8;
                    if (n19 <= xn_0.b(19215, 8587522932618984026L)) break block9;
                    n19 = xn_0.b(19215, 8587522932618984026L);
                }
                n11 = n19;
            }
            float f11 = f10 * (float)n15 / 255.0f;
            float f12 = 1.0f - f11;
            nArray2[i2] = (int)(f11 * (float)n13 + f12 * (float)n18);
            nArray2[i2 + 1] = (int)(f11 * (float)n12 + f12 * (float)n17);
            nArray2[i2 + 2] = (int)(f11 * (float)n11 + f12 * (float)n16);
            nArray2[i2 + 3] = (int)((float)n15 * f10 + (float)n14 * f12);
            if (string == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1975184607467749404L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d2\u0080R\u00f2\u00b6\u00a9:\u00b9\u00e6\u0086\u001dc@\u00c3\u0091G";
        int n11 = "\u00d2\u0080R\u00f2\u00b6\u00a9:\u00b9\u00e6\u0086\u001dc@\u00c3\u0091G".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        c = lArray;
        e = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3155;
        if (e[n11] == null) {
            xn_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

