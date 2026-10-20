/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;

/*
 * Renamed from com.hw
 */
public class hw_2
extends hn_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hw_2() {
        this.O = true;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 & hw_2.a(6094, 7757355591516564419L);
        String[] stringArray = W5.q();
        int n14 = n12 >> hw_2.a(6900, 2321147317950818044L) & hw_2.a(30199, 6148820865973471742L);
        int n15 = n12 >> hw_2.a(31189, 636125824812959199L) & hw_2.a(24068, 1854120050932408840L);
        int n16 = n12 & hw_2.a(24068, 1854120050932408840L);
        int n17 = hw_2.a(30493, 4139943626883418902L);
        float f10 = 0.42f;
        n14 = (int)((float)n14 * f10) + n17;
        n15 = (int)((float)n15 * f10) + n17;
        n16 = (int)((float)n16 * f10) + n17;
        int n18 = n14;
        int n19 = hw_2.a(24068, 1854120050932408840L);
        if (stringArray != null) {
            if (n18 > n19) {
                n14 = hw_2.a(24068, 1854120050932408840L);
            }
            n18 = n15;
            n19 = hw_2.a(24068, 1854120050932408840L);
        }
        if (stringArray != null) {
            if (n18 > n19) {
                n15 = hw_2.a(24068, 1854120050932408840L);
            }
            n18 = n16;
            n19 = hw_2.a(24068, 1854120050932408840L);
        }
        if (stringArray != null) {
            if (n18 > n19) {
                n16 = hw_2.a(24068, 1854120050932408840L);
            }
            n18 = n13 | n14 << hw_2.a(23456, 424694068316727214L) | n15 << hw_2.a(19690, 8972653595430285541L);
            n19 = n16;
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
                v0 = "N\u0005S\u0014\\\u00120J\u0018^\u0002\u000e.jy".toCharArray();
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
                                v9 = 59;
                                break;
                            }
                            case 1: {
                                v9 = 92;
                                break;
                            }
                            case 2: {
                                v9 = 9;
                                break;
                            }
                            case 3: {
                                v9 = 77;
                                break;
                            }
                            case 4: {
                                v9 = 24;
                                break;
                            }
                            case 5: {
                                v9 = 87;
                                break;
                            }
                            default: {
                                v9 = 41;
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
                hw_2.a = new String(v10).intern();
                var0_1 = 8584469709065234302L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00e0\u00fa\u00d2\u008d\u0017.E\u0089\u00b8\u008a>sZS\f\u00bd\u00adP{\u00cc\u0081\u00d4\u00c0\u00c0\u008d\u0093<[!\u00af\u00d7\u0093!p\u00c38\u00c4 \u0001\u0092\u0006<\u00be\u00fb&4\u00ee\u007f";
                var5_5 = "\u00e0\u00fa\u00d2\u008d\u0017.E\u0089\u00b8\u008a>sZS\f\u00bd\u00adP{\u00cc\u0081\u00d4\u00c0\u00c0\u008d\u0093<[!\u00af\u00d7\u0093!p\u00c38\u00c4 \u0001\u0092\u0006<\u00be\u00fb&4\u00ee\u007f".length();
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
                    var4_4 = "M\u0082\u0010\u00b0\u00f5\u0082\u00e2\u00a9lQ}f\u009fhl\u00fe";
                    var5_5 = "M\u0082\u0010\u00b0\u00f5\u0082\u00e2\u00a9lQ}f\u009fhl\u00fe".length();
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
        hw_2.b = var6_2;
        hw_2.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3C0C;
        if (c[n11] == null) {
            hw_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

