/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pt_0;
import com.uE;
import java.awt.Component;
import java.awt.Graphics2D;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class aO {
    protected boolean h = true;
    protected pt_0 D = pt_0.unchecked;
    protected pt_0 A = null;

    public boolean G() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public pt_0 H() {
        return this.D;
    }

    public void c(pt_0 pt_02) {
        this.D = pt_02;
        this.A = null;
        this.F();
    }

    public pt_0 m() {
        return this.A;
    }

    /*
     * Unable to fully structure code
     */
    public void U(pt_0 var1_1) {
        var2_2 = uE.Z();
        v0 = this;
        if (var2_2) ** GOTO lbl8
        if (v0.A != null) {
            v1 = this.A;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.D;
        }
        this.D = v1;
        this.A = var1_1;
    }

    public abstract void G();

    public abstract void F();

    public abstract boolean B();

    public abstract void l();

    public abstract int L();

    public abstract int u();

    public abstract void O(Component var1, Graphics2D var2, int var3, int var4, int var5, int var6);
}

