/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.bq_0;
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.KeyStroke;

/*
 * Renamed from com.Tu
 */
class tu_0
implements KeyListener {
    final _y_0 V;
    final bq_0 M;

    tu_0(bq_0 bq_02, _y_0 _y_02) {
        this.M = bq_02;
        this.V = _y_02;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block7: {
            int n10;
            zG zG2;
            block6: {
                zG zG3;
                try {
                    zG3 = (zG)xK.w(KeyStroke.getKeyStrokeForEvent(keyEvent));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                zG zG4 = zG3;
                int n11 = _y_0.M();
                zG2 = zG4;
                if (n11 == 0) break block6;
                if (zG2 == null) break block7;
                zG2 = zG4;
            }
            try {
                n10 = (Integer)zG2.K();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            int n12 = n10;
            if (n12 == US.Q) {
                this.V.s();
            }
        }
    }
}

