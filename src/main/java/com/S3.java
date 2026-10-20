/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.et_0;
import com.pv_2;
import com.xf_1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class S3 {
    private static final et_0[] D;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @NotNull
    public xf_1 Y(@NotNull et_0 et_02) {
        String string = pv_2.r();
        et_0 et_03 = et_02;
        if (string == null) {
            if (et_03.h()) {
                int n10 = et_02.q();
                this.Z(n10);
                return this.S(n10);
            }
            et_03 = et_02;
        }
        return et_03.d();
    }

    @NotNull
    public abstract xf_1 S(int var1);

    @NotNull
    public xf_1 o(@NotNull et_0 et_02) {
        String string = pv_2.r();
        et_0 et_03 = et_02;
        if (string == null) {
            if (et_03.h()) {
                int n10 = et_02.q();
                this.Z(n10);
                return this.L(n10);
            }
            et_03 = et_02;
        }
        return et_03.d();
    }

    @NotNull
    protected abstract xf_1 L(int var1);

    private void Z(int n10) {
        block4: {
            block3: {
                int n11;
                block2: {
                    String string = pv_2.r();
                    n11 = n10;
                    if (string != null) break block2;
                    if (n11 < 0) break block3;
                    n11 = n10;
                }
                if (n11 < S3.a(6425, 8994121948444966418L)) break block4;
            }
            throw new AssertionError((Object)(a + n10));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public static et_0 M(int n10) {
        et_0 et_02;
        String string = pv_2.r();
        int n11 = n10;
        if (string == null) {
            if (n11 < S3.a(30551, 2287280385520521310L)) {
                et_02 = et_0.W(n10);
                return et_02;
            }
            n11 = n10;
        }
        et_02 = S3.l(n11);
        return et_02;
    }

    @Nullable
    private static et_0 l(int n10) {
        return n10 < S3.a(23908, 3995138339151247969L) ? D[n10 - S3.a(30551, 2287280385520521310L)] : null;
    }

    private static int V(int n10) {
        return n10 == 0 ? 0 : S3.a(27261, 8732011136451792247L) * n10 + S3.a(16559, 4317665702556362657L);
    }

    public xf_1 Q(et_0 et_02) {
        String string = pv_2.r();
        et_0 et_03 = et_02;
        if (string == null) {
            if (et_03.h()) {
                return D[et_02.q()].d();
            }
            et_03 = et_02;
        }
        return et_03.d();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block24: {
                    break block24;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u000b';_]\u0011b&,2H\u000fXxh'\"D\u000f^mh*8EAUxh\u0013g\u001c\u001e\u0004Vrh".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 14;
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
                                v9 = 70;
                                break;
                            }
                            case 1: {
                                v9 = 70;
                                break;
                            }
                            case 2: {
                                v9 = 89;
                                break;
                            }
                            case 3: {
                                v9 = 62;
                                break;
                            }
                            case 4: {
                                v9 = 33;
                                break;
                            }
                            case 5: {
                                v9 = 63;
                                break;
                            }
                            default: {
                                v9 = 5;
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
                S3.a = new String(v10).intern();
                var0_1 = 6314418097515618664L;
                var6_2 = new long[13];
                var3_3 = 0;
                var4_4 = "*\u0091\u00d5\u00122\u001a7\u00dc\u00c9\u00a8\u00f46\u009dF\u00a3\u00fb\u00dbx7\rju\u0006\u00fe\u00b0\u00b7\u00d0[\u000fY\u00129'.=\u00f1\u0091\u00af\u00ac\u00e3\u00a3};\u0096\u0091\u001c1&\u00b6`\u00a0;\u00bbA\u00ac7\u0005\u00d4\u00e1o\u00aa,_j\u00fc\u0010uG\u00fb\u00f4\u0000\u00d7\u0006m\u0085\u00ee\f\u0010\u001a\t\u0016q\u00fc\u00cf\u00ec\u00e1\u00a1$";
                var5_5 = "*\u0091\u00d5\u00122\u001a7\u00dc\u00c9\u00a8\u00f46\u009dF\u00a3\u00fb\u00dbx7\rju\u0006\u00fe\u00b0\u00b7\u00d0[\u000fY\u00129'.=\u00f1\u0091\u00af\u00ac\u00e3\u00a3};\u0096\u0091\u001c1&\u00b6`\u00a0;\u00bbA\u00ac7\u0005\u00d4\u00e1o\u00aa,_j\u00fc\u0010uG\u00fb\u00f4\u0000\u00d7\u0006m\u0085\u00ee\f\u0010\u001a\t\u0016q\u00fc\u00cf\u00ec\u00e1\u00a1$".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block22;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00d0$E^\u00c3\u00fa`-U[\u00ebMn\u00ff\u00f8\u0000";
                    var5_5 = "\u00d0$E^\u00c3\u00fa`-U[\u00ebMn\u00ff\u00f8\u0000".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block22;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block23;
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
        S3.b = var6_2;
        S3.c = new Integer[13];
        S3.D = new et_0[S3.a(9906, 3945939133176545717L)];
        for (var9_8 = 0; var9_8 < S3.a(21592, 4906348142446670679L); ++var9_8) {
            for (var10_9 = 0; var10_9 < S3.a(15982, 5993683201326356846L); ++var10_9) {
                for (var11_10 = 0; var11_10 < S3.a(15982, 5993683201326356846L); ++var11_10) {
                    S3.D[S3.a((int)27303, (long)1413575684069576111L) * var9_8 + S3.a((int)15982, (long)5993683201326356846L) * var10_9 + var11_10] = new et_0(S3.V(var9_8), S3.V(var10_9), S3.V(var11_10));
                }
            }
        }
        for (var9_8 = 0; var9_8 < S3.a(18083, 4114580108554232231L); ++var9_8) {
            var10_9 = S3.a(26432, 2777632759011000390L) * var9_8 + S3.a(26006, 8558524643293643419L);
            S3.D[S3.a((int)29024, (long)6442320397456987756L) + var9_8] = new et_0(var10_9, var10_9, var10_9);
        }
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x270C;
        if (c[n11] == null) {
            S3.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

