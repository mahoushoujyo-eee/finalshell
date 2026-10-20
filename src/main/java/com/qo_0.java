/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.ac_0;
import com.ky_2;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

/*
 * Renamed from com.Qo
 */
class qo_0
implements ActionListener {
    final WeakReference S;

    qo_0(WeakReference weakReference) {
        this.S = weakReference;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            Window window;
            ky_2[] ky_2Array;
            Component component;
            block6: {
                Window window2;
                Component component2;
                block4: {
                    component = (Component)this.S.get();
                    ky_2Array = ac_0.n();
                    component2 = component;
                    if (ky_2Array != null) break block4;
                    if (component2 == null) break block5;
                    component2 = component;
                }
                window = window2 = FN.L(component2);
                if (ky_2Array != null) break block6;
                if (window == null) break block5;
                window = window2;
            }
            boolean bl = window.isActive();
            if (ky_2Array == null && bl) {
                bl = ac_0.z(component, false);
            }
        }
    }
}

