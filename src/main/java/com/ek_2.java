/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.R6;
import com.e1_0;
import javax.swing.JComponent;

/*
 * Renamed from com.ek
 */
public class ek_2
extends e1_0 {
    private static final String a;

    public void G(R6 r6, String string, G9 g92, Object[] objectArray) {
        r6.setText(this.q(g92, objectArray));
        r6.G(this.P(a, g92, objectArray));
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.G((R6)jComponent, string, g92, objectArray);
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
                char[] cArray3 = "\u0001(S0\u0007\u0007\u000f\u00076N1".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 109;
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
                            n17 = 5;
                            break;
                        }
                        case 1: {
                            n17 = 43;
                            break;
                        }
                        case 2: {
                            n17 = 78;
                            break;
                        }
                        case 3: {
                            n17 = 40;
                            break;
                        }
                        case 4: {
                            n17 = 30;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 16;
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

