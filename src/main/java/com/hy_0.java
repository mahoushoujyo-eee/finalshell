/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import com.ch_0;
import com.ky_2;
import com.qm_0;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.Hy
 */
class hy_0
implements ActionListener {
    private int e;
    final Rectangle f;
    final qm_0 S;
    final BufferedImage I;
    private static final long[] a;
    private static final Integer[] b;

    hy_0(Rectangle rectangle, qm_0 qm_02, BufferedImage bufferedImage) {
        this.f = rectangle;
        this.S = qm_02;
        this.I = bufferedImage;
        this.e = hy_0.a(15709, 3791628624128876567L);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            Object object;
            block2: {
                block3: {
                    ky_2[] ky_2Array = ch_0.O();
                    object = this;
                    if (ky_2Array == null) break block2;
                    if (((hy_0)object).e <= 0) break block3;
                    this.e -= 5;
                    Point point = this.f.getLocation();
                    point.y += (hy_0.a(16103, 1788404574236451756L) - this.e) / 2;
                    this.S.V(this.I, point, this.e);
                    if (ky_2Array != null) break block4;
                }
                this.S.K();
                object = actionEvent.getSource();
            }
            ((WC)object).Y();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2383622583092413208L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u001d\u0084;x2\u00b5#k\u009c\u00fd\u00c7\u008a\u001d\u00de\u00a0\u00d0";
        int n11 = "\u001d\u0084;x2\u00b5#k\u009c\u00fd\u00c7\u008a\u001d\u00de\u00a0\u00d0".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1D4A;
        if (b[n11] == null) {
            hy_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

