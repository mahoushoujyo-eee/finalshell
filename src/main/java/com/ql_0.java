/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.W2;
import com.a9;
import com.kp_0;
import com.ne_1;
import com.rz_0;
import com.yb_2;
import java.awt.Component;
import java.awt.Shape;
import javax.swing.JToolTip;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Ql
 */
public class ql_0
extends JToolTip
implements W2,
yb_2 {
    @Override
    public Shape B() {
        return this.M().B();
    }

    public rz_0 M() {
        return (rz_0)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block13: {
            block12: {
                block11: {
                    block14: {
                        var1_1 = rz_0.d();
                        v0 = this;
                        if (var1_1 == 0) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw ql_0.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == 0) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw ql_0.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof rz_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw ql_0.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((rz_0)kp_0.w(a9.zp, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new rz_0());
                        if (var1_1 != 0) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw ql_0.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    public ql_0 u() {
        return (ql_0)FN.A(this);
    }

    public ql_0 A(boolean bl) {
        return (ql_0)FN.O((Component)this, bl);
    }

    @Override
    public boolean h() {
        return FN.k(this);
    }

    @Override
    public ql_0 Q() {
        return (ql_0)FN.u(this);
    }

    public ql_0 i(boolean bl) {
        return (ql_0)FN.D(this, bl);
    }

    @Override
    public boolean K() {
        return FN.U(this);
    }

    public ql_0 v() {
        return (ql_0)FN.C(this);
    }

    public ql_0 G(boolean bl) {
        return (ql_0)FN.q((Component)this, bl);
    }

    @Override
    public boolean l() {
        return FN.G(this);
    }

    public ql_0 Z(boolean bl, boolean bl2) {
        return (ql_0)FN.K(this, bl, bl2);
    }

    public ql_0 c(int n10) {
        return (ql_0)FN.p((Component)this, n10);
    }

    public ql_0 P(int n10) {
        return (ql_0)FN.O((Component)this, n10);
    }

    public ql_0 S(int n10) {
        return (ql_0)FN.K(this, n10);
    }

    @Override
    public int Y() {
        return FN.r(this);
    }

    @Override
    public ql_0 t(int n10, boolean bl, boolean bl2) {
        return (ql_0)FN.d(this, n10, bl, bl2);
    }

    public ql_0 Z(int n10, int n11) {
        return (ql_0)FN.m(this, n10, n11);
    }

    public ql_0 A(String string) {
        return (ql_0)FN.s(this, string);
    }

    @Override
    public String D() {
        return FN.b(this);
    }

    @Override
    public Component N(String string) {
        return this.A(string);
    }

    @Override
    public Component e(int n10, int n11) {
        return this.Z(n10, n11);
    }

    @Override
    public Component t(int n10, boolean bl, boolean bl2) {
        return this.t(n10, bl, bl2);
    }

    @Override
    public Component G(int n10) {
        return this.S(n10);
    }

    @Override
    public Component o(int n10) {
        return this.P(n10);
    }

    @Override
    public Component i(int n10) {
        return this.c(n10);
    }

    @Override
    public Component D(boolean bl, boolean bl2) {
        return this.Z(bl, bl2);
    }

    @Override
    public Component N(boolean bl) {
        return this.G(bl);
    }

    @Override
    public Component Q() {
        return this.v();
    }

    @Override
    public Component u(boolean bl) {
        return this.i(bl);
    }

    @Override
    public Component R() {
        return this.Q();
    }

    @Override
    public Component c(boolean bl) {
        return this.A(bl);
    }

    @Override
    public Component a() {
        return this.u();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

