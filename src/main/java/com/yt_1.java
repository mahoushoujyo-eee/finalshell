/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ds_0;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

/*
 * Renamed from com.yT
 */
class yt_1
implements WindowFocusListener {
    final ds_0 F;

    yt_1(ds_0 ds_02) {
        this.F = ds_02;
    }

    @Override
    public void windowGainedFocus(WindowEvent windowEvent) {
        this.F.P(true);
    }

    @Override
    public void windowLostFocus(WindowEvent windowEvent) {
        this.F.P(false);
    }
}

