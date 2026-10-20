/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from b8
 */
public class b8_0
extends bn_1 {
    private static final int[] E;
    private static final int[] T;
    private static final int[] F;
    private static final int[] Q;
    private static final int[] W;
    private static final int[] x;
    private static final int[] X;
    private static final int[] i;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] f;

    static void Q() throws Exception {
        b8_0.h(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    static void h(boolean var0) throws Exception {
        block85: {
            var1_1 = bn_1.Z();
            try {
                block87: {
                    block86: {
                        b8_0.r("Test8 - parity etc");
                        b8_0.m();
                        if (!var0) break block86;
                        var2_2 = b8_0.W;
                        var3_3 = b8_0.x;
                        var4_4 = b8_0.X;
                        var5_5 = b8_0.i;
                        if (var1_1 != 0) break block87;
                    }
                    var2_2 = b8_0.E;
                    var3_3 = b8_0.T;
                    var4_4 = b8_0.F;
                    var5_5 = b8_0.Q;
                }
                System.out.println();
                var6_6 = 0;
                var7_7 = 0;
                block57: while (true) {
                    v0 = var7_7;
                    block58: while (v0 < var2_2.length && var1_1 != 0) {
                        var8_8 = 0;
                        block59: while (true) {
                            v1 = var8_8;
                            block60: while (v1 < var3_3.length) {
                                v0 = 0;
                                if (var1_1 == 0) continue block58;
                                for (var9_9 = v1820968; var9_9 < var4_4.length; ++var9_9) {
                                    b8_0.V.b(b8_0.b(29213, 1085250471684912062L));
                                    b8_0.V.V(b8_0.b(11848, 5309258598819327980L));
                                    try {
                                        block80: {
                                            block79: {
                                                block78: {
                                                    block77: {
                                                        block76: {
                                                            var10_10 = "?";
                                                            try {
                                                                if (var1_1 != 0) {
                                                                    v1 = var4_4[var9_9];
                                                                    if (var1_1 == 0) continue block60;
                                                                }
                                                                ** GOTO lbl45
                                                            }
                                                            catch (mw_0 v2) {
                                                                throw b8_0.a(v2);
                                                            }
                                                            switch (v1) {
                                                                case 5: {
                                                                    var10_10 = "5";
lbl45:
                                                                    // 2 sources

                                                                    if (var1_1 != 0) break;
                                                                }
                                                                case 6: {
                                                                    var10_10 = "6";
                                                                    if (var1_1 != 0) break;
                                                                }
                                                                case 7: {
                                                                    var10_10 = "7";
                                                                    if (var1_1 != 0) break;
                                                                }
                                                                case 8: {
                                                                    var10_10 = "8";
                                                                }
                                                            }
                                                            var11_12 = "?";
                                                            try {
                                                                if (var1_1 != 0) {
                                                                }
                                                                ** GOTO lbl64
                                                            }
                                                            catch (mw_0 v3) {
                                                                throw b8_0.a(v3);
                                                            }
                                                            {
                                                                ** switch (var3_3[var8_8])
                                                            }
lbl-1000:
                                                            // 1 sources

                                                            {
                                                                case 1: {
                                                                    var11_12 = "1";
lbl64:
                                                                    // 2 sources

                                                                    if (var1_1 != 0) break;
                                                                }
lbl65:
                                                                // 2 sources

                                                                case 3: {
                                                                    var11_12 = "1.5";
                                                                    if (var1_1 != 0) break;
                                                                }
lbl68:
                                                                // 2 sources

                                                                case 2: {
                                                                    var11_12 = "2";
                                                                }
                                                            }
lbl70:
                                                            // 4 sources

                                                            var12_13 = "?";
                                                            try {
                                                                v4 = var2_2[var7_7];
                                                                if (var1_1 == 0) break block76;
                                                            }
                                                            catch (mw_0 v5) {
                                                                throw b8_0.a(v5);
                                                            }
                                                            {
                                                                ** switch (v4)
                                                            }
lbl-1000:
                                                            // 1 sources

                                                            {
                                                                case 2: {
                                                                    var12_13 = "E";
                                                                    if (var1_1 != 0) break;
                                                                }
lbl81:
                                                                // 2 sources

                                                                case 1: {
                                                                    var12_13 = "O";
                                                                    if (var1_1 != 0) break;
                                                                }
lbl84:
                                                                // 2 sources

                                                                case 3: {
                                                                    var12_13 = "M";
                                                                    if (var1_1 != 0) break;
                                                                }
lbl87:
                                                                // 2 sources

                                                                case 4: {
                                                                    var12_13 = "S";
                                                                    if (var1_1 != 0) break;
                                                                }
lbl90:
                                                                // 2 sources

                                                                case 0: {
                                                                    var12_13 = "N";
                                                                }
                                                            }
lbl92:
                                                            // 6 sources

                                                            b8_0.r("Test8." + ++var6_6 + " databits=" + var10_10 + " stopbits=" + var11_12 + " parity=" + var12_13);
                                                            b8_0.V.M(b8_0.b(148, 5452830342949159229L), var4_4[var9_9], var3_3[var8_8], var2_2[var7_7]);
                                                            b8_0.D(b8_0.b(28864, 7266056588106150247L));
                                                            v4 = b8_0.b(8183, 4781096830792982097L);
                                                        }
                                                        var13_14 = new byte[v4];
                                                        var14_15 = new byte[b8_0.b(8183, 4781096830792982097L)];
                                                        for (var15_17 = 0; var15_17 < b8_0.b(8183, 4781096830792982097L); ++var15_17) {
                                                            try {
                                                                var13_14[var15_17] = (byte)var15_17;
                                                                if (var1_1 != 0) {
                                                                    if (var1_1 != 0) continue;
                                                                    break;
                                                                }
                                                                break block77;
                                                            }
                                                            catch (mw_0 v6) {
                                                                throw b8_0.a(v6);
                                                            }
                                                        }
                                                        b8_0.y = b8_0.V.E();
                                                        b8_0.J = b8_0.V.S();
                                                    }
                                                    var15_16 = System.currentTimeMillis();
                                                    b8_0.y.write(var13_14);
                                                    var17_18 = 0;
                                                    while ((var17_18 += b8_0.J.read(var14_15, var17_18, b8_0.b(8183, 4781096830792982097L) - var17_18)) < b8_0.b(8183, 4781096830792982097L)) {
                                                        try {
                                                            if (var1_1 != 0) {
                                                                if (var1_1 != 0) continue;
                                                                break;
                                                            }
                                                            break block78;
                                                        }
                                                        catch (mw_0 v7) {
                                                            throw b8_0.a(v7);
                                                        }
                                                    }
                                                    v8 = var17_18;
                                                    if (var1_1 == 0) break block79;
                                                    try {
                                                        block88: {
                                                            if (v8 == var13_14.length) break block78;
                                                            break block88;
                                                            catch (mw_0 v9) {
                                                                throw b8_0.a(v9);
                                                            }
                                                        }
                                                        b8_0.Z("was expecting %d characters got %d", new Object[]{var13_14.length, var17_18});
                                                    }
                                                    catch (mw_0 v10) {
                                                        throw b8_0.a(v10);
                                                    }
                                                }
                                                v8 = var18_19 = 0;
                                            }
                                            while (var18_19 < b8_0.b(8183, 4781096830792982097L)) {
                                                block84: {
                                                    block82: {
                                                        block83: {
                                                            block81: {
                                                                block91: {
                                                                    block90: {
                                                                        block89: {
                                                                            v11 = var18_19;
                                                                            v12 = var5_5[var9_9];
                                                                            if (var1_1 == 0) break block80;
                                                                            if (var1_1 == 0) break block81;
                                                                            break block89;
                                                                            catch (mw_0 v13) {
                                                                                throw b8_0.a(v13);
                                                                            }
                                                                        }
                                                                        if (v11 > v12) ** GOTO lbl167
                                                                        break block90;
                                                                        catch (mw_0 v14) {
                                                                            throw b8_0.a(v14);
                                                                        }
                                                                    }
                                                                    if (var14_15[var18_19] == var13_14[var18_19]) break block82;
                                                                    break block91;
                                                                    catch (mw_0 v15) {
                                                                        throw b8_0.a(v15);
                                                                    }
                                                                }
                                                                try {
                                                                    block92: {
                                                                        b8_0.Z("failed: transmit '0x%02X' != receive'0x%02X'", new Object[]{var13_14[var18_19], var14_15[var18_19]});
                                                                        if (var1_1 != 0) break block82;
                                                                        break block92;
                                                                        catch (mw_0 v16) {
                                                                            throw b8_0.a(v16);
                                                                        }
                                                                    }
                                                                    v17 = var4_4[var9_9];
                                                                    v18 = b8_0.b(2303, 6879826897211836757L);
                                                                }
                                                                catch (mw_0 v19) {
                                                                    throw b8_0.a(v19);
                                                                }
                                                            }
                                                            if (var1_1 == 0) break block83;
                                                            try {
                                                                block93: {
                                                                    if (v17 < v18) break block82;
                                                                    break block93;
                                                                    catch (mw_0 v20) {
                                                                        throw b8_0.a(v20);
                                                                    }
                                                                }
                                                                v17 = var13_14[var18_19];
                                                                v18 = var5_5[var9_9];
                                                            }
                                                            catch (mw_0 v21) {
                                                                throw b8_0.a(v21);
                                                            }
                                                        }
                                                        var19_20 = v17 & v18;
                                                        if (var1_1 == 0) break block84;
                                                        try {
                                                            block94: {
                                                                if (var14_15[var18_19] == var19_20) break block82;
                                                                break block94;
                                                                catch (mw_0 v22) {
                                                                    throw b8_0.a(v22);
                                                                }
                                                            }
                                                            b8_0.Z("failed: transmit (excessive) '0x%02X' != receive'0x%02X'%n", new Object[]{var19_20, var14_15[var18_19]});
                                                        }
                                                        catch (mw_0 v23) {
                                                            throw b8_0.a(v23);
                                                        }
                                                    }
                                                    ++var18_19;
                                                }
                                                if (var1_1 != 0) continue;
                                            }
                                            v11 = var17_18;
                                            v12 = b8_0.b(8183, 4781096830792982097L);
                                        }
                                        try {
                                            if (v11 < v12) {
                                                b8_0.Z("did not receive all 256 chars, got %d", new Object[]{var17_18});
                                            }
                                        }
                                        catch (mw_0 v24) {
                                            throw b8_0.a(v24);
                                        }
                                        b8_0.i();
                                        continue;
                                    }
                                    catch (mw_0 var10_11) {
                                        b8_0.G(" NOT SUPPORTED " + var10_11.getMessage(), new Object[0]);
                                    }
                                    if (var1_1 != 0) continue;
                                }
                                ++var8_8;
                                if (var1_1 != 0) continue block59;
                            }
                            break;
                        }
                        ++var7_7;
                        if (var1_1 != 0) continue block57;
                    }
                    break block85;
                    break;
                }
                {
                    break block85;
                    break;
                }
            }
            finally {
                b8_0.Y();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "2i\u00fd\u00ccZ\u008a\u0097Jv\u001a\u009e\u00a7R\u0007\u008f\u00af\u00b7\u0003\u0006\u0006\u00c3{\u0099\u008a.%+\u00d4\u00ff\u00a2\u00b9\u00d6.g1\u00bb%\u001b\u000b\u0012_\u00a6U\u00c0K\u0010t\f\u00b0$\u00d9\b\u009c\u00d8\u00b2w}|$\u00b9\u00e8\u00f7!\nR\u0097\u00192\u00cf\u0017\u0013\u00a7)%\b-y\u00f6\u007f:n\u00b4\u0015,\u00b1\u00f7\u00e3\u0083\u009d<\u008eP\u00a4JS\u00db\u009d{\u00d8\u00a7iu\u00f9\u00dc\u00e2\u00c3\u0093\u0000}\u00b3\u0084\u00a1\u00aa\u00a0\u0002\u0017,M\u00f4\u0097}\u001dHp\u0087s\u0081A\n\u00a0dR\u00a2\u0000}\u00d9\u00eap\u008c\u0003*\u0089q:\u0086\u0090\u0005oA\u00a1\u0015\u00e3\u00d7<=\u0015P\u00a2a\u009c^\u001dJ?-\u00ea\u00a5\u00f1\u009c\u0095{\u00ed\u0099\u00ea1\u00ba\u00f5\u00d9\u00c3JW,T\\f\u00ad\u0092\u0096\u00e8\u00e8b\u00f5\u001dXd\u000e\u0097\u00b2U\u00cb\u00c3\u00a8";
                        var12_3 = "2i\u00fd\u00ccZ\u008a\u0097Jv\u001a\u009e\u00a7R\u0007\u008f\u00af\u00b7\u0003\u0006\u0006\u00c3{\u0099\u008a.%+\u00d4\u00ff\u00a2\u00b9\u00d6.g1\u00bb%\u001b\u000b\u0012_\u00a6U\u00c0K\u0010t\f\u00b0$\u00d9\b\u009c\u00d8\u00b2w}|$\u00b9\u00e8\u00f7!\nR\u0097\u00192\u00cf\u0017\u0013\u00a7)%\b-y\u00f6\u007f:n\u00b4\u0015,\u00b1\u00f7\u00e3\u0083\u009d<\u008eP\u00a4JS\u00db\u009d{\u00d8\u00a7iu\u00f9\u00dc\u00e2\u00c3\u0093\u0000}\u00b3\u0084\u00a1\u00aa\u00a0\u0002\u0017,M\u00f4\u0097}\u001dHp\u0087s\u0081A\n\u00a0dR\u00a2\u0000}\u00d9\u00eap\u008c\u0003*\u0089q:\u0086\u0090\u0005oA\u00a1\u0015\u00e3\u00d7<=\u0015P\u00a2a\u009c^\u001dJ?-\u00ea\u00a5\u00f1\u009c\u0095{\u00ed\u0099\u00ea1\u00ba\u00f5\u00d9\u00c3JW,T\\f\u00ad\u0092\u0096\u00e8\u00e8b\u00f5\u001dXd\u000e\u0097\u00b2U\u00cb\u00c3\u00a8".length();
                        var9_4 = 18;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 66;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00d1\u000ew~\u0098\u00bb\u009c1p\u0015j\u00a0\u00e9p\u00df\"\u0080\u00f7\u00dc\u00ff\u0013Z%v\u00f5U\u00b4\u00ceL\u00a4\b\u0098\u0086\u00f4l\td\"\u009f[\u00f5\u0013\u00fd\u0080\u00ea\u0017\u0084,\u00bf<";
                            var12_3 = "\u00d1\u000ew~\u0098\u00bb\u009c1p\u0015j\u00a0\u00e9p\u00df\"\u0080\u00f7\u00dc\u00ff\u0013Z%v\u00f5U\u00b4\u00ceL\u00a4\b\u0098\u0086\u00f4l\td\"\u009f[\u00f5\u0013\u00fd\u0080\u00ea\u0017\u0084,\u00bf<".length();
                            var9_4 = 15;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 25;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
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
                                    v15 = 25;
                                    break;
                                }
                                case 1: {
                                    v15 = 90;
                                    break;
                                }
                                case 2: {
                                    v15 = 63;
                                    break;
                                }
                                case 3: {
                                    v15 = 29;
                                    break;
                                }
                                case 4: {
                                    v15 = 45;
                                    break;
                                }
                                case 5: {
                                    v15 = 96;
                                    break;
                                }
                                default: {
                                    v15 = 97;
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
                b8_0.a = var13;
                b8_0.b = new String[11];
                var0_7 = 4545494757662275528L;
                var6_8 = new long[15];
                var3_9 = 0;
                var4_10 = "\u0011\u00af*\u0087\u0005\u00de\u0096\r\u00db\u0012\u00a0\b\u00ff\u00c6\u00a3f;_E\u00db\u00c6$\u00e8\u00af\u000e\u00e2\u000e x=\u00b0\t\u0082a5\u009eZ\u00f5h\u0099\u0085I\u00f8\u00b2\u001d(\u0006\u00cb\u0006y\u00f3\u009a\u00c5\u008cY$\u00e6s\u0013\u00a9\f\u00c4iH\u00a2\u0088o:\u0092\u00a1~\u009a\u00ba\u00b7f\u00e4\u00e3\\X\u00f2\u00fb\u00ed\u00f6\u00fcW\u00e0\u00c5+]\u00b8,\u0091](\u00bd\u00f5*vJ\u00c0\u0094\u0011YL";
                var5_11 = "\u0011\u00af*\u0087\u0005\u00de\u0096\r\u00db\u0012\u00a0\b\u00ff\u00c6\u00a3f;_E\u00db\u00c6$\u00e8\u00af\u000e\u00e2\u000e x=\u00b0\t\u0082a5\u009eZ\u00f5h\u0099\u0085I\u00f8\u00b2\u001d(\u0006\u00cb\u0006y\u00f3\u009a\u00c5\u008cY$\u00e6s\u0013\u00a9\f\u00c4iH\u00a2\u0088o:\u0092\u00a1~\u009a\u00ba\u00b7f\u00e4\u00e3\\X\u00f2\u00fb\u00ed\u00f6\u00fcW\u00e0\u00c5+]\u00b8,\u0091](\u00bd\u00f5*vJ\u00c0\u0094\u0011YL".length();
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
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00fb\u008a\u0095\t\u00aa\u00aeK\f\u007f:i\u00b0j@\u00cd|";
                    var5_11 = "\u00fb\u008a\u0095\t\u00aa\u00aeK\f\u007f:i\u00b0j@\u00cd|".length();
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
lbl125:
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
lbl136:
                // 1 sources

                ** continue;
            }
        }
        b8_0.c = var6_8;
        b8_0.f = new Integer[15];
        b8_0.E = new int[]{0, 1, 2};
        b8_0.T = new int[]{1};
        b8_0.F = new int[]{b8_0.b(13123, 865954232992068331L)};
        b8_0.Q = new int[]{b8_0.b(12245, 7917614519156567675L)};
        b8_0.W = new int[]{0, 1, 2, 3, 4};
        b8_0.x = new int[]{1, 3, 2};
        b8_0.X = new int[]{b8_0.b(24687, 3190713204577837517L), b8_0.b(15724, 6077557856397327555L), b8_0.b(11927, 3093635470261776188L), 5};
        b8_0.i = new int[]{b8_0.b(15335, 69073207232887371L), b8_0.b(8026, 1374274632166170367L), b8_0.b(18015, 8902797552078915582L), b8_0.b(7896, 6182336385320017784L)};
    }

    private static mw_0 a(mw_0 mw_02) {
        return mw_02;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD905) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 127;
                    break;
                }
                case 1: {
                    n14 = 195;
                    break;
                }
                case 2: {
                    n14 = 184;
                    break;
                }
                case 3: {
                    n14 = 84;
                    break;
                }
                case 4: {
                    n14 = 185;
                    break;
                }
                case 5: {
                    n14 = 31;
                    break;
                }
                case 6: {
                    n14 = 103;
                    break;
                }
                case 7: {
                    n14 = 221;
                    break;
                }
                case 8: {
                    n14 = 99;
                    break;
                }
                case 9: {
                    n14 = 29;
                    break;
                }
                case 10: {
                    n14 = 156;
                    break;
                }
                case 11: {
                    n14 = 130;
                    break;
                }
                case 12: {
                    n14 = 146;
                    break;
                }
                case 13: {
                    n14 = 145;
                    break;
                }
                case 14: {
                    n14 = 213;
                    break;
                }
                case 15: {
                    n14 = 108;
                    break;
                }
                case 16: {
                    n14 = 240;
                    break;
                }
                case 17: {
                    n14 = 34;
                    break;
                }
                case 18: {
                    n14 = 54;
                    break;
                }
                case 19: {
                    n14 = 121;
                    break;
                }
                case 20: {
                    n14 = 215;
                    break;
                }
                case 21: {
                    n14 = 80;
                    break;
                }
                case 22: {
                    n14 = 90;
                    break;
                }
                case 23: {
                    n14 = 28;
                    break;
                }
                case 24: {
                    n14 = 239;
                    break;
                }
                case 25: {
                    n14 = 243;
                    break;
                }
                case 26: {
                    n14 = 238;
                    break;
                }
                case 27: {
                    n14 = 187;
                    break;
                }
                case 28: {
                    n14 = 3;
                    break;
                }
                case 29: {
                    n14 = 75;
                    break;
                }
                case 30: {
                    n14 = 22;
                    break;
                }
                case 31: {
                    n14 = 162;
                    break;
                }
                case 32: {
                    n14 = 234;
                    break;
                }
                case 33: {
                    n14 = 58;
                    break;
                }
                case 34: {
                    n14 = 203;
                    break;
                }
                case 35: {
                    n14 = 49;
                    break;
                }
                case 36: {
                    n14 = 51;
                    break;
                }
                case 37: {
                    n14 = 97;
                    break;
                }
                case 38: {
                    n14 = 0;
                    break;
                }
                case 39: {
                    n14 = 220;
                    break;
                }
                case 40: {
                    n14 = 114;
                    break;
                }
                case 41: {
                    n14 = 211;
                    break;
                }
                case 42: {
                    n14 = 117;
                    break;
                }
                case 43: {
                    n14 = 138;
                    break;
                }
                case 44: {
                    n14 = 242;
                    break;
                }
                case 45: {
                    n14 = 87;
                    break;
                }
                case 46: {
                    n14 = 71;
                    break;
                }
                case 47: {
                    n14 = 18;
                    break;
                }
                case 48: {
                    n14 = 249;
                    break;
                }
                case 49: {
                    n14 = 208;
                    break;
                }
                case 50: {
                    n14 = 232;
                    break;
                }
                case 51: {
                    n14 = 48;
                    break;
                }
                case 52: {
                    n14 = 100;
                    break;
                }
                case 53: {
                    n14 = 74;
                    break;
                }
                case 54: {
                    n14 = 222;
                    break;
                }
                case 55: {
                    n14 = 111;
                    break;
                }
                case 56: {
                    n14 = 53;
                    break;
                }
                case 57: {
                    n14 = 191;
                    break;
                }
                case 58: {
                    n14 = 5;
                    break;
                }
                case 59: {
                    n14 = 50;
                    break;
                }
                case 60: {
                    n14 = 32;
                    break;
                }
                case 61: {
                    n14 = 98;
                    break;
                }
                case 62: {
                    n14 = 198;
                    break;
                }
                case 63: {
                    n14 = 106;
                    break;
                }
                case 64: {
                    n14 = 85;
                    break;
                }
                case 65: {
                    n14 = 2;
                    break;
                }
                case 66: {
                    n14 = 6;
                    break;
                }
                case 67: {
                    n14 = 105;
                    break;
                }
                case 68: {
                    n14 = 68;
                    break;
                }
                case 69: {
                    n14 = 35;
                    break;
                }
                case 70: {
                    n14 = 69;
                    break;
                }
                case 71: {
                    n14 = 134;
                    break;
                }
                case 72: {
                    n14 = 21;
                    break;
                }
                case 73: {
                    n14 = 94;
                    break;
                }
                case 74: {
                    n14 = 15;
                    break;
                }
                case 75: {
                    n14 = 110;
                    break;
                }
                case 76: {
                    n14 = 255;
                    break;
                }
                case 77: {
                    n14 = 86;
                    break;
                }
                case 78: {
                    n14 = 231;
                    break;
                }
                case 79: {
                    n14 = 73;
                    break;
                }
                case 80: {
                    n14 = 209;
                    break;
                }
                case 81: {
                    n14 = 92;
                    break;
                }
                case 82: {
                    n14 = 101;
                    break;
                }
                case 83: {
                    n14 = 65;
                    break;
                }
                case 84: {
                    n14 = 93;
                    break;
                }
                case 85: {
                    n14 = 174;
                    break;
                }
                case 86: {
                    n14 = 197;
                    break;
                }
                case 87: {
                    n14 = 60;
                    break;
                }
                case 88: {
                    n14 = 64;
                    break;
                }
                case 89: {
                    n14 = 10;
                    break;
                }
                case 90: {
                    n14 = 246;
                    break;
                }
                case 91: {
                    n14 = 160;
                    break;
                }
                case 92: {
                    n14 = 66;
                    break;
                }
                case 93: {
                    n14 = 125;
                    break;
                }
                case 94: {
                    n14 = 204;
                    break;
                }
                case 95: {
                    n14 = 88;
                    break;
                }
                case 96: {
                    n14 = 182;
                    break;
                }
                case 97: {
                    n14 = 166;
                    break;
                }
                case 98: {
                    n14 = 102;
                    break;
                }
                case 99: {
                    n14 = 196;
                    break;
                }
                case 100: {
                    n14 = 118;
                    break;
                }
                case 101: {
                    n14 = 189;
                    break;
                }
                case 102: {
                    n14 = 176;
                    break;
                }
                case 103: {
                    n14 = 165;
                    break;
                }
                case 104: {
                    n14 = 251;
                    break;
                }
                case 105: {
                    n14 = 38;
                    break;
                }
                case 106: {
                    n14 = 1;
                    break;
                }
                case 107: {
                    n14 = 33;
                    break;
                }
                case 108: {
                    n14 = 167;
                    break;
                }
                case 109: {
                    n14 = 237;
                    break;
                }
                case 110: {
                    n14 = 247;
                    break;
                }
                case 111: {
                    n14 = 95;
                    break;
                }
                case 112: {
                    n14 = 171;
                    break;
                }
                case 113: {
                    n14 = 76;
                    break;
                }
                case 114: {
                    n14 = 47;
                    break;
                }
                case 115: {
                    n14 = 226;
                    break;
                }
                case 116: {
                    n14 = 225;
                    break;
                }
                case 117: {
                    n14 = 112;
                    break;
                }
                case 118: {
                    n14 = 52;
                    break;
                }
                case 119: {
                    n14 = 116;
                    break;
                }
                case 120: {
                    n14 = 11;
                    break;
                }
                case 121: {
                    n14 = 7;
                    break;
                }
                case 122: {
                    n14 = 193;
                    break;
                }
                case 123: {
                    n14 = 25;
                    break;
                }
                case 124: {
                    n14 = 67;
                    break;
                }
                case 125: {
                    n14 = 177;
                    break;
                }
                case 126: {
                    n14 = 12;
                    break;
                }
                case 127: {
                    n14 = 55;
                    break;
                }
                case 128: {
                    n14 = 14;
                    break;
                }
                case 129: {
                    n14 = 96;
                    break;
                }
                case 130: {
                    n14 = 45;
                    break;
                }
                case 131: {
                    n14 = 217;
                    break;
                }
                case 132: {
                    n14 = 241;
                    break;
                }
                case 133: {
                    n14 = 26;
                    break;
                }
                case 134: {
                    n14 = 233;
                    break;
                }
                case 135: {
                    n14 = 63;
                    break;
                }
                case 136: {
                    n14 = 109;
                    break;
                }
                case 137: {
                    n14 = 214;
                    break;
                }
                case 138: {
                    n14 = 218;
                    break;
                }
                case 139: {
                    n14 = 24;
                    break;
                }
                case 140: {
                    n14 = 82;
                    break;
                }
                case 141: {
                    n14 = 150;
                    break;
                }
                case 142: {
                    n14 = 120;
                    break;
                }
                case 143: {
                    n14 = 194;
                    break;
                }
                case 144: {
                    n14 = 235;
                    break;
                }
                case 145: {
                    n14 = 27;
                    break;
                }
                case 146: {
                    n14 = 179;
                    break;
                }
                case 147: {
                    n14 = 126;
                    break;
                }
                case 148: {
                    n14 = 79;
                    break;
                }
                case 149: {
                    n14 = 192;
                    break;
                }
                case 150: {
                    n14 = 248;
                    break;
                }
                case 151: {
                    n14 = 41;
                    break;
                }
                case 152: {
                    n14 = 62;
                    break;
                }
                case 153: {
                    n14 = 140;
                    break;
                }
                case 154: {
                    n14 = 59;
                    break;
                }
                case 155: {
                    n14 = 46;
                    break;
                }
                case 156: {
                    n14 = 207;
                    break;
                }
                case 157: {
                    n14 = 199;
                    break;
                }
                case 158: {
                    n14 = 161;
                    break;
                }
                case 159: {
                    n14 = 81;
                    break;
                }
                case 160: {
                    n14 = 115;
                    break;
                }
                case 161: {
                    n14 = 168;
                    break;
                }
                case 162: {
                    n14 = 244;
                    break;
                }
                case 163: {
                    n14 = 181;
                    break;
                }
                case 164: {
                    n14 = 254;
                    break;
                }
                case 165: {
                    n14 = 219;
                    break;
                }
                case 166: {
                    n14 = 20;
                    break;
                }
                case 167: {
                    n14 = 164;
                    break;
                }
                case 168: {
                    n14 = 245;
                    break;
                }
                case 169: {
                    n14 = 212;
                    break;
                }
                case 170: {
                    n14 = 78;
                    break;
                }
                case 171: {
                    n14 = 210;
                    break;
                }
                case 172: {
                    n14 = 19;
                    break;
                }
                case 173: {
                    n14 = 57;
                    break;
                }
                case 174: {
                    n14 = 151;
                    break;
                }
                case 175: {
                    n14 = 122;
                    break;
                }
                case 176: {
                    n14 = 128;
                    break;
                }
                case 177: {
                    n14 = 91;
                    break;
                }
                case 178: {
                    n14 = 113;
                    break;
                }
                case 179: {
                    n14 = 157;
                    break;
                }
                case 180: {
                    n14 = 36;
                    break;
                }
                case 181: {
                    n14 = 129;
                    break;
                }
                case 182: {
                    n14 = 39;
                    break;
                }
                case 183: {
                    n14 = 155;
                    break;
                }
                case 184: {
                    n14 = 131;
                    break;
                }
                case 185: {
                    n14 = 175;
                    break;
                }
                case 186: {
                    n14 = 159;
                    break;
                }
                case 187: {
                    n14 = 133;
                    break;
                }
                case 188: {
                    n14 = 169;
                    break;
                }
                case 189: {
                    n14 = 149;
                    break;
                }
                case 190: {
                    n14 = 173;
                    break;
                }
                case 191: {
                    n14 = 143;
                    break;
                }
                case 192: {
                    n14 = 152;
                    break;
                }
                case 193: {
                    n14 = 70;
                    break;
                }
                case 194: {
                    n14 = 190;
                    break;
                }
                case 195: {
                    n14 = 178;
                    break;
                }
                case 196: {
                    n14 = 236;
                    break;
                }
                case 197: {
                    n14 = 107;
                    break;
                }
                case 198: {
                    n14 = 142;
                    break;
                }
                case 199: {
                    n14 = 132;
                    break;
                }
                case 200: {
                    n14 = 8;
                    break;
                }
                case 201: {
                    n14 = 230;
                    break;
                }
                case 202: {
                    n14 = 180;
                    break;
                }
                case 203: {
                    n14 = 13;
                    break;
                }
                case 204: {
                    n14 = 42;
                    break;
                }
                case 205: {
                    n14 = 163;
                    break;
                }
                case 206: {
                    n14 = 202;
                    break;
                }
                case 207: {
                    n14 = 44;
                    break;
                }
                case 208: {
                    n14 = 186;
                    break;
                }
                case 209: {
                    n14 = 205;
                    break;
                }
                case 210: {
                    n14 = 139;
                    break;
                }
                case 211: {
                    n14 = 61;
                    break;
                }
                case 212: {
                    n14 = 89;
                    break;
                }
                case 213: {
                    n14 = 77;
                    break;
                }
                case 214: {
                    n14 = 119;
                    break;
                }
                case 215: {
                    n14 = 137;
                    break;
                }
                case 216: {
                    n14 = 123;
                    break;
                }
                case 217: {
                    n14 = 206;
                    break;
                }
                case 218: {
                    n14 = 223;
                    break;
                }
                case 219: {
                    n14 = 135;
                    break;
                }
                case 220: {
                    n14 = 4;
                    break;
                }
                case 221: {
                    n14 = 154;
                    break;
                }
                case 222: {
                    n14 = 43;
                    break;
                }
                case 223: {
                    n14 = 30;
                    break;
                }
                case 224: {
                    n14 = 141;
                    break;
                }
                case 225: {
                    n14 = 17;
                    break;
                }
                case 226: {
                    n14 = 216;
                    break;
                }
                case 227: {
                    n14 = 172;
                    break;
                }
                case 228: {
                    n14 = 9;
                    break;
                }
                case 229: {
                    n14 = 200;
                    break;
                }
                case 230: {
                    n14 = 228;
                    break;
                }
                case 231: {
                    n14 = 227;
                    break;
                }
                case 232: {
                    n14 = 136;
                    break;
                }
                case 233: {
                    n14 = 104;
                    break;
                }
                case 234: {
                    n14 = 253;
                    break;
                }
                case 235: {
                    n14 = 170;
                    break;
                }
                case 236: {
                    n14 = 40;
                    break;
                }
                case 237: {
                    n14 = 183;
                    break;
                }
                case 238: {
                    n14 = 144;
                    break;
                }
                case 239: {
                    n14 = 224;
                    break;
                }
                case 240: {
                    n14 = 72;
                    break;
                }
                case 241: {
                    n14 = 83;
                    break;
                }
                case 242: {
                    n14 = 147;
                    break;
                }
                case 243: {
                    n14 = 56;
                    break;
                }
                case 244: {
                    n14 = 124;
                    break;
                }
                case 245: {
                    n14 = 229;
                    break;
                }
                case 246: {
                    n14 = 158;
                    break;
                }
                case 247: {
                    n14 = 201;
                    break;
                }
                case 248: {
                    n14 = 188;
                    break;
                }
                case 249: {
                    n14 = 153;
                    break;
                }
                case 250: {
                    n14 = 37;
                    break;
                }
                case 251: {
                    n14 = 250;
                    break;
                }
                case 252: {
                    n14 = 252;
                    break;
                }
                case 253: {
                    n14 = 16;
                    break;
                }
                case 254: {
                    n14 = 148;
                    break;
                }
                default: {
                    n14 = 23;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            b8_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x41A2;
        if (f[n11] == null) {
            b8_0.f[n11] = (int)(c[n11] ^ l2);
        }
        return f[n11];
    }
}

