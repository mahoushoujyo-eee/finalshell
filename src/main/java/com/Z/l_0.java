/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.FN;
import com.Z.T;
import com.ky_2;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.Z.l
 */
class l_0
implements PropertyChangeListener {
    final ky_2 M;
    final T U;

    l_0(T t2, ky_2 ky_22) {
        this.U = t2;
        this.M = ky_22;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.U.I.setPreferredSize(null);
        this.U.a.setPreferredSize(null);
        this.U.I.p(this.U.I.getText());
        this.U.a.p(this.U.a.getText());
        FN.b(new Component[]{this.U.I, this.U.a});
        this.M.revalidate();
    }
}

