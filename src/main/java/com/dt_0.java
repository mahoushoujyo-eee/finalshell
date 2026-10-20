/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.b.b;
import java.io.File;
import java.io.FileFilter;
import javax.swing.ImageIcon;

/*
 * Renamed from com.Dt
 */
class dt_0
extends b {
    final FileFilter x;

    dt_0(ImageIcon imageIcon, String string, FileFilter fileFilter) {
        this.x = fileFilter;
        super(imageIcon, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean accept(File file) {
        String string = FV.D();
        FileFilter fileFilter = this.x;
        if (string == null) {
            if (fileFilter == null) return true;
            fileFilter = this.x;
        }
        boolean bl = fileFilter.accept(file);
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public boolean n(Object object) {
        return this.accept((File)object);
    }
}

