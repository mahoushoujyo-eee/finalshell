/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;

/*
 * Renamed from com.hs
 */
public class hs_2
extends hn_1 {
    private int F;
    private static final String a;
    private static final long b;

    public hs_2() {
        this((int)b);
    }

    public hs_2(int n10) {
        this.O = true;
        this.p(n10);
    }

    public void p(int n10) {
        this.F = n10;
    }

    public int e() {
        return this.F;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        return n12 & this.F;
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
                char[] cArray3 = "/|Q'".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 47;
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
                            n17 = 77;
                            break;
                        }
                        case 1: {
                            n17 = 50;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 99;
                            break;
                        }
                        case 4: {
                            n17 = 25;
                            break;
                        }
                        case 5: {
                            n17 = 60;
                            break;
                        }
                        default: {
                            n17 = 30;
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
        long l2 = 4638885898578708914L;
        b = 0x1F553DED655AB64DL ^ l2;
    }
}

