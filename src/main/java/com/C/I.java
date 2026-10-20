/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.C;
import com.C.W;
import com.C.Z;
import com.C.d;
import com.FY;
import com.QC;
import com.ke_1;
import com.ki_2;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ContainerAdapter;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class I
extends d {
    protected ContainerAdapter S;
    protected FY R;
    protected ke_1 A = null;

    public void w(ki_2 ki_22) {
        this.S = new C(this, ki_22);
        this.R = new Z(this, ki_22);
        ki_22.addAncestorListener(this.R);
    }

    public void v(ki_2 ki_22) {
        this.r();
        this.S = null;
        ki_22.removeAncestorListener(this.R);
        this.R = null;
    }

    protected void r() {
        block3: {
            ke_1 ke_12;
            block2: {
                int[] nArray = com.C.W.B();
                ke_12 = this.A;
                if (nArray != null) break block2;
                if (ke_12 == null) break block3;
                ke_12 = this.A;
            }
            ke_12.removeContainerListener(this.S);
            this.A = null;
        }
    }

    public Boolean z(ki_2 ki_22) {
        return false;
    }

    public Insets S(ki_2 ki_22) {
        return QC.S(ki_22);
    }

    public void c(Graphics2D graphics2D, Rectangle rectangle, ki_2 ki_22) {
        QC.q(graphics2D, ki_22);
        super.h(graphics2D, rectangle, ki_22);
    }

    @Override
    public void h(Graphics2D graphics2D, Rectangle rectangle, JPanel jPanel) {
        this.c(graphics2D, rectangle, (ki_2)jPanel);
    }

    @Override
    public Boolean y(JPanel jPanel) {
        return this.z((ki_2)jPanel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.c(graphics2D, rectangle, (ki_2)jComponent);
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.S((ki_2)jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.z((ki_2)jComponent);
    }

    @Override
    public void X(JComponent jComponent) {
        this.v((ki_2)jComponent);
    }

    @Override
    public void A(JComponent jComponent) {
        this.w((ki_2)jComponent);
    }
}

