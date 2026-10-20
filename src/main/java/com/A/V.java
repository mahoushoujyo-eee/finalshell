/*
 * Decompiled with CFR 0.152.
 */
package com.A;

import com.A.d;
import com.O_;
import com.a.y_0;
import java.awt.Dimension;

public class V
extends O_ {
    final d u;

    public V(d d2) {
        this.u = d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String getText() {
        String string;
        block5: {
            int[] nArray;
            String string2;
            block4: {
                string2 = this.u.i();
                nArray = y_0.M();
                string = string2;
                if (nArray == null) break block4;
                if (string == null) break block5;
                string = string2;
            }
            if (nArray == null) return string;
            if (!string.equals("")) {
                string = string2;
                return string;
            }
        }
        string = this.u.s;
        return string;
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension = super.getPreferredSize();
        dimension.width = Math.min(dimension.width, this.u.z);
        return dimension;
    }

    public Dimension k() {
        return super.getPreferredSize();
    }
}

