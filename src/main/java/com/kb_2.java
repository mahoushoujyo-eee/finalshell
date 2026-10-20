/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.k3_0;
import com.ky_2;
import com.xz_0;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;

/*
 * Renamed from com.kb
 */
public class kb_2
extends ky_2 {
    private int g;
    private int b;
    private int e;
    private boolean v;
    private int C;
    private int m;
    private Insets M;
    private static final String a;
    private static final long[] c;
    private static final Integer[] d;

    public kb_2() {
        this((Component)null);
    }

    public kb_2(Component component) {
        block3: {
            block2: {
                int[] nArray = k3_0.L();
                this.g = 0;
                this.b = 0;
                this.e = -1;
                this.v = false;
                int[] nArray2 = nArray;
                this.C = -1;
                this.m = -1;
                this.M = new Insets(kb_2.a(5865, 2195314037654215914L), kb_2.a(1316, 3222710582203371298L), kb_2.a(1316, 3222710582203371298L), kb_2.a(1316, 3222710582203371298L));
                this.setOpaque(false);
                this.E();
                if (nArray2 == null) break block2;
                if (component == null) break block3;
                this.setLayout(new BorderLayout());
            }
            this.add(component, a);
        }
        xz_0 xz_02 = new xz_0(this);
        this.addMouseListener(xz_02);
        this.addMouseMotionListener(xz_02);
    }

    private void E() {
        this.N(this.M.top, this.M.left, this.M.bottom, this.M.right);
    }

    public Insets s() {
        return this.M;
    }

    public void x(int n10) {
        this.n(new Insets(n10, n10, n10, n10));
    }

    public void n(Insets insets) {
        this.M = insets;
        this.E();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        GA.z((Graphics2D)graphics, new Rectangle(kb_2.a(3471, 3234863040296896395L), kb_2.a(4966, 5953234533138684259L), this.getWidth() - kb_2.a(362, 8670596037004807016L), this.getHeight() - kb_2.a(29793, 4900195236049075814L)), true, true, true);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        dimension.width += this.g;
        dimension.height += this.b;
        return dimension;
    }

    public void M() {
        this.g = 0;
        this.b = 0;
        this.revalidate();
    }

    static int y(kb_2 kb_22, int n10) {
        kb_22.e = n10;
        return kb_22.e;
    }

    static int z(kb_2 kb_22) {
        return kb_22.e;
    }

    static boolean Y(kb_2 kb_22, boolean bl) {
        kb_22.v = bl;
        return kb_22.v;
    }

    static int n(kb_2 kb_22, int n10) {
        kb_22.C = n10;
        return kb_22.C;
    }

    static int i(kb_2 kb_22, int n10) {
        kb_22.m = n10;
        return kb_22.m;
    }

    static boolean r(kb_2 kb_22) {
        return kb_22.v;
    }

    static int A(kb_2 kb_22) {
        return kb_22.C;
    }

    static int Q(kb_2 kb_22) {
        return kb_22.m;
    }

    static int H(kb_2 kb_22, int n10) {
        return kb_22.g += n10;
    }

    static int t(kb_2 kb_22, int n10) {
        kb_22.g = n10;
        return kb_22.g;
    }

    static int J(kb_2 kb_22) {
        return kb_22.g;
    }

    static int A(kb_2 kb_22, int n10) {
        return kb_22.b += n10;
    }

    static int T(kb_2 kb_22, int n10) {
        kb_22.b = n10;
        return kb_22.b;
    }

    static int v(kb_2 kb_22) {
        return kb_22.b;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "?\u00117\u00109\u0005".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 77;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 49;
                                break;
                            }
                            case 1: {
                                v9 = 57;
                                break;
                            }
                            case 2: {
                                v9 = 20;
                                break;
                            }
                            case 3: {
                                v9 = 41;
                                break;
                            }
                            case 4: {
                                v9 = 17;
                                break;
                            }
                            case 5: {
                                v9 = 58;
                                break;
                            }
                            default: {
                                v9 = 70;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
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
                } while (v4 > var8);
                ** while (true)
                kb_2.a = new String(v10).intern();
                var0_1 = 6446757524717427793L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "\u0089\u0011\u0091\u00a6\u00df\u00c4\u0013\u007f*\u0006\u00e8\u0098#\u001f\u00e2:\u00c5\u00ed8b84\u001b\u00dc|\u000e~q\u00d9\u008a\u00054";
                var5_5 = "\u0089\u0011\u0091\u00a6\u00df\u00c4\u0013\u007f*\u0006\u00e8\u0098#\u001f\u00e2:\u00c5\u00ed8b84\u001b\u00dc|\u000e~q\u00d9\u008a\u00054".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00a3\u00cd\u00ccc\u00ddO\u00174\u00ca\u00df\u00d4\u007f\u009d\u0015\u0000\u00b7";
                    var5_5 = "\u00a3\u00cd\u00ccc\u00ddO\u00174\u00ca\u00df\u00d4\u007f\u009d\u0015\u0000\u00b7".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
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
        kb_2.c = var6_2;
        kb_2.d = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4A06;
        if (d[n11] == null) {
            kb_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

