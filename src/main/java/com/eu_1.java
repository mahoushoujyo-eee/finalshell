/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.ds_0;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.eU
 */
public class eu_1
extends MouseAdapter
implements SwingConstants {
    private boolean l = false;
    private int X = -1;
    private int N = -1;
    private int U = 0;
    private static final long[] a;
    private static final Integer[] b;

    public static void x(Component component, int n10) {
        eu_1 eu_12 = new eu_1(n10);
        component.addMouseListener(eu_12);
        component.addMouseMotionListener(eu_12);
    }

    public eu_1(int n10) {
        this.U = n10;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int[] nArray = ds_0.U();
        if (nArray == null) {
            if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                this.l = true;
            }
            this.X = mouseEvent.getXOnScreen();
            this.N = mouseEvent.getYOnScreen();
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        block16: {
            block58: {
                eu_1 eu_12;
                block45: {
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    Rectangle rectangle;
                    Window window;
                    block56: {
                        int[] nArray;
                        block57: {
                            block54: {
                                block55: {
                                    block52: {
                                        block53: {
                                            block50: {
                                                block51: {
                                                    block48: {
                                                        block49: {
                                                            block46: {
                                                                block47: {
                                                                    block43: {
                                                                        block44: {
                                                                            block41: {
                                                                                block42: {
                                                                                    block25: {
                                                                                        block26: {
                                                                                            int n14;
                                                                                            block39: {
                                                                                                Dimension dimension;
                                                                                                block40: {
                                                                                                    block37: {
                                                                                                        block38: {
                                                                                                            int n15;
                                                                                                            block35: {
                                                                                                                block36: {
                                                                                                                    block31: {
                                                                                                                        block32: {
                                                                                                                            block33: {
                                                                                                                                block34: {
                                                                                                                                    block29: {
                                                                                                                                        block30: {
                                                                                                                                            block27: {
                                                                                                                                                block28: {
                                                                                                                                                    int n16;
                                                                                                                                                    block20: {
                                                                                                                                                        Window window2;
                                                                                                                                                        block23: {
                                                                                                                                                            block24: {
                                                                                                                                                                boolean bl;
                                                                                                                                                                block21: {
                                                                                                                                                                    block22: {
                                                                                                                                                                        block18: {
                                                                                                                                                                            block19: {
                                                                                                                                                                                int n17;
                                                                                                                                                                                block17: {
                                                                                                                                                                                    int n18;
                                                                                                                                                                                    block15: {
                                                                                                                                                                                        nArray = ds_0.U();
                                                                                                                                                                                        n17 = this.X;
                                                                                                                                                                                        n18 = -1;
                                                                                                                                                                                        if (nArray != null) break block15;
                                                                                                                                                                                        if (n17 == n18) break block16;
                                                                                                                                                                                        n17 = this.N;
                                                                                                                                                                                        if (nArray != null) break block17;
                                                                                                                                                                                        n18 = -1;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (n17 == n18) break block16;
                                                                                                                                                                                    n17 = this.l ? 1 : 0;
                                                                                                                                                                                }
                                                                                                                                                                                if (n17 == 0) break block16;
                                                                                                                                                                                window = FN.L(mouseEvent.getComponent());
                                                                                                                                                                                rectangle = window.getBounds();
                                                                                                                                                                                bl = window instanceof JDialog;
                                                                                                                                                                                if (nArray != null) break block18;
                                                                                                                                                                                if (!bl) break block19;
                                                                                                                                                                                dimension = ((JDialog)window).getRootPane().getMinimumSize();
                                                                                                                                                                                n16 = ((JDialog)window).isUndecorated();
                                                                                                                                                                                if (nArray == null) break block20;
                                                                                                                                                                            }
                                                                                                                                                                            bl = window instanceof JFrame;
                                                                                                                                                                        }
                                                                                                                                                                        if (nArray != null) break block21;
                                                                                                                                                                        if (!bl) break block22;
                                                                                                                                                                        dimension = ((JFrame)window).getRootPane().getMinimumSize();
                                                                                                                                                                        n16 = ((JFrame)window).isUndecorated();
                                                                                                                                                                        if (nArray == null) break block20;
                                                                                                                                                                    }
                                                                                                                                                                    window2 = window;
                                                                                                                                                                    if (nArray != null) break block23;
                                                                                                                                                                    bl = window2 instanceof JWindow;
                                                                                                                                                                }
                                                                                                                                                                if (!bl) break block24;
                                                                                                                                                                dimension = ((JWindow)window).getRootPane().getMinimumSize();
                                                                                                                                                                n16 = ((JFrame)window).isUndecorated();
                                                                                                                                                                if (nArray == null) break block20;
                                                                                                                                                            }
                                                                                                                                                            window2 = window;
                                                                                                                                                        }
                                                                                                                                                        dimension = window2.getMinimumSize();
                                                                                                                                                        n16 = 1;
                                                                                                                                                    }
                                                                                                                                                    n13 = mouseEvent.getXOnScreen() - this.X;
                                                                                                                                                    n12 = mouseEvent.getYOnScreen() - this.N;
                                                                                                                                                    n11 = n16;
                                                                                                                                                    if (nArray != null) break block25;
                                                                                                                                                    if (n11 == 0) break block26;
                                                                                                                                                    n11 = this.U;
                                                                                                                                                    n15 = eu_1.a(25203, 6827266121268851179L);
                                                                                                                                                    if (nArray != null) break block27;
                                                                                                                                                    if (n11 == n15) break block28;
                                                                                                                                                    n11 = this.U;
                                                                                                                                                    n15 = eu_1.a(8962, 5682727548206493852L);
                                                                                                                                                    if (nArray != null) break block27;
                                                                                                                                                    if (n11 == n15) break block28;
                                                                                                                                                    n11 = this.U;
                                                                                                                                                    n15 = eu_1.a(30476, 8681860764236211344L);
                                                                                                                                                    if (nArray != null) break block29;
                                                                                                                                                    if (n11 != n15) break block30;
                                                                                                                                                }
                                                                                                                                                n11 = rectangle.width - n13;
                                                                                                                                                n15 = dimension.width;
                                                                                                                                            }
                                                                                                                                            if (nArray != null) break block31;
                                                                                                                                            if (n11 >= n15) break block32;
                                                                                                                                            n13 = 0;
                                                                                                                                            if (nArray == null) break block32;
                                                                                                                                        }
                                                                                                                                        n11 = this.U;
                                                                                                                                        n15 = 2;
                                                                                                                                    }
                                                                                                                                    if (nArray != null) break block33;
                                                                                                                                    if (n11 == n15) break block34;
                                                                                                                                    n11 = this.U;
                                                                                                                                    n15 = 3;
                                                                                                                                    if (nArray != null) break block33;
                                                                                                                                    if (n11 == n15) break block34;
                                                                                                                                    n11 = this.U;
                                                                                                                                    n15 = 4;
                                                                                                                                    if (nArray != null) break block31;
                                                                                                                                    if (n11 != n15) break block32;
                                                                                                                                }
                                                                                                                                n11 = rectangle.width + n13;
                                                                                                                                n15 = dimension.width;
                                                                                                                            }
                                                                                                                            if (nArray != null) break block31;
                                                                                                                            if (n11 < n15) {
                                                                                                                                n13 = 0;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        n11 = this.U;
                                                                                                                        n15 = eu_1.a(17381, 1006339150088917116L);
                                                                                                                    }
                                                                                                                    if (nArray != null) break block35;
                                                                                                                    if (n11 == n15) break block36;
                                                                                                                    n11 = this.U;
                                                                                                                    n15 = 1;
                                                                                                                    if (nArray != null) break block35;
                                                                                                                    if (n11 == n15) break block36;
                                                                                                                    n11 = this.U;
                                                                                                                    n14 = 2;
                                                                                                                    if (nArray != null) break block37;
                                                                                                                    if (n11 != n14) break block38;
                                                                                                                }
                                                                                                                n11 = rectangle.height - n12;
                                                                                                                if (nArray != null) break block25;
                                                                                                                n15 = dimension.height;
                                                                                                            }
                                                                                                            if (n11 >= n15) break block26;
                                                                                                            n12 = 0;
                                                                                                            if (nArray == null) break block26;
                                                                                                        }
                                                                                                        n11 = this.U;
                                                                                                        n14 = eu_1.a(16346, 5654950915180145733L);
                                                                                                    }
                                                                                                    if (nArray != null) break block39;
                                                                                                    if (n11 == n14) break block40;
                                                                                                    n11 = this.U;
                                                                                                    n14 = 5;
                                                                                                    if (nArray != null) break block39;
                                                                                                    if (n11 == n14) break block40;
                                                                                                    n11 = this.U;
                                                                                                    if (nArray != null) break block25;
                                                                                                    if (n11 != 4) break block26;
                                                                                                }
                                                                                                n11 = rectangle.height + n12;
                                                                                                if (nArray != null) break block25;
                                                                                                n14 = dimension.height;
                                                                                            }
                                                                                            if (n11 < n14) {
                                                                                                n12 = 0;
                                                                                            }
                                                                                        }
                                                                                        n11 = n13;
                                                                                    }
                                                                                    if (nArray != null) break block41;
                                                                                    if (n11 != 0) break block42;
                                                                                    n11 = n12;
                                                                                    if (nArray != null) break block41;
                                                                                    if (n11 == 0) break block16;
                                                                                }
                                                                                n11 = this.U;
                                                                            }
                                                                            n10 = eu_1.a(17381, 1006339150088917116L);
                                                                            if (nArray != null) break block43;
                                                                            if (n11 != n10) break block44;
                                                                            window.setBounds(rectangle.x + n13, rectangle.y + n12, rectangle.width - n13, rectangle.height - n12);
                                                                            if (nArray == null) break block45;
                                                                        }
                                                                        n11 = this.U;
                                                                        n10 = 1;
                                                                    }
                                                                    if (nArray != null) break block46;
                                                                    if (n11 != n10) break block47;
                                                                    window.setBounds(rectangle.x, rectangle.y + n12, rectangle.width, rectangle.height - n12);
                                                                    if (nArray == null) break block45;
                                                                }
                                                                n11 = this.U;
                                                                n10 = 2;
                                                            }
                                                            if (nArray != null) break block48;
                                                            if (n11 != n10) break block49;
                                                            window.setBounds(rectangle.x, rectangle.y + n12, rectangle.width + n13, rectangle.height - n12);
                                                            if (nArray == null) break block45;
                                                        }
                                                        n11 = this.U;
                                                        n10 = eu_1.a(17317, 9077518228257919032L);
                                                    }
                                                    if (nArray != null) break block50;
                                                    if (n11 != n10) break block51;
                                                    window.setBounds(rectangle.x + n13, rectangle.y, rectangle.width - n13, rectangle.height);
                                                    if (nArray == null) break block45;
                                                }
                                                n11 = this.U;
                                                n10 = 3;
                                            }
                                            if (nArray != null) break block52;
                                            if (n11 != n10) break block53;
                                            window.setBounds(rectangle.x, rectangle.y, rectangle.width + n13, rectangle.height);
                                            if (nArray == null) break block45;
                                        }
                                        n11 = this.U;
                                        n10 = eu_1.a(16346, 5654950915180145733L);
                                    }
                                    if (nArray != null) break block54;
                                    if (n11 != n10) break block55;
                                    window.setBounds(rectangle.x + n13, rectangle.y, rectangle.width - n13, rectangle.height + n12);
                                    if (nArray == null) break block45;
                                }
                                n11 = this.U;
                                n10 = 5;
                            }
                            if (nArray != null) break block56;
                            if (n11 != n10) break block57;
                            window.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height + n12);
                            if (nArray == null) break block45;
                        }
                        eu_12 = this;
                        if (nArray != null) break block58;
                        n11 = eu_12.U;
                        n10 = 4;
                    }
                    if (n11 == n10) {
                        window.setBounds(rectangle.x, rectangle.y, rectangle.width + n13, rectangle.height + n12);
                    }
                }
                this.X = mouseEvent.getXOnScreen();
                eu_12 = this;
            }
            eu_12.N = mouseEvent.getYOnScreen();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.l = false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4628800196339751999L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u008b\u0093\u009bH\u00d6\u00a5\u00b8\u00a9\u00be\u00f9\u0088\u0099\u00d2d\u008c\u0000\u00bd\u00b9\u00b3\u00f8\u00cd:l\u00a4\u00fa9\u0094Yf\u0083\u00f0|";
                var5_4 = "\u008b\u0093\u009bH\u00d6\u00a5\u00b8\u00a9\u00be\u00f9\u0088\u0099\u00d2d\u008c\u0000\u00bd\u00b9\u00b3\u00f8\u00cd:l\u00a4\u00fa9\u0094Yf\u0083\u00f0|".length();
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
                    var4_3 = "\u0091B\u00b1\u0004f_-\u00dc\u00b5\u00b8\u00d5=\u0003\u0088\u008cK";
                    var5_4 = "\u0091B\u00b1\u0004f_-\u00dc\u00b5\u00b8\u00d5=\u0003\u0088\u008cK".length();
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
        eu_1.a = var6_1;
        eu_1.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x139C;
        if (b[n11] == null) {
            eu_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

