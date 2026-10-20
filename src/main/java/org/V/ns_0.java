/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NL;
import org.v.NV;
import org.v.RG;
import org.v.h_2;
import org.v.v_0;

/*
 * Renamed from org.v.Ns
 */
public final class ns_0
extends NL {
    @c
    public final NV W;
    private static final String d;

    public ns_0(I i2, @c NV nV2, NV[] nVArray) {
        block3: {
            NV nV3;
            block2: {
                String[] stringArray = RG.C();
                super(i2, nVArray);
                this.W = nV2;
                String[] stringArray2 = stringArray;
                nV3 = nV2;
                if (stringArray2 == null) break block2;
                if (nV3 == null) break block3;
                nV3 = nV2;
            }
            nV3.d(this);
        }
    }

    @Override
    public String toString() {
        return d;
    }

    @Override
    @c
    public Object s(v_0 v_02) throws Throwable {
        return v_02.a(this);
    }

    @Override
    @c
    public Object R(h_2 h_22) throws Throwable {
        return h_22.S(this);
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
                char[] cArray3 = "k\u0013a|ER[".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 34;
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
                            n17 = 58;
                            break;
                        }
                        case 1: {
                            n17 = 68;
                            break;
                        }
                        case 2: {
                            n17 = 51;
                            break;
                        }
                        case 3: {
                            n17 = 59;
                            break;
                        }
                        case 4: {
                            n17 = 21;
                            break;
                        }
                        case 5: {
                            n17 = 88;
                            break;
                        }
                        default: {
                            n17 = 80;
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

