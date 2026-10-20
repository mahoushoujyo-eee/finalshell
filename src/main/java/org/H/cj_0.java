/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.Y;
import org.h.cr_0;
import org.h.r_0;

/*
 * Renamed from org.H.Cj
 */
public class cj_0
extends Y {
    private final r_0 S;

    public cj_0(short s2, r_0 r_02) {
        super(s2);
        this.S = r_02;
    }

    private static Y W(short s2, DataInputStream dataInputStream) throws IOException {
        return new cj_0(s2, cr_0.d(dataInputStream));
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.S.s());
        this.S.E(dataOutputStream);
    }

    static Y H(short s2, DataInputStream dataInputStream) throws IOException {
        return cj_0.W(s2, dataInputStream);
    }
}

