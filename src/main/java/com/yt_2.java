/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.yt
 */
public class yt_2
extends gt_1 {
    private int d = yt_2.a(11538, 9218321204936118557L);
    private int Z = yt_2.a(28495, 2759282764091216711L);
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void d(int n10) {
        this.d = n10;
    }

    public int T() {
        return this.d;
    }

    public void j(int n10) {
        this.Z = n10;
    }

    public int w() {
        return this.Z;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = 0;
        int[] nArray2 = new int[this.Z];
        String[] stringArray = W5.q();
        int[] nArray3 = new int[this.Z];
        int[] nArray4 = new int[this.Z];
        int[] nArray5 = new int[this.Z];
        int[] nArray6 = new int[this.Z];
        int[] nArray7 = new int[this.Z];
        int[] nArray8 = new int[n10 * n11];
        int n13 = 0;
        block0: while (true) {
            int n14 = n13;
            block1: while (n14 < n11) {
                int n15 = 0;
                block2: while (true) {
                    int n16 = n15;
                    int n17 = n10;
                    block3: while (n16 < n17) {
                        int n18;
                        int n19;
                        int n20;
                        int n21;
                        int n22;
                        block22: {
                            int n23;
                            block21: {
                                n14 = 0;
                                if (stringArray == null) continue block1;
                                for (n22 = v10168251; n22 < this.Z; ++n22) {
                                    nArray7[n22] = 0;
                                    nArray6[n22] = 0;
                                    nArray5[n22] = 0;
                                    nArray4[n22] = 0;
                                    nArray3[n22] = 0;
                                    nArray2[n22] = 0;
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                    }
                                    break block21;
                                }
                                n22 = -this.d;
                            }
                            block5: while (true) {
                                int n24 = n22;
                                int n25 = this.d;
                                block6: while (n24 <= n25) {
                                    block23: {
                                        int n26;
                                        int n27;
                                        block24: {
                                            n21 = n13 + n22;
                                            if (stringArray == null) continue block5;
                                            n16 = 0;
                                            n17 = n21;
                                            if (stringArray == null) continue block3;
                                            if (n16 > n17) break block23;
                                            n27 = n21;
                                            n26 = n11;
                                            if (stringArray == null) break block24;
                                            if (n27 >= n26) break block23;
                                            n27 = n21;
                                            n26 = n10;
                                        }
                                        n20 = n27 * n26;
                                        n23 = -this.d;
                                        while (n23 <= this.d) {
                                            block25: {
                                                block26: {
                                                    int n28;
                                                    block27: {
                                                        int n29 = n15 + n23;
                                                        if (stringArray == null) break block25;
                                                        n24 = 0;
                                                        n25 = n29;
                                                        if (stringArray == null) continue block6;
                                                        if (n24 > n25) break block26;
                                                        n28 = n29;
                                                        if (stringArray == null) break block27;
                                                        if (n28 >= n10) break block26;
                                                        n28 = nArray[n20 + n29];
                                                    }
                                                    int n30 = n28;
                                                    int n31 = n30 >> yt_2.a(1839, 5262096649473440553L) & yt_2.a(22263, 3644729440534391547L);
                                                    int n32 = n30 >> yt_2.a(4644, 6118850585262272042L) & yt_2.a(13526, 8263535639976446173L);
                                                    int n33 = n30 & yt_2.a(13526, 8263535639976446173L);
                                                    int n34 = n31 * this.Z / yt_2.a(5340, 376458099008776411L);
                                                    int n35 = n32 * this.Z / yt_2.a(28495, 2759282764091216711L);
                                                    int n36 = n33 * this.Z / yt_2.a(28495, 2759282764091216711L);
                                                    int n37 = n34;
                                                    nArray5[n37] = nArray5[n37] + n31;
                                                    int n38 = n35;
                                                    nArray6[n38] = nArray6[n38] + n32;
                                                    int n39 = n36;
                                                    nArray7[n39] = nArray7[n39] + n33;
                                                    int n40 = n34;
                                                    nArray2[n40] = nArray2[n40] + 1;
                                                    int n41 = n35;
                                                    nArray3[n41] = nArray3[n41] + 1;
                                                    int n42 = n36;
                                                    nArray4[n42] = nArray4[n42] + 1;
                                                }
                                                ++n23;
                                            }
                                            if (stringArray != null) continue;
                                        }
                                    }
                                    ++n22;
                                    if (stringArray != null) continue block5;
                                }
                                break;
                            }
                            n22 = 0;
                            n21 = 0;
                            n20 = 0;
                            for (n23 = 1; n23 < this.Z; ++n23) {
                                int n43;
                                block29: {
                                    int n44;
                                    block28: {
                                        n19 = nArray2[n23];
                                        n18 = nArray2[n22];
                                        if (stringArray == null) break block22;
                                        if (stringArray != null) {
                                            if (n19 > n18) {
                                                n22 = n23;
                                            }
                                            n43 = nArray3[n23];
                                            n44 = nArray3[n21];
                                        }
                                        if (stringArray == null) break block28;
                                        if (n43 > n44) {
                                            n21 = n23;
                                        }
                                        n43 = nArray4[n23];
                                        if (stringArray == null) break block29;
                                        n44 = nArray4[n20];
                                    }
                                    if (n43 <= n44) continue;
                                    n43 = n23;
                                }
                                n20 = n43;
                                if (stringArray != null) continue;
                            }
                            n22 = nArray5[n22] / nArray2[n22];
                            n21 = nArray6[n21] / nArray3[n21];
                            n19 = nArray7[n20];
                            n18 = nArray4[n20];
                        }
                        n20 = n19 / n18;
                        nArray8[n12] = nArray[n12] & yt_2.a(4881, 3247092140328595227L) | n22 << yt_2.a(25071, 4713487202196119014L) | n21 << yt_2.a(26833, 3411551053453219036L) | n20;
                        ++n12;
                        ++n15;
                        if (stringArray != null) continue block2;
                    }
                    break;
                }
                ++n13;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return nArray8;
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
                v0 = "\u000fu\u0017\u0014h\u0006\u0011sN\u0007\u0014/RZ".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 83;
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
                                v9 = 15;
                                break;
                            }
                            case 1: {
                                v9 = 82;
                                break;
                            }
                            case 2: {
                                v9 = 61;
                                break;
                            }
                            case 3: {
                                v9 = 43;
                                break;
                            }
                            case 4: {
                                v9 = 82;
                                break;
                            }
                            case 5: {
                                v9 = 47;
                                break;
                            }
                            default: {
                                v9 = 39;
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
                yt_2.a = new String(v10).intern();
                var0_1 = 5606828744342108893L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "\u00f9\u00c9\u0084\u008fV\u00caT\u00ff\u0000\u00d1\u00fd\u00ea\u00eb^\u00eb\u00c3~\u00ae\u000ee\u00f3\u0080\u0010\u00d9\u008b\u0001\u00da%\u00c4\u00c5\u00ae\t\u00ea\u00e8.\u00d3\u0090\u00caU\u00c6\u00a5\u00e6\u0097\u00cc\u008ffr\u00ffM\u00f6\u00c1\u00cc\u009av(\u009a\u0084\u00a6G\u00cfB\u00ca'+";
                var5_5 = "\u00f9\u00c9\u0084\u008fV\u00caT\u00ff\u0000\u00d1\u00fd\u00ea\u00eb^\u00eb\u00c3~\u00ae\u000ee\u00f3\u0080\u0010\u00d9\u008b\u0001\u00da%\u00c4\u00c5\u00ae\t\u00ea\u00e8.\u00d3\u0090\u00caU\u00c6\u00a5\u00e6\u0097\u00cc\u008ffr\u00ffM\u00f6\u00c1\u00cc\u009av(\u009a\u0084\u00a6G\u00cfB\u00ca'+".length();
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
                    var4_4 = "\u00a2\u001bc\u00b8\u00bbV\u00c1\u00e4>e'M\u00e6\u00c9S\u0006";
                    var5_5 = "\u00a2\u001bc\u00b8\u00bbV\u00c1\u00e4>e'M\u00e6\u00c9S\u0006".length();
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
        yt_2.b = var6_2;
        yt_2.c = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3C0E;
        if (c[n11] == null) {
            yt_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

