/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v.f_0;

public final class f1 {
    @c
    private final String W;
    private final int k;
    private final int B;
    @c
    private I p;
    public final f_0 T;
    public final String Y;

    public f1(@c String string, int n10, int n11, f_0 f_02, String string2) {
        this.W = string;
        this.k = n10;
        this.B = n11;
        this.T = f_02;
        this.Y = string2;
    }

    public f1(I i2, f_0 f_02, String string) {
        this.W = i2.x();
        this.k = i2.D();
        this.B = i2.S();
        this.p = i2;
        this.T = f_02;
        this.Y = string;
    }

    public I T() {
        String[] stringArray = RG.C();
        I i2 = this.p;
        if (stringArray != null) {
            if (i2 != null) {
                return this.p;
            }
            i2 = this.p = new I(this.W, this.k, this.B);
        }
        return i2;
    }

    public String toString() {
        return this.Y;
    }
}

