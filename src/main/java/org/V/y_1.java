/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.R3;
import org.v.fF;
import org.v.fY;
import org.v.rf_0;

/*
 * Renamed from org.v.Y
 */
class y_1
implements fY {
    final fF Q;
    private static final long a;

    y_1(fF fF2) {
        this.Q = fF2;
    }

    @c
    public Void S(rf_0 rf_02) {
        fF.B(this.Q, rf_02.b);
        this.Q.A(rf_02.C);
        this.Q.t.print((char)a);
        fF.c(this.Q, rf_02.p);
        return null;
    }

    @c
    public Void q(R3 r3) {
        this.Q.G(r3.S);
        return null;
    }

    @Override
    @c
    public Object S(R3 r3) throws Throwable {
        return this.q(r3);
    }

    @Override
    @c
    public Object K(rf_0 rf_02) throws Throwable {
        return this.S(rf_02);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 475500105005849965L;
        a = 0xD02F38698188DD4DL ^ l2;
    }
}

