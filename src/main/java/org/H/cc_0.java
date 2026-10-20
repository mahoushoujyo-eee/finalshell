/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.Y;
import org.h.cr_0;

/*
 * Renamed from org.H.Cc
 */
public class cc_0
extends Y {
    private final short h;

    public cc_0(short s2, short s3) {
        super(s2);
        this.h = s3;
    }

    public String Q(cr_0 cr_02) {
        return cr_02.S(this.h);
    }

    private static Y Z(short s2, DataInputStream dataInputStream) throws IOException {
        return new cc_0(s2, dataInputStream.readShort());
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.h);
    }

    static Y J(short s2, DataInputStream dataInputStream) throws IOException {
        return cc_0.Z(s2, dataInputStream);
    }
}

