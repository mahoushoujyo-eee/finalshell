/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.FV;
import com.GO;
import com.kp_0;
import com.ne_1;
import com.wx_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Shape;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.UIDefaults;

/*
 * Renamed from com.Xk
 */
public final class xk_0 {
    private static boolean p;
    private static boolean i;
    private static boolean D;
    private static final String[] a;
    private static final String[] b;
    private static final long c;

    public static boolean L() {
        return D;
    }

    public static void y(boolean bl) {
        D = bl;
    }

    public static void P(UIDefaults uIDefaults) {
        try {
            Class clazz = kp_0.e(xk_0.a(-3820, -8701));
            Object object = kp_0.O(clazz, xk_0.a(-3827, -11262));
            Class clazz2 = kp_0.l(clazz, xk_0.a(-3829, -25697));
            Object object2 = kp_0.Q(clazz2, xk_0.a(-3821, -10351), new Object[]{true});
            uIDefaults.put(object, object2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            ne_1.g(xk_0.class, classNotFoundException);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            ne_1.g(xk_0.class, noSuchFieldException);
        }
        catch (IllegalAccessException illegalAccessException) {
            ne_1.g(xk_0.class, illegalAccessException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            ne_1.g(xk_0.class, noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            ne_1.g(xk_0.class, invocationTargetException);
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean R() {
        try {
            block33: {
                block32: {
                    block31: {
                        block30: {
                            Boolean bl;
                            block29: {
                                Boolean bl2;
                                block28: {
                                    if (!p) return false;
                                    Class clazz = kp_0.e(xk_0.a(-3824, 6112));
                                    Class clazz2 = kp_0.l(clazz, xk_0.a(-3837, 23453));
                                    Object object = kp_0.O(clazz2, xk_0.a(-3822, -619));
                                    Boolean bl3 = (Boolean)kp_0.Q(clazz, xk_0.a(-3817, 14865), new Object[0]);
                                    bl2 = (Boolean)kp_0.Q(clazz, xk_0.a(-3826, 27650), new Object[]{wx_0.S()});
                                    bl = (Boolean)kp_0.Q(clazz, xk_0.a(-3830, -11675), new Object[]{object});
                                    if (bl3 == false) return false;
                                    break block28;
                                    catch (Throwable throwable) {
                                        throw xk_0.a(throwable);
                                    }
                                }
                                if (bl2 == false) return false;
                                break block29;
                                catch (Throwable throwable) {
                                    throw xk_0.a(throwable);
                                }
                            }
                            if (bl == false) return false;
                            break block30;
                            catch (Throwable throwable) {
                                throw xk_0.a(throwable);
                            }
                        }
                        if (wx_0.t()) return true;
                        break block31;
                        catch (Throwable throwable) {
                            throw xk_0.a(throwable);
                        }
                    }
                    if (wx_0.E()) return true;
                    break block32;
                    catch (Throwable throwable) {
                        throw xk_0.a(throwable);
                    }
                }
                if (wx_0.G()) return true;
                break block33;
                catch (Throwable throwable) {
                    throw xk_0.a(throwable);
                }
            }
            if (!wx_0.O()) return false;
            try {
                block34: {
                    break block34;
                    catch (Throwable throwable) {
                        throw xk_0.a(throwable);
                    }
                }
                if (!D) return false;
                return true;
            }
            catch (Throwable throwable) {
                throw xk_0.a(throwable);
            }
        }
        catch (Throwable throwable) {
            try {
                try {
                    try {
                        try {
                            try {
                                if (wx_0.t()) return true;
                                if (wx_0.E()) return true;
                            }
                            catch (Throwable throwable2) {
                                throw xk_0.a(throwable2);
                            }
                            if (wx_0.G()) return true;
                        }
                        catch (Throwable throwable3) {
                            throw xk_0.a(throwable3);
                        }
                        if (!wx_0.O()) return false;
                    }
                    catch (Throwable throwable4) {
                        throw xk_0.a(throwable4);
                    }
                    if (!D) return false;
                    return true;
                }
                catch (Throwable throwable5) {
                    throw xk_0.a(throwable5);
                }
            }
            catch (Throwable throwable6) {
                throw xk_0.a(throwable6);
            }
        }
    }

    public static void M(boolean bl) {
        p = bl;
    }

    /*
     * Loose catch block
     */
    public static boolean d() {
        String string = FV.D();
        try {
            boolean bl;
            block10: {
                block11: {
                    boolean bl2;
                    block14: {
                        block13: {
                            block12: {
                                try {
                                    bl = i;
                                    if (string != null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (Throwable throwable) {
                                    throw xk_0.a(throwable);
                                }
                                Class clazz = kp_0.e(xk_0.a(-3824, 6112));
                                Class clazz2 = kp_0.l(clazz, xk_0.a(-3840, -25718));
                                Object object = kp_0.O(clazz2, xk_0.a(-3836, 5137));
                                Boolean bl3 = (Boolean)kp_0.Q(clazz, xk_0.a(-3832, 15595), new Object[0]);
                                Boolean bl4 = (Boolean)kp_0.Q(clazz, xk_0.a(-3834, 28456), new Object[]{object});
                                bl2 = bl3;
                                if (string != null) break block12;
                                try {
                                    block15: {
                                        if (!bl2) break block13;
                                        break block15;
                                        catch (Throwable throwable) {
                                            throw xk_0.a(throwable);
                                        }
                                    }
                                    bl2 = bl4;
                                }
                                catch (Throwable throwable) {
                                    throw xk_0.a(throwable);
                                }
                            }
                            try {
                                if (string != null) break block14;
                                if (!bl2) break block13;
                            }
                            catch (Throwable throwable) {
                                throw xk_0.a(throwable);
                            }
                            bl2 = true;
                            break block14;
                        }
                        bl2 = false;
                    }
                    return bl2;
                }
                bl = false;
            }
            return bl;
        }
        catch (Throwable throwable) {
            return i;
        }
    }

    public static void D(boolean bl) {
        i = bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void Z(Window var0, boolean var1_1) {
        block24: {
            var2_2 = FV.D();
            if (var0 == null) break block24;
            try {
                block30: {
                    v0 = xk_0.R();
                    if (var2_2 != null) ** GOTO lbl17
                    break block30;
                    catch (Throwable v1) {
                        throw xk_0.a(v1);
                    }
                }
                if (!v0) break block24;
            }
            catch (Throwable v2) {
                throw xk_0.a(v2);
            }
            try {
                block29: {
                    block33: {
                        block28: {
                            block27: {
                                block26: {
                                    block25: {
                                        v0 = wx_0.R();
lbl17:
                                        // 2 sources

                                        try {
                                            if (var2_2 != null) break block25;
                                            if (v0) {
                                            }
                                            ** GOTO lbl29
                                        }
                                        catch (Throwable v3) {
                                            throw xk_0.a(v3);
                                        }
                                        v0 = var1_1;
                                    }
                                    try {
                                        xk_0.q(v0, var0);
                                        if (var2_2 == null) break block26;
lbl29:
                                        // 2 sources

                                        kp_0.x(xk_0.a(-3812, -801), xk_0.a(-3811, -5032), new Object[]{var0, var1_1});
                                    }
                                    catch (Throwable v4) {
                                        throw xk_0.a(v4);
                                    }
                                }
                                var3_3 = FN.a(var0);
                                v5 /* !! */  = var3_3;
                                if (var2_2 != null) break block27;
                                try {
                                    block31: {
                                        if (v5 /* !! */  == null) break block24;
                                        break block31;
                                        catch (Throwable v6) {
                                            throw xk_0.a(v6);
                                        }
                                    }
                                    xk_0.q(var1_1, var3_3);
                                    var3_3.setOpaque(var1_1);
                                    v5 /* !! */  = var3_3.getContentPane();
                                }
                                catch (Throwable v7) {
                                    throw xk_0.a(v7);
                                }
                            }
                            var4_5 = v5 /* !! */ ;
                            v8 = var4_5;
                            if (var2_2 != null) break block28;
                            try {
                                block32: {
                                    if (v8 == null) break block29;
                                    break block32;
                                    catch (Throwable v9) {
                                        throw xk_0.a(v9);
                                    }
                                }
                                xk_0.q(var1_1, var4_5);
                                v8 = var4_5;
                            }
                            catch (Throwable v10) {
                                throw xk_0.a(v10);
                            }
                        }
                        if (var2_2 != null) break block33;
                        try {
                            block34: {
                                if (!(v8 instanceof JComponent)) break block29;
                                break block34;
                                catch (Throwable v11) {
                                    throw xk_0.a(v11);
                                }
                            }
                            v8 = var4_5;
                        }
                        catch (Throwable v12) {
                            throw xk_0.a(v12);
                        }
                    }
                    ((JComponent)v8).setOpaque(var1_1);
                }
                var3_3.repaint();
            }
            catch (Throwable var3_4) {
                ne_1.g(xk_0.class, var3_4);
            }
        }
    }

    protected static void q(boolean bl, Component component) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Color color;
        try {
            color = bl ? GO.R : GO.l;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw xk_0.a(noSuchMethodException);
        }
        Color color2 = color;
        kp_0.j(component, xk_0.a(-3819, 15519), new Object[]{color2});
    }

    /*
     * Loose catch block
     */
    public static boolean X(Window window) {
        boolean bl;
        block15: {
            block14: {
                String string = FV.D();
                if (window == null) break block14;
                try {
                    block20: {
                        bl = xk_0.R();
                        if (string != null) break block15;
                        break block20;
                        catch (Throwable throwable) {
                            throw xk_0.a(throwable);
                        }
                    }
                    if (!bl) break block14;
                }
                catch (Throwable throwable) {
                    throw xk_0.a(throwable);
                }
                try {
                    boolean bl2;
                    block24: {
                        block19: {
                            Boolean bl3;
                            block18: {
                                Boolean bl4;
                                block23: {
                                    block21: {
                                        int n10;
                                        block16: {
                                            block17: {
                                                if (!wx_0.R()) break block21;
                                                Color color = (Color)kp_0.j(window, xk_0.a(-3823, -10917), new Object[0]);
                                                n10 = color.getAlpha();
                                                if (string != null) break block16;
                                                try {
                                                    block22: {
                                                        if (n10 != (int)c) break block17;
                                                        break block22;
                                                        catch (Throwable throwable) {
                                                            throw xk_0.a(throwable);
                                                        }
                                                    }
                                                    n10 = 1;
                                                    break block16;
                                                }
                                                catch (Throwable throwable) {
                                                    throw xk_0.a(throwable);
                                                }
                                            }
                                            n10 = 0;
                                        }
                                        bl4 = n10 != 0;
                                        if (string == null) break block23;
                                    }
                                    bl4 = (Boolean)kp_0.x(xk_0.a(-3824, 6112), xk_0.a(-3833, 2644), new Object[]{window});
                                }
                                try {
                                    bl3 = bl4;
                                    if (string != null) break block18;
                                    if (bl3 == null) break block19;
                                }
                                catch (Throwable throwable) {
                                    throw xk_0.a(throwable);
                                }
                                bl3 = bl4;
                            }
                            bl2 = bl3;
                            break block24;
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                catch (Throwable throwable) {
                    ne_1.g(xk_0.class, throwable);
                }
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public static void f(Window var0, float var1_1) {
        block10: {
            var2_2 = FV.D();
            if (var0 == null) break block10;
            try {
                block11: {
                    v0 = xk_0.R();
                    if (var2_2 != null) ** GOTO lbl18
                    break block11;
                    catch (Throwable v1) {
                        throw xk_0.a(v1);
                    }
                }
                if (!v0) break block10;
            }
            catch (Throwable v2) {
                throw xk_0.a(v2);
            }
            try {
                v0 = wx_0.R();
lbl18:
                // 3 sources

                if (!v0) ** GOTO lbl26
                try {
                    block12: {
                        kp_0.j(var0, xk_0.a(-3835, -7877), new Object[]{Float.valueOf(var1_1)});
                        if (var2_2 == null) break block10;
                        break block12;
                        catch (Throwable v3) {
                            throw xk_0.a(v3);
                        }
                    }
                    kp_0.x(xk_0.a(-3824, 6112), xk_0.a(-3839, 31444), new Object[]{var0, Float.valueOf(var1_1)});
                }
                catch (Throwable v4) {
                    throw xk_0.a(v4);
                }
            }
            catch (Throwable var3_3) {
                ne_1.g(xk_0.class, var3_3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static float m(Window var0) {
        block10: {
            var1_1 = FV.D();
            if (var0 == null) break block10;
            try {
                block13: {
                    v0 = xk_0.R();
                    if (var1_1 != null) ** GOTO lbl17
                    break block13;
                    catch (Throwable v1) {
                        throw xk_0.a(v1);
                    }
                }
                if (!v0) break block10;
            }
            catch (Throwable v2) {
                throw xk_0.a(v2);
            }
            try {
                block16: {
                    block12: {
                        block11: {
                            block15: {
                                block14: {
                                    v0 = wx_0.R();
lbl17:
                                    // 2 sources

                                    if (!v0) break block14;
                                    var2_2 = (Float)kp_0.j(var0, xk_0.a(-3825, 23962), new Object[0]);
                                    if (var1_1 == null) break block15;
                                }
                                var2_2 = (Float)kp_0.x(xk_0.a(-3824, 6112), xk_0.a(-3809, -4973), new Object[]{var0});
                            }
                            try {
                                v3 = var2_2;
                                if (var1_1 != null) break block11;
                                if (v3 == null) break block12;
                            }
                            catch (Throwable v4) {
                                throw xk_0.a(v4);
                            }
                            v3 = var2_2;
                        }
                        v5 = v3.floatValue();
                        break block16;
                    }
                    v5 = 1.0f;
                }
                return v5;
            }
            catch (Throwable var2_3) {
                ne_1.g(xk_0.class, var2_3);
            }
        }
        return 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    public static void v(Window var0, Shape var1_1) {
        block10: {
            var2_2 = FV.D();
            if (var0 == null) break block10;
            try {
                block11: {
                    v0 = xk_0.d();
                    if (var2_2 != null) ** GOTO lbl18
                    break block11;
                    catch (Throwable v1) {
                        throw xk_0.a(v1);
                    }
                }
                if (!v0) break block10;
            }
            catch (Throwable v2) {
                throw xk_0.a(v2);
            }
            try {
                v0 = wx_0.R();
lbl18:
                // 3 sources

                if (!v0) ** GOTO lbl26
                try {
                    block12: {
                        kp_0.j(var0, xk_0.a(-3838, -14158), new Object[]{var1_1});
                        if (var2_2 == null) break block10;
                        break block12;
                        catch (Throwable v3) {
                            throw xk_0.a(v3);
                        }
                    }
                    kp_0.x(xk_0.a(-3824, 6112), xk_0.a(-3828, 30907), new Object[]{var0, var1_1});
                }
                catch (Throwable v4) {
                    throw xk_0.a(v4);
                }
            }
            catch (Throwable var3_3) {
                ne_1.g(xk_0.class, var3_3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static Shape V(Window var0) {
        block8: {
            var1_1 = FV.D();
            if (var0 == null) break block8;
            try {
                block9: {
                    v0 = xk_0.d();
                    if (var1_1 != null) ** GOTO lbl17
                    break block9;
                    catch (Throwable v1) {
                        throw xk_0.a(v1);
                    }
                }
                if (!v0) break block8;
            }
            catch (Throwable v2) {
                throw xk_0.a(v2);
            }
            try {
                block11: {
                    block10: {
                        v0 = wx_0.R();
lbl17:
                        // 2 sources

                        if (!v0) break block10;
                        var2_2 = (Shape)kp_0.j(var0, xk_0.a(-3818, 13756), new Object[0]);
                        if (var1_1 == null) break block11;
                    }
                    var2_2 = (Shape)kp_0.x(xk_0.a(-3824, 6112), xk_0.a(-3810, 20731), new Object[]{var0});
                }
                return var2_2;
            }
            catch (Throwable var2_3) {
                ne_1.g(xk_0.class, var2_3);
            }
        }
        return null;
    }

    public static Popup L(Component component, Component component2, int n10, int n11) {
        return (Popup)kp_0.I(PopupFactory.getSharedInstance(), xk_0.a(-3831, 30453), new Object[]{component, component2, n10, n11, 2});
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[28];
                    var5_1 = 0;
                    var4_2 = "5\u00c8\u00ca\u0014{QZ\u00da\u00ac\u00cd+G\u00ae+\u0017f\u008c\u00a3\u0087:Q\u0080\u008aR\u00ac\u008d\u0005\u00e8\u0083.y\u00f3\u00fd\u009e@\u00dc>/\n\u00cb\u0092o\u00ad\u0096\u00816{\u0097-\u0014\u009d\u00bc\u00c4S8\u009b\u00db\u0003\u00e3\u008e\u00e3\u00bf\u00d94\u0083\u00d4\u0007\u00cfG\u00b3\f~3\u000fM.\u0095T_\u001e\u00f5\u0010\u0095\b\u00b8\u00ad\u0001VCa\u0084k\u00109\u00bc1pD.Qf\u009f~c\u00f9\u0082\u00e2DK\f\u00cd\u00f1y\u0015\u00e0\u009e\u008d>%\u00d9w\u0010\n\u00c7\u00afx\ntuj\u00e5\u001c\u00fe\u0015#n\u000b\u00db/\u00da\"\u00fb\u0006\u0082\u0007\u00c0\u00b9;\u0014z\u00a6\u001a9\u0091\u0095\u0014\u0011\u00cak\u001dm\u00d6\u00ed\u00b9\u0019\u00aeOl\u00f9|\u00e9\u00e4\u00c3\u00dcx\u0013\u000e\u00e6\u009e\u00ca4;\u00a6\u00bewb@\u00c4\u00a1~\u00e5\nZ\u007f\t\u009av\u001d\tX\r\u00b8\u0017M\u00cb\u00c6o\u0096L\u0015)\u00e0\u00d8\u00db\u008b\"RwC\u00d8\u00ba\u00fb\u00a8p#\u00ba\b\n\u00a2\u00c1\u00b4\\O\u0085\u0088\u0018\nn-\u00c0\u0087\u00cb\u00c5\u0089C\u00bfI\u0013\u00fe\u008b\u0093\u00ab\u00f3E$Jq\u00d0]\u00fb\u001d\u00f6\u0012\u00b2Ot:\u00bb\u00b7\u008bb\u00b7\u00ef;\u00cb`\u00d1\u00cd\"\u00e2m\u00f9\u00e1\\\u00e8\u00e3\u00e0y\u00bc\u00de\b\u0087\u0015pAm\u0083A7\r \u00bc\u0012e(6\u00da\u00c1\u0005\u00a3\u0090i^\u0019\u0086\u008c\u00dc\u001d\u00ba\u00cc\u00da\u0001R\u00d2\u00eb7\u00de\u00e8\u0097\u00c1r\u00d7)$I\u00c6\u009c\u0090\u0011\r&KD\u0098\u00c2\u00dd\u00adr\"\u000f\u00a9\u0016\n\u0014m\u00c9\u00da\u00fd\u00fbN\u00a3\u00b9\u00ec\u00d9\u0002U\u00e5i\u0004\u007f\u00f7\u00baY\u001d\r\u0090=\u0092U80\u00d8\u0001E\u00bb\u0098j_\u0018\u00a4\u00b8\u0089\u00c2s5\u00e4<td\u00ce\u00ca\u0091\u001c`A\u00d9\u00c7\\&\u00e7\u0086I\u0098\u0010 l\u0084j\u00f2m\u0087\u000eEs8X\u00e9\u00d6)\u00cd\u000e_\u00c1k\u00df\u000f\u00db8\u00d8\u00b2\u00b5\u00de\u001f=2";
                    var6_3 = "5\u00c8\u00ca\u0014{QZ\u00da\u00ac\u00cd+G\u00ae+\u0017f\u008c\u00a3\u0087:Q\u0080\u008aR\u00ac\u008d\u0005\u00e8\u0083.y\u00f3\u00fd\u009e@\u00dc>/\n\u00cb\u0092o\u00ad\u0096\u00816{\u0097-\u0014\u009d\u00bc\u00c4S8\u009b\u00db\u0003\u00e3\u008e\u00e3\u00bf\u00d94\u0083\u00d4\u0007\u00cfG\u00b3\f~3\u000fM.\u0095T_\u001e\u00f5\u0010\u0095\b\u00b8\u00ad\u0001VCa\u0084k\u00109\u00bc1pD.Qf\u009f~c\u00f9\u0082\u00e2DK\f\u00cd\u00f1y\u0015\u00e0\u009e\u008d>%\u00d9w\u0010\n\u00c7\u00afx\ntuj\u00e5\u001c\u00fe\u0015#n\u000b\u00db/\u00da\"\u00fb\u0006\u0082\u0007\u00c0\u00b9;\u0014z\u00a6\u001a9\u0091\u0095\u0014\u0011\u00cak\u001dm\u00d6\u00ed\u00b9\u0019\u00aeOl\u00f9|\u00e9\u00e4\u00c3\u00dcx\u0013\u000e\u00e6\u009e\u00ca4;\u00a6\u00bewb@\u00c4\u00a1~\u00e5\nZ\u007f\t\u009av\u001d\tX\r\u00b8\u0017M\u00cb\u00c6o\u0096L\u0015)\u00e0\u00d8\u00db\u008b\"RwC\u00d8\u00ba\u00fb\u00a8p#\u00ba\b\n\u00a2\u00c1\u00b4\\O\u0085\u0088\u0018\nn-\u00c0\u0087\u00cb\u00c5\u0089C\u00bfI\u0013\u00fe\u008b\u0093\u00ab\u00f3E$Jq\u00d0]\u00fb\u001d\u00f6\u0012\u00b2Ot:\u00bb\u00b7\u008bb\u00b7\u00ef;\u00cb`\u00d1\u00cd\"\u00e2m\u00f9\u00e1\\\u00e8\u00e3\u00e0y\u00bc\u00de\b\u0087\u0015pAm\u0083A7\r \u00bc\u0012e(6\u00da\u00c1\u0005\u00a3\u0090i^\u0019\u0086\u008c\u00dc\u001d\u00ba\u00cc\u00da\u0001R\u00d2\u00eb7\u00de\u00e8\u0097\u00c1r\u00d7)$I\u00c6\u009c\u0090\u0011\r&KD\u0098\u00c2\u00dd\u00adr\"\u000f\u00a9\u0016\n\u0014m\u00c9\u00da\u00fd\u00fbN\u00a3\u00b9\u00ec\u00d9\u0002U\u00e5i\u0004\u007f\u00f7\u00baY\u001d\r\u0090=\u0092U80\u00d8\u0001E\u00bb\u0098j_\u0018\u00a4\u00b8\u0089\u00c2s5\u00e4<td\u00ce\u00ca\u0091\u001c`A\u00d9\u00c7\\&\u00e7\u0086I\u0098\u0010 l\u0084j\u00f2m\u0087\u000eEs8X\u00e9\u00d6)\u00cd\u000e_\u00c1k\u00df\u000f\u00db8\u00d8\u00b2\u00b5\u00de\u001f=2".length();
                    var3_4 = 14;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 18;
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
                        var4_2 = "\u00b9\u0012\u0005\u0081\u00e64!\u0001\u00b5\u00b6\u0002\u00c4\u0098}b\u0018\u001a\u0010z\u00f3)7\u008bX\u00bd\u00cc\u00d3\u00fb\u0016\u001e\u00b4%go\u00af\u0017\u00bd\u0084&\u00fc";
                        var6_3 = "\u00b9\u0012\u0005\u0081\u00e64!\u0001\u00b5\u00b6\u0002\u00c4\u0098}b\u0018\u001a\u0010z\u00f3)7\u008bX\u00bd\u00cc\u00d3\u00fb\u0016\u001e\u00b4%go\u00af\u0017\u00bd\u0084&\u00fc".length();
                        var3_4 = 15;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 50;
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
                                v15 = 82;
                                break;
                            }
                            case 1: {
                                v15 = 123;
                                break;
                            }
                            case 2: {
                                v15 = 101;
                                break;
                            }
                            case 3: {
                                v15 = 70;
                                break;
                            }
                            case 4: {
                                v15 = 13;
                                break;
                            }
                            case 5: {
                                v15 = 107;
                                break;
                            }
                            default: {
                                v15 = 8;
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
            xk_0.a = var7;
            xk_0.b = new String[28];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3481401435897593168L;
        ** while (true)
        xk_0.c = -6840214779589165649L ^ var0_7;
        xk_0.p = true;
        xk_0.i = false;
        xk_0.D = false;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF107) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 252;
                    break;
                }
                case 1: {
                    n14 = 49;
                    break;
                }
                case 2: {
                    n14 = 93;
                    break;
                }
                case 3: {
                    n14 = 141;
                    break;
                }
                case 4: {
                    n14 = 122;
                    break;
                }
                case 5: {
                    n14 = 27;
                    break;
                }
                case 6: {
                    n14 = 156;
                    break;
                }
                case 7: {
                    n14 = 34;
                    break;
                }
                case 8: {
                    n14 = 173;
                    break;
                }
                case 9: {
                    n14 = 21;
                    break;
                }
                case 10: {
                    n14 = 253;
                    break;
                }
                case 11: {
                    n14 = 137;
                    break;
                }
                case 12: {
                    n14 = 109;
                    break;
                }
                case 13: {
                    n14 = 1;
                    break;
                }
                case 14: {
                    n14 = 191;
                    break;
                }
                case 15: {
                    n14 = 114;
                    break;
                }
                case 16: {
                    n14 = 134;
                    break;
                }
                case 17: {
                    n14 = 204;
                    break;
                }
                case 18: {
                    n14 = 182;
                    break;
                }
                case 19: {
                    n14 = 147;
                    break;
                }
                case 20: {
                    n14 = 70;
                    break;
                }
                case 21: {
                    n14 = 19;
                    break;
                }
                case 22: {
                    n14 = 133;
                    break;
                }
                case 23: {
                    n14 = 53;
                    break;
                }
                case 24: {
                    n14 = 69;
                    break;
                }
                case 25: {
                    n14 = 199;
                    break;
                }
                case 26: {
                    n14 = 68;
                    break;
                }
                case 27: {
                    n14 = 104;
                    break;
                }
                case 28: {
                    n14 = 55;
                    break;
                }
                case 29: {
                    n14 = 251;
                    break;
                }
                case 30: {
                    n14 = 246;
                    break;
                }
                case 31: {
                    n14 = 131;
                    break;
                }
                case 32: {
                    n14 = 22;
                    break;
                }
                case 33: {
                    n14 = 178;
                    break;
                }
                case 34: {
                    n14 = 52;
                    break;
                }
                case 35: {
                    n14 = 64;
                    break;
                }
                case 36: {
                    n14 = 83;
                    break;
                }
                case 37: {
                    n14 = 207;
                    break;
                }
                case 38: {
                    n14 = 217;
                    break;
                }
                case 39: {
                    n14 = 212;
                    break;
                }
                case 40: {
                    n14 = 181;
                    break;
                }
                case 41: {
                    n14 = 30;
                    break;
                }
                case 42: {
                    n14 = 159;
                    break;
                }
                case 43: {
                    n14 = 31;
                    break;
                }
                case 44: {
                    n14 = 218;
                    break;
                }
                case 45: {
                    n14 = 24;
                    break;
                }
                case 46: {
                    n14 = 222;
                    break;
                }
                case 47: {
                    n14 = 232;
                    break;
                }
                case 48: {
                    n14 = 216;
                    break;
                }
                case 49: {
                    n14 = 152;
                    break;
                }
                case 50: {
                    n14 = 220;
                    break;
                }
                case 51: {
                    n14 = 125;
                    break;
                }
                case 52: {
                    n14 = 90;
                    break;
                }
                case 53: {
                    n14 = 112;
                    break;
                }
                case 54: {
                    n14 = 171;
                    break;
                }
                case 55: {
                    n14 = 48;
                    break;
                }
                case 56: {
                    n14 = 243;
                    break;
                }
                case 57: {
                    n14 = 254;
                    break;
                }
                case 58: {
                    n14 = 221;
                    break;
                }
                case 59: {
                    n14 = 195;
                    break;
                }
                case 60: {
                    n14 = 225;
                    break;
                }
                case 61: {
                    n14 = 233;
                    break;
                }
                case 62: {
                    n14 = 51;
                    break;
                }
                case 63: {
                    n14 = 229;
                    break;
                }
                case 64: {
                    n14 = 239;
                    break;
                }
                case 65: {
                    n14 = 63;
                    break;
                }
                case 66: {
                    n14 = 96;
                    break;
                }
                case 67: {
                    n14 = 209;
                    break;
                }
                case 68: {
                    n14 = 85;
                    break;
                }
                case 69: {
                    n14 = 203;
                    break;
                }
                case 70: {
                    n14 = 149;
                    break;
                }
                case 71: {
                    n14 = 192;
                    break;
                }
                case 72: {
                    n14 = 237;
                    break;
                }
                case 73: {
                    n14 = 58;
                    break;
                }
                case 74: {
                    n14 = 200;
                    break;
                }
                case 75: {
                    n14 = 188;
                    break;
                }
                case 76: {
                    n14 = 62;
                    break;
                }
                case 77: {
                    n14 = 35;
                    break;
                }
                case 78: {
                    n14 = 80;
                    break;
                }
                case 79: {
                    n14 = 223;
                    break;
                }
                case 80: {
                    n14 = 5;
                    break;
                }
                case 81: {
                    n14 = 242;
                    break;
                }
                case 82: {
                    n14 = 106;
                    break;
                }
                case 83: {
                    n14 = 238;
                    break;
                }
                case 84: {
                    n14 = 227;
                    break;
                }
                case 85: {
                    n14 = 33;
                    break;
                }
                case 86: {
                    n14 = 59;
                    break;
                }
                case 87: {
                    n14 = 148;
                    break;
                }
                case 88: {
                    n14 = 107;
                    break;
                }
                case 89: {
                    n14 = 157;
                    break;
                }
                case 90: {
                    n14 = 91;
                    break;
                }
                case 91: {
                    n14 = 105;
                    break;
                }
                case 92: {
                    n14 = 37;
                    break;
                }
                case 93: {
                    n14 = 120;
                    break;
                }
                case 94: {
                    n14 = 166;
                    break;
                }
                case 95: {
                    n14 = 245;
                    break;
                }
                case 96: {
                    n14 = 140;
                    break;
                }
                case 97: {
                    n14 = 46;
                    break;
                }
                case 98: {
                    n14 = 8;
                    break;
                }
                case 99: {
                    n14 = 248;
                    break;
                }
                case 100: {
                    n14 = 115;
                    break;
                }
                case 101: {
                    n14 = 142;
                    break;
                }
                case 102: {
                    n14 = 144;
                    break;
                }
                case 103: {
                    n14 = 100;
                    break;
                }
                case 104: {
                    n14 = 196;
                    break;
                }
                case 105: {
                    n14 = 103;
                    break;
                }
                case 106: {
                    n14 = 54;
                    break;
                }
                case 107: {
                    n14 = 6;
                    break;
                }
                case 108: {
                    n14 = 170;
                    break;
                }
                case 109: {
                    n14 = 129;
                    break;
                }
                case 110: {
                    n14 = 119;
                    break;
                }
                case 111: {
                    n14 = 57;
                    break;
                }
                case 112: {
                    n14 = 211;
                    break;
                }
                case 113: {
                    n14 = 13;
                    break;
                }
                case 114: {
                    n14 = 247;
                    break;
                }
                case 115: {
                    n14 = 82;
                    break;
                }
                case 116: {
                    n14 = 26;
                    break;
                }
                case 117: {
                    n14 = 56;
                    break;
                }
                case 118: {
                    n14 = 101;
                    break;
                }
                case 119: {
                    n14 = 180;
                    break;
                }
                case 120: {
                    n14 = 160;
                    break;
                }
                case 121: {
                    n14 = 202;
                    break;
                }
                case 122: {
                    n14 = 198;
                    break;
                }
                case 123: {
                    n14 = 41;
                    break;
                }
                case 124: {
                    n14 = 215;
                    break;
                }
                case 125: {
                    n14 = 135;
                    break;
                }
                case 126: {
                    n14 = 127;
                    break;
                }
                case 127: {
                    n14 = 161;
                    break;
                }
                case 128: {
                    n14 = 75;
                    break;
                }
                case 129: {
                    n14 = 153;
                    break;
                }
                case 130: {
                    n14 = 197;
                    break;
                }
                case 131: {
                    n14 = 12;
                    break;
                }
                case 132: {
                    n14 = 79;
                    break;
                }
                case 133: {
                    n14 = 14;
                    break;
                }
                case 134: {
                    n14 = 18;
                    break;
                }
                case 135: {
                    n14 = 186;
                    break;
                }
                case 136: {
                    n14 = 235;
                    break;
                }
                case 137: {
                    n14 = 231;
                    break;
                }
                case 138: {
                    n14 = 42;
                    break;
                }
                case 139: {
                    n14 = 67;
                    break;
                }
                case 140: {
                    n14 = 25;
                    break;
                }
                case 141: {
                    n14 = 177;
                    break;
                }
                case 142: {
                    n14 = 40;
                    break;
                }
                case 143: {
                    n14 = 38;
                    break;
                }
                case 144: {
                    n14 = 169;
                    break;
                }
                case 145: {
                    n14 = 15;
                    break;
                }
                case 146: {
                    n14 = 60;
                    break;
                }
                case 147: {
                    n14 = 36;
                    break;
                }
                case 148: {
                    n14 = 87;
                    break;
                }
                case 149: {
                    n14 = 240;
                    break;
                }
                case 150: {
                    n14 = 136;
                    break;
                }
                case 151: {
                    n14 = 185;
                    break;
                }
                case 152: {
                    n14 = 123;
                    break;
                }
                case 153: {
                    n14 = 167;
                    break;
                }
                case 154: {
                    n14 = 128;
                    break;
                }
                case 155: {
                    n14 = 138;
                    break;
                }
                case 156: {
                    n14 = 95;
                    break;
                }
                case 157: {
                    n14 = 244;
                    break;
                }
                case 158: {
                    n14 = 0;
                    break;
                }
                case 159: {
                    n14 = 86;
                    break;
                }
                case 160: {
                    n14 = 108;
                    break;
                }
                case 161: {
                    n14 = 183;
                    break;
                }
                case 162: {
                    n14 = 92;
                    break;
                }
                case 163: {
                    n14 = 9;
                    break;
                }
                case 164: {
                    n14 = 172;
                    break;
                }
                case 165: {
                    n14 = 158;
                    break;
                }
                case 166: {
                    n14 = 230;
                    break;
                }
                case 167: {
                    n14 = 76;
                    break;
                }
                case 168: {
                    n14 = 84;
                    break;
                }
                case 169: {
                    n14 = 139;
                    break;
                }
                case 170: {
                    n14 = 65;
                    break;
                }
                case 171: {
                    n14 = 155;
                    break;
                }
                case 172: {
                    n14 = 73;
                    break;
                }
                case 173: {
                    n14 = 44;
                    break;
                }
                case 174: {
                    n14 = 189;
                    break;
                }
                case 175: {
                    n14 = 165;
                    break;
                }
                case 176: {
                    n14 = 168;
                    break;
                }
                case 177: {
                    n14 = 111;
                    break;
                }
                case 178: {
                    n14 = 32;
                    break;
                }
                case 179: {
                    n14 = 205;
                    break;
                }
                case 180: {
                    n14 = 150;
                    break;
                }
                case 181: {
                    n14 = 151;
                    break;
                }
                case 182: {
                    n14 = 50;
                    break;
                }
                case 183: {
                    n14 = 11;
                    break;
                }
                case 184: {
                    n14 = 20;
                    break;
                }
                case 185: {
                    n14 = 23;
                    break;
                }
                case 186: {
                    n14 = 29;
                    break;
                }
                case 187: {
                    n14 = 213;
                    break;
                }
                case 188: {
                    n14 = 145;
                    break;
                }
                case 189: {
                    n14 = 234;
                    break;
                }
                case 190: {
                    n14 = 250;
                    break;
                }
                case 191: {
                    n14 = 66;
                    break;
                }
                case 192: {
                    n14 = 255;
                    break;
                }
                case 193: {
                    n14 = 228;
                    break;
                }
                case 194: {
                    n14 = 74;
                    break;
                }
                case 195: {
                    n14 = 126;
                    break;
                }
                case 196: {
                    n14 = 17;
                    break;
                }
                case 197: {
                    n14 = 194;
                    break;
                }
                case 198: {
                    n14 = 78;
                    break;
                }
                case 199: {
                    n14 = 28;
                    break;
                }
                case 200: {
                    n14 = 184;
                    break;
                }
                case 201: {
                    n14 = 190;
                    break;
                }
                case 202: {
                    n14 = 210;
                    break;
                }
                case 203: {
                    n14 = 163;
                    break;
                }
                case 204: {
                    n14 = 224;
                    break;
                }
                case 205: {
                    n14 = 121;
                    break;
                }
                case 206: {
                    n14 = 162;
                    break;
                }
                case 207: {
                    n14 = 226;
                    break;
                }
                case 208: {
                    n14 = 164;
                    break;
                }
                case 209: {
                    n14 = 81;
                    break;
                }
                case 210: {
                    n14 = 102;
                    break;
                }
                case 211: {
                    n14 = 45;
                    break;
                }
                case 212: {
                    n14 = 154;
                    break;
                }
                case 213: {
                    n14 = 7;
                    break;
                }
                case 214: {
                    n14 = 72;
                    break;
                }
                case 215: {
                    n14 = 113;
                    break;
                }
                case 216: {
                    n14 = 179;
                    break;
                }
                case 217: {
                    n14 = 174;
                    break;
                }
                case 218: {
                    n14 = 146;
                    break;
                }
                case 219: {
                    n14 = 214;
                    break;
                }
                case 220: {
                    n14 = 99;
                    break;
                }
                case 221: {
                    n14 = 132;
                    break;
                }
                case 222: {
                    n14 = 175;
                    break;
                }
                case 223: {
                    n14 = 71;
                    break;
                }
                case 224: {
                    n14 = 110;
                    break;
                }
                case 225: {
                    n14 = 219;
                    break;
                }
                case 226: {
                    n14 = 130;
                    break;
                }
                case 227: {
                    n14 = 94;
                    break;
                }
                case 228: {
                    n14 = 89;
                    break;
                }
                case 229: {
                    n14 = 206;
                    break;
                }
                case 230: {
                    n14 = 10;
                    break;
                }
                case 231: {
                    n14 = 236;
                    break;
                }
                case 232: {
                    n14 = 2;
                    break;
                }
                case 233: {
                    n14 = 201;
                    break;
                }
                case 234: {
                    n14 = 187;
                    break;
                }
                case 235: {
                    n14 = 176;
                    break;
                }
                case 236: {
                    n14 = 47;
                    break;
                }
                case 237: {
                    n14 = 98;
                    break;
                }
                case 238: {
                    n14 = 143;
                    break;
                }
                case 239: {
                    n14 = 88;
                    break;
                }
                case 240: {
                    n14 = 208;
                    break;
                }
                case 241: {
                    n14 = 118;
                    break;
                }
                case 242: {
                    n14 = 124;
                    break;
                }
                case 243: {
                    n14 = 61;
                    break;
                }
                case 244: {
                    n14 = 77;
                    break;
                }
                case 245: {
                    n14 = 193;
                    break;
                }
                case 246: {
                    n14 = 241;
                    break;
                }
                case 247: {
                    n14 = 43;
                    break;
                }
                case 248: {
                    n14 = 39;
                    break;
                }
                case 249: {
                    n14 = 3;
                    break;
                }
                case 250: {
                    n14 = 249;
                    break;
                }
                case 251: {
                    n14 = 97;
                    break;
                }
                case 252: {
                    n14 = 16;
                    break;
                }
                case 253: {
                    n14 = 4;
                    break;
                }
                case 254: {
                    n14 = 116;
                    break;
                }
                default: {
                    n14 = 117;
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
            xk_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

