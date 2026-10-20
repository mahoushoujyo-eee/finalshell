/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cl_2;
import com.d1_0;
import com.oj_0;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

/*
 * Renamed from com.lU
 */
class lu_1
implements ActionListener {
    final d1_0 K;
    private static final String a;
    private static final long b;

    lu_1(d1_0 d1_02) {
        this.K = d1_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            d1_0 d1_02;
            block7: {
                d1_0 d1_03;
                block5: {
                    block6: {
                        Container container;
                        boolean bl;
                        block2: {
                            block3: {
                                bl = oj_0.g();
                                container = this.K;
                                if (!bl) break block2;
                                if (d1_0.J(container) <= 0) break block3;
                                d1_0.U(this.K, (int)b);
                                this.K.repaint();
                                if (bl) break block4;
                            }
                            container = this.K.getParent();
                        }
                        d1_02 = container;
                        d1_02.remove(this.K);
                        d1_03 = d1_02;
                        if (!bl) break block5;
                        if (!(d1_03 instanceof JComponent)) break block6;
                        ((JComponent)d1_02).revalidate();
                        if (bl) break block7;
                    }
                    d1_03 = d1_02;
                }
                d1_03.invalidate();
            }
            d1_02.repaint();
            cl_2.A(a, d1_0.Y(this.K), false);
            d1_0.S(this.K).Y();
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
                char[] cArray3 = ",5d`u\u001d8\u001a2cX".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 127;
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
                            n17 = 4;
                            break;
                        }
                        case 1: {
                            n17 = 47;
                            break;
                        }
                        case 2: {
                            n17 = 121;
                            break;
                        }
                        case 3: {
                            n17 = 75;
                            break;
                        }
                        case 4: {
                            n17 = 99;
                            break;
                        }
                        case 5: {
                            n17 = 18;
                            break;
                        }
                        default: {
                            n17 = 11;
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
        long l2 = 2612770247879483197L;
        b = 0xECF28D388890DF37L ^ l2;
    }
}

