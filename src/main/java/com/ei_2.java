/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.G9;
import com.e1_0;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JRootPane;

/*
 * Renamed from com.ei
 */
public class ei_2
extends e1_0 {
    public void p(JRootPane jRootPane, String string, G9 g92, Object[] objectArray) {
        block4: {
            Window window;
            block5: {
                boolean bl;
                Window window2;
                block2: {
                    String[] stringArray;
                    block3: {
                        window2 = FV.L(jRootPane);
                        stringArray = e1_0.A();
                        bl = window2 instanceof Frame;
                        if (stringArray == null) break block2;
                        if (!bl) break block3;
                        ((Frame)window2).setTitle(this.q(g92, objectArray));
                        if (stringArray != null) break block4;
                    }
                    window = window2;
                    if (stringArray == null) break block5;
                    bl = window instanceof Dialog;
                }
                if (!bl) break block4;
                window = window2;
            }
            ((Dialog)window).setTitle(this.q(g92, objectArray));
        }
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.p((JRootPane)jComponent, string, g92, objectArray);
    }
}

