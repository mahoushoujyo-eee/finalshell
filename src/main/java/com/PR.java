/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.ra_1;
import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

class PR
implements CompositeContext {
    private int B;
    private static final long[] a;
    private static final Integer[] b;

    public PR(int n10, ColorModel colorModel, ColorModel colorModel2) {
        this.B = n10;
    }

    @Override
    public void dispose() {
    }

    @Override
    public void compose(Raster raster, Raster raster2, WritableRaster writableRaster) {
        int n10 = raster.getMinX();
        String string = ra_1.c();
        int n11 = raster.getMinY();
        int n12 = raster.getWidth();
        int n13 = raster.getHeight();
        int[] nArray = null;
        int[] nArray2 = null;
        int[] nArray3 = null;
        int[] nArray4 = new int[n12 * 4];
        int n14 = 0;
        block0: while (true) {
            int n15 = n14;
            block1: while (n15 < n13) {
                nArray = raster.getPixels(n10, n11, n12, 1, nArray);
                nArray3 = raster2.getPixels(n10, n11, n12, 1, nArray3);
                int n16 = 0;
                int n17 = 0;
                for (int i2 = 0; i2 < n12; ++i2) {
                    int n18;
                    block18: {
                        block15: {
                            block17: {
                                block16: {
                                    int n19;
                                    block13: {
                                        block14: {
                                            block11: {
                                                int n20;
                                                block12: {
                                                    int n21;
                                                    n18 = nArray[n17 + 3];
                                                    n15 = n14;
                                                    if (string != null) continue block1;
                                                    if (string == null) {
                                                        n21 = n15 != 0 ? nArray2[n17 + 3] : n18;
                                                    }
                                                    n20 = n21;
                                                    n19 = n14;
                                                    if (string != null) break block11;
                                                    if (n19 == 0) break block12;
                                                    n19 = i2;
                                                    if (string != null) break block11;
                                                    if (n19 == 0) break block12;
                                                    n19 = (n18 ^ n16) & PR.a(3409, 1567581140995091219L);
                                                    if (string != null) break block13;
                                                    if (n19 != 0) break block14;
                                                }
                                                n19 = (n18 ^ n20) & PR.a(4772, 4612832726460675301L);
                                            }
                                            if (string != null) break block13;
                                            if (n19 == 0) break block15;
                                        }
                                        n19 = (this.B + n14 + i2) % PR.a(15787, 4422218822540106728L);
                                    }
                                    if (n19 <= 4) break block16;
                                    nArray4[n17] = 0;
                                    nArray4[n17 + 1] = 0;
                                    nArray4[n17 + 2] = 0;
                                    if (string == null) break block17;
                                }
                                nArray4[n17] = PR.a(12229, 6536340609629751680L);
                                nArray4[n17 + 1] = PR.a(22950, 8212422530587754470L);
                                nArray4[n17 + 2] = PR.a(1157, 5268441392198460097L);
                            }
                            nArray4[n17 + 3] = PR.a(22950, 8212422530587754470L);
                            if (string == null) break block18;
                        }
                        nArray4[n17] = nArray3[n17];
                        nArray4[n17 + 1] = nArray3[n17 + 1];
                        nArray4[n17 + 2] = nArray3[n17 + 2];
                        nArray4[n17] = PR.a(22950, 8212422530587754470L);
                        nArray4[n17 + 1] = 0;
                        nArray4[n17 + 2] = 0;
                        nArray4[n17 + 3] = 0;
                    }
                    n16 = n18;
                    n17 += 4;
                    if (string == null) continue;
                }
                writableRaster.setPixels(n10, n11, n12, 1, nArray4);
                int[] nArray5 = nArray;
                nArray = nArray2;
                nArray2 = nArray5;
                ++n11;
                ++n14;
                if (string == null) continue block0;
            }
            break;
        }
        if (ky_2.F() != null) {
            ra_1.C("vaz7O");
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8556438887050563211L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u00f5\u00fc\u00d0\u00c4\u00b5\u00e41\u0092\u00f5\u0096\u001f\u00ee\u00b0\u0000\u00fa\u00ee7rX\u001f}a\u00e5\u0018}\u00d1\u00e16\u00a0pUi";
                var5_4 = "\u00f5\u00fc\u00d0\u00c4\u00b5\u00e41\u0092\u00f5\u0096\u001f\u00ee\u00b0\u0000\u00fa\u00ee7rX\u001f}a\u00e5\u0018}\u00d1\u00e16\u00a0pUi".length();
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
                    var4_3 = "8\u000b:\u00b4\u0011\b\u00ec53S\u0011\u00903\r\u00c7\u00f4";
                    var5_4 = "8\u000b:\u00b4\u0011\b\u00ec53S\u0011\u00903\r\u00c7\u00f4".length();
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
        PR.a = var6_1;
        PR.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2640;
        if (b[n11] == null) {
            PR.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

