/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.R;
import com.kb_1;
import com.kl_0;

public class B
extends R {
    public B() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public B(float[] fArray) {
        this.T = fArray[0];
        this.o = fArray[1];
        this.I = fArray[2];
        this.z = fArray[3];
    }

    public B(float f10, float f11, float f12, float f13) {
        this.T = f10;
        this.o = f11;
        this.I = f12;
        this.z = f13;
    }

    public B(B b2) {
        this.T = b2.T;
        this.o = b2.o;
        this.I = b2.I;
        this.z = b2.z;
    }

    public B(R r2) {
        this.T = r2.T;
        this.o = r2.o;
        this.I = r2.I;
        this.z = r2.z;
    }

    public void S(kl_0 kl_02) {
        float f10 = kl_02.G * 0.5f;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.T = kl_02.C * f12;
        this.o = kl_02.w * f12;
        this.I = kl_02.J * f12;
        this.z = f11;
    }

    public void l() {
        float f10 = 1.0f / (this.T * this.T + this.o * this.o + this.I * this.I + this.z * this.z);
        this.T *= f10;
        this.o *= f10;
        this.I *= f10;
        this.z *= f10;
    }

    public void G(kb_1 kb_12) {
        block17: {
            float f10;
            float f11;
            int n10;
            block20: {
                double d2;
                block21: {
                    block18: {
                        float f12;
                        block19: {
                            double d3;
                            block15: {
                                block16: {
                                    float f13 = kb_12.n + kb_12.B + kb_12.P;
                                    n10 = R.g();
                                    double d4 = (double)f13 - 0.0;
                                    d3 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                                    if (n10 != 0) break block15;
                                    if (d3 <= 0) break block16;
                                    f11 = (float)Math.sqrt(f13 + 1.0f);
                                    this.z = f11 / 2.0f;
                                    f11 = 0.5f / f11;
                                    this.T = (kb_12.a - kb_12.T) * f11;
                                    this.o = (kb_12.v - kb_12.Z) * f11;
                                    this.I = (kb_12.i - kb_12.C) * f11;
                                    if (n10 == 0) break block17;
                                }
                                d3 = 0.0;
                            }
                            d2 = d3;
                            float f14 = kb_12.B - kb_12.n;
                            f10 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                            if (n10 != 0) break block18;
                            if (f10 <= 0) break block19;
                            d2 = 1.0;
                            float f15 = kb_12.P - kb_12.B;
                            f10 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                            if (n10 != 0) break block20;
                            if (f10 <= 0) break block21;
                            d2 = 2;
                            if (n10 == 0) break block21;
                        }
                        f10 = (f12 = kb_12.P - kb_12.n) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (n10 != 0) break block20;
                    if (f10 > 0) {
                        d2 = 2;
                    }
                }
                f10 = (float)d2;
            }
            switch (f10) {
                case 0: {
                    f11 = (float)Math.sqrt(kb_12.n - (kb_12.B + kb_12.P) + 1.0f);
                    this.T = f11 * 0.5f;
                    if (n10 == 0) {
                        if ((double)f11 != 0.0) {
                            f11 = 0.5f / f11;
                        }
                        this.z = (kb_12.a - kb_12.T) * f11;
                        this.o = (kb_12.i + kb_12.C) * f11;
                        this.I = (kb_12.Z + kb_12.v) * f11;
                    }
                    if (n10 == 0) break;
                }
                case 1: {
                    f11 = (float)Math.sqrt(kb_12.B - (kb_12.P + kb_12.n) + 1.0f);
                    this.o = f11 * 0.5f;
                    if (n10 == 0) {
                        if ((double)f11 != 0.0) {
                            f11 = 0.5f / f11;
                        }
                        this.z = (kb_12.v - kb_12.Z) * f11;
                        this.I = (kb_12.a + kb_12.T) * f11;
                        this.T = (kb_12.C + kb_12.i) * f11;
                    }
                    if (n10 == 0) break;
                }
                case 2: {
                    f11 = (float)Math.sqrt(kb_12.n - (kb_12.B + kb_12.P) + 1.0f);
                    this.I = f11 * 0.5f;
                    if (n10 == 0) {
                        if ((double)f11 != 0.0) {
                            f11 = 0.5f / f11;
                        }
                        this.z = (kb_12.i - kb_12.C) * f11;
                        this.T = (kb_12.v + kb_12.Z) * f11;
                    }
                    this.o = (kb_12.T + kb_12.a) * f11;
                }
            }
        }
    }
}

