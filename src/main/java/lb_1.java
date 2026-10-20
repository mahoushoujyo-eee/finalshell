/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import org.icmp4j.j;

/*
 * Renamed from lB
 */
public class lb_1
extends JLabel
implements D2 {
    Stroke p;
    Stroke n;
    int S;
    KV F;
    GradientPaint V;
    String m;
    BufferedImage j;
    lt_2 v;
    ArrayList L;
    int O;
    int G;
    int E;
    int N;
    Color I;
    Color T;
    Stroke a;
    Color B;
    Color x;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long e;

    lb_1() {
        this.p = new BasicStroke(1.0f, 0, 2, 0.0f, new float[]{1.0f, 3.0f}, 0.0f);
        this.n = new BasicStroke();
        this.S = lb_1.a(25369, 4315237164798308267L);
        this.V = new GradientPaint(0.0f, 0.0f, new Color(lb_1.a(11483, 4314312832447455354L), lb_1.a(25410, 1745134311173255150L), lb_1.a(2724, 3776529092198368817L), 0), 0.0f, this.getHeight(), new Color(lb_1.a(22575, 6202721849032725660L), lb_1.a(3527, 673058504890122607L), lb_1.a(31438, 1393065375247693431L), lb_1.a(18452, 8065488692274283684L)));
        this.j = null;
        this.v = new lt_2(this, this);
        this.G = lb_1.a(21807, 8738511870531918212L);
        this.E = lb_1.a(12178, 5154324217557197623L);
        this.N = lb_1.a(14609, 8951047137774777773L);
        int n10 = te_1.t();
        this.I = new Color(lb_1.a(21786, 5046359897160964531L), lb_1.a(2418, 4220121464836851153L), lb_1.a(2418, 4220121464836851153L), lb_1.a(2418, 4220121464836851153L));
        int n11 = n10;
        this.T = new Color(lb_1.a(27259, 68306709545182915L), lb_1.a(21761, 5245268497494497701L), lb_1.a(21761, 5245268497494497701L));
        this.a = new BasicStroke(2.001f, 0, 2, 0.0f, new float[]{1.0f, 0.0f}, 0.0f);
        this.B = new Color(lb_1.a(17792, 7811713222664833343L), lb_1.a(25565, 7761385051285254002L), lb_1.a(2965, 8238076367790704416L), lb_1.a(13906, 5299682371043408626L));
        this.x = new Color(lb_1.a(2718, 5785183076659758628L), lb_1.a(16852, 4296967922548723045L), lb_1.a(12210, 8566842714953720582L), lb_1.a(30813, 4540674776980157670L));
        this.setOpaque(false);
        Cursor cursor = new Cursor(lb_1.a(14256, 1058038408501836567L));
        if (ky_2.F() != null) {
            te_1.O(++n11);
        }
    }

    public void F(KV kV, String string, ArrayList arrayList, int n10) {
        this.m = string;
        this.F = kV;
        this.L = arrayList;
        this.O = n10;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        block11: {
            block10: {
                int n10;
                block9: {
                    n10 = te_1.i();
                    if (n10 != 0) break block9;
                    if (dd_1.x) {
                        try {
                            this.v.a(graphics);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block10;
                }
                if (n10 == 0) break block11;
            }
            try {
                this.h(graphics);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void h(Graphics graphics) {
        int n10;
        Object object;
        long l2;
        Color color = new Color(lb_1.a(13300, 4132117043855834947L), 0, 0, 0);
        Graphics2D graphics2D = (Graphics2D)graphics;
        int n11 = te_1.i();
        graphics2D.setColor((Color)this.T);
        graphics2D.setPaint((GradientPaint)this.V);
        if ((KV)this.F == null) {
            return;
        }
        long l3 = 0L;
        long l4 = e;
        Object object2 = this;
        if (n11 == 0) {
            if (object2.O == 0) {
                l3 = 0L;
                l4 = 0L;
            }
            object2 = ((ArrayList)this.L).clone();
        }
        ArrayList arrayList = (ArrayList)object2;
        int n12 = 0;
        int n13 = 0;
        while (n13 < arrayList.size()) {
            block20: {
                long l5;
                block18: {
                    block19: {
                        if (n13 > (this.getWidth() - this.E) / this.S) {
                            // empty if block
                        }
                        j j2 = (j)arrayList.get(arrayList.size() - n13 - 1);
                        long l6 = (long)j2.r() - l3;
                        l5 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                        if (n11 == 0) {
                            if (l5 > 0) {
                                l3 = j2.r();
                            }
                            l5 = (long)j2.q();
                        }
                        if (n11 != 0) break block18;
                        if (l5 == false) break block19;
                        long l7 = (long)j2.r() - l4;
                        l5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (n11 != 0) break block18;
                        if (l5 < 0) {
                            l4 = j2.r();
                        }
                    }
                    ++n12;
                    if (n11 != 0) break block20;
                    l5 = n12;
                }
                if (l5 > (this.getWidth() - this.E) / this.S && n11 == 0) break;
                ++n13;
            }
            if (n11 == 0) continue;
        }
        if ((l2 = l4) == 0L) {
            // empty if block
        }
        long l8 = l3;
        long l9 = l3 - l2;
        int n14 = 0;
        int n15 = this.getWidth();
        graphics2D.setStroke((Stroke)this.a);
        for (int i2 = arrayList.size() - 1; i2 > -1 && i2 <= arrayList.size() - 1; --i2) {
            block23: {
                block21: {
                    block22: {
                        int n16;
                        object = (j)arrayList.get(i2);
                        n10 = 0;
                        n15 = this.getWidth() - n14 * this.S - 2;
                        int n17 = n16 = (int)((long)((j)object).r() - l4);
                        if (n11 == 0) {
                            if (n17 < 0) {
                                n16 = 0;
                            }
                            n17 = (int)((float)(this.getHeight() - this.N) * ((float)n16 / (float)l9));
                        }
                        int n18 = n17;
                        int n19 = this.getHeight() - n18 - this.N;
                        if (n11 != 0) break block21;
                        if (!((j)object).q()) break block22;
                        graphics2D.setColor((Color)this.x);
                        graphics2D.drawLine(n15, this.getHeight() - n10, n15, n19);
                        if (n11 == 0) break block23;
                    }
                    graphics2D.setColor(color);
                }
                graphics2D.drawLine(n15, this.getHeight() - n10, n15, 0);
            }
            if (n15 < this.E && n11 == 0) break;
            ++n14;
            if (n11 == 0) continue;
        }
        graphics2D.setStroke((Stroke)this.n);
        object = new Color(0, 0, 0, lb_1.a(6030, 1144343285352536864L));
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        n10 = 1;
        graphics2D.setStroke((Stroke)this.p);
        graphics2D.setColor((Color)this.I);
        graphics2D.drawLine(this.getWidth(), n10, this.E - 5, n10);
        graphics2D.setColor((Color)object);
        graphics2D.drawString(l8 + "", 3, lb_1.a(24798, 2534123797686512744L));
        n10 = (this.getHeight() - this.N) / 2 + 1;
        graphics2D.setStroke((Stroke)this.p);
        graphics2D.setColor((Color)this.I);
        graphics2D.drawLine(this.getWidth(), n10, this.E - 5, n10);
        graphics2D.setColor((Color)object);
        String string = (float)(l2 + l8) / 2.0f + "";
        string = string.replace(b, "");
        graphics2D.drawString(string + "", 3, n10 + 4);
        n10 = this.getHeight() - this.N - 1;
        graphics2D.setStroke((Stroke)this.p);
        graphics2D.setColor((Color)this.I);
        graphics2D.drawLine(this.getWidth(), n10, this.E - 5, n10);
        graphics2D.setColor((Color)object);
        graphics2D.drawString(l2 + "", 3, n10 + 4);
        graphics2D.setStroke((Stroke)this.n);
        Color color2 = new Color(lb_1.a(12795, 335339531481234777L), lb_1.a(30635, 4319911848219671318L), lb_1.a(2418, 4220121464836851153L), lb_1.a(13721, 8968643417549912371L));
        graphics2D.setColor(color2);
        graphics2D.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
        graphics2D.setColor(new Color(lb_1.a(26732, 6662887993114485970L), lb_1.a(17210, 7978916044675600279L), lb_1.a(25754, 3550378253059188796L)));
        graphics2D.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, this.getHeight() - 1);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block20: {
                block19: {
                    block21: {
                        break block21;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    v0 = "\u001f\u0014".toCharArray();
                    v1 = v0.length;
                    var10 = 0;
                    v2 = 70;
                    v3 = v0;
                    v4 = v1;
                    if (v1 > 1) ** GOTO lbl54
                    do {
                        v5 = v2;
                        v3 = v3;
                        v6 = v3;
                        v7 = v2;
                        v8 = var10;
                        while (true) {
                            switch (var10 % 7) {
                                case 0: {
                                    v9 = 119;
                                    break;
                                }
                                case 1: {
                                    v9 = 98;
                                    break;
                                }
                                case 2: {
                                    v9 = 123;
                                    break;
                                }
                                case 3: {
                                    v9 = 19;
                                    break;
                                }
                                case 4: {
                                    v9 = 122;
                                    break;
                                }
                                case 5: {
                                    v9 = 121;
                                    break;
                                }
                                default: {
                                    v9 = 26;
                                }
                            }
                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                            ++var10;
                            v2 = v5;
                            if (v5 != 0) break;
                            v5 = v2;
                            v3 = v3;
                            v8 = v2;
                            v6 = v3;
                            v7 = v2;
                        }
lbl54:
                        // 2 sources

                        v10 = v3;
                        v4 = v4;
                    } while (v4 > var10);
                    ** while (true)
                    lb_1.b = new String(v10).intern();
                    var2_1 = 6680821250060160686L;
                    var8_2 = new long[33];
                    var5_3 = 0;
                    var6_4 = "\u00d1y\u00b2\u0081\u00e7\u0003\t\u009a\u0083]S\u0096\u00ae\u00c2-z`\u0016\u0013b0\u00ea\u00b1\u0012\u00bc\u0093\u000b\u00e3 @b\u00cc\t\"\u000e@\u00e3tCI\u00a6\u00f7\u00a6\u001fSG\u00caL\u0099\u00a3\u000b\u00a3M\u0091\u00da\u00d3\u00be\u0099L\u0084P\u00eaa\u0007\u009e\u0083\u008f\u0003\u00ef\u0095\u00f5:\u0007t\u0097\u001c\u00bf`;\fg\u00a9\u00c6\u00cbe\u009fG\u0085(\u00b3{\u00e4\u00cezj\u00ae\u00c5\u00abi\u00d41?x#\u00ac\u009e\u0014\u00a7\u00ef\u0080\u00e8\u009d6\u0087(\u001a;\u00cd\u00fa\u0018\u00fd\u0098\u00c47\u00ad_\u0088\u00b6\u00a8\u00a61\u000f\u00e5\u0007-\u0087h4\u00d4+\u00a1\u0003W\u00fb\u00eb\u00c6[\u009f`\u00cf5\u00b5(\u0001\f\u0002\u0016j\u00e6t\u00ad\u00e2;TzG.\u0019\u0083\u0086\u00a4:U\u00c6\u00b4\u0006y\u00d3O\u00ef=-\u008b\u00e9\u00f6;\u00deC<\u00a23\u00b1\u0091m\u00bc\u00d0\u009e:A\u00d8Z\u0019\u00807'da\u00b5 =`\u00bf\u00ebU\u00e1\u00b8\u0012mH\u00a1y=\u0015h\u0092\u00a8\u009d8>\u00b9\u00d7\u008b\u00d0?\u00b4| \u00bf\u008f>\u00d8nw~\u00ad!W;";
                    var7_5 = "\u00d1y\u00b2\u0081\u00e7\u0003\t\u009a\u0083]S\u0096\u00ae\u00c2-z`\u0016\u0013b0\u00ea\u00b1\u0012\u00bc\u0093\u000b\u00e3 @b\u00cc\t\"\u000e@\u00e3tCI\u00a6\u00f7\u00a6\u001fSG\u00caL\u0099\u00a3\u000b\u00a3M\u0091\u00da\u00d3\u00be\u0099L\u0084P\u00eaa\u0007\u009e\u0083\u008f\u0003\u00ef\u0095\u00f5:\u0007t\u0097\u001c\u00bf`;\fg\u00a9\u00c6\u00cbe\u009fG\u0085(\u00b3{\u00e4\u00cezj\u00ae\u00c5\u00abi\u00d41?x#\u00ac\u009e\u0014\u00a7\u00ef\u0080\u00e8\u009d6\u0087(\u001a;\u00cd\u00fa\u0018\u00fd\u0098\u00c47\u00ad_\u0088\u00b6\u00a8\u00a61\u000f\u00e5\u0007-\u0087h4\u00d4+\u00a1\u0003W\u00fb\u00eb\u00c6[\u009f`\u00cf5\u00b5(\u0001\f\u0002\u0016j\u00e6t\u00ad\u00e2;TzG.\u0019\u0083\u0086\u00a4:U\u00c6\u00b4\u0006y\u00d3O\u00ef=-\u008b\u00e9\u00f6;\u00deC<\u00a23\u00b1\u0091m\u00bc\u00d0\u009e:A\u00d8Z\u0019\u00807'da\u00b5 =`\u00bf\u00ebU\u00e1\u00b8\u0012mH\u00a1y=\u0015h\u0092\u00a8\u009d8>\u00b9\u00d7\u008b\u00d0?\u00b4| \u00bf\u008f>\u00d8nw~\u00ad!W;".length();
                    var4_6 = 0;
                    while (true) {
                        var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                        v11 = var8_2;
                        v12 = var5_3++;
                        v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                        v14 = -1;
                        break block19;
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        var6_4 = "\u00b0\u00c1N\\U\u0082\u00b7\u00f96Gy\u00a9\u0099\u00de\bj";
                        var7_5 = "\u00b0\u00c1N\\U\u0082\u00b7\u00f96Gy\u00a9\u0099\u00de\bj".length();
                        var4_6 = 0;
                        while (true) {
                            var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                            v11 = var8_2;
                            v12 = var5_3++;
                            v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                            v14 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl88:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        break block20;
                        break;
                    }
                }
                v15 = v13 ^ var2_1;
                switch (v14) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl99:
                    // 1 sources

                    ** continue;
                }
            }
            lb_1.c = var8_2;
            lb_1.d = new Integer[33];
            break block22;
lbl104:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_8 = 8679639145912536567L;
        ** while (true)
        lb_1.e = 8679639145912536067L ^ var0_8;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xCB5;
        if (d[n11] == null) {
            lb_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

