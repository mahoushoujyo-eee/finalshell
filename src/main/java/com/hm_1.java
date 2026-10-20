/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;
import java.util.Random;

/*
 * Renamed from com.hM
 */
public class hm_1
extends hn_1 {
    private int V = hm_1.a(9667, 493054718073799650L);
    private int I = hm_1.a(20923, 6010599173877725080L);
    private int s = hm_1.a(20599, 6125990442273994327L);
    private int G = -1;
    private int J = hm_1.a(10328, 4625498123037478526L);
    private int F;
    private int k;
    private int L;
    private int A;
    private long B = d;
    private float[] P;
    private Random h = new Random();
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    public void I(int n10) {
        this.G = n10;
    }

    public int K() {
        return this.G;
    }

    public void e(int n10) {
        this.J = n10;
    }

    public int E() {
        return this.J;
    }

    public void M(int n10) {
        this.s = n10;
    }

    public int f() {
        return this.s;
    }

    public void J(int n10) {
        this.V = n10;
    }

    public int V() {
        return this.V;
    }

    public void s(int n10) {
        this.I = n10;
    }

    public int Z() {
        return this.I;
    }

    @Override
    public void C(int n10, int n11) {
        this.F = n10;
        String[] stringArray = W5.q();
        this.k = n11;
        this.L = n10 / 2;
        this.A = n11 / 2;
        super.C(n10, n11);
        this.h.setSeed(this.B);
        String[] stringArray2 = stringArray;
        this.P = new float[this.V];
        for (int i2 = 0; i2 < this.V; ++i2) {
            this.P[i2] = (float)this.I + (float)this.J / 100.0f * (float)this.I * (float)this.h.nextGaussian();
            if (stringArray2 != null) continue;
        }
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10 = n10 - this.L;
        float f11 = n11 - this.A;
        float f12 = f10 * f10 + f11 * f11;
        String[] stringArray = W5.q();
        float f13 = (float)Math.atan2(f11, f10);
        float f14 = (f13 + (float)Math.PI) / ((float)Math.PI * 2) * (float)this.V;
        int n13 = (int)f14;
        float f15 = f14 - (float)n13;
        int n14 = this.I;
        if (stringArray != null) {
            if (n14 != 0) {
                float f16 = NM.J(f15, this.P[n13 % this.V], this.P[(n13 + 1) % this.V]);
                float f17 = f16 * f16 / (f12 + 1.0E-4f);
                f17 = (float)Math.pow(f17, (double)(hm_1.a(12227, 5953736778399877601L) - this.s) / 50.0);
                f15 -= 0.5f;
                f15 = 1.0f - f15 * f15;
                f15 *= f17;
            }
            f15 = NM.X(f15, 0.0f, 1.0f);
            n14 = NM.n(f15, n12, this.G);
        }
        return n14;
    }

    public String toString() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block20: {
                block19: {
                    block21: {
                        break block21;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    v0 = "d\u0017V,}E-\u00180_!fT$RM\u0001n".toCharArray();
                    v1 = v0.length;
                    var10 = 0;
                    v2 = 101;
                    v3 = v0;
                    v4 = v1;
                    if (v1 > 1) ** GOTO lbl54
                    do {
                        v5 = v2;
                        v3 = v3;
                        v6 = v3;
                        v7 = v2;
                        v8 = var10;
                        while (true) {
                            switch (var10 % 7) {
                                case 0: {
                                    v9 = 82;
                                    break;
                                }
                                case 1: {
                                    v9 = 6;
                                    break;
                                }
                                case 2: {
                                    v9 = 74;
                                    break;
                                }
                                case 3: {
                                    v9 = 37;
                                    break;
                                }
                                case 4: {
                                    v9 = 113;
                                    break;
                                }
                                case 5: {
                                    v9 = 90;
                                    break;
                                }
                                default: {
                                    v9 = 45;
                                }
                            }
                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                            ++var10;
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
                    } while (v4 > var10);
                    ** while (true)
                    hm_1.a = new String(v10).intern();
                    var2_1 = 8001144796514680399L;
                    var8_2 = new long[5];
                    var5_3 = 0;
                    var6_4 = "\u00b2\u00e9\u0090\u00b9\u00b2\f\u00f7\u00ca\u00be-\u0080R\u0096\u0084\t\u00ceO:l\u0002A\u0095\b*";
                    var7_5 = "\u00b2\u00e9\u0090\u00b9\u00b2\f\u00f7\u00ca\u00be-\u0080R\u0096\u0084\t\u00ceO:l\u0002A\u0095\b*".length();
                    var4_6 = 0;
                    while (true) {
                        var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                        v11 = var8_2;
                        v12 = var5_3++;
                        v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                        v14 = -1;
                        break block19;
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        var6_4 = "\u00a2\u00d7\u00bf\u0097\u00ad&}\u009f@\u00e66w\u00c4Zp(";
                        var7_5 = "\u00a2\u00d7\u00bf\u0097\u00ad&}\u009f@\u00e66w\u00c4Zp(".length();
                        var4_6 = 0;
                        while (true) {
                            var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                            v11 = var8_2;
                            v12 = var5_3++;
                            v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                            v14 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl88:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        break block20;
                        break;
                    }
                }
                v15 = v13 ^ var2_1;
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
            hm_1.b = var8_2;
            hm_1.c = new Integer[5];
            break block22;
lbl104:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_8 = 4239301942021199721L;
        ** while (true)
        hm_1.d = 4239301942021199386L ^ var0_8;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2622;
        if (c[n11] == null) {
            hm_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

