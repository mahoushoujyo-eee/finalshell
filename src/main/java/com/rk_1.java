/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.WC;
import com.o3_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
 * Renamed from com.rK
 */
class rk_1
implements ActionListener {
    private Long f;
    final File G;
    final o3_0 x;
    final WC V;

    rk_1(File file, o3_0 o3_02, WC wC) {
        this.G = file;
        this.x = o3_02;
        this.V = wC;
        this.f = null;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            rk_1 rk_12;
            block4: {
                block5: {
                    String string;
                    block7: {
                        long l2;
                        block6: {
                            string = FV.D();
                            rk_12 = this;
                            if (string != null) break block4;
                            if (!rk_12.G.exists()) break block5;
                            l2 = this.G.lastModified();
                            rk_1 rk_13 = this;
                            if (string != null) break block6;
                            if (rk_13.f == l2) break block7;
                            this.x.o(this.G);
                            rk_13 = this;
                        }
                        rk_13.f = l2;
                    }
                    if (string == null) break block8;
                }
                this.x.p(this.G);
                rk_12 = this;
            }
            rk_12.V.Y();
        }
    }
}

