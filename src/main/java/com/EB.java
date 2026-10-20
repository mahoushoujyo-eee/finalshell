/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.wq_1;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

class EB
implements Transferable {
    final wq_1 O;

    EB(wq_1 wq_12) {
        this.O = wq_12;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return wq_1.r();
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return dataFlavor.equals(DataFlavor.imageFlavor);
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        block5: {
            EB eB;
            block4: {
                int n10 = EY.P();
                try {
                    try {
                        eB = this;
                        if (n10 != 0) break block4;
                        if (!eB.isDataFlavorSupported(dataFlavor)) break block5;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw EB.a(unsupportedFlavorException);
                    }
                    eB = this;
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw EB.a(unsupportedFlavorException);
                }
            }
            return wq_1.Y(eB.O);
        }
        return null;
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

