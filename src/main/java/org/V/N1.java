/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v.N_;
import org.v._w_0;

public final class N1
extends NV {
    public final N_ l;
    public final String w;
    private static final String a;

    public N1(I i2, N_ n_3, String string) {
        super(i2);
        this.l = n_3;
        this.w = string;
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.Q(this);
    }

    @Override
    public String toString() {
        return this.l + a + this.w;
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
                char[] cArray3 = "\u001cX".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 6;
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
                            n17 = 32;
                            break;
                        }
                        case 1: {
                            n17 = 100;
                            break;
                        }
                        case 2: {
                            n17 = 35;
                            break;
                        }
                        case 3: {
                            n17 = 93;
                            break;
                        }
                        case 4: {
                            n17 = 93;
                            break;
                        }
                        case 5: {
                            n17 = 123;
                            break;
                        }
                        default: {
                            n17 = 113;
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

