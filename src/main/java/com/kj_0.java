/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k0_0;
import com.kz_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.TransferHandler;

/*
 * Renamed from com.Kj
 */
class kj_0
extends MouseAdapter {
    public boolean Q;
    final k0_0 Y;

    kj_0(k0_0 k0_02) {
        this.Y = k0_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.Q = true;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block3: {
            kj_0 kj_02;
            block2: {
                String string = kz_2.M();
                kj_02 = this;
                if (string == null) break block2;
                if (!kj_02.Q) break block3;
                kj_02 = this;
            }
            TransferHandler transferHandler = kj_02.Y.getTransferHandler();
            transferHandler.exportAsDrag(this.Y, mouseEvent, transferHandler.getSourceActions(this.Y));
            this.Q = false;
        }
    }
}

