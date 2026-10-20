/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ST;
import com.cb_1;
import com.us_0;
import java.util.List;
import javax.swing.tree.TreePath;

class SK
extends ST {
    final TreePath Z;
    final us_0 a;

    SK(us_0 us_02, TreePath treePath) {
        this.a = us_02;
        this.Z = treePath;
    }

    @Override
    public void y(cb_1 cb_12, List list) {
        block3: {
            String[] stringArray = cb_1.C();
            if (cb_12 == this.a.b(this.Z)) {
                for (cb_1 cb_13 : list) {
                    this.a.z(cb_13.i());
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block3;
                }
                this.a.C(this);
            }
        }
    }

    @Override
    public void X(cb_1 cb_12, Throwable throwable) {
        if (cb_12 == this.a.b(this.Z)) {
            this.a.C(this);
        }
    }
}

