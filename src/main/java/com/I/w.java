/*
 * Decompiled with CFR 0.152.
 */
package com.I;

import com.I.L;
import com.I.x;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class w
implements Comparator {
    private List K = Arrays.asList(L.values());

    public int C(x x10, x x11) {
        return Integer.valueOf(this.K.indexOf((Object)x10.B())).compareTo(this.K.indexOf((Object)x11.B()));
    }

    public int compare(Object object, Object object2) {
        return this.C((x)object, (x)object2);
    }
}

