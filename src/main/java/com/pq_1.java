/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pQ
 */
final class pq_1
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pq_1(int[] nArray) {
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
        if (n11 < pq_1.b(2891, 4206868244097612855L)) return -1;
        n11 = n10;
        if (nArray != null) return n11;
        if (n11 >= pq_1.b(19113, 6636409580710821335L)) return -1;
        return ((Character)XP.M[n10 - pq_1.b(21394, 7810875258396402927L)][0]).charValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1558861431883097910L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00b9h\u00a45\u0087=\u00dbA6\u00dbv\u00d6d\u00e8\u0003\u0099_\u00a8\u00a7\u00be\u00b76\u009a\u0081";
        int n11 = "\u00b9h\u00a45\u0087=\u00dbA6\u00dbv\u00d6d\u00e8\u0003\u0099_\u00a8\u00a7\u00be\u00b76\u009a\u0081".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        c = lArray;
        d = new Integer[3];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x377C;
        if (d[n11] == null) {
            pq_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

