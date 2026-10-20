/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.FN;
import com.NC;
import com.ON;
import com.RV;
import com.TM;
import com.WC;
import com.X7;
import com._k_0;
import com.aL;
import com.c4_0;
import com.cd_1;
import com.cg_2;
import com.fd_0;
import com.ff_0;
import com.fi_0;
import com.ic_1;
import com.iw_1;
import com.ky_2;
import com.nq_1;
import com.og_2;
import com.qt_0;
import com.wu_2;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.event.AncestorListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class QX
extends ky_2 {
    protected List w = new ArrayList(2);
    protected boolean i = false;
    protected boolean s = false;
    protected boolean h = true;
    protected Component v = null;
    protected List u = new ArrayList();
    protected Component b = null;
    protected ComponentListener f = null;
    protected AncestorListener V = null;
    protected boolean p = false;
    protected ic_1 M;
    protected float F = 0.0f;
    protected WC C;
    protected c4_0 o;
    private static String[] c;
    private static final String g;
    private static final long z;

    public QX() {
        this(NC.P());
    }

    public QX(TM tM) {
        this(tM.F());
    }

    public QX(og_2 og_22) {
        super(og_22);
        this.P();
    }

    public QX(String string) {
        super(string);
        this.P();
    }

    protected void P() {
        this.setOpaque(false);
        this.setFocusCycleRoot(true);
        nq_1.S(this);
        this.C = new WC(g, z);
        this.C.q(new iw_1(this));
        this.addAncestorListener(new fd_0(this));
        this.o = new cd_1(this, true);
        ON.b(this, this.o);
    }

    protected void j(boolean bl) {
        block3: {
            QX qX;
            block6: {
                boolean bl2;
                block5: {
                    String[] stringArray;
                    block4: {
                        block2: {
                            stringArray = QX.Y();
                            bl2 = this.isShowing();
                            if (stringArray != null) break block2;
                            if (!bl2) break block3;
                            bl2 = bl;
                        }
                        if (stringArray != null) break block4;
                        if (bl2) break block3;
                        bl2 = this.y();
                    }
                    if (stringArray != null) break block5;
                    if (bl2) break block3;
                    qX = this;
                    if (stringArray != null) break block6;
                    bl2 = qX.s;
                }
                if (!bl2) break block3;
                qX = this;
            }
            qX.V();
        }
    }

    public qt_0 D() {
        return (qt_0)this.getParent();
    }

    public void k(TM tM) {
        this.L(tM.F());
    }

    public boolean P() {
        return this.i;
    }

    public void c(boolean bl) {
        this.i = bl;
    }

    public boolean q() {
        return this.s;
    }

    public void U(boolean bl) {
        this.s = bl;
    }

    public boolean G() {
        return this.h;
    }

    public void O(boolean bl) {
        this.h = bl;
    }

    public Component E() {
        return this.v;
    }

    public void f(Component component) {
        this.v = component;
    }

    public List N() {
        ArrayList<Component> arrayList = new ArrayList<Component>(this.u.size());
        String[] stringArray = QX.Y();
        for (WeakReference weakReference : this.u) {
            Component component = (Component)weakReference.get();
            if (component != null) {
                arrayList.add(component);
            }
            if (stringArray == null) continue;
        }
        return arrayList;
    }

    public void G(Component component) {
        this.u.add(new WeakReference<Component>(component));
    }

    public void E(Component component) {
        this.u.remove(component);
    }

    public boolean y() {
        Iterator iterator = this.u.iterator();
        String[] stringArray = QX.Y();
        while (iterator.hasNext()) {
            block4: {
                boolean bl;
                block5: {
                    Component component;
                    block3: {
                        Component component2;
                        WeakReference weakReference = (WeakReference)iterator.next();
                        component = component2 = (Component)weakReference.get();
                        if (stringArray != null) break block3;
                        if (component == null) break block4;
                        component = component2;
                    }
                    bl = FN.l(component);
                    if (stringArray != null) break block5;
                    if (!bl) break block4;
                    bl = true;
                }
                return bl;
            }
            if (stringArray == null) continue;
        }
        return false;
    }

    public void S(Component component) {
        this.h(component, new _k_0(this, component));
    }

    public void l(Component component) {
        NC.b(component, this, this.h);
        this.k();
    }

    public void I(Component component, Rectangle rectangle) {
        this.P(component, rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public void P(Component component, int n10, int n11, int n12, int n13) {
        this.k(component, n10, n11, n12, n13);
        NC.b(component, this, this.h);
        this.m(component, n10, n11, n12, n13);
    }

    public void E(Component component, Point point) {
        this.m(component, point.x, point.y);
    }

    public void m(Component component, int n10, int n11) {
        this.h(component, new wu_2(this, n10, n11));
    }

    public void h(Component component, E e2) {
        this.A(component, (Rectangle)e2.J());
        NC.b(component, this, this.h);
        this.I(component, e2);
    }

    protected void A(Component component, Rectangle rectangle) {
        this.k(component, rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    protected void k(Component component, int n10, int n11, int n12, int n13) {
        block3: {
            Component component2;
            block2: {
                String[] stringArray = QX.Y();
                component2 = component;
                if (stringArray != null) break block2;
                if (!component2.isShowing()) break block3;
                component2 = component;
            }
            Rectangle rectangle = FN.O(component2);
            this.setBounds(rectangle.x + n10, rectangle.y + n11, n12, n13);
            this.revalidate();
            this.repaint();
        }
    }

    protected void m(Component component, int n10, int n11, int n12, int n13) {
        block3: {
            Component component2;
            block2: {
                this.k();
                this.b = component;
                String[] stringArray = QX.Y();
                component2 = component;
                if (stringArray != null) break block2;
                if (!(component2 instanceof JComponent)) break block3;
                this.V = new fi_0(this, component, n10, n11, n12, n13);
                component2 = this.b;
            }
            ((JComponent)component2).addAncestorListener(this.V);
        }
    }

    protected void I(Component component, E e2) {
        block3: {
            Component component2;
            block2: {
                this.k();
                this.b = component;
                String[] stringArray = QX.Y();
                this.f = new X7(this, component, e2);
                this.b.addComponentListener(this.f);
                String[] stringArray2 = stringArray;
                component2 = component;
                if (stringArray2 != null) break block2;
                if (!(component2 instanceof JComponent)) break block3;
                this.V = new ff_0(this, component, e2);
                component2 = this.b;
            }
            ((JComponent)component2).addAncestorListener(this.V);
        }
    }

    protected void k() {
        block6: {
            Component component;
            block8: {
                String[] stringArray;
                block7: {
                    block5: {
                        stringArray = QX.Y();
                        component = this;
                        if (stringArray != null) break block5;
                        if (component.b == null) break block6;
                        component = this;
                    }
                    if (stringArray == null) {
                        if (component.f != null) {
                            this.b.removeComponentListener(this.f);
                        }
                        component = this;
                    }
                    if (stringArray != null) break block7;
                    if (component.V == null) break block6;
                    component = this.b;
                }
                if (stringArray != null) break block8;
                if (!(component instanceof JComponent)) break block6;
                component = this.b;
            }
            ((JComponent)component).removeAncestorListener(this.V);
        }
    }

    public void A(Component component) {
        this.c(component, false, false);
    }

    public void c(Component component, boolean bl, boolean bl2) {
        NC.z(component, this, bl, bl2);
    }

    public void V() {
        block5: {
            QX qX;
            block2: {
                block3: {
                    String[] stringArray;
                    block4: {
                        stringArray = QX.Y();
                        qX = this;
                        if (stringArray != null) break block2;
                        if (!qX.i) break block3;
                        this.M = ic_1.fadeOut;
                        WC wC = this.C;
                        if (stringArray != null) break block4;
                        if (wC.i()) break block5;
                        wC = this.C.u();
                    }
                    if (stringArray == null) break block5;
                }
                qX = this;
            }
            qX.Z();
        }
    }

    protected void Z() {
        block3: {
            qt_0 qt_02;
            block2: {
                String[] stringArray = QX.Y();
                this.k();
                qt_0 qt_03 = (qt_0)this.getParent();
                String[] stringArray2 = stringArray;
                qt_02 = qt_03;
                if (stringArray2 != null) break block2;
                if (qt_02 == null) break block3;
                qt_02 = qt_03;
            }
            qt_02.S(this);
        }
    }

    public void T() {
        this.setSize(this.getPreferredSize());
    }

    public void R() {
        block3: {
            AncestorListener ancestorListener;
            block2: {
                String[] stringArray = QX.Y();
                ancestorListener = this.V;
                if (stringArray != null) break block2;
                if (ancestorListener == null) break block3;
                ancestorListener = this.V;
            }
            ancestorListener.ancestorMoved(null);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean contains(int n10, int n11) {
        String[] stringArray = QX.Y();
        QX qX = this;
        if (stringArray == null) {
            if (qX.M == ic_1.fadeOut) return false;
            qX = this;
        }
        boolean bl = qX.B().contains(n10, n11);
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public void W(cg_2 cg_22) {
        this.w.add(cg_22);
    }

    public void j(cg_2 cg_22) {
        this.w.remove(cg_22);
    }

    public void X() {
        Iterator iterator = aL.J((Collection)this.w).iterator();
        String[] stringArray = QX.Y();
        while (iterator.hasNext()) {
            cg_2 cg_22 = (cg_2)iterator.next();
            cg_22.Y();
            if (stringArray == null) continue;
        }
    }

    public void C() {
        Iterator iterator = aL.J((Collection)this.w).iterator();
        String[] stringArray = QX.Y();
        while (iterator.hasNext()) {
            cg_2 cg_22 = (cg_2)iterator.next();
            cg_22.h();
            if (stringArray == null) continue;
        }
    }

    public void e() {
        Iterator iterator = aL.J((Collection)this.w).iterator();
        String[] stringArray = QX.Y();
        while (iterator.hasNext()) {
            cg_2 cg_22 = (cg_2)iterator.next();
            cg_22.T();
            if (stringArray == null) continue;
        }
    }

    public void H() {
        Iterator iterator = aL.J((Collection)this.w).iterator();
        String[] stringArray = QX.Y();
        while (iterator.hasNext()) {
            cg_2 cg_22 = (cg_2)iterator.next();
            cg_22.H();
            if (stringArray == null) continue;
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        String[] stringArray = QX.Y();
        QX qX = this;
        if (stringArray == null) {
            if (qX.F < 1.0f) {
                RV.p((Graphics2D)graphics, Float.valueOf(this.F));
            }
            qX = this;
        }
        super.paintComponent(graphics);
    }

    public static void f(String[] stringArray) {
        c = stringArray;
    }

    public static String[] Y() {
        return c;
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
                if (QX.Y() != null) {
                    QX.f(new String[4]);
                }
                char[] cArray3 = "j3%QP_(Mx!`[J".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 74;
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
                            n17 = 119;
                            break;
                        }
                        case 1: {
                            n17 = 28;
                            break;
                        }
                        case 2: {
                            n17 = 13;
                            break;
                        }
                        case 3: {
                            n17 = 75;
                            break;
                        }
                        case 4: {
                            n17 = 117;
                            break;
                        }
                        case 5: {
                            n17 = 101;
                            break;
                        }
                        default: {
                            n17 = 23;
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
        g = new String(cArray).intern();
        long l2 = 2846792827234914634L;
        z = 0x2781D6FE50779163L ^ l2;
    }
}

