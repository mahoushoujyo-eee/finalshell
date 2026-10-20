/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YM;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

/*
 * Renamed from com.lx
 */
class lx_2
implements Icon {
    final YM k;
    private static final long[] a;
    private static final Integer[] b;

    lx_2(YM yM) {
        this.k = yM;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int n10, int n11) {
        if (YM.O(this.k) != null) {
            Graphics2D graphics2D = (Graphics2D)graphics;
            graphics2D.setPaint(Color.BLACK);
            graphics2D.drawRect(n10, n11, lx_2.a(6128, 1208588880344985760L), lx_2.a(2447, 5313736253602836184L));
            graphics2D.setPaint(Color.WHITE);
            graphics2D.drawRect(n10 + 1, n11 + 1, lx_2.a(1802, 5677968033197269084L), lx_2.a(15881, 7951179266183371100L));
            graphics2D.setPaint(YM.O(this.k));
            graphics2D.fillRect(n10 + 2, n11 + 2, lx_2.a(3557, 2920510128524995252L), lx_2.a(29210, 6261549951566206280L));
        }
    }

    @Override
    public int getIconWidth() {
        return lx_2.a(4515, 1740688611933959920L);
    }

    @Override
    public int getIconHeight() {
        return lx_2.a(13821, 8312665302388314793L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5255419814602072006L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u00c2\u001a\u000fi\u00f0\u0003\u00e9&\u00e7\u0089\u00fa\u00e5d\u0090\n\u00820\u0089\u00cbZ\u001fNu~\t\u00c0\u00d6\u001c\u00f6\u0094\u00efibEY\u00c88\u00fbq\u00114\u00d4\u00ef\u00c7\u00caX\u00ff\u0097";
                var5_4 = "\u00c2\u001a\u000fi\u00f0\u0003\u00e9&\u00e7\u0089\u00fa\u00e5d\u0090\n\u00820\u0089\u00cbZ\u001fNu~\t\u00c0\u00d6\u001c\u00f6\u0094\u00efibEY\u00c88\u00fbq\u00114\u00d4\u00ef\u00c7\u00caX\u00ff\u0097".length();
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
                    var4_3 = "\u00a4Z\u00ee\u00bf@\u00a8F\u0097\u00d2\u00a3\u00cci\u00cfu\u00cd\u007f";
                    var5_4 = "\u00a4Z\u00ee\u00bf@\u00a8F\u0097\u00d2\u00a3\u00cci\u00cfu\u00cd\u007f".length();
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
        lx_2.a = var6_1;
        lx_2.b = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2753;
        if (b[n11] == null) {
            lx_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

