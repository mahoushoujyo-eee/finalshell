/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GQ;
import com.cq_1;
import com.ky_2;
import com.m.V;
import com.ne_2;
import java.awt.Component;
import javax.swing.JTree;

/*
 * Renamed from com.rQ
 */
public class rq_1
extends V {
    protected cq_1 v;

    @Override
    public Component getTreeCellEditorComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10) {
        String[] stringArray = GQ.W();
        this.v = (cq_1)object;
        ne_2 ne_22 = (ne_2)super.getTreeCellEditorComponent(jTree, object, bl, bl2, bl3, n10);
        ne_22.setText(this.v.w());
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            ky_2.K(new String[5]);
        }
        return ne_22;
    }

    @Override
    public Object getCellEditorValue() {
        this.v.v(this.m.G().toString());
        return this.v;
    }
}

