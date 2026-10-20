/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T8;
import com.cb_1;
import com.us_0;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.TreeCellEditor;

/*
 * Renamed from com.Th
 */
class th_0
extends T8 {
    final TreeCellEditor v;
    final us_0 f;

    th_0(us_0 us_02, TreeCellEditor treeCellEditor) {
        this.f = us_02;
        this.v = treeCellEditor;
    }

    @Override
    public void editingStopped(ChangeEvent changeEvent) {
        cb_1 cb_12 = (cb_1)this.v.getCellEditorValue();
        this.f.O(cb_12.C());
    }
}

