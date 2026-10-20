/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QX;
import com.TT;
import com.W2;
import com.ky_2;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;

/*
 * Renamed from com.Qt
 */
public class qt_0
extends ky_2 {
    public qt_0() {
        this(new TT());
    }

    public qt_0(LayoutManager layoutManager) {
        super(layoutManager);
        this.setOpaque(false);
    }

    public TT V() {
        return (TT)this.getLayout();
    }

    public void V(LayoutManager layoutManager) {
        this.V().S(layoutManager);
    }

    public void C(LayoutManager layoutManager) {
        this.V().X(layoutManager);
    }

    public void s() {
        this.removeAll();
        this.setVisible(false);
    }

    public void h(QX qX) {
        qX.X();
        this.setBounds(new Rectangle(0, 0, this.getParent().getWidth(), this.getParent().getHeight()));
        this.add((Component)qX, 0);
        this.setVisible(true);
        qX.revalidate();
        qX.repaint();
    }

    public void S(QX qX) {
        QX qX2;
        block4: {
            block5: {
                block3: {
                    Container container;
                    block2: {
                        String[] stringArray = QX.Y();
                        container = qX;
                        if (stringArray != null) break block2;
                        if (!container.isShowing()) break block3;
                        qX2 = qX;
                        if (stringArray != null) break block4;
                        container = qX2.getParent();
                    }
                    if (container == this) break block5;
                }
                return;
            }
            qX.e();
            qX2 = qX;
        }
        Rectangle rectangle = qX2.getBounds();
        this.remove(qX);
        this.revalidate();
        this.repaint(rectangle);
    }

    @Override
    public boolean contains(int n10, int n11) {
        boolean bl;
        block5: {
            Component[] componentArray = this.getComponents();
            int n12 = componentArray.length;
            String[] stringArray = QX.Y();
            for (int i2 = 0; i2 < n12; ++i2) {
                boolean bl2;
                block6: {
                    Component component;
                    block7: {
                        block9: {
                            boolean bl3;
                            block10: {
                                Shape shape;
                                Point point;
                                block8: {
                                    Shape shape2;
                                    component = componentArray[i2];
                                    point = component.getLocation();
                                    bl = component instanceof W2;
                                    if (stringArray != null) break block5;
                                    if (stringArray != null) break block6;
                                    if (!bl) break block7;
                                    shape = shape2 = ((W2)((Object)component)).B();
                                    if (stringArray != null) break block8;
                                    if (shape == null) break block9;
                                    shape = shape2;
                                }
                                bl3 = shape.contains(n10 - point.x, n11 - point.y);
                                if (stringArray != null) break block10;
                                if (!bl3) break block9;
                                bl3 = true;
                            }
                            return bl3;
                        }
                        if (stringArray == null) continue;
                    }
                    bl2 = component.getBounds().contains(n10, n11);
                }
                if (stringArray == null) {
                    if (!bl2) continue;
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public boolean J(int n10, int n11) {
        return super.contains(n10, n11);
    }
}

