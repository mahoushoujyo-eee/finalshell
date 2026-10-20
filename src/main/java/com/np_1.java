/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from com.nP
 */
public class np_1
extends CardLayout {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Dimension preferredLayoutSize(Container container) {
        Object object = container.getTreeLock();
        synchronized (object) {
            int n10 = T4.b();
            Insets insets = container.getInsets();
            int n11 = container.getComponentCount();
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            while (n14 < n11) {
                block8: {
                    block9: {
                        int n15;
                        block11: {
                            int n16;
                            Dimension dimension;
                            block10: {
                                Component component = container.getComponent(n14);
                                if (n10 == 0) break block8;
                                if (!component.isVisible()) break block9;
                                dimension = component.getPreferredSize();
                                n15 = dimension.width;
                                n16 = n12;
                                if (n10 == 0) break block10;
                                if (n15 > n16) {
                                    n12 = dimension.width;
                                }
                                n15 = dimension.height;
                                if (n10 == 0) break block11;
                                n16 = n13;
                            }
                            if (n15 <= n16) break block9;
                            n15 = dimension.height;
                        }
                        n13 = n15;
                    }
                    ++n14;
                }
                if (n10 != 0) continue;
            }
            return new Dimension(insets.left + insets.right + n12 + this.getHgap() * 2, insets.top + insets.bottom + n13 + this.getVgap() * 2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Dimension minimumLayoutSize(Container container) {
        Object object = container.getTreeLock();
        synchronized (object) {
            int n10 = T4.O();
            Insets insets = container.getInsets();
            int n11 = container.getComponentCount();
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            while (n14 < n11) {
                block8: {
                    block9: {
                        int n15;
                        block11: {
                            int n16;
                            Dimension dimension;
                            block10: {
                                Component component = container.getComponent(n14);
                                if (n10 != 0) break block8;
                                if (!component.isVisible()) break block9;
                                dimension = component.getMinimumSize();
                                n15 = dimension.width;
                                n16 = n12;
                                if (n10 != 0) break block10;
                                if (n15 > n16) {
                                    n12 = dimension.width;
                                }
                                n15 = dimension.height;
                                if (n10 != 0) break block11;
                                n16 = n13;
                            }
                            if (n15 <= n16) break block9;
                            n15 = dimension.height;
                        }
                        n13 = n15;
                    }
                    ++n14;
                }
                if (n10 == 0) continue;
            }
            return new Dimension(insets.left + insets.right + n12 + this.getHgap() * 2, insets.top + insets.bottom + n13 + this.getVgap() * 2);
        }
    }
}

