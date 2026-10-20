/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import com.z.d_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class V
implements ActionListener {
    final T Q;

    V(T t2) {
        this.Q = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            T t2;
            block4: {
                String string;
                block2: {
                    string = T.v();
                    t2 = this.Q;
                    if (string != null) break block2;
                    if (!((Boolean)t2.N.J()).booleanValue()) break block3;
                    t2 = this.Q;
                }
                if (string != null) break block4;
                if (t2.S == null) break block3;
                t2 = this.Q;
            }
            t2.M(this.Q.S.getParentFile(), d_0.toolbar);
        }
    }
}

