/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.oy_1;
import com.sy_0;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.i4
 */
public class i4_0
extends MouseAdapter {
    final oy_1 W;

    protected i4_0(oy_1 oy_12) {
        this.W = oy_12;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block6: {
                boolean bl2;
                block4: {
                    bl2 = oy_1.Z();
                    bl = this.W.isEnabled();
                    if (bl2) break block4;
                    if (!bl) break block5;
                    bl = this.W.w();
                }
                if (bl2) break block6;
                if (!bl) break block5;
                bl = FN.B(mouseEvent);
            }
            if (bl) {
                this.W.i = true;
                this.f(mouseEvent.getPoint());
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block4: {
                boolean bl2 = oy_1.y();
                bl = this.W.i;
                if (!bl2) break block4;
                if (!bl) break block5;
                bl = FN.B(mouseEvent);
            }
            if (bl) {
                this.f(mouseEvent.getPoint());
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void f(Point var1_1) {
        var3_2 = this.W.M(var1_1);
        var2_3 = oy_1.Z();
        if (var2_3) ** GOTO lbl7
        switch (sy_0.s[this.W.c.ordinal()]) {
            case 1: {
                this.W.d(Math.round(var3_2));
lbl7:
                // 2 sources

                if (!var2_3) break;
            }
            case 2: {
                this.W.d(Math.round(var3_2 - var3_2 % 1.0f));
                this.W.o(var3_2 % 1.0f);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block5: {
            boolean bl;
            block4: {
                boolean bl2 = oy_1.y();
                bl = this.W.i;
                if (!bl2) break block4;
                if (!bl) break block5;
                bl = FN.B(mouseEvent);
            }
            if (bl) {
                this.W.i = false;
            }
        }
    }
}

