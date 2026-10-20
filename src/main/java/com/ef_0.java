/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kd_1;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

/*
 * Renamed from com.Ef
 */
class ef_0
extends TransferHandler {
    final kd_1 O;

    ef_0(kd_1 kd_12) {
        this.O = kd_12;
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 1;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        return kd_1.E(this.O).getSelectionCount() > 0 ? new StringSelection(kd_1.E(this.O).N().getAbsolutePath()) : null;
    }
}

