/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O_;
import com.a9;
import com.i1_0;
import com.i9_0;
import com.kp_0;
import com.ne_1;
import com.oj_0;
import javax.swing.Icon;

public class O6
extends O_ {
    private static final String a;

    public O6() {
        this(false);
    }

    public O6(boolean bl) {
        this.U(bl);
    }

    public O6(Icon icon) {
        this(icon, false);
    }

    public O6(Icon icon, boolean bl) {
        super(icon);
        this.U(bl);
    }

    public O6(Icon icon, int n10) {
        this(icon, n10, false);
    }

    public O6(Icon icon, int n10, boolean bl) {
        super(icon, n10);
        this.U(bl);
    }

    public O6(String string) {
        this(string, false);
    }

    public O6(String string, boolean bl) {
        super(string);
        this.U(bl);
    }

    public O6(String string, int n10) {
        this(string, n10, false);
    }

    public O6(String string, int n10, boolean bl) {
        super(string, n10, new Object[0]);
        this.U(bl);
    }

    public O6(String string, Icon icon, int n10) {
        this(string, icon, n10, false);
    }

    public O6(String string, Icon icon, int n10, boolean bl) {
        super(string, icon, n10, new Object[0]);
        this.U(bl);
    }

    public boolean E() {
        return this.w().g();
    }

    public void U(boolean bl) {
        this.w().h(bl);
    }

    public i9_0 w() {
        return (i9_0)this.getUI();
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
                        var1_1 = oj_0.g();
                        v0 = this;
                        if (!var1_1) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw O6.b(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (!var1_1) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw O6.b(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof i9_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw O6.b(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((i9_0)kp_0.w(a9.zd, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new i9_0());
                        if (var1_1) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw O6.b(v5);
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
    public i1_0 R() {
        return this.w();
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
                char[] cArray3 = "+{R\u0014\u0013M]\u0011RA\u0002\u001fBi4".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 9;
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
                            n17 = 116;
                            break;
                        }
                        case 1: {
                            n17 = 23;
                            break;
                        }
                        case 2: {
                            n17 = 41;
                            break;
                        }
                        case 3: {
                            n17 = 105;
                            break;
                        }
                        case 4: {
                            n17 = 115;
                            break;
                        }
                        case 5: {
                            n17 = 39;
                            break;
                        }
                        default: {
                            n17 = 53;
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

