/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cb_1;
import com.ky_2;
import com.np_0;
import com.ux_0;
import com.zn_0;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.Nm
 */
class nm_0
implements np_0 {
    final cb_1 J;
    final zn_0 y;

    nm_0(zn_0 zn_02, cb_1 cb_12) {
        this.y = zn_02;
        this.J = cb_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void S(List list) {
        Object object;
        block10: {
            Object object2;
            Object object3;
            block11: {
                object = this.y.f;
                // MONITORENTER : object
                String[] stringArray = cb_1.C();
                this.y.i.put(this.J.H(), list);
                this.y.g(list);
                // MONITOREXIT : object
                object = this.y.Y(this.J, list);
                object3 = this.y.f;
                // MONITORENTER : object3
                this.y.g.put(this.J.H(), true);
                // MONITOREXIT : object3
                object2 = object;
                if (stringArray == null) break block10;
                if (object2 == null) break block11;
                object2 = object;
                if (stringArray == null) break block10;
                if (object2.size() > 0) {
                    this.y.o((List)object, this.J, 0);
                }
            }
            object3 = this.y.K;
            // MONITORENTER : object3
            this.J.Y(ux_0.loaded);
            this.y.nodeChanged(this.J);
            object2 = object3;
        }
        // MONITOREXIT : object2
        this.y.s(this.J, (List)object);
        if (ky_2.F() == null) return;
        cb_1.s(new String[4]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void l(Throwable throwable) {
        Object object = this.y.f;
        synchronized (object) {
            this.y.i.put(this.J.H(), new ArrayList(0));
            this.y.g.put(this.J.H(), true);
        }
        object = this.y.K;
        synchronized (object) {
            this.J.Y(ux_0.failed);
            this.J.o(throwable);
            this.y.nodeChanged(this.J);
        }
        this.y.r(this.J, throwable);
    }
}

