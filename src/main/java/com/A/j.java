/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import com.a.y_0;
import com.k2_0;
import javax.swing.JComponent;

class j
extends k2_0 {
    final d y;

    j(d d2, JComponent[] jComponentArray) {
        this.y = d2;
        super(jComponentArray);
    }

    @Override
    public void Y() {
        block3: {
            j j2;
            block2: {
                int[] nArray = y_0.M();
                j2 = this;
                if (nArray == null) break block2;
                if (!j2.y.Q) break block3;
                j2 = this;
            }
            super.Y();
        }
    }
}

