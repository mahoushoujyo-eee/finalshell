/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QB;
import com.WC;
import com.ka_0;
import java.awt.Component;

/*
 * Renamed from com.iE
 */
class ie_1
implements ka_0 {
    final QB b;

    ie_1(QB qB) {
        this.b = qB;
    }

    @Override
    public void N(Component component, Component component2) {
        block5: {
            Component component3;
            block4: {
                int[] nArray = WC.V();
                component3 = this.b;
                if (nArray != null) break block4;
                if (!component3.V) break block5;
                component3 = component2;
            }
            if (component3 == null) {
                this.b.l();
            }
        }
    }
}

