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
import java.math.BigInteger;

public class OC
implements ak_0,
X4 {
    private static final BigInteger n;
    private static final BigInteger r;
    public static final OC Y;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block22: {
            block23: {
                block25: {
                    block24: {
                        block20: {
                            block21: {
                                var7_6 = var1_1.w;
                                var6_7 = nv_2.o();
                                try {
                                    try {
                                        v0 = var2_2;
                                        if (var6_7 == null) break block20;
                                        if (v0 != null) break block21;
                                    }
                                    catch (IOException v1) {
                                        throw OC.a(v1);
                                    }
                                    var7_6.x(EP.WriteNullNumberAsZero);
                                    return;
                                }
                                catch (IOException v2) {
                                    throw OC.a(v2);
                                }
                            }
                            v0 = var2_2;
                        }
                        var8_8 = (BigInteger)v0;
                        var9_9 = var8_8.toString();
                        try {
                            try {
                                try {
                                    try {
                                        if (var6_7 == null) break block22;
                                        if (var9_9.length() < OC.a(29975, 3999781338737589749L)) break block23;
                                    }
                                    catch (IOException v3) {
                                        throw OC.a(v3);
                                    }
                                    v4 = EP.a(var5_5, var7_6.q, EP.BrowserCompatible);
                                    if (var6_7 == null) break block24;
                                }
                                catch (IOException v5) {
                                    throw OC.a(v5);
                                }
                                if (v4 == 0) break block23;
                            }
                            catch (IOException v6) {
                                throw OC.a(v6);
                            }
                            v4 = var8_8.compareTo(OC.n);
                        }
                        catch (IOException v7) {
                            throw OC.a(v7);
                        }
                    }
                    try {
                        try {
                            if (var6_7 == null) break block25;
                            if (v4 >= 0) {
                            }
                            ** GOTO lbl58
                        }
                        catch (IOException v8) {
                            throw OC.a(v8);
                        }
                        v4 = var8_8.compareTo(OC.r);
                    }
                    catch (IOException v9) {
                        throw OC.a(v9);
                    }
                }
                try {
                    if (v4 <= 0) break block23;
lbl58:
                    // 2 sources

                    var7_6.y(var9_9);
                    return;
                }
                catch (IOException v10) {
                    throw OC.a(v10);
                }
            }
            var7_6.write(var9_9);
        }
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        return OC.T(yn_22);
    }

    public static Object T(yn_2 yn_22) {
        BigInteger bigInteger;
        block13: {
            P7 p7;
            block11: {
                P7 p72;
                block12: {
                    Object object;
                    String string;
                    block9: {
                        block10: {
                            P7 p73 = yn_22.N;
                            string = nv_2.o();
                            try {
                                object = p73;
                                if (string == null) break block9;
                                if (object.P() != 2) break block10;
                            }
                            catch (hi_0 hi_02) {
                                throw OC.a(hi_02);
                            }
                            String string2 = p73.c();
                            try {
                                p73.S(OC.a(9565, 7149477802582470078L));
                                if (string2.length() > OC.a(9120, 913574915494964033L)) {
                                    throw new hi_0(a);
                                }
                            }
                            catch (hi_0 hi_03) {
                                throw OC.a(hi_03);
                            }
                            return new BigInteger(string2);
                        }
                        object = yn_22.M();
                    }
                    p72 = object;
                    try {
                        try {
                            p7 = p72;
                            if (string == null) break block11;
                            if (p7 != null) break block12;
                        }
                        catch (hi_0 hi_04) {
                            throw OC.a(hi_04);
                        }
                        bigInteger = null;
                        break block13;
                    }
                    catch (hi_0 hi_05) {
                        throw OC.a(hi_05);
                    }
                }
                p7 = p72;
            }
            bigInteger = B8.I(p7);
        }
        return bigInteger;
    }

    @Override
    public int j() {
        return 2;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = "\fkVq@Y\u001bHaC}_^\u001b\u0007y".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 46;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 70;
                            break;
                        }
                        case 1: {
                            n17 = 32;
                            break;
                        }
                        case 2: {
                            n17 = 27;
                            break;
                        }
                        case 3: {
                            n17 = 54;
                            break;
                        }
                        case 4: {
                            n17 = 3;
                            break;
                        }
                        case 5: {
                            n17 = 22;
                            break;
                        }
                        default: {
                            n17 = 89;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 7256059134324069995L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00bc\u00cb\u00ae]2\u00ea\u00bb\u00c5\u0003'H\u00050-\u00eb\u008e$\u0011\u009dF;UB\u00d5";
        int n19 = "\u00bc\u00cb\u00ae]2\u00ea\u00bb\u00c5\u0003'H\u00050-\u00eb\u008e$\u0011\u009dF;UB\u00d5".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
        long l3 = 8102878438887834094L;
        long[] lArray2 = new long[2];
        int n22 = 0;
        String string2 = "\u008f\u00935\u0002`\u0014\u00c1\u00efpl\u00ca\u00fd\u009f\u00eb>\u0011";
        int n23 = "\u008f\u00935\u0002`\u0014\u00c1\u00efpl\u00ca\u00fd\u009f\u00eb>\u0011".length();
        int n24 = 0;
        do {
            byte[] byArray = string2.substring(n24, n24 += 8).getBytes("ISO-8859-1");
            int n25 = n22++;
            lArray2[n25] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l3;
        } while (n24 < n23);
        n = BigInteger.valueOf(lArray2[0]);
        r = BigInteger.valueOf(lArray2[1]);
        Y = new OC();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x48E3;
        if (c[n11] == null) {
            OC.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

