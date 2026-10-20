/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.a.y_0;
import com.gm_0;
import com.pk_2;
import java.awt.Dialog;
import java.awt.Frame;
import javax.swing.JRootPane;

class D3
extends y_0 {
    final pk_2 B;

    public D3(pk_2 pk_22, Frame frame, String string, boolean bl) {
        this.B = pk_22;
        super(frame, string, bl);
    }

    public D3(pk_2 pk_22, Dialog dialog, String string, boolean bl) {
        this.B = pk_22;
        super(dialog, string, bl);
    }

    @Override
    protected JRootPane createRootPane() {
        gm_0 gm_02 = new gm_0(this);
        gm_02.setOpaque(true);
        return gm_02;
    }
}

