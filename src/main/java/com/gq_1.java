/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;

/*
 * Renamed from com.gQ
 */
public class gq_1
extends hn_1 {
    private float u = 16.0f;
    private float F = 16.0f;
    private float V = 6.0f;
    private float R = 6.0f;
    private int L = gq_1.a(14909, 5502266190869895423L);
    private int X = gq_1.a(25994, 5452773651149965129L);
    private int i = gq_1.a(9607, 2208379754439313223L);
    private int p = gq_1.a(17595, 956458912919250559L);
    private boolean d = true;
    private boolean Q = false;
    private boolean b = true;
    public int[][] S = new int[][]{{0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}};
    private static final String a;
    private static final long[] c;
    private static final Integer[] e;

    public void N(float f10) {
        this.V = f10;
    }

    public void d(float f10) {
        this.u = f10;
    }

    public float q() {
        return this.u;
    }

    public void h(float f10) {
        this.F = f10;
    }

    public float w() {
        return this.F;
    }

    public float l() {
        return this.V;
    }

    public void L(float f10) {
        this.R = f10;
    }

    public float z() {
        return this.R;
    }

    public void L(int[][] nArray) {
        this.S = nArray;
    }

    public int[][] x() {
        return this.S;
    }

    public void X(boolean bl) {
        this.d = bl;
    }

    public boolean a() {
        return this.d;
    }

    public void x(boolean bl) {
        this.Q = bl;
    }

    public boolean k() {
        return this.Q;
    }

    public void p(boolean bl) {
        this.b = bl;
    }

    public boolean E() {
        return this.b;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10;
        block40: {
            float f11;
            block45: {
                block46: {
                    int n13;
                    String[] stringArray;
                    block47: {
                        int n14;
                        float f12;
                        block48: {
                            int n15;
                            block49: {
                                int n16;
                                block50: {
                                    int n17;
                                    float f13;
                                    int n18;
                                    block36: {
                                        float f14;
                                        block37: {
                                            block41: {
                                                float f15;
                                                int n19;
                                                float f16;
                                                block42: {
                                                    block43: {
                                                        block44: {
                                                            int n20;
                                                            float f17;
                                                            int n21;
                                                            block38: {
                                                                block39: {
                                                                    float f18;
                                                                    block35: {
                                                                        int n22;
                                                                        block33: {
                                                                            block34: {
                                                                                block32: {
                                                                                    block31: {
                                                                                        gq_1 gq_12;
                                                                                        float f19;
                                                                                        float f20;
                                                                                        block30: {
                                                                                            block29: {
                                                                                                block28: {
                                                                                                    gq_1 gq_13;
                                                                                                    block27: {
                                                                                                        n10 = (int)((float)n10 + (this.u + this.V / 2.0f));
                                                                                                        n11 = (int)((float)n11 + (this.F + this.R / 2.0f));
                                                                                                        f20 = NM.i(n10, this.u + this.V);
                                                                                                        f19 = NM.i(n11, this.F + this.R);
                                                                                                        n18 = (int)((float)n10 / (this.u + this.V));
                                                                                                        n21 = (int)((float)n11 / (this.F + this.R));
                                                                                                        stringArray = W5.q();
                                                                                                        float f21 = f20 - this.u;
                                                                                                        float f22 = f21 == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
                                                                                                        if (stringArray != null) {
                                                                                                            f22 = f22 < 0 ? 1.0f : 0.0f;
                                                                                                        }
                                                                                                        f18 = f22;
                                                                                                        float f23 = f19 - this.F;
                                                                                                        float f24 = f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
                                                                                                        if (stringArray != null) {
                                                                                                            f24 = f24 < 0 ? 1.0f : 0.0f;
                                                                                                        }
                                                                                                        f14 = f24;
                                                                                                        gq_13 = this;
                                                                                                        if (stringArray == null) break block27;
                                                                                                        if (!gq_13.Q) break block28;
                                                                                                        gq_13 = this;
                                                                                                    }
                                                                                                    f16 = Math.abs(gq_13.u / 2.0f - f20) / this.u / 2.0f;
                                                                                                    f12 = Math.abs(this.F / 2.0f - f19) / this.F / 2.0f;
                                                                                                    if (stringArray != null) break block29;
                                                                                                }
                                                                                                f12 = 0.0f;
                                                                                                f16 = 0.0f;
                                                                                            }
                                                                                            gq_12 = this;
                                                                                            if (stringArray == null) break block30;
                                                                                            if (!gq_12.b) break block31;
                                                                                            gq_12 = this;
                                                                                        }
                                                                                        f13 = NM.k(gq_12.u / 2.0f, this.u / 2.0f + this.V, Math.abs(this.u / 2.0f - f20));
                                                                                        f17 = NM.k(this.F / 2.0f, this.F / 2.0f + this.R, Math.abs(this.F / 2.0f - f19));
                                                                                        if (stringArray != null) break block32;
                                                                                    }
                                                                                    f17 = 0.0f;
                                                                                    f13 = 0.0f;
                                                                                }
                                                                                n22 = this.d;
                                                                                if (stringArray == null) break block33;
                                                                                if (n22 == 0) break block34;
                                                                                n19 = n14 = n12;
                                                                                if (stringArray != null) break block35;
                                                                            }
                                                                            n22 = this.i;
                                                                        }
                                                                        n19 = n22;
                                                                        n14 = this.p;
                                                                    }
                                                                    n20 = n18 % this.X;
                                                                    n17 = n21 % this.L;
                                                                    n16 = this.S[n17][n20];
                                                                    f11 = f18;
                                                                    if (stringArray == null) break block36;
                                                                    if (f11 == false) break block37;
                                                                    f15 = f14;
                                                                    if (stringArray == null) break block38;
                                                                    if (f15 == false) break block39;
                                                                    int n23 = n16;
                                                                    if (stringArray != null) {
                                                                        n23 = n23 == 1 ? n19 : n14;
                                                                    }
                                                                    f10 = n23;
                                                                    f10 = NM.n(2.0f * (n16 == 1 ? f16 : f12), (int)f10, gq_1.a(25166, 5762453176749670539L));
                                                                    if (stringArray != null) break block40;
                                                                }
                                                                f15 = (float)this.b;
                                                            }
                                                            if (stringArray == null) break block41;
                                                            if (f15 == false) break block42;
                                                            f15 = n16;
                                                            if (stringArray == null) break block43;
                                                            if (f15 == this.S[(n21 + 1) % this.L][n20]) break block44;
                                                            int n24 = n16;
                                                            if (stringArray != null) {
                                                                if (n24 == 0) {
                                                                    f17 = 1.0f - f17;
                                                                }
                                                                n24 = n19 = NM.n(f17 *= 0.5f, n19, gq_1.a(1266, 4711193332551591475L));
                                                            }
                                                            if (stringArray != null) break block42;
                                                        }
                                                        f15 = n16;
                                                    }
                                                    if (stringArray == null) break block41;
                                                    if (f15 == false) {
                                                        n19 = NM.n(0.5f, n19, gq_1.a(1266, 4711193332551591475L));
                                                    }
                                                }
                                                f15 = f10 = (float)NM.n(2.0f * f16, n19, gq_1.a(1266, 4711193332551591475L));
                                            }
                                            if (stringArray != null) break block40;
                                        }
                                        f11 = f14;
                                    }
                                    if (stringArray == null) break block45;
                                    if (f11 == false) break block46;
                                    n13 = this.b;
                                    if (stringArray == null) break block47;
                                    if (n13 == 0) break block48;
                                    n13 = n16;
                                    n15 = this.S[n17][(n18 + 1) % this.X];
                                    if (stringArray == null) break block49;
                                    if (n13 == n15) break block50;
                                    int n25 = n16;
                                    if (stringArray != null) {
                                        if (n25 == 1) {
                                            f13 = 1.0f - f13;
                                        }
                                        n25 = n14 = NM.n(f13 *= 0.5f, n14, gq_1.a(1266, 4711193332551591475L));
                                    }
                                    if (stringArray != null) break block48;
                                }
                                n13 = n16;
                                if (stringArray == null) break block47;
                                n15 = 1;
                            }
                            if (n13 == n15) {
                                n14 = NM.n(0.5f, n14, gq_1.a(1266, 4711193332551591475L));
                            }
                        }
                        n13 = NM.n(2.0f * f12, n14, gq_1.a(1266, 4711193332551591475L));
                    }
                    f10 = n13;
                    if (stringArray != null) break block40;
                }
                f11 = 0.0f;
            }
            f10 = f11;
        }
        return (int)f10;
    }

    public String toString() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\nE5FX00qw(S['{p\u000e".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 113;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 47;
                                break;
                            }
                            case 1: {
                                v9 = 81;
                                break;
                            }
                            case 2: {
                                v9 = 60;
                                break;
                            }
                            case 3: {
                                v9 = 67;
                                break;
                            }
                            case 4: {
                                v9 = 92;
                                break;
                            }
                            case 5: {
                                v9 = 51;
                                break;
                            }
                            default: {
                                v9 = 36;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                gq_1.a = new String(v10).intern();
                var0_1 = 7091953727391567315L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "\u00ec\u00f2\u00ee\u00d9K\u00d4\n\u0014\u009b\ti\u00de\u001dC\u00ab\u00e0\u00a3\u00ab\u008e\u008e\u00da\u00df\u0095(g\u00b5\f\u00ce\u00f9\u00c9\u00ca\u009e";
                var5_5 = "\u00ec\u00f2\u00ee\u00d9K\u00d4\n\u0014\u009b\ti\u00de\u001dC\u00ab\u00e0\u00a3\u00ab\u008e\u008e\u00da\u00df\u0095(g\u00b5\f\u00ce\u00f9\u00c9\u00ca\u009e".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "b\u00c4Gh\u00b1\u00e0\u00ebS\u00b0&\u00a3\u001e\u00c9R\u00cdX";
                    var5_5 = "b\u00c4Gh\u00b1\u00e0\u00ebS\u00b0&\u00a3\u001e\u00c9R\u00cdX".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        gq_1.c = var6_2;
        gq_1.e = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x22C0;
        if (e[n11] == null) {
            gq_1.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

