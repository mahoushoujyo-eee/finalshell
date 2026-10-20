/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B6;
import com.IB;
import com.aS;
import com.wc_2;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class IH
extends IB {
    private ActionListener W;
    private FocusAdapter w;
    private static String[] H;

    public IH(aS aS2) {
        super(aS2);
    }

    public String W() {
        String string = (String)((Object)super.Y());
        String[] stringArray = IH.M();
        String string2 = string;
        if (stringArray != null) {
            if (string2 == null) {
                string = "";
            }
            string2 = string;
        }
        return string2;
    }

    protected void I(JTextComponent jTextComponent) {
        block3: {
            JTextComponent jTextComponent2;
            block2: {
                String[] stringArray = IH.M();
                this.w = new wc_2(this);
                jTextComponent.addFocusListener(this.w);
                String[] stringArray2 = stringArray;
                jTextComponent2 = jTextComponent;
                if (stringArray2 == null) break block2;
                if (!(jTextComponent2 instanceof JTextField)) break block3;
                jTextComponent2 = jTextComponent;
            }
            JTextField jTextField = (JTextField)jTextComponent2;
            this.W = new B6(this);
            jTextField.addActionListener(this.W);
        }
    }

    protected void y(JTextComponent jTextComponent) {
        jTextComponent.setText((String)((Object)this.o()));
    }

    protected void r(JTextComponent jTextComponent) {
        this.J((Serializable)((Object)jTextComponent.getText()));
    }

    protected void C(JTextComponent jTextComponent) {
        block3: {
            JTextComponent jTextComponent2;
            block2: {
                String[] stringArray = IH.M();
                jTextComponent.removeFocusListener(this.w);
                this.w = null;
                String[] stringArray2 = stringArray;
                jTextComponent2 = jTextComponent;
                if (stringArray2 == null) break block2;
                if (!(jTextComponent2 instanceof JTextField)) break block3;
                jTextComponent2 = jTextComponent;
            }
            JTextField jTextField = (JTextField)jTextComponent2;
            jTextField.removeActionListener(this.W);
            this.W = null;
        }
    }

    @Override
    protected void T(JComponent jComponent) {
        this.r((JTextComponent)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.y((JTextComponent)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.C((JTextComponent)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.I((JTextComponent)jComponent);
    }

    @Override
    public Serializable Y() {
        return this.W();
    }

    public static void x(String[] stringArray) {
        H = stringArray;
    }

    public static String[] M() {
        return H;
    }

    static {
        if (IH.M() == null) {
            IH.x(new String[3]);
        }
    }
}

