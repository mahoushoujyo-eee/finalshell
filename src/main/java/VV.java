/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;

public class VV {
    private static final String[] q;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

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
                v0 = "?\u0013e".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 115;
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
                                v9 = 1;
                                break;
                            }
                            case 1: {
                                v9 = 36;
                                break;
                            }
                            case 2: {
                                v9 = 35;
                                break;
                            }
                            case 3: {
                                v9 = 118;
                                break;
                            }
                            case 4: {
                                v9 = 100;
                                break;
                            }
                            case 5: {
                                v9 = 47;
                                break;
                            }
                            default: {
                                v9 = 17;
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
                VV.a = new String(v10).intern();
                var0_1 = 4542830768191708623L;
                var6_2 = new long[12];
                var3_3 = 0;
                var4_4 = "N\u00c5)\u00d3\u00df\u00e4\u00b8\u0086'\u0099hL\u009e3\u00b7\u0086\u0087\u00f6\u0092J5gB#\u00b0\u00fe\u0000\u00e0AP\u00e2\u00f9$\u00f4\u00acT\u0006\u00ddH\u001a\u008a^\u001d\u00be8)P'\u00a1N\u0087\u000f\u000b\f\u00d2p\u0099z;\u0015\u00ca\u00a4Q\u00f8\u0011\u00c8R\u0081\u00a8\u00fa\u00858\u00dd\u008c\u001a\u00f4\u00ceH\u0094k";
                var5_5 = "N\u00c5)\u00d3\u00df\u00e4\u00b8\u0086'\u0099hL\u009e3\u00b7\u0086\u0087\u00f6\u0092J5gB#\u00b0\u00fe\u0000\u00e0AP\u00e2\u00f9$\u00f4\u00acT\u0006\u00ddH\u001a\u008a^\u001d\u00be8)P'\u00a1N\u0087\u000f\u000b\f\u00d2p\u0099z;\u0015\u00ca\u00a4Q\u00f8\u0011\u00c8R\u0081\u00a8\u00fa\u00858\u00dd\u008c\u001a\u00f4\u00ceH\u0094k".length();
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
                    var4_4 = "/\u00ae\u008e=u\u0092\u008f\r\u00a3%\u00ed\u001fJ-\u00b7\u00a1";
                    var5_5 = "/\u00ae\u008e=u\u0092\u008f\r\u00a3%\u00ed\u001fJ-\u00b7\u00a1".length();
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
        VV.b = var6_2;
        VV.c = new Integer[12];
        v16 = new String[VV.a(18386, 2185491522946944504L)];
        v16[0] = "0";
        v16[1] = "1";
        v16[2] = "2";
        v16[3] = "3";
        v16[4] = "4";
        v16[5] = "5";
        v16[VV.a((int)900, (long)8894847978515237282L)] = "6";
        v16[VV.a((int)17809, (long)1838774055222955960L)] = "7";
        v16[VV.a((int)4824, (long)8325893610913569023L)] = "8";
        v16[VV.a((int)6382, (long)2800354731922985675L)] = "9";
        v16[VV.a((int)12140, (long)5879167121751844163L)] = "a";
        v16[VV.a((int)24565, (long)2390561461426804190L)] = "b";
        v16[VV.a((int)8262, (long)5905853898692078178L)] = "c";
        v16[VV.a((int)21964, (long)5215722676734091233L)] = "d";
        v16[VV.a((int)29972, (long)1142242809401114424L)] = "e";
        v16[VV.a((int)17936, (long)5521871854495353912L)] = "f";
        VV.q = v16;
    }

    /*
     * Unable to fully structure code
     */
    public static String o(byte[] var0) {
        var2_1 = new StringBuffer();
        var1_2 = D6.k();
        var3_3 = 0;
        if (var1_2 == null) ** GOTO lbl9
        block0: while (true) {
            v0 = var2_1.append(VV.A(var0[var3_3]));
            do {
                ++var3_3;
lbl9:
                // 2 sources

                if (var3_3 < var0.length) continue block0;
                v0 = var2_1;
            } while (var1_2 != null);
            break;
        }
        return v0.toString();
    }

    private static String A(byte n10) {
        int n11 = n10;
        String string = D6.k();
        int n12 = n11;
        if (string == null) {
            if (n12 < 0) {
                n11 += 256;
            }
            n12 = n11 / VV.a(8311, 666575550021347929L);
        }
        int n13 = n12;
        int n14 = n11 % VV.a(18386, 2185491522946944504L);
        return String.valueOf(q[n13]) + q[n14];
    }

    public static String T(String string) {
        String string2 = null;
        try {
            string2 = new String(string);
            MessageDigest messageDigest = MessageDigest.getInstance(a);
            string2 = VV.o(messageDigest.digest(string2.getBytes()));
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string2;
    }

    public static void main(String[] stringArray) {
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xA2F;
        if (c[n11] == null) {
            VV.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

