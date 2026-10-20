/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;
import com.hx_1;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hc
 */
public class hc_2
extends hn_1 {
    private float h;
    private float l = 0.0f;
    protected float y = 5.0f;
    private float f;
    private float x;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hc_2() {
        this(3.0f, 0.75f, 0.0f);
    }

    public hc_2(float f10, float f11, float f12) {
        this.y = f10;
        this.h = f11;
        this.l = f12;
    }

    public void E(float f10) {
        this.y = f10;
    }

    public float f() {
        return this.y;
    }

    public void H(float f10) {
        this.h = f10;
    }

    public float i() {
        return this.h;
    }

    public void l(float f10) {
        this.l = f10;
    }

    public float Z() {
        return this.l;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        bufferedImage2 = new hx_1((int)this.y).filter(bufferedImage, null);
        this.f = 255.0f * (this.h - this.l * 0.5f);
        this.x = 255.0f * (this.h + this.l * 0.5f);
        return super.filter(bufferedImage2, bufferedImage2);
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13;
        int n14;
        block12: {
            int n15;
            block11: {
                String[] stringArray;
                block9: {
                    block10: {
                        block8: {
                            int n16;
                            block7: {
                                n15 = n12 >> hc_2.a(10860, 3937465560785867191L) & hc_2.a(258, 8657617997906967259L);
                                int n17 = n12 >> hc_2.a(11253, 2727212887988195373L) & hc_2.a(4703, 3480584574305102209L);
                                stringArray = W5.q();
                                int n18 = n12 >> hc_2.a(19681, 8203901428195145534L) & hc_2.a(4703, 3480584574305102209L);
                                int n19 = n12 & hc_2.a(4703, 3480584574305102209L);
                                n16 = n15;
                                if (stringArray == null) break block7;
                                if (n16 != hc_2.a(4703, 3480584574305102209L)) break block8;
                                n16 = -1;
                            }
                            return n16;
                        }
                        float f10 = NM.k(this.f, this.x, n15);
                        n14 = n15 = (int)(f10 * 255.0f);
                        if (stringArray == null) break block9;
                        if (n14 >= 0) break block10;
                        n15 = 0;
                        if (stringArray != null) break block11;
                    }
                    n14 = n15;
                }
                n13 = hc_2.a(4703, 3480584574305102209L);
                if (stringArray == null) break block12;
                if (n14 > n13) {
                    n15 = hc_2.a(4703, 3480584574305102209L);
                }
            }
            n14 = n15 << hc_2.a(28767, 7691874018330348419L);
            n13 = hc_2.a(21623, 959257861320912810L);
        }
        return n14 | n13;
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
                v0 = "\u001a\u001c/\u0003c<\t)\u001f;\u000e,=b".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 72;
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
                                v9 = 19;
                                break;
                            }
                            case 1: {
                                v9 = 56;
                                break;
                            }
                            case 2: {
                                v9 = 23;
                                break;
                            }
                            case 3: {
                                v9 = 35;
                                break;
                            }
                            case 4: {
                                v9 = 74;
                                break;
                            }
                            case 5: {
                                v9 = 91;
                                break;
                            }
                            default: {
                                v9 = 4;
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
                hc_2.a = new String(v10).intern();
                var0_1 = 4397043545572781215L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u001e\u00fe\u00bd\u00c5\u00ab=|\u00ca\u00e5i\u0005\u00e9ti'\u0004\u00c5;<\u0017\u001c.\u001b\u00a9\u00e3\u0090O\u00ffY\u00e2\u00c5\u00e1\u00e8\u00ca\u0004\u00eb\u0015\u008f\u00d6\u00bb";
                var5_5 = "\u001e\u00fe\u00bd\u00c5\u00ab=|\u00ca\u00e5i\u0005\u00e9ti'\u0004\u00c5;<\u0017\u001c.\u001b\u00a9\u00e3\u0090O\u00ffY\u00e2\u00c5\u00e1\u00e8\u00ca\u0004\u00eb\u0015\u008f\u00d6\u00bb".length();
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
                    var4_4 = "-\u008a\u00f2\u008e\u00f4\u00ad|\u00a2\u009a\u00d2\u00e2U\u00023\u00fd0";
                    var5_5 = "-\u008a\u00f2\u008e\u00f4\u00ad|\u00a2\u009a\u00d2\u00e2U\u00023\u00fd0".length();
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
        hc_2.b = var6_2;
        hc_2.c = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7BDD;
        if (c[n11] == null) {
            hc_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

