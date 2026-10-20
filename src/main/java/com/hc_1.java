/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;

/*
 * Renamed from com.hC
 */
public class hc_1
extends hn_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 >> hc_1.a(28671, 3530820060037907859L) & hc_1.a(30203, 4011568995566886802L);
        int n14 = n12 >> hc_1.a(8300, 6644520791036086785L) & hc_1.a(1533, 8763396645457358738L);
        int n15 = n12 >> hc_1.a(14785, 5695634925382620073L) & hc_1.a(1533, 8763396645457358738L);
        int n16 = n12 & hc_1.a(1533, 8763396645457358738L);
        float f10 = (float)n13 * 0.003921569f;
        n14 = (int)((float)n14 * f10);
        n15 = (int)((float)n15 * f10);
        n16 = (int)((float)n16 * f10);
        return n13 << hc_1.a(5836, 6931105529815727270L) | n14 << hc_1.a(11488, 1698792229241865867L) | n15 << hc_1.a(23635, 8639532367033742909L) | n16;
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
                v0 = "q:\u0012\u0016FO!B3\u000f\u000bK\u0014\u0018@:\u001b".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 43;
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
                                v9 = 27;
                                break;
                            }
                            case 1: {
                                v9 = 125;
                                break;
                            }
                            case 2: {
                                v9 = 73;
                                break;
                            }
                            case 3: {
                                v9 = 85;
                                break;
                            }
                            case 4: {
                                v9 = 12;
                                break;
                            }
                            case 5: {
                                v9 = 75;
                                break;
                            }
                            default: {
                                v9 = 90;
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
                hc_1.a = new String(v10).intern();
                var0_1 = 3545554705094147845L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00c0\t\u00ccG,\u00bb\u00fa\u008e\u00e0B`\u0087\u0094\u00be\u00b5\u0014\u00d2c\u009b\n\u00faP\u00c90.\u00a7\u00c0\u00f9\u0096\u008c\u0010h\u00b8\u001c\u00d8\u00f3\u00a9d\u00ac\u00a4E\u0090,\u00e2Te\u00e0h";
                var5_5 = "\u00c0\t\u00ccG,\u00bb\u00fa\u008e\u00e0B`\u0087\u0094\u00be\u00b5\u0014\u00d2c\u009b\n\u00faP\u00c90.\u00a7\u00c0\u00f9\u0096\u008c\u0010h\u00b8\u001c\u00d8\u00f3\u00a9d\u00ac\u00a4E\u0090,\u00e2Te\u00e0h".length();
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
                    var4_4 = "~\u00cd\u00fa\u00f7\u00a5\u00b0\u0083\u00bb\u00daK\u008c\u00eb3\u00fe9\u009e";
                    var5_5 = "~\u00cd\u00fa\u00f7\u00a5\u00b0\u0083\u00bb\u00daK\u008c\u00eb3\u00fe9\u009e".length();
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
        hc_1.b = var6_2;
        hc_1.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A6C;
        if (c[n11] == null) {
            hc_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

