/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.H.C_;
import org.H.Y;
import org.h.cr_0;
import org.h.v_0;
import org.h.w_0;

/*
 * Renamed from org.H.c
 */
public class c_0
implements w_0 {
    private final short Q;
    private final short q;
    private final short z;
    private final List E;
    final cr_0 w;

    public c_0(cr_0 cr_02, short s2, short s3, short s4, List list) {
        this.w = cr_02;
        this.Q = s2;
        this.q = s3;
        this.z = s4;
        this.E = list;
    }

    public short w() {
        return this.Q;
    }

    @Override
    public v_0[] R(boolean bl) {
        C_ c_ = cr_0.Z(this.w, bl, this.E);
        ky_2[] ky_2Array = cr_0.q();
        C_ c_2 = c_;
        if (ky_2Array == null) {
            if (c_2 == null) {
                return new v_0[0];
            }
            c_2 = c_;
        }
        return C_.j(c_2).toArray(new v_0[C_.j(c_).size()]);
    }

    public String K(cr_0 cr_02) {
        return cr_02.S(this.q);
    }

    public String P(cr_0 cr_02) {
        return cr_02.S(this.z);
    }

    public Y[] M() {
        return this.E.toArray(new Y[this.E.size()]);
    }

    public void g(Y y2) {
        this.E.add(y2);
    }

    @Override
    public void t(boolean bl, String string, Map map) {
        cr_0.q(this.w, bl, string, map, this.E);
    }

    public void y(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.Q);
        dataOutputStream.writeShort(this.q);
        dataOutputStream.writeShort(this.z);
        cr_0.m(dataOutputStream, this.E);
    }
}

