/*
 * Decompiled with CFR 0.152.
 */
package com.apple.eawt;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class CocoaComponent
extends Canvas {
    public abstract int createNSView();

    @Override
    public void update(Graphics graphics) {
    }

    @Override
    public void paint(Graphics graphics) {
    }

    public long createNSViewLong() {
        return 0L;
    }

    public final void sendMessage(int i2, Object o2) {
    }

    @Override
    public abstract Dimension getMaximumSize();

    @Override
    public abstract Dimension getMinimumSize();

    @Override
    public abstract Dimension getPreferredSize();
}

