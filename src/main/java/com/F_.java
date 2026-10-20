/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CJ;
import com.QQ;
import com.an_0;
import com.ky_2;
import com.lq_2;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class F_
extends an_0
implements SwingConstants {
    protected final GraphicsDevice u;

    public F_() {
        this(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice());
    }

    public F_(GraphicsDevice graphicsDevice) {
        this.u = graphicsDevice;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void w() {
        Object object = this.B;
        synchronized (object) {
            block5: {
                Object object2;
                block6: {
                    Rectangle rectangle;
                    block8: {
                        Rectangle rectangle2;
                        block7: {
                            ky_2[] ky_2Array = QQ.N();
                            object2 = this.i;
                            if (ky_2Array != null) break block5;
                            if (object2.size() <= 0) break block6;
                            rectangle2 = this.u.getDefaultConfiguration().getBounds();
                            if (!lq_2.l()) break block7;
                            Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(this.u.getDefaultConfiguration());
                            rectangle = new Rectangle(rectangle2.x + insets.left, rectangle2.y + insets.top, rectangle2.width - insets.left - insets.right, rectangle2.height - insets.top - insets.bottom);
                            if (ky_2Array == null) break block8;
                        }
                        rectangle = rectangle2;
                    }
                    CJ.O(this.i, rectangle);
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }
}

