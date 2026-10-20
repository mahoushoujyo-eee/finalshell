/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.ScrollPaneLayout;

public class IL
extends ScrollPaneLayout {
    private final JComponent f;

    public IL(JComponent jComponent) {
        this.f = jComponent;
    }

    @Override
    public void layoutContainer(Container container) {
        super.layoutContainer(container);
        this.f.setBounds(new Rectangle(this.viewport.getBounds()));
        container.setComponentZOrder(this.f, 0);
    }
}

