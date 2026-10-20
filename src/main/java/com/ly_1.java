/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.we_1;
import com.yn_2;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/*
 * Renamed from com.lY
 */
class ly_1
implements we_1 {
    ly_1() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public Boolean E(Class clazz) {
        boolean bl;
        block5: {
            Class clazz2;
            Class clazz3;
            block6: {
                boolean bl2;
                block4: {
                    bl2 = yn_2.Y();
                    Class clazz2 = clazz;
                    clazz2 = Date.class;
                    if (!bl2) break block4;
                    if (clazz3 == clazz2) break block5;
                    Class clazz2 = clazz;
                    clazz2 = Time.class;
                }
                if (!bl2) break block6;
                if (clazz3 == clazz2) break block5;
                Class clazz2 = clazz;
                clazz2 = Timestamp.class;
            }
            if (clazz3 != clazz2) {
                bl = false;
                return bl;
            }
        }
        bl = true;
        return bl;
    }

    @Override
    public Object N(Object object) {
        return this.E((Class)object);
    }
}

