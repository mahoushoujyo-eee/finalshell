/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O7;
import com.WK;
import com.sm_0;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;

/*
 * Renamed from com.Oy
 */
class oy_0
extends O7 {
    Border c;
    final WK O;

    oy_0(WK wK) {
        this.O = wK;
        this.c = sm_0.H();
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n10, int n11) {
        JLabel jLabel = (JLabel)super.getTableCellRendererComponent(jTable, object, bl, bl2, n10, n11);
        jLabel.setBorder(this.c);
        jLabel.setHorizontalAlignment(2);
        return jLabel;
    }
}

