/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.NE;
import com.RV;
import com.TT;
import com.ky_2;
import com.rj_0;
import com.yk_2;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Qm
 */
public class qm_0
extends ky_2 {
    protected String H = null;
    protected Shape Y = null;
    protected BufferedImage c = null;
    protected Point w = null;
    protected int n = 0;
    protected List U;
    protected Component F;
    protected int T;
    private static boolean s;
    private static final String a;
    private static final long[] b;
    private static final Integer[] d;

    public qm_0() {
        boolean bl = qm_0.Z();
        this.U = new ArrayList();
        this.F = this;
        this.T = qm_0.a(21387, 4310451735439962977L);
        this.setOpaque(false);
        this.setFocusable(false);
        this.setLayout(new TT());
        if (bl) {
            ky_2.K(new String[2]);
        }
    }

    public TT Q() {
        return (TT)this.getLayout();
    }

    public void U(LayoutManager layoutManager) {
        this.Q().S(layoutManager);
    }

    public void T(LayoutManager layoutManager) {
        this.Q().X(layoutManager);
    }

    public String g() {
        boolean bl = qm_0.Z();
        String string = this.H;
        if (!bl) {
            if (string == null) {
                this.H = NE.E(a);
            }
            string = this.H;
        }
        return string;
    }

    @Override
    public JRootPane getRootPane() {
        return FN.a(this);
    }

    public void b(JComponent jComponent) {
        FN.y(this, jComponent);
        this.add((Component)jComponent, 0);
        this.revalidate();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean contains(int n10, int n11) {
        boolean bl = qm_0.Z();
        Shape shape = this.Y;
        if (!bl) {
            if (shape == null) return false;
            shape = this.Y;
        }
        boolean bl2 = shape.contains(n10, n11);
        if (bl) return bl2;
        if (!bl2) return false;
        return true;
    }

    public Shape Z() {
        return this.Y;
    }

    public void U(Shape shape) {
        this.Y = shape;
    }

    public int g() {
        return this.n;
    }

    public Point X() {
        return this.w;
    }

    public BufferedImage c() {
        return this.c;
    }

    public void u(BufferedImage bufferedImage, Point point) {
        this.V(bufferedImage, point, qm_0.a(18436, 7369282829254715627L));
    }

    public void V(BufferedImage bufferedImage, Point point, int n10) {
        Rectangle rectangle;
        Rectangle rectangle2;
        boolean bl;
        Rectangle rectangle3;
        block10: {
            block7: {
                qm_0 qm_02;
                block9: {
                    block8: {
                        block6: {
                            rectangle3 = this.t();
                            this.c = bufferedImage;
                            this.w = point;
                            this.n = n10;
                            bl = qm_0.Z();
                            rectangle2 = null;
                            qm_02 = this;
                            if (bl) break block6;
                            if (qm_02.n == 0) break block7;
                            qm_02 = this;
                        }
                        if (bl) break block8;
                        if (qm_02.c == null) break block7;
                        qm_02 = this;
                    }
                    if (bl) break block9;
                    if (qm_02.w == null) break block7;
                    qm_02 = this;
                }
                rectangle2 = qm_02.t();
                rectangle = rectangle3;
                if (bl) break block10;
                if (rectangle != null) {
                    rectangle2 = new Rectangle(Math.max(0, Math.min(rectangle3.x, rectangle2.x)), Math.max(0, Math.min(rectangle3.y, rectangle2.y)), Math.max(rectangle3.x + rectangle3.width, rectangle2.x + rectangle2.width), Math.max(rectangle3.y + rectangle3.height, rectangle2.y + rectangle2.height));
                }
            }
            rectangle = rectangle2;
        }
        if (!bl) {
            rectangle = rectangle != null ? rectangle2 : rectangle3;
        }
        Rectangle rectangle4 = rectangle;
        SwingUtilities.invokeLater(new yk_2(this, rectangle4));
        if (ky_2.F() != null) {
            qm_0.d(!bl);
        }
    }

    public void K() {
        Rectangle rectangle = this.t();
        this.n = 0;
        this.c = null;
        this.w = null;
        if (rectangle != null) {
            SwingUtilities.invokeLater(new rj_0(this, rectangle));
        }
    }

    public Rectangle t() {
        Rectangle rectangle;
        block5: {
            qm_0 qm_02;
            block6: {
                boolean bl;
                block4: {
                    rectangle = null;
                    bl = qm_0.n();
                    qm_02 = this;
                    if (!bl) break block4;
                    if (qm_02.n == 0) break block5;
                    qm_02 = this;
                }
                if (!bl) break block6;
                if (qm_02.c == null) break block5;
                qm_02 = this;
            }
            if (qm_02.w != null) {
                rectangle = new Rectangle(this.w.x, this.w.y, this.c.getWidth(), this.c.getHeight());
            }
        }
        return rectangle;
    }

    public void M(Component[] componentArray) {
        qm_0 qm_02;
        block4: {
            Component[] componentArray2 = componentArray;
            int n10 = componentArray2.length;
            boolean bl = qm_0.Z();
            int n11 = 0;
            while (n11 < n10) {
                Component component = componentArray2[n11];
                if (!bl) {
                    qm_02 = this;
                    if (bl) break block4;
                    if (!qm_02.U.contains(component)) {
                        this.U.add(component);
                    }
                    ++n11;
                }
                if (!bl) continue;
            }
            qm_02 = this;
        }
        qm_02.repaint();
    }

    public void N(List list) {
        qm_0 qm_02;
        block3: {
            Iterator iterator = list.iterator();
            boolean bl = qm_0.Z();
            while (iterator.hasNext()) {
                Component component = (Component)iterator.next();
                qm_02 = this;
                if (!bl) {
                    boolean bl2 = qm_02.U.contains(component);
                    if (!bl && !bl2) {
                        bl2 = this.U.add(component);
                    }
                    if (!bl) continue;
                }
                break block3;
            }
            qm_02 = this;
        }
        qm_02.repaint();
    }

    public void C(Component[] componentArray) {
        block2: {
            Component[] componentArray2 = componentArray;
            boolean bl = qm_0.n();
            for (Component component : componentArray2) {
                this.U.remove(component);
                if (bl) {
                    if (bl) continue;
                }
                break block2;
            }
            this.repaint();
        }
    }

    public void q(List list) {
        block2: {
            Iterator iterator = list.iterator();
            boolean bl = qm_0.Z();
            while (iterator.hasNext()) {
                Component component = (Component)iterator.next();
                this.U.remove(component);
                if (!bl) {
                    if (!bl) continue;
                }
                break block2;
            }
            this.repaint();
        }
    }

    public void w() {
        this.U.clear();
        this.repaint();
    }

    public Component H() {
        return this.F;
    }

    public void a(Component component) {
        this.F = component;
    }

    public int l() {
        return this.T;
    }

    public void v(int n10) {
        this.T = n10;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        block17: {
            Object object;
            Graphics2D graphics2D;
            block14: {
                int n10;
                int n11;
                Object object2;
                block16: {
                    qm_0 qm_02;
                    boolean bl;
                    block15: {
                        block13: {
                            int n12;
                            block9: {
                                block10: {
                                    super.paintComponent(graphics);
                                    graphics2D = (Graphics2D)graphics;
                                    object = RV.X(graphics2D);
                                    bl = qm_0.n();
                                    n12 = this.U.size();
                                    if (!bl) break block9;
                                    if (n12 <= 0) break block10;
                                    object2 = FN.J(this.F, this);
                                    Area area = new Area(new Rectangle(((Rectangle)object2).x - 1, ((Rectangle)object2).y - 1, ((Rectangle)object2).width + 1, ((Rectangle)object2).height + 1));
                                    Iterator iterator = this.U.iterator();
                                    while (iterator.hasNext()) {
                                        block12: {
                                            Component component;
                                            block11: {
                                                Component component2;
                                                component = component2 = (Component)iterator.next();
                                                if (!bl) break block11;
                                                n12 = component.isShowing() ? 1 : 0;
                                                if (!bl) break block9;
                                                if (n12 == 0) break block12;
                                                component = component2;
                                            }
                                            Rectangle rectangle = FN.J(component, this);
                                            RoundRectangle2D.Double double_ = new RoundRectangle2D.Double(rectangle.x - this.T, rectangle.y - this.T, rectangle.width + this.T * 2 - 1, rectangle.height + this.T * 2 - 1, 8.0, 8.0);
                                            area.subtract(new Area(double_));
                                        }
                                        if (bl) continue;
                                    }
                                    graphics2D.setPaint(new Color(qm_0.a(27997, 8817442694465473969L), qm_0.a(16261, 889085585787658088L), qm_0.a(16261, 889085585787658088L), qm_0.a(16261, 889085585787658088L)));
                                    graphics2D.fill(area);
                                    graphics2D.setStroke(new BasicStroke(1.5f));
                                    graphics2D.setPaint(Color.GRAY);
                                    graphics2D.draw(area);
                                }
                                qm_02 = this;
                                if (!bl) break block13;
                                n12 = qm_02.n;
                            }
                            if (n12 == 0) break block14;
                            qm_02 = this;
                        }
                        if (!bl) break block15;
                        if (qm_02.c == null) break block14;
                        qm_02 = this;
                    }
                    if (qm_02.w == null) break block14;
                    object2 = graphics2D.getComposite();
                    n11 = this.n;
                    n10 = qm_0.a(13655, 6594421190855693753L);
                    if (!bl) break block16;
                    if (n11 != n10) {
                        graphics2D.setComposite(AlphaComposite.getInstance(3, (float)this.n / 100.0f));
                    }
                    graphics2D.drawImage((Image)this.c, this.w.x, this.w.y, null);
                    if (!bl) break block17;
                    n11 = this.n;
                    n10 = qm_0.a(13655, 6594421190855693753L);
                }
                if (n11 != n10) {
                    graphics2D.setComposite((Composite)object2);
                }
            }
            RV.X(graphics2D, object);
        }
    }

    public static void d(boolean bl) {
        s = bl;
    }

    public static boolean n() {
        return s;
    }

    public static boolean Z() {
        boolean bl = qm_0.n();
        return !bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    if (!qm_0.Z()) break block20;
                    qm_0.d(true);
                    break block20;
lbl4:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "7+w".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 119;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl57
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 23;
                                break;
                            }
                            case 1: {
                                v9 = 27;
                                break;
                            }
                            case 2: {
                                v9 = 80;
                                break;
                            }
                            case 3: {
                                v9 = 29;
                                break;
                            }
                            case 4: {
                                v9 = 60;
                                break;
                            }
                            case 5: {
                                v9 = 70;
                                break;
                            }
                            default: {
                                v9 = 90;
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
lbl57:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                qm_0.a = new String(v10).intern();
                var0_1 = 7074391755411320242L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "D\u009e\u00f8\u00e6\u00bb}xo\u001a\u0081\u00a6\u00e2\u00b8\"\u0085=\u00e1h\u00b1c1\u00c4 \u0083";
                var5_5 = "D\u009e\u00f8\u00e6\u00bb}xo\u001a\u0081\u00a6\u00e2\u00b8\"\u0085=\u00e1h\u00b1c1\u00c4 \u0083".length();
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
lbl78:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "b\u0082x!\u00ec\u00f5rZ\u00b1G@<\u00dfc\u001e\u00d0";
                    var5_5 = "b\u0082x!\u00ec\u00f5rZ\u00b1G@<\u00dfc\u001e\u00d0".length();
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
lbl91:
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
lbl102:
                // 1 sources

                ** continue;
            }
        }
        qm_0.b = var6_2;
        qm_0.d = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x20EE;
        if (d[n11] == null) {
            qm_0.d[n11] = (int)(b[n11] ^ l2);
        }
        return d[n11];
    }
}

