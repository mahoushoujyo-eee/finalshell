/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import com.b.V;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class G
implements ActionListener {
    final T f;

    G(T t2) {
        this.f = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.f.R((V)this.f.i.getSelectedItem(), false);
    }
}

