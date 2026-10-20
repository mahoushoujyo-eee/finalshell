/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.lz_0;
import com.pf_1;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class L3
extends lz_0 {
    protected pf_1 t;

    public L3() {
        this((pf_1)null);
    }

    public L3(URL uRL) {
        this(new pf_1(uRL));
    }

    public L3(String string) {
        this(new pf_1(string));
    }

    public L3(ImageIcon imageIcon) {
        this(new pf_1(imageIcon));
    }

    public L3(Image image) {
        this(new pf_1(image));
    }

    public L3(BufferedImage bufferedImage) {
        this(new pf_1(bufferedImage));
    }

    public L3(pf_1 pf_12) {
        this.t = pf_12;
    }

    public pf_1 X() {
        return this.t;
    }

    public void P(pf_1 pf_12) {
        this.t = pf_12;
        this.Z();
    }

    @Override
    public Dimension d(JComponent jComponent) {
        int[] nArray = lz_0.M();
        L3 l3 = this;
        if (nArray == null) {
            if (l3.t != null) {
                this.t.k(jComponent);
                return this.t.R();
            }
            l3 = this;
        }
        return super.d(jComponent);
    }

    @Override
    public Insets B(JComponent jComponent) {
        Insets insets;
        block3: {
            pf_1 pf_12;
            block2: {
                insets = super.B(jComponent);
                int[] nArray = lz_0.M();
                pf_12 = this.t;
                if (nArray != null) break block2;
                if (pf_12 == null) break block3;
                pf_12 = this.t;
            }
            pf_12.k(jComponent);
            return FN.Z(insets, this.t.U());
        }
        return insets;
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        block3: {
            pf_1 pf_12;
            block2: {
                int[] nArray = lz_0.M();
                pf_12 = this.t;
                if (nArray != null) break block2;
                if (pf_12 == null) break block3;
                this.t.k(jComponent);
                pf_12 = this.t;
            }
            pf_12.T(jComponent, graphics2D);
        }
    }
}

