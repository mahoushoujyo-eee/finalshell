/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.hn_1;
import com.iw_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gB
 */
public class gb_1
extends hn_1 {
    private int g = gb_1.a(18594, 2900202558418253257L);
    private int e = gb_1.a(32449, 5268810244770317229L);
    private int Z = -1;
    private int[] M;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block5: {
            float f10;
            int n10;
            String[] stringArray;
            block4: {
                this.M = new int[gb_1.a(1022, 3440763975392050832L)];
                stringArray = W5.q();
                for (n10 = 0; n10 < gb_1.a(6973, 1479743374306223701L); ++n10) {
                    f10 = (float)n10 / 127.0f;
                    this.M[n10] = NM.n(f10, this.g, this.e);
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block4;
                }
                n10 = gb_1.a(6516, 4501726301351453723L);
            }
            while (n10 < gb_1.a(6572, 4466801180826281158L)) {
                f10 = (float)(n10 - gb_1.a(1764, 6869513870636202893L)) / 128.0f;
                this.M[n10] = NM.n(f10, this.e, this.Z);
                ++n10;
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block5;
            }
            bufferedImage2 = super.filter(bufferedImage, bufferedImage2);
            this.M = null;
        }
        return bufferedImage2;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        return this.M[iw_2.g(n12)];
    }

    public void R(int n10) {
        this.g = n10;
    }

    public int p() {
        return this.g;
    }

    public void H(int n10) {
        this.e = n10;
    }

    public int c() {
        return this.e;
    }

    public void y(int n10) {
        this.Z = n10;
    }

    public int S() {
        return this.Z;
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
                v0 = "/>+P_l 8#.KBqjB\u007fi".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 48;
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
                                v9 = 92;
                                break;
                            }
                            case 1: {
                                v9 = 97;
                                break;
                            }
                            case 2: {
                                v9 = 119;
                                break;
                            }
                            case 3: {
                                v9 = 15;
                                break;
                            }
                            case 4: {
                                v9 = 29;
                                break;
                            }
                            case 5: {
                                v9 = 47;
                                break;
                            }
                            default: {
                                v9 = 63;
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
                gb_1.a = new String(v10).intern();
                var0_1 = 759513339624490478L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00b6H\u0001f\u00bb\u000f (s\u0097*\u00a3\"O\u00f0'=\u008a4\u00f5\u00f2?\u00a3;\u00a2\u000b^\u0011\u00ac\u009e\u00be\u001cS\u00b9h\u00d4\u00b7I:~";
                var5_5 = "\u00b6H\u0001f\u00bb\u000f (s\u0097*\u00a3\"O\u00f0'=\u008a4\u00f5\u00f2?\u00a3;\u00a2\u000b^\u0011\u00ac\u009e\u00be\u001cS\u00b9h\u00d4\u00b7I:~".length();
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
                    var4_4 = "\u0080{P\u00b0\u00f6k!u\u0092\u00f3\u009a8\u00d1\u008c\u00ce\u00cb";
                    var5_5 = "\u0080{P\u00b0\u00f6k!u\u0092\u00f3\u009a8\u00d1\u008c\u00ce\u00cb".length();
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
        gb_1.b = var6_2;
        gb_1.c = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3D6A;
        if (c[n11] == null) {
            gb_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

