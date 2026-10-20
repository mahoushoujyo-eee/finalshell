/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.dnd.Autoscroll;
import javax.swing.JTree;

/*
 * Renamed from ma
 */
public class ma_0
extends JTree
implements Autoscroll {
    private int t;
    final WY p;
    private static final long[] a;
    private static final Integer[] b;

    public ma_0(WY wY) {
        this.p = wY;
        this.t = ma_0.a(4158, 4417524758015965507L);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void autoscroll(Point var1_1) {
        block6: {
            block4: {
                block5: {
                    var3_2 = this.getRowForLocation(var1_1.x, var1_1.y);
                    var2_3 = a3.I();
                    var4_4 = this.getBounds();
                    v0 = var1_1.y + var4_4.y;
                    v1 = this.t;
                    if (var2_3 == null) break block4;
                    if (v0 > v1) break block5;
                    v2 = var3_2;
                    v3 = 1;
                    if (var2_3 == null) ** GOTO lbl16
                    if (v2 < v3) {
                        v4 = 0;
                    } else {
                        v2 = var3_2;
                        v3 = 1;
lbl16:
                        // 2 sources

                        v4 = v2 - v3;
                    }
                    break block6;
                }
                v0 = var3_2;
                v1 = this.getRowCount() - 1;
            }
            if (var2_3 == null) ** GOTO lbl26
            if (v0 < v1) {
                v0 = var3_2;
                v1 = 1;
lbl26:
                // 2 sources

                v4 = v0 + v1;
            } else {
                v4 = var3_2;
            }
        }
        var3_2 = v4;
        this.scrollRowToVisible(var3_2);
    }

    @Override
    public Insets getAutoscrollInsets() {
        Rectangle rectangle = this.getBounds();
        Rectangle rectangle2 = this.getParent().getBounds();
        return new Insets(rectangle2.y - rectangle.y + this.t, rectangle2.x - rectangle.x + this.t, rectangle.height - rectangle2.height - rectangle2.y + rectangle.y + this.t, rectangle.width - rectangle2.width - rectangle2.x + rectangle.x + this.t);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Rectangle rectangle = this.getBounds();
        Rectangle rectangle2 = this.getParent().getBounds();
        graphics.setColor(Color.red);
        graphics.drawRect(-rectangle.x + ma_0.a(12543, 7818527805531380096L), -rectangle.y + ma_0.a(4158, 4417524758015965507L), rectangle2.width - ma_0.a(1836, 321678234831351376L), rectangle2.height - ma_0.a(7680, 130109224610264958L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4247185512232968962L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00ea\u00d8h\u000b\u00e4\u00e2\u00ba\u008e\u0094\u009722\u00051\u0094d";
                var5_4 = "\u00ea\u00d8h\u000b\u00e4\u00e2\u00ba\u008e\u0094\u009722\u00051\u0094d".length();
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
                    var4_3 = "\u0088R\u0080\u00e2C\u00dc\u001aMs\u009d\u00ea\u00dc\u00f0\u00cc\rJ";
                    var5_4 = "\u0088R\u0080\u00e2C\u00dc\u001aMs\u009d\u00ea\u00dc\u00f0\u00cc\rJ".length();
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
        ma_0.a = var6_1;
        ma_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x697F;
        if (b[n11] == null) {
            ma_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

