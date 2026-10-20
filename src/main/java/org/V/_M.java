/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.RG;
import org.v._5;
import org.v._o_0;
import org.v.fF;
import org.v.fR;
import org.v.rr_0;

class _M
implements _5 {
    final fF x;
    private static final String a;

    _M(fF fF2) {
        this.x = fF2;
    }

    @c
    public Void m(fR fR2) {
        this.x.t.print(fR2.z);
        return null;
    }

    @c
    public Void n(_o_0 _o_02) {
        fF.w(this.x, _o_02.M);
        return null;
    }

    @c
    public Void J(rr_0 rr_02) {
        String[] stringArray = RG.C();
        this.x.t.print(rr_02.G[0]);
        String[] stringArray2 = stringArray;
        for (int i2 = 1; i2 < rr_02.G.length; ++i2) {
            this.x.t.print(a + rr_02.G[i2]);
            if (stringArray2 != null) continue;
        }
        return null;
    }

    @Override
    @c
    public Object i(rr_0 rr_02) throws Throwable {
        return this.J(rr_02);
    }

    @Override
    @c
    public Object u(_o_0 _o_02) throws Throwable {
        return this.n(_o_02);
    }

    @Override
    @c
    public Object q(fR fR2) throws Throwable {
        return this.m(fR2);
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
                char[] cArray3 = "\f\u000e".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 56;
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
                            n17 = 24;
                            break;
                        }
                        case 1: {
                            n17 = 22;
                            break;
                        }
                        case 2: {
                            n17 = 111;
                            break;
                        }
                        case 3: {
                            n17 = 15;
                            break;
                        }
                        case 4: {
                            n17 = 30;
                            break;
                        }
                        case 5: {
                            n17 = 45;
                            break;
                        }
                        default: {
                            n17 = 50;
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

