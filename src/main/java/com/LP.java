/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lz_0;
import com.og_2;
import com.p5_0;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class LP
extends lz_0 {
    private final og_2 m;

    public LP(og_2 og_22) {
        this.m = og_22;
    }

    public og_2 J() {
        return this.m;
    }

    @Override
    public void A(JComponent jComponent) {
        this.m.A(jComponent);
    }

    @Override
    public void X(JComponent jComponent) {
        this.m.X(jComponent);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        return this.m.d(jComponent);
    }

    @Override
    public Dimension d(JComponent jComponent) {
        return this.m.d(jComponent);
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.m.B(jComponent);
    }

    @Override
    public void A(p5_0 p5_02) {
        this.m.A(p5_02);
    }

    @Override
    public void E(p5_0 p5_02) {
        this.m.E(p5_02);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.m.u(graphics2D, rectangle, jComponent);
    }
}

