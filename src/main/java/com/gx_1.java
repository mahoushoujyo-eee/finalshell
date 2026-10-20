/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gj_2;

/*
 * Renamed from com.gX
 */
public class gx_1
extends gj_2 {
    private float n;
    private float X;
    private float h;
    private static final String a;
    private static final long[] b;
    private static final Integer[] g;

    public gx_1() {
        this(1.0f);
    }

    public gx_1(float f10) {
        this(f10, f10, f10);
    }

    public gx_1(float f10, float f11, float f12) {
        this.p(f10, f11, f12);
    }

    public void p(float f10, float f11, float f12) {
        this.n = f10;
        this.X = f11;
        this.h = f12;
        this.N = false;
    }

    public void s(float f10) {
        this.p(f10, f10, f10);
    }

    public float U() {
        return this.n;
    }

    @Override
    protected void D() {
        block9: {
            block10: {
                gx_1 gx_12;
                block11: {
                    float f10;
                    String[] stringArray;
                    block7: {
                        block8: {
                            float f11;
                            block6: {
                                block4: {
                                    gx_1 gx_13;
                                    block5: {
                                        this.f = this.Z(this.n);
                                        stringArray = W5.q();
                                        gx_13 = this;
                                        if (stringArray == null) break block4;
                                        if (gx_13.X != this.n) break block5;
                                        this.d = this.f;
                                        if (stringArray != null) break block6;
                                    }
                                    gx_13 = this;
                                }
                                gx_13.d = this.Z(this.X);
                            }
                            f10 = (f11 = this.h - this.n) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                            if (stringArray == null) break block7;
                            if (f10 != false) break block8;
                            this.M = this.f;
                            if (stringArray != null) break block9;
                        }
                        gx_12 = this;
                        if (stringArray == null) break block10;
                        float f12 = gx_12.h - this.X;
                        f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (f10 != false) break block11;
                    this.M = this.d;
                    if (stringArray != null) break block9;
                }
                gx_12 = this;
            }
            gx_12.M = this.Z(this.h);
        }
    }

    private int[] Z(float f10) {
        int[] nArray = new int[gx_1.b(28946, 6699172578224408797L)];
        String[] stringArray = W5.q();
        int n10 = 0;
        while (n10 < gx_1.b(13384, 3543511213800410501L)) {
            int n11 = (int)(255.0 * Math.pow((double)n10 / 255.0, 1.0 / (double)f10) + 0.5);
            if (stringArray != null) {
                if (n11 > gx_1.b(18623, 2755528337822364019L)) {
                    n11 = gx_1.b(18507, 6649012839953084805L);
                }
                nArray[n10] = n11;
                ++n10;
            }
            if (stringArray != null) continue;
        }
        return nArray;
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
                v0 = "J\u0019yB4gYN\u0017x@':X'".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 2;
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
                                v9 = 11;
                                break;
                            }
                            case 1: {
                                v9 = 116;
                                break;
                            }
                            case 2: {
                                v9 = 23;
                                break;
                            }
                            case 3: {
                                v9 = 47;
                                break;
                            }
                            case 4: {
                                v9 = 68;
                                break;
                            }
                            case 5: {
                                v9 = 22;
                                break;
                            }
                            default: {
                                v9 = 116;
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
                gx_1.a = new String(v10).intern();
                var0_1 = 8397254394260256233L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "\u009e\u00ac\u0000\u00a6\u00dcb\u00fc4\u008f\u0098\u00de\u008f\u00ba\u0012D\u0093";
                var5_5 = "\u009e\u00ac\u0000\u00a6\u00dcb\u00fc4\u008f\u0098\u00de\u008f\u00ba\u0012D\u0093".length();
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
                    var4_4 = "TG\u00d9\u0001>W\u00b9l\r\u00fb\u00cc\u009d\n\u0014\u00c4e";
                    var5_5 = "TG\u00d9\u0001>W\u00b9l\r\u00fb\u00cc\u009d\n\u0014\u00c4e".length();
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
        gx_1.b = var6_2;
        gx_1.g = new Integer[4];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x79CF;
        if (g[n11] == null) {
            gx_1.g[n11] = (int)(b[n11] ^ l2);
        }
        return g[n11];
    }
}

