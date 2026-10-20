/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.FY;
import com.QC;
import com.c.p_0;
import com.c.s_0;
import com.c.v_0;
import com.ke_1;
import com.ov_0;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class J
extends v_0 {
    protected ContainerAdapter F;
    protected FY z;
    protected ke_1 O = null;

    public void l(ov_0 ov_02) {
        this.F = new p_0(this, ov_02);
        this.z = new s_0(this, ov_02);
        ov_02.addAncestorListener(this.z);
    }

    public void C(ov_0 ov_02) {
        this.U();
        this.F = null;
        ov_02.removeAncestorListener(this.z);
        this.z = null;
    }

    protected void U() {
        block3: {
            ke_1 ke_12;
            block2: {
                int[] nArray = W.B();
                ke_12 = this.O;
                if (nArray != null) break block2;
                if (ke_12 == null) break block3;
                ke_12 = this.O;
            }
            ke_12.removeContainerListener(this.F);
            this.O = null;
        }
    }

    public Boolean P(ov_0 ov_02) {
        return false;
    }

    public Insets k(ov_0 ov_02) {
        return QC.S(ov_02);
    }

    public void Q(Graphics2D graphics2D, Rectangle rectangle, ov_0 ov_02) {
        QC.q(graphics2D, ov_02);
        super.u(graphics2D, rectangle, ov_02);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JLabel jLabel) {
        this.Q(graphics2D, rectangle, (ov_0)jLabel);
    }

    @Override
    public Insets Q(JLabel jLabel) {
        return this.k((ov_0)jLabel);
    }

    @Override
    public Boolean A(JLabel jLabel) {
        return this.P((ov_0)jLabel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.Q(graphics2D, rectangle, (ov_0)jComponent);
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.k((ov_0)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.P((ov_0)jComponent);
    }

    @Override
    public void X(JComponent jComponent) {
        this.C((ov_0)jComponent);
    }

    @Override
    public void A(JComponent jComponent) {
        this.l((ov_0)jComponent);
    }
}

