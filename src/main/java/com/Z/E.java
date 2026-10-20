/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import com.cz_0;
import com.z.d_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class E
implements ActionListener {
    final T N;

    E(T t2) {
        this.N = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            T t2;
            block2: {
                String string = T.v();
                t2 = this.N;
                if (string != null) break block2;
                if (!((Boolean)t2.N.J()).booleanValue()) break block3;
                t2 = this.N;
            }
            t2.M(cz_0.x(), d_0.toolbar);
        }
    }
}

