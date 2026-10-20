/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.i1_0;
import com.oj_0;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

/*
 * Renamed from com.i9
 */
public class i9_0
extends i1_0 {
    protected boolean P = false;

    public static ComponentUI createUI(JComponent jComponent) {
        return new i9_0();
    }

    public boolean g() {
        return this.P;
    }

    public void h(boolean bl) {
        this.P = bl;
    }

    @Override
    public int getBaseline(JComponent jComponent, int n10, int n11) {
        super.getBaseline(jComponent, n10, n11);
        return -1;
    }

    @Override
    public Component.BaselineResizeBehavior getBaselineResizeBehavior(JComponent jComponent) {
        super.getBaselineResizeBehavior(jComponent);
        return Component.BaselineResizeBehavior.OTHER;
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        Graphics2D graphics2D;
        block6: {
            block4: {
                boolean bl;
                block5: {
                    boolean bl2;
                    block2: {
                        block3: {
                            graphics2D = (Graphics2D)graphics.create();
                            bl = oj_0.g();
                            bl2 = jComponent.getComponentOrientation().isLeftToRight();
                            if (!bl) break block2;
                            if (!bl2) break block3;
                            if (!this.P) break block4;
                            break block5;
                        }
                        bl2 = this.P;
                    }
                    if (bl2) break block4;
                }
                graphics2D.rotate(1.5707963267948966, jComponent.getSize().width / 2, jComponent.getSize().width / 2);
                if (bl) break block6;
            }
            graphics2D.rotate(-1.5707963267948966, jComponent.getSize().height / 2, jComponent.getSize().height / 2);
        }
        super.paint(graphics2D, jComponent);
    }
}

