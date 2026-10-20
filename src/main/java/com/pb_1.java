/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.pg_1;

/*
 * Renamed from com.pB
 */
final class pb_1
extends pg_1 {
    private static final long c;

    pb_1(int[] nArray) {
    }

    @Override
    public int Q(int n10) {
        int[] nArray = XP.j();
        int n11 = n10;
        if (nArray == null) {
            if (n11 == 3) {
                return (int)c;
            }
            n11 = -1;
        }
        return n11;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4538810696659260940L;
        c = 0x34176E9AED1E56AFL ^ l2;
    }
}

