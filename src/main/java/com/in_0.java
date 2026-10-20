/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.E8;
import com.HU;
import com.IM;
import com.PD;
import com.dm_2;
import com.pc_0;
import com.uJ;

/*
 * Renamed from com.In
 */
class in_0
extends IM {
    private static final byte[][] e;
    private static final String[] F;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] f;

    in_0() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean D(DI var1_1) throws Exception {
        block77: {
            block78: {
                block75: {
                    block76: {
                        block73: {
                            block74: {
                                block65: {
                                    block66: {
                                        block60: {
                                            super.D(var1_1);
                                            v0 = dm_2.J();
                                            var3_2 = E8.J(this.a);
                                            this.g.M();
                                            var2_3 = v0;
                                            this.s.V((byte)in_0.a(1995, 3396241903224582932L));
                                            this.s.q(var3_2);
                                            this.s.q(E8.J(in_0.a(-28582, 18999)));
                                            this.s.q(E8.J(in_0.a(-28580, 10167)));
                                            this.s.u(in_0.e.length);
                                            for (var4_4 = 0; var4_4 < in_0.e.length; ++var4_4) {
                                                try {
                                                    this.s.q(in_0.e[var4_4]);
                                                    if (!var2_3) {
                                                        if (!var2_3) continue;
                                                        break;
                                                    }
                                                    break block60;
                                                }
                                                catch (Exception v1) {
                                                    throw in_0.a(v1);
                                                }
                                            }
                                            var1_1.D(this.g);
                                        }
                                        var4_5 = null;
                                        while (true) {
                                            block67: {
                                                block62: {
                                                    block63: {
                                                        block61: {
                                                            this.s = var1_1.V(this.s);
                                                            var5_6 = this.s.A() & in_0.a(6346, 7929306753221553177L);
                                                            if (var5_6 == in_0.a(22648, 7509994537214815421L)) {
                                                                try {
                                                                    v2 = 0;
                                                                    if (!var2_3) {
                                                                        return (boolean)v2;
                                                                    }
                                                                    break block61;
                                                                }
                                                                catch (Exception v3) {
                                                                    throw in_0.a(v3);
                                                                }
                                                            }
                                                            v2 = var5_6;
                                                        }
                                                        try {
                                                            v4 = in_0.a(31580, 2915092964106506112L);
                                                            if (var2_3) break block62;
                                                            if (v2 != v4) break block63;
                                                        }
                                                        catch (Exception v5) {
                                                            throw in_0.a(v5);
                                                        }
                                                        this.s.d();
                                                        this.s.r();
                                                        this.s.r();
                                                        var6_7 = this.s.S();
                                                        var7_9 = 0;
                                                        while (true) {
                                                            block64: {
                                                                try {
                                                                    if (var7_9 >= in_0.e.length) break;
                                                                    if (!E8.I((byte[])var6_7, in_0.e[var7_9])) break block64;
                                                                }
                                                                catch (Exception v6) {
                                                                    throw in_0.a(v6);
                                                                }
                                                                var4_5 = in_0.F[var7_9];
                                                                break;
                                                            }
                                                            ++var7_9;
                                                        }
                                                        try {
                                                            if (var4_5 == null) {
                                                                return false;
                                                            }
                                                            break block65;
                                                        }
                                                        catch (Exception v7) {
                                                            throw in_0.a(v7);
                                                        }
                                                    }
                                                    try {
                                                        v2 = var5_6;
                                                        if (var2_3) break block66;
                                                        v4 = in_0.a(22096, 6033923982328963730L);
                                                    }
                                                    catch (Exception v8) {
                                                        throw in_0.a(v8);
                                                    }
                                                }
                                                if (v2 != v4) break;
                                                this.s.d();
                                                this.s.r();
                                                this.s.r();
                                                var6_7 = this.s.S();
                                                var7_8 = this.s.S();
                                                var8_13 = E8.B((byte[])var6_7);
                                                try {
                                                    v9 = this.J;
                                                    if (var2_3) break block67;
                                                    if (v9 == null) continue;
                                                }
                                                catch (Exception v10) {
                                                    throw in_0.a(v10);
                                                }
                                                v9 = this.J;
                                            }
                                            v9.q((String)var8_13);
                                            if (var2_3) break;
                                        }
                                        v2 = 0;
                                    }
                                    return (boolean)v2;
                                }
                                var6_7 = null;
                                try {
                                    var7_10 = Class.forName(var1_1.T(var4_5)).asSubclass(HU.class);
                                    var6_7 = var7_10.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                }
                                catch (Exception var7_11) {
                                    return false;
                                }
                                try {
                                    var6_7.j(this.a, var1_1.V);
                                }
                                catch (pc_0 var7_12) {
                                    return false;
                                }
                                var7_10 = new byte[0];
                                while (!var6_7.W()) {
                                    block72: {
                                        block71: {
                                            block70: {
                                                block69: {
                                                    block68: {
                                                        try {
                                                            var7_10 = var6_7.S((byte[])var7_10, 0, ((Object)var7_10).length);
                                                        }
                                                        catch (pc_0 var8_14) {
                                                            return false;
                                                        }
                                                        try {
                                                            if (var7_10 != null) {
                                                                this.g.M();
                                                                this.s.V((byte)in_0.a(5024, 7219058847270463328L));
                                                                this.s.q((byte[])var7_10);
                                                                var1_1.D(this.g);
                                                            }
                                                        }
                                                        catch (Exception v11) {
                                                            throw in_0.a(v11);
                                                        }
                                                        try {
                                                            v12 = var6_7.W();
                                                            if (var2_3) break block68;
                                                            if (v12 != 0) continue;
                                                        }
                                                        catch (Exception v13) {
                                                            throw in_0.a(v13);
                                                        }
                                                        this.s = var1_1.V(this.s);
                                                        v12 = var5_6 = this.s.A() & in_0.a(29663, 1423002931531548429L);
                                                    }
                                                    try {
                                                        v14 = in_0.a(32389, 595014297500813889L);
                                                        if (var2_3) break block69;
                                                        if (v12 == v14) {
                                                        }
                                                        ** GOTO lbl155
                                                    }
                                                    catch (Exception v15) {
                                                        throw in_0.a(v15);
                                                    }
                                                    this.s = var1_1.V(this.s);
                                                    var5_6 = this.s.A() & in_0.a(29663, 1423002931531548429L);
                                                    try {
                                                        if (!var2_3) break block70;
lbl155:
                                                        // 2 sources

                                                        v12 = var5_6;
                                                        v14 = in_0.a(10681, 46774132400774527L);
                                                    }
                                                    catch (Exception v16) {
                                                        throw in_0.a(v16);
                                                    }
                                                }
                                                try {
                                                    if (var2_3) break block71;
                                                    if (v12 != v14) break block70;
                                                }
                                                catch (Exception v17) {
                                                    throw in_0.a(v17);
                                                }
                                                this.s = var1_1.V(this.s);
                                                var5_6 = this.s.A() & in_0.a(29663, 1423002931531548429L);
                                            }
                                            try {
                                                v12 = var5_6;
                                                if (var2_3) break block72;
                                                v14 = in_0.a(13892, 4934558983168475802L);
                                            }
                                            catch (Exception v18) {
                                                throw in_0.a(v18);
                                            }
                                        }
                                        try {
                                            if (v12 == v14) {
                                                return false;
                                            }
                                        }
                                        catch (Exception v19) {
                                            throw in_0.a(v19);
                                        }
                                        this.s.d();
                                        this.s.r();
                                        v12 = this.s.r();
                                    }
                                    var7_10 = this.s.S();
                                    if (!var2_3) continue;
                                }
                                var8_13 = new uJ();
                                var8_13.q(var1_1.I());
                                var8_13.V((byte)in_0.a(24667, 4493903607998616730L));
                                var8_13.q(var3_2);
                                var8_13.q(E8.J(in_0.a(-28578, -23992)));
                                var8_13.q(E8.J(in_0.a(-28579, 8615)));
                                var9_15 = var6_7.t(var8_13.g, 0, var8_13.P());
                                try {
                                    try {
                                        if (var2_3) break block73;
                                        if (var9_15 != null) break block74;
                                    }
                                    catch (Exception v20) {
                                        throw in_0.a(v20);
                                    }
                                    return false;
                                }
                                catch (Exception v21) {
                                    throw in_0.a(v21);
                                }
                            }
                            this.g.M();
                            this.s.V((byte)in_0.a(19645, 2868768555460933736L));
                            this.s.q(var9_15);
                            var1_1.D(this.g);
                            var6_7.a();
                            this.s = var1_1.V(this.s);
                            var5_6 = this.s.A() & in_0.a(29663, 1423002931531548429L);
                        }
                        try {
                            try {
                                v22 = var5_6;
                                v23 = in_0.a(5276, 4568355232727490630L);
                                if (var2_3) break block75;
                                if (v22 != v23) break block76;
                            }
                            catch (Exception v24) {
                                throw in_0.a(v24);
                            }
                            return true;
                        }
                        catch (Exception v25) {
                            throw in_0.a(v25);
                        }
                    }
                    try {
                        v22 = var5_6;
                        if (var2_3) break block77;
                        v23 = in_0.a(13892, 4934558983168475802L);
                    }
                    catch (Exception v26) {
                        throw in_0.a(v26);
                    }
                }
                if (v22 == v23) {
                    this.s.d();
                    this.s.r();
                    this.s.r();
                    var10_16 = this.s.S();
                    var11_17 = this.s.r();
                    try {
                        try {
                            v22 = var11_17;
                            if (var2_3) break block77;
                            if (v22 == 0) break block78;
                        }
                        catch (Exception v27) {
                            throw in_0.a(v27);
                        }
                        throw new PD(E8.B(var10_16));
                    }
                    catch (Exception v28) {
                        throw in_0.a(v28);
                    }
                }
            }
            v22 = 0;
        }
        return (boolean)v22;
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
                        var10_2 = "l\u0081\u00a6\f\u00e2m\u001c\u0085\u00e7.M\u00937y\u0014\u0010\u0099\u00a4C\u00c9GK\u001f*Pe\u00ed\u00af}\u0092ghyY-\u000f\u00a6IrY\u0013\u0004\u0010wA]\bL\u0002I'";
                        var12_3 = "l\u0081\u00a6\f\u00e2m\u001c\u0085\u00e7.M\u00937y\u0014\u0010\u0099\u00a4C\u00c9GK\u001f*Pe\u00ed\u00af}\u0092ghyY-\u000f\u00a6IrY\u0013\u0004\u0010wA]\bL\u0002I'".length();
                        var9_4 = 14;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 9;
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
                            var10_2 = "\u00b9`\u00dc1\u008bDN2\u00c7\u00b8\u0095\u00bd\u00fc:\u00b5\u000e\u00bc\u00d8\u00f1jE\u00ec\u00a5\u00f8\u009d\u00ccO\u0082:\u0016";
                            var12_3 = "\u00b9`\u00dc1\u008bDN2\u00c7\u00b8\u0095\u00bd\u00fc:\u00b5\u000e\u00bc\u00d8\u00f1jE\u00ec\u00a5\u00f8\u009d\u00ccO\u0082:\u0016".length();
                            var9_4 = 15;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 104;
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
                                    v15 = 41;
                                    break;
                                }
                                case 1: {
                                    v15 = 98;
                                    break;
                                }
                                case 2: {
                                    v15 = 83;
                                    break;
                                }
                                case 3: {
                                    v15 = 104;
                                    break;
                                }
                                case 4: {
                                    v15 = 114;
                                    break;
                                }
                                case 5: {
                                    v15 = 46;
                                    break;
                                }
                                default: {
                                    v15 = 71;
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
                in_0.b = var13;
                in_0.c = new String[5];
                var0_7 = 3083637801579327197L;
                var6_8 = new long[27];
                var3_9 = 0;
                var4_10 = ".wh\u00ea*?0\u00f1\f9\u0013\u00cb\u00ef\u00c6=.o\u0096\u00d527\u00faB;\u00e8L\u0013\u00e5[])/\u00d4\u0094t``\u0015\u0016\u00f7\n\u008e\u009a\u007f\u00d1=\u00bc\u0096OP\u00ee\u0083\rc\u00ea\u0094\u0094\u00c7\u00e6V\u00d0-\u00cb\u00e67|\u00e1\u0085\u00f7\u0081A\r\u00cb\u00f3\u0092a\u0086\u00f64\u0018\fDRH\u00e4p\u00a4\u00f2)\u0015\u00ef{e\u009e\u00ce\u00af\u00ea\u00b7e8\u00c6\u0006\u00d7\u0012\u00ff\u00aa)\u008b\u0007\u00d5!a\u00cdod\u00a2w\u00e5]\u00fb\u00ed\u0084\u00e1\u00b9\u0011\u00e2lt\u00c7\u00b1\u00c0J\u00b2\u0080\u00bau\u0005fC\u0004\u00df(I\u0080*9'\u00dfFVc0\u00eb\u0083\u001b\u00ca\u00b3w\u008cz1\u00ac\u00fc\u0002\u00cc\u00ca\u0002S\u00ba\u00b2\u00d2\u007f\u00fd\u00ca\u00a4\u00dc\u00a28\u008f\u00ffVrM\u00d4.|\u00bfoyv\u00f3\u00e3V\u0007v\u0092\u00f1\u00ec\u00baK";
                var5_11 = ".wh\u00ea*?0\u00f1\f9\u0013\u00cb\u00ef\u00c6=.o\u0096\u00d527\u00faB;\u00e8L\u0013\u00e5[])/\u00d4\u0094t``\u0015\u0016\u00f7\n\u008e\u009a\u007f\u00d1=\u00bc\u0096OP\u00ee\u0083\rc\u00ea\u0094\u0094\u00c7\u00e6V\u00d0-\u00cb\u00e67|\u00e1\u0085\u00f7\u0081A\r\u00cb\u00f3\u0092a\u0086\u00f64\u0018\fDRH\u00e4p\u00a4\u00f2)\u0015\u00ef{e\u009e\u00ce\u00af\u00ea\u00b7e8\u00c6\u0006\u00d7\u0012\u00ff\u00aa)\u008b\u0007\u00d5!a\u00cdod\u00a2w\u00e5]\u00fb\u00ed\u0084\u00e1\u00b9\u0011\u00e2lt\u00c7\u00b1\u00c0J\u00b2\u0080\u00bau\u0005fC\u0004\u00df(I\u0080*9'\u00dfFVc0\u00eb\u0083\u001b\u00ca\u00b3w\u008cz1\u00ac\u00fc\u0002\u00cc\u00ca\u0002S\u00ba\u00b2\u00d2\u007f\u00fd\u00ca\u00a4\u00dc\u00a28\u008f\u00ffVrM\u00d4.|\u00bfoyv\u00f3\u00e3V\u0007v\u0092\u00f1\u00ec\u00baK".length();
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
                    var4_10 = "8c\u00dd\u009e3!L\u00c8:d\u00e7\u001c`\u00b1'\u0081";
                    var5_11 = "8c\u00dd\u009e3!L\u00c8:d\u00e7\u001c`\u00b1'\u0081".length();
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
        in_0.d = var6_8;
        in_0.f = new Integer[27];
        v22 = new byte[1][];
        v23 = new byte[in_0.a(6914, 6210009838653239259L)];
        v23[0] = in_0.a(24665, 538103356404962448L);
        v23[1] = in_0.a(26262, 3618776496613069378L);
        v23[2] = in_0.a(12468, 3820432694005318755L);
        v23[3] = in_0.a(26971, 5300813331819699603L);
        v23[4] = in_0.a(26475, 2381470815433266107L);
        v23[5] = in_0.a(28267, 380563999907388093L);
        v23[in_0.a((int)14632, (long)4889574737800089067L)] = in_0.a(26681, 7528899190552239358L);
        v23[in_0.a((int)32499, (long)3953988999607650856L)] = in_0.a(27375, 3490152955311889982L);
        v23[in_0.a((int)28181, (long)1332703821879319245L)] = 1;
        v23[in_0.a((int)3355, (long)816028577309718982L)] = 2;
        v23[in_0.a((int)32157, (long)2364791217443244374L)] = 2;
        v22[0] = v23;
        in_0.e = v22;
        in_0.F = new String[]{in_0.a(-28577, 4069)};
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF905E) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 19;
                    break;
                }
                case 1: {
                    n14 = 162;
                    break;
                }
                case 2: {
                    n14 = 166;
                    break;
                }
                case 3: {
                    n14 = 230;
                    break;
                }
                case 4: {
                    n14 = 157;
                    break;
                }
                case 5: {
                    n14 = 188;
                    break;
                }
                case 6: {
                    n14 = 143;
                    break;
                }
                case 7: {
                    n14 = 69;
                    break;
                }
                case 8: {
                    n14 = 206;
                    break;
                }
                case 9: {
                    n14 = 145;
                    break;
                }
                case 10: {
                    n14 = 238;
                    break;
                }
                case 11: {
                    n14 = 139;
                    break;
                }
                case 12: {
                    n14 = 40;
                    break;
                }
                case 13: {
                    n14 = 177;
                    break;
                }
                case 14: {
                    n14 = 173;
                    break;
                }
                case 15: {
                    n14 = 60;
                    break;
                }
                case 16: {
                    n14 = 224;
                    break;
                }
                case 17: {
                    n14 = 158;
                    break;
                }
                case 18: {
                    n14 = 28;
                    break;
                }
                case 19: {
                    n14 = 211;
                    break;
                }
                case 20: {
                    n14 = 78;
                    break;
                }
                case 21: {
                    n14 = 153;
                    break;
                }
                case 22: {
                    n14 = 22;
                    break;
                }
                case 23: {
                    n14 = 247;
                    break;
                }
                case 24: {
                    n14 = 218;
                    break;
                }
                case 25: {
                    n14 = 120;
                    break;
                }
                case 26: {
                    n14 = 35;
                    break;
                }
                case 27: {
                    n14 = 124;
                    break;
                }
                case 28: {
                    n14 = 55;
                    break;
                }
                case 29: {
                    n14 = 0;
                    break;
                }
                case 30: {
                    n14 = 222;
                    break;
                }
                case 31: {
                    n14 = 135;
                    break;
                }
                case 32: {
                    n14 = 246;
                    break;
                }
                case 33: {
                    n14 = 131;
                    break;
                }
                case 34: {
                    n14 = 130;
                    break;
                }
                case 35: {
                    n14 = 42;
                    break;
                }
                case 36: {
                    n14 = 240;
                    break;
                }
                case 37: {
                    n14 = 68;
                    break;
                }
                case 38: {
                    n14 = 187;
                    break;
                }
                case 39: {
                    n14 = 115;
                    break;
                }
                case 40: {
                    n14 = 176;
                    break;
                }
                case 41: {
                    n14 = 217;
                    break;
                }
                case 42: {
                    n14 = 86;
                    break;
                }
                case 43: {
                    n14 = 125;
                    break;
                }
                case 44: {
                    n14 = 85;
                    break;
                }
                case 45: {
                    n14 = 233;
                    break;
                }
                case 46: {
                    n14 = 155;
                    break;
                }
                case 47: {
                    n14 = 234;
                    break;
                }
                case 48: {
                    n14 = 142;
                    break;
                }
                case 49: {
                    n14 = 118;
                    break;
                }
                case 50: {
                    n14 = 104;
                    break;
                }
                case 51: {
                    n14 = 121;
                    break;
                }
                case 52: {
                    n14 = 225;
                    break;
                }
                case 53: {
                    n14 = 228;
                    break;
                }
                case 54: {
                    n14 = 38;
                    break;
                }
                case 55: {
                    n14 = 15;
                    break;
                }
                case 56: {
                    n14 = 61;
                    break;
                }
                case 57: {
                    n14 = 81;
                    break;
                }
                case 58: {
                    n14 = 180;
                    break;
                }
                case 59: {
                    n14 = 98;
                    break;
                }
                case 60: {
                    n14 = 252;
                    break;
                }
                case 61: {
                    n14 = 165;
                    break;
                }
                case 62: {
                    n14 = 37;
                    break;
                }
                case 63: {
                    n14 = 30;
                    break;
                }
                case 64: {
                    n14 = 93;
                    break;
                }
                case 65: {
                    n14 = 4;
                    break;
                }
                case 66: {
                    n14 = 255;
                    break;
                }
                case 67: {
                    n14 = 144;
                    break;
                }
                case 68: {
                    n14 = 129;
                    break;
                }
                case 69: {
                    n14 = 79;
                    break;
                }
                case 70: {
                    n14 = 254;
                    break;
                }
                case 71: {
                    n14 = 239;
                    break;
                }
                case 72: {
                    n14 = 44;
                    break;
                }
                case 73: {
                    n14 = 204;
                    break;
                }
                case 74: {
                    n14 = 137;
                    break;
                }
                case 75: {
                    n14 = 75;
                    break;
                }
                case 76: {
                    n14 = 9;
                    break;
                }
                case 77: {
                    n14 = 210;
                    break;
                }
                case 78: {
                    n14 = 58;
                    break;
                }
                case 79: {
                    n14 = 2;
                    break;
                }
                case 80: {
                    n14 = 150;
                    break;
                }
                case 81: {
                    n14 = 134;
                    break;
                }
                case 82: {
                    n14 = 91;
                    break;
                }
                case 83: {
                    n14 = 33;
                    break;
                }
                case 84: {
                    n14 = 100;
                    break;
                }
                case 85: {
                    n14 = 10;
                    break;
                }
                case 86: {
                    n14 = 149;
                    break;
                }
                case 87: {
                    n14 = 97;
                    break;
                }
                case 88: {
                    n14 = 151;
                    break;
                }
                case 89: {
                    n14 = 80;
                    break;
                }
                case 90: {
                    n14 = 108;
                    break;
                }
                case 91: {
                    n14 = 18;
                    break;
                }
                case 92: {
                    n14 = 192;
                    break;
                }
                case 93: {
                    n14 = 32;
                    break;
                }
                case 94: {
                    n14 = 96;
                    break;
                }
                case 95: {
                    n14 = 74;
                    break;
                }
                case 96: {
                    n14 = 183;
                    break;
                }
                case 97: {
                    n14 = 193;
                    break;
                }
                case 98: {
                    n14 = 132;
                    break;
                }
                case 99: {
                    n14 = 21;
                    break;
                }
                case 100: {
                    n14 = 189;
                    break;
                }
                case 101: {
                    n14 = 126;
                    break;
                }
                case 102: {
                    n14 = 89;
                    break;
                }
                case 103: {
                    n14 = 168;
                    break;
                }
                case 104: {
                    n14 = 103;
                    break;
                }
                case 105: {
                    n14 = 52;
                    break;
                }
                case 106: {
                    n14 = 127;
                    break;
                }
                case 107: {
                    n14 = 95;
                    break;
                }
                case 108: {
                    n14 = 244;
                    break;
                }
                case 109: {
                    n14 = 146;
                    break;
                }
                case 110: {
                    n14 = 14;
                    break;
                }
                case 111: {
                    n14 = 184;
                    break;
                }
                case 112: {
                    n14 = 213;
                    break;
                }
                case 113: {
                    n14 = 248;
                    break;
                }
                case 114: {
                    n14 = 163;
                    break;
                }
                case 115: {
                    n14 = 185;
                    break;
                }
                case 116: {
                    n14 = 152;
                    break;
                }
                case 117: {
                    n14 = 84;
                    break;
                }
                case 118: {
                    n14 = 198;
                    break;
                }
                case 119: {
                    n14 = 5;
                    break;
                }
                case 120: {
                    n14 = 72;
                    break;
                }
                case 121: {
                    n14 = 7;
                    break;
                }
                case 122: {
                    n14 = 215;
                    break;
                }
                case 123: {
                    n14 = 92;
                    break;
                }
                case 124: {
                    n14 = 196;
                    break;
                }
                case 125: {
                    n14 = 242;
                    break;
                }
                case 126: {
                    n14 = 1;
                    break;
                }
                case 127: {
                    n14 = 47;
                    break;
                }
                case 128: {
                    n14 = 17;
                    break;
                }
                case 129: {
                    n14 = 133;
                    break;
                }
                case 130: {
                    n14 = 123;
                    break;
                }
                case 131: {
                    n14 = 109;
                    break;
                }
                case 132: {
                    n14 = 159;
                    break;
                }
                case 133: {
                    n14 = 43;
                    break;
                }
                case 134: {
                    n14 = 214;
                    break;
                }
                case 135: {
                    n14 = 111;
                    break;
                }
                case 136: {
                    n14 = 174;
                    break;
                }
                case 137: {
                    n14 = 11;
                    break;
                }
                case 138: {
                    n14 = 77;
                    break;
                }
                case 139: {
                    n14 = 57;
                    break;
                }
                case 140: {
                    n14 = 87;
                    break;
                }
                case 141: {
                    n14 = 241;
                    break;
                }
                case 142: {
                    n14 = 45;
                    break;
                }
                case 143: {
                    n14 = 164;
                    break;
                }
                case 144: {
                    n14 = 154;
                    break;
                }
                case 145: {
                    n14 = 212;
                    break;
                }
                case 146: {
                    n14 = 181;
                    break;
                }
                case 147: {
                    n14 = 49;
                    break;
                }
                case 148: {
                    n14 = 148;
                    break;
                }
                case 149: {
                    n14 = 73;
                    break;
                }
                case 150: {
                    n14 = 107;
                    break;
                }
                case 151: {
                    n14 = 116;
                    break;
                }
                case 152: {
                    n14 = 39;
                    break;
                }
                case 153: {
                    n14 = 13;
                    break;
                }
                case 154: {
                    n14 = 27;
                    break;
                }
                case 155: {
                    n14 = 110;
                    break;
                }
                case 156: {
                    n14 = 54;
                    break;
                }
                case 157: {
                    n14 = 36;
                    break;
                }
                case 158: {
                    n14 = 119;
                    break;
                }
                case 159: {
                    n14 = 46;
                    break;
                }
                case 160: {
                    n14 = 235;
                    break;
                }
                case 161: {
                    n14 = 114;
                    break;
                }
                case 162: {
                    n14 = 219;
                    break;
                }
                case 163: {
                    n14 = 221;
                    break;
                }
                case 164: {
                    n14 = 200;
                    break;
                }
                case 165: {
                    n14 = 24;
                    break;
                }
                case 166: {
                    n14 = 190;
                    break;
                }
                case 167: {
                    n14 = 195;
                    break;
                }
                case 168: {
                    n14 = 232;
                    break;
                }
                case 169: {
                    n14 = 199;
                    break;
                }
                case 170: {
                    n14 = 220;
                    break;
                }
                case 171: {
                    n14 = 3;
                    break;
                }
                case 172: {
                    n14 = 82;
                    break;
                }
                case 173: {
                    n14 = 34;
                    break;
                }
                case 174: {
                    n14 = 53;
                    break;
                }
                case 175: {
                    n14 = 23;
                    break;
                }
                case 176: {
                    n14 = 48;
                    break;
                }
                case 177: {
                    n14 = 65;
                    break;
                }
                case 178: {
                    n14 = 67;
                    break;
                }
                case 179: {
                    n14 = 136;
                    break;
                }
                case 180: {
                    n14 = 170;
                    break;
                }
                case 181: {
                    n14 = 70;
                    break;
                }
                case 182: {
                    n14 = 16;
                    break;
                }
                case 183: {
                    n14 = 205;
                    break;
                }
                case 184: {
                    n14 = 236;
                    break;
                }
                case 185: {
                    n14 = 207;
                    break;
                }
                case 186: {
                    n14 = 12;
                    break;
                }
                case 187: {
                    n14 = 102;
                    break;
                }
                case 188: {
                    n14 = 101;
                    break;
                }
                case 189: {
                    n14 = 105;
                    break;
                }
                case 190: {
                    n14 = 128;
                    break;
                }
                case 191: {
                    n14 = 20;
                    break;
                }
                case 192: {
                    n14 = 64;
                    break;
                }
                case 193: {
                    n14 = 51;
                    break;
                }
                case 194: {
                    n14 = 66;
                    break;
                }
                case 195: {
                    n14 = 172;
                    break;
                }
                case 196: {
                    n14 = 226;
                    break;
                }
                case 197: {
                    n14 = 94;
                    break;
                }
                case 198: {
                    n14 = 138;
                    break;
                }
                case 199: {
                    n14 = 59;
                    break;
                }
                case 200: {
                    n14 = 237;
                    break;
                }
                case 201: {
                    n14 = 141;
                    break;
                }
                case 202: {
                    n14 = 56;
                    break;
                }
                case 203: {
                    n14 = 216;
                    break;
                }
                case 204: {
                    n14 = 140;
                    break;
                }
                case 205: {
                    n14 = 178;
                    break;
                }
                case 206: {
                    n14 = 249;
                    break;
                }
                case 207: {
                    n14 = 179;
                    break;
                }
                case 208: {
                    n14 = 62;
                    break;
                }
                case 209: {
                    n14 = 182;
                    break;
                }
                case 210: {
                    n14 = 122;
                    break;
                }
                case 211: {
                    n14 = 171;
                    break;
                }
                case 212: {
                    n14 = 231;
                    break;
                }
                case 213: {
                    n14 = 90;
                    break;
                }
                case 214: {
                    n14 = 223;
                    break;
                }
                case 215: {
                    n14 = 99;
                    break;
                }
                case 216: {
                    n14 = 194;
                    break;
                }
                case 217: {
                    n14 = 71;
                    break;
                }
                case 218: {
                    n14 = 112;
                    break;
                }
                case 219: {
                    n14 = 88;
                    break;
                }
                case 220: {
                    n14 = 253;
                    break;
                }
                case 221: {
                    n14 = 167;
                    break;
                }
                case 222: {
                    n14 = 251;
                    break;
                }
                case 223: {
                    n14 = 245;
                    break;
                }
                case 224: {
                    n14 = 106;
                    break;
                }
                case 225: {
                    n14 = 186;
                    break;
                }
                case 226: {
                    n14 = 160;
                    break;
                }
                case 227: {
                    n14 = 113;
                    break;
                }
                case 228: {
                    n14 = 26;
                    break;
                }
                case 229: {
                    n14 = 227;
                    break;
                }
                case 230: {
                    n14 = 25;
                    break;
                }
                case 231: {
                    n14 = 250;
                    break;
                }
                case 232: {
                    n14 = 117;
                    break;
                }
                case 233: {
                    n14 = 29;
                    break;
                }
                case 234: {
                    n14 = 175;
                    break;
                }
                case 235: {
                    n14 = 197;
                    break;
                }
                case 236: {
                    n14 = 50;
                    break;
                }
                case 237: {
                    n14 = 203;
                    break;
                }
                case 238: {
                    n14 = 31;
                    break;
                }
                case 239: {
                    n14 = 63;
                    break;
                }
                case 240: {
                    n14 = 41;
                    break;
                }
                case 241: {
                    n14 = 161;
                    break;
                }
                case 242: {
                    n14 = 6;
                    break;
                }
                case 243: {
                    n14 = 202;
                    break;
                }
                case 244: {
                    n14 = 76;
                    break;
                }
                case 245: {
                    n14 = 201;
                    break;
                }
                case 246: {
                    n14 = 243;
                    break;
                }
                case 247: {
                    n14 = 156;
                    break;
                }
                case 248: {
                    n14 = 8;
                    break;
                }
                case 249: {
                    n14 = 147;
                    break;
                }
                case 250: {
                    n14 = 83;
                    break;
                }
                case 251: {
                    n14 = 209;
                    break;
                }
                case 252: {
                    n14 = 208;
                    break;
                }
                case 253: {
                    n14 = 169;
                    break;
                }
                case 254: {
                    n14 = 191;
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
            in_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x74D1;
        if (f[n11] == null) {
            in_0.f[n11] = (int)(d[n11] ^ l2);
        }
        return f[n11];
    }
}

