/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oy_2;

/*
 * Renamed from com.oE
 */
public class oe_1
extends oy_2 {
    public oe_1() {
        this(0.0f, 0.0f, 0.0f);
    }

    public oe_1(float[] fArray) {
        this.e = fArray[0];
        this.I = fArray[1];
        this.k = fArray[2];
    }

    public oe_1(float f10, float f11, float f12) {
        this.e = f10;
        this.I = f11;
        this.k = f12;
    }

    public oe_1(oe_1 oe_12) {
        this.e = oe_12.e;
        this.I = oe_12.I;
        this.k = oe_12.k;
    }

    public oe_1(oy_2 oy_22) {
        this.e = oy_22.e;
        this.I = oy_22.I;
        this.k = oy_22.k;
    }

    public float w(oe_1 oe_12) {
        return Math.abs(this.e - oe_12.e) + Math.abs(this.I - oe_12.I) + Math.abs(this.k - oe_12.k);
    }

    public float n(oe_1 oe_12) {
        float f10 = this.e - oe_12.e;
        float f11 = this.I - oe_12.I;
        float f12 = this.k - oe_12.k;
        return f10 * f10 + f11 * f11 + f12 * f12;
    }

    public float I(oe_1 oe_12) {
        float f10 = this.e - oe_12.e;
        float f11 = this.I - oe_12.I;
        float f12 = this.k - oe_12.k;
        return (float)Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12);
    }
}

