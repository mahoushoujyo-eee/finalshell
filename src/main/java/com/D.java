/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hi_0;
import com.rh_1;

public final class D
extends Enum {
    public static final D CamelCase;
    public static final D PascalCase;
    public static final D SnakeCase;
    public static final D KebabCase;
    public static final D NoChange;
    public static final D NeverUseThisValueExceptDefaultValue;
    private static final D[] c;
    private static final long[] a;
    private static final Integer[] b;

    public static D[] values() {
        return (D[])c.clone();
    }

    public static D valueOf(String string) {
        return Enum.valueOf(D.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private D() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    public String C(String var1_1) {
        var2_2 = hi_0.C();
        switch (rh_1.v[this.ordinal()]) {
            case 1: {
                var3_3 = new StringBuilder();
                for (var4_7 = 0; var4_7 < var1_1.length(); ++var4_7) {
                    v0 = var1_1;
                    if (var2_2 != null) ** GOTO lbl61
                    var5_11 = v0.charAt(var4_7);
                    try {
                        try {
                            v1 = var5_11;
                            v2 = D.a(5337, 7913302071303221641L);
                            if (var2_2 != null) ** GOTO lbl24
                            if (v1 >= v2) {
                            }
                            ** GOTO lbl55
                        }
                        catch (hi_0 v3) {
                            throw D.a(v3);
                        }
                        v1 = var5_11;
                        v2 = D.a(6965, 1904900952877284963L);
                    }
                    catch (hi_0 v4) {
                        throw D.a(v4);
                    }
lbl24:
                    // 2 sources

                    try {
                        try {
                            if (var2_2 != null) ** GOTO lbl37
                            if (v1 <= v2) {
                            }
                            ** GOTO lbl55
                        }
                        catch (hi_0 v5) {
                            throw D.a(v5);
                        }
                        v1 = var5_11;
                        v2 = D.a(19555, 1439012326727313716L);
                    }
                    catch (hi_0 v6) {
                        throw D.a(v6);
                    }
lbl37:
                    // 2 sources

                    var6_13 = (char)(v1 + v2);
                    try {
                        try {
                            if (var2_2 != null) ** GOTO lbl53
                            if (var4_7 > 0) {
                            }
                            ** GOTO lbl51
                        }
                        catch (hi_0 v7) {
                            throw D.a(v7);
                        }
                        var3_3.append((char)D.a(5855, 6994252397260387210L));
                    }
                    catch (hi_0 v8) {
                        throw D.a(v8);
                    }
lbl51:
                    // 2 sources

                    var3_3.append(var6_13);
lbl53:
                    // 2 sources

                    try {
                        if (var2_2 == null) continue;
lbl55:
                        // 3 sources

                        var3_3.append(var5_11);
                        continue;
                    }
                    catch (hi_0 v9) {
                        throw D.a(v9);
                    }
                }
                v0 = var3_3.toString();
lbl61:
                // 2 sources

                return v0;
            }
            case 2: {
                var3_4 = new StringBuilder();
                for (var4_8 = 0; var4_8 < var1_1.length(); ++var4_8) {
                    v10 = var1_1;
                    if (var2_2 != null) ** GOTO lbl120
                    var5_12 = v10.charAt(var4_8);
                    try {
                        try {
                            v11 = var5_12;
                            v12 = D.a(1410, 6148219698674049241L);
                            if (var2_2 != null) ** GOTO lbl83
                            if (v11 >= v12) {
                            }
                            ** GOTO lbl114
                        }
                        catch (hi_0 v13) {
                            throw D.a(v13);
                        }
                        v11 = var5_12;
                        v12 = D.a(24617, 3710020709208245619L);
                    }
                    catch (hi_0 v14) {
                        throw D.a(v14);
                    }
lbl83:
                    // 2 sources

                    try {
                        try {
                            if (var2_2 != null) ** GOTO lbl96
                            if (v11 <= v12) {
                            }
                            ** GOTO lbl114
                        }
                        catch (hi_0 v15) {
                            throw D.a(v15);
                        }
                        v11 = var5_12;
                        v12 = D.a(2110, 7895739788951104877L);
                    }
                    catch (hi_0 v16) {
                        throw D.a(v16);
                    }
lbl96:
                    // 2 sources

                    var6_14 = (char)(v11 + v12);
                    try {
                        try {
                            if (var2_2 != null) ** GOTO lbl112
                            if (var4_8 > 0) {
                            }
                            ** GOTO lbl110
                        }
                        catch (hi_0 v17) {
                            throw D.a(v17);
                        }
                        var3_4.append((char)D.a(20618, 266157132853999067L));
                    }
                    catch (hi_0 v18) {
                        throw D.a(v18);
                    }
lbl110:
                    // 2 sources

                    var3_4.append(var6_14);
lbl112:
                    // 2 sources

                    try {
                        if (var2_2 == null) continue;
lbl114:
                        // 3 sources

                        var3_4.append(var5_12);
                        continue;
                    }
                    catch (hi_0 v19) {
                        throw D.a(v19);
                    }
                }
                v10 = var3_4.toString();
lbl120:
                // 2 sources

                return v10;
            }
            case 3: {
                var3_5 = var1_1.charAt(0);
                try {
                    try {
                        v20 = var3_5;
                        v21 = D.a(27384, 3748293927315328940L);
                        if (var2_2 != null) ** GOTO lbl138
                        if (v20 >= v21) {
                        }
                        ** GOTO lbl142
                    }
                    catch (hi_0 v22) {
                        throw D.a(v22);
                    }
                    v20 = var3_5;
                    v21 = D.a(27046, 5250387992546004212L);
                }
                catch (hi_0 v23) {
                    throw D.a(v23);
                }
lbl138:
                // 2 sources

                if (v20 <= v21) {
                    var4_9 = var1_1.toCharArray();
                    var4_9[0] = (char)(var4_9[0] - D.a(2110, 7895739788951104877L));
                    return new String(var4_9);
                }
lbl142:
                // 3 sources

                return var1_1;
            }
            case 4: {
                var3_6 = var1_1.charAt(0);
                try {
                    try {
                        v24 = var3_6;
                        v25 = D.a(1410, 6148219698674049241L);
                        if (var2_2 != null) ** GOTO lbl160
                        if (v24 >= v25) {
                        }
                        ** GOTO lbl164
                    }
                    catch (hi_0 v26) {
                        throw D.a(v26);
                    }
                    v24 = var3_6;
                    v25 = D.a(24617, 3710020709208245619L);
                }
                catch (hi_0 v27) {
                    throw D.a(v27);
                }
lbl160:
                // 2 sources

                if (v24 <= v25) {
                    var4_10 = var1_1.toCharArray();
                    var4_10[0] = (char)(var4_10[0] + D.a(2110, 7895739788951104877L));
                    return new String(var4_10);
                }
lbl164:
                // 3 sources

                return var1_1;
            }
        }
        return var1_1;
    }

    private static D[] q() {
        D[] dArray = new D[D.a(24464, 4072187404589890249L)];
        dArray[0] = CamelCase;
        dArray[1] = PascalCase;
        dArray[2] = SnakeCase;
        dArray[3] = KebabCase;
        dArray[4] = NoChange;
        dArray[5] = NeverUseThisValueExceptDefaultValue;
        return dArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[6];
                        var12_1 = 0;
                        var11_2 = "\b\u0017v6>\u001e*9\u0005`#\u0016\u0013s0-'\u001a=\"m<,$\b4\u0003`\u0010'\u0011\f(\u0002A09\u0013\u001c4\u0002S43\u0007\f\t\u0013\u0013g4=1\b+\u0013\t\u001b\u0017h031\b+\u0013";
                        var13_3 = "\b\u0017v6>\u001e*9\u0005`#\u0016\u0013s0-'\u001a=\"m<,$\b4\u0003`\u0010'\u0011\f(\u0002A09\u0013\u001c4\u0002S43\u0007\f\t\u0013\u0013g4=1\b+\u0013\t\u001b\u0017h031\b+\u0013".length();
                        var10_4 = 10;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 35;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "/ \u007f\u0004\u0007%7\u0004\t2!]\u0007\u0003\b1\u0012*";
                            var13_3 = "/ \u007f\u0004\u0007%7\u0004\t2!]\u0007\u0003\b1\u0012*".length();
                            var10_4 = 8;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 26;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
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
                                    v15 = 123;
                                    break;
                                }
                                case 1: {
                                    v15 = 85;
                                    break;
                                }
                                case 2: {
                                    v15 = 38;
                                    break;
                                }
                                case 3: {
                                    v15 = 118;
                                    break;
                                }
                                case 4: {
                                    v15 = 124;
                                    break;
                                }
                                case 5: {
                                    v15 = 81;
                                    break;
                                }
                                default: {
                                    v15 = 74;
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
                var0_7 = 5250573959898731854L;
                var6_8 = new long[11];
                var3_9 = 0;
                var4_10 = "X\u00f5\u00d3\u00b6\u008d\u00f78\u0003\u007f\u00f9\u00eeg\u001e\u0000Y\u00c0\u00dc\u00b1\u00e0\u009a,\u009c\u00e0\u00b8\u0099x\u00b3%\u0012\u00ca$\u0086\u0000\u00f0\u0010\u0090\u00e3S|Z\u009b\u00ee\u00df\u00caV#\u00abw\u0010\u0098\u00d58*\u008f&\u009b\u00a69:\u009e\u0011\u00ccZ\u0083\u00c8m\u00f2\u0080f(\u00b5\u00d6";
                var5_11 = "X\u00f5\u00d3\u00b6\u008d\u00f78\u0003\u007f\u00f9\u00eeg\u001e\u0000Y\u00c0\u00dc\u00b1\u00e0\u009a,\u009c\u00e0\u00b8\u0099x\u00b3%\u0012\u00ca$\u0086\u0000\u00f0\u0010\u0090\u00e3S|Z\u009b\u00ee\u00df\u00caV#\u00abw\u0010\u0098\u00d58*\u008f&\u009b\u00a69:\u009e\u0011\u00ccZ\u0083\u00c8m\u00f2\u0080f(\u00b5\u00d6".length();
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
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u009d\u00d8\u00d0\u0086\u0013\u001dPg\u00bd\u00b7\u00d0'\u00df\u00c8o\u0081";
                    var5_11 = "\u009d\u00d8\u00d0\u0086\u0013\u001dPg\u00bd\u00b7\u00d0'\u00df\u00c8o\u0081".length();
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
lbl123:
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
lbl134:
                // 1 sources

                ** continue;
            }
        }
        D.a = var6_8;
        D.b = new Integer[11];
        D.CamelCase = new D(var8[3], 0);
        D.PascalCase = new D(var8[0], 1);
        D.SnakeCase = new D(var8[5], 2);
        D.KebabCase = new D(var8[2], 3);
        D.NoChange = new D(var8[4], 4);
        D.NeverUseThisValueExceptDefaultValue = new D(var8[1], 5);
        D.c = D.q();
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2553;
        if (b[n11] == null) {
            D.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

