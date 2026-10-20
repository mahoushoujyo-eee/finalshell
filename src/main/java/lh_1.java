/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from lH
 */
public class lh_1 {
    private static final long[] a;
    private static final Integer[] b;

    public static int z(byte[] byArray, int n10) {
        String string = D6.k();
        int n11 = byArray[n10 + 3] & lh_1.a(17542, 4288412988692951734L) | (byArray[n10 + 2] & lh_1.a(27407, 8598487929337732411L)) << lh_1.a(4541, 8093063606990088074L) | (byArray[n10 + 1] & lh_1.a(27407, 8598487929337732411L)) << lh_1.a(27781, 1309988007318837936L) | (byArray[n10] & lh_1.a(27407, 8598487929337732411L)) << lh_1.a(18292, 1408193148299735362L);
        if (ky_2.F() != null) {
            D6.m("afrR4");
        }
        return n11;
    }

    public static void u(int n10, byte[] byArray, int n11) {
        byArray[n11] = (byte)(n10 >> lh_1.a(746, 5628617181711119576L));
        byArray[n11 + 1] = (byte)(n10 >> lh_1.a(19158, 8302948816807460069L));
        byArray[n11 + 2] = (byte)(n10 >> lh_1.a(21329, 1822333171755509088L));
        byArray[n11 + 3] = (byte)n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2039603921535498501L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u00b99A\u0088f\u00d4\u00de\u0087*\u000bZ\u009d\u00c2\u0016\u0088_U\fk:5\u00df#\u00a5\u0019&\u0001/\u00d05$\u00c1\u0097l_\u00e3\u00e7\u0093\u0005\u00f04\u0097u\u00ad\u0095\u0010\u00cd\u00c5";
                var5_4 = "\u00b99A\u0088f\u00d4\u00de\u0087*\u000bZ\u009d\u00c2\u0016\u0088_U\fk:5\u00df#\u00a5\u0019&\u0001/\u00d05$\u00c1\u0097l_\u00e3\u00e7\u0093\u0005\u00f04\u0097u\u00ad\u0095\u0010\u00cd\u00c5".length();
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
                    var4_3 = "\u00aa1\u008bC\u008dx\u001cmeR9#\u00b0\u00ab\u000bL";
                    var5_4 = "\u00aa1\u008bC\u008dx\u001cmeR9#\u00b0\u00ab\u000bL".length();
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
        lh_1.a = var6_1;
        lh_1.b = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3637;
        if (b[n11] == null) {
            lh_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

