/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.R;

public class l
extends R {
    public l() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public l(float[] fArray) {
        this.T = fArray[0];
        this.o = fArray[1];
        this.I = fArray[2];
        this.z = fArray[3];
    }

    public l(float f10, float f11, float f12, float f13) {
        this.T = f10;
        this.o = f11;
        this.I = f12;
        this.z = f13;
    }

    public l(l l2) {
        this.T = l2.T;
        this.o = l2.o;
        this.I = l2.I;
        this.z = l2.z;
    }

    public l(R r2) {
        this.T = r2.T;
        this.o = r2.o;
        this.I = r2.I;
        this.z = r2.z;
    }

    public float B(l l2) {
        return Math.abs(this.T - l2.T) + Math.abs(this.o - l2.o) + Math.abs(this.I - l2.I) + Math.abs(this.z - l2.z);
    }

    public float D(l l2) {
        float f10 = this.T - l2.T;
        float f11 = this.o - l2.o;
        float f12 = this.I - l2.I;
        float f13 = this.z - l2.z;
        return f10 * f10 + f11 * f11 + f12 * f12 + f13 * f13;
    }

    public float r(l l2) {
        float f10 = this.T - l2.T;
        float f11 = this.o - l2.o;
        float f12 = this.I - l2.I;
        float f13 = this.z - l2.z;
        return (float)Math.sqrt(f10 * f10 + f11 * f11 + f12 * f12 + f13 * f13);
    }
}

