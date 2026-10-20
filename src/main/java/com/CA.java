/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ic_0;
import com.kz_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.SwingUtilities;

class CA
extends MouseAdapter {
    final ic_0 E;

    CA(ic_0 ic_02) {
        this.E = ic_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block5: {
            int n10;
            int n11;
            block4: {
                n11 = ic_0.g(this.E).getUI().locationToIndex(ic_0.g(this.E), mouseEvent.getPoint());
                String string = kz_2.M();
                n10 = SwingUtilities.isLeftMouseButton(mouseEvent);
                if (string == null) break block4;
                if (n10 == 0) break block5;
                n10 = n11;
            }
            if (n10 != -1) {
                ic_0.i(this.E, (File)ic_0.g(this.E).getModel().getElementAt(n11));
            }
        }
    }
}

