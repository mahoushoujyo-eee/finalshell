/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.kd_2;
import com.ke_1;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.AbstractButton;

class H8
extends MouseAdapter {
    final CI C;
    final kd_2 c;

    H8(kd_2 kd_22, CI cI) {
        this.c = kd_22;
        this.C = cI;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            CI cI;
            block5: {
                boolean bl;
                CI cI2;
                block4: {
                    Component component;
                    String string;
                    block2: {
                        string = ke_1.v();
                        component = this.C;
                        if (string != null) break block2;
                        if (component.getSelectedIndex() == -1) break block3;
                        this.c.u((File)this.C.getSelectedValue());
                        component = this.c.q();
                    }
                    cI2 = component;
                    ((Component)cI2).requestFocus();
                    ((Component)cI2).requestFocusInWindow();
                    bl = kd_2.M(this.c);
                    if (string != null) break block4;
                    if (!bl) break block3;
                    cI = cI2;
                    if (string != null) break block5;
                    bl = cI instanceof AbstractButton;
                }
                if (!bl) break block3;
                cI = cI2;
            }
            ((AbstractButton)((Object)cI)).doClick();
        }
    }
}

