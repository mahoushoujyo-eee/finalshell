/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.yz_0;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.Serializable;
import java.util.List;

/*
 * Renamed from com.wq
 */
public class wq_2
implements Transferable,
Serializable {
    protected final List j;
    final yz_0 n;

    public wq_2(yz_0 yz_02, List list) {
        this.n = yz_02;
        this.j = list;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        wq_2 wq_22;
        block4: {
            block5: {
                String[] stringArray = cb_1.C();
                try {
                    try {
                        wq_22 = this;
                        if (stringArray == null) break block4;
                        if (wq_22.isDataFlavorSupported(dataFlavor)) break block5;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw wq_2.a(unsupportedFlavorException);
                    }
                    throw new UnsupportedFlavorException(dataFlavor);
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw wq_2.a(unsupportedFlavorException);
                }
            }
            wq_22 = this;
        }
        return wq_22.j;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return this.n.e;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return this.n.q.equals(dataFlavor);
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

