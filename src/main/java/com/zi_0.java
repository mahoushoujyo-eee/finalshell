/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.zH;
import com.zd_0;

/*
 * Renamed from com.zi
 */
public class zi_0
extends zd_0 {
    private int B;
    private int f;
    private static final long[] a;
    private static final Integer[] b;

    public zi_0() {
        this(zi_0.a(21175, 8733262015794721073L));
    }

    public zi_0(int n10) {
        this.N(n10);
    }

    public void N(int n10) {
        this.B = n10;
        this.f = n10 << zi_0.a(31910, 3409576007640489761L);
    }

    public int N() {
        return this.B;
    }

    @Override
    public int T(int n10, int n11, int n12) {
        String[] stringArray = zH.U();
        int n13 = n12 & zi_0.a(678, 8626399962604232995L);
        if (stringArray == null) {
            if (n13 != 0) {
                return n12 & zi_0.a(15302, 2230779386645338178L) | this.f;
            }
            n13 = n12;
        }
        return n13;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1276705293287567417L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "&K\u00bb^d\u009f\u0001\u0080\u00ee\u00c5#\u007fC_/\u0000";
                var5_4 = "&K\u00bb^d\u009f\u0001\u0080\u00ee\u00c5#\u007fC_/\u0000".length();
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
                    var4_3 = "\u00c7\u001f#\u0002@\u00f9\u0097\u0084+\u008d\u00b5\u00ff{3\u00d1\u001a";
                    var5_4 = "\u00c7\u001f#\u0002@\u00f9\u0097\u0084+\u008d\u00b5\u00ff{3\u00d1\u001a".length();
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
        zi_0.a = var6_1;
        zi_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6386;
        if (b[n11] == null) {
            zi_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

