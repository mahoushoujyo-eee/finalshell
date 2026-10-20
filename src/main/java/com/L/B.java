/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.L.m;
import com.X9;

class B
implements X9 {
    final m l;

    B(m m10) {
        this.l = m10;
    }

    @Override
    public void r() {
        m.a(this.l).repaint();
        m.I(this.l).repaint();
    }

    @Override
    public void Q() {
        m.x(this.l, true);
        m.o(this.l).revalidate();
        m.O(this.l).revalidate();
    }
}

