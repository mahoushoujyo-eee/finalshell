/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pu_2;
import com.rs_1;
import java.util.Date;

/*
 * Renamed from com.xN
 */
class xn_1
implements pu_2 {
    final rs_1 A;

    xn_1(rs_1 rs_12) {
        this.A = rs_12;
    }

    @Override
    public void i(Date date) {
        this.A.stopCellEditing();
    }
}

