/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.a9;
import com.og_0;
import javax.swing.UIDefaults;

/*
 * Renamed from com.Qs
 */
class qs_0
implements UIDefaults.ActiveValue {
    final a9 d;

    qs_0(a9 a92) {
        this.d = a92;
    }

    @Override
    public Object createValue(UIDefaults uIDefaults) {
        return new og_0();
    }
}

