/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.p6_0;
import java.awt.Component;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from com.c4
 */
public abstract class c4_0
implements p6_0 {
    private boolean e = true;
    private boolean M;
    private List W;
    private static int[] j;

    public c4_0() {
        this(true);
    }

    public c4_0(boolean bl) {
        this.M = bl;
    }

    @Override
    public boolean z() {
        return this.e;
    }

    public void q(boolean bl) {
        this.e = bl;
    }

    @Override
    public boolean h(Component component, Component component2) {
        block13: {
            List list;
            Component component3;
            WeakReference weakReference;
            Iterator iterator;
            int[] nArray;
            block23: {
                block15: {
                    List list2;
                    block18: {
                        block17: {
                            boolean bl;
                            block16: {
                                block14: {
                                    nArray = c4_0.g();
                                    bl = this.d();
                                    if (nArray != null) break block14;
                                    if (!bl) break block15;
                                    bl = FN.a(component2, component);
                                }
                                if (nArray != null) break block16;
                                if (!bl) break block17;
                                bl = true;
                            }
                            return bl;
                        }
                        list2 = this.W;
                        if (nArray != null) break block18;
                        if (list2 == null) break block13;
                        list2 = this.W;
                    }
                    iterator = list2.iterator();
                    while (iterator.hasNext()) {
                        block21: {
                            boolean bl;
                            block22: {
                                Component component4;
                                block19: {
                                    block20: {
                                        weakReference = (WeakReference)iterator.next();
                                        component3 = (Component)weakReference.get();
                                        if (nArray != null) break block13;
                                        component4 = component3;
                                        if (nArray != null) break block19;
                                        if (component4 != null) break block20;
                                        iterator.remove();
                                        if (nArray == null) break block21;
                                    }
                                    component4 = component3;
                                }
                                bl = FN.a(component4, component);
                                if (nArray != null) break block22;
                                if (!bl) break block21;
                                bl = true;
                            }
                            return bl;
                        }
                        if (nArray == null) continue;
                    }
                    if (nArray == null) break block13;
                }
                if (component2 == component) {
                    return true;
                }
                list = this.W;
                if (nArray != null) break block23;
                if (list == null) break block13;
                list = this.W;
            }
            iterator = list.iterator();
            while (iterator.hasNext()) {
                block26: {
                    Component component5;
                    block24: {
                        block25: {
                            weakReference = (WeakReference)iterator.next();
                            component5 = component3 = (Component)weakReference.get();
                            if (nArray != null) break block24;
                            if (component5 != null) break block25;
                            iterator.remove();
                            if (nArray == null) break block26;
                        }
                        component5 = component3;
                    }
                    if (component5 == component) {
                        return true;
                    }
                }
                if (nArray == null) continue;
            }
        }
        return false;
    }

    public boolean d() {
        return this.M;
    }

    public void R(boolean bl) {
        this.M = bl;
    }

    public List t() {
        ArrayList<Component> arrayList = new ArrayList<Component>(this.W.size());
        Iterator iterator = this.W.iterator();
        int[] nArray = c4_0.g();
        while (iterator.hasNext()) {
            block5: {
                Component component;
                block4: {
                    block3: {
                        WeakReference weakReference = (WeakReference)iterator.next();
                        component = (Component)weakReference.get();
                        if (nArray != null) break block3;
                        if (component != null) break block4;
                        iterator.remove();
                    }
                    if (nArray == null) break block5;
                }
                arrayList.add(component);
            }
            if (nArray == null) continue;
        }
        return arrayList;
    }

    public List f() {
        return this.W;
    }

    public void N(List list) {
        Iterator iterator = list.iterator();
        int[] nArray = c4_0.g();
        while (iterator.hasNext()) {
            Component component = (Component)iterator.next();
            this.p(component);
            if (nArray == null) continue;
        }
    }

    public void p(Component component) {
        int[] nArray = c4_0.g();
        List list = this.W;
        if (nArray == null) {
            if (list == null) {
                this.W = new ArrayList(1);
            }
            list = this.W;
        }
        list.add(new WeakReference<Component>(component));
    }

    public void C(Component component) {
        block4: {
            List list;
            int[] nArray;
            block3: {
                nArray = c4_0.g();
                list = this.W;
                if (nArray != null) break block3;
                if (list == null) break block4;
                list = this.W;
            }
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                block7: {
                    block6: {
                        Component component2;
                        block5: {
                            Component component3;
                            WeakReference weakReference = (WeakReference)iterator.next();
                            component2 = component3 = (Component)weakReference.get();
                            if (nArray != null) break block5;
                            if (component2 == null) break block6;
                            component2 = component3;
                        }
                        if (component2 != component) break block7;
                    }
                    iterator.remove();
                }
                if (nArray == null) continue;
            }
        }
    }

    public static void E(int[] nArray) {
        j = nArray;
    }

    public static int[] g() {
        return j;
    }

    static {
        if (c4_0.g() != null) {
            c4_0.E(new int[3]);
        }
    }
}

