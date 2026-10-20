/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Component;
import java.awt.event.MouseAdapter;

/*
 * Renamed from com.nQ
 */
public class nq_1
extends MouseAdapter {
    public static void S(Component component) {
        nq_1 nq_12 = new nq_1();
        component.addMouseListener(nq_12);
        component.addMouseMotionListener(nq_12);
        component.addMouseWheelListener(nq_12);
    }
}

