/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.p9
 */
public class p9_0 {
    public int i;
    public int l;
    public int q;
    public int W;
    public int z;
    public int G;
    public float V;
    public float f;

    public p9_0(int n10, int n11, int n12, int n13) {
        this.i = n10;
        this.l = n11;
        this.q = n12;
        this.W = n13;
    }

    public void o() {
        this.z = this.q - this.i;
        this.G = this.W - this.l;
        this.f = this.z * this.z + this.G * this.G;
        this.V = (float)Math.sqrt(this.f);
    }
}

