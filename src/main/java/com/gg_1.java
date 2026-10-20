/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.c;
import com.gj_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.gG
 */
public class gg_1
extends gj_2 {
    private float Z = 1.0f;
    private float m = 1.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] g;

    @Override
    protected float q(float f10) {
        f10 *= this.Z;
        f10 = (f10 - 0.5f) * this.m + 0.5f;
        return f10;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13;
        float f10;
        String[] stringArray;
        int n14;
        int n15;
        int n16;
        int n17;
        block15: {
            int n18;
            block14: {
                int n19;
                block13: {
                    n17 = n12 & gg_1.b(15302, 4140671923746370737L);
                    n16 = n12 >> gg_1.b(24420, 7239521282490011665L) & gg_1.b(30879, 874709006340601835L);
                    n15 = n12 >> gg_1.b(21129, 7712524956420480505L) & gg_1.b(20200, 7931202970443874715L);
                    n14 = n12 & gg_1.b(20200, 7931202970443874715L);
                    stringArray = W5.q();
                    float f11 = n16 + n15 + n14;
                    float f12 = 418.0f;
                    f10 = f12 / f11;
                    n13 = n16;
                    n18 = n15;
                    n19 = n16;
                    if (stringArray == null) break block13;
                    if (n18 > n19) {
                        n13 = n15;
                    }
                    n18 = n14;
                    if (stringArray == null) break block14;
                    n19 = n15;
                }
                if (n18 <= n19) break block15;
                n18 = n14;
            }
            n13 = n18;
        }
        float f13 = 255.0f / (float)n13;
        float f14 = 2.0f;
        float f15 = f13;
        if (stringArray != null) {
            if (f15 > f14) {
                f13 = f14;
            }
            f15 = f10;
        }
        float f16 = f15;
        float f17 = f10 == f13 ? 0 : (f10 > f13 ? 1 : -1);
        if (stringArray != null) {
            float f18;
            if (f17 > 0) {
                f16 = f13;
            }
            f17 = (f18 = (float)n16 * f16 - 255.0f) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        }
        if (stringArray != null) {
            if (f17 >= 0) {
                try {
                    nX.d("");
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            n16 = (int)((float)n16 * f16);
            n15 = (int)((float)n15 * f16);
            n14 = (int)((float)n14 * f16);
            f17 = n17 | n16 << gg_1.b(8391, 4398985851202957238L) | n15 << gg_1.b(11436, 8188803613564232670L) | n14;
        }
        return (int)f17;
    }

    public void k(float f10) {
        this.Z = f10;
        this.N = false;
    }

    public float n() {
        return this.Z;
    }

    public void K(float f10) {
        this.m = f10;
        this.N = false;
    }

    public float X() {
        return this.m;
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
                v0 = "\u001dcgVLbe\u001dceMLp9*\"%\u0017".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 1;
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
                                v9 = 95;
                                break;
                            }
                            case 1: {
                                v9 = 13;
                                break;
                            }
                            case 2: {
                                v9 = 10;
                                break;
                            }
                            case 3: {
                                v9 = 56;
                                break;
                            }
                            case 4: {
                                v9 = 63;
                                break;
                            }
                            case 5: {
                                v9 = 16;
                                break;
                            }
                            default: {
                                v9 = 75;
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
                gg_1.a = new String(v10).intern();
                var0_1 = 3203742839085871400L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "1\u0015\u00f0e{\u0081\u00de\u008e\u00abj\u001e%\u009f\u00ad,\u00d9\u009a>\u00f95\u00dd\u00be\u00b0L\u0002\u0090\u0016\u00f5J\u0084R\u00feD\u00dcq$\u00a1\u00d8\u00a1)";
                var5_5 = "1\u0015\u00f0e{\u0081\u00de\u008e\u00abj\u001e%\u009f\u00ad,\u00d9\u009a>\u00f95\u00dd\u00be\u00b0L\u0002\u0090\u0016\u00f5J\u0084R\u00feD\u00dcq$\u00a1\u00d8\u00a1)".length();
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
                    var4_4 = "&zA\u00ea\u00a7\u00ae\u0006<#\u00e5\u0010#\u0086?\u00c5\u0099";
                    var5_5 = "&zA\u00ea\u00a7\u00ae\u0006<#\u00e5\u0010#\u0086?\u00c5\u0099".length();
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
        gg_1.b = var6_2;
        gg_1.g = new Integer[7];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4F71;
        if (g[n11] == null) {
            gg_1.g[n11] = (int)(b[n11] ^ l2);
        }
        return g[n11];
    }
}

