/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v.R7;
import org.v.RG;
import org.v._r_0;
import org.v.h_2;

/*
 * Renamed from org.v.Rc
 */
public final class rc_0
extends R7 {
    @c
    public final _r_0 p;
    @c
    public final NV r;
    @c
    public final NV[] Z;
    private static final String d;

    public rc_0(I i2, @c _r_0 _r_02, @c NV nV2, @c NV[] nVArray, _r_0 _r_03) {
        block9: {
            NV[] nVArray2;
            String[] stringArray;
            block8: {
                String[] stringArray2 = RG.C();
                super(i2, _r_03);
                stringArray = stringArray2;
                this.p = _r_02;
                if (stringArray != null) {
                    if (_r_02 != null) {
                        _r_02.G(this);
                    }
                    this.r = nV2;
                }
                if (stringArray != null) {
                    if (nV2 != null) {
                        nV2.d(this);
                    }
                    this.Z = nVArray;
                }
                nVArray2 = nVArray;
                if (stringArray == null) break block8;
                if (nVArray2 == null) break block9;
                nVArray2 = nVArray;
            }
            for (NV nV3 : nVArray2) {
                nV3.d(this);
                if (stringArray != null) continue;
            }
        }
    }

    public String toString() {
        return d;
    }

    @Override
    @c
    public Object R(h_2 h_22) throws Throwable {
        return h_22.E(this);
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
                char[] cArray3 = "2\u0007y<Qn(zS+2Wn=tF%2P`(zF".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 22;
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
                            n17 = 66;
                            break;
                        }
                        case 1: {
                            n17 = 126;
                            break;
                        }
                        case 2: {
                            n17 = 29;
                            break;
                        }
                        case 3: {
                            n17 = 10;
                            break;
                        }
                        case 4: {
                            n17 = 111;
                            break;
                        }
                        case 5: {
                            n17 = 86;
                            break;
                        }
                        default: {
                            n17 = 16;
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

