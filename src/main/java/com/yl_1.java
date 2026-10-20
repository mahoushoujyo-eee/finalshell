/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.iw_2;
import com.zI;
import java.awt.Rectangle;

/*
 * Renamed from com.yL
 */
public class yl_1
extends gt_1 {
    private int[][] t;
    private float c = 0.0f;
    private float F = 1.0f;
    private float i = 0.0f;
    private float p = 1.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] d;

    public void T(float f10) {
        this.c = f10;
    }

    public float w() {
        return this.c;
    }

    public void d(float f10) {
        this.F = f10;
    }

    public float C() {
        return this.F;
    }

    public void l(float f10) {
        this.i = f10;
    }

    public float Q() {
        return this.i;
    }

    public void A(float f10) {
        this.p = f10;
    }

    public float g() {
        return this.p;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        block14: {
            int n12;
            int n13;
            String[] stringArray;
            block12: {
                int n14;
                block17: {
                    block16: {
                        zI zI2 = new zI(nArray, n10, n11, 0, n10);
                        stringArray = W5.q();
                        if (zI2.M() <= 0) break block16;
                        float f10 = 255.0f / (float)zI2.M();
                        this.t = new int[3][yl_1.a(25020, 4631435306475356039L)];
                        float f11 = this.c * 255.0f;
                        float f12 = this.F * 255.0f;
                        float f13 = f11 == f12 ? 0 : (f11 > f12 ? 1 : -1);
                        if (stringArray != null) {
                            if (f13 == false) {
                                f12 += 1.0f;
                            }
                            f13 = 0.0f;
                        }
                        n13 = (int)f13;
                        while (n13 < 3) {
                            block13: {
                                n14 = 0;
                                if (stringArray == null) break block12;
                                for (int i2 = v9941861; i2 < yl_1.a(407, 2074392531107389349L); ++i2) {
                                    this.t[n13][i2] = iw_2.e((int)(255.0f * (this.i + (this.p - this.i) * ((float)i2 - f11) / (f12 - f11))));
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                    }
                                    break block13;
                                }
                                ++n13;
                            }
                            if (stringArray != null) continue;
                        }
                        if (stringArray != null) break block17;
                    }
                    this.t = null;
                }
                n13 = 0;
                n14 = n12 = 0;
            }
            while (n12 < n11) {
                block15: {
                    if (stringArray == null) break block14;
                    for (int i3 = 0; i3 < n10; ++i3) {
                        nArray[n13] = this.d(i3, n12, nArray[n13]);
                        ++n13;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block15;
                    }
                    ++n12;
                }
                if (stringArray != null) continue;
            }
            this.t = null;
        }
        return nArray;
    }

    public int d(int n10, int n11, int n12) {
        if (this.t != null) {
            int n13 = n12 & yl_1.a(30196, 2431400434846297026L);
            int n14 = this.t[0][n12 >> yl_1.a(9919, 524616122743568522L) & yl_1.a(5809, 1360934392350869633L)];
            int n15 = this.t[1][n12 >> yl_1.a(11924, 7298995651828789415L) & yl_1.a(26274, 5172968155250522262L)];
            int n16 = this.t[2][n12 & yl_1.a(26274, 5172968155250522262L)];
            return n13 | n14 << yl_1.a(25083, 8304953073868373964L) | n15 << yl_1.a(25351, 8150162246890519862L) | n16;
        }
        return n12;
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
                v0 = "!\b$Zn63.\u0002>Pp62LI".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 118;
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
                                v9 = 20;
                                break;
                            }
                            case 1: {
                                v9 = 17;
                                break;
                            }
                            case 2: {
                                v9 = 62;
                                break;
                            }
                            case 3: {
                                v9 = 67;
                                break;
                            }
                            case 4: {
                                v9 = 106;
                                break;
                            }
                            case 5: {
                                v9 = 51;
                                break;
                            }
                            default: {
                                v9 = 106;
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
                yl_1.a = new String(v10).intern();
                var0_1 = 8362081296898534500L;
                var6_2 = new long[9];
                var3_3 = 0;
                var4_4 = "Hs\u00c3\u00e3\u0000\u00f3\u001c\u00cb\u00a4x\u00ac\u00ea\u0091\u00f22\u00c1\u0014X\u00a4\u0002w&QZ\u00fb\u00b4\u009db.<\u00a4\u001a9\u00b4\r\u00a8\u0010\u00a5S\u00b8\u00a0g\u001a\u00b0b-G\u00a6\u00e6\u0084\u0013\t#\u0001\u0094\u00fe";
                var5_5 = "Hs\u00c3\u00e3\u0000\u00f3\u001c\u00cb\u00a4x\u00ac\u00ea\u0091\u00f22\u00c1\u0014X\u00a4\u0002w&QZ\u00fb\u00b4\u009db.<\u00a4\u001a9\u00b4\r\u00a8\u0010\u00a5S\u00b8\u00a0g\u001a\u00b0b-G\u00a6\u00e6\u0084\u0013\t#\u0001\u0094\u00fe".length();
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
                    var4_4 = "\u0084\u0099\u00bb\u009f\u0094\u008eT\r\u000e\u00cd\u0017\u001f\u00d69R\u00e3";
                    var5_5 = "\u0084\u0099\u00bb\u009f\u0094\u008eT\r\u000e\u00cd\u0017\u001f\u00d69R\u00e3".length();
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
        yl_1.b = var6_2;
        yl_1.d = new Integer[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1E33;
        if (d[n11] == null) {
            yl_1.d[n11] = (int)(b[n11] ^ l2);
        }
        return d[n11];
    }
}

