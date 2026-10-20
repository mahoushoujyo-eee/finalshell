/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.H.CX;
import org.H.Y;
import org.h.cr_0;

/*
 * Renamed from org.H.Cq
 */
public class cq_0
extends Y {
    private final List q;

    cq_0(short s2) {
        super(s2);
        this.q = new ArrayList();
    }

    cq_0(short s2, CX[] cXArray) {
        super(s2);
        this.q = new ArrayList<CX>(Arrays.asList(cXArray));
    }

    public List u() {
        return this.q;
    }

    private static Y s(short s2, DataInputStream dataInputStream) throws IOException {
        CX[] cXArray = new CX[dataInputStream.readUnsignedShort()];
        ky_2[] ky_2Array = cr_0.q();
        for (int n10 = 0; n10 < cXArray.length; n10 = (int)((short)(n10 + 1))) {
            cXArray[n10] = new CX(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
            if (ky_2Array == null) continue;
        }
        return new cq_0(s2, cXArray);
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(this.q.size());
        ky_2[] ky_2Array2 = ky_2Array;
        for (CX cX : this.q) {
            dataOutputStream.writeShort(cX.w);
            dataOutputStream.writeShort(cX.a);
            dataOutputStream.writeShort(cX.X);
            dataOutputStream.writeShort(cX.q);
            if (ky_2Array2 == null) continue;
        }
    }

    static Y T(short s2, DataInputStream dataInputStream) throws IOException {
        return cq_0.s(s2, dataInputStream);
    }
}

