/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.HT;
import com.O5;
import com.RV;
import com.WF;
import com.aH;
import com.ac_0;
import com.az_0;
import com.cs_0;
import com.fs_0;
import com.pp_0;
import com.rf_1;
import com.sr_0;
import com.td_0;
import com.wd_0;
import com.xg_0;
import com.xx_0;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TexturePaint;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Wb
 */
public class wb_0
extends JComponent
implements pp_0,
rf_1,
SwingConstants {
    private BufferedImage f;
    private BufferedImage r;
    private xx_0 h;
    private int K;
    private int C;
    private float E;
    private Insets b;
    private Dimension S = null;
    private BufferedImage a = null;
    private static String O;
    private static final String c;

    public wb_0() {
        this((Image)null);
    }

    public wb_0(String string) {
        this(xg_0.L(string));
    }

    public wb_0(Class clazz, String string) {
        this(xg_0.Z(clazz, string));
    }

    public wb_0(URL uRL) {
        this(xg_0.a(uRL));
    }

    public wb_0(Icon icon) {
        this(xg_0.i(icon));
    }

    public wb_0(ImageIcon imageIcon) {
        this(imageIcon.getImage());
    }

    public wb_0(Image image) {
        this(xg_0.v(image));
    }

    public wb_0(BufferedImage bufferedImage) {
        this.f = bufferedImage;
        this.r = null;
        this.h = xx_0.preferred;
        this.K = 0;
        this.C = 0;
        this.E = 1.0f;
        FN.Y(this);
        this.setOpaque(false);
        this.addPropertyChangeListener(c, new td_0(this));
    }

    protected void c() {
        String string = wb_0.m();
        BufferedImage bufferedImage = this.f;
        if (string != null) {
            bufferedImage = bufferedImage != null ? xg_0.h((Image)this.f) : null;
        }
        this.r = bufferedImage;
        this.a = null;
    }

    private void Y() {
        String string = wb_0.m();
        wb_0 wb_02 = this;
        if (string != null) {
            if (wb_02.r != null) {
                this.r.flush();
                this.r = null;
            }
            wb_02 = this;
        }
        wb_02.a = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int X() {
        String string = wb_0.m();
        BufferedImage bufferedImage = this.f;
        if (string != null) {
            if (bufferedImage == null) return -1;
            bufferedImage = this.f;
        }
        int n10 = bufferedImage.getWidth();
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int d() {
        String string = wb_0.m();
        BufferedImage bufferedImage = this.f;
        if (string != null) {
            if (bufferedImage == null) return -1;
            bufferedImage = this.f;
        }
        int n10 = bufferedImage.getHeight();
        return n10;
    }

    public BufferedImage y() {
        return this.f;
    }

    public ImageIcon U() {
        return new ImageIcon(this.f);
    }

    public BufferedImage S() {
        return this.a;
    }

    public ImageIcon w() {
        return this.a != null ? new ImageIcon(this.a) : null;
    }

    public wb_0 A(Icon icon) {
        this.H(xg_0.i(icon));
        return this;
    }

    public wb_0 o(ImageIcon imageIcon) {
        this.t(imageIcon.getImage());
        return this;
    }

    public wb_0 t(Image image) {
        this.H(xg_0.v(image));
        return this;
    }

    public wb_0 H(BufferedImage bufferedImage) {
        this.f = bufferedImage;
        String string = wb_0.m();
        wb_0 wb_02 = this;
        if (string != null) {
            if (!wb_02.isEnabled()) {
                this.c();
            }
            this.revalidate();
            this.repaint();
            wb_02 = this;
        }
        return wb_02;
    }

    public xx_0 y() {
        return this.h;
    }

    public wb_0 K(xx_0 xx_02) {
        this.h = xx_02;
        this.U();
        return this;
    }

    public int m() {
        return this.K;
    }

    public wb_0 A(int n10) {
        this.K = n10;
        this.U();
        return this;
    }

    public int h() {
        return this.C;
    }

    public wb_0 N(int n10) {
        this.C = n10;
        this.U();
        return this;
    }

    public float y() {
        return this.E;
    }

    public wb_0 i(float f10) {
        this.E = f10;
        this.U();
        return this;
    }

    protected void U() {
        block3: {
            wb_0 wb_02;
            block2: {
                String string = wb_0.m();
                wb_02 = this;
                if (string == null) break block2;
                if (!wb_02.isShowing()) break block3;
                wb_02 = this;
            }
            wb_02.repaint();
        }
    }

    public Insets x() {
        return this.b;
    }

    public wb_0 D(Insets insets) {
        this.b = insets;
        this.z();
        return this;
    }

    public wb_0 g(int n10, int n11, int n12, int n13) {
        return this.D(new Insets(n10, n11, n12, n13));
    }

    public wb_0 s(int n10) {
        return this.g(n10, n10, n10, n10);
    }

    protected void z() {
        block4: {
            wb_0 wb_02;
            block2: {
                block3: {
                    String string = wb_0.m();
                    wb_02 = this;
                    if (string == null) break block2;
                    if (wb_02.b == null) break block3;
                    this.setBorder(BorderFactory.createEmptyBorder(this.b.top, this.b.left, this.b.bottom, this.b.right));
                    if (string != null) break block4;
                }
                wb_02 = this;
            }
            wb_02.setBorder(null);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void paintComponent(Graphics var1_1) {
        block16: {
            block17: {
                block18: {
                    v0 = wb_0.m();
                    super.paintComponent(var1_1);
                    var2_2 = v0;
                    if (this.E <= 0.0f) {
                        return;
                    }
                    var3_3 = (Graphics2D)var1_1;
                    v1 = Float.valueOf(this.E);
                    cfr_temp_0 = this.E - 1.0f;
                    v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                    if (var2_2 != null) {
                        v2 = v2 < 0 ? (float)true : (float)false;
                    }
                    var4_4 = RV.a(var3_3, v1, (boolean)v2);
                    var5_5 = this.B();
                    if (var5_5 == null) break block16;
                    var6_6 = this.getInsets();
                    v3 = this.getSize().equals(this.T());
                    if (var2_2 == null) break block17;
                    if (v3 == 0) break block18;
                    var3_3.drawImage((Image)var5_5, var6_6.left, var6_6.top, null);
                    if (var2_2 != null) break block16;
                }
                v3 = aH.H[this.h.ordinal()];
            }
            if (var2_2 == null) ** GOTO lbl29
            switch (v3 ? 1 : 0) {
                case 1: {
                    v3 = this.K;
lbl29:
                    // 2 sources

                    v4 = 2;
                    if (var2_2 == null) ** GOTO lbl36
                    if (v3 != v4) ** GOTO lbl34
                    v5 = var6_6.left;
                    ** GOTO lbl43
lbl34:
                    // 1 sources

                    v3 = this.K;
                    v4 = 4;
lbl36:
                    // 2 sources

                    if (var2_2 == null) ** GOTO lbl42
                    if (v3 == v4) {
                        v5 = this.getWidth() - var5_5.getWidth() - var6_6.right;
                    } else {
                        v3 = this.G(var6_6);
                        v4 = var5_5.getWidth() / 2;
lbl42:
                        // 2 sources

                        v5 = v3 - v4;
                    }
lbl43:
                    // 3 sources

                    var7_7 = v5;
                    v6 = this.C;
                    v7 = 1;
                    if (var2_2 == null) ** GOTO lbl52
                    if (v6 != v7) ** GOTO lbl50
                    v8 = var6_6.top;
                    ** GOTO lbl59
lbl50:
                    // 1 sources

                    v6 = this.C;
                    v7 = 3;
lbl52:
                    // 2 sources

                    if (var2_2 == null) ** GOTO lbl58
                    if (v6 == v7) {
                        v8 = this.getHeight() - var5_5.getHeight() - var6_6.bottom;
                    } else {
                        v6 = this.S(var6_6);
                        v7 = var5_5.getHeight() / 2;
lbl58:
                        // 2 sources

                        v8 = v6 - v7;
                    }
lbl59:
                    // 3 sources

                    var8_10 = v8;
                    var3_3.drawImage((Image)var5_5, var7_7, var8_10, null);
                    if (var2_2 != null) break;
                }
                case 2: {
                    var7_8 = this.C(var6_6);
                    var3_3.drawImage((Image)var7_8, this.G(var6_6) - var7_8.getWidth() / 2, this.S(var6_6) - var7_8.getHeight() / 2, null);
                    if (var2_2 != null) break;
                }
                case 3: {
                    v9 = this.K;
                    v10 = 2;
                    if (var2_2 == null) ** GOTO lbl77
                    if (v9 != v10) ** GOTO lbl75
                    v11 = var6_6.left;
                    ** GOTO lbl84
lbl75:
                    // 1 sources

                    v9 = this.K;
                    v10 = 4;
lbl77:
                    // 2 sources

                    if (var2_2 == null) ** GOTO lbl83
                    if (v9 == v10) {
                        v11 = this.getWidth() - var5_5.getWidth() - var6_6.right;
                    } else {
                        v9 = this.G(var6_6);
                        v10 = var5_5.getWidth() / 2;
lbl83:
                        // 2 sources

                        v11 = v9 - v10;
                    }
lbl84:
                    // 3 sources

                    var7_9 = v11;
                    v12 = this.C;
                    v13 = 1;
                    if (var2_2 == null) ** GOTO lbl93
                    if (v12 != v13) ** GOTO lbl91
                    v14 = var6_6.top;
                    ** GOTO lbl100
lbl91:
                    // 1 sources

                    v12 = this.C;
                    v13 = 3;
lbl93:
                    // 2 sources

                    if (var2_2 == null) ** GOTO lbl99
                    if (v12 == v13) {
                        v14 = this.getHeight() - var5_5.getHeight() - var6_6.bottom;
                    } else {
                        v12 = this.S(var6_6);
                        v13 = var5_5.getHeight() / 2;
lbl99:
                        // 2 sources

                        v14 = v12 - v13;
                    }
lbl100:
                    // 3 sources

                    var8_10 = v14;
                    var3_3.setPaint(new TexturePaint(var5_5, new Rectangle2D.Double(var7_9, var8_10, var5_5.getWidth(), var5_5.getHeight())));
                    var3_3.fillRect(var6_6.left, var6_6.top, this.getWidth() - var6_6.left - var6_6.right, this.getHeight() - var6_6.top - var6_6.bottom);
                    break;
                }
            }
        }
        v15 = (cfr_temp_1 = this.E - 1.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
        if (var2_2 != null) {
            v15 = v15 < 0 ? (float)true : (float)false;
        }
        RV.E(var3_3, var4_4, (boolean)v15);
    }

    protected int G(Insets insets) {
        return insets.left + (this.getWidth() - insets.left - insets.right) / 2;
    }

    protected int S(Insets insets) {
        return insets.top + (this.getHeight() - insets.top - insets.bottom) / 2;
    }

    protected BufferedImage C(Insets insets) {
        BufferedImage bufferedImage;
        block6: {
            block7: {
                wb_0 wb_02;
                block10: {
                    block11: {
                        block12: {
                            wb_0 wb_03;
                            BufferedImage bufferedImage2;
                            Dimension dimension;
                            block8: {
                                String string;
                                block9: {
                                    wb_0 wb_04;
                                    block4: {
                                        block5: {
                                            string = wb_0.m();
                                            wb_04 = this;
                                            if (string == null) break block4;
                                            if (wb_04.f.getWidth() > this.getWidth()) break block5;
                                            bufferedImage = this.f;
                                            if (string == null) break block6;
                                            if (bufferedImage.getHeight() <= this.getHeight()) break block7;
                                        }
                                        wb_04 = this;
                                    }
                                    dimension = wb_04.getSize();
                                    dimension.setSize(dimension.width - insets.left - insets.right, dimension.height - insets.top - insets.bottom);
                                    bufferedImage2 = this.a;
                                    if (string == null) break block8;
                                    if (bufferedImage2 == null) break block9;
                                    wb_02 = this;
                                    if (string == null) break block10;
                                    if (wb_02.S == null) break block11;
                                    wb_02 = this;
                                    if (string == null) break block10;
                                    if (wb_02.S.equals(dimension)) break block11;
                                }
                                wb_03 = this;
                                if (string == null) break block12;
                                bufferedImage2 = wb_03.a;
                            }
                            if (bufferedImage2 != null) {
                                this.a.flush();
                                this.a = null;
                            }
                            this.a = xg_0.g(this.B(), dimension);
                            wb_03 = this;
                        }
                        wb_03.S = this.getSize();
                    }
                    wb_02 = this;
                }
                return wb_02.a;
            }
            bufferedImage = this.f;
        }
        return bufferedImage;
    }

    /*
     * Unable to fully structure code
     */
    protected BufferedImage B() {
        var1_1 = wb_0.m();
        v0 = this;
        if (var1_1 == null) ** GOTO lbl12
        if (v0.isEnabled()) ** GOTO lbl-1000
        v0 = this;
        if (var1_1 != null) {
            ** if (v0.r == null) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = this.r;
                ** GOTO lbl13
            }
        }
        ** GOTO lbl12
lbl-1000:
        // 2 sources

        {
            v0 = this;
lbl12:
            // 3 sources

            v1 = v0.f;
        }
lbl13:
        // 2 sources

        return v1;
    }

    @Override
    public Dimension getPreferredSize() {
        String string = wb_0.m();
        wb_0 wb_02 = this;
        if (string != null) {
            if (wb_02.isPreferredSizeSet()) {
                return super.getPreferredSize();
            }
            wb_02 = this;
        }
        return wb_02.T();
    }

    protected Dimension T() {
        Insets insets = this.getInsets();
        return new Dimension(insets.left + (this.f != null ? this.f.getWidth() : 0) + insets.right, insets.top + (this.f != null ? this.f.getHeight() : 0) + insets.bottom);
    }

    @Override
    public MouseAdapter o(O5 o5) {
        return fs_0.F(this, o5);
    }

    @Override
    public MouseAdapter j(HT hT2, O5 o5) {
        return fs_0.h(this, hT2, o5);
    }

    @Override
    public MouseAdapter e(O5 o5) {
        return fs_0.P(this, o5);
    }

    @Override
    public MouseAdapter N(O5 o5) {
        return fs_0.H(this, o5);
    }

    @Override
    public MouseAdapter a(O5 o5) {
        return fs_0.W(this, o5);
    }

    @Override
    public MouseAdapter L(HT hT2, O5 o5) {
        return fs_0.W(this, hT2, o5);
    }

    @Override
    public MouseAdapter h(O5 o5) {
        return fs_0.J(this, o5);
    }

    @Override
    public MouseAdapter d(HT hT2, O5 o5) {
        return fs_0.O((Component)this, hT2, o5);
    }

    @Override
    public MouseAdapter F(O5 o5) {
        return fs_0.q(this, o5);
    }

    @Override
    public MouseAdapter v(O5 o5) {
        return fs_0.o(this, o5);
    }

    @Override
    public KeyAdapter i(sr_0 sr_02) {
        return fs_0.G(this, sr_02);
    }

    @Override
    public KeyAdapter I(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.O((Component)this, cs_02, sr_02);
    }

    @Override
    public KeyAdapter g(sr_0 sr_02) {
        return fs_0.Q(this, sr_02);
    }

    @Override
    public KeyAdapter U(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.R(this, cs_02, sr_02);
    }

    @Override
    public KeyAdapter e(sr_0 sr_02) {
        return fs_0.u(this, sr_02);
    }

    @Override
    public KeyAdapter j(cs_0 cs_02, sr_0 sr_02) {
        return fs_0.I(this, cs_02, sr_02);
    }

    @Override
    public FocusAdapter u(az_0 az_02) {
        return fs_0.K(this, az_02);
    }

    @Override
    public FocusAdapter e(az_0 az_02) {
        return fs_0.t(this, az_02);
    }

    @Override
    public wd_0 p(String string) {
        return ac_0.I(this, string);
    }

    @Override
    public wd_0 d(Icon icon, String string) {
        return ac_0.d(this, icon, string);
    }

    @Override
    public wd_0 V(String string, WF wF) {
        return ac_0.B(this, string, wF);
    }

    @Override
    public wd_0 X(Icon icon, String string, WF wF) {
        return ac_0.g((Component)this, icon, string, wF);
    }

    @Override
    public wd_0 y(String string, WF wF, int n10) {
        return ac_0.l(this, string, wF, n10);
    }

    @Override
    public wd_0 Y(Icon icon, String string, WF wF, int n10) {
        return ac_0.R(this, icon, string, wF, n10);
    }

    @Override
    public wd_0 g(JComponent jComponent) {
        return ac_0.k(this, jComponent);
    }

    @Override
    public wd_0 I(JComponent jComponent, int n10) {
        return ac_0.o((Component)this, jComponent, n10);
    }

    @Override
    public wd_0 j(JComponent jComponent, WF wF) {
        return ac_0.R(this, jComponent, wF);
    }

    @Override
    public wd_0 g(JComponent jComponent, WF wF, int n10) {
        return ac_0.B(this, jComponent, wF, n10);
    }

    @Override
    public wd_0 s(String string) {
        return ac_0.Q((Component)this, string);
    }

    @Override
    public wd_0 u(Icon icon, String string) {
        return ac_0.o((Component)this, icon, string);
    }

    @Override
    public wd_0 u(String string, WF wF) {
        return ac_0.q(this, string, wF);
    }

    @Override
    public wd_0 h(Icon icon, String string, WF wF) {
        return ac_0.P(this, icon, string, wF);
    }

    @Override
    public wd_0 f(String string, WF wF, int n10) {
        return ac_0.r(this, string, wF, n10);
    }

    @Override
    public wd_0 o(Icon icon, String string, WF wF, int n10) {
        return ac_0.V(this, icon, string, wF, n10);
    }

    @Override
    public wd_0 B(JComponent jComponent) {
        return ac_0.Q((Component)this, jComponent);
    }

    @Override
    public wd_0 p(JComponent jComponent, int n10) {
        return ac_0.S(this, jComponent, n10);
    }

    @Override
    public wd_0 n(JComponent jComponent, WF wF) {
        return ac_0.I(this, jComponent, wF);
    }

    @Override
    public wd_0 X(JComponent jComponent, WF wF, int n10) {
        return ac_0.U(this, jComponent, wF, n10);
    }

    @Override
    public void Q(wd_0 wd_02) {
        ac_0.s(this, wd_02);
    }

    @Override
    public void O() {
        ac_0.o(this);
    }

    @Override
    public void q(wd_0[] wd_0Array) {
        ac_0.Y(this, wd_0Array);
    }

    @Override
    public void W(List list) {
        ac_0.S(this, list);
    }

    static void O(wb_0 wb_02) {
        wb_02.Y();
    }

    public static void W(String string) {
        O = string;
    }

    public static String m() {
        return O;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (wb_0.m() == null) {
                    wb_0.W("aoZJfc");
                }
                char[] cArray3 = "\\T\u0017*=[+".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 123;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 66;
                            break;
                        }
                        case 1: {
                            n17 = 65;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 51;
                            break;
                        }
                        case 4: {
                            n17 = 42;
                            break;
                        }
                        case 5: {
                            n17 = 69;
                            break;
                        }
                        default: {
                            n17 = 52;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        c = new String(cArray).intern();
    }
}

