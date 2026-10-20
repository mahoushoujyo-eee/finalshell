/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.cr_0;
import org.h.m_0;
import org.h.r_0;

public final class M
implements r_0 {
    public final r_0[] z;
    private static final long a;

    public M(r_0[] r_0Array) {
        this.z = r_0Array;
    }

    @Override
    public byte s() {
        return (byte)((int)a);
    }

    @Override
    public void E(DataOutputStream dataOutputStream) throws IOException {
        ky_2[] ky_2Array = cr_0.q();
        dataOutputStream.writeShort(this.z.length);
        ky_2[] ky_2Array2 = ky_2Array;
        for (r_0 r_02 : this.z) {
            dataOutputStream.writeByte(r_02.s());
            r_02.E(dataOutputStream);
            if (ky_2Array2 == null) continue;
        }
    }

    @Override
    @c
    public Object d(m_0 m_02) throws Throwable {
        return m_02.M(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8213722792239723985L;
        a = 0x51E2BF7E82FA758AL ^ l2;
    }
}

