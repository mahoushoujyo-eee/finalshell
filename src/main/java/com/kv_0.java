/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HM;
import com.SC;
import com.uZ;

/*
 * Renamed from com.Kv
 */
public class kv_0
extends HM {
    private float g;

    public kv_0(SC sC, float f10) {
        super(sC);
        this.g = f10;
    }

    public void P(float f10) {
        this.g = f10;
    }

    public float m() {
        return this.g;
    }

    @Override
    public float h(float f10, float f11) {
        float f12;
        block2: {
            float f13 = 0.0f;
            String string = uZ.h();
            float f14 = 1.0f;
            while (f14 <= this.g) {
                f13 += Math.abs(this.T.h(f14 * f10, f14 * f11)) / f14;
                f12 = f14 * 2.0f;
                if (string == null) {
                    f14 = f12;
                    if (string == null) continue;
                }
                break block2;
            }
            f12 = f13;
        }
        return f12;
    }
}

