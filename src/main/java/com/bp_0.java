/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.X4;
import com.hi_0;
import com.nv_2;
import com.ok_0;
import com.yn_2;
import java.lang.reflect.Type;
import java.util.Collection;

/*
 * Renamed from com.Bp
 */
public class bp_0
implements X4 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        return bp_0.i(yn_22);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object i(yn_2 var0) {
        block52: {
            block50: {
                block51: {
                    block43: {
                        block53: {
                            block49: {
                                block47: {
                                    block48: {
                                        block44: {
                                            block41: {
                                                block42: {
                                                    block40: {
                                                        block38: {
                                                            block39: {
                                                                var2_1 = var0.N;
                                                                var1_2 = nv_2.o();
                                                                try {
                                                                    v0 = var2_1.P();
                                                                    v1 = 4;
                                                                    if (var1_2 == null) break block38;
                                                                    if (v0 != v1) break block39;
                                                                }
                                                                catch (hi_0 v2) {
                                                                    throw bp_0.a(v2);
                                                                }
                                                                var3_3 = var2_1.z();
                                                                var2_1.S(bp_0.a(1757, 8190228150506322112L));
                                                                return var3_3.toCharArray();
                                                            }
                                                            try {
                                                                v3 = var2_1;
                                                                if (var1_2 == null) break block40;
                                                                v0 = v3.P();
                                                                v1 = 2;
                                                            }
                                                            catch (hi_0 v4) {
                                                                throw bp_0.a(v4);
                                                            }
                                                        }
                                                        if (v0 == v1) {
                                                            var3_4 = var2_1.j();
                                                            var2_1.S(bp_0.a(3146, 1360900185944453718L));
                                                            return var3_4.toString().toCharArray();
                                                        }
                                                        v3 = var0.M();
                                                    }
                                                    var3_5 = v3;
                                                    try {
                                                        try {
                                                            v5 = var3_5 instanceof String;
                                                            if (var1_2 == null) break block41;
                                                            if (!v5) break block42;
                                                        }
                                                        catch (hi_0 v6) {
                                                            throw bp_0.a(v6);
                                                        }
                                                        return ((String)var3_5).toCharArray();
                                                    }
                                                    catch (hi_0 v7) {
                                                        throw bp_0.a(v7);
                                                    }
                                                }
                                                try {
                                                    v8 = var3_5;
                                                    if (var1_2 == null) break block43;
                                                    v5 = v8 instanceof Collection;
                                                }
                                                catch (hi_0 v9) {
                                                    throw bp_0.a(v9);
                                                }
                                            }
                                            if (!v5) break block53;
                                            var4_6 = (Collection)var3_5;
                                            var5_7 = 1;
                                            for (E var7_9 : var4_6) {
                                                block46: {
                                                    block45: {
                                                        try {
                                                            try {
                                                                try {
                                                                    v10 = var7_9 instanceof String;
                                                                    if (var1_2 == null) break block44;
                                                                    if (var1_2 == null) break block45;
                                                                }
                                                                catch (hi_0 v11) {
                                                                    throw bp_0.a(v11);
                                                                }
                                                                if (v10 != 0) {
                                                                }
                                                                ** GOTO lbl92
                                                            }
                                                            catch (hi_0 v12) {
                                                                throw bp_0.a(v12);
                                                            }
                                                            v13 = ((String)var7_9).length();
                                                        }
                                                        catch (hi_0 v14) {
                                                            throw bp_0.a(v14);
                                                        }
                                                    }
                                                    var8_11 = v13;
                                                    try {
                                                        try {
                                                            v15 = var8_11;
                                                            if (var1_2 == null) break block46;
                                                            if (!v15) {
                                                            }
                                                            ** GOTO lbl92
                                                        }
                                                        catch (hi_0 v16) {
                                                            throw bp_0.a(v16);
                                                        }
                                                        v15 = false;
                                                    }
                                                    catch (hi_0 v17) {
                                                        throw bp_0.a(v17);
                                                    }
                                                }
                                                var5_7 = v15;
                                                try {
                                                    if (var1_2 != null) break;
lbl92:
                                                    // 3 sources

                                                    if (var1_2 != null) continue;
                                                    break;
                                                }
                                                catch (hi_0 v18) {
                                                    throw bp_0.a(v18);
                                                }
                                            }
                                            v10 = var5_7;
                                        }
                                        try {
                                            try {
                                                if (var1_2 == null) break block47;
                                                if (v10 != 0) break block48;
                                            }
                                            catch (hi_0 v19) {
                                                throw bp_0.a(v19);
                                            }
                                            throw new hi_0(bp_0.a);
                                        }
                                        catch (hi_0 v20) {
                                            throw bp_0.a(v20);
                                        }
                                    }
                                    v10 = var4_6.size();
                                }
                                var6_8 = new char[v10];
                                var7_10 = 0;
                                for (E var9_13 : var4_6) {
                                    try {
                                        v21 = var6_8;
                                        if (var1_2 != null) {
                                            v21[var7_10++] = ((String)var9_13).charAt(0);
                                            if (var1_2 != null) continue;
                                            break;
                                        }
                                        break block49;
                                    }
                                    catch (hi_0 v22) {
                                        throw bp_0.a(v22);
                                    }
                                }
                                v21 = var6_8;
                            }
                            return v21;
                        }
                        v8 = var3_5;
                    }
                    try {
                        try {
                            if (var1_2 == null) break block50;
                            if (v8 != null) break block51;
                        }
                        catch (hi_0 v23) {
                            throw bp_0.a(v23);
                        }
                        v24 = null;
                        break block52;
                    }
                    catch (hi_0 v25) {
                        throw bp_0.a(v25);
                    }
                }
                v8 = var3_5;
            }
            v24 = ok_0.x(v8).toCharArray();
        }
        return v24;
    }

    @Override
    public int j() {
        return 4;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
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
                char[] cArray3 = "cH\u001bdU+' J\u00147Od'o\t\u0016,Z6\b]".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 101;
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
                            n17 = 101;
                            break;
                        }
                        case 1: {
                            n17 = 76;
                            break;
                        }
                        case 2: {
                            n17 = 16;
                            break;
                        }
                        case 3: {
                            n17 = 33;
                            break;
                        }
                        case 4: {
                            n17 = 94;
                            break;
                        }
                        case 5: {
                            n17 = 33;
                            break;
                        }
                        default: {
                            n17 = 54;
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
        long l2 = 3289317240382374229L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = " #\u00d4\u0093\u00b6\u00da9\u0085\u00b4\u0006.\u00b4\u007ft3\u0013";
        int n19 = " #\u00d4\u0093\u00b6\u00da9\u0085\u00b4\u0006.\u00b4\u007ft3\u0013".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7E1D;
        if (c[n11] == null) {
            bp_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

