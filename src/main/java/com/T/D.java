/*
 * Decompiled with CFR 0.152.
 */
package com.T;

import com.T.E;
import com.T.s;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

class D
implements HierarchyListener {
    final s y;

    D(s s2) {
        this.y = s2;
    }

    @Override
    public void hierarchyChanged(HierarchyEvent hierarchyEvent) {
        block3: {
            JRootPane jRootPane;
            JButton jButton;
            block4: {
                JRootPane jRootPane2;
                HierarchyEvent hierarchyEvent2;
                int n10;
                block2: {
                    n10 = E.D();
                    hierarchyEvent2 = hierarchyEvent;
                    if (n10 == 0) break block2;
                    if ((hierarchyEvent2.getChangeFlags() & 1L) == 0L) break block3;
                    hierarchyEvent2 = hierarchyEvent;
                }
                jButton = (JButton)hierarchyEvent2.getComponent();
                jRootPane = jRootPane2 = SwingUtilities.getRootPane(jButton);
                if (n10 == 0) break block4;
                if (jRootPane == null) break block3;
                jRootPane = jRootPane2;
            }
            jRootPane.setDefaultButton(jButton);
        }
    }
}

