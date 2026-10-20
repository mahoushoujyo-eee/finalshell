/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DN;
import com.EJ;
import com.FN;
import com.GR;
import com.NE;
import com.O_;
import com.PM;
import com.PT;
import com.WF;
import com.aL;
import com.ac_0;
import com.bm_0;
import com.c8_0;
import com.cs_0;
import com.ky_2;
import com.lh_1;
import com.on_0;
import com.wb_2;
import com.wc_0;
import com.xw_0;
import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.AbstractButton;
import javax.swing.JComponent;

/*
 * Renamed from com.w6
 */
public class w6_0 {
    protected static final c8_0 Z;
    protected static final on_0 l;
    protected static final Object Y;
    protected static boolean y;
    protected static boolean G;
    protected static Map z;
    protected static List R;
    protected static Map q;
    protected static boolean L;
    private static final String[] a;
    private static final String[] b;
    private static final long c;

    public static synchronized void U() {
        block3: {
            boolean bl;
            block2: {
                String[] stringArray = GR.I();
                bl = L;
                if (stringArray == null) break block2;
                if (bl) break block3;
                bl = true;
            }
            L = bl;
            PM.m(cs_0.class);
            Toolkit.getDefaultToolkit().addAWTEventListener(new bm_0(), c);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected static Map b() {
        var1 = w6_0.Y;
        synchronized (var1) {
            var0_1 = GR.I();
            var2_2 = new HashMap<JComponent, ArrayList>(w6_0.z.size());
            for (Map.Entry<K, V> var4_4 : w6_0.z.entrySet()) {
                block10: {
                    block11: {
                        var5_5 = (JComponent)var4_4.getKey();
                        v0 /* !! */  = var6_6 = (WeakReference)var4_4.getValue();
                        if (var0_1 == null) ** GOTO lbl12
                        if (v0 /* !! */  != null) {
                            v0 /* !! */  = var6_6.get();
lbl12:
                            // 2 sources

                            v1 = (List)v0 /* !! */ ;
                        } else {
                            v1 = var7_7 = null;
                        }
                        if (var5_5 == null) break block10;
                        v2 = var7_7;
                        if (var0_1 == null) break block11;
                        if (v2 == null) break block10;
                        v2 = var7_7;
                    }
                    if (var0_1 != null && !v2.isEmpty()) {
                        v2 = var2_2.put(var5_5, aL.J((Collection)var7_7));
                    }
                }
                if (var0_1 != null) continue;
            }
            return var2_2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected static Map Q() {
        var1 = w6_0.Y;
        synchronized (var1) {
            var0_1 = GR.I();
            var2_2 = new HashMap<JComponent, List>(w6_0.q.size());
            for (Map.Entry<K, V> var4_4 : w6_0.q.entrySet()) {
                block10: {
                    block11: {
                        var5_5 = (JComponent)var4_4.getKey();
                        v0 /* !! */  = var6_6 = (WeakReference)var4_4.getValue();
                        if (var0_1 == null) ** GOTO lbl12
                        if (v0 /* !! */  != null) {
                            v0 /* !! */  = var6_6.get();
lbl12:
                            // 2 sources

                            v1 = (List)v0 /* !! */ ;
                        } else {
                            v1 = var7_7 = null;
                        }
                        if (var5_5 == null) break block10;
                        v2 = var7_7;
                        if (var0_1 == null) break block11;
                        if (v2 == null) break block10;
                        v2 = var7_7;
                    }
                    if (var0_1 != null && !v2.isEmpty()) {
                        v2 = var2_2.put(var5_5, var7_7);
                    }
                }
                if (var0_1 != null) continue;
            }
            return var2_2;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected static boolean g(KeyEvent var0) {
        var2_1 = FN.k(var0).hashCode();
        var3_2 = w6_0.R.iterator();
        var1_3 = GR.I();
        while (var3_2.hasNext()) {
            block9: {
                block8: {
                    var4_4 = (DN)var3_2.next();
                    v0 = var4_4.x().hashCode();
                    if (var1_3 == null) ** GOTO lbl18
                    if (var1_3 == null) break block8;
                    if (v0 != var2_1) break block9;
                    v1 = true;
                }
                return v1;
            }
            if (var1_3 != null) continue;
        }
        var3_2 = w6_0.b().entrySet().iterator();
        block1: while (true) {
            v0 = var3_2.hasNext();
            block2: while (v0 != 0) {
                var4_4 = (Map.Entry)var3_2.next();
                for (DN var6_6 : (List)var4_4.getValue()) {
                    block11: {
                        block10: {
                            v0 = var6_6.x().hashCode();
                            if (var1_3 == null) continue block2;
                            if (var1_3 == null) break block10;
                            if (v0 != var2_1) break block11;
                            v2 = true;
                        }
                        return v2;
                    }
                    if (var1_3 != null) continue;
                }
                if (var1_3 != null) continue block1;
            }
            break;
        }
        return false;
    }

    protected static void m(KeyEvent keyEvent) {
        Object object;
        String[] stringArray;
        Iterator<Object> iterator;
        block4: {
            Map map = w6_0.b();
            iterator = R.iterator();
            stringArray = GR.I();
            while (iterator.hasNext()) {
                object = (DN)iterator.next();
                w6_0.a(keyEvent, (DN)object);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block4;
            }
            iterator = map.entrySet().iterator();
        }
        block1: while (iterator.hasNext()) {
            object = (Map.Entry)iterator.next();
            for (DN dN : (List)object.getValue()) {
                w6_0.a(keyEvent, dN);
                if (stringArray == null) continue block1;
                if (stringArray != null) continue;
            }
            if (stringArray != null) continue;
        }
    }

    protected static void a(KeyEvent keyEvent, DN dN) {
        block8: {
            boolean bl;
            String[] stringArray;
            JComponent jComponent;
            block12: {
                DN dN2;
                block11: {
                    boolean bl2;
                    block10: {
                        JComponent jComponent2;
                        Component component;
                        block5: {
                            block6: {
                                wc_0 wc_02;
                                block9: {
                                    DN dN3;
                                    block7: {
                                        jComponent = dN.j();
                                        stringArray = GR.I();
                                        component = jComponent;
                                        if (stringArray == null) break block5;
                                        if (component != null) break block6;
                                        dN3 = dN;
                                        if (stringArray == null) break block7;
                                        if (!dN3.x().J(keyEvent)) break block8;
                                        dN3 = dN;
                                    }
                                    wc_02 = dN3.t();
                                    if (stringArray == null) break block9;
                                    if (wc_02 == null) break block8;
                                    wc_02 = dN.t();
                                }
                                FN.J(wc_02, keyEvent);
                                if (stringArray != null) break block8;
                            }
                            component = dN.R();
                        }
                        Container container = jComponent2 = component;
                        if (stringArray != null) {
                            container = container != null ? jComponent2 : FN.L(jComponent);
                        }
                        jComponent2 = container;
                        bl2 = FN.l((Component)jComponent2);
                        if (stringArray == null) break block10;
                        if (!bl2) break block8;
                        dN2 = dN;
                        if (stringArray == null) break block11;
                        bl2 = dN2.x().J(keyEvent);
                    }
                    if (!bl2) break block8;
                    dN2 = dN;
                }
                if (dN2.t() == null) break block8;
                bl = w6_0.L(jComponent);
                if (stringArray == null) break block12;
                if (!bl) break block8;
                bl = G;
            }
            if (stringArray != null && bl) {
                bl = ((Component)jComponent).requestFocusInWindow();
            }
            FN.J(dN.t(), keyEvent);
        }
    }

    protected static boolean L(Component component) {
        boolean bl;
        block7: {
            Iterator iterator = w6_0.Q().entrySet().iterator();
            String[] stringArray = GR.I();
            block0: while (true) {
                boolean bl2 = iterator.hasNext();
                block1: while (bl2) {
                    Map.Entry entry = iterator.next();
                    JComponent jComponent = (JComponent)entry.getKey();
                    if (stringArray != null) {
                        bl = jComponent.isAncestorOf(component);
                        if (stringArray == null) break block7;
                        if (!bl) continue block0;
                        jComponent = entry.getValue();
                    }
                    for (PT pT : (List)((Object)jComponent)) {
                        block9: {
                            boolean bl3;
                            block8: {
                                bl2 = pT.d(component);
                                if (stringArray == null) continue block1;
                                if (stringArray == null) break block8;
                                if (bl2) break block9;
                                bl3 = false;
                            }
                            return bl3;
                        }
                        if (stringArray != null) continue;
                    }
                    if (stringArray != null) continue block0;
                }
                break;
            }
            bl = true;
        }
        return bl;
    }

    public static DN I(cs_0 cs_02, wc_0 wc_02) {
        DN dN = new DN();
        dN.s(true);
        dN.M(cs_02);
        dN.v(wc_02);
        w6_0.c(dN);
        return dN;
    }

    public static DN v(JComponent jComponent, cs_0 cs_02, wc_0 wc_02) {
        return w6_0.H(null, jComponent, cs_02, wc_02);
    }

    public static DN n(JComponent jComponent, cs_0 cs_02, wc_0 wc_02, boolean bl) {
        return w6_0.h(null, jComponent, cs_02, wc_02, bl);
    }

    public static DN H(Component component, JComponent jComponent, cs_0 cs_02, wc_0 wc_02) {
        return w6_0.h(component, jComponent, cs_02, wc_02, false);
    }

    public static DN r(Component component, JComponent jComponent, cs_0 cs_02, wc_0 wc_02, WF wF) {
        return w6_0.k(component, jComponent, cs_02, wc_02, false, wF);
    }

    public static DN h(Component component, JComponent jComponent, cs_0 cs_02, wc_0 wc_02, boolean bl) {
        return w6_0.k(component, jComponent, cs_02, wc_02, bl, null);
    }

    public static DN k(Component component, JComponent jComponent, cs_0 cs_02, wc_0 wc_02, boolean bl, WF wF) {
        DN dN = new DN();
        String[] stringArray = GR.I();
        dN.s(bl);
        dN.p(component);
        dN.u(jComponent);
        dN.M(cs_02);
        String[] stringArray2 = stringArray;
        dN.T(wF);
        dN.v(wc_02);
        w6_0.c(dN);
        if (stringArray2 == null) {
            ky_2.K(new String[3]);
        }
        return dN;
    }

    public static DN R(AbstractButton abstractButton, cs_0 cs_02) {
        return w6_0.k(null, abstractButton, cs_02);
    }

    public static DN T(AbstractButton abstractButton, cs_0 cs_02, boolean bl) {
        return w6_0.R(null, abstractButton, cs_02, bl);
    }

    public static DN y(AbstractButton abstractButton, cs_0 cs_02, WF wF) {
        return w6_0.V(null, abstractButton, cs_02, wF);
    }

    public static DN k(Component component, AbstractButton abstractButton, cs_0 cs_02) {
        return w6_0.R(component, abstractButton, cs_02, false);
    }

    public static DN V(Component component, AbstractButton abstractButton, cs_0 cs_02, WF wF) {
        return w6_0.k(component, abstractButton, cs_02, w6_0.F(abstractButton), false, wF);
    }

    public static DN R(Component component, AbstractButton abstractButton, cs_0 cs_02, boolean bl) {
        return w6_0.k(component, abstractButton, cs_02, w6_0.F(abstractButton), bl, null);
    }

    protected static wc_0 F(AbstractButton abstractButton) {
        return new wb_2(abstractButton);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void M(JComponent jComponent, WF wF) {
        Object object = Y;
        synchronized (object) {
            String[] stringArray = GR.I();
            List list = w6_0.O(jComponent);
            Object object2 = list;
            if (stringArray == null) return;
            if (object2 != null) {
                for (DN dN : list) {
                    dN.T(wF);
                    if (stringArray == null) return;
                    if (stringArray != null) continue;
                }
            }
            object2 = object;
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void R(JComponent jComponent, PT pT) {
        Object object = Y;
        synchronized (object) {
            String[] stringArray = GR.I();
            ArrayList<PT> arrayList = w6_0.I(jComponent);
            Object object2 = arrayList;
            if (stringArray != null) {
                if (object2 == null) {
                    arrayList = new ArrayList<PT>(1);
                    jComponent.putClientProperty(w6_0.a(-6816, 1474), arrayList);
                    q.put(jComponent, new WeakReference(arrayList));
                }
                arrayList.add(pT);
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void j(JComponent jComponent, PT pT) {
        Object object = Y;
        synchronized (object) {
            String[] stringArray = GR.I();
            List list = w6_0.I(jComponent);
            Object object2 = list;
            if (stringArray != null) {
                if (object2 != null) {
                    list.remove(pT);
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
    public static void k(JComponent jComponent, List list) {
        Object object = Y;
        synchronized (object) {
            String[] stringArray = GR.I();
            List list2 = w6_0.I(jComponent);
            Object object2 = list2;
            if (stringArray != null) {
                if (object2 != null) {
                    list2.removeAll(list);
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
    public static void T(JComponent jComponent) {
        Object object = Y;
        synchronized (object) {
            jComponent.putClientProperty(w6_0.a(-6813, 27566), null);
            q.remove(jComponent);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static List I(JComponent jComponent) {
        Object object = Y;
        synchronized (object) {
            WeakReference weakReference;
            String[] stringArray = GR.I();
            WeakReference weakReference2 = weakReference = (WeakReference)q.get(jComponent);
            if (stringArray != null) {
                if (weakReference2 == null) return null;
                weakReference2 = weakReference.get();
            }
            List list = (List)((Object)weakReference2);
            return list;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static List j(JComponent jComponent) {
        ArrayList arrayList;
        List list;
        Object object = Y;
        // MONITORENTER : object
        String[] stringArray = GR.I();
        List list2 = list = w6_0.I(jComponent);
        if (stringArray != null) {
            if (list2 == null) {
                arrayList = new ArrayList();
                // MONITOREXIT : object
                return arrayList;
            }
            list2 = list;
        }
        arrayList = aL.J((Collection)list2);
        return arrayList;
    }

    public static void n(DN dN) {
        w6_0.A(dN);
    }

    public static void A(JComponent jComponent) {
        w6_0.Z(jComponent);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static void c(DN dN) {
        Object object = Y;
        synchronized (object) {
            block12: {
                Object object2;
                block11: {
                    String[] stringArray;
                    block10: {
                        ArrayList<DN> arrayList;
                        JComponent jComponent;
                        JComponent jComponent2;
                        block9: {
                            stringArray = GR.I();
                            jComponent = jComponent2 = dN.j();
                            if (stringArray == null) break block9;
                            if (jComponent == null) break block10;
                            jComponent = dN.j();
                        }
                        ArrayList<DN> arrayList2 = arrayList = w6_0.O(jComponent);
                        if (stringArray != null) {
                            if (arrayList2 == null) {
                                arrayList = new ArrayList<DN>(1);
                                jComponent2.putClientProperty(w6_0.a(-6814, -10670), arrayList);
                                z.put(jComponent2, new WeakReference(arrayList));
                            }
                            arrayList2 = arrayList;
                        }
                        arrayList2.add(dN);
                        if (stringArray != null) break block11;
                    }
                    object2 = R;
                    if (stringArray == null) break block12;
                    if (!object2.contains(dN)) {
                        R.add(dN);
                    }
                }
                object2 = object;
            }
            // ** MonitorExit[v2] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static void A(DN dN) {
        String[] stringArray = GR.I();
        Object object = dN;
        if (stringArray != null) {
            if (object == null) return;
            object = Y;
        }
        DN dN2 = object;
        synchronized (object) {
            block10: {
                block12: {
                    List list;
                    block11: {
                        List list2;
                        JComponent jComponent;
                        block9: {
                            JComponent jComponent2;
                            jComponent = jComponent2 = dN.j();
                            if (stringArray == null) break block9;
                            if (jComponent == null) break block10;
                            jComponent = jComponent2;
                        }
                        list = list2 = w6_0.O(jComponent);
                        if (stringArray == null) break block11;
                        if (list == null) break block12;
                        list = list2;
                    }
                    list.remove(dN);
                }
                if (stringArray != null) return;
            }
            R.remove(dN);
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static void j(List list) {
        String[] stringArray = GR.I();
        Object object = list;
        if (stringArray != null) {
            if (object == null) return;
            object = list;
        }
        if (stringArray != null) {
            if (object.isEmpty()) return;
            object = Y;
        }
        List list2 = object;
        synchronized (object) {
            for (DN dN : list) {
                w6_0.A(dN);
                if (stringArray == null) return;
                if (stringArray != null) continue;
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static void Z(JComponent jComponent) {
        Object object = Y;
        synchronized (object) {
            jComponent.putClientProperty(w6_0.a(-6810, 15847), null);
            z.remove(jComponent);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static List O(JComponent jComponent) {
        Object object = Y;
        synchronized (object) {
            WeakReference weakReference;
            String[] stringArray = GR.I();
            WeakReference weakReference2 = weakReference = (WeakReference)z.get(jComponent);
            if (stringArray != null) {
                if (weakReference2 == null) return null;
                weakReference2 = weakReference.get();
            }
            List list = (List)((Object)weakReference2);
            return list;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static List g(JComponent jComponent) {
        ArrayList arrayList;
        List list;
        Object object = Y;
        // MONITORENTER : object
        String[] stringArray = GR.I();
        List list2 = list = w6_0.O(jComponent);
        if (stringArray != null) {
            if (list2 == null) {
                arrayList = new ArrayList();
                // MONITOREXIT : object
                return arrayList;
            }
            list2 = list;
        }
        arrayList = aL.J((Collection)list2);
        return arrayList;
    }

    public static void x() {
        ac_0.q();
        Window[] windowArray = Window.getWindows();
        String[] stringArray = GR.I();
        for (Window window : windowArray) {
            w6_0.u(window);
            if (stringArray != null) continue;
        }
    }

    public static void g(Component component) {
        ac_0.q();
        w6_0.u(FN.L(component));
    }

    protected static void u(Window window) {
        LinkedHashSet<JComponent> linkedHashSet = new LinkedHashSet<JComponent>();
        String[] stringArray = GR.I();
        Iterator iterator = w6_0.b().entrySet().iterator();
        block0: while (true) {
            boolean bl = iterator.hasNext();
            block1: while (bl) {
                Map.Entry entry = iterator.next();
                Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) {
                    block8: {
                        JComponent jComponent;
                        JComponent jComponent2;
                        DN dN;
                        block11: {
                            boolean bl2;
                            block10: {
                                block9: {
                                    DN dN2;
                                    block7: {
                                        dN2 = dN = (DN)iterator2.next();
                                        if (stringArray == null) break block7;
                                        bl = dN2.o();
                                        if (stringArray == null) continue block1;
                                        if (bl) break block8;
                                        dN2 = dN;
                                    }
                                    if ((jComponent2 = dN2.j()) == null) break block8;
                                    bl2 = linkedHashSet.contains(jComponent2);
                                    if (stringArray == null) break block9;
                                    if (bl2) break block8;
                                    bl2 = jComponent2.isVisible();
                                }
                                if (stringArray == null) break block10;
                                if (!bl2) break block8;
                                jComponent = jComponent2;
                                if (stringArray == null) break block11;
                                bl2 = jComponent.isShowing();
                            }
                            if (!bl2) break block8;
                            jComponent = jComponent2;
                        }
                        if (FN.L(jComponent) == window) {
                            O_ o_ = new O_(w6_0.S(jComponent2));
                            o_.S(w6_0.a(-6809, -9940));
                            o_.A();
                            ac_0.e(jComponent2, null, o_, dN.O());
                            linkedHashSet.add(jComponent2);
                        }
                    }
                    if (stringArray != null) continue;
                }
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    public static void h(JComponent jComponent) {
        w6_0.x(jComponent, GR.rC);
    }

    public static void x(JComponent jComponent, cs_0 cs_02) {
        w6_0.h(jComponent, jComponent, cs_02, new EJ(jComponent), true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String S(JComponent jComponent) {
        Object object = Y;
        synchronized (object) {
            List list = w6_0.O(jComponent);
            return NE.y(list, w6_0.a(-6815, 10429), Z, l);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void u() {
        Object object = Y;
        synchronized (object) {
            y = false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void T() {
        Object object = Y;
        synchronized (object) {
            y = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean Z() {
        Object object = Y;
        synchronized (object) {
            return G;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void y(boolean bl) {
        Object object = Y;
        synchronized (object) {
            G = bl;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[6];
                    var5_1 = 0;
                    var4_2 = "\u00d1=,\u00f8\u00dc[\u009b\u001a\u0080\u00c64.\u0016:\u000fQ\u00bes\u00933N`\u00af\\\u00f9,\u00a8\u0019\u00bd\u00d5\u008c\r(\u0089<\u0016Yt=\u00d1\u00fe~\u0082\u00f3V\u0018\u009a\u000f\u00f4v\u0002f\u00b6\u00f7aG\u0004\u00d1\u0002\u00dd\u0013";
                    var6_3 = "\u00d1=,\u00f8\u00dc[\u009b\u001a\u0080\u00c64.\u0016:\u000fQ\u00bes\u00933N`\u00af\\\u00f9,\u00a8\u0019\u00bd\u00d5\u008c\r(\u0089<\u0016Yt=\u00d1\u00fe~\u0082\u00f3V\u0018\u009a\u000f\u00f4v\u0002f\u00b6\u00f7aG\u0004\u00d1\u0002\u00dd\u0013".length();
                    var3_4 = 12;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 112;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "n|\u000f\u0004l\u0010Y\u00a7\f\u00a5q\u0096\u001b\t%\u008ei\u00b1U\u00f7\u00c3O>e#\u00cb\u0080\u00cdP\u008dyJ_X\u00d2g`\r6\f";
                        var6_3 = "n|\u000f\u0004l\u0010Y\u00a7\f\u00a5q\u0096\u001b\t%\u008ei\u00b1U\u00f7\u00c3O>e#\u00cb\u0080\u00cdP\u008dyJ_X\u00d2g`\r6\f".length();
                        var3_4 = 12;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 102;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 114;
                                break;
                            }
                            case 1: {
                                v15 = 29;
                                break;
                            }
                            case 2: {
                                v15 = 55;
                                break;
                            }
                            case 3: {
                                v15 = 107;
                                break;
                            }
                            case 4: {
                                v15 = 94;
                                break;
                            }
                            case 5: {
                                v15 = 40;
                                break;
                            }
                            default: {
                                v15 = 15;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl85:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var8_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl95:
                    // 1 sources

                    ** continue;
                }
            }
            w6_0.a = var7;
            w6_0.b = new String[6];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5040563740230392903L;
        ** while (true)
        w6_0.c = 5040563740230392911L ^ var0_7;
        w6_0.Z = new lh_1();
        w6_0.l = new xw_0();
        w6_0.Y = new Object();
        w6_0.y = true;
        w6_0.G = false;
        w6_0.z = new WeakHashMap<K, V>();
        w6_0.R = new ArrayList<E>(2);
        w6_0.q = new WeakHashMap<K, V>();
        w6_0.L = false;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE562) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 170;
                    break;
                }
                case 1: {
                    n14 = 16;
                    break;
                }
                case 2: {
                    n14 = 152;
                    break;
                }
                case 3: {
                    n14 = 246;
                    break;
                }
                case 4: {
                    n14 = 103;
                    break;
                }
                case 5: {
                    n14 = 54;
                    break;
                }
                case 6: {
                    n14 = 38;
                    break;
                }
                case 7: {
                    n14 = 239;
                    break;
                }
                case 8: {
                    n14 = 211;
                    break;
                }
                case 9: {
                    n14 = 34;
                    break;
                }
                case 10: {
                    n14 = 55;
                    break;
                }
                case 11: {
                    n14 = 229;
                    break;
                }
                case 12: {
                    n14 = 12;
                    break;
                }
                case 13: {
                    n14 = 49;
                    break;
                }
                case 14: {
                    n14 = 187;
                    break;
                }
                case 15: {
                    n14 = 23;
                    break;
                }
                case 16: {
                    n14 = 237;
                    break;
                }
                case 17: {
                    n14 = 74;
                    break;
                }
                case 18: {
                    n14 = 2;
                    break;
                }
                case 19: {
                    n14 = 3;
                    break;
                }
                case 20: {
                    n14 = 126;
                    break;
                }
                case 21: {
                    n14 = 6;
                    break;
                }
                case 22: {
                    n14 = 7;
                    break;
                }
                case 23: {
                    n14 = 119;
                    break;
                }
                case 24: {
                    n14 = 4;
                    break;
                }
                case 25: {
                    n14 = 64;
                    break;
                }
                case 26: {
                    n14 = 241;
                    break;
                }
                case 27: {
                    n14 = 110;
                    break;
                }
                case 28: {
                    n14 = 240;
                    break;
                }
                case 29: {
                    n14 = 174;
                    break;
                }
                case 30: {
                    n14 = 58;
                    break;
                }
                case 31: {
                    n14 = 220;
                    break;
                }
                case 32: {
                    n14 = 80;
                    break;
                }
                case 33: {
                    n14 = 28;
                    break;
                }
                case 34: {
                    n14 = 62;
                    break;
                }
                case 35: {
                    n14 = 116;
                    break;
                }
                case 36: {
                    n14 = 61;
                    break;
                }
                case 37: {
                    n14 = 242;
                    break;
                }
                case 38: {
                    n14 = 209;
                    break;
                }
                case 39: {
                    n14 = 144;
                    break;
                }
                case 40: {
                    n14 = 199;
                    break;
                }
                case 41: {
                    n14 = 121;
                    break;
                }
                case 42: {
                    n14 = 10;
                    break;
                }
                case 43: {
                    n14 = 193;
                    break;
                }
                case 44: {
                    n14 = 15;
                    break;
                }
                case 45: {
                    n14 = 77;
                    break;
                }
                case 46: {
                    n14 = 98;
                    break;
                }
                case 47: {
                    n14 = 146;
                    break;
                }
                case 48: {
                    n14 = 114;
                    break;
                }
                case 49: {
                    n14 = 11;
                    break;
                }
                case 50: {
                    n14 = 191;
                    break;
                }
                case 51: {
                    n14 = 231;
                    break;
                }
                case 52: {
                    n14 = 57;
                    break;
                }
                case 53: {
                    n14 = 105;
                    break;
                }
                case 54: {
                    n14 = 250;
                    break;
                }
                case 55: {
                    n14 = 253;
                    break;
                }
                case 56: {
                    n14 = 94;
                    break;
                }
                case 57: {
                    n14 = 249;
                    break;
                }
                case 58: {
                    n14 = 32;
                    break;
                }
                case 59: {
                    n14 = 133;
                    break;
                }
                case 60: {
                    n14 = 141;
                    break;
                }
                case 61: {
                    n14 = 0;
                    break;
                }
                case 62: {
                    n14 = 120;
                    break;
                }
                case 63: {
                    n14 = 128;
                    break;
                }
                case 64: {
                    n14 = 185;
                    break;
                }
                case 65: {
                    n14 = 46;
                    break;
                }
                case 66: {
                    n14 = 33;
                    break;
                }
                case 67: {
                    n14 = 122;
                    break;
                }
                case 68: {
                    n14 = 88;
                    break;
                }
                case 69: {
                    n14 = 70;
                    break;
                }
                case 70: {
                    n14 = 218;
                    break;
                }
                case 71: {
                    n14 = 93;
                    break;
                }
                case 72: {
                    n14 = 142;
                    break;
                }
                case 73: {
                    n14 = 147;
                    break;
                }
                case 74: {
                    n14 = 35;
                    break;
                }
                case 75: {
                    n14 = 140;
                    break;
                }
                case 76: {
                    n14 = 108;
                    break;
                }
                case 77: {
                    n14 = 162;
                    break;
                }
                case 78: {
                    n14 = 96;
                    break;
                }
                case 79: {
                    n14 = 221;
                    break;
                }
                case 80: {
                    n14 = 22;
                    break;
                }
                case 81: {
                    n14 = 136;
                    break;
                }
                case 82: {
                    n14 = 75;
                    break;
                }
                case 83: {
                    n14 = 47;
                    break;
                }
                case 84: {
                    n14 = 137;
                    break;
                }
                case 85: {
                    n14 = 89;
                    break;
                }
                case 86: {
                    n14 = 19;
                    break;
                }
                case 87: {
                    n14 = 171;
                    break;
                }
                case 88: {
                    n14 = 200;
                    break;
                }
                case 89: {
                    n14 = 188;
                    break;
                }
                case 90: {
                    n14 = 225;
                    break;
                }
                case 91: {
                    n14 = 143;
                    break;
                }
                case 92: {
                    n14 = 254;
                    break;
                }
                case 93: {
                    n14 = 217;
                    break;
                }
                case 94: {
                    n14 = 232;
                    break;
                }
                case 95: {
                    n14 = 130;
                    break;
                }
                case 96: {
                    n14 = 82;
                    break;
                }
                case 97: {
                    n14 = 100;
                    break;
                }
                case 98: {
                    n14 = 158;
                    break;
                }
                case 99: {
                    n14 = 224;
                    break;
                }
                case 100: {
                    n14 = 244;
                    break;
                }
                case 101: {
                    n14 = 92;
                    break;
                }
                case 102: {
                    n14 = 85;
                    break;
                }
                case 103: {
                    n14 = 161;
                    break;
                }
                case 104: {
                    n14 = 109;
                    break;
                }
                case 105: {
                    n14 = 210;
                    break;
                }
                case 106: {
                    n14 = 182;
                    break;
                }
                case 107: {
                    n14 = 41;
                    break;
                }
                case 108: {
                    n14 = 1;
                    break;
                }
                case 109: {
                    n14 = 78;
                    break;
                }
                case 110: {
                    n14 = 71;
                    break;
                }
                case 111: {
                    n14 = 21;
                    break;
                }
                case 112: {
                    n14 = 251;
                    break;
                }
                case 113: {
                    n14 = 56;
                    break;
                }
                case 114: {
                    n14 = 203;
                    break;
                }
                case 115: {
                    n14 = 201;
                    break;
                }
                case 116: {
                    n14 = 208;
                    break;
                }
                case 117: {
                    n14 = 234;
                    break;
                }
                case 118: {
                    n14 = 101;
                    break;
                }
                case 119: {
                    n14 = 53;
                    break;
                }
                case 120: {
                    n14 = 153;
                    break;
                }
                case 121: {
                    n14 = 14;
                    break;
                }
                case 122: {
                    n14 = 213;
                    break;
                }
                case 123: {
                    n14 = 69;
                    break;
                }
                case 124: {
                    n14 = 180;
                    break;
                }
                case 125: {
                    n14 = 194;
                    break;
                }
                case 126: {
                    n14 = 135;
                    break;
                }
                case 127: {
                    n14 = 102;
                    break;
                }
                case 128: {
                    n14 = 59;
                    break;
                }
                case 129: {
                    n14 = 79;
                    break;
                }
                case 130: {
                    n14 = 37;
                    break;
                }
                case 131: {
                    n14 = 65;
                    break;
                }
                case 132: {
                    n14 = 17;
                    break;
                }
                case 133: {
                    n14 = 243;
                    break;
                }
                case 134: {
                    n14 = 154;
                    break;
                }
                case 135: {
                    n14 = 192;
                    break;
                }
                case 136: {
                    n14 = 132;
                    break;
                }
                case 137: {
                    n14 = 107;
                    break;
                }
                case 138: {
                    n14 = 66;
                    break;
                }
                case 139: {
                    n14 = 160;
                    break;
                }
                case 140: {
                    n14 = 52;
                    break;
                }
                case 141: {
                    n14 = 156;
                    break;
                }
                case 142: {
                    n14 = 195;
                    break;
                }
                case 143: {
                    n14 = 207;
                    break;
                }
                case 144: {
                    n14 = 115;
                    break;
                }
                case 145: {
                    n14 = 222;
                    break;
                }
                case 146: {
                    n14 = 48;
                    break;
                }
                case 147: {
                    n14 = 99;
                    break;
                }
                case 148: {
                    n14 = 149;
                    break;
                }
                case 149: {
                    n14 = 247;
                    break;
                }
                case 150: {
                    n14 = 125;
                    break;
                }
                case 151: {
                    n14 = 81;
                    break;
                }
                case 152: {
                    n14 = 134;
                    break;
                }
                case 153: {
                    n14 = 139;
                    break;
                }
                case 154: {
                    n14 = 9;
                    break;
                }
                case 155: {
                    n14 = 60;
                    break;
                }
                case 156: {
                    n14 = 36;
                    break;
                }
                case 157: {
                    n14 = 44;
                    break;
                }
                case 158: {
                    n14 = 255;
                    break;
                }
                case 159: {
                    n14 = 106;
                    break;
                }
                case 160: {
                    n14 = 198;
                    break;
                }
                case 161: {
                    n14 = 124;
                    break;
                }
                case 162: {
                    n14 = 118;
                    break;
                }
                case 163: {
                    n14 = 163;
                    break;
                }
                case 164: {
                    n14 = 219;
                    break;
                }
                case 165: {
                    n14 = 236;
                    break;
                }
                case 166: {
                    n14 = 155;
                    break;
                }
                case 167: {
                    n14 = 24;
                    break;
                }
                case 168: {
                    n14 = 197;
                    break;
                }
                case 169: {
                    n14 = 5;
                    break;
                }
                case 170: {
                    n14 = 216;
                    break;
                }
                case 171: {
                    n14 = 129;
                    break;
                }
                case 172: {
                    n14 = 164;
                    break;
                }
                case 173: {
                    n14 = 87;
                    break;
                }
                case 174: {
                    n14 = 138;
                    break;
                }
                case 175: {
                    n14 = 76;
                    break;
                }
                case 176: {
                    n14 = 40;
                    break;
                }
                case 177: {
                    n14 = 39;
                    break;
                }
                case 178: {
                    n14 = 31;
                    break;
                }
                case 179: {
                    n14 = 131;
                    break;
                }
                case 180: {
                    n14 = 169;
                    break;
                }
                case 181: {
                    n14 = 148;
                    break;
                }
                case 182: {
                    n14 = 157;
                    break;
                }
                case 183: {
                    n14 = 204;
                    break;
                }
                case 184: {
                    n14 = 167;
                    break;
                }
                case 185: {
                    n14 = 150;
                    break;
                }
                case 186: {
                    n14 = 112;
                    break;
                }
                case 187: {
                    n14 = 8;
                    break;
                }
                case 188: {
                    n14 = 73;
                    break;
                }
                case 189: {
                    n14 = 196;
                    break;
                }
                case 190: {
                    n14 = 63;
                    break;
                }
                case 191: {
                    n14 = 184;
                    break;
                }
                case 192: {
                    n14 = 83;
                    break;
                }
                case 193: {
                    n14 = 227;
                    break;
                }
                case 194: {
                    n14 = 230;
                    break;
                }
                case 195: {
                    n14 = 235;
                    break;
                }
                case 196: {
                    n14 = 30;
                    break;
                }
                case 197: {
                    n14 = 67;
                    break;
                }
                case 198: {
                    n14 = 145;
                    break;
                }
                case 199: {
                    n14 = 90;
                    break;
                }
                case 200: {
                    n14 = 248;
                    break;
                }
                case 201: {
                    n14 = 25;
                    break;
                }
                case 202: {
                    n14 = 175;
                    break;
                }
                case 203: {
                    n14 = 43;
                    break;
                }
                case 204: {
                    n14 = 166;
                    break;
                }
                case 205: {
                    n14 = 223;
                    break;
                }
                case 206: {
                    n14 = 45;
                    break;
                }
                case 207: {
                    n14 = 20;
                    break;
                }
                case 208: {
                    n14 = 123;
                    break;
                }
                case 209: {
                    n14 = 205;
                    break;
                }
                case 210: {
                    n14 = 68;
                    break;
                }
                case 211: {
                    n14 = 151;
                    break;
                }
                case 212: {
                    n14 = 86;
                    break;
                }
                case 213: {
                    n14 = 26;
                    break;
                }
                case 214: {
                    n14 = 29;
                    break;
                }
                case 215: {
                    n14 = 159;
                    break;
                }
                case 216: {
                    n14 = 18;
                    break;
                }
                case 217: {
                    n14 = 212;
                    break;
                }
                case 218: {
                    n14 = 252;
                    break;
                }
                case 219: {
                    n14 = 176;
                    break;
                }
                case 220: {
                    n14 = 214;
                    break;
                }
                case 221: {
                    n14 = 177;
                    break;
                }
                case 222: {
                    n14 = 127;
                    break;
                }
                case 223: {
                    n14 = 202;
                    break;
                }
                case 224: {
                    n14 = 95;
                    break;
                }
                case 225: {
                    n14 = 168;
                    break;
                }
                case 226: {
                    n14 = 165;
                    break;
                }
                case 227: {
                    n14 = 189;
                    break;
                }
                case 228: {
                    n14 = 72;
                    break;
                }
                case 229: {
                    n14 = 113;
                    break;
                }
                case 230: {
                    n14 = 172;
                    break;
                }
                case 231: {
                    n14 = 117;
                    break;
                }
                case 232: {
                    n14 = 238;
                    break;
                }
                case 233: {
                    n14 = 173;
                    break;
                }
                case 234: {
                    n14 = 215;
                    break;
                }
                case 235: {
                    n14 = 181;
                    break;
                }
                case 236: {
                    n14 = 50;
                    break;
                }
                case 237: {
                    n14 = 226;
                    break;
                }
                case 238: {
                    n14 = 206;
                    break;
                }
                case 239: {
                    n14 = 245;
                    break;
                }
                case 240: {
                    n14 = 183;
                    break;
                }
                case 241: {
                    n14 = 190;
                    break;
                }
                case 242: {
                    n14 = 111;
                    break;
                }
                case 243: {
                    n14 = 51;
                    break;
                }
                case 244: {
                    n14 = 84;
                    break;
                }
                case 245: {
                    n14 = 97;
                    break;
                }
                case 246: {
                    n14 = 27;
                    break;
                }
                case 247: {
                    n14 = 104;
                    break;
                }
                case 248: {
                    n14 = 42;
                    break;
                }
                case 249: {
                    n14 = 178;
                    break;
                }
                case 250: {
                    n14 = 13;
                    break;
                }
                case 251: {
                    n14 = 179;
                    break;
                }
                case 252: {
                    n14 = 233;
                    break;
                }
                case 253: {
                    n14 = 228;
                    break;
                }
                case 254: {
                    n14 = 91;
                    break;
                }
                default: {
                    n14 = 186;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            w6_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

