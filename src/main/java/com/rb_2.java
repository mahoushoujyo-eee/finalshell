/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com._y_0;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from com.rb
 */
class rb_2
implements ActionListener {
    final _y_0 Q;

    rb_2(_y_0 _y_02) {
        this.Q = _y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            block8: {
                block7: {
                    DI dI;
                    int n10;
                    block6: {
                        DI dI2;
                        block4: {
                            dI2 = this.Q.U.s().e();
                            n10 = _y_0.y();
                            dI = dI2;
                            if (n10 != 0) break block4;
                            if (dI == null) break block5;
                            dI = dI2;
                        }
                        if (n10 != 0) break block6;
                        if (!dI.t()) break block7;
                        dI = dI2;
                    }
                    dI.G();
                    if (n10 == 0) break block8;
                }
                try {
                    this.Q.kD.d(this.Q.U);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            this.Q.M();
        }
    }
}

