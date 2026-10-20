/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.aS;
import com.ba_0;
import com.ed_0;
import com.ou_2;
import javax.swing.JComponent;
import javax.swing.event.ChangeListener;

public class IE
extends IB {
    private ChangeListener J;

    public IE(aS aS2) {
        super(aS2);
    }

    protected void j(ou_2 ou_22) {
        this.J = new ba_0(this);
        ou_22.t(this.J);
    }

    protected void e(ou_2 ou_22) {
        ou_22.s(this.J);
        this.J = null;
    }

    protected void c(ou_2 ou_22) {
        ou_22.Q((ed_0)this.o());
    }

    protected void Q(ou_2 ou_22) {
        this.J(ou_22.l());
    }

    @Override
    protected void T(JComponent jComponent) {
        this.Q((ou_2)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.c((ou_2)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.e((ou_2)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.j((ou_2)jComponent);
    }
}

