/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.yq
 */
public class yq_2
extends gt_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    private int o(int[] nArray) {
        int n10;
        block15: {
            int n11;
            int n12;
            block14: {
                int n13;
                String[] stringArray;
                int n14;
                block11: {
                    n14 = 0;
                    n12 = 0;
                    stringArray = W5.q();
                    int n15 = yq_2.a(12780, 5993100657842290892L);
                    n13 = yq_2.a(26143, 971975268155381566L);
                    for (int i2 = 0; i2 < yq_2.a(24130, 965786793410424682L); ++i2) {
                        int n16;
                        block13: {
                            int n17;
                            block12: {
                                n10 = i2;
                                n11 = 4;
                                if (stringArray == null) break block11;
                                if (stringArray != null) {
                                    if (n10 == n11) continue;
                                    n16 = nArray[i2];
                                    n17 = n15;
                                }
                                if (stringArray == null) break block12;
                                if (n16 < n17) {
                                    n15 = nArray[i2];
                                    n14 = i2;
                                }
                                n16 = nArray[i2];
                                if (stringArray == null) break block13;
                                n17 = n13;
                            }
                            if (n16 <= n17) continue;
                            n13 = nArray[i2];
                            n16 = i2;
                        }
                        n12 = n16;
                        if (stringArray != null) continue;
                    }
                    n10 = nArray[4];
                    n11 = n15;
                }
                if (stringArray == null) break block14;
                if (n10 < n11) {
                    return nArray[n14];
                }
                n10 = nArray[4];
                if (stringArray == null) break block15;
                n11 = n13;
            }
            if (n10 > n11) {
                return nArray[n12];
            }
            n10 = nArray[4];
        }
        return n10;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = 0;
        int[] nArray2 = new int[yq_2.a(6894, 6803633326055861185L)];
        int[] nArray3 = new int[yq_2.a(6894, 6803633326055861185L)];
        int[] nArray4 = new int[yq_2.a(6894, 6803633326055861185L)];
        int[] nArray5 = new int[n10 * n11];
        String[] stringArray = W5.q();
        int n13 = 0;
        block0: while (true) {
            int n14 = n13;
            block1: while (n14 < n11) {
                int n15 = 0;
                block2: while (true) {
                    int n16 = n15;
                    int n17 = n10;
                    block3: while (n16 < n17) {
                        int n18 = 0;
                        int n19 = nArray[n12];
                        int n20 = n19 >> yq_2.a(3411, 1454035824961731704L) & yq_2.a(16814, 5800072740861538432L);
                        int n21 = n19 >> yq_2.a(8960, 424705522229875244L) & yq_2.a(19430, 7439709530125728459L);
                        int n22 = n19 & yq_2.a(19430, 7439709530125728459L);
                        n14 = -1;
                        if (stringArray == null) continue block1;
                        int n23 = n14;
                        block4: while (true) {
                            int n24 = n23;
                            int n25 = 1;
                            block5: while (n24 <= n25) {
                                block18: {
                                    int n26;
                                    block12: {
                                        int n27;
                                        block13: {
                                            int n28 = n13 + n23;
                                            n27 = 0;
                                            if (stringArray == null) break block12;
                                            n17 = n28;
                                            if (stringArray == null) continue block3;
                                            if (n27 > n17) break block13;
                                            n27 = n28;
                                            if (stringArray == null) break block12;
                                            if (n27 >= n11) break block13;
                                            n26 = n28 * n10;
                                            for (int i2 = -1; i2 <= 1; ++i2) {
                                                block17: {
                                                    block14: {
                                                        block15: {
                                                            int n29;
                                                            block16: {
                                                                int n30 = n15 + i2;
                                                                if (stringArray == null) break block14;
                                                                n24 = 0;
                                                                n25 = n30;
                                                                if (stringArray == null) continue block5;
                                                                if (n24 > n25) break block15;
                                                                n29 = n30;
                                                                if (stringArray == null) break block16;
                                                                if (n29 >= n10) break block15;
                                                                n29 = nArray[n26 + n30];
                                                            }
                                                            int n31 = n29;
                                                            nArray2[n18] = n31 >> yq_2.a(22102, 1008112507837769599L) & yq_2.a(19430, 7439709530125728459L);
                                                            nArray3[n18] = n31 >> yq_2.a(13370, 1938207697694524696L) & yq_2.a(19430, 7439709530125728459L);
                                                            nArray4[n18] = n31 & yq_2.a(19430, 7439709530125728459L);
                                                            if (stringArray != null) break block17;
                                                        }
                                                        nArray2[n18] = n20;
                                                        nArray3[n18] = n21;
                                                    }
                                                    nArray4[n18] = n22;
                                                }
                                                ++n18;
                                                if (stringArray != null) continue;
                                            }
                                            if (stringArray != null) break block18;
                                        }
                                        n27 = n26 = -1;
                                    }
                                    while (n26 <= 1) {
                                        nArray2[n18] = n20;
                                        nArray3[n18] = n21;
                                        nArray4[n18] = n22;
                                        ++n18;
                                        ++n26;
                                        if (stringArray == null) continue block4;
                                        if (stringArray != null) continue;
                                    }
                                }
                                ++n23;
                                if (stringArray != null) continue block4;
                            }
                            break;
                        }
                        nArray5[n12] = nArray[n12] & yq_2.a(851, 7199813677010596473L) | this.o(nArray2) << yq_2.a(22102, 1008112507837769599L) | this.o(nArray3) << yq_2.a(13370, 1938207697694524696L) | this.o(nArray4);
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
        return nArray5;
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
                v0 = "]FzL:!}pE{V".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 52;
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
                                v9 = 43;
                                break;
                            }
                            case 1: {
                                v9 = 30;
                                break;
                            }
                            case 2: {
                                v9 = 59;
                                break;
                            }
                            case 3: {
                                v9 = 10;
                                break;
                            }
                            case 4: {
                                v9 = 33;
                                break;
                            }
                            case 5: {
                                v9 = 70;
                                break;
                            }
                            default: {
                                v9 = 36;
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
                yq_2.a = new String(v10).intern();
                var0_1 = 7270167058506934416L;
                var6_2 = new long[11];
                var3_3 = 0;
                var4_4 = "zJ\u0007\u0092\t\u00f0\u0087\u00f3a)\u00b4=\u00a7A\u000f\u00ff_\u001f\u00d7m\u00d0:Z\u00e9\u00d9\u0017\u00f4\u00ad\u00b1\u0084T\u00f8,I\u00a0\u00db\u00ae\u00a5\u00fa\u00b4\u0080\u0002\u008f\u00da\u00cb6\u0012\u00a4\u00fc\u00eeL\u00b9\u00caw\u0018\u00ef<~\u0096\u009c\u00c9\u009c\u00c3X\u00fa@\u00f6Un+\u0017\u00a3";
                var5_5 = "zJ\u0007\u0092\t\u00f0\u0087\u00f3a)\u00b4=\u00a7A\u000f\u00ff_\u001f\u00d7m\u00d0:Z\u00e9\u00d9\u0017\u00f4\u00ad\u00b1\u0084T\u00f8,I\u00a0\u00db\u00ae\u00a5\u00fa\u00b4\u0080\u0002\u008f\u00da\u00cb6\u0012\u00a4\u00fc\u00eeL\u00b9\u00caw\u0018\u00ef<~\u0096\u009c\u00c9\u009c\u00c3X\u00fa@\u00f6Un+\u0017\u00a3".length();
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
                    var4_4 = "E\u00b0\u00b8\u000bx\u00d0\u00bf\u00ae\u00f9\u00c9\u00a3\u00a7~\u000f\u00ed\u0080";
                    var5_5 = "E\u00b0\u00b8\u000bx\u00d0\u00bf\u00ae\u00f9\u00c9\u00a3\u00a7~\u000f\u00ed\u0080".length();
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
        yq_2.b = var6_2;
        yq_2.c = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3128;
        if (c[n11] == null) {
            yq_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

