/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aD;
import com.ob_0;
import javax.swing.JPopupMenu;
import org.jetbrains.annotations.NotNull;

class H_
implements ob_0 {
    final JPopupMenu n;

    H_(JPopupMenu jPopupMenu) {
        this.n = jPopupMenu;
    }

    @Override
    public void O(@NotNull aD aD2) {
        this.n.add(aD.z(aD2));
    }

    @Override
    public void M() {
        this.n.addSeparator();
    }
}

