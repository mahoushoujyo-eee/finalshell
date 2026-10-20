/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.we_1;
import java.sql.Clob;

class CR
implements we_1 {
    CR() {
    }

    public Boolean p(Class clazz) {
        return Clob.class.isAssignableFrom(clazz);
    }

    @Override
    public Object N(Object object) {
        return this.p((Class)object);
    }
}

