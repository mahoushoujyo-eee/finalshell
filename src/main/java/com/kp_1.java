/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.k3_0;
import com.ky_2;
import java.awt.Component;
import java.awt.Insets;

/*
 * Renamed from com.kP
 */
public class kp_1
extends ky_2 {
    private static final String a;

    public kp_1(Component component) {
        this(component, 0);
    }

    public kp_1(Component component, int n10) {
        this(component, n10, n10, n10, n10);
    }

    public kp_1(Component component, int n10, int n11, int n12, int n13) {
        this(component, new Insets(n10, n11, n12, n13));
    }

    public kp_1(Component component, Insets insets) {
        block4: {
            block2: {
                block3: {
                    int[] nArray = k3_0.L();
                    int[] nArray2 = nArray;
                    this.b(insets);
                    if (nArray2 == null) break block2;
                    if (component == null) break block3;
                    this.setOpaque(component.isOpaque());
                    this.setBackground(component.getBackground());
                    this.add(component, a);
                    if (nArray2 != null) break block4;
                }
                this.setOpaque(true);
            }
            this.setBackground(GO.R);
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
                char[] cArray3 = "(\u001fW^<d".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 4;
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
                            n17 = 111;
                            break;
                        }
                        case 1: {
                            n17 = 126;
                            break;
                        }
                        case 2: {
                            n17 = 61;
                            break;
                        }
                        case 3: {
                            n17 = 46;
                            break;
                        }
                        case 4: {
                            n17 = 93;
                            break;
                        }
                        case 5: {
                            n17 = 18;
                            break;
                        }
                        default: {
                            n17 = 23;
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

