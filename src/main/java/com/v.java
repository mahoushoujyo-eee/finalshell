/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.R;

public class v
extends R {
    public v() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public v(float[] fArray) {
        this.T = fArray[0];
        this.o = fArray[1];
        this.I = fArray[2];
        this.z = fArray[2];
    }

    public v(float f10, float f11, float f12, float f13) {
        this.T = f10;
        this.o = f11;
        this.I = f12;
        this.z = f13;
    }

    public v(v v2) {
        this.T = v2.T;
        this.o = v2.o;
        this.I = v2.I;
        this.z = v2.z;
    }

    public v(R r2) {
        this.T = r2.T;
        this.o = r2.o;
        this.I = r2.I;
        this.z = r2.z;
    }

    public float n(v v2) {
        return v2.T * this.T + v2.o * this.o + v2.I * this.I + v2.z * this.z;
    }

    public float Q() {
        return (float)Math.sqrt(this.T * this.T + this.o * this.o + this.I * this.I + this.z * this.z);
    }

    public void P() {
        float f10 = 1.0f / (this.T * this.T + this.o * this.o + this.I * this.I + this.z * this.z);
        this.T *= f10;
        this.o *= f10;
        this.I *= f10;
        this.z *= f10;
    }
}

