/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CJ;
import com.FN;
import com.QQ;
import com.QS;
import com.T4;
import com.ky_2;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingConstants;

/*
 * Renamed from com.To
 */
public class to_0
extends T4
implements SwingConstants {
    protected final List W = new ArrayList(2);
    protected final Object B = new Object();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void A(Component component, Object object) {
        Object object2 = this.B;
        synchronized (object2) {
            ky_2[] ky_2Array = QQ.N();
            Object object3 = component;
            if (ky_2Array == null) {
                if (object3 instanceof QS) {
                    this.W.add((QS)component);
                }
                object3 = object2;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void F(Component component) {
        Object object = this.B;
        synchronized (object) {
            ky_2[] ky_2Array = QQ.N();
            Object object2 = component;
            if (ky_2Array == null) {
                if (object2 instanceof QS) {
                    this.W.remove(component);
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void layoutContainer(Container container) {
        Object object = this.B;
        synchronized (object) {
            ky_2[] ky_2Array = QQ.N();
            Object object2 = this.W;
            if (ky_2Array == null) {
                if (object2.size() > 0) {
                    Rectangle rectangle = FN.N(container);
                    CJ.O(this.W, rectangle);
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }
}

