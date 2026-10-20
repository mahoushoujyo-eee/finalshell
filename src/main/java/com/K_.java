/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HM;
import com.SC;
import com.kv_0;
import com.uZ;

public class K_
extends HM {
    public K_() {
        super(new kv_0(new uZ(), 6.0f));
    }

    public K_(SC sC) {
        super(sC);
    }

    @Override
    public float h(float f10, float f11) {
        return (float)Math.pow(0.5 * (Math.sin(8.0 * (double)this.T.h(f10, f11)) + 1.0), 0.77);
    }
}

