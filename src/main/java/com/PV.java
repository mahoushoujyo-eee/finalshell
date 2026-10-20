/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.nx_2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.Color;
import java.io.Serializable;

@XStreamAlias(value="GradientColorData")
public class PV
implements Serializable,
Cloneable {
    @XStreamAsAttribute
    private float B;
    @XStreamAsAttribute
    private Color v;

    public PV() {
        this.B = 0.0f;
        this.v = Color.WHITE;
    }

    public PV(float f10, Color color) {
        this.B = f10;
        this.v = color;
    }

    public Color N() {
        return this.v;
    }

    public void C(Color color) {
        this.v = color;
    }

    public float I() {
        return this.B;
    }

    public void P(float f10) {
        this.B = f10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n10 = nx_2.R();
        Object object2 = object;
        if (n10 == 0) {
            if (object2 == null) return false;
            object2 = object;
        }
        if (n10 == 0) {
            if (!(object2 instanceof PV)) {
                return false;
            }
            object2 = object;
        }
        PV pV2 = (PV)object2;
        boolean bl = Float.compare(this.I(), pV2.I());
        if (n10 == 0) {
            if (bl) return false;
            bl = this.N().equals(pV2.N());
        }
        if (n10 != 0) return bl;
        if (!bl) return false;
        return true;
    }

    public PV H() {
        return new PV(this.B, FN.q(this.v));
    }

    public Object clone() throws CloneNotSupportedException {
        return this.H();
    }
}

