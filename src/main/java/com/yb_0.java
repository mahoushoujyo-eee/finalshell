/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.i2_0;
import com.ld_2;
import java.util.Comparator;

/*
 * Renamed from com.Yb
 */
public class yb_0
implements Comparator {
    public int R(ld_2 ld_22, ld_2 ld_23) {
        Class clazz = ld_22.D();
        boolean bl = i2_0.K();
        Class clazz2 = ld_23.D();
        int n10 = clazz.equals(clazz2);
        if (bl) {
            if (n10 != 0) {
                return 0;
            }
            n10 = clazz.isAssignableFrom(clazz2) ? 1 : 0;
        }
        if (bl) {
            if (n10 != 0) {
                return 1;
            }
            n10 = -1;
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        return this.R((ld_2)object, (ld_2)object2);
    }
}

