/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._p_0;

public class W4
implements Comparable {
    private String c;
    private String N;
    private _p_0 I;

    W4(String string, String string2, _p_0 _p_02) {
        this.G(string);
        this.h(string2);
        this.E(_p_02);
    }

    public String z() {
        return this.c;
    }

    void G(String string) {
        this.c = string;
    }

    public String P() {
        return this.N;
    }

    void h(String string) {
        this.N = string;
    }

    public _p_0 x() {
        return this.I;
    }

    void E(_p_0 _p_02) {
        this.I = _p_02;
    }

    public String toString() {
        return this.N;
    }

    public int A(W4 w4) {
        return this.c.compareTo(w4.z());
    }

    public int compareTo(Object object) {
        return this.A((W4)object);
    }
}

