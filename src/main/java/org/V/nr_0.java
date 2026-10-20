/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.fE;
import org.v.fz_0;
import org.v.hp_0;
import org.v.nt_0;
import org.v.x_0;
import org.v.x_1;

/*
 * Renamed from org.v.Nr
 */
public final class nr_0
extends nt_0
implements hp_0 {
    public final nt_0 u;
    private static final String d;

    public nr_0(nt_0 nt_02) {
        super(nt_02.Q());
        this.u = nt_02;
    }

    @Override
    public void n(x_1 x_12) {
        super.n(x_12);
        this.u.n(x_12);
    }

    @Override
    public String toString() {
        return this.u.toString() + d;
    }

    @Override
    @c
    public Object p(x_0 x_02) throws Throwable {
        return x_02.u(this);
    }

    @Override
    @c
    public Object h(fz_0 fz_02) throws Throwable {
        return fz_02.n(this);
    }

    @Override
    @c
    public Object N(fE fE2) throws Throwable {
        return fE2.J(this);
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
                char[] cArray3 = "$d".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 85;
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
                            n17 = 42;
                            break;
                        }
                        case 1: {
                            n17 = 108;
                            break;
                        }
                        case 2: {
                            n17 = 119;
                            break;
                        }
                        case 3: {
                            n17 = 70;
                            break;
                        }
                        case 4: {
                            n17 = 107;
                            break;
                        }
                        case 5: {
                            n17 = 30;
                            break;
                        }
                        default: {
                            n17 = 67;
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
        d = new String(cArray).intern();
    }
}

