/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.na_1;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/*
 * Renamed from com.an
 */
public abstract class an_0
implements na_1 {
    protected final List i = new ArrayList();
    protected final Map H = new WeakHashMap();
    protected final Object B = new Object();

    public void V(Window window) {
        this.y(window, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void y(Window window, Object object) {
        Object object2 = this.B;
        synchronized (object2) {
            this.i.add(window);
            this.H.put(window, object);
            this.w();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void o(Window window) {
        Object object = this.B;
        synchronized (object) {
            this.i.remove(window);
            this.H.remove(window);
            this.w();
        }
    }
}

