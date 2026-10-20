/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k2_0;
import com.k3_0;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;

class PW
implements PropertyChangeListener {
    final k2_0 c;

    PW(k2_0 k2_02) {
        this.c = k2_02;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block7: {
            int n10;
            int n11;
            int[] nArray;
            block8: {
                Object object;
                block6: {
                    Object object2 = propertyChangeEvent.getSource();
                    nArray = k3_0.L();
                    object = object2;
                    if (nArray == null) break block6;
                    if (!(object instanceof JButton)) break block7;
                    object = object2;
                }
                JButton jButton = (JButton)object;
                n10 = n11 = this.c.getComponentZOrder(jButton);
                if (nArray == null) break block8;
                if (n10 == -1) break block7;
                n10 = n11;
            }
            if (nArray != null) {
                if (n10 > 0) {
                    this.c.getComponent(n11 - 1).repaint();
                }
                n10 = n11;
            }
            if (n10 < this.c.getComponentCount() - 1) {
                this.c.getComponent(n11 + 1).repaint();
            }
        }
    }
}

