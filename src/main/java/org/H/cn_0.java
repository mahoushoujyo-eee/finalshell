/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.H.Y;
import org.h.cr_0;
import org.h.f_0;

/*
 * Renamed from org.H.Cn
 */
public class cn_0
extends Y {
    private final f_0[] P;

    public cn_0(short s2, f_0[] f_0Array) {
        super(s2);
        this.P = f_0Array;
    }

    private static Y Q(short s2, DataInputStream dataInputStream) throws IOException {
        f_0[] f_0Array = new f_0[dataInputStream.readUnsignedShort()];
        ky_2[] ky_2Array = cr_0.q();
        for (int n10 = 0; n10 < f_0Array.length; n10 = (int)((short)(n10 + 1))) {
            f_0Array[n10] = new f_0(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
            if (ky_2Array == null) continue;
        }
        return new cn_0(s2, f_0Array);
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.P.length);
        f_0[] f_0Array = this.P;
        ky_2[] ky_2Array = cr_0.q();
        for (f_0 f_02 : f_0Array) {
            dataOutputStream.writeShort(f_02.I);
            dataOutputStream.writeShort(f_02.u);
            dataOutputStream.writeShort(f_02.w);
            dataOutputStream.writeShort(f_02.p);
            dataOutputStream.writeShort(f_02.F);
            if (ky_2Array == null) continue;
        }
    }

    static Y Z(short s2, DataInputStream dataInputStream) throws IOException {
        return cn_0.Q(s2, dataInputStream);
    }
}

