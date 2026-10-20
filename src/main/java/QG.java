/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JMenuBar;

class QG
extends JComponent
implements ItemListener {
    Point f;
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        String string = aA.z();
        boolean bl = itemEvent.getStateChange();
        if (string == null) {
            bl = bl;
        }
        this.setVisible(bl);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        block3: {
            block2: {
                String string = aA.z();
                if (string != null) break block2;
                if ((Point)this.f == null) break block3;
                graphics.setColor(Color.red);
            }
            graphics.fillOval(((Point)c.c((long)375845063199368784L).get((Object)this)).x - QG.a(29412, 8977705369896610596L), ((Point)c.c((long)375845063199368784L).get((Object)this)).y - QG.a(26312, 7751287107741482763L), QG.a(14709, 4563627486387183796L), QG.a(7347, 7245962285301433713L));
        }
    }

    public void T(Point point) {
        this.f = point;
    }

    public QG(AbstractButton abstractButton, JMenuBar jMenuBar, Container container) {
        O1 o1 = new O1(abstractButton, jMenuBar, this, container);
        this.addMouseListener(o1);
        this.addMouseMotionListener(o1);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3598342783229254806L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "_KN{C)|6\u00a46\u00e3\u0088\u0080\u00b5\u00b7\u00b8";
                var5_4 = "_KN{C)|6\u00a46\u00e3\u0088\u0080\u00b5\u00b7\u00b8".length();
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
                    var4_3 = "\u00fe\u00d6\u00d8\u00a5>\u0086\u00a3\u0097\u00b2Cv\u0082\u0089=Y\u00f3";
                    var5_4 = "\u00fe\u00d6\u00d8\u00a5>\u0086\u00a3\u0097\u00b2Cv\u0082\u0089=Y\u00f3".length();
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
        QG.a = var6_1;
        QG.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x19C1;
        if (b[n11] == null) {
            QG.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

