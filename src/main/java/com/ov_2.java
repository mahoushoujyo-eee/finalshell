/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YP;
import com.aG;
import com.et_0;
import com.j_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.ov
 */
public class ov_2 {
    private YP Q = YP.r;
    private YP P = YP.r;
    private YP D = null;

    public YP U() {
        return YP.P(this.p());
    }

    @NotNull
    private static YP m(@NotNull YP yP, @NotNull YP yP2) {
        YP yP3;
        boolean bl;
        aG aG2;
        block9: {
            block10: {
                et_0 et_02;
                block7: {
                    block8: {
                        aG2 = yP.n();
                        bl = j_0.g();
                        et_02 = yP.s();
                        if (!bl) break block7;
                        if (et_02 != null) break block8;
                        et_02 = yP2.s();
                        if (!bl) break block7;
                        if (et_02 != null) {
                            aG2.j(yP2.s());
                        }
                    }
                    yP3 = yP;
                    if (!bl) break block9;
                    et_02 = yP3.K();
                }
                if (et_02 != null) break block10;
                yP3 = yP2;
                if (!bl) break block9;
                if (yP3.K() != null) {
                    aG2.c(yP2.K());
                }
            }
            yP3 = yP;
        }
        if (bl) {
            if (yP3 != null) {
                aG2.v(yP.a());
                aG2.H(yP.r());
                aG2.R(yP.w());
            }
            yP3 = aG2.y();
        }
        YP yP4 = yP3;
        return yP4;
    }

    public void L() {
        this.Q = this.P;
        this.D = null;
    }

    public void u(ov_2 ov_22) {
        this.W(ov_22.U());
    }

    public void t(YP yP) {
        this.P = yP;
        this.D = null;
    }

    public et_0 c() {
        return this.R(null);
    }

    public et_0 R(et_0 et_02) {
        boolean bl = j_0.g();
        et_0 et_03 = et_02;
        if (bl) {
            et_03 = et_03 != null ? et_02 : this.P.s();
        }
        return et_03;
    }

    public et_0 A() {
        return this.A(null);
    }

    public et_0 A(et_0 et_02) {
        boolean bl = j_0.g();
        et_0 et_03 = et_02;
        if (bl) {
            et_03 = et_03 != null ? et_02 : this.P.K();
        }
        return et_03;
    }

    public void W(YP yP) {
        this.Q = yP;
        this.D = null;
    }

    private YP p() {
        boolean bl = j_0.g();
        YP yP = this.D;
        if (bl) {
            if (yP == null) {
                this.D = ov_2.m(this.Q, this.P);
            }
            yP = this.D;
        }
        return yP;
    }
}

