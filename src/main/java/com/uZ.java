/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SC;
import com.e3_0;
import com.ky_2;
import com.r__0;
import java.util.Random;

public class uZ
implements e3_0,
SC,
r__0 {
    private static Random q;
    static int[] U;
    static float[][] Z;
    static float[][] m;
    static float[] u;
    static boolean D;
    private static String R;
    private static final long[] a;
    private static final Integer[] b;

    @Override
    public float H(float f10) {
        return uZ.x(f10);
    }

    @Override
    public float h(float f10, float f11) {
        return uZ.x(f10, f11);
    }

    @Override
    public float K(float f10, float f11, float f12) {
        return uZ.G(f10, f11, f12);
    }

    public static float q(float f10, float f11, float f12) {
        float f13;
        block2: {
            float f14 = 0.0f;
            float f15 = 1.0f;
            String string = uZ.h();
            while (f15 <= f12) {
                f14 += Math.abs(uZ.x(f15 * f10, f15 * f11)) / f15;
                f13 = f15 * 2.0f;
                if (string == null) {
                    f15 = f13;
                    if (string == null) continue;
                }
                break block2;
            }
            f13 = f14;
        }
        return f13;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        float f14;
        block2: {
            float f15 = 0.0f;
            float f16 = 1.0f;
            String string = uZ.h();
            while (f16 <= f13) {
                f15 += Math.abs(uZ.G(f16 * f10, f16 * f11, f16 * f12)) / f16;
                f14 = f16 * 2.0f;
                if (string == null) {
                    f16 = f14;
                    if (string == null) continue;
                }
                break block2;
            }
            f14 = f15;
        }
        return f14;
    }

    private static float X(float f10) {
        return f10 * f10 * (3.0f - 2.0f * f10);
    }

    public static float x(float f10) {
        block3: {
            boolean bl;
            block2: {
                String string = uZ.h();
                bl = D;
                if (string != null) break block2;
                if (!bl) break block3;
                bl = false;
            }
            D = bl;
            uZ.c();
        }
        float f11 = f10 + 4096.0f;
        int n10 = (int)f11 & uZ.a(11238, 5150438208742926474L);
        int n11 = n10 + 1 & uZ.a(11238, 5150438208742926474L);
        float f12 = f11 - (float)((int)f11);
        float f13 = f12 - 1.0f;
        float f14 = uZ.X(f12);
        float f15 = f12 * u[U[n10]];
        float f16 = f13 * u[U[n11]];
        return 2.3f * uZ.h(f14, f15, f16);
    }

    public static float x(float f10, float f11) {
        block3: {
            boolean bl;
            block2: {
                String string = uZ.h();
                bl = D;
                if (string != null) break block2;
                if (!bl) break block3;
                bl = false;
            }
            D = bl;
            uZ.c();
        }
        float f12 = f10 + 4096.0f;
        int n10 = (int)f12 & uZ.a(11588, 6200431532376796714L);
        int n11 = n10 + 1 & uZ.a(11238, 5150438208742926474L);
        float f13 = f12 - (float)((int)f12);
        float f14 = f13 - 1.0f;
        f12 = f11 + 4096.0f;
        int n12 = (int)f12 & uZ.a(11238, 5150438208742926474L);
        int n13 = n12 + 1 & uZ.a(11238, 5150438208742926474L);
        float f15 = f12 - (float)((int)f12);
        float f16 = f15 - 1.0f;
        int n14 = U[n10];
        int n15 = U[n11];
        int n16 = U[n14 + n12];
        int n17 = U[n15 + n12];
        int n18 = U[n14 + n13];
        int n19 = U[n15 + n13];
        float f17 = uZ.X(f13);
        float f18 = uZ.X(f15);
        float[] fArray = m[n16];
        float f19 = f13 * fArray[0] + f15 * fArray[1];
        fArray = m[n17];
        float f20 = f14 * fArray[0] + f15 * fArray[1];
        float f21 = uZ.h(f17, f19, f20);
        fArray = m[n18];
        f19 = f13 * fArray[0] + f16 * fArray[1];
        fArray = m[n19];
        f20 = f14 * fArray[0] + f16 * fArray[1];
        float f22 = uZ.h(f17, f19, f20);
        return 1.5f * uZ.h(f18, f21, f22);
    }

    public static float G(float f10, float f11, float f12) {
        block5: {
            boolean bl;
            block4: {
                String string = uZ.h();
                bl = D;
                if (string != null) break block4;
                if (!bl) break block5;
                bl = false;
            }
            D = bl;
            uZ.c();
        }
        float f13 = f10 + 4096.0f;
        int n10 = (int)f13 & uZ.a(11238, 5150438208742926474L);
        int n11 = n10 + 1 & uZ.a(11238, 5150438208742926474L);
        float f14 = f13 - (float)((int)f13);
        float f15 = f14 - 1.0f;
        f13 = f11 + 4096.0f;
        int n12 = (int)f13 & uZ.a(11238, 5150438208742926474L);
        int n13 = n12 + 1 & uZ.a(11238, 5150438208742926474L);
        float f16 = f13 - (float)((int)f13);
        float f17 = f16 - 1.0f;
        f13 = f12 + 4096.0f;
        int n14 = (int)f13 & uZ.a(11238, 5150438208742926474L);
        int n15 = n14 + 1 & uZ.a(11238, 5150438208742926474L);
        float f18 = f13 - (float)((int)f13);
        float f19 = f18 - 1.0f;
        int n16 = U[n10];
        int n17 = U[n11];
        int n18 = U[n16 + n12];
        int n19 = U[n17 + n12];
        int n20 = U[n16 + n13];
        int n21 = U[n17 + n13];
        f13 = uZ.X(f14);
        float f20 = uZ.X(f16);
        float f21 = uZ.X(f18);
        float[] fArray = Z[n18 + n14];
        float f22 = f14 * fArray[0] + f16 * fArray[1] + f18 * fArray[2];
        fArray = Z[n19 + n14];
        float f23 = f15 * fArray[0] + f16 * fArray[1] + f18 * fArray[2];
        float f24 = uZ.h(f13, f22, f23);
        fArray = Z[n20 + n14];
        f22 = f14 * fArray[0] + f17 * fArray[1] + f18 * fArray[2];
        fArray = Z[n21 + n14];
        f23 = f15 * fArray[0] + f17 * fArray[1] + f18 * fArray[2];
        float f25 = uZ.h(f13, f22, f23);
        float f26 = uZ.h(f20, f24, f25);
        fArray = Z[n18 + n15];
        f22 = f14 * fArray[0] + f16 * fArray[1] + f19 * fArray[2];
        fArray = Z[n19 + n15];
        f23 = f15 * fArray[0] + f16 * fArray[1] + f19 * fArray[2];
        f24 = uZ.h(f13, f22, f23);
        fArray = Z[n20 + n15];
        f22 = f14 * fArray[0] + f17 * fArray[1] + f19 * fArray[2];
        fArray = Z[n21 + n15];
        f23 = f15 * fArray[0] + f17 * fArray[1] + f19 * fArray[2];
        f25 = uZ.h(f13, f22, f23);
        float f27 = uZ.h(f20, f24, f25);
        float f28 = 1.5f * uZ.h(f21, f26, f27);
        if (ky_2.F() != null) {
            uZ.C("J8yvCc");
        }
        return f28;
    }

    public static float h(float f10, float f11, float f12) {
        return f11 + f10 * (f12 - f11);
    }

    private static void L(float[] fArray) {
        float f10 = (float)Math.sqrt(fArray[0] * fArray[0] + fArray[1] * fArray[1]);
        fArray[0] = fArray[0] / f10;
        fArray[1] = fArray[1] / f10;
    }

    static void x(float[] fArray) {
        float f10 = (float)Math.sqrt(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        fArray[0] = fArray[0] / f10;
        fArray[1] = fArray[1] / f10;
        fArray[2] = fArray[2] / f10;
    }

    private static int F() {
        return q.nextInt() & uZ.a(2595, 1148101393946184012L);
    }

    private static void c() {
        int n10;
        String string;
        int n11;
        block15: {
            block12: {
                int n12;
                n11 = 0;
                string = uZ.h();
                while (n11 < uZ.a(32717, 6423534006966877349L)) {
                    block14: {
                        block13: {
                            uZ.U[n11] = n11;
                            uZ.u[n11] = (float)(uZ.F() % uZ.a(3557, 365854411868933767L) - uZ.a(22414, 1863777980156761316L)) / 256.0f;
                            n12 = 0;
                            if (string != null) break block12;
                            for (n10 = v9552929; n10 < 2; ++n10) {
                                uZ.m[n11][n10] = (float)(uZ.F() % uZ.a(1024, 3183709916096202601L) - uZ.a(22414, 1863777980156761316L)) / 256.0f;
                                if (string == null) {
                                    if (string == null) continue;
                                }
                                break block13;
                            }
                            uZ.L(m[n11]);
                        }
                        for (n10 = 0; n10 < 3; ++n10) {
                            uZ.Z[n11][n10] = (float)(uZ.F() % uZ.a(1024, 3183709916096202601L) - uZ.a(22414, 1863777980156761316L)) / 256.0f;
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block14;
                        }
                        uZ.x(Z[n11]);
                        ++n11;
                    }
                    if (string == null) continue;
                }
                n12 = n11 = uZ.a(11238, 5150438208742926474L);
            }
            while (n11 >= 0) {
                int n13 = U[n11];
                n10 = uZ.F() % uZ.a(22414, 1863777980156761316L);
                uZ.U[n11] = U[n10];
                uZ.U[n10] = n13;
                --n11;
                if (string == null) {
                    if (string == null) continue;
                }
                break block15;
            }
            n11 = 0;
        }
        while (n11 < uZ.a(4394, 5000535023714767433L)) {
            block17: {
                block16: {
                    uZ.U[uZ.a((int)22414, (long)1863777980156761316L) + n11] = U[n11];
                    uZ.u[uZ.a((int)22414, (long)1863777980156761316L) + n11] = u[n11];
                    for (n10 = 0; n10 < 2; ++n10) {
                        uZ.m[uZ.a((int)22414, (long)1863777980156761316L) + n11][n10] = m[n11][n10];
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block16;
                    }
                    n10 = 0;
                }
                while (n10 < 3) {
                    uZ.Z[uZ.a((int)22414, (long)1863777980156761316L) + n11][n10] = Z[n11][n10];
                    ++n10;
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block17;
                }
                ++n11;
            }
            if (string == null) continue;
        }
    }

    public static float[] I(e3_0 e3_02, float[] fArray) {
        block6: {
            String string;
            block8: {
                float[] fArray2;
                block7: {
                    string = uZ.h();
                    fArray2 = fArray;
                    if (string != null) break block7;
                    if (fArray2 != null) break block8;
                    fArray2 = new float[2];
                }
                fArray = fArray2;
            }
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = -100.0f;
            while (f12 < 100.0f) {
                float f13 = e3_02.H(f12);
                f10 = Math.min(f10, f13);
                f11 = Math.max(f11, f13);
                f12 = (float)((double)f12 + 1.27139);
                if (string == null) {
                    if (string == null) continue;
                }
                break block6;
            }
            fArray[0] = f10;
            fArray[1] = f11;
        }
        return fArray;
    }

    public static float[] B(SC sC, float[] fArray) {
        block7: {
            String string;
            block10: {
                float[] fArray2;
                block9: {
                    string = uZ.h();
                    fArray2 = fArray;
                    if (string != null) break block9;
                    if (fArray2 != null) break block10;
                    fArray2 = new float[2];
                }
                fArray = fArray2;
            }
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = -100.0f;
            while (f12 < 100.0f) {
                block8: {
                    if (string != null) break block7;
                    float f13 = -100.0f;
                    while (f13 < 100.0f) {
                        float f14 = sC.h(f13, f12);
                        f10 = Math.min(f10, f14);
                        f11 = Math.max(f11, f14);
                        f13 = (float)((double)f13 + 10.77139);
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block8;
                    }
                    f12 = (float)((double)f12 + 10.35173);
                }
                if (string == null) continue;
            }
            fArray[0] = f10;
            fArray[1] = f11;
        }
        return fArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3648071574311890996L;
                var6_1 = new long[10];
                var3_2 = 0;
                uZ.C(null);
                var4_3 = "\u00f6\u00cb\u00f1r\u0001\u007f%\u00d08\u0080,\u001a\u00b6^\u00b1\u00bbx\u00cbj\u00b2\u00e1\u00e9\u008d\u00919/\u00f1\tF\u00c2\u00f5]\u000f[\u00b8\u00c0#|^\u00e1\u0099D\u00cd{I\u00bb\u0086\u0087\u00fe\u00fc<D\u0083\u00b7\u00d8A\u00ab\u00d1\u009e@\u00de\r)\u00f1";
                var5_4 = "\u00f6\u00cb\u00f1r\u0001\u007f%\u00d08\u0080,\u001a\u00b6^\u00b1\u00bbx\u00cbj\u00b2\u00e1\u00e9\u008d\u00919/\u00f1\tF\u00c2\u00f5]\u000f[\u00b8\u00c0#|^\u00e1\u0099D\u00cd{I\u00bb\u0086\u0087\u00fe\u00fc<D\u0083\u00b7\u00d8A\u00ab\u00d1\u009e@\u00de\r)\u00f1".length();
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
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "I\u0080\u00fb-\u008c\u00fa|\u00b3\u00ac{dk\u0091dc\u007f";
                    var5_4 = "I\u0080\u00fb-\u008c\u00fa|\u00b3\u00ac{dk\u0091dc\u007f".length();
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
lbl28:
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
lbl39:
                // 1 sources

                ** continue;
            }
        }
        uZ.a = var6_1;
        uZ.b = new Integer[10];
        uZ.q = new Random();
        uZ.U = new int[uZ.a(22698, 4396321567949347783L)];
        uZ.Z = new float[uZ.a(16614, 5695793909344617357L)][3];
        uZ.m = new float[uZ.a(16614, 5695793909344617357L)][2];
        uZ.u = new float[uZ.a(16614, 5695793909344617357L)];
        uZ.D = true;
    }

    public static void C(String string) {
        R = string;
    }

    public static String h() {
        return R;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x36A;
        if (b[n11] == null) {
            uZ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

