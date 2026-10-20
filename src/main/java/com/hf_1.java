/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;

/*
 * Renamed from com.hF
 */
public class hf_1
extends hn_1 {
    private int o = hf_1.a(17656, 9143147995528204816L);
    private int p = hf_1.a(22909, 6689448643816034198L);
    private int t = -1;
    private int d = hf_1.a(25698, 259278783383089800L);
    private int v = 0;
    private float G = 0.0f;
    private float J = 1.0f;
    private float M = 0.0f;
    private float V = 0.0f;
    private float n = 1.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void h(int n10) {
        this.t = n10;
    }

    public int j() {
        return this.t;
    }

    public void A(int n10) {
        this.d = n10;
    }

    public int h() {
        return this.d;
    }

    public void U(int n10) {
        this.o = n10;
    }

    public int G() {
        return this.o;
    }

    public void g(int n10) {
        this.p = n10;
    }

    public int O() {
        return this.p;
    }

    public void T(int n10) {
        this.v = n10;
    }

    public int e() {
        return this.v;
    }

    public void s(float f10) {
        this.G = f10;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.J = f11;
        this.M = f12;
        this.V = -f12;
        this.n = f11;
    }

    public float W() {
        return this.G;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10 = (this.J * (float)n10 + this.M * (float)n11) / (float)this.o;
        String[] stringArray = W5.q();
        float f11 = (this.V * (float)n10 + this.n * (float)n11) / (float)this.p;
        float f12 = f10 + 100000.0f;
        if (stringArray != null) {
            f12 = (int)f12 % 2 != (int)(f11 + 100000.0f) % 2 ? 1.0f : 0.0f;
        }
        float f13 = f12;
        int n13 = this.v;
        if (stringArray != null) {
            if (n13 != 0) {
                float f14 = (float)this.v / 100.0f;
                float f15 = NM.G(0.0f, f14, 1.0f - f14, 1.0f, NM.i(f10, 1.0f));
                float f16 = NM.G(0.0f, f14, 1.0f - f14, 1.0f, NM.i(f11, 1.0f));
                f13 *= f15 * f16;
            }
            n13 = NM.n(f13, this.t, this.d);
        }
        return n13;
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
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "qA\\yFF6\ngLhP_6WFKlAP}\u000b\n".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 101;
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
                            n17 = 64;
                            break;
                        }
                        case 1: {
                            n17 = 65;
                            break;
                        }
                        case 2: {
                            n17 = 65;
                            break;
                        }
                        case 3: {
                            n17 = 104;
                            break;
                        }
                        case 4: {
                            n17 = 86;
                            break;
                        }
                        case 5: {
                            n17 = 81;
                            break;
                        }
                        default: {
                            n17 = 54;
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
        long l2 = 5618748184615950397L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00adM9\u0086\u00a0?\u00aa\u00b5(Ah\u00ff7\u00b8\u0017\u00a3`~if\u0088/\n%";
        int n19 = "\u00adM9\u0086\u00a0?\u00aa\u00b5(Ah\u00ff7\u00b8\u0017\u00a3`~if\u0088/\n%".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x56EA;
        if (c[n11] == null) {
            hf_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

