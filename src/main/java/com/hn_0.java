/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HM;
import com.SC;
import com.uZ;

/*
 * Renamed from com.Hn
 */
public class hn_0
extends HM {
    private float w = 1.0f;

    public hn_0(SC sC) {
        super(sC);
    }

    @Override
    public float h(float f10, float f11) {
        float f12;
        block2: {
            float f13 = 0.0f;
            float f14 = 1.0f;
            String string = uZ.h();
            while (f14 <= this.w) {
                f13 += this.T.h(f14 * f10, f14 * f11) / f14;
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

