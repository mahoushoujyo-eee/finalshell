/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pS
 */
final class ps_1
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    ps_1(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 32: {
                    return ps_1.b(22739, 1621148388097827633L);
                }
                case 59: {
                    return ps_1.b(24932, 3319816252677233285L);
                }
                case 60: {
                    return ps_1.b(27465, 6861003163762725036L);
                }
                case 61: {
                    return ps_1.b(19397, 8853399796997074987L);
                }
                case 62: {
                    return ps_1.b(30173, 527254246849744443L);
                }
                case 64: {
                    return ps_1.b(28425, 4817293319986779366L);
                }
                case 91: {
                    return ps_1.b(11255, 6458680791600418832L);
                }
                case 92: {
                    return ps_1.b(18735, 11985810980582092L);
                }
                case 93: {
                    return ps_1.b(21086, 1486653411594217914L);
                }
                case 94: {
                    return ps_1.b(20978, 9211052943038130706L);
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
                var0 = 6116269767657362602L;
                var6_1 = new long[10];
                var3_2 = 0;
                var4_3 = "\u00f2\u00a2\u00cf\u0004\u001fV\u00c4^E\u0007\u0010fjf\u001aM\u00c13EYyE\u0004\u00d0g\u00a55\u00e9u\u009f\u00bd\u00f5\u00ff\u00f3\u00a4\u0096\u00d6z&\u00907\u0081\u00adyki7R\u009d\u0019\u0081t/\u00c8\u008e\u00eb\u008a\u00fcL5\u00b6\u00b7>D";
                var5_4 = "\u00f2\u00a2\u00cf\u0004\u001fV\u00c4^E\u0007\u0010fjf\u001aM\u00c13EYyE\u0004\u00d0g\u00a55\u00e9u\u009f\u00bd\u00f5\u00ff\u00f3\u00a4\u0096\u00d6z&\u00907\u0081\u00adyki7R\u009d\u0019\u0081t/\u00c8\u008e\u00eb\u008a\u00fcL5\u00b6\u00b7>D".length();
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
                    var4_3 = "E!\u0096\u00b4\u009f\u0001\u0000\u00a5?\u00ebx\u00a4\u0081+$D";
                    var5_4 = "E!\u0096\u00b4\u009f\u0001\u0000\u00a5?\u00ebx\u00a4\u0081+$D".length();
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
        ps_1.c = var6_1;
        ps_1.d = new Integer[10];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7BE7;
        if (d[n11] == null) {
            ps_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

