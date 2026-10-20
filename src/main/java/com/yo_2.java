/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LN;
import com.S1;
import com.af_0;
import com.kf_0;
import com.ky_2;
import com.w8_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

/*
 * Renamed from com.yo
 */
class yo_2
implements ActionListener,
ItemListener {
    private String L;
    private String B;
    final JComboBox e;
    final kf_0 u;
    final JSlider l;
    final JSpinner o;
    final w8_0 n;
    final JTextArea b;
    final JTextArea V;
    final S1 m;

    yo_2(S1 s1, JComboBox jComboBox, kf_0 kf_02, JSlider jSlider, JSpinner jSpinner, w8_0 w8_02, JTextArea jTextArea, JTextArea jTextArea2) {
        this.m = s1;
        this.e = jComboBox;
        this.u = kf_02;
        this.l = jSlider;
        this.o = jSpinner;
        this.n = w8_02;
        this.b = jTextArea;
        this.V = jTextArea2;
        this.L = "";
        this.B = "";
    }

    public void s() {
        LN lN = (LN)((Object)this.e.getSelectedItem());
        int n10 = this.u.P();
        int n11 = n10 + this.u.r().size();
        this.l.setMinimum(n10);
        int n12 = af_0.p();
        this.l.setMaximum(n11);
        int n13 = n12;
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(Math.max((Integer)this.o.getValue(), n10), n10, n11, 1);
        this.o.setModel(spinnerNumberModel);
        int n14 = this.l.getValue() - this.l.getMinimum();
        String string = this.n.c(lN, n14);
        String string2 = S1.y(this.m, this.n, n14);
        boolean bl = string.equals(this.L);
        if (n13 == 0) {
            if (!bl) {
                this.b.setText(string);
                this.L = string;
            }
            bl = string2.equals(this.B);
        }
        if (!bl) {
            this.V.setText(string2);
            this.B = string2;
        }
        if (ky_2.F() != null) {
            af_0.J(++n13);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.s();
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        this.s();
    }
}

