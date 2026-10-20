/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hi_0;
import com.ps_0;

class P3
extends ps_0 {
    private final String F;
    private static final long[] a;
    private static final Integer[] b;

    public P3(String string) {
        this.F = string;
        this.c();
        this.N();
    }

    @Override
    void c() {
        block8: {
            block6: {
                ++this.p;
                String string = hi_0.C();
                try {
                    P3 p3;
                    block7: {
                        try {
                            try {
                                p3 = this;
                                if (string != null) break block6;
                                if (p3.p < this.F.length()) break block7;
                            }
                            catch (hi_0 hi_02) {
                                throw P3.a(hi_02);
                            }
                            this.D = '\u0000';
                            this.o = true;
                            if (string == null) break block8;
                        }
                        catch (hi_0 hi_03) {
                            throw P3.a(hi_03);
                        }
                    }
                    p3 = this;
                }
                catch (hi_0 hi_04) {
                    throw P3.a(hi_04);
                }
            }
            p3.D = this.F.charAt(this.p);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected final void B() {
        var1_2 = hi_0.C();
        for (var2_1 = this.p + 1; var2_1 < this.F.length(); ++var2_1) {
            block34: {
                var3_3 = this.F.charAt(var2_1);
                try {
                    block35: {
                        try {
                            try {
                                try {
                                    v0 = var3_3;
                                    v1 = P3.b(29902, 8841087341138747027L);
                                    if (var1_2 == null) {
                                        if (var1_2 != null) break block34;
                                    }
                                    ** GOTO lbl42
                                }
                                catch (hi_0 v2) {
                                    throw P3.a(v2);
                                }
                                if (v0 != v1) break block35;
                            }
                            catch (hi_0 v3) {
                                throw P3.a(v3);
                            }
                            if (var1_2 == null) break;
                        }
                        catch (hi_0 v4) {
                            throw P3.a(v4);
                        }
                    }
                    v5 = var3_3;
                    v6 = P3.b(10106, 6941471577648319777L);
                }
                catch (hi_0 v7) {
                    throw P3.a(v7);
                }
            }
            try {
                if (v5 != v6) continue;
                this.D = this.F.charAt(var2_1 + 1);
                this.p = var2_1 + 1;
                return;
            }
            catch (hi_0 v8) {
                throw P3.a(v8);
            }
        }
        this.c();
        do lbl-1000:
        // 4 sources

        {
            block41: {
                block40: {
                    block38: {
                        block36: {
                            block37: {
                                block39: {
                                    v0 = this.D;
                                    v1 = P3.b(21283, 4679770532779735418L);
lbl42:
                                    // 2 sources

                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (v0 != v1) break block36;
                                                    this.c();
                                                    v9 = this;
                                                    if (var1_2 != null) break block37;
                                                }
                                                catch (hi_0 v10) {
                                                    throw P3.a(v10);
                                                }
                                                v11 = v9.D;
                                                v12 = P3.b(11105, 8750538030182875449L);
                                                if (var1_2 != null) break block38;
                                            }
                                            catch (hi_0 v13) {
                                                throw P3.a(v13);
                                            }
                                            if (v11 != v12) break block39;
                                        }
                                        catch (hi_0 v14) {
                                            throw P3.a(v14);
                                        }
                                        this.c();
                                        this.c();
                                        this.c();
                                        this.c();
                                        this.c();
                                        if (var1_2 == null) ** GOTO lbl-1000
                                    }
                                    catch (hi_0 v15) {
                                        throw P3.a(v15);
                                    }
                                }
                                v9 = this;
                            }
                            v9.c();
                            if (var1_2 == null) ** GOTO lbl-1000
                        }
                        try {
                            v11 = this.D;
                            if (var1_2 != null) break block40;
                            v12 = P3.b(17077, 6777162843506125039L);
                        }
                        catch (hi_0 v16) {
                            throw P3.a(v16);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v11 == v12) {
                                    this.c();
                                    if (var1_2 == null) break;
                                }
                            }
                            catch (hi_0 v17) {
                                throw P3.a(v17);
                            }
                            v18 = this;
                            if (var1_2 != null) break block41;
                        }
                        catch (hi_0 v19) {
                            throw P3.a(v19);
                        }
                        v11 = (char)v18.o;
                    }
                    catch (hi_0 v20) {
                        throw P3.a(v20);
                    }
                }
                try {
                    try {
                        if (v11 != '\u0000' && var1_2 == null) break;
                    }
                    catch (hi_0 v21) {
                        throw P3.a(v21);
                    }
                    v18 = this;
                }
                catch (hi_0 v22) {
                    throw P3.a(v22);
                }
            }
            v18.c();
        } while (var1_2 == null);
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8019264614180948973L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "\u00ae\u00e4\u008f\u0005\u008c\u00b0\u00b2\u00cb\u0004t\u00caX\"\u0085J\u00a1\u00cd\u00ff\u00c6!\u0094/F\u00ee";
                var5_4 = "\u00ae\u00e4\u008f\u0005\u008c\u00b0\u00b2\u00cb\u0004t\u00caX\"\u0085J\u00a1\u00cd\u00ff\u00c6!\u0094/F\u00ee".length();
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
                    var4_3 = "k\u007f\u00b2\u009e\u00c05# \u00ecX\u00c0I\u00fc\u00da\u0095\"";
                    var5_4 = "k\u007f\u00b2\u009e\u00c05# \u00ecX\u00c0I\u00fc\u00da\u0095\"".length();
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
        P3.a = var6_1;
        P3.b = new Integer[5];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A59;
        if (b[n11] == null) {
            P3.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

