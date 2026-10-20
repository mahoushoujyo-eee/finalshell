/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.io.IOException;

public class P
extends IOException {
    private static final String a;

    public P() {
        super(a);
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
                char[] cArray3 = "\n4Q9P-\u0014*\tr#\u0019\n\\!\u00147n\u001f\u000b\u0019o\u001fvw\u0011Y\u0013=[tl\u001e\u0017\u0019,\u000f~l\u001eY\u0015<[{l\u0003\r".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 104;
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
                            n17 = 39;
                            break;
                        }
                        case 1: {
                            n17 = 19;
                            break;
                        }
                        case 2: {
                            n17 = 127;
                            break;
                        }
                        case 3: {
                            n17 = 107;
                            break;
                        }
                        case 4: {
                            n17 = 24;
                            break;
                        }
                        case 5: {
                            n17 = 17;
                            break;
                        }
                        default: {
                            n17 = 20;
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

