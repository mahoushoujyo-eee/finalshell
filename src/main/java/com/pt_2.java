/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pt
 */
final class pt_2
extends pg_1 {
    private static final long[] c;
    private static final Integer[] d;

    pt_2(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            switch (n11) {
                case 32: {
                    return pt_2.b(32616, 6719956199849845137L);
                }
                case 59: {
                    return pt_2.b(1951, 3679069710399117665L);
                }
                case 60: {
                    return pt_2.b(27156, 4551709459514127595L);
                }
                case 61: {
                    return pt_2.b(8081, 2243412457879273837L);
                }
                case 91: {
                    return pt_2.b(17431, 4847784419949599469L);
                }
                case 92: {
                    return pt_2.b(24429, 6830623067884732822L);
                }
                case 93: {
                    return pt_2.b(3190, 1383845708178559630L);
                }
                case 94: {
                    return pt_2.b(22526, 769331665669736707L);
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
                var0 = 1941317084948595579L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u0081\u00d0\u00d8\u0080\u00a6\u0006\u00d9r\u0092`\u00e6\u0002\u001f\u0019\u00c2\u001b\u008e\u00f5\u00af\u0084\u009f,\u0091\t\u0099\u00e9\u00da\u00be:\u00f9\u00e2M\u0092\u00aaP)\u00d4\u00ff\u001a\u00deh\u00a2\u00f9\u00baC\u00dd\u00f7F";
                var5_4 = "\u0081\u00d0\u00d8\u0080\u00a6\u0006\u00d9r\u0092`\u00e6\u0002\u001f\u0019\u00c2\u001b\u008e\u00f5\u00af\u0084\u009f,\u0091\t\u0099\u00e9\u00da\u00be:\u00f9\u00e2M\u0092\u00aaP)\u00d4\u00ff\u001a\u00deh\u00a2\u00f9\u00baC\u00dd\u00f7F".length();
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
                    var4_3 = "B;):\u00e0V\u0082\u00ca\u0017\u00a3\u00e4p\u008avJ\u00a7";
                    var5_4 = "B;):\u00e0V\u0082\u00ca\u0017\u00a3\u00e4p\u008avJ\u00a7".length();
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
        pt_2.c = var6_1;
        pt_2.d = new Integer[8];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1EFA;
        if (d[n11] == null) {
            pt_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

