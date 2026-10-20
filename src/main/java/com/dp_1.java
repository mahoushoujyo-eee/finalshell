/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cl_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.dP
 */
class dp_1
implements ActionListener {
    dp_1() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = cl_2.V;
        synchronized (object) {
            block5: {
                String string = cl_2.I();
                for (String string2 : cl_2.J) {
                    cl_2.Y(string2);
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block5;
                }
                cl_2.J.clear();
            }
            return;
        }
    }
}

