/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from yH
 */
public class yh_1 {
    private static final long[] a;
    private static final Integer[] b;

    public static int Q(byte[] byArray, int n10) {
        String string = cl_2.C();
        int n11 = byArray[n10 + 3] & yh_1.a(1570, 6649719372525720909L) | (byArray[n10 + 2] & yh_1.a(21616, 2467747478379104024L)) << yh_1.a(4009, 4914599086783749314L) | (byArray[n10 + 1] & yh_1.a(21616, 2467747478379104024L)) << yh_1.a(27655, 7224161949327146861L) | (byArray[n10] & yh_1.a(21616, 2467747478379104024L)) << yh_1.a(30410, 6171482297109292451L);
        if (string == null) {
            ky_2.K(new String[5]);
        }
        return n11;
    }

    public static void l(int n10, byte[] byArray, int n11) {
        byArray[n11] = (byte)(n10 >> yh_1.a(30272, 6071745841300972846L));
        String string = cl_2.C();
        byArray[n11 + 1] = (byte)(n10 >> yh_1.a(15418, 6616911048946708310L));
        byArray[n11 + 2] = (byte)(n10 >> yh_1.a(28381, 3680526275764993456L));
        byArray[n11 + 3] = (byte)n10;
        if (ky_2.F() != null) {
            cl_2.F("mZplu");
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7984449217079771769L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = ">z\u00a7n:\u001c\u00a7O\u0001\u00ca\u00c8 \u00f0BW\u00cbQ^{\u00bc\u00e9\u00fc\u00ed?\u00c2\u00db\u001bQ\u00aaY?\u00c1\u0012\u00fd\u0011Z\u00ea\u00a6=\u0004\u00b6\u00ebS\u00ff\u00c2\u001b\u00de\u00b3";
                var5_4 = ">z\u00a7n:\u001c\u00a7O\u0001\u00ca\u00c8 \u00f0BW\u00cbQ^{\u00bc\u00e9\u00fc\u00ed?\u00c2\u00db\u001bQ\u00aaY?\u00c1\u0012\u00fd\u0011Z\u00ea\u00a6=\u0004\u00b6\u00ebS\u00ff\u00c2\u001b\u00de\u00b3".length();
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
                    var4_3 = "\u00b7\u00ba\u00f7\u0091\u00ab\b\u0085\u009e\u0090\"\u0002\u00bb\u00e7\u00e0'\u00c2";
                    var5_4 = "\u00b7\u00ba\u00f7\u0091\u00ab\b\u0085\u009e\u0090\"\u0002\u00bb\u00e7\u00e0'\u00c2".length();
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
        yh_1.a = var6_1;
        yh_1.b = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x536E;
        if (b[n11] == null) {
            yh_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

