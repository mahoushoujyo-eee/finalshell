/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.L.Q;
import com.L.U;
import com.NE;
import com.Z.T;
import com.cz_0;
import com.i2_0;
import com.z.i_0;
import java.awt.Component;
import java.io.File;
import javax.swing.JList;

class D
extends Q {
    final i_0 k;
    private static final String c;
    private static final long d;

    D(i_0 i_02) {
        this.k = i_02;
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n10, boolean bl, boolean bl2) {
        String string;
        U u10;
        block6: {
            File file;
            block4: {
                block5: {
                    u10 = (U)super.getListCellRendererComponent(jList, object, n10, bl, bl2);
                    file = (File)object;
                    string = T.v();
                    if (string != null) break block4;
                    if (file != null) break block5;
                    u10.setIcon(cz_0.C());
                    u10.setText(i2_0.O(c));
                    if (string == null) break block6;
                }
                u10.setIcon(cz_0.B(file));
            }
            u10.setText(NE.w(cz_0.X(file), (int)d, true));
        }
        int n11 = n10;
        if (string == null) {
            n11 = n11 == this.k.f.e ? 1 : 0;
        }
        u10.B(n11 != 0);
        return u10;
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
                char[] cArray3 = "bkWaBC\u007fsgYh@M>z}P\u007f\rW>zz".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 62;
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
                            n17 = 43;
                            break;
                        }
                        case 1: {
                            n17 = 48;
                            break;
                        }
                        case 2: {
                            n17 = 11;
                            break;
                        }
                        case 3: {
                            n17 = 51;
                            break;
                        }
                        case 4: {
                            n17 = 29;
                            break;
                        }
                        case 5: {
                            n17 = 27;
                            break;
                        }
                        default: {
                            n17 = 111;
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
        c = new String(cArray).intern();
        long l2 = 4382427620864525795L;
        d = 0xFAB2F0DBBB7D85CBL ^ l2;
    }
}

