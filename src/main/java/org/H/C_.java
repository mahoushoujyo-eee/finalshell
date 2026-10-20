/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.H.Y;
import org.h.cr_0;
import org.h.r_0;
import org.h.v_0;

public class C_
extends Y {
    private final List L;

    C_(short s2) {
        super(s2);
        this.L = new ArrayList();
    }

    C_(short s2, v_0[] v_0Array) {
        super(s2);
        this.L = new ArrayList<v_0>(Arrays.asList(v_0Array));
    }

    public List A() {
        return this.L;
    }

    private static Y q(short s2, DataInputStream dataInputStream) throws IOException {
        v_0[] v_0Array = new v_0[dataInputStream.readUnsignedShort()];
        ky_2[] ky_2Array = cr_0.q();
        for (int n10 = 0; n10 < v_0Array.length; n10 = (int)((short)(n10 + 1))) {
            v_0Array[n10] = C_.q(dataInputStream);
            if (ky_2Array == null) continue;
        }
        return new C_(s2, v_0Array);
    }

    private static v_0 q(DataInputStream dataInputStream) throws IOException {
        return new v_0(dataInputStream.readShort(), C_.K(dataInputStream));
    }

    private static Map K(DataInputStream dataInputStream) throws IOException {
        HashMap<Short, r_0> hashMap;
        block7: {
            int n10 = dataInputStream.readUnsignedShort();
            ky_2[] ky_2Array = cr_0.q();
            try {
                if (n10 == 0) {
                    return Collections.emptyMap();
                }
            }
            catch (IOException iOException) {
                throw C_.a(iOException);
            }
            HashMap<Short, r_0> hashMap2 = new HashMap<Short, r_0>();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    hashMap = hashMap2;
                    if (ky_2Array == null) {
                        hashMap.put(dataInputStream.readShort(), cr_0.d(dataInputStream));
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block7;
                }
                catch (IOException iOException) {
                    throw C_.a(iOException);
                }
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }

    @Override
    protected void T(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.L.size());
        Iterator iterator = this.L.iterator();
        ky_2[] ky_2Array = cr_0.q();
        while (iterator.hasNext()) {
            v_0 v_02 = (v_0)iterator.next();
            v_02.E(dataOutputStream);
            if (ky_2Array == null) continue;
        }
    }

    static List j(C_ c_) {
        return c_.L;
    }

    static Y d(short s2, DataInputStream dataInputStream) throws IOException {
        return C_.q(s2, dataInputStream);
    }

    static v_0 i(DataInputStream dataInputStream) throws IOException {
        return C_.q(dataInputStream);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

