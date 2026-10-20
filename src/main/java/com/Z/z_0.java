/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import com.z.d_0;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

/*
 * Renamed from com.Z.z
 */
class z_0
extends AbstractAction {
    final T n;

    z_0(T t2) {
        this.n = t2;
    }

    @Override
    public boolean isEnabled() {
        String string = T.v();
        boolean bl = this.n.hD.getSelectedRow();
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        File file = this.n.hD.S();
        if (file.isDirectory()) {
            this.n.M(file, d_0.table);
        }
    }
}

