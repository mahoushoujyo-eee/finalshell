/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class HK
implements ParameterizedType {
    private final Type[] N;
    private final Type F;
    private final Type r;
    private static final long[] a;
    private static final Integer[] b;

    public HK(Type[] typeArray, Type type, Type type2) {
        this.N = typeArray;
        this.F = type;
        this.r = type2;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return this.N;
    }

    @Override
    public Type getOwnerType() {
        return this.F;
    }

    @Override
    public Type getRawType() {
        return this.r;
    }

    /*
     * Unable to fully structure code
     */
    public boolean equals(Object var1_1) {
        block17: {
            block18: {
                block19: {
                    block15: {
                        block16: {
                            block13: {
                                block14: {
                                    block12: {
                                        var2_2 = ph_0.u();
                                        v0 = this;
                                        if (var2_2 == 0) {
                                            if (v0 == var1_1) {
                                                return true;
                                            }
                                            v0 = var1_1;
                                        }
                                        if (v0 == null) break block12;
                                        v1 = this.getClass();
                                        if (var2_2 != 0) break block13;
                                        if (v1 == var1_1.getClass()) break block14;
                                    }
                                    return false;
                                }
                                v1 = var1_1;
                            }
                            var3_3 = (HK)v1;
                            v2 = this;
                            if (var2_2 == 0) {
                                if (!Arrays.equals(v2.N, var3_3.N)) {
                                    return false;
                                }
                                v2 = this.F;
                            }
                            if (var2_2 != 0) break block15;
                            if (v2 == null) break block16;
                            v2 = this.F;
                            if (var2_2 != 0) break block17;
                            if (v2.equals(var3_3.F)) break block18;
                            break block19;
                        }
                        v2 = var3_3.F;
                    }
                    if (var2_2 != 0) break block17;
                    if (v2 == null) break block18;
                }
                return false;
            }
            v2 = this.r;
        }
        if (var2_2 != 0) ** GOTO lbl43
        if (v2 != null) {
            v3 = this.r.equals(var3_3.r);
        } else {
            v2 = var3_3.r;
lbl43:
            // 2 sources

            v3 = v2 == null;
        }
        return v3;
    }

    /*
     * Unable to fully structure code
     */
    public int hashCode() {
        var1_1 = ph_0.w();
        v0 = this.N;
        if (var1_1 == 0) ** GOTO lbl6
        if (v0 != null) {
            v0 = this.N;
lbl6:
            // 2 sources

            v1 = Arrays.hashCode(v0);
        } else {
            v1 = 0;
        }
        var2_2 = v1;
        v2 = HK.a(9313, 5546234599347969587L) * var2_2;
        v3 = this.F;
        if (var1_1 == 0) ** GOTO lbl15
        if (v3 != null) {
            v3 = this.F;
lbl15:
            // 2 sources

            v4 = v3.hashCode();
        } else {
            v4 = 0;
        }
        var2_2 = v2 + v4;
        v5 = HK.a(1592, 1061809867294375019L) * var2_2;
        v6 = this.r;
        if (var1_1 == 0) ** GOTO lbl24
        if (v6 != null) {
            v6 = this.r;
lbl24:
            // 2 sources

            v7 = v6.hashCode();
        } else {
            v7 = 0;
        }
        var2_2 = v5 + v7;
        return var2_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8577501372899740196L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0014*\u001c\u00d6\u0007\u0000\u0094\b&yy\u0005O\b\u00b6P";
        int n11 = "\u0014*\u001c\u00d6\u0007\u0000\u0094\b&yy\u0005O\b\u00b6P".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7A52;
        if (b[n11] == null) {
            HK.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

