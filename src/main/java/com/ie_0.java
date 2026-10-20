/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.IB;
import com.IH;
import com.aS;
import com.ax_0;
import com.ys_2;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import javax.swing.JComponent;
import javax.swing.JRootPane;

/*
 * Renamed from com.Ie
 */
public class ie_0
extends IB {
    private ComponentAdapter M;

    public ie_0(aS aS2) {
        super(aS2);
    }

    protected void K(JRootPane jRootPane) {
        Window window = FV.L(jRootPane);
        this.M = new ys_2(this);
        window.addComponentListener(this.M);
    }

    protected void M(JRootPane jRootPane) {
        Window window = FV.L(jRootPane);
        window.removeComponentListener(this.M);
        this.M = null;
    }

    protected void A(JRootPane jRootPane) {
        block5: {
            Window window;
            block11: {
                int n10;
                Point point;
                String[] stringArray;
                block10: {
                    Rectangle rectangle;
                    block9: {
                        block8: {
                            int n11;
                            Dimension dimension;
                            block7: {
                                Rectangle rectangle2;
                                block6: {
                                    block4: {
                                        window = FV.L(jRootPane);
                                        rectangle = (Rectangle)this.o();
                                        stringArray = IH.M();
                                        rectangle2 = rectangle;
                                        if (stringArray == null) break block4;
                                        if (rectangle2 == null) break block5;
                                        rectangle2 = rectangle;
                                    }
                                    if (stringArray == null) break block6;
                                    if (ax_0.Z(rectangle2, new Object[]{window.getBounds()})) break block5;
                                    rectangle2 = rectangle;
                                }
                                dimension = rectangle2.getSize();
                                n11 = dimension.width;
                                if (stringArray == null) break block7;
                                if (n11 <= 0) break block8;
                                n11 = dimension.height;
                            }
                            if (n11 <= 0) break block8;
                            window.setSize(dimension);
                            if (stringArray != null) break block9;
                        }
                        window.pack();
                    }
                    point = rectangle.getLocation();
                    n10 = point.x;
                    if (stringArray == null) break block10;
                    if (n10 <= 0) break block11;
                    n10 = point.y;
                }
                if (n10 <= 0) break block11;
                window.setLocation(point);
                if (stringArray != null) break block5;
            }
            window.setLocationRelativeTo(null);
        }
    }

    protected void W(JRootPane jRootPane) {
        Window window = FV.L(jRootPane);
        this.J(window.getBounds());
    }

    @Override
    protected void T(JComponent jComponent) {
        this.W((JRootPane)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.A((JRootPane)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.M((JRootPane)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.K((JRootPane)jComponent);
    }
}

