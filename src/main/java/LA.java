/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JProgressBar;

public class LA
extends JProgressBar {
    Color u;
    boolean o;
    private static final long[] a;
    private static final Integer[] b;

    public LA() {
        this.u = new Color(LA.a(20913, 3757011542104513651L), LA.a(1097, 7308383483538983305L), LA.a(17683, 7045710154577283282L));
        this.o = true;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        int n10;
        Graphics2D graphics2D;
        block3: {
            Graphics2D graphics2D2;
            block2: {
                graphics2D = (Graphics2D)graphics;
                float f10 = (float)this.getValue() / (float)this.getMaximum();
                int[] nArray = jx_0.O();
                n10 = (int)(f10 * (float)this.getWidth());
                graphics2D2 = graphics2D;
                if (nArray != null) break block2;
                graphics2D2.setColor((Color)this.u);
                if (!this.o) break block3;
                graphics2D2 = graphics2D;
            }
            graphics2D2.drawRect(1, 0, this.getWidth() - 2, this.getHeight() - 1);
        }
        Color color = new Color(LA.a(21902, 1904925436851820618L), LA.a(19557, 1141333931079172518L), LA.a(4195, 3399687477894700454L));
        graphics2D.setColor(color);
        graphics2D.fillRect(2, 1, n10, this.getHeight() - 2);
    }

    public boolean g() {
        return this.o;
    }

    public void T(boolean bl) {
        this.o = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7993357185177071810L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u0098*\u00f3\u00b0(\u00ba\u00b8\u00ae\u000f\u00ab\u00d87\u00eb\u00e7\u00f9\u00ff\u00e0\u009b\u00ba\u001c\u00adX\u00b1\u00b8#\u00fd\u007f>\u00f1e,'";
                var5_4 = "\u0098*\u00f3\u00b0(\u00ba\u00b8\u00ae\u000f\u00ab\u00d87\u00eb\u00e7\u00f9\u00ff\u00e0\u009b\u00ba\u001c\u00adX\u00b1\u00b8#\u00fd\u007f>\u00f1e,'".length();
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
                    var4_3 = "\u009a\u00df\u00e8[\u00d2\nm\u009b\u0013)\u0085\u00f2\u00f2c(<";
                    var5_4 = "\u009a\u00df\u00e8[\u00d2\nm\u009b\u0013)\u0085\u00f2\u00f2c(<".length();
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
        LA.a = var6_1;
        LA.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4DC1;
        if (b[n11] == null) {
            LA.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

