/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SC;
import com.uZ;

/*
 * Renamed from com.rr
 */
public class rr_2
implements SC {
    private float U = 10.0f;

    public void B(float f10) {
        this.U = f10;
    }

    public float a() {
        return this.U;
    }

    @Override
    public float h(float f10, float f11) {
        float f12 = uZ.x(f10 + 0.5f, f11) * this.U;
        float f13 = uZ.x(f10, f11 + 0.5f) * this.U;
        return uZ.x(f10 + f12, f11 + f13);
    }
}

