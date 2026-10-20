/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.a9;
import com.ky_2;
import javax.swing.JComponent;
import javax.swing.JViewport;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicViewportUI;

public class WU
extends BasicViewportUI {
    private static int C;

    public static ComponentUI createUI(JComponent jComponent) {
        return new WU();
    }

    @Override
    public void installUI(JComponent jComponent) {
        int n10 = WU.p();
        super.installUI(jComponent);
        int n11 = n10;
        JViewport jViewport = (JViewport)jComponent;
        jViewport.setScrollMode(a9.y());
        FN.Y(jComponent);
        if (n11 == 0) {
            ky_2.K(new String[2]);
        }
    }

    public static void M(int n10) {
        C = n10;
    }

    public static int A() {
        return C;
    }

    public static int p() {
        int n10 = WU.A();
        if (n10 == 0) {
            return 69;
        }
        return 0;
    }

    static {
        if (WU.p() == 0) {
            WU.M(56);
        }
    }
}

