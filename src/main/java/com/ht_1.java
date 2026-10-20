/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;

/*
 * Renamed from com.hT
 */
public class ht_1
extends hn_1 {
    private static final String a;
    private static final long b;

    public ht_1() {
        this.O = true;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        return n12 ^ (int)b;
    }

    public String toString() {
        return a;
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
                char[] cArray3 = "*KUgYiv\u0005Q@}L".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 87;
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
                            n17 = 60;
                            break;
                        }
                        case 1: {
                            n17 = 112;
                            break;
                        }
                        case 2: {
                            n17 = 114;
                            break;
                        }
                        case 3: {
                            n17 = 88;
                            break;
                        }
                        case 4: {
                            n17 = 111;
                            break;
                        }
                        case 5: {
                            n17 = 17;
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
        long l2 = 5537034501856238935L;
        b = 0x2B3120A3FF391D57L ^ l2;
    }
}

