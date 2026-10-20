/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.G;
import org.H.Y;
import org.h.cr_0;

/*
 * Renamed from org.H.Cb
 */
public class cb_0
extends Y {
    private final short[] F;

    public cb_0(short s2, short[] sArray) {
        super(s2);
        this.F = sArray;
    }

    public G[] m(cr_0 cr_02) {
        G[] gArray;
        block2: {
            G[] gArray2 = new G[this.F.length];
            ky_2[] ky_2Array = cr_0.q();
            for (int i2 = 0; i2 < gArray2.length; ++i2) {
                gArray = gArray2;
                if (ky_2Array == null) {
                    gArray[i2] = cr_02.X(this.F[i2]);
                    if (ky_2Array == null) continue;
                }
                break block2;
            }
            gArray = gArray2;
        }
        return gArray;
    }

    private static Y A(short s2, DataInputStream dataInputStream) throws IOException {
        return new cb_0(s2, cr_0.a(dataInputStream));
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        cr_0.D(dataOutputStream, this.F);
    }

    static Y f(short s2, DataInputStream dataInputStream) throws IOException {
        return cb_0.A(s2, dataInputStream);
    }
}

