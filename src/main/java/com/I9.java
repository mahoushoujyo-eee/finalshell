/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.aS;
import com.da_1;
import com.ds_2;
import com.k3_0;
import java.io.Serializable;
import javax.swing.JComponent;

public class I9
extends IB {
    private da_1 V;

    public I9(aS aS2) {
        super(aS2);
    }

    public Boolean l() {
        Boolean bl = (Boolean)super.Y();
        String[] stringArray = IH.M();
        Boolean bl2 = bl;
        if (stringArray != null) {
            if (bl2 == null) {
                bl = true;
            }
            bl2 = bl;
        }
        return bl2;
    }

    protected void B(k3_0 k3_02) {
        this.V = new ds_2(this);
        k3_02.m(this.V);
    }

    protected void b(k3_0 k3_02) {
        k3_02.B(this.V);
        this.V = null;
    }

    protected void V(k3_0 k3_02) {
        k3_02.u((Boolean)this.o());
    }

    protected void u(k3_0 k3_02) {
        this.J(Boolean.valueOf(k3_02.Y()));
    }

    @Override
    protected void T(JComponent jComponent) {
        this.u((k3_0)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.V((k3_0)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.b((k3_0)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.B((k3_0)jComponent);
    }

    @Override
    public Serializable Y() {
        return this.l();
    }
}

