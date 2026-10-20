/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GO;
import com.TA;
import com.xt_1;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

public class a
extends JComponent
implements SwingConstants {
    private int O;
    private int P;

    public a() {
        this(GO.FJ);
    }

    public a(int n10) {
        this(n10, -1);
    }

    public a(int n10, int n11) {
        FN.Y(this);
        this.M(n10);
        this.o(n11);
    }

    public int l() {
        return this.P;
    }

    public void o(int n10) {
        this.P = n10;
    }

    public int H() {
        return this.O;
    }

    public void M(int n10) {
        this.O = n10;
    }

    @Override
    public Dimension getPreferredSize() {
        block3: {
            TA tA;
            LayoutManager layoutManager;
            block4: {
                Container container;
                String string;
                Container container2;
                block2: {
                    container2 = this.getParent();
                    string = xt_1.l();
                    container = container2;
                    if (string == null) break block2;
                    if (container == null) break block3;
                    container = container2;
                }
                layoutManager = container.getLayout();
                if (string == null) break block4;
                if (!(layoutManager instanceof TA)) break block3;
                layoutManager = container2.getLayout();
            }
            return new Dimension((tA = (TA)layoutManager).N() != 1 ? this.O : 0, tA.N() != 0 ? this.O : 0);
        }
        return new Dimension(this.P != 1 ? this.O : 0, this.P != 0 ? this.O : 0);
    }
}

