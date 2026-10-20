/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.V.N;
import org.V.X;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class p
implements N {
    final byte[] Z;
    final String d;
    final X P;

    p(X x10, byte[] byArray, String string) {
        this.P = x10;
        this.Z = byArray;
        this.d = string;
    }

    @Override
    public InputStream o() {
        return new ByteArrayInputStream(this.Z);
    }

    @Override
    public String o() {
        return this.d;
    }

    @Override
    public long z() {
        return X.f(this.P);
    }
}

