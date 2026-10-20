/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.FN;
import com.GA;
import com.GO;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicDesktopPaneUI;

/*
 * Renamed from com.c.L
 */
public class l_1
extends BasicDesktopPaneUI {
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new l_1();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(jComponent);
        LookAndFeel.installProperty(jComponent, a, Boolean.TRUE);
        jComponent.setBorder(GA.C(0, 0, 0, 0));
        jComponent.setBackground(GO.R);
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
                char[] cArray3 = "\u0015\u0015I@\b/".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 69;
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
                            n17 = 63;
                            break;
                        }
                        case 1: {
                            n17 = 32;
                            break;
                        }
                        case 2: {
                            n17 = 109;
                            break;
                        }
                        case 3: {
                            n17 = 116;
                            break;
                        }
                        case 4: {
                            n17 = 56;
                            break;
                        }
                        case 5: {
                            n17 = 15;
                            break;
                        }
                        default: {
                            n17 = 107;
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

