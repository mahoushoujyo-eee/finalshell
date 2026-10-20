/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.File;
import java.io.FilenameFilter;
import org.F.c;
import org.V.G;
import org.V.f;
import org.v.y_0;

class K
implements FilenameFilter {
    static final boolean n;
    final y_0 S;
    private static final String a;

    K(y_0 y_02) {
        this.S = y_02;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean accept(@c File var1_1, @c String var2_2) {
        var3_3 = f.h();
        v0 = K.n;
        if (var3_3 == null) {
            if (!v0 && var1_1 == null) {
                throw new AssertionError();
            }
            v0 = K.n;
        }
        if (var3_3 == null) {
            if (!v0) {
                v1 = var2_2;
                if (var3_3 == null) {
                    if (v1 == null) {
                        throw new AssertionError();
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var2_2;
            }
            v0 = v1.endsWith(K.a);
        }
        return v0;
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
                char[] cArray3 = "Q\u0019\u0014,".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 73;
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
                            n17 = 54;
                            break;
                        }
                        case 1: {
                            n17 = 58;
                            break;
                        }
                        case 2: {
                            n17 = 60;
                            break;
                        }
                        case 3: {
                            n17 = 23;
                            break;
                        }
                        case 4: {
                            n17 = 92;
                            break;
                        }
                        case 5: {
                            n17 = 67;
                            break;
                        }
                        default: {
                            n17 = 97;
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
        n = !G.class.desiredAssertionStatus();
    }
}

