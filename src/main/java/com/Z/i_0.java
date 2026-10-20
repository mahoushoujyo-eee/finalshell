/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.CI;
import com.GA;
import com.L.Z;
import com.R8;
import com.SZ;
import com.Z.D;
import com.Z.M7;
import com.Z.T;
import com.pb_2;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.i
 */
class i_0
implements ActionListener {
    final T f;
    private static final String a;
    private static final long b;

    i_0(T t2) {
        this.f = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        pb_2 pb_22 = new pb_2();
        CI cI = new CI(this.f.d);
        cI.setOpaque(false);
        cI.setVisibleRowCount(Math.min((int)b, this.f.d.size()));
        cI.d(true);
        cI.setCellRenderer(new D(this));
        cI.addMouseListener(new M7(this, cI, pb_22));
        SZ sZ = new SZ((Component)cI, false, false);
        sZ.setOpaque(false);
        sZ.getViewport().setOpaque(false);
        sZ.G(0);
        R8 r8 = sZ.i();
        r8.W(Z.k);
        r8.s(Z.m);
        r8.L(Z.K);
        GA.B(sZ, a);
        pb_22.add(sZ);
        pb_22.r(this.f.g);
        cI.setSelectedIndex(this.f.e);
        cI.k(this.f.e);
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
                char[] cArray3 = "(+4\u00013;h$<".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 42;
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
                            n17 = 97;
                            break;
                        }
                        case 1: {
                            n17 = 110;
                            break;
                        }
                        case 2: {
                            n17 = 115;
                            break;
                        }
                        case 3: {
                            n17 = 73;
                            break;
                        }
                        case 4: {
                            n17 = 118;
                            break;
                        }
                        case 5: {
                            n17 = 60;
                            break;
                        }
                        default: {
                            n17 = 32;
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
        long l2 = 9200005730755713294L;
        b = 0xD40CE63FE9409904L ^ l2;
    }
}

