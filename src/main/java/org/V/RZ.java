/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v.R8;
import org.v.h_2;

public final class RZ
extends R8 {
    public final NV k;
    private static final String d;
    private static final long e;

    public RZ(I i2, NV nV2) {
        super(i2);
        this.k = nV2;
        this.k.d(this);
    }

    public String toString() {
        return d + this.k + (char)e;
    }

    @Override
    @c
    public Object R(h_2 h_22) throws Throwable {
        return h_22.x(this);
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
                char[] cArray3 = "\u001cR|]PZ".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 95;
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
                            n17 = 55;
                            break;
                        }
                        case 1: {
                            n17 = 101;
                            break;
                        }
                        case 2: {
                            n17 = 81;
                            break;
                        }
                        case 3: {
                            n17 = 109;
                            break;
                        }
                        case 4: {
                            n17 = 120;
                            break;
                        }
                        case 5: {
                            n17 = 37;
                            break;
                        }
                        default: {
                            n17 = 106;
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
        long l2 = 6114893832187819498L;
        e = 0x786351C1D2C835D1L ^ l2;
    }
}

