/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.W;
import com.ia_2;

public class N
extends W
implements ia_2 {
    protected boolean X = false;

    public boolean G() {
        return this.X;
    }

    public void U(boolean bl) {
        block3: {
            N n10;
            block2: {
                int[] nArray = W.B();
                n10 = this;
                if (nArray != null) break block2;
                if (n10.X == bl) break block3;
                this.X = bl;
                n10 = this;
            }
            n10.l();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected float j() {
        float f10;
        int[] nArray = W.B();
        N n10 = this;
        if (nArray == null) {
            if (n10.X) {
                f10 = this.I;
                return f10;
            }
            n10 = this;
        }
        f10 = n10.I * 0.7f;
        return f10;
    }

    @Override
    public void O(boolean bl) {
    }

    @Override
    public void V(boolean bl) {
    }

    @Override
    public void D(boolean bl) {
    }

    @Override
    public void C(boolean bl) {
    }

    @Override
    public void p(boolean bl) {
    }

    @Override
    public void w(boolean bl) {
    }

    @Override
    public void I(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
    }

    @Override
    public void X(boolean bl) {
    }

    @Override
    public void H(boolean bl) {
    }

    @Override
    public void B(boolean bl) {
    }

    @Override
    public void m(boolean bl) {
    }

    @Override
    public void X(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
    }
}

