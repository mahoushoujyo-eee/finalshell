/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.util.Random;

public class OF
implements BufferedImageOp {
    private int q;
    private float s;
    private int V;
    private float d;
    private boolean B;
    private Random Q;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public OF() {
        this.q = OF.a(11108, 8062068760310903738L);
        this.s = 0.1f;
        this.V = OF.a(20811, 2550057929864448401L);
        this.d = 0.1f;
        this.B = true;
    }

    public OF(int n10, int n11, float f10, boolean bl, float f11) {
        this.q = OF.a(30458, 4213878204696014381L);
        this.s = 0.1f;
        this.V = OF.a(4870, 3760277228557585370L);
        this.d = 0.1f;
        this.B = true;
        this.V = n10;
        this.q = n11;
        this.s = f10;
        this.B = bl;
        this.d = f11;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10;
        String[] stringArray;
        int n11;
        block16: {
            BufferedImage bufferedImage3;
            block15: {
                n11 = bufferedImage.getWidth();
                stringArray = W5.q();
                n10 = bufferedImage.getHeight();
                bufferedImage3 = bufferedImage2;
                if (stringArray == null) break block15;
                if (bufferedImage3 != null) break block16;
                bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage2 = bufferedImage3;
        }
        int[] nArray = new int[n11];
        int[] nArray2 = new int[n11];
        this.Q = new Random(0L);
        int n12 = this.V & OF.a(3047, 2716558168939025214L);
        int n13 = this.V >> OF.a(520, 7507736644711701200L) & OF.a(13385, 8975703616381185178L);
        int n14 = this.V >> OF.a(2009, 1108329953893637897L) & OF.a(13385, 8975703616381185178L);
        int n15 = this.V & OF.a(13385, 8975703616381185178L);
        for (int i2 = 0; i2 < n10; ++i2) {
            OF oF;
            block19: {
                int n16;
                block14: {
                    for (int i3 = 0; i3 < n11; ++i3) {
                        int n17;
                        int n18;
                        int n19;
                        block18: {
                            int n20;
                            int n21;
                            block17: {
                                n19 = n13;
                                n18 = n14;
                                n17 = n15;
                                float f10 = this.d - 0.0f;
                                n16 = f10 == 0.0f ? (char)'\u0000' : (f10 > 0.0f ? (char)'\u0001' : '\uffffffff');
                                if (stringArray == null) break block14;
                                if (stringArray != null) {
                                    if (n16 != 0) {
                                        n21 = (int)((double)(255.0f * this.d) * Math.sin((double)i3 / (double)n11 * Math.PI));
                                        n19 += n21;
                                        n18 += n21;
                                        n17 += n21;
                                    }
                                    n20 = this.B;
                                }
                                if (stringArray == null) break block17;
                                if (n20 == 0) break block18;
                                n20 = (int)(255.0f * (2.0f * this.Q.nextFloat() - 1.0f) * this.s);
                            }
                            n21 = n20;
                            nArray[i3] = n12 | OF.F(n19 + n21) << OF.a(520, 7507736644711701200L) | OF.F(n18 + n21) << OF.a(2009, 1108329953893637897L) | OF.F(n17 + n21);
                            if (stringArray != null) continue;
                        }
                        nArray[i3] = n12 | this.q(n19) << OF.a(520, 7507736644711701200L) | this.q(n18) << OF.a(2009, 1108329953893637897L) | this.q(n17);
                        if (stringArray != null) continue;
                    }
                    oF = this;
                    if (stringArray == null) break block19;
                    n16 = oF.q;
                }
                if (n16 != 0) {
                    this.x(nArray, nArray2, n11, this.q);
                    this.i(bufferedImage2, 0, i2, n11, 1, nArray2);
                    if (stringArray != null) continue;
                }
                oF = this;
            }
            oF.i(bufferedImage2, 0, i2, n11, 1, nArray);
            if (stringArray != null) continue;
        }
        return bufferedImage2;
    }

    private int q(int n10) {
        int n11;
        block7: {
            block6: {
                String[] stringArray;
                block4: {
                    block5: {
                        stringArray = W5.q();
                        n11 = n10 += (int)(255.0f * (2.0f * this.Q.nextFloat() - 1.0f) * this.s);
                        if (stringArray == null) break block4;
                        if (n11 >= 0) break block5;
                        n10 = 0;
                        if (stringArray != null) break block6;
                    }
                    n11 = n10;
                }
                if (stringArray == null) break block7;
                if (n11 > OF.a(13385, 8975703616381185178L)) {
                    n10 = OF.a(13385, 8975703616381185178L);
                }
            }
            n11 = n10;
        }
        return n11;
    }

    private static int F(int n10) {
        String[] stringArray = W5.q();
        int n11 = n10;
        if (stringArray != null) {
            if (n11 < 0) {
                return 0;
            }
            n11 = n10;
        }
        if (stringArray != null) {
            if (n11 > OF.a(10251, 1616265014320034006L)) {
                return OF.a(13385, 8975703616381185178L);
            }
            n11 = n10;
        }
        return n11;
    }

    private static int Z(int n10, int n11) {
        int n12 = n10 / n11;
        String[] stringArray = W5.q();
        int n13 = n10 -= n12 * n11;
        if (stringArray != null) {
            if (n13 < 0) {
                return n10 + n11;
            }
            n13 = n10;
        }
        return n13;
    }

    public void x(int[] nArray, int[] nArray2, int n10, int n11) {
        int n12;
        int n13;
        String[] stringArray;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        block7: {
            n18 = n10 - 1;
            n17 = 2 * n11 + 1;
            n16 = 0;
            n15 = 0;
            n14 = 0;
            stringArray = W5.q();
            for (n13 = -n11; n13 <= n11; ++n13) {
                n12 = nArray[OF.Z(n13, n10)];
                n16 += n12 >> OF.a(6147, 577321471942115542L) & OF.a(13385, 8975703616381185178L);
                n15 += n12 >> OF.a(26997, 5502806207249297838L) & OF.a(13385, 8975703616381185178L);
                n14 += n12 & OF.a(13385, 8975703616381185178L);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block7;
            }
            n13 = 0;
        }
        while (n13 < n10) {
            int n19;
            nArray2[n13] = OF.a(4274, 1359235912595327085L) | n16 / n17 << OF.a(520, 7507736644711701200L) | n15 / n17 << OF.a(2009, 1108329953893637897L) | n14 / n17;
            int n20 = n12 = n13 + n11 + 1;
            int n21 = n18;
            if (stringArray != null) {
                if (n20 > n21) {
                    n12 = OF.Z(n12, n10);
                }
                n20 = n13;
                n21 = n11;
            }
            int n22 = n19 = n20 - n21;
            if (stringArray != null) {
                if (n22 < 0) {
                    n19 = OF.Z(n19, n10);
                }
                n22 = nArray[n12];
            }
            int n23 = n22;
            int n24 = nArray[n19];
            n16 += (n23 & OF.a(16315, 3162184961879074666L)) - (n24 & OF.a(14741, 8275841466750099783L)) >> OF.a(520, 7507736644711701200L);
            n15 += (n23 & OF.a(27292, 4111590755798823498L)) - (n24 & OF.a(22217, 4739240070739365405L)) >> OF.a(2009, 1108329953893637897L);
            n14 += (n23 & OF.a(13385, 8975703616381185178L)) - (n24 & OF.a(13385, 8975703616381185178L));
            ++n13;
            if (stringArray != null) continue;
        }
    }

    public void j(int n10) {
        this.q = n10;
    }

    public int v() {
        return this.q;
    }

    public void K(float f10) {
        this.s = f10;
    }

    public float Q() {
        return this.s;
    }

    public void o(float f10) {
        this.d = f10;
    }

    public float P() {
        return this.d;
    }

    public void C(int n10) {
        this.V = n10;
    }

    public int e() {
        return this.V;
    }

    public void W(boolean bl) {
        this.B = bl;
    }

    public boolean g() {
        return this.B;
    }

    @Override
    public BufferedImage createCompatibleDestImage(BufferedImage bufferedImage, ColorModel colorModel) {
        block3: {
            ColorModel colorModel2;
            block2: {
                String[] stringArray = W5.q();
                colorModel2 = colorModel;
                if (stringArray == null) break block2;
                if (colorModel2 != null) break block3;
                colorModel2 = bufferedImage.getColorModel();
            }
            colorModel = colorModel2;
        }
        return new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight()), colorModel.isAlphaPremultiplied(), null);
    }

    @Override
    public Rectangle2D getBounds2D(BufferedImage bufferedImage) {
        return new Rectangle(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
    }

    @Override
    public Point2D getPoint2D(Point2D point2D, Point2D point2D2) {
        String[] stringArray = W5.q();
        Point2D point2D3 = point2D2;
        if (stringArray != null) {
            if (point2D3 == null) {
                point2D2 = new Point2D.Double();
            }
            point2D2.setLocation(point2D.getX(), point2D.getY());
            point2D3 = point2D2;
        }
        return point2D3;
    }

    @Override
    public RenderingHints getRenderingHints() {
        return null;
    }

    private void i(BufferedImage bufferedImage, int n10, int n11, int n12, int n13, int[] nArray) {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    int n14 = bufferedImage.getType();
                    stringArray = W5.q();
                    if (stringArray == null) break block2;
                    if (n14 != 2 && n14 != 1) break block3;
                    bufferedImage.getRaster().setDataElements(n10, n11, n12, n13, nArray);
                }
                if (stringArray != null) break block4;
            }
            bufferedImage.setRGB(n10, n11, n12, n13, nArray, 0, n12);
        }
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
                v0 = ";\rc\u0001/\"8@*i\u0000)88\u000bHV\u0010.11AF5".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 62;
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
                                v9 = 81;
                                break;
                            }
                            case 1: {
                                v9 = 86;
                                break;
                            }
                            case 2: {
                                v9 = 37;
                                break;
                            }
                            case 3: {
                                v9 = 75;
                                break;
                            }
                            case 4: {
                                v9 = 100;
                                break;
                            }
                            case 5: {
                                v9 = 110;
                                break;
                            }
                            default: {
                                v9 = 99;
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
                OF.a = new String(v10).intern();
                var0_1 = 6431050069362540119L;
                var6_2 = new long[16];
                var3_3 = 0;
                var4_4 = "\u00be\u009c8#\u008b\u00b8=\u0005\u00dd`N\u00d9\u009cu\u000e~\u00b3\u0007o*\u00a0\u0000\r\u00e7~\n\u00e0\u00d8\u0092(6:\u00e5\u00d1p-Z#\u00a4\u0097=\u0000(\\\u0005Q-i\u00f7D\u0081\u00e7\u00d0\u00af\u007fNAb\u00b6\u00ed'\u00f2O\u00f1\u00b5\u0007r$\u001c\u00ad\u008fJ\u00a9\u00a7x\u0000\u00edJ>\u0091c{`\u00a7\u001813\u001d\u00e1\u00c8\u0093\u00fe\u00a8\u00b0Pp\u00da\u00ea\u00a8\u00ab\u008e\u00db\u00a1V\f\u00f3/\u00d8\u0003\u0007\u0099=";
                var5_5 = "\u00be\u009c8#\u008b\u00b8=\u0005\u00dd`N\u00d9\u009cu\u000e~\u00b3\u0007o*\u00a0\u0000\r\u00e7~\n\u00e0\u00d8\u0092(6:\u00e5\u00d1p-Z#\u00a4\u0097=\u0000(\\\u0005Q-i\u00f7D\u0081\u00e7\u00d0\u00af\u007fNAb\u00b6\u00ed'\u00f2O\u00f1\u00b5\u0007r$\u001c\u00ad\u008fJ\u00a9\u00a7x\u0000\u00edJ>\u0091c{`\u00a7\u001813\u001d\u00e1\u00c8\u0093\u00fe\u00a8\u00b0Pp\u00da\u00ea\u00a8\u00ab\u008e\u00db\u00a1V\f\u00f3/\u00d8\u0003\u0007\u0099=".length();
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
                    var4_4 = "\u00bc\u00a2\u00a8\u00f7~\u00f3\u009f\u0010\u00b7\u00ca\u009e\u00bc:\u008c\u00122";
                    var5_5 = "\u00bc\u00a2\u00a8\u00f7~\u00f3\u009f\u0010\u00b7\u00ca\u009e\u00bc:\u008c\u00122".length();
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
        OF.b = var6_2;
        OF.c = new Integer[16];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x58DC;
        if (c[n11] == null) {
            OF.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

