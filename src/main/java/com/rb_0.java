/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import com.we_1;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Map;

/*
 * Renamed from com.Rb
 */
class rb_0
implements we_1 {
    rb_0() {
    }

    public Void K(Map map) {
        Class[] classArray = new Class[]{Time.class, Date.class, Timestamp.class};
        int n10 = ph_0.w();
        Class[] classArray2 = classArray;
        int n11 = classArray2.length;
        for (int i2 = 0; i2 < n11; ++i2) {
            Class clazz;
            Class clazz2 = clazz = classArray2[i2];
            if (n10 == 0 || clazz2 == null && n10 != 0) continue;
            clazz2 = map.put(clazz.getName(), clazz);
            if (n10 != 0) continue;
        }
        return null;
    }

    @Override
    public Object N(Object object) {
        return this.K((Map)object);
    }
}

