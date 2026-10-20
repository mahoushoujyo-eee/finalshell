/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SC;
import com.uZ;

/*
 * Renamed from com.Ek
 */
public class ek_0
implements SC {
    protected float[] D;
    protected float M;
    protected float q;
    protected float y;
    protected SC N;

    public ek_0(float f10, float f11, float f12) {
        this(f10, f11, f12, new uZ());
    }

    public ek_0(float f10, float f11, float f12, SC sC) {
        String string = uZ.h();
        this.M = f10;
        this.q = f11;
        this.y = f12;
        this.N = sC;
        this.D = new float[(int)f12 + 1];
        String string2 = string;
        float f13 = 1.0f;
        for (int i2 = 0; i2 <= (int)f12; ++i2) {
            this.D[i2] = (float)Math.pow(f13, -f10);
            f13 *= f11;
            if (string2 == null) continue;
        }
    }

    public void b(SC sC) {
        this.N = sC;
    }

    public SC C() {
        return this.N;
    }

    @Override
    public float h(float f10, float f11) {
        float f12;
        float f13;
        int n10;
        String string;
        float f14;
        block4: {
            f14 = 0.0f;
            f10 += 371.0f;
            string = uZ.h();
            f11 += 529.0f;
            for (n10 = 0; n10 < (int)this.y; ++n10) {
                f14 += this.N.h(f10, f11) * this.D[n10];
                f10 *= this.q;
                f13 = f11 * this.q;
                if (string == null) {
                    f11 = f13;
                    if (string == null) continue;
                }
                break block4;
            }
            f13 = this.y - (float)((int)this.y);
        }
        float f15 = f12 = f13;
        if (string == null) {
            if (f15 != 0.0f) {
                f14 += f12 * this.N.h(f10, f11) * this.D[n10];
            }
            f15 = f14;
        }
        return f15;
    }
}

