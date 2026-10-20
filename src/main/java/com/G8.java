/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gi_0;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class G8
extends gi_0 {
    private static final String cb;

    public static ComponentUI createUI(JComponent jComponent) {
        return new G8();
    }

    @Override
    protected String getPropertyPrefix() {
        return cb;
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
                char[] cArray3 = "D\b2,[^*e\u0013!$Y\u0015".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 56;
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
                            n17 = 40;
                            break;
                        }
                        case 1: {
                            n17 = 95;
                            break;
                        }
                        case 2: {
                            n17 = 109;
                            break;
                        }
                        case 3: {
                            n17 = 115;
                            break;
                        }
                        case 4: {
                            n17 = 15;
                            break;
                        }
                        case 5: {
                            n17 = 3;
                            break;
                        }
                        default: {
                            n17 = 80;
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
        cb = new String(cArray).intern();
    }
}

