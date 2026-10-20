/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;

/*
 * Renamed from com.hP
 */
public class hp_1
extends hn_1 {
    private int a;
    private int R;
    private int E;
    private int x;
    private int Z;
    private int G;
    private int W;
    private int n;
    private int j;
    private int H;
    private int g;
    private int c;
    private int f;
    private int S;
    private int h;
    private int v;
    private int U;
    private int p;
    private static final String b;
    private static final long[] d;
    private static final Integer[] e;

    public hp_1() {
        this.v(hp_1.a(27421, 3702674813589743801L));
        this.t(hp_1.a(6264, 4903638639811894227L));
        this.l(hp_1.a(23192, 7386057376625940798L));
        this.h(hp_1.a(28685, 4504929482384143279L));
    }

    public void v(int n10) {
        this.E = n10;
        this.W = n10 >> hp_1.a(18417, 2741671732329170002L) & hp_1.a(14657, 2496537401441041120L);
        this.n = n10 >> hp_1.a(14663, 6459086431565855458L) & hp_1.a(24950, 8989041695405695697L);
        this.j = n10 & hp_1.a(24950, 8989041695405695697L);
    }

    public int C() {
        return this.E;
    }

    public void t(int n10) {
        this.x = n10;
        this.H = n10 >> hp_1.a(25300, 6598123163718181245L) & hp_1.a(24950, 8989041695405695697L);
        this.g = n10 >> hp_1.a(16924, 6286631455733236148L) & hp_1.a(24950, 8989041695405695697L);
        this.c = n10 & hp_1.a(24950, 8989041695405695697L);
    }

    public int l() {
        return this.x;
    }

    public void l(int n10) {
        this.Z = n10;
        this.f = n10 >> hp_1.a(25300, 6598123163718181245L) & hp_1.a(24950, 8989041695405695697L);
        this.S = n10 >> hp_1.a(16924, 6286631455733236148L) & hp_1.a(24950, 8989041695405695697L);
        this.h = n10 & hp_1.a(24950, 8989041695405695697L);
    }

    public int e() {
        return this.Z;
    }

    public void h(int n10) {
        this.G = n10;
        this.v = n10 >> hp_1.a(25300, 6598123163718181245L) & hp_1.a(24950, 8989041695405695697L);
        this.U = n10 >> hp_1.a(16924, 6286631455733236148L) & hp_1.a(24950, 8989041695405695697L);
        this.p = n10 & hp_1.a(24950, 8989041695405695697L);
    }

    public int b() {
        return this.G;
    }

    @Override
    public void C(int n10, int n11) {
        this.a = n10;
        this.R = n11;
        super.C(n10, n11);
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10 = (float)n10 / (float)this.a;
        float f11 = (float)n11 / (float)this.R;
        float f12 = (float)this.W + (float)(this.H - this.W) * f10;
        float f13 = (float)this.f + (float)(this.v - this.f) * f10;
        int n13 = (int)(f12 + (f13 - f12) * f11 + 0.5f);
        f12 = (float)this.n + (float)(this.g - this.n) * f10;
        f13 = (float)this.S + (float)(this.U - this.S) * f10;
        int n14 = (int)(f12 + (f13 - f12) * f11 + 0.5f);
        f12 = (float)this.j + (float)(this.c - this.j) * f10;
        f13 = (float)this.h + (float)(this.p - this.h) * f10;
        int n15 = (int)(f12 + (f13 - f12) * f11 + 0.5f);
        return hp_1.a(23222, 8332263420326861078L) | n13 << hp_1.a(25300, 6598123163718181245L) | n14 << hp_1.a(16924, 6286631455733236148L) | n15;
    }

    public String toString() {
        return b;
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
                v0 = " )&2j\u00175[\n13mE\u0013\u001b 14?#9\u0018 ph1".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 54;
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
                                v9 = 66;
                                break;
                            }
                            case 1: {
                                v9 = 122;
                                break;
                            }
                            case 2: {
                                v9 = 104;
                                break;
                            }
                            case 3: {
                                v9 = 112;
                                break;
                            }
                            case 4: {
                                v9 = 41;
                                break;
                            }
                            case 5: {
                                v9 = 83;
                                break;
                            }
                            default: {
                                v9 = 102;
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
                hp_1.b = new String(v10).intern();
                var0_1 = 2840366804116714446L;
                var6_2 = new long[11];
                var3_3 = 0;
                var4_4 = "\u00cb\u00cf\u000f\u00a3\"n\u0089\u00d1<D\u00d6\u00e5\u00f7\u00a0j\u00d8BK\u00a3o\u0017\u0005\u00f7\u008choI\u00fd7\u0080?\u009e\u00a4\u00ebFmp7\t$iv\"l\u00de\u0002[w\u00f4\u00a4\u00c6k\u00f2\u00e4\u00d1\u00e0\u0098\u008aq\u00e8\u00d8Aj\u000f\u00d1W\u00d5I*\u0082\u00d2\u00a3";
                var5_5 = "\u00cb\u00cf\u000f\u00a3\"n\u0089\u00d1<D\u00d6\u00e5\u00f7\u00a0j\u00d8BK\u00a3o\u0017\u0005\u00f7\u008choI\u00fd7\u0080?\u009e\u00a4\u00ebFmp7\t$iv\"l\u00de\u0002[w\u00f4\u00a4\u00c6k\u00f2\u00e4\u00d1\u00e0\u0098\u008aq\u00e8\u00d8Aj\u000f\u00d1W\u00d5I*\u0082\u00d2\u00a3".length();
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
                    var4_4 = "\u00c1gGPw\u00f6\u00f2r\u000f\u00aa\u00e8\u00c0\b\u0011(\u00e2";
                    var5_5 = "\u00c1gGPw\u00f6\u00f2r\u000f\u00aa\u00e8\u00c0\b\u0011(\u00e2".length();
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
        hp_1.d = var6_2;
        hp_1.e = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3A1;
        if (e[n11] == null) {
            hp_1.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

