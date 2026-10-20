/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gw_0;
import com.zH;
import java.awt.Color;

public final class N6 {
    private static final float[] F;
    private static final float[] K;
    private static final long[] a;
    private static final Integer[] b;

    public static int W(int n10) {
        String[] stringArray = zH.U();
        int n11 = n10;
        if (stringArray == null) {
            if (n11 < 0) {
                return 0;
            }
            n11 = n10;
        }
        if (stringArray == null) {
            if (n11 > N6.a(11824, 8426776992224049655L)) {
                return N6.a(11824, 8426776992224049655L);
            }
            n11 = n10;
        }
        return n11;
    }

    public static int v(int n10, int n11, float f10) {
        return N6.W((int)((float)n10 + f10 * (float)(n11 - n10)));
    }

    public static int D(int n10) {
        int n11 = n10 >> N6.a(27361, 2333081108960394532L) & N6.a(11824, 8426776992224049655L);
        int n12 = n10 >> N6.a(23798, 4046984552660798261L) & N6.a(11824, 8426776992224049655L);
        int n13 = n10 & N6.a(11824, 8426776992224049655L);
        return (n11 + n12 + n13) / 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean U(int n10, int n11, int n12) {
        int n13 = n10 >> N6.a(20295, 1116493213620639879L) & N6.a(11824, 8426776992224049655L);
        int n14 = n10 >> N6.a(11194, 1137099505876434043L) & N6.a(11824, 8426776992224049655L);
        String[] stringArray = zH.U();
        int n15 = n10 & N6.a(11824, 8426776992224049655L);
        int n16 = n11 >> N6.a(27361, 2333081108960394532L) & N6.a(11824, 8426776992224049655L);
        int n17 = n11 >> N6.a(23798, 4046984552660798261L) & N6.a(11824, 8426776992224049655L);
        int n18 = n11 & N6.a(11824, 8426776992224049655L);
        int n19 = Math.abs(n13 - n16);
        int n20 = n12;
        if (stringArray == null) {
            if (n19 > n20) return 0 != 0;
            n19 = Math.abs(n14 - n17);
            n20 = n12;
        }
        if (stringArray == null) {
            if (n19 > n20) return 0 != 0;
            n19 = Math.abs(n15 - n18);
            if (stringArray != null) return n19 != 0;
            n20 = n12;
        }
        if (n19 > n20) return 0 != 0;
        return 1 != 0;
    }

    public static int X(int n10, int n11, int n12) {
        return N6.S(n10, n11, n12, N6.a(17556, 6933225212292895568L));
    }

    public static int m(int n10, int n11, int n12, int n13, int n14) {
        return n11 & ~n14 | N6.S(n10 & n14, n11, n12, n13);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int S(int n10, int n11, int n12, int n13) {
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
                                stringArray = zH.U();
                                int n27 = n12;
                                if (stringArray == null) {
                                    if (n27 == 0) {
                                        return n10;
                                    }
                                    n27 = n10 >> N6.a(31103, 2280231343804296893L) & N6.a(11824, 8426776992224049655L);
                                }
                                n19 = n27;
                                n18 = n10 >> N6.a(27361, 2333081108960394532L) & N6.a(11824, 8426776992224049655L);
                                n17 = n10 >> N6.a(23798, 4046984552660798261L) & N6.a(11824, 8426776992224049655L);
                                n16 = n10 & N6.a(11824, 8426776992224049655L);
                                n26 = n11 >> N6.a(17181, 6831033859364590811L) & N6.a(11824, 8426776992224049655L);
                                n25 = n11 >> N6.a(27361, 2333081108960394532L) & N6.a(11824, 8426776992224049655L);
                                n24 = n11 >> N6.a(23798, 4046984552660798261L) & N6.a(11824, 8426776992224049655L);
                                n23 = n11 & N6.a(11824, 8426776992224049655L);
                                n22 = n12;
                                if (stringArray != null) break block32;
                                switch (n22) {
                                    case 1: {
                                        if (stringArray == null) break;
                                    }
                                    case 2: {
                                        n18 = Math.min(n18, n25);
                                        n17 = Math.min(n17, n24);
                                        n16 = Math.min(n16, n23);
                                        if (stringArray == null) break;
                                    }
                                    case 3: {
                                        n18 = Math.max(n18, n25);
                                        n17 = Math.max(n17, n24);
                                        n16 = Math.max(n16, n23);
                                        if (stringArray == null) break;
                                    }
                                    case 4: {
                                        n18 = N6.W(n18 + n25);
                                        n17 = N6.W(n17 + n24);
                                        n16 = N6.W(n16 + n23);
                                        if (stringArray == null) break;
                                    }
                                    case 5: {
                                        n18 = N6.W(n25 - n18);
                                        n17 = N6.W(n24 - n17);
                                        n16 = N6.W(n23 - n16);
                                        if (stringArray == null) break;
                                    }
                                    case 6: {
                                        n18 = N6.W(Math.abs(n18 - n25));
                                        n17 = N6.W(Math.abs(n17 - n24));
                                        n16 = N6.W(Math.abs(n16 - n23));
                                        if (stringArray == null) break;
                                    }
                                    case 7: {
                                        n18 = N6.W(n18 * n25 / N6.a(11824, 8426776992224049655L));
                                        n17 = N6.W(n17 * n24 / N6.a(11824, 8426776992224049655L));
                                        n16 = N6.W(n16 * n23 / N6.a(11824, 8426776992224049655L));
                                        if (stringArray == null) break;
                                    }
                                    case 17: {
                                        n22 = gw_0.U() & N6.a(11824, 8426776992224049655L);
                                        n21 = n19;
                                        if (stringArray == null) {
                                            if (n22 > n21) break;
                                            n18 = n25;
                                            n17 = n24;
                                            n16 = n23;
                                            if (stringArray == null) break;
                                        }
                                        break block33;
                                    }
                                    case 13: {
                                        n18 = (n18 + n25) / 2;
                                        n17 = (n17 + n24) / 2;
                                        n16 = (n16 + n23) / 2;
                                        if (stringArray == null) break;
                                    }
                                    case 8: 
                                    case 9: 
                                    case 10: 
                                    case 11: {
                                        Color.RGBtoHSB(n18, n17, n16, F);
                                        Color.RGBtoHSB(n25, n24, n23, K);
                                        int n28 = n12;
                                        if (stringArray == null) {
                                            switch (n28) {
                                                case 8: {
                                                    N6.K[0] = F[0];
                                                    if (stringArray == null) break;
                                                }
                                                case 9: {
                                                    N6.K[1] = F[1];
                                                    if (stringArray == null) break;
                                                }
                                                case 10: {
                                                    N6.K[2] = F[2];
                                                    if (stringArray == null) break;
                                                }
                                                case 11: {
                                                    N6.K[0] = F[0];
                                                    N6.K[1] = F[1];
                                                    break;
                                                }
                                            }
                                            n10 = Color.HSBtoRGB(K[0], K[1], K[2]);
                                            n18 = n10 >> N6.a(27361, 2333081108960394532L) & N6.a(11824, 8426776992224049655L);
                                            n17 = n10 >> N6.a(23798, 4046984552660798261L) & N6.a(11824, 8426776992224049655L);
                                            n28 = n16 = n10 & N6.a(11824, 8426776992224049655L);
                                        }
                                        if (stringArray == null) break;
                                    }
                                    case 12: {
                                        n18 = N6.a(11824, 8426776992224049655L) - (N6.a(11824, 8426776992224049655L) - n18) * (N6.a(11824, 8426776992224049655L) - n25) / N6.a(11824, 8426776992224049655L);
                                        n17 = N6.a(11824, 8426776992224049655L) - (N6.a(11824, 8426776992224049655L) - n17) * (N6.a(11824, 8426776992224049655L) - n24) / N6.a(11824, 8426776992224049655L);
                                        n16 = N6.a(11824, 8426776992224049655L) - (N6.a(11824, 8426776992224049655L) - n16) * (N6.a(11824, 8426776992224049655L) - n23) / N6.a(11824, 8426776992224049655L);
                                        if (stringArray == null) break;
                                    }
                                    case 14: {
                                        int n29 = N6.a(11824, 8426776992224049655L) - (N6.a(11824, 8426776992224049655L) - n18) * (N6.a(11824, 8426776992224049655L) - n25) / N6.a(11824, 8426776992224049655L);
                                        n20 = n18 * n25 / N6.a(11824, 8426776992224049655L);
                                        n18 = (n29 * n18 + n20 * (N6.a(11824, 8426776992224049655L) - n18)) / N6.a(11824, 8426776992224049655L);
                                        n29 = N6.a(11824, 8426776992224049655L) - (N6.a(11824, 8426776992224049655L) - n17) * (N6.a(11824, 8426776992224049655L) - n24) / N6.a(11824, 8426776992224049655L);
                                        n20 = n17 * n24 / N6.a(11824, 8426776992224049655L);
                                        n17 = (n29 * n17 + n20 * (N6.a(11824, 8426776992224049655L) - n17)) / N6.a(11824, 8426776992224049655L);
                                        n29 = N6.a(11824, 8426776992224049655L) - (N6.a(11824, 8426776992224049655L) - n16) * (N6.a(11824, 8426776992224049655L) - n23) / N6.a(11824, 8426776992224049655L);
                                        n20 = n16 * n23 / N6.a(11824, 8426776992224049655L);
                                        n16 = (n29 * n16 + n20 * (N6.a(11824, 8426776992224049655L) - n16)) / N6.a(11824, 8426776992224049655L);
                                        if (stringArray == null) break;
                                    }
                                    case 15: {
                                        n17 = n16 = N6.a(11824, 8426776992224049655L);
                                        n18 = n16;
                                        if (stringArray == null) break;
                                    }
                                    case 18: {
                                        n18 = N6.W(n25 * n19 / N6.a(11824, 8426776992224049655L));
                                        n17 = N6.W(n24 * n19 / N6.a(11824, 8426776992224049655L));
                                        n16 = N6.W(n23 * n19 / N6.a(11824, 8426776992224049655L));
                                        n19 = N6.W(n26 * n19 / N6.a(11824, 8426776992224049655L));
                                        return n19 << N6.a(17181, 6831033859364590811L) | n18 << N6.a(27361, 2333081108960394532L) | n17 << N6.a(23798, 4046984552660798261L) | n16;
                                    }
                                    case 19: {
                                        n19 = n19 * n26 / N6.a(11824, 8426776992224049655L);
                                        return n19 << N6.a(17181, 6831033859364590811L) | n25 << N6.a(27361, 2333081108960394532L) | n24 << N6.a(23798, 4046984552660798261L) | n23;
                                    }
                                    case 20: {
                                        int n30 = N6.a(11824, 8426776992224049655L) - n19;
                                        return n19 << N6.a(17181, 6831033859364590811L) | n30 << N6.a(27361, 2333081108960394532L) | n30 << N6.a(23798, 4046984552660798261L) | n30;
                                    }
                                }
                                n22 = n13;
                            }
                            n21 = N6.a(11824, 8426776992224049655L);
                        }
                        if (stringArray != null) break block34;
                        if (n22 != n21) break block35;
                        n15 = n19;
                        n14 = N6.a(11824, 8426776992224049655L);
                        if (stringArray != null) break block36;
                        if (n15 == n14) break block37;
                    }
                    n19 = n19 * n13 / N6.a(11824, 8426776992224049655L);
                    n22 = (N6.a(11824, 8426776992224049655L) - n19) * n26;
                    n21 = N6.a(11824, 8426776992224049655L);
                }
                n20 = n22 / n21;
                n18 = N6.W((n18 * n19 + n25 * n20) / N6.a(11824, 8426776992224049655L));
                n17 = N6.W((n17 * n19 + n24 * n20) / N6.a(11824, 8426776992224049655L));
                n16 = N6.W((n16 * n19 + n23 * n20) / N6.a(11824, 8426776992224049655L));
                n19 = N6.W(n19 + n20);
            }
            n15 = n19 << N6.a(17181, 6831033859364590811L) | n18 << N6.a(27361, 2333081108960394532L) | n17 << N6.a(23798, 4046984552660798261L);
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
                var0 = 9132667006397630653L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "-\u00b6}\u00b1\u00a6\u00c2\u00db\u0012E\u0081N\u00b1+\u0080\u00f5\u0089\u0090,\u00bcJ,U\\~\u001d\u00ed)\u00f6f\u00b01\u00b5(\u008f{{\u00ef\u00bc\u00d0*\u0017\u00eb\u00bej\u00baK\u00b4\u00ce";
                var5_4 = "-\u00b6}\u00b1\u00a6\u00c2\u00db\u0012E\u0081N\u00b1+\u0080\u00f5\u0089\u0090,\u00bcJ,U\\~\u001d\u00ed)\u00f6f\u00b01\u00b5(\u008f{{\u00ef\u00bc\u00d0*\u0017\u00eb\u00bej\u00baK\u00b4\u00ce".length();
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
                    var4_3 = "6\u00bf\u0014.\u0015hf\u0018\u00d0\u00a9\u00df\u0013 \u0095\u00c3\u0080";
                    var5_4 = "6\u00bf\u0014.\u0015hf\u0018\u00d0\u00a9\u00df\u0013 \u0095\u00c3\u0080".length();
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
        N6.a = var6_1;
        N6.b = new Integer[8];
        N6.F = new float[3];
        N6.K = new float[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x57C4;
        if (b[n11] == null) {
            N6.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

