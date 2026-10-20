/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DE;
import com.cy_1;
import com.on_0;

/*
 * Renamed from com.iZ
 */
public class iz_1
implements on_0 {
    protected on_0 m;

    public iz_1() {
        this(DE.I);
    }

    public iz_1(on_0 on_02) {
        this.m = on_02;
    }

    public on_0 u() {
        return this.m;
    }

    public void q(on_0 on_02) {
        this.m = on_02;
    }

    public boolean s(cy_1 cy_12) {
        return this.m.n(cy_12.D());
    }

    @Override
    public boolean n(Object object) {
        return this.s((cy_1)object);
    }
}

