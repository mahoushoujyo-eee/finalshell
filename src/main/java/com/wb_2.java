/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.wc_0;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;

/*
 * Renamed from com.wb
 */
public class wb_2
implements wc_0 {
    private final AbstractButton w;
    private final int z;

    public wb_2(AbstractButton abstractButton) {
        this(abstractButton, 0);
    }

    public wb_2(AbstractButton abstractButton, int n10) {
        this.w = abstractButton;
        this.z = n10;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        this.w.doClick(this.z);
    }
}

