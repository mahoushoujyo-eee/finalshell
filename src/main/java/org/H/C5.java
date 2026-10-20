/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.F;
import org.H.Y;
import org.h.cr_0;

public class C5
extends Y {
    private final F[] f;

    public C5(short s2, F[] fArray) {
        super(s2);
        this.f = fArray;
    }

    private static Y k(short s2, DataInputStream dataInputStream) throws IOException {
        F[] fArray = new F[dataInputStream.readUnsignedShort()];
        ky_2[] ky_2Array = cr_0.q();
        for (int n10 = 0; n10 < fArray.length; n10 = (int)((short)(n10 + 1))) {
            fArray[n10] = new F(dataInputStream.readShort(), dataInputStream.readShort());
            if (ky_2Array == null) continue;
        }
        return new C5(s2, fArray);
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(this.f.length);
        F[] fArray = this.f;
        int n10 = fArray.length;
        ky_2[] ky_2Array2 = ky_2Array;
        for (int i2 = 0; i2 < n10; ++i2) {
            F f10 = fArray[i2];
            dataOutputStream.writeShort(f10.p);
            dataOutputStream.writeShort(f10.X);
            if (ky_2Array2 == null) continue;
        }
    }

    static Y L(short s2, DataInputStream dataInputStream) throws IOException {
        return C5.k(s2, dataInputStream);
    }
}

