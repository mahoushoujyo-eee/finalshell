/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.EP;
import com.P7;
import com.X4;
import com.ak_0;
import com.hi_0;
import com.nl_1;
import com.nv_2;
import com.yn_2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/*
 * Renamed from com.kH
 */
public class kh_1
implements ak_0,
X4 {
    static final BigDecimal s;
    static final BigDecimal o;
    public static final kh_1 b;
    private static final String a;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block45: {
            block49: {
                block50: {
                    block51: {
                        block52: {
                            block47: {
                                block48: {
                                    block46: {
                                        block43: {
                                            var7_6 = var1_1.w;
                                            var6_7 = nv_2.o();
                                            try {
                                                block44: {
                                                    try {
                                                        try {
                                                            v0 = var2_2;
                                                            if (var6_7 == null) break block43;
                                                            if (v0 != null) break block44;
                                                        }
                                                        catch (IOException v1) {
                                                            throw kh_1.a(v1);
                                                        }
                                                        var7_6.x(EP.WriteNullNumberAsZero);
                                                        if (var6_7 != null) break block45;
                                                    }
                                                    catch (IOException v2) {
                                                        throw kh_1.a(v2);
                                                    }
                                                }
                                                v0 = var2_2;
                                            }
                                            catch (IOException v3) {
                                                throw kh_1.a(v3);
                                            }
                                        }
                                        var8_8 = (BigDecimal)v0;
                                        var9_9 = var8_8.scale();
                                        try {
                                            v4 = EP.a(var5_5, var7_6.q, EP.WriteBigDecimalAsPlain);
                                            if (var6_7 == null) break block46;
                                            if (v4 == 0) break block47;
                                        }
                                        catch (IOException v5) {
                                            throw kh_1.a(v5);
                                        }
                                        v4 = var9_9;
                                    }
                                    try {
                                        try {
                                            v6 = kh_1.a(10559, 5433898461633172947L);
                                            if (var6_7 == null) break block48;
                                            if (v4 < v6) break block47;
                                        }
                                        catch (IOException v7) {
                                            throw kh_1.a(v7);
                                        }
                                        v4 = var9_9;
                                        v6 = kh_1.a(16182, 2812286808471618527L);
                                    }
                                    catch (IOException v8) {
                                        throw kh_1.a(v8);
                                    }
                                }
                                if (v4 >= v6) break block47;
                                var10_10 = var8_8.toPlainString();
                                if (var6_7 != null) break block52;
                            }
                            var10_10 = var8_8.toString();
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v9 = var9_9;
                                                        if (var6_7 == null) break block49;
                                                        if (v9 != 0) break block50;
                                                    }
                                                    catch (IOException v10) {
                                                        throw kh_1.a(v10);
                                                    }
                                                    v9 = var10_10.length();
                                                    if (var6_7 == null) break block49;
                                                }
                                                catch (IOException v11) {
                                                    throw kh_1.a(v11);
                                                }
                                                if (v9 < kh_1.a(8932, 4420950594308038158L)) break block50;
                                            }
                                            catch (IOException v12) {
                                                throw kh_1.a(v12);
                                            }
                                            v9 = (int)EP.a(var5_5, var7_6.q, EP.BrowserCompatible);
                                            if (var6_7 == null) break block49;
                                        }
                                        catch (IOException v13) {
                                            throw kh_1.a(v13);
                                        }
                                        if (v9 == 0) break block50;
                                    }
                                    catch (IOException v14) {
                                        throw kh_1.a(v14);
                                    }
                                    v9 = var8_8.compareTo(kh_1.s);
                                    if (var6_7 == null) break block51;
                                }
                                catch (IOException v15) {
                                    throw kh_1.a(v15);
                                }
                                if (v9 >= 0) {
                                }
                                ** GOTO lbl108
                            }
                            catch (IOException v16) {
                                throw kh_1.a(v16);
                            }
                            v9 = var8_8.compareTo(kh_1.o);
                        }
                        catch (IOException v17) {
                            throw kh_1.a(v17);
                        }
                    }
                    try {
                        try {
                            if (var6_7 == null) break block49;
                            if (v9 <= 0) break block50;
                        }
                        catch (IOException v18) {
                            throw kh_1.a(v18);
                        }
lbl108:
                        // 2 sources

                        var7_6.y(var10_10);
                        return;
                    }
                    catch (IOException v19) {
                        throw kh_1.a(v19);
                    }
                }
                var7_6.write(var10_10);
                v9 = (int)var7_6.I(EP.WriteClassName);
            }
            try {
                try {
                    try {
                        if (v9 == 0 || var4_4 == BigDecimal.class) break block45;
                    }
                    catch (IOException v20) {
                        throw kh_1.a(v20);
                    }
                    if (var8_8.scale() != 0) break block45;
                }
                catch (IOException v21) {
                    throw kh_1.a(v21);
                }
                var7_6.write(kh_1.a(21860, 8601077452836284812L));
            }
            catch (IOException v22) {
                throw kh_1.a(v22);
            }
        }
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        try {
            return kh_1.K(yn_22);
        }
        catch (Exception exception) {
            throw new hi_0(a + object, exception);
        }
    }

    public static Object K(yn_2 yn_22) {
        BigDecimal bigDecimal;
        block14: {
            Object object;
            block12: {
                Object object2;
                block13: {
                    Object object3;
                    String string;
                    block11: {
                        int n10;
                        int n11;
                        P7 p7;
                        block9: {
                            block10: {
                                p7 = yn_22.N;
                                string = nv_2.o();
                                try {
                                    n11 = p7.P();
                                    n10 = 2;
                                    if (string == null) break block9;
                                    if (n11 != n10) break block10;
                                }
                                catch (hi_0 hi_02) {
                                    throw kh_1.a(hi_02);
                                }
                                BigDecimal bigDecimal2 = p7.c();
                                p7.S(kh_1.a(7068, 7656797340824233847L));
                                return bigDecimal2;
                            }
                            try {
                                object3 = p7;
                                if (string == null) break block11;
                                n11 = object3.P();
                                n10 = 3;
                            }
                            catch (hi_0 hi_03) {
                                throw kh_1.a(hi_03);
                            }
                        }
                        if (n11 == n10) {
                            BigDecimal bigDecimal3 = p7.c();
                            p7.S(kh_1.a(8932, 4420950594308038158L));
                            return bigDecimal3;
                        }
                        object3 = yn_22.M();
                    }
                    object2 = object3;
                    try {
                        try {
                            object = object2;
                            if (string == null) break block12;
                            if (object != null) break block13;
                        }
                        catch (hi_0 hi_04) {
                            throw kh_1.a(hi_04);
                        }
                        bigDecimal = null;
                        break block14;
                    }
                    catch (hi_0 hi_05) {
                        throw kh_1.a(hi_05);
                    }
                }
                object = object2;
            }
            bigDecimal = B8.b(object);
        }
        return bigDecimal;
    }

    @Override
    public int j() {
        return 2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block21: {
                    block20: {
                        block24: {
                            break block24;
lbl1:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        v0 = "1x\u0019\n!%]\"p\u0006\u0018(A]3k\u0004\u000bhA^(|\u0007\u001dd[\u0018".toCharArray();
                        v1 = v0.length;
                        var16 = 0;
                        v2 = 86;
                        v3 = v0;
                        v4 = v1;
                        if (v1 > 1) ** GOTO lbl54
                        do {
                            v5 = v2;
                            v3 = v3;
                            v6 = v3;
                            v7 = v2;
                            v8 = var16;
                            while (true) {
                                switch (var16 % 7) {
                                    case 0: {
                                        v9 = 23;
                                        break;
                                    }
                                    case 1: {
                                        v9 = 79;
                                        break;
                                    }
                                    case 2: {
                                        v9 = 61;
                                        break;
                                    }
                                    case 3: {
                                        v9 = 47;
                                        break;
                                    }
                                    case 4: {
                                        v9 = 18;
                                        break;
                                    }
                                    case 5: {
                                        v9 = 55;
                                        break;
                                    }
                                    default: {
                                        v9 = 110;
                                    }
                                }
                                v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                                ++var16;
                                v2 = v5;
                                if (v5 != 0) break;
                                v5 = v2;
                                v3 = v3;
                                v8 = v2;
                                v6 = v3;
                                v7 = v2;
                            }
lbl54:
                            // 2 sources

                            v10 = v3;
                            v4 = v4;
                        } while (v4 > var16);
                        ** while (true)
                        kh_1.a = new String(v10).intern();
                        var8_1 = 5422303921120307160L;
                        var14_2 = new long[5];
                        var11_3 = 0;
                        var12_4 = "~\u00c4{a\u007fx\u00cez*ni\u009b\u00cb\u00e2\u00a4c\u00abQ\u0082\u00e7e\u00dd9\u00c6";
                        var13_5 = "~\u00c4{a\u007fx\u00cez*ni\u009b\u00cb\u00e2\u00a4c\u00abQ\u0082\u00e7e\u00dd9\u00c6".length();
                        var10_6 = 0;
                        while (true) {
                            var15_7 = var12_4.substring(var10_6, var10_6 += 8).getBytes("ISO-8859-1");
                            v11 = var14_2;
                            v12 = var11_3++;
                            v13 = ((long)var15_7[0] & 255L) << 56 | ((long)var15_7[1] & 255L) << 48 | ((long)var15_7[2] & 255L) << 40 | ((long)var15_7[3] & 255L) << 32 | ((long)var15_7[4] & 255L) << 24 | ((long)var15_7[5] & 255L) << 16 | ((long)var15_7[6] & 255L) << 8 | (long)var15_7[7] & 255L;
                            v14 = -1;
                            break block20;
                            break;
                        }
lbl75:
                        // 1 sources

                        while (true) {
                            v11[v12] = v15;
                            if (var10_6 < var13_5) ** continue;
                            var12_4 = "d\u00ab#\u00a1:n\u0080\u00bf\u00b1@,\u00b5\u00aaEM\u0097";
                            var13_5 = "d\u00ab#\u00a1:n\u0080\u00bf\u00b1@,\u00b5\u00aaEM\u0097".length();
                            var10_6 = 0;
                            while (true) {
                                var15_7 = var12_4.substring(var10_6, var10_6 += 8).getBytes("ISO-8859-1");
                                v11 = var14_2;
                                v12 = var11_3++;
                                v13 = ((long)var15_7[0] & 255L) << 56 | ((long)var15_7[1] & 255L) << 48 | ((long)var15_7[2] & 255L) << 40 | ((long)var15_7[3] & 255L) << 32 | ((long)var15_7[4] & 255L) << 24 | ((long)var15_7[5] & 255L) << 16 | ((long)var15_7[6] & 255L) << 8 | (long)var15_7[7] & 255L;
                                v14 = 0;
                                break block20;
                                break;
                            }
                            break;
                        }
lbl88:
                        // 1 sources

                        while (true) {
                            v11[v12] = v15;
                            if (var10_6 < var13_5) ** continue;
                            break block21;
                            break;
                        }
                    }
                    v15 = v13 ^ var8_1;
                    switch (v14) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl99:
                        // 1 sources

                        ** continue;
                    }
                }
                kh_1.c = var14_2;
                kh_1.d = new Integer[5];
                var1_8 = 2977705624321985958L;
                var0_9 = new long[2];
                var4_10 = 0;
                var5_11 = ")M\u0010\u0082\u00e0\u009a\u00f2Y\u00d6\u00b2\u00ef}\u001fe\r\u00a7";
                var6_12 = ")M\u0010\u0082\u00e0\u009a\u00f2Y\u00d6\u00b2\u00ef}\u001fe\r\u00a7".length();
                var3_13 = 0;
                while (true) {
                    break block22;
                    break;
                }
lbl111:
                // 1 sources

                while (true) {
                    var0_9[v16] = (((long)var7_14[0] & 255L) << 56 | ((long)var7_14[1] & 255L) << 48 | ((long)var7_14[2] & 255L) << 40 | ((long)var7_14[3] & 255L) << 32 | ((long)var7_14[4] & 255L) << 24 | ((long)var7_14[5] & 255L) << 16 | ((long)var7_14[6] & 255L) << 8 | (long)var7_14[7] & 255L) ^ var1_8;
                    if (var3_13 < var6_12) ** continue;
                    break block23;
                    break;
                }
            }
            var7_14 = var5_11.substring(var3_13, var3_13 += 8).getBytes("ISO-8859-1");
            v16 = var4_10++;
            ** while (true)
        }
        kh_1.s = BigDecimal.valueOf(var0_9[1]);
        kh_1.o = BigDecimal.valueOf(var0_9[0]);
        kh_1.b = new kh_1();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7CE8;
        if (d[n11] == null) {
            kh_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

