/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C.X;
import com.KD;
import com.ND;
import com.QC;
import com.ot_1;
import javax.swing.Action;
import javax.swing.Icon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KR
extends KD
implements ND {
    protected boolean E;
    protected float P;

    public KR() {
        this.X();
    }

    public KR(Icon icon) {
        super(icon);
        this.X();
    }

    public KR(String string) {
        super(string);
        this.X();
    }

    public KR(Action action) {
        super(action);
        this.X();
    }

    public KR(String string, Icon icon) {
        super(string, icon);
        this.X();
    }

    private void X() {
        this.setMargin(ot_1.o);
        this.O(0);
        this.U(new X());
    }

    @Override
    public void o(boolean bl) {
        this.E = bl;
        this.repaint();
    }

    @Override
    public boolean D() {
        return this.E;
    }

    @Override
    public void w(float f10) {
        this.P = f10;
        this.repaint();
    }

    @Override
    public float D() {
        return this.P;
    }

    @Override
    public boolean contains(int n10, int n11) {
        return QC.q(this, n10, n11);
    }
}

