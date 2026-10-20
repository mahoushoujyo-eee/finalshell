/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import com.FN;
import com.HG;
import com.a.y_0;
import java.awt.Point;
import java.awt.event.MouseEvent;

class l
extends HG {
    final d z;

    l(d d2) {
        this.z = d2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block3: {
            d d2;
            block7: {
                block8: {
                    int n10;
                    int[] nArray;
                    block6: {
                        block5: {
                            block4: {
                                block2: {
                                    nArray = y_0.M();
                                    n10 = this.z.u();
                                    if (nArray == null) break block2;
                                    if (n10 == 0) break block3;
                                    n10 = this.z.t();
                                }
                                if (nArray == null) break block4;
                                if (n10 == 0) break block3;
                                n10 = FN.B(mouseEvent);
                            }
                            if (nArray == null) break block5;
                            if (n10 == 0) break block3;
                            n10 = mouseEvent.getClickCount();
                        }
                        if (nArray == null) break block6;
                        if (n10 != 2) break block3;
                        d2 = this.z;
                        if (nArray == null) break block7;
                        n10 = d2.j() ? 1 : 0;
                    }
                    if (n10 == 0) break block8;
                    this.z.J();
                    if (nArray != null) break block3;
                }
                d2 = this.z;
            }
            d2.p();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        l l2;
        block4: {
            block5: {
                int[] nArray = y_0.M();
                l2 = this;
                if (nArray == null) break block4;
                if (!l2.B) break block5;
                l2 = this;
                if (nArray == null) break block4;
                if (l2.z.j()) {
                    this.k = new Point(this.k.x + this.z.X, this.k.y + this.z.X);
                    this.z.J();
                }
            }
            l2 = this;
        }
        super.mouseDragged(mouseEvent);
    }
}

