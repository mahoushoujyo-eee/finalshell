/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kf_2;
import com.tk_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _N
implements ActionListener {
    final kf_2 G;

    _N(kf_2 kf_22) {
        this.G = kf_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            kf_2 kf_22;
            block6: {
                block7: {
                    tk_0 tk_02;
                    boolean bl;
                    block4: {
                        tk_0 tk_03;
                        block5: {
                            boolean bl2;
                            block2: {
                                block3: {
                                    tk_03 = this.G.N();
                                    bl = tk_0.B();
                                    tk_03.C(tk_03.w() + (kf_2.I(this.G) ? 0.1f : -0.1f));
                                    bl2 = kf_2.I(this.G);
                                    if (bl) break block2;
                                    if (!bl2) break block3;
                                    tk_02 = tk_03;
                                    if (bl) break block4;
                                    if (tk_02.w() >= 1.0f) break block5;
                                }
                                kf_22 = this.G;
                                if (bl) break block6;
                                bl2 = kf_2.I(kf_22);
                            }
                            if (bl2) break block7;
                            tk_02 = tk_03;
                            if (bl) break block4;
                            if (!(tk_02.w() <= 0.0f)) break block7;
                        }
                        tk_02 = tk_03;
                    }
                    tk_02.C(kf_2.I(this.G) ? 1.0f : 0.0f);
                    this.G.revalidate();
                    kf_2.R(this.G, false);
                    kf_2.f(this.G).Y();
                    if (!bl) break block8;
                }
                kf_22 = this.G;
            }
            kf_22.revalidate();
        }
    }
}

