/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OQ;
import com.T4;
import com.co_0;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

public class T2
extends T4 {
    final OQ l;
    private static final long[] a;
    private static final Integer[] b;

    protected T2(OQ oQ) {
        this.l = oQ;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return this.l.i() ? OQ.W : OQ.b;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void layoutContainer(Container var1_1) {
        block13: {
            block14: {
                block11: {
                    block12: {
                        var3_2 = this.l.s.getComponentOrientation().isLeftToRight();
                        var4_3 = this.l.getInsets();
                        var2_4 = co_0.U();
                        var5_5 = this.l.i();
                        var6_6 = this.l.a.getText() != null ? 1 : 0;
                        var7_7 = var5_5 != 0 && this.l.o.getText() != null ? 1 : 0;
                        var8_8 = var5_5 != 0 && this.l.U.getText() != null ? 1 : 0;
                        this.l.a.setVisible((boolean)var6_6);
                        this.l.o.setVisible((boolean)var7_7);
                        this.l.U.setVisible((boolean)var8_8);
                        v0 = var5_5;
                        if (var2_4 == null) break block11;
                        if (v0 == 0) break block12;
                        v1 = this.l.z;
                        v2 = var3_2;
                        if (var2_4 == null) ** GOTO lbl21
                        if (v2 != 0) {
                            v3 = var4_3.left;
                        } else {
                            v2 = OQ.W.width - var4_3.right;
lbl21:
                            // 2 sources

                            v3 = v2 - T2.b(27489, 2062756884810957577L);
                        }
                        v1.setBounds(v3, var4_3.top, T2.b(5930, 1208210181485035331L), T2.b(5930, 1208210181485035331L));
                        if (var6_6 == 0) break block13;
                        var9_9 = this.l.a.getPreferredSize();
                        var10_11 = var7_7 != 0 ? this.l.o.getPreferredSize() : new Dimension(0, 0);
                        var11_13 = var8_8 != 0 ? this.l.U.getPreferredSize() : new Dimension(0, 0);
                        v4 = var9_9.height;
                        v5 = var7_7;
                        if (var2_4 != null) {
                            v5 = v5 != 0 ? 4 + var10_11.height : 0;
                        }
                        v6 = v4 + v5;
                        v7 = var8_8;
                        if (var2_4 != null) {
                            v7 = v7 != 0 ? 4 + var11_13.height : 0;
                        }
                        var12_14 = v6 + v7;
                        v8 = var3_2;
                        if (var2_4 != null) {
                            v8 = v8 != 0 ? var4_3.left + T2.b(5930, 1208210181485035331L) + 4 : var4_3.left;
                        }
                        var13_15 = v8;
                        var14_16 = OQ.W.width - var4_3.left - var4_3.right - T2.b(5930, 1208210181485035331L) - 4;
                        var15_17 = var4_3.top + (OQ.W.height - var4_3.top - var4_3.bottom) / 2 - var12_14 / 2;
                        this.l.a.setBounds(var13_15, var15_17, var14_16, var9_9.height);
                        var15_17 += var9_9.height + 4;
                        v9 = var7_7;
                        if (var2_4 != null) {
                            if (v9 != 0) {
                                this.l.o.setBounds(var13_15, var15_17, var14_16, var10_11.height);
                                var15_17 += var10_11.height + 4;
                            }
                            v9 = var8_8;
                        }
                        if (v9 != 0) {
                            this.l.U.setBounds(var13_15, var15_17, var14_16, var11_13.height);
                        }
                        if (var2_4 != null) break block13;
                    }
                    v0 = OQ.b.width - var4_3.left - var4_3.right;
                }
                var9_10 = v0;
                this.l.z.setBounds(var4_3.left + var9_10 / 2 - T2.b(27170, 7877545228203754057L), var4_3.top, T2.b(5930, 1208210181485035331L), T2.b(5930, 1208210181485035331L));
                v10 = var6_6;
                if (var2_4 == null) break block14;
                if (v10 == 0) break block13;
                v10 = var4_3.top + T2.b(5930, 1208210181485035331L) + 4;
            }
            var10_12 = v10;
            this.l.a.setBounds(var4_3.left, var10_12, var9_10, OQ.b.height - var10_12 - var4_3.bottom);
        }
    }

    public Rectangle K() {
        int n10;
        Insets insets;
        block2: {
            block3: {
                block5: {
                    int n11;
                    block4: {
                        int n12;
                        int n13 = this.l.s.getComponentOrientation().isLeftToRight();
                        String string = co_0.U();
                        insets = this.l.getInsets();
                        n10 = n12 = this.l.i();
                        if (string == null) break block2;
                        if (n10 == 0) break block3;
                        n11 = n13;
                        if (string == null) break block4;
                        if (n11 == 0) break block5;
                        n11 = insets.left + T2.b(5930, 1208210181485035331L) + 4;
                    }
                    int n14 = n11;
                    return new Rectangle(n14, insets.top, OQ.W.width - n14 - insets.right, OQ.W.height - insets.top - insets.bottom);
                }
                return new Rectangle(insets.left, insets.top, OQ.W.width - 4 - T2.b(5930, 1208210181485035331L) - insets.right, OQ.W.height - insets.top - insets.bottom);
            }
            n10 = insets.top + T2.b(5930, 1208210181485035331L) + 4;
        }
        int n15 = n10;
        return new Rectangle(insets.left, n15, OQ.b.width - insets.left - insets.right, OQ.b.height - n15 - insets.bottom);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 820168308794802473L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00b6\u00cbPy\u0004\u00d3\u00be\\\u00c7~\u00fcN\f\u0099B\u0016\u00f7\u00cd\u001f\u0016\u00d8\u0097\u00c3{";
        int n11 = "\u00b6\u00cbPy\u0004\u00d3\u00be\\\u00c7~\u00fcN\f\u0099B\u0016\u00f7\u00cd\u001f\u0016\u00d8\u0097\u00c3{".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6869;
        if (b[n11] == null) {
            T2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

