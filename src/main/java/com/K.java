/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QY;
import com._e_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class K
extends MouseAdapter {
    final _e_0 j;
    final QY W;
    private static final String a;

    K(QY qY, _e_0 _e_02) {
        this.W = qY;
        this.j = _e_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        ActionListener actionListener = this.j.V();
        int[] nArray = _e_0.P();
        if (nArray == null) {
            if (actionListener != null) {
                actionListener.actionPerformed(new ActionEvent(mouseEvent.getSource(), 0, a));
            }
            this.W.U(this.W.getComponentZOrder(this.j));
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u0003_\b\u007fq^z2Y\u000epqB7'X".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 121;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 59;
                            break;
                        }
                        case 1: {
                            n17 = 69;
                            break;
                        }
                        case 2: {
                            n17 = 5;
                            break;
                        }
                        case 3: {
                            n17 = 111;
                            break;
                        }
                        case 4: {
                            n17 = 103;
                            break;
                        }
                        case 5: {
                            n17 = 73;
                            break;
                        }
                        default: {
                            n17 = 35;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

