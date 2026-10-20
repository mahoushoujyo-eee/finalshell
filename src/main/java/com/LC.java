/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.ey_0;
import com.lz_0;
import com.pf_1;
import com.xt_1;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.JToolBar;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class LC
extends lz_0 {
    protected Map N;

    public LC() {
        this.N = new HashMap();
    }

    public LC(Map map) {
        this.N = map;
    }

    public Map N() {
        return this.N;
    }

    public void b(Map map) {
        this.N = map;
        this.Z();
    }

    public void C(String string, pf_1 pf_12) {
        this.N.put(string, pf_12);
        this.Z();
    }

    public void d(String string) {
        this.N.remove(string);
        this.Z();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Q() {
        int[] nArray = lz_0.M();
        Map map = this.N;
        if (nArray == null) {
            if (map == null) return 0 != 0;
            map = this.N;
        }
        int n10 = map.size();
        if (nArray != null) return n10 != 0;
        if (n10 <= 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        block6: {
            pf_1 pf_12;
            block15: {
                pf_1 pf_13;
                LC lC;
                int[] nArray;
                block14: {
                    block13: {
                        pf_1 pf_14;
                        block12: {
                            pf_1 pf_15;
                            block10: {
                                block11: {
                                    boolean bl;
                                    block8: {
                                        block9: {
                                            JComponent jComponent2;
                                            block7: {
                                                nArray = lz_0.M();
                                                if (!this.Q()) break block6;
                                                jComponent2 = jComponent;
                                                if (nArray != null) break block7;
                                                if (jComponent2 == null) break block6;
                                                jComponent2 = jComponent;
                                            }
                                            bl = jComponent2 instanceof AbstractButton;
                                            if (nArray != null) break block8;
                                            if (!bl) break block9;
                                            pf_15 = this.P((AbstractButton)jComponent);
                                            if (nArray == null) break block10;
                                        }
                                        bl = jComponent instanceof JToolBar;
                                    }
                                    if (!bl) break block11;
                                    pf_15 = this.U((JToolBar)jComponent);
                                    if (nArray == null) break block10;
                                }
                                pf_15 = this.p(jComponent);
                            }
                            pf_14 = pf_15;
                            if (nArray != null) break block12;
                            if (pf_14 == null) break block13;
                            pf_15.k(jComponent);
                            pf_14 = pf_15;
                        }
                        pf_14.n(graphics2D, rectangle);
                    }
                    lC = this;
                    if (nArray != null) break block14;
                    if (!lC.p(jComponent)) break block6;
                    lC = this;
                }
                pf_12 = pf_13 = lC.r(ey_0.F);
                if (nArray != null) break block15;
                if (pf_12 == null) break block6;
                pf_13.k(jComponent);
                pf_12 = pf_13;
            }
            pf_12.n(graphics2D, rectangle);
        }
    }

    protected boolean p(JComponent jComponent) {
        return jComponent.isFocusOwner();
    }

    protected pf_1 p(JComponent jComponent) {
        return this.u(jComponent.isEnabled() ? ey_0.t : ey_0.q);
    }

    protected pf_1 P(AbstractButton abstractButton) {
        ButtonModel buttonModel = abstractButton.getModel();
        int[] nArray = lz_0.M();
        boolean bl = buttonModel.isPressed();
        if (nArray == null) {
            if (bl) {
                return this.u(buttonModel.isSelected() ? ey_0.i : ey_0.z);
            }
            bl = buttonModel.isSelected();
        }
        if (nArray == null) {
            if (bl) {
                if (buttonModel.isEnabled()) {
                    return this.u(buttonModel.isRollover() ? ey_0.L : ey_0.T);
                }
                return this.u(ey_0.R);
            }
            bl = buttonModel.isEnabled();
        }
        if (bl) {
            return this.u(buttonModel.isRollover() ? ey_0.O : ey_0.t);
        }
        return this.u(ey_0.q);
    }

    protected pf_1 U(JToolBar jToolBar) {
        block5: {
            boolean bl;
            block4: {
                int[] nArray = lz_0.M();
                bl = jToolBar instanceof xt_1;
                if (nArray != null) break block4;
                if (!bl) break block5;
                bl = ((xt_1)jToolBar).V();
            }
            if (bl) {
                return this.u(jToolBar.isEnabled() ? ey_0.V : ey_0.W);
            }
        }
        return this.u(jToolBar.isEnabled() ? ey_0.t : ey_0.q);
    }

    public pf_1 r(String string) {
        return (pf_1)this.N.get(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public pf_1 u(String string) {
        pf_1 pf_12;
        LC lC;
        block45: {
            boolean bl;
            block44: {
                int[] nArray = lz_0.M();
                bl = string.equals(ey_0.t);
                if (nArray == null) {
                    if (bl) {
                        Map map = this.N;
                        String string2 = string;
                        if (nArray == null) {
                            if (!map.containsKey(string2)) {
                                return null;
                            }
                            map = this.N;
                            string2 = string;
                        }
                        pf_1 pf_13 = (pf_1)map.get(string2);
                        return pf_13;
                    }
                    bl = string.equals(ey_0.O);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_14;
                        LC lC2 = this;
                        if (nArray == null) {
                            if (lC2.N.containsKey(string)) {
                                pf_14 = (pf_1)this.N.get(string);
                                return pf_14;
                            }
                            lC2 = this;
                        }
                        pf_14 = lC2.u(ey_0.t);
                        return pf_14;
                    }
                    bl = string.equals(ey_0.q);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_15;
                        LC lC3 = this;
                        if (nArray == null) {
                            if (lC3.N.containsKey(string)) {
                                pf_15 = (pf_1)this.N.get(string);
                                return pf_15;
                            }
                            lC3 = this;
                        }
                        pf_15 = lC3.u(ey_0.t);
                        return pf_15;
                    }
                    bl = string.equals(ey_0.z);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_16;
                        LC lC4 = this;
                        if (nArray == null) {
                            if (lC4.N.containsKey(string)) {
                                pf_16 = (pf_1)this.N.get(string);
                                return pf_16;
                            }
                            lC4 = this;
                        }
                        pf_16 = lC4.u(ey_0.T);
                        return pf_16;
                    }
                    bl = string.equals(ey_0.T);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_17;
                        LC lC5 = this;
                        if (nArray == null) {
                            if (lC5.N.containsKey(string)) {
                                pf_17 = (pf_1)this.N.get(string);
                                return pf_17;
                            }
                            lC5 = this;
                        }
                        pf_17 = lC5.u(ey_0.t);
                        return pf_17;
                    }
                    bl = string.equals(ey_0.L);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_18;
                        LC lC6 = this;
                        if (nArray == null) {
                            if (lC6.N.containsKey(string)) {
                                pf_18 = (pf_1)this.N.get(string);
                                return pf_18;
                            }
                            lC6 = this;
                        }
                        pf_18 = lC6.u(ey_0.T);
                        return pf_18;
                    }
                    bl = string.equals(ey_0.R);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_19;
                        LC lC7 = this;
                        if (nArray == null) {
                            if (lC7.N.containsKey(string)) {
                                pf_19 = (pf_1)this.N.get(string);
                                return pf_19;
                            }
                            lC7 = this;
                        }
                        pf_19 = lC7.u(ey_0.T);
                        return pf_19;
                    }
                    bl = string.equals(ey_0.i);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_110;
                        LC lC8 = this;
                        if (nArray == null) {
                            if (lC8.N.containsKey(string)) {
                                pf_110 = (pf_1)this.N.get(string);
                                return pf_110;
                            }
                            lC8 = this;
                        }
                        pf_110 = lC8.u(ey_0.z);
                        return pf_110;
                    }
                    bl = string.equals(ey_0.F);
                }
                if (nArray == null) {
                    if (bl) {
                        Map map = this.N;
                        String string3 = string;
                        if (nArray == null) {
                            if (!map.containsKey(string3)) {
                                return null;
                            }
                            map = this.N;
                            string3 = string;
                        }
                        pf_1 pf_111 = (pf_1)map.get(string3);
                        return pf_111;
                    }
                    bl = string.equals(ey_0.V);
                }
                if (nArray == null) {
                    if (bl) {
                        pf_1 pf_112;
                        LC lC9 = this;
                        if (nArray == null) {
                            if (lC9.N.containsKey(string)) {
                                pf_112 = (pf_1)this.N.get(string);
                                return pf_112;
                            }
                            lC9 = this;
                        }
                        pf_112 = lC9.u(ey_0.t);
                        return pf_112;
                    }
                    bl = string.equals(ey_0.W);
                }
                if (nArray != null) break block44;
                if (!bl) return null;
                lC = this;
                if (nArray != null) break block45;
                bl = lC.N.containsKey(string);
            }
            if (bl) {
                pf_12 = (pf_1)this.N.get(string);
                return pf_12;
            }
            lC = this;
        }
        pf_12 = lC.u(ey_0.V);
        return pf_12;
    }

    @Override
    public Dimension d(JComponent jComponent) {
        int[] nArray = lz_0.M();
        LC lC = this;
        if (nArray == null) {
            if (lC.Q()) {
                Dimension dimension;
                block4: {
                    Dimension dimension2 = new Dimension(0, 0);
                    for (pf_1 pf_12 : this.N.values()) {
                        pf_12.k(jComponent);
                        dimension = FN.h(dimension2, pf_12.R());
                        if (nArray == null) {
                            dimension2 = dimension;
                            if (nArray == null) continue;
                        }
                        break block4;
                    }
                    dimension = dimension2;
                }
                return dimension;
            }
            lC = this;
        }
        return super.d(jComponent);
    }

    @Override
    public Insets B(JComponent jComponent) {
        Insets insets = super.B(jComponent);
        int[] nArray = lz_0.M();
        if (this.Q()) {
            Insets insets2;
            block3: {
                Insets insets3 = new Insets(0, 0, 0, 0);
                for (pf_1 pf_12 : this.N.values()) {
                    pf_12.k(jComponent);
                    insets2 = FN.Z(insets3, pf_12.U());
                    if (nArray == null) {
                        insets3 = insets2;
                        if (nArray == null) continue;
                    }
                    break block3;
                }
                insets2 = FN.Z(insets, insets3);
            }
            return insets2;
        }
        return insets;
    }
}

