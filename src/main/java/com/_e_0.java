/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.OA;
import com.RV;
import com.ky_2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com._e
 */
public class _e_0
extends JComponent {
    protected ImageIcon A;
    protected String z;
    protected ActionListener N;
    protected Insets i;
    protected Insets y;
    protected boolean n;
    protected Color d;
    protected Color p;
    protected Color s;
    protected Color B;
    protected Color e;
    protected int h;
    private boolean R;
    private static int[] P;
    private static final long[] a;
    private static final Integer[] b;

    public _e_0() {
        this.i = new Insets(4, 4, 4, _e_0.a(31996, 4209603805591045284L));
        this.y = new Insets(3, _e_0.a(29034, 6368618771843352880L), 3, _e_0.a(29034, 6368618771843352880L));
        this.n = true;
        this.d = new Color(_e_0.a(8263, 9150545150521759748L), _e_0.a(12572, 5788890216637843778L), _e_0.a(21327, 5471555118541941529L));
        this.p = new Color(_e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(3621, 2751923881239967335L));
        this.s = new Color(_e_0.a(17170, 2800213068652526418L), _e_0.a(31813, 8118117811896353816L), _e_0.a(4969, 3738533369566292774L));
        this.B = new Color(_e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(5027, 2965200349191891952L));
        this.e = new Color(0, 0, 0, _e_0.a(21259, 8534173832681532249L));
        this.h = _e_0.a(8109, 429707904663283680L);
        this.J();
    }

    public _e_0(ImageIcon imageIcon) {
        this.i = new Insets(4, 4, 4, _e_0.a(31996, 4209603805591045284L));
        this.y = new Insets(3, _e_0.a(29034, 6368618771843352880L), 3, _e_0.a(29034, 6368618771843352880L));
        this.n = true;
        this.d = new Color(_e_0.a(8263, 9150545150521759748L), _e_0.a(12572, 5788890216637843778L), _e_0.a(21327, 5471555118541941529L));
        this.p = new Color(_e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(3621, 2751923881239967335L));
        this.s = new Color(_e_0.a(17170, 2800213068652526418L), _e_0.a(31813, 8118117811896353816L), _e_0.a(4969, 3738533369566292774L));
        this.B = new Color(_e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(5027, 2965200349191891952L));
        this.e = new Color(0, 0, 0, _e_0.a(21259, 8534173832681532249L));
        this.h = _e_0.a(8109, 429707904663283680L);
        int[] nArray = _e_0.P();
        this.A = imageIcon;
        this.J();
        if (ky_2.F() != null) {
            _e_0.e(new int[3]);
        }
    }

    public _e_0(ImageIcon imageIcon, ActionListener actionListener) {
        this.i = new Insets(4, 4, 4, _e_0.a(18058, 3656411442400181971L));
        this.y = new Insets(3, _e_0.a(32123, 6135835961800000807L), 3, _e_0.a(29034, 6368618771843352880L));
        this.n = true;
        int[] nArray = _e_0.P();
        this.d = new Color(_e_0.a(13726, 3376026729723710938L), _e_0.a(24799, 7034515197463894163L), _e_0.a(17577, 2355875256826838262L));
        this.p = new Color(_e_0.a(1927, 4478507602143084496L), _e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(7008, 5230654407978050356L));
        this.s = new Color(_e_0.a(29909, 9051301750686026885L), _e_0.a(21044, 6808793299825109619L), _e_0.a(13865, 2084936288226233960L));
        this.B = new Color(_e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(11641, 1635284185339581736L), _e_0.a(31911, 1676321222026364130L));
        this.e = new Color(0, 0, 0, _e_0.a(16340, 148704197817059218L));
        this.h = _e_0.a(31401, 3148976542452089586L);
        this.A = imageIcon;
        this.N = actionListener;
        this.J();
        if (nArray != null) {
            ky_2.K(new String[4]);
        }
    }

    private void J() {
        this.setOpaque(false);
        this.setBackground(new Color(0, 0, 0, _e_0.a(32198, 300269046934799763L)));
        this.setForeground(Color.WHITE);
        this.setFont(FN.V());
        FN.u(this);
        FN.K(this, 2);
        OA oA = new OA(this);
        this.addMouseListener(oA);
        this.addMouseMotionListener(oA);
    }

    public ImageIcon h() {
        return this.A;
    }

    public void c(ImageIcon imageIcon) {
        this.A = imageIcon;
    }

    public String W() {
        return this.z;
    }

    public void h(String string) {
        this.z = string;
    }

    public ActionListener V() {
        return this.N;
    }

    public void H(ActionListener actionListener) {
        this.N = actionListener;
    }

    public Insets V() {
        return this.i;
    }

    public void p(Insets insets) {
        this.i = insets;
    }

    public void Q(int n10) {
        this.i = new Insets(n10, n10, n10, n10);
    }

    public void H(int n10, int n11, int n12, int n13) {
        this.i = new Insets(n10, n11, n12, n13);
    }

    public boolean f() {
        return this.n;
    }

    public void D(boolean bl) {
        this.n = bl;
    }

    public Color p() {
        return this.d;
    }

    public void q(Color color) {
        this.d = color;
    }

    public Color h() {
        return this.p;
    }

    public void f(Color color) {
        this.p = color;
    }

    public Color y() {
        return this.s;
    }

    public void b(Color color) {
        this.s = color;
    }

    public Color G() {
        return this.B;
    }

    public void d(Color color) {
        this.B = color;
    }

    public Color K() {
        return this.e;
    }

    public void R(Color color) {
        this.e = color;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void paintComponent(Graphics var1_1) {
        block9: {
            block6: {
                block7: {
                    block8: {
                        v0 = _e_0.P();
                        super.paintComponent(var1_1);
                        var2_2 = v0;
                        var3_3 = (Graphics2D)var1_1;
                        var4_4 = RV.X(var3_3);
                        var5_5 = this.getHeight();
                        var6_6 = var5_5 - this.i.top - this.i.bottom;
                        v1 = this;
                        if (var2_2 != null) break block6;
                        if (v1.A == null) break block7;
                        v2 = this.f();
                        if (var2_2 != null) break block7;
                        if (!v2) break block8;
                        var7_7 = new Area(new Ellipse2D.Double(0.0, 0.0, var5_5, var5_5));
                        var8_8 = new Ellipse2D.Double(2.0, 2.0, var5_5 - 4, var5_5 - 4);
                        var7_7.exclusiveOr(new Area(var8_8));
                        v3 = this;
                        if (var2_2 != null) ** GOTO lbl23
                        if (v3.isEnabled()) {
                            v4 = this.p();
                        } else {
                            v3 = this;
lbl23:
                            // 2 sources

                            v4 = v3.y();
                        }
                        var3_3.setColor(v4);
                        var3_3.fill((Shape)var7_7);
                        v5 = this;
                        if (var2_2 != null) ** GOTO lbl32
                        if (v5.isEnabled()) {
                            v6 = this.h();
                        } else {
                            v5 = this;
lbl32:
                            // 2 sources

                            v6 = v5.G();
                        }
                        var3_3.setPaint(v6);
                        var3_3.fill(var8_8);
                    }
                    v2 = var3_3.drawImage(this.A.getImage(), this.i.left + var6_6 / 2 - this.A.getIconWidth() / 2, this.i.top + var6_6 / 2 - this.A.getIconHeight() / 2, null);
                }
                v1 = this;
            }
            if (v1.z == null) break block9;
            var3_3.setFont(this.getFont());
            var7_7 = var3_3.getFontMetrics();
            var8_9 = var7_7.stringWidth(this.z);
            var9_10 = var7_7.getHeight();
            var10_11 = GA.d((FontMetrics)var7_7);
            var11_12 = this.i.left + var6_6 + this.h;
            var12_13 = this.i.top + var6_6 / 2 - var9_10 / 2 - this.y.top;
            var13_14 = new Rectangle(var11_12, var12_13, this.y.left + var8_9 + this.y.right, this.y.top + var9_10 + this.y.bottom);
            v7 = this;
            if (var2_2 != null) ** GOTO lbl55
            if (v7.R) {
                v8 = this.K();
            } else {
                v7 = this;
lbl55:
                // 2 sources

                v8 = v7.getBackground();
            }
            var3_3.setPaint(v8);
            var3_3.fillRoundRect(var13_14.x, var13_14.y, var13_14.width, var13_14.height, _e_0.a(29034, 6368618771843352880L), _e_0.a(29034, 6368618771843352880L));
            var14_15 = var13_14.height - this.y.top - this.y.bottom;
            var3_3.setPaint(this.getForeground());
            var3_3.drawString(this.z, var13_14.x + this.y.left, var13_14.y + this.y.top + var14_15 / 2 + var10_11);
        }
        RV.X(var3_3, var4_4);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension;
        block10: {
            _e_0 _e_02;
            block9: {
                String string;
                block8: {
                    int[] nArray;
                    block6: {
                        block7: {
                            ImageIcon imageIcon;
                            block5: {
                                dimension = new Dimension();
                                nArray = _e_0.P();
                                imageIcon = this.A;
                                if (nArray != null) break block5;
                                if (imageIcon != null) {
                                    dimension.width += this.A.getIconWidth();
                                    dimension.height = this.A.getIconHeight();
                                }
                                _e_02 = this;
                                if (nArray != null) break block6;
                                imageIcon = _e_02.A;
                            }
                            if (imageIcon == null) break block7;
                            string = this.z;
                            if (nArray != null) break block8;
                            if (string != null) {
                                dimension.width += this.h;
                            }
                        }
                        _e_02 = this;
                    }
                    if (nArray != null) break block9;
                    string = _e_02.z;
                }
                if (string == null) break block10;
                _e_02 = this;
            }
            FontMetrics fontMetrics = _e_02.getFontMetrics(this.getFont());
            int n10 = fontMetrics.stringWidth(this.z);
            int n11 = fontMetrics.getHeight();
            dimension.width += this.y.left + n10 + this.y.right;
            dimension.height = Math.max(dimension.height, n11);
        }
        dimension.width += this.i.left + this.i.right;
        dimension.height += this.i.top + this.i.bottom;
        return dimension;
    }

    static boolean P(_e_0 _e_02, boolean bl) {
        _e_02.R = bl;
        return _e_02.R;
    }

    public static void e(int[] nArray) {
        P = nArray;
    }

    public static int[] P() {
        return P;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2508603942753401711L;
                var6_1 = new long[27];
                var3_2 = 0;
                var4_3 = "\u0010UZ\u007f\u00dem\u00fe4\\3y\u00b6#\u00a9\u0018\u0087\u0011\u008c\u009a\u00154j\u0004@,v\u0016\u00c0\u00a0\\P\u00a8\u00cc\u001a\u00c0P\u00c4\u000f.\u00b8\u00b2\u00c6\u00c2K-v\u00f7\u007f\u00f8\u009d\u00da\u0005t\u0087\u0090+ L8K-\u009fP\u00a0]\u009cc\u00b9\u00cf/\u007f\u00e0k\u00d2\u00c6\u00af\u00fe\u00dd\u00feN}\u00ce\u00da~\u00c3\u00beGG\u00c2\u00c3OF\u0087\u009b2W\u00f2\u008ea\u00af1\u001aE\u00b4\u00f6\u00dc\u00c0n<\u0096\u00ff\u00c3\u0085\u009fY\u00f8\u0093\u0010\u00f9\u0098\u008d\u00e0Xk|nrY2!\u00bd(\u00b1\u00a1\u007f9\u00c9\r\u0006\u00ae\u00d0\u00926\u00ecd\u008b@\u0010(\u00d7Q\u008bt+\u00d5l\u00be\u008b<kj\u00aa\u00f0\u00cf^\u00fe5\u00ad\u00a5\u009e\u0018K\u008d\u0085@\u00a8\u00a6E\by\u0087\u00f0#2\u00f6y\u009b('\u00cd\r\u00d4\u000f\u00a0\u001f\u0099\u00afT\u001c\u008a";
                var5_4 = "\u0010UZ\u007f\u00dem\u00fe4\\3y\u00b6#\u00a9\u0018\u0087\u0011\u008c\u009a\u00154j\u0004@,v\u0016\u00c0\u00a0\\P\u00a8\u00cc\u001a\u00c0P\u00c4\u000f.\u00b8\u00b2\u00c6\u00c2K-v\u00f7\u007f\u00f8\u009d\u00da\u0005t\u0087\u0090+ L8K-\u009fP\u00a0]\u009cc\u00b9\u00cf/\u007f\u00e0k\u00d2\u00c6\u00af\u00fe\u00dd\u00feN}\u00ce\u00da~\u00c3\u00beGG\u00c2\u00c3OF\u0087\u009b2W\u00f2\u008ea\u00af1\u001aE\u00b4\u00f6\u00dc\u00c0n<\u0096\u00ff\u00c3\u0085\u009fY\u00f8\u0093\u0010\u00f9\u0098\u008d\u00e0Xk|nrY2!\u00bd(\u00b1\u00a1\u007f9\u00c9\r\u0006\u00ae\u00d0\u00926\u00ecd\u008b@\u0010(\u00d7Q\u008bt+\u00d5l\u00be\u008b<kj\u00aa\u00f0\u00cf^\u00fe5\u00ad\u00a5\u009e\u0018K\u008d\u0085@\u00a8\u00a6E\by\u0087\u00f0#2\u00f6y\u009b('\u00cd\r\u00d4\u000f\u00a0\u001f\u0099\u00afT\u001c\u008a".length();
                var2_5 = 0;
                _e_0.e(null);
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "T\u00e6%t\u009e\u0019\u00e3\u0086\u0001\u00bfe\u00dbh\u0004\u0090\u00e3";
                    var5_4 = "T\u00e6%t\u009e\u0019\u00e3\u0086\u0001\u00bfe\u00dbh\u0004\u0090\u00e3".length();
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
lbl28:
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
lbl39:
                // 1 sources

                ** continue;
            }
        }
        _e_0.a = var6_1;
        _e_0.b = new Integer[27];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7855;
        if (b[n11] == null) {
            _e_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

