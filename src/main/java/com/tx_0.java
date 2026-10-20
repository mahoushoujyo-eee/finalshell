/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Tx
 */
class tx_0
extends XM {
    private static final long[] c;
    private static final Integer[] e;

    public tx_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
        super(f10, colorModel, colorModel2);
    }

    @Override
    public void G(int[] nArray, int[] nArray2, float f10) {
        int n10 = nArray.length;
        String string = ra_1.c();
        for (int i2 = 0; i2 < n10; i2 += 4) {
            int n11 = nArray[i2];
            int n12 = nArray2[i2];
            int n13 = nArray[i2 + 1];
            int n14 = nArray2[i2 + 1];
            int n15 = nArray[i2 + 2];
            int n16 = nArray2[i2 + 2];
            int n17 = nArray[i2 + 3];
            int n18 = nArray2[i2 + 3];
            int n19 = tx_0.U(n11, n12);
            int n20 = n19 + tx_0.U(n12, tx_0.b(26613, 6101662419421654436L) - tx_0.U(tx_0.b(5201, 1936960066046795265L) - n12, tx_0.b(5201, 1936960066046795265L) - n11) - n19);
            n19 = tx_0.U(n13, n14);
            int n21 = n19 + tx_0.U(n14, tx_0.b(5201, 1936960066046795265L) - tx_0.U(tx_0.b(5201, 1936960066046795265L) - n14, tx_0.b(5201, 1936960066046795265L) - n13) - n19);
            n19 = tx_0.U(n15, n16);
            int n22 = n19 + tx_0.U(n16, tx_0.b(5201, 1936960066046795265L) - tx_0.U(tx_0.b(5201, 1936960066046795265L) - n16, tx_0.b(5201, 1936960066046795265L) - n15) - n19);
            float f11 = f10 * (float)n17 / 255.0f;
            float f12 = 1.0f - f11;
            nArray2[i2] = (int)(f11 * (float)n20 + f12 * (float)n12);
            nArray2[i2 + 1] = (int)(f11 * (float)n21 + f12 * (float)n14);
            nArray2[i2 + 2] = (int)(f11 * (float)n22 + f12 * (float)n16);
            nArray2[i2 + 3] = (int)((float)n17 * f10 + (float)n18 * f12);
            if (string == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8027603294097638260L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "n\u00f1\u0011D\u001e\u00a4\u001d\u008a9\u009f\u00d0\u00d5\u008e\u0088n/";
        int n11 = "n\u00f1\u0011D\u001e\u00a4\u001d\u008a9\u009f\u00d0\u00d5\u008e\u0088n/".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xA50;
        if (e[n11] == null) {
            tx_0.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

