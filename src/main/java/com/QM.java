/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.EP;
import com.P7;
import com.X4;
import com.ak_0;
import com.nj_2;
import com.nl_1;
import com.nv_2;
import com.oc_0;
import com.yn_2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class QM
implements ak_0,
X4 {
    public static final QM f;
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
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block58: {
            block56: {
                block57: {
                    block73: {
                        block72: {
                            block71: {
                                block70: {
                                    block55: {
                                        block54: {
                                            block53: {
                                                block67: {
                                                    var7_6 = var1_1.w;
                                                    var6_7 = nv_2.o();
                                                    if (var6_7 == null) break block67;
                                                    try {
                                                        block68: {
                                                            if (var2_2 != null) break block53;
                                                            break block68;
                                                            catch (IOException v0) {
                                                                throw QM.a(v0);
                                                            }
                                                        }
                                                        var7_6.x(EP.WriteNullListAsEmpty);
                                                    }
                                                    catch (IOException v1) {
                                                        throw QM.a(v1);
                                                    }
                                                }
                                                return;
                                            }
                                            var8_8 = null;
                                            v2 = var7_6.I(EP.WriteClassName);
                                            if (var6_7 == null) break block54;
                                            try {
                                                block69: {
                                                    if (v2) break block55;
                                                    break block69;
                                                    catch (IOException v3) {
                                                        throw QM.a(v3);
                                                    }
                                                }
                                                v2 = EP.e(var5_5, EP.WriteClassName);
                                            }
                                            catch (IOException v4) {
                                                throw QM.a(v4);
                                            }
                                        }
                                        if (!v2) break block70;
                                    }
                                    var8_8 = B8.r(var4_4);
                                }
                                var9_9 = (Collection)var2_2;
                                var10_10 = var1_1.W;
                                var1_1.N(var10_10, var2_2, var3_3, 0);
                                v5 = var7_6.I(EP.WriteClassName);
                                if (var6_7 == null) ** GOTO lbl87
                                if (v5 == 0) break block56;
                                break block71;
                                catch (IOException v6) {
                                    throw QM.a(v6);
                                }
                            }
                            v7 /* !! */  = HashSet.class;
                            v8 = var9_9.getClass();
                            if (var6_7 == null) break block57;
                            break block72;
                            catch (IOException v9) {
                                throw QM.a(v9);
                            }
                        }
                        if (!v7 /* !! */ .isAssignableFrom(v8)) ** GOTO lbl70
                        break block73;
                        catch (IOException v10) {
                            throw QM.a(v10);
                        }
                    }
                    try {
                        block74: {
                            var7_6.q(QM.a(-21473, 11637));
                            if (var6_7 != null) break block56;
                            break block74;
                            catch (IOException v11) {
                                throw QM.a(v11);
                            }
                        }
                        v7 /* !! */  = TreeSet.class;
                        v8 = var9_9.getClass();
                    }
                    catch (IOException v12) {
                        throw QM.a(v12);
                    }
                }
                try {
                    if (v7 /* !! */  == v8) {
                        var7_6.q(QM.a(-21474, 29641));
                    }
                }
                catch (IOException v13) {
                    throw QM.a(v13);
                }
            }
            try {
                v5 = 0;
lbl87:
                // 2 sources

                var11_11 = v5;
                var7_6.T((char)QM.a(8491, 7662110432714683560L));
                for (E var13_13 : var9_9) {
                    block66: {
                        block65: {
                            block64: {
                                block81: {
                                    block79: {
                                        block63: {
                                            block61: {
                                                block62: {
                                                    block76: {
                                                        block60: {
                                                            block59: {
                                                                if (var6_7 == null) break block58;
                                                                try {
                                                                    block75: {
                                                                        if (var11_11++ == 0) break block59;
                                                                        break block75;
                                                                        catch (IOException v14) {
                                                                            throw QM.a(v14);
                                                                        }
                                                                    }
                                                                    var7_6.T((char)QM.a(8835, 94288060220405506L));
                                                                }
                                                                catch (IOException v15) {
                                                                    throw QM.a(v15);
                                                                }
                                                            }
                                                            v16 = var13_13;
                                                            if (var6_7 == null) break block76;
                                                            try {
                                                                block77: {
                                                                    if (v16 != null) break block60;
                                                                    break block77;
                                                                    catch (IOException v17) {
                                                                        throw QM.a(v17);
                                                                    }
                                                                }
                                                                var7_6.Y();
                                                                if (var6_7 != null) continue;
                                                            }
                                                            catch (IOException v18) {
                                                                throw QM.a(v18);
                                                            }
                                                        }
                                                        v16 = var13_13;
                                                    }
                                                    var14_14 = v16.getClass();
                                                    v19 = var14_14;
                                                    v20 /* !! */  = Integer.class;
                                                    if (var6_7 == null) break block61;
                                                    try {
                                                        block78: {
                                                            if (v19 != v20 /* !! */ ) break block62;
                                                            break block78;
                                                            catch (IOException v21) {
                                                                throw QM.a(v21);
                                                            }
                                                        }
                                                        var7_6.v((Integer)var13_13);
                                                        if (var6_7 != null) continue;
                                                    }
                                                    catch (IOException v22) {
                                                        throw QM.a(v22);
                                                    }
                                                }
                                                v19 = var14_14;
                                                v20 /* !! */  = Long.class;
                                            }
                                            if (v19 != v20 /* !! */ ) break block79;
                                            try {
                                                block80: {
                                                    var7_6.i((Long)var13_13);
                                                    v23 = var7_6;
                                                    if (var6_7 == null) break block63;
                                                    break block80;
                                                    catch (IOException v24) {
                                                        throw QM.a(v24);
                                                    }
                                                }
                                                if (!v23.I(EP.WriteClassName)) continue;
                                            }
                                            catch (IOException v25) {
                                                throw QM.a(v25);
                                            }
                                            v23 = var7_6;
                                        }
                                        v23.write(QM.a(12814, 4936265311323350926L));
                                        if (var6_7 != null) continue;
                                    }
                                    var15_15 = var1_1.E(var14_14);
                                    v26 = EP.e(var5_5, EP.WriteClassName);
                                    if (var6_7 == null) break block64;
                                    if (!v26) ** GOTO lbl188
                                    break block81;
                                    catch (IOException v27) {
                                        throw QM.a(v27);
                                    }
                                }
                                try {
                                    block82: {
                                        v28 = var15_15;
                                        if (var6_7 == null) break block65;
                                        break block82;
                                        catch (IOException v29) {
                                            throw QM.a(v29);
                                        }
                                    }
                                    v26 = v28 instanceof nj_2;
                                }
                                catch (IOException v30) {
                                    throw QM.a(v30);
                                }
                            }
                            if (!v26) ** GOTO lbl188
                            var16_16 = (nj_2)var15_15;
                            try {
                                var16_16.s(var1_1, var13_13, var11_11 - 1, var8_8, var5_5);
                                if (var6_7 != null) break block66;
lbl188:
                                // 3 sources

                                v28 = var15_15;
                            }
                            catch (IOException v31) {
                                throw QM.a(v31);
                            }
                        }
                        v28.u(var1_1, var13_13, var11_11 - 1, var8_8, var5_5);
                    }
                    if (var6_7 != null) continue;
                }
                var7_6.T((char)QM.a(29575, 6204445405520864770L));
            }
            finally {
                var1_1.W = var10_10;
            }
        }
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        Collection collection;
        block11: {
            block10: {
                P7 p7;
                String string;
                block9: {
                    block8: {
                        P7 p72;
                        block7: {
                            string = nv_2.o();
                            p72 = yn_22.N;
                            if (string == null) break block7;
                            if (p72.P() != QM.a(12198, 6050819566495562276L)) break block8;
                            p72 = yn_22.N;
                        }
                        p72.S(QM.a(27588, 1824467588120755778L));
                        return null;
                    }
                    if (type == oc_0.class) {
                        oc_0 oc_02 = new oc_0();
                        yn_22.B(oc_02);
                        return oc_02;
                    }
                    p7 = yn_22.N;
                    if (string == null) break block9;
                    if (p7.P() != QM.a(6863, 581811359390748488L)) break block10;
                    p7 = yn_22.N;
                }
                p7.K();
                collection = B8.a(type);
                if (string != null) break block11;
            }
            collection = B8.P(type);
        }
        Type type2 = B8.r(type);
        yn_22.t(type2, collection, object);
        return collection;
    }

    @Override
    public int j() {
        return QM.a(15127, 2656043904263974547L);
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
                    var10_2 = "\u00d4n\u0088\u0007\u0002\u00ba\u00a4\u0093\u00ae\u00b4\u0018";
                    var12_3 = "\u00d4n\u0088\u0007\u0002\u00ba\u00a4\u0093\u00ae\u00b4\u0018".length();
                    var9_4 = 3;
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
                    v4 = 6;
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
                                    v11 = 69;
                                    break;
                                }
                                case 1: {
                                    v11 = 113;
                                    break;
                                }
                                case 2: {
                                    v11 = 49;
                                    break;
                                }
                                case 3: {
                                    v11 = 117;
                                    break;
                                }
                                case 4: {
                                    v11 = 64;
                                    break;
                                }
                                case 5: {
                                    v11 = 2;
                                    break;
                                }
                                default: {
                                    v11 = 78;
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
                QM.a = var13;
                QM.b = new String[2];
                var0_7 = 4801555662637435556L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = "\u009e\u008b\u00c5\u00f046p\u0088,\u008b\u00d1W\u00b3\u0000\u00feW\u00ff(M\u00cf\u00d6G\u00edfk\u00e2\u0012l\u00c7:}\u008ah\u00fbt\u00c6\u00a6\u00e3\u00b4\u00f6\u00d4\u00af\u0006d2\u0000\u00c5\u00f9";
                var5_11 = "\u009e\u008b\u00c5\u00f046p\u0088,\u008b\u00d1W\u00b3\u0000\u00feW\u00ff(M\u00cf\u00d6G\u00edfk\u00e2\u0012l\u00c7:}\u008ah\u00fbt\u00c6\u00a6\u00e3\u00b4\u00f6\u00d4\u00af\u0006d2\u0000\u00c5\u00f9".length();
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
                    var4_10 = "\u00e5\u00f4u\u0006\u00b5\u00bb\u00e49\u0092\u00069=0\u00a5,\u00fb";
                    var5_11 = "\u00e5\u00f4u\u0006\u00b5\u00bb\u00e49\u0092\u00069=0\u00a5,\u00fb".length();
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
        QM.c = var6_8;
        QM.d = new Integer[8];
        QM.f = new QM();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFAC1F) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 141;
                    break;
                }
                case 1: {
                    n14 = 226;
                    break;
                }
                case 2: {
                    n14 = 253;
                    break;
                }
                case 3: {
                    n14 = 88;
                    break;
                }
                case 4: {
                    n14 = 78;
                    break;
                }
                case 5: {
                    n14 = 46;
                    break;
                }
                case 6: {
                    n14 = 229;
                    break;
                }
                case 7: {
                    n14 = 215;
                    break;
                }
                case 8: {
                    n14 = 237;
                    break;
                }
                case 9: {
                    n14 = 157;
                    break;
                }
                case 10: {
                    n14 = 223;
                    break;
                }
                case 11: {
                    n14 = 94;
                    break;
                }
                case 12: {
                    n14 = 236;
                    break;
                }
                case 13: {
                    n14 = 57;
                    break;
                }
                case 14: {
                    n14 = 77;
                    break;
                }
                case 15: {
                    n14 = 59;
                    break;
                }
                case 16: {
                    n14 = 29;
                    break;
                }
                case 17: {
                    n14 = 182;
                    break;
                }
                case 18: {
                    n14 = 102;
                    break;
                }
                case 19: {
                    n14 = 47;
                    break;
                }
                case 20: {
                    n14 = 217;
                    break;
                }
                case 21: {
                    n14 = 82;
                    break;
                }
                case 22: {
                    n14 = 62;
                    break;
                }
                case 23: {
                    n14 = 12;
                    break;
                }
                case 24: {
                    n14 = 116;
                    break;
                }
                case 25: {
                    n14 = 188;
                    break;
                }
                case 26: {
                    n14 = 124;
                    break;
                }
                case 27: {
                    n14 = 44;
                    break;
                }
                case 28: {
                    n14 = 148;
                    break;
                }
                case 29: {
                    n14 = 112;
                    break;
                }
                case 30: {
                    n14 = 23;
                    break;
                }
                case 31: {
                    n14 = 9;
                    break;
                }
                case 32: {
                    n14 = 107;
                    break;
                }
                case 33: {
                    n14 = 244;
                    break;
                }
                case 34: {
                    n14 = 174;
                    break;
                }
                case 35: {
                    n14 = 10;
                    break;
                }
                case 36: {
                    n14 = 163;
                    break;
                }
                case 37: {
                    n14 = 243;
                    break;
                }
                case 38: {
                    n14 = 142;
                    break;
                }
                case 39: {
                    n14 = 238;
                    break;
                }
                case 40: {
                    n14 = 171;
                    break;
                }
                case 41: {
                    n14 = 6;
                    break;
                }
                case 42: {
                    n14 = 210;
                    break;
                }
                case 43: {
                    n14 = 224;
                    break;
                }
                case 44: {
                    n14 = 68;
                    break;
                }
                case 45: {
                    n14 = 103;
                    break;
                }
                case 46: {
                    n14 = 152;
                    break;
                }
                case 47: {
                    n14 = 81;
                    break;
                }
                case 48: {
                    n14 = 93;
                    break;
                }
                case 49: {
                    n14 = 76;
                    break;
                }
                case 50: {
                    n14 = 122;
                    break;
                }
                case 51: {
                    n14 = 190;
                    break;
                }
                case 52: {
                    n14 = 204;
                    break;
                }
                case 53: {
                    n14 = 13;
                    break;
                }
                case 54: {
                    n14 = 218;
                    break;
                }
                case 55: {
                    n14 = 65;
                    break;
                }
                case 56: {
                    n14 = 211;
                    break;
                }
                case 57: {
                    n14 = 25;
                    break;
                }
                case 58: {
                    n14 = 66;
                    break;
                }
                case 59: {
                    n14 = 201;
                    break;
                }
                case 60: {
                    n14 = 119;
                    break;
                }
                case 61: {
                    n14 = 125;
                    break;
                }
                case 62: {
                    n14 = 187;
                    break;
                }
                case 63: {
                    n14 = 109;
                    break;
                }
                case 64: {
                    n14 = 85;
                    break;
                }
                case 65: {
                    n14 = 180;
                    break;
                }
                case 66: {
                    n14 = 115;
                    break;
                }
                case 67: {
                    n14 = 108;
                    break;
                }
                case 68: {
                    n14 = 239;
                    break;
                }
                case 69: {
                    n14 = 164;
                    break;
                }
                case 70: {
                    n14 = 111;
                    break;
                }
                case 71: {
                    n14 = 55;
                    break;
                }
                case 72: {
                    n14 = 91;
                    break;
                }
                case 73: {
                    n14 = 97;
                    break;
                }
                case 74: {
                    n14 = 234;
                    break;
                }
                case 75: {
                    n14 = 144;
                    break;
                }
                case 76: {
                    n14 = 33;
                    break;
                }
                case 77: {
                    n14 = 89;
                    break;
                }
                case 78: {
                    n14 = 20;
                    break;
                }
                case 79: {
                    n14 = 158;
                    break;
                }
                case 80: {
                    n14 = 222;
                    break;
                }
                case 81: {
                    n14 = 137;
                    break;
                }
                case 82: {
                    n14 = 143;
                    break;
                }
                case 83: {
                    n14 = 72;
                    break;
                }
                case 84: {
                    n14 = 199;
                    break;
                }
                case 85: {
                    n14 = 233;
                    break;
                }
                case 86: {
                    n14 = 220;
                    break;
                }
                case 87: {
                    n14 = 249;
                    break;
                }
                case 88: {
                    n14 = 184;
                    break;
                }
                case 89: {
                    n14 = 207;
                    break;
                }
                case 90: {
                    n14 = 75;
                    break;
                }
                case 91: {
                    n14 = 203;
                    break;
                }
                case 92: {
                    n14 = 99;
                    break;
                }
                case 93: {
                    n14 = 63;
                    break;
                }
                case 94: {
                    n14 = 214;
                    break;
                }
                case 95: {
                    n14 = 106;
                    break;
                }
                case 96: {
                    n14 = 228;
                    break;
                }
                case 97: {
                    n14 = 14;
                    break;
                }
                case 98: {
                    n14 = 61;
                    break;
                }
                case 99: {
                    n14 = 8;
                    break;
                }
                case 100: {
                    n14 = 87;
                    break;
                }
                case 101: {
                    n14 = 30;
                    break;
                }
                case 102: {
                    n14 = 101;
                    break;
                }
                case 103: {
                    n14 = 185;
                    break;
                }
                case 104: {
                    n14 = 196;
                    break;
                }
                case 105: {
                    n14 = 130;
                    break;
                }
                case 106: {
                    n14 = 195;
                    break;
                }
                case 107: {
                    n14 = 168;
                    break;
                }
                case 108: {
                    n14 = 179;
                    break;
                }
                case 109: {
                    n14 = 154;
                    break;
                }
                case 110: {
                    n14 = 248;
                    break;
                }
                case 111: {
                    n14 = 146;
                    break;
                }
                case 112: {
                    n14 = 105;
                    break;
                }
                case 113: {
                    n14 = 69;
                    break;
                }
                case 114: {
                    n14 = 156;
                    break;
                }
                case 115: {
                    n14 = 60;
                    break;
                }
                case 116: {
                    n14 = 176;
                    break;
                }
                case 117: {
                    n14 = 49;
                    break;
                }
                case 118: {
                    n14 = 230;
                    break;
                }
                case 119: {
                    n14 = 173;
                    break;
                }
                case 120: {
                    n14 = 126;
                    break;
                }
                case 121: {
                    n14 = 50;
                    break;
                }
                case 122: {
                    n14 = 121;
                    break;
                }
                case 123: {
                    n14 = 235;
                    break;
                }
                case 124: {
                    n14 = 225;
                    break;
                }
                case 125: {
                    n14 = 219;
                    break;
                }
                case 126: {
                    n14 = 159;
                    break;
                }
                case 127: {
                    n14 = 118;
                    break;
                }
                case 128: {
                    n14 = 149;
                    break;
                }
                case 129: {
                    n14 = 100;
                    break;
                }
                case 130: {
                    n14 = 252;
                    break;
                }
                case 131: {
                    n14 = 64;
                    break;
                }
                case 132: {
                    n14 = 189;
                    break;
                }
                case 133: {
                    n14 = 134;
                    break;
                }
                case 134: {
                    n14 = 167;
                    break;
                }
                case 135: {
                    n14 = 5;
                    break;
                }
                case 136: {
                    n14 = 83;
                    break;
                }
                case 137: {
                    n14 = 240;
                    break;
                }
                case 138: {
                    n14 = 254;
                    break;
                }
                case 139: {
                    n14 = 140;
                    break;
                }
                case 140: {
                    n14 = 36;
                    break;
                }
                case 141: {
                    n14 = 74;
                    break;
                }
                case 142: {
                    n14 = 202;
                    break;
                }
                case 143: {
                    n14 = 231;
                    break;
                }
                case 144: {
                    n14 = 117;
                    break;
                }
                case 145: {
                    n14 = 200;
                    break;
                }
                case 146: {
                    n14 = 120;
                    break;
                }
                case 147: {
                    n14 = 170;
                    break;
                }
                case 148: {
                    n14 = 104;
                    break;
                }
                case 149: {
                    n14 = 70;
                    break;
                }
                case 150: {
                    n14 = 242;
                    break;
                }
                case 151: {
                    n14 = 177;
                    break;
                }
                case 152: {
                    n14 = 114;
                    break;
                }
                case 153: {
                    n14 = 52;
                    break;
                }
                case 154: {
                    n14 = 133;
                    break;
                }
                case 155: {
                    n14 = 67;
                    break;
                }
                case 156: {
                    n14 = 19;
                    break;
                }
                case 157: {
                    n14 = 43;
                    break;
                }
                case 158: {
                    n14 = 4;
                    break;
                }
                case 159: {
                    n14 = 41;
                    break;
                }
                case 160: {
                    n14 = 172;
                    break;
                }
                case 161: {
                    n14 = 128;
                    break;
                }
                case 162: {
                    n14 = 247;
                    break;
                }
                case 163: {
                    n14 = 212;
                    break;
                }
                case 164: {
                    n14 = 28;
                    break;
                }
                case 165: {
                    n14 = 151;
                    break;
                }
                case 166: {
                    n14 = 73;
                    break;
                }
                case 167: {
                    n14 = 7;
                    break;
                }
                case 168: {
                    n14 = 0;
                    break;
                }
                case 169: {
                    n14 = 113;
                    break;
                }
                case 170: {
                    n14 = 24;
                    break;
                }
                case 171: {
                    n14 = 186;
                    break;
                }
                case 172: {
                    n14 = 183;
                    break;
                }
                case 173: {
                    n14 = 86;
                    break;
                }
                case 174: {
                    n14 = 178;
                    break;
                }
                case 175: {
                    n14 = 2;
                    break;
                }
                case 176: {
                    n14 = 39;
                    break;
                }
                case 177: {
                    n14 = 161;
                    break;
                }
                case 178: {
                    n14 = 208;
                    break;
                }
                case 179: {
                    n14 = 90;
                    break;
                }
                case 180: {
                    n14 = 131;
                    break;
                }
                case 181: {
                    n14 = 26;
                    break;
                }
                case 182: {
                    n14 = 255;
                    break;
                }
                case 183: {
                    n14 = 34;
                    break;
                }
                case 184: {
                    n14 = 35;
                    break;
                }
                case 185: {
                    n14 = 209;
                    break;
                }
                case 186: {
                    n14 = 22;
                    break;
                }
                case 187: {
                    n14 = 138;
                    break;
                }
                case 188: {
                    n14 = 191;
                    break;
                }
                case 189: {
                    n14 = 129;
                    break;
                }
                case 190: {
                    n14 = 227;
                    break;
                }
                case 191: {
                    n14 = 58;
                    break;
                }
                case 192: {
                    n14 = 250;
                    break;
                }
                case 193: {
                    n14 = 53;
                    break;
                }
                case 194: {
                    n14 = 162;
                    break;
                }
                case 195: {
                    n14 = 165;
                    break;
                }
                case 196: {
                    n14 = 150;
                    break;
                }
                case 197: {
                    n14 = 98;
                    break;
                }
                case 198: {
                    n14 = 21;
                    break;
                }
                case 199: {
                    n14 = 245;
                    break;
                }
                case 200: {
                    n14 = 15;
                    break;
                }
                case 201: {
                    n14 = 32;
                    break;
                }
                case 202: {
                    n14 = 3;
                    break;
                }
                case 203: {
                    n14 = 92;
                    break;
                }
                case 204: {
                    n14 = 95;
                    break;
                }
                case 205: {
                    n14 = 16;
                    break;
                }
                case 206: {
                    n14 = 216;
                    break;
                }
                case 207: {
                    n14 = 205;
                    break;
                }
                case 208: {
                    n14 = 213;
                    break;
                }
                case 209: {
                    n14 = 71;
                    break;
                }
                case 210: {
                    n14 = 241;
                    break;
                }
                case 211: {
                    n14 = 192;
                    break;
                }
                case 212: {
                    n14 = 96;
                    break;
                }
                case 213: {
                    n14 = 153;
                    break;
                }
                case 214: {
                    n14 = 232;
                    break;
                }
                case 215: {
                    n14 = 127;
                    break;
                }
                case 216: {
                    n14 = 246;
                    break;
                }
                case 217: {
                    n14 = 42;
                    break;
                }
                case 218: {
                    n14 = 139;
                    break;
                }
                case 219: {
                    n14 = 132;
                    break;
                }
                case 220: {
                    n14 = 169;
                    break;
                }
                case 221: {
                    n14 = 38;
                    break;
                }
                case 222: {
                    n14 = 193;
                    break;
                }
                case 223: {
                    n14 = 11;
                    break;
                }
                case 224: {
                    n14 = 45;
                    break;
                }
                case 225: {
                    n14 = 166;
                    break;
                }
                case 226: {
                    n14 = 79;
                    break;
                }
                case 227: {
                    n14 = 80;
                    break;
                }
                case 228: {
                    n14 = 48;
                    break;
                }
                case 229: {
                    n14 = 206;
                    break;
                }
                case 230: {
                    n14 = 27;
                    break;
                }
                case 231: {
                    n14 = 18;
                    break;
                }
                case 232: {
                    n14 = 1;
                    break;
                }
                case 233: {
                    n14 = 145;
                    break;
                }
                case 234: {
                    n14 = 31;
                    break;
                }
                case 235: {
                    n14 = 194;
                    break;
                }
                case 236: {
                    n14 = 197;
                    break;
                }
                case 237: {
                    n14 = 181;
                    break;
                }
                case 238: {
                    n14 = 123;
                    break;
                }
                case 239: {
                    n14 = 160;
                    break;
                }
                case 240: {
                    n14 = 175;
                    break;
                }
                case 241: {
                    n14 = 251;
                    break;
                }
                case 242: {
                    n14 = 84;
                    break;
                }
                case 243: {
                    n14 = 56;
                    break;
                }
                case 244: {
                    n14 = 147;
                    break;
                }
                case 245: {
                    n14 = 135;
                    break;
                }
                case 246: {
                    n14 = 136;
                    break;
                }
                case 247: {
                    n14 = 54;
                    break;
                }
                case 248: {
                    n14 = 37;
                    break;
                }
                case 249: {
                    n14 = 198;
                    break;
                }
                case 250: {
                    n14 = 155;
                    break;
                }
                case 251: {
                    n14 = 110;
                    break;
                }
                case 252: {
                    n14 = 221;
                    break;
                }
                case 253: {
                    n14 = 51;
                    break;
                }
                case 254: {
                    n14 = 40;
                    break;
                }
                default: {
                    n14 = 17;
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
            QM.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5582;
        if (d[n11] == null) {
            QM.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

