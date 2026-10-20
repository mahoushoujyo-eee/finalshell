/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.bq_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.o7
 */
class o7_0
extends KeyAdapter {
    final bq_0 Q;
    private static final long[] a;
    private static final Integer[] b;

    o7_0(bq_0 bq_02) {
        this.Q = bq_02;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block5: {
            int n10;
            int n11;
            block6: {
                int n12;
                block4: {
                    n12 = _y_0.M();
                    n11 = keyEvent.getKeyCode();
                    n10 = o7_0.a(14391, 4221269265887544896L);
                    if (n12 == 0) break block4;
                    if (n11 == n10) break block5;
                    n11 = keyEvent.getKeyCode();
                    n10 = o7_0.a(6700, 2471065625034810457L);
                }
                if (n12 == 0) break block6;
                if (n11 == n10) break block5;
                n11 = keyEvent.getKeyCode();
                n10 = o7_0.a(23228, 6095305098823279816L);
            }
            if (n11 == n10) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1623428373345895834L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "l\u00c6\u00f6\u00b3\u00ebra\u00e5\u00c2%\u008a<{o\u00a1z\u00f7\nv\u00a8!\u0012\u00c3\u00d0";
        int n11 = "l\u00c6\u00f6\u00b3\u00ebra\u00e5\u00c2%\u008a<{o\u00a1z\u00f7\nv\u00a8!\u0012\u00c3\u00d0".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7E75;
        if (b[n11] == null) {
            o7_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

