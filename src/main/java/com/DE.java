/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.b.H;
import com.b.R;
import com.b.V;
import com.b.a;
import com.b.f;
import com.b.o;
import com.b.q;
import com.b.u;
import com.py_2;
import java.awt.geom.AffineTransform;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

public final class DE {
    public static final List o;
    public static final q F;
    public static final R I;
    public static final H Y;
    public static final f W;
    public static final u Z;
    public static final o S;
    public static final f t;
    public static final List d;
    public static final py_2 n;
    public static final AffineTransform m;
    public static final AffineTransform s;
    public static final AffineTransform A;
    public static boolean K;

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var8 = new String[8];
                        var12_1 = 0;
                        var11_2 = "Y\u0019\u0000\u000f\u0004R\u0019\u000b\u000f\u0003Y\u0019\u0002\bY\u0019\u0000\u000fY\u000fV\u0003\u0003C\u0007\u0002\u0003T\u0000\u0003";
                        var13_3 = "Y\u0019\u0000\u000f\u0004R\u0019\u000b\u000f\u0003Y\u0019\u0002\bY\u0019\u0000\u000fY\u000fV\u0003\u0003C\u0007\u0002\u0003T\u0000\u0003".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 58;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "\u001eB@B\u0003\u001dHY";
                            var13_3 = "\u001eB@B\u0003\u001dHY".length();
                            var10_4 = 4;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 118;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 9;
                                    break;
                                }
                                case 1: {
                                    v15 = 83;
                                    break;
                                }
                                case 2: {
                                    v15 = 95;
                                    break;
                                }
                                case 3: {
                                    v15 = 82;
                                    break;
                                }
                                case 4: {
                                    v15 = 81;
                                    break;
                                }
                                case 5: {
                                    v15 = 5;
                                    break;
                                }
                                default: {
                                    v15 = 92;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                var1_7 = 3167877046134569485L;
                var0_8 = new long[3];
                var4_9 = 0;
                var5_10 = "(\u008fW\u00d9\u00aa\u00f6\u00fa\u0005\u00cc\u001bP@\u00aa\u00f6\u00fa\u000b\u0088\u00e1:\u00b0\u00aa\u00f6\u00fa\n";
                var6_11 = "(\u008fW\u00d9\u00aa\u00f6\u00fa\u0005\u00cc\u001bP@\u00aa\u00f6\u00fa\u000b\u0088\u00e1:\u00b0\u00aa\u00f6\u00fa\n".length();
                var3_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    var0_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var1_7;
                    if (var3_12 < var6_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
            v17 = var4_9++;
            ** while (true)
        }
        v18 = new String[(int)var0_8[0]];
        v18[0] = var8[4];
        v18[1] = var8[1];
        v18[2] = var8[5];
        v18[3] = var8[6];
        v18[4] = var8[2];
        v18[5] = var8[0];
        v18[(int)var0_8[1]] = var8[3];
        v18[(int)var0_8[2]] = var8[7];
        DE.o = Arrays.asList(v18);
        DE.F = new q();
        DE.I = new R();
        DE.Y = new H();
        DE.W = new f(a.AND, new FileFilter[]{DE.Y, DE.I});
        DE.Z = new u();
        DE.S = new o();
        DE.t = new f(a.OR, new FileFilter[]{DE.S, DE.Y});
        DE.d = Arrays.asList(new V[]{DE.F, DE.t, DE.Y});
        DE.n = new py_2();
        DE.m = new AffineTransform();
        DE.s = new AffineTransform();
        DE.A = new AffineTransform();
        DE.m.translate(1.0, 0.0);
        DE.s.translate(0.0, 1.0);
        DE.A.translate(1.0, 1.0);
        DE.K = false;
    }
}

