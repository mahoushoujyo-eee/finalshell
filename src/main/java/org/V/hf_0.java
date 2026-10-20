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
 * Renamed from org.v.hf
 */
class hf_0
extends hP {
    static final boolean F;
    final hg_0 i;
    private static final String b;

    hf_0(hg_0 hg_02) {
        this.i = hg_02;
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
        return b;
    }

    @Override
    public hd_0[] d() {
        return new hd_0[]{h_1.Q((h_1)this.i.j).N};
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
        hd_0 hd_03 = this.i.J.m;
        String[] stringArray = RG.C();
        if (!F) {
            hd_02 = hd_03;
            if (stringArray == null) return hd_02;
            if (hd_02 == null) {
                throw new AssertionError();
            }
        }
        hd_02 = hd_03;
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
                char[] cArray3 = "I]F\u000e\u0013JK".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 106;
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
                            n17 = 85;
                            break;
                        }
                        case 1: {
                            n17 = 86;
                            break;
                        }
                        case 2: {
                            n17 = 64;
                            break;
                        }
                        case 3: {
                            n17 = 17;
                            break;
                        }
                        case 4: {
                            n17 = 28;
                            break;
                        }
                        case 5: {
                            n17 = 111;
                            break;
                        }
                        default: {
                            n17 = 71;
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
        F = !h_1.class.desiredAssertionStatus();
    }
}

