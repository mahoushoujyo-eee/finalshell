/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.c.r_0;
import com.c4_0;

/*
 * Renamed from com.c.m
 */
class m_2
extends c4_0 {
    final r_0 h;

    m_2(r_0 r_02) {
        this.h = r_02;
    }

    @Override
    public void f(boolean bl) {
        this.h.Q = bl;
        r_0.D(this.h).repaint();
    }
}

