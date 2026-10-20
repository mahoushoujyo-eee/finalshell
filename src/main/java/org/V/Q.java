/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.util.Collections;
import org.F.c;
import org.V.N;
import org.V.U;

class Q
extends U {
    private static final String b;

    Q() {
    }

    @Override
    @c
    public N J(String string) {
        return null;
    }

    @Override
    @c
    public Iterable E(String string, boolean bl) {
        return Collections.emptyList();
    }

    public String toString() {
        return b;
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
                char[] cArray3 = "T-[uf08T3Dtm,/N&Bo{*8".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 19;
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
                            n17 = 2;
                            break;
                        }
                        case 1: {
                            n17 = 115;
                            break;
                        }
                        case 2: {
                            n17 = 24;
                            break;
                        }
                        case 3: {
                            n17 = 50;
                            break;
                        }
                        case 4: {
                            n17 = 44;
                            break;
                        }
                        case 5: {
                            n17 = 124;
                            break;
                        }
                        default: {
                            n17 = 121;
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
        b = new String(cArray).intern();
    }
}

