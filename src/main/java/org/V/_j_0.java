/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v.RW;
import org.v._D;
import org.v._S;
import org.v._U;
import org.v.f2;
import org.v.fq_0;
import org.v.fu_0;
import org.v.hL;
import org.v.k_0;
import org.v.nt_0;

/*
 * Renamed from org.v._j
 */
public class _j_0
extends _D
implements RW,
f2 {
    private static final String f;
    private static final long i;

    public _j_0(I i2, @c String string, fu_0[] fu_0Array, String string2, @c _U[] _UArray, @c nt_0 nt_02, nt_0[] nt_0Array) {
        super(i2, string, fu_0Array, string2, _UArray, nt_02, nt_0Array);
    }

    @Override
    public _S Q() {
        return RG.N(this.D());
    }

    @Override
    public void C(k_0 k_02) {
        this.r(k_02);
    }

    @Override
    public k_0 H() {
        return (k_0)this.y();
    }

    @Override
    public String R() {
        return this.H().R() + (char)i + this.j();
    }

    @Override
    @c
    public Object J(fq_0 fq_02) throws Throwable {
        return fq_02.M(this);
    }

    @Override
    @c
    public Object i(hL hL2) throws Throwable {
        return hL2.F(this);
    }

    public boolean D() {
        return RG.G(this.D(), new String[]{f});
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
                char[] cArray3 = "]\u0017b5\u001a\u0006".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 127;
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
                            n17 = 81;
                            break;
                        }
                        case 1: {
                            n17 = 28;
                            break;
                        }
                        case 2: {
                            n17 = 124;
                            break;
                        }
                        case 3: {
                            n17 = 62;
                            break;
                        }
                        case 4: {
                            n17 = 12;
                            break;
                        }
                        case 5: {
                            n17 = 26;
                            break;
                        }
                        default: {
                            n17 = 26;
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
        f = new String(cArray).intern();
        long l2 = 2835915388319133265L;
        i = 0xE659738235D36E75L ^ l2;
    }
}

