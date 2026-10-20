/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EU;

/*
 * Renamed from com.y5
 */
class y5_0
implements EU {
    private static final long[] a;
    private static final Integer[] b;

    y5_0() {
    }

    @Override
    public int w() {
        return y5_0.a(28543, 6931029494393186681L);
    }

    @Override
    public int u() {
        return y5_0.a(26030, 2683439099628331945L);
    }

    @Override
    public void z(int n10, byte[] byArray, byte[] byArray2) throws Exception {
    }

    @Override
    public void X(byte[] byArray, int n10, int n11, byte[] byArray2, int n12) throws Exception {
    }

    @Override
    public boolean Y() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8895520993919832248L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "$#`\u001dc\"\u00b3\u0001\u00ed\u00b5\u00bb\"\u00fb\u0090\u00b9\u00c9";
        int n11 = "$#`\u001dc\"\u00b3\u0001\u00ed\u00b5\u00bb\"\u00fb\u0090\u00b9\u00c9".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4607;
        if (b[n11] == null) {
            y5_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

