/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KE;
import com.a0;
import com.hi_0;
import com.ph_2;
import com.u9;
import com.yn_2;

class DX
implements a0 {
    private final int D;

    public DX(int n10) {
        this.D = n10;
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        return ph_22.n(object2, this.D);
    }

    public boolean a(ph_2 ph_22, Object object, Object object2) {
        return ph_22.I(ph_22, object, this.D, object2);
    }

    public boolean s(ph_2 ph_22, Object object) {
        return ph_22.B(ph_22, object, this.D);
    }

    @Override
    public void Z(ph_2 ph_22, yn_2 yn_22, KE kE) {
        block9: {
            block10: {
                KE kE2;
                boolean bl;
                block8: {
                    u9 u92 = (u9)yn_22.N;
                    String string = hi_0.C();
                    try {
                        try {
                            try {
                                bl = u92.p(this.D);
                                if (string != null) break block8;
                                if (!bl) break block9;
                            }
                            catch (hi_0 hi_02) {
                                throw DX.a(hi_02);
                            }
                            kE2 = kE;
                            if (string != null) break block10;
                        }
                        catch (hi_0 hi_03) {
                            throw DX.a(hi_03);
                        }
                        bl = kE2.o;
                    }
                    catch (hi_0 hi_04) {
                        throw DX.a(hi_04);
                    }
                }
                if (!bl) break block9;
                kE2 = kE;
            }
            kE2.t = yn_22.M();
        }
    }

    static int n(DX dX) {
        return dX.D;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

