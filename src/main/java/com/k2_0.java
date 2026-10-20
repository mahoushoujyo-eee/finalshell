/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KD;
import com.PW;
import com.PZ;
import com.TJ;
import com.TO;
import com.W2;
import com.Y0;
import com.gi_0;
import com.k3_0;
import com.ky_2;
import com.nw_2;
import com.og_2;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.k2
 */
public class k2_0
extends ky_2
implements SwingConstants {
    protected int F = -1;
    protected boolean o = false;
    protected PZ O;
    protected PropertyChangeListener Z;
    private static final String[] a;
    private static final String[] b;

    public k2_0(JComponent[] jComponentArray) {
        this(0, jComponentArray);
    }

    public k2_0(boolean bl, JComponent[] jComponentArray) {
        this(0, bl, jComponentArray);
    }

    public k2_0(int n10, JComponent[] jComponentArray) {
        this(n10, false, jComponentArray);
    }

    public k2_0(int n10, boolean bl, JComponent[] jComponentArray) {
        this.o = bl;
        this.putClientProperty(k2_0.b(-2048, -17279), true);
        this.setOpaque(false);
        this.F(n10);
        this.addContainerListener(new Y0(this, bl));
        this.Z = new PW(this);
        this.S(jComponentArray);
    }

    public KD r(int n10) {
        return (KD)this.getComponent(n10);
    }

    public KD o(String string) {
        Component[] componentArray = this.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        int n11 = 0;
        while (n11 < n10) {
            Component component = componentArray[n11];
            if (nArray != null) {
                if (component.getName().equals(string)) {
                    return (KD)component;
                }
                ++n11;
            }
            if (nArray != null) continue;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean V() {
        int[] nArray = k3_0.L();
        ButtonModel buttonModel = this.O.getSelection();
        if (nArray != null) {
            if (buttonModel == null) return false;
            buttonModel = this.O.getSelection();
        }
        boolean bl = buttonModel.isSelected();
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public boolean t() {
        return this.o;
    }

    public void q(boolean bl) {
        block3: {
            k2_0 k2_02;
            block4: {
                block5: {
                    boolean bl2;
                    int[] nArray;
                    block2: {
                        nArray = k3_0.L();
                        bl2 = this.o;
                        if (nArray == null) break block2;
                        if (bl2 == bl) break block3;
                        k2_02 = this;
                        if (nArray == null) break block4;
                        k2_02.o = bl;
                        bl2 = bl;
                    }
                    if (!bl2) break block5;
                    this.L(this);
                    if (nArray != null) break block3;
                }
                k2_02 = this;
            }
            k2_02.q(this);
        }
    }

    public PZ l() {
        int[] nArray = k3_0.L();
        PZ pZ = this.O;
        if (nArray != null) {
            if (pZ == null) {
                this.O = new PZ();
                this.O.F(false);
            }
            pZ = this.O;
        }
        return pZ;
    }

    protected void L(Component component) {
        block5: {
            k2_0 k2_02;
            int[] nArray;
            block6: {
                boolean bl;
                block3: {
                    block4: {
                        nArray = k3_0.L();
                        bl = this.N(component);
                        if (nArray == null) break block3;
                        if (!bl) break block4;
                        this.l().add((AbstractButton)component);
                        if (nArray != null) break block5;
                    }
                    k2_02 = this;
                    if (nArray == null) break block6;
                    bl = k2_02.m(component);
                }
                if (!bl) break block5;
                k2_02 = (k2_0)component;
            }
            k2_0 k2_03 = k2_02;
            for (Component component2 : k2_03.getComponents()) {
                this.L(component2);
                if (nArray != null) continue;
            }
        }
    }

    protected void q(Component component) {
        block5: {
            k2_0 k2_02;
            int[] nArray;
            block6: {
                boolean bl;
                block3: {
                    block4: {
                        nArray = k3_0.L();
                        bl = this.N(component);
                        if (nArray == null) break block3;
                        if (!bl) break block4;
                        this.l().remove((AbstractButton)component);
                        if (nArray != null) break block5;
                    }
                    k2_02 = this;
                    if (nArray == null) break block6;
                    bl = k2_02.m(component);
                }
                if (!bl) break block5;
                k2_02 = (k2_0)component;
            }
            k2_0 k2_03 = k2_02;
            for (Component component2 : k2_03.getComponents()) {
                this.q(component2);
                if (nArray != null) continue;
            }
        }
    }

    public boolean M() {
        return this.l().f();
    }

    public void V(boolean bl) {
        this.l().F(bl);
    }

    public int v() {
        return this.F;
    }

    public void F(int n10) {
        block3: {
            k2_0 k2_02;
            block2: {
                int[] nArray = k3_0.L();
                k2_02 = this;
                if (nArray == null) break block2;
                if (k2_02.F == n10) break block3;
                this.F = n10;
                k2_02 = this;
            }
            k2_02.setLayout(n10 == 0 ? new TJ(0, false) : new TO(0, 0, 0, true, false));
            this.Y();
        }
    }

    protected void Y() {
        Component[] componentArray = this.getComponents();
        int[] nArray = k3_0.L();
        int n10 = this.F;
        if (nArray != null) {
            n10 = n10 == 0 ? 1 : 0;
        }
        int n11 = n10;
        int n12 = 0;
        for (int i2 = 0; i2 < componentArray.length; ++i2) {
            int n13;
            block28: {
                block29: {
                    block17: {
                        int n14;
                        block35: {
                            nw_2 nw_22;
                            gi_0 gi_02;
                            Component component;
                            int n15;
                            int n16;
                            Component[] componentArray2;
                            block36: {
                                W2 w2;
                                block37: {
                                    block16: {
                                        block30: {
                                            block18: {
                                                block19: {
                                                    block23: {
                                                        int n17;
                                                        block24: {
                                                            block27: {
                                                                int n18;
                                                                block25: {
                                                                    block26: {
                                                                        block20: {
                                                                            block21: {
                                                                                block22: {
                                                                                    n13 = this.O(componentArray[i2]);
                                                                                    if (nArray == null) break block18;
                                                                                    if (n13 == 0) break block19;
                                                                                    w2 = (gi_0)((AbstractButton)componentArray[i2]).getUI();
                                                                                    n17 = n12;
                                                                                    if (nArray == null) break block20;
                                                                                    if (n17 == 0) break block21;
                                                                                    if (n11 == 0) break block22;
                                                                                    ((gi_0)w2).m(false);
                                                                                    ((gi_0)w2).Q(false);
                                                                                    if (nArray != null) break block21;
                                                                                }
                                                                                ((gi_0)w2).J(false);
                                                                                ((gi_0)w2).L(false);
                                                                            }
                                                                            n17 = i2;
                                                                        }
                                                                        if (nArray == null) break block23;
                                                                        if (n17 >= componentArray.length - 1) break block24;
                                                                        n18 = this.O(componentArray[i2 + 1]);
                                                                        if (nArray == null) break block25;
                                                                        if (n18 != 0) break block26;
                                                                        n17 = this.m(componentArray[i2 + 1]) ? '\u0001' : '\u0000';
                                                                        if (nArray == null) break block23;
                                                                        if (n17 == 0) break block24;
                                                                    }
                                                                    n18 = n11;
                                                                }
                                                                if (n18 == 0) break block27;
                                                                ((gi_0)w2).E(false);
                                                                ((gi_0)w2).K(true);
                                                                if (nArray != null) break block24;
                                                            }
                                                            ((gi_0)w2).r(false);
                                                            ((gi_0)w2).W(true);
                                                        }
                                                        n17 = n12 = 1;
                                                    }
                                                    if (nArray != null) continue;
                                                }
                                                n13 = this.m(componentArray[i2]);
                                            }
                                            if (nArray == null) break block28;
                                            if (n13 == 0) break block29;
                                            w2 = (k2_0)componentArray[i2];
                                            n14 = n12;
                                            if (nArray == null) break block16;
                                            if (n14 == 0) break block30;
                                            componentArray2 = ((Container)((Object)w2)).getComponents();
                                            n16 = componentArray2.length;
                                            n15 = 0;
                                            while (n15 < n16) {
                                                block31: {
                                                    block32: {
                                                        block33: {
                                                            block34: {
                                                                component = componentArray2[n15];
                                                                if (nArray == null) break block31;
                                                                n14 = this.O(component) ? '\u0001' : '\u0000';
                                                                if (nArray == null) break block16;
                                                                if (n14 == 0) break block32;
                                                                gi_02 = (gi_0)((AbstractButton)component).getUI();
                                                                if (nArray == null) break block33;
                                                                if (n11 == 0) break block34;
                                                                gi_02.m(false);
                                                                gi_02.Q(false);
                                                                if (nArray != null) break block32;
                                                            }
                                                            gi_02.J(false);
                                                        }
                                                        gi_02.L(false);
                                                    }
                                                    ++n15;
                                                }
                                                if (nArray != null) continue;
                                            }
                                        }
                                        n14 = i2;
                                    }
                                    if (nArray == null) break block17;
                                    if (n14 >= componentArray.length - 1) break block35;
                                    nw_22 = this;
                                    if (nArray == null) break block36;
                                    if (nw_22.O(componentArray[i2 + 1])) break block37;
                                    n14 = this.m(componentArray[i2 + 1]) ? '\u0001' : '\u0000';
                                    if (nArray == null) break block17;
                                    if (n14 == 0) break block35;
                                }
                                nw_22 = w2;
                            }
                            componentArray2 = nw_22.getComponents();
                            n16 = componentArray2.length;
                            n15 = 0;
                            while (n15 < n16) {
                                block38: {
                                    block39: {
                                        block40: {
                                            block41: {
                                                component = componentArray2[n15];
                                                if (nArray == null) break block38;
                                                n14 = this.O(component) ? '\u0001' : '\u0000';
                                                if (nArray == null) break block17;
                                                if (n14 == 0) break block39;
                                                gi_02 = (gi_0)((AbstractButton)component).getUI();
                                                if (nArray == null) break block40;
                                                if (n11 == 0) break block41;
                                                gi_02.E(false);
                                                gi_02.K(true);
                                                if (nArray != null) break block39;
                                            }
                                            gi_02.r(false);
                                        }
                                        gi_02.W(true);
                                    }
                                    ++n15;
                                }
                                if (nArray != null) continue;
                            }
                        }
                        n14 = n12 = 1;
                    }
                    if (nArray != null) continue;
                }
                n13 = 0;
            }
            n12 = n13;
            if (nArray != null) continue;
        }
    }

    @Override
    protected void addImpl(Component component, Object object, int n10) {
        super.addImpl(component, object, n10);
        component.addPropertyChangeListener(k2_0.b(-2045, 21840), this.Z);
    }

    @Override
    public void remove(int n10) {
        this.getComponent(n10).removePropertyChangeListener(k2_0.b(-2046, 6650), this.Z);
        super.remove(n10);
    }

    protected boolean N(Component component) {
        return component instanceof AbstractButton;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean O(Component component) {
        int[] nArray = k3_0.L();
        boolean bl = this.N(component);
        if (nArray != null) {
            if (!bl) return false;
            bl = ((AbstractButton)component).getUI() instanceof gi_0;
        }
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    protected boolean m(Component component) {
        return component instanceof k2_0;
    }

    public void u(boolean bl) {
        this.U(this, bl);
    }

    protected void U(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component = componentArray[i2];
            Component component2 = this;
            if (nArray != null) {
                if (component2.m(component)) {
                    this.U((k2_0)component, bl);
                    if (nArray != null) continue;
                }
                component2 = component;
            }
            component2.setFocusable(bl);
            if (nArray != null) continue;
        }
    }

    public void L(Color color) {
        this.P(this, color);
    }

    protected void P(k2_0 k2_02, Color color) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component = componentArray[i2];
            Component component2 = this;
            if (nArray != null) {
                if (component2.m(component)) {
                    this.P((k2_0)component, color);
                    if (nArray != null) continue;
                }
                component2 = component;
            }
            ((Component)component2).setForeground(color);
            if (nArray != null) continue;
        }
    }

    public void y(Color color) {
        this.c(this, color);
    }

    protected void c(k2_0 k2_02, Color color) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.j(color);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component);
                }
                if (!bl) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.c((k2_0)component, color);
            if (nArray != null) continue;
        }
    }

    public void i(boolean bl) {
        this.H(this, bl);
    }

    protected void H(k2_0 k2_02, boolean bl) {
        block6: {
            k2_0 k2_03;
            block7: {
                block8: {
                    int[] nArray = k3_0.L();
                    k2_03 = this;
                    if (nArray == null) break block7;
                    if (k2_03.F != 0) break block8;
                    for (Component component : k2_02.getComponents()) {
                        this.J(component, bl);
                        if (nArray != null) {
                            if (nArray != null) continue;
                        }
                        break block6;
                    }
                    if (nArray != null) break block6;
                }
                k2_03 = this;
            }
            k2_03.J(this.K(), bl);
        }
    }

    protected void J(Component component, boolean bl) {
        block4: {
            Component component2;
            k2_0 k2_02;
            block5: {
                boolean bl2;
                block2: {
                    int[] nArray;
                    block3: {
                        nArray = k3_0.L();
                        bl2 = this.O(component);
                        if (nArray == null) break block2;
                        if (!bl2) break block3;
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.J(bl);
                        if (nArray != null) break block4;
                    }
                    k2_02 = this;
                    component2 = component;
                    if (nArray == null) break block5;
                    bl2 = k2_02.m(component2);
                }
                if (!bl2) break block4;
                k2_02 = this;
                component2 = component;
            }
            k2_02.H((k2_0)component2, bl);
        }
    }

    public void l(boolean bl) {
        this.A(this, bl);
    }

    protected void A(k2_0 k2_02, boolean bl) {
        block6: {
            k2_0 k2_03;
            block7: {
                block8: {
                    int[] nArray = k3_0.L();
                    k2_03 = this;
                    if (nArray == null) break block7;
                    if (k2_03.F != 1) break block8;
                    for (Component component : k2_02.getComponents()) {
                        this.Q(component, bl);
                        if (nArray != null) {
                            if (nArray != null) continue;
                        }
                        break block6;
                    }
                    if (nArray != null) break block6;
                }
                k2_03 = this;
            }
            k2_03.Q(this.K(), bl);
        }
    }

    protected void Q(Component component, boolean bl) {
        block4: {
            Component component2;
            k2_0 k2_02;
            block5: {
                boolean bl2;
                block2: {
                    int[] nArray;
                    block3: {
                        nArray = k3_0.L();
                        bl2 = this.O(component);
                        if (nArray == null) break block2;
                        if (!bl2) break block3;
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.m(bl);
                        if (nArray != null) break block4;
                    }
                    k2_02 = this;
                    component2 = component;
                    if (nArray == null) break block5;
                    bl2 = k2_02.m(component2);
                }
                if (!bl2) break block4;
                k2_02 = this;
                component2 = component;
            }
            k2_02.A((k2_0)component2, bl);
        }
    }

    public void O(boolean bl) {
        this.n(this, bl);
    }

    protected void n(k2_0 k2_02, boolean bl) {
        block6: {
            k2_0 k2_03;
            block7: {
                block8: {
                    int[] nArray = k3_0.L();
                    k2_03 = this;
                    if (nArray == null) break block7;
                    if (k2_03.F != 0) break block8;
                    for (Component component : k2_02.getComponents()) {
                        this.R(component, bl);
                        if (nArray != null) {
                            if (nArray != null) continue;
                        }
                        break block6;
                    }
                    if (nArray != null) break block6;
                }
                k2_03 = this;
            }
            k2_03.R(this.q(), bl);
        }
    }

    protected void R(Component component, boolean bl) {
        block4: {
            Component component2;
            k2_0 k2_02;
            block5: {
                boolean bl2;
                block2: {
                    int[] nArray;
                    block3: {
                        nArray = k3_0.L();
                        bl2 = this.O(component);
                        if (nArray == null) break block2;
                        if (!bl2) break block3;
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.r(bl);
                        if (nArray != null) break block4;
                    }
                    k2_02 = this;
                    component2 = component;
                    if (nArray == null) break block5;
                    bl2 = k2_02.m(component2);
                }
                if (!bl2) break block4;
                k2_02 = this;
                component2 = component;
            }
            k2_02.n((k2_0)component2, bl);
        }
    }

    public void P(boolean bl) {
        this.R(this, bl);
    }

    protected void R(k2_0 k2_02, boolean bl) {
        block6: {
            k2_0 k2_03;
            block7: {
                block8: {
                    int[] nArray = k3_0.L();
                    k2_03 = this;
                    if (nArray == null) break block7;
                    if (k2_03.F != 1) break block8;
                    for (Component component : k2_02.getComponents()) {
                        this.k(component, bl);
                        if (nArray != null) {
                            if (nArray != null) continue;
                        }
                        break block6;
                    }
                    if (nArray != null) break block6;
                }
                k2_03 = this;
            }
            k2_03.k(this.q(), bl);
        }
    }

    protected void k(Component component, boolean bl) {
        block4: {
            Component component2;
            k2_0 k2_02;
            block5: {
                boolean bl2;
                block2: {
                    int[] nArray;
                    block3: {
                        nArray = k3_0.L();
                        bl2 = this.O(component);
                        if (nArray == null) break block2;
                        if (!bl2) break block3;
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.E(bl);
                        if (nArray != null) break block4;
                    }
                    k2_02 = this;
                    component2 = component;
                    if (nArray == null) break block5;
                    bl2 = k2_02.m(component2);
                }
                if (!bl2) break block4;
                k2_02 = this;
                component2 = component;
            }
            k2_02.R((k2_0)component2, bl);
        }
    }

    public void Z(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.i(bl);
        this.l(bl2);
        this.O(bl3);
        this.P(bl4);
    }

    public void L(boolean bl) {
        this.z(this, bl);
    }

    protected void z(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl2;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl2 = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl2) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.f(bl);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl2 = k2_03.m(component);
                }
                if (!bl2) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.z((k2_0)component, bl);
            if (nArray != null) continue;
        }
    }

    public void S(boolean bl) {
        this.C(this, bl);
    }

    protected void C(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int[] nArray = k3_0.L();
        for (Component component : componentArray) {
            Component component2;
            k2_0 k2_03;
            block6: {
                boolean bl2;
                block5: {
                    bl2 = this.O(component);
                    if (nArray == null) break block5;
                    if (bl2) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.y(bl);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component2 = component;
                    if (nArray == null) break block6;
                    bl2 = k2_03.m(component2);
                }
                if (!bl2) continue;
                k2_03 = this;
                component2 = component;
            }
            k2_03.C((k2_0)component2, bl);
            if (nArray != null) continue;
        }
    }

    public void K(Color color) {
        this.M(this, color);
    }

    protected void M(k2_0 k2_02, Color color) {
        Component[] componentArray = k2_02.getComponents();
        int[] nArray = k3_0.L();
        for (Component component : componentArray) {
            Component component2;
            k2_0 k2_03;
            block6: {
                boolean bl;
                block5: {
                    bl = this.O(component);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.u(color);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component2 = component;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component2);
                }
                if (!bl) continue;
                k2_03 = this;
                component2 = component;
            }
            k2_03.M((k2_0)component2, color);
            if (nArray != null) continue;
        }
    }

    public void r(int n10) {
        this.m(this, n10);
    }

    protected void m(k2_0 k2_02, int n10) {
        Component[] componentArray = k2_02.getComponents();
        int n11 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n11; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.D(n10);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component);
                }
                if (!bl) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.m((k2_0)component, n10);
            if (nArray != null) continue;
        }
    }

    public void W(boolean bl) {
        this.o(this, bl);
    }

    protected void o(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl2;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl2 = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl2) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.d(bl);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl2 = k2_03.m(component);
                }
                if (!bl2) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.o((k2_0)component, bl);
            if (nArray != null) continue;
        }
    }

    public void J(int n10) {
        this.M(this, n10);
    }

    protected void M(k2_0 k2_02, int n10) {
        Component[] componentArray = k2_02.getComponents();
        int[] nArray = k3_0.L();
        for (Component component : componentArray) {
            Component component2;
            k2_0 k2_03;
            block6: {
                boolean bl;
                block5: {
                    bl = this.O(component);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.z(n10);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component2 = component;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component2);
                }
                if (!bl) continue;
                k2_03 = this;
                component2 = component;
            }
            k2_03.M((k2_0)component2, n10);
            if (nArray != null) continue;
        }
    }

    public void n(Color color) {
        this.k(this, color);
    }

    protected void k(k2_0 k2_02, Color color) {
        Component[] componentArray = k2_02.getComponents();
        int[] nArray = k3_0.L();
        for (Component component : componentArray) {
            Component component2;
            k2_0 k2_03;
            block6: {
                boolean bl;
                block5: {
                    bl = this.O(component);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.F(color);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component2 = component;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component2);
                }
                if (!bl) continue;
                k2_03 = this;
                component2 = component;
            }
            k2_03.k((k2_0)component2, color);
            if (nArray != null) continue;
        }
    }

    public void s(int n10) {
        this.H(this, n10);
    }

    protected void H(k2_0 k2_02, int n10) {
        Component[] componentArray = k2_02.getComponents();
        int n11 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n11; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.r(n10);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component);
                }
                if (!bl) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.H((k2_0)component, n10);
            if (nArray != null) continue;
        }
    }

    public void t(Color color) {
        this.Q(this, color);
    }

    protected void Q(k2_0 k2_02, Color color) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.O(color);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component);
                }
                if (!bl) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.Q((k2_0)component, color);
            if (nArray != null) continue;
        }
    }

    public void w(int n10) {
        this.F(this, n10);
    }

    protected void F(k2_0 k2_02, int n10) {
        Component[] componentArray = k2_02.getComponents();
        int[] nArray = k3_0.L();
        for (Component component : componentArray) {
            Component component2;
            k2_0 k2_03;
            block6: {
                boolean bl;
                block5: {
                    bl = this.O(component);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.l(n10);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component2 = component;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component2);
                }
                if (!bl) continue;
                k2_03 = this;
                component2 = component;
            }
            k2_03.F((k2_0)component2, n10);
            if (nArray != null) continue;
        }
    }

    public void a(boolean bl) {
        this.x(this, bl);
    }

    protected void x(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl2;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl2 = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl2) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.q(bl);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl2 = k2_03.m(component);
                }
                if (!bl2) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.x((k2_0)component, bl);
            if (nArray != null) continue;
        }
    }

    public void s(boolean bl) {
        this.W(this, bl);
    }

    protected void W(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl2;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl2 = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl2) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.l(bl);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl2 = k2_03.m(component);
                }
                if (!bl2) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.W((k2_0)component, bl);
            if (nArray != null) continue;
        }
    }

    public void D(og_2 og_22) {
        this.I(this, og_22);
    }

    protected void I(k2_0 k2_02, og_2 og_22) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.S(og_22);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component);
                }
                if (!bl) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.I((k2_0)component, og_22);
            if (nArray != null) continue;
        }
    }

    public void Q(boolean bl) {
        this.D(this, bl);
    }

    protected void D(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl2;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl2 = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl2) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.B(bl);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl2 = k2_03.m(component);
                }
                if (!bl2) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.D((k2_0)component, bl);
            if (nArray != null) continue;
        }
    }

    public void E(boolean bl) {
        this.N(this, bl);
    }

    protected void N(k2_0 k2_02, boolean bl) {
        Component[] componentArray = k2_02.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component;
            k2_0 k2_03;
            block6: {
                boolean bl2;
                Component component2;
                block5: {
                    component2 = componentArray[i2];
                    bl2 = this.O(component2);
                    if (nArray == null) break block5;
                    if (bl2) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component2).getUI();
                        gi_02.M(bl);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component = component2;
                    if (nArray == null) break block6;
                    bl2 = k2_03.m(component);
                }
                if (!bl2) continue;
                k2_03 = this;
                component = component2;
            }
            k2_03.N((k2_0)component, bl);
            if (nArray != null) continue;
        }
    }

    public void I(Insets insets) {
        this.i(this, insets);
    }

    public void W(int n10, int n11, int n12, int n13) {
        this.I(new Insets(n10, n11, n12, n13));
    }

    public void A(int n10) {
        this.W(n10, n10, n10, n10);
    }

    protected void i(k2_0 k2_02, Insets insets) {
        Component[] componentArray = k2_02.getComponents();
        int[] nArray = k3_0.L();
        for (Component component : componentArray) {
            Component component2;
            k2_0 k2_03;
            block6: {
                boolean bl;
                block5: {
                    bl = this.O(component);
                    if (nArray == null) break block5;
                    if (bl) {
                        gi_0 gi_02 = (gi_0)((AbstractButton)component).getUI();
                        gi_02.Q(insets);
                        if (nArray != null) continue;
                    }
                    k2_03 = this;
                    component2 = component;
                    if (nArray == null) break block6;
                    bl = k2_03.m(component2);
                }
                if (!bl) continue;
                k2_03 = this;
                component2 = component;
            }
            k2_03.i((k2_0)component2, insets);
            if (nArray != null) continue;
        }
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        Component[] componentArray = this.getComponents();
        int n10 = componentArray.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n10; ++i2) {
            Component component = componentArray[i2];
            component.setEnabled(bl);
            if (nArray != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "\"v\u00e3\u00ca\"\u008a\u00de\u0007\u00ff\u00c3X|U\\0\u0014Q\u00bf*\u001f\u00f1\u00f2\u00b7+\u00d0\u0090s\u00a8\u00d3E'L\u000b4\u00942";
            var4_3 = "\"v\u00e3\u00ca\"\u008a\u00de\u0007\u00ff\u00c3X|U\\0\u0014Q\u00bf*\u001f\u00f1\u00f2\u00b7+\u00d0\u0090s\u00a8\u00d3E'L\u000b4\u00942".length();
            var1_4 = 7;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 71;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 46;
                            break;
                        }
                        case 1: {
                            v11 = 18;
                            break;
                        }
                        case 2: {
                            v11 = 101;
                            break;
                        }
                        case 3: {
                            v11 = 40;
                            break;
                        }
                        case 4: {
                            v11 = 124;
                            break;
                        }
                        case 5: {
                            v11 = 50;
                            break;
                        }
                        default: {
                            v11 = 63;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        k2_0.a = var5;
        k2_0.b = new String[3];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF802) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 161;
                    break;
                }
                case 1: {
                    n14 = 178;
                    break;
                }
                case 2: {
                    n14 = 167;
                    break;
                }
                case 3: {
                    n14 = 59;
                    break;
                }
                case 4: {
                    n14 = 99;
                    break;
                }
                case 5: {
                    n14 = 252;
                    break;
                }
                case 6: {
                    n14 = 68;
                    break;
                }
                case 7: {
                    n14 = 189;
                    break;
                }
                case 8: {
                    n14 = 227;
                    break;
                }
                case 9: {
                    n14 = 241;
                    break;
                }
                case 10: {
                    n14 = 128;
                    break;
                }
                case 11: {
                    n14 = 176;
                    break;
                }
                case 12: {
                    n14 = 196;
                    break;
                }
                case 13: {
                    n14 = 174;
                    break;
                }
                case 14: {
                    n14 = 180;
                    break;
                }
                case 15: {
                    n14 = 134;
                    break;
                }
                case 16: {
                    n14 = 9;
                    break;
                }
                case 17: {
                    n14 = 65;
                    break;
                }
                case 18: {
                    n14 = 203;
                    break;
                }
                case 19: {
                    n14 = 18;
                    break;
                }
                case 20: {
                    n14 = 5;
                    break;
                }
                case 21: {
                    n14 = 197;
                    break;
                }
                case 22: {
                    n14 = 151;
                    break;
                }
                case 23: {
                    n14 = 90;
                    break;
                }
                case 24: {
                    n14 = 12;
                    break;
                }
                case 25: {
                    n14 = 136;
                    break;
                }
                case 26: {
                    n14 = 123;
                    break;
                }
                case 27: {
                    n14 = 25;
                    break;
                }
                case 28: {
                    n14 = 32;
                    break;
                }
                case 29: {
                    n14 = 158;
                    break;
                }
                case 30: {
                    n14 = 97;
                    break;
                }
                case 31: {
                    n14 = 168;
                    break;
                }
                case 32: {
                    n14 = 122;
                    break;
                }
                case 33: {
                    n14 = 47;
                    break;
                }
                case 34: {
                    n14 = 152;
                    break;
                }
                case 35: {
                    n14 = 247;
                    break;
                }
                case 36: {
                    n14 = 131;
                    break;
                }
                case 37: {
                    n14 = 77;
                    break;
                }
                case 38: {
                    n14 = 57;
                    break;
                }
                case 39: {
                    n14 = 100;
                    break;
                }
                case 40: {
                    n14 = 88;
                    break;
                }
                case 41: {
                    n14 = 191;
                    break;
                }
                case 42: {
                    n14 = 226;
                    break;
                }
                case 43: {
                    n14 = 199;
                    break;
                }
                case 44: {
                    n14 = 51;
                    break;
                }
                case 45: {
                    n14 = 42;
                    break;
                }
                case 46: {
                    n14 = 50;
                    break;
                }
                case 47: {
                    n14 = 3;
                    break;
                }
                case 48: {
                    n14 = 223;
                    break;
                }
                case 49: {
                    n14 = 62;
                    break;
                }
                case 50: {
                    n14 = 21;
                    break;
                }
                case 51: {
                    n14 = 142;
                    break;
                }
                case 52: {
                    n14 = 72;
                    break;
                }
                case 53: {
                    n14 = 15;
                    break;
                }
                case 54: {
                    n14 = 165;
                    break;
                }
                case 55: {
                    n14 = 113;
                    break;
                }
                case 56: {
                    n14 = 17;
                    break;
                }
                case 57: {
                    n14 = 31;
                    break;
                }
                case 58: {
                    n14 = 212;
                    break;
                }
                case 59: {
                    n14 = 111;
                    break;
                }
                case 60: {
                    n14 = 41;
                    break;
                }
                case 61: {
                    n14 = 87;
                    break;
                }
                case 62: {
                    n14 = 234;
                    break;
                }
                case 63: {
                    n14 = 231;
                    break;
                }
                case 64: {
                    n14 = 44;
                    break;
                }
                case 65: {
                    n14 = 43;
                    break;
                }
                case 66: {
                    n14 = 83;
                    break;
                }
                case 67: {
                    n14 = 28;
                    break;
                }
                case 68: {
                    n14 = 75;
                    break;
                }
                case 69: {
                    n14 = 96;
                    break;
                }
                case 70: {
                    n14 = 177;
                    break;
                }
                case 71: {
                    n14 = 84;
                    break;
                }
                case 72: {
                    n14 = 190;
                    break;
                }
                case 73: {
                    n14 = 144;
                    break;
                }
                case 74: {
                    n14 = 107;
                    break;
                }
                case 75: {
                    n14 = 204;
                    break;
                }
                case 76: {
                    n14 = 112;
                    break;
                }
                case 77: {
                    n14 = 238;
                    break;
                }
                case 78: {
                    n14 = 2;
                    break;
                }
                case 79: {
                    n14 = 64;
                    break;
                }
                case 80: {
                    n14 = 14;
                    break;
                }
                case 81: {
                    n14 = 71;
                    break;
                }
                case 82: {
                    n14 = 1;
                    break;
                }
                case 83: {
                    n14 = 202;
                    break;
                }
                case 84: {
                    n14 = 13;
                    break;
                }
                case 85: {
                    n14 = 250;
                    break;
                }
                case 86: {
                    n14 = 225;
                    break;
                }
                case 87: {
                    n14 = 145;
                    break;
                }
                case 88: {
                    n14 = 38;
                    break;
                }
                case 89: {
                    n14 = 24;
                    break;
                }
                case 90: {
                    n14 = 124;
                    break;
                }
                case 91: {
                    n14 = 188;
                    break;
                }
                case 92: {
                    n14 = 89;
                    break;
                }
                case 93: {
                    n14 = 249;
                    break;
                }
                case 94: {
                    n14 = 154;
                    break;
                }
                case 95: {
                    n14 = 184;
                    break;
                }
                case 96: {
                    n14 = 171;
                    break;
                }
                case 97: {
                    n14 = 55;
                    break;
                }
                case 98: {
                    n14 = 20;
                    break;
                }
                case 99: {
                    n14 = 70;
                    break;
                }
                case 100: {
                    n14 = 39;
                    break;
                }
                case 101: {
                    n14 = 132;
                    break;
                }
                case 102: {
                    n14 = 116;
                    break;
                }
                case 103: {
                    n14 = 206;
                    break;
                }
                case 104: {
                    n14 = 26;
                    break;
                }
                case 105: {
                    n14 = 61;
                    break;
                }
                case 106: {
                    n14 = 74;
                    break;
                }
                case 107: {
                    n14 = 119;
                    break;
                }
                case 108: {
                    n14 = 209;
                    break;
                }
                case 109: {
                    n14 = 48;
                    break;
                }
                case 110: {
                    n14 = 218;
                    break;
                }
                case 111: {
                    n14 = 104;
                    break;
                }
                case 112: {
                    n14 = 221;
                    break;
                }
                case 113: {
                    n14 = 86;
                    break;
                }
                case 114: {
                    n14 = 103;
                    break;
                }
                case 115: {
                    n14 = 201;
                    break;
                }
                case 116: {
                    n14 = 52;
                    break;
                }
                case 117: {
                    n14 = 251;
                    break;
                }
                case 118: {
                    n14 = 155;
                    break;
                }
                case 119: {
                    n14 = 192;
                    break;
                }
                case 120: {
                    n14 = 164;
                    break;
                }
                case 121: {
                    n14 = 157;
                    break;
                }
                case 122: {
                    n14 = 79;
                    break;
                }
                case 123: {
                    n14 = 35;
                    break;
                }
                case 124: {
                    n14 = 160;
                    break;
                }
                case 125: {
                    n14 = 106;
                    break;
                }
                case 126: {
                    n14 = 69;
                    break;
                }
                case 127: {
                    n14 = 208;
                    break;
                }
                case 128: {
                    n14 = 6;
                    break;
                }
                case 129: {
                    n14 = 54;
                    break;
                }
                case 130: {
                    n14 = 163;
                    break;
                }
                case 131: {
                    n14 = 130;
                    break;
                }
                case 132: {
                    n14 = 217;
                    break;
                }
                case 133: {
                    n14 = 211;
                    break;
                }
                case 134: {
                    n14 = 150;
                    break;
                }
                case 135: {
                    n14 = 7;
                    break;
                }
                case 136: {
                    n14 = 219;
                    break;
                }
                case 137: {
                    n14 = 173;
                    break;
                }
                case 138: {
                    n14 = 156;
                    break;
                }
                case 139: {
                    n14 = 248;
                    break;
                }
                case 140: {
                    n14 = 243;
                    break;
                }
                case 141: {
                    n14 = 92;
                    break;
                }
                case 142: {
                    n14 = 181;
                    break;
                }
                case 143: {
                    n14 = 215;
                    break;
                }
                case 144: {
                    n14 = 94;
                    break;
                }
                case 145: {
                    n14 = 187;
                    break;
                }
                case 146: {
                    n14 = 198;
                    break;
                }
                case 147: {
                    n14 = 229;
                    break;
                }
                case 148: {
                    n14 = 22;
                    break;
                }
                case 149: {
                    n14 = 133;
                    break;
                }
                case 150: {
                    n14 = 93;
                    break;
                }
                case 151: {
                    n14 = 138;
                    break;
                }
                case 152: {
                    n14 = 244;
                    break;
                }
                case 153: {
                    n14 = 10;
                    break;
                }
                case 154: {
                    n14 = 143;
                    break;
                }
                case 155: {
                    n14 = 118;
                    break;
                }
                case 156: {
                    n14 = 85;
                    break;
                }
                case 157: {
                    n14 = 81;
                    break;
                }
                case 158: {
                    n14 = 120;
                    break;
                }
                case 159: {
                    n14 = 4;
                    break;
                }
                case 160: {
                    n14 = 33;
                    break;
                }
                case 161: {
                    n14 = 240;
                    break;
                }
                case 162: {
                    n14 = 67;
                    break;
                }
                case 163: {
                    n14 = 53;
                    break;
                }
                case 164: {
                    n14 = 36;
                    break;
                }
                case 165: {
                    n14 = 224;
                    break;
                }
                case 166: {
                    n14 = 237;
                    break;
                }
                case 167: {
                    n14 = 19;
                    break;
                }
                case 168: {
                    n14 = 195;
                    break;
                }
                case 169: {
                    n14 = 129;
                    break;
                }
                case 170: {
                    n14 = 239;
                    break;
                }
                case 171: {
                    n14 = 210;
                    break;
                }
                case 172: {
                    n14 = 172;
                    break;
                }
                case 173: {
                    n14 = 253;
                    break;
                }
                case 174: {
                    n14 = 148;
                    break;
                }
                case 175: {
                    n14 = 254;
                    break;
                }
                case 176: {
                    n14 = 125;
                    break;
                }
                case 177: {
                    n14 = 207;
                    break;
                }
                case 178: {
                    n14 = 139;
                    break;
                }
                case 179: {
                    n14 = 98;
                    break;
                }
                case 180: {
                    n14 = 141;
                    break;
                }
                case 181: {
                    n14 = 117;
                    break;
                }
                case 182: {
                    n14 = 182;
                    break;
                }
                case 183: {
                    n14 = 66;
                    break;
                }
                case 184: {
                    n14 = 169;
                    break;
                }
                case 185: {
                    n14 = 170;
                    break;
                }
                case 186: {
                    n14 = 233;
                    break;
                }
                case 187: {
                    n14 = 95;
                    break;
                }
                case 188: {
                    n14 = 185;
                    break;
                }
                case 189: {
                    n14 = 46;
                    break;
                }
                case 190: {
                    n14 = 80;
                    break;
                }
                case 191: {
                    n14 = 109;
                    break;
                }
                case 192: {
                    n14 = 108;
                    break;
                }
                case 193: {
                    n14 = 76;
                    break;
                }
                case 194: {
                    n14 = 193;
                    break;
                }
                case 195: {
                    n14 = 147;
                    break;
                }
                case 196: {
                    n14 = 49;
                    break;
                }
                case 197: {
                    n14 = 34;
                    break;
                }
                case 198: {
                    n14 = 232;
                    break;
                }
                case 199: {
                    n14 = 101;
                    break;
                }
                case 200: {
                    n14 = 140;
                    break;
                }
                case 201: {
                    n14 = 0;
                    break;
                }
                case 202: {
                    n14 = 78;
                    break;
                }
                case 203: {
                    n14 = 121;
                    break;
                }
                case 204: {
                    n14 = 153;
                    break;
                }
                case 205: {
                    n14 = 214;
                    break;
                }
                case 206: {
                    n14 = 27;
                    break;
                }
                case 207: {
                    n14 = 58;
                    break;
                }
                case 208: {
                    n14 = 23;
                    break;
                }
                case 209: {
                    n14 = 8;
                    break;
                }
                case 210: {
                    n14 = 205;
                    break;
                }
                case 211: {
                    n14 = 60;
                    break;
                }
                case 212: {
                    n14 = 40;
                    break;
                }
                case 213: {
                    n14 = 235;
                    break;
                }
                case 214: {
                    n14 = 186;
                    break;
                }
                case 215: {
                    n14 = 45;
                    break;
                }
                case 216: {
                    n14 = 149;
                    break;
                }
                case 217: {
                    n14 = 30;
                    break;
                }
                case 218: {
                    n14 = 222;
                    break;
                }
                case 219: {
                    n14 = 37;
                    break;
                }
                case 220: {
                    n14 = 236;
                    break;
                }
                case 221: {
                    n14 = 110;
                    break;
                }
                case 222: {
                    n14 = 245;
                    break;
                }
                case 223: {
                    n14 = 255;
                    break;
                }
                case 224: {
                    n14 = 166;
                    break;
                }
                case 225: {
                    n14 = 137;
                    break;
                }
                case 226: {
                    n14 = 114;
                    break;
                }
                case 227: {
                    n14 = 105;
                    break;
                }
                case 228: {
                    n14 = 246;
                    break;
                }
                case 229: {
                    n14 = 56;
                    break;
                }
                case 230: {
                    n14 = 162;
                    break;
                }
                case 231: {
                    n14 = 115;
                    break;
                }
                case 232: {
                    n14 = 194;
                    break;
                }
                case 233: {
                    n14 = 220;
                    break;
                }
                case 234: {
                    n14 = 91;
                    break;
                }
                case 235: {
                    n14 = 183;
                    break;
                }
                case 236: {
                    n14 = 127;
                    break;
                }
                case 237: {
                    n14 = 126;
                    break;
                }
                case 238: {
                    n14 = 179;
                    break;
                }
                case 239: {
                    n14 = 102;
                    break;
                }
                case 240: {
                    n14 = 146;
                    break;
                }
                case 241: {
                    n14 = 228;
                    break;
                }
                case 242: {
                    n14 = 230;
                    break;
                }
                case 243: {
                    n14 = 73;
                    break;
                }
                case 244: {
                    n14 = 242;
                    break;
                }
                case 245: {
                    n14 = 82;
                    break;
                }
                case 246: {
                    n14 = 135;
                    break;
                }
                case 247: {
                    n14 = 216;
                    break;
                }
                case 248: {
                    n14 = 29;
                    break;
                }
                case 249: {
                    n14 = 159;
                    break;
                }
                case 250: {
                    n14 = 213;
                    break;
                }
                case 251: {
                    n14 = 11;
                    break;
                }
                case 252: {
                    n14 = 200;
                    break;
                }
                case 253: {
                    n14 = 175;
                    break;
                }
                case 254: {
                    n14 = 63;
                    break;
                }
                default: {
                    n14 = 16;
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
            k2_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

