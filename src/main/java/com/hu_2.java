/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;
import com.iw_2;

/*
 * Renamed from com.hu
 */
public class hu_2
extends hn_1 {
    private int a;
    private int B;
    private int E;
    private int Z;
    private int e;
    private int T;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    public hu_2() {
        this.O = true;
    }

    public void G(int n10) {
        this.a = n10;
    }

    public int N() {
        return this.a;
    }

    public void A(int n10) {
        this.B = n10;
    }

    public int Y() {
        return this.B;
    }

    public void b(int n10) {
        this.E = n10;
    }

    public int e() {
        return this.E;
    }

    public void d(int n10) {
        this.Z = n10;
    }

    public int L() {
        return this.Z;
    }

    public void T(int n10) {
        this.e = n10;
    }

    public int u() {
        return this.e;
    }

    public void a(int n10) {
        this.T = n10;
    }

    public int w() {
        return this.T;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 & hu_2.a(22749, 2872125074394513983L);
        int n14 = n12 >> hu_2.a(8918, 6802955287001790515L) & hu_2.a(10167, 8873600866088484177L);
        int n15 = n12 >> hu_2.a(13779, 7262283193810218800L) & hu_2.a(9501, 2844914205687480313L);
        int n16 = n12 & hu_2.a(9501, 2844914205687480313L);
        int n17 = iw_2.e((this.Z * (this.a * n15 + (hu_2.a(9501, 2844914205687480313L) - this.a) * n16) / hu_2.a(9501, 2844914205687480313L) + (hu_2.a(9501, 2844914205687480313L) - this.Z) * n14) / hu_2.a(9501, 2844914205687480313L));
        int n18 = iw_2.e((this.e * (this.B * n16 + (hu_2.a(9501, 2844914205687480313L) - this.B) * n14) / hu_2.a(9501, 2844914205687480313L) + (hu_2.a(9501, 2844914205687480313L) - this.e) * n15) / hu_2.a(9501, 2844914205687480313L));
        int n19 = iw_2.e((this.T * (this.E * n14 + (hu_2.a(9501, 2844914205687480313L) - this.E) * n15) / hu_2.a(9501, 2844914205687480313L) + (hu_2.a(9501, 2844914205687480313L) - this.T) * n16) / hu_2.a(9501, 2844914205687480313L));
        return n13 | n17 << hu_2.a(29276, 7851669298017249468L) | n18 << hu_2.a(3202, 2575459298467108453L) | n19;
    }

    public String toString() {
        return b;
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
                v0 = "J\u000f\u0016U 6rD\t\u0002\u001a\u0011-<g\u000e\u001fV!ks'".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 80;
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
                                v9 = 89;
                                break;
                            }
                            case 1: {
                                v9 = 48;
                                break;
                            }
                            case 2: {
                                v9 = 42;
                                break;
                            }
                            case 3: {
                                v9 = 106;
                                break;
                            }
                            case 4: {
                                v9 = 2;
                                break;
                            }
                            case 5: {
                                v9 = 21;
                                break;
                            }
                            default: {
                                v9 = 13;
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
                hu_2.b = new String(v10).intern();
                var0_1 = 1540324260034908266L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00d6\u00aa\u0002\u00da\u00cb\u0081m\u00c4\u00cd\u00e5(\u00c4\u00cc\u00d7\u00c6\u0007B\u00e97\u0092@:\u00eflFM;.\u00de\u00d7hI\u00cc\u00a4\u0001\u00d2\u00a0\u008b\u0012U";
                var5_5 = "\u00d6\u00aa\u0002\u00da\u00cb\u0081m\u00c4\u00cd\u00e5(\u00c4\u00cc\u00d7\u00c6\u0007B\u00e97\u0092@:\u00eflFM;.\u00de\u00d7hI\u00cc\u00a4\u0001\u00d2\u00a0\u008b\u0012U".length();
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
                    var4_4 = ";\u00e1\u00fbh\u008f\u0014\u00ffRZ?L\u00ae\u008cd\u00b8\u00c6";
                    var5_5 = ";\u00e1\u00fbh\u008f\u0014\u00ffRZ?L\u00ae\u008cd\u00b8\u00c6".length();
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
        hu_2.c = var6_2;
        hu_2.d = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5AE6;
        if (d[n11] == null) {
            hu_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

