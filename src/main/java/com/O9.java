/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O1;
import com.oe_0;
import java.text.NumberFormat;

public class O9
extends O1 {
    private NumberFormat I;

    @Override
    public void J(Object object) {
        boolean bl = oe_0.a();
        O9 o9 = this;
        if (bl) {
            if (o9.I == null) {
                this.I = NumberFormat.getInstance();
            }
            o9 = this;
        }
        o9.setText(object == null ? "" : this.I.format(object));
    }
}

