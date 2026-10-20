/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.GO;
import com.lz_0;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class L5
extends lz_0 {
    protected boolean p = true;
    protected int E = GO.Fx;
    protected boolean A = false;
    protected int Q = GO.FG;
    protected boolean f = true;
    protected boolean v = true;

    public boolean h() {
        return this.p;
    }

    public void R(boolean bl) {
        this.p = bl;
        this.l();
    }

    public int R() {
        return this.E;
    }

    public void e(int n10) {
        this.E = n10;
        this.l();
    }

    public boolean k() {
        return this.A;
    }

    public void r(boolean bl) {
        this.A = bl;
        this.l();
    }

    public int q() {
        return this.Q;
    }

    public void u(int n10) {
        this.Q = n10;
        this.Z();
    }

    public boolean O() {
        return this.f;
    }

    public void E(boolean bl) {
        this.f = bl;
        this.l();
    }

    public boolean X() {
        return this.v;
    }

    public void l(boolean bl) {
        this.v = bl;
        this.l();
    }

    @Override
    public Insets B(JComponent jComponent) {
        return new Insets(this.Q + 1, this.Q + 1, this.Q + 1, this.Q + 1);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(Graphics2D var1_1, Rectangle var2_2, JComponent var3_3) {
        block2: {
            block3: {
                var4_4 = lz_0.M();
                if (!this.p) break block2;
                v0 = this.A;
                if (var4_4 != null) break block3;
                if (!v0) ** GOTO lbl-1000
                v0 = var3_3.isFocusOwner();
            }
            if (v0) {
                v1 = GO.c;
            } else lbl-1000:
            // 2 sources

            {
                v1 = GO.r;
            }
            GA.r(var1_1, var3_3, v1, this.Q, this.E, this.f, this.v);
        }
    }
}

