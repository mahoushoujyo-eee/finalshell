/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YM;
import com.nx_2;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;

/*
 * Renamed from com.eG
 */
class eg_1
implements Runnable {
    final YM S;
    private static final long[] a;
    private static final Integer[] b;

    eg_1(YM yM) {
        this.S = yM;
    }

    @Override
    public void run() {
        YM yM;
        block2: {
            block3: {
                YM yM2;
                block4: {
                    block5: {
                        int n10 = nx_2.R();
                        yM = this.S;
                        if (n10 != 0) break block2;
                        if (YM.l(yM) == null) break block3;
                        Point point = MouseInfo.getPointerInfo().getLocation();
                        YM.I(this.S, this.S.O.j.createScreenCapture(new Rectangle(point.x - 4, point.y - 4, eg_1.a(17552, 1645018047148698010L), eg_1.a(26366, 7196767722108816373L))));
                        YM.d(this.S, new Color(YM.q(this.S).getRGB(4, 4)));
                        yM2 = this.S;
                        if (n10 != 0) break block4;
                        if (YM.l(yM2) == null) break block5;
                        YM.l(this.S).repaint();
                        YM.N(this.S).setText(this.S.O.w(YM.O(this.S)));
                        if (n10 == 0) break block3;
                    }
                    YM.q(this.S).flush();
                    YM.I(this.S, null);
                    yM2 = this.S;
                }
                YM.d(yM2, null);
            }
            yM = this.S;
        }
        YM.C(yM, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 170165577975454321L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00ff\u00a9C5\u00b1^s\u00e2+<\u009f\u0080\u00fbr\u00d1\u008d";
        int n11 = "\u00ff\u00a9C5\u00b1^s\u00e2+<\u009f\u0080\u00fbr\u00d1\u008d".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6D0A;
        if (b[n11] == null) {
            eg_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

