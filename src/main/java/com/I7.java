/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.aS;
import com.lk_2;
import com.pu_2;
import com.wx_1;
import java.util.Date;
import javax.swing.JComponent;

public class I7
extends IB {
    private pu_2 M;

    public I7(aS aS2) {
        super(aS2);
    }

    protected void V(lk_2 lk_22) {
        this.M = new wx_1(this);
        lk_22.Z(this.M);
    }

    protected void l(lk_2 lk_22) {
        lk_22.s(this.M);
        this.M = null;
    }

    protected void c(lk_2 lk_22) {
        Long l2 = (Long)this.o();
        Date date = l2 != null ? new Date(l2) : null;
        lk_22.R(date);
    }

    /*
     * Unable to fully structure code
     */
    protected void A(lk_2 var1_1) {
        var3_2 = var1_1.E();
        var2_3 = IH.M();
        v0 = var3_2;
        if (var2_3 == null) ** GOTO lbl7
        if (v0 != null) {
            v0 = var3_2;
lbl7:
            // 2 sources

            v1 = v0.getTime();
        } else {
            v1 = null;
        }
        var4_4 = v1;
        this.J(var4_4);
    }

    @Override
    protected void T(JComponent jComponent) {
        this.A((lk_2)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.c((lk_2)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.l((lk_2)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.V((lk_2)jComponent);
    }
}

