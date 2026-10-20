/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.il_1;
import com.pa_1;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Nt
 */
class nt_0
implements il_1 {
    final int l;
    final int Z;
    final pa_1 e;

    nt_0(pa_1 pa_12, int n10, int n11) {
        this.e = pa_12;
        this.l = n10;
        this.Z = n11;
    }

    @Override
    public void s() {
        block3: {
            block2: {
                int n10 = pa_1.D((pa_1)this.e).T.r - 1;
                int n11 = _y_0.M();
                if (n11 == 0) break block2;
                if (n10 + this.l < this.Z) break block3;
                pa_1.T(this.e).q(this);
            }
            SwingUtilities.invokeLater(this::lambda$modelChanged$0);
        }
    }

    private void lambda$modelChanged$0() {
        pa_1.T(this.e).w();
        try {
            pa_1.y(this.e).setRangeProperties(0, this.e.N.c(), -pa_1.T(this.e).H(), this.e.N.c(), false);
        }
        finally {
            pa_1.T(this.e).h();
        }
    }
}

