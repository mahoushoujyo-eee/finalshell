/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.px
 */
final class px_2
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    px_2(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 59: {
                    return px_2.b(17634, 8158491398154588901L);
                }
                case 60: {
                    return px_2.b(4111, 4400060073116190217L);
                }
                case 61: {
                    return px_2.b(26468, 7892364082867679589L);
                }
                case 62: {
                    return px_2.b(16948, 4060266920002458673L);
                }
                case 64: {
                    return px_2.b(14024, 6079148805039939776L);
                }
                case 91: {
                    return px_2.b(21883, 1596295713671512953L);
                }
                case 92: {
                    return px_2.b(14245, 1244260763619778982L);
                }
                case 93: {
                    return px_2.b(10359, 8899212740959862387L);
                }
                case 94: {
                    return px_2.b(28458, 2647895776840595754L);
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
                var0 = 845870773022665261L;
                var6_1 = new long[9];
                var3_2 = 0;
                var4_3 = "\u00b8\u00fb\u00d3\u00b2\u008b1\u0093\u00fbE\u00fb%u\u00da\u0087\u009b\u008d\u009f)xh\u00fe8)\u00b0F\u00df_Z\u00f0e\u00cb}\u0005rZl\u00falT\u00bb\u00e1\u00c5'6\u00e3\u00e2\u00be\u00c0(\u0081\u0001\u008cw\u009e\u00ec\u00f0";
                var5_4 = "\u00b8\u00fb\u00d3\u00b2\u008b1\u0093\u00fbE\u00fb%u\u00da\u0087\u009b\u008d\u009f)xh\u00fe8)\u00b0F\u00df_Z\u00f0e\u00cb}\u0005rZl\u00falT\u00bb\u00e1\u00c5'6\u00e3\u00e2\u00be\u00c0(\u0081\u0001\u008cw\u009e\u00ec\u00f0".length();
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
                    var4_3 = "\u00e6\u001c>\u0006\u00fd\u00f38\f \u008d\u00d5\u00f5\u00a2\u00c3\u00ca\u0004";
                    var5_4 = "\u00e6\u001c>\u0006\u00fd\u00f38\f \u008d\u00d5\u00f5\u00a2\u00c3\u00ca\u0004".length();
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
        px_2.c = var6_1;
        px_2.d = new Integer[9];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5600;
        if (d[n11] == null) {
            px_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

