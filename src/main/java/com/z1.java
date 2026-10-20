/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W1;
import com.zH;
import java.awt.image.BufferedImage;

public class z1
extends zH {
    private int k;
    private int w;
    private int T = 1;
    private static final long[] a;
    private static final Integer[] b;

    public z1() {
    }

    public z1(int n10, int n11, int n12) {
        this.Y(n10);
        this.l(n11);
        this.x(n12);
    }

    public void Y(int n10) {
        this.k = n10;
    }

    public int t() {
        return this.k;
    }

    public void l(int n10) {
        this.w = n10;
    }

    public int G() {
        return this.w;
    }

    public void b(int n10) {
        this.k = this.w = n10;
    }

    public int R() {
        return this.k;
    }

    public void x(int n10) {
        this.T = n10;
    }

    public int a() {
        return this.T;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block6: {
            String[] stringArray;
            int n10;
            int n11;
            block8: {
                BufferedImage bufferedImage3;
                block7: {
                    n11 = bufferedImage.getWidth();
                    n10 = bufferedImage.getHeight();
                    stringArray = zH.U();
                    bufferedImage3 = bufferedImage2;
                    if (stringArray != null) break block7;
                    if (bufferedImage3 != null) break block8;
                    bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
                }
                bufferedImage2 = bufferedImage3;
            }
            int[] nArray = new int[n11 * n10];
            int[] nArray2 = new int[n11 * n10];
            this.Q(bufferedImage, 0, 0, n11, n10, nArray);
            for (int i2 = 0; i2 < this.T; ++i2) {
                z1.f(nArray, nArray2, n11, n10, this.k);
                z1.f(nArray2, nArray, n10, n11, this.w);
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block6;
            }
            this.K(bufferedImage2, 0, 0, n11, n10, nArray);
        }
        return bufferedImage2;
    }

    public static void f(int[] nArray, int[] nArray2, int n10, int n11, int n12) {
        int n13;
        String[] stringArray;
        int[] nArray3;
        int n14;
        block11: {
            n14 = n10 - 1;
            int n15 = 2 * n12 + 1;
            nArray3 = new int[z1.a(9621, 4722121071187177455L) * n15];
            stringArray = zH.U();
            for (n13 = 0; n13 < z1.a(2242, 9130586610204312254L) * n15; ++n13) {
                nArray3[n13] = n13 / n15;
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block11;
            }
            n13 = 0;
        }
        for (int i2 = 0; i2 < n11; ++i2) {
            int n16;
            int n17;
            block13: {
                int n18;
                int n19;
                int n20;
                int n21;
                int n22;
                int n23;
                block12: {
                    int n24 = i2;
                    n23 = 0;
                    n22 = 0;
                    n21 = 0;
                    n20 = 0;
                    for (n19 = -n12; n19 <= n12; ++n19) {
                        n18 = nArray[n13 + W1.M(n19, 0, n10 - 1)];
                        n23 += n18 >> z1.a(4994, 7848603824047200763L) & z1.a(17793, 5600491412542312436L);
                        n22 += n18 >> z1.a(18569, 5762793078058271479L) & z1.a(14643, 4750109682705937223L);
                        n21 += n18 >> z1.a(8209, 4207314697483397742L) & z1.a(14643, 4750109682705937223L);
                        n20 += n18 & z1.a(14643, 4750109682705937223L);
                        if (stringArray == null) {
                            if (stringArray == null) continue;
                        }
                        break block12;
                    }
                    n19 = 0;
                }
                while (n19 < n10) {
                    nArray2[n24] = nArray3[n23] << z1.a(1822, 6355398124496719203L) | nArray3[n22] << z1.a(12667, 2395567619170220812L) | nArray3[n21] << z1.a(23584, 208357688667330136L) | nArray3[n20];
                    n17 = n18 = n19 + n12 + 1;
                    n16 = n14;
                    if (stringArray == null) {
                        int n25;
                        int n26;
                        int n27;
                        if (stringArray == null) {
                            if (n17 > n16) {
                                n18 = n14;
                            }
                            n27 = n19;
                            n26 = n12;
                        }
                        int n28 = n25 = n27 - n26;
                        if (stringArray == null) {
                            if (n28 < 0) {
                                n25 = 0;
                            }
                            n28 = nArray[n13 + n18];
                        }
                        void var19_19 = n28;
                        int n29 = nArray[n13 + n25];
                        n23 += (var19_19 >> z1.a(1822, 6355398124496719203L) & z1.a(14643, 4750109682705937223L)) - (n29 >> z1.a(1822, 6355398124496719203L) & z1.a(14643, 4750109682705937223L));
                        n22 += (var19_19 & z1.a(8770, 2694386035190835257L)) - (n29 & z1.a(23963, 8255283038259206120L)) >> z1.a(12667, 2395567619170220812L);
                        n21 += (var19_19 & z1.a(19058, 7217039634520621060L)) - (n29 & z1.a(25204, 6463050569279105030L)) >> z1.a(23584, 208357688667330136L);
                        n20 += (var19_19 & z1.a(14643, 4750109682705937223L)) - (n29 & z1.a(14643, 4750109682705937223L));
                        n24 += n11;
                        ++n19;
                        if (stringArray == null) continue;
                    }
                    break block13;
                }
                n17 = n13;
                n16 = n10;
            }
            n13 = n17 + n16;
            if (stringArray == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4595265328061805451L;
                var6_1 = new long[14];
                var3_2 = 0;
                var4_3 = "\u0005t\u00f2)\u0006\r\u00d9\u00ed\u00e2\u0093>K\u008ct\u00b1l\u001e\u000b\u001cs\u0017\u0005~\u00f0n\u00caH\u0006s\u00e0p5\u00ee\u001e\u00d7{\u00c4g[\u00b2w\u0006'\u00c0}\u00b5]d:q\u00f7\u00a54\u00d1\u00eah\u000fd6\u00f4\u00d4\u00f6%\u00db\u00bc\ti\t\u00a7\u00dbH\u0097\u00fe++jvNL\u008f\u00bdK:\u00caK\u00ff<\u0080K\u00c7\u00af\u0002\u00ce\u001e@3";
                var5_4 = "\u0005t\u00f2)\u0006\r\u00d9\u00ed\u00e2\u0093>K\u008ct\u00b1l\u001e\u000b\u001cs\u0017\u0005~\u00f0n\u00caH\u0006s\u00e0p5\u00ee\u001e\u00d7{\u00c4g[\u00b2w\u0006'\u00c0}\u00b5]d:q\u00f7\u00a54\u00d1\u00eah\u000fd6\u00f4\u00d4\u00f6%\u00db\u00bc\ti\t\u00a7\u00dbH\u0097\u00fe++jvNL\u008f\u00bdK:\u00caK\u00ff<\u0080K\u00c7\u00af\u0002\u00ce\u001e@3".length();
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
                    var4_3 = "\u0088\u00d8I\u00c3@\u008a\u00a4c&\u000b-3\u0014\u008ed\u008d";
                    var5_4 = "\u0088\u00d8I\u00c3@\u008a\u00a4c&\u000b-3\u0014\u008ed\u008d".length();
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
        z1.a = var6_1;
        z1.b = new Integer[14];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xA7F;
        if (b[n11] == null) {
            z1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

