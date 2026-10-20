/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.A;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

class R
implements ActionListener {
    final A k;

    R(A a10) {
        this.k = a10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        A.y(this.k, true);
        List list = A.s(this.k).s();
        A.n(this.k).setSelectedFiles(list.toArray(new File[list.size()]));
        A.y(this.k, false);
        A.n(this.k).approveSelection();
    }
}

