/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hh_2;
import com.iw_2;
import com.po_0;
import com.xe_1;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.hV
 */
public class hv_1
extends hh_2 {
    private float x = 1.0f;
    private float Q = 0.0f;
    private float w = 0.5f;
    private boolean P = false;
    private po_0 p;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    public void e(float f10) {
        this.x = f10;
    }

    public float E() {
        return this.x;
    }

    public void I(float f10) {
        this.Q = f10;
    }

    public float D() {
        return this.Q;
    }

    public void J(float f10) {
        this.w = f10;
    }

    public float b() {
        return this.w;
    }

    public void a(boolean bl) {
        this.P = bl;
    }

    public boolean w() {
        return this.P;
    }

    public void e(po_0 po_02) {
        this.p = po_02;
    }

    public po_0 w() {
        return this.p;
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
                    stringArray = W5.q();
                    int n21 = (int)(this.Q * 3.0f * 255.0f);
                    n17 = 0;
                    block0: while (true) {
                        int n22 = n17;
                        int n23 = n18;
                        block1: while (n22 < n23) {
                            this.l(bufferedImage, 0, n17, n19, 1, nArray2);
                            n20 = 0;
                            if (stringArray == null) break block16;
                            for (n16 = v8032842; n16 < n19; ++n16) {
                                int n24;
                                int n25;
                                n15 = nArray2[n16];
                                n14 = n15 & hv_1.a(25618, 376134130040632741L);
                                n13 = n15 >> hv_1.a(20612, 1918919174425198900L) & hv_1.a(2609, 5508313382336502656L);
                                n12 = n15 >> hv_1.a(14976, 8867472818924530486L) & hv_1.a(6981, 6732780024161209078L);
                                n11 = n15 & hv_1.a(6981, 6732780024161209078L);
                                n22 = n10 = n13 + n12 + n11;
                                n23 = n21;
                                if (stringArray == null) continue block1;
                                if (stringArray != null) {
                                    if (n22 < n23) {
                                        nArray2[n16] = hv_1.a(23550, 6641658860886411850L);
                                        if (stringArray != null) continue;
                                    }
                                    n25 = n10;
                                    n24 = 3;
                                }
                                n10 = n25 / n24;
                                nArray2[n16] = n14 | n10 << hv_1.a(6429, 8771086268329134255L) | n10 << hv_1.a(17725, 8495376346299847816L) | n10;
                                if (stringArray != null) continue;
                            }
                            this.E(bufferedImage4, 0, n17, n19, 1, nArray2);
                            ++n17;
                            if (stringArray != null) continue block0;
                        }
                        break;
                    }
                    bufferedImage4 = super.filter(bufferedImage4, null);
                    n20 = n17 = 0;
                }
                while (n17 < n18) {
                    hv_1 hv_12;
                    block18: {
                        this.l(bufferedImage4, 0, n17, n19, 1, nArray2);
                        this.l(bufferedImage, 0, n17, n19, 1, nArray);
                        if (stringArray == null) break block17;
                        for (n16 = 0; n16 < n19; ++n16) {
                            block21: {
                                block19: {
                                    block20: {
                                        n15 = nArray2[n16];
                                        n14 = n15 & hv_1.a(23550, 6641658860886411850L);
                                        n13 = n15 >> hv_1.a(6429, 8771086268329134255L) & hv_1.a(6981, 6732780024161209078L);
                                        n12 = n15 >> hv_1.a(17725, 8495376346299847816L) & hv_1.a(6981, 6732780024161209078L);
                                        n11 = n15 & hv_1.a(6981, 6732780024161209078L);
                                        if (stringArray == null) break block19;
                                        hv_12 = this;
                                        if (stringArray == null) break block18;
                                        if (hv_12.p == null) break block20;
                                        n10 = n13 + n12 + n11;
                                        n15 = this.p.D((float)n10 * this.w * 0.33333334f);
                                        if (stringArray != null) break block21;
                                    }
                                    n13 = iw_2.e((int)((float)n13 * this.w));
                                    n12 = iw_2.e((int)((float)n12 * this.w));
                                    n11 = iw_2.e((int)((float)n11 * this.w));
                                }
                                n15 = n14 | n13 << hv_1.a(6429, 8771086268329134255L) | n12 << hv_1.a(17725, 8495376346299847816L) | n11;
                            }
                            nArray2[n16] = n15;
                            if (stringArray != null) continue;
                        }
                        hv_12 = this;
                    }
                    hv_12.E(bufferedImage4, 0, n17, n19, 1, nArray2);
                    ++n17;
                    if (stringArray != null) continue;
                }
                bufferedImage3 = bufferedImage2;
                if (stringArray == null) break block22;
                if (bufferedImage3 == null) {
                    bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                }
            }
            bufferedImage3 = bufferedImage2;
        }
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        if (stringArray != null) {
            if (!this.P) {
                graphics2D.setComposite(AlphaComposite.SrcOver);
                graphics2D.drawRenderedImage(bufferedImage, null);
            }
            graphics2D.setComposite(xe_1.o(1, this.x));
            graphics2D.drawRenderedImage(bufferedImage4, null);
            graphics2D.dispose();
        }
        return bufferedImage2;
    }

    @Override
    public String toString() {
        return b;
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
                v0 = "\u00044\t?erkx\u0012\u0011*\u007f& y".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 51;
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
                                v9 = 100;
                                break;
                            }
                            case 1: {
                                v9 = 115;
                                break;
                            }
                            case 2: {
                                v9 = 67;
                                break;
                            }
                            case 3: {
                                v9 = 96;
                                break;
                            }
                            case 4: {
                                v9 = 63;
                                break;
                            }
                            case 5: {
                                v9 = 59;
                                break;
                            }
                            default: {
                                v9 = 61;
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
                hv_1.b = new String(v10).intern();
                var0_1 = 2190462555930536210L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u0011j5K\u0006}\u00fd\u0092sp\u0088R\u00b1}cXm\u00d7\u00d0a\u00ab\u00f0\\\u00b7\\\u0015|/\u00cfe\u0002,\u00d7\u00c1\u00d8\u001c\u008d\u00ba2mT\u0090\u00af\u0018LDh6";
                var5_5 = "\u0011j5K\u0006}\u00fd\u0092sp\u0088R\u00b1}cXm\u00d7\u00d0a\u00ab\u00f0\\\u00b7\\\u0015|/\u00cfe\u0002,\u00d7\u00c1\u00d8\u001c\u008d\u00ba2mT\u0090\u00af\u0018LDh6".length();
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
                    var4_4 = "1f`\u0006V\u00f1#\u001b8\u0003\u00c1\u0086\u00aa\u0018!\u00ad";
                    var5_5 = "1f`\u0006V\u00f1#\u001b8\u0003\u00c1\u0086\u00aa\u0018!\u00ad".length();
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
        hv_1.c = var6_2;
        hv_1.d = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x11B5;
        if (d[n11] == null) {
            hv_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

