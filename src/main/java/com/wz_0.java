/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wo_1;
import javax.swing.AbstractListModel;

/*
 * Renamed from com.Wz
 */
class wz_0
extends AbstractListModel {
    final Object[] C;
    final wo_1 I;

    wz_0(wo_1 wo_12, Object[] objectArray) {
        this.I = wo_12;
        this.C = objectArray;
    }

    @Override
    public int getSize() {
        return this.C.length;
    }

    @Override
    public Object getElementAt(int n10) {
        return this.C[n10];
    }
}

