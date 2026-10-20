/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QB;
import com.WC;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.oc
 */
class oc_2
implements AWTEventListener {
    final QB A;
    private static final long a;

    oc_2(QB qB) {
        this.A = qB;
    }

    @Override
    public void eventDispatched(AWTEvent aWTEvent) {
        block4: {
            MouseEvent mouseEvent;
            int[] nArray;
            block5: {
                MouseEvent mouseEvent2;
                nArray = WC.V();
                if (!this.A.V) break block4;
                mouseEvent = mouseEvent2 = (MouseEvent)aWTEvent;
                if (nArray != null) break block5;
                if (mouseEvent.getID() != (int)a) break block4;
                mouseEvent = mouseEvent2;
            }
            Component component = mouseEvent.getComponent();
            QB qB = this.A;
            if (nArray == null && !qB.isAncestorOf(component)) {
                qB = this.A.l();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7339144256436590010L;
        a = 0x7CDAD9711840544FL ^ l2;
    }
}

