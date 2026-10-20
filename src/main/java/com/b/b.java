/*
 * Decompiled with CFR 0.152.
 */
package com.b;

import com.b.V;
import com.ky_2;
import javax.swing.ImageIcon;

public abstract class b
extends V {
    protected ImageIcon V;
    protected String h;

    public b(ImageIcon imageIcon, String string) {
        this.V = imageIcon;
        ky_2[] ky_2Array = com.b.V.L();
        this.h = string;
        if (ky_2.F() != null) {
            com.b.V.Q(new ky_2[2]);
        }
    }

    @Override
    public ImageIcon b() {
        return this.V;
    }

    public void S(ImageIcon imageIcon) {
        this.V = imageIcon;
    }

    @Override
    public String getDescription() {
        return this.h;
    }

    public void W(String string) {
        this.h = string;
    }
}

