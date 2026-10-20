/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.Z.y
 */
class y_0
implements ActionListener {
    final T Y;

    y_0(T t2) {
        this.Y = t2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block3: {
            T t2;
            block2: {
                String string = T.v();
                t2 = this.Y;
                if (string != null) break block2;
                if (!((Boolean)t2.N.J()).booleanValue()) break block3;
                t2 = this.Y;
            }
            t2.x();
        }
    }
}

