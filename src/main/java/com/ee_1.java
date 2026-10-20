/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Renamed from com.eE
 */
public class ee_1
extends e1_0 {
    public void F(JLabel jLabel, String string, G9 g92, Object[] objectArray) {
        jLabel.setText(this.q(g92, objectArray));
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.F((JLabel)jComponent, string, g92, objectArray);
    }
}

