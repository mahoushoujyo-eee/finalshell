/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NF;
import com.cb_1;
import com.ux_0;
import java.util.List;

class BZ
implements Runnable {
    final List e;
    final NF V;

    BZ(NF nF2, List list) {
        this.V = nF2;
        this.e = list;
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
                object = this.e;
                if (stringArray == null) break block7;
                if (object == null) break block8;
                object = this.e;
                if (stringArray == null) break block7;
                if (object.size() > 0) {
                    this.V.C.c.o(this.e, this.V.C.o, 0);
                }
            }
            object = this.V.C.c.K;
        }
        List list = object;
        synchronized (object) {
            this.V.C.o.Y(ux_0.loaded);
            this.V.C.c.nodeChanged(this.V.C.o);
            // ** MonitorExit[var2_2] (shouldn't be in output)
            this.V.C.c.s(this.V.C.o, this.e);
            return;
        }
    }
}

