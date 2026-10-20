/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oy_2;

/*
 * Renamed from com.od
 */
public class od_2
extends oy_2 {
    public od_2() {
        this(0.0f, 0.0f, 0.0f);
    }

    public od_2(float[] fArray) {
        this.e = fArray[0];
        this.I = fArray[1];
        this.k = fArray[2];
    }

    public od_2(float f10, float f11, float f12) {
        this.e = f10;
        this.I = f11;
        this.k = f12;
    }

    public od_2(od_2 od_22) {
        this.e = od_22.e;
        this.I = od_22.I;
        this.k = od_22.k;
    }

    public od_2(oy_2 oy_22) {
        this.e = oy_22.e;
        this.I = oy_22.I;
        this.k = oy_22.k;
    }

    public float z(od_2 od_22) {
        return (float)Math.acos(this.Y(od_22) / (this.M() * od_22.M()));
    }

    public float Y(od_2 od_22) {
        return od_22.e * this.e + od_22.I * this.I + od_22.k * this.k;
    }

    public void G(od_2 od_22, od_2 od_23) {
        this.e = od_22.I * od_23.k - od_22.k * od_23.I;
        this.I = od_22.k * od_23.e - od_22.e * od_23.k;
        this.k = od_22.e * od_23.I - od_22.I * od_23.e;
    }

    public float M() {
        return (float)Math.sqrt(this.e * this.e + this.I * this.I + this.k * this.k);
    }

    public void E() {
        float f10 = 1.0f / (float)Math.sqrt(this.e * this.e + this.I * this.I + this.k * this.k);
        this.e *= f10;
        this.I *= f10;
        this.k *= f10;
    }
}

