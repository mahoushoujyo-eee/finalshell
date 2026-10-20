/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.pa_1;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.eT
 */
class et_1
implements HierarchyListener {
    final pa_1 g;
    private static final long a;

    et_1(pa_1 pa_12) {
        this.g = pa_12;
    }

    @Override
    public void hierarchyChanged(HierarchyEvent hierarchyEvent) {
        block3: {
            pa_1 pa_12;
            block4: {
                long l2;
                block2: {
                    int n10 = _y_0.M();
                    long l3 = (hierarchyEvent.getChangeFlags() & a) - 0L;
                    l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    if (n10 == 0) break block2;
                    if (l2 == false) break block3;
                    pa_12 = this.g;
                    if (n10 == 0) break block4;
                    l2 = (long)pa_12.isShowing();
                }
                if (l2 == false) break block3;
                SwingUtilities.invokeLater(this::lambda$hierarchyChanged$0);
                pa_12 = this.g;
            }
            pa_12.removeHierarchyListener(this);
        }
    }

    private void lambda$hierarchyChanged$0() {
        pa_1.I(this.g);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 672374342924409146L;
        a = 0x954C0E70A18993EL ^ l2;
    }
}

