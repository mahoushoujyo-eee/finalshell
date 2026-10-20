/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LN;
import com.N;
import com.kf_0;
import com.w8_0;
import java.util.List;

/*
 * Renamed from com.Lu
 */
final class lu_0
extends LN {
    @Override
    public String W(w8_0 w8_02, int n10) {
        List list = ((kf_0)((Object)w8_02.s())).q();
        if (n10 == list.size()) {
            return w8_02.b().c();
        }
        return ((N)list.get((int)n10)).S;
    }
}

