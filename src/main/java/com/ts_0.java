/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import com.nr_1;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.SwingConstants;

/*
 * Renamed from com.Ts
 */
public class ts_0
extends T4
implements SwingConstants {
    protected boolean F = true;
    protected boolean a = true;
    protected int d = 0;
    protected int W = 0;
    protected int J = (int)b;
    protected int v = 1;
    protected boolean o = false;
    protected int M = 0;
    protected int S = 0;
    protected ArrayList I;
    private static final long b;

    public ts_0() {
        this(false);
    }

    public ts_0(boolean bl) {
        this(bl, 0, 0);
    }

    public ts_0(int n10, int n11) {
        this(false, n10, n11);
    }

    public ts_0(boolean bl, int n10, int n11) {
        this.a = bl;
        this.d = n10;
        this.W = n11;
    }

    public boolean a() {
        return this.F;
    }

    public void o(boolean bl) {
        this.F = bl;
    }

    public boolean i() {
        return this.a;
    }

    public void Q(boolean bl) {
        this.a = bl;
    }

    public int I() {
        return this.d;
    }

    public void F(int n10) {
        this.d = n10;
    }

    public int E() {
        return this.W;
    }

    public void Q(int n10) {
        this.W = n10;
    }

    public int F() {
        return this.J;
    }

    public void V(int n10) {
        this.J = n10;
    }

    public int q() {
        return this.v;
    }

    public void p(int n10) {
        this.v = n10;
    }

    public boolean m() {
        return this.o;
    }

    public void q(boolean bl) {
        this.o = bl;
    }

    public int S() {
        return this.M;
    }

    public int v() {
        return this.S;
    }

    public ArrayList Z() {
        return this.I;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        this.layoutContainer(container);
        return new Dimension(this.M, this.S);
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        this.layoutContainer(container);
        return new Dimension(0, this.S);
    }

    @Override
    public void layoutContainer(Container container) {
        int n10;
        int n11;
        int n12;
        Insets insets;
        int n13;
        block19: {
            n13 = T4.O();
            Container container2 = container;
            if (n13 == 0) {
                if (container2.getComponentCount() == 0) {
                    this.M = 0;
                    this.S = 0;
                    this.I = new ArrayList(0);
                    return;
                }
                container2 = container;
            }
            insets = container2.getInsets();
            n12 = container.getWidth() - insets.left - insets.right;
            int n14 = 0;
            int n15 = 0;
            this.M = 0;
            this.S = 0;
            int n16 = 0;
            int n17 = 0;
            this.I = new ArrayList();
            n11 = 0;
            while (n11 < container.getComponentCount()) {
                int n18;
                Dimension dimension;
                Component component;
                block21: {
                    block22: {
                        ts_0 ts_02;
                        block23: {
                            block24: {
                                component = container.getComponent(n11);
                                dimension = component.getPreferredSize();
                                n10 = n15;
                                if (n13 != 0) break block19;
                                if (n13 != 0) break block21;
                                if (n10 <= 0) break block22;
                                ts_02 = this;
                                if (n13 != 0) break block23;
                                if (ts_02.m()) break block24;
                                n18 = n16 + this.d + dimension.width;
                                if (n13 != 0) break block21;
                                if (n18 <= n12) break block22;
                            }
                            ((nr_1)this.I.get(n14)).A(n16);
                            ((nr_1)this.I.get(n14)).V(n17);
                            this.M = Math.max(this.M, n16);
                            ts_02 = this;
                        }
                        int n19 = ts_02.S;
                        int n20 = n14;
                        if (n13 == 0) {
                            n20 = n20 > 0 ? this.W : 0;
                        }
                        ts_02.S = n19 + (n20 + n17);
                        n15 = 0;
                        n16 = 0;
                        n17 = 0;
                        ++n14;
                    }
                    n18 = this.F;
                }
                if (n13 == 0) {
                    n18 = n18 != 0 ? Math.min(dimension.width, n12) : dimension.width;
                }
                int n21 = n18;
                int n22 = n15;
                if (n13 == 0) {
                    n22 = n22 > 0 ? this.d : 0;
                }
                n16 += n22 + n21;
                n17 = Math.max(n17, dimension.height);
                ++n15;
                if (n13 == 0) {
                    if (n14 >= this.I.size()) {
                        this.I.add(new nr_1());
                    }
                    ((nr_1)this.I.get(n14)).Z(component);
                    ++n11;
                }
                if (n13 == 0) continue;
            }
            ((nr_1)this.I.get(n14)).A(n16);
            ((nr_1)this.I.get(n14)).V(n17);
            int n23 = n14;
            if (n13 == 0) {
                n23 = n23 > 0 ? this.W : 0;
            }
            this.S += n23 + n17;
            this.S += insets.top + insets.bottom;
            n10 = this.e(container, insets);
        }
        int n24 = n10;
        for (nr_1 nr_12 : this.I) {
            block20: {
                int n25;
                n11 = this.r(container, insets, nr_12);
                int n26 = 0;
                for (Component component : nr_12.X()) {
                    int n27;
                    block25: {
                        int n28;
                        int n29;
                        block27: {
                            int n30;
                            block26: {
                                int n31;
                                Dimension dimension = component.getPreferredSize();
                                n25 = this.F ? 1 : 0;
                                if (n13 != 0) break block20;
                                if (n13 == 0) {
                                    n31 = n25 != 0 ? Math.min(dimension.width, n12) : dimension.width;
                                }
                                n30 = n31;
                                n27 = this.a;
                                if (n13 != 0) break block25;
                                if (n27 == 0) break block26;
                                n29 = n26 + 1;
                                n28 = nr_12.X().size();
                                if (n13 != 0) break block27;
                                if (n29 != n28) break block26;
                                n29 = this.J;
                                n28 = 2;
                                if (n13 != 0) break block27;
                                if (n29 == n28) {
                                    n30 = insets.left + n12 - n11;
                                }
                            }
                            component.setBounds(n11, n24, n30, nr_12.Z());
                            n29 = n11;
                            n28 = n30 + this.d;
                        }
                        n27 = n29 + n28;
                    }
                    n11 = n27;
                    ++n26;
                    if (n13 == 0) continue;
                }
                n25 = n24 = n24 + (nr_12.Z() + this.W);
            }
            if (n13 == 0) continue;
        }
    }

    protected int r(Container container, Insets insets, nr_1 nr_12) {
        int n10;
        block6: {
            int n11;
            int n12;
            block7: {
                block8: {
                    int n13;
                    block4: {
                        block5: {
                            block2: {
                                int n14;
                                block3: {
                                    n13 = T4.b();
                                    n14 = this.a;
                                    if (n13 == 0) break block2;
                                    if (n14 != 0) break block3;
                                    n12 = this.J;
                                    n11 = 2;
                                    if (n13 == 0) break block4;
                                    if (n12 != n11) break block5;
                                }
                                n14 = n10 = insets.left;
                            }
                            if (n13 != 0) break block6;
                        }
                        n12 = this.J;
                        n11 = 4;
                    }
                    if (n13 == 0) break block7;
                    if (n12 != n11) break block8;
                    n10 = container.getWidth() - insets.right - nr_12.g();
                    if (n13 != 0) break block6;
                }
                n12 = container.getWidth() / 2;
                n11 = nr_12.g() / 2;
            }
            n10 = n12 - n11;
        }
        return n10;
    }

    protected int e(Container container, Insets insets) {
        int n10;
        block4: {
            int n11;
            int n12;
            block5: {
                block6: {
                    int n13;
                    block2: {
                        block3: {
                            n13 = T4.b();
                            n12 = this.v;
                            n11 = 1;
                            if (n13 == 0) break block2;
                            if (n12 != n11) break block3;
                            n10 = insets.top;
                            if (n13 != 0) break block4;
                        }
                        n12 = this.v;
                        n11 = 3;
                    }
                    if (n13 == 0) break block5;
                    if (n12 != n11) break block6;
                    n10 = container.getHeight() - insets.bottom - this.S;
                    if (n13 != 0) break block4;
                }
                n12 = insets.top + container.getHeight() / 2;
                n11 = this.S / 2;
            }
            n10 = n12 - n11;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7103382440556308555L;
        b = 0xBAE5D405C11B2849L ^ l2;
    }
}

