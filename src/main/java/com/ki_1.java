/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import com.ky_2;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from com.kI
 */
class ki_1
extends ky_2 {
    final k3_0 Q;

    ki_1(k3_0 k3_02) {
        this.Q = k3_02;
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension;
        block14: {
            k3_0 k3_02;
            block15: {
                Insets insets;
                Component component;
                block11: {
                    int[] nArray;
                    block12: {
                        k3_0 k3_03;
                        block13: {
                            Component component2;
                            block9: {
                                block10: {
                                    dimension = super.getPreferredSize();
                                    nArray = k3_0.L();
                                    component2 = this.Q;
                                    if (nArray == null) break block9;
                                    if (component2.r == 1) break block10;
                                    component = this.Q;
                                    if (nArray == null) break block11;
                                    if (component.r != 3) break block12;
                                }
                                k3_03 = this.Q;
                                if (nArray == null) break block13;
                                component2 = k3_03.Y;
                            }
                            if (component2 != null) {
                                insets = this.getInsets();
                                dimension.width = insets.left + this.Q.Y.getPreferredSize().width + insets.right;
                            }
                            k3_03 = this.Q;
                        }
                        if (!(k3_03.k < 1.0f)) break block14;
                        dimension.height = Math.round((float)dimension.height * this.Q.k);
                        if (nArray != null) break block14;
                    }
                    k3_02 = this.Q;
                    if (nArray == null) break block15;
                    component = k3_02.Y;
                }
                if (component != null) {
                    insets = this.getInsets();
                    dimension.height = insets.top + this.Q.Y.getPreferredSize().height + insets.bottom;
                }
                k3_02 = this.Q;
            }
            if (k3_02.k < 1.0f) {
                dimension.width = Math.round((float)dimension.width * this.Q.k);
            }
        }
        return dimension;
    }
}

