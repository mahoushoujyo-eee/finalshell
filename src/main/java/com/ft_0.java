/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.a2;
import com.aO;
import com.fm_0;
import com.ky_2;
import com.pt_0;
import com.ud_0;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

/*
 * Renamed from com.Ft
 */
public class ft_0
extends fm_0 {
    public static ComponentUI createUI(JComponent jComponent) {
        return new ft_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.I.c(this.B().g());
    }

    protected ud_0 B() {
        return (ud_0)this.U;
    }

    @Override
    protected aO s() {
        return new a2(this.B());
    }

    @Override
    protected void A() {
        block5: {
            ud_0 ud_02;
            block4: {
                ft_0 ft_02;
                ud_0 ud_03;
                block2: {
                    block3: {
                        ud_03 = this.B();
                        ky_2[] ky_2Array = pt_0.b();
                        ft_02 = this;
                        if (ky_2Array != null) break block2;
                        if (!ft_02.u()) break block3;
                        ft_02 = this;
                        if (ky_2Array != null) break block2;
                        if (!ft_02.O()) break block3;
                        ud_02 = ud_03;
                        if (ky_2Array != null) break block4;
                        if (!ud_02.isEnabled()) break block3;
                        this.I.U(ud_03.g());
                        this.P.u();
                        if (ky_2Array == null) break block5;
                        ky_2.K(new String[4]);
                    }
                    this.P.Y();
                    ft_02 = this;
                }
                ft_02.I.c(ud_03.g());
                ud_02 = ud_03;
            }
            ud_02.repaint();
        }
    }
}

