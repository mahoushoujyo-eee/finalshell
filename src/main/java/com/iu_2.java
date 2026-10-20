/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CC;
import com.WC;
import com.co_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.iu
 */
class iu_2
implements ActionListener {
    private int M;
    final int x;
    final CC D;
    private static final long a;

    iu_2(CC cC, int n10) {
        this.D = cC;
        this.x = n10;
        this.M = (int)a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block4: {
            Object object;
            block2: {
                block3: {
                    String string = co_0.U();
                    object = this;
                    if (string == null) break block2;
                    if (((iu_2)object).M <= 0) break block3;
                    this.D.repaint(this.D.getCellBounds(this.x, this.x));
                    --this.M;
                    if (string != null) break block4;
                }
                object = actionEvent.getSource();
            }
            ((WC)object).Y();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 87862909567340684L;
        a = 0xB6B163C6C9B1908AL ^ l2;
    }
}

