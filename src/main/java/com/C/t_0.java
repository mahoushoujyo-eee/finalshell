/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.O;
import com.E;
import java.awt.Shape;
import javax.swing.JComponent;

/*
 * Renamed from com.C.t
 */
class t_0
implements E {
    final JComponent y;
    final boolean z;
    final O I;

    t_0(O o2, JComponent jComponent, boolean bl) {
        this.I = o2;
        this.y = jComponent;
        this.z = bl;
    }

    public Shape h() {
        return this.I.o(this.y, this.z);
    }

    @Override
    public Object J() {
        return this.h();
    }
}

