/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.v.t_2;

/*
 * Renamed from org.v.hy
 */
public class hy_0 {
    public final String l;
    public final t_2 R;
    private static final String a;

    public hy_0(String string, t_2 t_22) {
        this.l = string;
        this.R = t_22;
    }

    public String toString() {
        return this.l + a + this.R;
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
                char[] cArray3 = "~w%".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 51;
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
                            n17 = 121;
                            break;
                        }
                        case 2: {
                            n17 = 54;
                            break;
                        }
                        case 3: {
                            n17 = 118;
                            break;
                        }
                        case 4: {
                            n17 = 46;
                            break;
                        }
                        case 5: {
                            n17 = 124;
                            break;
                        }
                        default: {
                            n17 = 126;
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

