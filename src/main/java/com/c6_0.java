/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.cn_0;
import com.wh_1;
import com.xw_1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.c6
 */
class c6_0
extends MouseAdapter {
    final cn_0 G;
    final wh_1 O;
    final _y_0 e;
    final xw_1 m;

    c6_0(xw_1 xw_12, cn_0 cn_02, wh_1 wh_12, _y_0 _y_02) {
        this.m = xw_12;
        this.G = cn_02;
        this.O = wh_12;
        this.e = _y_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.m.M(mouseEvent);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.O.i(this.e);
        this.m.M(mouseEvent);
    }
}

