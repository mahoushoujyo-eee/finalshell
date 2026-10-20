/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YO;
import com.kh_2;

/*
 * Renamed from com.Ys
 */
class ys_0
extends YO {
    final kh_2 C;

    ys_0(kh_2 kh_22) {
        this.C = kh_22;
    }

    @Override
    public void T() {
        this.C.repaint();
        this.C.revalidate();
    }
}

