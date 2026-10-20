/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.RG;
import org.v.q_2;
import org.v.w_2;

/*
 * Renamed from org.v.S
 */
public class s_1 {
    public final boolean K;
    public final q_2 F;
    @c
    public w_2 C;
    private static final String a;

    public s_1(boolean bl, q_2 q_22) {
        this.K = bl;
        this.F = q_22;
    }

    public String toString() {
        StringBuilder stringBuilder;
        block6: {
            block5: {
                stringBuilder = new StringBuilder();
                String[] stringArray = RG.C();
                s_1 s_12 = this;
                if (stringArray != null) {
                    if (s_12.K) {
                        stringBuilder.append(a);
                    }
                    s_12 = this;
                }
                if (s_12.C == null) break block5;
                stringBuilder.append(this.C);
                if (stringArray != null) break block6;
            }
            stringBuilder.append(this.F);
        }
        return stringBuilder.toString();
    }

    public void u(w_2 w_22) {
        this.C = w_22;
    }

    public short p() {
        block3: {
            w_2 w_22;
            block2: {
                String[] stringArray = RG.C();
                w_22 = this.C;
                if (stringArray == null) break block2;
                if (w_22 == null) break block3;
                w_22 = this.C;
            }
            return w_22.w();
        }
        return -1;
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
                char[] cArray3 = "o@T)Yr".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 33;
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
                            n17 = 8;
                            break;
                        }
                        case 2: {
                            n17 = 27;
                            break;
                        }
                        case 3: {
                            n17 = 105;
                            break;
                        }
                        case 4: {
                            n17 = 20;
                            break;
                        }
                        case 5: {
                            n17 = 115;
                            break;
                        }
                        default: {
                            n17 = 104;
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

