/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DA;
import com.EE;
import com.dn_2;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import javax.swing.ImageIcon;

public class SW
extends Authenticator {
    public static final ImageIcon k;
    private DA w = null;
    private static int[] e;

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return this.D();
    }

    private PasswordAuthentication D() {
        PasswordAuthentication passwordAuthentication;
        block3: {
            block8: {
                block9: {
                    dn_2 dn_22;
                    int[] nArray;
                    block7: {
                        SW sW;
                        dn_2 dn_23;
                        block6: {
                            int n10;
                            block4: {
                                block5: {
                                    block2: {
                                        dn_23 = EE.S().C();
                                        nArray = SW.P();
                                        if (this.w == null) break block2;
                                        passwordAuthentication = null;
                                        if (nArray != null) break block3;
                                    }
                                    n10 = dn_23.M();
                                    if (nArray == null) break block4;
                                    if (n10 == 0) break block5;
                                    passwordAuthentication = this.Q(dn_23);
                                    if (nArray != null) break block3;
                                }
                                this.w = new DA(this, dn_23);
                                this.w.setVisible(true);
                                sW = this;
                                if (nArray == null) break block6;
                                n10 = sW.w.i();
                            }
                            if (n10 != 0) break block7;
                            dn_23.F(true);
                            dn_23.w(this.w.p());
                            dn_23.v(new String(this.w.p()));
                            EE.f(dn_23, this.w.Y());
                            sW = this;
                        }
                        passwordAuthentication = sW.Q(dn_23);
                        if (nArray != null) break block8;
                    }
                    if (!(dn_22 = EE.S()).M()) break block9;
                    passwordAuthentication = this.Q(dn_22);
                    if (nArray != null) break block8;
                }
                passwordAuthentication = null;
            }
            this.w = null;
        }
        return passwordAuthentication;
    }

    private PasswordAuthentication Q(dn_2 dn_22) {
        return new PasswordAuthentication(dn_22.t(), dn_22.X().toCharArray());
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (SW.P() == null) {
                    SW.u(new int[3]);
                }
                char[] cArray3 = "\u0011<\u0002\u0016J\u0010l\r+\u0005VIQj".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 81;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 41;
                            break;
                        }
                        case 1: {
                            n17 = 14;
                            break;
                        }
                        case 2: {
                            n17 = 60;
                            break;
                        }
                        case 3: {
                            n17 = 41;
                            break;
                        }
                        case 4: {
                            n17 = 104;
                            break;
                        }
                        case 5: {
                            n17 = 110;
                            break;
                        }
                        default: {
                            n17 = 92;
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
        String string = new String(cArray).intern();
        k = new ImageIcon(SW.class.getResource(string));
    }

    public static void u(int[] nArray) {
        e = nArray;
    }

    public static int[] P() {
        return e;
    }
}

