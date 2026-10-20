/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.a9;
import com.i6_0;
import com.kp_0;
import com.ne_1;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JSeparator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.cH
 */
public class ch_1
extends JSeparator {
    private static String f;

    public ch_1() {
    }

    public ch_1(int n10) {
        super(n10);
    }

    public ch_1(boolean bl) {
        this.x(bl);
    }

    public ch_1(int n10, boolean bl) {
        super(n10);
        this.x(bl);
    }

    public ch_1(boolean bl, int n10) {
        super(n10);
        this.f(bl);
    }

    public ch_1(boolean bl, int n10, boolean bl2) {
        super(n10);
        this.f(bl);
        this.x(bl2);
    }

    public ch_1(boolean bl, boolean bl2) {
        this.w(bl);
        this.I(bl2);
    }

    public ch_1(boolean bl, boolean bl2, int n10) {
        super(n10);
        this.w(bl);
        this.I(bl2);
    }

    public ch_1(boolean bl, boolean bl2, int n10, boolean bl3) {
        super(n10);
        this.w(bl);
        this.I(bl2);
        this.x(bl3);
    }

    public Color X() {
        return this.o().K();
    }

    public void k(Color color) {
        this.o().p(color);
    }

    public Color F() {
        return this.o().A();
    }

    public void L(Color color) {
        this.o().k(color);
    }

    public Color e() {
        return this.o().o();
    }

    public void a(Color color) {
        this.o().m(color);
    }

    public Color T() {
        return this.o().P();
    }

    public void u(Color color) {
        this.o().y(color);
    }

    public boolean v() {
        return this.o().X();
    }

    public void x(boolean bl) {
        this.o().Z(bl);
    }

    public void f(boolean bl) {
        this.w(bl);
        this.I(bl);
    }

    public boolean r() {
        return this.o().e();
    }

    public void w(boolean bl) {
        this.o().m(bl);
    }

    public boolean E() {
        return this.o().F();
    }

    public void I(boolean bl) {
        this.o().r(bl);
    }

    public Insets Q() {
        return this.o().Z();
    }

    public void V(Insets insets) {
        this.o().l(insets);
    }

    public ch_1 R(int n10, int n11, int n12, int n13) {
        this.V(new Insets(n10, n11, n12, n13));
        return this;
    }

    public ch_1 j(int n10) {
        return this.R(n10, n10, n10, n10);
    }

    public i6_0 o() {
        return (i6_0)this.getUI();
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
                        var1_1 = ch_1.B();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw ch_1.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw ch_1.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof i6_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw ch_1.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((i6_0)kp_0.w(a9.J, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new i6_0());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw ch_1.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    public static ch_1 T() {
        return new ch_1(0);
    }

    public static ch_1 O() {
        return new ch_1(1);
    }

    public static void n(String string) {
        f = string;
    }

    public static String B() {
        return f;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (ch_1.B() == null) {
            ch_1.n("qMIAT");
        }
    }
}

