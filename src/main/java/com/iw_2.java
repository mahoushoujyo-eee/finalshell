/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Color;
import java.util.Random;

/*
 * Renamed from com.iw
 */
public class iw_2 {
    private static Random j;
    private static final float[] G;
    private static final float[] Z;
    private static final long[] a;
    private static final Integer[] b;

    public static int e(int n10) {
        String[] stringArray = W5.q();
        int n11 = n10;
        if (stringArray != null) {
            if (n11 < 0) {
                return 0;
            }
            n11 = n10;
        }
        if (stringArray != null) {
            if (n11 > iw_2.a(14307, 4846701457283360350L)) {
                return iw_2.a(14307, 4846701457283360350L);
            }
            n11 = n10;
        }
        return n11;
    }

    public static int h(int n10, int n11, float f10) {
        return iw_2.e((int)((float)n10 + f10 * (float)(n11 - n10)));
    }

    public static int g(int n10) {
        int n11 = n10 >> iw_2.a(7715, 8804303839714414495L) & iw_2.a(14307, 4846701457283360350L);
        int n12 = n10 >> iw_2.a(18729, 7050251373656070288L) & iw_2.a(14307, 4846701457283360350L);
        int n13 = n10 & iw_2.a(14307, 4846701457283360350L);
        return (n11 + n12 + n13) / 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean k(int n10, int n11, int n12) {
        int n13 = n10 >> iw_2.a(7715, 8804303839714414495L) & iw_2.a(14307, 4846701457283360350L);
        int n14 = n10 >> iw_2.a(18729, 7050251373656070288L) & iw_2.a(14307, 4846701457283360350L);
        int n15 = n10 & iw_2.a(14307, 4846701457283360350L);
        String[] stringArray = W5.q();
        int n16 = n11 >> iw_2.a(7715, 8804303839714414495L) & iw_2.a(14307, 4846701457283360350L);
        int n17 = n11 >> iw_2.a(18729, 7050251373656070288L) & iw_2.a(14307, 4846701457283360350L);
        int n18 = n11 & iw_2.a(14307, 4846701457283360350L);
        int n19 = Math.abs(n13 - n16);
        int n20 = n12;
        if (stringArray != null) {
            if (n19 > n20) return 0 != 0;
            n19 = Math.abs(n14 - n17);
            n20 = n12;
        }
        if (stringArray != null) {
            if (n19 > n20) return 0 != 0;
            n19 = Math.abs(n15 - n18);
            if (stringArray == null) return n19 != 0;
            n20 = n12;
        }
        if (n19 > n20) return 0 != 0;
        return 1 != 0;
    }

    public static int P(int n10, int n11, int n12) {
        return iw_2.k(n10, n11, n12, iw_2.a(14307, 4846701457283360350L));
    }

    public static int C(int n10, int n11, int n12, int n13, int n14) {
        return n11 & ~n14 | iw_2.k(n10 & n14, n11, n12, n13);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int k(int n10, int n11, int n12, int n13) {
        int n14;
        int n15;
        block36: {
            int n16;
            int n17;
            int n18;
            int n19;
            block37: {
                int n20;
                int n21;
                int n22;
                int n23;
                int n24;
                int n25;
                block34: {
                    int n26;
                    block35: {
                        String[] stringArray;
                        block33: {
                            block32: {
                                stringArray = W5.q();
                                int n27 = n12;
                                if (stringArray != null) {
                                    if (n27 == 0) {
                                        return n10;
                                    }
                                    n27 = n10 >> iw_2.a(9957, 7743417918229100379L) & iw_2.a(28695, 8598715152498876840L);
                                }
                                n19 = n27;
                                n18 = n10 >> iw_2.a(31874, 8708818097337920826L) & iw_2.a(14307, 4846701457283360350L);
                                n17 = n10 >> iw_2.a(24587, 498171304907665840L) & iw_2.a(14307, 4846701457283360350L);
                                n16 = n10 & iw_2.a(14307, 4846701457283360350L);
                                n26 = n11 >> iw_2.a(3903, 7630036680522735237L) & iw_2.a(14307, 4846701457283360350L);
                                n25 = n11 >> iw_2.a(7715, 8804303839714414495L) & iw_2.a(14307, 4846701457283360350L);
                                n24 = n11 >> iw_2.a(18729, 7050251373656070288L) & iw_2.a(14307, 4846701457283360350L);
                                n23 = n11 & iw_2.a(14307, 4846701457283360350L);
                                n22 = n12;
                                if (stringArray == null) break block32;
                                switch (n22) {
                                    case 1: {
                                        if (stringArray != null) break;
                                    }
                                    case 2: {
                                        n18 = Math.min(n18, n25);
                                        n17 = Math.min(n17, n24);
                                        n16 = Math.min(n16, n23);
                                        if (stringArray != null) break;
                                    }
                                    case 3: {
                                        n18 = Math.max(n18, n25);
                                        n17 = Math.max(n17, n24);
                                        n16 = Math.max(n16, n23);
                                        if (stringArray != null) break;
                                    }
                                    case 4: {
                                        n18 = iw_2.e(n18 + n25);
                                        n17 = iw_2.e(n17 + n24);
                                        n16 = iw_2.e(n16 + n23);
                                        if (stringArray != null) break;
                                    }
                                    case 5: {
                                        n18 = iw_2.e(n25 - n18);
                                        n17 = iw_2.e(n24 - n17);
                                        n16 = iw_2.e(n23 - n16);
                                        if (stringArray != null) break;
                                    }
                                    case 6: {
                                        n18 = iw_2.e(Math.abs(n18 - n25));
                                        n17 = iw_2.e(Math.abs(n17 - n24));
                                        n16 = iw_2.e(Math.abs(n16 - n23));
                                        if (stringArray != null) break;
                                    }
                                    case 7: {
                                        n18 = iw_2.e(n18 * n25 / iw_2.a(14307, 4846701457283360350L));
                                        n17 = iw_2.e(n17 * n24 / iw_2.a(14307, 4846701457283360350L));
                                        n16 = iw_2.e(n16 * n23 / iw_2.a(14307, 4846701457283360350L));
                                        if (stringArray != null) break;
                                    }
                                    case 17: {
                                        n22 = j.nextInt() & iw_2.a(14307, 4846701457283360350L);
                                        n21 = n19;
                                        if (stringArray != null) {
                                            if (n22 > n21) break;
                                            n18 = n25;
                                            n17 = n24;
                                            n16 = n23;
                                            if (stringArray != null) break;
                                        }
                                        break block33;
                                    }
                                    case 13: {
                                        n18 = (n18 + n25) / 2;
                                        n17 = (n17 + n24) / 2;
                                        n16 = (n16 + n23) / 2;
                                        if (stringArray != null) break;
                                    }
                                    case 8: 
                                    case 9: 
                                    case 10: 
                                    case 11: {
                                        Color.RGBtoHSB(n18, n17, n16, G);
                                        Color.RGBtoHSB(n25, n24, n23, Z);
                                        int n28 = n12;
                                        if (stringArray != null) {
                                            switch (n28) {
                                                case 8: {
                                                    iw_2.Z[0] = G[0];
                                                    if (stringArray != null) break;
                                                }
                                                case 9: {
                                                    iw_2.Z[1] = G[1];
                                                    if (stringArray != null) break;
                                                }
                                                case 10: {
                                                    iw_2.Z[2] = G[2];
                                                    if (stringArray != null) break;
                                                }
                                                case 11: {
                                                    iw_2.Z[0] = G[0];
                                                    iw_2.Z[1] = G[1];
                                                    break;
                                                }
                                            }
                                            n10 = Color.HSBtoRGB(Z[0], Z[1], Z[2]);
                                            n18 = n10 >> iw_2.a(7715, 8804303839714414495L) & iw_2.a(14307, 4846701457283360350L);
                                            n17 = n10 >> iw_2.a(18729, 7050251373656070288L) & iw_2.a(14307, 4846701457283360350L);
                                            n28 = n16 = n10 & iw_2.a(14307, 4846701457283360350L);
                                        }
                                        if (stringArray != null) break;
                                    }
                                    case 12: {
                                        n18 = iw_2.a(14307, 4846701457283360350L) - (iw_2.a(14307, 4846701457283360350L) - n18) * (iw_2.a(14307, 4846701457283360350L) - n25) / iw_2.a(14307, 4846701457283360350L);
                                        n17 = iw_2.a(14307, 4846701457283360350L) - (iw_2.a(14307, 4846701457283360350L) - n17) * (iw_2.a(14307, 4846701457283360350L) - n24) / iw_2.a(14307, 4846701457283360350L);
                                        n16 = iw_2.a(14307, 4846701457283360350L) - (iw_2.a(14307, 4846701457283360350L) - n16) * (iw_2.a(14307, 4846701457283360350L) - n23) / iw_2.a(14307, 4846701457283360350L);
                                        if (stringArray != null) break;
                                    }
                                    case 14: {
                                        int n29 = iw_2.a(14307, 4846701457283360350L) - (iw_2.a(14307, 4846701457283360350L) - n18) * (iw_2.a(14307, 4846701457283360350L) - n25) / iw_2.a(14307, 4846701457283360350L);
                                        n20 = n18 * n25 / iw_2.a(14307, 4846701457283360350L);
                                        n18 = (n29 * n18 + n20 * (iw_2.a(14307, 4846701457283360350L) - n18)) / iw_2.a(14307, 4846701457283360350L);
                                        n29 = iw_2.a(14307, 4846701457283360350L) - (iw_2.a(14307, 4846701457283360350L) - n17) * (iw_2.a(14307, 4846701457283360350L) - n24) / iw_2.a(14307, 4846701457283360350L);
                                        n20 = n17 * n24 / iw_2.a(14307, 4846701457283360350L);
                                        n17 = (n29 * n17 + n20 * (iw_2.a(14307, 4846701457283360350L) - n17)) / iw_2.a(14307, 4846701457283360350L);
                                        n29 = iw_2.a(14307, 4846701457283360350L) - (iw_2.a(14307, 4846701457283360350L) - n16) * (iw_2.a(14307, 4846701457283360350L) - n23) / iw_2.a(14307, 4846701457283360350L);
                                        n20 = n16 * n23 / iw_2.a(14307, 4846701457283360350L);
                                        n16 = (n29 * n16 + n20 * (iw_2.a(14307, 4846701457283360350L) - n16)) / iw_2.a(14307, 4846701457283360350L);
                                        if (stringArray != null) break;
                                    }
                                    case 15: {
                                        n17 = n16 = iw_2.a(14307, 4846701457283360350L);
                                        n18 = n16;
                                        if (stringArray != null) break;
                                    }
                                    case 18: {
                                        n18 = iw_2.e(n25 * n19 / iw_2.a(14307, 4846701457283360350L));
                                        n17 = iw_2.e(n24 * n19 / iw_2.a(14307, 4846701457283360350L));
                                        n16 = iw_2.e(n23 * n19 / iw_2.a(14307, 4846701457283360350L));
                                        n19 = iw_2.e(n26 * n19 / iw_2.a(14307, 4846701457283360350L));
                                        return n19 << iw_2.a(3903, 7630036680522735237L) | n18 << iw_2.a(7715, 8804303839714414495L) | n17 << iw_2.a(18729, 7050251373656070288L) | n16;
                                    }
                                    case 19: {
                                        n19 = n19 * n26 / iw_2.a(14307, 4846701457283360350L);
                                        return n19 << iw_2.a(3903, 7630036680522735237L) | n25 << iw_2.a(7715, 8804303839714414495L) | n24 << iw_2.a(18729, 7050251373656070288L) | n23;
                                    }
                                    case 20: {
                                        int n30 = iw_2.a(14307, 4846701457283360350L) - n19;
                                        return n19 << iw_2.a(3903, 7630036680522735237L) | n30 << iw_2.a(7715, 8804303839714414495L) | n30 << iw_2.a(18729, 7050251373656070288L) | n30;
                                    }
                                }
                                n22 = n13;
                            }
                            n21 = iw_2.a(14307, 4846701457283360350L);
                        }
                        if (stringArray == null) break block34;
                        if (n22 != n21) break block35;
                        n15 = n19;
                        n14 = iw_2.a(14307, 4846701457283360350L);
                        if (stringArray == null) break block36;
                        if (n15 == n14) break block37;
                    }
                    n19 = n19 * n13 / iw_2.a(14307, 4846701457283360350L);
                    n22 = (iw_2.a(14307, 4846701457283360350L) - n19) * n26;
                    n21 = iw_2.a(14307, 4846701457283360350L);
                }
                n20 = n22 / n21;
                n18 = iw_2.e((n18 * n19 + n25 * n20) / iw_2.a(14307, 4846701457283360350L));
                n17 = iw_2.e((n17 * n19 + n24 * n20) / iw_2.a(14307, 4846701457283360350L));
                n16 = iw_2.e((n16 * n19 + n23 * n20) / iw_2.a(14307, 4846701457283360350L));
                n19 = iw_2.e(n19 + n20);
            }
            n15 = n19 << iw_2.a(3903, 7630036680522735237L) | n18 << iw_2.a(7715, 8804303839714414495L) | n17 << iw_2.a(18729, 7050251373656070288L);
            n14 = n16;
        }
        return n15 | n14;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2466185119551452465L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u0099\u0002\u00f1NSg\u0084\u0089U:#\u0010\u00ac\u00f5\u00eb\u00ac\u00d2\u00bb\u00ef\u00db\u00fe\u00cd-\u00a9\u00bc\u00eb\u0016\u0014\u00d0f\u0018\u001bN\u0016^\u000fLA\u0014f\u00a1\u0001\u009a\u00ec:GBr";
                var5_4 = "\u0099\u0002\u00f1NSg\u0084\u0089U:#\u0010\u00ac\u00f5\u00eb\u00ac\u00d2\u00bb\u00ef\u00db\u00fe\u00cd-\u00a9\u00bc\u00eb\u0016\u0014\u00d0f\u0018\u001bN\u0016^\u000fLA\u0014f\u00a1\u0001\u009a\u00ec:GBr".length();
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
                    var4_3 = "\u00da\u0088\u00b4\u00fa$\u0089\u00d3\u0090)\u00ab\u008a\u00c2-\u00fe\u00fa\u00be";
                    var5_4 = "\u00da\u0088\u00b4\u00fa$\u0089\u00d3\u0090)\u00ab\u008a\u00c2-\u00fe\u00fa\u00be".length();
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
        iw_2.a = var6_1;
        iw_2.b = new Integer[8];
        iw_2.j = new Random();
        iw_2.G = new float[3];
        iw_2.Z = new float[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x11BB;
        if (b[n11] == null) {
            iw_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

