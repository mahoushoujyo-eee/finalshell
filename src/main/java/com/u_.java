/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O_;
import java.awt.Component;

public class u_ {
    private Component l;

    public u_() {
        this((Component)null);
    }

    public u_(String string) {
        this(new O_(string));
    }

    public u_(Component component) {
        this.W(component);
    }

    public Component j() {
        return this.l;
    }

    public void W(Component component) {
        this.l = component;
    }
}

