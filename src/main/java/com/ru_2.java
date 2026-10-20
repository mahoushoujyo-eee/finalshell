/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ac_0;
import com.ky_2;
import com.wd_0;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.ru
 */
class ru_2
implements AWTEventListener {
    final wd_0 m;
    private static final long a;

    ru_2(wd_0 wd_02) {
        this.m = wd_02;
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block5: {
            int n10;
            block4: {
                ky_2[] ky_2Array = ac_0.n();
                n10 = aWTEvent instanceof MouseEvent;
                if (ky_2Array != null) break block4;
                if (n10 == 0) break block5;
                n10 = aWTEvent.getID();
            }
            if (n10 == (int)a) {
                this.m.j();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 606289005203035879L;
        a = 0x9778BD74525A1712L ^ l2;
    }
}

