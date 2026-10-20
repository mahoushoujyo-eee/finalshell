/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lr_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L9
extends lr_0 {
    private static final String c;

    @Override
    String X() {
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
    public void N(byte[] byArray) throws Exception {
        super.N(byArray);
    }

    @Override
    public void T(byte[] byArray, byte[] byArray2) throws Exception {
        super.T(byArray, byArray2);
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
                char[] cArray3 = "\u0013lKT\u001eX\u007f\u001en\u001d\n\u0011\u001c\u007f\u0002\u007f\u001a\u0015N".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 101;
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
                            n17 = 19;
                            break;
                        }
                        case 1: {
                            n17 = 106;
                            break;
                        }
                        case 2: {
                            n17 = 74;
                            break;
                        }
                        case 3: {
                            n17 = 66;
                            break;
                        }
                        case 4: {
                            n17 = 26;
                            break;
                        }
                        case 5: {
                            n17 = 16;
                            break;
                        }
                        default: {
                            n17 = 105;
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

