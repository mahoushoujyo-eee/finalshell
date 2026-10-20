/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FZ;
import com.ky_2;
import java.util.HashSet;

/*
 * Renamed from com.Iz
 */
public class iz_0 {
    public final Object u;
    public final HashSet f;
    public final HashSet D;

    public iz_0(Object object) {
        this.u = object;
        this.f = new HashSet();
        String[] stringArray = FZ.G();
        this.D = new HashSet();
        if (ky_2.F() != null) {
            FZ.r(new String[3]);
        }
    }

    public iz_0 F(iz_0 iz_02) {
        FZ fZ2 = new FZ(this, iz_02);
        String[] stringArray = FZ.G();
        this.D.add(fZ2);
        iz_02.f.add(fZ2);
        if (stringArray == null) {
            ky_2.K(new String[4]);
        }
        return this;
    }

    public Object P() {
        return this.u;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        String[] stringArray = FZ.G();
        Object object = this.u;
        if (stringArray != null) {
            if (object == null) return null;
            object = this.u;
        }
        String string = object.toString();
        return string;
    }
}

