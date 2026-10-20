/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CC;
import com.co_0;
import com.ne_2;
import com.ui_0;
import com.uv_0;
import com.wo_1;
import com.wx_2;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JList;

/*
 * Renamed from com.ws
 */
public class ws_2
extends wo_1 {
    /*
     * Unable to fully structure code
     */
    protected ne_2 R(JList var1_1, int var2_2, uv_0 var3_3) {
        v0 = co_0.U();
        var5_4 = ne_2.r(true, wx_2.n, wx_2.y);
        var5_4.c(false);
        var4_5 = v0;
        v1 = var3_3.g();
        if (var4_5 == null) ** GOTO lbl9
        if (v1 != null) {
            v1 = var3_3.g();
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

    protected Rectangle e(JList jList, int n10, uv_0 uv_02, Rectangle rectangle) {
        ui_0 ui_02 = ((CC)jList).A().m(uv_02);
        Rectangle rectangle2 = ui_02.M().u();
        int n11 = rectangle2.x + rectangle2.width + ui_02.getIconTextGap() - ((ne_2)this.d).getInsets().left;
        return new Rectangle(n11, 0, rectangle.width - n11, rectangle.height);
    }

    public uv_0 H(JList jList, int n10, uv_0 uv_02) {
        uv_02.P(((ne_2)this.d).getText());
        return uv_02;
    }

    @Override
    protected Rectangle O(JList jList, int n10, Object object, Rectangle rectangle) {
        return this.e(jList, n10, (uv_0)object, rectangle);
    }

    @Override
    protected Component j(JList jList, int n10, Object object) {
        return this.R(jList, n10, (uv_0)object);
    }

    @Override
    public Object E(JList jList, int n10, Object object) {
        return this.H(jList, n10, (uv_0)object);
    }
}

