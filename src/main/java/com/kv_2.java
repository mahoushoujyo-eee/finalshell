/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E_;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Renamed from com.kv
 */
class kv_2
extends WindowAdapter {
    final E_ k;

    kv_2(E_ e_) {
        this.k = e_;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        this.k.a(windowEvent);
    }
}

