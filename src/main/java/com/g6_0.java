/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gj_2;

/*
 * Renamed from com.g6
 */
public class g6_0
extends gj_2 {
    private float h = 1.0f;
    private float W = 1.0f;
    private static final String a;

    @Override
    protected float q(float f10) {
        f10 *= this.h;
        f10 = (f10 - 0.5f) * this.W + 0.5f;
        return f10;
    }

    public void V(float f10) {
        this.h = f10;
        this.N = false;
    }

    public float a() {
        return this.h;
    }

    public void b(float f10) {
        this.W = f10;
        this.N = false;
    }

    public float X() {
        return this.W;
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
                char[] cArray3 = "#k\u0015\u0004@\u001dp#k\u0017\u001f@\u000f,\u0014*WE".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 44;
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
                            n17 = 76;
                            break;
                        }
                        case 1: {
                            n17 = 40;
                            break;
                        }
                        case 2: {
                            n17 = 85;
                            break;
                        }
                        case 3: {
                            n17 = 71;
                            break;
                        }
                        case 4: {
                            n17 = 30;
                            break;
                        }
                        case 5: {
                            n17 = 66;
                            break;
                        }
                        default: {
                            n17 = 115;
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

