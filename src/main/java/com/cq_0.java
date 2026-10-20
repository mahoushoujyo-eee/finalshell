/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.E8;
import com.Y;
import com.YU;
import com.cv_0;
import com.dm_2;
import com.nn_2;
import com.pc_0;
import com.uJ;

/*
 * Renamed from com.Cq
 */
abstract class cq_0
extends cv_0 {
    private int U;
    nn_2 S;
    byte[] O;
    byte[] p;
    byte[] K;
    byte[] d;
    byte[] f;
    private uJ T;
    private YU Z;
    private static final String[] e;
    private static final String[] i;
    private static final long[] l;
    private static final Integer[] m;

    cq_0() {
    }

    abstract byte[] l();

    abstract byte[] u();

    abstract String i();

    @Override
    public void x(DI dI, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) throws Exception {
        block14: {
            block15: {
                boolean bl;
                block12: {
                    block13: {
                        Class<Object> clazz;
                        this.O = byArray;
                        this.p = byArray2;
                        bl = dm_2.F();
                        this.K = byArray3;
                        this.d = byArray4;
                        try {
                            clazz = Class.forName(dI.T(this.i())).asSubclass(Y.class);
                            this.L = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            this.L.t();
                        }
                        catch (Exception exception) {
                            throw new pc_0(exception.toString(), exception);
                        }
                        this.T = new uJ();
                        this.Z = new YU(this.T);
                        try {
                            clazz = Class.forName(dI.T(cq_0.b(21940, 26568))).asSubclass(nn_2.class);
                            this.S = (nn_2)clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            this.S.J();
                        }
                        catch (Exception exception) {
                            throw new pc_0(exception.toString(), exception);
                        }
                        try {
                            try {
                                this.S.H(this.u());
                                this.S.j(this.l());
                                this.f = this.S.t();
                                this.Z.M();
                                this.T.V((byte)cq_0.b(25679, 1057463921957125010L));
                                this.T.x(this.f);
                                if (!bl) break block12;
                                if (byArray != null) break block13;
                            }
                            catch (Exception exception) {
                                throw cq_0.a(exception);
                            }
                            return;
                        }
                        catch (Exception exception) {
                            throw cq_0.a(exception);
                        }
                    }
                    dI.D(this.Z);
                }
                try {
                    try {
                        if (!bl) break block14;
                        if (!dI.W().K(1)) break block15;
                    }
                    catch (Exception exception) {
                        throw cq_0.a(exception);
                    }
                    dI.W().t(1, cq_0.b(21942, 29161));
                    dI.W().t(1, cq_0.b(21941, -30821));
                }
                catch (Exception exception) {
                    throw cq_0.a(exception);
                }
            }
            this.U = cq_0.b(2693, 7962768449140479316L);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean f(uJ var1_1) throws Exception {
        block16: {
            var2_2 = dm_2.F();
            try {
                v0 = this.U;
                if (!var2_2) break block16;
            }
            catch (Exception v1) {
                throw cq_0.a(v1);
            }
            {
                ** switch (v0)
            }
lbl-1000:
            // 1 sources

            {
                case 31: {
                    var4_3 = var1_1.d();
                    var4_3 = var1_1.r();
                    var4_3 = var1_1.r();
                    try {
                        try {
                            try {
                                try {
                                    if (!var2_2) ** GOTO lbl41
                                    if (var4_3 != cq_0.b(14358, 2352210583899662272L)) {
                                    }
                                    ** GOTO lbl40
                                }
                                catch (Exception v2) {
                                    throw cq_0.a(v2);
                                }
                                v3 = this.a.W().K(3);
                                if (var2_2) {
                                }
                                ** GOTO lbl39
                            }
                            catch (Exception v4) {
                                throw cq_0.a(v4);
                            }
                            if (v3) {
                            }
                            ** GOTO lbl38
                        }
                        catch (Exception v5) {
                            throw cq_0.a(v5);
                        }
                        this.a.W().t(3, cq_0.b(21943, 17186) + var4_3);
                    }
                    catch (Exception v6) {
                        throw cq_0.a(v6);
                    }
lbl38:
                    // 2 sources

                    v3 = false;
lbl39:
                    // 2 sources

                    return v3;
lbl40:
                    // 1 sources

                    this.k = var1_1.S();
lbl41:
                    // 2 sources

                    var5_4 = var1_1.e();
                    var6_5 = var1_1.S();
                    this.S.D(var5_4);
                    this.S.Z();
                    this.E = this.D(this.S.R());
                    this.T.m();
                    this.T.q(this.p);
                    this.T.q(this.O);
                    this.T.q(this.d);
                    this.T.q(this.K);
                    this.T.q(this.k);
                    this.T.x(this.f);
                    this.T.x(var5_4);
                    this.T.x(this.E);
                    var7_6 = new byte[this.T.P()];
                    this.T.W(var7_6);
                    this.L.p(var7_6, 0, var7_6.length);
                    this.b = this.L.O();
                    var3_7 = 0;
                    var4_3 = 0;
                    var4_3 = this.k[var3_7++] << cq_0.b(19633, 4182376420257993574L) & cq_0.b(4153, 13712708413804522L) | this.k[var3_7++] << cq_0.b(25250, 6206724867940334967L) & cq_0.b(28441, 5694028307171291333L) | this.k[var3_7++] << cq_0.b(16857, 3395768858528620041L) & cq_0.b(3346, 5634222536362414784L) | this.k[var3_7++] & cq_0.b(17651, 1844328886981729063L);
                    var8_8 = E8.O(this.k, var3_7, var4_3);
                    var9_9 = this.x(var8_8, this.k, var3_7 += var4_3, var6_5);
                    this.U = 0;
                    return var9_9;
                }
            }
lbl66:
            // 1 sources

            v0 = false;
        }
        return v0;
    }

    @Override
    public int j() {
        return this.U;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "b\u0089\u001d\u0082\u008f\u00c4Q\u00c0/\u001b\u008a\u00d0\u00ffp\u00cd\u00c7\u00ba\u000f o\u00d0LS\u00968Y\u00b9\u008a\u0083\u00a1\u00b4\u00cc";
                        var12_3 = "b\u0089\u001d\u0082\u008f\u00c4Q\u00c0/\u001b\u008a\u00d0\u00ffp\u00cd\u00c7\u00ba\u000f o\u00d0LS\u00968Y\u00b9\u008a\u0083\u00a1\u00b4\u00cc".length();
                        var9_4 = 2;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 103;
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
                            var10_2 = "\u00f5i<'\u0010e\u001a\u00ef\u00e9\u00ff+\u00cd\u0018\u0091.\u0086\u001fo8&\u00fd\u0092L\"\u0015?\u00db\u00b8\u00a4\u0098?g\u001a\u00b0\u0012\u0015e\u0017\u0013\u00db\u00e0q\u008b\u00afi\u00b6\u0087\u00d4\u00e6\u00a8\u00a1=\u0002\u0018\u00fb\u00ce\u00e7Z";
                            var12_3 = "\u00f5i<'\u0010e\u001a\u00ef\u00e9\u00ff+\u00cd\u0018\u0091.\u0086\u001fo8&\u00fd\u0092L\"\u0015?\u00db\u00b8\u00a4\u0098?g\u001a\u00b0\u0012\u0015e\u0017\u0013\u00db\u00e0q\u008b\u00afi\u00b6\u0087\u00d4\u00e6\u00a8\u00a1=\u0002\u0018\u00fb\u00ce\u00e7Z".length();
                            var9_4 = 23;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 51;
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
                                    v15 = 95;
                                    break;
                                }
                                case 1: {
                                    v15 = 91;
                                    break;
                                }
                                case 2: {
                                    v15 = 77;
                                    break;
                                }
                                case 3: {
                                    v15 = 82;
                                    break;
                                }
                                case 4: {
                                    v15 = 103;
                                    break;
                                }
                                case 5: {
                                    v15 = 121;
                                    break;
                                }
                                default: {
                                    v15 = 2;
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
                cq_0.e = var13;
                cq_0.i = new String[4];
                var0_7 = 7545974697900847543L;
                var6_8 = new long[10];
                var3_9 = 0;
                var4_10 = "\u00a3\u00c1\r\u001d5\u00fe\u00aaoI\u00d8{\u00b7\u0014]\u008c\u00d0\u001d&T\u00d2\u00aa7\u00d6h\\,\u00de\u00f2\u0006\u0005\u00a2\u00c9Q\u00e7\rm\u00ef\u0099\u00af\u00b6\u0089\u00dd\u001d\u00ab\u00af\u00c3\u00e4\u00fc\u00cc\u00afA}I\u0016\u001cw\u008b\u00e3\u00d5\u0088\u00ae\u009e\u00fe]";
                var5_11 = "\u00a3\u00c1\r\u001d5\u00fe\u00aaoI\u00d8{\u00b7\u0014]\u008c\u00d0\u001d&T\u00d2\u00aa7\u00d6h\\,\u00de\u00f2\u0006\u0005\u00a2\u00c9Q\u00e7\rm\u00ef\u0099\u00af\u00b6\u0089\u00dd\u001d\u00ab\u00af\u00c3\u00e4\u00fc\u00cc\u00afA}I\u0016\u001cw\u008b\u00e3\u00d5\u0088\u00ae\u009e\u00fe]".length();
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
                    var4_10 = "\u00d6\u00ee\u00d1\u0087U~\u0081r3\u0099\u00ef4\u007f|\u008a;";
                    var5_11 = "\u00d6\u00ee\u00d1\u0087U~\u0081r3\u0099\u00ef4\u007f|\u008a;".length();
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
        cq_0.l = var6_8;
        cq_0.m = new Integer[10];
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x55B4) & 0xFFFF;
        if (i[n12] == null) {
            int n13;
            int n14;
            char[] cArray = e[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 85;
                    break;
                }
                case 1: {
                    n14 = 67;
                    break;
                }
                case 2: {
                    n14 = 2;
                    break;
                }
                case 3: {
                    n14 = 35;
                    break;
                }
                case 4: {
                    n14 = 69;
                    break;
                }
                case 5: {
                    n14 = 238;
                    break;
                }
                case 6: {
                    n14 = 130;
                    break;
                }
                case 7: {
                    n14 = 167;
                    break;
                }
                case 8: {
                    n14 = 185;
                    break;
                }
                case 9: {
                    n14 = 206;
                    break;
                }
                case 10: {
                    n14 = 90;
                    break;
                }
                case 11: {
                    n14 = 137;
                    break;
                }
                case 12: {
                    n14 = 17;
                    break;
                }
                case 13: {
                    n14 = 202;
                    break;
                }
                case 14: {
                    n14 = 13;
                    break;
                }
                case 15: {
                    n14 = 175;
                    break;
                }
                case 16: {
                    n14 = 184;
                    break;
                }
                case 17: {
                    n14 = 103;
                    break;
                }
                case 18: {
                    n14 = 98;
                    break;
                }
                case 19: {
                    n14 = 39;
                    break;
                }
                case 20: {
                    n14 = 105;
                    break;
                }
                case 21: {
                    n14 = 249;
                    break;
                }
                case 22: {
                    n14 = 171;
                    break;
                }
                case 23: {
                    n14 = 168;
                    break;
                }
                case 24: {
                    n14 = 222;
                    break;
                }
                case 25: {
                    n14 = 129;
                    break;
                }
                case 26: {
                    n14 = 186;
                    break;
                }
                case 27: {
                    n14 = 201;
                    break;
                }
                case 28: {
                    n14 = 169;
                    break;
                }
                case 29: {
                    n14 = 127;
                    break;
                }
                case 30: {
                    n14 = 27;
                    break;
                }
                case 31: {
                    n14 = 161;
                    break;
                }
                case 32: {
                    n14 = 228;
                    break;
                }
                case 33: {
                    n14 = 133;
                    break;
                }
                case 34: {
                    n14 = 0;
                    break;
                }
                case 35: {
                    n14 = 97;
                    break;
                }
                case 36: {
                    n14 = 203;
                    break;
                }
                case 37: {
                    n14 = 212;
                    break;
                }
                case 38: {
                    n14 = 43;
                    break;
                }
                case 39: {
                    n14 = 29;
                    break;
                }
                case 40: {
                    n14 = 233;
                    break;
                }
                case 41: {
                    n14 = 200;
                    break;
                }
                case 42: {
                    n14 = 63;
                    break;
                }
                case 43: {
                    n14 = 116;
                    break;
                }
                case 44: {
                    n14 = 78;
                    break;
                }
                case 45: {
                    n14 = 44;
                    break;
                }
                case 46: {
                    n14 = 250;
                    break;
                }
                case 47: {
                    n14 = 34;
                    break;
                }
                case 48: {
                    n14 = 117;
                    break;
                }
                case 49: {
                    n14 = 5;
                    break;
                }
                case 50: {
                    n14 = 194;
                    break;
                }
                case 51: {
                    n14 = 113;
                    break;
                }
                case 52: {
                    n14 = 135;
                    break;
                }
                case 53: {
                    n14 = 160;
                    break;
                }
                case 54: {
                    n14 = 237;
                    break;
                }
                case 55: {
                    n14 = 30;
                    break;
                }
                case 56: {
                    n14 = 38;
                    break;
                }
                case 57: {
                    n14 = 28;
                    break;
                }
                case 58: {
                    n14 = 227;
                    break;
                }
                case 59: {
                    n14 = 221;
                    break;
                }
                case 60: {
                    n14 = 126;
                    break;
                }
                case 61: {
                    n14 = 229;
                    break;
                }
                case 62: {
                    n14 = 173;
                    break;
                }
                case 63: {
                    n14 = 136;
                    break;
                }
                case 64: {
                    n14 = 253;
                    break;
                }
                case 65: {
                    n14 = 180;
                    break;
                }
                case 66: {
                    n14 = 235;
                    break;
                }
                case 67: {
                    n14 = 102;
                    break;
                }
                case 68: {
                    n14 = 74;
                    break;
                }
                case 69: {
                    n14 = 114;
                    break;
                }
                case 70: {
                    n14 = 217;
                    break;
                }
                case 71: {
                    n14 = 59;
                    break;
                }
                case 72: {
                    n14 = 109;
                    break;
                }
                case 73: {
                    n14 = 205;
                    break;
                }
                case 74: {
                    n14 = 89;
                    break;
                }
                case 75: {
                    n14 = 24;
                    break;
                }
                case 76: {
                    n14 = 81;
                    break;
                }
                case 77: {
                    n14 = 210;
                    break;
                }
                case 78: {
                    n14 = 224;
                    break;
                }
                case 79: {
                    n14 = 96;
                    break;
                }
                case 80: {
                    n14 = 22;
                    break;
                }
                case 81: {
                    n14 = 140;
                    break;
                }
                case 82: {
                    n14 = 6;
                    break;
                }
                case 83: {
                    n14 = 199;
                    break;
                }
                case 84: {
                    n14 = 70;
                    break;
                }
                case 85: {
                    n14 = 174;
                    break;
                }
                case 86: {
                    n14 = 213;
                    break;
                }
                case 87: {
                    n14 = 150;
                    break;
                }
                case 88: {
                    n14 = 148;
                    break;
                }
                case 89: {
                    n14 = 84;
                    break;
                }
                case 90: {
                    n14 = 138;
                    break;
                }
                case 91: {
                    n14 = 62;
                    break;
                }
                case 92: {
                    n14 = 183;
                    break;
                }
                case 93: {
                    n14 = 216;
                    break;
                }
                case 94: {
                    n14 = 56;
                    break;
                }
                case 95: {
                    n14 = 231;
                    break;
                }
                case 96: {
                    n14 = 141;
                    break;
                }
                case 97: {
                    n14 = 193;
                    break;
                }
                case 98: {
                    n14 = 182;
                    break;
                }
                case 99: {
                    n14 = 143;
                    break;
                }
                case 100: {
                    n14 = 145;
                    break;
                }
                case 101: {
                    n14 = 170;
                    break;
                }
                case 102: {
                    n14 = 104;
                    break;
                }
                case 103: {
                    n14 = 26;
                    break;
                }
                case 104: {
                    n14 = 176;
                    break;
                }
                case 105: {
                    n14 = 41;
                    break;
                }
                case 106: {
                    n14 = 42;
                    break;
                }
                case 107: {
                    n14 = 16;
                    break;
                }
                case 108: {
                    n14 = 99;
                    break;
                }
                case 109: {
                    n14 = 47;
                    break;
                }
                case 110: {
                    n14 = 152;
                    break;
                }
                case 111: {
                    n14 = 252;
                    break;
                }
                case 112: {
                    n14 = 52;
                    break;
                }
                case 113: {
                    n14 = 8;
                    break;
                }
                case 114: {
                    n14 = 87;
                    break;
                }
                case 115: {
                    n14 = 132;
                    break;
                }
                case 116: {
                    n14 = 181;
                    break;
                }
                case 117: {
                    n14 = 195;
                    break;
                }
                case 118: {
                    n14 = 147;
                    break;
                }
                case 119: {
                    n14 = 187;
                    break;
                }
                case 120: {
                    n14 = 245;
                    break;
                }
                case 121: {
                    n14 = 21;
                    break;
                }
                case 122: {
                    n14 = 197;
                    break;
                }
                case 123: {
                    n14 = 48;
                    break;
                }
                case 124: {
                    n14 = 79;
                    break;
                }
                case 125: {
                    n14 = 223;
                    break;
                }
                case 126: {
                    n14 = 255;
                    break;
                }
                case 127: {
                    n14 = 25;
                    break;
                }
                case 128: {
                    n14 = 146;
                    break;
                }
                case 129: {
                    n14 = 32;
                    break;
                }
                case 130: {
                    n14 = 3;
                    break;
                }
                case 131: {
                    n14 = 58;
                    break;
                }
                case 132: {
                    n14 = 151;
                    break;
                }
                case 133: {
                    n14 = 120;
                    break;
                }
                case 134: {
                    n14 = 45;
                    break;
                }
                case 135: {
                    n14 = 158;
                    break;
                }
                case 136: {
                    n14 = 153;
                    break;
                }
                case 137: {
                    n14 = 209;
                    break;
                }
                case 138: {
                    n14 = 247;
                    break;
                }
                case 139: {
                    n14 = 144;
                    break;
                }
                case 140: {
                    n14 = 179;
                    break;
                }
                case 141: {
                    n14 = 125;
                    break;
                }
                case 142: {
                    n14 = 37;
                    break;
                }
                case 143: {
                    n14 = 108;
                    break;
                }
                case 144: {
                    n14 = 50;
                    break;
                }
                case 145: {
                    n14 = 57;
                    break;
                }
                case 146: {
                    n14 = 225;
                    break;
                }
                case 147: {
                    n14 = 1;
                    break;
                }
                case 148: {
                    n14 = 220;
                    break;
                }
                case 149: {
                    n14 = 4;
                    break;
                }
                case 150: {
                    n14 = 51;
                    break;
                }
                case 151: {
                    n14 = 157;
                    break;
                }
                case 152: {
                    n14 = 232;
                    break;
                }
                case 153: {
                    n14 = 31;
                    break;
                }
                case 154: {
                    n14 = 219;
                    break;
                }
                case 155: {
                    n14 = 162;
                    break;
                }
                case 156: {
                    n14 = 49;
                    break;
                }
                case 157: {
                    n14 = 119;
                    break;
                }
                case 158: {
                    n14 = 124;
                    break;
                }
                case 159: {
                    n14 = 177;
                    break;
                }
                case 160: {
                    n14 = 94;
                    break;
                }
                case 161: {
                    n14 = 91;
                    break;
                }
                case 162: {
                    n14 = 214;
                    break;
                }
                case 163: {
                    n14 = 36;
                    break;
                }
                case 164: {
                    n14 = 123;
                    break;
                }
                case 165: {
                    n14 = 215;
                    break;
                }
                case 166: {
                    n14 = 121;
                    break;
                }
                case 167: {
                    n14 = 107;
                    break;
                }
                case 168: {
                    n14 = 196;
                    break;
                }
                case 169: {
                    n14 = 66;
                    break;
                }
                case 170: {
                    n14 = 154;
                    break;
                }
                case 171: {
                    n14 = 11;
                    break;
                }
                case 172: {
                    n14 = 73;
                    break;
                }
                case 173: {
                    n14 = 23;
                    break;
                }
                case 174: {
                    n14 = 189;
                    break;
                }
                case 175: {
                    n14 = 64;
                    break;
                }
                case 176: {
                    n14 = 100;
                    break;
                }
                case 177: {
                    n14 = 106;
                    break;
                }
                case 178: {
                    n14 = 14;
                    break;
                }
                case 179: {
                    n14 = 164;
                    break;
                }
                case 180: {
                    n14 = 72;
                    break;
                }
                case 181: {
                    n14 = 218;
                    break;
                }
                case 182: {
                    n14 = 12;
                    break;
                }
                case 183: {
                    n14 = 18;
                    break;
                }
                case 184: {
                    n14 = 20;
                    break;
                }
                case 185: {
                    n14 = 234;
                    break;
                }
                case 186: {
                    n14 = 188;
                    break;
                }
                case 187: {
                    n14 = 243;
                    break;
                }
                case 188: {
                    n14 = 80;
                    break;
                }
                case 189: {
                    n14 = 77;
                    break;
                }
                case 190: {
                    n14 = 134;
                    break;
                }
                case 191: {
                    n14 = 155;
                    break;
                }
                case 192: {
                    n14 = 236;
                    break;
                }
                case 193: {
                    n14 = 246;
                    break;
                }
                case 194: {
                    n14 = 208;
                    break;
                }
                case 195: {
                    n14 = 111;
                    break;
                }
                case 196: {
                    n14 = 204;
                    break;
                }
                case 197: {
                    n14 = 86;
                    break;
                }
                case 198: {
                    n14 = 242;
                    break;
                }
                case 199: {
                    n14 = 159;
                    break;
                }
                case 200: {
                    n14 = 156;
                    break;
                }
                case 201: {
                    n14 = 55;
                    break;
                }
                case 202: {
                    n14 = 207;
                    break;
                }
                case 203: {
                    n14 = 149;
                    break;
                }
                case 204: {
                    n14 = 10;
                    break;
                }
                case 205: {
                    n14 = 92;
                    break;
                }
                case 206: {
                    n14 = 172;
                    break;
                }
                case 207: {
                    n14 = 190;
                    break;
                }
                case 208: {
                    n14 = 54;
                    break;
                }
                case 209: {
                    n14 = 60;
                    break;
                }
                case 210: {
                    n14 = 40;
                    break;
                }
                case 211: {
                    n14 = 9;
                    break;
                }
                case 212: {
                    n14 = 178;
                    break;
                }
                case 213: {
                    n14 = 15;
                    break;
                }
                case 214: {
                    n14 = 82;
                    break;
                }
                case 215: {
                    n14 = 76;
                    break;
                }
                case 216: {
                    n14 = 226;
                    break;
                }
                case 217: {
                    n14 = 122;
                    break;
                }
                case 218: {
                    n14 = 101;
                    break;
                }
                case 219: {
                    n14 = 230;
                    break;
                }
                case 220: {
                    n14 = 240;
                    break;
                }
                case 221: {
                    n14 = 65;
                    break;
                }
                case 222: {
                    n14 = 198;
                    break;
                }
                case 223: {
                    n14 = 139;
                    break;
                }
                case 224: {
                    n14 = 95;
                    break;
                }
                case 225: {
                    n14 = 93;
                    break;
                }
                case 226: {
                    n14 = 112;
                    break;
                }
                case 227: {
                    n14 = 244;
                    break;
                }
                case 228: {
                    n14 = 19;
                    break;
                }
                case 229: {
                    n14 = 118;
                    break;
                }
                case 230: {
                    n14 = 239;
                    break;
                }
                case 231: {
                    n14 = 142;
                    break;
                }
                case 232: {
                    n14 = 75;
                    break;
                }
                case 233: {
                    n14 = 163;
                    break;
                }
                case 234: {
                    n14 = 7;
                    break;
                }
                case 235: {
                    n14 = 53;
                    break;
                }
                case 236: {
                    n14 = 83;
                    break;
                }
                case 237: {
                    n14 = 248;
                    break;
                }
                case 238: {
                    n14 = 110;
                    break;
                }
                case 239: {
                    n14 = 165;
                    break;
                }
                case 240: {
                    n14 = 71;
                    break;
                }
                case 241: {
                    n14 = 251;
                    break;
                }
                case 242: {
                    n14 = 115;
                    break;
                }
                case 243: {
                    n14 = 192;
                    break;
                }
                case 244: {
                    n14 = 88;
                    break;
                }
                case 245: {
                    n14 = 131;
                    break;
                }
                case 246: {
                    n14 = 241;
                    break;
                }
                case 247: {
                    n14 = 128;
                    break;
                }
                case 248: {
                    n14 = 46;
                    break;
                }
                case 249: {
                    n14 = 68;
                    break;
                }
                case 250: {
                    n14 = 166;
                    break;
                }
                case 251: {
                    n14 = 61;
                    break;
                }
                case 252: {
                    n14 = 33;
                    break;
                }
                case 253: {
                    n14 = 191;
                    break;
                }
                case 254: {
                    n14 = 254;
                    break;
                }
                default: {
                    n14 = 211;
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
            cq_0.i[n12] = new String(cArray).intern();
        }
        return i[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5FD4;
        if (m[n11] == null) {
            cq_0.m[n11] = (int)(l[n11] ^ l2);
        }
        return m[n11];
    }
}

