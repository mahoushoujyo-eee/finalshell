/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.on_0;
import java.awt.Dimension;
import java.io.File;
import java.io.FileFilter;
import javax.swing.ImageIcon;

/*
 * Renamed from com.oQ
 */
public interface oq_1
extends on_0,
FileFilter {
    @Override
    public boolean accept(File var1);

    public ImageIcon Y(File var1, Dimension var2, boolean var3);

    @Override
    default public boolean n(Object object) {
        return this.accept((File)object);
    }
}

