/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.Y;
import org.h.cr_0;
import org.h.n_0;

/*
 * Renamed from org.H.Ce
 */
public class ce_0
extends Y {
    private final short G;

    ce_0(short s2, short s3) {
        super(s2);
        this.G = s3;
    }

    public n_0 j(cr_0 cr_02) {
        return cr_02.G(this.G);
    }

    private static Y x(short s2, DataInputStream dataInputStream) throws IOException {
        return new ce_0(s2, dataInputStream.readShort());
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.G);
    }

    static Y n(short s2, DataInputStream dataInputStream) throws IOException {
        return ce_0.x(s2, dataInputStream);
    }
}

