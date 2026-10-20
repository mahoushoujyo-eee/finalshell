/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wb_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Renamed from com.Td
 */
class td_0
implements PropertyChangeListener {
    final wb_0 d;

    td_0(wb_0 wb_02) {
        this.d = wb_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block4: {
            wb_0 wb_02;
            block2: {
                block3: {
                    String string = wb_0.m();
                    wb_02 = this.d;
                    if (string == null) break block2;
                    if (wb_02.isEnabled()) break block3;
                    this.d.c();
                    this.d.repaint();
                    if (string != null) break block4;
                }
                wb_0.O(this.d);
                wb_02 = this.d;
            }
            wb_02.repaint();
        }
    }
}

