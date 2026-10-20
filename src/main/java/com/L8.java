/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FJ;
import com.FN;
import com.pb_2;
import com.xk_0;
import java.awt.Container;
import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class L8
implements PropertyChangeListener {
    final FJ L;

    L8(FJ fJ2) {
        this.L = fJ2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block2: {
            Window window;
            block6: {
                boolean bl;
                Window window2;
                block5: {
                    Window window3;
                    Window window4;
                    int[] nArray;
                    block4: {
                        Container container;
                        block3: {
                            nArray = pb_2.g();
                            if (propertyChangeEvent.getNewValue() != Boolean.TRUE) break block2;
                            container = window2 = FN.L(FJ.V(this.L));
                            if (nArray == null) break block3;
                            if (!FN.u(container)) break block2;
                            container = window2.getParent();
                        }
                        window3 = window4 = container;
                        if (nArray == null) break block4;
                        if (window3 == null) break block2;
                        window3 = window4;
                    }
                    bl = window3 instanceof Window;
                    if (nArray == null) break block5;
                    if (!bl) break block2;
                    window = window4;
                    if (nArray == null) break block6;
                    bl = xk_0.X(window);
                }
                if (bl) break block2;
                window = window2;
            }
            xk_0.Z(window, false);
        }
    }
}

