/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hx_1;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/*
 * Renamed from com.gr
 */
public class gr_2
extends W5 {
    private float Q = 5.0f;
    private float n = 4.712389f;
    private float I = 5.0f;
    private float N = 0.5f;
    private boolean T = false;
    private boolean h = false;
    private int l;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public gr_2() {
        this.l = gr_2.a(686, 6294110888374697702L);
    }

    public gr_2(float f10, float f11, float f12, float f13) {
        this.l = gr_2.a(9744, 1085108922455939679L);
        this.Q = f10;
        this.n = (float)Math.atan2(f12, f11);
        this.I = (float)Math.sqrt(f11 * f11 + f12 * f12);
        this.N = f13;
    }

    public void E(float f10) {
        this.n = f10;
    }

    public float v() {
        return this.n;
    }

    public void b(float f10) {
        this.I = f10;
    }

    public float p() {
        return this.I;
    }

    public void D(float f10) {
        this.Q = f10;
    }

    public float W() {
        return this.Q;
    }

    public void W(float f10) {
        this.N = f10;
    }

    public float Y() {
        return this.N;
    }

    public void G(int n10) {
        this.l = n10;
    }

    public int r() {
        return this.l;
    }

    public void F(boolean bl) {
        this.T = bl;
    }

    public boolean M() {
        return this.T;
    }

    public void n(boolean bl) {
        this.h = bl;
    }

    public boolean y() {
        return this.h;
    }

    @Override
    public Rectangle2D getBounds2D(BufferedImage bufferedImage) {
        Rectangle rectangle;
        block3: {
            gr_2 gr_22;
            block2: {
                rectangle = new Rectangle(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
                String[] stringArray = W5.q();
                gr_22 = this;
                if (stringArray == null) break block2;
                if (!gr_22.T) break block3;
                gr_22 = this;
            }
            float f10 = gr_22.I * (float)Math.cos(this.n);
            float f11 = -this.I * (float)Math.sin(this.n);
            rectangle.width += (int)(Math.abs(f10) + 2.0f * this.Q);
            rectangle.height += (int)(Math.abs(f11) + 2.0f * this.Q);
        }
        return rectangle;
    }

    @Override
    public Point2D getPoint2D(Point2D point2D, Point2D point2D2) {
        block6: {
            block5: {
                gr_2 gr_22;
                String[] stringArray;
                block4: {
                    stringArray = W5.q();
                    if (point2D2 == null) {
                        point2D2 = new Point2D.Double();
                    }
                    gr_22 = this;
                    if (stringArray == null) break block4;
                    if (!gr_22.T) break block5;
                    gr_22 = this;
                }
                float f10 = gr_22.I * (float)Math.cos(this.n);
                float f11 = -this.I * (float)Math.sin(this.n);
                float f12 = Math.max(0.0f, this.Q - f11);
                float f13 = Math.max(0.0f, this.Q - f10);
                point2D2.setLocation(point2D.getX() + (double)f13, point2D.getY() + (double)f12);
                if (stringArray != null) break block6;
            }
            point2D2.setLocation(point2D.getX(), point2D.getY());
        }
        return point2D2;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block12: {
            boolean bl;
            Graphics2D graphics2D;
            block11: {
                String[] stringArray;
                float f10;
                float f11;
                int n10;
                int n11;
                block8: {
                    gr_2 gr_22;
                    block9: {
                        block10: {
                            n11 = bufferedImage.getWidth();
                            n10 = bufferedImage.getHeight();
                            f11 = this.I * (float)Math.cos(this.n);
                            f10 = -this.I * (float)Math.sin(this.n);
                            stringArray = W5.q();
                            if (bufferedImage2 != null) break block8;
                            gr_22 = this;
                            if (stringArray == null) break block9;
                            if (!gr_22.T) break block10;
                            ColorModel colorModel = bufferedImage.getColorModel();
                            bufferedImage2 = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(bufferedImage.getWidth() + (int)(Math.abs(f11) + this.Q), bufferedImage.getHeight() + (int)(Math.abs(f10) + this.Q)), colorModel.isAlphaPremultiplied(), null);
                            if (stringArray != null) break block8;
                        }
                        gr_22 = this;
                    }
                    bufferedImage2 = gr_22.createCompatibleDestImage(bufferedImage, null);
                }
                float f12 = (float)(this.l >> gr_2.a(27712, 1418602864911192073L) & gr_2.a(10126, 4182591457032362944L)) / 255.0f;
                float f13 = (float)(this.l >> gr_2.a(3886, 219694530726523749L) & gr_2.a(9853, 7951699471330433591L)) / 255.0f;
                float f14 = (float)(this.l & gr_2.a(9853, 7951699471330433591L)) / 255.0f;
                float[][] fArrayArray = new float[][]{{0.0f, 0.0f, 0.0f, f12}, {0.0f, 0.0f, 0.0f, f13}, {0.0f, 0.0f, 0.0f, f14}, {0.0f, 0.0f, 0.0f, this.N}};
                BufferedImage bufferedImage3 = new BufferedImage(n11, n10, 2);
                new BandCombineOp(fArrayArray, null).filter(bufferedImage.getRaster(), bufferedImage3.getRaster());
                bufferedImage3 = new hx_1(this.Q).filter(bufferedImage3, null);
                graphics2D = bufferedImage2.createGraphics();
                graphics2D.setComposite(AlphaComposite.getInstance(3, this.N));
                bl = this.T;
                if (stringArray == null) break block11;
                if (bl) {
                    float f15 = this.Q / 2.0f;
                    float f16 = Math.max(0.0f, this.Q - f10);
                    float f17 = Math.max(0.0f, this.Q - f11);
                    graphics2D.translate(f17, f16);
                }
                graphics2D.drawRenderedImage(bufferedImage3, AffineTransform.getTranslateInstance(f11, f10));
                if (stringArray == null) break block12;
                bl = this.h;
            }
            if (!bl) {
                graphics2D.setComposite(AlphaComposite.SrcOver);
                graphics2D.drawRenderedImage(bufferedImage, null);
            }
            graphics2D.dispose();
        }
        return bufferedImage2;
    }

    public String toString() {
        return a;
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
                v0 = "\n\u0014P\u0015vRZv$[\u0016o\bl1\u0001M\u0016h\u0006\u0011w".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 108;
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
                                v9 = 53;
                                break;
                            }
                            case 1: {
                                v9 = 12;
                                break;
                            }
                            case 2: {
                                v9 = 69;
                                break;
                            }
                            case 3: {
                                v9 = 21;
                                break;
                            }
                            case 4: {
                                v9 = 115;
                                break;
                            }
                            case 5: {
                                v9 = 68;
                                break;
                            }
                            default: {
                                v9 = 83;
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
                gr_2.a = new String(v10).intern();
                var0_1 = 1215951047850473071L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = ";K\u0090\u00da\u00e0h\u00c5\u0002\u00d5\u00c3\u001at\u0012+\u00ec\u00a7\u00aa9\u009d%?\u0006&v\u0083\u00a0Q\u0014\u00be\u0019\u00c8\u0089";
                var5_5 = ";K\u0090\u00da\u00e0h\u00c5\u0002\u00d5\u00c3\u001at\u0012+\u00ec\u00a7\u00aa9\u009d%?\u0006&v\u0083\u00a0Q\u0014\u00be\u0019\u00c8\u0089".length();
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
                    var4_4 = "\u0095\u00bf\u0017N9\u00f3\u00ec0A\u00c8\u00f1Z\u000b\u009bmP";
                    var5_5 = "\u0095\u00bf\u0017N9\u00f3\u00ec0A\u00c8\u00f1Z\u000b\u009bmP".length();
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
        gr_2.b = var6_2;
        gr_2.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7C4B;
        if (c[n11] == null) {
            gr_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

