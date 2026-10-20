/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LV;
import com.SC;
import com.uZ;
import java.util.Random;

/*
 * Renamed from com.eI
 */
public class ei_1
implements SC {
    public float m = 2.0f;
    public boolean E = false;
    public boolean r;
    private float[] R;
    private Random M;
    private LV[] w;
    private static final long[] a;
    private static final Integer[] b;

    public ei_1() {
        String string = uZ.h();
        this.r = false;
        this.R = new float[]{1.0f, 0.0f, 0.0f, 0.0f};
        this.M = new Random();
        this.w = null;
        this.w = new LV[2];
        for (int i2 = 0; i2 < this.w.length; ++i2) {
            this.w[i2] = new LV(this);
            if (string == null) continue;
        }
    }

    public void a(int n10, float f10) {
        this.R[n10] = f10;
    }

    public float B(int n10) {
        return this.R[n10];
    }

    private float f(float f10, float f11, int n10, int n11, LV[] lVArray) {
        float f12;
        block11: {
            String string = uZ.h();
            this.M.setSeed(ei_1.a(12881, 8123721411019069730L) * n10 + ei_1.a(28541, 1920118299313570831L) * n11);
            int n12 = 3 + this.M.nextInt() % 4;
            n12 = 4;
            int n13 = 0;
            String string2 = string;
            block0: while (true) {
                int n14 = n13;
                block1: while (n14 < n12) {
                    float f13;
                    float f14;
                    float f15;
                    block15: {
                        float f16;
                        block16: {
                            float f17;
                            float f18;
                            block17: {
                                float f19;
                                block13: {
                                    block14: {
                                        f15 = this.M.nextFloat();
                                        f14 = this.M.nextFloat();
                                        f18 = Math.abs(f10 - f15);
                                        f17 = Math.abs(f11 - f14);
                                        f12 = this.m;
                                        if (string2 != null) break block11;
                                        float f20 = f12 - 1.0f;
                                        f19 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                                        if (string2 != null) break block13;
                                        if (f19 != false) break block14;
                                        f13 = f18 + f17;
                                        if (string2 == null) break block15;
                                    }
                                    f16 = this.m;
                                    if (string2 != null) break block16;
                                    float f21 = f16 - 2.0f;
                                    f19 = f21 == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                                }
                                if (f19 != false) break block17;
                                f13 = (float)Math.sqrt(f18 * f18 + f17 * f17);
                                if (string2 == null) break block15;
                            }
                            f16 = (float)Math.pow(Math.pow(f18, this.m) + Math.pow(f17, this.m), 1.0f / this.m);
                        }
                        f13 = f16;
                    }
                    for (int i2 = 0; i2 < lVArray.length; ++i2) {
                        block12: {
                            float f22;
                            LV lV;
                            double d2 = (double)lVArray[i2].g - Double.POSITIVE_INFINITY;
                            n14 = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                            if (string2 != null) continue block1;
                            if (string2 == null) {
                                float f23;
                                if (n14 == 0) {
                                    lV = lVArray[i2];
                                    lV.g = f13;
                                    lV.t = f15;
                                    lV.Y = f14;
                                    lVArray[i2] = lV;
                                    if (string2 == null) break;
                                }
                                f22 = (f23 = f13 - lVArray[i2].g) == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1);
                            }
                            if (f22 >= 0) continue;
                            lV = lVArray[lVArray.length - 1];
                            for (int i3 = lVArray.length - 1; i3 > i2; --i3) {
                                lVArray[i3] = lVArray[i3 - 1];
                                if (string2 == null) {
                                    if (string2 == null) continue;
                                }
                                break block12;
                            }
                            lV.g = f13;
                            lV.t = f15;
                            lV.Y = f14;
                            lVArray[i2] = lV;
                        }
                        if (string2 == null) break;
                        if (string2 == null) continue;
                    }
                    ++n13;
                    if (string2 == null) continue block0;
                }
                break;
            }
            f12 = lVArray[1].g;
        }
        return f12;
    }

    @Override
    public float h(float f10, float f11) {
        float f12;
        block19: {
            float f13;
            float f14;
            float f15;
            String string;
            block22: {
                block23: {
                    float f16;
                    float f17;
                    int n10;
                    int n11;
                    block24: {
                        float f18;
                        block20: {
                            block21: {
                                block18: {
                                    string = uZ.h();
                                    for (n11 = 0; n11 < this.w.length; ++n11) {
                                        this.w[n11].g = Float.POSITIVE_INFINITY;
                                        if (string == null) {
                                            if (string == null) continue;
                                        }
                                        break block18;
                                    }
                                    n11 = (int)f10;
                                }
                                n10 = (int)f11;
                                f15 = f10 - (float)n11;
                                f14 = f11 - (float)n10;
                                f17 = this.f(f15, f14, n11, n10, this.w);
                                f18 = f17 == f14 ? 0 : (f17 > f14 ? 1 : -1);
                                if (string == null) {
                                    float f19;
                                    if (f18 > 0) {
                                        f17 = this.f(f15, f14 + 1.0f, n11, n10 - 1, this.w);
                                    }
                                    f18 = (f19 = f17 - (1.0f - f14)) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                }
                                if (string == null) {
                                    if (f18 > 0) {
                                        f17 = this.f(f15, f14 - 1.0f, n11, n10 + 1, this.w);
                                    }
                                    f18 = f17 == f15 ? 0 : (f17 > f15 ? 1 : -1);
                                }
                                if (string != null) break block20;
                                if (f18 <= 0) break block21;
                                this.f(f15 + 1.0f, f14, n11 - 1, n10, this.w);
                                f18 = f17 == f14 ? 0 : (f17 > f14 ? 1 : -1);
                                if (string == null) {
                                    float f20;
                                    if (f18 > 0) {
                                        f17 = this.f(f15 + 1.0f, f14 + 1.0f, n11 - 1, n10 - 1, this.w);
                                    }
                                    f18 = (f20 = f17 - (1.0f - f14)) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                                }
                                if (string != null) break block20;
                                if (f18 > 0) {
                                    f17 = this.f(f15 + 1.0f, f14 - 1.0f, n11 - 1, n10 + 1, this.w);
                                }
                            }
                            f13 = f17;
                            if (string != null) break block22;
                            float f21 = f13 - (1.0f - f15);
                            f18 = f21 == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                        }
                        if (f18 <= 0) break block23;
                        f17 = this.f(f15 - 1.0f, f14, n11 + 1, n10, this.w);
                        f16 = f17 == f14 ? 0 : (f17 > f14 ? 1 : -1);
                        if (string != null) break block24;
                        if (f16 > 0) {
                            f17 = this.f(f15 - 1.0f, f14 + 1.0f, n11 + 1, n10 - 1, this.w);
                        }
                        f13 = f17;
                        if (string != null) break block22;
                        float f22 = f13 - (1.0f - f14);
                        f16 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                    }
                    if (f16 > 0) {
                        f17 = this.f(f15 - 1.0f, f14 - 1.0f, n11 + 1, n10 + 1, this.w);
                    }
                }
                f13 = 0.0f;
            }
            f12 = f13;
            for (int i2 = 0; i2 < 2; ++i2) {
                f12 += this.R[i2] * this.w[i2].g;
                if (string == null) {
                    if (string == null) continue;
                }
                break block19;
            }
            if (this.r) {
                f12 = (float)((double)f12 + (Math.atan2(f14 - this.w[0].Y, f15 - this.w[0].t) / (Math.PI * 2) + 0.5));
            }
        }
        return f12;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3493336851624527988L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "Kk\u00e8\u007f,\u008c\u008cl\u00dd\u0086\u0004\u00cdW\u00daSm";
        int n11 = "Kk\u00e8\u007f,\u008c\u008cl\u00dd\u0086\u0004\u00cdW\u00daSm".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6B72;
        if (b[n11] == null) {
            ei_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

