/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Dn
 */
public class dn_0
extends Exception {
    public int Y;
    private static final String a;

    public dn_0(int n10, String string) {
        super(string);
        this.Y = n10;
    }

    public dn_0(int n10, String string, Throwable throwable) {
        super(string, throwable);
        this.Y = n10;
    }

    @Override
    public String toString() {
        return this.Y + a + this.getMessage();
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
                char[] cArray3 = "mR".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 83;
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
                            n17 = 4;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 61;
                            break;
                        }
                        case 3: {
                            n17 = 65;
                            break;
                        }
                        case 4: {
                            n17 = 86;
                            break;
                        }
                        case 5: {
                            n17 = 119;
                            break;
                        }
                        default: {
                            n17 = 32;
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

