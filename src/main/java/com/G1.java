/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.ky_2;
import java.awt.RenderingHints;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.v.fr_0;

class G1
implements PropertyChangeListener {
    G1() {
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block3: {
            Object object;
            block2: {
                ky_2[] ky_2Array = fr_0.M();
                object = propertyChangeEvent.getNewValue();
                if (ky_2Array == null) break block2;
                if (!(object instanceof RenderingHints)) break block3;
                object = propertyChangeEvent.getNewValue();
            }
            GO.e = (RenderingHints)object;
        }
    }
}

