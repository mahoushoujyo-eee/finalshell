/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PV;
import java.util.Comparator;

/*
 * Renamed from com.Ho
 */
public class ho_0
implements Comparator {
    public int i(PV pV2, PV pV3) {
        return Float.compare(pV2.I(), pV3.I());
    }

    public int compare(Object object, Object object2) {
        return this.i((PV)object, (PV)object2);
    }
}

