/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nx_2;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Renamed from com.nU
 */
class nu_1
extends ComponentAdapter {
    final nx_2 k;

    nu_1(nx_2 nx_22) {
        this.k = nx_22;
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        block3: {
            nx_2 nx_22;
            block2: {
                int n10 = nx_2.c();
                nx_22 = this.k;
                if (n10 == 0) break block2;
                if (!nx_22.S.isShowing()) break block3;
                nx_22 = this.k;
            }
            nx_22.y();
        }
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        block3: {
            nx_2 nx_22;
            block2: {
                int n10 = nx_2.c();
                nx_22 = this.k;
                if (n10 == 0) break block2;
                if (!nx_22.S.isShowing()) break block3;
                nx_22 = this.k;
            }
            nx_22.y();
        }
    }
}

