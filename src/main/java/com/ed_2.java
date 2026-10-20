/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import javax.swing.JComponent;
import javax.swing.JProgressBar;

/*
 * Renamed from com.ed
 */
public class ed_2
extends e1_0 {
    public void k(JProgressBar jProgressBar, String string, G9 g92, Object[] objectArray) {
        jProgressBar.setString(this.q(g92, objectArray));
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.k((JProgressBar)jComponent, string, g92, objectArray);
    }
}

