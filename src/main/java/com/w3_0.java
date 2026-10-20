/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ne_2;
import com.wo_1;
import com.wx_2;
import java.awt.Component;
import javax.swing.JList;

/*
 * Renamed from com.w3
 */
public class w3_0
extends wo_1 {
    /*
     * Unable to fully structure code
     */
    @Override
    protected Component j(JList var1_1, int var2_2, Object var3_3) {
        v0 = wo_1.f();
        var5_4 = ne_2.r(true, wx_2.n, wx_2.y);
        var5_4.c(false);
        var4_5 = v0;
        v1 = var3_3;
        if (var4_5 != 0) ** GOTO lbl9
        if (v1 != null) {
            v1 = var3_3;
lbl9:
            // 2 sources

            v2 = v1.toString();
        } else {
            v2 = "";
        }
        var5_4.setText(v2);
        var5_4.selectAll();
        return var5_4;
    }

    @Override
    public Object E(JList jList, int n10, Object object) {
        return ((ne_2)this.d).getText();
    }
}

