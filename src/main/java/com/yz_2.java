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

/*
 * Renamed from com.yz
 */
public class yz_2
implements ak_0 {
    private final Class U;
    private final ak_0 R;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public yz_2(Class clazz, ak_0 ak_02) {
        this.U = clazz;
        this.R = ak_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public final void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block31: {
            block29: {
                block30: {
                    var7_6 = var1_1.w;
                    var6_7 = nv_2.o();
                    v0 = var2_2;
                    if (var6_7 == null) break block29;
                    try {
                        block35: {
                            if (v0 != null) break block30;
                            break block35;
                            catch (IOException v1) {
                                throw yz_2.a(v1);
                            }
                        }
                        var7_6.x(EP.WriteNullListAsEmpty);
                        return;
                    }
                    catch (IOException v2) {
                        throw yz_2.a(v2);
                    }
                }
                v0 = var2_2;
            }
            var8_8 = (Object[])v0;
            var9_9 = var8_8.length;
            var10_10 = var1_1.W;
            var1_1.N(var10_10, var2_2, var3_3, 0);
            try {
                var7_6.T((char)yz_2.a(25451, 3583715369204173212L));
                for (var11_11 = 0; var11_11 < var9_9; ++var11_11) {
                    block33: {
                        block34: {
                            block40: {
                                block39: {
                                    block38: {
                                        block37: {
                                            block32: {
                                                if (var6_7 == null) break block31;
                                                try {
                                                    block36: {
                                                        if (var11_11 == 0) break block32;
                                                        break block36;
                                                        catch (IOException v3) {
                                                            throw yz_2.a(v3);
                                                        }
                                                    }
                                                    var7_6.T((char)yz_2.a(26204, 4233470457781374120L));
                                                }
                                                catch (IOException v4) {
                                                    throw yz_2.a(v4);
                                                }
                                            }
                                            var12_12 = var8_8[var11_11];
                                            v5 = var12_12;
                                            if (var6_7 == null) break block33;
                                            if (v5 != null) ** GOTO lbl84
                                            break block37;
                                            catch (IOException v6) {
                                                throw yz_2.a(v6);
                                            }
                                        }
                                        v7 = var7_6;
                                        if (var6_7 == null) break block34;
                                        break block38;
                                        catch (IOException v8) {
                                            throw yz_2.a(v8);
                                        }
                                    }
                                    if (!v7.I(EP.WriteNullStringAsEmpty)) ** GOTO lbl76
                                    break block39;
                                    catch (IOException v9) {
                                        throw yz_2.a(v9);
                                    }
                                }
                                if (!(var2_2 instanceof String[])) ** GOTO lbl76
                                break block40;
                                catch (IOException v10) {
                                    throw yz_2.a(v10);
                                }
                            }
                            try {
                                block41: {
                                    var7_6.y("");
                                    if (var6_7 != null) continue;
                                    break block41;
                                    catch (IOException v11) {
                                        throw yz_2.a(v11);
                                    }
                                }
                                v7 = var7_6.q(yz_2.a);
                            }
                            catch (IOException v12) {
                                throw yz_2.a(v12);
                            }
                        }
                        try {
                            if (var6_7 != null) continue;
lbl84:
                            // 2 sources

                            v5 = var12_12;
                        }
                        catch (IOException v13) {
                            throw yz_2.a(v13);
                        }
                    }
                    try {
                        if (v5.getClass() == this.U) {
                            this.R.u(var1_1, var12_12, var11_11, null, 0);
                            if (var6_7 != null) continue;
                        }
                    }
                    catch (IOException v14) {
                        throw yz_2.a(v14);
                    }
                    var13_13 = var1_1.E(var12_12.getClass());
                    var13_13.u(var1_1, var12_12, var11_11, null, 0);
                    if (var6_7 != null) continue;
                }
                var7_6.T((char)yz_2.a(24905, 7338755750487968703L));
            }
            finally {
                var1_1.W = var10_10;
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
                char[] cArray3 = "\u0005\u0014]\u0019".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 80;
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
                            n17 = 59;
                            break;
                        }
                        case 1: {
                            n17 = 49;
                            break;
                        }
                        case 2: {
                            n17 = 97;
                            break;
                        }
                        case 3: {
                            n17 = 37;
                            break;
                        }
                        case 4: {
                            n17 = 92;
                            break;
                        }
                        case 5: {
                            n17 = 19;
                            break;
                        }
                        default: {
                            n17 = 62;
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
        long l2 = 7806629674080850455L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00f5\u0089\u0087\u00ab\u00c9\u00ac\u0019\u00f5f\u00cb\u00f4'\u00dd\u0019\u001b\u00d0\u0080\u00aaC\u008c[\u00b7\u009e\u0093";
        int n19 = "\u00f5\u0089\u0087\u00ab\u00c9\u00ac\u0019\u00f5f\u00cb\u00f4'\u00dd\u0019\u001b\u00d0\u0080\u00aaC\u008c[\u00b7\u009e\u0093".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2AF6;
        if (c[n11] == null) {
            yz_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

