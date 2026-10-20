/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IB;
import com.IH;
import com.LE;
import com.X3;
import com.aS;
import com.ez_1;
import com.ky_2;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JPasswordField;

/*
 * Renamed from com.Ig
 */
public class ig_0
extends IB {
    private ActionListener R;
    private FocusAdapter V;

    public ig_0(aS aS2) {
        super(aS2);
    }

    public String X() {
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

    protected void A(JPasswordField jPasswordField) {
        this.R = new ez_1(this);
        jPasswordField.addActionListener(this.R);
        this.V = new X3(this);
        String[] stringArray = IH.M();
        jPasswordField.addFocusListener(this.V);
        String[] stringArray2 = stringArray;
        if (stringArray2 == null) {
            ky_2.K(new String[3]);
        }
    }

    protected void q(JPasswordField jPasswordField) {
        String[] stringArray = IH.M();
        jPasswordField.removeActionListener(this.R);
        String[] stringArray2 = stringArray;
        this.R = null;
        jPasswordField.removeFocusListener(this.V);
        this.V = null;
        if (ky_2.F() != null) {
            IH.x(new String[4]);
        }
    }

    protected void S(JPasswordField jPasswordField) {
        jPasswordField.setText(LE.o((String)((Object)this.o())));
    }

    protected void f(JPasswordField jPasswordField) {
        this.J((Serializable)((Object)LE.E(new String(jPasswordField.getPassword()))));
    }

    @Override
    protected void T(JComponent jComponent) {
        this.f((JPasswordField)jComponent);
    }

    @Override
    protected void s(JComponent jComponent) {
        this.S((JPasswordField)jComponent);
    }

    @Override
    protected void r(JComponent jComponent) {
        this.q((JPasswordField)jComponent);
    }

    @Override
    protected void F(JComponent jComponent) {
        this.A((JPasswordField)jComponent);
    }

    @Override
    public Serializable Y() {
        return this.X();
    }
}

