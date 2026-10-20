/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.zI;
import java.awt.Rectangle;

/*
 * Renamed from com.y_
 */
public class y__0
extends gt_1 {
    private int[][] p;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        block15: {
            int n12;
            int n13;
            String[] stringArray;
            block12: {
                int n14;
                block18: {
                    block17: {
                        zI zI2 = new zI(nArray, n10, n11, 0, n10);
                        stringArray = W5.q();
                        if (zI2.M() <= 0) break block17;
                        float f10 = 255.0f / (float)zI2.M();
                        this.p = new int[3][y__0.a(2558, 6658677181781575558L)];
                        n13 = 0;
                        while (n13 < 3) {
                            block14: {
                                int n15;
                                block13: {
                                    this.p[n13][0] = zI2.G(n13, 0);
                                    n14 = 1;
                                    if (stringArray == null) break block12;
                                    for (n15 = v10088985; n15 < y__0.a(24686, 7995871815894920725L); ++n15) {
                                        this.p[n13][n15] = this.p[n13][n15 - 1] + zI2.G(n13, n15);
                                        if (stringArray != null) {
                                            if (stringArray != null) continue;
                                        }
                                        break block13;
                                    }
                                    n15 = 0;
                                }
                                while (n15 < y__0.a(24686, 7995871815894920725L)) {
                                    this.p[n13][n15] = Math.round((float)this.p[n13][n15] * f10);
                                    ++n15;
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                    }
                                    break block14;
                                }
                                ++n13;
                            }
                            if (stringArray != null) continue;
                        }
                        if (stringArray != null) break block18;
                    }
                    this.p = null;
                }
                n13 = 0;
                n14 = n12 = 0;
            }
            while (n12 < n11) {
                block16: {
                    if (stringArray == null) break block15;
                    for (int i2 = 0; i2 < n10; ++i2) {
                        nArray[n13] = this.l(i2, n12, nArray[n13]);
                        ++n13;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block16;
                    }
                    ++n12;
                }
                if (stringArray != null) continue;
            }
            this.p = null;
        }
        return nArray;
    }

    private int l(int n10, int n11, int n12) {
        if (this.p != null) {
            int n13 = n12 & y__0.a(7227, 1167168878807192129L);
            int n14 = this.p[0][n12 >> y__0.a(14166, 648919301906676009L) & y__0.a(14887, 1514391650356737113L)];
            int n15 = this.p[1][n12 >> y__0.a(12575, 5929892306332761958L) & y__0.a(20340, 7109966606657274120L)];
            int n16 = this.p[2][n12 & y__0.a(20340, 7109966606657274120L)];
            return n13 | n14 << y__0.a(25926, 4491365435285793595L) | n15 << y__0.a(31765, 5931472446023627365L) | n16;
        }
        return n12;
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
                v0 = "\"e^\u000ew0 ${G\u0000i*u\u0004".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 41;
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
                                v9 = 72;
                                break;
                            }
                            case 1: {
                                v9 = 35;
                                break;
                            }
                            case 2: {
                                v9 = 27;
                                break;
                            }
                            case 3: {
                                v9 = 72;
                                break;
                            }
                            case 4: {
                                v9 = 44;
                                break;
                            }
                            case 5: {
                                v9 = 106;
                                break;
                            }
                            default: {
                                v9 = 38;
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
                y__0.a = new String(v10).intern();
                var0_1 = 3252038214113183276L;
                var6_2 = new long[9];
                var3_3 = 0;
                var4_4 = "O\u0093\u009f\u00ce\u008a!@\u00aa\u0083z\u0082t\u00ef\u007fyBY\u000bk\u00f2%\u0007\u00d4mK\u0084\u00cc(\u00e3\u00cf)9\u00e1\u0082\u00fb\u00e0\u00f6\u0084\u0007\u00dbG[>\u00d4\u00ba\u009b-\u0007\u00d7m\u00e8\u00ef&b\u00f2\u008a";
                var5_5 = "O\u0093\u009f\u00ce\u008a!@\u00aa\u0083z\u0082t\u00ef\u007fyBY\u000bk\u00f2%\u0007\u00d4mK\u0084\u00cc(\u00e3\u00cf)9\u00e1\u0082\u00fb\u00e0\u00f6\u0084\u0007\u00dbG[>\u00d4\u00ba\u009b-\u0007\u00d7m\u00e8\u00ef&b\u00f2\u008a".length();
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
                    var4_4 = "\u00aa\u00d3\u00ee\u00e5*<\u00ff\u0015\u001a\u0006{*\u00f8w4A";
                    var5_5 = "\u00aa\u00d3\u00ee\u00e5*<\u00ff\u0015\u001a\u0006{*\u00f8w4A".length();
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
        y__0.b = var6_2;
        y__0.c = new Integer[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xE78;
        if (c[n11] == null) {
            y__0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

