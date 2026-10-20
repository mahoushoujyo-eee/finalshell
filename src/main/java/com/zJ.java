/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.RV;
import com.ky_2;
import com.rn_0;
import com.up_0;
import com.xg_0;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.image.BufferedImage;
import javax.swing.Icon;

public abstract class zJ
implements up_0 {
    protected static final Insets T;
    private static final long[] a;
    private static final Integer[] b;

    protected FontMetrics Z(Object object) {
        return FN.E();
    }

    protected abstract Icon n(Object var1);

    protected abstract String O(Object var1);

    /*
     * Unable to fully structure code
     */
    @Override
    public BufferedImage u(Object var1_1, DragSourceDragEvent var2_2) {
        var4_3 = this.n(var1_1);
        var3_4 = rn_0.Y();
        var5_5 = this.O(var1_1);
        var6_6 = this.Z(var1_1);
        v0 = zJ.T.left;
        v1 = var4_3;
        if (var3_4 == 0) ** GOTO lbl10
        if (v1 != null) {
            v1 = var4_3;
lbl10:
            // 2 sources

            v2 = v1.getIconWidth() + 4;
        } else {
            v2 = 3;
        }
        var7_7 = v0 + v2;
        var8_8 = zJ.T.right + 3;
        var9_9 = var7_7 + var6_6.stringWidth(var5_5) + var8_8;
        v3 = zJ.T.top;
        v4 = var4_3;
        if (var3_4 == 0) ** GOTO lbl21
        if (v4 != null) {
            v4 = var4_3;
lbl21:
            // 2 sources

            v5 = v4.getIconHeight();
        } else {
            v5 = 0;
        }
        var10_10 = v3 + Math.max(v5, var6_6.getHeight()) + zJ.T.bottom;
        var11_11 = xg_0.g(var9_9, var10_10, 3);
        var12_12 = var11_11.createGraphics();
        RV.p(var12_12, Float.valueOf(0.8f));
        RV.b(var12_12, var6_6.getFont());
        RV.L(var12_12);
        var12_12.setPaint(Color.WHITE);
        var12_12.fillRect(0, 0, var9_9, var10_10);
        var12_12.setPaint(Color.LIGHT_GRAY);
        var12_12.drawRect(0, 0, var9_9 - 1, var10_10 - 1);
        if (var3_4 != 0) {
            if (var4_3 != null) {
                var4_3.paintIcon(null, var12_12, zJ.T.left, zJ.T.top);
            }
            var12_12.setPaint(Color.BLACK);
            var12_12.drawString(var5_5, var7_7, zJ.T.top + (var10_10 - zJ.T.top - zJ.T.bottom) / 2 + GA.d(var6_6));
            var12_12.dispose();
        }
        if (var3_4 == 0) {
            ky_2.K(new String[3]);
        }
        return var11_11;
    }

    @Override
    public Point e(Object object, DragSourceDragEvent dragSourceDragEvent) {
        return new Point(zJ.a(20335, 8956823061290534712L), 5);
    }

    @Override
    public void v(Object object, DragSourceDropEvent dragSourceDropEvent) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5307909822936804245L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "(V\u0005\u0005\u00f3\u00cb\u00ac\u00b4\u00ba'\u001b\u00c8\u007fbn=\u001fn\u0010-g~\u00b5\u00ed";
        int n11 = "(V\u0005\u0005\u00f3\u00cb\u00ac\u00b4\u00ba'\u001b\u00c8\u007fbn=\u001fn\u0010-g~\u00b5\u00ed".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
        T = new Insets(zJ.a(22059, 1826042720172039806L), zJ.a(3576, 3249174288654534062L), zJ.a(3576, 3249174288654534062L), zJ.a(3576, 3249174288654534062L));
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x857;
        if (b[n11] == null) {
            zJ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

