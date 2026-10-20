/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oa_0;
import com.oe_0;
import java.text.DateFormat;

/*
 * Renamed from com.Or
 */
public class or_0
extends oa_0 {
    private DateFormat u;

    @Override
    public void J(Object object) {
        boolean bl = oe_0.a();
        or_0 or_02 = this;
        if (bl) {
            if (or_02.u == null) {
                this.u = DateFormat.getDateInstance();
            }
            or_02 = this;
        }
        or_02.setText(object == null ? "" : this.u.format(object));
    }
}

