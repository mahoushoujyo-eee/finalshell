/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E6;
import com.IG;
import com.TH;
import com.X4;
import com.ep_2;
import com.hi_0;
import com.ky_2;
import com.ph_0;
import com.uT;
import com.yn_2;
import com.zS;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/*
 * Renamed from com.ub
 */
public class ub_0
extends uT {
    protected X4 I;
    protected boolean z;
    private static final String[] c;
    private static final String[] d;
    private static final long e;

    public ub_0(IG iG, Class clazz, ph_0 ph_02) {
        block7: {
            boolean bl;
            block10: {
                block9: {
                    Class clazz2;
                    block8: {
                        E6 e6;
                        ky_2[] ky_2Array;
                        block6: {
                            ky_2[] ky_2Array2 = zS.p();
                            super(clazz, ph_02);
                            ky_2Array = ky_2Array2;
                            this.z = false;
                            E6 e62 = ph_02.Z();
                            try {
                                e6 = e62;
                                if (ky_2Array != null) break block6;
                                if (e6 == null) break block7;
                            }
                            catch (hi_0 hi_02) {
                                throw ub_0.a(hi_02);
                            }
                            e6 = e62;
                        }
                        Class clazz3 = e6.K();
                        try {
                            ub_0 ub_02 = this;
                            clazz2 = clazz3;
                            if (ky_2Array != null) break block8;
                            if (clazz2 == null) break block9;
                        }
                        catch (hi_0 hi_03) {
                            throw ub_0.a(hi_03);
                        }
                        clazz2 = clazz3;
                    }
                    try {
                        if (clazz2 == Void.class) break block9;
                        bl = true;
                        break block10;
                    }
                    catch (hi_0 hi_04) {
                        throw ub_0.a(hi_04);
                    }
                }
                bl = false;
            }
            ub_02.z = bl;
        }
    }

    /*
     * Unable to fully structure code
     */
    public X4 k(IG var1_1) {
        block14: {
            block15: {
                block17: {
                    block16: {
                        var2_2 = zS.p();
                        try {
                            v0 = this.I;
                            if (var2_2 != null) break block14;
                            if (v0 != null) break block15;
                        }
                        catch (Exception v1) {
                            throw ub_0.a(v1);
                        }
                        var3_3 = this.p.Z();
                        try {
                            v2 = var3_3;
                            if (var2_2 != null) break block16;
                            if (v2 != null) {
                            }
                            ** GOTO lbl42
                        }
                        catch (Exception v3) {
                            throw ub_0.a(v3);
                        }
                        v2 = var3_3;
                    }
                    v4 = v2.K();
                    if (var2_2 != null) break block17;
                    try {
                        block18: {
                            if (v4 == Void.class) ** GOTO lbl42
                            break block18;
                            catch (Exception v5) {
                                throw ub_0.a(v5);
                            }
                        }
                        v4 = var3_3.K();
                    }
                    catch (Exception v6) {
                        throw ub_0.a(v6);
                    }
                }
                var4_4 = v4;
                try {
                    this.I = (X4)var4_4.newInstance();
                }
                catch (Exception var5_5) {
                    throw new hi_0(ub_0.b(-16838, -9987), var5_5);
                }
                try {
                    if (var2_2 == null) break block15;
lbl42:
                    // 3 sources

                    this.I = var1_1.p(this.p.O, this.p.a);
                }
                catch (Exception v7) {
                    throw ub_0.a(v7);
                }
            }
            v0 = this.I;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void y(yn_2 var1_1, Object var2_2, Type var3_3, Map var4_4) {
        block82: {
            block83: {
                block81: {
                    block78: {
                        block79: {
                            block80: {
                                block93: {
                                    block94: {
                                        block92: {
                                            block91: {
                                                block75: {
                                                    block77: {
                                                        block89: {
                                                            block76: {
                                                                block74: {
                                                                    block73: {
                                                                        block86: {
                                                                            block68: {
                                                                                block69: {
                                                                                    block72: {
                                                                                        block71: {
                                                                                            block70: {
                                                                                                block66: {
                                                                                                    block67: {
                                                                                                        var5_5 = zS.p();
                                                                                                        v0 = this.I;
                                                                                                        if (var5_5 != null) break block66;
                                                                                                        try {
                                                                                                            block84: {
                                                                                                                if (v0 != null) break block67;
                                                                                                                break block84;
                                                                                                                catch (IOException v1) {
                                                                                                                    throw ub_0.a(v1);
                                                                                                                }
                                                                                                            }
                                                                                                            this.k(var1_1.L());
                                                                                                        }
                                                                                                        catch (IOException v2) {
                                                                                                            throw ub_0.a(v2);
                                                                                                        }
                                                                                                    }
                                                                                                    v0 = this.I;
                                                                                                }
                                                                                                var6_6 = v0;
                                                                                                var7_7 = this.p.a;
                                                                                                try {
                                                                                                    v3 = var3_3 instanceof ParameterizedType;
                                                                                                    if (var5_5 != null) break block68;
                                                                                                    if (v3 == 0) break block69;
                                                                                                }
                                                                                                catch (IOException v4) {
                                                                                                    throw ub_0.a(v4);
                                                                                                }
                                                                                                var8_8 = var1_1.A();
                                                                                                try {
                                                                                                    v5 = var8_8;
                                                                                                    if (var5_5 != null) break block70;
                                                                                                    if (v5 == null) break block71;
                                                                                                }
                                                                                                catch (IOException v6) {
                                                                                                    throw ub_0.a(v6);
                                                                                                }
                                                                                                v5 = var8_8;
                                                                                            }
                                                                                            v5.F = var3_3;
                                                                                        }
                                                                                        v7 = var7_7;
                                                                                        if (var5_5 != null) break block72;
                                                                                        try {
                                                                                            block85: {
                                                                                                if (v7 == var3_3) break block69;
                                                                                                break block85;
                                                                                                catch (IOException v8) {
                                                                                                    throw ub_0.a(v8);
                                                                                                }
                                                                                            }
                                                                                            v7 = ph_0.O(this.w, var3_3, var7_7);
                                                                                        }
                                                                                        catch (IOException v9) {
                                                                                            throw ub_0.a(v9);
                                                                                        }
                                                                                    }
                                                                                    var7_7 = v7;
                                                                                    try {
                                                                                        v3 = var6_6 instanceof TH;
                                                                                        if (var5_5 != null) break block68;
                                                                                        if (v3 == 0) break block69;
                                                                                    }
                                                                                    catch (IOException v10) {
                                                                                        throw ub_0.a(v10);
                                                                                    }
                                                                                    var6_6 = var1_1.L().h(var7_7);
                                                                                }
                                                                                v3 = var6_6 instanceof ep_2;
                                                                            }
                                                                            if (var5_5 != null) break block73;
                                                                            if (v3 == 0) ** GOTO lbl91
                                                                            break block86;
                                                                            catch (IOException v11) {
                                                                                throw ub_0.a(v11);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block87: {
                                                                                v12 = this.p;
                                                                                if (var5_5 != null) break block74;
                                                                                break block87;
                                                                                catch (IOException v13) {
                                                                                    throw ub_0.a(v13);
                                                                                }
                                                                            }
                                                                            v3 = v12.h;
                                                                        }
                                                                        catch (IOException v14) {
                                                                            throw ub_0.a(v14);
                                                                        }
                                                                    }
                                                                    if (v3 == 0) ** GOTO lbl91
                                                                    var9_9 = (ep_2)var6_6;
                                                                    var8_8 = var9_9.m(var1_1, var7_7, this.p.I, this.p.h);
                                                                    try {
                                                                        if (var5_5 == null) break block75;
lbl91:
                                                                        // 3 sources

                                                                        v12 = this.p;
                                                                    }
                                                                    catch (IOException v15) {
                                                                        throw ub_0.a(v15);
                                                                    }
                                                                }
                                                                if (var5_5 != null) break block76;
                                                                try {
                                                                    block88: {
                                                                        if (v12.J != null) ** GOTO lbl116
                                                                        break block88;
                                                                        catch (IOException v16) {
                                                                            throw ub_0.a(v16);
                                                                        }
                                                                    }
                                                                    v12 = this.p;
                                                                }
                                                                catch (IOException v17) {
                                                                    throw ub_0.a(v17);
                                                                }
                                                            }
                                                            if (var5_5 != null) break block77;
                                                            if (v12.h == 0) ** GOTO lbl132
                                                            break block89;
                                                            catch (IOException v18) {
                                                                throw ub_0.a(v18);
                                                            }
                                                        }
                                                        try {
                                                            block90: {
                                                                v12 = var6_6;
                                                                if (var5_5 != null) break block77;
                                                                break block90;
                                                                catch (IOException v19) {
                                                                    throw ub_0.a(v19);
                                                                }
                                                            }
                                                            if (v12 instanceof zS) {
                                                            }
                                                            ** GOTO lbl132
                                                        }
                                                        catch (IOException v20) {
                                                            throw ub_0.a(v20);
                                                        }
                                                        var8_8 = ((zS)var6_6).p(var1_1, var7_7, this.p.I, this.p.J, this.p.h);
                                                        try {
                                                            if (var5_5 == null) break block75;
lbl132:
                                                            // 3 sources

                                                            v12 = var6_6.z(var1_1, var7_7, this.p.I);
                                                        }
                                                        catch (IOException v21) {
                                                            throw ub_0.a(v21);
                                                        }
                                                    }
                                                    var8_8 = v12;
                                                }
                                                v22 = var8_8 instanceof byte[];
                                                if (var5_5 != null) break block78;
                                                if (v22 == 0) break block79;
                                                break block91;
                                                catch (IOException v23) {
                                                    throw ub_0.a(v23);
                                                }
                                            }
                                            v24 = ub_0.b(-16839, 27956);
                                            if (var5_5 != null) break block80;
                                            break block92;
                                            catch (IOException v25) {
                                                throw ub_0.a(v25);
                                            }
                                        }
                                        if (v24.equals(this.p.J)) break block93;
                                        break block94;
                                        catch (IOException v26) {
                                            throw ub_0.a(v26);
                                        }
                                    }
                                    try {
                                        block95: {
                                            v22 = (int)ub_0.b(-16837, -19776).equals(this.p.J);
                                            if (var5_5 != null) break block78;
                                            break block95;
                                            catch (IOException v27) {
                                                throw ub_0.a(v27);
                                            }
                                        }
                                        if (v22 == 0) break block79;
                                    }
                                    catch (IOException v28) {
                                        throw ub_0.a(v28);
                                    }
                                }
                                v24 = var8_8;
                            }
                            var9_9 = (byte[])v24;
                            var10_10 = null;
                            try {
                                var10_10 = new GZIPInputStream(new ByteArrayInputStream((byte[])var9_9));
                                var11_11 = new ByteArrayOutputStream();
                                while (true) {
                                    block96: {
                                        if ((var13_14 = var10_10.read(var12_13 = new byte[(int)ub_0.e])) != -1) ** GOTO lbl189
                                        if (var5_5 != null) continue;
                                        if (var5_5 == null) break;
                                        break block96;
                                        catch (IOException v29) {
                                            throw ub_0.a(v29);
                                        }
                                    }
                                    try {
                                        block97: {
                                            if (var13_14 <= 0) continue;
                                            break block97;
                                            catch (IOException v30) {
                                                throw ub_0.a(v30);
                                            }
                                        }
                                        var11_11.write(var12_13, 0, var13_14);
                                        continue;
                                    }
                                    catch (IOException v31) {
                                        throw ub_0.a(v31);
                                    }
                                    if (var5_5 == null) continue;
                                    break;
                                }
                                var8_8 = var11_11.toByteArray();
                            }
                            catch (IOException var11_12) {
                                throw new hi_0(ub_0.b(-16840, 3828), var11_12);
                            }
                        }
                        try {
                            v32 = var1_1;
                            if (var5_5 != null) break block81;
                            v22 = v32.O();
                        }
                        catch (IOException v33) {
                            throw ub_0.a(v33);
                        }
                    }
                    if (v22 != 1) ** GOTO lbl221
                    var9_9 = var1_1.C();
                    try {
                        var9_9.i = this;
                        var9_9.m = var1_1.A();
                        var1_1.l(0);
                        if (var5_5 == null) break block82;
lbl221:
                        // 2 sources

                        v32 = var2_2;
                    }
                    catch (IOException v34) {
                        throw ub_0.a(v34);
                    }
                }
                try {
                    try {
                        if (var5_5 != null) break block83;
                        if (v32 == null) {
                        }
                        ** GOTO lbl241
                    }
                    catch (IOException v35) {
                        throw ub_0.a(v35);
                    }
                    v32 = var4_4.put(this.p.I, var8_8);
                }
                catch (IOException v36) {
                    throw ub_0.a(v36);
                }
            }
            try {
                if (var5_5 == null) break block82;
lbl241:
                // 2 sources

                this.D(var2_2, var8_8);
            }
            catch (IOException v37) {
                throw ub_0.a(v37);
            }
        }
    }

    @Override
    public int f() {
        block5: {
            X4 x42;
            block4: {
                ky_2[] ky_2Array = zS.p();
                try {
                    try {
                        x42 = this.I;
                        if (ky_2Array != null) break block4;
                        if (x42 == null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw ub_0.a(hi_02);
                    }
                    x42 = this.I;
                }
                catch (hi_0 hi_03) {
                    throw ub_0.a(hi_03);
                }
            }
            return x42.j();
        }
        return 2;
    }

    public void O(yn_2 yn_22, Object object, Type type, Map map) {
        throw new hi_0(ub_0.b(-16833, 24254));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[5];
                    var5_1 = 0;
                    var4_2 = "6\u001f\u001a\r\u009b\u0081\u0083\u00fe\u00c4\u00ca\u00ce0\u00b3\u00b9\"\u00c1I,\u00cb\u00bb\u00a4\u00d2\u0093\u0085\u00ee\u00d5f\u0002i\u00ca\u00fd\u00df\u0011\u001b\u009d\u00de\u00dc-k\u00d6\u00ba\u00fb\"KK\u00f9>\f\u0006\u0097O\u00d9\u00f4D\u00e4M\u00f4\u00b9}E\u0004s\u0013\u00b2\u008c";
                    var6_3 = "6\u001f\u001a\r\u009b\u0081\u0083\u00fe\u00c4\u00ca\u00ce0\u00b3\u00b9\"\u00c1I,\u00cb\u00bb\u00a4\u00d2\u0093\u0085\u00ee\u00d5f\u0002i\u00ca\u00fd\u00df\u0011\u001b\u009d\u00de\u00dc-k\u00d6\u00ba\u00fb\"KK\u00f9>\f\u0006\u0097O\u00d9\u00f4D\u00e4M\u00f4\u00b9}E\u0004s\u0013\u00b2\u008c".length();
                    var3_4 = 11;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 44;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "}\u00ca\\T\u0012\u00be\nu\u00eb\u00cf3\u00ccN\u009b\u008d\u00d0\u00adq\u0004-\u00d0m4";
                        var6_3 = "}\u00ca\\T\u0012\u00be\nu\u00eb\u00cf3\u00ccN\u009b\u008d\u00d0\u00adq\u0004-\u00d0m4".length();
                        var3_4 = 18;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 76;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 61;
                                break;
                            }
                            case 1: {
                                v15 = 123;
                                break;
                            }
                            case 2: {
                                v15 = 48;
                                break;
                            }
                            case 3: {
                                v15 = 109;
                                break;
                            }
                            case 4: {
                                v15 = 31;
                                break;
                            }
                            case 5: {
                                v15 = 56;
                                break;
                            }
                            default: {
                                v15 = 114;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            ub_0.c = var7;
            ub_0.d = new String[5];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 829322512580329991L;
        ** while (true)
        ub_0.e = 5935226891590288903L ^ var0_7;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFBE3B) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 202;
                    break;
                }
                case 1: {
                    n14 = 69;
                    break;
                }
                case 2: {
                    n14 = 199;
                    break;
                }
                case 3: {
                    n14 = 49;
                    break;
                }
                case 4: {
                    n14 = 223;
                    break;
                }
                case 5: {
                    n14 = 253;
                    break;
                }
                case 6: {
                    n14 = 250;
                    break;
                }
                case 7: {
                    n14 = 157;
                    break;
                }
                case 8: {
                    n14 = 34;
                    break;
                }
                case 9: {
                    n14 = 216;
                    break;
                }
                case 10: {
                    n14 = 32;
                    break;
                }
                case 11: {
                    n14 = 0;
                    break;
                }
                case 12: {
                    n14 = 123;
                    break;
                }
                case 13: {
                    n14 = 124;
                    break;
                }
                case 14: {
                    n14 = 48;
                    break;
                }
                case 15: {
                    n14 = 39;
                    break;
                }
                case 16: {
                    n14 = 118;
                    break;
                }
                case 17: {
                    n14 = 197;
                    break;
                }
                case 18: {
                    n14 = 19;
                    break;
                }
                case 19: {
                    n14 = 201;
                    break;
                }
                case 20: {
                    n14 = 65;
                    break;
                }
                case 21: {
                    n14 = 142;
                    break;
                }
                case 22: {
                    n14 = 63;
                    break;
                }
                case 23: {
                    n14 = 227;
                    break;
                }
                case 24: {
                    n14 = 86;
                    break;
                }
                case 25: {
                    n14 = 206;
                    break;
                }
                case 26: {
                    n14 = 130;
                    break;
                }
                case 27: {
                    n14 = 176;
                    break;
                }
                case 28: {
                    n14 = 74;
                    break;
                }
                case 29: {
                    n14 = 200;
                    break;
                }
                case 30: {
                    n14 = 213;
                    break;
                }
                case 31: {
                    n14 = 68;
                    break;
                }
                case 32: {
                    n14 = 191;
                    break;
                }
                case 33: {
                    n14 = 252;
                    break;
                }
                case 34: {
                    n14 = 155;
                    break;
                }
                case 35: {
                    n14 = 35;
                    break;
                }
                case 36: {
                    n14 = 173;
                    break;
                }
                case 37: {
                    n14 = 220;
                    break;
                }
                case 38: {
                    n14 = 198;
                    break;
                }
                case 39: {
                    n14 = 128;
                    break;
                }
                case 40: {
                    n14 = 255;
                    break;
                }
                case 41: {
                    n14 = 239;
                    break;
                }
                case 42: {
                    n14 = 134;
                    break;
                }
                case 43: {
                    n14 = 245;
                    break;
                }
                case 44: {
                    n14 = 31;
                    break;
                }
                case 45: {
                    n14 = 58;
                    break;
                }
                case 46: {
                    n14 = 9;
                    break;
                }
                case 47: {
                    n14 = 21;
                    break;
                }
                case 48: {
                    n14 = 87;
                    break;
                }
                case 49: {
                    n14 = 244;
                    break;
                }
                case 50: {
                    n14 = 41;
                    break;
                }
                case 51: {
                    n14 = 66;
                    break;
                }
                case 52: {
                    n14 = 172;
                    break;
                }
                case 53: {
                    n14 = 205;
                    break;
                }
                case 54: {
                    n14 = 228;
                    break;
                }
                case 55: {
                    n14 = 85;
                    break;
                }
                case 56: {
                    n14 = 126;
                    break;
                }
                case 57: {
                    n14 = 247;
                    break;
                }
                case 58: {
                    n14 = 12;
                    break;
                }
                case 59: {
                    n14 = 3;
                    break;
                }
                case 60: {
                    n14 = 37;
                    break;
                }
                case 61: {
                    n14 = 80;
                    break;
                }
                case 62: {
                    n14 = 96;
                    break;
                }
                case 63: {
                    n14 = 95;
                    break;
                }
                case 64: {
                    n14 = 241;
                    break;
                }
                case 65: {
                    n14 = 82;
                    break;
                }
                case 66: {
                    n14 = 222;
                    break;
                }
                case 67: {
                    n14 = 57;
                    break;
                }
                case 68: {
                    n14 = 188;
                    break;
                }
                case 69: {
                    n14 = 180;
                    break;
                }
                case 70: {
                    n14 = 229;
                    break;
                }
                case 71: {
                    n14 = 224;
                    break;
                }
                case 72: {
                    n14 = 7;
                    break;
                }
                case 73: {
                    n14 = 218;
                    break;
                }
                case 74: {
                    n14 = 219;
                    break;
                }
                case 75: {
                    n14 = 14;
                    break;
                }
                case 76: {
                    n14 = 204;
                    break;
                }
                case 77: {
                    n14 = 167;
                    break;
                }
                case 78: {
                    n14 = 181;
                    break;
                }
                case 79: {
                    n14 = 111;
                    break;
                }
                case 80: {
                    n14 = 119;
                    break;
                }
                case 81: {
                    n14 = 139;
                    break;
                }
                case 82: {
                    n14 = 203;
                    break;
                }
                case 83: {
                    n14 = 2;
                    break;
                }
                case 84: {
                    n14 = 150;
                    break;
                }
                case 85: {
                    n14 = 78;
                    break;
                }
                case 86: {
                    n14 = 114;
                    break;
                }
                case 87: {
                    n14 = 159;
                    break;
                }
                case 88: {
                    n14 = 120;
                    break;
                }
                case 89: {
                    n14 = 20;
                    break;
                }
                case 90: {
                    n14 = 174;
                    break;
                }
                case 91: {
                    n14 = 81;
                    break;
                }
                case 92: {
                    n14 = 182;
                    break;
                }
                case 93: {
                    n14 = 107;
                    break;
                }
                case 94: {
                    n14 = 1;
                    break;
                }
                case 95: {
                    n14 = 106;
                    break;
                }
                case 96: {
                    n14 = 214;
                    break;
                }
                case 97: {
                    n14 = 59;
                    break;
                }
                case 98: {
                    n14 = 47;
                    break;
                }
                case 99: {
                    n14 = 27;
                    break;
                }
                case 100: {
                    n14 = 92;
                    break;
                }
                case 101: {
                    n14 = 207;
                    break;
                }
                case 102: {
                    n14 = 221;
                    break;
                }
                case 103: {
                    n14 = 54;
                    break;
                }
                case 104: {
                    n14 = 56;
                    break;
                }
                case 105: {
                    n14 = 235;
                    break;
                }
                case 106: {
                    n14 = 116;
                    break;
                }
                case 107: {
                    n14 = 178;
                    break;
                }
                case 108: {
                    n14 = 156;
                    break;
                }
                case 109: {
                    n14 = 101;
                    break;
                }
                case 110: {
                    n14 = 110;
                    break;
                }
                case 111: {
                    n14 = 231;
                    break;
                }
                case 112: {
                    n14 = 154;
                    break;
                }
                case 113: {
                    n14 = 108;
                    break;
                }
                case 114: {
                    n14 = 215;
                    break;
                }
                case 115: {
                    n14 = 208;
                    break;
                }
                case 116: {
                    n14 = 79;
                    break;
                }
                case 117: {
                    n14 = 212;
                    break;
                }
                case 118: {
                    n14 = 254;
                    break;
                }
                case 119: {
                    n14 = 183;
                    break;
                }
                case 120: {
                    n14 = 112;
                    break;
                }
                case 121: {
                    n14 = 189;
                    break;
                }
                case 122: {
                    n14 = 148;
                    break;
                }
                case 123: {
                    n14 = 246;
                    break;
                }
                case 124: {
                    n14 = 226;
                    break;
                }
                case 125: {
                    n14 = 242;
                    break;
                }
                case 126: {
                    n14 = 129;
                    break;
                }
                case 127: {
                    n14 = 76;
                    break;
                }
                case 128: {
                    n14 = 6;
                    break;
                }
                case 129: {
                    n14 = 233;
                    break;
                }
                case 130: {
                    n14 = 53;
                    break;
                }
                case 131: {
                    n14 = 51;
                    break;
                }
                case 132: {
                    n14 = 236;
                    break;
                }
                case 133: {
                    n14 = 77;
                    break;
                }
                case 134: {
                    n14 = 171;
                    break;
                }
                case 135: {
                    n14 = 169;
                    break;
                }
                case 136: {
                    n14 = 179;
                    break;
                }
                case 137: {
                    n14 = 40;
                    break;
                }
                case 138: {
                    n14 = 145;
                    break;
                }
                case 139: {
                    n14 = 89;
                    break;
                }
                case 140: {
                    n14 = 104;
                    break;
                }
                case 141: {
                    n14 = 163;
                    break;
                }
                case 142: {
                    n14 = 30;
                    break;
                }
                case 143: {
                    n14 = 24;
                    break;
                }
                case 144: {
                    n14 = 88;
                    break;
                }
                case 145: {
                    n14 = 75;
                    break;
                }
                case 146: {
                    n14 = 50;
                    break;
                }
                case 147: {
                    n14 = 165;
                    break;
                }
                case 148: {
                    n14 = 232;
                    break;
                }
                case 149: {
                    n14 = 249;
                    break;
                }
                case 150: {
                    n14 = 185;
                    break;
                }
                case 151: {
                    n14 = 240;
                    break;
                }
                case 152: {
                    n14 = 164;
                    break;
                }
                case 153: {
                    n14 = 67;
                    break;
                }
                case 154: {
                    n14 = 161;
                    break;
                }
                case 155: {
                    n14 = 251;
                    break;
                }
                case 156: {
                    n14 = 153;
                    break;
                }
                case 157: {
                    n14 = 131;
                    break;
                }
                case 158: {
                    n14 = 11;
                    break;
                }
                case 159: {
                    n14 = 186;
                    break;
                }
                case 160: {
                    n14 = 83;
                    break;
                }
                case 161: {
                    n14 = 97;
                    break;
                }
                case 162: {
                    n14 = 60;
                    break;
                }
                case 163: {
                    n14 = 103;
                    break;
                }
                case 164: {
                    n14 = 237;
                    break;
                }
                case 165: {
                    n14 = 194;
                    break;
                }
                case 166: {
                    n14 = 33;
                    break;
                }
                case 167: {
                    n14 = 44;
                    break;
                }
                case 168: {
                    n14 = 42;
                    break;
                }
                case 169: {
                    n14 = 5;
                    break;
                }
                case 170: {
                    n14 = 234;
                    break;
                }
                case 171: {
                    n14 = 166;
                    break;
                }
                case 172: {
                    n14 = 99;
                    break;
                }
                case 173: {
                    n14 = 160;
                    break;
                }
                case 174: {
                    n14 = 122;
                    break;
                }
                case 175: {
                    n14 = 15;
                    break;
                }
                case 176: {
                    n14 = 29;
                    break;
                }
                case 177: {
                    n14 = 187;
                    break;
                }
                case 178: {
                    n14 = 28;
                    break;
                }
                case 179: {
                    n14 = 91;
                    break;
                }
                case 180: {
                    n14 = 90;
                    break;
                }
                case 181: {
                    n14 = 17;
                    break;
                }
                case 182: {
                    n14 = 143;
                    break;
                }
                case 183: {
                    n14 = 127;
                    break;
                }
                case 184: {
                    n14 = 18;
                    break;
                }
                case 185: {
                    n14 = 117;
                    break;
                }
                case 186: {
                    n14 = 98;
                    break;
                }
                case 187: {
                    n14 = 211;
                    break;
                }
                case 188: {
                    n14 = 175;
                    break;
                }
                case 189: {
                    n14 = 105;
                    break;
                }
                case 190: {
                    n14 = 113;
                    break;
                }
                case 191: {
                    n14 = 10;
                    break;
                }
                case 192: {
                    n14 = 26;
                    break;
                }
                case 193: {
                    n14 = 141;
                    break;
                }
                case 194: {
                    n14 = 147;
                    break;
                }
                case 195: {
                    n14 = 243;
                    break;
                }
                case 196: {
                    n14 = 4;
                    break;
                }
                case 197: {
                    n14 = 144;
                    break;
                }
                case 198: {
                    n14 = 8;
                    break;
                }
                case 199: {
                    n14 = 16;
                    break;
                }
                case 200: {
                    n14 = 217;
                    break;
                }
                case 201: {
                    n14 = 133;
                    break;
                }
                case 202: {
                    n14 = 38;
                    break;
                }
                case 203: {
                    n14 = 94;
                    break;
                }
                case 204: {
                    n14 = 100;
                    break;
                }
                case 205: {
                    n14 = 115;
                    break;
                }
                case 206: {
                    n14 = 190;
                    break;
                }
                case 207: {
                    n14 = 162;
                    break;
                }
                case 208: {
                    n14 = 140;
                    break;
                }
                case 209: {
                    n14 = 209;
                    break;
                }
                case 210: {
                    n14 = 230;
                    break;
                }
                case 211: {
                    n14 = 192;
                    break;
                }
                case 212: {
                    n14 = 125;
                    break;
                }
                case 213: {
                    n14 = 109;
                    break;
                }
                case 214: {
                    n14 = 46;
                    break;
                }
                case 215: {
                    n14 = 149;
                    break;
                }
                case 216: {
                    n14 = 137;
                    break;
                }
                case 217: {
                    n14 = 62;
                    break;
                }
                case 218: {
                    n14 = 152;
                    break;
                }
                case 219: {
                    n14 = 52;
                    break;
                }
                case 220: {
                    n14 = 151;
                    break;
                }
                case 221: {
                    n14 = 22;
                    break;
                }
                case 222: {
                    n14 = 238;
                    break;
                }
                case 223: {
                    n14 = 168;
                    break;
                }
                case 224: {
                    n14 = 93;
                    break;
                }
                case 225: {
                    n14 = 45;
                    break;
                }
                case 226: {
                    n14 = 102;
                    break;
                }
                case 227: {
                    n14 = 146;
                    break;
                }
                case 228: {
                    n14 = 71;
                    break;
                }
                case 229: {
                    n14 = 72;
                    break;
                }
                case 230: {
                    n14 = 132;
                    break;
                }
                case 231: {
                    n14 = 25;
                    break;
                }
                case 232: {
                    n14 = 196;
                    break;
                }
                case 233: {
                    n14 = 177;
                    break;
                }
                case 234: {
                    n14 = 193;
                    break;
                }
                case 235: {
                    n14 = 36;
                    break;
                }
                case 236: {
                    n14 = 136;
                    break;
                }
                case 237: {
                    n14 = 195;
                    break;
                }
                case 238: {
                    n14 = 70;
                    break;
                }
                case 239: {
                    n14 = 184;
                    break;
                }
                case 240: {
                    n14 = 170;
                    break;
                }
                case 241: {
                    n14 = 225;
                    break;
                }
                case 242: {
                    n14 = 248;
                    break;
                }
                case 243: {
                    n14 = 43;
                    break;
                }
                case 244: {
                    n14 = 73;
                    break;
                }
                case 245: {
                    n14 = 84;
                    break;
                }
                case 246: {
                    n14 = 135;
                    break;
                }
                case 247: {
                    n14 = 121;
                    break;
                }
                case 248: {
                    n14 = 23;
                    break;
                }
                case 249: {
                    n14 = 138;
                    break;
                }
                case 250: {
                    n14 = 158;
                    break;
                }
                case 251: {
                    n14 = 55;
                    break;
                }
                case 252: {
                    n14 = 64;
                    break;
                }
                case 253: {
                    n14 = 210;
                    break;
                }
                case 254: {
                    n14 = 61;
                    break;
                }
                default: {
                    n14 = 13;
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
            ub_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

