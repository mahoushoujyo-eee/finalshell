/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/*
 * Renamed from Bb
 */
public class bb_0
extends JLabel {
    float t;
    Color j;
    Color S;
    Color M;
    private static final long[] a;
    private static final Integer[] b;

    public bb_0() {
        this.j = new Color(bb_0.a(13150, 5018521600442028481L), bb_0.a(3250, 4933275102930693678L), bb_0.a(3250, 4933275102930693678L), bb_0.a(16264, 2382114477901208848L));
        this.S = new Color(bb_0.a(22997, 1285890374411270987L), bb_0.a(22997, 1285890374411270987L), bb_0.a(22997, 1285890374411270987L), bb_0.a(22997, 1285890374411270987L));
        this.M = new Color(bb_0.a(6491, 178927690734074816L), bb_0.a(22997, 1285890374411270987L), bb_0.a(19754, 8561380314086485943L), bb_0.a(25562, 1403116900173644099L));
        this.setHorizontalAlignment(2);
        this.setForeground(new Color(bb_0.a(30092, 3631477624986998557L), bb_0.a(8203, 8756770977363214993L), bb_0.a(8203, 8756770977363214993L)));
        this.setBorder(new EmptyBorder(0, 3, 0, 0));
    }

    @Override
    public void paint(Graphics graphics) {
        block9: {
            float f10;
            int n10;
            int n11;
            int n12;
            Graphics2D graphics2D;
            block7: {
                block8: {
                    int n13;
                    boolean bl;
                    block6: {
                        float f11;
                        float f12;
                        block4: {
                            block5: {
                                graphics2D = (Graphics2D)graphics;
                                f12 = this.t;
                                n12 = 0;
                                n11 = 0;
                                int n14 = 0;
                                boolean bl2 = false;
                                bl = xN.T();
                                n10 = (int)(((float)this.getWidth() - (float)bl2) * f12) + n14;
                                float f13 = f12 - 0.006f;
                                f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                if (!bl) break block4;
                                if (f11 <= 0) break block5;
                                f10 = 1.0f;
                                n13 = n10;
                                if (!bl) break block6;
                                if (n13 < f10) {
                                    n10 = (int)f10;
                                }
                            }
                            f11 = n12;
                        }
                        f10 = f11;
                        graphics2D.setColor((Color)this.M);
                        if (!bl) break block7;
                        float f14 = f12 - 0.0f;
                        n13 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    }
                    if (n13 <= 0) break block8;
                    graphics2D.fillRect(n11, (int)f10, n10, this.getHeight() - 2 * n12);
                    if (bl) break block9;
                }
                graphics2D.setColor((Color)this.j);
            }
            graphics2D.fillRect(n11, (int)f10, n10, this.getHeight() - 2 * n12);
        }
        super.paint(graphics);
    }

    public float Z() {
        return this.t;
    }

    public void F(float f10) {
        String string;
        this.t = f10;
        try {
            string = (String)lk_0.Q(100.0f * f10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string + "%";
        this.setText(string2);
        this.repaint();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 208316726611882267L;
                var6_1 = new long[9];
                var3_2 = 0;
                var4_3 = "\u00bd \u0016\u00b8wK\u00b0\u00ce\u001a\u00c8\u00c0V\u00af\u00e4\u00ec\u00c3\u0015\u00d7]\u0088\u00ec\u00d6J\u00e98Ju\u00f1wVs\u00cc+\u00ce\u009e6\u0092\\\u009e\u00fc\u00ed)=\u0003\u0003\u000f_\u00cfK\u001e\u00b9\u00ac\u00e1\u0081\u00e0 ";
                var5_4 = "\u00bd \u0016\u00b8wK\u00b0\u00ce\u001a\u00c8\u00c0V\u00af\u00e4\u00ec\u00c3\u0015\u00d7]\u0088\u00ec\u00d6J\u00e98Ju\u00f1wVs\u00cc+\u00ce\u009e6\u0092\\\u009e\u00fc\u00ed)=\u0003\u0003\u000f_\u00cfK\u001e\u00b9\u00ac\u00e1\u0081\u00e0 ".length();
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
                    var4_3 = "\u0017\u00ce\u008c\u00ed\u0000\u0099\u008a\u0098\u00db\u008b\u007f\u008c]X&@";
                    var5_4 = "\u0017\u00ce\u008c\u00ed\u0000\u0099\u008a\u0098\u00db\u008b\u007f\u008c]X&@".length();
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
        bb_0.a = var6_1;
        bb_0.b = new Integer[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6299;
        if (b[n11] == null) {
            bb_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

