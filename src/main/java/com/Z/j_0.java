/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.j
 */
class j_0
implements ActionListener {
    final T T;

    j_0(T t2) {
        this.T = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            T t2;
            block2: {
                String string = com.Z.T.v();
                t2 = this.T;
                if (string != null) break block2;
                if (!((Boolean)t2.N.J()).booleanValue()) break block3;
                t2 = this.T;
            }
            t2.T();
        }
    }
}

