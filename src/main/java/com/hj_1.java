/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;

/*
 * Renamed from com.hJ
 */
public class hj_1
extends hn_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hj_1() {
        this.O = true;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 & hj_1.a(6132, 3008151311472796463L);
        int n14 = n12 >> hj_1.a(19571, 1115517044277082284L) & hj_1.a(511, 5245538620097443115L);
        int n15 = n12 >> hj_1.a(19968, 6911024689136335580L) & hj_1.a(12262, 3189995845510175551L);
        int n16 = n12 & hj_1.a(12262, 3189995845510175551L);
        n12 = n14 * hj_1.a(12793, 2947977706785375532L) + n15 * hj_1.a(7451, 7556011501194619331L) + n16 * hj_1.a(29447, 6407309041508403161L) >> hj_1.a(24286, 1947648028640897539L);
        return n13 | n12 << hj_1.a(1399, 6906428786275004845L) | n12 << hj_1.a(24286, 1947648028640897539L) | n12;
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
                v0 = "'\u0000x\u001ffz\u0004#\u001du\tgjJ\b\n".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 5;
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
                                v9 = 97;
                                break;
                            }
                            case 1: {
                                v9 = 106;
                                break;
                            }
                            case 2: {
                                v9 = 17;
                                break;
                            }
                            case 3: {
                                v9 = 117;
                                break;
                            }
                            case 4: {
                                v9 = 17;
                                break;
                            }
                            case 5: {
                                v9 = 12;
                                break;
                            }
                            default: {
                                v9 = 46;
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
                hj_1.a = new String(v10).intern();
                var0_1 = 8574836245730558675L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "\u0089\u00c7\u0005\u00c6OKh\u00d8Q\u00ff\b\u009a\u00fc\u0006\u00f8\u0007\u00aa\u0006Sg<\u00edzo\u00ca\u009bd\u00ach\u00ab\u00c5\u0016\u008d\u00a3\u00e7\u00d4\u00a7q\u0019\u0013'\u0003\u007f\u009f\u0016\u0092\u00ab\u0087\u00cc\u001e\u00f9\u00fd\u00a0\u001c!\u00fcq2\u0003M\u00f9\u009e3n";
                var5_5 = "\u0089\u00c7\u0005\u00c6OKh\u00d8Q\u00ff\b\u009a\u00fc\u0006\u00f8\u0007\u00aa\u0006Sg<\u00edzo\u00ca\u009bd\u00ach\u00ab\u00c5\u0016\u008d\u00a3\u00e7\u00d4\u00a7q\u0019\u0013'\u0003\u007f\u009f\u0016\u0092\u00ab\u0087\u00cc\u001e\u00f9\u00fd\u00a0\u001c!\u00fcq2\u0003M\u00f9\u009e3n".length();
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
                    var4_4 = "\u00de\u00fe\u00e0\u0081\u00a3\\\u0087\u00b2\u00c3\u00a4\u00e7Okj7\u0007";
                    var5_5 = "\u00de\u00fe\u00e0\u0081\u00a3\\\u0087\u00b2\u00c3\u00a4\u00e7Okj7\u0007".length();
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
        hj_1.b = var6_2;
        hj_1.c = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x34DD;
        if (c[n11] == null) {
            hj_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

