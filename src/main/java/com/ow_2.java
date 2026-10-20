/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ap_0;

/*
 * Renamed from com.ow
 */
public class ow_2 {
    public int m;
    public int W;
    public int L;
    public int c;
    ap_0 V;

    public ow_2(int n10) {
        this.m = n10;
        this.r(this.m);
        this.W = n10;
    }

    public void f(char c2, boolean bl) {
        block3: {
            int n10;
            block2: {
                String[] stringArray = ap_0.F();
                ow_2 ow_22 = this;
                ow_2 ow_23 = ow_22;
                n10 = ow_22.W + 1;
                if (stringArray != null) break block2;
                ow_23.W = n10;
                if (!bl) break block3;
                ow_2 ow_24 = this;
                ow_23 = ow_24;
                n10 = ow_24.W + 1;
            }
            ow_23.W = n10;
        }
    }

    public int T() {
        return this.m;
    }

    public void r(int n10) {
        this.m = n10;
    }

    public int g() {
        return this.W;
    }

    public void a(int n10) {
        this.W = n10;
    }

    public int t() {
        return this.W - this.m;
    }

    public ap_0 N() {
        return this.V;
    }

    public void z(ap_0 ap_02) {
        this.V = ap_02;
    }

    public int C() {
        return this.L;
    }

    public int D() {
        return this.c;
    }

    public void z(int n10) {
        this.L = n10;
    }

    public void Z(int n10) {
        this.c = n10;
    }
}

