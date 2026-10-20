/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v._w_0;
import org.v.nt_0;

/*
 * Renamed from org.v.Nv
 */
public final class nv_0
extends NV {
    public final NV d;
    public final nt_0 S;
    private static final String a;

    public nv_0(I i2, NV nV2, nt_0 nt_02) {
        super(i2);
        this.d = nV2;
        this.S = nt_02;
    }

    @Override
    public String toString() {
        return this.d.toString() + a + this.S.toString();
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.W(this);
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
                char[] cArray3 = "nf\u0016\u0019CdI-j\u0017\f\u0017".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 43;
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
                            n17 = 101;
                            break;
                        }
                        case 1: {
                            n17 = 36;
                            break;
                        }
                        case 2: {
                            n17 = 83;
                            break;
                        }
                        case 3: {
                            n17 = 65;
                            break;
                        }
                        case 4: {
                            n17 = 28;
                            break;
                        }
                        case 5: {
                            n17 = 46;
                            break;
                        }
                        default: {
                            n17 = 12;
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

