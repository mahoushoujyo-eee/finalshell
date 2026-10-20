/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;
import com.iw_2;
import java.util.Random;

/*
 * Renamed from com.h2
 */
public class h2_0
extends hn_1 {
    private int z = h2_0.a(14039, 8343736757332483402L);
    private int g = 1;
    private boolean a = false;
    private float v = 1.0f;
    private Random w = new Random();
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    public void C(int n10) {
        this.z = n10;
    }

    public int F() {
        return this.z;
    }

    public void H(int n10) {
        this.g = n10;
    }

    public int M() {
        return this.g;
    }

    public void L(boolean bl) {
        this.a = bl;
    }

    public boolean G() {
        return this.a;
    }

    public void o(float f10) {
        this.v = f10;
    }

    public float q() {
        return this.v;
    }

    /*
     * Unable to fully structure code
     */
    private int J(int var1_1) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        var2_2 = W5.q();
                        v0 = this;
                        if (var2_2 == null) ** GOTO lbl6
                        if (v0.g == 0) {
                            v0 = this;
lbl6:
                            // 2 sources

                            v1 = v0.w.nextGaussian();
                        } else {
                            v1 = 2.0f * this.w.nextFloat() - 1.0f;
                        }
                        v2 = var1_1 += (int)(v1 * (double)this.z);
                        if (var2_2 == null) break block6;
                        if (v2 >= 0) break block7;
                        var1_1 = 0;
                        if (var2_2 != null) break block8;
                    }
                    v2 = var1_1;
                }
                if (var2_2 == null) break block9;
                if (v2 > h2_0.a(22250, 7811926807668030834L)) {
                    var1_1 = h2_0.a(22250, 7811926807668030834L);
                }
            }
            v2 = var1_1;
        }
        return v2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int C(int var1_1, int var2_2, int var3_3) {
        block5: {
            block6: {
                block9: {
                    block7: {
                        block8: {
                            var4_4 = W5.q();
                            cfr_temp_0 = this.w.nextFloat() - this.v;
                            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                            if (var4_4 == null) break block5;
                            if (v0 > 0) break block6;
                            var5_5 = var3_3 & h2_0.a(10178, 6699114989256969309L);
                            var6_6 = var3_3 >> h2_0.a(30446, 6512885227380923767L) & h2_0.a(10523, 1659680475165983361L);
                            var7_7 = var3_3 >> h2_0.a(26598, 7266649919726439549L) & h2_0.a(22250, 7811926807668030834L);
                            var8_8 = var3_3 & h2_0.a(22250, 7811926807668030834L);
                            v1 = this.a;
                            if (var4_4 == null) break block7;
                            if (v1 == 0) break block8;
                            v2 = this;
                            if (var4_4 == null) ** GOTO lbl17
                            if (v2.g == 0) {
                                v2 = this;
lbl17:
                                // 2 sources

                                v3 = v2.w.nextGaussian();
                            } else {
                                v3 = 2.0f * this.w.nextFloat() - 1.0f;
                            }
                            var9_9 = (int)(v3 * (double)this.z);
                            var6_6 = iw_2.e(var6_6 + var9_9);
                            var7_7 = iw_2.e(var7_7 + var9_9);
                            var8_8 = iw_2.e(var8_8 + var9_9);
                            if (var4_4 != null) break block9;
                        }
                        var6_6 = this.J(var6_6);
                        var7_7 = this.J(var7_7);
                        v1 = this.J(var8_8);
                    }
                    var8_8 = v1;
                }
                return var5_5 | var6_6 << h2_0.a(20062, 8482305982558627266L) | var7_7 << h2_0.a(9973, 5012092736686624107L) | var8_8;
            }
            v0 = var3_3;
        }
        return (int)v0;
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
                v0 = "\b\u0003d\"\bG3t6y*As92\u0004x`O\u0013".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 52;
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
                                v9 = 111;
                                break;
                            }
                            case 1: {
                                v9 = 67;
                                break;
                            }
                            case 2: {
                                v9 = 41;
                                break;
                            }
                            case 3: {
                                v9 = 122;
                                break;
                            }
                            case 4: {
                                v9 = 85;
                                break;
                            }
                            case 5: {
                                v9 = 9;
                                break;
                            }
                            default: {
                                v9 = 98;
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
                h2_0.b = new String(v10).intern();
                var0_1 = 4083431141902918417L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u008b\u0015\u00fd0\u00db\u0083^\u009cC\u00dd\u00d5\u00ae\u009d\t\u00fev$\u00f7\u00ba!_\u000f\u00a1o\u0097pLT\u0011\u008eod\u00d3\u00d1\u00b9\u00a6\u0083w\u00c6\u00c3\u0004\u0018&f\u00a5\u00c8>B";
                var5_5 = "\u008b\u0015\u00fd0\u00db\u0083^\u009cC\u00dd\u00d5\u00ae\u009d\t\u00fev$\u00f7\u00ba!_\u000f\u00a1o\u0097pLT\u0011\u008eod\u00d3\u00d1\u00b9\u00a6\u0083w\u00c6\u00c3\u0004\u0018&f\u00a5\u00c8>B".length();
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
                    var4_4 = "\u0082y\u0088\u0003\u00faa\u00aerTr\u00d8R6\u00cc/L";
                    var5_5 = "\u0082y\u0088\u0003\u00faa\u00aerTr\u00d8R6\u00cc/L".length();
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
        h2_0.c = var6_2;
        h2_0.d = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2B98;
        if (d[n11] == null) {
            h2_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

