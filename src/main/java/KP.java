/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

public class KP {
    private static final long[] a;
    private static final Integer[] b;

    public UK g(String string, long l2) {
        return this.g(string, l2, 0L, "0", 0, 0L);
    }

    public UK g(String string, long l2, long l3, String string2, int n10, long l4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append('\u0000');
        stringBuilder.append(l2);
        stringBuilder.append((char)KP.a(32479, 8964787587379403610L));
        stringBuilder.append(l3);
        stringBuilder.append((char)KP.a(14955, 6621270195120496620L));
        stringBuilder.append(string2);
        String[] stringArray = ub_0.A();
        stringBuilder.append((char)KP.a(14955, 6621270195120496620L));
        String[] stringArray2 = stringArray;
        stringBuilder.append((char)KP.a(21552, 6143441846560240054L));
        stringBuilder.append((char)KP.a(14955, 6621270195120496620L));
        stringBuilder.append(n10);
        stringBuilder.append((char)KP.a(14955, 6621270195120496620L));
        stringBuilder.append(l4);
        stringBuilder.append((char)KP.a(16656, 4265651251991225492L));
        UK uK2 = new UK(x9.ZCRCW, stringBuilder.toString().getBytes());
        if (stringArray2 != null) {
            ky_2.K(new String[4]);
        }
        return uK2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5868620250671853939L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u009bY\u00d8\u0003\u00c8V\u0095\u00d7<\u0006_\u00a9ba*\t";
                var5_4 = "\u009bY\u00d8\u0003\u00c8V\u0095\u00d7<\u0006_\u00a9ba*\t".length();
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
                    var4_3 = "\u00be\u00e9\r\u00d70\u008b\u0080\u00f5\u00c6\u0085\u00c9\u00f0\u0004\u00fcn\u00bf";
                    var5_4 = "\u00be\u00e9\r\u00d70\u008b\u0080\u00f5\u00c6\u0085\u00c9\u00f0\u0004\u00fcn\u00bf".length();
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
        KP.a = var6_1;
        KP.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6584;
        if (b[n11] == null) {
            KP.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

