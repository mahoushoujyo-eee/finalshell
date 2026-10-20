/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.e3_0;

public class G7
implements e3_0 {
    private e3_0 t;
    private e3_0 q;

    public G7(e3_0 e3_02, e3_0 e3_03) {
        this.t = e3_02;
        this.q = e3_03;
    }

    @Override
    public float H(float f10) {
        return this.t.H(this.q.H(f10));
    }
}

