/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FL;
import com.FN;
import com.GR;
import com.WC;
import com.WF;
import com.YD;
import com.aL;
import com.cs_0;
import com.gp_0;
import com.gt_0;
import com.ky_2;
import com.ok_1;
import com.qm_0;
import com.qo_0;
import com.ru_2;
import com.u5;
import com.w6_0;
import com.wd_0;
import java.awt.Component;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.Icon;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.ac
 */
public class ac_0 {
    protected static int Q;
    protected static boolean a;
    protected static boolean C;
    protected static boolean h;
    protected static final Map k;
    protected static final Map J;
    protected static final Map Z;
    protected static final List g;
    protected static boolean w;
    private static ky_2[] X;
    private static final String b;
    private static final long c;

    public static synchronized void S() {
        block3: {
            boolean bl;
            block2: {
                ky_2[] ky_2Array = ac_0.n();
                bl = w;
                if (ky_2Array != null) break block2;
                if (bl) break block3;
                bl = true;
            }
            w = bl;
            Toolkit.getDefaultToolkit().addAWTEventListener(new gt_0(), c);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void q() {
        var1 = aL.J(ac_0.k.keySet()).iterator();
        var0_1 = ac_0.n();
        block0: while (var1.hasNext()) {
            block9: {
                block10: {
                    block8: {
                        var2_2 = (Component)var1.next();
                        var3_3 = (WC)ac_0.Z.get(var2_2);
                        v0 /* !! */  = var3_3;
                        if (var0_1 != null) ** GOTO lbl-1000
                        if (var0_1 == null) {
                            if (v0 /* !! */  != null) {
                                var3_3.Y();
                            }
                            v1 = ac_0.k.get(var2_2);
                        }
                        v2 = var4_4 = (List)v1;
                        if (var0_1 != null) break block8;
                        if (v2 == null) break block9;
                        v2 = var4_4;
                    }
                    if (var0_1 != null) break block10;
                    if (v2.size() <= 0) break block9;
                    v2 = var4_4;
                }
                for (wd_0 var6_6 : aL.J((Collection)v2)) {
                    var6_6.j();
                    if (var0_1 != null) continue block0;
                    if (var0_1 == null) continue;
                }
            }
            if (var0_1 == null) continue;
        }
        for (E v0 : aL.J((Collection)ac_0.g)) lbl-1000:
        // 2 sources

        {
            var2_2 = (wd_0)v0 /* !! */ ;
            var2_2.j();
            if (var0_1 == null) continue;
        }
    }

    public static wd_0 I(Component component, String string) {
        return ac_0.B(component, string, null);
    }

    public static wd_0 d(Component component, Icon icon, String string) {
        return ac_0.g(component, icon, string, null);
    }

    public static wd_0 B(Component component, String string, WF wF) {
        return ac_0.l(component, string, wF, Q);
    }

    public static wd_0 g(Component component, Icon icon, String string, WF wF) {
        return ac_0.R(component, icon, string, wF, Q);
    }

    public static wd_0 l(Component component, String string, WF wF, int n10) {
        return ac_0.R(component, null, string, wF, n10);
    }

    public static wd_0 R(Component component, Icon icon, String string, WF wF, int n10) {
        return ac_0.B(component, wd_0.B(icon, string), wF, n10);
    }

    public static wd_0 k(Component component, JComponent jComponent) {
        return ac_0.R(component, jComponent, null);
    }

    public static wd_0 o(Component component, JComponent jComponent, int n10) {
        return ac_0.B(component, jComponent, null, n10);
    }

    public static wd_0 R(Component component, JComponent jComponent, WF wF) {
        return ac_0.B(component, jComponent, wF, Q);
    }

    public static wd_0 B(Component component, JComponent jComponent, WF wF, int n10) {
        return ac_0.W(component, jComponent, wF, n10, true);
    }

    public static wd_0 Q(Component component, String string) {
        return ac_0.q(component, string, null);
    }

    public static wd_0 o(Component component, Icon icon, String string) {
        return ac_0.P(component, icon, string, null);
    }

    public static wd_0 q(Component component, String string, WF wF) {
        return ac_0.r(component, string, wF, Q);
    }

    public static wd_0 P(Component component, Icon icon, String string, WF wF) {
        return ac_0.V(component, icon, string, wF, Q);
    }

    public static wd_0 r(Component component, String string, WF wF, int n10) {
        return ac_0.V(component, null, string, wF, n10);
    }

    public static wd_0 V(Component component, Icon icon, String string, WF wF, int n10) {
        return ac_0.U(component, wd_0.B(icon, string), wF, n10);
    }

    public static wd_0 Q(Component component, JComponent jComponent) {
        return ac_0.I(component, jComponent, null);
    }

    public static wd_0 S(Component component, JComponent jComponent, int n10) {
        return ac_0.U(component, jComponent, null, n10);
    }

    public static wd_0 I(Component component, JComponent jComponent, WF wF) {
        return ac_0.U(component, jComponent, wF, Q);
    }

    /*
     * Exception decompiling
     */
    public static wd_0 U(Component var0, JComponent var1_1, WF var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    protected static wd_0 W(Component component, JComponent jComponent, WF wF, int n10, boolean bl) {
        wd_0 wd_02;
        block7: {
            block6: {
                boolean bl2;
                block5: {
                    ky_2[] ky_2Array = ac_0.n();
                    if (bl) {
                        ac_0.o(component);
                    }
                    Object object = k.get(component);
                    if (ky_2Array == null && object == null) {
                        object = k.put(component, new ArrayList());
                    }
                    wd_02 = new wd_0(component, jComponent, wF, C);
                    ((List)k.get(component)).add(wd_02);
                    bl2 = Z.containsKey(component);
                    if (ky_2Array != null) break block5;
                    if (!bl2) break block6;
                    bl2 = J.containsKey(component);
                }
                if (bl2) break block7;
            }
            WeakReference<Component> weakReference = new WeakReference<Component>(component);
            WC wC = new WC(b, (long)n10);
            wC.q(new qo_0(weakReference));
            wC.x(false);
            Z.put(component, wC);
            YD yD = new YD(weakReference, wC);
            component.addMouseListener(yD);
            J.put(component, yD);
        }
        return wd_02;
    }

    protected static void y(Component component) {
        ky_2[] ky_2Array = ac_0.n();
        if (k.get(component) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)k.get(component));
            for (wd_0 wd_02 : arrayList) {
                wd_02.j();
                if (ky_2Array == null) continue;
            }
        }
    }

    public static boolean h(Component component) {
        return ac_0.z(component, false);
    }

    public static boolean z(Component component, boolean bl) {
        boolean bl2;
        block5: {
            block6: {
                block8: {
                    qm_0 qm_02;
                    ky_2[] ky_2Array;
                    block7: {
                        ky_2Array = ac_0.n();
                        bl2 = k.containsKey(component);
                        if (ky_2Array != null) break block5;
                        if (!bl2) break block6;
                        bl2 = component.isShowing();
                        if (ky_2Array != null) break block5;
                        if (!bl2) break block6;
                        if (!bl) break block7;
                        ((WC)Z.get(component)).q();
                        if (ky_2Array == null) break block8;
                    }
                    if ((qm_02 = ok_1.P(component)) != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll((Collection)k.get(component));
                        for (wd_0 wd_02 : arrayList) {
                            qm_02.b(wd_02);
                            if (ky_2Array == null) continue;
                        }
                    }
                }
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static void p(Component component) {
        ac_0.q();
        ac_0.M(FN.L(component));
    }

    protected static void M(Window window) {
        block4: {
            ky_2[] ky_2Array = ac_0.n();
            if (!window.isShowing()) break block4;
            block0: for (Component component : k.keySet()) {
                block6: {
                    Component component2;
                    block7: {
                        block5: {
                            component2 = FN.L(component);
                            if (ky_2Array != null) break block5;
                            if (component2 != window) break block6;
                            component2 = component;
                        }
                        if (ky_2Array != null) break block7;
                        if (!((Component)component2).isShowing()) break block6;
                        component2 = k.get(component);
                    }
                    for (wd_0 wd_02 : (List)((Object)component2)) {
                        ac_0.E(wd_02, false);
                        if (ky_2Array != null) continue block0;
                        if (ky_2Array == null) continue;
                    }
                }
                if (ky_2Array == null) continue;
            }
        }
    }

    public static void B() {
        Iterator iterator = k.keySet().iterator();
        ky_2[] ky_2Array = ac_0.n();
        block0: while (iterator.hasNext()) {
            block5: {
                Component component;
                block4: {
                    Component component2;
                    component = component2 = (Component)iterator.next();
                    if (ky_2Array != null) break block4;
                    if (!component.isShowing()) break block5;
                    component = k.get(component2);
                }
                for (wd_0 wd_02 : (List)((Object)component)) {
                    ac_0.E(wd_02, false);
                    if (ky_2Array != null) continue block0;
                    if (ky_2Array == null) continue;
                }
            }
            if (ky_2Array == null) continue;
        }
    }

    public static void H(JComponent jComponent) {
        ac_0.F(jComponent, GR.lR);
    }

    public static void F(JComponent jComponent, cs_0 cs_02) {
        w6_0.n(jComponent, cs_02, new FL(jComponent), true);
    }

    public static void o(Component component) {
        block4: {
            Object v2;
            ky_2[] ky_2Array;
            block3: {
                ky_2Array = ac_0.n();
                v2 = k.get(component);
                if (ky_2Array != null) break block3;
                if (v2 == null) break block4;
                v2 = k.get(component);
            }
            for (wd_0 wd_02 : aL.J((Collection)v2)) {
                ac_0.s(component, wd_02);
                if (ky_2Array == null) continue;
            }
        }
    }

    public static void Y(Component component, wd_0[] wd_0Array) {
        wd_0[] wd_0Array2 = wd_0Array;
        ky_2[] ky_2Array = ac_0.n();
        for (wd_0 wd_02 : wd_0Array2) {
            ac_0.s(component, wd_02);
            if (ky_2Array == null) continue;
        }
    }

    public static void S(Component component, List list) {
        Iterator iterator = list.iterator();
        ky_2[] ky_2Array = ac_0.n();
        while (iterator.hasNext()) {
            wd_0 wd_02 = (wd_0)iterator.next();
            ac_0.s(component, wd_02);
            if (ky_2Array == null) continue;
        }
    }

    public static void s(Component component, wd_0 wd_02) {
        block6: {
            Object object;
            int n10;
            block8: {
                ky_2[] ky_2Array;
                List list;
                block7: {
                    List list2;
                    block5: {
                        list = (List)k.get(component);
                        ky_2Array = ac_0.n();
                        list2 = list;
                        if (ky_2Array != null) break block5;
                        if (list2 == null) break block6;
                        list2 = list;
                    }
                    n10 = list2.contains(wd_02);
                    if (ky_2Array != null) break block7;
                    if (n10 == 0) break block6;
                    n10 = list.size();
                }
                if (ky_2Array != null) break block8;
                if (n10 <= 1) {
                    component.removeMouseListener((MouseListener)J.get(component));
                    J.remove(component);
                    ((WC)Z.get(component)).Y();
                    Z.remove(component);
                }
                list.remove(wd_02);
                wd_02.j();
                wd_02.R();
                object = list;
                if (ky_2Array != null) break block6;
                n10 = object.size();
            }
            if (n10 == 0) {
                object = k.remove(component);
            }
        }
    }

    public static wd_0 V(Component component, Point point, String string) {
        return ac_0.C(component, point, string, null);
    }

    public static wd_0 g(Component component, Point point, Icon icon, String string) {
        return ac_0.M(component, point, icon, string, null);
    }

    public static wd_0 C(Component component, Point point, String string, WF wF) {
        return ac_0.M(component, point, null, string, wF);
    }

    public static wd_0 M(Component component, Point point, Icon icon, String string, WF wF) {
        wd_0 wd_02 = new wd_0(component, icon, string, wF, h);
        wd_02.G(point);
        return ac_0.E(wd_02, true);
    }

    public static wd_0 e(Component component, Point point, JComponent jComponent) {
        return ac_0.e(component, point, jComponent, null);
    }

    public static wd_0 e(Component component, Point point, JComponent jComponent, WF wF) {
        wd_0 wd_02 = new wd_0(component, jComponent, wF, h);
        wd_02.G(point);
        return ac_0.E(wd_02, true);
    }

    public static wd_0 i(wd_0 wd_02) {
        return ac_0.E(wd_02, true);
    }

    protected static wd_0 E(wd_0 wd_02, boolean bl) {
        Window window;
        qm_0 qm_02;
        Component component;
        block6: {
            block7: {
                block5: {
                    ky_2[] ky_2Array;
                    block4: {
                        ky_2Array = ac_0.n();
                        component = wd_02.N();
                        if (ky_2Array != null) break block4;
                        if (component == null) break block5;
                        component = wd_02.N();
                    }
                    if (ky_2Array != null) break block6;
                    if (component.isShowing()) break block7;
                }
                return null;
            }
            component = wd_02.N();
        }
        if ((qm_02 = ok_1.P(window = FN.L(component))) == null) {
            return null;
        }
        gp_0 gp_02 = new gp_0(wd_02);
        qm_02.addComponentListener(gp_02);
        ru_2 ru_22 = wd_02.R() ? new ru_2(wd_02) : null;
        wd_02.e(new u5(wd_02, ru_22, qm_02, gp_02, bl));
        g.add(wd_02);
        qm_02.b(wd_02);
        return wd_02;
    }

    public static int S() {
        return Q;
    }

    public static void x(int n10) {
        Q = n10;
    }

    public static boolean N() {
        return a;
    }

    public static void X(boolean bl) {
        a = bl;
    }

    public static boolean y() {
        return C;
    }

    public static void C(boolean bl) {
        C = bl;
    }

    public static boolean M() {
        return h;
    }

    public static void p(boolean bl) {
        h = bl;
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
                if (ac_0.n() != null) {
                    ac_0.G(new ky_2[3]);
                }
                char[] cArray3 = "\r\u0011{AA$>\u0014\u001fzLR(<w\u001a}^E!/ *}@P?".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 63;
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
                            n17 = 102;
                            break;
                        }
                        case 1: {
                            n17 = 65;
                            break;
                        }
                        case 2: {
                            n17 = 43;
                            break;
                        }
                        case 3: {
                            n17 = 18;
                            break;
                        }
                        case 4: {
                            n17 = 10;
                            break;
                        }
                        case 5: {
                            n17 = 114;
                            break;
                        }
                        default: {
                            n17 = 113;
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
        long l2 = 301930025004794935L;
        long l3 = 0x832D6F10F6F85A7L ^ l2;
        long l4 = 4801841741682966092L;
        c = 0x42A3919F70A5FE4CL ^ l4;
        Q = (int)l3;
        a = true;
        C = true;
        h = false;
        k = new WeakHashMap();
        J = new WeakHashMap();
        Z = new WeakHashMap();
        g = new ArrayList();
        w = false;
    }

    public static void G(ky_2[] ky_2Array) {
        X = ky_2Array;
    }

    public static ky_2[] n() {
        return X;
    }
}

