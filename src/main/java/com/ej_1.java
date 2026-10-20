/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.ph_0;
import com.pk_1;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/*
 * Renamed from com.eJ
 */
class ej_1
implements pk_1 {
    ej_1() {
    }

    public Object i(Object object, Class clazz) {
        block8: {
            Object object2;
            block7: {
                Class clazz2;
                block6: {
                    int n10 = ph_0.u();
                    object2 = clazz;
                    clazz2 = Date.class;
                    if (n10 == 0) {
                        if (object2 == clazz2) {
                            return B8.p(object);
                        }
                        object2 = clazz;
                        clazz2 = Time.class;
                    }
                    if (n10 != 0) break block6;
                    if (object2 == clazz2) {
                        return B8.z(object);
                    }
                    object2 = clazz;
                    if (n10 != 0) break block7;
                    clazz2 = Timestamp.class;
                }
                if (object2 != clazz2) break block8;
                object2 = B8.q(object);
            }
            return object2;
        }
        return null;
    }

    @Override
    public Object h(Object object, Object object2) {
        return this.i(object, (Class)object2);
    }
}

