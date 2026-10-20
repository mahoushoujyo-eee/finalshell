/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.I2;
import com.by_0;
import com.ej_0;
import com.rd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

class X1
implements ActionListener {
    final JProgressBar H;
    final ej_0 V;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    X1(ej_0 ej_02, JProgressBar jProgressBar) {
        this.V = ej_02;
        this.H = jProgressBar;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            block2: {
                int n10;
                block3: {
                    int n11 = by_0.y();
                    n10 = ej_0.g(this.V);
                    if (n11 == 0) break block2;
                    if (n10 >= ej_0.I(this.V)) break block3;
                    ej_0.C(this.V, X1.a(21520, 9110738063845259727L));
                    this.S(this.H);
                    if (n11 != 0) break block4;
                }
                n10 = ej_0.X(this.V, X1.a(2958, 898257431738132048L));
            }
            this.S(this.H);
            rd_1.l(c);
        }
    }

    private void S(JProgressBar jProgressBar) {
        block5: {
            int n10;
            block4: {
                int n11 = by_0.y();
                n10 = jProgressBar.isIndeterminate();
                if (n11 == 0) break block4;
                if (n10 != 0) break block5;
                n10 = jProgressBar.getValue();
            }
            if (n10 > jProgressBar.getMinimum()) {
                SwingUtilities.invokeLater(new I2(this, jProgressBar));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1682504722857885809L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00a7\u0081j\u0003\u0003\u00fc\u00f9\u00b1\u00e6\u00ba\u0015s\u0092\u00b8Y\u00a9";
        int n11 = "\u00a7\u0081j\u0003\u0003\u00fc\u00f9\u00b1\u00e6\u00ba\u0015s\u0092\u00b8Y\u00a9".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        long l3 = 135952753654703297L;
        c = 0x1E3004F23D3211DL ^ l3;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2DDF;
        if (b[n11] == null) {
            X1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

