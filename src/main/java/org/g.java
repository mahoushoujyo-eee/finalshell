/*
 * Decompiled with CFR 0.152.
 */
package org;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.E;
import org.T.s;

class g
extends ByteArrayOutputStream {
    final OutputStream i;
    final E z;

    g(E e2, OutputStream outputStream) {
        this.z = e2;
        this.i = outputStream;
    }

    @Override
    public void close() throws IOException {
        byte[] byArray = this.toByteArray();
        s.K(byArray);
        this.i.write(byArray);
        this.i.close();
    }
}

