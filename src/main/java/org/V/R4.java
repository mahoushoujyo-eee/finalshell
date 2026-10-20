/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.NV;
import org.v.R7;
import org.v.R9;
import org.v._r_0;
import org.v.h_2;

public final class R4
extends R7 {
    public final R9 R;
    public final NV d;
    private static final String f;

    public R4(I i2, R9 r9, NV nV2, _r_0 _r_02) {
        super(i2, _r_02);
        this.R = r9;
        this.R.Y.n(this);
        this.d = nV2;
        this.d.d(this);
    }

    public String toString() {
        return f;
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
                char[] cArray3 = "\u0003\u0013\u001b*\u001a\u0012dK\\S*\u001c\u0012dL\\G$\u001c".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 23;
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
                            n17 = 114;
                            break;
                        }
                        case 1: {
                            n17 = 107;
                            break;
                        }
                        case 2: {
                            n17 = 126;
                            break;
                        }
                        case 3: {
                            n17 = 29;
                            break;
                        }
                        case 4: {
                            n17 = 37;
                            break;
                        }
                        case 5: {
                            n17 = 43;
                            break;
                        }
                        default: {
                            n17 = 93;
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
        f = new String(cArray).intern();
    }
}

