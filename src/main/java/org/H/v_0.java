/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;
import org.F.c;
import org.h.cr_0;
import org.h.m_0;
import org.h.r_0;

/*
 * Renamed from org.H.v
 */
public class v_0
implements r_0 {
    public final short B;
    public final Map P;
    private static final long a;

    public v_0(short s2, Map map) {
        this.B = s2;
        this.P = map;
    }

    @Override
    public byte s() {
        return (byte)((int)a);
    }

    @Override
    public void E(DataOutputStream dataOutputStream) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(this.B);
        dataOutputStream.writeShort(this.P.size());
        ky_2[] ky_2Array2 = ky_2Array;
        for (Map.Entry entry : this.P.entrySet()) {
            Short s2 = (Short)entry.getKey();
            r_0 r_02 = (r_0)entry.getValue();
            dataOutputStream.writeShort(s2.shortValue());
            dataOutputStream.writeByte(r_02.s());
            r_02.E(dataOutputStream);
            if (ky_2Array2 == null) continue;
        }
    }

    @Override
    @c
    public Object d(m_0 m_02) throws Throwable {
        return m_02.o(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5494457149533065828L;
        a = 0x80C7C0C6A7861224L ^ l2;
    }
}

