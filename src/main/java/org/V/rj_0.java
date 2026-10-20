/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.NA;
import org.v.NH;
import org.v.NK;
import org.v.fF;
import org.v.fz_0;
import org.v.ng_0;
import org.v.nr_0;

/*
 * Renamed from org.v.Rj
 */
class rj_0
implements fz_0 {
    final fF b;
    private static final String a;

    rj_0(fF fF2) {
        this.b = fF2;
    }

    @c
    public Void f(nr_0 nr_02) {
        this.b.A(nr_02.u);
        this.b.t.print(a);
        return null;
    }

    @c
    public Void h(NK nK2) {
        this.b.t.print(nK2.toString());
        return null;
    }

    @c
    public Void J(NA nA2) {
        fF.w(this.b, nA2.N);
        this.b.t.print(nA2.toString());
        return null;
    }

    @c
    public Void r(ng_0 ng_02) {
        this.b.t.print(ng_02.toString());
        return null;
    }

    @c
    public Void Z(NH nH2) {
        this.b.t.print(nH2.toString());
        return null;
    }

    @Override
    @c
    public Object j(NH nH2) throws Throwable {
        return this.Z(nH2);
    }

    @Override
    @c
    public Object O(ng_0 ng_02) throws Throwable {
        return this.r(ng_02);
    }

    @Override
    @c
    public Object u(NA nA2) throws Throwable {
        return this.J(nA2);
    }

    @Override
    @c
    public Object l(NK nK2) throws Throwable {
        return this.h(nK2);
    }

    @Override
    @c
    public Object n(nr_0 nr_02) throws Throwable {
        return this.f(nr_02);
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
                char[] cArray3 = "\u0007\n".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 49;
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
                            n17 = 109;
                            break;
                        }
                        case 1: {
                            n17 = 102;
                            break;
                        }
                        case 2: {
                            n17 = 69;
                            break;
                        }
                        case 3: {
                            n17 = 14;
                            break;
                        }
                        case 4: {
                            n17 = 122;
                            break;
                        }
                        case 5: {
                            n17 = 107;
                            break;
                        }
                        default: {
                            n17 = 78;
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

