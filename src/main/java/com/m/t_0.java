/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.K;
import com.m.s;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/*
 * Renamed from com.m.t
 */
class t_0
implements TreeSelectionListener {
    final K A;

    t_0(K k2) {
        this.A = k2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        block3: {
            JTree jTree;
            block4: {
                int n10;
                block2: {
                    String string = s.d();
                    this.A.F();
                    String string2 = string;
                    n10 = this.A.U;
                    if (string2 == null) break block2;
                    if (n10 == 0) break block3;
                    jTree = K.V(this.A);
                    if (string2 == null) break block4;
                    n10 = jTree.getSelectionCount();
                }
                if (n10 <= 0) break block3;
                jTree = K.x(this.A);
            }
            jTree.expandPath(K.h(this.A).getSelectionPath());
        }
    }
}

