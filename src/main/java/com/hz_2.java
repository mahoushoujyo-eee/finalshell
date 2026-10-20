/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;

/*
 * Renamed from com.hz
 */
public class hz_2
extends hn_1 {
    private int C;
    private int b;
    private float P = 0.0f;
    private float R = 1.0f;
    private float j = 10.0f;
    private int m;
    private boolean r;
    private float N = 1.0f;
    private float a = 0.0f;
    private float u = 0.0f;
    private float c = 1.0f;
    private static final String d;
    private static final long[] e;
    private static final Integer[] f;

    public void K(float f10) {
        this.P = f10;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.N = f11;
        this.a = f12;
        this.u = -f12;
        this.c = f11;
    }

    public float K() {
        return this.P;
    }

    public void M(int n10) {
        this.m = n10;
    }

    public int v() {
        return this.m;
    }

    public void E(float f10) {
        this.R = f10;
    }

    public float t() {
        return this.R;
    }

    public void t(float f10) {
        this.j = f10;
    }

    public float X() {
        return this.j;
    }

    public void u(boolean bl) {
        this.r = bl;
    }

    public boolean x() {
        return this.r;
    }

    @Override
    public void C(int n10, int n11) {
        this.C = n10;
        this.b = n11;
        super.C(n10, n11);
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13;
        String[] stringArray;
        block11: {
            float f10;
            block8: {
                int n14;
                block9: {
                    block10: {
                        block6: {
                            block7: {
                                f10 = this.N * (float)n10 + this.a * (float)n11;
                                float f11 = this.u * (float)n10 + this.c * (float)n11;
                                stringArray = W5.q();
                                int n14 = this.m;
                                n14 = 2;
                                if (stringArray == null) break block6;
                                if (n13 != n14) break block7;
                                f10 = (float)Math.sqrt(f10 * f10 + f11 * f11);
                                if (stringArray != null) break block8;
                            }
                            int n14 = this.m;
                            n14 = 3;
                        }
                        if (stringArray == null) break block9;
                        if (n13 != n14) break block10;
                        f10 = NM.i(f10, 16.0f);
                        if (stringArray != null) break block8;
                    }
                    n13 = this.m;
                    if (stringArray == null) break block11;
                    n14 = 4;
                }
                if (n13 == n14) {
                    f10 = this.J(f10, 16.0f);
                }
            }
            n13 = (int)(NM.k(this.R, this.R + this.j, f10) * 255.0f);
        }
        int n15 = n13;
        int n16 = this.r;
        if (stringArray != null) {
            if (n16 != 0) {
                n15 = hz_2.a(30267, 7354607472132633087L) - n15;
            }
            n16 = n15 << hz_2.a(24012, 7938124610400229898L) | n12 & hz_2.a(18617, 8180241593083137916L);
        }
        return n16;
    }

    public float J(float f10, float f11) {
        f10 = NM.i(f10, 2.0f * f11);
        String[] stringArray = W5.q();
        float f12 = f10;
        if (stringArray != null) {
            if (f12 > f11) {
                return 2.0f * f11 - f10;
            }
            f12 = f10;
        }
        return f12;
    }

    public String toString() {
        return d;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "NFfMRcG".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 15;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 7;
                            break;
                        }
                        case 1: {
                            n17 = 40;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 39;
                            break;
                        }
                        case 4: {
                            n17 = 115;
                            break;
                        }
                        case 5: {
                            n17 = 66;
                            break;
                        }
                        default: {
                            n17 = 102;
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
        d = new String(cArray).intern();
        long l2 = 10720500309899610L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00d02\u00d9\u00c7r/\bZ\u0003\u00e4\u00de\u00b6\u00a0\u00aeI\u00d9\u00e3\u00cc]\u00ed\u008dx#H";
        int n19 = "\u00d02\u00d9\u00c7r/\bZ\u0003\u00e4\u00de\u00b6\u00a0\u00aeI\u00d9\u00e3\u00cc]\u00ed\u008dx#H".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        e = lArray;
        f = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x47C4;
        if (f[n11] == null) {
            hz_2.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

