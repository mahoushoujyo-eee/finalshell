/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.aS;
import com.m.Q;
import com.m.p_0;
import com.m.s;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/*
 * Renamed from com.Id
 */
public class id_0
extends IB
implements TreeSelectionListener,
TreeExpansionListener {
    public id_0(aS aS2) {
        super(aS2);
    }

    protected void p(s s2) {
        s2.addTreeSelectionListener(this);
        s2.addTreeExpansionListener(this);
    }

    protected void j(s s2) {
        s2.removeTreeExpansionListener(this);
        s2.removeTreeSelectionListener(this);
    }

    @Override
    public void treeExpanded(TreeExpansionEvent treeExpansionEvent) {
        this.M();
    }

    @Override
    public void treeCollapsed(TreeExpansionEvent treeExpansionEvent) {
        this.M();
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        this.M();
    }

    protected void I(s s2) {
        block5: {
            p_0 p_02;
            Serializable serializable;
            block4: {
                String[] stringArray = IH.M();
                serializable = s2.M();
                if (stringArray == null) break block4;
                if (!(serializable instanceof Q)) break block5;
                serializable = this.o();
            }
            if ((p_02 = (p_0)serializable) != null) {
                s2.P(p_02);
            }
        }
    }

    protected void W(s s2) {
        if (s2.M() instanceof Q) {
            this.J(s2.B());
        }
    }

    @Override
    protected void T(JComponent jComponent) {
        this.W((s)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.I((s)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.j((s)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.p((s)jComponent);
    }
}

