/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.TR;
import com.k3_0;
import com.kc_1;
import com.ko_2;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class uY
extends MouseAdapter {
    private int l;
    final kc_1 a;
    final ko_2 G;

    uY(ko_2 ko_22, kc_1 kc_12) {
        this.G = ko_22;
        this.a = kc_12;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block6: {
            block7: {
                boolean bl;
                int[] nArray;
                block5: {
                    nArray = k3_0.L();
                    bl = FN.l((Component)this.G);
                    if (nArray != null) {
                        if (!bl) {
                            this.G.transferFocus();
                        }
                        bl = this.G.V.isEnabled();
                    }
                    if (nArray == null) break block5;
                    if (!bl) break block6;
                    bl = SwingUtilities.isLeftMouseButton(mouseEvent);
                }
                if (nArray == null) break block7;
                if (!bl) break block6;
                bl = ko_2.r(this.G, true);
            }
            this.l = this.i();
            kc_1.H(this.G.V).setComponentZOrder(this.G, 0);
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block3: {
            ko_2 ko_22;
            block2: {
                int[] nArray = k3_0.L();
                ko_22 = this.G;
                if (nArray == null) break block2;
                if (!ko_2.Q(ko_22)) break block3;
                this.G.V.v().y(this.G, this.i() - this.l);
                ko_22 = this.G;
            }
            ko_22.revalidate();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block10: {
            ko_2 ko_22;
            block16: {
                int n10;
                int n11;
                block20: {
                    int n12;
                    int n13;
                    TR tR;
                    block19: {
                        int[] nArray;
                        block8: {
                            int n14;
                            block14: {
                                block15: {
                                    block12: {
                                        block13: {
                                            int n15;
                                            block11: {
                                                block9: {
                                                    ko_22 = this.G;
                                                    tR = this.G.V.v();
                                                    nArray = k3_0.L();
                                                    n15 = SwingUtilities.isLeftMouseButton(mouseEvent);
                                                    if (nArray == null) break block9;
                                                    if (n15 == 0) break block10;
                                                    n15 = ko_2.Q(this.G);
                                                }
                                                if (nArray == null) break block11;
                                                if (n15 == 0) break block10;
                                                ko_2.r(this.G, false);
                                                if (nArray == null) break block12;
                                                n15 = this.i() - this.l;
                                            }
                                            if (n15 == 0) break block13;
                                            n14 = tR.b().size();
                                            if (nArray == null) break block14;
                                            if (n14 > 1) break block15;
                                        }
                                        tR.y(ko_22, null);
                                    }
                                    if (nArray != null) break block16;
                                }
                                n14 = tR.z(ko_22);
                            }
                            n11 = n14;
                            int n16 = this.E(ko_22);
                            n10 = 0;
                            for (Component component : tR.b()) {
                                block17: {
                                    int n17;
                                    int n18;
                                    block18: {
                                        if (nArray == null) break block8;
                                        if (component == ko_22) break block17;
                                        int n17 = n16;
                                        n17 = this.E(component);
                                        if (nArray == null) break block18;
                                        if (n18 <= n17) break block17;
                                        int n17 = tR.z(component);
                                        n17 = 1;
                                    }
                                    n10 = n18 + n17;
                                }
                                if (nArray != null) continue;
                            }
                            int n12 = n10--;
                            n12 = n11;
                            if (nArray == null) break block19;
                            if (n13 > n12) {
                                // empty if block
                            }
                            tR.y(ko_22, null);
                        }
                        if (nArray == null) break block20;
                        int n12 = n11;
                        n12 = n10;
                    }
                    if (n13 == n12) break block16;
                    tR.removeLayoutComponent(ko_22);
                    tR.u(n10, ko_22);
                    kc_1.s(this.G.V);
                }
                kc_1.U(this.G.V, ko_22.I(), n11, n10);
            }
            ko_22.revalidate();
        }
    }

    private int E(Component component) {
        Rectangle rectangle = component.getBounds();
        return rectangle.y + rectangle.height / 2;
    }

    private int i() {
        return MouseInfo.getPointerInfo().getLocation().y;
    }
}

