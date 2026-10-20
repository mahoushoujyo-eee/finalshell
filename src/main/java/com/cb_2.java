/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.II;
import com.wb_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.cb
 */
class cb_2
extends MouseAdapter {
    final II a;

    cb_2(II iI) {
        this.a = iI;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block4: {
            int n10;
            String string;
            block3: {
                string = wb_0.m();
                int n11 = SwingUtilities.isLeftMouseButton(mouseEvent);
                if (string == null) break block3;
                if (n11 == 0) break block4;
                this.a.requestFocusInWindow();
                n11 = n10 = 0;
            }
            while (n10 < II.d(this.a).size()) {
                block6: {
                    int n12;
                    II iI;
                    block5: {
                        iI = this.a;
                        n12 = n10;
                        if (string == null) break block5;
                        if (!iI.l(n12).contains(mouseEvent.getPoint())) break block6;
                        iI = this.a;
                        n12 = n10;
                    }
                    iI.T(n12);
                    if (string != null) break;
                }
                ++n10;
                if (string != null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mouseWheelMoved(MouseWheelEvent var1_1) {
        block4: {
            var3_2 = this.a.i();
            var4_3 = II.d(this.a).size() - 1;
            var2_4 = wb_0.m();
            v0 = var5_5 = var1_1.getWheelRotation();
            if (var2_4 == null) ** GOTO lbl12
            if (v0 <= 0) ** GOTO lbl11
            for (var6_6 = var3_2 + var5_5; var6_6 > var4_3; var6_6 -= II.d(this.a).size()) {
                if (var2_4 != null) {
                    if (var2_4 != null) continue;
                }
                break block4;
lbl11:
                // 2 sources

                v0 = var6_6 = var3_2 + var5_5;
                while (var6_6 < 0) {
                    var6_6 += II.d(this.a).size();
                    if (var2_4 != null) {
                        if (var2_4 != null) continue;
                    }
                    break block4;
                }
                break block0;
            }
            this.a.T(var6_6);
        }
    }
}

