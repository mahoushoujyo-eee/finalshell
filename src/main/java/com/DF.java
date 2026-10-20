/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nm_2;
import com.wa_0;
import java.nio.charset.StandardCharsets;

final class DF
implements Cloneable {
    boolean Y = false;
    private boolean j = false;
    int c;
    int i = DF.a(30904, 6057093035128584819L);
    byte[] L;
    byte[] Z;
    byte[] q;
    int F;
    long C;
    boolean D = false;
    long B = 0L;
    private static final String a;
    private static final long[] b;
    private static final Integer[] d;

    DF() {
    }

    void E(long l2) {
        this.B = l2;
    }

    long a() {
        return this.B;
    }

    /*
     * Unable to fully structure code
     */
    void O(int var1_1) {
        block16: {
            block13: {
                var2_2 = nm_2.g();
                try {
                    block14: {
                        try {
                            try {
                                try {
                                    v0 = 0;
                                    v1 = var1_1;
                                    if (var2_2 != null) break block13;
                                    if (v0 > v1) break block14;
                                }
                                catch (IllegalArgumentException v2) {
                                    throw DF.a(v2);
                                }
                                v0 = var1_1;
                                v1 = DF.a(28787, 7927466505301488304L);
                                if (var2_2 != null) break block13;
                            }
                            catch (IllegalArgumentException v3) {
                                throw DF.a(v3);
                            }
                            if (v0 > v1) {
                            }
                            ** GOTO lbl34
                        }
                        catch (IllegalArgumentException v4) {
                            throw DF.a(v4);
                        }
                    }
                    v0 = var1_1;
                    v1 = DF.a(2753, 5038628957861316609L);
                }
                catch (IllegalArgumentException v5) {
                    throw DF.a(v5);
                }
            }
            try {
                block15: {
                    try {
                        if (v0 != v1) break block15;
lbl34:
                        // 2 sources

                        this.i = var1_1;
                        if (var2_2 == null) break block16;
                    }
                    catch (IllegalArgumentException v6) {
                        throw DF.a(v6);
                    }
                }
                throw new IllegalArgumentException(DF.a + var1_1);
            }
            catch (IllegalArgumentException v7) {
                throw DF.a(v7);
            }
        }
    }

    int R() {
        return this.i;
    }

    void R(String string) {
        this.Z = string.getBytes(StandardCharsets.ISO_8859_1);
    }

    String q() {
        try {
            if (this.Z == null) {
                return "";
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw DF.a(illegalArgumentException);
        }
        return new String(this.Z, StandardCharsets.ISO_8859_1);
    }

    void y(String string) {
        this.q = string.getBytes(StandardCharsets.ISO_8859_1);
    }

    String h() {
        try {
            if (this.q == null) {
                return "";
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw DF.a(illegalArgumentException);
        }
        return new String(this.q, StandardCharsets.ISO_8859_1);
    }

    void U(long l2) {
        this.C = l2;
    }

    long P() {
        return this.C;
    }

    /*
     * Unable to fully structure code
     */
    void t(wa_0 var1_1) {
        block41: {
            block42: {
                block39: {
                    block40: {
                        block38: {
                            block37: {
                                block36: {
                                    block34: {
                                        block35: {
                                            block32: {
                                                block33: {
                                                    block31: {
                                                        block29: {
                                                            block30: {
                                                                var3_2 = 0;
                                                                var2_3 = nm_2.g();
                                                                try {
                                                                    v0 = this.Y;
                                                                    if (var2_3 != null) break block29;
                                                                    if (!v0) break block30;
                                                                }
                                                                catch (IllegalArgumentException v1) {
                                                                    throw DF.a(v1);
                                                                }
                                                                var3_2 |= 1;
                                                            }
                                                            try {
                                                                v2 = this;
                                                                if (var2_3 != null) break block31;
                                                                v0 = v2.j;
                                                            }
                                                            catch (IllegalArgumentException v3) {
                                                                throw DF.a(v3);
                                                            }
                                                        }
                                                        if (v0) {
                                                            var3_2 |= 2;
                                                        }
                                                        v2 = this;
                                                    }
                                                    try {
                                                        v4 = v2.L;
                                                        if (var2_3 != null) break block32;
                                                        if (v4 == null) break block33;
                                                    }
                                                    catch (IllegalArgumentException v5) {
                                                        throw DF.a(v5);
                                                    }
                                                    var3_2 |= 4;
                                                }
                                                v4 = this.Z;
                                            }
                                            try {
                                                if (var2_3 != null) break block34;
                                                if (v4 == null) break block35;
                                            }
                                            catch (IllegalArgumentException v6) {
                                                throw DF.a(v6);
                                            }
                                            var3_2 |= DF.a(22584, 9101383686785194750L);
                                        }
                                        v4 = this.q;
                                    }
                                    if (v4 != null) {
                                        var3_2 |= DF.a(665, 3596670563051176027L);
                                    }
                                    var4_4 = 0;
                                    try {
                                        v7 = var1_1.N;
                                        v8 = 1;
                                        if (var2_3 != null) break block36;
                                        if (v7 == v8) {
                                        }
                                        ** GOTO lbl61
                                    }
                                    catch (IllegalArgumentException v9) {
                                        throw DF.a(v9);
                                    }
                                    var4_4 |= 4;
                                    try {
                                        try {
                                            if (var2_3 == null) break block37;
lbl61:
                                            // 2 sources

                                            v10 = var1_1;
                                            if (var2_3 != null) break block38;
                                        }
                                        catch (IllegalArgumentException v11) {
                                            throw DF.a(v11);
                                        }
                                        v7 = v10.N;
                                        v8 = DF.a(10843, 4021362141561858193L);
                                    }
                                    catch (IllegalArgumentException v12) {
                                        throw DF.a(v12);
                                    }
                                }
                                if (v7 == v8) {
                                    var4_4 |= 2;
                                }
                            }
                            var1_1.C(DF.a(32090, 4334830446223228829L));
                            var1_1.a((byte)DF.a(24080, 888934181711895765L));
                            var1_1.a((byte)var3_2);
                            var1_1.a((byte)this.B);
                            var1_1.a((byte)(this.B >> DF.a(24080, 888934181711895765L)));
                            var1_1.a((byte)(this.B >> DF.a(12769, 514964352498053920L)));
                            var1_1.a((byte)(this.B >> DF.a(22608, 1293324846536022676L)));
                            var1_1.a((byte)var4_4);
                            v10 = var1_1;
                        }
                        try {
                            try {
                                v10.a((byte)this.i);
                                v13 = this.L;
                                if (var2_3 != null) break block39;
                                if (v13 == null) break block40;
                            }
                            catch (IllegalArgumentException v14) {
                                throw DF.a(v14);
                            }
                            var1_1.a((byte)this.L.length);
                            var1_1.a((byte)(this.L.length >> DF.a(24080, 888934181711895765L)));
                            var1_1.P(this.L, 0, this.L.length);
                        }
                        catch (IllegalArgumentException v15) {
                            throw DF.a(v15);
                        }
                    }
                    v13 = this.Z;
                }
                try {
                    try {
                        if (var2_3 != null) break block41;
                        if (v13 == null) break block42;
                    }
                    catch (IllegalArgumentException v16) {
                        throw DF.a(v16);
                    }
                    var1_1.P(this.Z, 0, this.Z.length);
                    var1_1.a((byte)0);
                }
                catch (IllegalArgumentException v17) {
                    throw DF.a(v17);
                }
            }
            v13 = this.q;
        }
        try {
            if (v13 != null) {
                var1_1.P(this.q, 0, this.q.length);
                var1_1.a((byte)0);
            }
        }
        catch (IllegalArgumentException v18) {
            throw DF.a(v18);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        DF dF;
        block11: {
            byte[] byArray;
            byte[] byArray2;
            DF dF2;
            block9: {
                int[] nArray;
                block10: {
                    block7: {
                        block8: {
                            dF2 = (DF)super.clone();
                            nArray = nm_2.g();
                            try {
                                byArray2 = dF2.L;
                                if (nArray != null) break block7;
                                if (byArray2 == null) break block8;
                            }
                            catch (CloneNotSupportedException cloneNotSupportedException) {
                                throw DF.a(cloneNotSupportedException);
                            }
                            byArray = new byte[dF2.L.length];
                            System.arraycopy(dF2.L, 0, byArray, 0, byArray.length);
                            dF2.L = byArray;
                        }
                        byArray2 = dF2.Z;
                    }
                    try {
                        if (nArray != null) break block9;
                        if (byArray2 == null) break block10;
                    }
                    catch (CloneNotSupportedException cloneNotSupportedException) {
                        throw DF.a(cloneNotSupportedException);
                    }
                    byArray = new byte[dF2.Z.length];
                    System.arraycopy(dF2.Z, 0, byArray, 0, byArray.length);
                    dF2.Z = byArray;
                }
                try {
                    dF = dF2;
                    if (nArray != null) break block11;
                    byArray2 = dF.q;
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    throw DF.a(cloneNotSupportedException);
                }
            }
            if (byArray2 != null) {
                byArray = new byte[dF2.q.length];
                System.arraycopy(dF2.q, 0, byArray, 0, byArray.length);
                dF2.q = byArray;
            }
            dF = dF2;
        }
        return dF;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u0003g?(".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 3;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 111;
                                break;
                            }
                            case 1: {
                                v9 = 23;
                                break;
                            }
                            case 2: {
                                v9 = 6;
                                break;
                            }
                            case 3: {
                                v9 = 11;
                                break;
                            }
                            case 4: {
                                v9 = 84;
                                break;
                            }
                            case 5: {
                                v9 = 76;
                                break;
                            }
                            default: {
                                v9 = 61;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
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
                } while (v4 > var8);
                ** while (true)
                DF.a = new String(v10).intern();
                var0_1 = 5123355951318460852L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "((\u00e6\u001a\u00e4\u00fdi\u00ff\u0004\u001b\u00eaj)u\u001b\t\\\u00e9s\u00a1\u00b4jaJ\u00af\u0085W\u00efv\u009a\u00da\u0084\u00d0\u0091\u00b3\u00f1?e\u00b3B\u0081?#\u0085\u00c3i\u001d6F\u00dd5P\u00a8\u00cf38\u00fa\u00186\u00d2a\u009b\u00b5i";
                var5_5 = "((\u00e6\u001a\u00e4\u00fdi\u00ff\u0004\u001b\u00eaj)u\u001b\t\\\u00e9s\u00a1\u00b4jaJ\u00af\u0085W\u00efv\u009a\u00da\u0084\u00d0\u0091\u00b3\u00f1?e\u00b3B\u0081?#\u0085\u00c3i\u001d6F\u00dd5P\u00a8\u00cf38\u00fa\u00186\u00d2a\u009b\u00b5i".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00aa\u00193c\u0018\u00c7\u00c1,\u00a6\u0017\u00e3P\u00dal\u00938";
                    var5_5 = "\u00aa\u00193c\u0018\u00c7\u00c1,\u00a6\u0017\u00e3P\u00dal\u00938".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
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
        DF.b = var6_2;
        DF.d = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2C2;
        if (d[n11] == null) {
            DF.d[n11] = (int)(b[n11] ^ l2);
        }
        return d[n11];
    }
}

