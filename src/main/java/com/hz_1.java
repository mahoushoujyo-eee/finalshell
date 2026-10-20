/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hg_1;

/*
 * Renamed from com.hZ
 */
public class hz_1
extends hg_1 {
    private static float[] k;
    private static final String b;

    public hz_1() {
        super(k);
    }

    @Override
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
                v0 = "~61;o#^^57:`#W[?7".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 9;
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
                                v9 = 53;
                                break;
                            }
                            case 1: {
                                v9 = 83;
                                break;
                            }
                            case 2: {
                                v9 = 77;
                                break;
                            }
                            case 3: {
                                v9 = 64;
                                break;
                            }
                            case 4: {
                                v9 = 73;
                                break;
                            }
                            case 5: {
                                v9 = 111;
                                break;
                            }
                            default: {
                                v9 = 58;
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
                hz_1.b = new String(v10).intern();
                var1_1 = 2443122550143407049L;
                var0_2 = new long[4];
                var4_3 = 0;
                var5_4 = "u\u00f2\u00f9f\u00e0\u000bS\u00c0H\u0090Z1\u00e0\u000bS\u00ce";
                var6_5 = "u\u00f2\u00f9f\u00e0\u000bS\u00c0H\u0090Z1\u00e0\u000bS\u00ce".length();
                var3_6 = 0;
                while (true) {
                    var7_7 = var5_4.substring(var3_6, var3_6 += 8).getBytes("ISO-8859-1");
                    v11 = var0_2;
                    v12 = var4_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var3_6 < var6_5) ** continue;
                    var5_4 = "'E5\u008f\u00e0\u000bS\u00cf6\u00feI\u00ca\u00e0\u000bS\u00c1";
                    var6_5 = "'E5\u008f\u00e0\u000bS\u00cf6\u00feI\u00ca\u00e0\u000bS\u00c1".length();
                    var3_6 = 0;
                    while (true) {
                        var7_7 = var5_4.substring(var3_6, var3_6 += 8).getBytes("ISO-8859-1");
                        v11 = var0_2;
                        v12 = var4_3++;
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
                    if (var3_6 < var6_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var1_1;
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
        v16 = new float[(int)var0_2[0]];
        v16[0] = -1.0f;
        v16[1] = -1.0f;
        v16[2] = 0.0f;
        v16[3] = -1.0f;
        v16[4] = 1.0f;
        v16[5] = 1.0f;
        v16[(int)var0_2[2]] = 0.0f;
        v16[(int)var0_2[1]] = 1.0f;
        v16[(int)var0_2[3]] = 1.0f;
        hz_1.k = v16;
    }
}

