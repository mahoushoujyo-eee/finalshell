/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.A.E;
import com.K;
import com.QB;
import com.QE;
import com.T3;
import com._e_0;
import com.rv_2;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class QY
extends QB {
    protected int O;
    protected double G;
    protected double s;
    protected QE u;
    protected QE o;
    protected boolean g;
    protected List h = new ArrayList();
    protected int H = -1;
    private static final String d;
    private static final long j;

    public QY() {
        super(d, (LayoutManager)new T3());
        this.Y(true);
        this.c(0.04f);
        this.C(false);
        this.t(0.0f);
        this.t(true);
        this.a(true);
        this.b((int)j);
        this.u(0.0);
        this.y(360.0);
        this.W(QE.shutter);
        this.y(null);
        this.P(true);
    }

    public int v() {
        return this.O;
    }

    public void b(int n10) {
        this.O = n10;
    }

    public double V() {
        return this.G;
    }

    public void u(double d2) {
        this.G = d2;
    }

    public double a() {
        return this.s;
    }

    public void y(double d2) {
        this.s = d2;
    }

    public QE t() {
        return this.u;
    }

    public void W(QE qE) {
        this.u = qE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public QE H() {
        QE qE;
        int[] nArray = _e_0.P();
        QY qY = this;
        if (nArray == null) {
            if (qY.o != null) {
                qE = this.o;
                return qE;
            }
            qY = this;
        }
        qE = qY.u;
        return qE;
    }

    public void y(QE qE) {
        this.o = qE;
    }

    public boolean C() {
        return this.g;
    }

    public void P(boolean bl) {
        this.g = bl;
    }

    public List R() {
        return this.h;
    }

    public _e_0 w(ImageIcon imageIcon) {
        return this.e(imageIcon, null);
    }

    public _e_0 e(ImageIcon imageIcon, ActionListener actionListener) {
        return this.E(new _e_0(imageIcon, actionListener));
    }

    public _e_0 E(_e_0 _e_02) {
        this.h.add(_e_02);
        _e_02.setEnabled(_e_02.V() != null);
        _e_02.p(_e_02.V());
        _e_02.addMouseListener(new K(this, _e_02));
        this.add(_e_02);
        return _e_02;
    }

    public int u() {
        return this.H;
    }

    public QY Q(Component component, int n10, int n11) {
        this.S(component, n10, n11);
        return this;
    }

    public void h(Component component, Point point) {
        this.S(component, point.x, point.y);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void S(Component component, int n10, int n11) {
        Object object = this.c;
        synchronized (object) {
            Point point = this.X().r(this, n10, n11);
            super.M(component, point.x, point.y);
        }
    }

    @Override
    protected void i() {
        this.revalidate();
    }

    @Override
    public QB l() {
        this.w();
        return this;
    }

    public void w() {
        this.U(-1);
    }

    public void U(int n10) {
        this.H = n10;
        super.l();
    }

    @Override
    protected void f() {
        block4: {
            QY qY;
            block2: {
                block3: {
                    int[] nArray = _e_0.P();
                    qY = this;
                    if (nArray != null) break block2;
                    if (!(qY.y > 0.0f)) break block3;
                    this.revalidate();
                    if (nArray == null) break block4;
                }
                this.H = -1;
                this.revalidate();
                qY = this;
            }
            qY.q();
        }
    }

    public double a(Component component) {
        return this.j(this.getComponentZOrder(component));
    }

    public double j(int n10) {
        return rv_2.p(this.X().r(this, n10));
    }

    public T3 X() {
        return (T3)this.getLayout();
    }

    public static boolean P() {
        boolean bl;
        block3: {
            Window[] windowArray = Window.getWindows();
            int n10 = windowArray.length;
            int[] nArray = _e_0.P();
            int n11 = 0;
            while (n11 < n10) {
                block4: {
                    block5: {
                        boolean bl2;
                        block7: {
                            block6: {
                                Window window = windowArray[n11];
                                if (nArray != null) break block4;
                                bl = window.isShowing();
                                if (nArray != null) break block3;
                                if (!bl) break block5;
                                bl2 = window instanceof E;
                                if (nArray != null) break block6;
                                if (!bl2) break block5;
                                bl2 = ((E)window).getContentPane() instanceof QY;
                            }
                            if (nArray != null) break block7;
                            if (!bl2) break block5;
                            bl2 = true;
                        }
                        return bl2;
                    }
                    ++n11;
                }
                if (nArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static void F() {
        Window[] windowArray = Window.getWindows();
        int n10 = windowArray.length;
        int[] nArray = _e_0.P();
        int n11 = 0;
        while (n11 < n10) {
            block3: {
                block4: {
                    Container container;
                    block6: {
                        boolean bl;
                        Window window;
                        block5: {
                            window = windowArray[n11];
                            if (nArray != null) break block3;
                            if (!window.isShowing()) break block4;
                            bl = window instanceof E;
                            if (nArray != null) break block5;
                            if (!bl) break block4;
                            container = ((E)window).getContentPane();
                            if (nArray != null) break block6;
                            bl = container instanceof QY;
                        }
                        if (!bl) break block4;
                        container = ((E)window).getContentPane();
                    }
                    QY qY = (QY)container;
                    qY.w();
                }
                ++n11;
            }
            if (nArray == null) continue;
        }
    }

    @Override
    public QB M(Component component, int n10, int n11) {
        return this.Q(component, n10, n11);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u0016b\u001f\u001a&x\b\u0010u\u0010\u0000".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 70;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 36;
                            break;
                        }
                        case 1: {
                            n17 = 86;
                            break;
                        }
                        case 2: {
                            n17 = 56;
                            break;
                        }
                        case 3: {
                            n17 = 50;
                            break;
                        }
                        case 4: {
                            n17 = 19;
                            break;
                        }
                        case 5: {
                            n17 = 78;
                            break;
                        }
                        default: {
                            n17 = 47;
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
        d = new String(cArray).intern();
        long l2 = 1299338594377316636L;
        j = 0xB911363840D0B920L ^ l2;
    }
}

