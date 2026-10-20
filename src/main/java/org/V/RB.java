/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.P;
import org.v.fK;
import org.v.rz_0;
import org.v.x_1;

public abstract class RB
implements x_1 {
    @c
    public final String c;
    public final fK[] B;
    private static final String a;

    public RB(@c String string, fK[] fKArray) {
        this.c = string;
        this.B = fKArray;
    }

    @Override
    public x_1 y() {
        throw new P(a);
    }

    @c
    public abstract Object l(rz_0 var1) throws Throwable;

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
                char[] cArray3 = "V/]fY\u007f\\{nJ`[a\u0015baW}\u0014gTd/Pf\u0014j[tcQz]aR7|]fDj".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 63;
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
                            n17 = 40;
                            break;
                        }
                        case 1: {
                            n17 = 48;
                            break;
                        }
                        case 2: {
                            n17 = 1;
                            break;
                        }
                        case 3: {
                            n17 = 54;
                            break;
                        }
                        case 4: {
                            n17 = 11;
                            break;
                        }
                        case 5: {
                            n17 = 48;
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

