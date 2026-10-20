/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.ky_2;
import com.ne_1;
import com.ok_1;
import com.qm_0;
import com.rn_0;
import com.up_0;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;

/*
 * Renamed from com.Pa
 */
class pa_0
extends DragSourceAdapter {
    pa_0() {
    }

    @Override
    public void dragEnter(DragSourceDragEvent dragSourceDragEvent) {
        this.c(dragSourceDragEvent);
    }

    protected void c(DragSourceDragEvent dragSourceDragEvent) {
        DataFlavor[] dataFlavorArray;
        DragSourceContext dragSourceContext = dragSourceDragEvent.getDragSourceContext();
        rn_0.h = dragSourceContext.getComponent();
        int n10 = rn_0.Y();
        Transferable transferable = dragSourceContext.getTransferable();
        DataFlavor[] dataFlavorArray2 = dataFlavorArray = transferable.getTransferDataFlavors();
        int n11 = dataFlavorArray2.length;
        int n12 = 0;
        while (n12 < n11) {
            block8: {
                block9: {
                    DataFlavor dataFlavor = dataFlavorArray2[n12];
                    try {
                        if (n10 == 0) break block8;
                        if (!rn_0.c.containsKey(dataFlavor)) break block9;
                    }
                    catch (Throwable throwable) {
                        throw pa_0.a(throwable);
                    }
                    try {
                        rn_0.b = transferable.getTransferData(dataFlavor);
                        rn_0.F = (up_0)rn_0.c.get(dataFlavor);
                        rn_0.W = rn_0.F.u(rn_0.b, dragSourceDragEvent);
                        rn_0.f = ok_1.P(dragSourceContext.getComponent());
                        rn_0.f.u(rn_0.W, this.R(rn_0.f, dragSourceDragEvent));
                        break;
                    }
                    catch (Throwable throwable) {
                        ne_1.g(rn_0.class, throwable);
                    }
                }
                ++n12;
            }
            if (n10 != 0) continue;
        }
        try {
            if (ky_2.F() != null) {
                rn_0.i(++n10);
            }
        }
        catch (Throwable throwable) {
            throw pa_0.a(throwable);
        }
    }

    @Override
    public void dragMouseMoved(DragSourceDragEvent dragSourceDragEvent) {
        DragSourceContext dragSourceContext = dragSourceDragEvent.getDragSourceContext();
        int n10 = rn_0.R();
        if (dragSourceContext.getComponent() != rn_0.h) {
            this.c(dragSourceDragEvent);
        }
        if (rn_0.W != null) {
            qm_0 qm_02;
            qm_0 qm_03 = qm_02 = ok_1.P(dragSourceDragEvent.getDragSourceContext().getComponent());
            if (n10 == 0) {
                if (qm_03 != rn_0.f) {
                    rn_0.f.K();
                    rn_0.f = qm_02;
                }
                qm_03 = rn_0.f;
            }
            qm_03.u(rn_0.W, this.R(rn_0.f, dragSourceDragEvent));
        }
    }

    public Point R(qm_0 qm_02, DragSourceDragEvent dragSourceDragEvent) {
        Point point = FN.f(qm_02);
        Point point2 = rn_0.F.e(rn_0.b, dragSourceDragEvent);
        return new Point(point.x + point2.x, point.y + point2.y);
    }

    @Override
    public void dragDropEnd(DragSourceDropEvent dragSourceDropEvent) {
        block3: {
            block2: {
                rn_0.h = null;
                int n10 = rn_0.Y();
                if (n10 == 0) break block2;
                if (rn_0.W == null) break block3;
                rn_0.F.v(rn_0.b, dragSourceDropEvent);
                rn_0.f.K();
                rn_0.f = null;
                rn_0.b = null;
                rn_0.W = null;
            }
            rn_0.F = null;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

