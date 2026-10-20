/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class Y {
    private final short b;

    public Y(short s2) {
        this.b = s2;
    }

    public void B(DataOutputStream dataOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.T(new DataOutputStream(byteArrayOutputStream));
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeInt(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(dataOutputStream);
    }

    protected abstract void T(DataOutputStream var1) throws IOException;

    static short H(Y y2) {
        return y2.b;
    }
}

