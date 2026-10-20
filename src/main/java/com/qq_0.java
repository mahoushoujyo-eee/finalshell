/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FE;
import com.FN;
import com.GA;
import com.KD;
import com.KU;
import com.LL;
import com.NC;
import com.QX;
import com.YH;
import com.dw_1;
import com.fy_0;
import com.ih_2;
import com.ix_1;
import com.ky_2;
import com.o_0;
import com.xr_1;
import com.yj_0;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from com.Qq
 */
public class qq_0
extends QX {
    private static final List k;
    private YH e;
    private final KD l;
    private final KD G;
    private final ky_2 m;
    private static final String[] a;
    private static final String[] d;
    private static final long[] j;
    private static final Integer[] n;

    public qq_0(KD kD, YH yH) {
        this.e = yH;
        this.l = kD;
        this.U(true);
        this.setFocusCycleRoot(false);
        String[] stringArray = QX.Y();
        this.L(new yj_0(this));
        this.G = this.H(kD);
        this.G.addActionListener(new LL(this));
        kD.addActionListener(new dw_1(this));
        kD.addPropertyChangeListener(new xr_1(this, kD));
        kD.addHierarchyListener(new o_0(this));
        kD.addAncestorListener(new fy_0(this));
        String[] stringArray2 = stringArray;
        kD.addComponentListener(new ih_2(this));
        this.m = new ky_2();
        this.m.setOpaque(false);
        this.m.setFocusCycleRoot(true);
        this.b();
        this.addAncestorListener(new FE(this));
        if (stringArray2 != null) {
            ky_2.K(new String[2]);
        }
    }

    private void b() {
        qq_0 qq_02;
        block51: {
            block46: {
                boolean bl;
                int n10;
                block49: {
                    String[] stringArray;
                    block50: {
                        block47: {
                            block48: {
                                block44: {
                                    block45: {
                                        int n11;
                                        block43: {
                                            block40: {
                                                block41: {
                                                    block42: {
                                                        block38: {
                                                            block39: {
                                                                block37: {
                                                                    block34: {
                                                                        block35: {
                                                                            block36: {
                                                                                block32: {
                                                                                    block33: {
                                                                                        block31: {
                                                                                            block28: {
                                                                                                block29: {
                                                                                                    block30: {
                                                                                                        block26: {
                                                                                                            block27: {
                                                                                                                block25: {
                                                                                                                    block22: {
                                                                                                                        block23: {
                                                                                                                            block24: {
                                                                                                                                block20: {
                                                                                                                                    block21: {
                                                                                                                                        String[] stringArray2 = QX.Y();
                                                                                                                                        this.removeAll();
                                                                                                                                        stringArray = stringArray2;
                                                                                                                                        n11 = this.e.equals((Object)YH.downLeft);
                                                                                                                                        if (stringArray != null) break block20;
                                                                                                                                        if (n11 == 0) break block21;
                                                                                                                                        this.setLayout(new ix_1(new double[][]{{-1.0, -2.0}, {-2.0, -2.0}}));
                                                                                                                                        this.add((Component)this.G, qq_0.b(-26119, -655));
                                                                                                                                        this.add((Component)this.m, qq_0.b(-26141, -4602));
                                                                                                                                        if (stringArray == null) break block22;
                                                                                                                                    }
                                                                                                                                    n11 = this.e.equals((Object)YH.downCenter);
                                                                                                                                }
                                                                                                                                if (stringArray != null) break block23;
                                                                                                                                if (n11 == 0) break block24;
                                                                                                                                this.setLayout(new ix_1(new double[][]{{-1.0, -2.0, -1.0}, {-2.0, -2.0}}));
                                                                                                                                this.add((Component)this.G, qq_0.b(-26123, 16756));
                                                                                                                                this.add((Component)this.m, qq_0.b(-26131, 12908));
                                                                                                                                if (stringArray == null) break block22;
                                                                                                                            }
                                                                                                                            n11 = this.e.equals((Object)YH.downRight);
                                                                                                                        }
                                                                                                                        if (stringArray != null) break block25;
                                                                                                                        if (n11 != 0) {
                                                                                                                            this.setLayout(new ix_1(new double[][]{{-2.0, -1.0}, {-2.0, -2.0}}));
                                                                                                                            this.add((Component)this.G, qq_0.b(-26126, -15592));
                                                                                                                            this.add((Component)this.m, qq_0.b(-26113, -29334));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    n11 = this.e.equals((Object)YH.upLeft);
                                                                                                                }
                                                                                                                if (stringArray != null) break block26;
                                                                                                                if (n11 == 0) break block27;
                                                                                                                this.setLayout(new ix_1(new double[][]{{-1.0, -2.0}, {-2.0, -2.0}}));
                                                                                                                this.add((Component)this.G, qq_0.b(-26132, 26404));
                                                                                                                this.add((Component)this.m, qq_0.b(-26137, -24783));
                                                                                                                if (stringArray == null) break block28;
                                                                                                            }
                                                                                                            n11 = this.e.equals((Object)YH.upCenter);
                                                                                                        }
                                                                                                        if (stringArray != null) break block29;
                                                                                                        if (n11 == 0) break block30;
                                                                                                        this.setLayout(new ix_1(new double[][]{{-1.0, -2.0, -1.0}, {-2.0, -2.0}}));
                                                                                                        this.add((Component)this.G, qq_0.b(-26116, 11296));
                                                                                                        this.add((Component)this.m, qq_0.b(-26114, 17971));
                                                                                                        if (stringArray == null) break block28;
                                                                                                    }
                                                                                                    n11 = this.e.equals((Object)YH.upRight);
                                                                                                }
                                                                                                if (stringArray != null) break block31;
                                                                                                if (n11 != 0) {
                                                                                                    this.setLayout(new ix_1(new double[][]{{-2.0, -1.0}, {-2.0, -2.0}}));
                                                                                                    this.add((Component)this.G, qq_0.b(-26117, 15384));
                                                                                                    this.add((Component)this.m, qq_0.b(-26142, -2517));
                                                                                                }
                                                                                            }
                                                                                            n11 = this.e.equals((Object)YH.leftUp);
                                                                                        }
                                                                                        if (stringArray != null) break block32;
                                                                                        if (n11 == 0) break block33;
                                                                                        this.setLayout(new ix_1(new double[][]{{-2.0, -2.0}, {-1.0, -2.0}}));
                                                                                        this.add((Component)this.G, qq_0.b(-26116, 11296));
                                                                                        this.add((Component)this.m, qq_0.b(-26124, 6510));
                                                                                        if (stringArray == null) break block34;
                                                                                    }
                                                                                    n11 = this.e.equals((Object)YH.leftCenter);
                                                                                }
                                                                                if (stringArray != null) break block35;
                                                                                if (n11 == 0) break block36;
                                                                                this.setLayout(new ix_1(new double[][]{{-2.0, -2.0}, {-1.0, -2.0, -1.0}}));
                                                                                this.add((Component)this.G, qq_0.b(-26116, 11296));
                                                                                this.add((Component)this.m, qq_0.b(-26120, -10062));
                                                                                if (stringArray == null) break block34;
                                                                            }
                                                                            n11 = this.e.equals((Object)YH.leftDown);
                                                                        }
                                                                        if (stringArray != null) break block37;
                                                                        if (n11 != 0) {
                                                                            this.setLayout(new ix_1(new double[][]{{-2.0, -2.0}, {-2.0, -1.0}}));
                                                                            this.add((Component)this.G, qq_0.b(-26123, 16756));
                                                                            this.add((Component)this.m, qq_0.b(-26140, -30096));
                                                                        }
                                                                    }
                                                                    n11 = this.e.equals((Object)YH.rightUp);
                                                                }
                                                                if (stringArray != null) break block38;
                                                                if (n11 == 0) break block39;
                                                                this.setLayout(new ix_1(new double[][]{{-2.0, -2.0}, {-1.0, -2.0}}));
                                                                this.add((Component)this.G, qq_0.b(-26144, -997));
                                                                this.add((Component)this.m, qq_0.b(-26118, 2460));
                                                                if (stringArray == null) break block40;
                                                            }
                                                            n11 = this.e.equals((Object)YH.rightCenter);
                                                        }
                                                        if (stringArray != null) break block41;
                                                        if (n11 == 0) break block42;
                                                        this.setLayout(new ix_1(new double[][]{{-2.0, -2.0}, {-1.0, -2.0, -1.0}}));
                                                        this.add((Component)this.G, qq_0.b(-26144, -997));
                                                        this.add((Component)this.m, qq_0.b(-26122, -21870));
                                                        if (stringArray == null) break block40;
                                                    }
                                                    n11 = this.e.equals((Object)YH.rightDown);
                                                }
                                                if (stringArray != null) break block43;
                                                if (n11 != 0) {
                                                    this.setLayout(new ix_1(new double[][]{{-2.0, -2.0}, {-2.0, -1.0}}));
                                                    this.add((Component)this.G, qq_0.b(-26115, 31059));
                                                    this.add((Component)this.m, qq_0.b(-26127, -31483));
                                                }
                                            }
                                            n11 = this.l.q() + 1;
                                        }
                                        n10 = n11;
                                        bl = this.Y();
                                        if (stringArray != null) break block44;
                                        if (!bl) break block45;
                                        this.m.b(new Insets(0, n10, n10, n10));
                                        if (stringArray == null) break block46;
                                    }
                                    bl = this.M();
                                }
                                if (stringArray != null) break block47;
                                if (!bl) break block48;
                                this.m.b(new Insets(n10, n10, 0, n10));
                                if (stringArray == null) break block46;
                            }
                            bl = this.Z();
                        }
                        if (stringArray != null) break block49;
                        if (!bl) break block50;
                        this.m.b(new Insets(n10, n10, n10, 0));
                        if (stringArray == null) break block46;
                    }
                    qq_02 = this;
                    if (stringArray != null) break block51;
                    bl = qq_02.Q();
                }
                if (bl) {
                    this.m.b(new Insets(n10, 0, n10, n10));
                }
            }
            qq_02 = this;
        }
        qq_02.revalidate();
    }

    @Override
    public void j(boolean bl) {
        super.j(bl);
        this.repaint();
    }

    public void Q(Component component) {
        this.m.removeAll();
        this.m.add(component);
        this.m.revalidate();
    }

    public YH L() {
        return this.e;
    }

    public void g(YH yH) {
        this.e = yH;
        this.b();
        this.R();
    }

    private KD H(KD kD) {
        KU kU = new KU(this, kD);
        this.V(kD, kU);
        kU.setFocusable(true);
        kU.G(true);
        kU.setCursor(kD.getCursor());
        return kU;
    }

    private void V(KD kD, KD kD2) {
        kD2.setFont(kD.getFont());
        kD2.setIcon(kD.getIcon());
        kD2.setText(kD.getText());
        kD2.setIconTextGap(kD.getIconTextGap());
        kD2.setHorizontalAlignment(kD.getHorizontalAlignment());
        kD2.setVerticalAlignment(kD.getVerticalAlignment());
        kD2.setHorizontalTextPosition(kD.getHorizontalTextPosition());
        kD2.setVerticalTextPosition(kD.getVerticalTextPosition());
        kD2.setBorder(kD.getBorder());
    }

    @Override
    public void R() {
        block5: {
            qq_0 qq_02;
            block30: {
                block9: {
                    boolean bl;
                    Dimension dimension;
                    Point point;
                    block28: {
                        String[] stringArray;
                        block29: {
                            block26: {
                                block27: {
                                    block24: {
                                        block25: {
                                            block22: {
                                                block23: {
                                                    block20: {
                                                        block21: {
                                                            block18: {
                                                                block19: {
                                                                    block16: {
                                                                        block17: {
                                                                            block14: {
                                                                                block15: {
                                                                                    block12: {
                                                                                        block13: {
                                                                                            block10: {
                                                                                                block11: {
                                                                                                    block7: {
                                                                                                        block8: {
                                                                                                            KD kD;
                                                                                                            block6: {
                                                                                                                boolean bl2;
                                                                                                                block4: {
                                                                                                                    stringArray = QX.Y();
                                                                                                                    bl2 = this.isShowing();
                                                                                                                    if (stringArray != null) break block4;
                                                                                                                    if (!bl2) break block5;
                                                                                                                    kD = this.l;
                                                                                                                    if (stringArray != null) break block6;
                                                                                                                    bl2 = kD.isShowing();
                                                                                                                }
                                                                                                                if (!bl2) break block5;
                                                                                                                kD = this.l;
                                                                                                            }
                                                                                                            point = FN.n(kD, this.getParent());
                                                                                                            dimension = this.getPreferredSize();
                                                                                                            bl = this.e.equals((Object)YH.downLeft);
                                                                                                            if (stringArray != null) break block7;
                                                                                                            if (!bl) break block8;
                                                                                                            this.setBounds(new Rectangle(new Point(point.x + this.l.getWidth() - dimension.width, point.y), dimension));
                                                                                                            if (stringArray == null) break block9;
                                                                                                        }
                                                                                                        bl = this.e.equals((Object)YH.downCenter);
                                                                                                    }
                                                                                                    if (stringArray != null) break block10;
                                                                                                    if (!bl) break block11;
                                                                                                    this.setBounds(new Rectangle(new Point(point.x + this.l.getWidth() / 2 - dimension.width / 2, point.y), dimension));
                                                                                                    if (stringArray == null) break block9;
                                                                                                }
                                                                                                bl = this.e.equals((Object)YH.downRight);
                                                                                            }
                                                                                            if (stringArray != null) break block12;
                                                                                            if (!bl) break block13;
                                                                                            this.setBounds(new Rectangle(point, dimension));
                                                                                            if (stringArray == null) break block9;
                                                                                        }
                                                                                        bl = this.e.equals((Object)YH.upLeft);
                                                                                    }
                                                                                    if (stringArray != null) break block14;
                                                                                    if (!bl) break block15;
                                                                                    this.setBounds(new Rectangle(new Point(point.x + this.l.getWidth() - dimension.width, point.y + this.l.getHeight() - dimension.height), dimension));
                                                                                    if (stringArray == null) break block9;
                                                                                }
                                                                                bl = this.e.equals((Object)YH.upCenter);
                                                                            }
                                                                            if (stringArray != null) break block16;
                                                                            if (!bl) break block17;
                                                                            this.setBounds(new Rectangle(new Point(point.x + this.l.getWidth() / 2 - dimension.width / 2, point.y + this.l.getHeight() - dimension.height), dimension));
                                                                            if (stringArray == null) break block9;
                                                                        }
                                                                        bl = this.e.equals((Object)YH.upRight);
                                                                    }
                                                                    if (stringArray != null) break block18;
                                                                    if (!bl) break block19;
                                                                    this.setBounds(new Rectangle(new Point(point.x, point.y + this.l.getHeight() - dimension.height), dimension));
                                                                    if (stringArray == null) break block9;
                                                                }
                                                                bl = this.e.equals((Object)YH.leftUp);
                                                            }
                                                            if (stringArray != null) break block20;
                                                            if (!bl) break block21;
                                                            this.setBounds(new Rectangle(new Point(point.x + this.l.getWidth() - dimension.width, point.y + this.l.getHeight() - dimension.height), dimension));
                                                            if (stringArray == null) break block9;
                                                        }
                                                        bl = this.e.equals((Object)YH.leftCenter);
                                                    }
                                                    if (stringArray != null) break block22;
                                                    if (!bl) break block23;
                                                    this.setBounds(new Rectangle(new Point(point.x + this.l.getWidth() - dimension.width, point.y + this.l.getHeight() / 2 - dimension.height / 2), dimension));
                                                    if (stringArray == null) break block9;
                                                }
                                                bl = this.e.equals((Object)YH.leftDown);
                                            }
                                            if (stringArray != null) break block24;
                                            if (!bl) break block25;
                                            this.setBounds(new Rectangle(new Point(point.x + this.l.getWidth() - dimension.width, point.y), dimension));
                                            if (stringArray == null) break block9;
                                        }
                                        bl = this.e.equals((Object)YH.rightUp);
                                    }
                                    if (stringArray != null) break block26;
                                    if (!bl) break block27;
                                    this.setBounds(new Rectangle(new Point(point.x, point.y + this.l.getHeight() - dimension.height), dimension));
                                    if (stringArray == null) break block9;
                                }
                                bl = this.e.equals((Object)YH.rightCenter);
                            }
                            if (stringArray != null) break block28;
                            if (!bl) break block29;
                            this.setBounds(new Rectangle(new Point(point.x, point.y + this.l.getHeight() / 2 - dimension.height / 2), dimension));
                            if (stringArray == null) break block9;
                        }
                        qq_02 = this;
                        if (stringArray != null) break block30;
                        bl = qq_02.e.equals((Object)YH.rightDown);
                    }
                    if (bl) {
                        this.setBounds(new Rectangle(new Point(point.x, point.y), dimension));
                    }
                }
                qq_02 = this;
            }
            qq_02.revalidate();
        }
    }

    @Override
    public boolean contains(Point point) {
        return this.d(this).contains(point);
    }

    public Shape d(qq_0 qq_02) {
        Shape shape;
        block10: {
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            block33: {
                String[] stringArray;
                int n16;
                block31: {
                    block32: {
                        block29: {
                            block30: {
                                block27: {
                                    block28: {
                                        block25: {
                                            block26: {
                                                block23: {
                                                    block24: {
                                                        block21: {
                                                            block22: {
                                                                block19: {
                                                                    block20: {
                                                                        block17: {
                                                                            block18: {
                                                                                block15: {
                                                                                    block16: {
                                                                                        block13: {
                                                                                            block14: {
                                                                                                block11: {
                                                                                                    block12: {
                                                                                                        block8: {
                                                                                                            block9: {
                                                                                                                int n17;
                                                                                                                int n18;
                                                                                                                block6: {
                                                                                                                    block7: {
                                                                                                                        block4: {
                                                                                                                            block5: {
                                                                                                                                n15 = this.l.q();
                                                                                                                                n16 = this.l.h();
                                                                                                                                stringArray = QX.Y();
                                                                                                                                n14 = this.l.getHeight() - 1;
                                                                                                                                n13 = this.l.getWidth() - 1;
                                                                                                                                n12 = qq_02.getWidth() - 1;
                                                                                                                                n11 = qq_02.getHeight() - 1;
                                                                                                                                shape = null;
                                                                                                                                n10 = this.z();
                                                                                                                                if (stringArray != null) break block4;
                                                                                                                                if (n10 == 0) break block5;
                                                                                                                                int n17 = n12;
                                                                                                                                n17 = n13;
                                                                                                                                if (stringArray != null) break block6;
                                                                                                                                if (n18 == n17) break block7;
                                                                                                                            }
                                                                                                                            n10 = this.W();
                                                                                                                        }
                                                                                                                        if (stringArray != null) break block8;
                                                                                                                        if (n10 == 0) break block9;
                                                                                                                        n10 = n11;
                                                                                                                        if (stringArray != null) break block8;
                                                                                                                        if (n10 != n14) break block9;
                                                                                                                    }
                                                                                                                    int n17 = n16;
                                                                                                                    n17 = 4;
                                                                                                                }
                                                                                                                Point[] pointArray = new Point[n17];
                                                                                                                pointArray[0] = this.c(n15, n15);
                                                                                                                pointArray[1] = this.c(n12 - n15, n15);
                                                                                                                pointArray[2] = this.c(n12 - n15, n11 - n15);
                                                                                                                pointArray[3] = this.c(n15, n11 - n15);
                                                                                                                shape = GA.a(n18, pointArray);
                                                                                                                break block10;
                                                                                                            }
                                                                                                            n10 = this.e.equals((Object)YH.downLeft) ? 1 : 0;
                                                                                                        }
                                                                                                        if (stringArray != null) break block11;
                                                                                                        if (n10 == 0) break block12;
                                                                                                        Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
                                                                                                        pointArray[0] = this.c(n12 - n13 + n15, n15);
                                                                                                        pointArray[1] = this.c(n12 - n15, n15);
                                                                                                        pointArray[2] = this.c(n12 - n15, n11 - n15);
                                                                                                        pointArray[3] = this.c(n15, n11 - n15);
                                                                                                        pointArray[4] = this.c(n15, n14);
                                                                                                        pointArray[5] = this.c(n12 - n13 + n15, n14);
                                                                                                        shape = GA.a(n16, pointArray);
                                                                                                        break block10;
                                                                                                    }
                                                                                                    n10 = this.e.equals((Object)YH.downCenter) ? 1 : 0;
                                                                                                }
                                                                                                if (stringArray != null) break block13;
                                                                                                if (n10 == 0) break block14;
                                                                                                int n19 = n13 % 2;
                                                                                                Point[] pointArray = new Point[qq_0.a(4167, 7604141035775895559L)];
                                                                                                pointArray[0] = this.c(n12 / 2 - n13 / 2 - n19 + n15, n15);
                                                                                                pointArray[1] = this.c(n12 / 2 + n13 / 2 - n15, n15);
                                                                                                pointArray[2] = this.c(n12 / 2 + n13 / 2 - n15, n14);
                                                                                                pointArray[3] = this.c(n12 - n15, n14);
                                                                                                pointArray[4] = this.c(n12 - n15, n11 - n15);
                                                                                                pointArray[5] = this.c(n15, n11 - n15);
                                                                                                pointArray[qq_0.a((int)20409, (long)3354064473426589695L)] = this.c(n15, n14);
                                                                                                pointArray[qq_0.a((int)32365, (long)2908653518711637548L)] = this.c(n12 / 2 - n13 / 2 - n19 + n15, n14);
                                                                                                shape = GA.a(n16, pointArray);
                                                                                                break block10;
                                                                                            }
                                                                                            n10 = this.e.equals((Object)YH.downRight) ? 1 : 0;
                                                                                        }
                                                                                        if (stringArray != null) break block15;
                                                                                        if (n10 == 0) break block16;
                                                                                        Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
                                                                                        pointArray[0] = this.c(n15, n15);
                                                                                        pointArray[1] = this.c(n13 - n15, n15);
                                                                                        pointArray[2] = this.c(n13 - n15, n14);
                                                                                        pointArray[3] = this.c(n12 - n15, n14);
                                                                                        pointArray[4] = this.c(n12 - n15, n11 - n15);
                                                                                        pointArray[5] = this.c(n15, n11 - n15);
                                                                                        shape = GA.a(n16, pointArray);
                                                                                        break block10;
                                                                                    }
                                                                                    n10 = this.e.equals((Object)YH.upLeft) ? 1 : 0;
                                                                                }
                                                                                if (stringArray != null) break block17;
                                                                                if (n10 == 0) break block18;
                                                                                Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
                                                                                pointArray[0] = this.c(n15, n15);
                                                                                pointArray[1] = this.c(n12 - n15, n15);
                                                                                pointArray[2] = this.c(n12 - n15, n11 - n15);
                                                                                pointArray[3] = this.c(n12 - n13 + n15, n11 - n15);
                                                                                pointArray[4] = this.c(n12 - n13 + n15, n11 - n14);
                                                                                pointArray[5] = this.c(n15, n11 - n14);
                                                                                shape = GA.a(n16, pointArray);
                                                                                break block10;
                                                                            }
                                                                            n10 = this.e.equals((Object)YH.upCenter) ? 1 : 0;
                                                                        }
                                                                        if (stringArray != null) break block19;
                                                                        if (n10 == 0) break block20;
                                                                        int n20 = n13 % 2;
                                                                        Point[] pointArray = new Point[qq_0.a(4167, 7604141035775895559L)];
                                                                        pointArray[0] = this.c(n15, n15);
                                                                        pointArray[1] = this.c(n12 - n15, n15);
                                                                        pointArray[2] = this.c(n12 - n15, n11 - n14);
                                                                        pointArray[3] = this.c(n12 / 2 + n13 / 2 - n15, n11 - n14);
                                                                        pointArray[4] = this.c(n12 / 2 + n13 / 2 - n15, n11 - n15);
                                                                        pointArray[5] = this.c(n12 / 2 - n13 / 2 - n20 + n15, n11 - n15);
                                                                        pointArray[qq_0.a((int)20409, (long)3354064473426589695L)] = this.c(n12 / 2 - n13 / 2 - n20 + n15, n11 - n14);
                                                                        pointArray[qq_0.a((int)32365, (long)2908653518711637548L)] = this.c(n15, n11 - n14);
                                                                        shape = GA.a(n16, pointArray);
                                                                        break block10;
                                                                    }
                                                                    n10 = this.e.equals((Object)YH.upRight) ? 1 : 0;
                                                                }
                                                                if (stringArray != null) break block21;
                                                                if (n10 == 0) break block22;
                                                                Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
                                                                pointArray[0] = this.c(n15, n15);
                                                                pointArray[1] = this.c(n12 - n15, n15);
                                                                pointArray[2] = this.c(n12 - n15, n11 - n14);
                                                                pointArray[3] = this.c(n13 - n15, n11 - n14);
                                                                pointArray[4] = this.c(n13 - n15, n11 - n15);
                                                                pointArray[5] = this.c(n15, n11 - n15);
                                                                shape = GA.a(n16, pointArray);
                                                                break block10;
                                                            }
                                                            n10 = this.e.equals((Object)YH.leftUp) ? 1 : 0;
                                                        }
                                                        if (stringArray != null) break block23;
                                                        if (n10 == 0) break block24;
                                                        Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
                                                        pointArray[0] = this.c(n15, n15);
                                                        pointArray[1] = this.c(n12 - n13, n15);
                                                        pointArray[2] = this.c(n12 - n13, n11 - n14 + n15);
                                                        pointArray[3] = this.c(n12 - n15, n11 - n14 + n15);
                                                        pointArray[4] = this.c(n12 - n15, n11 - n15);
                                                        pointArray[5] = this.c(n15, n11 - n15);
                                                        shape = GA.a(n16, pointArray);
                                                        break block10;
                                                    }
                                                    n10 = this.e.equals((Object)YH.leftCenter) ? 1 : 0;
                                                }
                                                if (stringArray != null) break block25;
                                                if (n10 == 0) break block26;
                                                int n21 = n14 % 2;
                                                Point[] pointArray = new Point[qq_0.a(4167, 7604141035775895559L)];
                                                pointArray[0] = this.c(n15, n15);
                                                pointArray[1] = this.c(n12 - n13, n15);
                                                pointArray[2] = this.c(n12 - n13, n11 / 2 - n14 / 2 + n15);
                                                pointArray[3] = this.c(n12 - n15, n11 / 2 - n14 / 2 + n15);
                                                pointArray[4] = this.c(n12 - n15, n11 / 2 + n14 / 2 + n21 - n15);
                                                pointArray[5] = this.c(n12 - n13, n11 / 2 + n14 / 2 + n21 - n15);
                                                pointArray[qq_0.a((int)20409, (long)3354064473426589695L)] = this.c(n12 - n13, n11 - n15);
                                                pointArray[qq_0.a((int)32365, (long)2908653518711637548L)] = this.c(n15, n11 - n15);
                                                shape = GA.a(n16, pointArray);
                                                break block10;
                                            }
                                            n10 = this.e.equals((Object)YH.leftDown) ? 1 : 0;
                                        }
                                        if (stringArray != null) break block27;
                                        if (n10 == 0) break block28;
                                        Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
                                        pointArray[0] = this.c(n15, n15);
                                        pointArray[1] = this.c(n12 - n15, n15);
                                        pointArray[2] = this.c(n12 - n15, n14 - n15);
                                        pointArray[3] = this.c(n12 - n13, n14 - n15);
                                        pointArray[4] = this.c(n12 - n13, n11 - n15);
                                        pointArray[5] = this.c(n15, n11 - n15);
                                        shape = GA.a(n16, pointArray);
                                        break block10;
                                    }
                                    n10 = this.e.equals((Object)YH.rightUp) ? 1 : 0;
                                }
                                if (stringArray != null) break block29;
                                if (n10 == 0) break block30;
                                Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
                                pointArray[0] = this.c(n15, n11 - n14 + n15);
                                pointArray[1] = this.c(n13, n11 - n14 + n15);
                                pointArray[2] = this.c(n13, n15);
                                pointArray[3] = this.c(n12 - n15, n15);
                                pointArray[4] = this.c(n12 - n15, n11 - n15);
                                pointArray[5] = this.c(n15, n11 - n15);
                                shape = GA.a(n16, pointArray);
                                break block10;
                            }
                            n10 = this.e.equals((Object)YH.rightCenter) ? 1 : 0;
                        }
                        if (stringArray != null) break block31;
                        if (n10 == 0) break block32;
                        int n22 = n14 % 2;
                        Point[] pointArray = new Point[qq_0.a(4167, 7604141035775895559L)];
                        pointArray[0] = this.c(n15, n11 / 2 - n14 / 2 + n15);
                        pointArray[1] = this.c(n13, n11 / 2 - n14 / 2 + n15);
                        pointArray[2] = this.c(n13, n15);
                        pointArray[3] = this.c(n12 - n15, n15);
                        pointArray[4] = this.c(n12 - n15, n11 - n15);
                        pointArray[5] = this.c(n13, n11 - n15);
                        pointArray[qq_0.a((int)20409, (long)3354064473426589695L)] = this.c(n13, n11 / 2 + n14 / 2 + n22 - n15);
                        pointArray[qq_0.a((int)32365, (long)2908653518711637548L)] = this.c(n15, n11 / 2 + n14 / 2 + n22 - n15);
                        shape = GA.a(n16, pointArray);
                        break block10;
                    }
                    n10 = this.e.equals((Object)YH.rightDown) ? 1 : 0;
                }
                if (stringArray != null) break block33;
                if (n10 == 0) break block10;
                n10 = n16;
            }
            Point[] pointArray = new Point[qq_0.a(20409, 3354064473426589695L)];
            pointArray[0] = this.c(n15, n15);
            pointArray[1] = this.c(n12 - n15, n15);
            pointArray[2] = this.c(n12 - n15, n11 - n15);
            pointArray[3] = this.c(n13, n11 - n15);
            pointArray[4] = this.c(n13, n14 - n15);
            pointArray[5] = this.c(n15, n14 - n15);
            shape = GA.a(n10, pointArray);
        }
        if (ky_2.F() != null) {
            QX.f(new String[5]);
        }
        return shape;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean z() {
        String[] stringArray = QX.Y();
        boolean bl = this.M();
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.Y();
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Y() {
        String[] stringArray = QX.Y();
        boolean bl = this.e.equals((Object)YH.downLeft);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.downCenter);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.downRight);
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean M() {
        String[] stringArray = QX.Y();
        boolean bl = this.e.equals((Object)YH.upLeft);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.upCenter);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.upRight);
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean W() {
        String[] stringArray = QX.Y();
        boolean bl = this.Z();
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.Q();
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Q() {
        String[] stringArray = QX.Y();
        boolean bl = this.e.equals((Object)YH.rightUp);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.rightCenter);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.rightDown);
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Z() {
        String[] stringArray = QX.Y();
        boolean bl = this.e.equals((Object)YH.leftUp);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.leftCenter);
        if (stringArray != null) return bl;
        if (bl) return true;
        bl = this.e.equals((Object)YH.leftDown);
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    private Point c(int n10, int n11) {
        return new Point(n10, n11);
    }

    @Override
    public Shape B() {
        return this.d(this);
    }

    public void g() {
        NC.b(this.l, this, false);
    }

    @Override
    public void V() {
        this.q(false);
    }

    /*
     * Unable to fully structure code
     */
    public void q(boolean var1_1) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        var2_2 = QX.Y();
                        v0 = this.q();
                        if (var2_2 != null) break block10;
                        if (!v0) break block11;
                        v0 = this.l.isFocusable();
                        if (var2_2 != null) break block10;
                        if (v0) {
                            v0 = var1_1;
                            if (var2_2 == null) {
                                if (v0) {
                                    this.l.requestFocusInWindow();
                                    return;
                                } else {
                                    ** GOTO lbl16
                                }
                            } else {
                                ** GOTO lbl15
                            }
                        }
                        break block11;
lbl15:
                        // 2 sources

                        break block10;
                    }
                    super.V();
                    v0 = this.l.isFocusable();
                }
                if (var2_2 != null) break block12;
                if (!v0) break block13;
                v0 = var1_1;
            }
            if (var2_2 == null && v0) {
                v0 = this.l.requestFocusInWindow();
            }
        }
    }

    static List u() {
        return k;
    }

    static KD m(qq_0 qq_02) {
        return qq_02.G;
    }

    static void D(qq_0 qq_02, KD kD, KD kD2) {
        qq_02.V(kD, kD2);
    }

    static KD r(qq_0 qq_02) {
        return qq_02.l;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[28];
                        var11_1 = 0;
                        var10_2 = "c\u00cd^\u0096P%\u0090\u0083\u00b4\u00f2\u0007\u00078=9lm9\u00b4\u0003g\t\u00d2\u0007\u00b6_\u00c9 r\u00b0u\u0004\u00f8 \u0084\u00f7\u0003r\u0013Q\u0007q\u00cc\u0010RH\u00fe\u0013\u0004d\u00dd\u00be\u0094\u0007?,\u00f9NT}\u0090\u0007\u0003(\u007f\u00ce\u00a6m\u00ac\u0003\u00e7\u00e1\u00e3\u0003\u001cU\u00bc\u0003rjP\u0007\u00dbuEe\u00e2\u0018F\u0003\u00df\u0096\u00c5\u0007\u00e9\u00f3\"\u00b5\u000f\u0002\u00d9\u0007@\u00c2\u0017\u0093\u00a8\u00c6\u000e\u0011\u0084PC\u00f9p\u0097\u0017\u000bx\u00f5Au3t:\u00b6\u00e3\u0016\u00a5f\u00bai\\7\u00ec\u008a\u00c9\u00den\u0012Z\u00c3\u00f6{\u00ee\u00ca\u00f9E\u0096\u0018\u0007uc\u00b1\u00a7}@\u0094\u0007l8\u0093\u00cc\u0019-9\u0007\u00a1F+\u0003/\u00d4\u00fe\u0013\u008d[\u00bf\u00ce\u00fc\u00c3\u00f8\u0014K\r+aT\u0096:\u00a2\u0098\u00b4\u00e3\u0003f%\u00d2\u0006\u00d9v~f\u00dbg\u0014#\u0019\u00b7\u00d0\u00ee\u00b2\u00c4\u00af\u0017h\n\u00fdW\u0016Y\u00bf[\u0094\u00b3\u0089";
                        var12_3 = "c\u00cd^\u0096P%\u0090\u0083\u00b4\u00f2\u0007\u00078=9lm9\u00b4\u0003g\t\u00d2\u0007\u00b6_\u00c9 r\u00b0u\u0004\u00f8 \u0084\u00f7\u0003r\u0013Q\u0007q\u00cc\u0010RH\u00fe\u0013\u0004d\u00dd\u00be\u0094\u0007?,\u00f9NT}\u0090\u0007\u0003(\u007f\u00ce\u00a6m\u00ac\u0003\u00e7\u00e1\u00e3\u0003\u001cU\u00bc\u0003rjP\u0007\u00dbuEe\u00e2\u0018F\u0003\u00df\u0096\u00c5\u0007\u00e9\u00f3\"\u00b5\u000f\u0002\u00d9\u0007@\u00c2\u0017\u0093\u00a8\u00c6\u000e\u0011\u0084PC\u00f9p\u0097\u0017\u000bx\u00f5Au3t:\u00b6\u00e3\u0016\u00a5f\u00bai\\7\u00ec\u008a\u00c9\u00den\u0012Z\u00c3\u00f6{\u00ee\u00ca\u00f9E\u0096\u0018\u0007uc\u00b1\u00a7}@\u0094\u0007l8\u0093\u00cc\u0019-9\u0007\u00a1F+\u0003/\u00d4\u00fe\u0013\u008d[\u00bf\u00ce\u00fc\u00c3\u00f8\u0014K\r+aT\u0096:\u00a2\u0098\u00b4\u00e3\u0003f%\u00d2\u0006\u00d9v~f\u00dbg\u0014#\u0019\u00b7\u00d0\u00ee\u00b2\u00c4\u00af\u0017h\n\u00fdW\u0016Y\u00bf[\u0094\u00b3\u0089".length();
                        var9_4 = 11;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 11;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = ":<\u00b8\u00ad\u009e\u00e0K\u0003;\u00bb\u00b9";
                            var12_3 = ":<\u00b8\u00ad\u009e\u00e0K\u0003;\u00bb\u00b9".length();
                            var9_4 = 7;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 103;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 18;
                                    break;
                                }
                                case 1: {
                                    v15 = 50;
                                    break;
                                }
                                case 2: {
                                    v15 = 49;
                                    break;
                                }
                                case 3: {
                                    v15 = 98;
                                    break;
                                }
                                case 4: {
                                    v15 = 1;
                                    break;
                                }
                                case 5: {
                                    v15 = 23;
                                    break;
                                }
                                default: {
                                    v15 = 118;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                qq_0.a = var13;
                qq_0.d = new String[28];
                var0_7 = 3613628633451842062L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "igV\u00ee\u00fc\u00a92->\u001e\u00f1\u0010\u001bH\u00c0\u00de\u00c0\u0018\u0084\u0019Jl\u008c%\u0007\u00dc\u008a\u00c2lwb\u0001";
                var5_11 = "igV\u00ee\u00fc\u00a92->\u001e\u00f1\u0010\u001bH\u00c0\u00de\u00c0\u0018\u0084\u0019Jl\u008c%\u0007\u00dc\u008a\u00c2lwb\u0001".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "$#\u00d9\u0018\u00f5\u00fcj8\t\u0001\u00a9x\u0093J\u00bd\u00f7";
                    var5_11 = "$#\u00d9\u0018\u00f5\u00fcj8\t\u0001\u00a9x\u0093J\u00bd\u00f7".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        qq_0.j = var6_8;
        qq_0.n = new Integer[6];
        v22 = new String[qq_0.a(12954, 7463211197057927896L)];
        v22[0] = qq_0.b(-26128, 16846);
        v22[1] = qq_0.b(-26125, -26704);
        v22[2] = qq_0.b(-26143, -27003);
        v22[3] = qq_0.b(-26138, 18471);
        v22[4] = qq_0.b(-26139, -12686);
        v22[5] = qq_0.b(-26130, -26722);
        v22[qq_0.a((int)6263, (long)4462928337168212016L)] = qq_0.b(-26121, -3217);
        v22[qq_0.a((int)16487, (long)1620768376688932900L)] = qq_0.b(-26129, -29682);
        qq_0.k = Arrays.asList(v22);
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF99F7) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 81;
                    break;
                }
                case 1: {
                    n14 = 198;
                    break;
                }
                case 2: {
                    n14 = 94;
                    break;
                }
                case 3: {
                    n14 = 221;
                    break;
                }
                case 4: {
                    n14 = 230;
                    break;
                }
                case 5: {
                    n14 = 236;
                    break;
                }
                case 6: {
                    n14 = 123;
                    break;
                }
                case 7: {
                    n14 = 56;
                    break;
                }
                case 8: {
                    n14 = 91;
                    break;
                }
                case 9: {
                    n14 = 39;
                    break;
                }
                case 10: {
                    n14 = 255;
                    break;
                }
                case 11: {
                    n14 = 234;
                    break;
                }
                case 12: {
                    n14 = 16;
                    break;
                }
                case 13: {
                    n14 = 76;
                    break;
                }
                case 14: {
                    n14 = 100;
                    break;
                }
                case 15: {
                    n14 = 241;
                    break;
                }
                case 16: {
                    n14 = 15;
                    break;
                }
                case 17: {
                    n14 = 132;
                    break;
                }
                case 18: {
                    n14 = 3;
                    break;
                }
                case 19: {
                    n14 = 28;
                    break;
                }
                case 20: {
                    n14 = 113;
                    break;
                }
                case 21: {
                    n14 = 1;
                    break;
                }
                case 22: {
                    n14 = 98;
                    break;
                }
                case 23: {
                    n14 = 253;
                    break;
                }
                case 24: {
                    n14 = 219;
                    break;
                }
                case 25: {
                    n14 = 66;
                    break;
                }
                case 26: {
                    n14 = 9;
                    break;
                }
                case 27: {
                    n14 = 42;
                    break;
                }
                case 28: {
                    n14 = 126;
                    break;
                }
                case 29: {
                    n14 = 96;
                    break;
                }
                case 30: {
                    n14 = 73;
                    break;
                }
                case 31: {
                    n14 = 49;
                    break;
                }
                case 32: {
                    n14 = 202;
                    break;
                }
                case 33: {
                    n14 = 130;
                    break;
                }
                case 34: {
                    n14 = 57;
                    break;
                }
                case 35: {
                    n14 = 217;
                    break;
                }
                case 36: {
                    n14 = 159;
                    break;
                }
                case 37: {
                    n14 = 141;
                    break;
                }
                case 38: {
                    n14 = 84;
                    break;
                }
                case 39: {
                    n14 = 179;
                    break;
                }
                case 40: {
                    n14 = 157;
                    break;
                }
                case 41: {
                    n14 = 40;
                    break;
                }
                case 42: {
                    n14 = 21;
                    break;
                }
                case 43: {
                    n14 = 232;
                    break;
                }
                case 44: {
                    n14 = 109;
                    break;
                }
                case 45: {
                    n14 = 210;
                    break;
                }
                case 46: {
                    n14 = 251;
                    break;
                }
                case 47: {
                    n14 = 58;
                    break;
                }
                case 48: {
                    n14 = 239;
                    break;
                }
                case 49: {
                    n14 = 74;
                    break;
                }
                case 50: {
                    n14 = 80;
                    break;
                }
                case 51: {
                    n14 = 180;
                    break;
                }
                case 52: {
                    n14 = 138;
                    break;
                }
                case 53: {
                    n14 = 25;
                    break;
                }
                case 54: {
                    n14 = 136;
                    break;
                }
                case 55: {
                    n14 = 182;
                    break;
                }
                case 56: {
                    n14 = 206;
                    break;
                }
                case 57: {
                    n14 = 59;
                    break;
                }
                case 58: {
                    n14 = 82;
                    break;
                }
                case 59: {
                    n14 = 245;
                    break;
                }
                case 60: {
                    n14 = 78;
                    break;
                }
                case 61: {
                    n14 = 18;
                    break;
                }
                case 62: {
                    n14 = 124;
                    break;
                }
                case 63: {
                    n14 = 68;
                    break;
                }
                case 64: {
                    n14 = 201;
                    break;
                }
                case 65: {
                    n14 = 12;
                    break;
                }
                case 66: {
                    n14 = 147;
                    break;
                }
                case 67: {
                    n14 = 244;
                    break;
                }
                case 68: {
                    n14 = 22;
                    break;
                }
                case 69: {
                    n14 = 95;
                    break;
                }
                case 70: {
                    n14 = 139;
                    break;
                }
                case 71: {
                    n14 = 164;
                    break;
                }
                case 72: {
                    n14 = 197;
                    break;
                }
                case 73: {
                    n14 = 184;
                    break;
                }
                case 74: {
                    n14 = 88;
                    break;
                }
                case 75: {
                    n14 = 125;
                    break;
                }
                case 76: {
                    n14 = 176;
                    break;
                }
                case 77: {
                    n14 = 229;
                    break;
                }
                case 78: {
                    n14 = 165;
                    break;
                }
                case 79: {
                    n14 = 237;
                    break;
                }
                case 80: {
                    n14 = 143;
                    break;
                }
                case 81: {
                    n14 = 105;
                    break;
                }
                case 82: {
                    n14 = 226;
                    break;
                }
                case 83: {
                    n14 = 31;
                    break;
                }
                case 84: {
                    n14 = 240;
                    break;
                }
                case 85: {
                    n14 = 218;
                    break;
                }
                case 86: {
                    n14 = 110;
                    break;
                }
                case 87: {
                    n14 = 249;
                    break;
                }
                case 88: {
                    n14 = 154;
                    break;
                }
                case 89: {
                    n14 = 200;
                    break;
                }
                case 90: {
                    n14 = 19;
                    break;
                }
                case 91: {
                    n14 = 54;
                    break;
                }
                case 92: {
                    n14 = 146;
                    break;
                }
                case 93: {
                    n14 = 149;
                    break;
                }
                case 94: {
                    n14 = 118;
                    break;
                }
                case 95: {
                    n14 = 203;
                    break;
                }
                case 96: {
                    n14 = 252;
                    break;
                }
                case 97: {
                    n14 = 86;
                    break;
                }
                case 98: {
                    n14 = 195;
                    break;
                }
                case 99: {
                    n14 = 153;
                    break;
                }
                case 100: {
                    n14 = 14;
                    break;
                }
                case 101: {
                    n14 = 65;
                    break;
                }
                case 102: {
                    n14 = 72;
                    break;
                }
                case 103: {
                    n14 = 228;
                    break;
                }
                case 104: {
                    n14 = 172;
                    break;
                }
                case 105: {
                    n14 = 224;
                    break;
                }
                case 106: {
                    n14 = 69;
                    break;
                }
                case 107: {
                    n14 = 189;
                    break;
                }
                case 108: {
                    n14 = 20;
                    break;
                }
                case 109: {
                    n14 = 55;
                    break;
                }
                case 110: {
                    n14 = 167;
                    break;
                }
                case 111: {
                    n14 = 192;
                    break;
                }
                case 112: {
                    n14 = 135;
                    break;
                }
                case 113: {
                    n14 = 90;
                    break;
                }
                case 114: {
                    n14 = 30;
                    break;
                }
                case 115: {
                    n14 = 190;
                    break;
                }
                case 116: {
                    n14 = 114;
                    break;
                }
                case 117: {
                    n14 = 193;
                    break;
                }
                case 118: {
                    n14 = 134;
                    break;
                }
                case 119: {
                    n14 = 216;
                    break;
                }
                case 120: {
                    n14 = 10;
                    break;
                }
                case 121: {
                    n14 = 208;
                    break;
                }
                case 122: {
                    n14 = 92;
                    break;
                }
                case 123: {
                    n14 = 70;
                    break;
                }
                case 124: {
                    n14 = 235;
                    break;
                }
                case 125: {
                    n14 = 186;
                    break;
                }
                case 126: {
                    n14 = 37;
                    break;
                }
                case 127: {
                    n14 = 204;
                    break;
                }
                case 128: {
                    n14 = 24;
                    break;
                }
                case 129: {
                    n14 = 5;
                    break;
                }
                case 130: {
                    n14 = 77;
                    break;
                }
                case 131: {
                    n14 = 41;
                    break;
                }
                case 132: {
                    n14 = 227;
                    break;
                }
                case 133: {
                    n14 = 64;
                    break;
                }
                case 134: {
                    n14 = 50;
                    break;
                }
                case 135: {
                    n14 = 174;
                    break;
                }
                case 136: {
                    n14 = 75;
                    break;
                }
                case 137: {
                    n14 = 45;
                    break;
                }
                case 138: {
                    n14 = 63;
                    break;
                }
                case 139: {
                    n14 = 212;
                    break;
                }
                case 140: {
                    n14 = 116;
                    break;
                }
                case 141: {
                    n14 = 155;
                    break;
                }
                case 142: {
                    n14 = 215;
                    break;
                }
                case 143: {
                    n14 = 29;
                    break;
                }
                case 144: {
                    n14 = 168;
                    break;
                }
                case 145: {
                    n14 = 254;
                    break;
                }
                case 146: {
                    n14 = 188;
                    break;
                }
                case 147: {
                    n14 = 47;
                    break;
                }
                case 148: {
                    n14 = 137;
                    break;
                }
                case 149: {
                    n14 = 150;
                    break;
                }
                case 150: {
                    n14 = 247;
                    break;
                }
                case 151: {
                    n14 = 33;
                    break;
                }
                case 152: {
                    n14 = 106;
                    break;
                }
                case 153: {
                    n14 = 214;
                    break;
                }
                case 154: {
                    n14 = 107;
                    break;
                }
                case 155: {
                    n14 = 111;
                    break;
                }
                case 156: {
                    n14 = 173;
                    break;
                }
                case 157: {
                    n14 = 60;
                    break;
                }
                case 158: {
                    n14 = 213;
                    break;
                }
                case 159: {
                    n14 = 67;
                    break;
                }
                case 160: {
                    n14 = 183;
                    break;
                }
                case 161: {
                    n14 = 34;
                    break;
                }
                case 162: {
                    n14 = 166;
                    break;
                }
                case 163: {
                    n14 = 238;
                    break;
                }
                case 164: {
                    n14 = 11;
                    break;
                }
                case 165: {
                    n14 = 89;
                    break;
                }
                case 166: {
                    n14 = 191;
                    break;
                }
                case 167: {
                    n14 = 36;
                    break;
                }
                case 168: {
                    n14 = 250;
                    break;
                }
                case 169: {
                    n14 = 48;
                    break;
                }
                case 170: {
                    n14 = 87;
                    break;
                }
                case 171: {
                    n14 = 209;
                    break;
                }
                case 172: {
                    n14 = 117;
                    break;
                }
                case 173: {
                    n14 = 162;
                    break;
                }
                case 174: {
                    n14 = 97;
                    break;
                }
                case 175: {
                    n14 = 207;
                    break;
                }
                case 176: {
                    n14 = 128;
                    break;
                }
                case 177: {
                    n14 = 71;
                    break;
                }
                case 178: {
                    n14 = 112;
                    break;
                }
                case 179: {
                    n14 = 181;
                    break;
                }
                case 180: {
                    n14 = 44;
                    break;
                }
                case 181: {
                    n14 = 53;
                    break;
                }
                case 182: {
                    n14 = 140;
                    break;
                }
                case 183: {
                    n14 = 46;
                    break;
                }
                case 184: {
                    n14 = 163;
                    break;
                }
                case 185: {
                    n14 = 8;
                    break;
                }
                case 186: {
                    n14 = 85;
                    break;
                }
                case 187: {
                    n14 = 187;
                    break;
                }
                case 188: {
                    n14 = 158;
                    break;
                }
                case 189: {
                    n14 = 151;
                    break;
                }
                case 190: {
                    n14 = 23;
                    break;
                }
                case 191: {
                    n14 = 93;
                    break;
                }
                case 192: {
                    n14 = 108;
                    break;
                }
                case 193: {
                    n14 = 129;
                    break;
                }
                case 194: {
                    n14 = 169;
                    break;
                }
                case 195: {
                    n14 = 83;
                    break;
                }
                case 196: {
                    n14 = 246;
                    break;
                }
                case 197: {
                    n14 = 177;
                    break;
                }
                case 198: {
                    n14 = 122;
                    break;
                }
                case 199: {
                    n14 = 233;
                    break;
                }
                case 200: {
                    n14 = 35;
                    break;
                }
                case 201: {
                    n14 = 156;
                    break;
                }
                case 202: {
                    n14 = 145;
                    break;
                }
                case 203: {
                    n14 = 119;
                    break;
                }
                case 204: {
                    n14 = 62;
                    break;
                }
                case 205: {
                    n14 = 222;
                    break;
                }
                case 206: {
                    n14 = 231;
                    break;
                }
                case 207: {
                    n14 = 144;
                    break;
                }
                case 208: {
                    n14 = 38;
                    break;
                }
                case 209: {
                    n14 = 175;
                    break;
                }
                case 210: {
                    n14 = 171;
                    break;
                }
                case 211: {
                    n14 = 131;
                    break;
                }
                case 212: {
                    n14 = 99;
                    break;
                }
                case 213: {
                    n14 = 7;
                    break;
                }
                case 214: {
                    n14 = 194;
                    break;
                }
                case 215: {
                    n14 = 13;
                    break;
                }
                case 216: {
                    n14 = 103;
                    break;
                }
                case 217: {
                    n14 = 248;
                    break;
                }
                case 218: {
                    n14 = 185;
                    break;
                }
                case 219: {
                    n14 = 121;
                    break;
                }
                case 220: {
                    n14 = 115;
                    break;
                }
                case 221: {
                    n14 = 61;
                    break;
                }
                case 222: {
                    n14 = 102;
                    break;
                }
                case 223: {
                    n14 = 152;
                    break;
                }
                case 224: {
                    n14 = 51;
                    break;
                }
                case 225: {
                    n14 = 27;
                    break;
                }
                case 226: {
                    n14 = 243;
                    break;
                }
                case 227: {
                    n14 = 43;
                    break;
                }
                case 228: {
                    n14 = 4;
                    break;
                }
                case 229: {
                    n14 = 142;
                    break;
                }
                case 230: {
                    n14 = 120;
                    break;
                }
                case 231: {
                    n14 = 161;
                    break;
                }
                case 232: {
                    n14 = 104;
                    break;
                }
                case 233: {
                    n14 = 127;
                    break;
                }
                case 234: {
                    n14 = 205;
                    break;
                }
                case 235: {
                    n14 = 0;
                    break;
                }
                case 236: {
                    n14 = 220;
                    break;
                }
                case 237: {
                    n14 = 148;
                    break;
                }
                case 238: {
                    n14 = 32;
                    break;
                }
                case 239: {
                    n14 = 196;
                    break;
                }
                case 240: {
                    n14 = 242;
                    break;
                }
                case 241: {
                    n14 = 79;
                    break;
                }
                case 242: {
                    n14 = 170;
                    break;
                }
                case 243: {
                    n14 = 199;
                    break;
                }
                case 244: {
                    n14 = 101;
                    break;
                }
                case 245: {
                    n14 = 6;
                    break;
                }
                case 246: {
                    n14 = 17;
                    break;
                }
                case 247: {
                    n14 = 2;
                    break;
                }
                case 248: {
                    n14 = 26;
                    break;
                }
                case 249: {
                    n14 = 178;
                    break;
                }
                case 250: {
                    n14 = 52;
                    break;
                }
                case 251: {
                    n14 = 225;
                    break;
                }
                case 252: {
                    n14 = 160;
                    break;
                }
                case 253: {
                    n14 = 223;
                    break;
                }
                case 254: {
                    n14 = 133;
                    break;
                }
                default: {
                    n14 = 211;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            qq_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3843;
        if (n[n11] == null) {
            qq_0.n[n11] = (int)(j[n11] ^ l2);
        }
        return n[n11];
    }
}

