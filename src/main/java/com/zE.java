/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FS;
import com.N6;
import com.cx_2;
import com.zH;
import com.zy_0;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class zE
extends zy_0 {
    private float h = 1.0f;
    private float v = 0.0f;
    private float S = 0.5f;
    private boolean O = false;
    private FS n;
    private static final long[] a;
    private static final Integer[] d;

    public void e(float f10) {
        this.h = f10;
    }

    public float r() {
        return this.h;
    }

    public void E(float f10) {
        this.v = f10;
    }

    public float Z() {
        return this.v;
    }

    public void l(float f10) {
        this.S = f10;
    }

    public float A() {
        return this.S;
    }

    public void p(boolean bl) {
        this.O = bl;
    }

    public boolean q() {
        return this.O;
    }

    public void s(FS fS2) {
        this.n = fS2;
    }

    public FS p() {
        return this.n;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        BufferedImage bufferedImage3;
        String[] stringArray;
        BufferedImage bufferedImage4;
        block22: {
            block17: {
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                int n15;
                int n16;
                int n17;
                int[] nArray;
                int[] nArray2;
                int n18;
                int n19;
                block16: {
                    int n20;
                    n19 = bufferedImage.getWidth();
                    n18 = bufferedImage.getHeight();
                    nArray2 = new int[n19];
                    nArray = new int[n19];
                    bufferedImage4 = new BufferedImage(n19, n18, 2);
                    int n21 = (int)(this.v * 3.0f * 255.0f);
                    n17 = 0;
                    stringArray = zH.U();
                    block0: while (true) {
                        int n22 = n17;
                        int n23 = n18;
                        block1: while (n22 < n23) {
                            this.Q(bufferedImage, 0, n17, n19, 1, nArray2);
                            n20 = 0;
                            if (stringArray != null) break block16;
                            for (n16 = v10205216; n16 < n19; ++n16) {
                                int n24;
                                int n25;
                                n15 = nArray2[n16];
                                n14 = n15 & zE.a(29633, 6183173100045382348L);
                                n13 = n15 >> zE.a(23059, 6772222824196184859L) & zE.a(17831, 7997452393106113708L);
                                n12 = n15 >> zE.a(28417, 6083588371148975630L) & zE.a(24142, 5604038104431664964L);
                                n11 = n15 & zE.a(24142, 5604038104431664964L);
                                n22 = n10 = n13 + n12 + n11;
                                n23 = n21;
                                if (stringArray != null) continue block1;
                                if (stringArray == null) {
                                    if (n22 < n23) {
                                        nArray2[n16] = zE.a(27702, 8558362858658671930L);
                                        if (stringArray == null) continue;
                                    }
                                    n25 = n10;
                                    n24 = 3;
                                }
                                n10 = n25 / n24;
                                nArray2[n16] = n14 | n10 << zE.a(16484, 8047441880670798186L) | n10 << zE.a(10687, 6766774595931203766L) | n10;
                                if (stringArray == null) continue;
                            }
                            this.K(bufferedImage4, 0, n17, n19, 1, nArray2);
                            ++n17;
                            if (stringArray == null) continue block0;
                        }
                        break;
                    }
                    bufferedImage4 = super.filter(bufferedImage4, null);
                    n20 = n17 = 0;
                }
                while (n17 < n18) {
                    zE zE2;
                    block18: {
                        this.Q(bufferedImage4, 0, n17, n19, 1, nArray2);
                        this.Q(bufferedImage, 0, n17, n19, 1, nArray);
                        if (stringArray != null) break block17;
                        for (n16 = 0; n16 < n19; ++n16) {
                            block21: {
                                block19: {
                                    block20: {
                                        n15 = nArray2[n16];
                                        n14 = n15 & zE.a(27702, 8558362858658671930L);
                                        n13 = n15 >> zE.a(16484, 8047441880670798186L) & zE.a(24142, 5604038104431664964L);
                                        n12 = n15 >> zE.a(10687, 6766774595931203766L) & zE.a(24142, 5604038104431664964L);
                                        n11 = n15 & zE.a(24142, 5604038104431664964L);
                                        if (stringArray != null) break block19;
                                        zE2 = this;
                                        if (stringArray != null) break block18;
                                        if (zE2.n == null) break block20;
                                        n10 = n13 + n12 + n11;
                                        n15 = this.n.k((float)n10 * this.S * 0.33333334f);
                                        if (stringArray == null) break block21;
                                    }
                                    n13 = N6.W((int)((float)n13 * this.S));
                                    n12 = N6.W((int)((float)n12 * this.S));
                                    n11 = N6.W((int)((float)n11 * this.S));
                                }
                                n15 = n14 | n13 << zE.a(16484, 8047441880670798186L) | n12 << zE.a(10687, 6766774595931203766L) | n11;
                            }
                            nArray2[n16] = n15;
                            if (stringArray == null) continue;
                        }
                        zE2 = this;
                    }
                    zE2.K(bufferedImage4, 0, n17, n19, 1, nArray2);
                    ++n17;
                    if (stringArray == null) continue;
                }
                bufferedImage3 = bufferedImage2;
                if (stringArray != null) break block22;
                if (bufferedImage3 == null) {
                    bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                }
            }
            bufferedImage3 = bufferedImage2;
        }
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        if (stringArray == null) {
            if (!this.O) {
                graphics2D.setComposite(AlphaComposite.SrcOver);
                graphics2D.drawRenderedImage(bufferedImage, null);
            }
            graphics2D.setComposite(cx_2.E(1, this.h));
            graphics2D.drawRenderedImage(bufferedImage4, null);
            graphics2D.dispose();
        }
        return bufferedImage2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1306631389922111640L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u001c\rt\u00ff\u00cf\u009e\u00b4\u00cb\u00beD=\u00d8b\u00c9\u00af#\u001f\u00b0\u0002\u0091)3X&I\u008d\n\u0010\u00a8\u00af+\u0093\u00cb\u00b1\u0019\u00dc\u00a6\u00a6\u009e\u009e\u00e2\"\u0007\u0010_R\u00b1\u00e2";
                var5_4 = "\u001c\rt\u00ff\u00cf\u009e\u00b4\u00cb\u00beD=\u00d8b\u00c9\u00af#\u001f\u00b0\u0002\u0091)3X&I\u008d\n\u0010\u00a8\u00af+\u0093\u00cb\u00b1\u0019\u00dc\u00a6\u00a6\u009e\u009e\u00e2\"\u0007\u0010_R\u00b1\u00e2".length();
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
                    var4_3 = "W\u008alv\u00c3Z\u0002T^N-\u0094v\u0091\u009d\u00a2";
                    var5_4 = "W\u008alv\u00c3Z\u0002T^N-\u0094v\u0091\u009d\u00a2".length();
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
        zE.a = var6_1;
        zE.d = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x410B;
        if (d[n11] == null) {
            zE.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

