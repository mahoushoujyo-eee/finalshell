/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oa_0;
import com.oe_0;
import javax.swing.Icon;

public class OH
extends oa_0 {
    public OH() {
        this.setHorizontalAlignment(0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(Object var1_1) {
        var2_2 = oe_0.a();
        v0 = var1_1;
        if (!var2_2) ** GOTO lbl6
        if (v0 instanceof Icon) {
            v0 = var1_1;
lbl6:
            // 2 sources

            v1 = (Icon)v0;
        } else {
            v1 = null;
        }
        this.setIcon(v1);
    }
}

