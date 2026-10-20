/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.A;
import com.C.T;
import com.C.W;
import com.FY;
import com.KR;
import com.QC;
import com.ke_1;
import com.lz_0;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;

public class X
extends lz_0 {
    protected ContainerAdapter D;
    protected FY T;
    protected ke_1 u = null;

    public void i(KR kR) {
        this.D = new A(this, kR);
        this.T = new T(this, kR);
        kR.addAncestorListener(this.T);
    }

    public void w(KR kR) {
        this.V();
        this.D = null;
        kR.removeAncestorListener(this.T);
        this.T = null;
    }

    protected void V() {
        block3: {
            ke_1 ke_12;
            block2: {
                int[] nArray = W.B();
                ke_12 = this.u;
                if (nArray != null) break block2;
                if (ke_12 == null) break block3;
                ke_12 = this.u;
            }
            ke_12.removeContainerListener(this.D);
            this.u = null;
        }
    }

    public Boolean B(KR kR) {
        return false;
    }

    public Insets X(KR kR) {
        return QC.S(kR);
    }

    public void J(Graphics2D graphics2D, Rectangle rectangle, KR kR) {
        QC.q(graphics2D, kR);
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.X((KR)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.B((KR)jComponent);
    }

    @Override
    public void X(JComponent jComponent) {
        this.w((KR)jComponent);
    }

    @Override
    public void A(JComponent jComponent) {
        this.i((KR)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.J(graphics2D, rectangle, (KR)jComponent);
    }
}

