/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.I;
import org.v.NV;

public abstract class NP
extends NV {
    public final String L;
    private static int[] Z;

    public NP(I i2, String string) {
        super(i2);
        this.L = string;
    }

    @Override
    public String toString() {
        return this.L;
    }

    public static void U(int[] nArray) {
        Z = nArray;
    }

    public static int[] a() {
        return Z;
    }

    static {
        if (NP.a() != null) {
            NP.U(new int[2]);
        }
    }
}

