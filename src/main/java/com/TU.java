/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class TU
extends T4 {
    protected int Q;

    public TU(int n10) {
        this.Q = n10;
    }

    public int t() {
        return this.Q;
    }

    public void C(int n10) {
        this.Q = n10;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return this.r(container, false);
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return this.r(container, true);
    }

    @Override
    public void layoutContainer(Container container) {
        Dimension dimension = this.preferredLayoutSize(container);
        int n10 = T4.O();
        Dimension dimension2 = new Dimension(dimension.width, container.getSize().height);
        int n11 = dimension.width;
        if (n10 == 0) {
            n11 = n11 < dimension2.width ? 1 : 0;
        }
        int n12 = n11;
        Insets insets = container.getInsets();
        int n13 = insets.left;
        int n14 = insets.top;
        int n15 = Math.max(dimension2.height, dimension.height) - insets.top - insets.bottom;
        int n16 = dimension2.width - dimension.width;
        int n17 = container.getComponentCount();
        int n18 = 0;
        while (n18 < n17) {
            Component component = container.getComponent(n18);
            if (n10 == 0) {
                if (component.isVisible()) {
                    int n19 = n12;
                    if (n10 == 0) {
                        n19 = n19 != 0 ? component.getMinimumSize().width : component.getPreferredSize().width;
                    }
                    int n20 = n19;
                    int n21 = n16;
                    if (n10 == 0) {
                        if (n21 > 0) {
                            n20 += n20 * n16 / dimension.width;
                        }
                        component.setBounds(n13, n14, n20, n15);
                        n21 = n13 + (n20 - this.Q);
                    }
                    n13 = n21;
                }
                ++n18;
            }
            if (n10 == 0) continue;
        }
    }

    protected Dimension r(Container container, boolean bl) {
        Container container2;
        Dimension dimension;
        block4: {
            int n10 = container.getComponentCount();
            dimension = new Dimension(0, 0);
            int n11 = 0;
            int n12 = T4.b();
            while (n11 < n10) {
                container2 = container;
                if (n12 != 0) {
                    Component component = container2.getComponent(n11);
                    Dimension dimension2 = bl ? component.getMinimumSize() : component.getPreferredSize();
                    dimension.height = Math.max(dimension2.height, dimension.height);
                    dimension.width += dimension2.width;
                    if (n12 != 0) {
                        if (n11 != 0) {
                            dimension.width -= this.Q;
                        }
                        ++n11;
                    }
                    if (n12 != 0) continue;
                }
                break block4;
            }
            container2 = container;
        }
        Insets insets = container2.getInsets();
        dimension.width += insets.left + insets.right;
        dimension.height += insets.top + insets.bottom;
        return dimension;
    }
}

