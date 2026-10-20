/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.xd_1;
import java.util.Comparator;

class T7
implements Comparator {
    final xd_1 l;

    T7(xd_1 xd_12) {
        this.l = xd_12;
    }

    public int v(Object[] objectArray, Object[] objectArray2) {
        return ((String)objectArray[0]).compareTo((String)objectArray2[0]);
    }

    public int compare(Object object, Object object2) {
        return this.v((Object[])object, (Object[])object2);
    }
}

