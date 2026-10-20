/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ba
 */
public class ba_2
extends bn_1 {
    private static Exception U;
    private static Thread K;
    private static Thread b;
    private static final String a;
    private static final long[] c;
    private static final Integer[] f;

    /*
     * Loose catch block
     */
    static void j() throws Exception {
        int n10 = bn_1.Z();
        try {
            block12: {
                Exception exception;
                block11: {
                    ba_2.r(a);
                    ba_2.m();
                    V.M(ba_2.b(20076, 1568960342651072139L), ba_2.b(2378, 5611403705771043246L), 1, 0);
                    K = new Thread(new my_0());
                    b = new Thread(new n1());
                    b.start();
                    ba_2.D(ba_2.b(22915, 4229428051158235493L));
                    K.start();
                    do {
                        int n11;
                        block10: {
                            block14: {
                                if (K.isAlive()) break block14;
                                n11 = b.isAlive();
                                if (n10 == 0) break block10;
                                try {
                                    block15: {
                                        if (n10 == 0) break block10;
                                        break block15;
                                        catch (Exception exception2) {
                                            throw ba_2.a(exception2);
                                        }
                                    }
                                    if (n11 == 0) break;
                                }
                                catch (Exception exception3) {
                                    throw ba_2.a(exception3);
                                }
                            }
                            n11 = ba_2.b(30384, 8343782300682507861L);
                        }
                        ba_2.D(n11);
                    } while (n10 != 0);
                    try {
                        exception = U;
                        if (n10 == 0) break block11;
                        if (exception == null) break block12;
                    }
                    catch (Exception exception4) {
                        throw ba_2.a(exception4);
                    }
                    exception = U;
                }
                throw exception;
            }
            ba_2.i();
        }
        finally {
            ba_2.Y();
        }
    }

    static Exception A() {
        return U;
    }

    static Exception c(Exception exception) {
        U = exception;
        return U;
    }

    static Thread y() {
        return K;
    }

    static Thread D() {
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
                v0 = "^?<\u0004V$e*.'\u0002\u0005w e6+PK$<c7*\u001f\u0015p".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 11;
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
                                v9 = 81;
                                break;
                            }
                            case 2: {
                                v9 = 68;
                                break;
                            }
                            case 3: {
                                v9 = 123;
                                break;
                            }
                            case 4: {
                                v9 = 107;
                                break;
                            }
                            case 5: {
                                v9 = 15;
                                break;
                            }
                            default: {
                                v9 = 67;
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
                ba_2.a = new String(v10).intern();
                var0_1 = 5822284846316411058L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "dr\u0080\u001e\u00de\u008b\u000e\u0083\r\u00fc\u00c9-\u00d0\u001fq\u0014";
                var5_5 = "dr\u0080\u001e\u00de\u008b\u000e\u0083\r\u00fc\u00c9-\u00d0\u001fq\u0014".length();
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
                    var4_4 = "v{\u00eaf?\u00b3\u00b29#\u00bb\u009c\u0080=\u008f\u00a1\u00b3";
                    var5_5 = "v{\u00eaf?\u00b3\u00b29#\u00bb\u009c\u0080=\u008f\u00a1\u00b3".length();
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
        ba_2.c = var6_2;
        ba_2.f = new Integer[4];
        ba_2.U = null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x20E5;
        if (f[n11] == null) {
            ba_2.f[n11] = (int)(c[n11] ^ l2);
        }
        return f[n11];
    }
}

