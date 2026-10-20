/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.aS;
import com.i;
import java.awt.event.ItemListener;
import java.io.Serializable;
import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class IY
extends IB {
    private ItemListener X;

    public IY(aS aS2) {
        super(aS2);
    }

    public Boolean K() {
        Boolean bl = (Boolean)super.Y();
        String[] stringArray = IH.M();
        Boolean bl2 = bl;
        if (stringArray != null) {
            if (bl2 == null) {
                bl = false;
            }
            bl2 = bl;
        }
        return bl2;
    }

    protected void w(AbstractButton abstractButton) {
        this.X = new i(this);
        abstractButton.addItemListener(this.X);
    }

    public void e(AbstractButton abstractButton) {
        abstractButton.removeItemListener(this.X);
        this.X = null;
    }

    public void j(AbstractButton abstractButton) {
        block3: {
            AbstractButton abstractButton2;
            boolean bl;
            block2: {
                bl = (Boolean)this.o();
                String[] stringArray = IH.M();
                abstractButton2 = abstractButton;
                if (stringArray == null) break block2;
                if (abstractButton2.isSelected() == bl) break block3;
                abstractButton2 = abstractButton;
            }
            abstractButton2.setSelected(bl);
        }
    }

    public void m(AbstractButton abstractButton) {
        this.J(Boolean.valueOf(abstractButton.isSelected()));
    }

    @Override
    public void T(JComponent jComponent) {
        this.m((AbstractButton)jComponent);
    }

    @Override
    public void s(JComponent jComponent) {
        this.j((AbstractButton)jComponent);
    }

    @Override
    public void r(JComponent jComponent) {
        this.e((AbstractButton)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.w((AbstractButton)jComponent);
    }

    @Override
    public Serializable Y() {
        return this.K();
    }
}

