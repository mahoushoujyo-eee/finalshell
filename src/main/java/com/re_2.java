/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.uZ;
import com.x4_0;

/*
 * Renamed from com.re
 */
public class re_2
implements x4_0 {
    private static final long a;

    @Override
    public boolean v(int n10) {
        String string = uZ.h();
        int n11 = n10;
        if (string == null) {
            n11 = n11 == (int)a ? 1 : 0;
        }
        return n11 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 865877117101573664L;
        a = 0x9195245A80FA8620L ^ l2;
    }
}

