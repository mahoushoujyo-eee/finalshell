/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v._w_0;
import org.v.hN;
import org.v.j_0;

public class NF
extends NV {
    public final hN j;
    public final j_0 a;
    private static final String d;

    public NF(I i2, hN hN2, j_0 j_02) {
        super(i2);
        this.j = hN2;
        this.a = j_02;
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.O(this);
    }

    @Override
    public String toString() {
        return this.j + d + this.a;
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
                char[] cArray3 = "X\u007fv[".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 126;
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
                            n17 = 6;
                            break;
                        }
                        case 1: {
                            n17 = 44;
                            break;
                        }
                        case 2: {
                            n17 = 54;
                            break;
                        }
                        case 3: {
                            n17 = 5;
                            break;
                        }
                        case 4: {
                            n17 = 98;
                            break;
                        }
                        case 5: {
                            n17 = 73;
                            break;
                        }
                        default: {
                            n17 = 90;
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

