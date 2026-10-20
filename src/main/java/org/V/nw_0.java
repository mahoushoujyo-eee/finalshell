/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v._w_0;

/*
 * Renamed from org.v.Nw
 */
public final class nw_0
extends NV {
    public final NV V;
    private static final String a;

    public nw_0(I i2, NV nV2) {
        super(i2);
        this.V = nV2;
    }

    @Override
    public String toString() {
        return this.V.toString() + a;
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.k(this);
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
                char[] cArray3 = "Ww`\rc%o".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 50;
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
                            n17 = 75;
                            break;
                        }
                        case 1: {
                            n17 = 41;
                            break;
                        }
                        case 2: {
                            n17 = 55;
                            break;
                        }
                        case 3: {
                            n17 = 81;
                            break;
                        }
                        case 4: {
                            n17 = 54;
                            break;
                        }
                        case 5: {
                            n17 = 99;
                            break;
                        }
                        default: {
                            n17 = 53;
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

