/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.G;
import com.C.W;
import com.C.d;
import com.RV;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

/*
 * Renamed from com.C.w
 */
public class w_0
extends d {
    public static Color p;
    public static Color Y;
    public static Color z;
    public static Color S;
    protected G R = G.thick;
    private static final long[] e;
    private static final Integer[] n;

    public G b() {
        return this.R;
    }

    public void L(G g10) {
        this.R = g10;
    }

    @Override
    public void h(Graphics2D graphics2D, Rectangle rectangle, JPanel jPanel) {
        JPanel jPanel2;
        block8: {
            G g10;
            G g11;
            block6: {
                block7: {
                    int[] nArray = com.C.W.B();
                    Object object = jPanel;
                    if (nArray == null) {
                        if (((JComponent)object).isOpaque()) {
                            graphics2D.setPaint(jPanel.getBackground());
                            graphics2D.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
                        }
                        object = RV.X(graphics2D);
                    }
                    jPanel2 = object;
                    g11 = this.R;
                    g10 = G.bold;
                    if (nArray != null) break block6;
                    if (g11 != g10) break block7;
                    graphics2D.setPaint(Color.WHITE);
                    graphics2D.fillRoundRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height - 1, w_0.b(31782, 4162003507853097130L), w_0.b(16384, 4836687837971104906L));
                    graphics2D.setPaint(Y);
                    graphics2D.fillRoundRect(rectangle.x + 3, rectangle.y + 3, rectangle.width - w_0.b(16384, 4836687837971104906L), rectangle.height - w_0.b(11137, 3946449415819472648L), 3, 3);
                    graphics2D.setPaint(p);
                    graphics2D.drawRoundRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 2, w_0.b(16384, 4836687837971104906L), w_0.b(16384, 4836687837971104906L));
                    graphics2D.drawRoundRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 1, w_0.b(16384, 4836687837971104906L), w_0.b(16384, 4836687837971104906L));
                    if (nArray == null) break block8;
                }
                g11 = this.R;
                g10 = G.thick;
            }
            if (g11 == g10) {
                graphics2D.setPaint(S);
                graphics2D.fillRoundRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height, w_0.b(16384, 4836687837971104906L), w_0.b(16384, 4836687837971104906L));
                graphics2D.setPaint(z);
                graphics2D.drawRoundRect(rectangle.x, rectangle.y, rectangle.width - 1, rectangle.height - 2, w_0.b(16384, 4836687837971104906L), w_0.b(16384, 4836687837971104906L));
            }
        }
        RV.X(graphics2D, jPanel2);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.h(graphics2D, rectangle, (JPanel)jComponent);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4596321958908359035L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u00dd\u00dce\u0015\u00d1\u00d5\u0005\u00fb\u001c\u00b0I\u00daU\u00b75\u00f7\u00f3\u00f0\u00det\u0083\u00f8\u00det&\u0001(\u009dL\n\u009a\t\u0096\u0007\u007f\u00f2\u00ee\u00eb\u0090\f,\u00cf\u0088\u00ab#\u00c6\u00d5\u00f3\u00dc\u0005X\u00d6+\u00df\u00a7Z\u0015\u00bf\n\u00d1\u00bd\u008c\t\u00d7\u00a7\u00e3\u00aa\nM\u00e0VF";
                var5_4 = "\u00dd\u00dce\u0015\u00d1\u00d5\u0005\u00fb\u001c\u00b0I\u00daU\u00b75\u00f7\u00f3\u00f0\u00det\u0083\u00f8\u00det&\u0001(\u009dL\n\u009a\t\u0096\u0007\u007f\u00f2\u00ee\u00eb\u0090\f,\u00cf\u0088\u00ab#\u00c6\u00d5\u00f3\u00dc\u0005X\u00d6+\u00df\u00a7Z\u0015\u00bf\n\u00d1\u00bd\u008c\t\u00d7\u00a7\u00e3\u00aa\nM\u00e0VF".length();
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
                    var4_3 = "\u00ab\u00b9\u0094\u0014{0\u00b0\u00e9\u009f\\;6v\u0010p\u00ea";
                    var5_4 = "\u00ab\u00b9\u0094\u0014{0\u00b0\u00e9\u009f\\;6v\u0010p\u00ea".length();
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
        w_0.e = var6_1;
        w_0.n = new Integer[11];
        w_0.p = new Color(w_0.b(17884, 3819912836176396638L), w_0.b(21088, 4276421137754281709L), w_0.b(21088, 4276421137754281709L));
        w_0.Y = new Color(w_0.b(28429, 6612226141153782661L), w_0.b(9033, 5422170035805169610L), w_0.b(9033, 5422170035805169610L));
        w_0.z = new Color(w_0.b(25893, 6732309691720065450L), w_0.b(1485, 1841200718260666700L), w_0.b(1485, 1841200718260666700L));
        w_0.S = new Color(w_0.b(28915, 2765777544771433592L), w_0.b(8446, 8315402648996652144L), w_0.b(8446, 8315402648996652144L));
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x48B;
        if (n[n11] == null) {
            w_0.n[n11] = (int)(e[n11] ^ l2);
        }
        return n[n11];
    }
}

