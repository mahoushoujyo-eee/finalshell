/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NP;
import org.v._w_0;

public final class NZ
extends NP {
    private static final String a;

    public NZ(I i2) {
        super(i2, a);
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.w(this);
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
                char[] cArray3 = "H8\u0014/".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 107;
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
                            n17 = 77;
                            break;
                        }
                        case 1: {
                            n17 = 38;
                            break;
                        }
                        case 2: {
                            n17 = 19;
                            break;
                        }
                        case 3: {
                            n17 = 40;
                            break;
                        }
                        case 4: {
                            n17 = 104;
                            break;
                        }
                        case 5: {
                            n17 = 98;
                            break;
                        }
                        default: {
                            n17 = 10;
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

