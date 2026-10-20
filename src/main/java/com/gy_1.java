/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;

/*
 * Renamed from com.gY
 */
public class gy_1
extends hn_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public int C(int n10, int n11, int n12) {
        int n13;
        String[] stringArray;
        int n14;
        int n15;
        int n16;
        block11: {
            int n17;
            block9: {
                block10: {
                    n16 = n12 >> gy_1.a(19782, 188101063011323547L) & gy_1.a(5677, 8829751395969963510L);
                    n15 = n12 >> gy_1.a(2409, 2931288019656215221L) & gy_1.a(17966, 1820859695357249014L);
                    n14 = n12 >> gy_1.a(24756, 3894127669186126701L) & gy_1.a(17966, 1820859695357249014L);
                    stringArray = W5.q();
                    n13 = n12 & gy_1.a(17966, 1820859695357249014L);
                    n17 = n16;
                    if (stringArray == null) break block9;
                    if (n17 == 0) break block10;
                    n17 = n16;
                    if (stringArray == null) break block9;
                    if (n17 != gy_1.a(17966, 1820859695357249014L)) break block11;
                }
                n17 = n12;
            }
            return n17;
        }
        float f10 = 255.0f / (float)n16;
        n15 = (int)((float)n15 * f10);
        n14 = (int)((float)n14 * f10);
        n13 = (int)((float)n13 * f10);
        int n18 = n15;
        int n19 = gy_1.a(17966, 1820859695357249014L);
        if (stringArray != null) {
            if (n18 > n19) {
                n15 = gy_1.a(17966, 1820859695357249014L);
            }
            n18 = n14;
            n19 = gy_1.a(17966, 1820859695357249014L);
        }
        if (stringArray != null) {
            if (n18 > n19) {
                n14 = gy_1.a(17966, 1820859695357249014L);
            }
            n18 = n13;
            n19 = gy_1.a(17966, 1820859695357249014L);
        }
        if (stringArray != null) {
            if (n18 > n19) {
                n13 = gy_1.a(17966, 1820859695357249014L);
            }
            n18 = n16 << gy_1.a(18899, 4362256899422571020L) | n15 << gy_1.a(1003, 1331381569266188337L) | n14 << gy_1.a(10085, 6344459786157434043L);
            n19 = n13;
        }
        return n18 | n19;
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
                v0 = "\n\u000ey\nq5\u000b%\u0012{\u0007}o2?\u000by\u000ei".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 4;
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
                                v9 = 79;
                                break;
                            }
                            case 1: {
                                v9 = 102;
                                break;
                            }
                            case 2: {
                                v9 = 13;
                                break;
                            }
                            case 3: {
                                v9 = 102;
                                break;
                            }
                            case 4: {
                                v9 = 20;
                                break;
                            }
                            case 5: {
                                v9 = 30;
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
                gy_1.a = new String(v10).intern();
                var0_1 = 480753058350457514L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00f1\u00fc\u00c5\u00da\u00ae\u00bd(\u00beU\u0016q\u009f\u00a6\u0003F\u0019\u00e7\u00d6{(\u0091\u0000\u00ac)\u000b\u00b1\u0089\u008bZ^\u00e8\u000f{a\u001c\u009e\u00d0e\u00f7\u00a3\u001a\u00920.\u00bb4b\u008b";
                var5_5 = "\u00f1\u00fc\u00c5\u00da\u00ae\u00bd(\u00beU\u0016q\u009f\u00a6\u0003F\u0019\u00e7\u00d6{(\u0091\u0000\u00ac)\u000b\u00b1\u0089\u008bZ^\u00e8\u000f{a\u001c\u009e\u00d0e\u00f7\u00a3\u001a\u00920.\u00bb4b\u008b".length();
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
                    var4_4 = "\u00f6\u009b\u001fr\u00acr\u0081\u00cf\u0087\u00a7\u00d0U\u00dc1'\u00a3";
                    var5_5 = "\u00f6\u009b\u001fr\u00acr\u0081\u00cf\u0087\u00a7\u00d0U\u00dc1'\u00a3".length();
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
        gy_1.b = var6_2;
        gy_1.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3DF;
        if (c[n11] == null) {
            gy_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

