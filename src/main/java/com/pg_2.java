/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pg
 */
final class pg_2
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pg_2(int[] nArray) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray != null) return n11;
        if (n11 < 0) return -1;
        n11 = n10;
        if (nArray != null) return n11;
        if (n11 >= pg_2.b(16144, 8994744429341408166L)) return -1;
        return n10 + pg_2.b(10461, 5023130324026158186L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2447578143541855401L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u000e\u00ee\u00f8\u0084q\u0083\u00ffO\u008a\u00d86\u0019\r\u00c0\u00e8c";
        int n11 = "\u000e\u00ee\u00f8\u0084q\u0083\u00ffO\u008a\u00d86\u0019\r\u00c0\u00e8c".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        c = lArray;
        d = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x44B6;
        if (d[n11] == null) {
            pg_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

