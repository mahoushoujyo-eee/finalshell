/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C4;
import com.hn_1;
import com.po_0;

/*
 * Renamed from com.hK
 */
public class hk_1
extends hn_1 {
    private po_0 T = new C4();
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hk_1() {
        this.O = true;
    }

    public hk_1(po_0 po_02) {
        this.O = true;
        this.T = po_02;
    }

    public void b(po_0 po_02) {
        this.T = po_02;
    }

    public po_0 V() {
        return this.T;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 >> hk_1.a(8894, 4382646432512655574L) & hk_1.a(3803, 2162513237436984496L);
        int n14 = n12 >> hk_1.a(7469, 1803053583597600583L) & hk_1.a(11155, 8441164637693430266L);
        int n15 = n12 & hk_1.a(11155, 8441164637693430266L);
        n12 = (n13 + n14 + n15) / 3;
        return this.T.D((float)n12 / 255.0f);
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
                v0 = "\\;>xj\u0004eS;=|m\u0007d1z".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 62;
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
                                v9 = 33;
                                break;
                            }
                            case 1: {
                                v9 = 106;
                                break;
                            }
                            case 2: {
                                v9 = 108;
                                break;
                            }
                            case 3: {
                                v9 = 41;
                                break;
                            }
                            case 4: {
                                v9 = 38;
                                break;
                            }
                            case 5: {
                                v9 = 73;
                                break;
                            }
                            default: {
                                v9 = 116;
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
                hk_1.a = new String(v10).intern();
                var0_1 = 4866861177277396545L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "\u0099\u00a0~\u000e\u00b2\u008c\u007fD*U\u00dd\u00b0\u00b0\u00ce\u00f6\u0087";
                var5_5 = "\u0099\u00a0~\u000e\u00b2\u008c\u007fD*U\u00dd\u00b0\u00b0\u00ce\u00f6\u0087".length();
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
                    var4_4 = "\n\u008d\u00e9\u0004\u0081@\u00da\u000e\u00ed\u0098\u00de\u00db\u0013\u0096I\u000e";
                    var5_5 = "\n\u008d\u00e9\u0004\u0081@\u00da\u000e\u00ed\u0098\u00de\u00db\u0013\u0096I\u000e".length();
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
        hk_1.b = var6_2;
        hk_1.c = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6269;
        if (c[n11] == null) {
            hk_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

