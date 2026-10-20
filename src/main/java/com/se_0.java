/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

/*
 * Renamed from com.Se
 */
public class se_0
extends TransferHandler {
    private Component w;

    public se_0(Component component) {
        this.w = component;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        TransferHandler transferHandler = this.B();
        int n10 = EY.P();
        TransferHandler transferHandler2 = transferHandler;
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
        TransferHandler transferHandler = this.B();
        int n10 = EY.P();
        TransferHandler transferHandler2 = transferHandler;
        if (n10 == 0) {
            if (transferHandler2 == null) return false;
            transferHandler2 = transferHandler;
        }
        boolean bl = transferHandler2.importData(transferSupport);
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    private TransferHandler B() {
        return this.U(this.w.getParent());
    }

    /*
     * Unable to fully structure code
     */
    private TransferHandler U(Container var1_1) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        var2_2 = EY.P();
                        v0 = var1_1;
                        if (var2_2 != 0) break block10;
                        if (v0 == null) break block11;
                        v0 = var1_1;
                        if (var2_2 != 0) break block10;
                        if (v0 instanceof JComponent) {
                            v0 = (JComponent)var1_1;
                            if (var2_2 == 0) {
                                if (v0.getTransferHandler() != null) {
                                    return ((JComponent)var1_1).getTransferHandler();
                                } else {
                                    ** GOTO lbl14
                                }
                            } else {
                                ** GOTO lbl13
                            }
                        }
                        break block11;
lbl13:
                        // 2 sources

                        break block10;
                    }
                    v0 = var1_1;
                }
                if (var2_2 != 0) break block12;
                if (v0 == null) break block13;
                v0 = var1_1.getParent();
            }
            if (v0 != null) {
                return this.U(var1_1.getParent());
            }
        }
        return null;
    }
}

