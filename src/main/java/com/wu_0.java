/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XE;
import com._y_0;
import com.a7;
import com.c;
import com.ox_1;
import com.pa_1;
import com.ru_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.Wu
 */
class wu_0
extends MouseAdapter {
    final pa_1 O;

    wu_0(pa_1 pa_12) {
        this.O = pa_12;
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        int n10 = _y_0.M();
        ox_1 ox_12 = pa_1.c(this.O);
        if (n10 != 0 && ox_12 != null) {
            pa_1.c(this.O).a();
            ox_12 = pa_1.M(this.O, null);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mousePressed(MouseEvent var1_1) {
        block69: {
            block72: {
                block73: {
                    block70: {
                        block71: {
                            block67: {
                                block68: {
                                    block66: {
                                        block52: {
                                            block63: {
                                                block65: {
                                                    block64: {
                                                        block53: {
                                                            block55: {
                                                                block54: {
                                                                    block57: {
                                                                        block62: {
                                                                            block44: {
                                                                                block43: {
                                                                                    block58: {
                                                                                        block59: {
                                                                                            block61: {
                                                                                                block60: {
                                                                                                    block56: {
                                                                                                        block51: {
                                                                                                            block50: {
                                                                                                                block48: {
                                                                                                                    block49: {
                                                                                                                        block46: {
                                                                                                                            block47: {
                                                                                                                                block45: {
                                                                                                                                    var2_2 = _y_0.M();
                                                                                                                                    v0 = var1_1.getButton();
                                                                                                                                    v1 = 1;
                                                                                                                                    if (var2_2 == 0) break block45;
                                                                                                                                    if (v0 == v1) {
                                                                                                                                        this.O.x();
                                                                                                                                    }
                                                                                                                                    v2 = this.O;
                                                                                                                                    if (var2_2 == 0) break block46;
                                                                                                                                    v2.M = System.currentTimeMillis();
                                                                                                                                    v0 = var1_1.getButton();
                                                                                                                                    v1 = 1;
                                                                                                                                }
                                                                                                                                if (v0 != v1) break block47;
                                                                                                                                this.O.A = true;
                                                                                                                                v3 = var1_1.getClickCount();
                                                                                                                                if (var2_2 == 0) break block48;
                                                                                                                                if (v3 != 1) break block49;
                                                                                                                                pa_1.f(this.O, pa_1.x(this.O, var1_1.getPoint()));
                                                                                                                                this.O.V();
                                                                                                                                this.O.repaint();
                                                                                                                                if (var2_2 != 0) break block49;
                                                                                                                            }
                                                                                                                            v2 = this.O;
                                                                                                                        }
                                                                                                                        v2.A = false;
                                                                                                                    }
                                                                                                                    v3 = -1;
                                                                                                                }
                                                                                                                var3_3 = v3;
                                                                                                                this.O.requestFocusInWindow();
                                                                                                                v4 = this.O;
                                                                                                                v5 = var1_1;
                                                                                                                if (var2_2 == 0) ** GOTO lbl39
                                                                                                                if (pa_1.D(v4, v5)) {
                                                                                                                    v4 = this.O;
                                                                                                                    v5 = var1_1;
lbl39:
                                                                                                                    // 2 sources

                                                                                                                    v6 = pa_1.C(v4, v5.getPoint());
                                                                                                                } else {
                                                                                                                    v6 = null;
                                                                                                                }
                                                                                                                v7 = var4_4 = v6;
                                                                                                                if (var2_2 == 0) break block50;
                                                                                                                if (v7 == null) break block51;
                                                                                                                v7 = var4_4;
                                                                                                            }
                                                                                                            v7.g().v();
                                                                                                            if (var2_2 != 0) break block52;
                                                                                                        }
                                                                                                        v8 = var1_1.getButton();
                                                                                                        v9 = 1;
                                                                                                        if (var2_2 == 0) break block53;
                                                                                                        if (v8 != v9) break block54;
                                                                                                        v8 = (int)this.O.m(var1_1);
                                                                                                        if (var2_2 == 0) break block55;
                                                                                                        if (v8 == 0) break block54;
                                                                                                        v10 = var5_5 = var1_1.getClickCount();
                                                                                                        v11 = 1;
                                                                                                        if (var2_2 == 0) break block56;
                                                                                                        if (v10 == v11) break block57;
                                                                                                        v10 = var5_5;
                                                                                                        v11 = 2;
                                                                                                    }
                                                                                                    if (var2_2 == 0) break block58;
                                                                                                    if (v10 != v11) break block59;
                                                                                                    var6_7 = pa_1.x(this.O, var1_1.getPoint());
                                                                                                    var7_8 = a7.t(var6_7, pa_1.T(this.O));
                                                                                                    var8_10 = a7.l(var6_7, pa_1.T(this.O));
                                                                                                    pa_1.t(this.O, new ru_1(var7_8));
                                                                                                    pa_1.e(this.O).m(var8_10);
                                                                                                    v12 = this.O;
                                                                                                    if (var2_2 == 0) break block60;
                                                                                                    if (!pa_1.S(v12).V()) break block61;
                                                                                                    v12 = this.O;
                                                                                                }
                                                                                                pa_1.O(v12);
                                                                                            }
                                                                                            if (var2_2 != 0) break block57;
                                                                                        }
                                                                                        v10 = var5_5;
                                                                                        v11 = 3;
                                                                                    }
                                                                                    if (v10 != v11) break block57;
                                                                                    var6_7 = pa_1.x(this.O, var1_1.getPoint());
                                                                                    for (var7_9 = var6_7.r; var7_9 > -this.O.k().b(); --var7_9) {
                                                                                        v13 = (int)pa_1.T(this.O).D(var7_9 - 1).G();
                                                                                        if (var2_2 != 0 && var2_2 != 0) {
                                                                                            if (v13 == 0) break;
                                                                                            if (var2_2 != 0) continue;
                                                                                        }
                                                                                        break block43;
                                                                                    }
                                                                                    v13 = var8_11 = var6_7.r;
                                                                                }
                                                                                while (var8_11 < pa_1.T(this.O).O()) {
                                                                                    v14 = pa_1.T(this.O).D(var8_11).G();
                                                                                    if (var2_2 != 0 && var2_2 != 0) {
                                                                                        if (!v14) break;
                                                                                        ++var8_11;
                                                                                        if (var2_2 != 0) continue;
                                                                                    }
                                                                                    break block44;
                                                                                }
                                                                                pa_1.t(this.O, new ru_1(new XE(0, var7_9)));
                                                                                pa_1.e(this.O).m(new XE(this.O.N.R(), var8_11));
                                                                                v15 = this.O;
                                                                                if (var2_2 == 0) break block62;
                                                                                v14 = pa_1.S(v15).V();
                                                                            }
                                                                            if (!v14) break block57;
                                                                            v15 = this.O;
                                                                        }
                                                                        pa_1.O(v15);
                                                                    }
                                                                    if (var2_2 != 0) break block52;
                                                                }
                                                                v8 = var1_1.getButton();
                                                            }
                                                            v9 = 2;
                                                        }
                                                        if (var2_2 == 0) break block63;
                                                        if (v8 != v9) break block64;
                                                        v8 = (int)pa_1.S(this.O).x();
                                                        if (var2_2 == 0) break block65;
                                                        if (v8 == 0) break block64;
                                                        v8 = (int)this.O.m(var1_1);
                                                        if (var2_2 == 0) break block65;
                                                        if (v8 == 0) break block64;
                                                        try {
                                                            v16 = yt_1.i();
                                                        }
                                                        catch (InvocationTargetException v17) {
                                                            throw v17.getTargetException();
                                                        }
                                                        try {
                                                            v18 = v16.h();
                                                        }
                                                        catch (InvocationTargetException v19) {
                                                            throw v19.getTargetException();
                                                        }
                                                        try {
                                                            v20 = (Integer)v18.T();
                                                        }
                                                        catch (InvocationTargetException v21) {
                                                            throw v21.getTargetException();
                                                        }
                                                        var3_3 = v20;
                                                        if (var2_2 != 0) break block52;
                                                    }
                                                    v8 = var1_1.getButton();
                                                }
                                                v9 = 3;
                                            }
                                            if (var2_2 == 0) break block66;
                                            if (v8 == v9) {
                                                var5_6 = pa_1.C(this.O, var1_1.getPoint());
                                                try {
                                                    v22 = yt_1.i();
                                                }
                                                catch (InvocationTargetException v23) {
                                                    throw v23.getTargetException();
                                                }
                                                try {
                                                    v24 = v22.h();
                                                }
                                                catch (InvocationTargetException v25) {
                                                    throw v25.getTargetException();
                                                }
                                                try {
                                                    v26 = (Integer)v24.H();
                                                }
                                                catch (InvocationTargetException v27) {
                                                    throw v27.getTargetException();
                                                }
                                                var3_3 = v26;
                                            }
                                        }
                                        v8 = var3_3;
                                        v9 = US.S;
                                    }
                                    if (var2_2 == 0) break block67;
                                    if (v8 != v9) break block68;
                                    this.O.A(false);
                                    if (var2_2 != 0) break block69;
                                }
                                v8 = var3_3;
                                v9 = US.v;
                            }
                            if (var2_2 == 0) break block70;
                            if (v8 != v9) break block71;
                            this.O.r();
                            if (var2_2 != 0) break block69;
                        }
                        v8 = var3_3;
                        v9 = US.g;
                    }
                    if (var2_2 == 0) break block72;
                    if (v8 != v9) break block73;
                    this.O.y();
                    if (var2_2 != 0) break block69;
                }
                v8 = var3_3;
                v9 = US.b;
            }
            if (v8 == v9) {
                this.O.z(var1_1.getX(), var1_1.getY());
            }
        }
        this.O.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block5: {
            int n10;
            block4: {
                int n11 = _y_0.y();
                n10 = this.O.requestFocusInWindow();
                if (n11 != 0) break block4;
                this.O.repaint();
                this.O.A = false;
                if (pa_1.e(this.O) == null) break block5;
                n10 = mouseEvent.getButton();
            }
            if (n10 == 1) {
                this.O.K = new XE(mouseEvent.getPoint().x, mouseEvent.getPoint().y);
                this.O.N();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
}

