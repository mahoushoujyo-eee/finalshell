/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T5;
import com.X0;
import com.cn_0;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/*
 * Renamed from com.Xq
 */
class xq_0
extends KeyAdapter {
    final JTextField Y;
    final FocusAdapter b;
    final int Z;
    final Component D;
    final T5 R;
    final X0 K;
    private static final long[] a;
    private static final Integer[] c;

    xq_0(X0 x02, JTextField jTextField, FocusAdapter focusAdapter, int n10, Component component, T5 t5) {
        this.K = x02;
        this.Y = jTextField;
        this.b = focusAdapter;
        this.Z = n10;
        this.D = component;
        this.R = t5;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block4: {
            block6: {
                int n10;
                String[] stringArray;
                block5: {
                    int n11;
                    block2: {
                        block3: {
                            stringArray = cn_0.Q();
                            n10 = keyEvent.getKeyCode();
                            n11 = xq_0.a(24329, 730080405954399023L);
                            if (stringArray == null) break block2;
                            if (n10 != n11) break block3;
                            this.Y.removeFocusListener(this.b);
                            X0.k(this.Z, this.D, null, this.R);
                            if (stringArray != null) break block4;
                        }
                        n10 = keyEvent.getKeyCode();
                        if (stringArray == null) break block5;
                        n11 = xq_0.a(29844, 4767306496160014515L);
                    }
                    if (n10 != n11) break block6;
                    this.Y.removeFocusListener(this.b);
                    n10 = this.Z;
                }
                X0.k(n10, this.D, this.Y.getText(), this.R);
                if (stringArray != null) break block4;
            }
            super.keyPressed(keyEvent);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 911298554295336899L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00fa\u009a\u00e8\u00ae#{4\u00f7\"\u008f\u009d-\n\u001e\u001fz";
        int n11 = "\u00fa\u009a\u00e8\u00ae#{4\u00f7\"\u008f\u009d-\n\u001e\u001fz".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5426;
        if (c[n11] == null) {
            xq_0.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

