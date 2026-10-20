/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.on_0;
import java.io.File;
import java.io.FileFilter;

/*
 * Renamed from com.Eq
 */
class eq_0
implements FileFilter {
    final on_0 t;

    eq_0(on_0 on_02) {
        this.t = on_02;
    }

    @Override
    public boolean accept(File file) {
        return this.t.n(file);
    }
}

