/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.RV;
import com.lz_0;
import com.nh_1;
import com.rq_2;
import com.sm_0;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LM
extends lz_0 {
    public Insets W(nh_1 nh_12) {
        return new Insets(0, 1, 0, 1);
    }

    public void t(Graphics2D graphics2D, Rectangle rectangle, nh_1 nh_12) {
        block3: {
            Graphics2D graphics2D2;
            block2: {
                int[] nArray = rq_2.G();
                graphics2D.setPaint(sm_0.I);
                int[] nArray2 = nArray;
                graphics2D2 = graphics2D;
                if (nArray2 == null) break block2;
                graphics2D2.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
                if (!nh_12.U()) break block3;
                graphics2D2 = graphics2D;
            }
            Composite composite = RV.p(graphics2D2, Float.valueOf(0.25f));
            graphics2D.setPaint(Color.RED);
            graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
            RV.c(graphics2D, composite);
        }
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.W((nh_1)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.t(graphics2D, rectangle, (nh_1)jComponent);
    }
}

