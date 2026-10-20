/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hg_1;

/*
 * Renamed from com.ht
 */
public class ht_2
extends hg_1 {
    protected static float[] Z;
    private static final String b;

    public ht_2() {
        super(Z);
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
                v0 = "\u0002t\rVQ-b-h\u0014A^<g5j".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 46;
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
                                v9 = 110;
                                break;
                            }
                            case 1: {
                                v9 = 54;
                                break;
                            }
                            case 2: {
                                v9 = 86;
                                break;
                            }
                            case 3: {
                                v9 = 10;
                                break;
                            }
                            case 4: {
                                v9 = 80;
                                break;
                            }
                            case 5: {
                                v9 = 80;
                                break;
                            }
                            default: {
                                v9 = 37;
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
                ht_2.b = new String(v10).intern();
                var1_1 = 1527538618961915473L;
                var0_2 = new long[4];
                var4_3 = 0;
                var5_4 = "|>!\u00e1\u00db\u00eanV;\u0088\u00f1\u0085\u00db\u00eanW";
                var6_5 = "|>!\u00e1\u00db\u00eanV;\u0088\u00f1\u0085\u00db\u00eanW".length();
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
                    var5_4 = "\u001a'\u00a8\b\u00db\u00eanYwYJe\u00db\u00eanX";
                    var6_5 = "\u001a'\u00a8\b\u00db\u00eanYwYJe\u00db\u00eanX".length();
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
        v16 = new float[(int)var0_2[3]];
        v16[0] = 0.071428575f;
        v16[1] = 0.14285715f;
        v16[2] = 0.071428575f;
        v16[3] = 0.14285715f;
        v16[4] = 0.14285715f;
        v16[5] = 0.14285715f;
        v16[(int)var0_2[1]] = 0.071428575f;
        v16[(int)var0_2[0]] = 0.14285715f;
        v16[(int)var0_2[2]] = 0.071428575f;
        ht_2.Z = v16;
    }
}

