/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DE;
import com.FN;
import com.Z.Q;
import com.kd_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.av
 */
class av_0
implements ActionListener {
    private Q V;
    final kd_1 I;
    private static final String a;

    av_0(kd_1 kd_12) {
        this.I = kd_12;
        this.V = null;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            av_0 av_02;
            block7: {
                int[] nArray = kd_1.u();
                av_02 = this;
                if (nArray == null) {
                    if (av_02.V == null) {
                        this.V = new Q(kd_1.b(this.I));
                        this.V.t(a);
                        this.V.setMultiSelectionEnabled(false);
                        this.V.addChoosableFileFilter(DE.S);
                        this.V.setFileFilter(DE.S);
                    }
                    av_02 = this;
                }
                if (nArray == null) {
                    if (kd_1.b(av_02.I) != null) {
                        this.V.f(kd_1.b(this.I));
                    }
                    av_02 = this;
                }
                if (nArray != null) break block7;
                if (av_02.V.showOpenDialog(FN.L(this.I)) != 0) break block8;
                av_02 = this;
            }
            av_02.I.v(this.V.getSelectedFile());
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
                char[] cArray3 = "]N\u000f\u001c``<OSC\u001eqcvC_\u0002\u0002/ibOE$\u001d`aw\u0004_\u0004\u0004mc".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 122;
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
                            n17 = 80;
                            break;
                        }
                        case 1: {
                            n17 = 81;
                            break;
                        }
                        case 2: {
                            n17 = 23;
                            break;
                        }
                        case 3: {
                            n17 = 10;
                            break;
                        }
                        case 4: {
                            n17 = 123;
                            break;
                        }
                        case 5: {
                            n17 = 124;
                            break;
                        }
                        default: {
                            n17 = 104;
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

