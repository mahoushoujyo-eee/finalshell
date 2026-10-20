/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.L.Q;
import com.L.U;
import com.b.V;
import java.awt.Component;
import javax.swing.JList;

/*
 * Renamed from com.wT
 */
public class wt_1
extends Q {
    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n10, boolean bl, boolean bl2) {
        V v2 = (V)object;
        U u10 = (U)super.getListCellRendererComponent(jList, "", n10, bl, bl2);
        u10.setIcon(v2.b());
        u10.setText(v2.getDescription());
        return u10;
    }
}

