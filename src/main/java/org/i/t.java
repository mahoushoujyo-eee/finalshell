/*
 * Decompiled with CFR 0.152.
 */
package org.i;

import org.i.D;
import org.i.i_0;
import org.i.z_0;

public class t
implements z_0 {
    public final i_0 L;
    private static final String a;

    public t(i_0 i_02) {
        this.L = i_02;
    }

    @Override
    public Object P(D d2) throws Throwable {
        return d2.u(this);
    }

    @Override
    public String toString() {
        return this.L.toString() + a;
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
                char[] cArray3 = "!|".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 35;
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
                            n17 = 89;
                            break;
                        }
                        case 1: {
                            n17 = 2;
                            break;
                        }
                        case 2: {
                            n17 = 103;
                            break;
                        }
                        case 3: {
                            n17 = 10;
                            break;
                        }
                        case 4: {
                            n17 = 30;
                            break;
                        }
                        case 5: {
                            n17 = 45;
                            break;
                        }
                        default: {
                            n17 = 14;
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

