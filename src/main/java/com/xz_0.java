/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import com.kb_2;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Xz
 */
class xz_0
extends MouseAdapter {
    final kb_2 j;
    private static final long[] a;
    private static final Integer[] b;

    xz_0(kb_2 kb_22) {
        this.j = kb_22;
    }

    private void V(MouseEvent mouseEvent) {
        block4: {
            block17: {
                int n10;
                block18: {
                    int[] nArray;
                    block15: {
                        block16: {
                            block13: {
                                block14: {
                                    block11: {
                                        block12: {
                                            block9: {
                                                block10: {
                                                    block7: {
                                                        block8: {
                                                            block5: {
                                                                block6: {
                                                                    block2: {
                                                                        block3: {
                                                                            nArray = k3_0.L();
                                                                            n10 = new Rectangle(0, 0, xz_0.a(18472, 4376805916605354215L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint());
                                                                            if (nArray == null) break block2;
                                                                            if (n10 == 0) break block3;
                                                                            kb_2.y(this.j, xz_0.a(27220, 2869854698237145759L));
                                                                            this.j.setCursor(Cursor.getPredefinedCursor(xz_0.a(10826, 6739842021146555012L)));
                                                                            if (nArray != null) break block4;
                                                                        }
                                                                        n10 = new Rectangle(this.j.getWidth() / 2 - xz_0.a(10826, 6739842021146555012L), 0, xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint()) ? 1 : 0;
                                                                    }
                                                                    if (nArray == null) break block5;
                                                                    if (n10 == 0) break block6;
                                                                    kb_2.y(this.j, 1);
                                                                    this.j.setCursor(Cursor.getPredefinedCursor(xz_0.a(27220, 2869854698237145759L)));
                                                                    if (nArray != null) break block4;
                                                                }
                                                                n10 = new Rectangle(this.j.getWidth() - xz_0.a(32508, 7406508288587474485L), 0, xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint()) ? 1 : 0;
                                                            }
                                                            if (nArray == null) break block7;
                                                            if (n10 == 0) break block8;
                                                            kb_2.y(this.j, 2);
                                                            this.j.setCursor(Cursor.getPredefinedCursor(xz_0.a(17383, 2236633985702894371L)));
                                                            if (nArray != null) break block4;
                                                        }
                                                        n10 = new Rectangle(0, this.j.getHeight() / 2 - xz_0.a(10826, 6739842021146555012L), xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint()) ? 1 : 0;
                                                    }
                                                    if (nArray == null) break block9;
                                                    if (n10 == 0) break block10;
                                                    kb_2.y(this.j, xz_0.a(17383, 2236633985702894371L));
                                                    this.j.setCursor(Cursor.getPredefinedCursor(xz_0.a(5452, 2970219182896434569L)));
                                                    if (nArray != null) break block4;
                                                }
                                                n10 = new Rectangle(this.j.getWidth() - xz_0.a(32508, 7406508288587474485L), this.j.getHeight() / 2 - xz_0.a(10826, 6739842021146555012L), xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint()) ? 1 : 0;
                                            }
                                            if (nArray == null) break block11;
                                            if (n10 == 0) break block12;
                                            kb_2.y(this.j, 3);
                                            this.j.setCursor(Cursor.getPredefinedCursor(xz_0.a(2736, 7433830175054221944L)));
                                            if (nArray != null) break block4;
                                        }
                                        n10 = new Rectangle(0, this.j.getHeight() - xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint()) ? 1 : 0;
                                    }
                                    if (nArray == null) break block13;
                                    if (n10 == 0) break block14;
                                    kb_2.y(this.j, xz_0.a(10826, 6739842021146555012L));
                                    this.j.setCursor(Cursor.getPredefinedCursor(4));
                                    if (nArray != null) break block4;
                                }
                                n10 = new Rectangle(this.j.getWidth() / 2 - xz_0.a(10826, 6739842021146555012L), this.j.getHeight() - xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint()) ? 1 : 0;
                            }
                            if (nArray == null) break block15;
                            if (n10 == 0) break block16;
                            kb_2.y(this.j, 5);
                            this.j.setCursor(Cursor.getPredefinedCursor(xz_0.a(25528, 8702408367310388084L)));
                            if (nArray != null) break block4;
                        }
                        n10 = new Rectangle(this.j.getWidth() - xz_0.a(32508, 7406508288587474485L), this.j.getHeight() - xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L), xz_0.a(32508, 7406508288587474485L)).contains(mouseEvent.getPoint()) ? 1 : 0;
                    }
                    if (nArray == null) break block17;
                    if (n10 == 0) break block18;
                    kb_2.y(this.j, 4);
                    this.j.setCursor(Cursor.getPredefinedCursor(5));
                    if (nArray != null) break block4;
                }
                n10 = kb_2.y(this.j, -1);
            }
            this.j.setCursor(Cursor.getDefaultCursor());
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        this.V(mouseEvent);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block4: {
            int n10;
            block5: {
                int[] nArray = k3_0.L();
                this.V(mouseEvent);
                int[] nArray2 = nArray;
                n10 = SwingUtilities.isLeftMouseButton(mouseEvent);
                if (nArray2 == null) break block4;
                if (n10 == 0) break block5;
                n10 = kb_2.z(this.j);
                if (nArray2 == null) break block4;
                if (n10 != -1) {
                    kb_2.Y(this.j, true);
                }
            }
            kb_2.n(this.j, mouseEvent.getXOnScreen());
            n10 = kb_2.i(this.j, mouseEvent.getYOnScreen());
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mouseDragged(MouseEvent var1_1) {
        block8: {
            block9: {
                block14: {
                    block16: {
                        block17: {
                            block15: {
                                block10: {
                                    block12: {
                                        block13: {
                                            block11: {
                                                var2_2 = k3_0.L();
                                                v0 = kb_2.r(this.j);
                                                if (var2_2 == null) break block8;
                                                if (v0 == 0) break block9;
                                                v0 = kb_2.A(this.j);
                                                if (var2_2 == null) break block8;
                                                if (v0 == -1) break block9;
                                                v0 = kb_2.Q(this.j);
                                                if (var2_2 == null) break block8;
                                                if (v0 == -1) break block9;
                                                v1 = (kb_2.A(this.j) - var1_1.getXOnScreen()) * 2;
                                                v2 = kb_2.z(this.j);
                                                if (var2_2 == null) break block10;
                                                if (v2 == 1) break block11;
                                                v2 = kb_2.z(this.j);
                                                v3 = 5;
                                                if (var2_2 == null) break block12;
                                                if (v2 != v3) break block13;
                                            }
                                            v2 = 0;
                                            break block10;
                                        }
                                        v2 = kb_2.z(this.j);
                                        if (var2_2 == null) break block10;
                                        v3 = xz_0.a(27828, 2575646271157384313L);
                                    }
                                    if (v2 == v3) ** GOTO lbl-1000
                                    v2 = kb_2.z(this.j);
                                    if (var2_2 == null) break block10;
                                    if (v2 != xz_0.a(20341, 312491051622897599L)) {
                                        v2 = kb_2.z(this.j);
                                        if (var2_2 != null) {
                                            ** if (v2 != xz_0.a((int)14349, (long)2266619925450711243L)) goto lbl-1000
                                        } else {
                                            ** GOTO lbl35
                                        }
                                    }
                                    ** GOTO lbl-1000
lbl35:
                                    // 2 sources

                                    break block10;
lbl-1000:
                                    // 3 sources

                                    {
                                        v2 = 1;
                                        ** GOTO lbl39
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        v2 = -1;
                                    }
                                }
                                kb_2.H(this.j, v1 * v2);
                                kb_2.t(this.j, Math.max(kb_2.J(this.j), 0));
                                v4 = (kb_2.Q(this.j) - var1_1.getYOnScreen()) * 2;
                                v5 = kb_2.z(this.j);
                                if (var2_2 == null) break block14;
                                if (v5 == xz_0.a(17383, 2236633985702894371L)) break block15;
                                v5 = kb_2.z(this.j);
                                v6 = 3;
                                if (var2_2 == null) break block16;
                                if (v5 != v6) break block17;
                            }
                            v5 = 0;
                            break block14;
                        }
                        v5 = kb_2.z(this.j);
                        if (var2_2 == null) break block14;
                        v6 = xz_0.a(27220, 2869854698237145759L);
                    }
                    if (v5 == v6) ** GOTO lbl-1000
                    v5 = kb_2.z(this.j);
                    if (var2_2 == null) break block14;
                    if (v5 != 1) {
                        v5 = kb_2.z(this.j);
                        if (var2_2 != null) {
                            ** if (v5 != 2) goto lbl-1000
                        } else {
                            ** GOTO lbl68
                        }
                    }
                    ** GOTO lbl-1000
lbl68:
                    // 2 sources

                    break block14;
lbl-1000:
                    // 3 sources

                    {
                        v5 = 1;
                        ** GOTO lbl72
                    }
lbl-1000:
                    // 1 sources

                    {
                        v5 = -1;
                    }
                }
                kb_2.A(this.j, v4 * v5);
                kb_2.T(this.j, Math.max(kb_2.v(this.j), 0));
                this.j.revalidate();
            }
            kb_2.n(this.j, var1_1.getXOnScreen());
            v0 = kb_2.i(this.j, var1_1.getYOnScreen());
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        int[] nArray = k3_0.L();
        if (nArray != null) {
            if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                kb_2.Y(this.j, false);
            }
            this.V(mouseEvent);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8842949951879555565L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u008coE\u008eg\u00ba\u0092\u0090\u00eb\u00f7\u00e8\u00c5;3\u009d\u009c\u0003\u00a3\u00e7\u0007\u00f0\u00e6[o\u0091T\u0084\u00ef\u00aeA\u00b9\u0006\u0080D\u00bd\u0006`\u00f9{\u009e\u00d7\u0019\u00b7\u00db\u0017h\u008f\u00d4%wg\u00b8\u00b7.>U\u00ec\u0019\u0093\u00dc\u008d?\u009bz\u0086l6\u00b0\u009a5\u00b2\u00c9";
                var5_4 = "\u008coE\u008eg\u00ba\u0092\u0090\u00eb\u00f7\u00e8\u00c5;3\u009d\u009c\u0003\u00a3\u00e7\u0007\u00f0\u00e6[o\u0091T\u0084\u00ef\u00aeA\u00b9\u0006\u0080D\u00bd\u0006`\u00f9{\u009e\u00d7\u0019\u00b7\u00db\u0017h\u008f\u00d4%wg\u00b8\u00b7.>U\u00ec\u0019\u0093\u00dc\u008d?\u009bz\u0086l6\u00b0\u009a5\u00b2\u00c9".length();
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
                    var4_3 = "\u00fd\u00e5^\u008c=\u00c1dn\u00cc\u0014\u00d2\u00d81\u0019I ";
                    var5_4 = "\u00fd\u00e5^\u008c=\u00c1dn\u00cc\u0014\u00d2\u00d81\u0019I ".length();
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
        xz_0.a = var6_1;
        xz_0.b = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x58CC;
        if (b[n11] == null) {
            xz_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

