/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B
implements ActionListener {
    final T V;

    B(T t2) {
        this.V = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            T t2;
            block2: {
                String string = T.v();
                t2 = this.V;
                if (string != null) break block2;
                if (!((Boolean)t2.N.J()).booleanValue()) break block3;
                t2 = this.V;
            }
            t2.a(this.V.e + 1);
        }
    }
}

