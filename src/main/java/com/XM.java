/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ra_1;
import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public abstract class XM
implements CompositeContext {
    private float a;
    private ColorModel b;
    private ColorModel H;
    private static final long[] d;
    private static final Integer[] f;

    public XM(float f10, ColorModel colorModel, ColorModel colorModel2) {
        this.a = f10;
        this.b = colorModel;
        this.H = colorModel2;
    }

    @Override
    public void dispose() {
    }

    static int U(int n10, int n11) {
        int n12 = n10 * n11 + XM.a(29649, 5911693692162933165L);
        return (n12 >> XM.a(1433, 331256653831534564L)) + n12 >> XM.a(24853, 5482750089917076330L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int c(int n10) {
        String string = ra_1.c();
        int n11 = n10;
        if (string == null) {
            if (n11 < 0) {
                return 0;
            }
            n11 = n10;
        }
        if (string != null) return n11;
        n11 = n11 > XM.a(13415, 454637809669391897L) ? XM.a(8852, 7670995858735059183L) : n10;
        return n11;
    }

    public abstract void G(int[] var1, int[] var2, float var3);

    @Override
    public void compose(Raster raster, Raster raster2, WritableRaster writableRaster) {
        float f10 = this.a;
        String string = ra_1.c();
        int[] nArray = null;
        int[] nArray2 = null;
        int n10 = writableRaster.getMinX();
        int n11 = writableRaster.getWidth();
        int n12 = writableRaster.getMinY();
        int n13 = n12 + writableRaster.getHeight();
        for (int i2 = n12; i2 < n13; ++i2) {
            nArray = raster.getPixels(n10, i2, n11, 1, nArray);
            nArray2 = raster2.getPixels(n10, i2, n11, 1, nArray2);
            this.G(nArray, nArray2, f10);
            writableRaster.setPixels(n10, i2, n11, 1, nArray2);
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8973208339514803828L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "@\f$\u00c99\u00e5\u00d5\u0016\u00ebA\u0017\u00fb\u008e\u0094\u0000\u0092\u001c4\u0096\b\u00b9F\u00b1\u0098";
                var5_4 = "@\f$\u00c99\u00e5\u00d5\u0016\u00ebA\u0017\u00fb\u008e\u0094\u0000\u0092\u001c4\u0096\b\u00b9F\u00b1\u0098".length();
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
                    var4_3 = "\b y\u0096:\u0010GY\u00ec\u00d0p\u00f4\u0015?\u0016d";
                    var5_4 = "\b y\u0096:\u0010GY\u00ec\u00d0p\u00f4\u0015?\u0016d".length();
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
        XM.d = var6_1;
        XM.f = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x727F;
        if (f[n11] == null) {
            XM.f[n11] = (int)(d[n11] ^ l2);
        }
        return f[n11];
    }
}

