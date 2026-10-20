/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import com.b.R;
import java.io.File;
import javax.swing.ImageIcon;

public class I
extends R {
    final T G;

    protected I(T t2) {
        this.G = t2;
    }

    @Override
    public ImageIcon b() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean accept(File file) {
        String string = T.v();
        boolean bl = this.G.v;
        if (string != null) return bl;
        if (bl) return true;
        bl = file.isHidden();
        if (string != null) return bl;
        if (bl) return false;
        return true;
    }

    @Override
    public boolean n(Object object) {
        return this.accept((File)object);
    }
}

