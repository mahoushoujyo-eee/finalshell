/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gj_2;

/*
 * Renamed from com.gq
 */
public class gq_2
extends gj_2 {
    private static final String a;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected float q(float f10) {
        float f11;
        String[] stringArray = W5.q();
        float f12 = f10;
        float f13 = 0.5f;
        if (stringArray != null) {
            if (f12 > f13) {
                f11 = 2.0f * (f10 - 0.5f);
                return f11;
            }
            f12 = 2.0f;
            f13 = 0.5f - f10;
        }
        f11 = f12 * f13;
        return f11;
    }

    public String toString() {
        return a;
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
                char[] cArray3 = "JOe%A\b0ZOe+A\u0012el".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 30;
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
                            n17 = 23;
                            break;
                        }
                        case 1: {
                            n17 = 62;
                            break;
                        }
                        case 2: {
                            n17 = 23;
                            break;
                        }
                        case 3: {
                            n17 = 84;
                            break;
                        }
                        case 4: {
                            n17 = 45;
                            break;
                        }
                        case 5: {
                            n17 = 101;
                            break;
                        }
                        default: {
                            n17 = 1;
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

