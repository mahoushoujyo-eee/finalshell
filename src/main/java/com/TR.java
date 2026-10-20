/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TR
extends T4 {
    protected List Z = new ArrayList();
    protected Map H = new HashMap();

    public List b() {
        return this.Z;
    }

    public void y(Component component, Integer n10) {
        this.H.put(component, n10);
    }

    public Integer O(Component component) {
        return (Integer)this.H.get(component);
    }

    public int z(Component component) {
        return this.Z.indexOf(component);
    }

    public Component j(int n10) {
        return (Component)this.Z.get(n10);
    }

    @Override
    public void A(Component component, Object object) {
        this.Z.add(component);
    }

    @Override
    public void F(Component component) {
        this.Z.remove(component);
    }

    public void u(int n10, Component component) {
        this.Z.add(n10, component);
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Dimension dimension;
        block2: {
            Insets insets = container.getInsets();
            int n10 = insets.left + insets.right;
            int n11 = insets.top + insets.bottom;
            int n12 = T4.O();
            for (Component component : this.Z) {
                dimension = component.getPreferredSize();
                if (n12 == 0) {
                    Dimension dimension2 = dimension;
                    n10 = Math.max(n10, insets.left + dimension2.width + insets.right);
                    n11 += dimension2.height;
                    if (n12 == 0) continue;
                }
                break block2;
            }
            dimension = new Dimension(n10, n11);
        }
        return dimension;
    }

    @Override
    public void layoutContainer(Container container) {
        Insets insets = container.getInsets();
        int n10 = insets.top;
        int n11 = T4.O();
        for (Component component : this.Z) {
            Dimension dimension = component.getPreferredSize();
            Integer n12 = (Integer)this.H.get(component);
            component.setBounds(insets.left, n12 == null ? n10 : n10 + n12, container.getWidth() - insets.left - insets.right, dimension.height);
            n10 += dimension.height;
            if (n11 == 0) continue;
        }
    }
}

