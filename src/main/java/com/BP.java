/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oy_1;
import com.xt_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BP
implements ActionListener {
    final xt_0 c;
    private static final long[] a;
    private static final Integer[] b;

    BP(xt_0 xt_02) {
        this.c = xt_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            block2: {
                int n10;
                block3: {
                    boolean bl = oy_1.y();
                    n10 = xt_0.M(this.c);
                    if (!bl) break block2;
                    if (n10 >= BP.a(650, 2589690146371739930L)) break block3;
                    xt_0.F(this.c, BP.a(5637, 169693120508507543L));
                    if (bl) break block4;
                }
                n10 = xt_0.i(this.c, BP.a(18282, 6378775124025435385L));
            }
            xt_0.K(this.c).Y();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1549365881823188503L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "1\u00a0M\u0096\u00fd\u0092\u00e3\u0088\u00b3\u00f7Q\u000f\\\u008c2n\u0084\u00f19j!\u00ffw\u008d";
        int n11 = "1\u00a0M\u0096\u00fd\u0092\u00e3\u0088\u00b3\u00f7Q\u000f\\\u008c2n\u0084\u00f19j!\u00ffw\u008d".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2392;
        if (b[n11] == null) {
            BP.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

