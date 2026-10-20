/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cz_0;
import com.ic_0;
import com.oq_0;
import java.awt.Component;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JList;

class OY
extends oq_0 {
    final ic_0 a;

    OY(ic_0 ic_02) {
        this.a = ic_02;
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n10, boolean bl, boolean bl2) {
        JLabel jLabel = (JLabel)super.getListCellRendererComponent(jList, object, n10, bl, bl2);
        jLabel.setIcon(cz_0.B((File)object));
        jLabel.setText(cz_0.X((File)object));
        return jLabel;
    }
}

