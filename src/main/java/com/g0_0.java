/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.Point;
import java.awt.Rectangle;

/*
 * Renamed from com.g0
 */
public class g0_0
extends gy_2 {
    private float i;
    private float u;
    private float M;
    private boolean a = true;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    public g0_0() {
        this((float)Math.PI);
    }

    public g0_0(float f10) {
        this(f10, true);
    }

    public g0_0(float f10, boolean bl) {
        this.g(f10);
        this.a = bl;
    }

    public void g(float f10) {
        this.i = f10;
        this.u = (float)Math.cos(this.i);
        this.M = (float)Math.sin(this.i);
    }

    public float y() {
        return this.i;
    }

    @Override
    protected void T(Rectangle rectangle) {
        String[] stringArray = W5.q();
        if (this.a) {
            int n10;
            block10: {
                Point point = new Point(0, 0);
                int n11 = g0_0.b(29964, 3010878173793858377L);
                int n12 = g0_0.b(8067, 3455053117070236101L);
                int n13 = g0_0.b(6610, 9150658566894935958L);
                n10 = g0_0.b(26391, 8344181275128471888L);
                int n14 = rectangle.width;
                int n15 = rectangle.height;
                int n16 = rectangle.x;
                int n17 = rectangle.y;
                for (int i2 = 0; i2 < 4; ++i2) {
                    if (stringArray != null) {
                        int n18 = i2;
                        if (stringArray != null) {
                            switch (n18) {
                                case 0: {
                                    this.z(n16, n17, point);
                                    if (stringArray != null) break;
                                }
                                case 1: {
                                    this.z(n16 + n14, n17, point);
                                    if (stringArray != null) break;
                                }
                                case 2: {
                                    this.z(n16, n17 + n15, point);
                                    if (stringArray != null) break;
                                }
                                case 3: {
                                    this.z(n16 + n14, n17 + n15, point);
                                }
                            }
                            n11 = Math.min(n11, point.x);
                            n12 = Math.min(n12, point.y);
                            n13 = Math.max(n13, point.x);
                            n18 = Math.max(n10, point.y);
                        }
                        n10 = n18;
                        if (stringArray != null) continue;
                    }
                    break block10;
                }
                rectangle.x = n11;
                rectangle.y = n12;
                rectangle.width = n13 - rectangle.x;
            }
            rectangle.height = n10 - rectangle.y;
        }
    }

    private void z(int n10, int n11, Point point) {
        point.x = (int)((float)n10 * this.u + (float)n11 * this.M);
        point.y = (int)((float)n11 * this.u - (float)n10 * this.M);
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        fArray[0] = (float)n10 * this.u - (float)n11 * this.M;
        fArray[1] = (float)n11 * this.u + (float)n10 * this.M;
    }

    public String toString() {
        return b + (int)((double)(this.i * 180.0f) / Math.PI);
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
                v0 = "\u0012\\ \bW$H".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 120;
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
                                v9 = 56;
                                break;
                            }
                            case 1: {
                                v9 = 75;
                                break;
                            }
                            case 2: {
                                v9 = 44;
                                break;
                            }
                            case 3: {
                                v9 = 17;
                                break;
                            }
                            case 4: {
                                v9 = 91;
                                break;
                            }
                            case 5: {
                                v9 = 57;
                                break;
                            }
                            default: {
                                v9 = 16;
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
                g0_0.b = new String(v10).intern();
                var0_1 = 8567805805083310118L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "\u00fa\u0017\u00c7\u009a(i\u001e\u001c^\u00fe\u00190\u00c1\u00fa\u0099v";
                var5_5 = "\u00fa\u0017\u00c7\u009a(i\u001e\u001c^\u00fe\u00190\u00c1\u00fa\u0099v".length();
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
                    var4_4 = "\u0005\u0006l\u00960-g\u00b04\u009a \u00ef\u0019\u008ft\u0090";
                    var5_5 = "\u0005\u0006l\u00960-g\u00b04\u009a \u00ef\u0019\u008ft\u0090".length();
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
        g0_0.c = var6_2;
        g0_0.d = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4646;
        if (d[n11] == null) {
            g0_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

