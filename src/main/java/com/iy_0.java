/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.DP;
import com.H;
import com.IB;
import com.QL;
import com.aS;
import com.at_0;
import com.dj_1;
import com.el_0;
import com.sj_0;
import javax.swing.JComponent;

/*
 * Renamed from com.Iy
 */
public class iy_0
extends IB
implements H,
dj_1 {
    public iy_0(aS aS2) {
        super(aS2);
    }

    protected void N(QL qL) {
        qL.o(this);
        qL.x(this);
    }

    protected void A(QL qL) {
        qL.Y(this);
        qL.Z(this);
    }

    @Override
    public void U(at_0 at_02, BX bX, int n10) {
        this.M();
    }

    @Override
    public void N(at_0 at_02, BX bX, int n10) {
        this.M();
    }

    @Override
    public boolean T(at_0 at_02, BX bX, int n10) {
        return true;
    }

    @Override
    public void u(at_0 at_02, BX bX, int n10) {
        this.M();
    }

    @Override
    public void a(QL qL, BX bX, DP dP) {
        this.M();
    }

    @Override
    public void v(QL qL, DP dP, el_0 el_02) {
        this.M();
    }

    @Override
    public void c(QL qL, DP dP) {
        this.M();
    }

    @Override
    public void S(QL qL, DP dP) {
        this.M();
    }

    @Override
    public void w(QL qL, DP dP) {
        this.M();
    }

    protected void f(QL qL) {
        sj_0 sj_02 = (sj_0)this.o();
        if (sj_02 != null) {
            qL.N(sj_02);
        }
    }

    protected void w(QL qL) {
        this.J(qL.i());
    }

    @Override
    protected void T(JComponent jComponent) {
        this.w((QL)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.f((QL)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.A((QL)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.N((QL)jComponent);
    }
}

