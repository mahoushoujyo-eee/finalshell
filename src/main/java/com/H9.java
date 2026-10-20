/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.bq_0;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class H9
extends KeyAdapter {
    final _y_0 g;
    final bq_0 z;
    private static final long a;

    H9(bq_0 bq_02, _y_0 _y_02) {
        this.z = bq_02;
        this.g = _y_02;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block4: {
            block3: {
                int n10;
                block2: {
                    n10 = _y_0.M();
                    if (n10 == 0) break block2;
                    if (keyEvent.getKeyCode() != (int)a) break block3;
                    this.g.w();
                }
                if (n10 != 0) break block4;
            }
            super.keyPressed(keyEvent);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6001192819066693146L;
        a = 0xA410E2E5C1186601L ^ l2;
    }
}

