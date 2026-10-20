/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.b.b;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileFilter;

class DZ
extends b {
    final FileFilter r;

    DZ(ImageIcon imageIcon, String string, FileFilter fileFilter) {
        this.r = fileFilter;
        super(imageIcon, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean accept(File file) {
        String string = FV.D();
        FileFilter fileFilter = this.r;
        if (string == null) {
            if (fileFilter == null) return true;
            fileFilter = this.r;
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

