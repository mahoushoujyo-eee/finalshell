/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.a9;
import com.au_0;
import com.c.d_0;
import com.c.r_0;
import com.i2_0;
import com.kp_0;
import com.ld_2;
import com.ne_1;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;

/*
 * Renamed from com.c.j
 */
public class j_1
extends JInternalFrame
implements au_0 {
    public j_1() {
    }

    public j_1(String string) {
        super(string);
    }

    public j_1(String string, boolean bl) {
        super(string, bl);
    }

    public j_1(String string, boolean bl, boolean bl2) {
        super(string, bl, bl2);
    }

    public j_1(String string, boolean bl, boolean bl2, boolean bl3) {
        super(string, bl, bl2, bl3);
    }

    public j_1(String string, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        super(string, bl, bl2, bl3, bl4);
    }

    public r_0 Z() {
        return (r_0)this.getUI();
    }

    @Override
    public void setIcon(boolean bl) {
        try {
            super.setIcon(bl);
        }
        catch (PropertyVetoException propertyVetoException) {
            ne_1.g(this, propertyVetoException);
        }
    }

    public void t() {
        try {
            this.setClosed(true);
        }
        catch (PropertyVetoException propertyVetoException) {
            ne_1.g(this, propertyVetoException);
        }
    }

    public void q() {
        try {
            this.setClosed(false);
            this.setVisible(true);
        }
        catch (PropertyVetoException propertyVetoException) {
            ne_1.g(this, propertyVetoException);
        }
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
                        var1_1 = d_0.W();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw j_1.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw j_1.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof r_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw j_1.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((r_0)kp_0.w(a9.zh, new Object[]{this}));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new r_0(this));
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw j_1.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
        this.invalidate();
    }

    @Override
    public void u(String string, Object[] objectArray) {
        i2_0.n(this, string, objectArray);
    }

    @Override
    public void F(Object[] objectArray) {
        i2_0.U(this, objectArray);
    }

    @Override
    public void N(String string, Object[] objectArray) {
        i2_0.q(this, string, objectArray);
    }

    @Override
    public void M() {
        i2_0.L(this);
    }

    @Override
    public boolean k() {
        return i2_0.Z(this);
    }

    @Override
    public void M(ld_2 ld_22) {
        i2_0.g(this, ld_22);
    }

    @Override
    public void i() {
        i2_0.o(this);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

