/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import com.z.d_0;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class N
extends AbstractAction {
    final T i;

    N(T t2) {
        this.i = t2;
    }

    @Override
    public boolean isEnabled() {
        String string = T.v();
        boolean bl = this.i.E.getSelectedIndex();
        if (string == null) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        File file = this.i.E.J();
        if (file.isDirectory()) {
            this.i.M(file, d_0.list);
        }
    }
}

