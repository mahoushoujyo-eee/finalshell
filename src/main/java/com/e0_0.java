/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import com.ne_2;
import javax.swing.JComponent;

/*
 * Renamed from com.e0
 */
public class e0_0
extends e1_0 {
    private static final String a;

    public void v(ne_2 ne_22, String string, G9 g92, Object[] objectArray) {
        String string2;
        String string3 = this.q(g92, objectArray);
        String[] stringArray = e1_0.A();
        String string4 = string3;
        if (stringArray != null) {
            if (string4 != null) {
                ne_22.setText(string3);
            }
            string4 = this.P(a, g92, objectArray);
        }
        if ((string2 = string4) != null) {
            ne_22.P(string2);
        }
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.v((ne_2)jComponent, string, g92, objectArray);
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
                char[] cArray3 = "\u000b5\b\u0012f}&\r+\u0015\u0013".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 17;
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
                            n17 = 115;
                            break;
                        }
                        case 1: {
                            n17 = 74;
                            break;
                        }
                        case 2: {
                            n17 = 105;
                            break;
                        }
                        case 3: {
                            n17 = 118;
                            break;
                        }
                        case 4: {
                            n17 = 3;
                            break;
                        }
                        case 5: {
                            n17 = 60;
                            break;
                        }
                        default: {
                            n17 = 69;
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

