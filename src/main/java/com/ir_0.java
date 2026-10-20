/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BO;
import com.IB;
import com.IH;
import com.aS;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.Ir
 */
public class ir_0
extends IB {
    private ChangeListener i;

    public ir_0(aS aS2) {
        super(aS2);
    }

    protected void H(JTabbedPane jTabbedPane) {
        this.i = new BO(this);
        jTabbedPane.addChangeListener(this.i);
    }

    protected void S(JTabbedPane jTabbedPane) {
        jTabbedPane.removeChangeListener(this.i);
        this.i = null;
    }

    protected void E(JTabbedPane jTabbedPane) {
        block5: {
            int n10;
            int n11;
            Integer n12;
            block7: {
                String[] stringArray;
                block6: {
                    Integer n13;
                    block4: {
                        n12 = (Integer)this.o();
                        stringArray = IH.M();
                        n13 = n12;
                        if (stringArray == null) break block4;
                        if (n13 == null) break block5;
                        n13 = n12;
                    }
                    n11 = n13;
                    if (stringArray == null) break block6;
                    if (n11 < 0) break block5;
                    n11 = jTabbedPane.getTabCount();
                }
                n10 = n12;
                if (stringArray == null) break block7;
                if (n11 <= n10) break block5;
                n11 = n12;
                n10 = jTabbedPane.getSelectedIndex();
            }
            if (n11 != n10) {
                jTabbedPane.setSelectedIndex(n12);
            }
        }
    }

    protected void N(JTabbedPane jTabbedPane) {
        this.J(Integer.valueOf(jTabbedPane.getSelectedIndex()));
    }

    @Override
    protected void T(JComponent jComponent) {
        this.N((JTabbedPane)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.E((JTabbedPane)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.S((JTabbedPane)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.H((JTabbedPane)jComponent);
    }
}

