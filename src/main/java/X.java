/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPanel;

class X
extends JPanel {
    Color o;
    Color u;
    final u6_0 q;
    final U S;
    private static final long[] a;
    private static final Integer[] b;

    X(U u10, LayoutManager layoutManager, u6_0 u6_02) {
        this.S = u10;
        this.q = u6_02;
        super(layoutManager);
        this.o = new Color(X.a(11358, 8756166312212592970L), X.a(21513, 162557676342509854L), X.a(21513, 162557676342509854L));
        this.u = new Color(X.a(1565, 4617671624137626379L), X.a(19849, 7124401421776230555L), X.a(19849, 7124401421776230555L));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        int n10;
        block8: {
            block6: {
                Color color;
                block7: {
                    ArrayList arrayList;
                    String[] stringArray = F8.y();
                    super.paintComponent(graphics);
                    String[] stringArray2 = stringArray;
                    Graphics2D graphics2D = (Graphics2D)graphics;
                    color = (Color)this.o;
                    if (stringArray2 != null) break block6;
                    if ((aM)this.S.C == null) break block7;
                    try {
                        arrayList = (ArrayList)this.S.C.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n10 = arrayList.size();
                    if (stringArray2 != null) break block8;
                    if (n10 > 0) {
                        color = (Color)this.u;
                    }
                }
                graphics.setColor(color);
            }
            n10 = 3;
        }
        int n11 = n10;
        graphics.drawLine(0, this.getHeight() - n11, this.getWidth(), this.getHeight() - n11);
    }

    @Override
    public void paint(Graphics graphics) {
        block5: {
            boolean bl;
            u6_0 u6_02;
            block4: {
                String[] stringArray = F8.y();
                super.paint(graphics);
                String[] stringArray2 = stringArray;
                u6_02 = (u6_0)this.q;
                if (stringArray2 != null) break block4;
                if (u6_02 == null) break block5;
                u6_02 = (u6_0)this.q;
            }
            try {
                bl = (Boolean)u6_02.B();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl) {
                graphics.setColor(new Color(X.a(4779, 7555857428914292664L), X.a(5565, 8906316268934283432L), X.a(5565, 8906316268934283432L)));
                graphics.drawLine(0, 0, 0, this.getHeight() - 3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8970885630801764745L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "}\u00e0\u0086\u0088\u00fe\u0087\u00b2(\u0097x q\u00f9p\u00e0_\u00f8J?\u0099\u00f94\u0018\u000b\u00a3~cr\u00eb\u0084!\u00c7";
                var5_4 = "}\u00e0\u0086\u0088\u00fe\u0087\u00b2(\u0097x q\u00f9p\u00e0_\u00f8J?\u0099\u00f94\u0018\u000b\u00a3~cr\u00eb\u0084!\u00c7".length();
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
                    var4_3 = "\u008b\u00134\u0089>\u00da\u00f9\u00b8U\u0012\u008c\u0015\u0017v\u00a6\u00d7";
                    var5_4 = "\u008b\u00134\u0089>\u00da\u00f9\u00b8U\u0012\u008c\u0015\u0017v\u00a6\u00d7".length();
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
        X.a = var6_1;
        X.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5516;
        if (b[n11] == null) {
            X.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

