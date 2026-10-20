/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v.RQ;
import org.v.fY;
import org.v.fu_0;
import org.v.nt_0;
import org.v.rq_0;
import org.v.rx_0;

/*
 * Renamed from org.v.Rf
 */
public class rf_0
extends RQ {
    public final fu_0[] b;
    public final nt_0 C;
    public final rq_0 p;
    private static final long a;

    public rf_0(I i2, fu_0[] fu_0Array, nt_0 nt_02, rq_0 rq_02) {
        super(i2);
        this.b = fu_0Array;
        this.C = nt_02;
        this.p = rq_02;
    }

    @Override
    public void e(rx_0 rx_02) {
        this.C.n(rx_02);
        this.p.C(rx_02);
    }

    @Override
    @c
    public Object R(fY fY2) throws Throwable {
        return fY2.K(this);
    }

    public String toString() {
        return RG.o(this.b) + this.C + (char)a + this.p;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6038248351736960168L;
        a = 0x36ABC88246DE9488L ^ l2;
    }
}

