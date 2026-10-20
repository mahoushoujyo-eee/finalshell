/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.j_0;
import com.pa_1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

class XC
implements D2 {
    final Color A;
    final Font X;
    final int s;
    final int D;
    final j_0 l;
    final j_0 M;
    final int b;
    final int E;
    final pa_1 p;

    XC(pa_1 pa_12, Color color, Font font, int n10, int n11, j_0 j_02, j_0 j_03, int n12, int n13) {
        this.p = pa_12;
        this.A = color;
        this.X = font;
        this.s = n10;
        this.D = n11;
        this.l = j_02;
        this.M = j_03;
        this.b = n12;
        this.E = n13;
    }

    @Override
    public void h(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(this.A);
        graphics2D.setFont(this.X);
        int n10 = this.s + this.D;
        graphics2D.drawChars(this.l.r(), this.M.o() + this.b, this.E, this.D + this.p.U, n10);
        graphics2D.dispose();
    }
}

