/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.QC;
import java.awt.Shape;

class uI
implements E {
    final int u;
    final int x;
    final int D;
    final int M;
    final boolean Y;

    uI(int n10, int n11, int n12, int n13, boolean bl) {
        this.u = n10;
        this.x = n11;
        this.D = n12;
        this.M = n13;
        this.Y = bl;
    }

    public Shape x() {
        return QC.Z(this.u, this.x, this.D, this.M, this.Y);
    }

    @Override
    public Object J() {
        return this.x();
    }
}

