/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.R;
import java.awt.Color;

public class O
extends R {
    public O() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public O(float[] fArray) {
        this.T = fArray[0];
        this.o = fArray[1];
        this.I = fArray[2];
        this.z = fArray[3];
    }

    public O(float f10, float f11, float f12, float f13) {
        this.T = f10;
        this.o = f11;
        this.I = f12;
        this.z = f13;
    }

    public O(O o2) {
        this.T = o2.T;
        this.o = o2.o;
        this.I = o2.I;
        this.z = o2.z;
    }

    public O(R r2) {
        this.T = r2.T;
        this.o = r2.o;
        this.I = r2.I;
        this.z = r2.z;
    }

    public O(Color color) {
        this.x(color);
    }

    public void x(Color color) {
        this.B(color.getRGBComponents(null));
    }

    public Color d() {
        return new Color(this.T, this.o, this.I, this.z);
    }
}

