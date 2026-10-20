/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.L.m;
import com.T4;
import com.ky_2;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JComboBox;

public class t
extends T4 {
    final m h;

    protected t(m m10) {
        this.h = m10;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return container.getPreferredSize();
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return container.getMinimumSize();
    }

    @Override
    public void layoutContainer(Container container) {
        block9: {
            Component component;
            block8: {
                ky_2[] ky_2Array;
                block4: {
                    block5: {
                        int n10;
                        int n11;
                        Insets insets;
                        block7: {
                            block6: {
                                JComboBox jComboBox = (JComboBox)container;
                                int n12 = jComboBox.getWidth();
                                int n13 = jComboBox.getHeight();
                                ky_2Array = m.X();
                                component = m.v(this.h);
                                if (ky_2Array != null) break block4;
                                if (component == null) break block5;
                                insets = m.O(this.h);
                                n11 = n13 - (insets.top + insets.bottom);
                                n10 = m.N((m)this.h).getPreferredSize().width;
                                if (ky_2Array != null) break block6;
                                if (!jComboBox.getComponentOrientation().isLeftToRight()) break block7;
                                m.I(this.h).setBounds(n12 - (insets.right + n10), insets.top, n10, n11);
                            }
                            if (ky_2Array == null) break block5;
                        }
                        m.D(this.h).setBounds(insets.left, insets.top, n10, n11);
                    }
                    component = m.i(this.h);
                }
                if (ky_2Array != null) break block8;
                if (component == null) break block9;
                component = m.W(this.h);
            }
            component.setBounds(this.h.rectangleForCurrentValue());
        }
    }
}

