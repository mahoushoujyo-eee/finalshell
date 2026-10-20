/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PK;

class BA
implements Runnable {
    final String d;
    private static final String a;

    BA(String string) {
        this.d = string;
    }

    @Override
    public void run() {
        try {
            PK.Z(a + this.d);
        }
        catch (Throwable throwable) {
            // empty catch block
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
                char[] cArray3 = "7\u000f8OP?\"(\f;\u0011\fqn:\u0019#P\u0001>n0\u0016cL\u0002q\u007f:\tbO\u0002`2*F".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 122;
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
                            n17 = 37;
                            break;
                        }
                        case 1: {
                            n17 = 1;
                            break;
                        }
                        case 2: {
                            n17 = 54;
                            break;
                        }
                        case 3: {
                            n17 = 69;
                            break;
                        }
                        case 4: {
                            n17 = 16;
                            break;
                        }
                        case 5: {
                            n17 = 106;
                            break;
                        }
                        default: {
                            n17 = 119;
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

