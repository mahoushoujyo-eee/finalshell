/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.OO;
import com.RF;
import com.TK;
import com.XW;
import com._7;
import com.aL;
import com.cu_0;
import com.ky_2;
import com.n6_0;
import com.si_0;
import java.awt.Component;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Qj
 */
public class qj_0
extends ky_2 {
    protected List E = new ArrayList(1);
    protected boolean x = true;
    protected boolean k = false;
    protected XW p;
    protected List F;
    protected Component o;
    private static final String a;

    public qj_0() {
        this((Component)null);
    }

    public qj_0(Component component) {
        this(component, null);
    }

    public qj_0(n6_0 n6_02) {
        this(null, n6_02);
    }

    public qj_0(Component component, n6_0 n6_02) {
        super(new TK());
        String[] stringArray = XW.w();
        this.p = null;
        this.F = null;
        this.setFocusable(false);
        this.N(n6_02);
        this.o = component;
        Component component2 = component;
        if (stringArray == null && component2 != null) {
            component2 = this.add(component);
        }
    }

    public boolean L() {
        return this.x;
    }

    public void a(boolean bl) {
        this.x = bl;
    }

    public Component j() {
        String[] stringArray = XW.w();
        Component component = this;
        if (stringArray == null) {
            component = component.getComponentCount() > 0 ? this.getComponent(0) : null;
        }
        return component;
    }

    public void M(Component component) {
        block3: {
            qj_0 qj_02;
            block2: {
                String[] stringArray = XW.w();
                qj_02 = this;
                if (stringArray != null) break block2;
                if (qj_02.n()) break block3;
                this.o = component;
                this.removeAll();
                this.add(component);
                this.revalidate();
                qj_02 = this;
            }
            qj_02.repaint();
        }
    }

    public void L(Component component) {
        FN.p(new si_0(this, component));
    }

    public void A(long l2, Component component) {
        FN.u(l2, new cu_0(this, component));
    }

    protected void W(Component component) {
        block28: {
            qj_0 qj_02;
            BufferedImage bufferedImage;
            int n10;
            int n11;
            block24: {
                block25: {
                    String[] stringArray;
                    block27: {
                        qj_0 qj_03;
                        block26: {
                            Object object;
                            block23: {
                                Component component2;
                                block21: {
                                    block22: {
                                        qj_0 qj_04;
                                        block17: {
                                            block18: {
                                                qj_0 qj_05;
                                                block19: {
                                                    block20: {
                                                        stringArray = XW.w();
                                                        qj_04 = this;
                                                        if (stringArray == null) {
                                                            if (qj_04.o == component) {
                                                                return;
                                                            }
                                                            this.o = component;
                                                            qj_04 = this;
                                                        }
                                                        if (stringArray == null) {
                                                            if (!qj_04.y()) {
                                                                this.I(component);
                                                                return;
                                                            }
                                                            qj_04 = this;
                                                        }
                                                        if (stringArray != null) break block17;
                                                        if (qj_04.p == null) break block18;
                                                        qj_05 = this;
                                                        if (stringArray != null) break block19;
                                                        if (!qj_05.n()) break block20;
                                                        this.p.d();
                                                        if (stringArray == null) break block18;
                                                    }
                                                    qj_05 = this;
                                                }
                                                qj_05.p.b(true);
                                            }
                                            this.k = true;
                                            qj_04 = this;
                                        }
                                        n11 = qj_04.getWidth();
                                        n10 = this.getHeight();
                                        component2 = this;
                                        if (stringArray != null) break block21;
                                        if (component2.p == null) break block22;
                                        bufferedImage = this.p.y();
                                        if (stringArray == null) break block23;
                                    }
                                    component2 = this;
                                }
                                if (stringArray == null) {
                                    component2 = component2.getComponentCount() > 0 ? this.getComponent(0) : null;
                                }
                                object = component2;
                                bufferedImage = FN.O((Component)object, n11, n10);
                            }
                            this.setFocusable(true);
                            qj_02 = this;
                            if (stringArray != null) break block24;
                            if (!qj_02.x) break block25;
                            qj_02 = this;
                            if (stringArray != null) break block24;
                            if (!FN.l((Component)qj_02)) break block25;
                            object = new RF(this, component, n11, n10, bufferedImage);
                            this.addFocusListener((FocusListener)object);
                            qj_03 = this;
                            if (stringArray != null) break block26;
                            if (qj_03.requestFocusInWindow()) break block27;
                            this.removeFocusListener((FocusListener)object);
                            qj_03 = this;
                        }
                        qj_03.I(component, n11, n10, bufferedImage);
                    }
                    if (stringArray == null) break block28;
                }
                qj_02 = this;
            }
            qj_02.I(component, n11, n10, bufferedImage);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean y() {
        String[] stringArray = XW.w();
        qj_0 qj_02 = this;
        if (stringArray == null) {
            if (qj_02.N() == null) return false;
            qj_02 = this;
        }
        boolean bl = qj_02.isShowing();
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    protected void I(Component component, int n10, int n11, BufferedImage bufferedImage) {
        String[] stringArray = XW.w();
        this.removeAll();
        String[] stringArray2 = stringArray;
        Component component2 = component;
        if (stringArray2 == null) {
            if (component2 != null) {
                this.add(component, a);
            }
            component2 = component;
        }
        BufferedImage bufferedImage2 = FN.O(component2, n10, n11);
        this.removeAll();
        this.p = new XW(bufferedImage, bufferedImage2);
        this.p.C(this.F);
        this.add(this.p);
        this.revalidate();
        this.repaint();
        this.p.s(new OO(this, component));
        this.p.x();
        if (ky_2.F() != null) {
            XW.N(new String[4]);
        }
    }

    protected void I(Component component) {
        String[] stringArray = XW.w();
        this.removeAll();
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            if (component != null) {
                this.add(component);
            }
            this.revalidate();
            this.repaint();
            this.k = false;
        }
        qj_0 qj_02 = this;
        if (stringArray2 == null) {
            if (qj_02.isFocusOwner()) {
                this.transferFocus();
            }
            this.setFocusable(false);
            qj_02 = this;
        }
        if (stringArray2 == null) {
            if (qj_02.p != null) {
                this.p.R();
                this.p = null;
            }
            qj_02 = this;
        }
        qj_02.y();
    }

    public boolean n() {
        return this.k;
    }

    public List u() {
        return this.F;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public n6_0 N() {
        String[] stringArray = XW.w();
        List list = this.F;
        if (stringArray == null) {
            if (list == null) return null;
            list = this.F;
        }
        if (stringArray == null) {
            if (list.size() <= 0) return null;
            list = this.F.get(0);
        }
        n6_0 n6_02 = (n6_0)((Object)list);
        return n6_02;
    }

    public void J(n6_0 n6_02) {
        String[] stringArray = XW.w();
        List list = this.F;
        if (stringArray == null) {
            if (list == null) {
                this.F = new ArrayList();
            }
            list = this.F;
        }
        list.add(n6_02);
    }

    public void P() {
        block3: {
            block2: {
                String[] stringArray = XW.w();
                qj_0 qj_02 = this;
                if (stringArray != null) break block2;
                if (qj_02.F == null) break block3;
                qj_02 = this;
            }
            qj_02.F = null;
        }
    }

    public void Y(n6_0 n6_02) {
        block3: {
            List list;
            block2: {
                String[] stringArray = XW.w();
                list = this.F;
                if (stringArray != null) break block2;
                if (list == null) break block3;
                list = this.F;
            }
            list.remove(n6_02);
        }
    }

    public void N(n6_0 n6_02) {
        this.F = n6_02 != null ? aL.e(new n6_0[]{n6_02}) : null;
    }

    public void v(List list) {
        this.F = list;
    }

    /*
     * Unable to fully structure code
     */
    public void A(n6_0[] var1_1) {
        var2_2 = XW.w();
        v0 = var1_1;
        if (var2_2 != null) ** GOTO lbl6
        if (v0 != null) {
            v0 = var1_1;
lbl6:
            // 2 sources

            v1 = aL.e(v0);
        } else {
            v1 = null;
        }
        this.F = v1;
    }

    public void R(_7 _72) {
        this.E.add(_72);
    }

    public void n(_7 _72) {
        this.E.remove(_72);
    }

    public void g() {
        Iterator iterator = aL.J((Collection)this.E).iterator();
        String[] stringArray = XW.w();
        while (iterator.hasNext()) {
            _7 _72 = (_7)iterator.next();
            _72.X();
            if (stringArray == null) continue;
        }
    }

    public void y() {
        Iterator iterator = aL.J((Collection)this.E).iterator();
        String[] stringArray = XW.w();
        while (iterator.hasNext()) {
            _7 _72 = (_7)iterator.next();
            _72.L();
            if (stringArray == null) continue;
        }
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
                char[] cArray3 = "b%\\\u0011%\u0007".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 1;
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
                            n17 = 43;
                            break;
                        }
                        case 1: {
                            n17 = 109;
                            break;
                        }
                        case 2: {
                            n17 = 25;
                            break;
                        }
                        case 3: {
                            n17 = 84;
                            break;
                        }
                        case 4: {
                            n17 = 97;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 39;
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
        a = new String(cArray).intern();
    }
}

