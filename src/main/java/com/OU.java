/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.w4_0;
import java.awt.Component;

public class OU
implements Cloneable {
    public Component S;
    public int[] x;
    public int[] G;
    public int[] b;
    private static final String a;

    public OU(Component component, w4_0 w4_02) {
        int[] nArray = new int[]{w4_02.T, w4_02.H};
        int[] nArray2 = new int[]{w4_02.r, w4_02.u};
        int[] nArray3 = new int[]{w4_02.L, w4_02.P};
        this.x = nArray;
        this.G = nArray2;
        this.b = nArray3;
        this.S = component;
    }

    public Object x() throws CloneNotSupportedException {
        return this.clone();
    }

    public String toString() {
        w4_0 w4_02 = new w4_0(this.x[0], this.x[1], this.G[0], this.G[1], this.b[0], this.b[1]);
        return "(" + w4_02 + a + this.S;
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
                char[] cArray3 = "\u0001Z".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 75;
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
                            n17 = 99;
                            break;
                        }
                        case 1: {
                            n17 = 49;
                            break;
                        }
                        case 2: {
                            n17 = 35;
                            break;
                        }
                        case 3: {
                            n17 = 70;
                            break;
                        }
                        case 4: {
                            n17 = 17;
                            break;
                        }
                        case 5: {
                            n17 = 73;
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

