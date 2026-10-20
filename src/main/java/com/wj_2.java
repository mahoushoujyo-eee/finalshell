/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XB;

/*
 * Renamed from com.wj
 */
public class wj_2 {
    private final int R;
    private final int s;
    private int P;
    private final StringBuilder K;
    protected boolean o;
    private static final String a;
    private static final long b;

    protected wj_2(int n10, int n11) {
        this.s = n10;
        this.R = n11;
        this.K = new StringBuilder();
        this.P = 0;
        int[] nArray = XB.X();
        int n12 = n11;
        if (nArray == null) {
            n12 = n12 == 0 ? 1 : 0;
        }
        this.o = n12;
    }

    protected void p(String string, int n10) {
        block5: {
            int n11;
            block6: {
                int n12;
                block4: {
                    int[] nArray = XB.X();
                    n11 = n10;
                    n12 = this.s;
                    if (nArray != null) break block4;
                    if (n11 < n12) break block5;
                    n11 = n10;
                    if (nArray != null) break block6;
                    n12 = this.s + this.R;
                }
                if (n11 >= n12) break block5;
                n11 = string.equals(a + this.P) ? 1 : 0;
            }
            if (n11 == 0) {
                this.o = true;
            }
            this.K.append((char)b);
            this.K.append(string);
            ++this.P;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected String E() {
        int[] nArray = XB.X();
        StringBuilder stringBuilder = this.K;
        if (nArray == null) {
            if (stringBuilder.length() == 0) return "";
            stringBuilder = this.K;
        }
        String string = stringBuilder.substring(1);
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
                char[] cArray3 = "\u0017\u00133".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 89;
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
                            n17 = 47;
                            break;
                        }
                        case 1: {
                            n17 = 56;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 99;
                            break;
                        }
                        case 4: {
                            n17 = 59;
                            break;
                        }
                        case 5: {
                            n17 = 115;
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
        long l2 = 1398115008489105894L;
        b = 0xCBAEF5395422A9CAL ^ l2;
    }
}

