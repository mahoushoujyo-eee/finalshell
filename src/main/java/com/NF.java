/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BT;
import com.BZ;
import com.FN;
import com.np_0;
import com.um_0;
import java.util.ArrayList;
import java.util.List;

class NF
implements np_0 {
    final um_0 C;

    NF(um_0 um_02) {
        this.C = um_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void S(List list) {
        Object object = this.C.c.f;
        synchronized (object) {
            this.C.c.i.put(this.C.o.H(), list);
            this.C.c.g(list);
        }
        object = this.C.c.Y(this.C.o, list);
        Object object2 = this.C.c.f;
        synchronized (object2) {
            this.C.c.g.put(this.C.o.H(), true);
        }
        FN.p(new BZ(this, (List)object));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void l(Throwable throwable) {
        Object object = this.C.c.f;
        synchronized (object) {
            this.C.c.i.put(this.C.o.H(), new ArrayList(0));
            this.C.c.g.put(this.C.o.H(), true);
        }
        FN.p(new BT(this, throwable));
    }
}

