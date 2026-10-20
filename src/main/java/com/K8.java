/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class K8
extends WindowAdapter {
    final Frame L;
    final Frame N;

    K8(Frame frame, Frame frame2) {
        this.L = frame;
        this.N = frame2;
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        block4: {
            Frame frame;
            block2: {
                block3: {
                    String string = FV.D();
                    frame = this.L;
                    if (string != null) break block2;
                    if (!frame.isShowing()) break block3;
                    this.L.setExtendedState(0);
                    this.L.toFront();
                    if (string == null) break block4;
                }
                frame = this.N;
            }
            frame.removeWindowListener(this);
        }
    }
}

