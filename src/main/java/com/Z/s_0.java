/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import com.z.d_0;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/*
 * Renamed from com.Z.s
 */
class s_0
implements TreeSelectionListener {
    final T B;

    s_0(T t2) {
        this.B = t2;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        block3: {
            T t2;
            block2: {
                String string = T.v();
                t2 = this.B;
                if (string != null) break block2;
                if (t2.H.getSelectionCount() <= 0) break block3;
                t2 = this.B;
            }
            t2.M(this.B.H.N(), d_0.tree);
        }
    }
}

