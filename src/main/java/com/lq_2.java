/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.F_;
import com.NC;
import com.O_;
import com.PP;
import com.QQ;
import com.QS;
import com.cg_1;
import com.eb_1;
import com.eq_2;
import com.ky_2;
import com.nc_1;
import com.qt_0;
import com.to_0;
import com.wx_0;
import java.awt.Component;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.Icon;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.lq
 */
public final class lq_2
implements SwingConstants {
    protected static int o;
    protected static cg_1 k;
    protected static Insets h;
    protected static int V;
    protected static boolean d;
    protected static int B;
    protected static boolean q;
    protected static final Map E;
    protected static final Map a;
    protected static final Map L;
    protected static final Map U;
    private static final String b;

    public static int r() {
        int n10;
        block8: {
            block9: {
                ky_2[] ky_2Array;
                block6: {
                    block7: {
                        ky_2Array = QQ.N();
                        try {
                            try {
                                n10 = o;
                                if (ky_2Array != null) break block6;
                                if (n10 == -1) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw lq_2.a(runtimeException);
                            }
                            n10 = o;
                            break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw lq_2.a(runtimeException);
                        }
                    }
                    n10 = wx_0.t() ? 1 : 0;
                }
                try {
                    if (ky_2Array != null) break block8;
                    if (n10 == 0) break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw lq_2.a(runtimeException);
                }
                n10 = 4;
                break block8;
            }
            n10 = 2;
        }
        return n10;
    }

    public static void p(int n10) {
        o = n10;
        lq_2.n();
    }

    public static cg_1 E() {
        return k;
    }

    public static void p(cg_1 cg_12) {
        k = cg_12;
        lq_2.n();
    }

    public static Insets L() {
        return h;
    }

    public static void g(int n10) {
        lq_2.H(n10, n10, n10, n10);
    }

    public static void H(int n10, int n11, int n12, int n13) {
        lq_2.l(new Insets(n10, n11, n12, n13));
    }

    public static void l(Insets insets) {
        h = insets;
        lq_2.n();
    }

    public static int J() {
        return V;
    }

    public static void P(int n10) {
        V = n10;
        lq_2.n();
    }

    public static boolean d() {
        return d;
    }

    public static void Y(boolean bl) {
        d = bl;
        lq_2.n();
    }

    public static int S() {
        return B;
    }

    public static void B(int n10) {
        try {
            B = n10;
            if (d) {
                lq_2.n();
            }
        }
        catch (RuntimeException runtimeException) {
            throw lq_2.a(runtimeException);
        }
    }

    public static boolean l() {
        return q;
    }

    public static void F(boolean bl) {
        q = bl;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void n() {
        boolean bl;
        Map.Entry entry;
        ArrayList<qt_0> arrayList = new ArrayList<qt_0>();
        Iterator iterator = a.entrySet().iterator();
        ky_2[] ky_2Array = QQ.N();
        while (iterator.hasNext()) {
            block10: {
                qt_0 qt_02;
                block9: {
                    entry = iterator.next();
                    qt_02 = (qt_0)entry.getValue();
                    try {
                        try {
                            try {
                                bl = arrayList.contains(qt_02);
                                if (ky_2Array != null) {
                                    return;
                                }
                                if (ky_2Array != null) break block9;
                            }
                            catch (RuntimeException runtimeException) {
                                throw lq_2.a(runtimeException);
                            }
                            if (bl) break block10;
                        }
                        catch (RuntimeException runtimeException) {
                            throw lq_2.a(runtimeException);
                        }
                        arrayList.add(qt_02);
                    }
                    catch (RuntimeException runtimeException) {
                        throw lq_2.a(runtimeException);
                    }
                }
                qt_02.revalidate();
            }
            if (ky_2Array == null) continue;
        }
        iterator = L.entrySet().iterator();
        do {
            bl = iterator.hasNext();
            if (!bl) return;
            entry = iterator.next();
            ((F_)entry.getValue()).w();
        } while (ky_2Array == null);
    }

    public static void E() {
        Map.Entry entry;
        ky_2[] ky_2Array;
        Iterator iterator;
        block5: {
            iterator = a.entrySet().iterator();
            ky_2Array = QQ.N();
            while (iterator.hasNext()) {
                entry = iterator.next();
                try {
                    ((QS)entry.getKey()).V();
                    if (ky_2Array == null) {
                        if (ky_2Array == null) continue;
                        break;
                    }
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw lq_2.a(runtimeException);
                }
            }
            iterator = U.entrySet().iterator();
        }
        while (iterator.hasNext()) {
            entry = iterator.next();
            ((QQ)entry.getKey()).l();
            if (ky_2Array == null) continue;
        }
    }

    public static QQ p(String string) {
        return lq_2.Q(null, new O_(string), PP.information.S());
    }

    public static QQ b(String string, Icon icon) {
        return lq_2.Q(null, new O_(string), icon);
    }

    public static QQ K(Component component, String string) {
        return lq_2.Q(component, new O_(string), PP.information.S());
    }

    public static QQ C(Component component, String string, Icon icon) {
        return lq_2.Q(component, new O_(string), icon);
    }

    public static QQ h(Component component) {
        return lq_2.Q(null, component, PP.information.S());
    }

    public static QQ J(Component component, Icon icon) {
        return lq_2.Q(null, component, icon);
    }

    public static QQ U(Component component, Component component2) {
        return lq_2.Q(component, component2, PP.information.S());
    }

    public static QQ Q(Component component, Component component2, Icon icon) {
        QQ qQ = new QQ();
        qQ.A(icon);
        qQ.Z(component2);
        return lq_2.o(component, qQ);
    }

    public static QQ n(String string, nc_1[] nc_1Array) {
        return lq_2.k(null, new O_(string), PP.information.S(), nc_1Array);
    }

    public static QQ p(String string, Icon icon, nc_1[] nc_1Array) {
        return lq_2.k(null, new O_(string), icon, nc_1Array);
    }

    public static QQ q(Component component, String string, nc_1[] nc_1Array) {
        return lq_2.k(component, new O_(string), PP.information.S(), nc_1Array);
    }

    public static QQ m(Component component, String string, Icon icon, nc_1[] nc_1Array) {
        return lq_2.k(component, new O_(string), icon, nc_1Array);
    }

    public static QQ J(Component component, nc_1[] nc_1Array) {
        return lq_2.k(null, component, PP.information.S(), nc_1Array);
    }

    public static QQ r(Component component, Icon icon, nc_1[] nc_1Array) {
        return lq_2.k(null, component, icon, nc_1Array);
    }

    public static QQ l(Component component, Component component2, nc_1[] nc_1Array) {
        return lq_2.k(component, component2, PP.information.S(), nc_1Array);
    }

    public static QQ k(Component component, Component component2, Icon icon, nc_1[] nc_1Array) {
        QQ qQ = new QQ();
        qQ.A(icon);
        qQ.Z(component2);
        qQ.q(nc_1Array);
        return lq_2.o(component, qQ);
    }

    public static QQ L(QQ qQ) {
        return lq_2.o(null, qQ);
    }

    public static QQ o(Component component, QQ qQ) {
        F_ f_2 = lq_2.I(component);
        U.put(qQ, FN.L(component));
        qQ.e(new eq_2(qQ, f_2));
        qQ.M(component, 0, 0);
        f_2.V(qQ.W());
        return qQ;
    }

    private static F_ I(Component component) {
        GraphicsDevice graphicsDevice;
        Map map;
        block17: {
            GraphicsDevice graphicsDevice2;
            block18: {
                GraphicsDevice graphicsDevice3;
                ky_2[] ky_2Array;
                block20: {
                    block16: {
                        Window window;
                        block15: {
                            Window window2;
                            block19: {
                                block13: {
                                    Component component2;
                                    block14: {
                                        block12: {
                                            ky_2Array = QQ.N();
                                            try {
                                                component2 = component;
                                                if (ky_2Array != null) break block12;
                                                if (component2 == null) break block13;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw lq_2.a(runtimeException);
                                            }
                                            component2 = component;
                                        }
                                        try {
                                            try {
                                                if (ky_2Array != null) break block14;
                                                if (!component2.isShowing()) break block13;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw lq_2.a(runtimeException);
                                            }
                                            component2 = component;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw lq_2.a(runtimeException);
                                        }
                                    }
                                    window2 = FN.L(component2);
                                    break block19;
                                }
                                window2 = null;
                            }
                            Window window3 = window2;
                            try {
                                window = window3;
                                if (ky_2Array != null) break block15;
                                if (window == null) break block16;
                            }
                            catch (RuntimeException runtimeException) {
                                throw lq_2.a(runtimeException);
                            }
                            window = window3;
                        }
                        graphicsDevice3 = window.getGraphicsConfiguration().getDevice();
                        break block20;
                    }
                    graphicsDevice3 = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                }
                graphicsDevice2 = graphicsDevice3;
                try {
                    try {
                        map = L;
                        graphicsDevice = graphicsDevice2;
                        if (ky_2Array != null) break block17;
                        if (map.containsKey(graphicsDevice)) break block18;
                    }
                    catch (RuntimeException runtimeException) {
                        throw lq_2.a(runtimeException);
                    }
                    L.put(graphicsDevice2, new F_(graphicsDevice2));
                }
                catch (RuntimeException runtimeException) {
                    throw lq_2.a(runtimeException);
                }
            }
            map = L;
            graphicsDevice = graphicsDevice2;
        }
        return (F_)map.get(graphicsDevice);
    }

    public static QS u(String string) {
        return lq_2.s(FN.N(), new O_(string), PP.information.S());
    }

    public static QS J(String string, Icon icon) {
        return lq_2.s(FN.N(), new O_(string), icon);
    }

    public static QS n(Component component, String string) {
        return lq_2.s(component, new O_(string), PP.information.S());
    }

    public static QS z(Component component, String string, Icon icon) {
        return lq_2.s(component, new O_(string), icon);
    }

    public static QS r(Component component) {
        return lq_2.s(FN.N(), component, PP.information.S());
    }

    public static QS R(Component component, Icon icon) {
        return lq_2.s(FN.N(), component, icon);
    }

    public static QS K(Component component, Component component2) {
        return lq_2.s(component, component2, PP.information.S());
    }

    public static QS s(Component component, Component component2, Icon icon) {
        QS qS = new QS();
        qS.T(icon);
        qS.M(component2);
        return lq_2.Q(component, qS);
    }

    public static QS H(String string, nc_1[] nc_1Array) {
        return lq_2.c(FN.N(), new O_(string), PP.information.S(), nc_1Array);
    }

    public static QS s(String string, Icon icon, nc_1[] nc_1Array) {
        return lq_2.c(FN.N(), new O_(string), icon, nc_1Array);
    }

    public static QS m(Component component, String string, nc_1[] nc_1Array) {
        return lq_2.c(component, new O_(string), PP.information.S(), nc_1Array);
    }

    public static QS r(Component component, String string, Icon icon, nc_1[] nc_1Array) {
        return lq_2.c(component, new O_(string), icon, nc_1Array);
    }

    public static QS E(Component component, nc_1[] nc_1Array) {
        return lq_2.c(FN.N(), component, PP.information.S(), nc_1Array);
    }

    public static QS Y(Component component, Icon icon, nc_1[] nc_1Array) {
        return lq_2.c(FN.N(), component, icon, nc_1Array);
    }

    public static QS m(Component component, Component component2, nc_1[] nc_1Array) {
        return lq_2.c(component, component2, PP.information.S(), nc_1Array);
    }

    public static QS c(Component component, Component component2, Icon icon, nc_1[] nc_1Array) {
        QS qS = new QS();
        qS.T(icon);
        qS.M(component2);
        qS.a(nc_1Array);
        return lq_2.Q(component, qS);
    }

    public static QS V(QS qS) {
        return lq_2.Q(FN.N(), qS);
    }

    public static QS Q(Component component, QS qS) {
        block8: {
            Object object;
            qt_0 qt_02;
            block9: {
                Component component2;
                ky_2[] ky_2Array;
                block6: {
                    block7: {
                        ky_2Array = QQ.N();
                        try {
                            try {
                                component2 = component;
                                if (ky_2Array != null) break block6;
                                if (component2 != null) break block7;
                            }
                            catch (RuntimeException runtimeException) {
                                throw lq_2.a(runtimeException);
                            }
                            throw new RuntimeException(b);
                        }
                        catch (RuntimeException runtimeException) {
                            throw lq_2.a(runtimeException);
                        }
                    }
                    component2 = component;
                }
                qt_02 = NC.n(component2);
                try {
                    object = E;
                    if (ky_2Array != null) break block8;
                    if (object.containsKey(qt_02)) break block9;
                }
                catch (RuntimeException runtimeException) {
                    throw lq_2.a(runtimeException);
                }
                to_0 to_02 = new to_0();
                qt_02.V(to_02);
                E.put(qt_02, to_02);
            }
            object = a.put(qS, qt_02);
        }
        qS.W(new eb_1(qS));
        qS.l(component);
        return qS;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "\u0002h0x4f\u0010% ;eq0\u0010%i7f4f\u000e?n1e&5Y\"oun85\t:a,*8(\u00173rud>2\u00100i6k%/\u00168!".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 37;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 115;
                            break;
                        }
                        case 1: {
                            n17 = 37;
                            break;
                        }
                        case 2: {
                            n17 = 112;
                            break;
                        }
                        case 3: {
                            n17 = 47;
                            break;
                        }
                        case 4: {
                            n17 = 116;
                            break;
                        }
                        case 5: {
                            n17 = 99;
                            break;
                        }
                        default: {
                            n17 = 92;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        b = new String(cArray).intern();
        long l2 = 4060033758317710139L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00f5\u0013x74\u009f\u000b?\u00b8\u00d3'%4\u009f\u000b1";
        int n19 = "\u00f5\u0013x74\u009f\u000b?\u00b8\u00d3'%4\u009f\u000b1".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        o = -1;
        k = cg_1.stack;
        h = new Insets(0, 0, 0, 0);
        V = (int)lArray[1];
        d = true;
        B = (int)lArray[0];
        q = true;
        E = new WeakHashMap();
        a = new WeakHashMap();
        L = new HashMap(1);
        U = new WeakHashMap();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

