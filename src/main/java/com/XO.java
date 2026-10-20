/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XB;
import com.re_1;
import com.w0_0;

public final class XO {
    XO L;
    private final int E;
    private final int c;
    private final int j;
    private static final long[] a;
    private static final Integer[] b;

    public XO(w0_0 w0_02, int n10, String string, String string2) {
        block4: {
            block2: {
                XO xO2;
                block3: {
                    int[] nArray = XB.X();
                    int[] nArray2 = nArray;
                    xO2 = w0_02.s;
                    if (nArray2 != null) break block2;
                    if (xO2 != null) break block3;
                    w0_02.s = this;
                    if (nArray2 == null) break block4;
                }
                xO2 = w0_02.k;
            }
            xO2.L = this;
        }
        w0_02.k = this;
        this.E = n10;
        this.c = w0_02.O(string);
        this.j = w0_02.O(string2);
    }

    public void b() {
    }

    int h() {
        return XO.a(28024, 8017337190419335230L);
    }

    void S(re_1 re_12) {
        int n10 = XO.a(4771, 1855237061617121254L);
        re_12.G(this.E & XO.a(9816, 5348132879023620895L)).G(this.c).G(this.j);
        int n11 = 0;
        re_12.G(n11);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 9020033205111879319L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00de\u00abH\u00ae\u0082\u00d8Jw\\\u00f1\u00d9\u00d7\u0083\u0092\u00fe\u00a1\u00c0/;\u0003\u00c3>\u0001q";
        int n11 = "\u00de\u00abH\u00ae\u0082\u00d8Jw\\\u00f1\u00d9\u00d7\u0083\u0092\u00fe\u00a1\u00c0/;\u0003\u00c3>\u0001q".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6547;
        if (b[n11] == null) {
            XO.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

