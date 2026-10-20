/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v._J;
import org.v._L;
import org.v._S;
import org.v.hP;
import org.v.hX;
import org.v.hd_0;
import org.v.hv_0;
import org.v.u_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.hK
 */
class hk_0
extends hd_0 {
    final hd_0 a;
    final _L Q;
    private static final String c;
    private static final long j;

    hk_0(_L _L2, hd_0 hd_02) {
        this.Q = _L2;
        this.a = hd_02;
    }

    @Override
    protected _J[] V() {
        return new _J[0];
    }

    @Override
    public hv_0[] C() {
        return new hv_0[0];
    }

    @Override
    public hP[] H() {
        return new hP[]{new hX(this)};
    }

    @Override
    public u_1[] A() {
        return new u_1[0];
    }

    @Override
    public hd_0[] j() {
        return new hd_0[0];
    }

    @Override
    @c
    public hd_0 V() {
        return null;
    }

    @Override
    @c
    public hd_0 l() {
        return null;
    }

    @Override
    public hd_0 g() {
        return this.Q.P;
    }

    @Override
    public hd_0[] l() {
        return new hd_0[0];
    }

    @Override
    public String J() {
        return (char)j + this.a.z();
    }

    @Override
    public _S r() {
        return this.a.r();
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean q() {
        return true;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public hd_0 G() {
        return this.a;
    }

    @Override
    public String toString() {
        return this.a.toString() + c;
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
                char[] cArray3 = ",H".toCharArray();
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
                            n17 = 18;
                            break;
                        }
                        case 1: {
                            n17 = 112;
                            break;
                        }
                        case 2: {
                            n17 = 60;
                            break;
                        }
                        case 3: {
                            n17 = 89;
                            break;
                        }
                        case 4: {
                            n17 = 104;
                            break;
                        }
                        case 5: {
                            n17 = 39;
                            break;
                        }
                        default: {
                            n17 = 99;
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
        long l2 = 989244416118431113L;
        j = 0xD106474522C71DD2L ^ l2;
    }
}

