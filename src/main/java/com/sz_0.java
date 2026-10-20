/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BU;
import com.E;
import com.QC;
import java.awt.Shape;
import javax.swing.JComponent;

/*
 * Renamed from com.Sz
 */
class sz_0
implements E {
    final JComponent U;
    final BU g;
    final int N;
    final int d;
    final int a;
    final int j;
    final int o;
    final boolean k;
    final boolean u;

    sz_0(JComponent jComponent, BU bU, int n10, int n11, int n12, int n13, int n14, boolean bl, boolean bl2) {
        this.U = jComponent;
        this.g = bU;
        this.N = n10;
        this.d = n11;
        this.a = n12;
        this.j = n13;
        this.o = n14;
        this.k = bl;
        this.u = bl2;
    }

    public Shape a() {
        return QC.z(this.U, this.g, this.N, this.d, this.a, this.j, this.o, this.k, this.u);
    }

    @Override
    public Object J() {
        return this.a();
    }
}

