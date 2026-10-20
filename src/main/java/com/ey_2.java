/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;

/*
 * Renamed from com.ey
 */
public class ey_2
extends e1_0 {
    public void b(JInternalFrame jInternalFrame, String string, G9 g92, Object[] objectArray) {
        jInternalFrame.setTitle(this.q(g92, objectArray));
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.b((JInternalFrame)jComponent, string, g92, objectArray);
    }
}

