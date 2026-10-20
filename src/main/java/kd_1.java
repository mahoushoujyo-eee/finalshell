/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from kD
 */
public final class kd_1
extends Enum {
    public static final kd_1 SOH;
    public static final kd_1 STX;
    public static final kd_1 EOT;
    public static final kd_1 ENQ;
    public static final kd_1 ACK;
    public static final kd_1 BS;
    public static final kd_1 LF;
    public static final kd_1 CR;
    public static final kd_1 XON;
    public static final kd_1 XOFF;
    public static final kd_1 NAK;
    public static final kd_1 CAN;
    private byte u;
    private static final /* synthetic */ kd_1[] A;
    private static final long[] a;
    private static final Integer[] b;

    public static kd_1[] values() {
        return (kd_1[])A.clone();
    }

    public static kd_1 valueOf(String string) {
        return Enum.valueOf(kd_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kd_1() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.u = var3_1;
    }

    public byte m() {
        return this.u;
    }

    private static /* synthetic */ kd_1[] m() {
        kd_1[] kd_1Array = new kd_1[kd_1.a(30146, 5120081006582932430L)];
        kd_1Array[0] = SOH;
        kd_1Array[1] = STX;
        kd_1Array[2] = EOT;
        kd_1Array[3] = ENQ;
        kd_1Array[4] = ACK;
        kd_1Array[5] = BS;
        kd_1Array[kd_1.a((int)29843, (long)6427365144985510537L)] = LF;
        kd_1Array[kd_1.a((int)29227, (long)3841657999232672820L)] = CR;
        kd_1Array[kd_1.a((int)6247, (long)9026623319338897014L)] = XON;
        kd_1Array[kd_1.a((int)27048, (long)7264638125798080433L)] = XOFF;
        kd_1Array[kd_1.a((int)31029, (long)2847603052690419488L)] = NAK;
        kd_1Array[kd_1.a((int)9261, (long)6734049507757486655L)] = CAN;
        return kd_1Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[12];
                        var12_1 = 0;
                        var11_2 = "NK\"\u0002AL\u0003HD=\u0003^E$\u0003^^4\u0002NX\u0003HE8\u0003UE\"\u0003LI'\u0003CK'";
                        var13_3 = "NK\"\u0002AL\u0003HD=\u0003^E$\u0003^^4\u0002NX\u0003HE8\u0003UE\"\u0003LI'\u0003CK'".length();
                        var10_4 = 3;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 50;
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
                            var11_2 = "cu\u0004yi\u0006j";
                            var13_3 = "cu\u0004yi\u0006j".length();
                            var10_4 = 2;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 30;
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
                                    v15 = 63;
                                    break;
                                }
                                case 1: {
                                    v15 = 56;
                                    break;
                                }
                                case 2: {
                                    v15 = 94;
                                    break;
                                }
                                case 3: {
                                    v15 = 50;
                                    break;
                                }
                                case 4: {
                                    v15 = 80;
                                    break;
                                }
                                case 5: {
                                    v15 = 5;
                                    break;
                                }
                                default: {
                                    v15 = 1;
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
                var0_7 = 7521506930921860729L;
                var6_8 = new long[18];
                var3_9 = 0;
                var4_10 = "\b\u00bf\u00c5\u0012\u00d5\u00ffhq\u00fc\u00c9\u00d8\u0004!P\u00d8\u000e\u00e2\u00ff\n\u00d4\u00c0\u00a4a\u00f5F\u000b@\u00f8Q\u00f1JJT\u00e9\u00f9\u0096\u009as`\u00e0\u00f4\u0019@4D\u00c8Q\u00c1\u00dd/\u0098\u00b6M\u00aa\u00cc\u00f6\u0090a\u00c8\u00fb6\u00e0{\u0006w{\u001f\u00e4\u00db\u0005\u00cd\u008fp\u00ec\u00ad\u00ffY\u00d2AS\u0001\u00ac\u00b6\u00a6d\u00a6A\u0086\u00dc\u00d1R\u00d5b\u00da\u00f8\u001e\u00bb]\u00c8Q\u0082.\u0099\u00bf\u00ed\u00a7\u0011\u008f\u008fO\u00a0\u0007)V\u0099p\u00b0\u00fb\u001cM\u00f1\u00ea=z\u00f2\u0091\n\u00e5";
                var5_11 = "\b\u00bf\u00c5\u0012\u00d5\u00ffhq\u00fc\u00c9\u00d8\u0004!P\u00d8\u000e\u00e2\u00ff\n\u00d4\u00c0\u00a4a\u00f5F\u000b@\u00f8Q\u00f1JJT\u00e9\u00f9\u0096\u009as`\u00e0\u00f4\u0019@4D\u00c8Q\u00c1\u00dd/\u0098\u00b6M\u00aa\u00cc\u00f6\u0090a\u00c8\u00fb6\u00e0{\u0006w{\u001f\u00e4\u00db\u0005\u00cd\u008fp\u00ec\u00ad\u00ffY\u00d2AS\u0001\u00ac\u00b6\u00a6d\u00a6A\u0086\u00dc\u00d1R\u00d5b\u00da\u00f8\u001e\u00bb]\u00c8Q\u0082.\u0099\u00bf\u00ed\u00a7\u0011\u008f\u008fO\u00a0\u0007)V\u0099p\u00b0\u00fb\u001cM\u00f1\u00ea=z\u00f2\u0091\n\u00e5".length();
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
                    var4_10 = "@|\u009eo\u00ab\u00a5\u00cd\u00bb\u0086u\u00c5\u00bc2\u00c4I?";
                    var5_11 = "@|\u009eo\u00ab\u00a5\u00cd\u00bb\u0086u\u00c5\u00bc2\u00c4I?".length();
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
        kd_1.a = var6_8;
        kd_1.b = new Integer[18];
        kd_1.SOH = new kd_1(var8[3], 0, 1);
        kd_1.STX = new kd_1(var8[4], 1, 2);
        kd_1.EOT = new kd_1(var8[6], 2, 4);
        kd_1.ENQ = new kd_1(var8[2], 3, 5);
        kd_1.ACK = new kd_1(var8[8], 4, (byte)kd_1.a(20498, 2236288316708423182L));
        kd_1.BS = new kd_1(var8[10], 5, (byte)kd_1.a(28995, 275899949373728590L));
        kd_1.LF = new kd_1(var8[1], kd_1.a(20498, 2236288316708423182L), (byte)kd_1.a(12933, 6603803261959758998L));
        kd_1.CR = new kd_1(var8[5], kd_1.a(22933, 5045187093032603531L), (byte)kd_1.a(31204, 5325211987382775794L));
        kd_1.XON = new kd_1(var8[7], kd_1.a(28995, 275899949373728590L), (byte)kd_1.a(8647, 6301345748379432919L));
        kd_1.XOFF = new kd_1(var8[11], kd_1.a(24675, 6965249811602519678L), (byte)kd_1.a(16483, 8748433903043647092L));
        kd_1.NAK = new kd_1(var8[9], kd_1.a(12933, 6603803261959758998L), (byte)kd_1.a(17265, 2956618845392737642L));
        kd_1.CAN = new kd_1(var8[0], kd_1.a(30185, 3127363192862909437L), (byte)kd_1.a(22681, 1215222004061245057L));
        kd_1.A = kd_1.m();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x561C;
        if (b[n11] == null) {
            kd_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

