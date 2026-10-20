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
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * Renamed from com.ns
 */
public class ns_2
implements ak_0,
X4 {
    private NumberFormat m;
    public static ns_2 x;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public ns_2() {
    }

    public ns_2(DecimalFormat decimalFormat) {
        this.m = decimalFormat;
    }

    public ns_2(String string) {
        this(new DecimalFormat(string));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var7_6 = var1_1.w;
                        var6_7 = nv_2.o();
                        try {
                            try {
                                v0 = var2_2;
                                if (var6_7 == null) break block12;
                                if (v0 != null) break block13;
                            }
                            catch (IOException v1) {
                                throw ns_2.a(v1);
                            }
                            var7_6.x(EP.WriteNullNumberAsZero);
                            return;
                        }
                        catch (IOException v2) {
                            throw ns_2.a(v2);
                        }
                    }
                    v0 = var2_2;
                }
                var8_8 = ((Float)v0).floatValue();
                try {
                    try {
                        v3 = this.m;
                        if (var6_7 == null) break block14;
                        if (v3 != null) {
                        }
                        ** GOTO lbl37
                    }
                    catch (IOException v4) {
                        throw ns_2.a(v4);
                    }
                    v3 = this.m;
                }
                catch (IOException v5) {
                    throw ns_2.a(v5);
                }
            }
            var9_9 = v3.format(var8_8);
            try {
                var7_6.write(var9_9);
                if (var6_7 != null) break block15;
lbl37:
                // 2 sources

                var7_6.q(var8_8, true);
            }
            catch (IOException v6) {
                throw ns_2.a(v6);
            }
        }
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        try {
            return ns_2.K(yn_22);
        }
        catch (Exception exception) {
            throw new hi_0(a + object, exception);
        }
    }

    public static Object K(yn_2 yn_22) {
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
                                throw ns_2.a(hi_02);
                            }
                            String string2 = p7.c();
                            p7.S(ns_2.a(18838, 7229916549784059846L));
                            return Float.valueOf(Float.parseFloat(string2));
                        }
                        try {
                            object3 = p7;
                            if (string == null) break block11;
                            n11 = object3.P();
                            n10 = 3;
                        }
                        catch (hi_0 hi_03) {
                            throw ns_2.a(hi_03);
                        }
                    }
                    if (n11 == n10) {
                        float f10 = p7.I();
                        p7.S(ns_2.a(19288, 5241834458080460041L));
                        return Float.valueOf(f10);
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
                        throw ns_2.a(hi_04);
                    }
                    return null;
                }
                catch (hi_0 hi_05) {
                    throw ns_2.a(hi_05);
                }
            }
            object = object2;
        }
        return B8.h(object);
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
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "z\u001c+&0Mfd\u001ay0'sfxQy3<den]cu".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 56;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 50;
                            break;
                        }
                        case 1: {
                            n17 = 69;
                            break;
                        }
                        case 2: {
                            n17 = 97;
                            break;
                        }
                        case 3: {
                            n17 = 109;
                            break;
                        }
                        case 4: {
                            n17 = 109;
                            break;
                        }
                        case 5: {
                            n17 = 57;
                            break;
                        }
                        default: {
                            n17 = 49;
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
        long l2 = 8148701748040159117L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "!\u00e0\u0093w=\u00c0r\u0094;\u00e1\u0085\u001a)\u0011p[";
        int n19 = "!\u00e0\u0093w=\u00c0r\u0094;\u00e1\u0085\u001a)\u0011p[".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
        x = new ns_2();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7651;
        if (c[n11] == null) {
            ns_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

