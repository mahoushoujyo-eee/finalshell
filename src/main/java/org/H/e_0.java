/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import java.io.DataOutputStream;
import java.io.IOException;
import org.H.Y;
import org.h.cr_0;

/*
 * Renamed from org.H.e
 */
class e_0
extends Y {
    final byte[] n;
    final cr_0 F;

    e_0(cr_0 cr_02, short s2, byte[] byArray) {
        this.F = cr_02;
        this.n = byArray;
        super(s2);
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.n);
    }
}

