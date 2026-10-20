/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dg
 */
public final class dg_2
extends Enum {
    public static final dg_2 CANFDX;
    public static final dg_2 CANOVIO;
    public static final dg_2 CANBRK;
    public static final dg_2 CANCRY;
    public static final dg_2 CANLZW;
    public static final dg_2 CANFC32;
    public static final dg_2 ESCCTL;
    public static final dg_2 ESC8;
    public static final dg_2 ZCBIN;
    private byte h;
    private static final /* synthetic */ dg_2[] U;
    private static final long[] a;
    private static final Integer[] b;

    public static dg_2[] values() {
        return (dg_2[])U.clone();
    }

    public static dg_2 valueOf(String string) {
        return Enum.valueOf(dg_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dg_2() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.h = (byte)var3_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dg_2() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.h = (byte)var3_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dg_2() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.h = var3_1;
    }

    public byte L() {
        return this.h;
    }

    public static byte f(dg_2[] dg_2Array) {
        byte by;
        block2: {
            byte by2 = 0;
            String[] stringArray = ub_0.A();
            for (dg_2 dg_22 : dg_2Array) {
                by = (byte)(by2 | dg_22.L());
                if (stringArray == null) {
                    by2 = by;
                    if (stringArray == null) continue;
                }
                break block2;
            }
            by = by2;
        }
        return by;
    }

    public static dg_2 C(byte by) {
        dg_2[] dg_2Array = dg_2.values();
        int n10 = dg_2Array.length;
        String[] stringArray = ub_0.A();
        int n11 = 0;
        while (n11 < n10) {
            dg_2 dg_22 = dg_2Array[n11];
            if (stringArray == null) {
                if (dg_22.L() == by) {
                    return dg_22;
                }
                ++n11;
            }
            if (stringArray == null) continue;
        }
        return null;
    }

    private static /* synthetic */ dg_2[] z() {
        dg_2[] dg_2Array = new dg_2[dg_2.a(7817, 913800756868796384L)];
        dg_2Array[0] = CANFDX;
        dg_2Array[1] = CANOVIO;
        dg_2Array[2] = CANBRK;
        dg_2Array[3] = CANCRY;
        dg_2Array[4] = CANLZW;
        dg_2Array[5] = CANFC32;
        dg_2Array[dg_2.a((int)18856, (long)2780859116364437699L)] = ESCCTL;
        dg_2Array[dg_2.a((int)28186, (long)6558985401333792634L)] = ESC8;
        dg_2Array[dg_2.a((int)15795, (long)850484048738544855L)] = ZCBIN;
        return dg_2Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[9];
                        var12_1 = 0;
                        var11_2 = "UMWhq_\u0006S_ZiwX\u0006S_ZhwJ\u0006S_Zg\u007fD\u0004UMW\u0013\u0007S_ZdsZU\u0006S_ZmaK";
                        var13_3 = "UMWhq_\u0006S_ZiwX\u0006S_ZhwJ\u0006S_Zg\u007fD\u0004UMW\u0013\u0007S_ZdsZU\u0006S_ZmaK".length();
                        var10_4 = 6;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 115;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "\u0018\u000f\u000409\u0007\u0001\r\b?4rz";
                            var13_3 = "\u0018\u000f\u000409\u0007\u0001\r\b?4rz".length();
                            var10_4 = 5;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 33;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 99;
                                    break;
                                }
                                case 1: {
                                    v15 = 109;
                                    break;
                                }
                                case 2: {
                                    v15 = 103;
                                    break;
                                }
                                case 3: {
                                    v15 = 88;
                                    break;
                                }
                                case 4: {
                                    v15 = 86;
                                    break;
                                }
                                case 5: {
                                    v15 = 96;
                                    break;
                                }
                                default: {
                                    v15 = 105;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                var0_7 = 7927325533045500647L;
                var6_8 = new long[11];
                var3_9 = 0;
                var4_10 = "\u0006\u009981Y\u00b2\u00d5\u00a2\u0083\u00f5\u00e2\u0006\u00e5v\u0095\u009a\u00e1|$\u0092\u00db/\u0097\u00ec\u00e0\u00cc\u0091\u00c5u})\u0019\u00a9\u0082\u009d\u00ec\u00da\u00a8\u001e\u00a7\u00b3\u00f3\u00c6U,=\u00c68|\u00d3g\u00b9\u00a9\u0003z\u00d1\u00a7<\u00f1\u0096\u0093V\u00c9\u00df\u00c8::84\u00aae\u000e";
                var5_11 = "\u0006\u009981Y\u00b2\u00d5\u00a2\u0083\u00f5\u00e2\u0006\u00e5v\u0095\u009a\u00e1|$\u0092\u00db/\u0097\u00ec\u00e0\u00cc\u0091\u00c5u})\u0019\u00a9\u0082\u009d\u00ec\u00da\u00a8\u001e\u00a7\u00b3\u00f3\u00c6U,=\u00c68|\u00d3g\u00b9\u00a9\u0003z\u00d1\u00a7<\u00f1\u0096\u0093V\u00c9\u00df\u00c8::84\u00aae\u000e".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "I\u00c9z\u00d1\u00c4\u0087\u009e6\u00f7\u00eef/\u00a9@\u00b2\"";
                    var5_11 = "I\u00c9z\u00d1\u00c4\u0087\u009e6\u00f7\u00eef/\u00a9@\u00b2\"".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl123:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        dg_2.a = var6_8;
        dg_2.b = new Integer[11];
        dg_2.CANFDX = new dg_2(var8[6], 0, 1);
        dg_2.CANOVIO = new dg_2(var8[5], 1, 2);
        dg_2.CANBRK = new dg_2(var8[1], 2, 4);
        dg_2.CANCRY = new dg_2(var8[2], 3, dg_2.a(21140, 1658554896753001462L));
        dg_2.CANLZW = new dg_2(var8[3], 4, dg_2.a(12878, 7826776390620504872L));
        dg_2.CANFC32 = new dg_2(var8[8], 5, dg_2.a(27720, 2691754589121690923L));
        dg_2.ESCCTL = new dg_2(var8[0], dg_2.a(343, 6309691606388494384L), dg_2.a(26105, 6396440997664404625L));
        dg_2.ESC8 = new dg_2(var8[4], dg_2.a(25890, 8944244644349719623L), dg_2.a(11940, 4930570654370856901L));
        dg_2.ZCBIN = new dg_2(var8[7], dg_2.a(15795, 850484048738544855L), 1);
        dg_2.U = dg_2.z();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5161;
        if (b[n11] == null) {
            dg_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

