/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;
import java.awt.Color;

/*
 * Renamed from com.hU
 */
public class hu_1
extends hn_1 {
    public float k;
    public float f;
    public float J;
    private float[] d = new float[3];
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hu_1() {
        this(0.0f, 0.0f, 0.0f);
    }

    public hu_1(float f10, float f11, float f12) {
        this.k = f10;
        this.f = f11;
        this.J = f12;
        this.O = true;
    }

    public void b(float f10) {
        this.k = f10;
    }

    public float y() {
        return this.k;
    }

    public void Y(float f10) {
        this.f = f10;
    }

    public float Y() {
        return this.f;
    }

    public void g(float f10) {
        this.J = f10;
    }

    public float z() {
        return this.J;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10;
        block20: {
            int n13;
            block19: {
                String[] stringArray;
                block17: {
                    double d2;
                    block18: {
                        block16: {
                            block15: {
                                block13: {
                                    double d3;
                                    block14: {
                                        float f11;
                                        block12: {
                                            n13 = n12 & hu_1.a(21969, 7741928864024405905L);
                                            int n14 = n12 >> hu_1.a(17284, 6065292591335158210L) & hu_1.a(12472, 1395244019735053050L);
                                            int n15 = n12 >> hu_1.a(4651, 7630761906355953772L) & hu_1.a(20486, 6276318792133026375L);
                                            stringArray = W5.q();
                                            int n16 = n12 & hu_1.a(20486, 6276318792133026375L);
                                            Color.RGBtoHSB(n14, n15, n16, this.d);
                                            this.d[0] = this.d[0] + this.k;
                                            while (this.d[0] < 0.0f) {
                                                this.d[0] = (float)((double)this.d[0] + Math.PI * 2);
                                                if (stringArray != null) {
                                                    if (stringArray != null) continue;
                                                }
                                                break block12;
                                            }
                                            this.d[1] = this.d[1] + this.f;
                                        }
                                        f10 = (f11 = this.d[1] - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                        if (stringArray == null) break block13;
                                        if (f10 >= 0) break block14;
                                        this.d[1] = 0.0f;
                                        if (stringArray != null) break block15;
                                    }
                                    f10 = (d3 = (double)this.d[1] - 1.0) == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                }
                                if (stringArray == null) break block16;
                                if (f10 > 0) {
                                    this.d[1] = 1.0f;
                                }
                            }
                            this.d[2] = this.d[2] + this.J;
                            float f12 = this.d[2] - 0.0f;
                            f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                        }
                        if (stringArray == null) break block17;
                        if (f10 >= 0) break block18;
                        this.d[2] = 0.0f;
                        if (stringArray != null) break block19;
                    }
                    f10 = (d2 = (double)this.d[2] - 1.0) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                }
                if (stringArray == null) break block20;
                if (f10 > 0) {
                    this.d[2] = 1.0f;
                }
            }
            n12 = Color.HSBtoRGB(this.d[0], this.d[1], this.d[2]);
            f10 = n13 | n12 & hu_1.a(12757, 1734891602475139990L);
        }
        return (int)f10;
    }

    public String toString() {
        return a;
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
                v0 = "b$\u001b\u001eN?-`/\u001d\u0004O8\"i\u00185_\u0012b".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 97;
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
                                v9 = 64;
                                break;
                            }
                            case 1: {
                                v9 = 42;
                                break;
                            }
                            case 2: {
                                v9 = 22;
                                break;
                            }
                            case 3: {
                                v9 = 16;
                                break;
                            }
                            case 4: {
                                v9 = 93;
                                break;
                            }
                            case 5: {
                                v9 = 45;
                                break;
                            }
                            default: {
                                v9 = 99;
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
                hu_1.a = new String(v10).intern();
                var0_1 = 4337524088303750666L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "\u00dd\u00ef9p!\u00a2\u00b2c\u00ba)]\u008as@L\u000f\u0012\u00d9+\u008c~9,\u00b2hd\u001b\\/\u008f)\u009b";
                var5_5 = "\u00dd\u00ef9p!\u00a2\u00b2c\u00ba)]\u008as@L\u000f\u0012\u00d9+\u008c~9,\u00b2hd\u001b\\/\u008f)\u009b".length();
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
                    var4_4 = "i\f\u000b\u00afa\u00e6nn\u008f\u000fu\u00e8\u00a5\\\u00bf\u00d8";
                    var5_5 = "i\f\u000b\u00afa\u00e6nn\u008f\u000fu\u00e8\u00a5\\\u00bf\u00d8".length();
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
        hu_1.b = var6_2;
        hu_1.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7243;
        if (c[n11] == null) {
            hu_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

