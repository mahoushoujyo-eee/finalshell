/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v._w_0;
import org.v.nt_0;

public final class N0
extends NV {
    public final nt_0 v;
    public final NV t;
    private static final String a;
    private static final long d;

    public N0(I i2, nt_0 nt_02, NV nV2) {
        super(i2);
        this.v = nt_02;
        this.t = nV2;
    }

    @Override
    public String toString() {
        return (char)d + this.v.toString() + a + this.t.toString();
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.c(this);
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
                char[] cArray3 = "P)".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 82;
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
                            n17 = 43;
                            break;
                        }
                        case 1: {
                            n17 = 91;
                            break;
                        }
                        case 2: {
                            n17 = 57;
                            break;
                        }
                        case 3: {
                            n17 = 102;
                            break;
                        }
                        case 4: {
                            n17 = 67;
                            break;
                        }
                        case 5: {
                            n17 = 31;
                            break;
                        }
                        default: {
                            n17 = 11;
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
        long l2 = 1535141921142941290L;
        d = 0xD11A417E99892642L ^ l2;
    }
}

