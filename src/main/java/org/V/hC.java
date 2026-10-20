/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v._S;
import org.v.h4;
import org.v.hA;
import org.v.hP;
import org.v.hd_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class hC
extends hP {
    final hA Z;
    private static final String b;

    hC(hA hA2) {
        this.Z = hA2;
        super(hA2);
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

    @Override
    public hd_0 p() {
        return hA.v((hA)this.Z).P;
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
                char[] cArray3 = "t.(Je".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 63;
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
                            n17 = 40;
                            break;
                        }
                        case 1: {
                            n17 = 125;
                            break;
                        }
                        case 2: {
                            n17 = 120;
                            break;
                        }
                        case 3: {
                            n17 = 27;
                            break;
                        }
                        case 4: {
                            n17 = 63;
                            break;
                        }
                        case 5: {
                            n17 = 3;
                            break;
                        }
                        default: {
                            n17 = 110;
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

