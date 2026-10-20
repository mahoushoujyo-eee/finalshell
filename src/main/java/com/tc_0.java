/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.R0;
import com.T4;
import com.ku_2;
import com.pc_2;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from com.Tc
 */
public class tc_0
extends T4
implements pc_2 {
    private boolean o = true;
    private String F = null;
    private Insets T = new Insets(1, 1, 1, 1);
    private int i = 0;
    private int p = (int)a;
    private Insets A = new Insets(0, 0, 0, 0);
    private Insets M = new Insets(0, 0, 0, 0);
    private Map J = new HashMap();
    private R0 S = null;
    private static final long a;

    public boolean O() {
        return this.o;
    }

    public void I(boolean bl) {
        this.o = bl;
    }

    public String P() {
        return this.F;
    }

    public void L(String string) {
        this.F = string;
    }

    public Insets B() {
        return this.T;
    }

    public void y(Insets insets) {
        this.T = insets;
    }

    public int F() {
        return this.i;
    }

    public void s(int n10) {
        this.i = n10;
    }

    public int L() {
        return this.p;
    }

    public void L(int n10) {
        this.p = n10;
    }

    public Insets a() {
        return this.A;
    }

    public void e(Insets insets) {
        this.A = insets;
    }

    public Insets M() {
        return this.M;
    }

    public void I(Insets insets) {
        this.M = insets;
    }

    public Map c() {
        return this.J;
    }

    public void x(Map map) {
        this.J = map;
    }

    public R0 l() {
        return this.S;
    }

    @Override
    public void A(Component component, Object object) {
        this.J.put(component, (String)object);
    }

    @Override
    public void F(Component component) {
        this.J.remove(component);
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return new Dimension(0, 0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void layoutContainer(Container var1_1) {
        block70: {
            block69: {
                block68: {
                    block58: {
                        block66: {
                            block57: {
                                block67: {
                                    block64: {
                                        block56: {
                                            block65: {
                                                block62: {
                                                    block55: {
                                                        block63: {
                                                            block59: {
                                                                block60: {
                                                                    block61: {
                                                                        this.S = new R0(this, var1_1);
                                                                        var2_2 = ku_2.H();
                                                                        v0 = this.S.x;
                                                                        if (var2_2 != 0) break block59;
                                                                        if (!v0) break block60;
                                                                        var5_3 = this.S.i.y + this.T.top;
                                                                        var6_4 = this.S.i.x + this.S.L.width + this.T.left;
                                                                        var3_5 = 0;
                                                                        for (Component var8_12 : this.S.u) {
                                                                            var9_18 = var8_12.getPreferredSize();
                                                                            var8_12.setBounds(var6_4 + var3_5, var5_3, var9_18.width, this.S.V.height);
                                                                            var3_5 += var9_18.width + this.i;
                                                                            if (var2_2 == 0) {
                                                                                if (var2_2 == 0) continue;
                                                                            }
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        v1 = this.S.V.width + this.S.L.width + this.S.p.width;
                                                                        if (var2_2 == 0) {
                                                                            ** if (v1 >= this.S.i.width) goto lbl-1000
lbl-1000:
                                                                            // 1 sources

                                                                            {
                                                                                v1 = 1;
                                                                                ** GOTO lbl23
                                                                            }
                                                                        }
                                                                        break block61;
lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            v1 = 0;
                                                                        }
                                                                    }
                                                                    v2 = var7_7 = v1;
                                                                    if (var2_2 != 0) ** GOTO lbl30
                                                                    if (v2 != 0) {
                                                                        v3 = this.S.i.x + this.S.i.width - this.S.p.width - this.T.right;
                                                                    } else {
                                                                        v2 = var3_5;
lbl30:
                                                                        // 2 sources

                                                                        if (var2_2 == 0) {
                                                                            v2 = v2 > 0 ? var6_4 + var3_5 - this.i + this.S.P : var6_4;
                                                                        }
                                                                        v3 = v2 + this.S.C.width - this.T.right;
                                                                    }
                                                                    var8_13 = v3;
                                                                    var3_5 = 0;
                                                                    for (Component var10_19 : this.S.t) {
                                                                        var11_20 = var10_19.getPreferredSize();
                                                                        var10_19.setBounds(var8_13 - (var3_5 += var11_20.width), var5_3, var11_20.width, this.S.V.height);
                                                                        var3_5 += this.i;
                                                                        if (var2_2 == 0) {
                                                                            if (var2_2 == 0) continue;
                                                                        }
                                                                        break block55;
                                                                    }
                                                                }
                                                                v0 = this.S.K;
                                                            }
                                                            if (var2_2 != 0) break block62;
                                                            if (!v0) break block55;
                                                            var5_3 = this.S.i.y + this.S.i.height - this.T.bottom - this.S.f.height;
                                                            var6_4 = this.S.i.x + this.S.L.width + this.T.left;
                                                            var3_5 = 0;
                                                            for (Component var8_14 : this.S.B) {
                                                                var9_18 = var8_14.getPreferredSize();
                                                                var8_14.setBounds(var6_4 + var3_5, var5_3, var9_18.width, this.S.f.height);
                                                                var3_5 += var9_18.width + this.i;
                                                                if (var2_2 == 0) {
                                                                    if (var2_2 == 0) continue;
                                                                }
                                                                ** GOTO lbl-1000
                                                            }
                                                            v4 = this.S.f.width + this.S.L.width + this.S.p.width;
                                                            if (var2_2 == 0) {
                                                                ** if (v4 >= this.S.i.width) goto lbl-1000
lbl-1000:
                                                                // 1 sources

                                                                {
                                                                    v4 = 1;
                                                                    ** GOTO lbl64
                                                                }
                                                            }
                                                            break block63;
lbl-1000:
                                                            // 2 sources

                                                            {
                                                                v4 = 0;
                                                            }
                                                        }
                                                        v5 = var7_7 = v4;
                                                        if (var2_2 != 0) ** GOTO lbl71
                                                        if (v5 != 0) {
                                                            v6 = this.S.i.x + this.S.i.width - this.S.p.width - this.T.right;
                                                        } else {
                                                            v5 = var3_5;
lbl71:
                                                            // 2 sources

                                                            if (var2_2 == 0) {
                                                                v5 = v5 > 0 ? var6_4 + var3_5 - this.i + this.S.P : var6_4;
                                                            }
                                                            v6 = v5 + this.S.J.width - this.T.right;
                                                        }
                                                        var8_13 = v6;
                                                        var3_5 = 0;
                                                        for (Component var10_19 : this.S.Z) {
                                                            var11_20 = var10_19.getPreferredSize();
                                                            var10_19.setBounds(var8_13 - (var3_5 += var11_20.width), var5_3, var11_20.width, this.S.f.height);
                                                            var3_5 += this.i;
                                                            if (var2_2 == 0) {
                                                                if (var2_2 == 0) continue;
                                                            }
                                                            break block56;
                                                        }
                                                    }
                                                    v0 = this.S.Q;
                                                }
                                                if (var2_2 != 0) break block64;
                                                if (!v0) break block56;
                                                var5_3 = this.S.i.x + this.T.left;
                                                var6_4 = this.S.i.y + this.S.q.height + this.T.top;
                                                var4_21 = 0;
                                                for (Component var8_15 : this.S.S) {
                                                    var9_18 = var8_15.getPreferredSize();
                                                    var8_15.setBounds(var5_3, var6_4 + var4_21, this.S.N.width, var9_18.height);
                                                    var4_21 += var9_18.height + this.i;
                                                    if (var2_2 == 0) {
                                                        if (var2_2 == 0) continue;
                                                    }
                                                    ** GOTO lbl-1000
                                                }
                                                v7 = this.S.N.height + this.S.q.height + this.S.c.height;
                                                if (var2_2 == 0) {
                                                    ** if (v7 >= this.S.i.height) goto lbl-1000
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        v7 = 1;
                                                        ** GOTO lbl105
                                                    }
                                                }
                                                break block65;
lbl-1000:
                                                // 2 sources

                                                {
                                                    v7 = 0;
                                                }
                                            }
                                            v8 = var7_7 = v7;
                                            if (var2_2 != 0) ** GOTO lbl112
                                            if (v8 != 0) {
                                                v9 = this.S.i.y + this.S.i.height - this.S.c.height - this.T.bottom;
                                            } else {
                                                v8 = var4_21;
lbl112:
                                                // 2 sources

                                                if (var2_2 == 0) {
                                                    v8 = v8 > 0 ? var6_4 + var4_21 - this.i + this.S.P : var6_4;
                                                }
                                                v9 = v8 + this.S.k.height - this.T.bottom;
                                            }
                                            var8_13 = v9;
                                            var4_21 = 0;
                                            for (Component var10_19 : this.S.a) {
                                                var11_20 = var10_19.getPreferredSize();
                                                var10_19.setBounds(var5_3, var8_13 - (var4_21 += var11_20.height), this.S.N.width, var11_20.height);
                                                var4_21 += this.i;
                                                if (var2_2 == 0) {
                                                    if (var2_2 == 0) continue;
                                                }
                                                break block57;
                                            }
                                        }
                                        v10 = this.S;
                                        if (var2_2 != 0) break block66;
                                        v0 = v10.H;
                                    }
                                    if (!v0) break block57;
                                    var5_3 = this.S.i.x + this.S.i.width - this.T.right - this.S.O.width;
                                    var6_4 = this.S.i.y + this.S.q.height + this.T.top;
                                    var4_21 = 0;
                                    for (Component var8_16 : this.S.o) {
                                        var9_18 = var8_16.getPreferredSize();
                                        var8_16.setBounds(var5_3, var6_4 + var4_21, this.S.O.width, var9_18.height);
                                        var4_21 += var9_18.height + this.i;
                                        if (var2_2 == 0) {
                                            if (var2_2 == 0) continue;
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    v11 = this.S.O.height + this.S.q.height + this.S.c.height;
                                    if (var2_2 == 0) {
                                        ** if (v11 >= this.S.i.height) goto lbl-1000
lbl-1000:
                                        // 1 sources

                                        {
                                            v11 = 1;
                                            ** GOTO lbl147
                                        }
                                    }
                                    break block67;
lbl-1000:
                                    // 2 sources

                                    {
                                        v11 = 0;
                                    }
                                }
                                v12 = var7_11 = v11;
                                if (var2_2 != 0) ** GOTO lbl154
                                if (v12 != 0) {
                                    v13 = this.S.i.y + this.S.i.height - this.S.c.height - this.T.bottom;
                                } else {
                                    v12 = var4_21;
lbl154:
                                    // 2 sources

                                    if (var2_2 == 0) {
                                        v12 = v12 > 0 ? var6_4 + var4_21 - this.i + this.S.P : var6_4;
                                    }
                                    v13 = v12 + this.S.M.height - this.T.bottom;
                                }
                                var8_17 = v13;
                                var4_21 = 0;
                                for (Component var10_19 : this.S.A) {
                                    var11_20 = var10_19.getPreferredSize();
                                    var10_19.setBounds(var5_3, var8_17 - (var4_21 += var11_20.height), this.S.O.width, var11_20.height);
                                    var4_21 += this.i;
                                    if (var2_2 == 0) {
                                        if (var2_2 == 0) continue;
                                    }
                                    break block58;
                                }
                            }
                            v10 = this.S;
                        }
                        v14 = v10.r;
                        if (var2_2 != 0) break block68;
                        if (v14 != null) {
                            this.S.r.setBounds(this.S.m);
                        }
                    }
                    v14 = this.S.n;
                }
                if (var2_2 == 0) {
                    if (v14 != null) {
                        this.S.n.setBounds(this.S.U);
                    }
                    v14 = this.S.R;
                }
                if (var2_2 == 0) {
                    if (v14 != null) {
                        this.S.R.setBounds(this.S.v);
                    }
                    v14 = this.S.y;
                }
                if (var2_2 == 0) {
                    if (v14 != null) {
                        this.S.y.setBounds(this.S.W);
                    }
                    v14 = this.S.Y;
                }
                if (var2_2 != 0) break block69;
                if (v14 == null) break block70;
                v14 = this.S.Y;
            }
            v14.setBounds(this.S.g);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3271341050268768390L;
        a = 0x2A504874586C5892L ^ l2;
    }
}

