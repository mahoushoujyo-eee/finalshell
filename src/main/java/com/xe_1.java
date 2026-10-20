/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B0;
import com.r2_0;
import com.r3_0;
import com.r5_0;
import com.ra_1;
import com.rc_1;
import com.ri_1;
import com.rm_1;
import com.rn_2;
import com.ro_1;
import com.ro_2;
import com.rs_2;
import com.rw_1;
import com.z6;
import com.zG;
import com.zL;
import com.zX;
import com.zZ;
import com.z_;
import com.zj_0;
import com.zm_0;
import com.zp_0;
import com.zt_0;
import com.zv_0;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

/*
 * Renamed from com.xE
 */
public final class xe_1
implements Composite {
    public static String[] Q;
    protected float R;
    protected int M;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    private xe_1(int n10) {
        this(n10, 1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private xe_1(int n10, float f10) {
        float f11;
        block16: {
            String string;
            block14: {
                block15: {
                    block13: {
                        String string2 = ra_1.c();
                        string = string2;
                        try {
                            try {
                                float f12 = f10 - 0.0f;
                                f11 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                if (string != null) break block13;
                                if (f11 < 0) throw new IllegalArgumentException(xe_1.a(25100, 27186));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xe_1.a(illegalArgumentException);
                            }
                            float f13 = f10 - 1.0f;
                            f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xe_1.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (string != null) break block14;
                            if (f11 <= 0) break block15;
                            throw new IllegalArgumentException(xe_1.a(25100, 27186));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xe_1.a(illegalArgumentException);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xe_1.a(illegalArgumentException);
                    }
                }
                f11 = n10;
            }
            try {
                if (string != null) break block16;
                if (f11 < 0) throw new IllegalArgumentException(xe_1.a(25099, 12627));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw xe_1.a(illegalArgumentException);
            }
            f11 = n10;
        }
        try {
            if (f11 > xe_1.a(30224, 5179788377024371308L)) {
                throw new IllegalArgumentException(xe_1.a(25099, 12627));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw xe_1.a(illegalArgumentException);
        }
        this.M = n10;
        this.R = f10;
    }

    /*
     * Unable to fully structure code
     */
    public static Composite o(int var0, float var1_1) {
        var2_2 = ra_1.c();
        try {
            v0 = var0;
            if (var2_2 == null) {
            }
            ** GOTO lbl12
        }
        catch (IllegalArgumentException v1) {
            throw xe_1.a(v1);
        }
        {
            ** switch (v0)
        }
lbl-1000:
        // 1 sources

        {
            case 0: {
                v0 = 3;
lbl12:
                // 2 sources

                return AlphaComposite.getInstance(v0, var1_1);
            }
lbl13:
            // 1 sources

            case 1: {
                return new ro_1(var1_1);
            }
lbl15:
            // 1 sources

            case 2: {
                return new zZ(var1_1);
            }
lbl17:
            // 1 sources

            case 3: {
                return new r5_0(var1_1);
            }
lbl19:
            // 1 sources

            case 4: {
                return new zL(var1_1);
            }
lbl21:
            // 1 sources

            case 5: {
                return new ro_2(var1_1);
            }
lbl23:
            // 1 sources

            case 6: {
                return new r2_0(var1_1);
            }
lbl25:
            // 1 sources

            case 7: {
                return new r3_0(var1_1);
            }
lbl27:
            // 1 sources

            case 8: {
                return new zm_0(var1_1);
            }
lbl29:
            // 1 sources

            case 9: {
                return new zv_0(var1_1);
            }
lbl31:
            // 1 sources

            case 10: {
                return new rw_1(var1_1);
            }
lbl33:
            // 1 sources

            case 11: {
                return new rc_1(var1_1);
            }
lbl35:
            // 1 sources

            case 12: {
                return new z_(var1_1);
            }
lbl37:
            // 1 sources

            case 13: {
                return new zG(var1_1);
            }
lbl39:
            // 1 sources

            case 14: {
                return new zX(var1_1);
            }
lbl41:
            // 1 sources

            case 15: {
                return new ri_1(var1_1);
            }
lbl43:
            // 1 sources

            case 16: {
                return new zp_0(var1_1);
            }
lbl45:
            // 1 sources

            case 17: {
                return new zt_0(var1_1);
            }
lbl47:
            // 1 sources

            case 18: {
                return new rn_2(var1_1);
            }
lbl49:
            // 1 sources

            case 19: {
                return new z6(var1_1);
            }
lbl51:
            // 1 sources

            case 20: {
                return new rm_1(var1_1);
            }
lbl53:
            // 1 sources

            case 21: {
                return new zj_0(var1_1);
            }
lbl55:
            // 1 sources

            case 22: {
                return new rs_2(var1_1);
            }
lbl57:
            // 1 sources

            case 23: {
                return AlphaComposite.getInstance(xe_1.a(6613, 4895428862574458298L), var1_1);
            }
lbl59:
            // 1 sources

            case 24: {
                return AlphaComposite.getInstance(xe_1.a(26424, 2420176805014375253L), var1_1);
            }
        }
lbl61:
        // 1 sources

        return new xe_1(var0, var1_1);
    }

    @Override
    public CompositeContext createContext(ColorModel colorModel, ColorModel colorModel2, RenderingHints renderingHints) {
        return new B0(this.M, this.R, colorModel, colorModel2);
    }

    public float j() {
        return this.R;
    }

    public int K() {
        return this.M;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.R) * xe_1.a(25416, 7235520155858505522L) + this.M;
    }

    public boolean equals(Object object) {
        boolean bl;
        block16: {
            block17: {
                String string;
                block14: {
                    xe_1 xe_12;
                    block15: {
                        Object object2;
                        block12: {
                            block13: {
                                string = ra_1.c();
                                try {
                                    try {
                                        object2 = object;
                                        if (string != null) break block12;
                                        if (object2 instanceof xe_1) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw xe_1.a(illegalArgumentException);
                                    }
                                    return false;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw xe_1.a(illegalArgumentException);
                                }
                            }
                            object2 = object;
                        }
                        xe_12 = (xe_1)object2;
                        try {
                            try {
                                bl = this.M;
                                if (string != null) break block14;
                                if (bl == xe_12.M) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw xe_1.a(illegalArgumentException);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw xe_1.a(illegalArgumentException);
                        }
                    }
                    float f10 = this.R - xe_12.R;
                    bl = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        if (string != null) break block16;
                        if (!bl) break block17;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw xe_1.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw xe_1.a(illegalArgumentException);
                }
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[27];
                        var11_1 = 0;
                        var10_2 = "\u00b7\u009d-'\n\u00c3r\u0003\u00a4\u00e3\u00e0\u0007\u00ee\u00cf\u00a8\u008b\u00ed\r2\n\u00f6M\u00e0\u00fc\u00df\u001a\"0\u00c9\u00ca\u0003\r\f\u00fc\u000b\u0013\u0089\\dH\t\u00d6H\u0087\u0095\u00c5\b\u0090J\u00e3^\u00a4f\u001b\u00e9\u0007\u00f9\u0094\u0085\u00e0Ef\u0097\u0006_*,\u00db\u008c4\bp?,\u00f0\u0089\u00a2\u00c9O\u0018\u008e-\u0095\u0094\u00fd\u00f0#yEn\u0094f\u0013:\u00b6I:\u00d3\u00b5\u0085T\u00c0U\u00a7\n]v\u0087Z.|\u0085\u0002\u00f8\u00a6\n\u00bfr\u00c3\u00ce\u00a0D\u00fb\u008e\u001f\u0082\u0016\u00c4\u00abQ\u0000\u0013\u00f3)\u00e5\u0010\u008e\u00d8s\u0093\u00c4\u00bb\u0004/\u00e2\u000e*6\u00d9\u0006\u00a6nX\u009a\u0006\u00d8\n\b\u00e3\u001b\u009f\u001f+O\u00d8\u00cc\u00d8\u0005|\u00ac\u00b1\u00c0\u00f5\t8\u00b5Jj\u00f6'\u00db\u00eaq\n\u0092\u00fb\u0081\u00e5\u00afC\u00fe\u0018\u0080\u00bc\u0007\u0007\u00fb\u00c5SB\u0087\u008c\n_q\u00a1\u00bfxt\u00e5\u000eeG\u0006mR\u009f\u0098\u00fa\u0093\t-yR\u008c`$\u0019\u00d4\u00fc\u0005\u00b8h\u00c6P\u0005\u0004\u008f\u0018\u00f0\u000e";
                        var12_3 = "\u00b7\u009d-'\n\u00c3r\u0003\u00a4\u00e3\u00e0\u0007\u00ee\u00cf\u00a8\u008b\u00ed\r2\n\u00f6M\u00e0\u00fc\u00df\u001a\"0\u00c9\u00ca\u0003\r\f\u00fc\u000b\u0013\u0089\\dH\t\u00d6H\u0087\u0095\u00c5\b\u0090J\u00e3^\u00a4f\u001b\u00e9\u0007\u00f9\u0094\u0085\u00e0Ef\u0097\u0006_*,\u00db\u008c4\bp?,\u00f0\u0089\u00a2\u00c9O\u0018\u008e-\u0095\u0094\u00fd\u00f0#yEn\u0094f\u0013:\u00b6I:\u00d3\u00b5\u0085T\u00c0U\u00a7\n]v\u0087Z.|\u0085\u0002\u00f8\u00a6\n\u00bfr\u00c3\u00ce\u00a0D\u00fb\u008e\u001f\u0082\u0016\u00c4\u00abQ\u0000\u0013\u00f3)\u00e5\u0010\u008e\u00d8s\u0093\u00c4\u00bb\u0004/\u00e2\u000e*6\u00d9\u0006\u00a6nX\u009a\u0006\u00d8\n\b\u00e3\u001b\u009f\u001f+O\u00d8\u00cc\u00d8\u0005|\u00ac\u00b1\u00c0\u00f5\t8\u00b5Jj\u00f6'\u00db\u00eaq\n\u0092\u00fb\u0081\u00e5\u00afC\u00fe\u0018\u0080\u00bc\u0007\u0007\u00fb\u00c5SB\u0087\u008c\n_q\u00a1\u00bfxt\u00e5\u000eeG\u0006mR\u009f\u0098\u00fa\u0093\t-yR\u008c`$\u0019\u00d4\u00fc\u0005\u00b8h\u00c6P\u0005\u0004\u008f\u0018\u00f0\u000e".length();
                        var9_4 = 7;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 14;
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
                            var10_2 = "\n\u00f7\u00c1\u0016D\u00f5\u00c4\u0098\u00e73\b'\u00fd\u00db\tr\u0084\u00da>";
                            var12_3 = "\n\u00f7\u00c1\u0016D\u00f5\u00c4\u0098\u00e73\b'\u00fd\u00db\tr\u0084\u00da>".length();
                            var9_4 = 10;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 65;
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
                                    v15 = 4;
                                    break;
                                }
                                case 1: {
                                    v15 = 82;
                                    break;
                                }
                                case 2: {
                                    v15 = 54;
                                    break;
                                }
                                case 3: {
                                    v15 = 61;
                                    break;
                                }
                                case 4: {
                                    v15 = 89;
                                    break;
                                }
                                case 5: {
                                    v15 = 79;
                                    break;
                                }
                                default: {
                                    v15 = 67;
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
                xe_1.a = var13;
                xe_1.b = new String[27];
                var0_7 = 6379601575278870042L;
                var6_8 = new long[24];
                var3_9 = 0;
                var4_10 = "uA\u0013D\u0080\u00b2\u00a3fR/\u0093\u00b4C\u0081uGY\u0003\u0091z\u00f1\u0095\u0090\ri\u00efW\u0094\u000f\u00f5\u000b\u00a6\u00a1\u001c\u00c8\u009f\u00bd\u00b5\u00f5\u00de\u000e\u00dee\u00e1E` \u009f\u009d\u00a9\u00ae\u00a7\u0001\u00c6>\u00c8\u00d3A\u00d2\u0086\u0092Ow\u00df\u00f7\u0014i!\u0091\u00d5\u00d0\u0019\u00d0\u00eeS\u00aa,[\u0085.\u00e5'\u009dv\u0083V\u00e3\u00bb9\u0093\u00cb6|\u00deW\u00fcG3\u00c5\u00ea=\u00e7\u00de\u0091\u00803x\u009f\u00e7GitL\u00a1f\u00e2>\u0099/Y\u007f\u0083\u00c5I\u00c88\u00eaA\u00a0k\u00b7\u00e5\u00d78\u00e4n\u001c'\f\u00a7/\u00b6\u00df\u001c\u00bfr\u00b5\u00d1u=\u00d1x6>\u00f9\u0081ZR\u00d7[\u00de\u001f\u00bcxn\u00f7\u00b4\u0011S\n\u0086\u00a3\n\u00c9\u00c1[";
                var5_11 = "uA\u0013D\u0080\u00b2\u00a3fR/\u0093\u00b4C\u0081uGY\u0003\u0091z\u00f1\u0095\u0090\ri\u00efW\u0094\u000f\u00f5\u000b\u00a6\u00a1\u001c\u00c8\u009f\u00bd\u00b5\u00f5\u00de\u000e\u00dee\u00e1E` \u009f\u009d\u00a9\u00ae\u00a7\u0001\u00c6>\u00c8\u00d3A\u00d2\u0086\u0092Ow\u00df\u00f7\u0014i!\u0091\u00d5\u00d0\u0019\u00d0\u00eeS\u00aa,[\u0085.\u00e5'\u009dv\u0083V\u00e3\u00bb9\u0093\u00cb6|\u00deW\u00fcG3\u00c5\u00ea=\u00e7\u00de\u0091\u00803x\u009f\u00e7GitL\u00a1f\u00e2>\u0099/Y\u007f\u0083\u00c5I\u00c88\u00eaA\u00a0k\u00b7\u00e5\u00d78\u00e4n\u001c'\f\u00a7/\u00b6\u00df\u001c\u00bfr\u00b5\u00d1u=\u00d1x6>\u00f9\u0081ZR\u00d7[\u00de\u001f\u00bcxn\u00f7\u00b4\u0011S\n\u0086\u00a3\n\u00c9\u00c1[".length();
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
                    var4_10 = "k,\u0011\n\b$\u00f17c\u00a8\u00d2Y\u00cb\u00e8\u00f3N";
                    var5_11 = "k,\u0011\n\b$\u00f17c\u00a8\u00d2Y\u00cb\u00e8\u00f3N".length();
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
        xe_1.c = var6_8;
        xe_1.d = new Integer[24];
        v22 = new String[xe_1.a(5960, 4770100905705962285L)];
        v22[0] = xe_1.a(25096, -12717);
        v22[1] = xe_1.a(25095, -30307);
        v22[2] = xe_1.a(25103, 11841);
        v22[3] = xe_1.a(25108, 14149);
        v22[4] = xe_1.a(25088, -27383);
        v22[5] = xe_1.a(25102, -6689);
        v22[xe_1.a((int)13034, (long)2672101723793055363L)] = xe_1.a(25118, -9359);
        v22[xe_1.a((int)17798, (long)2786969710260562401L)] = xe_1.a(25093, -30005);
        v22[xe_1.a((int)17718, (long)4996545953349904713L)] = xe_1.a(25107, 970);
        v22[xe_1.a((int)19682, (long)7682195505541226626L)] = xe_1.a(25094, -8922);
        v22[xe_1.a((int)12570, (long)3440856087316028790L)] = xe_1.a(25105, -8840);
        v22[xe_1.a((int)17175, (long)7315226577212092265L)] = xe_1.a(25091, 417);
        v22[xe_1.a((int)17003, (long)7434427313452822031L)] = xe_1.a(25090, -215);
        v22[xe_1.a((int)30773, (long)1429094180163687510L)] = xe_1.a(25098, 25337);
        v22[xe_1.a((int)26016, (long)8463590439206488523L)] = xe_1.a(25097, -20445);
        v22[xe_1.a((int)9852, (long)5280110771164105220L)] = xe_1.a(25110, -13471);
        v22[xe_1.a((int)31519, (long)471142359762179966L)] = xe_1.a(25089, 4110);
        v22[xe_1.a((int)29142, (long)1927598891081014704L)] = xe_1.a(25119, 29444);
        v22[xe_1.a((int)15667, (long)1943201479516868945L)] = xe_1.a(25106, 6891);
        v22[xe_1.a((int)11435, (long)6824852017282990273L)] = xe_1.a(25111, 8194);
        v22[xe_1.a((int)621, (long)3223841622321098243L)] = xe_1.a(25104, -13874);
        v22[xe_1.a((int)19822, (long)9041165123815874835L)] = xe_1.a(25116, -30422);
        v22[xe_1.a((int)26554, (long)1630083616886295506L)] = xe_1.a(25092, -9317);
        v22[xe_1.a((int)21295, (long)7474551084611878742L)] = xe_1.a(25109, 15045);
        v22[xe_1.a((int)24887, (long)5006629043784387916L)] = xe_1.a(25101, -11886);
        xe_1.Q = v22;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6206) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 234;
                    break;
                }
                case 1: {
                    n14 = 6;
                    break;
                }
                case 2: {
                    n14 = 227;
                    break;
                }
                case 3: {
                    n14 = 197;
                    break;
                }
                case 4: {
                    n14 = 85;
                    break;
                }
                case 5: {
                    n14 = 48;
                    break;
                }
                case 6: {
                    n14 = 237;
                    break;
                }
                case 7: {
                    n14 = 218;
                    break;
                }
                case 8: {
                    n14 = 26;
                    break;
                }
                case 9: {
                    n14 = 179;
                    break;
                }
                case 10: {
                    n14 = 192;
                    break;
                }
                case 11: {
                    n14 = 193;
                    break;
                }
                case 12: {
                    n14 = 99;
                    break;
                }
                case 13: {
                    n14 = 103;
                    break;
                }
                case 14: {
                    n14 = 132;
                    break;
                }
                case 15: {
                    n14 = 169;
                    break;
                }
                case 16: {
                    n14 = 141;
                    break;
                }
                case 17: {
                    n14 = 114;
                    break;
                }
                case 18: {
                    n14 = 13;
                    break;
                }
                case 19: {
                    n14 = 161;
                    break;
                }
                case 20: {
                    n14 = 129;
                    break;
                }
                case 21: {
                    n14 = 162;
                    break;
                }
                case 22: {
                    n14 = 138;
                    break;
                }
                case 23: {
                    n14 = 18;
                    break;
                }
                case 24: {
                    n14 = 245;
                    break;
                }
                case 25: {
                    n14 = 71;
                    break;
                }
                case 26: {
                    n14 = 52;
                    break;
                }
                case 27: {
                    n14 = 202;
                    break;
                }
                case 28: {
                    n14 = 46;
                    break;
                }
                case 29: {
                    n14 = 121;
                    break;
                }
                case 30: {
                    n14 = 201;
                    break;
                }
                case 31: {
                    n14 = 22;
                    break;
                }
                case 32: {
                    n14 = 126;
                    break;
                }
                case 33: {
                    n14 = 95;
                    break;
                }
                case 34: {
                    n14 = 226;
                    break;
                }
                case 35: {
                    n14 = 55;
                    break;
                }
                case 36: {
                    n14 = 111;
                    break;
                }
                case 37: {
                    n14 = 3;
                    break;
                }
                case 38: {
                    n14 = 155;
                    break;
                }
                case 39: {
                    n14 = 108;
                    break;
                }
                case 40: {
                    n14 = 176;
                    break;
                }
                case 41: {
                    n14 = 151;
                    break;
                }
                case 42: {
                    n14 = 29;
                    break;
                }
                case 43: {
                    n14 = 34;
                    break;
                }
                case 44: {
                    n14 = 21;
                    break;
                }
                case 45: {
                    n14 = 224;
                    break;
                }
                case 46: {
                    n14 = 16;
                    break;
                }
                case 47: {
                    n14 = 83;
                    break;
                }
                case 48: {
                    n14 = 172;
                    break;
                }
                case 49: {
                    n14 = 194;
                    break;
                }
                case 50: {
                    n14 = 160;
                    break;
                }
                case 51: {
                    n14 = 136;
                    break;
                }
                case 52: {
                    n14 = 228;
                    break;
                }
                case 53: {
                    n14 = 168;
                    break;
                }
                case 54: {
                    n14 = 148;
                    break;
                }
                case 55: {
                    n14 = 188;
                    break;
                }
                case 56: {
                    n14 = 106;
                    break;
                }
                case 57: {
                    n14 = 158;
                    break;
                }
                case 58: {
                    n14 = 217;
                    break;
                }
                case 59: {
                    n14 = 15;
                    break;
                }
                case 60: {
                    n14 = 156;
                    break;
                }
                case 61: {
                    n14 = 119;
                    break;
                }
                case 62: {
                    n14 = 249;
                    break;
                }
                case 63: {
                    n14 = 200;
                    break;
                }
                case 64: {
                    n14 = 220;
                    break;
                }
                case 65: {
                    n14 = 9;
                    break;
                }
                case 66: {
                    n14 = 73;
                    break;
                }
                case 67: {
                    n14 = 240;
                    break;
                }
                case 68: {
                    n14 = 41;
                    break;
                }
                case 69: {
                    n14 = 31;
                    break;
                }
                case 70: {
                    n14 = 242;
                    break;
                }
                case 71: {
                    n14 = 93;
                    break;
                }
                case 72: {
                    n14 = 187;
                    break;
                }
                case 73: {
                    n14 = 164;
                    break;
                }
                case 74: {
                    n14 = 166;
                    break;
                }
                case 75: {
                    n14 = 213;
                    break;
                }
                case 76: {
                    n14 = 175;
                    break;
                }
                case 77: {
                    n14 = 253;
                    break;
                }
                case 78: {
                    n14 = 25;
                    break;
                }
                case 79: {
                    n14 = 232;
                    break;
                }
                case 80: {
                    n14 = 60;
                    break;
                }
                case 81: {
                    n14 = 33;
                    break;
                }
                case 82: {
                    n14 = 180;
                    break;
                }
                case 83: {
                    n14 = 59;
                    break;
                }
                case 84: {
                    n14 = 115;
                    break;
                }
                case 85: {
                    n14 = 206;
                    break;
                }
                case 86: {
                    n14 = 45;
                    break;
                }
                case 87: {
                    n14 = 142;
                    break;
                }
                case 88: {
                    n14 = 81;
                    break;
                }
                case 89: {
                    n14 = 76;
                    break;
                }
                case 90: {
                    n14 = 203;
                    break;
                }
                case 91: {
                    n14 = 75;
                    break;
                }
                case 92: {
                    n14 = 250;
                    break;
                }
                case 93: {
                    n14 = 70;
                    break;
                }
                case 94: {
                    n14 = 67;
                    break;
                }
                case 95: {
                    n14 = 107;
                    break;
                }
                case 96: {
                    n14 = 11;
                    break;
                }
                case 97: {
                    n14 = 238;
                    break;
                }
                case 98: {
                    n14 = 254;
                    break;
                }
                case 99: {
                    n14 = 116;
                    break;
                }
                case 100: {
                    n14 = 20;
                    break;
                }
                case 101: {
                    n14 = 100;
                    break;
                }
                case 102: {
                    n14 = 209;
                    break;
                }
                case 103: {
                    n14 = 150;
                    break;
                }
                case 104: {
                    n14 = 89;
                    break;
                }
                case 105: {
                    n14 = 140;
                    break;
                }
                case 106: {
                    n14 = 80;
                    break;
                }
                case 107: {
                    n14 = 62;
                    break;
                }
                case 108: {
                    n14 = 230;
                    break;
                }
                case 109: {
                    n14 = 109;
                    break;
                }
                case 110: {
                    n14 = 38;
                    break;
                }
                case 111: {
                    n14 = 122;
                    break;
                }
                case 112: {
                    n14 = 153;
                    break;
                }
                case 113: {
                    n14 = 183;
                    break;
                }
                case 114: {
                    n14 = 196;
                    break;
                }
                case 115: {
                    n14 = 204;
                    break;
                }
                case 116: {
                    n14 = 222;
                    break;
                }
                case 117: {
                    n14 = 47;
                    break;
                }
                case 118: {
                    n14 = 44;
                    break;
                }
                case 119: {
                    n14 = 84;
                    break;
                }
                case 120: {
                    n14 = 198;
                    break;
                }
                case 121: {
                    n14 = 236;
                    break;
                }
                case 122: {
                    n14 = 24;
                    break;
                }
                case 123: {
                    n14 = 143;
                    break;
                }
                case 124: {
                    n14 = 184;
                    break;
                }
                case 125: {
                    n14 = 63;
                    break;
                }
                case 126: {
                    n14 = 4;
                    break;
                }
                case 127: {
                    n14 = 178;
                    break;
                }
                case 128: {
                    n14 = 37;
                    break;
                }
                case 129: {
                    n14 = 98;
                    break;
                }
                case 130: {
                    n14 = 135;
                    break;
                }
                case 131: {
                    n14 = 64;
                    break;
                }
                case 132: {
                    n14 = 77;
                    break;
                }
                case 133: {
                    n14 = 170;
                    break;
                }
                case 134: {
                    n14 = 57;
                    break;
                }
                case 135: {
                    n14 = 49;
                    break;
                }
                case 136: {
                    n14 = 137;
                    break;
                }
                case 137: {
                    n14 = 210;
                    break;
                }
                case 138: {
                    n14 = 154;
                    break;
                }
                case 139: {
                    n14 = 32;
                    break;
                }
                case 140: {
                    n14 = 17;
                    break;
                }
                case 141: {
                    n14 = 66;
                    break;
                }
                case 142: {
                    n14 = 43;
                    break;
                }
                case 143: {
                    n14 = 58;
                    break;
                }
                case 144: {
                    n14 = 112;
                    break;
                }
                case 145: {
                    n14 = 27;
                    break;
                }
                case 146: {
                    n14 = 117;
                    break;
                }
                case 147: {
                    n14 = 42;
                    break;
                }
                case 148: {
                    n14 = 171;
                    break;
                }
                case 149: {
                    n14 = 101;
                    break;
                }
                case 150: {
                    n14 = 248;
                    break;
                }
                case 151: {
                    n14 = 195;
                    break;
                }
                case 152: {
                    n14 = 105;
                    break;
                }
                case 153: {
                    n14 = 118;
                    break;
                }
                case 154: {
                    n14 = 50;
                    break;
                }
                case 155: {
                    n14 = 61;
                    break;
                }
                case 156: {
                    n14 = 94;
                    break;
                }
                case 157: {
                    n14 = 144;
                    break;
                }
                case 158: {
                    n14 = 149;
                    break;
                }
                case 159: {
                    n14 = 212;
                    break;
                }
                case 160: {
                    n14 = 7;
                    break;
                }
                case 161: {
                    n14 = 125;
                    break;
                }
                case 162: {
                    n14 = 185;
                    break;
                }
                case 163: {
                    n14 = 233;
                    break;
                }
                case 164: {
                    n14 = 127;
                    break;
                }
                case 165: {
                    n14 = 134;
                    break;
                }
                case 166: {
                    n14 = 72;
                    break;
                }
                case 167: {
                    n14 = 79;
                    break;
                }
                case 168: {
                    n14 = 65;
                    break;
                }
                case 169: {
                    n14 = 23;
                    break;
                }
                case 170: {
                    n14 = 229;
                    break;
                }
                case 171: {
                    n14 = 10;
                    break;
                }
                case 172: {
                    n14 = 113;
                    break;
                }
                case 173: {
                    n14 = 56;
                    break;
                }
                case 174: {
                    n14 = 174;
                    break;
                }
                case 175: {
                    n14 = 145;
                    break;
                }
                case 176: {
                    n14 = 88;
                    break;
                }
                case 177: {
                    n14 = 208;
                    break;
                }
                case 178: {
                    n14 = 130;
                    break;
                }
                case 179: {
                    n14 = 251;
                    break;
                }
                case 180: {
                    n14 = 102;
                    break;
                }
                case 181: {
                    n14 = 19;
                    break;
                }
                case 182: {
                    n14 = 39;
                    break;
                }
                case 183: {
                    n14 = 120;
                    break;
                }
                case 184: {
                    n14 = 96;
                    break;
                }
                case 185: {
                    n14 = 128;
                    break;
                }
                case 186: {
                    n14 = 74;
                    break;
                }
                case 187: {
                    n14 = 199;
                    break;
                }
                case 188: {
                    n14 = 97;
                    break;
                }
                case 189: {
                    n14 = 53;
                    break;
                }
                case 190: {
                    n14 = 1;
                    break;
                }
                case 191: {
                    n14 = 68;
                    break;
                }
                case 192: {
                    n14 = 133;
                    break;
                }
                case 193: {
                    n14 = 40;
                    break;
                }
                case 194: {
                    n14 = 159;
                    break;
                }
                case 195: {
                    n14 = 243;
                    break;
                }
                case 196: {
                    n14 = 0;
                    break;
                }
                case 197: {
                    n14 = 182;
                    break;
                }
                case 198: {
                    n14 = 2;
                    break;
                }
                case 199: {
                    n14 = 235;
                    break;
                }
                case 200: {
                    n14 = 104;
                    break;
                }
                case 201: {
                    n14 = 28;
                    break;
                }
                case 202: {
                    n14 = 86;
                    break;
                }
                case 203: {
                    n14 = 5;
                    break;
                }
                case 204: {
                    n14 = 186;
                    break;
                }
                case 205: {
                    n14 = 244;
                    break;
                }
                case 206: {
                    n14 = 152;
                    break;
                }
                case 207: {
                    n14 = 8;
                    break;
                }
                case 208: {
                    n14 = 252;
                    break;
                }
                case 209: {
                    n14 = 69;
                    break;
                }
                case 210: {
                    n14 = 181;
                    break;
                }
                case 211: {
                    n14 = 124;
                    break;
                }
                case 212: {
                    n14 = 211;
                    break;
                }
                case 213: {
                    n14 = 147;
                    break;
                }
                case 214: {
                    n14 = 223;
                    break;
                }
                case 215: {
                    n14 = 241;
                    break;
                }
                case 216: {
                    n14 = 36;
                    break;
                }
                case 217: {
                    n14 = 190;
                    break;
                }
                case 218: {
                    n14 = 231;
                    break;
                }
                case 219: {
                    n14 = 207;
                    break;
                }
                case 220: {
                    n14 = 91;
                    break;
                }
                case 221: {
                    n14 = 51;
                    break;
                }
                case 222: {
                    n14 = 14;
                    break;
                }
                case 223: {
                    n14 = 131;
                    break;
                }
                case 224: {
                    n14 = 247;
                    break;
                }
                case 225: {
                    n14 = 239;
                    break;
                }
                case 226: {
                    n14 = 92;
                    break;
                }
                case 227: {
                    n14 = 191;
                    break;
                }
                case 228: {
                    n14 = 246;
                    break;
                }
                case 229: {
                    n14 = 189;
                    break;
                }
                case 230: {
                    n14 = 173;
                    break;
                }
                case 231: {
                    n14 = 87;
                    break;
                }
                case 232: {
                    n14 = 146;
                    break;
                }
                case 233: {
                    n14 = 157;
                    break;
                }
                case 234: {
                    n14 = 30;
                    break;
                }
                case 235: {
                    n14 = 215;
                    break;
                }
                case 236: {
                    n14 = 221;
                    break;
                }
                case 237: {
                    n14 = 110;
                    break;
                }
                case 238: {
                    n14 = 205;
                    break;
                }
                case 239: {
                    n14 = 35;
                    break;
                }
                case 240: {
                    n14 = 219;
                    break;
                }
                case 241: {
                    n14 = 225;
                    break;
                }
                case 242: {
                    n14 = 167;
                    break;
                }
                case 243: {
                    n14 = 82;
                    break;
                }
                case 244: {
                    n14 = 54;
                    break;
                }
                case 245: {
                    n14 = 165;
                    break;
                }
                case 246: {
                    n14 = 78;
                    break;
                }
                case 247: {
                    n14 = 163;
                    break;
                }
                case 248: {
                    n14 = 177;
                    break;
                }
                case 249: {
                    n14 = 214;
                    break;
                }
                case 250: {
                    n14 = 216;
                    break;
                }
                case 251: {
                    n14 = 123;
                    break;
                }
                case 252: {
                    n14 = 12;
                    break;
                }
                case 253: {
                    n14 = 90;
                    break;
                }
                case 254: {
                    n14 = 139;
                    break;
                }
                default: {
                    n14 = 255;
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
            xe_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6C6C;
        if (d[n11] == null) {
            xe_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

