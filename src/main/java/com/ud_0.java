/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S;
import com.a9;
import com.fm_0;
import com.ft_0;
import com.kp_0;
import com.ky_2;
import com.ne_1;
import com.pt_0;
import com.uE;
import javax.swing.Action;
import javax.swing.Icon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.ud
 */
public class ud_0
extends uE {
    private static final String a;

    public ud_0() {
    }

    public ud_0(boolean bl) {
        super("", bl);
    }

    public ud_0(pt_0 pt_02) {
        this.X(pt_02);
    }

    public ud_0(Icon icon) {
        super(icon);
    }

    public ud_0(Icon icon, boolean bl) {
        super(icon, bl);
    }

    public ud_0(Icon icon, pt_0 pt_02) {
        super(icon);
        this.X(pt_02);
    }

    public ud_0(String string) {
        super(string);
    }

    public ud_0(String string, boolean bl) {
        super(string, bl);
    }

    public ud_0(String string, pt_0 pt_02) {
        super(string);
        this.X(pt_02);
    }

    public ud_0(String string, Icon icon) {
        super(string, icon);
    }

    public ud_0(String string, Icon icon, boolean bl) {
        super(string, icon, bl);
    }

    public ud_0(String string, Icon icon, pt_0 pt_02) {
        super(string, icon);
        this.X(pt_02);
    }

    public ud_0(Action action) {
        super(action);
    }

    @Override
    protected void init(String string, Icon icon) {
        this.model = new S();
        this.setModel(this.model);
        super.init(string, icon);
    }

    public S h() {
        return (S)this.model;
    }

    public boolean F() {
        return this.h().O();
    }

    public void U(boolean bl) {
        this.h().y(bl);
    }

    public pt_0 g() {
        return this.h().y();
    }

    public pt_0 V(pt_0 pt_02) {
        return this.h().Y(pt_02);
    }

    public void X(pt_0 pt_02) {
        this.h().f(pt_02);
    }

    public boolean g() {
        return this.h().isSelected();
    }

    public void u() {
        this.X(pt_0.checked);
    }

    public boolean i() {
        return this.h().X();
    }

    public void s() {
        this.X(pt_0.mixed);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean u() {
        ky_2[] ky_2Array = pt_0.b();
        boolean bl = this.g();
        if (ky_2Array == null) {
            if (bl) return false;
            bl = this.i();
        }
        if (ky_2Array != null) return bl;
        if (bl) return false;
        return true;
    }

    public void n() {
        this.X(pt_0.unchecked);
    }

    public ft_0 R() {
        return (ft_0)this.getUI();
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
                        var1_1 = pt_0.b();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw ud_0.b(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw ud_0.b(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof ft_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw ud_0.b(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((ft_0)kp_0.w(a9.t, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new ft_0());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw ud_0.b(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public String getUIClassID() {
        return a;
    }

    @Override
    public fm_0 M() {
        return this.R();
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u001bprsl4-*Ase{>\u001b zNI".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 60;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 115;
                            break;
                        }
                        case 1: {
                            n17 = 62;
                            break;
                        }
                        case 2: {
                            n17 = 39;
                            break;
                        }
                        case 3: {
                            n17 = 60;
                            break;
                        }
                        case 4: {
                            n17 = 36;
                            break;
                        }
                        case 5: {
                            n17 = 105;
                            break;
                        }
                        default: {
                            n17 = 101;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

