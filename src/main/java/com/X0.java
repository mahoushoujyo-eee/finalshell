/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GJ;
import com.T5;
import com.cn_0;
import com.ke_2;
import com.ky_2;
import com.xq_0;
import java.awt.Component;
import javax.swing.JTextField;

public class X0 {
    private static final long a;

    public void B(int n10, String string, Component component, T5 t5) {
        JTextField jTextField = this.k();
        jTextField.setOpaque(false);
        jTextField.setDocument(new ke_2((int)a));
        String[] stringArray = cn_0.Q();
        jTextField.setText(string);
        GJ gJ2 = new GJ(this, n10, component, jTextField, t5);
        jTextField.addFocusListener(gJ2);
        String[] stringArray2 = stringArray;
        jTextField.addKeyListener(new xq_0(this, jTextField, gJ2, n10, component, t5));
        t5.S(jTextField);
        jTextField.requestFocus();
        jTextField.selectAll();
        if (stringArray2 == null) {
            ky_2.K(new String[2]);
        }
    }

    protected JTextField k() {
        return new JTextField();
    }

    private static void R(int n10, Component component, String string, T5 t5) {
        String[] stringArray = cn_0.Q();
        if (stringArray != null) {
            if (string != null) {
                t5.Z(n10, string);
            }
            t5.S(component);
        }
    }

    static void k(int n10, Component component, String string, T5 t5) {
        X0.R(n10, component, string, t5);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3634551773197181529L;
        a = 0xCABF97D9BF2F226BL ^ l2;
    }
}

