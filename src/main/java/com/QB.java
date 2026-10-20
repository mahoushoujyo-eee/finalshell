/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GO;
import com.ON;
import com.SN;
import com.WC;
import com.W_;
import com._U;
import com.aL;
import com.cg_2;
import com.dv_2;
import com.ie_1;
import com.ka_0;
import com.ky_2;
import com.oc_2;
import com.og_2;
import com.rt_0;
import com.xk_0;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JWindow;
import javax.swing.Popup;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class QB
extends ky_2
implements W_ {
    protected List a = new ArrayList(2);
    protected boolean V = true;
    protected boolean F = true;
    protected boolean e = false;
    protected boolean Y = false;
    protected float P = 1.0f;
    protected boolean n = true;
    protected float A = 0.05f;
    protected float y = 0.0f;
    protected final Object c = new Object();
    protected boolean r = false;
    protected boolean U = false;
    protected WC l = null;
    protected WC S = null;
    protected final List t;
    protected final List K;
    protected final Object i;
    protected Popup E;
    protected JWindow w;
    protected Component b;
    protected Window z;
    protected AWTEventListener N;
    protected ka_0 f;
    protected rt_0 W;
    private static final long p;

    public QB() {
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(Component component) {
        super(component);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(og_2 og_22) {
        super(og_22);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(LayoutManager layoutManager, og_2 og_22) {
        super(layoutManager, og_22);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(og_2 og_22, Component component) {
        super(og_22, component);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(LayoutManager layoutManager, og_2 og_22, Component[] componentArray) {
        super(layoutManager, og_22, componentArray);
        int[] nArray = WC.V();
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
        if (ky_2.F() != null) {
            WC.I(new int[4]);
        }
    }

    public QB(LayoutManager layoutManager) {
        super(layoutManager);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(LayoutManager layoutManager, Component[] componentArray) {
        super(layoutManager, componentArray);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(String string) {
        super(string);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(String string, LayoutManager layoutManager) {
        super(string, layoutManager);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public QB(String string, Component component) {
        super(string, component);
        this.t = new ArrayList();
        this.K = new ArrayList();
        this.i = new Object();
    }

    public boolean l() {
        return this.V;
    }

    public void a(boolean bl) {
        this.V = bl;
    }

    public Popup F() {
        return this.E;
    }

    public JWindow W() {
        return this.w;
    }

    public Component F() {
        return this.b;
    }

    public Window w() {
        return this.z;
    }

    public float u() {
        return this.y;
    }

    public boolean q() {
        return this.r;
    }

    public boolean k() {
        return this.U;
    }

    public JWindow C(boolean bl) {
        this.F = bl;
        return this.E();
    }

    protected JWindow E() {
        int[] nArray = WC.V();
        JWindow jWindow = this.w;
        if (nArray == null) {
            if (jWindow != null) {
                SN.N(this.w, this.F);
            }
            jWindow = this.w;
        }
        return jWindow;
    }

    @Override
    public boolean N() {
        return this.F;
    }

    public JWindow t(float f10) {
        this.P = f10;
        return this.B();
    }

    protected JWindow B() {
        int[] nArray = WC.V();
        JWindow jWindow = this.w;
        if (nArray == null) {
            if (jWindow != null) {
                SN.s(this.w, this.P * this.y);
            }
            jWindow = this.w;
        }
        return jWindow;
    }

    @Override
    public float B() {
        return this.P;
    }

    public boolean Z() {
        return this.e;
    }

    public void t(boolean bl) {
        block5: {
            QB qB;
            block10: {
                int[] nArray;
                block9: {
                    block8: {
                        block2: {
                            block3: {
                                QB qB2;
                                block7: {
                                    block6: {
                                        block4: {
                                            nArray = WC.V();
                                            qB = this;
                                            if (nArray != null) break block2;
                                            qB.e = bl;
                                            if (!bl) break block3;
                                            qB2 = this;
                                            if (nArray != null) break block4;
                                            if (qB2.w == null) break block5;
                                            qB2 = this;
                                        }
                                        if (nArray != null) break block6;
                                        if (qB2.W != null) break block5;
                                        qB2 = this;
                                    }
                                    if (nArray != null) break block7;
                                    if (qB2.z == null) break block5;
                                    qB2 = this;
                                }
                                qB2.h();
                                if (nArray == null) break block5;
                            }
                            qB = this;
                        }
                        if (nArray != null) break block8;
                        if (qB.w == null) break block5;
                        qB = this;
                    }
                    if (nArray != null) break block9;
                    if (qB.W == null) break block5;
                    qB = this;
                }
                if (nArray != null) break block10;
                if (qB.z == null) break block5;
                qB = this;
            }
            qB.Y();
        }
    }

    protected void h() {
        this.W = rt_0.q(this.w, this.z);
    }

    protected void Y() {
        rt_0.f(this.z, this.W);
        this.W = null;
    }

    public boolean G() {
        return this.Y;
    }

    public void J(boolean bl) {
        block3: {
            JWindow jWindow;
            block2: {
                this.Y = bl;
                int[] nArray = WC.V();
                jWindow = this.w;
                if (nArray != null) break block2;
                if (jWindow == null) break block3;
                jWindow = this.w;
            }
            jWindow.setAlwaysOnTop(bl);
        }
    }

    public boolean o() {
        return this.n;
    }

    public void Y(boolean bl) {
        this.n = bl;
    }

    public float J() {
        return this.A;
    }

    public void c(float f10) {
        this.A = f10;
    }

    public QB F(Component component, Point point) {
        return this.M(component, point.x, point.y);
    }

    public QB M(Component component, int n10, int n11) {
        this.T(component, n10, n11);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void T(Component component, int n10, int n11) {
        Object object = this.c;
        synchronized (object) {
            block39: {
                Object object2;
                boolean bl;
                block38: {
                    int[] nArray;
                    block35: {
                        QB qB;
                        block37: {
                            block36: {
                                block34: {
                                    block32: {
                                        QB qB2;
                                        block33: {
                                            block31: {
                                                QB qB3;
                                                boolean bl2;
                                                block28: {
                                                    block30: {
                                                        block29: {
                                                            block26: {
                                                                Object object3;
                                                                block27: {
                                                                    nArray = WC.V();
                                                                    object3 = this;
                                                                    if (nArray != null) break block26;
                                                                    if (((QB)object3).r) break block27;
                                                                    bl2 = this.U;
                                                                    if (nArray != null) break block28;
                                                                    if (bl2) break block29;
                                                                    qB3 = this;
                                                                    if (nArray != null) break block30;
                                                                    if (qB3.w == null) break block29;
                                                                }
                                                                object3 = object;
                                                            }
                                                            // ** MonitorExit[v0] (shouldn't be in output)
                                                            return;
                                                        }
                                                        this.r = true;
                                                        qB3 = this;
                                                    }
                                                    if (nArray != null) break block31;
                                                    bl2 = qB3.U;
                                                }
                                                if (bl2) {
                                                    QB qB4 = this;
                                                    if (nArray == null) {
                                                        if (qB4.S != null) {
                                                            this.S.Y();
                                                        }
                                                        qB4 = this;
                                                    }
                                                    qB4.U = false;
                                                }
                                                this.b = component;
                                                this.z = FN.L(component);
                                                qB3 = this;
                                            }
                                            qB3.y = this.n ? 0.0f : 1.0f;
                                            qB2 = this;
                                            if (nArray != null) break block32;
                                            if (qB2.z == null) break block33;
                                            Rectangle rectangle = FN.f(component);
                                            this.E = xk_0.L(component, this, rectangle.x + n10, rectangle.y + n11);
                                            if (nArray == null) break block34;
                                        }
                                        qB2 = this;
                                    }
                                    qB2.E = xk_0.L(component, this, n10, n11);
                                }
                                this.w = (JWindow)FN.L(this);
                                this.w.setAlwaysOnTop(this.Y);
                                this.E();
                                this.B();
                                this.z();
                                this.N = new oc_2(this);
                                Toolkit.getDefaultToolkit().addAWTEventListener(this.N, p);
                                this.f = new ie_1(this);
                                ON.F(this.f);
                                this.E.show();
                                bl = this.n;
                                if (nArray == null) {
                                    if (bl) {
                                        this.l = WC.E(GO.L, 0L, new dv_2(this));
                                    }
                                    bl = this.e;
                                }
                                if (nArray != null) break block35;
                                if (!bl) break block36;
                                qB = this;
                                if (nArray != null) break block37;
                                if (qB.z != null) {
                                    this.h();
                                }
                            }
                            qB = this;
                        }
                        bl = qB.n;
                    }
                    if (nArray != null) break block38;
                    if (!bl) {
                        this.r = false;
                    }
                    this.t();
                    object2 = this;
                    if (nArray != null) break block39;
                    bl = ((QB)object2).n;
                }
                if (!bl) {
                    this.T();
                }
                object2 = object;
            }
            // ** MonitorExit[v7] (shouldn't be in output)
            return;
        }
    }

    public QB l() {
        this.W();
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void W() {
        block23: {
            Object object = this.c;
            synchronized (object) {
                QB qB;
                block21: {
                    block22: {
                        int[] nArray;
                        block20: {
                            boolean bl;
                            QB qB2;
                            block19: {
                                block17: {
                                    block18: {
                                        block15: {
                                            Object object2;
                                            block16: {
                                                nArray = WC.V();
                                                object2 = this;
                                                if (nArray != null) break block15;
                                                if (((QB)object2).U) break block16;
                                                object2 = this.w;
                                                if (nArray != null) break block15;
                                                if (object2 == null) break block16;
                                                qB2 = this;
                                                if (nArray != null) break block17;
                                                if (qB2.w == null) break block18;
                                                bl = this.w.isShowing();
                                                if (nArray != null) break block19;
                                                if (bl) break block18;
                                            }
                                            object2 = object;
                                        }
                                        // ** MonitorExit[v0] (shouldn't be in output)
                                        return;
                                    }
                                    this.U = true;
                                    qB2 = this;
                                }
                                if (nArray != null) break block20;
                                bl = qB2.r;
                            }
                            if (bl) {
                                QB qB3 = this;
                                if (nArray == null) {
                                    if (qB3.l != null) {
                                        this.l.Y();
                                    }
                                    qB3 = this;
                                }
                                qB3.r = false;
                            }
                            qB2 = this;
                        }
                        qB2.y = this.n ? 1.0f : 0.0f;
                        qB = this;
                        if (nArray != null) break block21;
                        if (!qB.n) break block22;
                        this.S = WC.E(GO.L, 0L, new _U(this));
                        if (nArray == null) break block23;
                    }
                    qB = this;
                }
                qB.D();
            }
        }
    }

    protected void D() {
        QB qB;
        block4: {
            block5: {
                int[] nArray = WC.V();
                this.g();
                int[] nArray2 = nArray;
                qB = this;
                if (nArray2 != null) break block4;
                if (!qB.e) break block5;
                qB = this;
                if (nArray2 != null) break block4;
                if (qB.z != null) {
                    this.Y();
                }
            }
            Toolkit.getDefaultToolkit().removeAWTEventListener(this.N);
            this.N = null;
            ON.x(this.f);
            this.f = null;
            this.z = null;
            this.b = null;
            this.E.hide();
            this.E = null;
            this.w = null;
            this.S();
            qB = this;
        }
        qB.q();
    }

    protected void i() {
    }

    protected void f() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void p(Runnable runnable) {
        Object object = this.i;
        synchronized (object) {
            block12: {
                Object object2;
                block11: {
                    boolean bl;
                    int[] nArray;
                    block9: {
                        block10: {
                            block7: {
                                boolean bl2;
                                block8: {
                                    nArray = WC.V();
                                    bl2 = this.isShowing();
                                    if (nArray != null) break block7;
                                    if (!bl2) break block8;
                                    bl = this.q();
                                    if (nArray != null) break block9;
                                    if (!bl) break block10;
                                }
                                bl2 = this.t.add(runnable);
                            }
                            if (nArray == null) break block11;
                        }
                        object2 = this;
                        if (nArray != null) break block12;
                        bl = ((Component)object2).isShowing();
                    }
                    if (!bl) break block11;
                    object2 = this;
                    if (nArray != null) break block12;
                    if (!((QB)object2).k()) {
                        runnable.run();
                    }
                }
                object2 = object;
            }
            // ** MonitorExit[v2] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void T() {
        Object object = this.i;
        synchronized (object) {
            block5: {
                int[] nArray = WC.V();
                for (Runnable runnable : this.t) {
                    runnable.run();
                    if (nArray == null) {
                        if (nArray == null) continue;
                    }
                    break block5;
                }
                this.t.clear();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(Runnable runnable) {
        block7: {
            Object object = this.i;
            synchronized (object) {
                block6: {
                    int[] nArray;
                    block5: {
                        nArray = WC.V();
                        boolean bl = this.isShowing();
                        if (nArray != null) break block5;
                        if (!bl) break block6;
                        bl = this.K.add(runnable);
                    }
                    if (nArray == null) break block7;
                }
                runnable.run();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void q() {
        Object object = this.i;
        synchronized (object) {
            block5: {
                int[] nArray = WC.V();
                for (Runnable runnable : this.K) {
                    runnable.run();
                    if (nArray == null) {
                        if (nArray == null) continue;
                    }
                    break block5;
                }
                this.K.clear();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e(cg_2 cg_22) {
        Object object = this.i;
        synchronized (object) {
            this.a.add(cg_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j(cg_2 cg_22) {
        Object object = this.i;
        synchronized (object) {
            this.a.remove(cg_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void z() {
        Object object = this.i;
        synchronized (object) {
            int[] nArray = WC.V();
            for (cg_2 cg_22 : aL.J((Collection)this.a)) {
                cg_22.Y();
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void t() {
        Object object = this.i;
        synchronized (object) {
            int[] nArray = WC.V();
            for (cg_2 cg_22 : aL.J((Collection)this.a)) {
                cg_22.h();
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void g() {
        Object object = this.i;
        synchronized (object) {
            int[] nArray = WC.V();
            for (cg_2 cg_22 : aL.J((Collection)this.a)) {
                cg_22.T();
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void S() {
        Object object = this.i;
        synchronized (object) {
            int[] nArray = WC.V();
            for (cg_2 cg_22 : aL.J((Collection)this.a)) {
                cg_22.H();
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break;
            }
            return;
        }
    }

    public JWindow G() {
        return (JWindow)SN.v(this.w);
    }

    public JWindow E(Component component) {
        return (JWindow)SN.u(this.w, component);
    }

    public JWindow C(int n10, int n11) {
        return (JWindow)SN.H(this.w, n10, n11);
    }

    public JWindow i(Component component, int n10, int n11) {
        return (JWindow)SN.Q(this.w, component, n10, n11);
    }

    public JWindow h(int n10) {
        return (JWindow)SN.W(this.w, n10);
    }

    @Override
    public JWindow x(int n10) {
        return (JWindow)SN.G(this.w, n10);
    }

    public JWindow z() {
        return (JWindow)SN.D(this.w);
    }

    public JWindow r(boolean bl) {
        return (JWindow)SN.g(this.w, bl);
    }

    @Override
    public Window S(boolean bl) {
        return this.r(bl);
    }

    @Override
    public Window X() {
        return this.z();
    }

    @Override
    public Window o(int n10) {
        return this.x(n10);
    }

    @Override
    public Window U(int n10) {
        return this.h(n10);
    }

    @Override
    public Window A(Component component, int n10, int n11) {
        return this.i(component, n10, n11);
    }

    @Override
    public Window q(int n10, int n11) {
        return this.C(n10, n11);
    }

    @Override
    public Window I(Component component) {
        return this.E(component);
    }

    @Override
    public Window F() {
        return this.G();
    }

    @Override
    public Window D(float f10) {
        return this.t(f10);
    }

    @Override
    public Window h(boolean bl) {
        return this.C(bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 212897127728810365L;
        p = 0x2F45CCF47FA096DL ^ l2;
    }
}

