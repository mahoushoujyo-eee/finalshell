/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.lz_0;
import com.og_2;
import com.p5_0;
import java.awt.Component;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

class IW
implements p5_0 {
    final WeakReference T;
    final WeakReference y;

    IW(WeakReference weakReference, WeakReference weakReference2) {
        this.T = weakReference;
        this.y = weakReference2;
    }

    @Override
    public void r() {
        ((JComponent)this.T.get()).repaint();
    }

    @Override
    public void M(int n10, int n11, int n12, int n13) {
        ((JComponent)this.T.get()).repaint(n10, n11, n12, n13);
    }

    @Override
    public void J() {
        GA.i((Component)this.T.get());
        ((JComponent)this.T.get()).revalidate();
    }

    @Override
    public void p() {
        block3: {
            Boolean bl;
            Boolean bl2;
            block4: {
                og_2 og_22;
                int[] nArray;
                block2: {
                    og_2 og_23 = (og_2)this.y.get();
                    nArray = lz_0.M();
                    og_22 = og_23;
                    if (nArray != null) break block2;
                    if (og_22 == null) break block3;
                    og_22 = og_23;
                }
                bl = bl2 = og_22.d((JComponent)this.T.get());
                if (nArray != null) break block4;
                if (bl == null) break block3;
                bl = this.T.get();
            }
            ((JComponent)((Object)bl)).setOpaque(bl2);
        }
    }
}

