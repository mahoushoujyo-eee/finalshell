/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aL;
import com.cz_0;
import com.oq_1;
import com.yt_0;
import java.io.File;
import java.util.List;

/*
 * Renamed from com.Kx
 */
public abstract class kx_0
implements oq_1 {
    private final List w;

    public kx_0() {
        this((List)null);
    }

    public kx_0(String[] stringArray) {
        this(aL.F(stringArray));
    }

    public kx_0(List list) {
        this.w = list;
    }

    public List u() {
        return this.w;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean accept(File file) {
        int n10 = yt_0.C();
        List list = this.w;
        if (n10 != 0) {
            if (list == null) return true;
            list = this.w;
        }
        boolean bl = list.contains(cz_0.G(file.getName(), false));
        if (n10 == 0) return bl;
        if (!bl) return false;
        return true;
    }

    @Override
    public boolean n(Object object) {
        return this.accept((File)object);
    }
}

