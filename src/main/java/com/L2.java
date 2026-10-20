/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lz_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class L2
extends lz_0 {
    protected Color b;
    private static final long a;

    public L2(Color color) {
        this.b = color;
    }

    public Color R() {
        return this.b;
    }

    public void g(Color color) {
        this.b = color;
        this.l();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean d(JComponent jComponent) {
        int n10;
        block5: {
            Color color;
            int[] nArray;
            block4: {
                nArray = lz_0.M();
                color = this.b;
                if (nArray != null) break block4;
                if (color == null) break block5;
                color = this.b;
            }
            n10 = color.getAlpha();
            if (nArray != null) return n10 != 0;
            if (n10 == (int)a) {
                n10 = 1;
                return n10 != 0;
            }
        }
        n10 = 0;
        return n10 != 0;
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        block4: {
            int n10;
            Rectangle rectangle2;
            block5: {
                int[] nArray = lz_0.M();
                if (this.b == null) break block4;
                rectangle2 = jComponent.getVisibleRect().intersection(rectangle);
                n10 = rectangle2.width;
                if (nArray != null) break block5;
                if (n10 <= 0) break block4;
                n10 = rectangle2.height;
            }
            if (n10 > 0) {
                graphics2D.setColor(this.b);
                graphics2D.fillRect(rectangle2.x, rectangle2.y, rectangle2.width, rectangle2.height);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5386012071843819472L;
        a = 0x7141F2726A376F2FL ^ l2;
    }
}

