/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.SN;
import com.WC;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class XV
implements ActionListener {
    private int L;
    final Rectangle h;
    final int m;
    final int E;
    final Window n;
    private static final long[] a;
    private static final Integer[] b;

    XV(Rectangle rectangle, int n10, int n11, Window window) {
        this.h = rectangle;
        this.m = n10;
        this.E = n11;
        this.n = window;
        this.L = 1;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            XV xV2;
            block2: {
                block3: {
                    String string = FV.D();
                    xV2 = this;
                    if (string != null) break block2;
                    if (xV2.L > XV.a(20114, 1000204779819488227L)) break block3;
                    int n10 = this.h.width + this.m * this.L / XV.a(7759, 2278290378248356671L);
                    int n11 = this.h.height + this.E * this.L / XV.a(7759, 2278290378248356671L);
                    Rectangle rectangle = new Rectangle(this.h.x + this.h.width / 2 - n10 / 2, this.h.y + this.h.height / 2 - n11 / 2, n10, n11);
                    this.n.setBounds(rectangle);
                    if (string == null) break block4;
                }
                xV2 = SN.E().get(this.n);
            }
            ((WC)((Object)xV2)).Y();
        }
        ++this.L;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 9092564293235972177L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "J\u0000\u0089_\u00e9\u0014\u001bd\u00b7\u00bb\u0001\u00c9pr\u00cb\u00b8";
        int n11 = "J\u0000\u0089_\u00e9\u0014\u001bd\u00b7\u00bb\u0001\u00c9pr\u00cb\u00b8".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1D70;
        if (b[n11] == null) {
            XV.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

