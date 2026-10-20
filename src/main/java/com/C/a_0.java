/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.S;
import com.C.W;
import com.FY;
import com.QC;
import com.c.x_0;
import com.ke_1;
import com.lz_0;
import com.qx_0;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;

/*
 * Renamed from com.C.a
 */
public class a_0
extends lz_0 {
    protected ContainerAdapter G;
    protected FY Y;
    protected ke_1 t = null;

    public void M(qx_0 qx_02) {
        this.G = new x_0(this, qx_02);
        this.Y = new S(this, qx_02);
        qx_02.addAncestorListener(this.Y);
    }

    public void E(qx_0 qx_02) {
        this.K();
        this.G = null;
        qx_02.removeAncestorListener(this.Y);
        this.Y = null;
    }

    protected void K() {
        block3: {
            ke_1 ke_12;
            block2: {
                int[] nArray = W.B();
                ke_12 = this.t;
                if (nArray != null) break block2;
                if (ke_12 == null) break block3;
                ke_12 = this.t;
            }
            ke_12.removeContainerListener(this.G);
            this.t = null;
        }
    }

    public Boolean N(qx_0 qx_02) {
        return false;
    }

    public Insets g(qx_0 qx_02) {
        return QC.S(qx_02);
    }

    public void z(Graphics2D graphics2D, Rectangle rectangle, qx_0 qx_02) {
        QC.q(graphics2D, qx_02);
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.g((qx_0)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.N((qx_0)jComponent);
    }

    @Override
    public void X(JComponent jComponent) {
        this.E((qx_0)jComponent);
    }

    @Override
    public void A(JComponent jComponent) {
        this.M((qx_0)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.z(graphics2D, rectangle, (qx_0)jComponent);
    }
}

