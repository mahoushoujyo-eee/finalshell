/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.H.Y;

/*
 * Renamed from org.H.Cy
 */
public class cy_0
extends Y {
    public cy_0(short s2) {
        super(s2);
    }

    private static Y T(short s2, DataInputStream dataInputStream) {
        return new cy_0(s2);
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) {
    }

    static Y w(short s2, DataInputStream dataInputStream) {
        return cy_0.T(s2, dataInputStream);
    }
}

