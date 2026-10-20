/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.c.v_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Q
extends v_0 {
    public static Color C;
    public static Color X;
    private static final long[] b;
    private static final Integer[] h;

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JLabel jLabel) {
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillRoundRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height - 1, Q.a(22996, 1095822548412599027L), Q.a(20759, 4925044994517893685L));
        graphics2D.setPaint(X);
        graphics2D.fillRect(rectangle.x + 3, rectangle.y + 3, rectangle.width - Q.a(20759, 4925044994517893685L), rectangle.height - Q.a(8411, 7389959874918937597L));
        graphics2D.setPaint(C);
        graphics2D.drawRoundRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 2, Q.a(20759, 4925044994517893685L), Q.a(20759, 4925044994517893685L));
        graphics2D.drawRoundRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 1, Q.a(20759, 4925044994517893685L), Q.a(20759, 4925044994517893685L));
        super.u(graphics2D, rectangle, jLabel);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.u(graphics2D, rectangle, (JLabel)jComponent);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1099736943979045524L;
                var6_1 = new long[7];
                var3_2 = 0;
                var4_3 = "}\u00ad_*\u0093\u00f0\f\u0014\u0005<\u00f3\u00e0+0U$FD\u00d7q\u00c4\u00d0Qn\u00a0\u00b2\u00c3\u001d\u00c2\u00c1\u00a8a\u0019y\u0094\u0080\u0014G\u0011\u008a";
                var5_4 = "}\u00ad_*\u0093\u00f0\f\u0014\u0005<\u00f3\u00e0+0U$FD\u00d7q\u00c4\u00d0Qn\u00a0\u00b2\u00c3\u001d\u00c2\u00c1\u00a8a\u0019y\u0094\u0080\u0014G\u0011\u008a".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "c\t@)\u00a6\u00d4\u0084\u00a0\f\u0003\u00ad\u00f3\u009d0\u00a0\u00a7";
                    var5_4 = "c\t@)\u00a6\u00d4\u0084\u00a0\f\u0003\u00ad\u00f3\u009d0\u00a0\u00a7".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        Q.b = var6_1;
        Q.h = new Integer[7];
        Q.C = new Color(Q.a(9305, 2397745262061614972L), Q.a(24818, 9012245611809453010L), Q.a(24818, 9012245611809453010L));
        Q.X = new Color(Q.a(32083, 1971180738456759927L), Q.a(30178, 7254752993972201155L), Q.a(30178, 7254752993972201155L));
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5324;
        if (h[n11] == null) {
            Q.h[n11] = (int)(b[n11] ^ l2);
        }
        return h[n11];
    }
}

