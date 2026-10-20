/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B7;
import com.FN;
import com.O_;

public class O8
extends O_ {
    private static final String a;

    public O8() {
        this.S(a);
        this.setForeground(B7.o);
        FN.u(this);
        FN.K(this, -1);
        this.setHorizontalAlignment(0);
        this.setVerticalAlignment(0);
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
                char[] cArray3 = "Rg3C#S\u0010Na7\u0005*K__d".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 66;
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
                            n17 = 120;
                            break;
                        }
                        case 1: {
                            n17 = 74;
                            break;
                        }
                        case 2: {
                            n17 = 5;
                            break;
                        }
                        case 3: {
                            n17 = 106;
                            break;
                        }
                        case 4: {
                            n17 = 4;
                            break;
                        }
                        case 5: {
                            n17 = 104;
                            break;
                        }
                        default: {
                            n17 = 127;
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

