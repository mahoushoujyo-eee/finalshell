/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QX;
import com.QZ;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.Io
 */
class io_0
extends MouseAdapter {
    final QZ w;

    io_0(QZ qZ) {
        this.w = qZ;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block3: {
            QZ qZ;
            block2: {
                String[] stringArray = QX.Y();
                qZ = this.w;
                if (stringArray != null) break block2;
                if (qZ.s) break block3;
                qZ = this.w;
            }
            qZ.s();
        }
    }
}

