/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QX;
import com.QZ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.cM
 */
class cm_1
implements ActionListener {
    final QZ B;
    private static final long[] a;
    private static final Integer[] b;

    cm_1(QZ qZ) {
        this.B = qZ;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            QZ qZ;
            block2: {
                block3: {
                    String[] stringArray = QX.Y();
                    qZ = this.B;
                    if (stringArray != null) break block2;
                    if (qZ.b >= cm_1.a(31487, 4160654507471791181L)) break block3;
                    this.B.b += cm_1.a(8498, 2736446167824875393L);
                    this.B.repaint();
                    if (stringArray == null) break block4;
                }
                qZ = this.B;
            }
            qZ.N.Y();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8906305254045346349L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0012o[/\u001ej\u008e\u0004\"\u0097#\tt\u00bfU\u00b5";
        int n11 = "\u0012o[/\u001ej\u008e\u0004\"\u0097#\tt\u00bfU\u00b5".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1EB2;
        if (b[n11] == null) {
            cm_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

