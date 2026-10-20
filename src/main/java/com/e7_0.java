/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

/*
 * Renamed from com.e7
 */
public class e7_0
extends e1_0 {
    public void t(JFileChooser jFileChooser, String string, G9 g92, Object[] objectArray) {
        jFileChooser.setDialogTitle(this.q(g92, objectArray));
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.t((JFileChooser)jComponent, string, g92, objectArray);
    }
}

