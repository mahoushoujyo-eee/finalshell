/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.il_1;
import com.pa_1;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.ly
 */
class ly_2
implements ChangeListener {
    final il_1 b;
    final pa_1 F;

    ly_2(pa_1 pa_12, il_1 il_12) {
        this.F = pa_12;
        this.b = il_12;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        pa_1.y(this.F).removeChangeListener(this);
        pa_1.T(this.F).q(this.b);
    }
}

