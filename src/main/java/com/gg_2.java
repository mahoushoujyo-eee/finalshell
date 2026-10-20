/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;
import com.iw_2;
import com.po_0;
import com.uZ;
import com.wy_1;

/*
 * Renamed from com.gg
 */
public class gg_2
extends hn_1 {
    private float W = 200.0f;
    private float X = 10.0f;
    private float s = 1.5707964f;
    private float N = 0.5f;
    private float c = 0.0f;
    private float L = 0.5f;
    private float g = 0.8f;
    private float d = 1.0f;
    private float w = 0.0f;
    private float t = 0.0f;
    private float k = 1.0f;
    private po_0 o = new wy_1(gg_2.a(31256, 2821238027488255447L), gg_2.a(8907, 6172687912873788677L));
    private static final String a;
    private static final long[] b;
    private static final Integer[] e;

    public void b(float f10) {
        this.N = f10;
    }

    public float l() {
        return this.N;
    }

    public void I(float f10) {
        this.W = f10;
    }

    public float S() {
        return this.W;
    }

    public void s(float f10) {
        this.X = f10;
    }

    public float n() {
        return this.X;
    }

    public void E(float f10) {
        this.s = f10;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.d = f11;
        this.w = f12;
        this.t = -f12;
        this.k = f11;
    }

    public float L() {
        return this.s;
    }

    public void A(float f10) {
        this.c = f10;
    }

    public float j() {
        return this.c;
    }

    public void q(float f10) {
        this.L = f10;
    }

    public float a() {
        return this.L;
    }

    public void v(float f10) {
        this.g = f10;
    }

    public float J() {
        return this.g;
    }

    public void o(po_0 po_02) {
        this.o = po_02;
    }

    public po_0 Z() {
        return this.o;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13;
        block4: {
            int n14;
            float f10;
            block3: {
                po_0 po_02;
                String[] stringArray;
                block2: {
                    float f11 = this.d * (float)n10 + this.w * (float)n11;
                    float f12 = this.t * (float)n10 + this.k * (float)n11;
                    f10 = uZ.x(f11 /= this.W, f12 /= this.W * this.X);
                    f10 += 0.1f * this.c * uZ.x(f11 * 0.05f, f12 * 20.0f);
                    f10 = f10 * 0.5f + 0.5f;
                    f10 *= this.N * 50.0f;
                    f10 -= (float)((int)f10);
                    f10 *= 1.0f - NM.k(this.g, 1.0f, f10);
                    f10 += this.L * uZ.x(f11 * this.W, f12 * 50.0f);
                    n14 = n12 & gg_2.a(839, 5494301263262590095L);
                    stringArray = W5.q();
                    po_02 = this.o;
                    if (stringArray == null) break block2;
                    if (po_02 == null) break block3;
                    po_02 = this.o;
                }
                n13 = po_02.D(f10);
                if (stringArray != null) break block4;
            }
            n13 = iw_2.e((int)(f10 * 255.0f));
            int n15 = n13 << gg_2.a(29973, 5837373978456347353L);
            int n16 = n13 << gg_2.a(916, 553419587930039385L);
            int n17 = n13;
            n13 = n14 | n15 | n16 | n17;
        }
        return n13;
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
                v0 = "\n=\u001da\u001339q\u000f\nz\u0002orp".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 91;
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
                                v9 = 5;
                                break;
                            }
                            case 1: {
                                v9 = 3;
                                break;
                            }
                            case 2: {
                                v9 = 62;
                                break;
                            }
                            case 3: {
                                v9 = 78;
                                break;
                            }
                            case 4: {
                                v9 = 61;
                                break;
                            }
                            case 5: {
                                v9 = 26;
                                break;
                            }
                            default: {
                                v9 = 7;
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
                gg_2.a = new String(v10).intern();
                var0_1 = 3968563715794475662L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "\u00dd\u0082Y%\u00f2\u0090\u00c8G\u0082N\u00e48\u008a?>\u00df\u008e\u001aq\u00e8\u007f\u00c7\u00e4\u00da";
                var5_5 = "\u00dd\u0082Y%\u00f2\u0090\u00c8G\u0082N\u00e48\u008a?>\u00df\u008e\u001aq\u00e8\u007f\u00c7\u00e4\u00da".length();
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
                    var4_4 = "\u00d6\u009f\u00dc\u00b4|\u00c8\u0003\u00cdy\u0095\u00f6\u000b&\u00d0>\u0001";
                    var5_5 = "\u00d6\u009f\u00dc\u00b4|\u00c8\u0003\u00cdy\u0095\u00f6\u000b&\u00d0>\u0001".length();
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
        gg_2.b = var6_2;
        gg_2.e = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x27CC;
        if (e[n11] == null) {
            gg_2.e[n11] = (int)(b[n11] ^ l2);
        }
        return e[n11];
    }
}

