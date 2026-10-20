/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gj_2;

/*
 * Renamed from com.gS
 */
public class gs_1
extends gj_2 {
    private float v = 1.0f;
    private static final String a;

    public gs_1() {
    }

    public gs_1(float f10) {
        this.v = f10;
    }

    @Override
    protected float q(float f10) {
        return f10 * this.v;
    }

    public void L(float f10) {
        this.v = f10;
        this.N = false;
    }

    public float V() {
        return this.v;
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
                char[] cArray3 = "\u0011\u0004lk`\u007fv\u0000\u000esgs`<|E.".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 112;
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
                            n17 = 34;
                            break;
                        }
                        case 1: {
                            n17 = 27;
                            break;
                        }
                        case 2: {
                            n17 = 112;
                            break;
                        }
                        case 3: {
                            n17 = 116;
                            break;
                        }
                        case 4: {
                            n17 = 98;
                            break;
                        }
                        case 5: {
                            n17 = 124;
                            break;
                        }
                        default: {
                            n17 = 41;
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

