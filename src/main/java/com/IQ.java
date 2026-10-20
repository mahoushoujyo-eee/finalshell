/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.aS;
import com.uD;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JComboBox;
import javax.swing.JComponent;

public class IQ
extends IB {
    private ActionListener J;

    public IQ(aS aS2) {
        super(aS2);
    }

    public Integer H() {
        Integer n10 = (Integer)super.Y();
        String[] stringArray = IH.M();
        Integer n11 = n10;
        if (stringArray != null) {
            if (n11 == null) {
                n10 = -1;
            }
            n11 = n10;
        }
        return n11;
    }

    protected void Q(JComboBox jComboBox) {
        this.J = new uD(this);
        jComboBox.addActionListener(this.J);
    }

    protected void t(JComboBox jComboBox) {
        jComboBox.removeActionListener(this.J);
        this.J = null;
    }

    protected void L(JComboBox jComboBox) {
        block3: {
            JComboBox jComboBox2;
            Integer n10;
            block6: {
                int n11;
                int n12;
                block5: {
                    String[] stringArray;
                    block4: {
                        Integer n13;
                        block2: {
                            n10 = (Integer)this.o();
                            stringArray = IH.M();
                            n13 = n10;
                            if (stringArray == null) break block2;
                            if (n13 == null) break block3;
                            n13 = n10;
                        }
                        n12 = n13;
                        if (stringArray == null) break block4;
                        if (n12 < 0) break block3;
                        n12 = jComboBox.getModel().getSize();
                    }
                    n11 = n10;
                    if (stringArray == null) break block5;
                    if (n12 <= n11) break block3;
                    jComboBox2 = jComboBox;
                    if (stringArray == null) break block6;
                    n12 = jComboBox2.getSelectedIndex();
                    n11 = n10;
                }
                if (n12 == n11) break block3;
                jComboBox2 = jComboBox;
            }
            jComboBox2.setSelectedIndex(n10);
        }
    }

    protected void i(JComboBox jComboBox) {
        this.J(Integer.valueOf(jComboBox.getSelectedIndex()));
    }

    @Override
    protected void T(JComponent jComponent) {
        this.i((JComboBox)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.L((JComboBox)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.t((JComboBox)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.Q((JComboBox)jComponent);
    }

    @Override
    public Serializable Y() {
        return this.H();
    }
}

