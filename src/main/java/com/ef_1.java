/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DN;
import com.e1_0;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;

/*
 * Renamed from com.eF
 */
public abstract class ef_1
extends e1_0 {
    private static final Map J = new WeakHashMap();

    protected static void t(JComponent jComponent, DN dN) {
        J.put(jComponent, dN);
    }

    protected static boolean T(JComponent jComponent) {
        return J.containsKey(jComponent);
    }

    protected static DN G(JComponent jComponent) {
        return (DN)J.get(jComponent);
    }
}

