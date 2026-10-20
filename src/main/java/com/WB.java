/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import java.io.IOException;
import java.lang.reflect.Type;

public class WB
implements ak_0 {
    public static WB Y;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    @Override
    public final void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block91: {
            block86: {
                block87: {
                    block88: {
                        block81: {
                            block82: {
                                block83: {
                                    block77: {
                                        block78: {
                                            block79: {
                                                block73: {
                                                    block74: {
                                                        block75: {
                                                            block69: {
                                                                block70: {
                                                                    block71: {
                                                                        block65: {
                                                                            block66: {
                                                                                block67: {
                                                                                    block63: {
                                                                                        block64: {
                                                                                            var7_6 = var1_1.w;
                                                                                            var6_7 = nv_2.o();
                                                                                            try {
                                                                                                try {
                                                                                                    v0 = var2_2;
                                                                                                    if (var6_7 == null) break block63;
                                                                                                    if (v0 != null) break block64;
                                                                                                }
                                                                                                catch (IOException v1) {
                                                                                                    throw WB.a(v1);
                                                                                                }
                                                                                                var7_6.x(EP.WriteNullListAsEmpty);
                                                                                                return;
                                                                                            }
                                                                                            catch (IOException v2) {
                                                                                                throw WB.a(v2);
                                                                                            }
                                                                                        }
                                                                                        v0 = var2_2;
                                                                                    }
                                                                                    try {
                                                                                        v3 = v0 instanceof int[];
                                                                                        if (var6_7 == null) break block65;
                                                                                        if (!v3) break block66;
                                                                                    }
                                                                                    catch (IOException v4) {
                                                                                        throw WB.a(v4);
                                                                                    }
                                                                                    var8_8 = (int[])var2_2;
                                                                                    var7_6.write(WB.a(18913, 7846542905544252198L));
                                                                                    for (var9_16 = 0; var9_16 < var8_8.length; ++var9_16) {
                                                                                        block68: {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var6_7 == null) break block67;
                                                                                                    if (var9_16 == 0) break block68;
                                                                                                }
                                                                                                catch (IOException v5) {
                                                                                                    throw WB.a(v5);
                                                                                                }
                                                                                                var7_6.write(WB.a(9376, 6835608769074493030L));
                                                                                            }
                                                                                            catch (IOException v6) {
                                                                                                throw WB.a(v6);
                                                                                            }
                                                                                        }
                                                                                        var7_6.v(var8_8[var9_16]);
                                                                                        if (var6_7 != null) continue;
                                                                                    }
                                                                                    var7_6.write(WB.a(3354, 7745441219909279710L));
                                                                                }
                                                                                return;
                                                                            }
                                                                            v3 = var2_2 instanceof short[];
                                                                        }
                                                                        try {
                                                                            if (var6_7 == null) break block69;
                                                                            if (!v3) break block70;
                                                                        }
                                                                        catch (IOException v7) {
                                                                            throw WB.a(v7);
                                                                        }
                                                                        var8_9 = (short[])var2_2;
                                                                        var7_6.write(WB.a(30554, 8385075334033024409L));
                                                                        for (var9_17 = 0; var9_17 < var8_9.length; ++var9_17) {
                                                                            block72: {
                                                                                try {
                                                                                    try {
                                                                                        if (var6_7 == null) break block71;
                                                                                        if (var9_17 == 0) break block72;
                                                                                    }
                                                                                    catch (IOException v8) {
                                                                                        throw WB.a(v8);
                                                                                    }
                                                                                    var7_6.write(WB.a(15665, 4376801414612086772L));
                                                                                }
                                                                                catch (IOException v9) {
                                                                                    throw WB.a(v9);
                                                                                }
                                                                            }
                                                                            var7_6.v(var8_9[var9_17]);
                                                                            if (var6_7 != null) continue;
                                                                        }
                                                                        var7_6.write(WB.a(17893, 773889578374698791L));
                                                                    }
                                                                    return;
                                                                }
                                                                v3 = var2_2 instanceof long[];
                                                            }
                                                            try {
                                                                if (var6_7 == null) break block73;
                                                                if (!v3) break block74;
                                                            }
                                                            catch (IOException v10) {
                                                                throw WB.a(v10);
                                                            }
                                                            var8_10 = (long[])var2_2;
                                                            var7_6.write(WB.a(30554, 8385075334033024409L));
                                                            for (var9_18 = 0; var9_18 < var8_10.length; ++var9_18) {
                                                                block76: {
                                                                    try {
                                                                        try {
                                                                            if (var6_7 == null) break block75;
                                                                            if (var9_18 == 0) break block76;
                                                                        }
                                                                        catch (IOException v11) {
                                                                            throw WB.a(v11);
                                                                        }
                                                                        var7_6.write(WB.a(15665, 4376801414612086772L));
                                                                    }
                                                                    catch (IOException v12) {
                                                                        throw WB.a(v12);
                                                                    }
                                                                }
                                                                var7_6.i(var8_10[var9_18]);
                                                                if (var6_7 != null) continue;
                                                            }
                                                            var7_6.write(WB.a(17893, 773889578374698791L));
                                                        }
                                                        return;
                                                    }
                                                    v3 = var2_2 instanceof boolean[];
                                                }
                                                try {
                                                    if (var6_7 == null) break block77;
                                                    if (!v3) break block78;
                                                }
                                                catch (IOException v13) {
                                                    throw WB.a(v13);
                                                }
                                                var8_11 = (boolean[])var2_2;
                                                var7_6.write(WB.a(30554, 8385075334033024409L));
                                                for (var9_19 = 0; var9_19 < var8_11.length; ++var9_19) {
                                                    block80: {
                                                        try {
                                                            try {
                                                                if (var6_7 == null) break block79;
                                                                if (var9_19 == 0) break block80;
                                                            }
                                                            catch (IOException v14) {
                                                                throw WB.a(v14);
                                                            }
                                                            var7_6.write(WB.a(15665, 4376801414612086772L));
                                                        }
                                                        catch (IOException v15) {
                                                            throw WB.a(v15);
                                                        }
                                                    }
                                                    var7_6.u(var8_11[var9_19]);
                                                    if (var6_7 != null) continue;
                                                }
                                                var7_6.write(WB.a(17893, 773889578374698791L));
                                            }
                                            return;
                                        }
                                        v3 = var2_2 instanceof float[];
                                    }
                                    try {
                                        if (var6_7 == null) break block81;
                                        if (!v3) break block82;
                                    }
                                    catch (IOException v16) {
                                        throw WB.a(v16);
                                    }
                                    var8_12 = (float[])var2_2;
                                    var7_6.write(WB.a(30554, 8385075334033024409L));
                                    for (var9_20 = 0; var9_20 < var8_12.length; ++var9_20) {
                                        block85: {
                                            block84: {
                                                try {
                                                    try {
                                                        if (var6_7 == null) break block83;
                                                        if (var9_20 == 0) break block84;
                                                    }
                                                    catch (IOException v17) {
                                                        throw WB.a(v17);
                                                    }
                                                    var7_6.write(WB.a(15665, 4376801414612086772L));
                                                }
                                                catch (IOException v18) {
                                                    throw WB.a(v18);
                                                }
                                            }
                                            var10_22 = var8_12[var9_20];
                                            try {
                                                try {
                                                    if (var6_7 == null) break block85;
                                                    if (Float.isNaN(var10_22)) {
                                                    }
                                                    ** GOTO lbl172
                                                }
                                                catch (IOException v19) {
                                                    throw WB.a(v19);
                                                }
                                                var7_6.Y();
                                            }
                                            catch (IOException v20) {
                                                throw WB.a(v20);
                                            }
                                        }
                                        try {
                                            if (var6_7 != null) continue;
lbl172:
                                            // 2 sources

                                            var7_6.q(Float.toString(var10_22));
                                            continue;
                                        }
                                        catch (IOException v21) {
                                            throw WB.a(v21);
                                        }
                                    }
                                    var7_6.write(WB.a(17893, 773889578374698791L));
                                }
                                return;
                            }
                            v3 = var2_2 instanceof double[];
                        }
                        try {
                            if (var6_7 == null) break block86;
                            if (!v3) break block87;
                        }
                        catch (IOException v22) {
                            throw WB.a(v22);
                        }
                        var8_13 = (double[])var2_2;
                        var7_6.write(WB.a(30554, 8385075334033024409L));
                        for (var9_21 = 0; var9_21 < var8_13.length; ++var9_21) {
                            block90: {
                                block89: {
                                    try {
                                        try {
                                            if (var6_7 == null) break block88;
                                            if (var9_21 == 0) break block89;
                                        }
                                        catch (IOException v23) {
                                            throw WB.a(v23);
                                        }
                                        var7_6.write(WB.a(15665, 4376801414612086772L));
                                    }
                                    catch (IOException v24) {
                                        throw WB.a(v24);
                                    }
                                }
                                var10_23 = var8_13[var9_21];
                                try {
                                    try {
                                        if (var6_7 == null) break block90;
                                        if (Double.isNaN(var10_23)) {
                                        }
                                        ** GOTO lbl220
                                    }
                                    catch (IOException v25) {
                                        throw WB.a(v25);
                                    }
                                    var7_6.Y();
                                }
                                catch (IOException v26) {
                                    throw WB.a(v26);
                                }
                            }
                            try {
                                if (var6_7 != null) continue;
lbl220:
                                // 2 sources

                                var7_6.q(Double.toString(var10_23));
                                continue;
                            }
                            catch (IOException v27) {
                                throw WB.a(v27);
                            }
                        }
                        var7_6.write(WB.a(17893, 773889578374698791L));
                    }
                    return;
                }
                try {
                    v28 = var2_2;
                    if (var6_7 == null) break block91;
                    v3 = v28 instanceof byte[];
                }
                catch (IOException v29) {
                    throw WB.a(v29);
                }
            }
            if (v3) {
                var8_14 = (byte[])var2_2;
                var7_6.B(var8_14);
                return;
            }
            v28 = var2_2;
        }
        var8_15 = (char[])v28;
        var7_6.v(var8_15);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5430100571168378078L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "J\u00a41\u0085o\u0019\u00fa\u0094\u00e3oQ>0\u00f0\u0097\u00a3\u00b8\u008bW\u0017\u008a\u007fS]\u00a1iD\u0011\u0095Bc\u0006";
                var5_4 = "J\u00a41\u0085o\u0019\u00fa\u0094\u00e3oQ>0\u00f0\u0097\u00a3\u00b8\u008bW\u0017\u008a\u007fS]\u00a1iD\u0011\u0095Bc\u0006".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "!\u00b0xj\u00b1E\u009b\u00a4w\u00ed\u009c\u00c6\f\u00ce\u00a9\u001c";
                    var5_4 = "!\u00b0xj\u00b1E\u009b\u00a4w\u00ed\u009c\u00c6\f\u00ce\u00a9\u001c".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        WB.a = var6_1;
        WB.b = new Integer[6];
        WB.Y = new WB();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x52C6;
        if (b[n11] == null) {
            WB.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

