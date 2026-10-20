/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.PG;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

/*
 * Renamed from com.Oz
 */
public class oz_0
extends TransferHandler {
    private JComponent X;

    public oz_0() {
        this.X = null;
    }

    public oz_0(JComponent jComponent) {
        this.X = jComponent;
    }

    public JComponent Z() {
        return this.X;
    }

    public void Z(JComponent jComponent) {
        this.X = jComponent;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        TransferHandler transferHandler;
        int n10 = EY.P();
        JComponent jComponent = this.X;
        if (n10 == 0) {
            if (jComponent == null) return PG.q(transferSupport);
            jComponent = this.X;
        }
        TransferHandler transferHandler2 = transferHandler = jComponent.getTransferHandler();
        if (n10 == 0) {
            if (transferHandler2 == null) return false;
            transferHandler2 = transferHandler;
        }
        boolean bl = transferHandler2.canImport(transferSupport);
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean importData(TransferHandler.TransferSupport transferSupport) {
        TransferHandler transferHandler;
        int n10 = EY.G();
        JComponent jComponent = this.X;
        if (n10 != 0) {
            if (jComponent == null) return PG.u(transferSupport);
            jComponent = this.X;
        }
        TransferHandler transferHandler2 = transferHandler = jComponent.getTransferHandler();
        if (n10 != 0) {
            if (transferHandler2 == null) return false;
            transferHandler2 = transferHandler;
        }
        boolean bl = transferHandler2.importData(transferSupport);
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }
}

