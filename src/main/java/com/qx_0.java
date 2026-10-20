/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ND;
import com.QC;
import com.c.a_0;
import com.ot_1;
import com.qe_0;
import javax.swing.Action;
import javax.swing.Icon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Qx
 */
public class qx_0
extends qe_0
implements ND {
    protected boolean J;
    protected float x;

    public qx_0() {
        this.H();
    }

    public qx_0(Icon icon) {
        super(icon);
        this.H();
    }

    public qx_0(String string) {
        super(string);
        this.H();
    }

    public qx_0(Action action) {
        super(action);
        this.H();
    }

    public qx_0(String string, Icon icon) {
        super(string, icon);
        this.H();
    }

    private void H() {
        this.setMargin(ot_1.o);
        this.K(0);
        this.V(new a_0());
    }

    @Override
    public void o(boolean bl) {
        this.J = bl;
        this.repaint();
    }

    @Override
    public boolean D() {
        return this.J;
    }

    @Override
    public void w(float f10) {
        this.x = f10;
        this.repaint();
    }

    @Override
    public float D() {
        return this.x;
    }

    @Override
    public boolean contains(int n10, int n11) {
        return QC.q(this, n10, n11);
    }
}

