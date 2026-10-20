/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YM;
import com.ky_2;
import com.lz_0;
import com.nx_2;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

class LD
extends lz_0 {
    final YM a;
    private static final long[] b;
    private static final Integer[] e;

    LD(YM yM) {
        this.a = yM;
    }

    public void d(Graphics2D graphics2D, Rectangle rectangle, ky_2 ky_22) {
        block5: {
            YM yM;
            block4: {
                int n10 = nx_2.R();
                yM = this.a;
                if (n10 != 0) break block4;
                if (!YM.M(yM).isShowing()) break block5;
                yM = this.a;
            }
            if (yM.O.j != null) {
                graphics2D.drawImage(YM.q(this.a), rectangle.x + 2, rectangle.y + 2, rectangle.width - 4, rectangle.height - 4, null);
                graphics2D.setPaint(Color.BLACK);
                graphics2D.drawRect(0, 0, rectangle.width - 1, rectangle.height - 1);
                graphics2D.setPaint(Color.WHITE);
                graphics2D.drawRect(1, 1, rectangle.width - 3, rectangle.height - 3);
                int n11 = rectangle.x + rectangle.width / 2;
                int n12 = rectangle.y + rectangle.height / 2;
                graphics2D.setPaint(Color.WHITE);
                graphics2D.drawLine(n11 - 1, n12 - LD.a(9662, 736673284630892496L), n11 - 1, n12 + LD.a(30869, 1820307675219661562L));
                graphics2D.drawLine(n11 + 1, n12 - LD.a(30869, 1820307675219661562L), n11 + 1, n12 + LD.a(30869, 1820307675219661562L));
                graphics2D.drawLine(n11 - LD.a(30869, 1820307675219661562L), n12 - 1, n11 + LD.a(30869, 1820307675219661562L), n12 - 1);
                graphics2D.drawLine(n11 - LD.a(30869, 1820307675219661562L), n12 + 1, n11 + LD.a(30869, 1820307675219661562L), n12 + 1);
                graphics2D.setPaint(Color.BLACK);
                graphics2D.drawLine(n11, n12 - LD.a(30869, 1820307675219661562L), n11, n12 + LD.a(30869, 1820307675219661562L));
                graphics2D.drawLine(n11 - LD.a(30869, 1820307675219661562L), n12, n11 + LD.a(30869, 1820307675219661562L), n12);
            }
        }
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.d(graphics2D, rectangle, (ky_2)jComponent);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2074378631410572291L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "-<\u00c4\u00bf\u00eb\u0012\u0093\u00d4\u00a3A\u00a1GE\u0081\u00ce\u00fe";
        int n11 = "-<\u00c4\u00bf\u00eb\u0012\u0093\u00d4\u00a3A\u00a1GE\u0081\u00ce\u00fe".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        e = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A6E;
        if (e[n11] == null) {
            LD.e[n11] = (int)(b[n11] ^ l2);
        }
        return e[n11];
    }
}

