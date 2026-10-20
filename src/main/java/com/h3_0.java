/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;

/*
 * Renamed from com.h3
 */
public class h3_0
extends hn_1 {
    private int Z;
    private int n;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public h3_0() {
        this(h3_0.a(16606, 6965194478242854878L));
    }

    public h3_0(int n10) {
        this.m(n10);
    }

    public void m(int n10) {
        this.Z = n10;
        this.n = n10 << h3_0.a(32053, 5403877708249713207L);
    }

    public int c() {
        return this.Z;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        String[] stringArray = W5.q();
        int n13 = n12 & h3_0.a(19978, 7689350814121031947L);
        if (stringArray != null) {
            if (n13 != 0) {
                return n12 & h3_0.a(20537, 3921867766258263866L) | this.n;
            }
            n13 = n12;
        }
        return n13;
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
                v0 = "R4\f\u0001IZ\u001bE)\u0001\u0000HYUc>\u000e\rB\u0007\u001a?".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 54;
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
                                v9 = 39;
                                break;
                            }
                            case 1: {
                                v9 = 109;
                                break;
                            }
                            case 2: {
                                v9 = 86;
                                break;
                            }
                            case 3: {
                                v9 = 88;
                                break;
                            }
                            case 4: {
                                v9 = 13;
                                break;
                            }
                            case 5: {
                                v9 = 31;
                                break;
                            }
                            default: {
                                v9 = 2;
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
                h3_0.a = new String(v10).intern();
                var0_1 = 6613769134830532749L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "vP9\u00e6\u00ad\u00e4r\u00a2\u00c2\u0087\u00e0}\u00f3\u001b H";
                var5_5 = "vP9\u00e6\u00ad\u00e4r\u00a2\u00c2\u0087\u00e0}\u00f3\u001b H".length();
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
                    var4_4 = "Eb\u00b4w/)O\u00dbM\u00af\u00ce\u00ac\u000e\u000fA\u0086";
                    var5_5 = "Eb\u00b4w/)O\u00dbM\u00af\u00ce\u00ac\u000e\u000fA\u0086".length();
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
        h3_0.b = var6_2;
        h3_0.c = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3702;
        if (c[n11] == null) {
            h3_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

