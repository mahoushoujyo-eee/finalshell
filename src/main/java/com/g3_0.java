/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C4;
import com.NM;
import com.SC;
import com.W5;
import com.gt_1;
import com.iw_2;
import com.po_0;
import com.pr_1;
import com.uZ;
import java.awt.Rectangle;
import java.util.Random;

/*
 * Renamed from com.g3
 */
public class g3_0
extends gt_1
implements SC,
Cloneable {
    protected float E;
    protected float N;
    protected float C;
    public float S;
    public float Y;
    public float J;
    public float y;
    public float r;
    public boolean W;
    protected po_0 I;
    protected float[] D;
    protected float P;
    protected Random a;
    protected float i;
    protected float x;
    protected float O;
    protected float h;
    protected pr_1[] n;
    protected float Z;
    protected int X;
    private static byte[] z;
    private float b;
    private static final String c;
    private static final long[] e;
    private static final Integer[] g;

    public g3_0() {
        block7: {
            byte[] byArray;
            String[] stringArray;
            block9: {
                this.E = 32.0f;
                this.N = 1.0f;
                this.C = 0.0f;
                this.S = 1.0f;
                this.Y = 1.0f;
                this.J = 0.5f;
                this.y = 0.5f;
                this.r = 2.0f;
                this.W = false;
                this.I = new C4();
                this.D = new float[]{1.0f, 0.0f, 0.0f, 0.0f};
                this.a = new Random();
                this.i = 1.0f;
                this.x = 0.0f;
                this.O = 0.0f;
                this.h = 1.0f;
                this.n = null;
                stringArray = W5.q();
                this.Z = 0.0f;
                this.X = g3_0.a(29060, 2141948544128246428L);
                this.n = new pr_1[3];
                for (int i2 = 0; i2 < this.n.length; ++i2) {
                    this.n[i2] = new pr_1(this);
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block7;
                }
                byArray = z;
                if (stringArray == null) break block9;
                if (byArray != null) break block7;
                byArray = new byte[g3_0.a(32426, 3706760276724641204L)];
            }
            z = byArray;
            float f10 = 1.0f;
            float f11 = 0.0f;
            float f12 = 2.5f;
            int n10 = 0;
            while (n10 < g3_0.a(9859, 8218065916300277138L)) {
                block8: {
                    if (n10 > 1) {
                        f10 *= (float)n10;
                    }
                    float f13 = (float)Math.pow(f12, n10) * (float)Math.exp(-f12) / f10;
                    int n11 = (int)(f11 * 8192.0f);
                    int n12 = (int)((f11 += f13) * 8192.0f);
                    for (int i3 = n11; i3 < n12; ++i3) {
                        g3_0.z[i3] = (byte)n10;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block8;
                    }
                    ++n10;
                }
                if (stringArray != null) continue;
            }
        }
    }

    public void u(float f10) {
        this.E = f10;
    }

    public float K() {
        return this.E;
    }

    public void l(float f10) {
        this.N = f10;
    }

    public float D() {
        return this.N;
    }

    public void f(float f10) {
        this.C = f10;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.i = f11;
        this.x = f12;
        this.O = -f12;
        this.h = f11;
    }

    public float C() {
        return this.C;
    }

    public void V(int n10, float f10) {
        this.D[n10] = f10;
    }

    public float m(int n10) {
        return this.D[n10];
    }

    public void c(float f10) {
        this.P = f10;
    }

    public float l() {
        return this.P;
    }

    public void P(float f10) {
        this.b = f10;
    }

    public float E() {
        return this.b;
    }

    public void G(float f10) {
        this.D[0] = f10;
    }

    public float R() {
        return this.D[0];
    }

    public void p(float f10) {
        this.D[1] = f10;
    }

    public float T() {
        return this.D[1];
    }

    public void W(float f10) {
        this.D[2] = f10;
    }

    public float k() {
        return this.D[2];
    }

    public void X(float f10) {
        this.D[3] = f10;
    }

    public float c() {
        return this.D[3];
    }

    public void Q(po_0 po_02) {
        this.I = po_02;
    }

    public po_0 U() {
        return this.I;
    }

    public void U(float f10) {
        this.Z = f10;
    }

    public float F() {
        return this.Z;
    }

    public void W(int n10) {
        this.X = n10;
    }

    public int z() {
        return this.X;
    }

    public void a(float f10) {
        this.r = f10;
    }

    public float M() {
        return this.r;
    }

    public void j(float f10) {
        this.Y = f10;
    }

    public float W() {
        return this.Y;
    }

    public void y(float f10) {
        this.S = f10;
    }

    public float u() {
        return this.S;
    }

    /*
     * Unable to fully structure code
     */
    private float G(float var1_1, float var2_2, int var3_3, int var4_4, pr_1[] var5_5) {
        block33: {
            block35: {
                block34: {
                    v0 = W5.q();
                    this.a.setSeed(g3_0.a(9331, 3862882010113816425L) * var3_3 + g3_0.a(1115, 6335404623646758722L) * var4_4);
                    var6_6 = v0;
                    v1 = this.X;
                    if (var6_6 == null) break block34;
                    switch (v1) {
                        default: {
                            var7_7 = g3_0.z[this.a.nextInt() & g3_0.a(4989, 4274391125583167590L)];
                            if (var6_6 != null) break block35;
                        }
                        case 1: {
                            var7_7 = 1;
                            if (var6_6 != null) break block35;
                        }
                        case 2: {
                            var7_7 = 1;
                            if (var6_6 != null) break block35;
                        }
                        case 3: {
                            var7_7 = 2;
                            if (var6_6 != null) break block35;
                        }
                        case 4: {
                            v1 = 2;
                        }
                    }
                }
                var7_7 = v1;
            }
            for (var8_8 = 0; var8_8 < var7_7; ++var8_8) {
                block38: {
                    block39: {
                        block40: {
                            block36: {
                                block37: {
                                    var9_9 = 0.0f;
                                    var10_10 = 0.0f;
                                    v2 = 1.0f;
                                    if (var6_6 == null) break block33;
                                    var11_11 = v2;
                                    v3 = this;
                                    if (var6_6 == null) ** GOTO lbl36
                                    switch (v3.X) {
                                        case 0: {
                                            var9_9 = this.a.nextFloat();
                                            v3 = this;
lbl36:
                                            // 2 sources

                                            var10_10 = v3.a.nextFloat();
                                            if (var6_6 != null) ** GOTO lbl107
                                        }
                                        case 1: {
                                            var10_10 = 0.5f;
                                            var9_9 = 0.5f;
                                            v4 = this.Z;
                                            v5 = 0.0f;
                                            if (var6_6 == null) break;
                                            if (v4 == v5) ** GOTO lbl107
                                            var9_9 = (float)((double)var9_9 + (double)this.Z * ((double)this.a.nextFloat() - 0.5));
                                            var10_10 = (float)((double)var10_10 + (double)this.Z * ((double)this.a.nextFloat() - 0.5));
                                            if (var6_6 != null) ** GOTO lbl107
                                        }
                                        case 2: {
                                            if ((var3_3 & 1) != 0) ** GOTO lbl53
                                            var9_9 = 0.75f;
                                            var10_10 = 0.0f;
                                            if (var6_6 != null) ** GOTO lbl55
lbl53:
                                            // 2 sources

                                            var9_9 = 0.75f;
                                            var10_10 = 0.5f;
lbl55:
                                            // 2 sources

                                            v4 = this.Z;
                                            v5 = 0.0f;
                                            if (var6_6 == null) break;
                                            if (v4 == v5) ** GOTO lbl107
                                            var9_9 += this.Z * uZ.x(271.0f * ((float)var3_3 + var9_9), 271.0f * ((float)var4_4 + var10_10));
                                            var10_10 += this.Z * uZ.x(271.0f * ((float)var3_3 + var9_9) + 89.0f, 271.0f * ((float)var4_4 + var10_10) + 137.0f);
                                            if (var6_6 != null) ** GOTO lbl107
                                        }
                                        case 3: {
                                            v6 = var8_8;
                                            if (var6_6 != null) {
                                                switch (v6) {
                                                    case 0: {
                                                        var9_9 = 0.207f;
                                                        var10_10 = 0.207f;
                                                        if (var6_6 != null) break;
                                                    }
                                                    case 1: {
                                                        var9_9 = 0.707f;
                                                        var10_10 = 0.707f;
                                                        var11_11 = 1.6f;
                                                    }
                                                }
                                                v4 = this.Z;
                                                v5 = 0.0f;
                                                if (var6_6 == null) break;
                                                cfr_temp_0 = v4 - v5;
                                                v6 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                            }
                                            if (v6 == 0) ** GOTO lbl107
                                            var9_9 += this.Z * uZ.x(271.0f * ((float)var3_3 + var9_9), 271.0f * ((float)var4_4 + var10_10));
                                            var10_10 += this.Z * uZ.x(271.0f * ((float)var3_3 + var9_9) + 89.0f, 271.0f * ((float)var4_4 + var10_10) + 137.0f);
                                            if (var6_6 != null) ** GOTO lbl107
                                        }
                                        case 4: {
                                            v7 = var4_4 & 1;
                                            if (var6_6 == null) ** GOTO lbl95
                                            if (v7 != 0) ** GOTO lbl94
                                            if (var8_8 != 0) ** GOTO lbl91
                                            var9_9 = 0.25f;
                                            var10_10 = 0.35f;
                                            if (var6_6 != null) ** GOTO lbl101
lbl91:
                                            // 2 sources

                                            var9_9 = 0.75f;
                                            var10_10 = 0.65f;
                                            if (var6_6 != null) ** GOTO lbl101
lbl94:
                                            // 2 sources

                                            v7 = var8_8;
lbl95:
                                            // 2 sources

                                            if (v7 != 0) ** GOTO lbl99
                                            var9_9 = 0.75f;
                                            var10_10 = 0.35f;
                                            if (var6_6 != null) ** GOTO lbl101
lbl99:
                                            // 2 sources

                                            var9_9 = 0.25f;
                                            var10_10 = 0.65f;
lbl101:
                                            // 4 sources

                                            v4 = this.Z;
                                            v5 = 0.0f;
                                            if (var6_6 == null) break;
                                            if (v4 != v5) {
                                                var9_9 += this.Z * uZ.x(271.0f * ((float)var3_3 + var9_9), 271.0f * ((float)var4_4 + var10_10));
                                                var10_10 += this.Z * uZ.x(271.0f * ((float)var3_3 + var9_9) + 89.0f, 271.0f * ((float)var4_4 + var10_10) + 137.0f);
                                            }
                                        }
lbl107:
                                        // 11 sources

                                        default: {
                                            v4 = var1_1;
                                            v5 = var9_9;
                                        }
                                    }
                                    var12_12 = Math.abs(v4 - v5);
                                    var13_13 = Math.abs(var2_2 - var10_10);
                                    var12_12 *= var11_11;
                                    var13_13 *= var11_11;
                                    cfr_temp_1 = this.r - 1.0f;
                                    v8 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                    if (var6_6 == null) break block36;
                                    if (v8 != false) break block37;
                                    var14_14 = var12_12 + var13_13;
                                    if (var6_6 != null) break block38;
                                }
                                v9 = this.r;
                                v10 = 2.0f;
                                if (var6_6 == null) break block39;
                                cfr_temp_2 = v9 - v10;
                                v8 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                            }
                            if (v8 != false) break block40;
                            var14_14 = (float)Math.sqrt(var12_12 * var12_12 + var13_13 * var13_13);
                            if (var6_6 != null) break block38;
                        }
                        v9 = (float)Math.pow(var12_12, this.r);
                        v10 = (float)Math.pow(var13_13, this.r);
                    }
                    var14_14 = (float)Math.pow(v9 + v10, 1.0f / this.r);
                }
                v11 = (cfr_temp_3 = var14_14 - var5_5[0].S) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                if (var6_6 != null) {
                    if (v11 < 0) {
                        var15_15 = var5_5[2];
                        var5_5[2] = var5_5[1];
                        var5_5[1] = var5_5[0];
                        var5_5[0] = var15_15;
                        var15_15.S = var14_14;
                        var15_15.L = var12_12;
                        var15_15.T = var13_13;
                        var15_15.E = (float)var3_3 + var9_9;
                        var15_15.k = (float)var4_4 + var10_10;
                        if (var6_6 != null) continue;
                    }
                    v11 = (cfr_temp_4 = var14_14 - var5_5[1].S) == 0.0f ? 0 : (cfr_temp_4 < 0.0f ? -1 : 1);
                }
                if (var6_6 != null) {
                    if (v11 < 0) {
                        var15_15 = var5_5[2];
                        var5_5[2] = var5_5[1];
                        var5_5[1] = var15_15;
                        var15_15.S = var14_14;
                        var15_15.L = var12_12;
                        var15_15.T = var13_13;
                        var15_15.E = (float)var3_3 + var9_9;
                        var15_15.k = (float)var4_4 + var10_10;
                        if (var6_6 != null) continue;
                    }
                    v11 = (cfr_temp_5 = var14_14 - var5_5[2].S) == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1);
                }
                if (v11 >= 0) continue;
                var15_15 = var5_5[2];
                var15_15.S = var14_14;
                var15_15.L = var12_12;
                var15_15.T = var13_13;
                var15_15.E = (float)var3_3 + var9_9;
                var15_15.k = (float)var4_4 + var10_10;
                if (var6_6 != null) continue;
            }
            v2 = var5_5[2].S;
        }
        return v2;
    }

    @Override
    public float h(float f10, float f11) {
        float f12;
        block33: {
            float f13;
            float f14;
            block32: {
                String[] stringArray;
                block26: {
                    float f15;
                    float f16;
                    block29: {
                        block30: {
                            float f17;
                            float f18;
                            float f19;
                            float f20;
                            int n10;
                            int n11;
                            block31: {
                                float f21;
                                block27: {
                                    block28: {
                                        block25: {
                                            stringArray = W5.q();
                                            for (n11 = 0; n11 < this.n.length; ++n11) {
                                                this.n[n11].S = Float.POSITIVE_INFINITY;
                                                if (stringArray != null) {
                                                    if (stringArray != null) continue;
                                                }
                                                break block25;
                                            }
                                            n11 = (int)f10;
                                        }
                                        n10 = (int)f11;
                                        f20 = f10 - (float)n11;
                                        f19 = f11 - (float)n10;
                                        f18 = this.G(f20, f19, n11, n10, this.n);
                                        f21 = f18 == f19 ? 0 : (f18 > f19 ? 1 : -1);
                                        if (stringArray != null) {
                                            float f22;
                                            if (f21 > 0) {
                                                f18 = this.G(f20, f19 + 1.0f, n11, n10 - 1, this.n);
                                            }
                                            f21 = (f22 = f18 - (1.0f - f19)) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                                        }
                                        if (stringArray != null) {
                                            if (f21 > 0) {
                                                f18 = this.G(f20, f19 - 1.0f, n11, n10 + 1, this.n);
                                            }
                                            f21 = f18 == f20 ? 0 : (f18 > f20 ? 1 : -1);
                                        }
                                        if (stringArray == null) break block27;
                                        if (f21 <= 0) break block28;
                                        this.G(f20 + 1.0f, f19, n11 - 1, n10, this.n);
                                        f21 = f18 == f19 ? 0 : (f18 > f19 ? 1 : -1);
                                        if (stringArray != null) {
                                            float f23;
                                            if (f21 > 0) {
                                                f18 = this.G(f20 + 1.0f, f19 + 1.0f, n11 - 1, n10 - 1, this.n);
                                            }
                                            f21 = (f23 = f18 - (1.0f - f19)) == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                                        }
                                        if (stringArray == null) break block27;
                                        if (f21 > 0) {
                                            f18 = this.G(f20 + 1.0f, f19 - 1.0f, n11 - 1, n10 + 1, this.n);
                                        }
                                    }
                                    f16 = f18;
                                    if (stringArray == null) break block29;
                                    float f24 = f16 - (1.0f - f20);
                                    f21 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
                                }
                                if (f21 <= 0) break block30;
                                f18 = this.G(f20 - 1.0f, f19, n11 + 1, n10, this.n);
                                f17 = f18 == f19 ? 0 : (f18 > f19 ? 1 : -1);
                                if (stringArray == null) break block31;
                                if (f17 > 0) {
                                    f18 = this.G(f20 - 1.0f, f19 + 1.0f, n11 + 1, n10 - 1, this.n);
                                }
                                f16 = f18;
                                if (stringArray == null) break block29;
                                float f25 = f16 - (1.0f - f19);
                                f17 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                            }
                            if (f17 > 0) {
                                f18 = this.G(f20 - 1.0f, f19 - 1.0f, n11 + 1, n10 + 1, this.n);
                            }
                        }
                        f16 = 0.0f;
                    }
                    f14 = f16;
                    for (int i2 = 0; i2 < 3; ++i2) {
                        f14 += this.D[i2] * this.n[i2].S;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block26;
                    }
                    f13 = (f15 = this.P - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    if (stringArray == null) break block32;
                    if (f13 != false) {
                        float f26;
                        float f27 = f26 = (float)Math.atan2(f11 - this.n[0].k, f10 - this.n[0].E);
                        float f28 = 0.0f;
                        if (stringArray != null) {
                            if (f27 < f28) {
                                f26 += (float)Math.PI * 2;
                            }
                            f27 = f14;
                            f28 = this.P * (f26 /= (float)Math.PI * 4);
                        }
                        f14 = f27 + f28;
                    }
                }
                f12 = this.b;
                if (stringArray == null) break block33;
                float f29 = f12 - 0.0f;
                f13 = f29 == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1);
            }
            if (f13 != false) {
                float f30 = 1.0f / (this.n[0].T + this.n[0].L);
                f14 += this.b * f30;
            }
            f12 = f14;
        }
        return f12;
    }

    public float m(float f10, float f11, float f12) {
        float f13;
        block2: {
            float f14 = 0.0f;
            String[] stringArray = W5.q();
            float f15 = 1.0f;
            while (f15 <= f12) {
                f14 += this.h(f15 * f10, f15 * f11) / f15;
                f13 = f15 * 2.0f;
                if (stringArray != null) {
                    f15 = f13;
                    if (stringArray != null) continue;
                }
                break block2;
            }
            f13 = f14;
        }
        return f13;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int J(int var1_1, int var2_2, int[] var3_3, int var4_4, int var5_5) {
        block8: {
            block7: {
                var7_6 = this.i * (float)var1_1 + this.x * (float)var2_2;
                var6_7 = W5.q();
                var8_8 = this.O * (float)var1_1 + this.h * (float)var2_2;
                var7_6 /= this.E;
                var8_8 /= this.E * this.N;
                var7_6 += 1000.0f;
                var8_8 += 1000.0f;
                v0 = this;
                if (var6_7 == null) ** GOTO lbl14
                if (v0.Y == 1.0f) {
                    v1 = this.h(var7_6, var8_8);
                } else {
                    v0 = this;
lbl14:
                    // 2 sources

                    v1 = v0.m(var7_6, var8_8, this.Y);
                }
                var9_9 = v1;
                var9_9 *= 2.0f;
                var9_9 *= this.S;
                var10_10 = g3_0.a(6655, 5113470817203358435L);
                v2 = this.I;
                if (var6_7 == null) break block7;
                if (v2 == null) break block8;
                v2 = this.I;
            }
            var11_11 = v2.D(var9_9);
            v3 = this.W;
            if (var6_7 != null) {
                if (v3 != 0) {
                    var12_13 = NM.L((int)((this.n[0].E - 1000.0f) * this.E), 0, var4_4 - 1);
                    var13_15 = NM.L((int)((this.n[0].k - 1000.0f) * this.E), 0, var5_5 - 1);
                    var11_11 = var3_3[var13_15 * var4_4 + var12_13];
                    var9_9 = (this.n[1].S - this.n[0].S) / (this.n[1].S + this.n[0].S);
                    var9_9 = NM.k(this.D[1], this.D[0], var9_9);
                    var11_11 = NM.n(var9_9, g3_0.a(23767, 9141639842731118535L), var11_11);
                }
                v3 = var11_11;
            }
            return v3;
        }
        var11_12 = iw_2.e((int)(var9_9 * 255.0f));
        var12_14 = var11_12 << g3_0.a(5134, 2490397653010089745L);
        var13_16 = var11_12 << g3_0.a(3534, 799104251934383827L);
        var14_17 = var11_12;
        return var10_10 | var12_14 | var13_16 | var14_17;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = 0;
        int[] nArray2 = new int[n10 * n11];
        int n13 = 0;
        String[] stringArray = W5.q();
        while (n13 < n11) {
            block3: {
                for (int i2 = 0; i2 < n10; ++i2) {
                    nArray2[n12++] = this.J(i2, n13, nArray, n10, n11);
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block3;
                }
                ++n13;
            }
            if (stringArray != null) continue;
        }
        return nArray2;
    }

    @Override
    public Object clone() {
        g3_0 g3_02 = (g3_0)super.clone();
        g3_02.D = (float[])this.D.clone();
        g3_02.n = (pr_1[])this.n.clone();
        g3_02.a = new Random();
        return g3_02;
    }

    public String toString() {
        return c;
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
                v0 = "2gd*RR>IAy2KU7\u0007p2p\t".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 34;
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
                                v9 = 68;
                                break;
                            }
                            case 1: {
                                v9 = 32;
                                break;
                            }
                            case 2: {
                                v9 = 62;
                                break;
                            }
                            case 3: {
                                v9 = 124;
                                break;
                            }
                            case 4: {
                                v9 = 5;
                                break;
                            }
                            case 5: {
                                v9 = 2;
                                break;
                            }
                            default: {
                                v9 = 121;
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
                g3_0.c = new String(v10).intern();
                var0_1 = 5898790930797022666L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "\u00c0\u0093n<\u0001\u009e/T\u0093\u000b\u0015]f\u00a6\u00da\u009fa\u00896\u00ce\u00f4gx\u0098P\u00e5S\u00c2\u00cd\u0004RS\u00cc\u00e1\u009c\u00c6a\u00c8G)\u00dc\u00daq\u00b3a~S\u0011Z\u00c5\u00d0b+\u00c0\u0080~\u00c0]\u00cc\u008b\u00b3Q\u00ca\u00cb";
                var5_5 = "\u00c0\u0093n<\u0001\u009e/T\u0093\u000b\u0015]f\u00a6\u00da\u009fa\u00896\u00ce\u00f4gx\u0098P\u00e5S\u00c2\u00cd\u0004RS\u00cc\u00e1\u009c\u00c6a\u00c8G)\u00dc\u00daq\u00b3a~S\u0011Z\u00c5\u00d0b+\u00c0\u0080~\u00c0]\u00cc\u008b\u00b3Q\u00ca\u00cb".length();
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
                    var4_4 = "y\u00e6-\u00dao\u00f8\u0002\rd\u00be9\u00da\u00d3\u00a1xR";
                    var5_5 = "y\u00e6-\u00dao\u00f8\u0002\rd\u00be9\u00da\u00d3\u00a1xR".length();
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
        g3_0.e = var6_2;
        g3_0.g = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1318;
        if (g[n11] == null) {
            g3_0.g[n11] = (int)(e[n11] ^ l2);
        }
        return g[n11];
    }
}

