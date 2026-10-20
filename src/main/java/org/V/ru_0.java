/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.R8;
import org.v.h_2;
import org.v.re_0;

/*
 * Renamed from org.v.Ru
 */
public final class ru_0
extends re_0 {
    public final String s;
    public final R8 P;
    private static final String d;

    public ru_0(I i2, String string, R8 r8) {
        super(i2);
        this.s = string;
        this.P = r8;
        this.P.G(this);
    }

    public String toString() {
        return this.s + d + this.P;
    }

    @Override
    @c
    public Object R(h_2 h_22) throws Throwable {
        return h_22.q(this);
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
                char[] cArray3 = "Hi".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 31;
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
                            n17 = 109;
                            break;
                        }
                        case 1: {
                            n17 = 86;
                            break;
                        }
                        case 2: {
                            n17 = 93;
                            break;
                        }
                        case 3: {
                            n17 = 99;
                            break;
                        }
                        case 4: {
                            n17 = 42;
                            break;
                        }
                        case 5: {
                            n17 = 53;
                            break;
                        }
                        default: {
                            n17 = 85;
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

