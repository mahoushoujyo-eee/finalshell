/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E4;
import com.i2_0;
import com.oj_2;
import com.yw_1;
import java.util.List;

class XK
implements yw_1 {
    XK() {
    }

    @Override
    public void Z(String string, String string2) {
        this.I();
    }

    @Override
    public void G(oj_2 oj_22) {
        this.i(oj_22);
    }

    @Override
    public void t(oj_2 oj_22) {
        this.i(oj_22);
    }

    @Override
    public void U() {
        this.I();
    }

    private void I() {
        boolean bl = i2_0.K();
        if (bl) {
            if (i2_0.c.size() > 0) {
                i2_0.R();
            }
            i2_0.G();
        }
    }

    private void i(oj_2 oj_22) {
        List list = E4.j(oj_22);
        boolean bl = i2_0.K();
        if (bl) {
            if (i2_0.c.size() > 0) {
                for (String string : list) {
                    i2_0.A(string);
                    if (bl) {
                        if (bl) continue;
                    }
                    break;
                }
            } else {
                i2_0.t(list);
            }
        }
    }
}

