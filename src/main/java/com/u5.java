/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ac_0;
import com.ky_2;
import com.qm_0;
import com.uo_0;
import com.wd_0;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ComponentAdapter;

class u5
extends uo_0 {
    final wd_0 j;
    final AWTEventListener Y;
    final qm_0 M;
    final ComponentAdapter S;
    final boolean A;
    private static final long a;

    u5(wd_0 wd_02, AWTEventListener aWTEventListener, qm_0 qm_02, ComponentAdapter componentAdapter, boolean bl) {
        this.j = wd_02;
        this.Y = aWTEventListener;
        this.M = qm_02;
        this.S = componentAdapter;
        this.A = bl;
    }

    @Override
    public void R() {
        if (this.j.R()) {
            Toolkit.getDefaultToolkit().addAWTEventListener(this.Y, a);
        }
    }

    @Override
    public void d() {
        block6: {
            u5 u52;
            block5: {
                boolean bl;
                block4: {
                    ky_2[] ky_2Array = ac_0.n();
                    this.j.R(this);
                    ky_2[] ky_2Array2 = ky_2Array;
                    bl = this.j.R();
                    if (ky_2Array2 != null) break block4;
                    if (bl) {
                        Toolkit.getDefaultToolkit().removeAWTEventListener(this.Y);
                    }
                    ac_0.g.remove(this.j);
                    this.M.removeComponentListener(this.S);
                    u52 = this;
                    if (ky_2Array2 != null) break block5;
                    bl = u52.A;
                }
                if (!bl) break block6;
                u52 = this;
            }
            u52.j.R();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3633096230226626834L;
        a = 0x326B59C5BD780902L ^ l2;
    }
}

