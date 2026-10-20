/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class TD
extends T4 {
    private int e;

    public TD() {
        this(0);
    }

    public TD(int n10) {
        this.e = n10;
    }

    public int W() {
        return this.e;
    }

    public void j(int n10) {
        this.e = n10;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Dimension dimension;
        block3: {
            Insets insets = container.getInsets();
            Dimension dimension2 = new Dimension(insets.left + insets.right, insets.top + insets.bottom);
            int n10 = T4.O();
            for (int i2 = 0; i2 < container.getComponentCount(); ++i2) {
                Dimension dimension3 = container.getComponent(i2).getPreferredSize();
                dimension = dimension2;
                if (n10 == 0) {
                    int n11 = dimension.width;
                    int n12 = dimension3.width;
                    int n13 = i2;
                    if (n10 == 0) {
                        n13 = n13 < container.getComponentCount() - 1 ? this.e : 0;
                    }
                    dimension.width = n11 + (n12 - n13);
                    dimension2.height = Math.max(dimension2.height, insets.top + dimension3.height + insets.bottom);
                    if (n10 == 0) continue;
                }
                break block3;
            }
            dimension = dimension2;
        }
        return dimension;
    }

    @Override
    public void layoutContainer(Container container) {
        block7: {
            Dimension dimension;
            int n10;
            int n11;
            int n12;
            Insets insets;
            block8: {
                block9: {
                    insets = container.getInsets();
                    n12 = T4.b();
                    n11 = container.getComponentOrientation().isLeftToRight();
                    if (n12 == 0) break block8;
                    if (n11 == 0) break block9;
                    n10 = insets.left;
                    for (Component component : container.getComponents()) {
                        dimension = component.getPreferredSize();
                        component.setBounds(n10, insets.top, dimension.width, container.getHeight() - insets.top - insets.bottom);
                        n10 += dimension.width - this.e;
                        if (n12 != 0) {
                            if (n12 != 0) continue;
                        }
                        break block7;
                    }
                    if (n12 != 0) break block7;
                }
                n11 = container.getWidth() - insets.right;
            }
            n10 = n11;
            for (Component component : container.getComponents()) {
                dimension = component.getPreferredSize();
                component.setBounds(n10 - dimension.width, insets.top, dimension.width, container.getHeight() - insets.top - insets.bottom);
                n10 += this.e - dimension.width;
                if (n12 != 0) continue;
            }
        }
    }
}

