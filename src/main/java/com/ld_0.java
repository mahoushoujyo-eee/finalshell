/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.no_0;
import javax.swing.AbstractListModel;

/*
 * Renamed from com.Ld
 */
class ld_0
extends AbstractListModel {
    final no_0 o;

    ld_0(no_0 no_02) {
        this.o = no_02;
    }

    @Override
    public int getSize() {
        return this.o.M.size();
    }

    @Override
    public Object getElementAt(int n10) {
        return this.o.M.get(n10);
    }
}

