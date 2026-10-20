/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DU;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class DT
extends DU {
    private static final String b;

    public static ComponentUI createUI(JComponent jComponent) {
        return new DT();
    }

    @Override
    protected String getPropertyPrefix() {
        return b;
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
                char[] cArray3 = "\u001f:\u0012^\u0019Za.".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 45;
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
                            n17 = 102;
                            break;
                        }
                        case 1: {
                            n17 = 114;
                            break;
                        }
                        case 2: {
                            n17 = 71;
                            break;
                        }
                        case 3: {
                            n17 = 7;
                            break;
                        }
                        case 4: {
                            n17 = 100;
                            break;
                        }
                        case 5: {
                            n17 = 22;
                            break;
                        }
                        default: {
                            n17 = 34;
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
        b = new String(cArray).intern();
    }
}

