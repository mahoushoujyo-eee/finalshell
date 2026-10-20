/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CU;
import com.FY;
import com.GO;
import com.WC;
import com.k0_0;
import com.kz_2;
import java.awt.event.ActionListener;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fg
 */
class fg_0
extends FY {
    final k0_0 f;
    private static final String a;

    fg_0(k0_0 k0_02) {
        this.f = k0_02;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        block9: {
            k0_0 k0_02;
            block7: {
                block8: {
                    boolean bl;
                    String string;
                    block6: {
                        block4: {
                            block5: {
                                string = kz_2.M();
                                k0_02 = this.f;
                                if (string == null) break block4;
                                if (k0_02.v == null) break block5;
                                bl = this.f.v.i();
                                if (string == null) break block6;
                                if (bl) {
                                    this.f.v.Y();
                                }
                            }
                            k0_02 = this.f;
                        }
                        if (string == null) break block7;
                        bl = k0_02.j;
                    }
                    if (!bl) break block8;
                    this.f.v = new WC(a, GO.FK, (ActionListener)new CU(this));
                    this.f.v.u();
                    if (string != null) break block9;
                }
                this.f.X = 1.0f;
                k0_02 = this.f;
            }
            k0_02.repaint();
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
                char[] cArray3 = "\u001a@\u007f\u0017@~\u001c\u001dI|%L<\u001f,Ax\u0018GF\u0010 @o".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 53;
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
                            n17 = 120;
                            break;
                        }
                        case 1: {
                            n17 = 16;
                            break;
                        }
                        case 2: {
                            n17 = 40;
                            break;
                        }
                        case 3: {
                            n17 = 100;
                            break;
                        }
                        case 4: {
                            n17 = 28;
                            break;
                        }
                        case 5: {
                            n17 = 39;
                            break;
                        }
                        default: {
                            n17 = 76;
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

