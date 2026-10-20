/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XN;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ButtonModel;
import javax.swing.JMenuItem;

/*
 * Renamed from com.dl
 */
class dl_2
implements PropertyChangeListener {
    final XN z;
    final JMenuItem u;

    dl_2(XN xN2, JMenuItem jMenuItem) {
        this.z = xN2;
        this.u = jMenuItem;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        ((ButtonModel)propertyChangeEvent.getOldValue()).removeChangeListener(this.z);
        this.u.getModel().addChangeListener(this.z);
    }
}

