/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EL;
import com.IB;
import com.IH;
import com.aS;
import com.cl_2;
import java.awt.event.AdjustmentListener;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

/*
 * Renamed from com.Ix
 */
public class ix_0
extends IB {
    private AdjustmentListener U;

    public ix_0(aS aS2) {
        super(aS2);
    }

    public Integer n() {
        Integer n10 = (Integer)super.Y();
        String[] stringArray = IH.M();
        Integer n11 = n10;
        if (stringArray != null) {
            if (n11 == null) {
                n10 = ((JScrollBar)this.b()).getMinimum();
            }
            n11 = n10;
        }
        return n11;
    }

    protected void h(JScrollBar jScrollBar) {
        this.U = new EL(this);
        jScrollBar.addAdjustmentListener(this.U);
    }

    protected void g(JScrollBar jScrollBar) {
        jScrollBar.removeAdjustmentListener(this.U);
        this.U = null;
    }

    protected void m(JScrollBar jScrollBar) {
        jScrollBar.setValue((Integer)this.o());
    }

    protected void F(JScrollBar jScrollBar) {
        cl_2.A(this.M(), this.S(), jScrollBar.getValue());
    }

    @Override
    protected void T(JComponent jComponent) {
        this.F((JScrollBar)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.m((JScrollBar)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.g((JScrollBar)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.h((JScrollBar)jComponent);
    }

    @Override
    public Serializable Y() {
        return this.n();
    }
}

