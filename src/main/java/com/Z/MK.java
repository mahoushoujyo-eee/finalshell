/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.lv_1;
import java.io.File;

class MK
extends lv_1 {
    MK() {
    }

    @Override
    public String z(File file) {
        return "\"" + super.z(file) + "\"";
    }

    @Override
    public String C(Object object) {
        return this.z((File)object);
    }
}

