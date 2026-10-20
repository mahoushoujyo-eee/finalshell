/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QX;
import com.c4_0;

/*
 * Renamed from com.cD
 */
class cd_1
extends c4_0 {
    final QX n;

    cd_1(QX qX, boolean bl) {
        this.n = qX;
        super(bl);
    }

    @Override
    public boolean z() {
        return this.n.isShowing();
    }

    @Override
    public void f(boolean bl) {
        this.n.j(bl);
    }
}

