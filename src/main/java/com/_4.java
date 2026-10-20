/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PG;
import com.ky_2;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.v.NV;

public class _4
implements Transferable {
    public static final DataFlavor[] U = new DataFlavor[]{DataFlavor.javaFileListFlavor, PG.v()};
    protected final List o;

    public _4(File file) {
        this(Arrays.asList(file));
        int n10 = NV.V();
        if (ky_2.F() != null) {
            NV.g(++n10);
        }
    }

    public _4(List list) {
        this.o = list;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return U;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        boolean bl;
        block4: {
            DataFlavor[] dataFlavorArray = U;
            int n10 = dataFlavorArray.length;
            int n11 = 0;
            int n12 = NV.b();
            while (n11 < n10) {
                DataFlavor dataFlavor2 = dataFlavorArray[n11];
                if (n12 == 0) {
                    bl = dataFlavor2.equals(dataFlavor);
                    if (n12 != 0) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n11;
                }
                if (n12 == 0) continue;
                ky_2.K(new String[1]);
                break;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException, IOException {
        boolean bl;
        block7: {
            block8: {
                int n10 = NV.V();
                try {
                    try {
                        bl = DataFlavor.javaFileListFlavor.equals(dataFlavor);
                        if (n10 == 0) break block7;
                        if (!bl) break block8;
                    }
                    catch (UnsupportedFlavorException unsupportedFlavorException) {
                        throw _4.a(unsupportedFlavorException);
                    }
                    return this.o;
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw _4.a(unsupportedFlavorException);
                }
            }
            bl = PG.v().equals(dataFlavor);
        }
        try {
            if (bl) {
                return PG.p(this.o);
            }
        }
        catch (UnsupportedFlavorException unsupportedFlavorException) {
            throw _4.a(unsupportedFlavorException);
        }
        return null;
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }
}

