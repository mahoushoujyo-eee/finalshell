/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ds_0;
import com.xk_0;
import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.l_
 */
class l__0
extends ComponentAdapter {
    final ds_0 p;

    l__0(ds_0 ds_02) {
        this.p = ds_02;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        block3: {
            ds_0 ds_02;
            block2: {
                int[] nArray = ds_0.U();
                ds_02 = this.p;
                if (nArray != null) break block2;
                if (ds_02.g() == null) break block3;
                ds_02 = this.p;
            }
            Rectangle rectangle = ds_02.getBounds();
            ++rectangle.width;
            ++rectangle.height;
            xk_0.v(this.p, this.p.g().g(this.p.o, rectangle));
        }
    }
}

