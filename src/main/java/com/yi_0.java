/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import com.WF;
import com.ac_0;
import com.ky_2;
import com.rq_0;
import com.wd_0;
import com.wz_2;
import java.awt.Component;
import javax.swing.JComponent;

/*
 * Renamed from com.Yi
 */
public abstract class yi_0
implements rq_0 {
    private wd_0 l;
    private WC A;

    @Override
    public long T() {
        return ac_0.S();
    }

    @Override
    public wd_0 y(JComponent jComponent, Object object, int n10, int n11, boolean bl) {
        String string = this.D(jComponent, object, n10, n11, bl);
        WF wF = this.h(jComponent, object, n10, n11, bl);
        return new wd_0((Component)jComponent, string, wF);
    }

    public WF h(JComponent jComponent, Object object, int n10, int n11, boolean bl) {
        return WF.trailing;
    }

    public abstract String D(JComponent var1, Object var2, int var3, int var4, boolean var5);

    @Override
    public void M(JComponent jComponent, int n10, int n11, int n12, int n13) {
        block11: {
            long l2;
            block13: {
                ky_2[] ky_2Array;
                block12: {
                    int n14;
                    int n15;
                    block10: {
                        block9: {
                            wd_0 wd_02;
                            block8: {
                                ky_2Array = ac_0.n();
                                yi_0 yi_02 = this;
                                if (ky_2Array == null) {
                                    if (yi_02.A != null) {
                                        this.A.Y();
                                    }
                                    yi_02 = this;
                                }
                                wd_02 = yi_02.l;
                                if (ky_2Array != null) break block8;
                                if (wd_02 == null) break block9;
                                wd_02 = this.l;
                            }
                            wd_02.j();
                        }
                        n15 = n12;
                        n14 = -1;
                        if (ky_2Array != null) break block10;
                        if (n15 == n14) break block11;
                        n15 = n13;
                        n14 = -1;
                    }
                    if (n15 == n14) break block11;
                    l2 = this.T();
                    if (ky_2Array != null) break block12;
                    if (l2 > 0L) break block13;
                    this.z(jComponent, n12, n13);
                }
                if (ky_2Array == null) break block11;
            }
            this.A = WC.A(l2, new wz_2(this, jComponent, n12, n13));
        }
    }

    protected void z(JComponent jComponent, int n10, int n11) {
        Object object = this.c(jComponent, n10, n11);
        boolean bl = this.M(jComponent, n10, n11);
        this.l = this.y(jComponent, object, n10, n11, bl);
        this.l.Q(this.E(jComponent, object, n10, n11, bl));
        ac_0.i(this.l);
    }

    protected abstract Object c(JComponent var1, int var2, int var3);

    protected abstract boolean M(JComponent var1, int var2, int var3);
}

