/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.HashMap;
import org.H.C0;
import org.H.C1;
import org.H.C6;
import org.H.C9;
import org.H.CS;
import org.H.CU;
import org.H.CY;
import org.H.M;
import org.b_0;
import org.h.cd_0;
import org.h.ch_0;
import org.h.ck_0;
import org.h.cr_0;
import org.h.cv_0;
import org.h.r_0;
import org.h.v_0;
import org.v.N3;
import org.v.NQ;
import org.v.NV;
import org.v.RG;
import org.v.RS;
import org.v.f8;
import org.v.f_1;
import org.v.hV;
import org.v.h_1;
import org.v.hd_0;
import org.v.nc_0;
import org.v.nt_0;

/*
 * Renamed from org.v.l
 */
class l_0
implements f_1 {
    final cr_0 G;
    final h_1 z;
    private static final String[] a;
    private static final String[] b;

    l_0(h_1 h_12, cr_0 cr_02) {
        this.z = h_12;
        this.G = cr_02;
    }

    public r_0 z(NV nV2) throws b_0 {
        boolean bl;
        NV nV3;
        block95: {
            block96: {
                String[] stringArray;
                block93: {
                    block94: {
                        block91: {
                            block92: {
                                block89: {
                                    block90: {
                                        block87: {
                                            block88: {
                                                block85: {
                                                    block86: {
                                                        block83: {
                                                            block84: {
                                                                block79: {
                                                                    block80: {
                                                                        int n10;
                                                                        cr_0 cr_02;
                                                                        ck_0 ck_02;
                                                                        ck_0 ck_03;
                                                                        block82: {
                                                                            block81: {
                                                                                NV nV4;
                                                                                block77: {
                                                                                    block78: {
                                                                                        block75: {
                                                                                            block76: {
                                                                                                Object object;
                                                                                                block74: {
                                                                                                    boolean bl2;
                                                                                                    block67: {
                                                                                                        block68: {
                                                                                                            hd_0 hd_02;
                                                                                                            hd_0 hd_03;
                                                                                                            N3 n32;
                                                                                                            block72: {
                                                                                                                nt_0 nt_02;
                                                                                                                block71: {
                                                                                                                    NV nV5;
                                                                                                                    block69: {
                                                                                                                        block70: {
                                                                                                                            stringArray = RG.C();
                                                                                                                            try {
                                                                                                                                bl2 = nV2 instanceof NQ;
                                                                                                                                if (stringArray == null) break block67;
                                                                                                                                if (!bl2) break block68;
                                                                                                                            }
                                                                                                                            catch (b_0 b_02) {
                                                                                                                                throw l_0.a(b_02);
                                                                                                                            }
                                                                                                                            nV3 = h_1.i(this.z, (NQ)nV2).n();
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    nV5 = nV3;
                                                                                                                                    if (stringArray == null) break block69;
                                                                                                                                    if (nV5 instanceof N3) break block70;
                                                                                                                                    break block68;
                                                                                                                                }
                                                                                                                                catch (b_0 b_03) {
                                                                                                                                    throw l_0.a(b_03);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            catch (b_0 b_04) {
                                                                                                                                throw l_0.a(b_04);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        nV5 = nV3;
                                                                                                                    }
                                                                                                                    n32 = (N3)nV5;
                                                                                                                    nt_02 = n32.o.f();
                                                                                                                    try {
                                                                                                                        if (nt_02 != null) break block71;
                                                                                                                        break block68;
                                                                                                                    }
                                                                                                                    catch (b_0 b_05) {
                                                                                                                        throw l_0.a(b_05);
                                                                                                                    }
                                                                                                                }
                                                                                                                hd_03 = h_1.Y(this.z, nV2.Q(), nt_02.toString());
                                                                                                                try {
                                                                                                                    block73: {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                hd_02 = hd_03;
                                                                                                                                if (stringArray == null) break block72;
                                                                                                                                if (hd_02 != null) break block73;
                                                                                                                            }
                                                                                                                            catch (b_0 b_06) {
                                                                                                                                throw l_0.a(b_06);
                                                                                                                            }
                                                                                                                            h_1.T(this.z, l_0.a(-5617, 21121) + nt_02 + "\"", nt_02.Q());
                                                                                                                            if (stringArray != null) break block68;
                                                                                                                        }
                                                                                                                        catch (b_0 b_07) {
                                                                                                                            throw l_0.a(b_07);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    hd_02 = hd_03.c();
                                                                                                                }
                                                                                                                catch (b_0 b_08) {
                                                                                                                    throw l_0.a(b_08);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (hd_02 == h_1.Q((h_1)this.z).b) {
                                                                                                                    return new C0(this.G.H(hd_03.z()), this.G.H(n32.P.h()));
                                                                                                                }
                                                                                                            }
                                                                                                            catch (b_0 b_09) {
                                                                                                                throw l_0.a(b_09);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            object = nV2;
                                                                                                            if (stringArray == null) break block74;
                                                                                                            bl2 = object instanceof nc_0;
                                                                                                        }
                                                                                                        catch (b_0 b_010) {
                                                                                                            throw l_0.a(b_010);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (bl2) {
                                                                                                            return new CU(this.G.H(h_1.c(this.z, ((nc_0)nV2).E).z()));
                                                                                                        }
                                                                                                    }
                                                                                                    catch (b_0 b_011) {
                                                                                                        throw l_0.a(b_011);
                                                                                                    }
                                                                                                    object = this.z.w(nV2);
                                                                                                }
                                                                                                nV3 = object;
                                                                                                try {
                                                                                                    try {
                                                                                                        nV4 = nV3;
                                                                                                        if (stringArray == null) break block75;
                                                                                                        if (nV4 != h_1.K) break block76;
                                                                                                    }
                                                                                                    catch (b_0 b_012) {
                                                                                                        throw l_0.a(b_012);
                                                                                                    }
                                                                                                    throw new b_0("\"" + nV2 + l_0.a(-5619, 10311), nV2.Q());
                                                                                                }
                                                                                                catch (b_0 b_013) {
                                                                                                    throw l_0.a(b_013);
                                                                                                }
                                                                                            }
                                                                                            nV4 = nV3;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (stringArray == null) break block77;
                                                                                                if (nV4 != null) break block78;
                                                                                            }
                                                                                            catch (b_0 b_014) {
                                                                                                throw l_0.a(b_014);
                                                                                            }
                                                                                            throw new b_0(l_0.a(-5620, 29787), nV2.Q());
                                                                                        }
                                                                                        catch (b_0 b_015) {
                                                                                            throw l_0.a(b_015);
                                                                                        }
                                                                                    }
                                                                                    nV4 = nV3;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        ck_0 ck_04;
                                                                                        try {
                                                                                            bl = nV4 instanceof Boolean;
                                                                                            if (stringArray == null) break block79;
                                                                                            if (!bl) break block80;
                                                                                        }
                                                                                        catch (b_0 b_016) {
                                                                                            throw l_0.a(b_016);
                                                                                        }
                                                                                        ck_03 = ck_04;
                                                                                        ck_02 = ck_04;
                                                                                        cr_02 = this.G;
                                                                                        if (!((Boolean)((Object)nV3)).booleanValue()) break block81;
                                                                                    }
                                                                                    catch (b_0 b_017) {
                                                                                        throw l_0.a(b_017);
                                                                                    }
                                                                                    n10 = 1;
                                                                                    break block82;
                                                                                }
                                                                                catch (b_0 b_018) {
                                                                                    throw l_0.a(b_018);
                                                                                }
                                                                            }
                                                                            n10 = 0;
                                                                        }
                                                                        ck_03(cr_02.n(n10));
                                                                        return ck_02;
                                                                    }
                                                                    bl = nV3 instanceof Byte;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (stringArray == null) break block83;
                                                                        if (!bl) break block84;
                                                                    }
                                                                    catch (b_0 b_019) {
                                                                        throw l_0.a(b_019);
                                                                    }
                                                                    return new cd_0(this.G.n(((Byte)((Object)nV3)).byteValue()));
                                                                }
                                                                catch (b_0 b_020) {
                                                                    throw l_0.a(b_020);
                                                                }
                                                            }
                                                            bl = nV3 instanceof Short;
                                                        }
                                                        try {
                                                            try {
                                                                if (stringArray == null) break block85;
                                                                if (!bl) break block86;
                                                            }
                                                            catch (b_0 b_021) {
                                                                throw l_0.a(b_021);
                                                            }
                                                            return new C1(this.G.n(((Short)((Object)nV3)).shortValue()));
                                                        }
                                                        catch (b_0 b_022) {
                                                            throw l_0.a(b_022);
                                                        }
                                                    }
                                                    bl = nV3 instanceof Integer;
                                                }
                                                try {
                                                    try {
                                                        if (stringArray == null) break block87;
                                                        if (!bl) break block88;
                                                    }
                                                    catch (b_0 b_023) {
                                                        throw l_0.a(b_023);
                                                    }
                                                    return new C6(this.G.n((Integer)((Object)nV3)));
                                                }
                                                catch (b_0 b_024) {
                                                    throw l_0.a(b_024);
                                                }
                                            }
                                            bl = nV3 instanceof Long;
                                        }
                                        try {
                                            try {
                                                if (stringArray == null) break block89;
                                                if (!bl) break block90;
                                            }
                                            catch (b_0 b_025) {
                                                throw l_0.a(b_025);
                                            }
                                            return new CS(this.G.R((Long)((Object)nV3)));
                                        }
                                        catch (b_0 b_026) {
                                            throw l_0.a(b_026);
                                        }
                                    }
                                    bl = nV3 instanceof Float;
                                }
                                try {
                                    try {
                                        if (stringArray == null) break block91;
                                        if (!bl) break block92;
                                    }
                                    catch (b_0 b_027) {
                                        throw l_0.a(b_027);
                                    }
                                    return new cv_0(this.G.t(((Float)((Object)nV3)).floatValue()));
                                }
                                catch (b_0 b_028) {
                                    throw l_0.a(b_028);
                                }
                            }
                            bl = nV3 instanceof Double;
                        }
                        try {
                            try {
                                if (stringArray == null) break block93;
                                if (!bl) break block94;
                            }
                            catch (b_0 b_029) {
                                throw l_0.a(b_029);
                            }
                            return new ch_0(this.G.f((Double)((Object)nV3)));
                        }
                        catch (b_0 b_030) {
                            throw l_0.a(b_030);
                        }
                    }
                    bl = nV3 instanceof Character;
                }
                try {
                    try {
                        if (stringArray == null) break block95;
                        if (!bl) break block96;
                    }
                    catch (b_0 b_031) {
                        throw l_0.a(b_031);
                    }
                    return new CY(this.G.n(((Character)((Object)nV3)).charValue()));
                }
                catch (b_0 b_032) {
                    throw l_0.a(b_032);
                }
            }
            bl = nV3 instanceof String;
        }
        try {
            if (bl) {
                return new C9(this.G.H((String)((Object)nV3)));
            }
        }
        catch (b_0 b_033) {
            throw l_0.a(b_033);
        }
        throw new AssertionError(nV3);
    }

    public r_0 N(hV hV2) throws b_0 {
        hd_0 hd_02 = h_1.c(this.z, hV2.R());
        short s2 = this.G.H(hd_02.z());
        HashMap hashMap = new HashMap();
        hV2.q(new f8(this, hd_02, hashMap));
        return new v_0(s2, hashMap);
    }

    public r_0 v(RS rS) throws b_0 {
        r_0[] r_0Array = new r_0[rS.Y.length];
        String[] stringArray = RG.C();
        for (int i2 = 0; i2 < rS.Y.length; ++i2) {
            r_0Array[i2] = h_1.W(this.z, rS.Y[i2], this.G, false);
            if (stringArray != null) continue;
        }
        return new M(r_0Array);
    }

    @Override
    public Object C(RS rS) throws Throwable {
        return this.v(rS);
    }

    @Override
    public Object G(hV hV2) throws Throwable {
        return this.N(hV2);
    }

    @Override
    public Object t(NV nV2) throws Throwable {
        return this.z(nV2);
    }

    private static b_0 a(b_0 b_02) {
        return b_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "\u008c\u0088\u00a3\u001a\u00e9\u00feP\u00b5\f\u0010\u00d9\u00d5\u00be\u00fd\u009b\u00cc2Q\u0086gi\r0\u0099A\u0085\\\u00e2D\u00d2)\u008c\u0091G\u00d9\u00d0xq'\u00abQ\u0081\u0083\u0093\u00d9\u0084H\u000f\u00ceP6\u00a2\u00ed\u0017}W\u00dfs\u00b0\u00ab\u00fa\u00e4\u008f\u00c9\u0091\u00a2\f|\u00f9\u0007\u00fe\u00aa\u0012\u00e7\u00ef\u0084\u0082\u00a5I0\b\u00ef\u00f8\u0081es\u00c0or+\u00f0";
            var4_3 = "\u008c\u0088\u00a3\u001a\u00e9\u00feP\u00b5\f\u0010\u00d9\u00d5\u00be\u00fd\u009b\u00cc2Q\u0086gi\r0\u0099A\u0085\\\u00e2D\u00d2)\u008c\u0091G\u00d9\u00d0xq'\u00abQ\u0081\u0083\u0093\u00d9\u0084H\u000f\u00ceP6\u00a2\u00ed\u0017}W\u00dfs\u00b0\u00ab\u00fa\u00e4\u008f\u00c9\u0091\u00a2\f|\u00f9\u0007\u00fe\u00aa\u0012\u00e7\u00ef\u0084\u0082\u00a5I0\b\u00ef\u00f8\u0081es\u00c0or+\u00f0".length();
            var1_4 = 30;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 41;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 56;
                            break;
                        }
                        case 1: {
                            v11 = 33;
                            break;
                        }
                        case 2: {
                            v11 = 54;
                            break;
                        }
                        case 3: {
                            v11 = 116;
                            break;
                        }
                        case 4: {
                            v11 = 51;
                            break;
                        }
                        case 5: {
                            v11 = 76;
                            break;
                        }
                        default: {
                            v11 = 76;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
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
            } while (v6 > var6_6);
            ** while (true)
        }
        l_0.a = var5;
        l_0.b = new String[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFEA0D) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 219;
                    break;
                }
                case 1: {
                    n14 = 55;
                    break;
                }
                case 2: {
                    n14 = 24;
                    break;
                }
                case 3: {
                    n14 = 138;
                    break;
                }
                case 4: {
                    n14 = 94;
                    break;
                }
                case 5: {
                    n14 = 122;
                    break;
                }
                case 6: {
                    n14 = 190;
                    break;
                }
                case 7: {
                    n14 = 157;
                    break;
                }
                case 8: {
                    n14 = 184;
                    break;
                }
                case 9: {
                    n14 = 167;
                    break;
                }
                case 10: {
                    n14 = 4;
                    break;
                }
                case 11: {
                    n14 = 207;
                    break;
                }
                case 12: {
                    n14 = 211;
                    break;
                }
                case 13: {
                    n14 = 40;
                    break;
                }
                case 14: {
                    n14 = 181;
                    break;
                }
                case 15: {
                    n14 = 17;
                    break;
                }
                case 16: {
                    n14 = 130;
                    break;
                }
                case 17: {
                    n14 = 171;
                    break;
                }
                case 18: {
                    n14 = 202;
                    break;
                }
                case 19: {
                    n14 = 201;
                    break;
                }
                case 20: {
                    n14 = 46;
                    break;
                }
                case 21: {
                    n14 = 113;
                    break;
                }
                case 22: {
                    n14 = 56;
                    break;
                }
                case 23: {
                    n14 = 11;
                    break;
                }
                case 24: {
                    n14 = 65;
                    break;
                }
                case 25: {
                    n14 = 126;
                    break;
                }
                case 26: {
                    n14 = 225;
                    break;
                }
                case 27: {
                    n14 = 243;
                    break;
                }
                case 28: {
                    n14 = 199;
                    break;
                }
                case 29: {
                    n14 = 206;
                    break;
                }
                case 30: {
                    n14 = 89;
                    break;
                }
                case 31: {
                    n14 = 194;
                    break;
                }
                case 32: {
                    n14 = 57;
                    break;
                }
                case 33: {
                    n14 = 129;
                    break;
                }
                case 34: {
                    n14 = 43;
                    break;
                }
                case 35: {
                    n14 = 31;
                    break;
                }
                case 36: {
                    n14 = 13;
                    break;
                }
                case 37: {
                    n14 = 26;
                    break;
                }
                case 38: {
                    n14 = 164;
                    break;
                }
                case 39: {
                    n14 = 87;
                    break;
                }
                case 40: {
                    n14 = 248;
                    break;
                }
                case 41: {
                    n14 = 92;
                    break;
                }
                case 42: {
                    n14 = 50;
                    break;
                }
                case 43: {
                    n14 = 102;
                    break;
                }
                case 44: {
                    n14 = 149;
                    break;
                }
                case 45: {
                    n14 = 25;
                    break;
                }
                case 46: {
                    n14 = 212;
                    break;
                }
                case 47: {
                    n14 = 85;
                    break;
                }
                case 48: {
                    n14 = 32;
                    break;
                }
                case 49: {
                    n14 = 44;
                    break;
                }
                case 50: {
                    n14 = 198;
                    break;
                }
                case 51: {
                    n14 = 15;
                    break;
                }
                case 52: {
                    n14 = 28;
                    break;
                }
                case 53: {
                    n14 = 245;
                    break;
                }
                case 54: {
                    n14 = 70;
                    break;
                }
                case 55: {
                    n14 = 241;
                    break;
                }
                case 56: {
                    n14 = 182;
                    break;
                }
                case 57: {
                    n14 = 142;
                    break;
                }
                case 58: {
                    n14 = 214;
                    break;
                }
                case 59: {
                    n14 = 53;
                    break;
                }
                case 60: {
                    n14 = 237;
                    break;
                }
                case 61: {
                    n14 = 195;
                    break;
                }
                case 62: {
                    n14 = 152;
                    break;
                }
                case 63: {
                    n14 = 7;
                    break;
                }
                case 64: {
                    n14 = 223;
                    break;
                }
                case 65: {
                    n14 = 21;
                    break;
                }
                case 66: {
                    n14 = 252;
                    break;
                }
                case 67: {
                    n14 = 104;
                    break;
                }
                case 68: {
                    n14 = 255;
                    break;
                }
                case 69: {
                    n14 = 137;
                    break;
                }
                case 70: {
                    n14 = 185;
                    break;
                }
                case 71: {
                    n14 = 100;
                    break;
                }
                case 72: {
                    n14 = 128;
                    break;
                }
                case 73: {
                    n14 = 103;
                    break;
                }
                case 74: {
                    n14 = 112;
                    break;
                }
                case 75: {
                    n14 = 160;
                    break;
                }
                case 76: {
                    n14 = 39;
                    break;
                }
                case 77: {
                    n14 = 183;
                    break;
                }
                case 78: {
                    n14 = 19;
                    break;
                }
                case 79: {
                    n14 = 132;
                    break;
                }
                case 80: {
                    n14 = 67;
                    break;
                }
                case 81: {
                    n14 = 141;
                    break;
                }
                case 82: {
                    n14 = 76;
                    break;
                }
                case 83: {
                    n14 = 165;
                    break;
                }
                case 84: {
                    n14 = 220;
                    break;
                }
                case 85: {
                    n14 = 98;
                    break;
                }
                case 86: {
                    n14 = 124;
                    break;
                }
                case 87: {
                    n14 = 180;
                    break;
                }
                case 88: {
                    n14 = 18;
                    break;
                }
                case 89: {
                    n14 = 68;
                    break;
                }
                case 90: {
                    n14 = 74;
                    break;
                }
                case 91: {
                    n14 = 170;
                    break;
                }
                case 92: {
                    n14 = 9;
                    break;
                }
                case 93: {
                    n14 = 168;
                    break;
                }
                case 94: {
                    n14 = 95;
                    break;
                }
                case 95: {
                    n14 = 81;
                    break;
                }
                case 96: {
                    n14 = 5;
                    break;
                }
                case 97: {
                    n14 = 88;
                    break;
                }
                case 98: {
                    n14 = 133;
                    break;
                }
                case 99: {
                    n14 = 135;
                    break;
                }
                case 100: {
                    n14 = 224;
                    break;
                }
                case 101: {
                    n14 = 246;
                    break;
                }
                case 102: {
                    n14 = 242;
                    break;
                }
                case 103: {
                    n14 = 254;
                    break;
                }
                case 104: {
                    n14 = 84;
                    break;
                }
                case 105: {
                    n14 = 134;
                    break;
                }
                case 106: {
                    n14 = 119;
                    break;
                }
                case 107: {
                    n14 = 34;
                    break;
                }
                case 108: {
                    n14 = 187;
                    break;
                }
                case 109: {
                    n14 = 238;
                    break;
                }
                case 110: {
                    n14 = 143;
                    break;
                }
                case 111: {
                    n14 = 73;
                    break;
                }
                case 112: {
                    n14 = 200;
                    break;
                }
                case 113: {
                    n14 = 47;
                    break;
                }
                case 114: {
                    n14 = 110;
                    break;
                }
                case 115: {
                    n14 = 161;
                    break;
                }
                case 116: {
                    n14 = 153;
                    break;
                }
                case 117: {
                    n14 = 93;
                    break;
                }
                case 118: {
                    n14 = 29;
                    break;
                }
                case 119: {
                    n14 = 54;
                    break;
                }
                case 120: {
                    n14 = 62;
                    break;
                }
                case 121: {
                    n14 = 150;
                    break;
                }
                case 122: {
                    n14 = 209;
                    break;
                }
                case 123: {
                    n14 = 148;
                    break;
                }
                case 124: {
                    n14 = 48;
                    break;
                }
                case 125: {
                    n14 = 235;
                    break;
                }
                case 126: {
                    n14 = 38;
                    break;
                }
                case 127: {
                    n14 = 16;
                    break;
                }
                case 128: {
                    n14 = 106;
                    break;
                }
                case 129: {
                    n14 = 20;
                    break;
                }
                case 130: {
                    n14 = 37;
                    break;
                }
                case 131: {
                    n14 = 192;
                    break;
                }
                case 132: {
                    n14 = 147;
                    break;
                }
                case 133: {
                    n14 = 169;
                    break;
                }
                case 134: {
                    n14 = 222;
                    break;
                }
                case 135: {
                    n14 = 108;
                    break;
                }
                case 136: {
                    n14 = 66;
                    break;
                }
                case 137: {
                    n14 = 49;
                    break;
                }
                case 138: {
                    n14 = 111;
                    break;
                }
                case 139: {
                    n14 = 249;
                    break;
                }
                case 140: {
                    n14 = 154;
                    break;
                }
                case 141: {
                    n14 = 145;
                    break;
                }
                case 142: {
                    n14 = 203;
                    break;
                }
                case 143: {
                    n14 = 22;
                    break;
                }
                case 144: {
                    n14 = 12;
                    break;
                }
                case 145: {
                    n14 = 109;
                    break;
                }
                case 146: {
                    n14 = 217;
                    break;
                }
                case 147: {
                    n14 = 253;
                    break;
                }
                case 148: {
                    n14 = 156;
                    break;
                }
                case 149: {
                    n14 = 162;
                    break;
                }
                case 150: {
                    n14 = 91;
                    break;
                }
                case 151: {
                    n14 = 120;
                    break;
                }
                case 152: {
                    n14 = 101;
                    break;
                }
                case 153: {
                    n14 = 174;
                    break;
                }
                case 154: {
                    n14 = 69;
                    break;
                }
                case 155: {
                    n14 = 213;
                    break;
                }
                case 156: {
                    n14 = 79;
                    break;
                }
                case 157: {
                    n14 = 136;
                    break;
                }
                case 158: {
                    n14 = 189;
                    break;
                }
                case 159: {
                    n14 = 163;
                    break;
                }
                case 160: {
                    n14 = 188;
                    break;
                }
                case 161: {
                    n14 = 173;
                    break;
                }
                case 162: {
                    n14 = 72;
                    break;
                }
                case 163: {
                    n14 = 116;
                    break;
                }
                case 164: {
                    n14 = 107;
                    break;
                }
                case 165: {
                    n14 = 227;
                    break;
                }
                case 166: {
                    n14 = 131;
                    break;
                }
                case 167: {
                    n14 = 216;
                    break;
                }
                case 168: {
                    n14 = 115;
                    break;
                }
                case 169: {
                    n14 = 1;
                    break;
                }
                case 170: {
                    n14 = 59;
                    break;
                }
                case 171: {
                    n14 = 144;
                    break;
                }
                case 172: {
                    n14 = 0;
                    break;
                }
                case 173: {
                    n14 = 178;
                    break;
                }
                case 174: {
                    n14 = 63;
                    break;
                }
                case 175: {
                    n14 = 228;
                    break;
                }
                case 176: {
                    n14 = 197;
                    break;
                }
                case 177: {
                    n14 = 234;
                    break;
                }
                case 178: {
                    n14 = 155;
                    break;
                }
                case 179: {
                    n14 = 179;
                    break;
                }
                case 180: {
                    n14 = 2;
                    break;
                }
                case 181: {
                    n14 = 166;
                    break;
                }
                case 182: {
                    n14 = 239;
                    break;
                }
                case 183: {
                    n14 = 35;
                    break;
                }
                case 184: {
                    n14 = 41;
                    break;
                }
                case 185: {
                    n14 = 8;
                    break;
                }
                case 186: {
                    n14 = 251;
                    break;
                }
                case 187: {
                    n14 = 176;
                    break;
                }
                case 188: {
                    n14 = 236;
                    break;
                }
                case 189: {
                    n14 = 60;
                    break;
                }
                case 190: {
                    n14 = 14;
                    break;
                }
                case 191: {
                    n14 = 240;
                    break;
                }
                case 192: {
                    n14 = 140;
                    break;
                }
                case 193: {
                    n14 = 125;
                    break;
                }
                case 194: {
                    n14 = 146;
                    break;
                }
                case 195: {
                    n14 = 99;
                    break;
                }
                case 196: {
                    n14 = 230;
                    break;
                }
                case 197: {
                    n14 = 80;
                    break;
                }
                case 198: {
                    n14 = 86;
                    break;
                }
                case 199: {
                    n14 = 52;
                    break;
                }
                case 200: {
                    n14 = 75;
                    break;
                }
                case 201: {
                    n14 = 247;
                    break;
                }
                case 202: {
                    n14 = 97;
                    break;
                }
                case 203: {
                    n14 = 172;
                    break;
                }
                case 204: {
                    n14 = 123;
                    break;
                }
                case 205: {
                    n14 = 90;
                    break;
                }
                case 206: {
                    n14 = 221;
                    break;
                }
                case 207: {
                    n14 = 6;
                    break;
                }
                case 208: {
                    n14 = 114;
                    break;
                }
                case 209: {
                    n14 = 105;
                    break;
                }
                case 210: {
                    n14 = 3;
                    break;
                }
                case 211: {
                    n14 = 159;
                    break;
                }
                case 212: {
                    n14 = 191;
                    break;
                }
                case 213: {
                    n14 = 215;
                    break;
                }
                case 214: {
                    n14 = 64;
                    break;
                }
                case 215: {
                    n14 = 193;
                    break;
                }
                case 216: {
                    n14 = 58;
                    break;
                }
                case 217: {
                    n14 = 36;
                    break;
                }
                case 218: {
                    n14 = 233;
                    break;
                }
                case 219: {
                    n14 = 208;
                    break;
                }
                case 220: {
                    n14 = 27;
                    break;
                }
                case 221: {
                    n14 = 33;
                    break;
                }
                case 222: {
                    n14 = 118;
                    break;
                }
                case 223: {
                    n14 = 151;
                    break;
                }
                case 224: {
                    n14 = 61;
                    break;
                }
                case 225: {
                    n14 = 83;
                    break;
                }
                case 226: {
                    n14 = 42;
                    break;
                }
                case 227: {
                    n14 = 226;
                    break;
                }
                case 228: {
                    n14 = 205;
                    break;
                }
                case 229: {
                    n14 = 175;
                    break;
                }
                case 230: {
                    n14 = 210;
                    break;
                }
                case 231: {
                    n14 = 30;
                    break;
                }
                case 232: {
                    n14 = 77;
                    break;
                }
                case 233: {
                    n14 = 250;
                    break;
                }
                case 234: {
                    n14 = 158;
                    break;
                }
                case 235: {
                    n14 = 10;
                    break;
                }
                case 236: {
                    n14 = 96;
                    break;
                }
                case 237: {
                    n14 = 45;
                    break;
                }
                case 238: {
                    n14 = 231;
                    break;
                }
                case 239: {
                    n14 = 229;
                    break;
                }
                case 240: {
                    n14 = 244;
                    break;
                }
                case 241: {
                    n14 = 23;
                    break;
                }
                case 242: {
                    n14 = 51;
                    break;
                }
                case 243: {
                    n14 = 121;
                    break;
                }
                case 244: {
                    n14 = 186;
                    break;
                }
                case 245: {
                    n14 = 117;
                    break;
                }
                case 246: {
                    n14 = 204;
                    break;
                }
                case 247: {
                    n14 = 127;
                    break;
                }
                case 248: {
                    n14 = 232;
                    break;
                }
                case 249: {
                    n14 = 196;
                    break;
                }
                case 250: {
                    n14 = 218;
                    break;
                }
                case 251: {
                    n14 = 139;
                    break;
                }
                case 252: {
                    n14 = 78;
                    break;
                }
                case 253: {
                    n14 = 82;
                    break;
                }
                case 254: {
                    n14 = 71;
                    break;
                }
                default: {
                    n14 = 177;
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
            l_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

