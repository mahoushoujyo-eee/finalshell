/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.EP;
import com.O0;
import com.X4;
import com.ak_0;
import com.hi_0;
import com.nl_1;
import com.nv_2;
import com.ym_1;
import com.yn_2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Renamed from com.nf
 */
public class nf_2
implements ak_0,
X4 {
    public static nf_2 K;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long[] d;
    private static final Long[] e;

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        block25: {
            Class<Long> clazz;
            Type type2;
            ym_1 ym_12;
            block28: {
                int n11;
                String string;
                block27: {
                    long l2;
                    block26: {
                        Object object3;
                        block23: {
                            ym_12 = nl_12.w;
                            string = nv_2.o();
                            try {
                                block24: {
                                    try {
                                        try {
                                            object3 = object;
                                            if (string == null) break block23;
                                            if (object3 != null) break block24;
                                        }
                                        catch (IOException iOException) {
                                            throw nf_2.a(iOException);
                                        }
                                        ym_12.x(EP.WriteNullNumberAsZero);
                                        if (string != null) break block25;
                                    }
                                    catch (IOException iOException) {
                                        throw nf_2.a(iOException);
                                    }
                                }
                                object3 = object;
                            }
                            catch (IOException iOException) {
                                throw nf_2.a(iOException);
                            }
                        }
                        l2 = (Long)object3;
                        try {
                            try {
                                ym_12.i(l2);
                                n11 = ym_12.I(EP.WriteClassName);
                                if (string == null) break block26;
                                if (n11 == 0) break block25;
                            }
                            catch (IOException iOException) {
                                throw nf_2.a(iOException);
                            }
                            long l3 = l2 - nf_2.b(16959, 987461947919264311L);
                            n11 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                        }
                        catch (IOException iOException) {
                            throw nf_2.a(iOException);
                        }
                    }
                    try {
                        try {
                            if (string == null) break block27;
                            if (n11 > 0) break block25;
                        }
                        catch (IOException iOException) {
                            throw nf_2.a(iOException);
                        }
                        long l4 = l2 - nf_2.b(11781, 3365732554877142540L);
                        n11 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    }
                    catch (IOException iOException) {
                        throw nf_2.a(iOException);
                    }
                }
                try {
                    try {
                        try {
                            if (n11 < 0) break block25;
                            type2 = type;
                            clazz = Long.class;
                            if (string == null) break block28;
                        }
                        catch (IOException iOException) {
                            throw nf_2.a(iOException);
                        }
                        if (type2 == clazz) break block25;
                    }
                    catch (IOException iOException) {
                        throw nf_2.a(iOException);
                    }
                    type2 = type;
                    clazz = Long.TYPE;
                }
                catch (IOException iOException) {
                    throw nf_2.a(iOException);
                }
            }
            try {
                if (type2 != clazz) {
                    ym_12.write(nf_2.a(19245, 3390058184579769011L));
                }
            }
            catch (IOException iOException) {
                throw nf_2.a(iOException);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Object z(yn_2 var1_1, Type var2_2, Object var3_3) {
        block22: {
            var5_4 = var1_1.N;
            var4_5 = nv_2.o();
            try {
                block25: {
                    block24: {
                        block23: {
                            block21: {
                                var7_6 = var5_4.P();
                                try {
                                    v0 = var7_6;
                                    v1 = 2;
                                    if (var4_5 == null) break block21;
                                    if (v0 == v1) {
                                    }
                                    ** GOTO lbl19
                                }
                                catch (Exception v2) {
                                    throw nf_2.a(v2);
                                }
                                var8_8 = var5_4.f();
                                var5_4.S(nf_2.a(26847, 2591465812442005824L));
                                var6_12 = var8_8;
                                try {
                                    if (var4_5 != null) break block22;
lbl19:
                                    // 2 sources

                                    v0 = var7_6;
                                    v1 = 3;
                                }
                                catch (Exception v3) {
                                    throw nf_2.a(v3);
                                }
                            }
                            try {
                                if (var4_5 == null) break block23;
                                if (v0 == v1) {
                                }
                                ** GOTO lbl37
                            }
                            catch (Exception v4) {
                                throw nf_2.a(v4);
                            }
                            var8_9 = var5_4.c();
                            var6_12 = B8.X(var8_9);
                            try {
                                var5_4.S(nf_2.a(13077, 7943825789294615177L));
                                if (var4_5 != null) break block22;
lbl37:
                                // 2 sources

                                v0 = var7_6;
                                v1 = nf_2.a(5189, 3309280662843047384L);
                            }
                            catch (Exception v5) {
                                throw nf_2.a(v5);
                            }
                        }
                        if (v0 != v1) break block24;
                        var8_10 = new O0(true);
                        var1_1.u(var8_10);
                        var6_12 = B8.s(var8_10);
                        if (var4_5 != null) break block25;
                    }
                    var8_11 = var1_1.M();
                    var6_12 = B8.s(var8_11);
                }
                if (var6_12 == null) {
                    return null;
                }
            }
            catch (Exception var7_7) {
                throw new hi_0(nf_2.a + var3_3, var7_7);
            }
        }
        try {
            v6 /* !! */  = var2_2 == AtomicLong.class ? new AtomicLong(var6_12) : var6_12;
        }
        catch (Exception v7) {
            throw nf_2.a(v7);
        }
        return v6 /* !! */ ;
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
                        v0 = "\n\"J\u0017Z\n|\u0014$\u0018\u0001M4|\bo\u0018\u0002V#\u007f\u001ec\u0002D".toCharArray();
                        v1 = v0.length;
                        var16 = 0;
                        v2 = 38;
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
                                        v9 = 92;
                                        break;
                                    }
                                    case 1: {
                                        v9 = 101;
                                        break;
                                    }
                                    case 2: {
                                        v9 = 30;
                                        break;
                                    }
                                    case 3: {
                                        v9 = 66;
                                        break;
                                    }
                                    case 4: {
                                        v9 = 25;
                                        break;
                                    }
                                    case 5: {
                                        v9 = 96;
                                        break;
                                    }
                                    default: {
                                        v9 = 53;
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
                        nf_2.a = new String(v10).intern();
                        var8_1 = 7001742544990318785L;
                        var14_2 = new long[4];
                        var11_3 = 0;
                        var12_4 = "q\u009b#\u0091Q+R>\u0017L\u0085*l\u00cf\u00f1\u0091";
                        var13_5 = "q\u009b#\u0091Q+R>\u0017L\u0085*l\u00cf\u00f1\u0091".length();
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
                            var12_4 = "\u0088,\u00b9\u009f\u00ea\u009d*XO'\u0016U\u00b07\r\u0015";
                            var13_5 = "\u0088,\u00b9\u009f\u00ea\u009d*XO'\u0016U\u00b07\r\u0015".length();
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
                nf_2.b = var14_2;
                nf_2.c = new Integer[4];
                var0_8 = 1969704269030132951L;
                var6_9 = new long[2];
                var3_10 = 0;
                var4_11 = "\u0016\u00e1\u00e0\u00f0Q\u0012\u0019\u001f\u00ca\u001fO\u008aZw\n\u00db";
                var5_12 = "\u0016\u00e1\u00e0\u00f0Q\u0012\u0019\u001f\u00ca\u001fO\u008aZw\n\u00db".length();
                var2_13 = 0;
                while (true) {
                    break block22;
                    break;
                }
lbl111:
                // 1 sources

                while (true) {
                    var6_9[v16] = (((long)var7_14[0] & 255L) << 56 | ((long)var7_14[1] & 255L) << 48 | ((long)var7_14[2] & 255L) << 40 | ((long)var7_14[3] & 255L) << 32 | ((long)var7_14[4] & 255L) << 24 | ((long)var7_14[5] & 255L) << 16 | ((long)var7_14[6] & 255L) << 8 | (long)var7_14[7] & 255L) ^ var0_8;
                    if (var2_13 < var5_12) ** continue;
                    break block23;
                    break;
                }
            }
            var7_14 = var4_11.substring(var2_13, var2_13 += 8).getBytes("ISO-8859-1");
            v16 = var3_10++;
            ** while (true)
        }
        nf_2.d = var6_9;
        nf_2.e = new Long[2];
        nf_2.K = new nf_2();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x299E;
        if (c[n11] == null) {
            nf_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x2808) & Short.MAX_VALUE;
        if (e[n11] == null) {
            nf_2.e[n11] = d[n11] ^ l2;
        }
        return e[n11];
    }
}

