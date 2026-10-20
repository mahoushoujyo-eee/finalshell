/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D7;
import com.PY;
import com.SZ;
import com.a9;
import com.kp_0;
import com.ne_1;
import com.og_2;
import com.ox_2;
import com.sa_0;
import com.xm_0;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JScrollBar;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class R8
extends JScrollBar
implements D7,
sa_0 {
    public R8() {
    }

    public R8(int n10) {
        super(n10);
    }

    public R8(int n10, int n11, int n12, int n13, int n14) {
        super(n10, n11, n12, n13, n14);
    }

    public boolean o() {
        return this.n().t();
    }

    public R8 s(boolean bl) {
        this.n().R(bl);
        return this;
    }

    public boolean b() {
        return this.n().q();
    }

    public R8 L(boolean bl) {
        this.n().Y(bl);
        return this;
    }

    public Insets g() {
        return this.n().Z();
    }

    public R8 W(Insets insets) {
        this.n().i(insets);
        return this;
    }

    public R8 k(int n10, int n11, int n12, int n13) {
        return this.W(new Insets(n10, n11, n12, n13));
    }

    public R8 e(int n10) {
        return this.k(n10, n10, n10, n10);
    }

    public og_2 I() {
        return ox_2.y(this);
    }

    public R8 M(og_2 og_22) {
        ox_2.b(this, og_22);
        return this;
    }

    public og_2 C() {
        return this.n().h();
    }

    public R8 s(og_2 og_22) {
        this.n().r(og_22);
        return this;
    }

    public og_2 o() {
        return this.n().y();
    }

    public R8 p(og_2 og_22) {
        this.n().S(og_22);
        return this;
    }

    @Override
    public String A() {
        return this.n().A();
    }

    @Override
    public void S(String string) {
        this.n().S(string);
    }

    public xm_0 n() {
        return (xm_0)this.getUI();
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
                        var1_1 = SZ.L();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw R8.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw R8.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof xm_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw R8.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((xm_0)kp_0.w(a9.p, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new xm_0());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw R8.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public R8 W(int n10) {
        return (R8)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public R8 a(int n10) {
        return (R8)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public R8 g(int n10) {
        return (R8)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    public R8 z(int n10) {
        return (R8)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    @Override
    public R8 O(int n10) {
        return (R8)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    @Override
    public R8 p(int n10) {
        return (R8)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public R8 t(int n10, int n11) {
        return (R8)PY.O(this, n10, n11);
    }

    @Override
    public Component W(int n10, int n11) {
        return this.t(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.p(n10);
    }

    @Override
    public Component p(int n10) {
        return this.O(n10);
    }

    @Override
    public Component D(int n10) {
        return this.z(n10);
    }

    @Override
    public Component V(int n10) {
        return this.g(n10);
    }

    @Override
    public Component x(int n10) {
        return this.a(n10);
    }

    @Override
    public Component O(int n10) {
        return this.W(n10);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

