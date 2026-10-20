/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

class BW
implements Runnable {
    final List D;
    final ActionEvent n;
    final WC H;

    BW(WC wC, List list, ActionEvent actionEvent) {
        this.H = wC;
        this.D = list;
        this.n = actionEvent;
    }

    @Override
    public void run() {
        Iterator iterator = this.D.iterator();
        int[] nArray = WC.V();
        while (iterator.hasNext()) {
            ActionListener actionListener = (ActionListener)iterator.next();
            actionListener.actionPerformed(this.n);
            if (nArray == null) continue;
        }
    }
}

