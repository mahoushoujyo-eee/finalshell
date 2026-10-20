/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import com.KD;
import javax.swing.Icon;

class T
extends KD {
    final d E;

    T(d d2, Icon icon) {
        this.E = d2;
        super(icon);
    }

    @Override
    public Icon getIcon() {
        return this.E.j() ? d.K : d.i;
    }

    @Override
    public Icon getRolloverIcon() {
        return this.E.j() ? d.H : d.w;
    }
}

