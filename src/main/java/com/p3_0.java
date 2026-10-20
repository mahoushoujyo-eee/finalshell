/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.at_0;
import com.k__0;
import java.awt.Color;
import java.awt.Component;

/*
 * Renamed from com.p3
 */
public class p3_0
implements k__0 {
    private final BX a;

    public p3_0(BX bX) {
        this.a = bX;
    }

    public BX m() {
        return this.a;
    }

    @Override
    public void k(at_0 at_02) {
        this.a.X(at_02);
    }

    @Override
    public void K(at_0 at_02, Color color, Color color2) {
        this.a.I(at_02);
    }

    @Override
    public void V(at_0 at_02, Component component, Component component2) {
        this.a.r(at_02);
    }
}

