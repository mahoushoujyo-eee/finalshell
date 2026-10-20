/*
 * Decompiled with CFR 0.152.
 */
import org.icmp4j.j;

/*
 * Renamed from Lx
 */
class lx_0
implements Runnable {
    final qt_0 e;
    private final j c;

    lx_0(qt_0 qt_02, j j2) {
        this.e = qt_02;
        this.c = j2;
    }

    @Override
    public void run() {
        dx_1 dx_12;
        block4: {
            block5: {
                j j2;
                block2: {
                    block3: {
                        String[] stringArray = xQ.B();
                        j2 = this.c;
                        if (stringArray == null) break block2;
                        if (j2.r() != -1) break block3;
                        this.c.P(true);
                        this.c.v(false);
                        B0 b0 = new B0(B0.Z);
                        b0.q(this.c);
                        dx_12 = fh_1.P(qt_0.A(this.e));
                        if (stringArray == null) break block4;
                        if (dx_12.F == null) break block5;
                        fh_1.P((fh_1)qt_0.A((qt_0)this.e)).F.a(b0);
                        if (stringArray != null) break block5;
                    }
                    j2 = this.c;
                }
                j2.v(true);
            }
            dx_12 = fh_1.P(qt_0.A(this.e));
        }
        dx_12.P.T(this.c);
    }
}

