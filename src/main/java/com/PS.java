/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.II;
import com.wb_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class PS
extends KeyAdapter {
    final II a;

    PS(II iI) {
        this.a = iI;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void keyPressed(KeyEvent var1_1) {
        block12: {
            block18: {
                block19: {
                    block15: {
                        block16: {
                            block17: {
                                block13: {
                                    block14: {
                                        block11: {
                                            var2_2 = wb_0.m();
                                            v0 = II.d(this.a).size();
                                            if (var2_2 == null) break block11;
                                            if (v0 <= 0) break block12;
                                            v0 = this.a.i();
                                        }
                                        var3_3 = v0;
                                        v1 = GR.rF.J(var1_1);
                                        if (var2_2 == null) break block13;
                                        if (!v1) break block14;
                                        v2 = var3_3;
                                        v3 = -1;
                                        if (var2_2 == null) ** GOTO lbl21
                                        if (v2 == v3) ** GOTO lbl-1000
                                        v4 = var3_3;
                                        if (var2_2 != null) {
                                            ** if (v4 != 0) goto lbl-1000
                                        }
                                        ** GOTO lbl24
lbl-1000:
                                        // 2 sources

                                        {
                                            v2 = II.d(this.a).size();
                                            v3 = 1;
lbl21:
                                            // 2 sources

                                            v5 = v2 - v3;
                                            ** GOTO lbl25
                                        }
lbl-1000:
                                        // 1 sources

                                        {
                                            v4 = var3_3;
lbl24:
                                            // 2 sources

                                            v5 = v4 - 1;
                                        }
lbl25:
                                        // 2 sources

                                        this.a.T(v5);
                                        if (var2_2 != null) break block12;
                                    }
                                    v1 = GR.lx.J(var1_1);
                                }
                                if (var2_2 == null) break block15;
                                if (!v1) break block16;
                                v6 = var3_3;
                                if (var2_2 == null) break block17;
                                if (v6 == -1) ** GOTO lbl-1000
                                v7 = var3_3;
                                v8 = II.d(this.a).size() - 1;
                                if (var2_2 != null) {
                                    ** if (v7 != v8) goto lbl-1000
                                }
                                ** GOTO lbl44
lbl-1000:
                                // 2 sources

                                {
                                    v6 = 0;
                                    ** GOTO lbl45
                                }
lbl-1000:
                                // 1 sources

                                {
                                    v7 = var3_3;
                                    v8 = 1;
lbl44:
                                    // 2 sources

                                    v6 = v7 + v8;
                                }
                            }
                            this.a.T(v6);
                            if (var2_2 != null) break block12;
                        }
                        v1 = GR.lG.J(var1_1);
                    }
                    if (var2_2 == null) break block18;
                    if (!v1) break block19;
                    this.a.T(0);
                    if (var2_2 != null) break block12;
                }
                v1 = GR.lj.J(var1_1);
            }
            if (v1) {
                this.a.T(II.d(this.a).size() - 1);
            }
        }
    }
}

