/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.ln_0;
import com.og_2;
import javax.swing.SwingConstants;

public class QG
extends ky_2
implements SwingConstants {
    private static og_2 A;
    private int n;
    private static final long[] a;
    private static final Integer[] b;

    public QG() {
        super(A);
        this.n = QG.a(30911, 6689791480754448180L);
    }

    public QG(int n10) {
        super(A);
        this.n = QG.a(17704, 2790758901638142626L);
        this.J(n10);
    }

    public int w() {
        return this.n;
    }

    public void J(int n10) {
        this.n = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2022552840895223030L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "~$!\u00eb\u009c\u00e2\u00ce\\\u00f2D\u00c3\u0089\u009a\u00c9\u00f3\u00ca";
        int n11 = "~$!\u00eb\u009c\u00e2\u00ce\\\u00f2D\u00c3\u0089\u009a\u00c9\u00f3\u00ca".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        A = new ln_0(null);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5F8A;
        if (b[n11] == null) {
            QG.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

