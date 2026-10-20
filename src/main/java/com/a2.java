/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._6;
import com.as_0;
import com.ky_2;
import com.pt_0;
import com.rv_2;
import com.ud_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;
import java.lang.ref.WeakReference;
import javax.swing.ImageIcon;

public class a2
extends as_0 {
    protected static final float[] X;
    protected static final Color[] g;
    protected static final Color[] o;
    protected WeakReference P;
    protected int S = -1;
    protected int E;
    private static final long[] c;
    private static final Integer[] d;

    public a2(ud_0 ud_02) {
        ky_2[] ky_2Array = pt_0.b();
        this.E = -1;
        this.P = new WeakReference<ud_0>(ud_02);
        if (ky_2.F() != null) {
            pt_0.J(new ky_2[3]);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void U(pt_0 var1_1) {
        block17: {
            v0 = pt_0.b();
            super.U(var1_1);
            var2_2 = v0;
            v1 = _6.g[this.D.ordinal()];
            if (var2_2 != null) ** GOTO lbl9
            switch (v1) {
                case 3: {
                    v1 = _6.g[var1_1.ordinal()];
lbl9:
                    // 2 sources

                    switch (v1) {
                        case 1: {
                            this.S = a2.b(8230, 7287801976064954302L);
                            this.E = -1;
                            if (var2_2 == null) break;
                        }
                        case 2: {
                            this.S = a2.b(18421, 2493599867170170977L);
                            this.E = -1;
                        }
                    }
                    if (var2_2 == null) break;
                }
                case 1: {
                    switch (_6.g[var1_1.ordinal()]) {
                        case 3: {
                            this.E = a2.b(18421, 2493599867170170977L);
                            this.S = -1;
                            if (var2_2 == null) break;
                        }
                        case 2: {
                            this.E = a2.b(18421, 2493599867170170977L);
                            this.S = -1;
                        }
                    }
                    if (var2_2 == null) break;
                }
                case 2: {
                    switch (_6.g[var1_1.ordinal()]) {
                        case 3: {
                            this.E = -1;
                            this.S = -1;
                            if (var2_2 == null) break block17;
                        }
                        case 1: {
                            this.E = -1;
                            this.S = -1;
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void G() {
        block17: {
            var1_1 = pt_0.b();
            v0 = _6.g[this.D.ordinal()];
            if (var1_1 != null) ** GOTO lbl7
            switch (v0) {
                case 3: {
                    v0 = _6.g[this.A.ordinal()];
lbl7:
                    // 2 sources

                    switch (v0) {
                        case 1: {
                            --this.S;
                            ++this.E;
                            if (var1_1 == null) break;
                        }
                        case 2: {
                            --this.S;
                        }
                    }
                    if (var1_1 == null) break;
                }
                case 1: {
                    switch (_6.g[this.A.ordinal()]) {
                        case 3: {
                            --this.E;
                            ++this.S;
                            if (var1_1 == null) break;
                        }
                        case 2: {
                            --this.E;
                        }
                    }
                    if (var1_1 == null) break;
                }
                case 2: {
                    switch (_6.g[this.A.ordinal()]) {
                        case 3: {
                            ++this.S;
                            if (var1_1 == null) break block17;
                        }
                        case 1: {
                            ++this.E;
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void F() {
        var1_1 = pt_0.b();
        if (var1_1 != null) ** GOTO lbl7
        switch (_6.g[this.D.ordinal()]) {
            case 3: {
                this.S = a2.b(18421, 2493599867170170977L);
                this.E = -1;
lbl7:
                // 2 sources

                if (var1_1 == null) break;
            }
            case 1: {
                this.E = a2.b(18421, 2493599867170170977L);
                this.S = -1;
                if (var1_1 == null) break;
            }
            case 2: {
                this.S = -1;
                this.E = -1;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean B() {
        block23: {
            var1_1 = pt_0.b();
            v0 = _6.g[this.D.ordinal()];
            if (var1_1 != null) break block23;
            switch (v0) {
                case 3: {
                    v1 = _6.g[this.A.ordinal()];
                    if (var1_1 != null) ** GOTO lbl11
                    switch (v1) {
                        case 1: {
                            v1 = this.E;
lbl11:
                            // 2 sources

                            if (var1_1 == null) {
                                v1 = v1 == 3 != 0;
                            }
                            return v1;
                        }
                        case 2: {
                            v2 = this.S;
                            if (var1_1 == null) {
                                v2 = v2 == -1 != 0;
                            }
                            return v2;
                        }
                    }
                    if (var1_1 == null) ** GOTO lbl49
                }
                case 1: {
                    v3 = _6.g[this.A.ordinal()];
                    if (var1_1 != null) ** GOTO lbl26
                    switch (v3) {
                        case 3: {
                            v3 = this.S;
lbl26:
                            // 2 sources

                            if (var1_1 == null) {
                                v3 = v3 == 3 != 0;
                            }
                            return v3;
                        }
                        case 2: {
                            v4 = this.E;
                            if (var1_1 == null) {
                                v4 = v4 == -1 != 0;
                            }
                            return v4;
                        }
                    }
                    if (var1_1 == null) ** GOTO lbl49
                }
                case 2: {
                    v0 = _6.g[this.A.ordinal()];
                    if (var1_1 != null) break;
                    switch (v0) {
                        case 3: {
                            v5 = this.S;
                            if (var1_1 == null) {
                                v5 = v5 == 3 != 0;
                            }
                            return v5;
                        }
                        case 1: {
                            v6 = this.E;
                            if (var1_1 == null) {
                                v6 = v6 == 3 != 0;
                            }
                            return v6;
                        }
                    }
                }
lbl49:
                // 4 sources

                default: {
                    v0 = 1;
                }
            }
        }
        return (boolean)v0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void O(Component var1_1, Graphics2D var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block3: {
            block5: {
                block4: {
                    var8_7 = (ud_0)this.P.get();
                    var7_8 = pt_0.b();
                    if (var8_7 == null) break block3;
                    v0 = this.E;
                    v1 = -1;
                    if (var7_8 != null) break block4;
                    if (v0 > v1) {
                        var9_9 = 3 - this.E;
                        var10_11 = var8_7.z() + 3;
                        var11_12 = new Rectangle(var3_3 + var10_11, var4_4 + var10_11, var5_5 - var10_11 * 2, var6_6 - var10_11 * 2);
                        var12_13 = new RoundRectangle2D.Double(var11_12.x + var9_9, var11_12.y + var9_9, var11_12.width - var9_9 * 2, var11_12.height - var9_9 * 2, 3.0, 3.0);
                        var13_14 = rv_2.s(var11_12);
                        var14_15 = Math.max(var11_12.width / 2, var11_12.height / 2);
                        var2_2.setPaint(new RadialGradientPaint(var13_14, var14_15, a2.X, var8_7.isEnabled() != false ? a2.g : a2.o));
                        var2_2.fill(var12_13);
                    }
                    v0 = this.S;
                    if (var7_8 != null) break block5;
                    v1 = -1;
                }
                if (v0 <= v1) break block3;
                v2 /* !! */  = this;
                if (var7_8 != null) ** GOTO lbl29
                v0 = (int)v2 /* !! */ .h;
            }
            if (v0 != 0) {
                v3 = (ImageIcon)a2.J.get(this.S);
            } else {
                v2 /* !! */  = a2.O.get(this.S);
lbl29:
                // 2 sources

                v3 = (ImageIcon)v2 /* !! */ ;
            }
            var9_10 = v3;
            var2_2.drawImage(var9_10.getImage(), var3_3 + var5_5 / 2 - this.L() / 2, var4_4 + var6_6 / 2 - this.u() / 2, null);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6509197860810301621L;
                var6_1 = new long[12];
                var3_2 = 0;
                var4_3 = "\u00a07\u00a5\u009b\u00ea\u00d0\u00e2?5\u0001YZ\u009f\u00fc\u0014\u009cW\tr?\u00a6\u0011\u00c5\u00cc6>5d9=\u00fc\u0084&\u00ea\u00b2s\u0000\\\u00aa\u00a9\"(5F\u000fOr\u00bfg\u00b9@X\u00bc\u00d5\\\b\u000fF\u0084\u0092\u008c\u00f7\b\u00d7\u0097,\u001d\u0093\u0017A\u0088E\u00a5\u00ab\u0087a)\u00d3V,";
                var5_4 = "\u00a07\u00a5\u009b\u00ea\u00d0\u00e2?5\u0001YZ\u009f\u00fc\u0014\u009cW\tr?\u00a6\u0011\u00c5\u00cc6>5d9=\u00fc\u0084&\u00ea\u00b2s\u0000\\\u00aa\u00a9\"(5F\u000fOr\u00bfg\u00b9@X\u00bc\u00d5\\\b\u000fF\u0084\u0092\u008c\u00f7\b\u00d7\u0097,\u001d\u0093\u0017A\u0088E\u00a5\u00ab\u0087a)\u00d3V,".length();
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
                    var4_3 = "\u0015v9\u0007M\n\u009fRG7\u008b\u0088r\u00e9o\b";
                    var5_4 = "\u0015v9\u0007M\n\u009fRG7\u008b\u0088r\u00e9o\b".length();
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
        a2.c = var6_1;
        a2.d = new Integer[12];
        a2.X = new float[]{0.0f, 1.0f};
        a2.g = new Color[]{new Color(a2.b(13245, 1669189001668025389L), a2.b(6465, 1791346165418555099L), a2.b(18186, 5080263675727915153L)), new Color(a2.b(23436, 6696439491615831070L), a2.b(15816, 5502386861443371614L), a2.b(26087, 2280469981395683952L))};
        a2.o = new Color[]{new Color(a2.b(11625, 2586923705519325946L), a2.b(2712, 3639229686170871049L), a2.b(2712, 3639229686170871049L)), new Color(a2.b(20712, 6906285494068199281L), a2.b(5054, 4932887085335051307L), a2.b(5054, 4932887085335051307L))};
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6F93;
        if (d[n11] == null) {
            a2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

