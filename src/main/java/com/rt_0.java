/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Rt
 */
public class rt_0
extends ComponentAdapter {
    protected final Window F;
    protected final Window E;
    protected boolean i = true;
    protected Point r;

    public rt_0(Window window, Window window2) {
        this.F = window;
        this.E = window2;
        this.r = window2.getLocation();
    }

    public boolean P() {
        return this.i;
    }

    public void x(boolean bl) {
        this.i = bl;
    }

    public void s() {
        this.r = this.E.getLocation();
    }

    public Window s() {
        return this.F;
    }

    public Window F() {
        return this.E;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.s();
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        block3: {
            Window window;
            block5: {
                int[] nArray;
                block4: {
                    rt_0 rt_02;
                    block2: {
                        nArray = WC.V();
                        rt_02 = this;
                        if (nArray != null) break block2;
                        if (!rt_02.P()) break block3;
                        rt_02 = this;
                    }
                    window = rt_02.F;
                    if (nArray != null) break block4;
                    if (window == null) break block3;
                    window = this.E;
                }
                if (nArray != null) break block5;
                if (window == null) break block3;
                window = this.E;
            }
            Point point = window.getLocation();
            Point point2 = this.F.getLocation();
            this.F.setLocation(point2.x + point.x - this.r.x, point2.y + point.y - this.r.y);
            this.r = point;
        }
    }

    public static rt_0 q(Window window, Window window2) {
        rt_0 rt_02 = new rt_0(window, window2);
        window2.addComponentListener(rt_02);
        return rt_02;
    }

    public static void f(Window window, rt_0 rt_02) {
        window.removeComponentListener(rt_02);
    }
}

