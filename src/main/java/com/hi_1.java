/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;

/*
 * Renamed from com.hI
 */
public class hi_1
extends hn_1 {
    private int x;
    private int[] Q;
    private boolean h = false;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hi_1() {
        this.K(hi_1.a(30700, 4782267716416545402L));
    }

    public void K(int n10) {
        this.x = n10;
        this.h = false;
    }

    public int i() {
        return this.x;
    }

    protected void e() {
        block4: {
            int n10;
            String[] stringArray;
            block3: {
                this.Q = new int[hi_1.a(6579, 4774606376127745062L)];
                stringArray = W5.q();
                int n11 = this.x;
                if (stringArray == null) break block3;
                if (n11 == 1) break block4;
                n11 = n10 = 0;
            }
            while (n10 < hi_1.a(6595, 7968360735997119569L)) {
                this.Q[n10] = hi_1.a(8145, 7659024105586346574L) * (this.x * n10 / hi_1.a(6595, 7968360735997119569L)) / (this.x - 1);
                ++n10;
                if (stringArray != null) continue;
            }
        }
    }

    @Override
    public int C(int n10, int n11, int n12) {
        String[] stringArray = W5.q();
        int n13 = this.h;
        if (stringArray != null) {
            if (n13 == 0) {
                this.h = true;
                this.e();
            }
            n13 = n12 & hi_1.a(22430, 874410939915043343L);
        }
        int n14 = n13;
        int n15 = n12 >> hi_1.a(21985, 2575101647964635250L) & hi_1.a(1764, 1278512844339532659L);
        int n16 = n12 >> hi_1.a(3810, 3847332018334915442L) & hi_1.a(1764, 1278512844339532659L);
        int n17 = n12 & hi_1.a(1764, 1278512844339532659L);
        n15 = this.Q[n15];
        n16 = this.Q[n16];
        n17 = this.Q[n17];
        return n14 | n15 << hi_1.a(29441, 648856275684239007L) | n16 << hi_1.a(30431, 7393209237886378827L) | n17;
    }

    public String toString() {
        return a;
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
                v0 = "|\u0014%#liyo\u0014:8{h?E\u001egb0".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 82;
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
                                v9 = 109;
                                break;
                            }
                            case 1: {
                                v9 = 41;
                                break;
                            }
                            case 2: {
                                v9 = 27;
                                break;
                            }
                            case 3: {
                                v9 = 30;
                                break;
                            }
                            case 4: {
                                v9 = 76;
                                break;
                            }
                            case 5: {
                                v9 = 72;
                                break;
                            }
                            default: {
                                v9 = 4;
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
                hi_1.a = new String(v10).intern();
                var0_1 = 4784890934960561614L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "\u008c\u008d\u0011\u0093\u00ba\u009c?\u00b2I\u00e1\u009a\u000fD\u00eeNB,FX\u00f3\u00b5\u0015>\u008d\u00ff{\u00efR\u008c'P\u00e8\u00cb\u00dc\u00e8)4\b\u00d0\u009f,\"\u00a0c\u0018;\u001d\u00ac\u00e3\u0012\u00fe\u00b7\u001e\u0099F\u00b4;\u00abkh9\u0015\u009f\u00c1";
                var5_5 = "\u008c\u008d\u0011\u0093\u00ba\u009c?\u00b2I\u00e1\u009a\u000fD\u00eeNB,FX\u00f3\u00b5\u0015>\u008d\u00ff{\u00efR\u008c'P\u00e8\u00cb\u00dc\u00e8)4\b\u00d0\u009f,\"\u00a0c\u0018;\u001d\u00ac\u00e3\u0012\u00fe\u00b7\u001e\u0099F\u00b4;\u00abkh9\u0015\u009f\u00c1".length();
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
                    var4_4 = "O`\u0092\u00cf}>\u00bbA\u009c\u0081\u00a2Ep\u00efW\u007f";
                    var5_5 = "O`\u0092\u00cf}>\u00bbA\u009c\u0081\u00a2Ep\u00efW\u007f".length();
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
        hi_1.b = var6_2;
        hi_1.c = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5596;
        if (c[n11] == null) {
            hi_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

