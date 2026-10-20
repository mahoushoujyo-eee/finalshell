/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.EP;
import com.ak_0;
import com.nj_2;
import com.nl_1;
import com.nv_2;
import com.uh_0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/*
 * Renamed from com.Ky
 */
public final class ky_0
implements ak_0 {
    public static final ky_0 R;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block100: {
            block92: {
                block115: {
                    block90: {
                        block91: {
                            block88: {
                                block89: {
                                    block111: {
                                        block112: {
                                            var6_6 = nv_2.o();
                                            v0 = var1_1.w.I(EP.WriteClassName);
                                            if (var6_6 == null) break block88;
                                            if (v0) break block111;
                                            break block112;
                                            catch (IOException v1) {
                                                throw ky_0.a(v1);
                                            }
                                        }
                                        try {
                                            block113: {
                                                v0 = EP.e(var5_5, EP.WriteClassName);
                                                if (var6_6 == null) break block88;
                                                break block113;
                                                catch (IOException v2) {
                                                    throw ky_0.a(v2);
                                                }
                                            }
                                            if (!v0) break block89;
                                        }
                                        catch (IOException v3) {
                                            throw ky_0.a(v3);
                                        }
                                    }
                                    v0 = true;
                                    break block88;
                                }
                                v0 = false;
                            }
                            var7_7 = v0;
                            var8_8 = var1_1.w;
                            var9_9 = null;
                            if (var7_7) {
                                var9_9 = B8.r(var4_4);
                            }
                            v4 = var2_2;
                            if (var6_6 == null) break block90;
                            try {
                                block114: {
                                    if (v4 != null) break block91;
                                    break block114;
                                    catch (IOException v5) {
                                        throw ky_0.a(v5);
                                    }
                                }
                                var8_8.x(EP.WriteNullListAsEmpty);
                                return;
                            }
                            catch (IOException v6) {
                                throw ky_0.a(v6);
                            }
                        }
                        v4 = var2_2;
                    }
                    var10_10 = (List)v4;
                    if (var6_6 == null) break block115;
                    try {
                        block116: {
                            if (var10_10.size() != 0) break block92;
                            break block116;
                            catch (IOException v7) {
                                throw ky_0.a(v7);
                            }
                        }
                        var8_8.q(ky_0.a(-17422, -16306));
                    }
                    catch (IOException v8) {
                        throw ky_0.a(v8);
                    }
                }
                return;
            }
            var11_11 = var1_1.W;
            var1_1.N(var11_11, var2_2, var3_3, 0);
            var12_12 = null;
            try {
                block93: {
                    block94: {
                        block95: {
                            try {
                                v9 = var8_8.I(EP.PrettyFormat);
                                if (var6_6 == null) break block93;
                                if (v9 == 0) break block94;
                            }
                            catch (IOException v10) {
                                throw ky_0.a(v10);
                            }
                            var8_8.T((char)ky_0.a(12868, 7120829023029897015L));
                            var1_1.C();
                            var13_13 = 0;
                            for (E var15_17 : var10_10) {
                                block99: {
                                    block98: {
                                        block119: {
                                            block121: {
                                                block120: {
                                                    block96: {
                                                        block97: {
                                                            block117: {
                                                                if (var6_6 == null) break block95;
                                                                if (var6_6 == null) break block96;
                                                                break block117;
                                                                catch (IOException v11) {
                                                                    throw ky_0.a(v11);
                                                                }
                                                            }
                                                            try {
                                                                block118: {
                                                                    if (var13_13 == 0) break block97;
                                                                    break block118;
                                                                    catch (IOException v12) {
                                                                        throw ky_0.a(v12);
                                                                    }
                                                                }
                                                                var8_8.T((char)ky_0.a(10207, 991437098878513837L));
                                                            }
                                                            catch (IOException v13) {
                                                                throw ky_0.a(v13);
                                                            }
                                                        }
                                                        try {
                                                            v14 = var1_1;
                                                            if (var6_6 == null) break block98;
                                                            v14.i();
                                                        }
                                                        catch (IOException v15) {
                                                            throw ky_0.a(v15);
                                                        }
                                                    }
                                                    if (var15_17 == null) ** GOTO lbl145
                                                    v16 = var1_1;
                                                    v17 = var15_17;
                                                    if (var6_6 == null) break block119;
                                                    break block120;
                                                    catch (IOException v18) {
                                                        throw ky_0.a(v18);
                                                    }
                                                }
                                                if (!v16.S(v17)) ** GOTO lbl132
                                                break block121;
                                                catch (IOException v19) {
                                                    throw ky_0.a(v19);
                                                }
                                            }
                                            try {
                                                block122: {
                                                    var1_1.G(var15_17);
                                                    if (var6_6 != null) break block99;
                                                    break block122;
                                                    catch (IOException v20) {
                                                        throw ky_0.a(v20);
                                                    }
                                                }
                                                v16 = var1_1;
                                                v17 = var15_17;
                                            }
                                            catch (IOException v21) {
                                                throw ky_0.a(v21);
                                            }
                                        }
                                        var12_12 = v16.E(v17.getClass());
                                        var16_19 = new uh_0(var11_11, var2_2, var3_3, 0, 0);
                                        try {
                                            var1_1.W = var16_19;
                                            var12_12.u(var1_1, var15_17, var13_13, var9_9, var5_5);
                                            if (var6_6 != null) break block99;
lbl145:
                                            // 2 sources

                                            v14 = var1_1;
                                        }
                                        catch (IOException v22) {
                                            throw ky_0.a(v22);
                                        }
                                    }
                                    v14.w.Y();
                                }
                                ++var13_13;
                                if (var6_6 != null) continue;
                            }
                            var1_1.r();
                            var1_1.i();
                            var8_8.T((char)ky_0.a(7024, 4107020447457480193L));
                        }
                        return;
                    }
                    var8_8.T((char)ky_0.a(14986, 1865329350873952254L));
                    v9 = 0;
                }
                var14_16 = var10_10.size();
                for (var13_14 = v4018251; var13_14 < var14_16; ++var13_14) {
                    block110: {
                        block109: {
                            block132: {
                                block107: {
                                    block108: {
                                        block106: {
                                            block105: {
                                                block104: {
                                                    block103: {
                                                        block102: {
                                                            block128: {
                                                                block127: {
                                                                    block124: {
                                                                        block125: {
                                                                            block101: {
                                                                                var15_18 = var10_10.get(var13_14);
                                                                                if (var6_6 == null) break block100;
                                                                                try {
                                                                                    block123: {
                                                                                        if (var13_14 == 0) break block101;
                                                                                        break block123;
                                                                                        catch (IOException v23) {
                                                                                            throw ky_0.a(v23);
                                                                                        }
                                                                                    }
                                                                                    var8_8.T((char)ky_0.a(12611, 8400492567747404854L));
                                                                                }
                                                                                catch (IOException v24) {
                                                                                    throw ky_0.a(v24);
                                                                                }
                                                                            }
                                                                            v25 = var15_18;
                                                                            if (var6_6 == null) break block124;
                                                                            if (v25 != null) ** GOTO lbl198
                                                                            break block125;
                                                                            catch (IOException v26) {
                                                                                throw ky_0.a(v26);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block126: {
                                                                                var8_8.q(ky_0.a(-17421, -31231));
                                                                                if (var6_6 != null) continue;
                                                                                break block126;
                                                                                catch (IOException v27) {
                                                                                    throw ky_0.a(v27);
                                                                                }
                                                                            }
                                                                            v25 = var15_18;
                                                                        }
                                                                        catch (IOException v28) {
                                                                            throw ky_0.a(v28);
                                                                        }
                                                                    }
                                                                    var16_20 = v25.getClass();
                                                                    v29 /* !! */  = var16_20;
                                                                    v30 /* !! */  = Integer.class;
                                                                    if (var6_6 == null) break block102;
                                                                    if (v29 /* !! */  != v30 /* !! */ ) ** GOTO lbl221
                                                                    break block127;
                                                                    catch (IOException v31) {
                                                                        throw ky_0.a(v31);
                                                                    }
                                                                }
                                                                var8_8.v((Integer)var15_18);
                                                                if (var6_6 != null) continue;
                                                                break block128;
                                                                catch (IOException v32) {
                                                                    throw ky_0.a(v32);
                                                                }
                                                            }
                                                            try {
                                                                block129: {
                                                                    v29 /* !! */  = var16_20;
                                                                    if (var6_6 == null) break block103;
                                                                    break block129;
                                                                    catch (IOException v33) {
                                                                        throw ky_0.a(v33);
                                                                    }
                                                                }
                                                                v30 /* !! */  = Long.class;
                                                            }
                                                            catch (IOException v34) {
                                                                throw ky_0.a(v34);
                                                            }
                                                        }
                                                        if (v29 /* !! */  != v30 /* !! */ ) ** GOTO lbl261
                                                        v29 /* !! */  = var15_18;
                                                    }
                                                    var17_21 = (Long)v29 /* !! */ ;
                                                    if (var6_6 == null) break block104;
                                                    try {
                                                        block130: {
                                                            if (!var7_7) ** GOTO lbl254
                                                            break block130;
                                                            catch (IOException v35) {
                                                                throw ky_0.a(v35);
                                                            }
                                                        }
                                                        var8_8.i(var17_21);
                                                        var8_8.write(ky_0.a(31279, 7161117955786272601L));
                                                    }
                                                    catch (IOException v36) {
                                                        throw ky_0.a(v36);
                                                    }
                                                }
                                                try {
                                                    if (var6_6 != null) break block105;
lbl254:
                                                    // 2 sources

                                                    var8_8.i(var17_21);
                                                }
                                                catch (IOException v37) {
                                                    throw ky_0.a(v37);
                                                }
                                            }
                                            if (var6_6 != null) continue;
lbl261:
                                            // 2 sources

                                            try {
                                                block131: {
                                                    v38 = EP.DisableCircularReferenceDetect.mask & var5_5;
                                                    if (var6_6 == null) break block106;
                                                    break block131;
                                                    catch (IOException v39) {
                                                        throw ky_0.a(v39);
                                                    }
                                                }
                                                if (v38 != 0) {
                                                }
                                                ** GOTO lbl277
                                            }
                                            catch (IOException v40) {
                                                throw ky_0.a(v40);
                                            }
                                            var12_12 = var1_1.E(var15_18.getClass());
                                            try {
                                                var12_12.u(var1_1, var15_18, var13_14, var9_9, var5_5);
                                                if (var6_6 != null) continue;
lbl277:
                                                // 2 sources

                                                v38 = (int)var8_8.g;
                                            }
                                            catch (IOException v41) {
                                                throw ky_0.a(v41);
                                            }
                                        }
                                        try {
                                            if (var6_6 == null) break block107;
                                            if (v38 != 0) break block108;
                                        }
                                        catch (IOException v42) {
                                            throw ky_0.a(v42);
                                        }
                                        var1_1.W = var17_22 = new uh_0(var11_11, var2_2, var3_3, 0, 0);
                                    }
                                    v38 = (int)var1_1.S(var15_18);
                                }
                                if (var6_6 == null) break block109;
                                if (v38 == 0) ** GOTO lbl306
                                break block132;
                                catch (IOException v43) {
                                    throw ky_0.a(v43);
                                }
                            }
                            try {
                                block133: {
                                    var1_1.G(var15_18);
                                    if (var6_6 != null) continue;
                                    break block133;
                                    catch (IOException v44) {
                                        throw ky_0.a(v44);
                                    }
                                }
                                v45 = var1_1.E(var15_18.getClass());
                                if (var6_6 == null) break block110;
                            }
                            catch (IOException v46) {
                                throw ky_0.a(v46);
                            }
                            var12_12 = v45;
                            v38 = EP.WriteClassName.mask & var5_5;
                        }
                        if (v38 == 0) ** GOTO lbl333
                        try {
                            block134: {
                                v45 = var12_12;
                                if (var6_6 == null) break block110;
                                break block134;
                                catch (IOException v47) {
                                    throw ky_0.a(v47);
                                }
                            }
                            if (v45 instanceof nj_2) {
                            }
                            ** GOTO lbl333
                        }
                        catch (IOException v48) {
                            throw ky_0.a(v48);
                        }
                        var17_23 = (nj_2)var12_12;
                        try {
                            var17_23.s(var1_1, var15_18, var13_14, var9_9, var5_5);
                            if (var6_6 != null) continue;
lbl333:
                            // 3 sources

                            v45 = var12_12;
                        }
                        catch (IOException v49) {
                            throw ky_0.a(v49);
                        }
                    }
                    v45.u(var1_1, var15_18, var13_14, var9_9, var5_5);
                    if (var6_6 != null) continue;
                }
                var8_8.T((char)ky_0.a(17034, 2766524687112624125L));
            }
            finally {
                var1_1.W = var11_11;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "N\u00ad\u00a2\u0097\u0002\u00ed\u001a";
                    var12_3 = "N\u00ad\u00a2\u0097\u0002\u00ed\u001a".length();
                    var9_4 = 4;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 123;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 116;
                                    break;
                                }
                                case 1: {
                                    v11 = 23;
                                    break;
                                }
                                case 2: {
                                    v11 = 62;
                                    break;
                                }
                                case 3: {
                                    v11 = 99;
                                    break;
                                }
                                case 4: {
                                    v11 = 120;
                                    break;
                                }
                                case 5: {
                                    v11 = 89;
                                    break;
                                }
                                default: {
                                    v11 = 94;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                ky_0.a = var13;
                ky_0.b = new String[2];
                var0_7 = 4989464794093168136L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = ")\u0002's\u00ea\u008f\u00f1\u00a8\u00c6%\u0093\u0099\u0092rI\u001d@o\u000eu\u00f1\u00d9\u0002\u0012{Q\u00c1k\u001c\u00ce\t\u00ad/\u00c2F\u00df\u00b8\u00c0\u0081d";
                var5_11 = ")\u0002's\u00ea\u008f\u00f1\u00a8\u00c6%\u0093\u0099\u0092rI\u001d@o\u000eu\u00f1\u00d9\u0002\u0012{Q\u00c1k\u001c\u00ce\t\u00ad/\u00c2F\u00df\u00b8\u00c0\u0081d".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "Y\u008e\u00fc\u00ae\u00a0\u00f1\u0094\u0089\u0096\r\u0007\u00c78\u00c5\u00a8T";
                    var5_11 = "Y\u008e\u00fc\u00ae\u00a0\u00f1\u0094\u0089\u0096\r\u0007\u00c78\u00c5\u00a8T".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        ky_0.c = var6_8;
        ky_0.d = new Integer[7];
        ky_0.R = new ky_0();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFBBF3) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 113;
                    break;
                }
                case 1: {
                    n14 = 20;
                    break;
                }
                case 2: {
                    n14 = 37;
                    break;
                }
                case 3: {
                    n14 = 227;
                    break;
                }
                case 4: {
                    n14 = 50;
                    break;
                }
                case 5: {
                    n14 = 254;
                    break;
                }
                case 6: {
                    n14 = 223;
                    break;
                }
                case 7: {
                    n14 = 3;
                    break;
                }
                case 8: {
                    n14 = 136;
                    break;
                }
                case 9: {
                    n14 = 165;
                    break;
                }
                case 10: {
                    n14 = 0;
                    break;
                }
                case 11: {
                    n14 = 253;
                    break;
                }
                case 12: {
                    n14 = 193;
                    break;
                }
                case 13: {
                    n14 = 214;
                    break;
                }
                case 14: {
                    n14 = 216;
                    break;
                }
                case 15: {
                    n14 = 118;
                    break;
                }
                case 16: {
                    n14 = 87;
                    break;
                }
                case 17: {
                    n14 = 152;
                    break;
                }
                case 18: {
                    n14 = 43;
                    break;
                }
                case 19: {
                    n14 = 225;
                    break;
                }
                case 20: {
                    n14 = 255;
                    break;
                }
                case 21: {
                    n14 = 72;
                    break;
                }
                case 22: {
                    n14 = 61;
                    break;
                }
                case 23: {
                    n14 = 69;
                    break;
                }
                case 24: {
                    n14 = 158;
                    break;
                }
                case 25: {
                    n14 = 52;
                    break;
                }
                case 26: {
                    n14 = 151;
                    break;
                }
                case 27: {
                    n14 = 122;
                    break;
                }
                case 28: {
                    n14 = 45;
                    break;
                }
                case 29: {
                    n14 = 66;
                    break;
                }
                case 30: {
                    n14 = 8;
                    break;
                }
                case 31: {
                    n14 = 144;
                    break;
                }
                case 32: {
                    n14 = 138;
                    break;
                }
                case 33: {
                    n14 = 209;
                    break;
                }
                case 34: {
                    n14 = 180;
                    break;
                }
                case 35: {
                    n14 = 27;
                    break;
                }
                case 36: {
                    n14 = 194;
                    break;
                }
                case 37: {
                    n14 = 110;
                    break;
                }
                case 38: {
                    n14 = 197;
                    break;
                }
                case 39: {
                    n14 = 198;
                    break;
                }
                case 40: {
                    n14 = 130;
                    break;
                }
                case 41: {
                    n14 = 142;
                    break;
                }
                case 42: {
                    n14 = 213;
                    break;
                }
                case 43: {
                    n14 = 218;
                    break;
                }
                case 44: {
                    n14 = 196;
                    break;
                }
                case 45: {
                    n14 = 229;
                    break;
                }
                case 46: {
                    n14 = 140;
                    break;
                }
                case 47: {
                    n14 = 224;
                    break;
                }
                case 48: {
                    n14 = 183;
                    break;
                }
                case 49: {
                    n14 = 4;
                    break;
                }
                case 50: {
                    n14 = 132;
                    break;
                }
                case 51: {
                    n14 = 243;
                    break;
                }
                case 52: {
                    n14 = 71;
                    break;
                }
                case 53: {
                    n14 = 249;
                    break;
                }
                case 54: {
                    n14 = 48;
                    break;
                }
                case 55: {
                    n14 = 92;
                    break;
                }
                case 56: {
                    n14 = 15;
                    break;
                }
                case 57: {
                    n14 = 156;
                    break;
                }
                case 58: {
                    n14 = 238;
                    break;
                }
                case 59: {
                    n14 = 51;
                    break;
                }
                case 60: {
                    n14 = 171;
                    break;
                }
                case 61: {
                    n14 = 215;
                    break;
                }
                case 62: {
                    n14 = 231;
                    break;
                }
                case 63: {
                    n14 = 114;
                    break;
                }
                case 64: {
                    n14 = 125;
                    break;
                }
                case 65: {
                    n14 = 210;
                    break;
                }
                case 66: {
                    n14 = 182;
                    break;
                }
                case 67: {
                    n14 = 195;
                    break;
                }
                case 68: {
                    n14 = 131;
                    break;
                }
                case 69: {
                    n14 = 49;
                    break;
                }
                case 70: {
                    n14 = 88;
                    break;
                }
                case 71: {
                    n14 = 25;
                    break;
                }
                case 72: {
                    n14 = 23;
                    break;
                }
                case 73: {
                    n14 = 219;
                    break;
                }
                case 74: {
                    n14 = 31;
                    break;
                }
                case 75: {
                    n14 = 241;
                    break;
                }
                case 76: {
                    n14 = 199;
                    break;
                }
                case 77: {
                    n14 = 89;
                    break;
                }
                case 78: {
                    n14 = 75;
                    break;
                }
                case 79: {
                    n14 = 245;
                    break;
                }
                case 80: {
                    n14 = 63;
                    break;
                }
                case 81: {
                    n14 = 157;
                    break;
                }
                case 82: {
                    n14 = 226;
                    break;
                }
                case 83: {
                    n14 = 9;
                    break;
                }
                case 84: {
                    n14 = 240;
                    break;
                }
                case 85: {
                    n14 = 175;
                    break;
                }
                case 86: {
                    n14 = 34;
                    break;
                }
                case 87: {
                    n14 = 10;
                    break;
                }
                case 88: {
                    n14 = 220;
                    break;
                }
                case 89: {
                    n14 = 83;
                    break;
                }
                case 90: {
                    n14 = 36;
                    break;
                }
                case 91: {
                    n14 = 24;
                    break;
                }
                case 92: {
                    n14 = 2;
                    break;
                }
                case 93: {
                    n14 = 150;
                    break;
                }
                case 94: {
                    n14 = 174;
                    break;
                }
                case 95: {
                    n14 = 54;
                    break;
                }
                case 96: {
                    n14 = 190;
                    break;
                }
                case 97: {
                    n14 = 121;
                    break;
                }
                case 98: {
                    n14 = 127;
                    break;
                }
                case 99: {
                    n14 = 179;
                    break;
                }
                case 100: {
                    n14 = 204;
                    break;
                }
                case 101: {
                    n14 = 188;
                    break;
                }
                case 102: {
                    n14 = 5;
                    break;
                }
                case 103: {
                    n14 = 186;
                    break;
                }
                case 104: {
                    n14 = 246;
                    break;
                }
                case 105: {
                    n14 = 168;
                    break;
                }
                case 106: {
                    n14 = 12;
                    break;
                }
                case 107: {
                    n14 = 85;
                    break;
                }
                case 108: {
                    n14 = 79;
                    break;
                }
                case 109: {
                    n14 = 235;
                    break;
                }
                case 110: {
                    n14 = 46;
                    break;
                }
                case 111: {
                    n14 = 111;
                    break;
                }
                case 112: {
                    n14 = 41;
                    break;
                }
                case 113: {
                    n14 = 228;
                    break;
                }
                case 114: {
                    n14 = 124;
                    break;
                }
                case 115: {
                    n14 = 14;
                    break;
                }
                case 116: {
                    n14 = 119;
                    break;
                }
                case 117: {
                    n14 = 162;
                    break;
                }
                case 118: {
                    n14 = 65;
                    break;
                }
                case 119: {
                    n14 = 95;
                    break;
                }
                case 120: {
                    n14 = 102;
                    break;
                }
                case 121: {
                    n14 = 39;
                    break;
                }
                case 122: {
                    n14 = 33;
                    break;
                }
                case 123: {
                    n14 = 143;
                    break;
                }
                case 124: {
                    n14 = 116;
                    break;
                }
                case 125: {
                    n14 = 147;
                    break;
                }
                case 126: {
                    n14 = 201;
                    break;
                }
                case 127: {
                    n14 = 203;
                    break;
                }
                case 128: {
                    n14 = 159;
                    break;
                }
                case 129: {
                    n14 = 94;
                    break;
                }
                case 130: {
                    n14 = 19;
                    break;
                }
                case 131: {
                    n14 = 236;
                    break;
                }
                case 132: {
                    n14 = 99;
                    break;
                }
                case 133: {
                    n14 = 13;
                    break;
                }
                case 134: {
                    n14 = 104;
                    break;
                }
                case 135: {
                    n14 = 247;
                    break;
                }
                case 136: {
                    n14 = 16;
                    break;
                }
                case 137: {
                    n14 = 251;
                    break;
                }
                case 138: {
                    n14 = 60;
                    break;
                }
                case 139: {
                    n14 = 230;
                    break;
                }
                case 140: {
                    n14 = 242;
                    break;
                }
                case 141: {
                    n14 = 189;
                    break;
                }
                case 142: {
                    n14 = 86;
                    break;
                }
                case 143: {
                    n14 = 40;
                    break;
                }
                case 144: {
                    n14 = 82;
                    break;
                }
                case 145: {
                    n14 = 105;
                    break;
                }
                case 146: {
                    n14 = 70;
                    break;
                }
                case 147: {
                    n14 = 221;
                    break;
                }
                case 148: {
                    n14 = 178;
                    break;
                }
                case 149: {
                    n14 = 81;
                    break;
                }
                case 150: {
                    n14 = 56;
                    break;
                }
                case 151: {
                    n14 = 64;
                    break;
                }
                case 152: {
                    n14 = 146;
                    break;
                }
                case 153: {
                    n14 = 167;
                    break;
                }
                case 154: {
                    n14 = 73;
                    break;
                }
                case 155: {
                    n14 = 212;
                    break;
                }
                case 156: {
                    n14 = 62;
                    break;
                }
                case 157: {
                    n14 = 17;
                    break;
                }
                case 158: {
                    n14 = 117;
                    break;
                }
                case 159: {
                    n14 = 181;
                    break;
                }
                case 160: {
                    n14 = 58;
                    break;
                }
                case 161: {
                    n14 = 252;
                    break;
                }
                case 162: {
                    n14 = 160;
                    break;
                }
                case 163: {
                    n14 = 153;
                    break;
                }
                case 164: {
                    n14 = 139;
                    break;
                }
                case 165: {
                    n14 = 93;
                    break;
                }
                case 166: {
                    n14 = 35;
                    break;
                }
                case 167: {
                    n14 = 101;
                    break;
                }
                case 168: {
                    n14 = 84;
                    break;
                }
                case 169: {
                    n14 = 211;
                    break;
                }
                case 170: {
                    n14 = 187;
                    break;
                }
                case 171: {
                    n14 = 184;
                    break;
                }
                case 172: {
                    n14 = 120;
                    break;
                }
                case 173: {
                    n14 = 128;
                    break;
                }
                case 174: {
                    n14 = 244;
                    break;
                }
                case 175: {
                    n14 = 133;
                    break;
                }
                case 176: {
                    n14 = 170;
                    break;
                }
                case 177: {
                    n14 = 172;
                    break;
                }
                case 178: {
                    n14 = 32;
                    break;
                }
                case 179: {
                    n14 = 59;
                    break;
                }
                case 180: {
                    n14 = 135;
                    break;
                }
                case 181: {
                    n14 = 163;
                    break;
                }
                case 182: {
                    n14 = 129;
                    break;
                }
                case 183: {
                    n14 = 90;
                    break;
                }
                case 184: {
                    n14 = 1;
                    break;
                }
                case 185: {
                    n14 = 134;
                    break;
                }
                case 186: {
                    n14 = 55;
                    break;
                }
                case 187: {
                    n14 = 166;
                    break;
                }
                case 188: {
                    n14 = 107;
                    break;
                }
                case 189: {
                    n14 = 137;
                    break;
                }
                case 190: {
                    n14 = 248;
                    break;
                }
                case 191: {
                    n14 = 237;
                    break;
                }
                case 192: {
                    n14 = 176;
                    break;
                }
                case 193: {
                    n14 = 78;
                    break;
                }
                case 194: {
                    n14 = 11;
                    break;
                }
                case 195: {
                    n14 = 217;
                    break;
                }
                case 196: {
                    n14 = 169;
                    break;
                }
                case 197: {
                    n14 = 26;
                    break;
                }
                case 198: {
                    n14 = 30;
                    break;
                }
                case 199: {
                    n14 = 18;
                    break;
                }
                case 200: {
                    n14 = 173;
                    break;
                }
                case 201: {
                    n14 = 200;
                    break;
                }
                case 202: {
                    n14 = 222;
                    break;
                }
                case 203: {
                    n14 = 68;
                    break;
                }
                case 204: {
                    n14 = 44;
                    break;
                }
                case 205: {
                    n14 = 109;
                    break;
                }
                case 206: {
                    n14 = 38;
                    break;
                }
                case 207: {
                    n14 = 206;
                    break;
                }
                case 208: {
                    n14 = 115;
                    break;
                }
                case 209: {
                    n14 = 97;
                    break;
                }
                case 210: {
                    n14 = 57;
                    break;
                }
                case 211: {
                    n14 = 96;
                    break;
                }
                case 212: {
                    n14 = 141;
                    break;
                }
                case 213: {
                    n14 = 42;
                    break;
                }
                case 214: {
                    n14 = 6;
                    break;
                }
                case 215: {
                    n14 = 91;
                    break;
                }
                case 216: {
                    n14 = 148;
                    break;
                }
                case 217: {
                    n14 = 47;
                    break;
                }
                case 218: {
                    n14 = 106;
                    break;
                }
                case 219: {
                    n14 = 154;
                    break;
                }
                case 220: {
                    n14 = 29;
                    break;
                }
                case 221: {
                    n14 = 208;
                    break;
                }
                case 222: {
                    n14 = 28;
                    break;
                }
                case 223: {
                    n14 = 205;
                    break;
                }
                case 224: {
                    n14 = 103;
                    break;
                }
                case 225: {
                    n14 = 126;
                    break;
                }
                case 226: {
                    n14 = 149;
                    break;
                }
                case 227: {
                    n14 = 202;
                    break;
                }
                case 228: {
                    n14 = 177;
                    break;
                }
                case 229: {
                    n14 = 192;
                    break;
                }
                case 230: {
                    n14 = 22;
                    break;
                }
                case 231: {
                    n14 = 80;
                    break;
                }
                case 232: {
                    n14 = 161;
                    break;
                }
                case 233: {
                    n14 = 145;
                    break;
                }
                case 234: {
                    n14 = 98;
                    break;
                }
                case 235: {
                    n14 = 155;
                    break;
                }
                case 236: {
                    n14 = 76;
                    break;
                }
                case 237: {
                    n14 = 100;
                    break;
                }
                case 238: {
                    n14 = 108;
                    break;
                }
                case 239: {
                    n14 = 7;
                    break;
                }
                case 240: {
                    n14 = 207;
                    break;
                }
                case 241: {
                    n14 = 234;
                    break;
                }
                case 242: {
                    n14 = 185;
                    break;
                }
                case 243: {
                    n14 = 250;
                    break;
                }
                case 244: {
                    n14 = 239;
                    break;
                }
                case 245: {
                    n14 = 123;
                    break;
                }
                case 246: {
                    n14 = 77;
                    break;
                }
                case 247: {
                    n14 = 233;
                    break;
                }
                case 248: {
                    n14 = 232;
                    break;
                }
                case 249: {
                    n14 = 74;
                    break;
                }
                case 250: {
                    n14 = 53;
                    break;
                }
                case 251: {
                    n14 = 191;
                    break;
                }
                case 252: {
                    n14 = 112;
                    break;
                }
                case 253: {
                    n14 = 21;
                    break;
                }
                case 254: {
                    n14 = 164;
                    break;
                }
                default: {
                    n14 = 67;
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
            ky_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1577;
        if (d[n11] == null) {
            ky_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

