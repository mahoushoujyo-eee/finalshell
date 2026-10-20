/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.H.Y;

public class CA
extends Y {
    CA(short s2) {
        super(s2);
    }

    private static Y v(short s2, DataInputStream dataInputStream) {
        return new CA(s2);
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) {
    }

    static Y K(short s2, DataInputStream dataInputStream) {
        return CA.v(s2, dataInputStream);
    }
}

