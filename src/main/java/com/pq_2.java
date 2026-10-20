/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pq
 */
final class pq_2
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pq_2(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 3: {
                    return pq_2.b(19376, 4435609268750268143L);
                }
                case 32: {
                    return pq_2.b(15666, 7887783927718625380L);
                }
                case 59: {
                    return pq_2.b(22765, 3676874647023527349L);
                }
                case 60: {
                    return pq_2.b(16136, 1571257213642228319L);
                }
                case 61: {
                    return pq_2.b(10756, 8656336647490623312L);
                }
                case 62: {
                    return pq_2.b(28624, 8423946668774658697L);
                }
                case 63: {
                    return pq_2.b(19379, 2786405475314513640L);
                }
                case 64: {
                    return pq_2.b(3281, 1412997684481651083L);
                }
                case 91: {
                    return pq_2.b(20302, 6510346966320919058L);
                }
                case 92: {
                    return pq_2.b(5082, 7413038728197009039L);
                }
                case 93: {
                    return pq_2.b(10381, 1038557458687415760L);
                }
                case 94: {
                    return pq_2.b(18099, 3829272397685767149L);
                }
            }
            n11 = -1;
        }
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3420720960302243833L;
                var6_1 = new long[12];
                var3_2 = 0;
                var4_3 = "'F\u00f7\u00f0\u00f8\u00c6i\u00ef\u008a\u00fd\u00f39\u00e6\u00c8\u00e4\u00ef\u00e1\u00efy\u00eaai\n\u00d5\u00f0\u00e5\u008c[f\u0095\u00ed\u000f\u0084s9\u00d2\u00be\u00dfi\u00f9\u0011H7H\u00a9v.\u0086\u00ac\u00e4i*\r\u00aaM\u009e\u00c2\u008ar\u0015A\u00f6z\u00a5\u0095\u00bf\u00a8\u00c7\u0097f\u001dA\u00f07\u0086\u009e\u00168\u001f}";
                var5_4 = "'F\u00f7\u00f0\u00f8\u00c6i\u00ef\u008a\u00fd\u00f39\u00e6\u00c8\u00e4\u00ef\u00e1\u00efy\u00eaai\n\u00d5\u00f0\u00e5\u008c[f\u0095\u00ed\u000f\u0084s9\u00d2\u00be\u00dfi\u00f9\u0011H7H\u00a9v.\u0086\u00ac\u00e4i*\r\u00aaM\u009e\u00c2\u008ar\u0015A\u00f6z\u00a5\u0095\u00bf\u00a8\u00c7\u0097f\u001dA\u00f07\u0086\u009e\u00168\u001f}".length();
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
                    var4_3 = " H}\u00b4v\u00e91\u0080\u00a4\u00eap\u000f\u00a3S\u0088C";
                    var5_4 = " H}\u00b4v\u00e91\u0080\u00a4\u00eap\u000f\u00a3S\u0088C".length();
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
        pq_2.c = var6_1;
        pq_2.d = new Integer[12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7D5F;
        if (d[n11] == null) {
            pq_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

