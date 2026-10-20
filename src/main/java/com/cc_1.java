/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.hi_0;
import com.ph_0;
import com.uy_0;
import com.we_1;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/*
 * Renamed from com.cC
 */
class cc_1
implements we_1 {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    cc_1() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Object N(Object var1_1) {
        block103: {
            block102: {
                block104: {
                    block101: {
                        block99: {
                            block100: {
                                block98: {
                                    block97: {
                                        block96: {
                                            block94: {
                                                block95: {
                                                    block93: {
                                                        block92: {
                                                            block91: {
                                                                block90: {
                                                                    block89: {
                                                                        block88: {
                                                                            block86: {
                                                                                block87: {
                                                                                    block84: {
                                                                                        block85: {
                                                                                            block82: {
                                                                                                block83: {
                                                                                                    var2_2 = ph_0.u();
                                                                                                    try {
                                                                                                        try {
                                                                                                            v0 = var1_1;
                                                                                                            if (var2_2 != 0) break block82;
                                                                                                            if (v0 != null) break block83;
                                                                                                        }
                                                                                                        catch (hi_0 v1) {
                                                                                                            throw cc_1.a(v1);
                                                                                                        }
                                                                                                        return null;
                                                                                                    }
                                                                                                    catch (hi_0 v2) {
                                                                                                        throw cc_1.a(v2);
                                                                                                    }
                                                                                                }
                                                                                                v0 = var1_1;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v3 = v0 instanceof Calendar;
                                                                                                    if (var2_2 != 0) break block84;
                                                                                                    if (!v3) break block85;
                                                                                                }
                                                                                                catch (hi_0 v4) {
                                                                                                    throw cc_1.a(v4);
                                                                                                }
                                                                                                return new Timestamp(((Calendar)var1_1).getTimeInMillis());
                                                                                            }
                                                                                            catch (hi_0 v5) {
                                                                                                throw cc_1.a(v5);
                                                                                            }
                                                                                        }
                                                                                        v3 = var1_1 instanceof Timestamp;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var2_2 != 0) break block86;
                                                                                            if (!v3) break block87;
                                                                                        }
                                                                                        catch (hi_0 v6) {
                                                                                            throw cc_1.a(v6);
                                                                                        }
                                                                                        return (Timestamp)var1_1;
                                                                                    }
                                                                                    catch (hi_0 v7) {
                                                                                        throw cc_1.a(v7);
                                                                                    }
                                                                                }
                                                                                v3 = var1_1 instanceof Date;
                                                                            }
                                                                            try {
                                                                                if (v3) {
                                                                                    return new Timestamp(((Date)var1_1).getTime());
                                                                                }
                                                                            }
                                                                            catch (hi_0 v8) {
                                                                                throw cc_1.a(v8);
                                                                            }
                                                                            var3_3 = 0L;
                                                                            try {
                                                                                v9 = var1_1 instanceof BigDecimal;
                                                                                if (var2_2 != 0) break block88;
                                                                                if (v9) {
                                                                                }
                                                                                ** GOTO lbl61
                                                                            }
                                                                            catch (hi_0 v10) {
                                                                                throw cc_1.a(v10);
                                                                            }
                                                                            var3_3 = B8.X((BigDecimal)var1_1);
                                                                            try {
                                                                                if (var2_2 == 0) break block89;
lbl61:
                                                                                // 2 sources

                                                                                v9 = var1_1 instanceof Number;
                                                                            }
                                                                            catch (hi_0 v11) {
                                                                                throw cc_1.a(v11);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (var2_2 != 0) break block90;
                                                                            if (!v9) break block89;
                                                                        }
                                                                        catch (hi_0 v12) {
                                                                            throw cc_1.a(v12);
                                                                        }
                                                                        var3_3 = ((Number)var1_1).longValue();
                                                                    }
                                                                    try {
                                                                        v13 = var1_1;
                                                                        if (var2_2 != 0) break block91;
                                                                        v9 = v13 instanceof String;
                                                                    }
                                                                    catch (hi_0 v14) {
                                                                        throw cc_1.a(v14);
                                                                    }
                                                                }
                                                                if (!v9) break block103;
                                                                v13 = var1_1;
                                                            }
                                                            var5_4 = (String)v13;
                                                            try {
                                                                try {
                                                                    v15 = var5_4.length();
                                                                    if (var2_2 != 0) break block92;
                                                                    if (v15 != 0) {
                                                                    }
                                                                    ** GOTO lbl120
                                                                }
                                                                catch (hi_0 v16) {
                                                                    throw cc_1.a(v16);
                                                                }
                                                                v15 = (int)cc_1.a(30330, -12487).equals(var5_4);
                                                            }
                                                            catch (hi_0 v17) {
                                                                throw cc_1.a(v17);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var2_2 != 0) break block93;
                                                                if (v15 == 0) {
                                                                }
                                                                ** GOTO lbl120
                                                            }
                                                            catch (hi_0 v18) {
                                                                throw cc_1.a(v18);
                                                            }
                                                            v15 = (int)cc_1.a(30331, -7508).equals(var5_4);
                                                        }
                                                        catch (hi_0 v19) {
                                                            throw cc_1.a(v19);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var2_2 != 0) break block94;
                                                            if (v15 == 0) break block95;
                                                        }
                                                        catch (hi_0 v20) {
                                                            throw cc_1.a(v20);
                                                        }
lbl120:
                                                        // 3 sources

                                                        return null;
                                                    }
                                                    catch (hi_0 v21) {
                                                        throw cc_1.a(v21);
                                                    }
                                                }
                                                v15 = (int)var5_4.endsWith(cc_1.a(30328, 26725));
                                            }
                                            try {
                                                if (var2_2 != 0) break block96;
                                                if (v15 != 0) {
                                                }
                                                ** GOTO lbl136
                                            }
                                            catch (hi_0 v22) {
                                                throw cc_1.a(v22);
                                            }
                                            var5_4 = var5_4.substring(0, var5_4.length() - cc_1.a(30997, 7113557700255835100L));
                                            try {
                                                if (var2_2 == 0) break block97;
lbl136:
                                                // 2 sources

                                                v15 = (int)var5_4.endsWith(cc_1.a(30333, -9494));
                                            }
                                            catch (hi_0 v23) {
                                                throw cc_1.a(v23);
                                            }
                                        }
                                        try {
                                            if (var2_2 != 0) break block98;
                                            if (v15 == 0) break block97;
                                        }
                                        catch (hi_0 v24) {
                                            throw cc_1.a(v24);
                                        }
                                        var5_4 = var5_4.substring(0, var5_4.length() - cc_1.a(6832, 5008456365589037160L));
                                    }
                                    v15 = var5_4.length();
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var2_2 != 0) break block99;
                                                                                    if (v15 != cc_1.a(17443, 9102739850516815595L)) break block100;
                                                                                }
                                                                                catch (hi_0 v25) {
                                                                                    throw cc_1.a(v25);
                                                                                }
                                                                                v15 = var5_4.charAt(4);
                                                                                if (var2_2 != 0) break block99;
                                                                            }
                                                                            catch (hi_0 v26) {
                                                                                throw cc_1.a(v26);
                                                                            }
                                                                            if (v15 != cc_1.a(6554, 3878397910159131457L)) break block100;
                                                                        }
                                                                        catch (hi_0 v27) {
                                                                            throw cc_1.a(v27);
                                                                        }
                                                                        v15 = var5_4.charAt(cc_1.a(22853, 5707722967309960070L));
                                                                        if (var2_2 != 0) break block99;
                                                                    }
                                                                    catch (hi_0 v28) {
                                                                        throw cc_1.a(v28);
                                                                    }
                                                                    if (v15 != cc_1.a(3794, 3041057972601361433L)) break block100;
                                                                }
                                                                catch (hi_0 v29) {
                                                                    throw cc_1.a(v29);
                                                                }
                                                                v15 = var5_4.charAt(cc_1.a(11623, 3483357191910602665L));
                                                                if (var2_2 != 0) break block99;
                                                            }
                                                            catch (hi_0 v30) {
                                                                throw cc_1.a(v30);
                                                            }
                                                            if (v15 != cc_1.a(28439, 4036744464426235342L)) break block100;
                                                        }
                                                        catch (hi_0 v31) {
                                                            throw cc_1.a(v31);
                                                        }
                                                        v15 = var5_4.charAt(cc_1.a(26461, 3996208392693906826L));
                                                        if (var2_2 != 0) break block99;
                                                    }
                                                    catch (hi_0 v32) {
                                                        throw cc_1.a(v32);
                                                    }
                                                    if (v15 != cc_1.a(8888, 6434325964710525047L)) break block100;
                                                }
                                                catch (hi_0 v33) {
                                                    throw cc_1.a(v33);
                                                }
                                                v15 = var5_4.charAt(cc_1.a(226, 6466669169908685366L));
                                                if (var2_2 != 0) break block99;
                                            }
                                            catch (hi_0 v34) {
                                                throw cc_1.a(v34);
                                            }
                                            if (v15 != cc_1.a(31622, 5889832579664568646L)) break block100;
                                        }
                                        catch (hi_0 v35) {
                                            throw cc_1.a(v35);
                                        }
                                        v15 = var5_4.charAt(cc_1.a(24287, 2593974022882116609L));
                                        if (var2_2 != 0) break block99;
                                    }
                                    catch (hi_0 v36) {
                                        throw cc_1.a(v36);
                                    }
                                    if (v15 != cc_1.a(1187, 955713912955182713L)) break block100;
                                }
                                catch (hi_0 v37) {
                                    throw cc_1.a(v37);
                                }
                                var6_5 = B8.R(var5_4.charAt(0), var5_4.charAt(1), var5_4.charAt(2), var5_4.charAt(3));
                                var7_7 = B8.j(var5_4.charAt(5), var5_4.charAt(cc_1.a(20557, 1986233716711967377L)));
                                var8_8 = B8.j(var5_4.charAt(cc_1.a(12366, 6943834274124868254L)), var5_4.charAt(cc_1.a(17253, 9110932551297915322L)));
                                var9_9 = B8.j(var5_4.charAt(cc_1.a(17393, 7125186539471231264L)), var5_4.charAt(cc_1.a(26154, 6981225911788698872L)));
                                var10_10 = B8.j(var5_4.charAt(cc_1.a(5310, 3642355539266113145L)), var5_4.charAt(cc_1.a(18876, 2889106736240677757L)));
                                var11_11 = B8.j(var5_4.charAt(cc_1.a(30968, 1881524973869523509L)), var5_4.charAt(cc_1.a(3290, 1913066127279494686L)));
                                var12_12 = B8.M(var5_4.charAt(cc_1.a(9105, 1078144602987247963L)), var5_4.charAt(cc_1.a(26386, 7139785087461391815L)), var5_4.charAt(cc_1.a(22330, 3690386015798382070L)), var5_4.charAt(cc_1.a(13130, 6132748776504994201L)), var5_4.charAt(cc_1.a(877, 4001729186757056939L)), var5_4.charAt(cc_1.a(3793, 1738321214206514195L)), var5_4.charAt(cc_1.a(30176, 5231940984639156029L)), var5_4.charAt(cc_1.a(25611, 2477684987731541725L)), var5_4.charAt(cc_1.a(17978, 1286259198909144319L)));
                                return new Timestamp(var6_5 - cc_1.a(21272, 329545356604426731L), var7_7 - 1, var8_8, var9_9, var10_10, var11_11, var12_12);
                            }
                            try {
                                v38 = var5_4;
                                if (var2_2 != 0) break block101;
                                v15 = (int)B8.Y(v38);
                            }
                            catch (hi_0 v39) {
                                throw cc_1.a(v39);
                            }
                        }
                        if (v15 == 0) break block104;
                        v38 = var5_4;
                    }
                    var3_3 = Long.parseLong(v38);
                    if (var2_2 == 0) break block103;
                }
                var6_6 = new uy_0(var5_4);
                try {
                    try {
                        v40 = var6_6;
                        if (var2_2 != 0) break block102;
                        if (v40.Z(false)) {
                        }
                        ** GOTO lbl264
                    }
                    catch (hi_0 v41) {
                        throw cc_1.a(v41);
                    }
                    v40 = var6_6;
                }
                catch (hi_0 v42) {
                    throw cc_1.a(v42);
                }
            }
            var3_3 = v40.c().getTime().getTime();
            try {
                if (var2_2 == 0) break block103;
lbl264:
                // 2 sources

                throw new hi_0(cc_1.a(30329, -25603) + var5_4);
            }
            catch (hi_0 v43) {
                throw cc_1.a(v43);
            }
        }
        return new Timestamp(var3_3);
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "L\u00b4\u00a2\u00cd\u00bc3\u00e2$\u00b0\u008b\\mw\u0081E\u009f4\u0088\u0010\u00f1\u0013ck\u00b1f\u00ffS\u0082\u00cf\u00f1\u008b\u008c\u00af\u00a3S\n\u00f6\u00f3ON\u00ca\u000e\u00fd'\u00cc\u00a8\u0004d\u001d\r&";
                        var12_3 = "L\u00b4\u00a2\u00cd\u00bc3\u00e2$\u00b0\u008b\\mw\u0081E\u009f4\u0088\u0010\u00f1\u0013ck\u00b1f\u00ffS\u0082\u00cf\u00f1\u008b\u008c\u00af\u00a3S\n\u00f6\u00f3ON\u00ca\u000e\u00fd'\u00cc\u00a8\u0004d\u001d\r&".length();
                        var9_4 = 35;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 2;
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
                            var10_2 = "\u00ed@\u00a4\u0015\u0007\u00f3\u0005s\f\u00d1\u00da\u0002";
                            var12_3 = "\u00ed@\u00a4\u0015\u0007\u00f3\u0005s\f\u00d1\u00da\u0002".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 84;
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
                                    v15 = 10;
                                    break;
                                }
                                case 1: {
                                    v15 = 18;
                                    break;
                                }
                                case 2: {
                                    v15 = 73;
                                    break;
                                }
                                case 3: {
                                    v15 = 54;
                                    break;
                                }
                                case 4: {
                                    v15 = 78;
                                    break;
                                }
                                case 5: {
                                    v15 = 69;
                                    break;
                                }
                                default: {
                                    v15 = 41;
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
                cc_1.a = var13;
                cc_1.b = new String[5];
                var0_7 = 5187640488141002142L;
                var6_8 = new long[33];
                var3_9 = 0;
                var4_10 = "\u0002\u00bboZ\u00e6^\u00bc\u00106\u00db\u00b2\u0092n\u00fe\u00e9j\u00e2x\u0001\u00ac\u00c5\u0087\u00cc\u00b5\\]\u00fb=\u009eq?\b\u00d2pQ\u00d8\u00d8\u00e0h\u0019\u00f9X\u00c0\u00bf\u0091\u001akX\u00a7E\u00d8@\u0090\u00d0hL\u00f3(\u0081\u0012\u00c6t\u008f\u00b8e\u001a\u00f2\u009d\"\u00b3\u0016\u00f2<\u0089\u00eeff\u0083\u008b\u00c9\u008c\u00b8\u00da\u00ce\r2`p\u0003J\u00da\u00e3\u00a9\u00ee\u0095\u00f1\u00d0y\u009f\u00ee\u00d2\u00b3\u00cc-\u008f\u008bD\u00d2\u00b8n\u00d1\u008c\u0017=N\u00c2\u00e5-z\u00b9s5\u00b1;S\u0091_\t\u00cbz\u00be=\u00a0\u00cdV\u001f\u00de\u000e\u009ec\u00c8Z\u0001\u0094\u0015\u00cb\u0017+\u001d\u00c4F\u00ecr\u00c1n/oy\u00f4\u00e2\u0012w)\u0002y\u00b6\u001b\u00e9!>j\u0091\u00a1\u00e3\u008c-\u00b1x\u00e1\u0000\u00d6\u001a\u00c9}\u0094a\u0091\u0081\"G\u0083\u0092\u001a\u0012@\u008f\u00c0R\u0001\u00aa\u00ad7f\u00ff;\u009b,\u00d1\u0083\tL\u0003\u00e2\u00eavH2\u00cb\u0087\u00a0\u008e\u00cc\u00cbh\u009f\"\u0019@1\u00b0\u00ad\u00d3\u0092\u00f4\u00f8\u00c8\u00f7\u00b6\"=\u00ec!\u00ad\u0018Q\u0090\u00f7\u00ba";
                var5_11 = "\u0002\u00bboZ\u00e6^\u00bc\u00106\u00db\u00b2\u0092n\u00fe\u00e9j\u00e2x\u0001\u00ac\u00c5\u0087\u00cc\u00b5\\]\u00fb=\u009eq?\b\u00d2pQ\u00d8\u00d8\u00e0h\u0019\u00f9X\u00c0\u00bf\u0091\u001akX\u00a7E\u00d8@\u0090\u00d0hL\u00f3(\u0081\u0012\u00c6t\u008f\u00b8e\u001a\u00f2\u009d\"\u00b3\u0016\u00f2<\u0089\u00eeff\u0083\u008b\u00c9\u008c\u00b8\u00da\u00ce\r2`p\u0003J\u00da\u00e3\u00a9\u00ee\u0095\u00f1\u00d0y\u009f\u00ee\u00d2\u00b3\u00cc-\u008f\u008bD\u00d2\u00b8n\u00d1\u008c\u0017=N\u00c2\u00e5-z\u00b9s5\u00b1;S\u0091_\t\u00cbz\u00be=\u00a0\u00cdV\u001f\u00de\u000e\u009ec\u00c8Z\u0001\u0094\u0015\u00cb\u0017+\u001d\u00c4F\u00ecr\u00c1n/oy\u00f4\u00e2\u0012w)\u0002y\u00b6\u001b\u00e9!>j\u0091\u00a1\u00e3\u008c-\u00b1x\u00e1\u0000\u00d6\u001a\u00c9}\u0094a\u0091\u0081\"G\u0083\u0092\u001a\u0012@\u008f\u00c0R\u0001\u00aa\u00ad7f\u00ff;\u009b,\u00d1\u0083\tL\u0003\u00e2\u00eavH2\u00cb\u0087\u00a0\u008e\u00cc\u00cbh\u009f\"\u0019@1\u00b0\u00ad\u00d3\u0092\u00f4\u00f8\u00c8\u00f7\u00b6\"=\u00ec!\u00ad\u0018Q\u0090\u00f7\u00ba".length();
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
                    var4_10 = ")\u00ae\u00fe\u0084\u0085\u00afX~\u009ez\u0082\u001b\u009b\u00dd[\u0019";
                    var5_11 = ")\u00ae\u00fe\u0084\u0085\u00afX~\u009ez\u0082\u001b\u009b\u00dd[\u0019".length();
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
        cc_1.c = var6_8;
        cc_1.d = new Integer[33];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x7679) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 111;
                    break;
                }
                case 1: {
                    n14 = 1;
                    break;
                }
                case 2: {
                    n14 = 193;
                    break;
                }
                case 3: {
                    n14 = 142;
                    break;
                }
                case 4: {
                    n14 = 42;
                    break;
                }
                case 5: {
                    n14 = 242;
                    break;
                }
                case 6: {
                    n14 = 81;
                    break;
                }
                case 7: {
                    n14 = 23;
                    break;
                }
                case 8: {
                    n14 = 85;
                    break;
                }
                case 9: {
                    n14 = 154;
                    break;
                }
                case 10: {
                    n14 = 55;
                    break;
                }
                case 11: {
                    n14 = 54;
                    break;
                }
                case 12: {
                    n14 = 178;
                    break;
                }
                case 13: {
                    n14 = 60;
                    break;
                }
                case 14: {
                    n14 = 234;
                    break;
                }
                case 15: {
                    n14 = 8;
                    break;
                }
                case 16: {
                    n14 = 94;
                    break;
                }
                case 17: {
                    n14 = 203;
                    break;
                }
                case 18: {
                    n14 = 127;
                    break;
                }
                case 19: {
                    n14 = 52;
                    break;
                }
                case 20: {
                    n14 = 91;
                    break;
                }
                case 21: {
                    n14 = 34;
                    break;
                }
                case 22: {
                    n14 = 132;
                    break;
                }
                case 23: {
                    n14 = 222;
                    break;
                }
                case 24: {
                    n14 = 98;
                    break;
                }
                case 25: {
                    n14 = 188;
                    break;
                }
                case 26: {
                    n14 = 75;
                    break;
                }
                case 27: {
                    n14 = 123;
                    break;
                }
                case 28: {
                    n14 = 252;
                    break;
                }
                case 29: {
                    n14 = 227;
                    break;
                }
                case 30: {
                    n14 = 31;
                    break;
                }
                case 31: {
                    n14 = 207;
                    break;
                }
                case 32: {
                    n14 = 201;
                    break;
                }
                case 33: {
                    n14 = 215;
                    break;
                }
                case 34: {
                    n14 = 185;
                    break;
                }
                case 35: {
                    n14 = 17;
                    break;
                }
                case 36: {
                    n14 = 202;
                    break;
                }
                case 37: {
                    n14 = 139;
                    break;
                }
                case 38: {
                    n14 = 192;
                    break;
                }
                case 39: {
                    n14 = 77;
                    break;
                }
                case 40: {
                    n14 = 33;
                    break;
                }
                case 41: {
                    n14 = 148;
                    break;
                }
                case 42: {
                    n14 = 250;
                    break;
                }
                case 43: {
                    n14 = 246;
                    break;
                }
                case 44: {
                    n14 = 211;
                    break;
                }
                case 45: {
                    n14 = 182;
                    break;
                }
                case 46: {
                    n14 = 137;
                    break;
                }
                case 47: {
                    n14 = 119;
                    break;
                }
                case 48: {
                    n14 = 84;
                    break;
                }
                case 49: {
                    n14 = 184;
                    break;
                }
                case 50: {
                    n14 = 165;
                    break;
                }
                case 51: {
                    n14 = 26;
                    break;
                }
                case 52: {
                    n14 = 62;
                    break;
                }
                case 53: {
                    n14 = 24;
                    break;
                }
                case 54: {
                    n14 = 67;
                    break;
                }
                case 55: {
                    n14 = 21;
                    break;
                }
                case 56: {
                    n14 = 29;
                    break;
                }
                case 57: {
                    n14 = 49;
                    break;
                }
                case 58: {
                    n14 = 41;
                    break;
                }
                case 59: {
                    n14 = 90;
                    break;
                }
                case 60: {
                    n14 = 25;
                    break;
                }
                case 61: {
                    n14 = 96;
                    break;
                }
                case 62: {
                    n14 = 36;
                    break;
                }
                case 63: {
                    n14 = 107;
                    break;
                }
                case 64: {
                    n14 = 134;
                    break;
                }
                case 65: {
                    n14 = 39;
                    break;
                }
                case 66: {
                    n14 = 175;
                    break;
                }
                case 67: {
                    n14 = 190;
                    break;
                }
                case 68: {
                    n14 = 214;
                    break;
                }
                case 69: {
                    n14 = 220;
                    break;
                }
                case 70: {
                    n14 = 128;
                    break;
                }
                case 71: {
                    n14 = 15;
                    break;
                }
                case 72: {
                    n14 = 241;
                    break;
                }
                case 73: {
                    n14 = 254;
                    break;
                }
                case 74: {
                    n14 = 45;
                    break;
                }
                case 75: {
                    n14 = 93;
                    break;
                }
                case 76: {
                    n14 = 130;
                    break;
                }
                case 77: {
                    n14 = 109;
                    break;
                }
                case 78: {
                    n14 = 63;
                    break;
                }
                case 79: {
                    n14 = 159;
                    break;
                }
                case 80: {
                    n14 = 9;
                    break;
                }
                case 81: {
                    n14 = 208;
                    break;
                }
                case 82: {
                    n14 = 57;
                    break;
                }
                case 83: {
                    n14 = 27;
                    break;
                }
                case 84: {
                    n14 = 245;
                    break;
                }
                case 85: {
                    n14 = 205;
                    break;
                }
                case 86: {
                    n14 = 238;
                    break;
                }
                case 87: {
                    n14 = 244;
                    break;
                }
                case 88: {
                    n14 = 189;
                    break;
                }
                case 89: {
                    n14 = 50;
                    break;
                }
                case 90: {
                    n14 = 196;
                    break;
                }
                case 91: {
                    n14 = 157;
                    break;
                }
                case 92: {
                    n14 = 115;
                    break;
                }
                case 93: {
                    n14 = 19;
                    break;
                }
                case 94: {
                    n14 = 108;
                    break;
                }
                case 95: {
                    n14 = 160;
                    break;
                }
                case 96: {
                    n14 = 3;
                    break;
                }
                case 97: {
                    n14 = 40;
                    break;
                }
                case 98: {
                    n14 = 161;
                    break;
                }
                case 99: {
                    n14 = 37;
                    break;
                }
                case 100: {
                    n14 = 135;
                    break;
                }
                case 101: {
                    n14 = 152;
                    break;
                }
                case 102: {
                    n14 = 125;
                    break;
                }
                case 103: {
                    n14 = 105;
                    break;
                }
                case 104: {
                    n14 = 87;
                    break;
                }
                case 105: {
                    n14 = 226;
                    break;
                }
                case 106: {
                    n14 = 106;
                    break;
                }
                case 107: {
                    n14 = 120;
                    break;
                }
                case 108: {
                    n14 = 138;
                    break;
                }
                case 109: {
                    n14 = 173;
                    break;
                }
                case 110: {
                    n14 = 150;
                    break;
                }
                case 111: {
                    n14 = 172;
                    break;
                }
                case 112: {
                    n14 = 223;
                    break;
                }
                case 113: {
                    n14 = 100;
                    break;
                }
                case 114: {
                    n14 = 163;
                    break;
                }
                case 115: {
                    n14 = 164;
                    break;
                }
                case 116: {
                    n14 = 174;
                    break;
                }
                case 117: {
                    n14 = 0;
                    break;
                }
                case 118: {
                    n14 = 129;
                    break;
                }
                case 119: {
                    n14 = 191;
                    break;
                }
                case 120: {
                    n14 = 217;
                    break;
                }
                case 121: {
                    n14 = 243;
                    break;
                }
                case 122: {
                    n14 = 47;
                    break;
                }
                case 123: {
                    n14 = 213;
                    break;
                }
                case 124: {
                    n14 = 22;
                    break;
                }
                case 125: {
                    n14 = 235;
                    break;
                }
                case 126: {
                    n14 = 4;
                    break;
                }
                case 127: {
                    n14 = 247;
                    break;
                }
                case 128: {
                    n14 = 88;
                    break;
                }
                case 129: {
                    n14 = 183;
                    break;
                }
                case 130: {
                    n14 = 158;
                    break;
                }
                case 131: {
                    n14 = 73;
                    break;
                }
                case 132: {
                    n14 = 65;
                    break;
                }
                case 133: {
                    n14 = 95;
                    break;
                }
                case 134: {
                    n14 = 68;
                    break;
                }
                case 135: {
                    n14 = 197;
                    break;
                }
                case 136: {
                    n14 = 216;
                    break;
                }
                case 137: {
                    n14 = 194;
                    break;
                }
                case 138: {
                    n14 = 166;
                    break;
                }
                case 139: {
                    n14 = 86;
                    break;
                }
                case 140: {
                    n14 = 218;
                    break;
                }
                case 141: {
                    n14 = 144;
                    break;
                }
                case 142: {
                    n14 = 102;
                    break;
                }
                case 143: {
                    n14 = 112;
                    break;
                }
                case 144: {
                    n14 = 143;
                    break;
                }
                case 145: {
                    n14 = 219;
                    break;
                }
                case 146: {
                    n14 = 20;
                    break;
                }
                case 147: {
                    n14 = 221;
                    break;
                }
                case 148: {
                    n14 = 209;
                    break;
                }
                case 149: {
                    n14 = 66;
                    break;
                }
                case 150: {
                    n14 = 59;
                    break;
                }
                case 151: {
                    n14 = 212;
                    break;
                }
                case 152: {
                    n14 = 44;
                    break;
                }
                case 153: {
                    n14 = 133;
                    break;
                }
                case 154: {
                    n14 = 89;
                    break;
                }
                case 155: {
                    n14 = 155;
                    break;
                }
                case 156: {
                    n14 = 170;
                    break;
                }
                case 157: {
                    n14 = 225;
                    break;
                }
                case 158: {
                    n14 = 233;
                    break;
                }
                case 159: {
                    n14 = 255;
                    break;
                }
                case 160: {
                    n14 = 204;
                    break;
                }
                case 161: {
                    n14 = 16;
                    break;
                }
                case 162: {
                    n14 = 14;
                    break;
                }
                case 163: {
                    n14 = 146;
                    break;
                }
                case 164: {
                    n14 = 249;
                    break;
                }
                case 165: {
                    n14 = 32;
                    break;
                }
                case 166: {
                    n14 = 116;
                    break;
                }
                case 167: {
                    n14 = 12;
                    break;
                }
                case 168: {
                    n14 = 101;
                    break;
                }
                case 169: {
                    n14 = 110;
                    break;
                }
                case 170: {
                    n14 = 230;
                    break;
                }
                case 171: {
                    n14 = 38;
                    break;
                }
                case 172: {
                    n14 = 176;
                    break;
                }
                case 173: {
                    n14 = 103;
                    break;
                }
                case 174: {
                    n14 = 169;
                    break;
                }
                case 175: {
                    n14 = 124;
                    break;
                }
                case 176: {
                    n14 = 122;
                    break;
                }
                case 177: {
                    n14 = 58;
                    break;
                }
                case 178: {
                    n14 = 76;
                    break;
                }
                case 179: {
                    n14 = 92;
                    break;
                }
                case 180: {
                    n14 = 2;
                    break;
                }
                case 181: {
                    n14 = 51;
                    break;
                }
                case 182: {
                    n14 = 136;
                    break;
                }
                case 183: {
                    n14 = 72;
                    break;
                }
                case 184: {
                    n14 = 61;
                    break;
                }
                case 185: {
                    n14 = 74;
                    break;
                }
                case 186: {
                    n14 = 156;
                    break;
                }
                case 187: {
                    n14 = 236;
                    break;
                }
                case 188: {
                    n14 = 121;
                    break;
                }
                case 189: {
                    n14 = 117;
                    break;
                }
                case 190: {
                    n14 = 162;
                    break;
                }
                case 191: {
                    n14 = 145;
                    break;
                }
                case 192: {
                    n14 = 248;
                    break;
                }
                case 193: {
                    n14 = 118;
                    break;
                }
                case 194: {
                    n14 = 180;
                    break;
                }
                case 195: {
                    n14 = 79;
                    break;
                }
                case 196: {
                    n14 = 253;
                    break;
                }
                case 197: {
                    n14 = 126;
                    break;
                }
                case 198: {
                    n14 = 186;
                    break;
                }
                case 199: {
                    n14 = 10;
                    break;
                }
                case 200: {
                    n14 = 237;
                    break;
                }
                case 201: {
                    n14 = 30;
                    break;
                }
                case 202: {
                    n14 = 7;
                    break;
                }
                case 203: {
                    n14 = 228;
                    break;
                }
                case 204: {
                    n14 = 35;
                    break;
                }
                case 205: {
                    n14 = 28;
                    break;
                }
                case 206: {
                    n14 = 251;
                    break;
                }
                case 207: {
                    n14 = 179;
                    break;
                }
                case 208: {
                    n14 = 195;
                    break;
                }
                case 209: {
                    n14 = 5;
                    break;
                }
                case 210: {
                    n14 = 18;
                    break;
                }
                case 211: {
                    n14 = 43;
                    break;
                }
                case 212: {
                    n14 = 198;
                    break;
                }
                case 213: {
                    n14 = 171;
                    break;
                }
                case 214: {
                    n14 = 153;
                    break;
                }
                case 215: {
                    n14 = 151;
                    break;
                }
                case 216: {
                    n14 = 206;
                    break;
                }
                case 217: {
                    n14 = 11;
                    break;
                }
                case 218: {
                    n14 = 104;
                    break;
                }
                case 219: {
                    n14 = 240;
                    break;
                }
                case 220: {
                    n14 = 187;
                    break;
                }
                case 221: {
                    n14 = 114;
                    break;
                }
                case 222: {
                    n14 = 181;
                    break;
                }
                case 223: {
                    n14 = 69;
                    break;
                }
                case 224: {
                    n14 = 53;
                    break;
                }
                case 225: {
                    n14 = 231;
                    break;
                }
                case 226: {
                    n14 = 147;
                    break;
                }
                case 227: {
                    n14 = 210;
                    break;
                }
                case 228: {
                    n14 = 46;
                    break;
                }
                case 229: {
                    n14 = 177;
                    break;
                }
                case 230: {
                    n14 = 199;
                    break;
                }
                case 231: {
                    n14 = 6;
                    break;
                }
                case 232: {
                    n14 = 168;
                    break;
                }
                case 233: {
                    n14 = 224;
                    break;
                }
                case 234: {
                    n14 = 232;
                    break;
                }
                case 235: {
                    n14 = 239;
                    break;
                }
                case 236: {
                    n14 = 48;
                    break;
                }
                case 237: {
                    n14 = 140;
                    break;
                }
                case 238: {
                    n14 = 83;
                    break;
                }
                case 239: {
                    n14 = 70;
                    break;
                }
                case 240: {
                    n14 = 64;
                    break;
                }
                case 241: {
                    n14 = 13;
                    break;
                }
                case 242: {
                    n14 = 141;
                    break;
                }
                case 243: {
                    n14 = 97;
                    break;
                }
                case 244: {
                    n14 = 71;
                    break;
                }
                case 245: {
                    n14 = 113;
                    break;
                }
                case 246: {
                    n14 = 82;
                    break;
                }
                case 247: {
                    n14 = 99;
                    break;
                }
                case 248: {
                    n14 = 131;
                    break;
                }
                case 249: {
                    n14 = 56;
                    break;
                }
                case 250: {
                    n14 = 200;
                    break;
                }
                case 251: {
                    n14 = 80;
                    break;
                }
                case 252: {
                    n14 = 167;
                    break;
                }
                case 253: {
                    n14 = 78;
                    break;
                }
                case 254: {
                    n14 = 149;
                    break;
                }
                default: {
                    n14 = 229;
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
            cc_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1AD3;
        if (d[n11] == null) {
            cc_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

