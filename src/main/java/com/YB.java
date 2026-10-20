/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YZ;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class YB
extends YZ {
    private static final String c;

    @Override
    String d() {
        return c;
    }

    @Override
    public boolean g(byte[] byArray) throws Exception {
        return super.g(byArray);
    }

    @Override
    public void d(byte[] byArray) throws Exception {
        super.d(byArray);
    }

    @Override
    public byte[] k() throws Exception {
        return super.k();
    }

    @Override
    public void i(byte[] byArray, byte[] byArray2) throws Exception {
        super.i(byArray, byArray2);
    }

    @Override
    public void Q(byte[] byArray, byte[] byArray2) throws Exception {
        super.Q(byArray, byArray2);
    }

    @Override
    public void k() throws Exception {
        super.k();
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
                char[] cArray3 = "\rg3E=\u0016ZSg3\t}P\r>g(\u0000a\u0006T\u0013".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 26;
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
                            n17 = 100;
                            break;
                        }
                        case 1: {
                            n17 = 14;
                            break;
                        }
                        case 2: {
                            n17 = 65;
                            break;
                        }
                        case 3: {
                            n17 = 114;
                            break;
                        }
                        case 4: {
                            n17 = 85;
                            break;
                        }
                        case 5: {
                            n17 = 127;
                            break;
                        }
                        default: {
                            n17 = 33;
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
        c = new String(cArray).intern();
    }
}

