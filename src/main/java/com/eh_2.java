/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.e1_0;
import com.k3_0;
import javax.swing.JComponent;

/*
 * Renamed from com.eh
 */
public class eh_2
extends e1_0 {
    public void T(k3_0 k3_02, String string, G9 g92, Object[] objectArray) {
        String string2 = this.q(g92, objectArray);
        String[] stringArray = e1_0.A();
        String string3 = string2;
        if (stringArray != null) {
            string3 = string3 != null ? string2 : null;
        }
        k3_02.u(string3);
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.T((k3_0)jComponent, string, g92, objectArray);
    }
}

