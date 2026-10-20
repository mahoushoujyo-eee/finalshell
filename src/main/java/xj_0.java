/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;

/*
 * Renamed from xj
 */
public class xj_0
extends JLabel
implements D2 {
    Stroke x;
    Stroke k;
    int r;
    KV w;
    GradientPaint H;
    ui_1 A;
    ui_1 a;
    String z;
    lt_2 Z;
    BufferedImage e;
    Dimension o;
    Stroke R;
    Color Q;
    Color W;
    Color X;
    Color p;
    Color J;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    xj_0() {
        this.x = new BasicStroke(1.0f, 0, 2, 0.0f, new float[]{1.0f, 3.0f}, 0.0f);
        this.k = new BasicStroke();
        this.r = xj_0.a(6062, 2113519868337587071L);
        this.A = new ui_1();
        this.Z = new lt_2(this, this);
        this.H = new GradientPaint(0.0f, 0.0f, new Color(xj_0.a(31275, 4922603460944064251L), xj_0.a(7690, 4320372905290042066L), xj_0.a(4200, 4988147908339696815L), 0), 0.0f, this.getHeight(), new Color(xj_0.a(1653, 1586914350257738408L), xj_0.a(3099, 4556190178524010697L), xj_0.a(28690, 6163745976245282007L), xj_0.a(28319, 1387109219823778373L)));
        this.e = null;
        this.o = new Dimension();
        this.R = new BasicStroke(2.001f, 0, 2, 0.0f, new float[]{1.0f, 0.0f}, 0.0f);
        this.Q = new Color(xj_0.a(23694, 6509328846656325708L), xj_0.a(918, 7646675054754994002L), xj_0.a(918, 7646675054754994002L), xj_0.a(918, 7646675054754994002L));
        this.W = new Color(xj_0.a(973, 2965697177489577752L), xj_0.a(5805, 6840397145967952505L), xj_0.a(9780, 4365790283899548415L), xj_0.a(23398, 2704152277954351033L));
        this.X = new Color(xj_0.a(32426, 5962152936759945849L), xj_0.a(918, 7646675054754994002L), xj_0.a(5805, 6840397145967952505L), xj_0.a(32385, 4868675356346378823L));
        this.p = new Color(0, 0, 0, xj_0.a(16218, 1550401298067434372L));
        this.J = new Color(xj_0.a(23398, 2704152277954351033L), xj_0.a(13392, 289604341909692561L), xj_0.a(918, 7646675054754994002L), xj_0.a(5805, 6840397145967952505L));
        Cursor cursor = new Cursor(xj_0.a(23165, 7396942444530650814L));
        this.setCursor(cursor);
        this.addMouseListener(new kh_0(this));
    }

    public void p(KV kV, ui_1 ui_12, String string) {
        this.w = kV;
        this.z = string;
        this.a = ui_12;
        this.repaint();
    }

    @Override
    public void paint(Graphics graphics) {
        block11: {
            block10: {
                String[] stringArray;
                block9: {
                    stringArray = KV.b();
                    if (stringArray != null) break block9;
                    if (dd_1.x) {
                        try {
                            this.Z.a(graphics);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block10;
                }
                if (stringArray == null) break block11;
            }
            try {
                this.h(graphics);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void h(Graphics var1_1) {
        block34: {
            block33: {
                block32: {
                    block36: {
                        block35: {
                            var3_2 = (int)((float)this.getHeight() / 3.0f);
                            var4_3 = xj_0.a(25240, 2436569347552998993L);
                            var2_4 = KV.b();
                            var5_5 = (Graphics2D)var1_1;
                            var5_5.setPaint((GradientPaint)this.H);
                            var5_5.fillRect(0, 0, this.getWidth(), this.getHeight());
                            v0 = this;
                            if (var2_4 == null) {
                                if ((KV)v0.w == null) {
                                    return;
                                }
                                v0 = this;
                            }
                            v1 = var6_6 = (ui_1)v0.a;
                            if (var2_4 != null) break block35;
                            if (v1 != null) break block36;
                            v1 = (ui_1)this.A;
                        }
                        var6_6 = v1;
                    }
                    var7_7 = xj_0.d;
                    var9_8 = 0;
                    try {
                        v2 = (ArrayList)var6_6.I();
                    }
                    catch (InvocationTargetException v3) {
                        throw v3.getTargetException();
                    }
                    var10_9 = v2;
                    var11_10 = 0;
                    while (var11_10 < var10_9.size()) {
                        block38: {
                            block37: {
                                v4 = var11_10;
                                if (var2_4 != null) break block32;
                                if (v4 > (this.getWidth() - var4_3) / this.r && var2_4 == null) break;
                                var12_12 = (Long)var10_9.get(var10_9.size() - var11_10 - 1);
                                v5 = var12_12 == var7_7 ? 0 : (var12_12 < var7_7 ? -1 : 1);
                                if (var2_4 != null) break block37;
                                if (v5 > 0) {
                                    var7_7 = var12_12;
                                }
                                ++var9_8;
                                if (var2_4 != null) break block38;
                                v5 = var9_8;
                            }
                            if (v5 > (this.getWidth() - var4_3) / this.r && var2_4 == null) break;
                            ++var11_10;
                        }
                        if (var2_4 == null) continue;
                    }
                    v4 = 0;
                }
                var9_8 = v4;
                try {
                    v6 = (ArrayList)var6_6.k();
                }
                catch (InvocationTargetException v7) {
                    throw v7.getTargetException();
                }
                var11_11 = v6;
                var12_13 = 0;
                while (var12_13 < var11_11.size()) {
                    block40: {
                        block39: {
                            v8 = var12_13;
                            v9 = (this.getWidth() - var4_3) / this.r;
                            if (var2_4 != null) break block33;
                            if (v8 > v9 && var2_4 == null) break;
                            var13_14 = (Long)var11_11.get(var11_11.size() - var12_13 - 1);
                            v10 = var13_14 == var7_7 ? 0 : (var13_14 < var7_7 ? -1 : 1);
                            if (var2_4 != null) break block39;
                            if (v10 > 0) {
                                var7_7 = var13_14;
                            }
                            ++var9_8;
                            if (var2_4 != null) break block40;
                            v10 = var9_8;
                        }
                        if (v10 > (this.getWidth() - var4_3) / this.r && var2_4 == null) break;
                        ++var12_13;
                    }
                    if (var2_4 == null) continue;
                }
                v8 = this.getHeight();
                v9 = var3_2;
            }
            var12_13 = v8 - v9;
            var5_5.setStroke((Stroke)this.x);
            block8: while (true) {
                block41: {
                    var5_5.setColor((Color)this.Q);
                    var5_5.drawLine(this.getWidth(), var12_13, var4_3 - 5, var12_13);
                    var5_5.setFont((Font)fx_2.X);
                    var5_5.setColor(Color.white);
                    if ((var12_13 -= var3_2) <= 0) break block41;
                    v11 = var12_13;
                    if (var2_4 != null) ** GOTO lbl93
                    if (v11 <= 3) {
                        var12_13 = 1;
                    }
                }
                do {
                    v11 = var12_13;
lbl93:
                    // 2 sources

                    if (v11 >= 0) continue block8;
                } while (var2_4 != null);
                break;
            }
            var13_15 = 0;
            var14_16 = var10_9.size() - 1;
            var15_17 = this.getWidth();
            var5_5.setStroke((Stroke)this.R);
            while (var14_16 > -1) {
                v12 = var14_16;
                v13 = var10_9.size() - 1;
                if (var2_4 == null && var2_4 == null) {
                    if (v12 > v13) break;
                    var16_18 = (Long)var10_9.get(var14_16);
                    var18_20 = (Long)var11_11.get(var14_16);
                    var20_22 = 1;
                    var15_17 = this.getWidth() - var13_15 * this.r - 2;
                    var21_23 = (int)((float)this.getHeight() * ((float)var18_20 / (float)var7_7));
                    var22_24 = this.getHeight() - var21_23;
                    var5_5.setColor((Color)this.X);
                    var5_5.drawLine(var15_17, this.getHeight() - var20_22, var15_17, var22_24 - var20_22);
                    var21_23 = (int)((float)this.getHeight() * ((float)var16_18 / (float)var7_7));
                    var22_24 = this.getHeight() - var21_23;
                    var5_5.setColor((Color)this.W);
                    var5_5.drawLine(var15_17, this.getHeight() - var20_22, var15_17, var22_24 - var20_22);
                    if (var2_4 == null) {
                        if (var15_17 < var4_3 && var2_4 == null) break;
                        ++var13_15;
                        --var14_16;
                    }
                    if (var2_4 == null) continue;
                }
                break block34;
            }
            var5_5.setStroke((Stroke)this.k);
            v12 = this.getHeight();
            v13 = var3_2;
        }
        var12_13 = v12 - v13;
        var5_5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        do {
            var16_19 = this.getHeight() - var12_13;
            var17_25 = (int)((float)var16_19 * ((float)var7_7 / (float)this.getHeight()));
            var5_5.setFont((Font)fx_2.X);
            var5_5.setColor(new Color(xj_0.a(16507, 4264158472167838899L), xj_0.a(3099, 4556190178524010697L), xj_0.a(3099, 4556190178524010697L), xj_0.a(2062, 6319721500193692889L)));
            try {
                v14 = (String)lk_0.h(var17_25);
            }
            catch (InvocationTargetException v15) {
                throw v15.getTargetException();
            }
            var18_21 = v14;
            var5_5.setColor((Color)this.p);
            var5_5.drawString(var18_21, 3, var12_13 + xj_0.a(9028, 4038164815051995032L));
            if ((var12_13 -= var3_2) <= xj_0.a(6596, 212298015292099844L)) {
                if (var2_4 != null) continue;
                var12_13 += 2;
            }
            if (var12_13 < 0 && var2_4 == null) break;
        } while (var2_4 == null);
        var5_5.setStroke((Stroke)this.k);
        var5_5.setColor((Color)this.J);
        var5_5.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
        var5_5.setColor(new Color(xj_0.a(27039, 9185965785020595526L), xj_0.a(21561, 4895245156347363554L), xj_0.a(32717, 7114266256672353051L)));
        var5_5.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, this.getHeight() - 1);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 7486166598590862314L;
                    var8_1 = new long[27];
                    var5_2 = 0;
                    var6_3 = "<;1\u009d\u00f7\u0099\u0010\u0097\u00d8\u0000ZU\u00e5\u00ca\u00fd\u00dc@\u00c5\u00e1krG\u00f9i\u0099F\u00d8\u00b8Fk\u000b\u00dc\u0001\u00fb\u0090\u0095\u0011\u00c2\u0004\u00e6\u0003\u00d1-\u00bd\u00fec\u0011\u00f7\u00c7\u0088\u0099\u0098<\u0016\u008fW\u00b5F\u00b0\u00f4\f\u00e7\u00f8\u0017\tG\f\u00b3\u00e9ln~\u008e\u00f9\u00af\u00b4\u00fbn\u0019\u00cd\u00b9T?\u00e1>\u00eeS\u00e9u\u00a4\u0088K\u00de$\u00e9\u00e9\u008d\u0005$+>r\u0001\u00a3NVP\u00bf\u00b7\u00c0\u00a4u\u0097\u0006U\u0095\u00cco\\\u0015F\u0012\u00b0\u00b9\u0080\u00fa8\u0088\u00aa&\u0081\u0087\u00f2\u00973\u00f9\u0007\r\u00d4\u00ac*f\u009e\u00e4X\u001eH\u00b5\u00c8%]X\u0083\u0099\u00f5\u0004\u00b9@[0\u00ec\u00c21\u00fcQ\u00b0\u00f7\u00c7\u001c\u009f\u00e0Ci\u00e4\u0004.\u0085.:\u00da\u0085\u00d5\u0017\u00b0\u000e?\u00b4\u00c2S\u00dey\u00d5^\u0006B\u0018\u00d9\u00e7e\u0098";
                    var7_4 = "<;1\u009d\u00f7\u0099\u0010\u0097\u00d8\u0000ZU\u00e5\u00ca\u00fd\u00dc@\u00c5\u00e1krG\u00f9i\u0099F\u00d8\u00b8Fk\u000b\u00dc\u0001\u00fb\u0090\u0095\u0011\u00c2\u0004\u00e6\u0003\u00d1-\u00bd\u00fec\u0011\u00f7\u00c7\u0088\u0099\u0098<\u0016\u008fW\u00b5F\u00b0\u00f4\f\u00e7\u00f8\u0017\tG\f\u00b3\u00e9ln~\u008e\u00f9\u00af\u00b4\u00fbn\u0019\u00cd\u00b9T?\u00e1>\u00eeS\u00e9u\u00a4\u0088K\u00de$\u00e9\u00e9\u008d\u0005$+>r\u0001\u00a3NVP\u00bf\u00b7\u00c0\u00a4u\u0097\u0006U\u0095\u00cco\\\u0015F\u0012\u00b0\u00b9\u0080\u00fa8\u0088\u00aa&\u0081\u0087\u00f2\u00973\u00f9\u0007\r\u00d4\u00ac*f\u009e\u00e4X\u001eH\u00b5\u00c8%]X\u0083\u0099\u00f5\u0004\u00b9@[0\u00ec\u00c21\u00fcQ\u00b0\u00f7\u00c7\u001c\u009f\u00e0Ci\u00e4\u0004.\u0085.:\u00da\u0085\u00d5\u0017\u00b0\u000e?\u00b4\u00c2S\u00dey\u00d5^\u0006B\u0018\u00d9\u00e7e\u0098".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "\u0018\u00b9\u0019V\u0011\u00eeG\u00a6\u00f8\u001d[;}\u00c8!\u0001";
                        var7_4 = "\u0018\u00b9\u0019V\u0011\u00eeG\u00a6\u00f8\u001d[;}\u00c8!\u0001".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
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
            xj_0.b = var8_1;
            xj_0.c = new Integer[27];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 2403478032287123105L;
        ** while (true)
        xj_0.d = 2403478032287123115L ^ var0_7;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x14D1;
        if (c[n11] == null) {
            xj_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

