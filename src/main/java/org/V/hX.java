/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v._S;
import org.v.h4;
import org.v.hP;
import org.v.hd_0;
import org.v.hk_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class hX
extends hP {
    final hk_0 U;
    private static final String b;

    hX(hk_0 hk_02) {
        this.U = hk_02;
        super(hk_02);
    }

    @Override
    public h4[] f() {
        return new h4[0];
    }

    @Override
    public _S p() {
        return _S.PUBLIC;
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public hd_0 p() {
        return this.U.Q.P;
    }

    @Override
    public String K() {
        return b;
    }

    @Override
    public hd_0[] d() {
        return new hd_0[0];
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public hd_0[] S() {
        return new hd_0[0];
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
                char[] cArray3 = "\u0003p?k<".toCharArray();
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
                            n17 = 55;
                            break;
                        }
                        case 1: {
                            n17 = 75;
                            break;
                        }
                        case 2: {
                            n17 = 7;
                            break;
                        }
                        case 3: {
                            n17 = 82;
                            break;
                        }
                        case 4: {
                            n17 = 14;
                            break;
                        }
                        case 5: {
                            n17 = 28;
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
        b = new String(cArray).intern();
    }
}

