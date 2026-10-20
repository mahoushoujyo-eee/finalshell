/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RD;
import org.v.RG;
import org.v._9;
import org.v._D;
import org.v._S;
import org.v._U;
import org.v.fq_0;
import org.v.fu_0;
import org.v.nt_0;
import org.v.rs_0;

public class _E
extends _D
implements _9 {
    private static final String i;
    private static final long n;

    public _E(I i2, @c String string, fu_0[] fu_0Array, String string2, @c _U[] _UArray, @c nt_0 nt_02, nt_0[] nt_0Array) {
        super(i2, string, fu_0Array, string2, _UArray, nt_02, nt_0Array);
    }

    @Override
    public void l(RD rD) {
        this.r(rD);
    }

    @Override
    public RD U() {
        return (RD)this.y();
    }

    @Override
    public _S Z() {
        return RG.N(this.D());
    }

    @Override
    public String R() {
        String string = this.j();
        RD rD = (RD)this.y();
        rs_0 rs_02 = rD.V;
        if (rs_02 != null) {
            string = rs_02.E + (char)n + string;
        }
        return string;
    }

    @Override
    @c
    public Object J(fq_0 fq_02) throws Throwable {
        return fq_02.y(this);
    }

    public boolean F() {
        return RG.G(this.D(), new String[]{i});
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
                char[] cArray3 = "\u001c6\u00118oU".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 55;
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
                            n17 = 88;
                            break;
                        }
                        case 1: {
                            n17 = 117;
                            break;
                        }
                        case 2: {
                            n17 = 71;
                            break;
                        }
                        case 3: {
                            n17 = 123;
                            break;
                        }
                        case 4: {
                            n17 = 49;
                            break;
                        }
                        case 5: {
                            n17 = 1;
                            break;
                        }
                        default: {
                            n17 = 29;
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
        i = new String(cArray).intern();
        long l2 = 820353087823397019L;
        n = 0x8D2F6E66761BC0B5L ^ l2;
    }
}

