/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.PQ;
import com.WK;
import com.sm_0;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RB
extends JComponent {
    private boolean Y;

    public RB(boolean bl) {
        this.Y = bl;
        FN.Y(this);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        block4: {
            Graphics2D graphics2D;
            block2: {
                block3: {
                    super.paintComponent(graphics);
                    graphics2D = (Graphics2D)graphics;
                    boolean bl = PQ.p();
                    graphics2D.setPaint(WK.Q);
                    boolean bl2 = bl;
                    graphics2D.drawLine(0, 0, this.getWidth() - 1, 0);
                    graphics2D.setColor(WK.G);
                    graphics2D.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
                    if (bl2) break block2;
                    if (!this.Y) break block3;
                    graphics2D.setColor(sm_0.h);
                    graphics2D.drawLine(0, 2, 0, this.getHeight() - 4);
                    if (!bl2) break block4;
                }
                graphics2D.setColor(sm_0.h);
            }
            graphics2D.drawLine(this.getWidth() - 1, 2, this.getWidth() - 1, this.getHeight() - 4);
        }
    }
}

