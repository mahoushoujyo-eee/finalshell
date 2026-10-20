/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ac_0;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseWheelEvent;

/*
 * Renamed from com.Gt
 */
class gt_0
implements AWTEventListener {
    gt_0() {
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        if (aWTEvent instanceof MouseWheelEvent) {
            ac_0.q();
        }
    }
}

