/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.ux_0;
import com.zn_0;
import java.util.List;

class DY
implements Runnable {
    final List T;
    final List w;
    final cb_1 x;
    final zn_0 t;

    DY(zn_0 zn_02, List list, List list2, cb_1 cb_12) {
        this.t = zn_02;
        this.T = list;
        this.w = list2;
        this.x = cb_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Object object;
        block7: {
            block8: {
                String[] stringArray = cb_1.C();
                object = this.T;
                if (stringArray == null) break block7;
                if (object == null) break block8;
                object = this.T;
                if (stringArray == null) break block7;
                if (object.size() > 0) {
                    this.t.N(this.w, false);
                    this.t.o(this.T, this.x, 0);
                }
            }
            object = this.t.K;
        }
        List list = object;
        synchronized (object) {
            this.x.Y(ux_0.loaded);
            this.t.nodeChanged(this.x);
            // ** MonitorExit[var2_2] (shouldn't be in output)
            this.t.s(this.x, this.T);
            return;
        }
    }
}

