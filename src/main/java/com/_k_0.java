/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.FN;
import com.QX;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

/*
 * Renamed from com._k
 */
class _k_0
implements E {
    final Component P;
    final QX G;

    _k_0(QX qX, Component component) {
        this.G = qX;
        this.P = component;
    }

    public Rectangle a() {
        Point point;
        block10: {
            Dimension dimension;
            block9: {
                String[] stringArray;
                Rectangle rectangle;
                block8: {
                    int n10;
                    int n11;
                    block7: {
                        Dimension dimension2;
                        block6: {
                            block5: {
                                block4: {
                                    rectangle = FN.O(this.P);
                                    stringArray = QX.Y();
                                    dimension2 = FN.a(this.P).getSize();
                                    dimension = this.G.getPreferredSize();
                                    point = new Point();
                                    if (stringArray != null) break block4;
                                    if (rectangle.x + dimension.width >= dimension2.width && dimension2.width - rectangle.x - dimension.width <= rectangle.x) break block5;
                                    point.x = 0;
                                }
                                if (stringArray == null) break block6;
                            }
                            point.x = rectangle.width - dimension.width;
                        }
                        n11 = rectangle.y + rectangle.height + dimension.height;
                        n10 = dimension2.height;
                        if (stringArray != null) break block7;
                        if (n11 < n10) break block8;
                        n11 = dimension2.height - rectangle.y - rectangle.height - dimension.height;
                        n10 = rectangle.y;
                    }
                    if (n11 <= n10) break block9;
                }
                point.y = rectangle.height;
                if (stringArray == null) break block10;
            }
            point.y = -dimension.height;
        }
        return new Rectangle(point, this.G.getPreferredSize());
    }

    @Override
    public Object J() {
        return this.a();
    }
}

