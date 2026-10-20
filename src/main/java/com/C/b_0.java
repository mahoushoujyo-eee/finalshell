/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.W;
import com.c.v_0;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Renamed from com.C.b
 */
public class b_0
extends v_0 {
    protected Rectangle J = new Rectangle();
    protected Rectangle S = new Rectangle();
    protected Rectangle k = new Rectangle();

    @Override
    protected String d(JLabel jLabel, FontMetrics fontMetrics, String string, Icon icon, Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3) {
        this.J = this.e(rectangle, this.J);
        this.S = this.e(rectangle2, this.S);
        this.k = this.e(rectangle3, this.k);
        string = super.d(jLabel, fontMetrics, string, icon, this.J, this.S, this.k);
        this.A(this.J, rectangle);
        this.A(this.S, rectangle2);
        this.A(this.k, rectangle3);
        return string;
    }

    protected Rectangle e(Rectangle rectangle, Rectangle rectangle2) {
        int[] nArray = W.B();
        Rectangle rectangle3 = rectangle2;
        if (nArray == null) {
            if (rectangle3 == null) {
                rectangle2 = new Rectangle();
            }
            rectangle2.x = rectangle.y;
            rectangle2.y = rectangle.x;
            rectangle2.width = rectangle.height;
            rectangle2.height = rectangle.width;
            rectangle3 = rectangle2;
        }
        return rectangle3;
    }

    protected Rectangle A(Rectangle rectangle, Rectangle rectangle2) {
        int[] nArray = W.B();
        Rectangle rectangle3 = rectangle2;
        if (nArray == null) {
            if (rectangle3 == null) {
                rectangle2 = new Rectangle();
            }
            rectangle2.x = rectangle.x;
            rectangle2.y = rectangle.y;
            rectangle2.width = rectangle.width;
            rectangle2.height = rectangle.height;
            rectangle3 = rectangle2;
        }
        return rectangle3;
    }

    @Override
    public Dimension K(JLabel jLabel) {
        return this.s(super.K(jLabel));
    }

    protected Dimension s(Dimension dimension) {
        return new Dimension(dimension.height, dimension.width);
    }

    @Override
    public Dimension d(JComponent jComponent) {
        return this.K((JLabel)jComponent);
    }
}

