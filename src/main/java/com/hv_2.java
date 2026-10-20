/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hv
 */
public class hv_2
extends W5 {
    private float D;
    private float M;
    private int A = 1;
    private boolean z = true;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hv_2() {
    }

    public hv_2(float f10, float f11, int n10) {
        this.D = f10;
        this.M = f11;
        this.A = n10;
    }

    public void m(boolean bl) {
        this.z = bl;
    }

    public boolean z() {
        return this.z;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int[] nArray;
        String[] stringArray;
        int n10;
        int n11;
        block10: {
            int n12;
            block12: {
                BufferedImage bufferedImage3;
                block11: {
                    n11 = bufferedImage.getWidth();
                    n10 = bufferedImage.getHeight();
                    stringArray = W5.q();
                    bufferedImage3 = bufferedImage2;
                    if (stringArray == null) break block11;
                    if (bufferedImage3 != null) break block12;
                    bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
                }
                bufferedImage2 = bufferedImage3;
            }
            nArray = new int[n11 * n10];
            int[] nArray2 = new int[n11 * n10];
            this.l(bufferedImage, 0, 0, n11, n10, nArray);
            int n13 = this.z;
            if (stringArray != null) {
                if (n13 != 0) {
                    NM.g(nArray, 0, nArray.length);
                }
                n13 = n12 = 0;
            }
            while (n12 < this.A) {
                hv_2.C(nArray, nArray2, n11, n10, this.D);
                hv_2.C(nArray2, nArray, n10, n11, this.M);
                ++n12;
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block10;
            }
            hv_2.N(nArray, nArray2, n11, n10, this.D);
            hv_2.N(nArray2, nArray, n10, n11, this.M);
        }
        hv_2 hv_22 = this;
        if (stringArray != null) {
            if (hv_22.z) {
                NM.L(nArray, 0, nArray.length);
            }
            hv_22 = this;
        }
        hv_22.E(bufferedImage2, 0, 0, n11, n10, nArray);
        return bufferedImage2;
    }

    public static void C(int[] nArray, int[] nArray2, int n10, int n11, float f10) {
        int n12;
        int[] nArray3;
        String[] stringArray;
        int n13;
        int n14;
        block11: {
            n14 = n10 - 1;
            n13 = (int)f10;
            stringArray = W5.q();
            int n15 = 2 * n13 + 1;
            nArray3 = new int[hv_2.a(12793, 7274310190022921034L) * n15];
            for (n12 = 0; n12 < hv_2.a(31419, 8382217966437515265L) * n15; ++n12) {
                nArray3[n12] = n12 / n15;
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block11;
            }
            n12 = 0;
        }
        for (int i2 = 0; i2 < n11; ++i2) {
            int n16;
            int n17;
            block13: {
                int n18;
                int n19;
                int n20;
                int n21;
                int n22;
                int n23;
                block12: {
                    int n24 = i2;
                    n23 = 0;
                    n22 = 0;
                    n21 = 0;
                    n20 = 0;
                    for (n19 = -n13; n19 <= n13; ++n19) {
                        n18 = nArray[n12 + NM.L(n19, 0, n10 - 1)];
                        n23 += n18 >> hv_2.a(10225, 4045218070481837386L) & hv_2.a(10621, 5672627276802462658L);
                        n22 += n18 >> hv_2.a(25792, 4941131323126242929L) & hv_2.a(7459, 4736922753661478813L);
                        n21 += n18 >> hv_2.a(2677, 817984506768208076L) & hv_2.a(7459, 4736922753661478813L);
                        n20 += n18 & hv_2.a(7459, 4736922753661478813L);
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block12;
                    }
                    n19 = 0;
                }
                while (n19 < n10) {
                    nArray2[n24] = nArray3[n23] << hv_2.a(16461, 5297646419139459834L) | nArray3[n22] << hv_2.a(10267, 4561252707083031209L) | nArray3[n21] << hv_2.a(31243, 6167613121216594099L) | nArray3[n20];
                    n17 = n18 = n19 + n13 + 1;
                    n16 = n14;
                    if (stringArray != null) {
                        int n25;
                        int n26;
                        int n27;
                        if (stringArray != null) {
                            if (n17 > n16) {
                                n18 = n14;
                            }
                            n27 = n19;
                            n26 = n13;
                        }
                        int n28 = n25 = n27 - n26;
                        if (stringArray != null) {
                            if (n28 < 0) {
                                n25 = 0;
                            }
                            n28 = nArray[n12 + n18];
                        }
                        void var20_20 = n28;
                        int n29 = nArray[n12 + n25];
                        n23 += (var20_20 >> hv_2.a(16461, 5297646419139459834L) & hv_2.a(7459, 4736922753661478813L)) - (n29 >> hv_2.a(16461, 5297646419139459834L) & hv_2.a(7459, 4736922753661478813L));
                        n22 += (var20_20 & hv_2.a(4117, 7412759598701685413L)) - (n29 & hv_2.a(26823, 5289931211000631923L)) >> hv_2.a(10267, 4561252707083031209L);
                        n21 += (var20_20 & hv_2.a(19707, 4570119171132978765L)) - (n29 & hv_2.a(7637, 3621344387041896288L)) >> hv_2.a(31243, 6167613121216594099L);
                        n20 += (var20_20 & hv_2.a(7459, 4736922753661478813L)) - (n29 & hv_2.a(7459, 4736922753661478813L));
                        n24 += n11;
                        ++n19;
                        if (stringArray != null) continue;
                    }
                    break block13;
                }
                n17 = n12;
                n16 = n10;
            }
            n12 = n17 + n16;
            if (stringArray != null) continue;
        }
    }

    public static void N(int[] nArray, int[] nArray2, int n10, int n11, float f10) {
        f10 -= (float)((int)f10);
        float f11 = 1.0f / (1.0f + 2.0f * f10);
        int n12 = 0;
        int n13 = 0;
        String[] stringArray = W5.q();
        while (n13 < n11) {
            block3: {
                int n14 = n13;
                nArray2[n14] = nArray[0];
                n14 += n11;
                for (int i2 = 1; i2 < n10 - 1; ++i2) {
                    int n15 = n12 + i2;
                    int n16 = nArray[n15 - 1];
                    int n17 = nArray[n15];
                    int n18 = nArray[n15 + 1];
                    int n19 = n16 >> hv_2.a(16461, 5297646419139459834L) & hv_2.a(7459, 4736922753661478813L);
                    int n20 = n16 >> hv_2.a(10267, 4561252707083031209L) & hv_2.a(7459, 4736922753661478813L);
                    int n21 = n16 >> hv_2.a(31243, 6167613121216594099L) & hv_2.a(7459, 4736922753661478813L);
                    int n22 = n16 & hv_2.a(7459, 4736922753661478813L);
                    int n23 = n17 >> hv_2.a(16461, 5297646419139459834L) & hv_2.a(7459, 4736922753661478813L);
                    int n24 = n17 >> hv_2.a(10267, 4561252707083031209L) & hv_2.a(7459, 4736922753661478813L);
                    int n25 = n17 >> hv_2.a(31243, 6167613121216594099L) & hv_2.a(7459, 4736922753661478813L);
                    int n26 = n17 & hv_2.a(7459, 4736922753661478813L);
                    int n27 = n18 >> hv_2.a(16461, 5297646419139459834L) & hv_2.a(7459, 4736922753661478813L);
                    int n28 = n18 >> hv_2.a(10267, 4561252707083031209L) & hv_2.a(7459, 4736922753661478813L);
                    int n29 = n18 >> hv_2.a(31243, 6167613121216594099L) & hv_2.a(7459, 4736922753661478813L);
                    int n30 = n18 & hv_2.a(7459, 4736922753661478813L);
                    n19 = n23 + (int)((float)(n19 + n27) * f10);
                    n20 = n24 + (int)((float)(n20 + n28) * f10);
                    n21 = n25 + (int)((float)(n21 + n29) * f10);
                    n22 = n26 + (int)((float)(n22 + n30) * f10);
                    n19 = (int)((float)n19 * f11);
                    n20 = (int)((float)n20 * f11);
                    n21 = (int)((float)n21 * f11);
                    n22 = (int)((float)n22 * f11);
                    nArray2[n14] = n19 << hv_2.a(16461, 5297646419139459834L) | n20 << hv_2.a(10267, 4561252707083031209L) | n21 << hv_2.a(31243, 6167613121216594099L) | n22;
                    n14 += n11;
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block3;
                }
                nArray2[n14] = nArray[n10 - 1];
                n12 += n10;
                ++n13;
            }
            if (stringArray != null) continue;
        }
    }

    public void d(float f10) {
        this.D = f10;
    }

    public float N() {
        return this.D;
    }

    public void I(float f10) {
        this.M = f10;
    }

    public float M() {
        return this.M;
    }

    public void P(float f10) {
        this.D = this.M = f10;
    }

    public float a() {
        return this.D;
    }

    public void n(int n10) {
        this.A = n10;
    }

    public int h() {
        return this.A;
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
                v0 = "\u0012dKlU\u0018 ((|r\u000f(a~&".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 15;
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
                                v9 = 95;
                                break;
                            }
                            case 1: {
                                v9 = 7;
                                break;
                            }
                            case 2: {
                                v9 = 49;
                                break;
                            }
                            case 3: {
                                v9 = 17;
                                break;
                            }
                            case 4: {
                                v9 = 117;
                                break;
                            }
                            case 5: {
                                v9 = 85;
                                break;
                            }
                            default: {
                                v9 = 64;
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
                hv_2.a = new String(v10).intern();
                var0_1 = 3965898513203079348L;
                var6_2 = new long[14];
                var3_3 = 0;
                var4_4 = "\u00d1f1\u00b3\u00d6\u00c1:\r\u001b\u00e4\u0098\u00e3\u00d0\u00ea\"\u00fe\u00b7\u00be[S\u00e3\u00bc\u0002\u0011\u009b\u00df\u00acZ)\u00c6\u00f6\u00d5}h3fN-\u00a1\u00f9O\u00a5m\u00b7\u00e0\u00d5RV_\u001f\u00cft\u00c3\u00b6\u00fa\u00c7\u00b80T}\u00f8Dp\u00d4\u00f5d\u00e4\u00ea!\u00df\u00e9\u00b59\u00ac\u00c2cl\u00b7\u00b5\u00e6\u0096'\u00a07\u00ac\u009fh\u000frs\u00035K\t\u0018p";
                var5_5 = "\u00d1f1\u00b3\u00d6\u00c1:\r\u001b\u00e4\u0098\u00e3\u00d0\u00ea\"\u00fe\u00b7\u00be[S\u00e3\u00bc\u0002\u0011\u009b\u00df\u00acZ)\u00c6\u00f6\u00d5}h3fN-\u00a1\u00f9O\u00a5m\u00b7\u00e0\u00d5RV_\u001f\u00cft\u00c3\u00b6\u00fa\u00c7\u00b80T}\u00f8Dp\u00d4\u00f5d\u00e4\u00ea!\u00df\u00e9\u00b59\u00ac\u00c2cl\u00b7\u00b5\u00e6\u0096'\u00a07\u00ac\u009fh\u000frs\u00035K\t\u0018p".length();
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
                    var4_4 = "*YCh\u00d2\u00cd\u000f\u00d6\u009dL\u001a\u00ado\u00b8\u00bb\u0089";
                    var5_5 = "*YCh\u00d2\u00cd\u000f\u00d6\u009dL\u001a\u00ado\u00b8\u00bb\u0089".length();
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
        hv_2.b = var6_2;
        hv_2.c = new Integer[14];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3AB2;
        if (c[n11] == null) {
            hv_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

