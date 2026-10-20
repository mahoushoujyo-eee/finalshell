/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.PG;
import com.k0_0;
import com.kc_2;
import com.kz_2;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.TransferHandler;

/*
 * Renamed from com.Ee
 */
class ee_0
extends EY {
    final File u;
    final k0_0 X;
    private static final String a;

    ee_0(k0_0 k0_02, boolean bl, boolean bl2, File file) {
        this.X = k0_02;
        this.u = file;
        super(bl, bl2);
    }

    @Override
    public boolean d() {
        Container container = this.X.getParent();
        String string = kz_2.M();
        boolean bl = container instanceof kc_2;
        if (string != null) {
            if (bl) {
                return ((kc_2)container).y();
            }
            bl = this.X.N();
        }
        return bl;
    }

    @Override
    public int E() {
        Container container = this.X.getParent();
        String string = kz_2.M();
        int n10 = container instanceof kc_2;
        if (string != null) {
            if (n10 != 0) {
                return ((kc_2)container).X();
            }
            n10 = this.X.U();
        }
        return n10;
    }

    @Override
    public File P() {
        ee_0 ee_02;
        block4: {
            block5: {
                String string = kz_2.M();
                ee_02 = this;
                if (string == null) break block4;
                if (ee_02.E() != 2) break block5;
                ee_02 = this;
                if (string == null) break block4;
                Container container = ee_02.X.getParent();
                if (container instanceof kc_2) {
                    this.X.K(new ActionEvent(this.X, 0, a), false);
                }
            }
            ee_02 = this;
        }
        return ee_02.u;
    }

    @Override
    public boolean importData(TransferHandler.TransferSupport transferSupport) {
        return PG.N(this.X, transferSupport);
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
                char[] cArray3 = "1<\u0015R\u000eAW\u00010\u001d\u0017LU\u0018\u0013'\u0018P".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 116;
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
                            n17 = 3;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 67;
                            break;
                        }
                        case 4: {
                            n17 = 90;
                            break;
                        }
                        case 5: {
                            n17 = 88;
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

