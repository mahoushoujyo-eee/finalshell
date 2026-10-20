/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.V;
import com.A.d;
import com.a.y_0;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class O
extends ComponentAdapter {
    final V V;
    final d p;
    private static final long a;

    O(d d2, V v2) {
        this.p = d2;
        this.V = v2;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        int[] nArray = y_0.M();
        int n10 = this.V.k().width;
        if (nArray != null) {
            n10 = n10 > this.V.getWidth() ? (int)a : 0;
        }
        this.V.setHorizontalAlignment(n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4724208833045813334L;
        a = 0x8D23BE535A75585CL ^ l2;
    }
}

