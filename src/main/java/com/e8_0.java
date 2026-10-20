/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

/*
 * Renamed from com.e8
 */
public class e8_0
extends e1_0 {
    public void M(JTextComponent jTextComponent, String string, G9 g92, Object[] objectArray) {
        String string2 = this.q(g92, objectArray);
        if (string2 != null) {
            jTextComponent.setText(string2);
        }
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.M((JTextComponent)jComponent, string, g92, objectArray);
    }
}

