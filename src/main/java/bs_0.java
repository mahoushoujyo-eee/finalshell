/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

/*
 * Renamed from Bs
 */
public class bs_0
extends AbstractBorder {
    Insets x;
    private static final long[] a;
    private static final Integer[] b;

    bs_0() {
        this.x = new Insets(1, 2, 2, 2);
    }

    @Override
    public void paintBorder(Component component, Graphics graphics, int n10, int n11, int n12, int n13) {
        Color color = new Color(bs_0.a(15512, 3715978757088061884L), bs_0.a(21472, 1580228450060256965L), bs_0.a(21472, 1580228450060256965L));
        Color color2 = new Color(bs_0.a(11102, 4168143159109041785L), bs_0.a(23122, 1107317908115738484L), bs_0.a(23122, 1107317908115738484L));
        int n14 = 0;
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setColor(color);
        graphics2D.drawRoundRect(0, 0, component.getWidth() - 1, component.getHeight() - 1, n14, n14);
        graphics2D.setColor(color2);
        graphics2D.drawRoundRect(1, 1, component.getWidth() - 3, component.getHeight() - 3, n14, n14);
    }

    @Override
    public Insets getBorderInsets(Component component) {
        return (Insets)this.x;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2517165282185918980L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00f1=^\u00e7\u0093\t\u00f5\u0096X{5\u00e3F\b\u0004\u009b";
                var5_4 = "\u00f1=^\u00e7\u0093\t\u00f5\u0096X{5\u00e3F\b\u0004\u009b".length();
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
                    var4_3 = "\u00cc\u00a1\u00a4\u00a3\u0004\u0082\u0093\u00c0\u00eb\u0014\u00e4X\u00f0m\u00fc\u00b9";
                    var5_4 = "\u00cc\u00a1\u00a4\u00a3\u0004\u0082\u0093\u00c0\u00eb\u0014\u00e4X\u00f0m\u00fc\u00b9".length();
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
        bs_0.a = var6_1;
        bs_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1526;
        if (b[n11] == null) {
            bs_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

