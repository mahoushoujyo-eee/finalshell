/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;

public class HY {
    public float[] I;
    public float[] E;
    private static final long[] a;
    private static final Integer[] b;

    public HY() {
        this.I = new float[]{0.0f, 1.0f};
        this.E = new float[]{0.0f, 1.0f};
    }

    public HY(HY hY2) {
        this.I = (float[])hY2.I.clone();
        this.E = (float[])hY2.E.clone();
    }

    public int y(float f10, float f11) {
        int n10;
        block13: {
            int n11;
            int n12;
            float[] fArray;
            float[] fArray2;
            int n13;
            block9: {
                n13 = -1;
                int n14 = this.I.length;
                fArray2 = new float[n14 + 1];
                fArray = new float[n14 + 1];
                String[] stringArray = W5.q();
                n12 = 0;
                for (int i2 = 0; i2 < n14; ++i2) {
                    block12: {
                        int n15;
                        float[] fArray3;
                        block11: {
                            int n16;
                            block10: {
                                n16 = n13;
                                if (stringArray == null) break block10;
                                n11 = -1;
                                if (stringArray == null) break block9;
                                if (n16 != n11) break block11;
                                fArray3 = this.I;
                                n15 = i2;
                                if (stringArray == null) break block12;
                                float f12 = fArray3[n15] - f10;
                                n16 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                            }
                            if (n16 > 0) {
                                n13 = n12;
                                fArray2[n12] = f10;
                                fArray[n12] = f11;
                                ++n12;
                            }
                        }
                        fArray2[n12] = this.I[i2];
                        fArray3 = fArray;
                        n15 = n12;
                    }
                    fArray3[n15] = this.E[i2];
                    ++n12;
                    if (stringArray != null) continue;
                }
                n10 = n13;
                if (stringArray == null) break block13;
                n11 = -1;
            }
            if (n10 == n11) {
                n13 = n12;
                fArray2[n12] = f10;
                fArray[n12] = f11;
            }
            this.I = fArray2;
            this.E = fArray;
            n10 = n13;
        }
        return n10;
    }

    public void i(int n10) {
        block5: {
            int n11 = this.I.length;
            String[] stringArray = W5.q();
            int n12 = n11;
            int n13 = 2;
            if (stringArray != null) {
                if (n12 <= n13) {
                    return;
                }
                n12 = n11;
                n13 = 1;
            }
            float[] fArray = new float[n12 - n13];
            float[] fArray2 = new float[n11 - 1];
            int n14 = 0;
            for (int i2 = 0; i2 < n11 - 1; ++i2) {
                if (stringArray != null) {
                    if (i2 == n10) {
                        ++n14;
                    }
                    fArray[i2] = this.I[n14];
                    fArray2[i2] = this.E[n14];
                    ++n14;
                    if (stringArray != null) continue;
                }
                break block5;
            }
            this.I = fArray;
            this.E = fArray2;
        }
    }

    private void W() {
        int n10 = this.I.length;
        String[] stringArray = W5.q();
        int n11 = 1;
        block0: while (true) {
            int n12 = n11;
            block1: while (n12 < n10 - 1) {
                for (int i2 = 1; i2 < n11; ++i2) {
                    float f10 = this.I[n11];
                    if (stringArray != null) {
                        float f11 = f10 - this.I[i2];
                        n12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                        if (stringArray == null) continue block1;
                        if (n12 >= 0) continue;
                        f10 = this.I[n11];
                    }
                    float f12 = f10;
                    this.I[n11] = this.I[i2];
                    this.I[i2] = f12;
                    f12 = this.E[n11];
                    this.E[n11] = this.E[i2];
                    this.E[i2] = f12;
                    if (stringArray != null) continue;
                }
                ++n11;
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    protected int[] b() {
        int[] nArray;
        block2: {
            int n10 = this.I.length;
            float[] fArray = new float[n10 + 2];
            float[] fArray2 = new float[n10 + 2];
            System.arraycopy(this.I, 0, fArray, 1, n10);
            System.arraycopy(this.E, 0, fArray2, 1, n10);
            fArray[0] = fArray[1];
            fArray2[0] = fArray2[1];
            fArray[n10 + 1] = fArray[n10];
            fArray2[n10 + 1] = fArray2[n10];
            int[] nArray2 = new int[HY.a(32695, 1370387733027432989L)];
            String[] stringArray = W5.q();
            for (int i2 = 0; i2 < HY.a(14337, 711105571554651560L); ++i2) {
                float f10 = (float)i2 / 1024.0f;
                int n11 = (int)(255.0f * NM.s(f10, fArray.length, fArray) + 0.5f);
                int n12 = (int)(255.0f * NM.s(f10, fArray.length, fArray2) + 0.5f);
                n11 = NM.L(n11, 0, HY.a(15925, 7243672810898123677L));
                n12 = NM.L(n12, 0, HY.a(24392, 5156954390393916131L));
                nArray = nArray2;
                if (stringArray != null) {
                    nArray[n11] = n12;
                    if (stringArray != null) continue;
                }
                break block2;
            }
            nArray = nArray2;
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2823338731377797656L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u0089\u00a7\u00bc\u0007\u00fa0\u00c3\u00b0\u008c\u0015\u00b4\u00ec\u00ee\u00dc\u00c1z";
                var5_4 = "\u0089\u00a7\u00bc\u0007\u00fa0\u00c3\u00b0\u008c\u0015\u00b4\u00ec\u00ee\u00dc\u00c1z".length();
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
                    var4_3 = "\u001a\u00abj\u00dd\u00162 \u0004F*N \u00fb\u00c7\u0001\u0005";
                    var5_4 = "\u001a\u00abj\u00dd\u00162 \u0004F*N \u00fb\u00c7\u0001\u0005".length();
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
        HY.a = var6_1;
        HY.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x55A9;
        if (b[n11] == null) {
            HY.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

