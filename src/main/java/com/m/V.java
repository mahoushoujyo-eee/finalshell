/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.L.X;
import com.m.B;
import com.m.E;
import com.m.K;
import com.m.c;
import com.m.n;
import com.m.s;
import com.ne_2;
import com.rt_2;
import com.uE;
import com.wb_0;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.plaf.TreeUI;

public class V
extends rt_2 {
    protected boolean E = true;

    public V() {
        this(new ne_2());
    }

    public V(ne_2 ne_22) {
        super(ne_22);
        ne_22.addFocusListener(new c(this));
    }

    public V(uE uE2) {
        super(uE2);
        uE2.addFocusListener(new E(this));
    }

    public V(X x10) {
        super(x10);
        x10.addFocusListener(new B(this));
    }

    @Override
    public Component getTreeCellEditorComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10) {
        Component component;
        block7: {
            Component component2;
            block8: {
                component2 = super.getTreeCellEditorComponent(jTree, object, bl, bl2, bl3, n10);
                Component component3 = jTree.getCellRenderer().getTreeCellRendererComponent(jTree, object, bl, bl2, bl3, n10, true);
                String string = s.d();
                component2.setPreferredSize(component3.getPreferredSize());
                component = component3;
                if (string == null) break block7;
                if (!(component instanceof JLabel)) break block8;
                component = (JLabel)component3;
                if (string == null) break block7;
                if (((JLabel)component).getIcon() == null) break block8;
                JLabel jLabel = (JLabel)component3;
                component = component2;
                if (string == null) break block7;
                if (component instanceof ne_2) {
                    TreeUI treeUI = jTree.getUI();
                    int n11 = treeUI instanceof K;
                    if (string != null) {
                        n11 = n11 != 0 ? ((K)treeUI).A() : n.O;
                    }
                    int n12 = n11;
                    ne_2 ne_22 = (ne_2)component2;
                    ne_22.c(false);
                    ne_22.F(n12);
                    ne_22.L(false);
                    int n13 = this.E;
                    if (string != null) {
                        if (n13 != 0) {
                            ne_22.v(new wb_0(jLabel.getIcon()));
                        }
                        n13 = n12 + 1;
                    }
                    int n14 = n13;
                    Insets insets = jLabel.getInsets();
                    ne_22.I(insets.top - n14, insets.left - n14, insets.bottom - n14, insets.right - n14 - 2);
                    ne_22.d(0, jLabel.getIconTextGap(), 0, 0);
                }
            }
            component2.applyComponentOrientation(jTree.getComponentOrientation());
            component = component2;
        }
        return component;
    }
}

