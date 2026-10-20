/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OG;
import com.ky_2;
import com.ot_0;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

class n1
implements AWTEventListener {
    final ot_0 e;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    n1(ot_0 ot_02) {
        this.e = ot_02;
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block3: {
            MouseEvent mouseEvent;
            block9: {
                int n10;
                int n11;
                block8: {
                    ky_2[] ky_2Array;
                    block6: {
                        block7: {
                            block4: {
                                block5: {
                                    AWTEvent aWTEvent2;
                                    block2: {
                                        ky_2Array = OG.P();
                                        aWTEvent2 = aWTEvent;
                                        if (ky_2Array == null) break block2;
                                        if (!(aWTEvent2 instanceof MouseEvent)) break block3;
                                        aWTEvent2 = aWTEvent;
                                    }
                                    mouseEvent = (MouseEvent)aWTEvent2;
                                    n11 = aWTEvent.getID();
                                    n10 = n1.a(32377, 712408173153561344L);
                                    if (ky_2Array == null) break block4;
                                    if (n11 != n10) break block5;
                                    Toolkit.getDefaultToolkit().addAWTEventListener(this, n1.b(28735, 8689618946007624511L));
                                    ot_0.s(this.e, mouseEvent);
                                    if (ky_2Array != null) break block3;
                                }
                                n11 = aWTEvent.getID();
                                n10 = n1.a(8967, 4914982254634628733L);
                            }
                            if (ky_2Array == null) break block6;
                            if (n11 != n10) break block7;
                            Toolkit.getDefaultToolkit().removeAWTEventListener(this);
                            Toolkit.getDefaultToolkit().addAWTEventListener(ot_0.a(this.e), n1.b(19240, 58038021491576873L));
                            ot_0.s(this.e, mouseEvent);
                            if (ky_2Array != null) break block3;
                        }
                        n11 = aWTEvent.getID();
                        n10 = n1.a(13425, 8412898086285795594L);
                    }
                    if (ky_2Array == null) break block8;
                    if (n11 == n10) break block9;
                    n11 = aWTEvent.getID();
                    n10 = n1.a(31439, 3585337109399875511L);
                }
                if (n11 != n10) break block3;
            }
            ot_0.s(this.e, mouseEvent);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    block9: {
                        var8 = 4273584066326618601L;
                        var14_1 = new long[4];
                        var11_2 = 0;
                        var12_3 = "\u00f9\u00c2\u0088Q:\u00e4\u00cf\u00a4\u0012\u009d\u009d\u0087\u00a0\u00cd\u00cb\u0011";
                        var13_4 = "\u00f9\u00c2\u0088Q:\u00e4\u00cf\u00a4\u0012\u009d\u009d\u0087\u00a0\u00cd\u00cb\u0011".length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block9;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 = "\u00e8\u007f\u00d07;\u00f2\u0096m\u00d3[\u00df|\u00b3\u008a\u0001\u0014";
                            var13_4 = "\u00e8\u007f\u00d07;\u00f2\u0096m\u00d3[\u00df|\u00b3\u008a\u0001\u0014".length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block9;
                                break;
                            }
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block10;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
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
                n1.a = var14_1;
                n1.b = new Integer[4];
                var0_7 = 1833125758820528592L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u0019\u00be\u00a3o\u00b5ea\u00e9a\u00e7(N\u001dTZ\u00cf";
                var5_11 = "\u0019\u00be\u00a3o\u00b5ea\u00e9a\u00e7(N\u001dTZ\u00cf".length();
                var2_12 = 0;
                while (true) {
                    break block11;
                    break;
                }
lbl50:
                // 1 sources

                while (true) {
                    var6_8[v5] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block12;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v5 = var3_9++;
            ** while (true)
        }
        n1.c = var6_8;
        n1.d = new Long[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5578;
        if (b[n11] == null) {
            n1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x1B01) & Short.MAX_VALUE;
        if (d[n11] == null) {
            n1.d[n11] = c[n11] ^ l2;
        }
        return d[n11];
    }
}

