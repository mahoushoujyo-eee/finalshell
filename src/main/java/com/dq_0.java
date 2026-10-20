/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.RV;
import com.W2;
import com._5;
import com.oa_2;
import com.wb_0;
import com.xg_0;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Dq
 */
public class dq_0
extends JComponent
implements SwingConstants,
W2 {
    private ImageIcon A;
    private ImageIcon p;
    private int o = _5.h;
    private int e = _5.Z;
    private boolean s = _5.k;
    private Color R = _5.g;
    private boolean B = _5.b;
    private int P = _5.d;
    private int b = _5.s;
    private float U = _5.x;
    private float y = _5.y;
    private boolean r = _5.J;
    private boolean X = _5.N;
    private float c = _5.r;
    private boolean I = _5.t;
    private float L = _5.B;
    private boolean h = _5.L;
    private float H = _5.V;
    private static final long[] a;
    private static final Integer[] d;

    public dq_0() {
        this((ImageIcon)null);
    }

    public dq_0(String string) {
        this(xg_0.L(string));
    }

    public dq_0(Class clazz, String string) {
        this(xg_0.Z(clazz, string));
    }

    public dq_0(Image image) {
        FN.Y(this);
        this.f(image);
    }

    public dq_0(ImageIcon imageIcon) {
        FN.Y(this);
        this.V(imageIcon);
    }

    public ImageIcon A() {
        return this.p;
    }

    public ImageIcon n() {
        return this.A;
    }

    public void f(Image image) {
        this.t(image, true);
    }

    public void t(Image image, boolean bl) {
        this.q(new ImageIcon(image), bl);
    }

    public void V(ImageIcon imageIcon) {
        this.q(imageIcon, true);
    }

    public void q(ImageIcon imageIcon, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.A = imageIcon;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public int V() {
        return this.o;
    }

    public void i(int n10) {
        this.o = n10;
        this.repaint();
    }

    public int p() {
        return this.e;
    }

    public void y(int n10) {
        this.e = n10;
        this.repaint();
    }

    public boolean W() {
        return this.s;
    }

    public void H(boolean bl) {
        this.g(bl, true);
    }

    public void g(boolean bl, boolean bl2) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.s = bl;
                if (!bl2) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public Color t() {
        return this.R;
    }

    public void V(Color color) {
        this.p(color, true);
    }

    public void p(Color color, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.R = color;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public boolean s() {
        return this.B;
    }

    public void a(boolean bl) {
        this.N(bl, true);
    }

    public void N(boolean bl, boolean bl2) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.B = bl;
                if (!bl2) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public int Z() {
        return this.P;
    }

    public void t(int n10) {
        this.g(n10, true);
    }

    public void g(int n10, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.P = n10;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public int S() {
        return this.b;
    }

    public void K(int n10) {
        this.Q(n10, true);
    }

    public void Q(int n10, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.b = n10;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public boolean f() {
        return this.r;
    }

    public void P(boolean bl) {
        this.a(bl, true);
    }

    public void a(boolean bl, boolean bl2) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.r = bl;
                if (!bl2) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public boolean y() {
        return this.X;
    }

    public void y(boolean bl) {
        this.n(bl, true);
    }

    public void n(boolean bl, boolean bl2) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.X = bl;
                if (!bl2) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public float u() {
        return this.c;
    }

    public void t(float f10) {
        this.N(f10, true);
    }

    public void N(float f10, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.c = f10;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public boolean p() {
        return this.I;
    }

    public void i(boolean bl) {
        this.T(bl, true);
    }

    public void T(boolean bl, boolean bl2) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.I = bl;
                if (!bl2) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public float i() {
        return this.L;
    }

    public void k(float f10) {
        this.W(f10, true);
    }

    public void W(float f10, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.L = f10;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public boolean c() {
        return this.h;
    }

    public void K(boolean bl) {
        this.H(bl, true);
    }

    public void H(boolean bl, boolean bl2) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.h = bl;
                if (!bl2) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public float d() {
        return this.H;
    }

    public void a(float f10) {
        this.d(f10, true);
    }

    public void d(float f10, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.H = f10;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public float x() {
        return this.U;
    }

    public void c(float f10) {
        this.n(f10, true);
    }

    public void n(float f10, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.U = f10;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public float j() {
        return this.y;
    }

    public void i(float f10) {
        this.F(f10, true);
    }

    public void F(float f10, boolean bl) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                dq_02 = this;
                if (string == null) break block2;
                dq_02.y = f10;
                if (!bl) break block3;
                dq_02 = this;
            }
            dq_02.A();
        }
    }

    public void A() {
        dq_0 dq_02;
        block26: {
            BufferedImage bufferedImage;
            block27: {
                dq_0 dq_03;
                String string;
                block24: {
                    block25: {
                        int n10;
                        block23: {
                            block22: {
                                block19: {
                                    block20: {
                                        block21: {
                                            block17: {
                                                block18: {
                                                    string = wb_0.m();
                                                    ImageIcon imageIcon = this.A;
                                                    if (string != null) {
                                                        if (imageIcon == null) {
                                                            this.p = null;
                                                            this.repaint();
                                                            return;
                                                        }
                                                        imageIcon = this.A;
                                                    }
                                                    bufferedImage = xg_0.m(imageIcon.getImage());
                                                    n10 = this.r;
                                                    if (string != null) {
                                                        if (n10 != 0) {
                                                            oa_2.P(bufferedImage, bufferedImage);
                                                        }
                                                        n10 = this.X;
                                                    }
                                                    if (string != null) {
                                                        if (n10 != 0) {
                                                            oa_2.u(bufferedImage, bufferedImage, this.c);
                                                        }
                                                        n10 = this.I;
                                                    }
                                                    if (string == null) break block17;
                                                    if (n10 == 0) break block18;
                                                    n10 = this.h;
                                                    if (string == null) break block17;
                                                    if (n10 == 0) break block18;
                                                    oa_2.p(bufferedImage, bufferedImage, 0.0f, 0.0f, this.H, this.L, this.U, this.y);
                                                    if (string != null) break block19;
                                                }
                                                n10 = this.I;
                                            }
                                            if (string == null) break block20;
                                            if (n10 == 0) break block21;
                                            oa_2.V((Image)bufferedImage, (Image)bufferedImage, this.L, this.U, this.y);
                                            if (string != null) break block19;
                                        }
                                        n10 = this.h;
                                    }
                                    if (string == null) break block22;
                                    if (n10 != 0) {
                                        oa_2.n(bufferedImage, bufferedImage, this.H, this.U, this.y);
                                    }
                                }
                                n10 = this.b;
                            }
                            if (string == null) break block23;
                            if (n10 > 0) {
                                bufferedImage = xg_0.A(new RoundRectangle2D.Double(0.0, 0.0, this.A.getIconWidth(), this.A.getIconHeight(), this.b * 2, this.b * 2), bufferedImage);
                            }
                            dq_03 = this;
                            if (string == null) break block24;
                            n10 = dq_03.P;
                        }
                        if (n10 > 0) break block25;
                        dq_03 = this;
                        if (string == null) break block24;
                        if (dq_03.B) break block25;
                        dq_02 = this;
                        if (string == null) break block26;
                        if (!dq_02.s) break block27;
                    }
                    dq_03 = this;
                }
                Dimension dimension = dq_03.getPreferredSize();
                BufferedImage bufferedImage2 = xg_0.g(dimension.width, dimension.height, 3);
                Graphics2D graphics2D = bufferedImage2.createGraphics();
                RV.X(graphics2D);
                Shape shape = this.N();
                RV.y(graphics2D, shape, _5.R, new Color(dq_0.a(2748, 1861594135011962130L), dq_0.a(5993, 734356782593650882L), dq_0.a(5993, 734356782593650882L)), this.P);
                graphics2D.drawImage((Image)bufferedImage, this.P, this.P, null);
                boolean bl = this.B;
                if (string != null) {
                    if (bl) {
                        graphics2D.setPaint(new GradientPaint(0.0f, this.P, new Color(dq_0.a(2240, 4825450199560105833L), dq_0.a(18030, 988576894238286276L), dq_0.a(18030, 988576894238286276L), dq_0.a(22105, 7321094231105171958L)), 0.0f, this.P + (dimension.height - this.P * 2) / 2, new Color(dq_0.a(18030, 988576894238286276L), dq_0.a(18030, 988576894238286276L), dq_0.a(18030, 988576894238286276L), dq_0.a(19645, 1130331558466775829L))));
                        graphics2D.fill(this.R());
                    }
                    bl = this.s;
                }
                if (bl) {
                    graphics2D.setPaint(this.R);
                    graphics2D.draw(shape);
                }
                graphics2D.dispose();
                bufferedImage = bufferedImage2;
            }
            this.p = new ImageIcon(bufferedImage);
            dq_02 = this;
        }
        dq_02.repaint();
    }

    private Shape R() {
        Dimension dimension = this.getPreferredSize();
        if (this.b > 0) {
            return new RoundRectangle2D.Double(this.P, this.P, dimension.width - this.P * 2, (dimension.height - this.P * 2) / 2, this.b * 2, this.b * 2);
        }
        return new Rectangle(this.P, this.P, dimension.width - this.P * 2, (dimension.height - this.P * 2) / 2);
    }

    private Shape N() {
        return this.H(0, 0);
    }

    private Shape H(int n10, int n11) {
        Dimension dimension = this.getPreferredSize();
        if (this.b > 0) {
            return new RoundRectangle2D.Double(n10 + this.P, n11 + this.P, dimension.width - this.P * 2 - 1, dimension.height - this.P * 2 - 1, this.b * 2, this.b * 2);
        }
        return new Rectangle(n10 + this.P, n11 + this.P, dimension.width - this.P * 2 - 1, dimension.height - this.P * 2 - 1);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        block3: {
            dq_0 dq_02;
            block2: {
                String string = wb_0.m();
                super.paintComponent(graphics);
                String string2 = string;
                dq_02 = this;
                if (string2 == null) break block2;
                if (dq_02.p == null) break block3;
                dq_02 = this;
            }
            Point point = dq_02.j();
            graphics.drawImage(this.p.getImage(), point.x, point.y, null);
        }
    }

    private Point j() {
        int n10;
        int n11;
        block11: {
            int n12;
            int n13;
            block12: {
                int n14;
                block13: {
                    String string;
                    block9: {
                        block10: {
                            block6: {
                                int n15;
                                int n16;
                                block7: {
                                    int n17;
                                    block8: {
                                        block4: {
                                            block5: {
                                                n17 = this.p.getIconWidth();
                                                n14 = this.p.getIconHeight();
                                                string = wb_0.m();
                                                n16 = this.o;
                                                n15 = 2;
                                                if (string == null) break block4;
                                                if (n16 != n15) break block5;
                                                n11 = 0;
                                                if (string != null) break block6;
                                            }
                                            n16 = this.o;
                                            n15 = 4;
                                        }
                                        if (string == null) break block7;
                                        if (n16 != n15) break block8;
                                        n11 = this.getWidth() - n17;
                                        if (string != null) break block6;
                                    }
                                    n16 = this.getWidth() / 2;
                                    n15 = n17 / 2;
                                }
                                n11 = n16 - n15;
                            }
                            n13 = this.e;
                            n12 = 1;
                            if (string == null) break block9;
                            if (n13 != n12) break block10;
                            n10 = 0;
                            if (string != null) break block11;
                        }
                        n13 = this.e;
                        n12 = 3;
                    }
                    if (string == null) break block12;
                    if (n13 != n12) break block13;
                    n10 = this.getHeight() - n14;
                    if (string != null) break block11;
                }
                n13 = this.getHeight() / 2;
                n12 = n14 / 2;
            }
            n10 = n13 - n12;
        }
        return new Point(n11, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        if (this.A != null) {
            return new Dimension(this.P * 2 + this.A.getIconWidth(), this.P * 2 + this.A.getIconHeight());
        }
        return new Dimension(0, 0);
    }

    @Override
    public Shape B() {
        Point point = this.j();
        return this.H(point.x, point.y);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2794543755217359759L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "=\u00fc\u00d1\u00f3c\u00e0\u00e3\u0017\u00e3\u00ee\u0089P\u00a9?2\u00b4\u00d0\u00d2\u00ba\u0098\u00dd\u001a|\u0019\u0014\u00f4H\u00b6s\u00d78\u00ba";
                var5_4 = "=\u00fc\u00d1\u00f3c\u00e0\u00e3\u0017\u00e3\u00ee\u0089P\u00a9?2\u00b4\u00d0\u00d2\u00ba\u0098\u00dd\u001a|\u0019\u0014\u00f4H\u00b6s\u00d78\u00ba".length();
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
                    var4_3 = "\u00f5L|\u00ca++\"\u00d9\u0080n\u009e4\u0092R\u00fe\u00c7";
                    var5_4 = "\u00f5L|\u00ca++\"\u00d9\u0080n\u009e4\u0092R\u00fe\u00c7".length();
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
        dq_0.a = var6_1;
        dq_0.d = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x27AB;
        if (d[n11] == null) {
            dq_0.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

