/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.WC;
import com.ac_0;
import com.ky_2;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ref.WeakReference;

class YD
extends MouseAdapter {
    final WeakReference A;
    final WC b;

    YD(WeakReference weakReference, WC wC) {
        this.A = weakReference;
        this.b = wC;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block6: {
                Component component;
                ky_2[] ky_2Array;
                block4: {
                    Component component2 = (Component)this.A.get();
                    ky_2Array = ac_0.n();
                    component = component2;
                    if (ky_2Array != null) break block4;
                    if (component == null) break block5;
                    component = component2;
                }
                Window window = FN.L(component);
                bl = window.isShowing();
                if (ky_2Array != null) break block6;
                if (!bl) break block5;
                bl = window.isActive();
            }
            if (bl) {
                this.b.u();
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        this.N();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.N();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.N();
    }

    private void N() {
        block3: {
            Component component;
            block2: {
                Component component2 = (Component)this.A.get();
                ky_2[] ky_2Array = ac_0.n();
                component = component2;
                if (ky_2Array != null) break block2;
                if (component == null) break block3;
                this.b.Y();
                component = component2;
            }
            ac_0.y(component);
        }
    }
}

