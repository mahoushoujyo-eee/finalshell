/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._T;
import com.pv_2;

class GP
implements Runnable {
    final long T;
    final _T M;
    private static final long[] a;
    private static final Long[] b;

    GP(_T _T2, long l2) {
        this.M = _T2;
        this.T = l2;
    }

    @Override
    public void run() {
        String string = pv_2.r();
        block2: while (true) {
            int n10 = this.M.c.b;
            while (n10 == 0) {
                long l2;
                try {
                    Thread.sleep(GP.a(12520, 1523639616274985619L));
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                n10 = (l2 = System.currentTimeMillis() - this.T - GP.a(16643, 9182747863385736057L)) == 0L ? 0 : (l2 < 0L ? -1 : 1);
                if (string != null) continue;
                if (n10 <= 0) continue block2;
                this.M.c.b = true;
                if (string != null) break block2;
                continue block2;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8860798014919041535L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "o\u00d2\u00ee\u00f1\u0094t\u0013^\u0005\u0098L^\u0092\u00a9\u00e9>";
        int n11 = "o\u00d2\u00ee\u00f1\u0094t\u0013^\u0005\u0098L^\u0092\u00a9\u00e9>".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x427B) & Short.MAX_VALUE;
        if (b[n11] == null) {
            GP.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

