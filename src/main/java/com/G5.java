/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.go_0;
import com.yj_2;

public class G5
extends go_0 {
    final yj_2 o;
    private static final String b;

    public G5(yj_2 yj_22) {
        this.o = yj_22;
    }

    @Override
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
                char[] cArray3 = "yfc $QL\u0018Gh.)K".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 115;
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
                            n17 = 75;
                            break;
                        }
                        case 1: {
                            n17 = 120;
                            break;
                        }
                        case 2: {
                            n17 = 114;
                            break;
                        }
                        case 3: {
                            n17 = 58;
                            break;
                        }
                        case 4: {
                            n17 = 50;
                            break;
                        }
                        case 5: {
                            n17 = 76;
                            break;
                        }
                        default: {
                            n17 = 75;
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

