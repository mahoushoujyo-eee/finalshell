/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.QX;
import java.awt.Dimension;
import java.awt.Rectangle;

/*
 * Renamed from com.wu
 */
class wu_2
implements E {
    final int E;
    final int w;
    final QX F;

    wu_2(QX qX, int n10, int n11) {
        this.F = qX;
        this.E = n10;
        this.w = n11;
    }

    public Rectangle e() {
        Dimension dimension = this.F.getPreferredSize();
        return new Rectangle(this.E, this.w, dimension.width, dimension.height);
    }

    @Override
    public Object J() {
        return this.e();
    }
}

