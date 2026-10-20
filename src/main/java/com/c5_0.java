/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.c5
 */
public abstract class c5_0
implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.f(actionEvent, (WC)actionEvent.getSource());
    }

    public abstract void f(ActionEvent var1, WC var2);
}

