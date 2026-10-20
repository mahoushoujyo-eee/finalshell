/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.O8;
import com.RV;
import com.c.v_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Y6
extends v_0 {
    public static Color G;
    public static int K;

    public void Z(Graphics2D graphics2D, Rectangle rectangle, O8 o8) {
        Object object = RV.X(graphics2D);
        graphics2D.setColor(G);
        graphics2D.fillRoundRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height, K * 2, K * 2);
        RV.X(graphics2D, object);
        super.u(graphics2D, rectangle, o8);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JLabel jLabel) {
        this.Z(graphics2D, rectangle, (O8)jLabel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.Z(graphics2D, rectangle, (O8)jComponent);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8666983656198584621L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00a4V\u00b4x5\u00d59\u009f7\u0099\u00b7Q5\u00d59\u00d2\u001f\u00ff\u008f\u00115\u00d59\u00d2";
        int n11 = "\u00a4V\u00b4x5\u00d59\u009f7\u0099\u00b7Q5\u00d59\u00d2\u001f\u00ff\u008f\u00115\u00d59\u00d2".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        G = new Color((int)lArray[1], (int)lArray[2], (int)lArray[2], (int)lArray[0]);
        K = GO.Fx;
    }
}

