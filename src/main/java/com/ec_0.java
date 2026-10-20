/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DP;
import com.iq_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Ec
 */
class ec_0
implements PropertyChangeListener {
    final DP X;

    ec_0(DP dP) {
        this.X = dP;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        SwingUtilities.invokeLater(new iq_2(this));
    }
}

