/*
 * Decompiled with CFR 0.152.
 */
package com.U;

import com.U.y;
import com.a9;
import com.kp_0;
import com.ne_1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.ComponentListener;
import javax.swing.JSplitPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends JSplitPane {
    private static boolean X;

    public O() {
    }

    public O(int n10) {
        super(n10);
    }

    public O(int n10, boolean bl) {
        super(n10, bl);
    }

    public O(int n10, Component component, Component component2) {
        super(n10, component, component2);
    }

    public O(int n10, boolean bl, Component component, Component component2) {
        super(n10, bl, component, component2);
    }

    public void r(ComponentListener componentListener) {
        this.Q().getDivider().addComponentListener(componentListener);
    }

    public void I(ComponentListener componentListener) {
        this.Q().getDivider().removeComponentListener(componentListener);
    }

    public Insets v() {
        return this.Q().K();
    }

    public void v(Insets insets) {
        this.Q().N(insets);
    }

    public O I(int n10, int n11, int n12, int n13) {
        this.v(new Insets(n10, n11, n12, n13));
        return this;
    }

    public O h(int n10) {
        return this.I(n10, n10, n10, n10);
    }

    public Color B() {
        return this.Q().B();
    }

    public O I(Color color) {
        this.Q().z(color);
        return this;
    }

    public boolean z() {
        return this.Q().O();
    }

    public O q(boolean bl) {
        this.Q().b(bl);
        return this;
    }

    public Color r() {
        return this.Q().I();
    }

    public O l(Color color) {
        this.Q().m(color);
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public double S() {
        var1_1 = O.r();
        v0 = this;
        if (!var1_1) ** GOTO lbl8
        if (v0.getOrientation() == 1) {
            v1 = this.getWidth();
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.getHeight();
        }
        var2_2 = v1;
        return Math.max(0.0, Math.min((double)this.getDividerLocation() / (double)(var2_2 - this.getDividerSize()), 1.0));
    }

    public y Q() {
        return (y)this.getUI();
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
                        var1_1 = O.U();
                        v0 = this;
                        if (var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw O.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw O.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof y)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw O.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((y)kp_0.w(a9.N, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new y());
                        if (!var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw O.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
        this.revalidate();
    }

    public static void o(boolean bl) {
        X = bl;
    }

    public static boolean r() {
        return X;
    }

    public static boolean U() {
        boolean bl = O.r();
        return !bl;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (O.U()) {
            O.o(true);
        }
    }
}

