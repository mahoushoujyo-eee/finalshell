/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.uZ;
import java.awt.Rectangle;
import java.util.Random;

/*
 * Renamed from com.g2
 */
public class g2_0
extends gt_1 {
    private float i = 32.0f;
    private float C = 0.0f;
    private int k = g2_0.a(12351, 8723941394870656953L);
    private float Z = 1.0f;
    private float S = 1.0f;
    private float r = 0.0f;
    private float N = 0.0f;
    private int p = g2_0.a(1222, 33084816068012878L);
    private int o = g2_0.a(26388, 1440950252612880534L);
    private float A;
    private float I;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void v(float f10) {
        this.i = f10;
    }

    public float W() {
        return this.i;
    }

    public void z(int n10) {
        this.k = n10;
    }

    public int D() {
        return this.k;
    }

    public void p(float f10) {
        this.S = f10;
    }

    public float Q() {
        return this.S;
    }

    public void I(float f10) {
        this.Z = f10;
    }

    public float m() {
        return this.Z;
    }

    public void N(float f10) {
        this.r = f10;
    }

    public float h() {
        return this.r;
    }

    public void B(float f10) {
        this.N = f10;
    }

    public float E() {
        return this.N;
    }

    public void U(int n10) {
        this.p = n10;
    }

    public int i() {
        return this.p;
    }

    public void t(int n10) {
        this.o = n10;
    }

    public int l() {
        return this.o;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12;
        int[] nArray2;
        int n13;
        int n14;
        int n15;
        String[] stringArray;
        Random random;
        block35: {
            int n16;
            block34: {
                block32: {
                    random = new Random(0L);
                    this.A = (float)Math.sin(0.1);
                    this.I = (float)Math.cos(0.1);
                    int n17 = this.H.width;
                    stringArray = W5.q();
                    int n18 = this.H.height;
                    n15 = rectangle.width;
                    n14 = rectangle.height;
                    n13 = 0;
                    nArray2 = new int[n15 * n14];
                    n12 = 0;
                    while (n12 < n14) {
                        block33: {
                            n16 = 0;
                            if (stringArray == null) break block32;
                            for (int i2 = v7775999; i2 < n15; ++i2) {
                                nArray2[n13++] = this.o;
                                if (stringArray != null) {
                                    if (stringArray != null) continue;
                                }
                                break block33;
                            }
                            ++n12;
                        }
                        if (stringArray != null) continue;
                    }
                    n16 = n12 = this.k / this.p;
                }
                if (stringArray == null) break block34;
                if (n16 != 0) break block35;
                n16 = 1;
            }
            n12 = n16;
        }
        float f10 = 1.0f / this.i;
        float f11 = 0.95f;
        n13 = 0;
        int n19 = 0;
        block2: while (true) {
            int n20 = n19;
            block3: while (n20 < n14) {
                int n21 = 0;
                block4: while (true) {
                    int n22 = n21;
                    block5: while (n22 < n15) {
                        n20 = 0;
                        if (stringArray == null) continue block3;
                        int n23 = n20;
                        block6: while (true) {
                            int n24 = n23;
                            block7: while (n24 < this.p) {
                                block51: {
                                    int n25;
                                    int n26;
                                    int n27;
                                    block57: {
                                        int n28;
                                        block56: {
                                            int n29;
                                            block55: {
                                                float f12;
                                                block54: {
                                                    float f13;
                                                    float f14;
                                                    block53: {
                                                        block52: {
                                                            float f15;
                                                            float f16;
                                                            float f17;
                                                            float f18;
                                                            float f19;
                                                            block36: {
                                                                float f20;
                                                                float f21;
                                                                block37: {
                                                                    f21 = (float)n21 + random.nextFloat();
                                                                    f19 = (float)n19 + random.nextFloat();
                                                                    float f22 = f21 * f10;
                                                                    float f23 = f19 * f10;
                                                                    f18 = 0.1f + this.Z;
                                                                    f20 = this.J(f22 - f11, f23) - this.J(f22 + f11, f23);
                                                                    f17 = this.J(f22, f23 + f11) - this.J(f22, f23 - f11);
                                                                    f16 = this.r;
                                                                    f15 = 0.0f;
                                                                    if (stringArray == null) break block36;
                                                                    float f24 = f16 - f15;
                                                                    n22 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                                                                    if (stringArray == null) continue block5;
                                                                    if (n22 <= 0) break block37;
                                                                    int n30 = 0;
                                                                    while (n30 < 3) {
                                                                        block38: {
                                                                            block39: {
                                                                                int n31;
                                                                                int n32;
                                                                                block50: {
                                                                                    int n33;
                                                                                    block49: {
                                                                                        int n34;
                                                                                        block48: {
                                                                                            block45: {
                                                                                                int n35;
                                                                                                int n36;
                                                                                                block46: {
                                                                                                    block47: {
                                                                                                        block43: {
                                                                                                            block44: {
                                                                                                                float f25;
                                                                                                                block42: {
                                                                                                                    float f26;
                                                                                                                    float f27;
                                                                                                                    block41: {
                                                                                                                        block40: {
                                                                                                                            f14 = 1.0f + (float)n30 * this.r;
                                                                                                                            f27 = f21 + this.i * f18 * f20 * f14;
                                                                                                                            f26 = f19 + this.i * f18 * f17 * f14;
                                                                                                                            if (stringArray == null) break block38;
                                                                                                                            float f28 = f27 - 0.0f;
                                                                                                                            n24 = f28 == 0.0f ? 0 : (f28 < 0.0f ? -1 : 1);
                                                                                                                            if (stringArray == null) continue block7;
                                                                                                                            if (n24 < 0) break block39;
                                                                                                                            float f29 = f27 - (float)(n15 - 1);
                                                                                                                            f25 = f29 == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1);
                                                                                                                            if (stringArray == null) break block40;
                                                                                                                            if (f25 >= 0) break block39;
                                                                                                                            float f30 = f26 - 0.0f;
                                                                                                                            f25 = f30 == 0.0f ? 0 : (f30 < 0.0f ? -1 : 1);
                                                                                                                        }
                                                                                                                        if (stringArray == null) break block41;
                                                                                                                        if (f25 < 0) break block39;
                                                                                                                        float f31 = f26 - (float)(n14 - 1);
                                                                                                                        f25 = f31 == 0.0f ? 0 : (f31 > 0.0f ? 1 : -1);
                                                                                                                    }
                                                                                                                    if (stringArray == null) break block42;
                                                                                                                    if (f25 >= 0) break block39;
                                                                                                                    f25 = (int)f26 * n15 + (int)f27;
                                                                                                                }
                                                                                                                n27 = (int)f25;
                                                                                                                n26 = nArray2[n27];
                                                                                                                n25 = n26 >> g2_0.a(14258, 378533527156742195L) & g2_0.a(4390, 4532122126271250085L);
                                                                                                                n32 = n26 >> g2_0.a(27573, 6883390274458092592L) & g2_0.a(4390, 4532122126271250085L);
                                                                                                                n31 = n26 & g2_0.a(4390, 4532122126271250085L);
                                                                                                                n36 = n30;
                                                                                                                n35 = 2;
                                                                                                                if (stringArray == null) break block43;
                                                                                                                if (n36 != n35) break block44;
                                                                                                                n25 += n12;
                                                                                                                if (stringArray != null) break block45;
                                                                                                            }
                                                                                                            n36 = n30;
                                                                                                            n35 = 1;
                                                                                                        }
                                                                                                        if (stringArray == null) break block46;
                                                                                                        if (n36 != n35) break block47;
                                                                                                        n32 += n12;
                                                                                                        if (stringArray != null) break block45;
                                                                                                    }
                                                                                                    n36 = n31;
                                                                                                    n35 = n12;
                                                                                                }
                                                                                                n31 = n36 + n35;
                                                                                            }
                                                                                            n33 = n25;
                                                                                            n34 = g2_0.a(4390, 4532122126271250085L);
                                                                                            if (stringArray != null) {
                                                                                                if (n33 > n34) {
                                                                                                    n25 = g2_0.a(4390, 4532122126271250085L);
                                                                                                }
                                                                                                n33 = n32;
                                                                                                n34 = g2_0.a(4390, 4532122126271250085L);
                                                                                            }
                                                                                            if (stringArray == null) break block48;
                                                                                            if (n33 > n34) {
                                                                                                n32 = g2_0.a(4390, 4532122126271250085L);
                                                                                            }
                                                                                            n33 = n31;
                                                                                            if (stringArray == null) break block49;
                                                                                            n34 = g2_0.a(4390, 4532122126271250085L);
                                                                                        }
                                                                                        if (n33 <= n34) break block50;
                                                                                        n33 = g2_0.a(4390, 4532122126271250085L);
                                                                                    }
                                                                                    n31 = n33;
                                                                                }
                                                                                nArray2[n27] = g2_0.a(1152, 4474412071046638343L) | n25 << g2_0.a(14258, 378533527156742195L) | n32 << g2_0.a(27573, 6883390274458092592L) | n31;
                                                                            }
                                                                            ++n30;
                                                                        }
                                                                        if (stringArray != null) continue;
                                                                    }
                                                                    if (stringArray != null) break block51;
                                                                }
                                                                f16 = f21;
                                                                f15 = this.i * f18 * f20;
                                                            }
                                                            f13 = f16 + f15;
                                                            f14 = f19 + this.i * f18 * f17;
                                                            if (stringArray == null) continue block6;
                                                            if (f13 < 0.0f) break block51;
                                                            float f32 = f13 - (float)(n15 - 1);
                                                            f12 = f32 == 0.0f ? 0 : (f32 > 0.0f ? 1 : -1);
                                                            if (stringArray == null) break block52;
                                                            if (f12 >= 0) break block51;
                                                            float f33 = f14 - 0.0f;
                                                            f12 = f33 == 0.0f ? 0 : (f33 < 0.0f ? -1 : 1);
                                                        }
                                                        if (stringArray == null) break block53;
                                                        if (f12 < 0) break block51;
                                                        float f34 = f14 - (float)(n14 - 1);
                                                        f12 = f34 == 0.0f ? 0 : (f34 > 0.0f ? 1 : -1);
                                                    }
                                                    if (stringArray == null) break block54;
                                                    if (f12 >= 0) break block51;
                                                    f12 = (int)f14 * n15 + (int)f13;
                                                }
                                                float f35 = f12;
                                                int n37 = nArray2[f35];
                                                n27 = n37 >> g2_0.a(14258, 378533527156742195L) & g2_0.a(4390, 4532122126271250085L);
                                                n26 = n37 >> g2_0.a(27573, 6883390274458092592L) & g2_0.a(4390, 4532122126271250085L);
                                                n25 = n37 & g2_0.a(4390, 4532122126271250085L);
                                                n26 += n12;
                                                n25 += n12;
                                                n28 = n27 += n12;
                                                n29 = g2_0.a(4390, 4532122126271250085L);
                                                if (stringArray != null) {
                                                    if (n28 > n29) {
                                                        n27 = g2_0.a(4390, 4532122126271250085L);
                                                    }
                                                    n28 = n26;
                                                    n29 = g2_0.a(4390, 4532122126271250085L);
                                                }
                                                if (stringArray == null) break block55;
                                                if (n28 > n29) {
                                                    n26 = g2_0.a(4390, 4532122126271250085L);
                                                }
                                                n28 = n25;
                                                if (stringArray == null) break block56;
                                                n29 = g2_0.a(4390, 4532122126271250085L);
                                            }
                                            if (n28 <= n29) break block57;
                                            n28 = g2_0.a(4390, 4532122126271250085L);
                                        }
                                        n25 = n28;
                                    }
                                    nArray2[f35] = g2_0.a(1152, 4474412071046638343L) | n27 << g2_0.a(14258, 378533527156742195L) | n26 << g2_0.a(27573, 6883390274458092592L) | n25;
                                }
                                ++n23;
                                if (stringArray != null) continue block6;
                            }
                            break;
                        }
                        ++n21;
                        if (stringArray != null) continue block4;
                    }
                    break;
                }
                ++n19;
                if (stringArray != null) continue block2;
            }
            break;
        }
        return nArray2;
    }

    private static int q(int n10, float f10) {
        int n11 = n10 >> g2_0.a(8728, 7053032478917512604L) & g2_0.a(15062, 5858205079870985565L);
        int n12 = n10 >> g2_0.a(19318, 2169074326066603254L) & g2_0.a(4390, 4532122126271250085L);
        int n13 = n10 & g2_0.a(4390, 4532122126271250085L);
        n11 = (int)((float)n11 + f10);
        n12 = (int)((float)n12 + f10);
        n13 = (int)((float)n13 + f10);
        String[] stringArray = W5.q();
        int n14 = n11;
        int n15 = g2_0.a(4390, 4532122126271250085L);
        if (stringArray != null) {
            if (n14 > n15) {
                n11 = g2_0.a(4390, 4532122126271250085L);
            }
            n14 = n12;
            n15 = g2_0.a(4390, 4532122126271250085L);
        }
        if (stringArray != null) {
            if (n14 > n15) {
                n12 = g2_0.a(4390, 4532122126271250085L);
            }
            n14 = n13;
            n15 = g2_0.a(4390, 4532122126271250085L);
        }
        if (stringArray != null) {
            if (n14 > n15) {
                n13 = g2_0.a(4390, 4532122126271250085L);
            }
            n14 = g2_0.a(3511, 1577154078738014781L) | n11 << g2_0.a(14258, 378533527156742195L) | n12 << g2_0.a(27573, 6883390274458092592L);
            n15 = n13;
        }
        return n14 | n15;
    }

    private static int c(int n10, float f10, int n11) {
        String[] stringArray;
        int n12;
        int n13;
        int n14;
        block11: {
            int n15;
            block12: {
                block13: {
                    int n16;
                    block9: {
                        block10: {
                            n14 = n10 >> g2_0.a(14258, 378533527156742195L) & g2_0.a(4390, 4532122126271250085L);
                            n13 = n10 >> g2_0.a(27573, 6883390274458092592L) & g2_0.a(4390, 4532122126271250085L);
                            n12 = n10 & g2_0.a(4390, 4532122126271250085L);
                            stringArray = W5.q();
                            n15 = n11;
                            n16 = 2;
                            if (stringArray == null) break block9;
                            if (n15 != n16) break block10;
                            n14 = (int)((float)n14 + f10);
                            if (stringArray != null) break block11;
                        }
                        n15 = n11;
                        if (stringArray == null) break block12;
                        n16 = 1;
                    }
                    if (n15 != n16) break block13;
                    n13 = (int)((float)n13 + f10);
                    if (stringArray != null) break block11;
                }
                n15 = (int)((float)n12 + f10);
            }
            n12 = n15;
        }
        int n17 = n14;
        int n18 = g2_0.a(4390, 4532122126271250085L);
        if (stringArray != null) {
            if (n17 > n18) {
                n14 = g2_0.a(4390, 4532122126271250085L);
            }
            n17 = n13;
            n18 = g2_0.a(4390, 4532122126271250085L);
        }
        if (stringArray != null) {
            if (n17 > n18) {
                n13 = g2_0.a(4390, 4532122126271250085L);
            }
            n17 = n12;
            n18 = g2_0.a(4390, 4532122126271250085L);
        }
        if (stringArray != null) {
            if (n17 > n18) {
                n12 = g2_0.a(4390, 4532122126271250085L);
            }
            n17 = g2_0.a(1152, 4474412071046638343L) | n14 << g2_0.a(14258, 378533527156742195L) | n13 << g2_0.a(27573, 6883390274458092592L);
            n18 = n12;
        }
        return n17 | n18;
    }

    private static float L(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        String[] stringArray;
        float f17;
        block4: {
            f17 = 0.0f;
            float f18 = 2.0f;
            stringArray = W5.q();
            f16 = 1.0f;
            f10 += 371.0f;
            f11 += 529.0f;
            for (int i2 = 0; i2 < (int)f13; ++i2) {
                f17 += uZ.G(f10, f11, f12) / f16;
                f10 *= f18;
                f11 *= f18;
                f15 = f16 * 2.0f;
                if (stringArray != null) {
                    f16 = f15;
                    if (stringArray != null) continue;
                }
                break block4;
            }
            f15 = f13 - (float)((int)f13);
        }
        float f19 = f14 = f15;
        if (stringArray != null) {
            if (f19 != 0.0f) {
                f17 += f14 * uZ.G(f10, f11, f12) / f16;
            }
            f19 = f17;
        }
        return f19;
    }

    /*
     * Unable to fully structure code
     */
    private float J(float var1_1, float var2_2) {
        var4_3 = this.A * var1_1 + this.I * this.N;
        var5_4 = this.I * var1_1 - this.I * this.N;
        var3_5 = W5.q();
        v0 = this.S;
        if (var3_5 == null) ** GOTO lbl10
        if ((double)v0 == 0.0) {
            v1 = uZ.G(var4_3, var2_2, var5_4);
        } else {
            v0 = var4_3;
lbl10:
            // 2 sources

            v1 = g2_0.L(v0, var2_2, var5_4, this.S);
        }
        var6_6 = v1;
        return var6_6;
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
                v0 = "vxH_aCm\r^Q^gEaAn\u001e\u0005:".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 3;
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
                                v9 = 30;
                                break;
                            }
                            case 2: {
                                v9 = 51;
                                break;
                            }
                            case 3: {
                                v9 = 40;
                                break;
                            }
                            case 4: {
                                v9 = 23;
                                break;
                            }
                            case 5: {
                                v9 = 50;
                                break;
                            }
                            default: {
                                v9 = 11;
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
                g2_0.a = new String(v10).intern();
                var0_1 = 9070760393125776947L;
                var6_2 = new long[11];
                var3_3 = 0;
                var4_4 = "\u009f\u0094P\u000f\u00f7\u0088YZ\u001b\u00b1WD\u0005\u00e40i\u00aa\u008d\u00b9{\u00baoj\u00cd\u00b3\u00f2\u00c4\u00a1\u00071\u0016\u0010\u00b2\u00e2\u0004\u0004\u00e8f\u0091\u0080\u00a8a\u0086\u00d3D\u0085\u00a54\u00b5C\u00d1\u0005\u0005\u00da\u0003\u00bf\u001ca\u009c\\\u00dd\u0085\u00ca\u000b\u00a3\u00e8\fTv\u00cd,\u000e";
                var5_5 = "\u009f\u0094P\u000f\u00f7\u0088YZ\u001b\u00b1WD\u0005\u00e40i\u00aa\u008d\u00b9{\u00baoj\u00cd\u00b3\u00f2\u00c4\u00a1\u00071\u0016\u0010\u00b2\u00e2\u0004\u0004\u00e8f\u0091\u0080\u00a8a\u0086\u00d3D\u0085\u00a54\u00b5C\u00d1\u0005\u0005\u00da\u0003\u00bf\u001ca\u009c\\\u00dd\u0085\u00ca\u000b\u00a3\u00e8\fTv\u00cd,\u000e".length();
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
                    var4_4 = "^Xob\u00a5\u00e8\u009b\u0091\u00bb\u0011c\u00ff\u00c7\u00c0\u00a5\u007f";
                    var5_5 = "^Xob\u00a5\u00e8\u009b\u0091\u00bb\u0011c\u00ff\u00c7\u00c0\u00a5\u007f".length();
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
        g2_0.b = var6_2;
        g2_0.c = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6F82;
        if (c[n11] == null) {
            g2_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

