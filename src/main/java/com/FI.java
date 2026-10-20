/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;

public class FI {
    private static final long[] a;
    private static final Integer[] b;

    private static int r(float f10, float f11, float f12) {
        String[] stringArray = W5.q();
        double d2 = (double)f10 - 0.0;
        int n10 = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
        if (stringArray != null) {
            if (n10 == 0) {
                return 0;
            }
            n10 = (int)Math.round(255.0 * Math.pow(f10 * f11, f12));
        }
        return n10;
    }

    public static int O(float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        block20: {
            block24: {
                int n10;
                int n11;
                String[] stringArray;
                block23: {
                    int n12;
                    block21: {
                        block22: {
                            block18: {
                                block19: {
                                    block6: {
                                        block17: {
                                            int n13;
                                            int n14;
                                            block15: {
                                                block16: {
                                                    block13: {
                                                        block14: {
                                                            block11: {
                                                                block12: {
                                                                    block9: {
                                                                        block10: {
                                                                            block7: {
                                                                                block8: {
                                                                                    block4: {
                                                                                        block5: {
                                                                                            f15 = 0.8f;
                                                                                            stringArray = W5.q();
                                                                                            n14 = n12 = (int)f10;
                                                                                            n13 = FI.a(8844, 5137628121142626004L);
                                                                                            if (stringArray == null) break block4;
                                                                                            if (n14 >= n13) break block5;
                                                                                            f14 = 0.0f;
                                                                                            f13 = 0.0f;
                                                                                            f12 = 0.0f;
                                                                                            if (stringArray != null) break block6;
                                                                                        }
                                                                                        n14 = n12;
                                                                                        n13 = FI.a(17438, 62383186801156175L);
                                                                                    }
                                                                                    if (stringArray == null) break block7;
                                                                                    if (n14 >= n13) break block8;
                                                                                    f14 = -(f10 - 440.0f) / 60.0f;
                                                                                    f13 = 0.0f;
                                                                                    f12 = 1.0f;
                                                                                    if (stringArray != null) break block6;
                                                                                }
                                                                                n14 = n12;
                                                                                n13 = FI.a(19660, 3975242917797030044L);
                                                                            }
                                                                            if (stringArray == null) break block9;
                                                                            if (n14 >= n13) break block10;
                                                                            f14 = 0.0f;
                                                                            f13 = (f10 - 440.0f) / 50.0f;
                                                                            f12 = 1.0f;
                                                                            if (stringArray != null) break block6;
                                                                        }
                                                                        n14 = n12;
                                                                        n13 = FI.a(607, 8212496308661888515L);
                                                                    }
                                                                    if (stringArray == null) break block11;
                                                                    if (n14 >= n13) break block12;
                                                                    f14 = 0.0f;
                                                                    f13 = 1.0f;
                                                                    f12 = -(f10 - 510.0f) / 20.0f;
                                                                    if (stringArray != null) break block6;
                                                                }
                                                                n14 = n12;
                                                                n13 = FI.a(20643, 2922109993497163006L);
                                                            }
                                                            if (stringArray == null) break block13;
                                                            if (n14 >= n13) break block14;
                                                            f14 = (f10 - 510.0f) / 70.0f;
                                                            f13 = 1.0f;
                                                            f12 = 0.0f;
                                                            if (stringArray != null) break block6;
                                                        }
                                                        n14 = n12;
                                                        n13 = FI.a(28957, 4154138488805938510L);
                                                    }
                                                    if (stringArray == null) break block15;
                                                    if (n14 >= n13) break block16;
                                                    f14 = 1.0f;
                                                    f13 = -(f10 - 645.0f) / 65.0f;
                                                    f12 = 0.0f;
                                                    if (stringArray != null) break block6;
                                                }
                                                n14 = n12;
                                                n13 = FI.a(26188, 4573357658632110617L);
                                            }
                                            if (n14 > n13) break block17;
                                            f14 = 1.0f;
                                            f13 = 0.0f;
                                            f12 = 0.0f;
                                            if (stringArray != null) break block6;
                                        }
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    n11 = FI.a(31152, 4008044939767438826L);
                                    n10 = n12;
                                    if (stringArray == null) break block18;
                                    if (n11 > n10) break block19;
                                    n11 = n12;
                                    n10 = FI.a(13713, 4538452604165788099L);
                                    if (stringArray == null) break block18;
                                    if (n11 > n10) break block19;
                                    f11 = 0.3f + 0.7f * (f10 - 380.0f) / 40.0f;
                                    if (stringArray != null) break block20;
                                }
                                n11 = FI.a(25735, 8425364810835804382L);
                                n10 = n12;
                            }
                            if (stringArray == null) break block21;
                            if (n11 > n10) break block22;
                            n11 = n12;
                            n10 = FI.a(22958, 6418612690830392817L);
                            if (stringArray == null) break block21;
                            if (n11 > n10) break block22;
                            f11 = 1.0f;
                            if (stringArray != null) break block20;
                        }
                        n11 = FI.a(26756, 3163110428739325138L);
                        n10 = n12;
                    }
                    if (stringArray == null) break block23;
                    if (n11 > n10) break block24;
                    n11 = n12;
                    n10 = FI.a(14635, 8311886934848871792L);
                }
                if (n11 > n10) break block24;
                f11 = 0.3f + 0.7f * (780.0f - f10) / 80.0f;
                if (stringArray != null) break block20;
            }
            f11 = 0.0f;
        }
        int n15 = FI.r(f14, f11, f15);
        int n16 = FI.r(f13, f11, f15);
        int n17 = FI.r(f12, f11, f15);
        return FI.a(2677, 7840784941401583138L) | n15 << FI.a(26809, 2070893093255630061L) | n16 << FI.a(5520, 3884648013084242382L) | n17;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2961814224149111313L;
                var6_1 = new long[16];
                var3_2 = 0;
                var4_3 = "\u0016zl:`\u008f#\u0004f\u00f1\u00cd\t\u00e6T\u00ae\u00ecB\u00ef+NfbL3\u00ef\u00e7\u00b3\u00d8#L,~\u00dek\u0098B\u00b8&\u0003\u00e6\u00e7rM\u00fd\n6\u008bgh\u008b\u0095\u0096\u001c\u00155\u00da\u0016\u00da:q4$\u00f2q\u007f\u00af\u007f \u00ac\u001f\u0014\u00abE\u008a$\u00ae\u00bd\u00e4\u00c5\u00ec\u00fb\u0000\u0094\u00c1\u001a\u00d9\u001d\\\u00bd\u00d4\u000b\u00bcpKS\u00d7%\u00c7\u00a8\u00b4\u00dd\u00ea\u00a3k>\u00f3HN}\u00d8\u00e5\u00b9";
                var5_4 = "\u0016zl:`\u008f#\u0004f\u00f1\u00cd\t\u00e6T\u00ae\u00ecB\u00ef+NfbL3\u00ef\u00e7\u00b3\u00d8#L,~\u00dek\u0098B\u00b8&\u0003\u00e6\u00e7rM\u00fd\n6\u008bgh\u008b\u0095\u0096\u001c\u00155\u00da\u0016\u00da:q4$\u00f2q\u007f\u00af\u007f \u00ac\u001f\u0014\u00abE\u008a$\u00ae\u00bd\u00e4\u00c5\u00ec\u00fb\u0000\u0094\u00c1\u001a\u00d9\u001d\\\u00bd\u00d4\u000b\u00bcpKS\u00d7%\u00c7\u00a8\u00b4\u00dd\u00ea\u00a3k>\u00f3HN}\u00d8\u00e5\u00b9".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "4\u00c8Mr5\u00fb\u00fcm]2BY/\u00b8\u00be\u0087";
                    var5_4 = "4\u00c8Mr5\u00fb\u00fcm]2BY/\u00b8\u00be\u0087".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        FI.a = var6_1;
        FI.b = new Integer[16];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2455;
        if (b[n11] == null) {
            FI.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

