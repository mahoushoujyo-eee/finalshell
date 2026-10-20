/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.GR;
import com.ic_0;
import com.kz_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

/*
 * Renamed from com.pw
 */
class pw_2
extends KeyAdapter {
    final ic_0 V;

    pw_2(ic_0 ic_02) {
        this.V = ic_02;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block3: {
            CI cI;
            block5: {
                block6: {
                    CI cI2;
                    String string;
                    block19: {
                        block20: {
                            int n10;
                            block18: {
                                block14: {
                                    block15: {
                                        CI cI3;
                                        block16: {
                                            block17: {
                                                block12: {
                                                    block13: {
                                                        block10: {
                                                            block11: {
                                                                block8: {
                                                                    block9: {
                                                                        block7: {
                                                                            int n11;
                                                                            block4: {
                                                                                block2: {
                                                                                    string = kz_2.M();
                                                                                    n11 = this.V.L.d.isShowing();
                                                                                    if (string == null) break block2;
                                                                                    if (n11 == 0) break block3;
                                                                                    n11 = ic_0.g(this.V).getModel().getSize();
                                                                                }
                                                                                if (string == null) break block4;
                                                                                if (n11 <= 0) break block3;
                                                                                cI = ic_0.g(this.V);
                                                                                if (string == null) break block5;
                                                                                n11 = cI.getSelectedIndex();
                                                                            }
                                                                            if (n11 == -1) break block6;
                                                                            n10 = GR.lD.J(keyEvent);
                                                                            if (string == null) break block7;
                                                                            if (n10 != 0) break block8;
                                                                            n10 = GR.lR.J(keyEvent);
                                                                        }
                                                                        if (string == null) break block9;
                                                                        if (n10 != 0) break block8;
                                                                        n10 = GR.ru.J(keyEvent);
                                                                    }
                                                                    if (string == null) break block10;
                                                                    if (n10 == 0) break block11;
                                                                }
                                                                ic_0.w(this.V);
                                                                if (string != null) break block3;
                                                            }
                                                            n10 = GR.lZ.J(keyEvent);
                                                        }
                                                        if (string == null) break block12;
                                                        if (n10 == 0) break block13;
                                                        ic_0.i(this.V, (File)ic_0.g(this.V).getSelectedValue());
                                                        if (string != null) break block3;
                                                    }
                                                    n10 = GR.rp.J(keyEvent);
                                                }
                                                if (string == null) break block14;
                                                if (n10 == 0) break block15;
                                                cI3 = ic_0.g(this.V);
                                                if (string == null) break block16;
                                                if (cI3.getSelectedIndex() != 0) break block17;
                                                ic_0.g(this.V).setSelectedIndex(ic_0.g(this.V).getModel().getSize() - 1);
                                                this.r();
                                                if (string != null) break block3;
                                            }
                                            cI3 = ic_0.g(this.V);
                                        }
                                        cI3.setSelectedIndex(ic_0.g(this.V).getSelectedIndex() - 1);
                                        this.r();
                                        if (string != null) break block3;
                                    }
                                    n10 = GR.rI.J(keyEvent);
                                }
                                if (string == null) break block18;
                                if (n10 == 0) break block3;
                                cI2 = ic_0.g(this.V);
                                if (string == null) break block19;
                                n10 = cI2.getSelectedIndex();
                            }
                            if (n10 != ic_0.g(this.V).getModel().getSize() - 1) break block20;
                            ic_0.g(this.V).setSelectedIndex(0);
                            this.r();
                            if (string != null) break block3;
                        }
                        cI2 = ic_0.g(this.V);
                    }
                    cI2.setSelectedIndex(ic_0.g(this.V).getSelectedIndex() + 1);
                    this.r();
                    if (string != null) break block3;
                }
                cI = ic_0.g(this.V);
            }
            cI.setSelectedIndex(0);
            this.r();
        }
    }

    private void r() {
        ic_0.g(this.V).scrollRectToVisible(ic_0.g(this.V).getUI().getCellBounds(ic_0.g(this.V), ic_0.g(this.V).getSelectedIndex(), ic_0.g(this.V).getSelectedIndex()));
    }
}

