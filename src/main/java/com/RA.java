/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.RK;
import com.aL;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

final class RA
extends RK {
    @Override
    public List I() {
        return aL.e(FileSystemView.getFileSystemView().getRoots());
    }
}

