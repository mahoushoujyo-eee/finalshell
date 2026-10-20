/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.Y;

/*
 * Renamed from org.H.Ct
 */
public class ct_0
extends Y {
    private final short i;

    public ct_0(short s2, short s3) {
        super(s2);
        this.i = s3;
    }

    private static Y w(short s2, DataInputStream dataInputStream) throws IOException {
        return new ct_0(s2, dataInputStream.readShort());
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.i);
    }

    static Y N(short s2, DataInputStream dataInputStream) throws IOException {
        return ct_0.w(s2, dataInputStream);
    }
}

