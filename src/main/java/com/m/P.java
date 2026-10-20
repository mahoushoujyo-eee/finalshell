/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.K;
import com.m.s;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTree;

class P
implements PropertyChangeListener {
    final K K;

    P(K k2) {
        this.K = k2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        JTree.DropLocation dropLocation;
        JTree.DropLocation dropLocation2 = (JTree.DropLocation)propertyChangeEvent.getOldValue();
        String string = s.d();
        JTree.DropLocation dropLocation3 = dropLocation2;
        if (string != null) {
            if (dropLocation3 != null) {
                com.m.K.B(this.K).repaint(this.K.p(dropLocation2.getPath()));
            }
            dropLocation3 = (JTree.DropLocation)propertyChangeEvent.getNewValue();
        }
        if ((dropLocation = dropLocation3) != null) {
            com.m.K.K(this.K).repaint(this.K.p(dropLocation.getPath()));
        }
    }
}

