/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.File;
import org.F.c;
import org.V.N;
import org.V.U;
import org.v.d_0;

public abstract class D
extends U {
    @Override
    @c
    public final N J(String string) {
        File file = this.C(string);
        if (file == null) {
            return null;
        }
        return new d_0(file);
    }

    @c
    protected abstract File C(String var1);
}

