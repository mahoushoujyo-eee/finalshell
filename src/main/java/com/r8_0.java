/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.PG;
import java.awt.Image;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.TransferHandler;

/*
 * Renamed from com.r8
 */
public class r8_0
extends TransferHandler {
    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        return this.M();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean importData(TransferHandler.TransferSupport transferSupport) {
        int n10 = EY.G();
        boolean bl = transferSupport.isDrop();
        if (n10 != 0) {
            if (!bl) return false;
            bl = this.x(transferSupport.getTransferable());
        }
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean x(Transferable transferable) {
        Object object;
        ArrayList<ImageIcon> arrayList;
        int n10;
        block7: {
            List list;
            block6: {
                List list2;
                n10 = EY.G();
                boolean bl = this.M();
                if (n10 == 0) return bl;
                if (!bl) return false;
                arrayList = new ArrayList<ImageIcon>();
                list = list2 = PG.s(transferable);
                if (n10 == 0) break block6;
                if (list == null) break block7;
                list = list2;
            }
            object = list.iterator();
            while (object.hasNext()) {
                File file = (File)object.next();
                arrayList.add(new ImageIcon(file.getAbsolutePath()));
                if (n10 != 0) continue;
            }
        }
        if ((object = PG.T(transferable)) != null) {
            arrayList.add(new ImageIcon((Image)object));
        }
        boolean bl = this.M();
        if (n10 != 0) {
            if (!bl) return false;
            bl = this.h(arrayList);
        }
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    protected boolean M() {
        return true;
    }

    protected boolean h(List list) {
        return true;
    }
}

