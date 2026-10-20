/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aL;
import com.c4_0;
import com.ka_0;
import com.ky_2;
import com.p6_0;
import com.uH;
import com.xp_2;
import java.awt.Component;
import java.awt.Toolkit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class ON {
    protected static final Object A;
    protected static final Map r;
    protected static final Object x;
    protected static final List B;
    protected static WeakReference y;
    protected static WeakReference f;
    protected static boolean I;
    private static final long a;

    public static synchronized void e() {
        block3: {
            boolean bl;
            block2: {
                int[] nArray = c4_0.g();
                bl = I;
                if (nArray != null) break block2;
                if (bl) break block3;
                bl = true;
            }
            I = bl;
            Toolkit.getDefaultToolkit().addAWTEventListener(new uH(), a);
            ON.F(new xp_2());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static Map d() {
        Object object = A;
        synchronized (object) {
            HashMap<Component, HashMap<p6_0, Boolean>> hashMap;
            block6: {
                int[] nArray = c4_0.g();
                HashMap<Component, HashMap<p6_0, Boolean>> hashMap2 = new HashMap<Component, HashMap<p6_0, Boolean>>(r.size());
                for (Map.Entry entry : r.entrySet()) {
                    block7: {
                        Map map = (Map)entry.getValue();
                        hashMap = new HashMap<Component, HashMap<p6_0, Boolean>>(map.size());
                        if (nArray != null) break block6;
                        HashMap<Component, HashMap<p6_0, Boolean>> hashMap3 = hashMap;
                        for (Map.Entry entry2 : map.entrySet()) {
                            hashMap3.put((Component)((Object)((p6_0)entry2.getKey())), (HashMap<p6_0, Boolean>)((Object)((Boolean)entry2.getValue())));
                            if (nArray == null) {
                                if (nArray == null) continue;
                            }
                            break block7;
                        }
                        hashMap2.put((Component)entry.getKey(), hashMap3);
                    }
                    if (nArray == null) continue;
                }
                hashMap = hashMap2;
            }
            return hashMap;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Component b() {
        int[] nArray = c4_0.g();
        WeakReference weakReference = f;
        if (nArray == null) {
            if (weakReference == null) return null;
            weakReference = f.get();
        }
        Component component = (Component)((Object)weakReference);
        return component;
    }

    public static Component z() {
        return (Component)y.get();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void F(ka_0 ka_02) {
        Object object = x;
        synchronized (object) {
            B.add(ka_02);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void x(ka_0 ka_02) {
        Object object = x;
        synchronized (object) {
            B.remove(ka_02);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static void u(Component component, Component component2) {
        ArrayList arrayList;
        int[] nArray;
        Iterator iterator = x;
        synchronized (iterator) {
            nArray = c4_0.g();
            arrayList = aL.J((Collection)B);
        }
        for (ka_0 ka_02 : arrayList) {
            ka_02.N(component, component2);
            if (nArray == null) continue;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(Component component, p6_0 p6_02) {
        Object object = A;
        synchronized (object) {
            int[] nArray = c4_0.g();
            WeakHashMap<p6_0, Boolean> weakHashMap = (WeakHashMap<p6_0, Boolean>)r.get(component);
            Object object2 = weakHashMap;
            if (nArray == null) {
                if (object2 == null) {
                    weakHashMap = new WeakHashMap<p6_0, Boolean>();
                    r.put(component, weakHashMap);
                }
                weakHashMap.put(p6_02, p6_02.h(ON.b(), component));
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            if (nArray != null) {
                ky_2.K(new String[5]);
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void i(p6_0 p6_02) {
        Object object = A;
        synchronized (object) {
            block6: {
                Object object2;
                int[] nArray = c4_0.g();
                Iterator iterator = r.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = iterator.next();
                    Map map = (Map)entry.getValue();
                    map.remove(p6_02);
                    object2 = map;
                    if (nArray == null) {
                        if (object2.size() == 0) {
                            iterator.remove();
                        }
                        if (nArray == null) continue;
                    }
                    break block6;
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void z(Component component) {
        Object object = A;
        synchronized (object) {
            block7: {
                Object object2;
                block8: {
                    int[] nArray = c4_0.g();
                    Map map = (Map)r.get(component);
                    object2 = map;
                    if (nArray != null) break block7;
                    if (object2 == null) break block8;
                    object2 = map;
                    if (nArray != null) break block7;
                    if (object2.size() > 0) {
                        map.clear();
                    }
                }
                r.remove(component);
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3717671776506141743L;
        a = 0x3397D2C89E24DC2BL ^ l2;
        A = new Object();
        r = new WeakHashMap();
        x = new Object();
        B = new ArrayList(2);
        I = false;
    }
}

