/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ac_0;
import com.ic_1;
import com.ky_2;
import com.wd_0;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class KQ
implements ActionListener {
    final wd_0 I;

    KQ(wd_0 wd_02) {
        this.I = wd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            JComponent jComponent;
            JComponent jComponent2;
            block10: {
                block11: {
                    int n10;
                    ky_2[] ky_2Array;
                    float f10;
                    block9: {
                        block4: {
                            block5: {
                                wd_0 wd_02;
                                block6: {
                                    block7: {
                                        float f11 = (float)wd_0.J() / (1000.0f / (float)wd_0.x());
                                        f10 = 1.0f / f11;
                                        ky_2Array = ac_0.n();
                                        n10 = wd_0.q(this.I).equals((Object)ic_1.fadeIn);
                                        if (ky_2Array != null) break block4;
                                        if (n10 == 0) break block5;
                                        wd_02 = this.I;
                                        if (ky_2Array != null) break block6;
                                        if (!(wd_0.Y(wd_02) < 1.0f)) break block7;
                                        wd_0.F(this.I, Math.min(wd_0.Y(this.I) + f10, 1.0f));
                                        this.I.repaint();
                                        if (ky_2Array == null) break block8;
                                    }
                                    wd_0.Y(this.I);
                                    wd_02 = this.I;
                                }
                                wd_0.N(wd_02).Y();
                                if (ky_2Array == null) break block8;
                            }
                            n10 = wd_0.q(this.I).equals((Object)ic_1.fadeOut) ? 1 : 0;
                        }
                        if (ky_2Array != null) break block9;
                        if (n10 == 0) break block8;
                        jComponent2 = this.I;
                        if (ky_2Array != null) break block10;
                        float f12 = wd_0.Y((wd_0)jComponent2) - 0.0f;
                        n10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (n10 <= 0) break block11;
                    wd_0.F(this.I, Math.max(wd_0.Y(this.I) - f10, 0.0f));
                    this.I.repaint();
                    if (ky_2Array == null) break block8;
                }
                jComponent2 = (JComponent)this.I.getParent();
            }
            if ((jComponent = jComponent2) != null) {
                Rectangle rectangle = this.I.getBounds();
                jComponent.remove(this.I);
                jComponent.repaint(rectangle);
            }
            wd_0.N(this.I).Y();
        }
    }
}

