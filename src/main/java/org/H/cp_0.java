/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.C3;
import org.H.Y;
import org.h.cr_0;

/*
 * Renamed from org.H.Cp
 */
public class cp_0
extends Y {
    private final short D;
    private final short Z;
    public final byte[] h;
    private final C3[] q;
    private final Y[] Y;

    public cp_0(short s2, short s3, short s4, byte[] byArray, C3[] c3Array, Y[] yArray) {
        super(s2);
        this.D = s3;
        this.Z = s4;
        this.h = byArray;
        this.q = c3Array;
        this.Y = yArray;
    }

    private static Y K(short s2, cr_0 cr_02, DataInputStream dataInputStream) throws IOException {
        short s3 = dataInputStream.readShort();
        short s4 = dataInputStream.readShort();
        byte[] byArray = cr_0.S(dataInputStream);
        C3[] c3Array = new C3[dataInputStream.readUnsignedShort()];
        ky_2[] ky_2Array = cr_0.q();
        for (int i2 = 0; i2 < c3Array.length; ++i2) {
            c3Array[i2] = new C3(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
            if (ky_2Array == null) continue;
        }
        Y[] yArray = new Y[dataInputStream.readUnsignedShort()];
        for (int i3 = 0; i3 < yArray.length; ++i3) {
            yArray[i3] = cr_0.U(cr_02, dataInputStream);
            if (ky_2Array == null) continue;
        }
        return new cp_0(s2, s3, s4, byArray, c3Array, yArray);
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        ky_2[] ky_2Array;
        block5: {
            dataOutputStream.writeShort(this.D);
            dataOutputStream.writeShort(this.Z);
            dataOutputStream.writeInt(this.h.length);
            dataOutputStream.write(this.h);
            dataOutputStream.writeShort(this.q.length);
            Object[] objectArray = this.q;
            int n10 = objectArray.length;
            ky_2Array = cr_0.q();
            for (int i2 = 0; i2 < n10; ++i2) {
                C3 object = objectArray[i2];
                try {
                    dataOutputStream.writeShort(object.k);
                    dataOutputStream.writeShort(object.s);
                    dataOutputStream.writeShort(object.E);
                    dataOutputStream.writeShort(object.O);
                    if (ky_2Array == null) {
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block5;
                }
                catch (IOException iOException) {
                    throw cp_0.a(iOException);
                }
            }
            dataOutputStream.writeShort(this.Y.length);
        }
        for (Y y2 : this.Y) {
            y2.B(dataOutputStream);
            if (ky_2Array == null) continue;
        }
    }

    static Y E(short s2, cr_0 cr_02, DataInputStream dataInputStream) throws IOException {
        return cp_0.K(s2, cr_02, dataInputStream);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

