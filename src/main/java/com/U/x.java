/*
 * Decompiled with CFR 0.152.
 */
package com.U;

import com.U.O;
import com.U.y;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

class x
extends Canvas {
    final y C;

    x(y y2) {
        this.C = y2;
    }

    @Override
    public void paint(Graphics graphics) {
        block3: {
            Graphics graphics2;
            Dimension dimension;
            block5: {
                block6: {
                    y y2;
                    boolean bl;
                    block4: {
                        int n10;
                        block2: {
                            bl = O.U();
                            n10 = this.C.isContinuousLayout();
                            if (bl) break block2;
                            if (n10 != 0) break block3;
                            y2 = this.C;
                            if (bl) break block4;
                            n10 = y2.getLastDragLocation();
                        }
                        if (n10 == -1) break block3;
                        y2 = this.C;
                    }
                    dimension = y.X(y2).getSize();
                    graphics2 = graphics;
                    if (bl) break block5;
                    graphics2.setColor(this.C.Z);
                    if (this.C.getOrientation() != 1) break block6;
                    graphics.fillRect(0, 0, y.J(this.C) - 1, dimension.height - 1);
                    if (!bl) break block3;
                }
                graphics2 = graphics;
            }
            graphics2.fillRect(0, 0, dimension.width - 1, y.H(this.C) - 1);
        }
    }
}

