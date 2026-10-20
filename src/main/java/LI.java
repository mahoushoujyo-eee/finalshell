/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class LI
extends JLabel {
    boolean z;
    kl_0 J;
    private static final long[] a;
    private static final Integer[] b;

    public LI() {
        this.z = false;
    }

    @Override
    public void paint(Graphics graphics) {
        LI lI;
        block6: {
            block7: {
                int n10;
                int n11;
                int n12;
                int n13;
                Graphics2D graphics2D;
                block8: {
                    Color color;
                    block9: {
                        long l2;
                        long l3;
                        graphics2D = (Graphics2D)graphics;
                        boolean bl = s.p();
                        lI = this;
                        if (bl) break block6;
                        if ((kl_0)lI.J == null) break block7;
                        lI = this;
                        if (bl) break block6;
                        if (!lI.z) break block7;
                        color = new Color(LI.a(14128, 5120093020140478051L), LI.a(22044, 7117432141894647630L), LI.a(3014, 3587927999217345174L), LI.a(25358, 3707060545719781983L));
                        graphics2D.setColor(color);
                        try {
                            l3 = (Long)this.J.R();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            l2 = (Long)this.J.q();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        float f10 = (float)l3 / (float)l2;
                        n13 = 2;
                        n12 = 2;
                        int n14 = 0;
                        int n15 = 2;
                        n11 = (int)(((float)this.getWidth() - (float)n15) * f10) + n14;
                        n10 = n13;
                        if (bl) break block8;
                        if (!(f10 > 0.0f)) break block9;
                        graphics2D.fillRect(this.getWidth() - n11 - n12, n10, n11, this.getHeight() - 2 * n13);
                        if (!bl) break block7;
                    }
                    graphics2D.setColor(color);
                }
                graphics2D.fillRect(this.getWidth() - n11 - n12, n10, n11, this.getHeight() - 2 * n13);
            }
            lI = this;
        }
        super.paint(graphics);
    }

    public boolean X() {
        return this.z;
    }

    public void R(boolean bl) {
        this.z = bl;
    }

    public kl_0 Y() {
        return (kl_0)this.J;
    }

    public void e(kl_0 kl_02) {
        this.J = kl_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 9081866470908194073L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "/\u00f4i\u001frms \u009ag\u0016c\u00c2\u0090\u0092\u00fd";
                var5_4 = "/\u00f4i\u001frms \u009ag\u0016c\u00c2\u0090\u0092\u00fd".length();
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
                    var4_3 = "\u00b3&\u00b2V\u00ec}'\u0016QM\u00c9\u00abq\u0004O\u0019";
                    var5_4 = "\u00b3&\u00b2V\u00ec}'\u0016QM\u00c9\u00abq\u0004O\u0019".length();
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
        LI.a = var6_1;
        LI.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2953;
        if (b[n11] == null) {
            LI.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

