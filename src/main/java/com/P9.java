/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.awt.Color;
import java.util.Random;
import java.util.StringTokenizer;

public final class P9 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public static Color M(Color color) {
        String string = FV.D();
        Color color2 = color;
        if (string == null) {
            if (color2.getAlpha() != P9.a(467, 3411941311640567078L)) {
                return new Color(color.getRGB(), false);
            }
            color2 = color;
        }
        return color2;
    }

    public static Color M(Color color, int n10) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n10);
    }

    public static Color N(Color color, Color color2, float f10) {
        if (f10 <= 0.0f) {
            return color;
        }
        if (f10 >= 1.0f) {
            return color2;
        }
        return new Color(P9.D(color.getRed(), color2.getRed(), f10), P9.D(color.getGreen(), color2.getGreen(), f10), P9.D(color.getBlue(), color2.getBlue(), f10), P9.D(color.getAlpha(), color2.getAlpha(), f10));
    }

    public static int D(int n10, int n11, float f10) {
        return n10 + Math.round(((float)n11 - (float)n10) * f10);
    }

    public static Color X(Color color) {
        return new Color(P9.d(color.getRed()), P9.d(color.getGreen()), P9.d(color.getBlue()));
    }

    /*
     * Unable to fully structure code
     */
    public static int d(int var0) {
        block31: {
            block29: {
                block30: {
                    var1_1 = FV.D();
                    v0 = 0;
                    v1 = var0;
                    if (var1_1 == null) {
                        if (v0 <= v1) {
                            v0 = var0;
                            v1 = P9.a(18254, 5566390575414197178L);
                            if (var1_1 == null) {
                                if (v0 <= v1) {
                                    v2 = var0;
                                    if (var1_1 == null) {
                                        v2 = v2 > P9.a(28202, 373183381899743959L) - var0 ? P9.a(28202, 373183381899743959L) : 0;
                                    }
                                    return v2;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = P9.a(28202, 373183381899743959L);
                            v1 = var0;
                        }
                    }
                    if (var1_1 == null) {
                        if (v0 <= v1) {
                            v0 = var0;
                            v1 = P9.a(12799, 464152774297931013L);
                            if (var1_1 == null) {
                                if (v0 <= v1) {
                                    v3 = P9.a(28202, 373183381899743959L) + var0;
                                    if (var1_1 == null) {
                                        v3 = v3 > P9.a(8920, 7273021822339571236L) - var0 ? P9.a(8920, 7273021822339571236L) : P9.a(28202, 373183381899743959L);
                                    }
                                    return v3;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = P9.a(8920, 7273021822339571236L);
                            v1 = var0;
                        }
                    }
                    if (var1_1 == null) {
                        if (v0 <= v1) {
                            v0 = var0;
                            v1 = P9.a(14295, 231234286600342319L);
                            if (var1_1 == null) {
                                if (v0 <= v1) {
                                    v4 = P9.a(8920, 7273021822339571236L) + var0;
                                    if (var1_1 == null) {
                                        v4 = v4 > P9.a(13990, 3562473963981032016L) - var0 ? P9.a(13990, 3562473963981032016L) : P9.a(8920, 7273021822339571236L);
                                    }
                                    return v4;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = P9.a(13990, 3562473963981032016L);
                            v1 = var0;
                        }
                    }
                    if (var1_1 != null) break block29;
                    if (v0 > v1) break block30;
                    v0 = var0;
                    v1 = P9.a(17203, 9033566547126403016L);
                    if (var1_1 == null) {
                        if (v0 <= v1) {
                            v5 = P9.a(13990, 3562473963981032016L) + var0;
                            if (var1_1 == null) {
                                v5 = v5 > P9.a(2971, 1483431869039146860L) - var0 ? P9.a(2971, 1483431869039146860L) : P9.a(13990, 3562473963981032016L);
                            }
                            return v5;
                        } else {
                            ** GOTO lbl54
                        }
                    }
                    break block29;
                }
                v0 = P9.a(2971, 1483431869039146860L);
                if (var1_1 != null) break block31;
                v1 = var0;
            }
            if (v0 <= v1) {
                v0 = var0;
                if (var1_1 == null) {
                    if (v0 <= P9.a(467, 3411941311640567078L)) {
                        v6 = P9.a(2971, 1483431869039146860L) + var0;
                        if (var1_1 == null) {
                            v6 = v6 > P9.a(467, 3411941311640567078L) - var0 ? P9.a(467, 3411941311640567078L) : P9.a(2971, 1483431869039146860L);
                        }
                        return v6;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0;
            }
        }
        return v0;
    }

    public static String u(Color color) {
        return P9.Q(color.getRGB());
    }

    public static String Q(int n10) {
        String string = FV.D();
        int n11 = n10;
        if (string == null) {
            if (n11 == 0) {
                return a;
            }
            n11 = n10;
        }
        String string2 = Integer.toHexString(n11).toUpperCase();
        return "#" + string2.substring(2, string2.length());
    }

    public static Color C(String string) {
        string = string.replaceAll(" ", "");
        String string2 = FV.D();
        String string3 = string;
        if (string2 == null) {
            string3 = string3.startsWith("#") ? string : "#" + string;
        }
        return Color.decode(string3);
    }

    public static Color u(String string) {
        return P9.k(string, ",");
    }

    public static Color k(String string, String string2) {
        string = string.replaceAll(" ", "");
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2, false);
        int n10 = stringTokenizer.countTokens();
        String string3 = FV.D();
        int n11 = n10;
        int n12 = 3;
        if (string3 == null) {
            if (n11 == n12) {
                return new Color(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            }
            n11 = n10;
            n12 = 4;
        }
        if (n11 == n12) {
            return new Color(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        }
        return null;
    }

    public static Color B(int n10) {
        return new Color(0, 0, 0, n10);
    }

    public static Color i(int n10) {
        return new Color(P9.a(30740, 3479056859032585451L), P9.a(467, 3411941311640567078L), P9.a(467, 3411941311640567078L), n10);
    }

    public static Color c(Color color) {
        Random random = new Random();
        String string = FV.D();
        int n10 = random.nextInt(P9.a(1372, 8815716632584092069L));
        int n11 = random.nextInt(P9.a(25201, 9102742916713488015L));
        int n12 = random.nextInt(P9.a(25201, 9102742916713488015L));
        Color color2 = color;
        if (string == null) {
            if (color2 != null) {
                n10 = (n10 + color.getRed()) / 2;
                n11 = (n11 + color.getGreen()) / 2;
                n12 = (n12 + color.getBlue()) / 2;
            }
            color2 = new Color(n10, n11, n12);
        }
        return color2;
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
                v0 = "B6rl.\bb".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 17;
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
                                v9 = 112;
                                break;
                            }
                            case 1: {
                                v9 = 23;
                                break;
                            }
                            case 2: {
                                v9 = 83;
                                break;
                            }
                            case 3: {
                                v9 = 77;
                                break;
                            }
                            case 4: {
                                v9 = 15;
                                break;
                            }
                            case 5: {
                                v9 = 41;
                                break;
                            }
                            default: {
                                v9 = 67;
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
                P9.a = new String(v10).intern();
                var0_1 = 1415187514735918684L;
                var6_2 = new long[12];
                var3_3 = 0;
                var4_4 = "\u0007\u00bf{A\u00f0Pl\u00b8\u0011\u008a\u00e5p\u00c6P \u001eF\u00f4\u0092\u00b3>`\u00faH\u00e4\u0016\u00d7\u00b6\u00a2\u000f\u00e1\u00d3F\u00b4J\u00a7'\u00cb\u0086\u00f9eA\u00de\u0010:\u00d2\u00b5\u00ea\u008c\u008fC\u0092Z4\u00c1X\u00c3\u00ce\u0096\u00b6\u00c3\u00ec\u00b3?\u00bf\u00ca\u00fa\u00f9@\u00b6\u0003\u0085\u00e0\u00e0\u00ea\u008br\u00c3\u00c5\u00d5";
                var5_5 = "\u0007\u00bf{A\u00f0Pl\u00b8\u0011\u008a\u00e5p\u00c6P \u001eF\u00f4\u0092\u00b3>`\u00faH\u00e4\u0016\u00d7\u00b6\u00a2\u000f\u00e1\u00d3F\u00b4J\u00a7'\u00cb\u0086\u00f9eA\u00de\u0010:\u00d2\u00b5\u00ea\u008c\u008fC\u0092Z4\u00c1X\u00c3\u00ce\u0096\u00b6\u00c3\u00ec\u00b3?\u00bf\u00ca\u00fa\u00f9@\u00b6\u0003\u0085\u00e0\u00e0\u00ea\u008br\u00c3\u00c5\u00d5".length();
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
                    var4_4 = "\u00f6\u00e9^`\u0010\u00f4\u0089\u00fc\u00ecDzK\u00fa\u00cc4\u0095";
                    var5_5 = "\u00f6\u00e9^`\u0010\u00f4\u0089\u00fc\u00ecDzK\u00fa\u00cc4\u0095".length();
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
        P9.b = var6_2;
        P9.c = new Integer[12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7CFD;
        if (c[n11] == null) {
            P9.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

