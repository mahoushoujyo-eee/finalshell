/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.V.I;

class C
extends ByteArrayOutputStream {
    final String J;
    final I u;

    C(I i2, String string) {
        this.u = i2;
        this.J = string;
    }

    @Override
    public void close() throws IOException {
        super.close();
        I.T(this.u).put(this.J, this.toByteArray());
    }
}

