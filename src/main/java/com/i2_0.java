/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.E4;
import com.F7;
import com.G9;
import com.GX;
import com.IJ;
import com.KC;
import com.N7;
import com.PM;
import com.R9;
import com.WF;
import com.XK;
import com.aL;
import com.ax_0;
import com.c;
import com.dm_0;
import com.e7_0;
import com.e8_0;
import com.e9_0;
import com.ed_2;
import com.ee_1;
import com.ef_2;
import com.ei_2;
import com.en_2;
import com.ey_2;
import com.ky_2;
import com.ld_2;
import com.no_2;
import com.oj_2;
import com.rt_1;
import com.ss_0;
import com.wp_0;
import com.yb_0;
import com.yw_1;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.event.AncestorListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.i2
 */
public class i2_0
implements ss_0 {
    public static final ImageIcon t;
    protected static final Object Y;
    protected static final List w;
    protected static String j;
    protected static String E;
    protected static GX K;
    protected static final Object T;
    protected static final List Z;
    protected static final Map a;
    protected static final Object H;
    protected static final Map c;
    protected static oj_2 P;
    protected static final Map h;
    protected static final List n;
    protected static final Map i;
    protected static final Object S;
    protected static final Map v;
    protected static final Map L;
    protected static final Map p;
    protected static final Map G;
    protected static final Object M;
    protected static final Map R;
    protected static final Object C;
    protected static final yb_0 Q;
    protected static final List q;
    protected static final Map X;
    protected static final Map y;
    protected static final Map x;
    protected static en_2 U;
    protected static boolean l;
    protected static boolean m;
    private static boolean f;
    private static final String[] b;
    private static final String[] d;

    public static synchronized void L() {
        block7: {
            String string;
            boolean bl;
            block6: {
                boolean bl2 = i2_0.K();
                try {
                    try {
                        bl = m;
                        if (!bl2) break block6;
                        if (bl) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    m = true;
                    bl = w.contains(j);
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            try {
                string = bl ? j : i2_0.a(27745, -1977);
            }
            catch (RuntimeException runtimeException) {
                throw i2_0.a(runtimeException);
            }
            E = string;
            i2_0.a();
            P = new oj_2();
            PM.m(oj_2.class);
            PM.m(IJ.class);
            PM.m(R9.class);
            PM.m(G9.class);
            PM.m(N7.class);
            PM.m(wp_0.class);
            PM.m(GX.class);
            PM.m(WF.class);
            i2_0.Z(new ee_1());
            i2_0.Z(new e9_0());
            i2_0.Z(new e8_0());
            i2_0.Z(new ef_2());
            i2_0.Z(new ed_2());
            i2_0.Z(new e7_0());
            i2_0.Z(new ei_2());
            i2_0.Z(new ey_2());
            i2_0.M(new KC());
            i2_0.Z(new XK());
            i2_0.b();
        }
    }

    public static void b() {
        i2_0.u(i2_0.class, i2_0.a(27756, -2505));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static List Q() {
        Object object = Y;
        synchronized (object) {
            return aL.J((Collection)w);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void L(Collection collection) {
        Object object = Y;
        synchronized (object) {
            w.clear();
            w.addAll(collection);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void K(String[] stringArray) {
        Object object = Y;
        synchronized (object) {
            w.clear();
            Collections.addAll(w, stringArray);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void W(String string) {
        Object object = Y;
        synchronized (object) {
            w.add(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void m(String string, oj_2 oj_22) {
        Object object = Y;
        synchronized (object) {
            w.add(string);
            i2_0.Y(oj_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void U(String string) {
        Object object = Y;
        synchronized (object) {
            w.remove(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void z() {
        Object object = Y;
        synchronized (object) {
            w.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static void n(JComponent jComponent, String string, Object[] objectArray) {
        Object object;
        boolean bl;
        block19: {
            block20: {
                block21: {
                    boolean bl2 = i2_0.X();
                    i2_0.L(jComponent);
                    bl = bl2;
                    object = objectArray;
                    if (bl) break block19;
                    if (object == null) break block20;
                    break block21;
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                try {
                    block22: {
                        object = objectArray;
                        if (bl) break block19;
                        break block22;
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                    }
                    if (((Object[])object).length != 0) break block20;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
                objectArray = null;
            }
            object = S;
        }
        Object object2 = object;
        synchronized (object) {
            v.put(jComponent, string);
            Object[] objectArray2 = objectArray;
            if (!bl) {
                try {
                    if (objectArray2 != null) {
                        L.put(jComponent, objectArray);
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
                objectArray2 = object2;
            }
            // ** MonitorExit[v5] (shouldn't be in output)
            i2_0.q(jComponent, string, new Object[0]);
            object2 = S;
            synchronized (object2) {
                WeakReference<JComponent> weakReference = new WeakReference<JComponent>(jComponent);
                F7 f72 = new F7(weakReference);
                jComponent.addAncestorListener(f72);
                G.put(jComponent, f72);
            }
            try {
                if (bl) {
                    ky_2.K(new String[4]);
                }
            }
            catch (RuntimeException runtimeException) {
                throw i2_0.a(runtimeException);
            }
            return;
        }
    }

    public static void Q(JComponent jComponent) {
        block10: {
            JComponent jComponent2;
            boolean bl;
            block9: {
                boolean bl2 = i2_0.K();
                i2_0.s(jComponent);
                bl = bl2;
                try {
                    try {
                        jComponent2 = jComponent;
                        if (!bl) break block9;
                        if (!(jComponent2 instanceof Container)) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    jComponent2 = jComponent;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            Component[] componentArray = jComponent2.getComponents();
            int n10 = componentArray.length;
            int n11 = 0;
            while (n11 < n10) {
                block11: {
                    block12: {
                        Component component = componentArray[n11];
                        try {
                            try {
                                if (!bl) break block11;
                                if (!(component instanceof JComponent)) break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                            i2_0.Q((JComponent)component);
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                    }
                    ++n11;
                }
                if (bl) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    protected static void s(JComponent var0) {
        block11: {
            block12: {
                block10: {
                    var2_1 = i2_0.z(var0);
                    var1_2 = i2_0.X();
                    try {
                        try {
                            v0 = var2_1;
                            if (var1_2) break block10;
                            if (v0 == null) break block11;
                        }
                        catch (RuntimeException v1) {
                            throw i2_0.a(v1);
                        }
                        v0 = (String)i2_0.p.get(var0);
                    }
                    catch (RuntimeException v2) {
                        throw i2_0.a(v2);
                    }
                }
                var3_3 = v0;
                var4_4 = i2_0.Z(var0, var2_1);
                try {
                    v3 = var3_3;
                    if (var1_2) break block12;
                    if (v3 != null) {
                    }
                    ** GOTO lbl30
                }
                catch (RuntimeException v4) {
                    throw i2_0.a(v4);
                }
                v3 = var3_3;
            }
            try {
                if (ax_0.Z(v3, new Object[]{var4_4})) break block11;
lbl30:
                // 2 sources

                i2_0.q(var0, var2_1, new Object[0]);
            }
            catch (RuntimeException v5) {
                throw i2_0.a(v5);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void L(JComponent jComponent) {
        Object object = S;
        synchronized (object) {
            block5: {
                Object object2;
                block6: {
                    boolean bl = i2_0.K();
                    try {
                        object2 = v;
                        if (!bl) break block5;
                        if (!object2.containsKey(jComponent)) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    v.remove(jComponent);
                    L.remove(jComponent);
                    p.remove(jComponent);
                    AncestorListener ancestorListener = (AncestorListener)G.get(jComponent);
                    jComponent.removeAncestorListener(ancestorListener);
                    G.remove(jComponent);
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
    public static boolean Z(JComponent jComponent) {
        Object object = S;
        synchronized (object) {
            return v.containsKey(jComponent);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String z(JComponent jComponent) {
        Object object = S;
        synchronized (object) {
            return (String)v.get(jComponent);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Z(ld_2 ld_22) {
        Object object = C;
        synchronized (object) {
            block6: {
                Object object2;
                boolean bl = i2_0.X();
                Iterator iterator = q.iterator();
                while (iterator.hasNext()) {
                    try {
                        object2 = ld_22.D();
                        if (bl) break block6;
                        if (object2 != ((ld_2)iterator.next()).D()) continue;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    iterator.remove();
                    if (!bl) continue;
                }
                q.add(ld_22);
                y.clear();
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void f(ld_2 ld_22) {
        Object object = C;
        synchronized (object) {
            q.remove(ld_22);
            y.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void g(JComponent jComponent, ld_2 ld_22) {
        Object object = C;
        synchronized (object) {
            jComponent.putClientProperty(i2_0.a(27761, 15944), ld_22);
            X.put(jComponent, new WeakReference<ld_2>(ld_22));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void o(JComponent jComponent) {
        Object object = C;
        synchronized (object) {
            jComponent.putClientProperty(i2_0.a(27759, 22985), null);
            X.remove(jComponent);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ld_2 n(JComponent var0) {
        var2_1 = i2_0.C;
        synchronized (var2_1) {
            block42: {
                block43: {
                    block41: {
                        block39: {
                            block38: {
                                block37: {
                                    block35: {
                                        block36: {
                                            block45: {
                                                block34: {
                                                    block33: {
                                                        var1_2 = i2_0.X();
                                                        var3_3 = (WeakReference)i2_0.X.get(var0);
                                                        v0 /* !! */  = var3_3;
                                                        if (var1_2) break block33;
                                                        try {
                                                            block44: {
                                                                if (v0 /* !! */  == null) break block34;
                                                                break block44;
                                                                catch (RuntimeException v1) {
                                                                    throw i2_0.a(v1);
                                                                }
                                                            }
                                                            v0 /* !! */  = var3_3.get();
                                                        }
                                                        catch (RuntimeException v2) {
                                                            throw i2_0.a(v2);
                                                        }
                                                    }
                                                    v3 = (ld_2)v0 /* !! */ ;
                                                    break block45;
                                                }
                                                v3 = null;
                                            }
                                            var4_4 = v3;
                                            try {
                                                v4 = var4_4;
                                                if (var1_2) break block35;
                                                if (v4 == null) break block36;
                                            }
                                            catch (RuntimeException v5) {
                                                throw i2_0.a(v5);
                                            }
                                            return var4_4;
                                        }
                                        v4 = (ld_2)i2_0.y.get(var0.getClass());
                                    }
                                    var5_5 = v4;
                                    v6 = var5_5;
                                    if (var1_2) break block37;
                                    try {
                                        block46: {
                                            if (v6 == null) break block38;
                                            break block46;
                                            catch (RuntimeException v7) {
                                                throw i2_0.a(v7);
                                            }
                                        }
                                        v6 = var5_5;
                                    }
                                    catch (RuntimeException v8) {
                                        throw i2_0.a(v8);
                                    }
                                }
                                return v6;
                            }
                            var6_6 = new ArrayList<ld_2>();
                            for (ld_2 var8_8 : i2_0.q) {
                                block40: {
                                    block47: {
                                        v9 = (int)var8_8.D().isInstance(var0);
                                        if (var1_2) break block39;
                                        if (var1_2) break block40;
                                        break block47;
                                        catch (RuntimeException v10) {
                                            throw i2_0.a(v10);
                                        }
                                    }
                                    try {
                                        block48: {
                                            if (v9 == 0) break block40;
                                            break block48;
                                            catch (RuntimeException v11) {
                                                throw i2_0.a(v11);
                                            }
                                        }
                                        var6_6.add(var8_8);
                                    }
                                    catch (RuntimeException v12) {
                                        throw i2_0.a(v12);
                                    }
                                }
                                if (!var1_2) continue;
                            }
                            v9 = var6_6.size();
                        }
                        try {
                            v13 = 1;
                            if (var1_2) break block41;
                            if (v9 == v13) {
                            }
                            ** GOTO lbl90
                        }
                        catch (RuntimeException v14) {
                            throw i2_0.a(v14);
                        }
                        var5_5 = (ld_2)var6_6.get(0);
                        if (!var1_2) break block42;
lbl90:
                        // 2 sources

                        try {
                            block49: {
                                v15 /* !! */  = var6_6;
                                if (var1_2) break block43;
                                break block49;
                                catch (RuntimeException v16) {
                                    throw i2_0.a(v16);
                                }
                            }
                            v9 = v15 /* !! */ .size();
                            v13 = 1;
                        }
                        catch (RuntimeException v17) {
                            throw i2_0.a(v17);
                        }
                    }
                    try {
                        if (v9 > v13) {
                            Collections.sort(var6_6, i2_0.Q);
                            v15 /* !! */  = var6_6.get(0);
                        }
                        ** GOTO lbl115
                    }
                    catch (RuntimeException v18) {
                        throw i2_0.a(v18);
                    }
                }
                var5_5 = (ld_2)v15 /* !! */ ;
                try {
                    if (!var1_2) break block42;
lbl115:
                    // 2 sources

                    throw new RuntimeException(i2_0.a(27753, -2506) + var0);
                }
                catch (RuntimeException v19) {
                    throw i2_0.a(v19);
                }
            }
            i2_0.y.put(var0.getClass(), var5_5);
            return var5_5;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void G() {
        Object object = S;
        synchronized (object) {
            boolean bl = i2_0.X();
            for (Map.Entry entry : v.entrySet()) {
                try {
                    i2_0.q((JComponent)entry.getKey(), (String)entry.getValue(), new Object[0]);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static void t(List list) {
        Object object = S;
        synchronized (object) {
            block10: {
                Object object2;
                boolean bl = i2_0.X();
                for (Map.Entry entry : v.entrySet()) {
                    block12: {
                        Object k2;
                        block11: {
                            block13: {
                                object2 = list;
                                if (bl) break block10;
                                if (bl) break block11;
                                break block13;
                                catch (RuntimeException runtimeException) {
                                    throw i2_0.a(runtimeException);
                                }
                            }
                            try {
                                block14: {
                                    if (!object2.contains(entry.getValue())) break block12;
                                    break block14;
                                    catch (RuntimeException runtimeException) {
                                        throw i2_0.a(runtimeException);
                                    }
                                }
                                k2 = entry.getKey();
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                        }
                        i2_0.q((JComponent)k2, (String)entry.getValue(), new Object[0]);
                    }
                    if (!bl) continue;
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    public static void U(JComponent jComponent, Object[] objectArray) {
        String string = (String)v.get(jComponent);
        try {
            if (string != null) {
                i2_0.q(jComponent, string, objectArray);
            }
        }
        catch (RuntimeException runtimeException) {
            throw i2_0.a(runtimeException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static void q(JComponent var0, String var1_1, Object[] var2_2) {
        block23: {
            block25: {
                block24: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block16: {
                                            var3_3 = i2_0.X();
                                            try {
                                                v0 = var2_2;
                                                if (var3_3) break block16;
                                                if (v0 == null) break block17;
                                            }
                                            catch (RuntimeException v1) {
                                                throw i2_0.a(v1);
                                            }
                                            v0 = var2_2;
                                        }
                                        if (v0.length == 0) {
                                            var2_2 = null;
                                        }
                                    }
                                    var4_4 = i2_0.Y(var0, var1_1);
                                    var6_5 = i2_0.S;
                                    synchronized (var6_5) {
                                        block18: {
                                            block26: {
                                                v2 = var2_2;
                                                if (var3_3) break block26;
                                                if (v2 == null) ** GOTO lbl26
                                                i2_0.L.put(var0, var2_2);
                                                var5_6 = var2_2;
                                                try {
                                                    if (!var3_3) break block18;
lbl26:
                                                    // 2 sources

                                                    v2 = (Object[])i2_0.L.get(var0);
                                                }
                                                catch (RuntimeException v3) {
                                                    throw i2_0.a(v3);
                                                }
                                            }
                                            var5_6 = v2;
                                        }
                                    }
                                    var6_5 = i2_0.n(var0);
                                    try {
                                        v4 = var6_5;
                                        if (var3_3) break block19;
                                        if (v4 == null) break block20;
                                    }
                                    catch (RuntimeException v5) {
                                        throw i2_0.a(v5);
                                    }
                                    v4 = var6_5;
                                }
                                v4.L(var0, var1_1, var4_4, i2_0.z(var5_6));
                            }
                            try {
                                v6 = i2_0.U;
                                if (var3_3) break block21;
                                if (v6 == null) break block22;
                            }
                            catch (RuntimeException v7) {
                                throw i2_0.a(v7);
                            }
                            v6 = i2_0.U;
                        }
                        v6.Q(var0, var4_4);
                    }
                    try {
                        try {
                            if (ky_2.F() == null) break block23;
                            if (!var3_3) break block24;
                        }
                        catch (RuntimeException v8) {
                            throw i2_0.a(v8);
                        }
                        v9 = false;
                        break block25;
                    }
                    catch (RuntimeException v10) {
                        throw i2_0.a(v10);
                    }
                }
                v9 = true;
            }
            i2_0.z(v9);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static Object[] z(Object[] var0) {
        block14: {
            block15: {
                block13: {
                    var1_1 = i2_0.K();
                    try {
                        try {
                            v0 = var0;
                            if (!var1_1) break block13;
                            if (v0 == null) break block14;
                        }
                        catch (RuntimeException v1) {
                            throw i2_0.a(v1);
                        }
                        v0 = new Object[var0.length];
                    }
                    catch (RuntimeException v2) {
                        throw i2_0.a(v2);
                    }
                }
                var2_2 = v0;
                for (var3_3 = 0; var3_3 < var0.length; ++var3_3) {
                    block16: {
                        v3 = var0;
                        if (!var1_1) break block15;
                        var4_4 = v3[var3_3];
                        try {
                            v4 = var4_4;
                            if (!var1_1) break block16;
                            if (v4 != null) {
                            }
                            ** GOTO lbl38
                        }
                        catch (RuntimeException v5) {
                            throw i2_0.a(v5);
                        }
                        v4 = var4_4;
                    }
                    try {
                        try {
                            if (v4 instanceof E) {
                                var2_2[var3_3] = ((E)var4_4).J();
                                if (var1_1) continue;
                            }
                        }
                        catch (RuntimeException v6) {
                            throw i2_0.a(v6);
                        }
lbl38:
                        // 2 sources

                        var2_2[var3_3] = var4_4;
                        continue;
                    }
                    catch (RuntimeException v7) {
                        throw i2_0.a(v7);
                    }
                }
                v3 = var2_2;
            }
            return v3;
        }
        return null;
    }

    /*
     * Loose catch block
     */
    public static ImageIcon J(String string) {
        ImageIcon imageIcon;
        block7: {
            String string2;
            Map map;
            block6: {
                boolean bl = i2_0.K();
                map = x;
                string2 = string;
                if (!bl) break block6;
                try {
                    block8: {
                        if (!map.containsKey(string2)) break block7;
                        break block8;
                        catch (Throwable throwable) {
                            throw i2_0.a(throwable);
                        }
                    }
                    map = x;
                    string2 = string;
                }
                catch (Throwable throwable) {
                    throw i2_0.a(throwable);
                }
            }
            return (ImageIcon)map.get(string2);
        }
        try {
            URL uRL = i2_0.class.getResource(i2_0.a(27752, -14385) + string + i2_0.a(27750, 24236));
            imageIcon = new ImageIcon(uRL);
        }
        catch (Throwable throwable) {
            imageIcon = t;
        }
        x.put(string, imageIcon);
        return imageIcon;
    }

    public static ImageIcon W(String string, ImageIcon imageIcon) {
        return x.put(string, imageIcon);
    }

    public static String l(String string) {
        String string2;
        block4: {
            block3: {
                IJ iJ;
                block2: {
                    IJ iJ2 = P.b(string);
                    boolean bl = i2_0.X();
                    try {
                        iJ = iJ2;
                        if (bl) break block2;
                        if (iJ == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    iJ = iJ2;
                }
                string2 = iJ.I();
                break block4;
            }
            string2 = null;
        }
        return string2;
    }

    public static en_2 K() {
        return U;
    }

    public static void M(en_2 en_22) {
        U = en_22;
    }

    public static GX u() {
        return K;
    }

    public static void j(GX gX2) {
        K = gX2;
    }

    public static String U() {
        return j;
    }

    public static void l(String string) {
        j = string;
    }

    public static String X() {
        return E;
    }

    public static boolean w(String string) {
        return E.equals(string);
    }

    /*
     * Unable to fully structure code
     */
    public static void d(String var0) {
        block16: {
            block14: {
                block15: {
                    block13: {
                        var1_1 = i2_0.K();
                        try {
                            try {
                                if (i2_0.m) {
                                    v0 = var0;
                                    if (!var1_1) break block13;
                                }
                                ** GOTO lbl38
                            }
                            catch (RuntimeException v1) {
                                throw i2_0.a(v1);
                            }
                            if (v0 != null) {
                            }
                            ** GOTO lbl25
                        }
                        catch (RuntimeException v2) {
                            throw i2_0.a(v2);
                        }
                        v0 = var0;
                    }
                    try {
                        try {
                            if (!var1_1) break block14;
                            if (!i2_0.w(v0)) break block15;
                        }
                        catch (RuntimeException v3) {
                            throw i2_0.a(v3);
                        }
lbl25:
                        // 2 sources

                        return;
                    }
                    catch (RuntimeException v4) {
                        throw i2_0.a(v4);
                    }
                }
                v0 = i2_0.E;
            }
            var2_2 = v0;
            try {
                i2_0.E = var0;
                i2_0.a();
                i2_0.C();
                i2_0.m(var2_2, var0);
                if (var1_1) break block16;
lbl38:
                // 2 sources

                i2_0.j = var0;
            }
            catch (RuntimeException v5) {
                throw i2_0.a(v5);
            }
        }
    }

    public static void Y() {
        block11: {
            int n10;
            List list;
            block12: {
                int n11;
                int n12;
                block14: {
                    int n13;
                    block15: {
                        block13: {
                            int n14;
                            boolean bl;
                            block10: {
                                bl = i2_0.X();
                                try {
                                    try {
                                        n14 = w.size();
                                        if (bl) break block10;
                                        if (n14 <= 0) break block11;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw i2_0.a(runtimeException);
                                    }
                                    n14 = w.indexOf(i2_0.X());
                                }
                                catch (RuntimeException runtimeException) {
                                    throw i2_0.a(runtimeException);
                                }
                            }
                            n13 = n14;
                            try {
                                try {
                                    try {
                                        list = w;
                                        n10 = n13;
                                        if (bl) break block12;
                                        if (n10 == -1) break block13;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw i2_0.a(runtimeException);
                                    }
                                    n12 = n13;
                                    n11 = w.size() - 1;
                                    if (bl) break block14;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw i2_0.a(runtimeException);
                                }
                                if (n12 != n11) break block15;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                        }
                        n10 = 0;
                        break block12;
                    }
                    n12 = n13;
                    n11 = 1;
                }
                n10 = n12 + n11;
            }
            i2_0.d((String)list.get(n10));
        }
    }

    protected static void a() {
        try {
            if (cy_1.u) {
                Locale.setDefault(i2_0.Z(E));
            }
        }
        catch (RuntimeException runtimeException) {
            throw i2_0.a(runtimeException);
        }
    }

    public static Locale Z(String string) {
        Locale locale;
        block10: {
            block11: {
                boolean bl;
                Locale locale2;
                block8: {
                    locale2 = null;
                    bl = i2_0.K();
                    Locale[] localeArray = Locale.getAvailableLocales();
                    int n10 = localeArray.length;
                    int n11 = 0;
                    while (n11 < n10) {
                        block7: {
                            block9: {
                                Locale locale3 = localeArray[n11];
                                try {
                                    try {
                                        if (!bl) break block7;
                                        locale = locale3;
                                        if (!bl) break block8;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw i2_0.a(runtimeException);
                                    }
                                    if (!locale.getLanguage().equals(string)) break block9;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw i2_0.a(runtimeException);
                                }
                                locale2 = locale3;
                            }
                            ++n11;
                        }
                        if (bl) continue;
                    }
                    locale = locale2;
                }
                try {
                    if (!bl) break block10;
                    if (locale == null) break block11;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
                locale = locale2;
                break block10;
            }
            locale = new Locale(string);
        }
        return locale;
    }

    public static oj_2 Y() {
        return P;
    }

    public static List O() {
        return aL.J((Collection)n);
    }

    public static oj_2 u(Class clazz, String string) {
        String string2;
        block5: {
            String string3;
            Map map;
            block4: {
                string2 = i2_0.S(clazz, string);
                boolean bl = i2_0.X();
                try {
                    try {
                        map = i;
                        string3 = string2;
                        if (bl) break block4;
                        if (!map.containsKey(string3)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    map = i;
                    string3 = string2;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            return (oj_2)map.get(string3);
        }
        return i2_0.k(string2, i2_0.a(clazz, string));
    }

    public static String S(Class clazz, String string) {
        return no_2.O(clazz.getResource(string));
    }

    public static oj_2 a(Class clazz, String string) {
        return i2_0.f(clazz.getResource(string));
    }

    public static oj_2 k(URL uRL) {
        String string;
        block5: {
            String string2;
            Map map;
            block4: {
                string = i2_0.I(uRL);
                boolean bl = i2_0.X();
                try {
                    try {
                        map = i;
                        string2 = string;
                        if (bl) break block4;
                        if (!map.containsKey(string2)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    map = i;
                    string2 = string;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            return (oj_2)map.get(string2);
        }
        return i2_0.k(string, i2_0.f(uRL));
    }

    public static String I(URL uRL) {
        return no_2.O(uRL);
    }

    public static oj_2 f(URL uRL) {
        return (oj_2)PM.s(uRL);
    }

    public static oj_2 x(String string) {
        String string2;
        block5: {
            String string3;
            Map map;
            block4: {
                string2 = i2_0.g(string);
                boolean bl = i2_0.K();
                try {
                    try {
                        map = i;
                        string3 = string2;
                        if (!bl) break block4;
                        if (!map.containsKey(string3)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    map = i;
                    string3 = string2;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            return (oj_2)map.get(string3);
        }
        return i2_0.k(string2, i2_0.K(string));
    }

    public static String g(String string) {
        return string;
    }

    public static oj_2 K(String string) {
        return i2_0.S(new File(string));
    }

    public static oj_2 A(File file) {
        String string;
        block5: {
            String string2;
            Map map;
            block4: {
                string = i2_0.l(file);
                boolean bl = i2_0.K();
                try {
                    try {
                        map = i;
                        string2 = string;
                        if (!bl) break block4;
                        if (!map.containsKey(string2)) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    map = i;
                    string2 = string;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            return (oj_2)map.get(string2);
        }
        return i2_0.k(string, i2_0.S(file));
    }

    public static String l(File file) {
        return file.getAbsolutePath();
    }

    public static oj_2 S(File file) {
        return (oj_2)PM.a(file);
    }

    public static oj_2 Y(oj_2 oj_22) {
        return i2_0.k(null, oj_22);
    }

    public static oj_2 k(String string, oj_2 oj_22) {
        block16: {
            block17: {
                boolean bl;
                block14: {
                    boolean bl2;
                    block15: {
                        block12: {
                            block13: {
                                bl = i2_0.X();
                                try {
                                    try {
                                        bl2 = i.containsKey(string);
                                        if (bl) break block12;
                                        if (!bl2) break block13;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw i2_0.a(runtimeException);
                                    }
                                    return (oj_2)i.get(string);
                                }
                                catch (RuntimeException runtimeException) {
                                    throw i2_0.a(runtimeException);
                                }
                            }
                            bl2 = i2_0.q(oj_22);
                        }
                        try {
                            try {
                                if (bl) break block14;
                                if (!bl2) break block15;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                            i2_0.g(oj_22);
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                    }
                    bl2 = n.add(oj_22);
                }
                try {
                    try {
                        E4.Z(oj_22, P);
                        i2_0.F(oj_22);
                        if (bl) break block16;
                        if (string == null) break block17;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    i.put(string, oj_22);
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            i2_0.K(oj_22);
        }
        return oj_22;
    }

    public static oj_2 X(String string) {
        return i2_0.g(i2_0.B(string));
    }

    public static oj_2 g(oj_2 oj_22) {
        block11: {
            block13: {
                boolean bl;
                block12: {
                    oj_2 oj_23;
                    block10: {
                        bl = i2_0.X();
                        try {
                            oj_23 = oj_22;
                            if (bl) break block10;
                            if (oj_23 == null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        oj_23 = oj_22;
                    }
                    try {
                        boolean bl2;
                        try {
                            bl2 = i2_0.q(oj_23);
                            if (bl) break block12;
                            if (!bl2) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        P.m();
                        bl2 = n.remove(oj_22);
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                rt_1.d(i, oj_22);
                for (oj_2 oj_24 : n) {
                    try {
                        E4.Z(oj_24, P);
                        if (!bl) {
                            if (!bl) continue;
                            break;
                        }
                        break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                i2_0.C();
                i2_0.D(oj_22);
            }
            return oj_22;
        }
        return null;
    }

    public static boolean q(oj_2 oj_22) {
        return i2_0.z(oj_22.o());
    }

    public static boolean z(String string) {
        boolean bl;
        block5: {
            Iterator iterator = n.iterator();
            boolean bl2 = i2_0.K();
            while (iterator.hasNext()) {
                block7: {
                    boolean bl3;
                    block6: {
                        oj_2 oj_22 = (oj_2)iterator.next();
                        try {
                            try {
                                bl = oj_22.o().equals(string);
                                if (!bl2) break block5;
                                if (!bl2) break block6;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                            if (!bl) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        bl3 = true;
                    }
                    return bl3;
                }
                if (bl2) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static oj_2 B(String string) {
        Iterator iterator = n.iterator();
        boolean bl = i2_0.X();
        while (iterator.hasNext()) {
            block6: {
                oj_2 oj_22;
                block5: {
                    oj_2 oj_23 = (oj_2)iterator.next();
                    try {
                        try {
                            oj_22 = oj_23;
                            if (bl) break block5;
                            if (!oj_22.o().equals(string)) break block6;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        oj_22 = oj_23;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                return oj_22;
            }
            if (!bl) continue;
        }
        return null;
    }

    public static void v() {
        P.m();
        n.clear();
        i2_0.g();
        i2_0.y();
    }

    public static List u(String string) {
        return i2_0.n(i2_0.B(string));
    }

    public static List n(oj_2 oj_22) {
        List list;
        block6: {
            oj_2 oj_23;
            block4: {
                block5: {
                    boolean bl = i2_0.K();
                    try {
                        try {
                            oj_23 = oj_22;
                            if (!bl) break block4;
                            if (oj_23 != null) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        list = Collections.EMPTY_LIST;
                        break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                oj_23 = oj_22;
            }
            list = oj_23.G();
        }
        return list;
    }

    public static String O(String string) {
        String string2;
        block4: {
            block3: {
                G9 g92;
                block2: {
                    G9 g93 = i2_0.C(string);
                    boolean bl = i2_0.X();
                    try {
                        g92 = g93;
                        if (bl) break block2;
                        if (g92 == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    g92 = g93;
                }
                string2 = g92.n();
                break block4;
            }
            string2 = string;
        }
        return string2;
    }

    public static String A(String string, Object[] objectArray) {
        String string2 = i2_0.O(string);
        Object[] objectArray2 = i2_0.z(objectArray);
        return String.format(string2, objectArray2);
    }

    public static Character w(String string) {
        Character c2;
        block4: {
            block3: {
                G9 g92;
                block2: {
                    G9 g93 = i2_0.C(string);
                    boolean bl = i2_0.X();
                    try {
                        g92 = g93;
                        if (bl) break block2;
                        if (g92 == null) break block3;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    g92 = g93;
                }
                c2 = g92.C();
                break block4;
            }
            c2 = null;
        }
        return c2;
    }

    public static G9 C(String string) {
        G9 g92;
        block6: {
            block5: {
                Map map;
                block4: {
                    boolean bl = i2_0.K();
                    try {
                        try {
                            map = h;
                            if (!bl) break block4;
                            if (map == null) break block5;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        map = h.get(string);
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                g92 = (G9)((Object)map);
                break block6;
            }
            g92 = null;
        }
        return g92;
    }

    public static G9 r(String string) {
        G9 g92;
        block4: {
            block5: {
                G9 g93 = i2_0.C(string);
                boolean bl = i2_0.K();
                try {
                    try {
                        g92 = g93;
                        if (!bl) break block4;
                        if (g92 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    return g93;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            g92 = new G9(i2_0.X(), string);
        }
        G9 g94 = g92;
        h.put(string, g94);
        return g94;
    }

    public static boolean D(String string) {
        return h.containsKey(string);
    }

    public static String K(JComponent jComponent, String string) {
        return i2_0.O(i2_0.m(jComponent, string));
    }

    public static Character p(JComponent jComponent, String string) {
        return i2_0.w(i2_0.m(jComponent, string));
    }

    public static G9 X(JComponent jComponent, String string) {
        return i2_0.C(i2_0.m(jComponent, string));
    }

    public static G9 Y(JComponent jComponent, String string) {
        return i2_0.r(i2_0.m(jComponent, string));
    }

    public static G9 f(JComponent jComponent, String string, String string2) {
        return i2_0.C(i2_0.m(jComponent, string) + "." + string2);
    }

    public static G9 Y(JComponent jComponent, String string, String string2) {
        return i2_0.r(i2_0.m(jComponent, string) + "." + string2);
    }

    public static String m(JComponent jComponent, String string) {
        String string2;
        block2: {
            block3: {
                String string3 = (String)p.get(jComponent);
                boolean bl = i2_0.X();
                try {
                    string2 = string3;
                    if (bl) break block2;
                    if (string2 == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
                string2 = string3;
                break block2;
            }
            string2 = i2_0.Z(jComponent, string);
        }
        return string2;
    }

    protected static String Z(JComponent jComponent, String string) {
        String string2;
        Object object;
        block14: {
            StringBuilder stringBuilder;
            block12: {
                Container container;
                boolean bl;
                block11: {
                    stringBuilder = new StringBuilder(string);
                    bl = i2_0.X();
                    try {
                        try {
                            container = jComponent;
                            if (bl) break block11;
                            if (container == null) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        container = jComponent.getParent();
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                object = container;
                while (object != null) {
                    block13: {
                        block15: {
                            String string3 = i2_0.O((Container)object);
                            try {
                                try {
                                    try {
                                        if (bl) break block13;
                                        string2 = string3;
                                        if (bl) break block14;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw i2_0.a(runtimeException);
                                    }
                                    if (string2 == null) break block15;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw i2_0.a(runtimeException);
                                }
                                stringBuilder.insert(0, string3 + ".");
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                        }
                        object = ((Component)object).getParent();
                    }
                    if (!bl) continue;
                }
            }
            string2 = stringBuilder.toString();
        }
        object = string2;
        p.put(jComponent, object);
        return object;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void f(Container container, String string) {
        Object object = M;
        synchronized (object) {
            R.put(container, string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void p(Container container) {
        Object object = M;
        synchronized (object) {
            R.remove(container);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String O(Container container) {
        Object object = M;
        synchronized (object) {
            return (String)R.get(container);
        }
    }

    protected static void C() {
        i2_0.g();
        i2_0.F(P);
    }

    protected static void g() {
        h.clear();
    }

    protected static void F(oj_2 oj_22) {
        i2_0.x(oj_22.N(), oj_22);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected static void x(String var0, oj_2 var1_1) {
        block43: {
            block42: {
                block38: {
                    block39: {
                        block37: {
                            block36: {
                                block35: {
                                    var2_2 = i2_0.K();
                                    try {
                                        v0 = var0;
                                        if (!var2_2) break block35;
                                        if (v0 == null) break block36;
                                    }
                                    catch (RuntimeException v1) {
                                        throw i2_0.a(v1);
                                    }
                                    v0 = var0;
                                }
                                try {
                                    try {
                                        if (!var2_2) break block37;
                                        if (v0.equals("")) break block36;
                                    }
                                    catch (RuntimeException v2) {
                                        throw i2_0.a(v2);
                                    }
                                    v0 = var0 + ".";
                                    break block37;
                                }
                                catch (RuntimeException v3) {
                                    throw i2_0.a(v3);
                                }
                            }
                            v0 = "";
                        }
                        var0 = v0;
                        try {
                            v4 = var1_1.I();
                            if (!var2_2) break block38;
                            if (v4 == null) break block39;
                        }
                        catch (RuntimeException v5) {
                            throw i2_0.a(v5);
                        }
                        var3_3 = var1_1.I().iterator();
                        while (var3_3.hasNext()) {
                            block40: {
                                block41: {
                                    var4_4 = (R9)var3_3.next();
                                    var5_5 = var4_4.a(i2_0.E);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v6 /* !! */  = var5_5;
                                                                if (var2_2) {
                                                                    if (!var2_2) break block40;
                                                                }
                                                                ** GOTO lbl-1000
                                                            }
                                                            catch (RuntimeException v7) {
                                                                throw i2_0.a(v7);
                                                            }
                                                            if (v6 /* !! */  == null) break block41;
                                                        }
                                                        catch (RuntimeException v8) {
                                                            throw i2_0.a(v8);
                                                        }
                                                        v9 = var5_5.Y();
                                                        if (!var2_2) break block40;
                                                    }
                                                    catch (RuntimeException v10) {
                                                        throw i2_0.a(v10);
                                                    }
                                                    if (v9 != null) break block41;
                                                }
                                                catch (RuntimeException v11) {
                                                    throw i2_0.a(v11);
                                                }
                                                v9 = var4_4.U();
                                                if (!var2_2) break block40;
                                            }
                                            catch (RuntimeException v12) {
                                                throw i2_0.a(v12);
                                            }
                                            if (v9 == null) break block41;
                                        }
                                        catch (RuntimeException v13) {
                                            throw i2_0.a(v13);
                                        }
                                        var5_5.J(var4_4.U());
                                    }
                                    catch (RuntimeException v14) {
                                        throw i2_0.a(v14);
                                    }
                                }
                                v9 = i2_0.h.put(var0 + var4_4.h(), var5_5);
                            }
                            if (var2_2) continue;
                        }
                    }
                    v4 = var1_1.j();
                }
                try {
                    try {
                        if (!var2_2) break block42;
                        if (v4 == null) break block43;
                    }
                    catch (RuntimeException v15) {
                        throw i2_0.a(v15);
                    }
                    v4 = var1_1.j();
                }
                catch (RuntimeException v16) {
                    throw i2_0.a(v16);
                }
            }
            for (E v6 : v4) lbl-1000:
            // 2 sources

            {
                block46: {
                    block45: {
                        block44: {
                            var4_4 = (oj_2)v6 /* !! */ ;
                            var5_5 = var4_4.N();
                            try {
                                v17 = new StringBuilder().append(var0);
                                v18 = var5_5;
                                if (!var2_2) break block44;
                                if (v18 == null) break block45;
                            }
                            catch (RuntimeException v19) {
                                throw i2_0.a(v19);
                            }
                            v18 = var5_5;
                        }
                        try {
                            try {
                                if (!var2_2) break block46;
                                if (v18.equals("")) break block45;
                            }
                            catch (RuntimeException v20) {
                                throw i2_0.a(v20);
                            }
                            v18 = var5_5;
                            break block46;
                        }
                        catch (RuntimeException v21) {
                            throw i2_0.a(v21);
                        }
                    }
                    v18 = "";
                }
                var6_6 = v17.append((String)v18).toString();
                i2_0.x(var6_6, (oj_2)var4_4);
                if (var2_2) continue;
            }
        }
    }

    public static boolean m() {
        return l;
    }

    public static void p(boolean bl) {
        l = bl;
    }

    public static String x() {
        String string;
        String string2 = i2_0.T();
        try {
            string = w.contains(string2) ? string2 : i2_0.a(27758, -1010);
        }
        catch (RuntimeException runtimeException) {
            throw i2_0.a(runtimeException);
        }
        return string;
    }

    public static String T() {
        return System.getProperty(i2_0.a(27757, 5028));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static List R() {
        Object object = T;
        synchronized (object) {
            return aL.J((Collection)Z);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Z(yw_1 yw_12) {
        Object object = T;
        synchronized (object) {
            Z.add(yw_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void F(yw_1 yw_12) {
        Object object = T;
        synchronized (object) {
            Z.remove(yw_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static Map u() {
        Object object = T;
        synchronized (object) {
            boolean bl = i2_0.K();
            HashMap<JComponent, yw_1> hashMap = new HashMap<JComponent, yw_1>(a.size());
            for (Map.Entry entry : a.entrySet()) {
                block17: {
                    yw_1 yw_12;
                    JComponent jComponent;
                    block22: {
                        block19: {
                            WeakReference weakReference;
                            block18: {
                                JComponent jComponent2;
                                block16: {
                                    jComponent = (JComponent)entry.getKey();
                                    jComponent2 = jComponent;
                                    if (!bl) break block16;
                                    try {
                                        block20: {
                                            if (jComponent2 == null) break block17;
                                            break block20;
                                            catch (RuntimeException runtimeException) {
                                                throw i2_0.a(runtimeException);
                                            }
                                        }
                                        jComponent2 = entry.getValue();
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw i2_0.a(runtimeException);
                                    }
                                }
                                WeakReference weakReference2 = (WeakReference)((Object)jComponent2);
                                weakReference = weakReference2;
                                if (!bl) break block18;
                                try {
                                    block21: {
                                        if (weakReference == null) break block19;
                                        break block21;
                                        catch (RuntimeException runtimeException) {
                                            throw i2_0.a(runtimeException);
                                        }
                                    }
                                    weakReference = weakReference2.get();
                                }
                                catch (RuntimeException runtimeException) {
                                    throw i2_0.a(runtimeException);
                                }
                            }
                            yw_12 = (yw_1)((Object)weakReference);
                            break block22;
                        }
                        yw_12 = null;
                    }
                    yw_1 yw_13 = yw_12;
                    yw_1 yw_14 = yw_13;
                    if (!bl) break block17;
                    try {
                        block23: {
                            if (yw_14 == null) break block17;
                            break block23;
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                        }
                        yw_14 = hashMap.put(jComponent, yw_13);
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                }
                if (bl) continue;
            }
            return hashMap;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void O(JComponent jComponent, yw_1 yw_12) {
        Object object = T;
        synchronized (object) {
            jComponent.putClientProperty(i2_0.a(27749, -26009), yw_12);
            a.put(jComponent, new WeakReference<yw_1>(yw_12));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void i(JComponent jComponent) {
        Object object = T;
        synchronized (object) {
            jComponent.putClientProperty(i2_0.a(27760, 26713), null);
            a.remove(jComponent);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    protected static void m(String string, String string2) {
        Object object = T;
        synchronized (object) {
            block21: {
                Object object2;
                Object object3;
                Iterator<Object> iterator;
                boolean bl;
                block20: {
                    bl = i2_0.K();
                    iterator = Z.iterator();
                    while (iterator.hasNext()) {
                        object3 = (yw_1)iterator.next();
                        try {
                            object3.Z(string, string2);
                            if (bl) {
                                if (bl) continue;
                                break;
                            }
                            break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                    }
                    iterator = a.entrySet().iterator();
                }
                while (iterator.hasNext()) {
                    block23: {
                        yw_1 yw_12;
                        block26: {
                            yw_1 yw_13;
                            block30: {
                                block25: {
                                    WeakReference weakReference;
                                    block24: {
                                        Object v2;
                                        block22: {
                                            block27: {
                                                object3 = (Map.Entry)iterator.next();
                                                JComponent jComponent = (JComponent)object3.getKey();
                                                object2 = jComponent;
                                                if (!bl) break block21;
                                                if (!bl) break block22;
                                                break block27;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            try {
                                                block28: {
                                                    if (object2 == null) break block23;
                                                    break block28;
                                                    catch (RuntimeException runtimeException) {
                                                        throw i2_0.a(runtimeException);
                                                    }
                                                }
                                                v2 = object3.getValue();
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw i2_0.a(runtimeException);
                                            }
                                        }
                                        WeakReference weakReference2 = (WeakReference)v2;
                                        weakReference = weakReference2;
                                        if (!bl) break block24;
                                        try {
                                            block29: {
                                                if (weakReference == null) break block25;
                                                break block29;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            weakReference = weakReference2.get();
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw i2_0.a(runtimeException);
                                        }
                                    }
                                    yw_13 = (yw_1)((Object)weakReference);
                                    break block30;
                                }
                                yw_13 = null;
                            }
                            yw_1 yw_14 = yw_13;
                            try {
                                yw_12 = yw_14;
                                if (!bl) break block26;
                                if (yw_12 == null) break block23;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                            yw_12 = yw_14;
                        }
                        yw_12.Z(string, string2);
                    }
                    if (bl) continue;
                }
                object2 = object;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    protected static void K(oj_2 oj_22) {
        Object object = T;
        synchronized (object) {
            block21: {
                Object object2;
                Object object3;
                Iterator<Object> iterator;
                boolean bl;
                block20: {
                    bl = i2_0.X();
                    iterator = Z.iterator();
                    while (iterator.hasNext()) {
                        object3 = (yw_1)iterator.next();
                        try {
                            object3.G(oj_22);
                            if (!bl) {
                                if (!bl) continue;
                                break;
                            }
                            break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                    }
                    iterator = a.entrySet().iterator();
                }
                while (iterator.hasNext()) {
                    block23: {
                        yw_1 yw_12;
                        block26: {
                            yw_1 yw_13;
                            block30: {
                                block25: {
                                    WeakReference weakReference;
                                    block24: {
                                        Object v2;
                                        block22: {
                                            block27: {
                                                object3 = (Map.Entry)iterator.next();
                                                JComponent jComponent = (JComponent)object3.getKey();
                                                object2 = jComponent;
                                                if (bl) break block21;
                                                if (bl) break block22;
                                                break block27;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            try {
                                                block28: {
                                                    if (object2 == null) break block23;
                                                    break block28;
                                                    catch (RuntimeException runtimeException) {
                                                        throw i2_0.a(runtimeException);
                                                    }
                                                }
                                                v2 = object3.getValue();
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw i2_0.a(runtimeException);
                                            }
                                        }
                                        WeakReference weakReference2 = (WeakReference)v2;
                                        weakReference = weakReference2;
                                        if (bl) break block24;
                                        try {
                                            block29: {
                                                if (weakReference == null) break block25;
                                                break block29;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            weakReference = weakReference2.get();
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw i2_0.a(runtimeException);
                                        }
                                    }
                                    yw_13 = (yw_1)((Object)weakReference);
                                    break block30;
                                }
                                yw_13 = null;
                            }
                            yw_1 yw_14 = yw_13;
                            try {
                                yw_12 = yw_14;
                                if (bl) break block26;
                                if (yw_12 == null) break block23;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                            yw_12 = yw_14;
                        }
                        yw_12.G(oj_22);
                    }
                    if (!bl) continue;
                }
                object2 = object;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    protected static void D(oj_2 oj_22) {
        Object object = T;
        synchronized (object) {
            block21: {
                Object object2;
                Object object3;
                Iterator<Object> iterator;
                boolean bl;
                block20: {
                    bl = i2_0.K();
                    iterator = Z.iterator();
                    while (iterator.hasNext()) {
                        object3 = (yw_1)iterator.next();
                        try {
                            object3.t(oj_22);
                            if (bl) {
                                if (bl) continue;
                                break;
                            }
                            break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                    }
                    iterator = a.entrySet().iterator();
                }
                while (iterator.hasNext()) {
                    block23: {
                        yw_1 yw_12;
                        block26: {
                            yw_1 yw_13;
                            block30: {
                                block25: {
                                    WeakReference weakReference;
                                    block24: {
                                        Object v2;
                                        block22: {
                                            block27: {
                                                object3 = (Map.Entry)iterator.next();
                                                JComponent jComponent = (JComponent)object3.getKey();
                                                object2 = jComponent;
                                                if (!bl) break block21;
                                                if (!bl) break block22;
                                                break block27;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            try {
                                                block28: {
                                                    if (object2 == null) break block23;
                                                    break block28;
                                                    catch (RuntimeException runtimeException) {
                                                        throw i2_0.a(runtimeException);
                                                    }
                                                }
                                                v2 = object3.getValue();
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw i2_0.a(runtimeException);
                                            }
                                        }
                                        WeakReference weakReference2 = (WeakReference)v2;
                                        weakReference = weakReference2;
                                        if (!bl) break block24;
                                        try {
                                            block29: {
                                                if (weakReference == null) break block25;
                                                break block29;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            weakReference = weakReference2.get();
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw i2_0.a(runtimeException);
                                        }
                                    }
                                    yw_13 = (yw_1)((Object)weakReference);
                                    break block30;
                                }
                                yw_13 = null;
                            }
                            yw_1 yw_14 = yw_13;
                            try {
                                yw_12 = yw_14;
                                if (!bl) break block26;
                                if (yw_12 == null) break block23;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                            yw_12 = yw_14;
                        }
                        yw_12.t(oj_22);
                    }
                    if (bl) continue;
                }
                object2 = object;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    protected static void y() {
        Object object = T;
        synchronized (object) {
            block21: {
                Object object2;
                Object object3;
                Iterator<Object> iterator;
                boolean bl;
                block20: {
                    bl = i2_0.K();
                    iterator = Z.iterator();
                    while (iterator.hasNext()) {
                        object3 = (yw_1)iterator.next();
                        try {
                            object3.U();
                            if (bl) {
                                if (bl) continue;
                                break;
                            }
                            break block20;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                    }
                    iterator = a.entrySet().iterator();
                }
                while (iterator.hasNext()) {
                    block23: {
                        yw_1 yw_12;
                        block26: {
                            yw_1 yw_13;
                            block30: {
                                block25: {
                                    WeakReference weakReference;
                                    block24: {
                                        Object v2;
                                        block22: {
                                            block27: {
                                                object3 = (Map.Entry)iterator.next();
                                                JComponent jComponent = (JComponent)object3.getKey();
                                                object2 = jComponent;
                                                if (!bl) break block21;
                                                if (!bl) break block22;
                                                break block27;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            try {
                                                block28: {
                                                    if (object2 == null) break block23;
                                                    break block28;
                                                    catch (RuntimeException runtimeException) {
                                                        throw i2_0.a(runtimeException);
                                                    }
                                                }
                                                v2 = object3.getValue();
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw i2_0.a(runtimeException);
                                            }
                                        }
                                        WeakReference weakReference2 = (WeakReference)v2;
                                        weakReference = weakReference2;
                                        if (!bl) break block24;
                                        try {
                                            block29: {
                                                if (weakReference == null) break block25;
                                                break block29;
                                                catch (RuntimeException runtimeException) {
                                                    throw i2_0.a(runtimeException);
                                                }
                                            }
                                            weakReference = weakReference2.get();
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw i2_0.a(runtimeException);
                                        }
                                    }
                                    yw_13 = (yw_1)((Object)weakReference);
                                    break block30;
                                }
                                yw_13 = null;
                            }
                            yw_1 yw_14 = yw_13;
                            try {
                                yw_12 = yw_14;
                                if (!bl) break block26;
                                if (yw_12 == null) break block23;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                            yw_12 = yw_14;
                        }
                        yw_12.U();
                    }
                    if (bl) continue;
                }
                object2 = object;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    public static Map I() {
        return c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void i(String string, dm_0 dm_02) {
        Object object = H;
        synchronized (object) {
            block5: {
                Object object2;
                ArrayList<dm_0> arrayList;
                block6: {
                    boolean bl = i2_0.K();
                    arrayList = (ArrayList<dm_0>)c.get(string);
                    try {
                        object2 = arrayList;
                        if (!bl) break block5;
                        if (object2 != null) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw i2_0.a(runtimeException);
                    }
                    arrayList = new ArrayList<dm_0>();
                    c.put(string, arrayList);
                }
                arrayList.add(dm_02);
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void m(dm_0 dm_02) {
        Object object = H;
        synchronized (object) {
            boolean bl = i2_0.X();
            for (Map.Entry entry : c.entrySet()) {
                try {
                    ((List)entry.getValue()).remove(dm_02);
                    if (!bl) {
                        if (!bl) continue;
                    }
                    break;
                }
                catch (RuntimeException runtimeException) {
                    throw i2_0.a(runtimeException);
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void R(String string) {
        Object object = H;
        synchronized (object) {
            c.remove(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static void A(String string) {
        Object object = H;
        synchronized (object) {
            block11: {
                block9: {
                    Object object2;
                    block10: {
                        boolean bl = i2_0.X();
                        List list = (List)c.get(string);
                        try {
                            object2 = list;
                            if (bl) break block9;
                            if (object2 == null) break block10;
                        }
                        catch (RuntimeException runtimeException) {
                            throw i2_0.a(runtimeException);
                        }
                        G9 g92 = i2_0.C(string);
                        for (dm_0 dm_02 : aL.J((Collection)list)) {
                            try {
                                dm_02.G(string, g92);
                                if (!bl) {
                                    if (!bl) continue;
                                    break;
                                }
                                break block11;
                            }
                            catch (RuntimeException runtimeException) {
                                throw i2_0.a(runtimeException);
                            }
                        }
                    }
                    object2 = object;
                }
                // ** MonitorExit[v0] (shouldn't be in output)
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected static void R() {
        Iterator iterator = H;
        synchronized (iterator) {
            block6: {
                Iterator iterator2;
                boolean bl = i2_0.X();
                block3: for (Map.Entry entry : c.entrySet()) {
                    G9 g92 = i2_0.C((String)entry.getKey());
                    iterator2 = aL.J((Collection)entry.getValue()).iterator();
                    if (!bl) {
                        Iterator iterator3 = iterator2;
                        while (iterator3.hasNext()) {
                            dm_0 dm_02 = (dm_0)iterator3.next();
                            dm_02.G((String)entry.getKey(), g92);
                            if (bl) continue block3;
                            if (!bl) continue;
                        }
                        if (!bl) continue;
                    }
                    break block6;
                }
                iterator2 = iterator;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[21];
                        var11_1 = 0;
                        var10_2 = "\u0001\u0082\u0002j \u0002=\u009e\u0002B\u0092\u0011\u0088\u008f\u0092\t\u00a3\u00df\u00d83\u0000\u00cfPL.\u00e1\u00b1.\u00eb\u0014&\u00e0\u00e3\u00af\u00aam4\u00e6\u00b7\u00fa\u00a8\u009c\u00bfi\u0088\u0084\u00fa\u000e\u00fd\u00cc\u0002\u0007\u00b1\u0004\u00e8\u00f3\u0094\u00b5.\u00ed!/7\u00e3\u00b9\u00adj@\u009b>\u0019\u0017\u0013\u0081xyv\"\f\u00be\u00ddAiC\u0091c\u00be\u00a4\u00e1q\u00b4BZ\u00fa\u00f4\u00aa\u00f0u\u0096\u00aa%x\u00a7\u009a\u00fc\u000bdQ\u00ab\u0099\u00a3\u00ab\u0015>\u0093\u00e1,\u0002w9\u0002|X\r\u00b8:\u00a5\u00fat\u001b\u0014\f\u0016[\u00fa\u00f0c\u0016\u00f9\u0016|\u00b6\u00c02\u00b0\u00ff\u00d4\u00159.\u00bc\u00ff\u00a1\u00ab\u0084\u008f\u0012T\u00d4q\u0010\u00bf\u00f5tF\u007f6C\u000esq'\u00b6\u00efZ5}\u0002\u00f7\u00e5\u0010uE-PT\u00f4&V\u00dfz\u00b2\u00d7]vc\u00f8\u00118\u00f3\u0084\u0086a.\u0080\r\u000b\b1\u00b4\u0002\u00fe4\u00cd[\u0002\u0015\u00aa";
                        var12_3 = "\u0001\u0082\u0002j \u0002=\u009e\u0002B\u0092\u0011\u0088\u008f\u0092\t\u00a3\u00df\u00d83\u0000\u00cfPL.\u00e1\u00b1.\u00eb\u0014&\u00e0\u00e3\u00af\u00aam4\u00e6\u00b7\u00fa\u00a8\u009c\u00bfi\u0088\u0084\u00fa\u000e\u00fd\u00cc\u0002\u0007\u00b1\u0004\u00e8\u00f3\u0094\u00b5.\u00ed!/7\u00e3\u00b9\u00adj@\u009b>\u0019\u0017\u0013\u0081xyv\"\f\u00be\u00ddAiC\u0091c\u00be\u00a4\u00e1q\u00b4BZ\u00fa\u00f4\u00aa\u00f0u\u0096\u00aa%x\u00a7\u009a\u00fc\u000bdQ\u00ab\u0099\u00a3\u00ab\u0015>\u0093\u00e1,\u0002w9\u0002|X\r\u00b8:\u00a5\u00fat\u001b\u0014\f\u0016[\u00fa\u00f0c\u0016\u00f9\u0016|\u00b6\u00c02\u00b0\u00ff\u00d4\u00159.\u00bc\u00ff\u00a1\u00ab\u0084\u008f\u0012T\u00d4q\u0010\u00bf\u00f5tF\u007f6C\u000esq'\u00b6\u00efZ5}\u0002\u00f7\u00e5\u0010uE-PT\u00f4&V\u00dfz\u00b2\u00d7]vc\u00f8\u00118\u00f3\u0084\u0086a.\u0080\r\u000b\b1\u00b4\u0002\u00fe4\u00cd[\u0002\u0015\u00aa".length();
                        var9_4 = 2;
                        var8_5 = -1;
                        i2_0.z(true);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 55;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "9K\u0002\\\u00d7";
                            var12_3 = "9K\u0002\\\u00d7".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 20;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 20;
                                    break;
                                }
                                case 1: {
                                    v15 = 35;
                                    break;
                                }
                                case 2: {
                                    v15 = 95;
                                    break;
                                }
                                case 3: {
                                    v15 = 103;
                                    break;
                                }
                                case 4: {
                                    v15 = 29;
                                    break;
                                }
                                case 5: {
                                    v15 = 41;
                                    break;
                                }
                                default: {
                                    v15 = 98;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl86:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                i2_0.b = var13;
                i2_0.d = new String[21];
                var1_7 = 1077176427887557455L;
                var0_8 = new long[5];
                var4_9 = 0;
                var5_10 = "\u0083\u00fba\u009d\b\u00a9{G\u0010\u001e\u00c7o\b\u00a9{HD\u00e7u\u00c6\b\u00a9{I";
                var6_11 = "\u0083\u00fba\u009d\b\u00a9{G\u0010\u001e\u00c7o\b\u00a9{HD\u00e7u\u00c6\b\u00a9{I".length();
                var3_12 = 0;
                while (true) {
                    var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                    v17 = var0_8;
                    v18 = var4_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var3_12 < var6_11) ** continue;
                    var5_10 = "\u0010s1\u00e1\b\u00a9{F}V\u00bf\u0080\b\u00a9{E";
                    var6_11 = "\u0010s1\u00e1\b\u00a9{F}V\u00bf\u0080\b\u00a9{E".length();
                    var3_12 = 0;
                    while (true) {
                        var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                        v17 = var0_8;
                        v18 = var4_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var3_12 < var6_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var1_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        i2_0.t = new ImageIcon(i2_0.class.getResource(i2_0.a(27748, 470)));
        i2_0.Y = new Object();
        v22 = new String[(int)var0_8[4]];
        v22[0] = i2_0.a(27758, -1010);
        v22[1] = i2_0.a(27762, -14069);
        v22[2] = i2_0.a(27765, -24769);
        v22[3] = i2_0.a(27755, -2356);
        v22[4] = i2_0.a(27746, -8210);
        v22[5] = i2_0.a(27763, 29173);
        v22[(int)var0_8[2]] = i2_0.a(27751, 8869);
        v22[(int)var0_8[1]] = i2_0.a(27744, -12630);
        v22[(int)var0_8[0]] = i2_0.a(27754, -2830);
        v22[(int)var0_8[3]] = i2_0.a(27747, 30954);
        i2_0.w = aL.e(v22);
        i2_0.E = i2_0.j = i2_0.x();
        i2_0.K = GX.weblaf;
        i2_0.T = new Object();
        i2_0.Z = new ArrayList<E>();
        i2_0.a = new WeakHashMap<K, V>();
        i2_0.H = new Object();
        i2_0.c = new HashMap<K, V>();
        i2_0.h = new HashMap<K, V>();
        i2_0.n = new ArrayList<E>();
        i2_0.i = new HashMap<K, V>();
        i2_0.S = new Object();
        i2_0.v = new WeakHashMap<K, V>();
        i2_0.L = new WeakHashMap<K, V>();
        i2_0.p = new WeakHashMap<K, V>();
        i2_0.G = new WeakHashMap<K, V>();
        i2_0.M = new Object();
        i2_0.R = new WeakHashMap<K, V>();
        i2_0.C = new Object();
        i2_0.Q = new yb_0();
        i2_0.q = new ArrayList<E>();
        i2_0.X = new WeakHashMap<K, V>();
        i2_0.y = new HashMap<K, V>();
        i2_0.x = new HashMap<K, V>();
        i2_0.l = true;
        i2_0.m = false;
    }

    public static void z(boolean bl) {
        f = bl;
    }

    public static boolean K() {
        return f;
    }

    public static boolean X() {
        boolean bl = i2_0.K();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw i2_0.a(runtimeException);
        }
        return false;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6C61) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 102;
                    break;
                }
                case 1: {
                    n14 = 190;
                    break;
                }
                case 2: {
                    n14 = 211;
                    break;
                }
                case 3: {
                    n14 = 12;
                    break;
                }
                case 4: {
                    n14 = 51;
                    break;
                }
                case 5: {
                    n14 = 106;
                    break;
                }
                case 6: {
                    n14 = 78;
                    break;
                }
                case 7: {
                    n14 = 239;
                    break;
                }
                case 8: {
                    n14 = 228;
                    break;
                }
                case 9: {
                    n14 = 4;
                    break;
                }
                case 10: {
                    n14 = 113;
                    break;
                }
                case 11: {
                    n14 = 135;
                    break;
                }
                case 12: {
                    n14 = 172;
                    break;
                }
                case 13: {
                    n14 = 141;
                    break;
                }
                case 14: {
                    n14 = 88;
                    break;
                }
                case 15: {
                    n14 = 58;
                    break;
                }
                case 16: {
                    n14 = 248;
                    break;
                }
                case 17: {
                    n14 = 75;
                    break;
                }
                case 18: {
                    n14 = 25;
                    break;
                }
                case 19: {
                    n14 = 80;
                    break;
                }
                case 20: {
                    n14 = 158;
                    break;
                }
                case 21: {
                    n14 = 149;
                    break;
                }
                case 22: {
                    n14 = 11;
                    break;
                }
                case 23: {
                    n14 = 178;
                    break;
                }
                case 24: {
                    n14 = 255;
                    break;
                }
                case 25: {
                    n14 = 48;
                    break;
                }
                case 26: {
                    n14 = 229;
                    break;
                }
                case 27: {
                    n14 = 226;
                    break;
                }
                case 28: {
                    n14 = 85;
                    break;
                }
                case 29: {
                    n14 = 114;
                    break;
                }
                case 30: {
                    n14 = 128;
                    break;
                }
                case 31: {
                    n14 = 35;
                    break;
                }
                case 32: {
                    n14 = 250;
                    break;
                }
                case 33: {
                    n14 = 33;
                    break;
                }
                case 34: {
                    n14 = 0;
                    break;
                }
                case 35: {
                    n14 = 238;
                    break;
                }
                case 36: {
                    n14 = 81;
                    break;
                }
                case 37: {
                    n14 = 26;
                    break;
                }
                case 38: {
                    n14 = 218;
                    break;
                }
                case 39: {
                    n14 = 46;
                    break;
                }
                case 40: {
                    n14 = 89;
                    break;
                }
                case 41: {
                    n14 = 28;
                    break;
                }
                case 42: {
                    n14 = 177;
                    break;
                }
                case 43: {
                    n14 = 17;
                    break;
                }
                case 44: {
                    n14 = 6;
                    break;
                }
                case 45: {
                    n14 = 116;
                    break;
                }
                case 46: {
                    n14 = 37;
                    break;
                }
                case 47: {
                    n14 = 131;
                    break;
                }
                case 48: {
                    n14 = 167;
                    break;
                }
                case 49: {
                    n14 = 142;
                    break;
                }
                case 50: {
                    n14 = 181;
                    break;
                }
                case 51: {
                    n14 = 252;
                    break;
                }
                case 52: {
                    n14 = 180;
                    break;
                }
                case 53: {
                    n14 = 38;
                    break;
                }
                case 54: {
                    n14 = 165;
                    break;
                }
                case 55: {
                    n14 = 164;
                    break;
                }
                case 56: {
                    n14 = 215;
                    break;
                }
                case 57: {
                    n14 = 192;
                    break;
                }
                case 58: {
                    n14 = 111;
                    break;
                }
                case 59: {
                    n14 = 69;
                    break;
                }
                case 60: {
                    n14 = 208;
                    break;
                }
                case 61: {
                    n14 = 240;
                    break;
                }
                case 62: {
                    n14 = 18;
                    break;
                }
                case 63: {
                    n14 = 59;
                    break;
                }
                case 64: {
                    n14 = 251;
                    break;
                }
                case 65: {
                    n14 = 189;
                    break;
                }
                case 66: {
                    n14 = 61;
                    break;
                }
                case 67: {
                    n14 = 72;
                    break;
                }
                case 68: {
                    n14 = 139;
                    break;
                }
                case 69: {
                    n14 = 9;
                    break;
                }
                case 70: {
                    n14 = 13;
                    break;
                }
                case 71: {
                    n14 = 161;
                    break;
                }
                case 72: {
                    n14 = 47;
                    break;
                }
                case 73: {
                    n14 = 125;
                    break;
                }
                case 74: {
                    n14 = 194;
                    break;
                }
                case 75: {
                    n14 = 136;
                    break;
                }
                case 76: {
                    n14 = 254;
                    break;
                }
                case 77: {
                    n14 = 129;
                    break;
                }
                case 78: {
                    n14 = 244;
                    break;
                }
                case 79: {
                    n14 = 74;
                    break;
                }
                case 80: {
                    n14 = 207;
                    break;
                }
                case 81: {
                    n14 = 41;
                    break;
                }
                case 82: {
                    n14 = 220;
                    break;
                }
                case 83: {
                    n14 = 63;
                    break;
                }
                case 84: {
                    n14 = 151;
                    break;
                }
                case 85: {
                    n14 = 170;
                    break;
                }
                case 86: {
                    n14 = 14;
                    break;
                }
                case 87: {
                    n14 = 118;
                    break;
                }
                case 88: {
                    n14 = 163;
                    break;
                }
                case 89: {
                    n14 = 236;
                    break;
                }
                case 90: {
                    n14 = 159;
                    break;
                }
                case 91: {
                    n14 = 200;
                    break;
                }
                case 92: {
                    n14 = 19;
                    break;
                }
                case 93: {
                    n14 = 126;
                    break;
                }
                case 94: {
                    n14 = 24;
                    break;
                }
                case 95: {
                    n14 = 188;
                    break;
                }
                case 96: {
                    n14 = 246;
                    break;
                }
                case 97: {
                    n14 = 234;
                    break;
                }
                case 98: {
                    n14 = 162;
                    break;
                }
                case 99: {
                    n14 = 60;
                    break;
                }
                case 100: {
                    n14 = 176;
                    break;
                }
                case 101: {
                    n14 = 196;
                    break;
                }
                case 102: {
                    n14 = 209;
                    break;
                }
                case 103: {
                    n14 = 2;
                    break;
                }
                case 104: {
                    n14 = 5;
                    break;
                }
                case 105: {
                    n14 = 147;
                    break;
                }
                case 106: {
                    n14 = 124;
                    break;
                }
                case 107: {
                    n14 = 16;
                    break;
                }
                case 108: {
                    n14 = 144;
                    break;
                }
                case 109: {
                    n14 = 120;
                    break;
                }
                case 110: {
                    n14 = 222;
                    break;
                }
                case 111: {
                    n14 = 15;
                    break;
                }
                case 112: {
                    n14 = 76;
                    break;
                }
                case 113: {
                    n14 = 79;
                    break;
                }
                case 114: {
                    n14 = 95;
                    break;
                }
                case 115: {
                    n14 = 57;
                    break;
                }
                case 116: {
                    n14 = 101;
                    break;
                }
                case 117: {
                    n14 = 123;
                    break;
                }
                case 118: {
                    n14 = 86;
                    break;
                }
                case 119: {
                    n14 = 105;
                    break;
                }
                case 120: {
                    n14 = 197;
                    break;
                }
                case 121: {
                    n14 = 249;
                    break;
                }
                case 122: {
                    n14 = 52;
                    break;
                }
                case 123: {
                    n14 = 137;
                    break;
                }
                case 124: {
                    n14 = 87;
                    break;
                }
                case 125: {
                    n14 = 223;
                    break;
                }
                case 126: {
                    n14 = 219;
                    break;
                }
                case 127: {
                    n14 = 146;
                    break;
                }
                case 128: {
                    n14 = 241;
                    break;
                }
                case 129: {
                    n14 = 62;
                    break;
                }
                case 130: {
                    n14 = 214;
                    break;
                }
                case 131: {
                    n14 = 43;
                    break;
                }
                case 132: {
                    n14 = 247;
                    break;
                }
                case 133: {
                    n14 = 82;
                    break;
                }
                case 134: {
                    n14 = 185;
                    break;
                }
                case 135: {
                    n14 = 213;
                    break;
                }
                case 136: {
                    n14 = 132;
                    break;
                }
                case 137: {
                    n14 = 34;
                    break;
                }
                case 138: {
                    n14 = 1;
                    break;
                }
                case 139: {
                    n14 = 152;
                    break;
                }
                case 140: {
                    n14 = 225;
                    break;
                }
                case 141: {
                    n14 = 91;
                    break;
                }
                case 142: {
                    n14 = 112;
                    break;
                }
                case 143: {
                    n14 = 212;
                    break;
                }
                case 144: {
                    n14 = 73;
                    break;
                }
                case 145: {
                    n14 = 253;
                    break;
                }
                case 146: {
                    n14 = 233;
                    break;
                }
                case 147: {
                    n14 = 108;
                    break;
                }
                case 148: {
                    n14 = 77;
                    break;
                }
                case 149: {
                    n14 = 36;
                    break;
                }
                case 150: {
                    n14 = 245;
                    break;
                }
                case 151: {
                    n14 = 3;
                    break;
                }
                case 152: {
                    n14 = 107;
                    break;
                }
                case 153: {
                    n14 = 8;
                    break;
                }
                case 154: {
                    n14 = 21;
                    break;
                }
                case 155: {
                    n14 = 182;
                    break;
                }
                case 156: {
                    n14 = 217;
                    break;
                }
                case 157: {
                    n14 = 187;
                    break;
                }
                case 158: {
                    n14 = 92;
                    break;
                }
                case 159: {
                    n14 = 202;
                    break;
                }
                case 160: {
                    n14 = 96;
                    break;
                }
                case 161: {
                    n14 = 117;
                    break;
                }
                case 162: {
                    n14 = 30;
                    break;
                }
                case 163: {
                    n14 = 45;
                    break;
                }
                case 164: {
                    n14 = 243;
                    break;
                }
                case 165: {
                    n14 = 173;
                    break;
                }
                case 166: {
                    n14 = 140;
                    break;
                }
                case 167: {
                    n14 = 204;
                    break;
                }
                case 168: {
                    n14 = 66;
                    break;
                }
                case 169: {
                    n14 = 31;
                    break;
                }
                case 170: {
                    n14 = 23;
                    break;
                }
                case 171: {
                    n14 = 160;
                    break;
                }
                case 172: {
                    n14 = 171;
                    break;
                }
                case 173: {
                    n14 = 191;
                    break;
                }
                case 174: {
                    n14 = 119;
                    break;
                }
                case 175: {
                    n14 = 10;
                    break;
                }
                case 176: {
                    n14 = 98;
                    break;
                }
                case 177: {
                    n14 = 99;
                    break;
                }
                case 178: {
                    n14 = 227;
                    break;
                }
                case 179: {
                    n14 = 134;
                    break;
                }
                case 180: {
                    n14 = 22;
                    break;
                }
                case 181: {
                    n14 = 127;
                    break;
                }
                case 182: {
                    n14 = 231;
                    break;
                }
                case 183: {
                    n14 = 153;
                    break;
                }
                case 184: {
                    n14 = 68;
                    break;
                }
                case 185: {
                    n14 = 205;
                    break;
                }
                case 186: {
                    n14 = 174;
                    break;
                }
                case 187: {
                    n14 = 94;
                    break;
                }
                case 188: {
                    n14 = 122;
                    break;
                }
                case 189: {
                    n14 = 71;
                    break;
                }
                case 190: {
                    n14 = 50;
                    break;
                }
                case 191: {
                    n14 = 65;
                    break;
                }
                case 192: {
                    n14 = 54;
                    break;
                }
                case 193: {
                    n14 = 230;
                    break;
                }
                case 194: {
                    n14 = 42;
                    break;
                }
                case 195: {
                    n14 = 133;
                    break;
                }
                case 196: {
                    n14 = 104;
                    break;
                }
                case 197: {
                    n14 = 216;
                    break;
                }
                case 198: {
                    n14 = 186;
                    break;
                }
                case 199: {
                    n14 = 210;
                    break;
                }
                case 200: {
                    n14 = 110;
                    break;
                }
                case 201: {
                    n14 = 184;
                    break;
                }
                case 202: {
                    n14 = 64;
                    break;
                }
                case 203: {
                    n14 = 199;
                    break;
                }
                case 204: {
                    n14 = 221;
                    break;
                }
                case 205: {
                    n14 = 148;
                    break;
                }
                case 206: {
                    n14 = 155;
                    break;
                }
                case 207: {
                    n14 = 67;
                    break;
                }
                case 208: {
                    n14 = 166;
                    break;
                }
                case 209: {
                    n14 = 183;
                    break;
                }
                case 210: {
                    n14 = 138;
                    break;
                }
                case 211: {
                    n14 = 97;
                    break;
                }
                case 212: {
                    n14 = 93;
                    break;
                }
                case 213: {
                    n14 = 232;
                    break;
                }
                case 214: {
                    n14 = 49;
                    break;
                }
                case 215: {
                    n14 = 115;
                    break;
                }
                case 216: {
                    n14 = 39;
                    break;
                }
                case 217: {
                    n14 = 237;
                    break;
                }
                case 218: {
                    n14 = 143;
                    break;
                }
                case 219: {
                    n14 = 235;
                    break;
                }
                case 220: {
                    n14 = 224;
                    break;
                }
                case 221: {
                    n14 = 201;
                    break;
                }
                case 222: {
                    n14 = 193;
                    break;
                }
                case 223: {
                    n14 = 154;
                    break;
                }
                case 224: {
                    n14 = 44;
                    break;
                }
                case 225: {
                    n14 = 175;
                    break;
                }
                case 226: {
                    n14 = 55;
                    break;
                }
                case 227: {
                    n14 = 70;
                    break;
                }
                case 228: {
                    n14 = 27;
                    break;
                }
                case 229: {
                    n14 = 29;
                    break;
                }
                case 230: {
                    n14 = 7;
                    break;
                }
                case 231: {
                    n14 = 100;
                    break;
                }
                case 232: {
                    n14 = 84;
                    break;
                }
                case 233: {
                    n14 = 156;
                    break;
                }
                case 234: {
                    n14 = 90;
                    break;
                }
                case 235: {
                    n14 = 169;
                    break;
                }
                case 236: {
                    n14 = 121;
                    break;
                }
                case 237: {
                    n14 = 32;
                    break;
                }
                case 238: {
                    n14 = 157;
                    break;
                }
                case 239: {
                    n14 = 198;
                    break;
                }
                case 240: {
                    n14 = 103;
                    break;
                }
                case 241: {
                    n14 = 109;
                    break;
                }
                case 242: {
                    n14 = 145;
                    break;
                }
                case 243: {
                    n14 = 203;
                    break;
                }
                case 244: {
                    n14 = 168;
                    break;
                }
                case 245: {
                    n14 = 195;
                    break;
                }
                case 246: {
                    n14 = 150;
                    break;
                }
                case 247: {
                    n14 = 179;
                    break;
                }
                case 248: {
                    n14 = 242;
                    break;
                }
                case 249: {
                    n14 = 130;
                    break;
                }
                case 250: {
                    n14 = 53;
                    break;
                }
                case 251: {
                    n14 = 56;
                    break;
                }
                case 252: {
                    n14 = 20;
                    break;
                }
                case 253: {
                    n14 = 40;
                    break;
                }
                case 254: {
                    n14 = 206;
                    break;
                }
                default: {
                    n14 = 83;
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
            i2_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

