/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OS;
import com.cz_0;
import com.kd_2;
import com.oq_0;
import java.awt.Component;
import java.io.File;
import javax.swing.JList;

class OB
extends oq_0 {
    final kd_2 l;

    OB(kd_2 kd_22) {
        this.l = kd_22;
    }

    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n10, boolean bl, boolean bl2) {
        OS oS = (OS)super.getListCellRendererComponent(jList, object, n10, bl, bl2);
        File file = (File)object;
        oS.setIcon(cz_0.B(file));
        String string = cz_0.X(file);
        oS.setText(cz_0.b(string, kd_2.L(this.l)));
        return oS;
    }
}

