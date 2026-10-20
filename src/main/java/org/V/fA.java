/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v.fK;
import org.v.h2;

public class fA
extends fK {
    public final String[] k;
    private static final String a;

    public fA(I i2, String[] stringArray) {
        super(i2);
        this.k = stringArray;
    }

    @Override
    @c
    public final Object b(h2 h22) throws Throwable {
        return h22.r(this);
    }

    public String toString() {
        return a + RG.N(this.k, ".") + ";";
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
                char[] cArray3 = "0('$\u0001z8*16?\u001am8".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 47;
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
                            n17 = 118;
                            break;
                        }
                        case 1: {
                            n17 = 106;
                            break;
                        }
                        case 2: {
                            n17 = 120;
                            break;
                        }
                        case 3: {
                            n17 = 100;
                            break;
                        }
                        case 4: {
                            n17 = 92;
                            break;
                        }
                        case 5: {
                            n17 = 33;
                            break;
                        }
                        default: {
                            n17 = 55;
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

