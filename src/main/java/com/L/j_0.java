/*
 * Decompiled with CFR 0.152.
 */
package com.l;

import com.C.M;
import com.FJ;
import com.L.c;
import com.L.m;
import com.ky_2;
import java.awt.Insets;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.PopupMenuUI;

/*
 * Renamed from com.L.j
 */
class j_0
implements ListSelectionListener {
    final c B;

    j_0(c c2) {
        this.B = c2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block3: {
            Insets insets;
            block6: {
                ky_2[] ky_2Array;
                block5: {
                    FJ fJ2;
                    PopupMenuUI popupMenuUI;
                    block4: {
                        boolean bl;
                        block2: {
                            ky_2Array = m.X();
                            bl = this.B.isShowing();
                            if (ky_2Array != null) break block2;
                            if (!bl) break block3;
                            popupMenuUI = this.B.getUI();
                            if (ky_2Array != null) break block4;
                            bl = popupMenuUI instanceof FJ;
                        }
                        if (!bl) break block3;
                        popupMenuUI = this.B.getUI();
                    }
                    if ((fJ2 = (FJ)popupMenuUI).M() != M.dropdown) break block3;
                    int n10 = this.B.getLocationOnScreen().y;
                    int n11 = c.L((c)this.B).getLocationOnScreen().y;
                    insets = this.B.getInsets();
                    if (ky_2Array != null) break block5;
                    if (n10 <= n11) break block6;
                    this.B.repaint(0, 0, this.B.getWidth(), insets.top);
                }
                if (ky_2Array == null) break block3;
            }
            this.B.repaint(0, this.B.getHeight() - insets.bottom, this.B.getWidth(), insets.bottom);
        }
    }
}

