/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.z7;
import com.zH;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/*
 * Renamed from com.zf
 */
public class zf_0
extends zH {
    private int l;
    private int c;
    private int z;
    private float B;
    private boolean b;
    private boolean X;
    private int H;
    private static final long[] a;
    private static final Integer[] d;

    public zf_0() {
        this.l = zf_0.a(18842, 7407294327733724512L);
        this.c = zf_0.a(30246, 2476600586153040607L);
        this.z = zf_0.a(30246, 2476600586153040607L);
        this.B = 0.5f;
        this.b = false;
        this.X = true;
        this.H = zf_0.a(27663, 3036285714057003252L);
    }

    public zf_0(int n10, int n11, int n12, float f10) {
        this.l = zf_0.a(30246, 2476600586153040607L);
        this.c = zf_0.a(30246, 2476600586153040607L);
        this.z = zf_0.a(30246, 2476600586153040607L);
        this.B = 0.5f;
        this.b = false;
        this.X = true;
        this.H = zf_0.a(17286, 3306709873100894078L);
        this.l = n10;
        this.c = n11;
        this.z = n12;
        this.B = f10;
    }

    public void S(int n10) {
        this.c = n10;
    }

    public int L() {
        return this.c;
    }

    public void V(int n10) {
        this.z = n10;
    }

    public int o() {
        return this.z;
    }

    public void i(int n10) {
        this.l = n10;
    }

    public int y() {
        return this.l;
    }

    public void s(float f10) {
        this.B = f10;
    }

    public float G() {
        return this.B;
    }

    public void L(int n10) {
        this.H = n10;
    }

    public int E() {
        return this.H;
    }

    public void n(boolean bl) {
        this.b = bl;
    }

    public boolean i() {
        return this.b;
    }

    public void S(boolean bl) {
        this.X = bl;
    }

    public boolean R() {
        return this.X;
    }

    protected void M(Rectangle rectangle) {
        block3: {
            block2: {
                String[] stringArray = zH.U();
                if (stringArray != null) break block2;
                if (!this.b) break block3;
                rectangle.width += Math.abs(this.c) + 2 * this.l;
            }
            rectangle.height += Math.abs(this.z) + 2 * this.l;
        }
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block13: {
            boolean bl;
            Graphics2D graphics2D;
            block12: {
                Object object;
                int n10;
                String[] stringArray;
                int n11;
                block9: {
                    zf_0 zf_02;
                    block10: {
                        block11: {
                            n11 = bufferedImage.getWidth();
                            stringArray = zH.U();
                            n10 = bufferedImage.getHeight();
                            if (bufferedImage2 != null) break block9;
                            zf_02 = this;
                            if (stringArray != null) break block10;
                            if (!zf_02.b) break block11;
                            object = bufferedImage.getColorModel();
                            bufferedImage2 = new BufferedImage((ColorModel)object, ((ColorModel)object).createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight()), ((ColorModel)object).isAlphaPremultiplied(), null);
                            if (stringArray == null) break block9;
                        }
                        zf_02 = this;
                    }
                    bufferedImage2 = zf_02.createCompatibleDestImage(bufferedImage, null);
                }
                object = new float[][]{{0.0f, 0.0f, 0.0f, 0.0f}, {0.0f, 0.0f, 0.0f, 0.0f}, {0.0f, 0.0f, 0.0f, 0.0f}, {0.0f, 0.0f, 0.0f, this.B}};
                BufferedImage bufferedImage3 = new BufferedImage(n11, n10, 2);
                new BandCombineOp((float[][])object, null).filter(bufferedImage.getRaster(), bufferedImage3.getRaster());
                bufferedImage3 = new z7(this.l).filter(bufferedImage3, null);
                graphics2D = bufferedImage2.createGraphics();
                graphics2D.setComposite(AlphaComposite.getInstance(3, this.B));
                bl = this.b;
                if (stringArray != null) break block12;
                if (bl) {
                    int n12 = Math.max(0, this.l - this.z);
                    int n13 = Math.max(0, this.l - this.c);
                    graphics2D.translate(n12, n13);
                }
                graphics2D.drawRenderedImage(bufferedImage3, AffineTransform.getTranslateInstance(this.c, this.z));
                if (stringArray != null) break block13;
                bl = this.X;
            }
            if (!bl) {
                graphics2D.setComposite(AlphaComposite.SrcOver);
                graphics2D.drawRenderedImage(bufferedImage, null);
            }
            graphics2D.dispose();
        }
        if (ky_2.F() != null) {
            zH.L(new String[2]);
        }
        return bufferedImage2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2830780452505264591L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "hU\u0010\u0017@\u009f;\u0015`\u00bd\u00d2k\u0012\u00c6\u008e\u00b1";
                var5_4 = "hU\u0010\u0017@\u009f;\u0015`\u00bd\u00d2k\u0012\u00c6\u008e\u00b1".length();
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
                    var4_3 = "g\u0015\u00d1\u00cd-D!;N\u008f\u0013a\u00c3\u00e7\u0084\u00aa";
                    var5_4 = "g\u0015\u00d1\u00cd-D!;N\u008f\u0013a\u00c3\u00e7\u0084\u00aa".length();
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
        zf_0.a = var6_1;
        zf_0.d = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6CF9;
        if (d[n11] == null) {
            zf_0.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

