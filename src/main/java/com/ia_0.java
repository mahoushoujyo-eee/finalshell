/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.aS;
import com.cl_2;
import com.gx_0;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

/*
 * Renamed from com.Ia
 */
public class ia_0
extends IB {
    private ChangeListener f;

    public ia_0(aS aS2) {
        super(aS2);
    }

    public Integer A() {
        Integer n10 = (Integer)super.Y();
        String[] stringArray = IH.M();
        Integer n11 = n10;
        if (stringArray != null) {
            if (n11 == null) {
                n10 = ((JSlider)this.b()).getMinimum();
            }
            n11 = n10;
        }
        return n11;
    }

    protected void S(JSlider jSlider) {
        this.f = new gx_0(this);
        jSlider.addChangeListener(this.f);
    }

    protected void A(JSlider jSlider) {
        jSlider.removeChangeListener(this.f);
        this.f = null;
    }

    protected void p(JSlider jSlider) {
        jSlider.setValue((Integer)this.o());
    }

    protected void M(JSlider jSlider) {
        cl_2.A(this.M(), this.S(), jSlider.getValue());
    }

    @Override
    protected void T(JComponent jComponent) {
        this.M((JSlider)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.p((JSlider)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.A((JSlider)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.S((JSlider)jComponent);
    }

    @Override
    public Serializable Y() {
        return this.A();
    }
}

