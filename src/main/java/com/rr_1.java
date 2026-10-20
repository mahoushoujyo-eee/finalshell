/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IG;
import com.x_0;
import com.zB;
import com.zY;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.Callable;

/*
 * Renamed from com.rR
 */
class rr_1
implements Callable {
    final IG x;

    rr_1(IG iG) {
        this.x = iG;
    }

    public Void k() {
        IG.q(this.x).k(Timestamp.class, zB.p);
        IG.q(this.x).k(java.sql.Date.class, zB.H);
        IG.q(this.x).k(Time.class, x_0.l);
        IG.q(this.x).k(Date.class, zY.f);
        return null;
    }

    public Object call() throws Exception {
        return this.k();
    }
}

