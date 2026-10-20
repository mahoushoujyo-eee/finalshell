/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c8_0;
import com.lv_1;

/*
 * Renamed from com.Iw
 */
public class iw_0
implements c8_0 {
    private static final String a;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String C(Object object) {
        String string;
        int[] nArray = lv_1.Z();
        Object object2 = object;
        if (nArray != null) {
            if (object2 == null) {
                string = a;
                return string;
            }
            object2 = object;
        }
        string = object2.toString();
        return string;
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
                char[] cArray3 = "W\u0012fT".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 50;
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
                            n17 = 11;
                            break;
                        }
                        case 1: {
                            n17 = 85;
                            break;
                        }
                        case 2: {
                            n17 = 56;
                            break;
                        }
                        case 3: {
                            n17 = 10;
                            break;
                        }
                        case 4: {
                            n17 = 75;
                            break;
                        }
                        case 5: {
                            n17 = 48;
                            break;
                        }
                        default: {
                            n17 = 112;
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

