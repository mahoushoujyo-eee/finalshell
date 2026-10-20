/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;
import com.iw_2;

/*
 * Renamed from com.h5
 */
public class h5_0
extends hn_1 {
    public float p = 1.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public h5_0() {
    }

    public h5_0(float f10) {
        this.p = f10;
        this.O = true;
    }

    public void a(float f10) {
        this.p = f10;
    }

    public float d() {
        return this.p;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        String[] stringArray = W5.q();
        float f10 = this.p - 1.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (stringArray != null) {
            if (f11 != false) {
                int n13 = n12 & h5_0.a(28358, 8641580959647345706L);
                int n14 = n12 >> h5_0.a(17788, 7225141971987269521L) & h5_0.a(26062, 5668912936437917477L);
                int n15 = n12 >> h5_0.a(18241, 6013515469330482603L) & h5_0.a(27615, 405545812519201073L);
                int n16 = n12 & h5_0.a(27615, 405545812519201073L);
                int n17 = (n14 + n15 + n16) / 3;
                n14 = iw_2.e((int)((float)n17 + this.p * (float)(n14 - n17)));
                n15 = iw_2.e((int)((float)n17 + this.p * (float)(n15 - n17)));
                n16 = iw_2.e((int)((float)n17 + this.p * (float)(n16 - n17)));
                return n13 | n14 << h5_0.a(6516, 7363863608154315675L) | n15 << h5_0.a(3493, 8128393807074578253L) | n16;
            }
            f11 = n12;
        }
        return (int)f11;
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
                v0 = "\u001aPq7\u0019Km\n^i-\u0019Y60PsvE\u0016".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 126;
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
                                v9 = 39;
                                break;
                            }
                            case 1: {
                                v9 = 65;
                                break;
                            }
                            case 2: {
                                v9 = 99;
                                break;
                            }
                            case 3: {
                                v9 = 38;
                                break;
                            }
                            case 4: {
                                v9 = 21;
                                break;
                            }
                            case 5: {
                                v9 = 70;
                                break;
                            }
                            default: {
                                v9 = 60;
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
                h5_0.a = new String(v10).intern();
                var0_1 = 492507650868662613L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00d3We|\u00d4j\u00f8\u009b\u00b0n\u00aeD\u00f1F\u008a\u00de\u00ac\u00dc\u00bb\u0090\u00a1\u00bf}\u007f.\u00c5\u00a7\u00d6\u008f!V\u00d4N\u00d9zW\u0003\u00f2\u00d4\u00f6";
                var5_5 = "\u00d3We|\u00d4j\u00f8\u009b\u00b0n\u00aeD\u00f1F\u008a\u00de\u00ac\u00dc\u00bb\u0090\u00a1\u00bf}\u007f.\u00c5\u00a7\u00d6\u008f!V\u00d4N\u00d9zW\u0003\u00f2\u00d4\u00f6".length();
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
                    var4_4 = "\u00f7a\u0092\u00c8\u0095\u00cf\u00f6\u008f\u0086\u00f3\u00fb\u0096\u00a2\u001a\u001e\u0010";
                    var5_5 = "\u00f7a\u0092\u00c8\u0095\u00cf\u00f6\u008f\u0086\u00f3\u00fb\u0096\u00a2\u001a\u001e\u0010".length();
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
        h5_0.b = var6_2;
        h5_0.c = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x42EE;
        if (c[n11] == null) {
            h5_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

