/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.WC;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

/*
 * Renamed from com.Wo
 */
public class wo_0
extends WC
implements AncestorListener {
    private JComponent P;

    public wo_0(JComponent jComponent) {
        super(GO.q);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, long l2) {
        super(l2);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, String string, long l2) {
        super(string, l2);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, long l2, long l3) {
        super(l2, l3);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, String string, long l2, long l3) {
        super(string, l2, l3);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, long l2, ActionListener actionListener) {
        super(l2, actionListener);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, String string, long l2, ActionListener actionListener) {
        super(string, l2, actionListener);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, long l2, long l3, ActionListener actionListener) {
        super(l2, l3, actionListener);
        this.M(jComponent);
    }

    public wo_0(JComponent jComponent, String string, long l2, long l3, ActionListener actionListener) {
        super(string, l2, l3, actionListener);
        this.M(jComponent);
    }

    private void M(JComponent jComponent) {
        this.P = jComponent;
        this.O(true);
        jComponent.addAncestorListener(this);
    }

    public void p() {
        this.P.removeAncestorListener(this);
    }

    public Component q() {
        return this.P;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        this.u();
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.Y();
    }

    @Override
    public void ancestorMoved(AncestorEvent ancestorEvent) {
    }

    public static wo_0 G(JComponent jComponent) {
        wo_0.I(jComponent);
        return new wo_0(jComponent);
    }

    public static wo_0 r(JComponent jComponent, long l2) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, l2);
    }

    public static wo_0 s(JComponent jComponent, String string, long l2) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, string, l2);
    }

    public static wo_0 d(JComponent jComponent, long l2, long l3) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, l2, l3);
    }

    public static wo_0 Z(JComponent jComponent, String string, long l2, long l3) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, string, l2, l3);
    }

    public static wo_0 V(JComponent jComponent, long l2, ActionListener actionListener) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, l2, actionListener);
    }

    public static wo_0 H(JComponent jComponent, String string, long l2, ActionListener actionListener) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, string, l2, actionListener);
    }

    public static wo_0 J(JComponent jComponent, long l2, long l3, ActionListener actionListener) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, l2, l3, actionListener);
    }

    public static wo_0 Z(JComponent jComponent, String string, long l2, long l3, ActionListener actionListener) {
        wo_0.I(jComponent);
        return new wo_0(jComponent, string, l2, l3, actionListener);
    }

    public static void I(JComponent jComponent) {
        AncestorListener[] ancestorListenerArray = jComponent.getAncestorListeners();
        int n10 = ancestorListenerArray.length;
        int n11 = 0;
        int[] nArray = WC.V();
        while (n11 < n10) {
            AncestorListener ancestorListener = ancestorListenerArray[n11];
            if (nArray == null) {
                if (ancestorListener instanceof wo_0) {
                    jComponent.removeAncestorListener(ancestorListener);
                }
                ++n11;
            }
            if (nArray == null) continue;
        }
    }

    public static boolean D(JComponent jComponent) {
        boolean bl;
        block4: {
            AncestorListener[] ancestorListenerArray = jComponent.getAncestorListeners();
            int n10 = ancestorListenerArray.length;
            int[] nArray = WC.V();
            int n11 = 0;
            while (n11 < n10) {
                AncestorListener ancestorListener = ancestorListenerArray[n11];
                if (nArray == null) {
                    bl = ancestorListener instanceof wo_0;
                    if (nArray != null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n11;
                }
                if (nArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }
}

