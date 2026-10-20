/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v.RG;
import org.v._S;
import org.v.h4;
import org.v.hP;
import org.v.h_1;
import org.v.hd_0;
import org.v.hg_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class hQ
extends hP {
    static final boolean b;
    final hg_0 h;
    private static final String c;

    hQ(hg_0 hg_02) {
        this.h = hg_02;
        super(hg_02);
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
        return true;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public String K() {
        return c;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public hd_0 p() {
        hd_0 hd_02;
        hd_0 hd_03 = this.h.J.m;
        String[] stringArray = RG.C();
        if (!b) {
            hd_02 = hd_03;
            if (stringArray == null) return hd_02;
            if (hd_02 == null) {
                throw new AssertionError();
            }
        }
        hd_02 = h_1.Q(this.h.j).h(hd_03);
        return hd_02;
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
                char[] cArray3 = "0q[xh1".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 57;
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
                            n17 = 127;
                            break;
                        }
                        case 1: {
                            n17 = 41;
                            break;
                        }
                        case 2: {
                            n17 = 14;
                            break;
                        }
                        case 3: {
                            n17 = 52;
                            break;
                        }
                        case 4: {
                            n17 = 52;
                            break;
                        }
                        case 5: {
                            n17 = 123;
                            break;
                        }
                        default: {
                            n17 = 55;
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
        b = !h_1.class.desiredAssertionStatus();
    }
}

