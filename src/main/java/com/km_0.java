/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.yc_0;
import java.awt.Rectangle;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Renamed from com.Km
 */
class km_0
implements ListSelectionListener {
    final yc_0 O;

    km_0(yc_0 yc_02) {
        this.O = yc_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block5: {
            Rectangle rectangle;
            Rectangle rectangle2;
            block7: {
                int n10;
                String[] stringArray;
                block6: {
                    block4: {
                        stringArray = CI.c();
                        n10 = this.O.V;
                        if (stringArray != null) break block4;
                        if (n10 == 0) break block5;
                        n10 = yc_0.o(this.O).getSelectedIndex();
                    }
                    if (stringArray != null) break block6;
                    if (n10 == -1) break block5;
                    n10 = yc_0.W(this.O).getLeadSelectionIndex();
                }
                int n11 = n10;
                rectangle = rectangle2 = this.O.getCellBounds(yc_0.i(this.O), n11, n11);
                if (stringArray != null) break block7;
                if (rectangle == null) break block5;
                rectangle = rectangle2;
            }
            if (!rectangle.intersects(yc_0.b(this.O).getVisibleRect())) {
                yc_0.O(this.O).scrollRectToVisible(rectangle2);
            }
        }
    }
}

