/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.cz_0;
import java.io.File;
import java.io.FileFilter;
import java.util.List;

class CP
implements FileFilter {
    final List s;
    final boolean u;

    CP(List list, boolean bl) {
        this.s = list;
        this.u = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean accept(File file) {
        String string = FV.D();
        boolean bl = file.isFile();
        if (string == null) {
            if (!bl) return false;
            bl = this.s.contains(cz_0.G(file.getName(), this.u));
        }
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }
}

