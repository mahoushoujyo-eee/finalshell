/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import com.l4_0;
import javax.swing.JComponent;

/*
 * Renamed from com.eu
 */
public class eu_2
extends e1_0 {
    private static final String a;

    public void d(l4_0 l4_02, String string, G9 g92, Object[] objectArray) {
        l4_02.setText(this.q(g92, objectArray));
        l4_02.d(this.P(a, g92, objectArray));
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.d((l4_0)jComponent, string, g92, objectArray);
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
                char[] cArray3 = "U#`\u0016\"w+S=}\u0017".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 49;
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
                            n17 = 13;
                            break;
                        }
                        case 1: {
                            n17 = 124;
                            break;
                        }
                        case 2: {
                            n17 = 33;
                            break;
                        }
                        case 3: {
                            n17 = 82;
                            break;
                        }
                        case 4: {
                            n17 = 103;
                            break;
                        }
                        case 5: {
                            n17 = 22;
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

