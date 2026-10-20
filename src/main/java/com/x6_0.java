/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BN;
import com.GA;
import com.KH;
import com.WG;
import com.XS;
import com.c1_0;
import com.kp_0;
import com.ky_2;
import com.ne_1;
import com.og_2;
import com.ox_2;
import com.wx_0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.x6
 */
public abstract class x6_0 {
    private static int e;
    private static final String[] a;
    private static final String[] b;

    public abstract String z();

    public abstract String P();

    public abstract String O();

    public abstract String A();

    public abstract List f();

    public boolean T() {
        boolean bl;
        int n10;
        block22: {
            block21: {
                block23: {
                    List list;
                    block20: {
                        int n11;
                        block19: {
                            block18: {
                                List list2;
                                block17: {
                                    list = this.f();
                                    n10 = x6_0.B();
                                    try {
                                        list2 = list;
                                        if (n10 == 0) break block17;
                                        if (list2 == null) break block18;
                                    }
                                    catch (WG wG) {
                                        throw x6_0.a(wG);
                                    }
                                    list2 = list;
                                }
                                try {
                                    n11 = list2.size();
                                    if (n10 == 0) break block19;
                                    if (n11 <= 0) break block18;
                                }
                                catch (WG wG) {
                                    throw x6_0.a(wG);
                                }
                                n11 = 1;
                                break block19;
                            }
                            n11 = 0;
                        }
                        boolean bl2 = n11;
                        try {
                            try {
                                bl = bl2;
                                if (n10 == 0) break block20;
                                if (!bl) break block21;
                            }
                            catch (WG wG) {
                                throw x6_0.a(wG);
                            }
                            bl = list.contains(x6_0.a(-28914, 28795));
                        }
                        catch (WG wG) {
                            throw x6_0.a(wG);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n10 == 0) break block22;
                                if (bl) break block23;
                            }
                            catch (WG wG) {
                                throw x6_0.a(wG);
                            }
                            bl = list.contains(wx_0.W());
                            if (n10 == 0) break block22;
                        }
                        catch (WG wG) {
                            throw x6_0.a(wG);
                        }
                        if (!bl) break block21;
                    }
                    catch (WG wG) {
                        throw x6_0.a(wG);
                    }
                }
                bl = true;
                break block22;
            }
            bl = false;
        }
        try {
            if (ky_2.F() != null) {
                x6_0.x(++n10);
            }
        }
        catch (WG wG) {
            throw x6_0.a(wG);
        }
        return bl;
    }

    public abstract String M();

    public abstract BN G(JComponent var1, KH var2);

    protected KH Q(JComponent jComponent) {
        KH kH;
        block4: {
            KH kH2;
            block5: {
                kH2 = KH.t(jComponent.getUIClassID());
                int n10 = x6_0.B();
                try {
                    try {
                        kH = kH2;
                        if (n10 == 0) break block4;
                        if (kH != null) break block5;
                    }
                    catch (WG wG) {
                        throw x6_0.a(wG);
                    }
                    throw new WG(x6_0.a(-28920, 21458) + jComponent.getUIClassID());
                }
                catch (WG wG) {
                    throw x6_0.a(wG);
                }
            }
            kH = kH2;
        }
        return kH;
    }

    protected BN D(JComponent jComponent) {
        return this.e(jComponent, this.Q(jComponent));
    }

    protected BN e(JComponent jComponent, KH kH) {
        BN bN;
        block4: {
            BN bN2;
            block5: {
                bN2 = this.G(jComponent, kH);
                int n10 = x6_0.A();
                try {
                    try {
                        bN = bN2;
                        if (n10 != 0) break block4;
                        if (bN != null) break block5;
                    }
                    catch (WG wG) {
                        throw x6_0.a(wG);
                    }
                    throw new WG(x6_0.a(-28917, 32342) + jComponent.getUIClassID());
                }
                catch (WG wG) {
                    throw x6_0.a(wG);
                }
            }
            bN = bN2;
        }
        return bN;
    }

    protected ComponentUI g(JComponent jComponent) {
        ComponentUI componentUI;
        block4: {
            ComponentUI componentUI2;
            block5: {
                componentUI2 = GA.Z(jComponent);
                int n10 = x6_0.B();
                try {
                    try {
                        componentUI = componentUI2;
                        if (n10 == 0) break block4;
                        if (componentUI != null) break block5;
                    }
                    catch (WG wG) {
                        throw x6_0.a(wG);
                    }
                    throw new WG(x6_0.a(-28916, -6666) + jComponent);
                }
                catch (WG wG) {
                    throw x6_0.a(wG);
                }
            }
            componentUI = componentUI2;
        }
        return componentUI;
    }

    public boolean v(JComponent jComponent) {
        return this.E(jComponent, ox_2.A(jComponent), ox_2.x(jComponent));
    }

    /*
     * Unable to fully structure code
     */
    public boolean E(JComponent var1_1, Map var2_2, Map var3_3) {
        var4_4 = x6_0.B();
        try {
            block17: {
                var5_5 = this.Q(var1_1);
                var6_7 = this.e(var1_1, var5_5);
                var7_8 = this.g(var1_1);
                for (XS var9_10 : var6_7.X()) {
                    block19: {
                        block18: {
                            block21: {
                                block20: {
                                    var10_11 = var9_10.x();
                                    if (var4_4 == 0) break block17;
                                    v0 = var3_3;
                                    if (var4_4 == 0) break block18;
                                    break block20;
                                    catch (Throwable v1) {
                                        throw x6_0.a(v1);
                                    }
                                }
                                if (v0 == null) ** GOTO lbl38
                                break block21;
                                catch (Throwable v2) {
                                    throw x6_0.a(v2);
                                }
                            }
                            try {
                                block22: {
                                    v0 = var3_3;
                                    if (var4_4 == 0) break block18;
                                    break block22;
                                    catch (Throwable v3) {
                                        throw x6_0.a(v3);
                                    }
                                }
                                if (v0.containsKey(var10_11)) {
                                }
                                ** GOTO lbl38
                            }
                            catch (Throwable v4) {
                                throw x6_0.a(v4);
                            }
                            var11_12 = (og_2)var3_3.get(var10_11);
                            try {
                                if (var4_4 != 0) break block19;
lbl38:
                                // 3 sources

                                v0 = kp_0.y(var9_10.b(), new Object[0]);
                            }
                            catch (Throwable v5) {
                                throw x6_0.a(v5);
                            }
                        }
                        var11_12 = (og_2)v0;
                        try {
                            if (var11_12 == null) {
                                throw new WG(x6_0.a(-28923, 5472) + var9_10.b() + x6_0.a(-28913, 22161) + var1_1);
                            }
                        }
                        catch (Throwable v6) {
                            throw x6_0.a(v6);
                        }
                        var12_13 = this.Q(var2_2, var9_10, var10_11);
                        this.I(var11_12, var9_10.b(), (Map)var12_13);
                    }
                    var12_13 = kp_0.W(var10_11);
                    kp_0.j(var7_8, (String)var12_13, new Object[]{var11_12});
                    if (var4_4 != 0) continue;
                }
                this.I(var7_8, var6_7.Y(), null);
                this.I(var1_1, var6_7.G(), null);
            }
            return true;
        }
        catch (Throwable var5_6) {
            ne_1.g(this, var5_6);
            return false;
        }
    }

    protected Map Q(Map map, XS xS2, String string) {
        Map map2;
        block6: {
            block5: {
                String string2;
                Map map3;
                block4: {
                    int n10 = x6_0.A();
                    try {
                        map3 = map;
                        if (n10 != 0) break block4;
                        if (map3 == null) break block5;
                    }
                    catch (WG wG) {
                        throw x6_0.a(wG);
                    }
                    map3 = map;
                }
                try {
                    string2 = xS2.p() ? null : string;
                }
                catch (WG wG) {
                    throw x6_0.a(wG);
                }
                map2 = (Map)map3.get(string2);
                break block6;
            }
            map2 = null;
        }
        return map2;
    }

    public boolean d(JComponent jComponent) {
        int n10 = x6_0.B();
        try {
            BN bN = this.D(jComponent);
            ComponentUI componentUI = this.g(jComponent);
            for (XS xS2 : bN.X()) {
                String string = kp_0.W(xS2.x());
                kp_0.j(componentUI, string, new Object[]{null});
                if (n10 != 0) continue;
            }
            return true;
        }
        catch (Throwable throwable) {
            ne_1.g(this, throwable);
            return false;
        }
    }

    public Object J(JComponent jComponent, String string) {
        return this.w(jComponent, null, string);
    }

    public Object w(JComponent jComponent, String string, String string2) {
        block8: {
            Object object;
            block7: {
                og_2 og_22 = this.N(jComponent, string);
                int n10 = x6_0.A();
                try {
                    try {
                        object = og_22;
                        if (n10 != 0) break block7;
                        if (object == null) break block8;
                    }
                    catch (WG wG) {
                        throw x6_0.a(wG);
                    }
                    object = x6_0.Z(og_22, string2);
                }
                catch (WG wG) {
                    throw x6_0.a(wG);
                }
            }
            return object;
        }
        try {
            if (!ox_2.O()) {
                return null;
            }
        }
        catch (WG wG) {
            throw x6_0.a(wG);
        }
        throw new WG(x6_0.a(-28919, 2445) + string + x6_0.a(-28924, 29804) + jComponent);
    }

    public boolean M(JComponent jComponent, String string, Object object) {
        return this.i(jComponent, null, string, object);
    }

    public boolean i(JComponent jComponent, String string, String string2, Object object) {
        block7: {
            boolean bl;
            block6: {
                int n10;
                block5: {
                    og_2 og_22;
                    block4: {
                        og_2 og_23 = this.N(jComponent, string);
                        n10 = x6_0.A();
                        try {
                            og_22 = og_23;
                            if (n10 != 0) break block4;
                            if (og_22 == null) break block5;
                        }
                        catch (WG wG) {
                            throw x6_0.a(wG);
                        }
                        og_22 = og_23;
                    }
                    return x6_0.M(og_22, string2, object);
                }
                try {
                    bl = ox_2.O();
                    if (n10 != 0) break block6;
                    if (bl) break block7;
                }
                catch (WG wG) {
                    throw x6_0.a(wG);
                }
                bl = false;
            }
            return bl;
        }
        throw new WG(x6_0.a(-28915, 27022) + string + x6_0.a(-28918, -2122) + jComponent);
    }

    /*
     * Unable to fully structure code
     */
    protected void I(Object var1_1, Map var2_2, Map var3_3) {
        block33: {
            block34: {
                block32: {
                    block31: {
                        block29: {
                            block30: {
                                var4_4 = x6_0.A();
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v0 = var3_3;
                                                            if (var4_4 != 0) break block29;
                                                            if (v0 != null) {
                                                            }
                                                            ** GOTO lbl59
                                                        }
                                                        catch (WG v1) {
                                                            throw x6_0.a(v1);
                                                        }
                                                        v0 = var3_3;
                                                        if (var4_4 != 0) break block29;
                                                    }
                                                    catch (WG v2) {
                                                        throw x6_0.a(v2);
                                                    }
                                                    if (v0.size() > 0) {
                                                    }
                                                    ** GOTO lbl59
                                                }
                                                catch (WG v3) {
                                                    throw x6_0.a(v3);
                                                }
                                                v4 = var2_2;
                                                if (var4_4 != 0) break block30;
                                            }
                                            catch (WG v5) {
                                                throw x6_0.a(v5);
                                            }
                                            if (v4 != null) {
                                            }
                                            ** GOTO lbl51
                                        }
                                        catch (WG v6) {
                                            throw x6_0.a(v6);
                                        }
                                        v4 = var2_2;
                                        if (var4_4 != 0) break block30;
                                    }
                                    catch (WG v7) {
                                        throw x6_0.a(v7);
                                    }
                                    if (v4.size() > 0) {
                                    }
                                    ** GOTO lbl51
                                }
                                catch (WG v8) {
                                    throw x6_0.a(v8);
                                }
                                var5_5 = new HashMap<K, V>(Math.max(var2_2.size(), var3_3.size()));
                                try {
                                    var5_5.putAll(var2_2);
                                    var5_5.putAll(var3_3);
                                    if (var4_4 == 0) break block31;
lbl51:
                                    // 3 sources

                                    v4 = var3_3;
                                }
                                catch (WG v9) {
                                    throw x6_0.a(v9);
                                }
                            }
                            var5_5 = v4;
                            try {
                                if (var4_4 == 0) break block31;
lbl59:
                                // 3 sources

                                v0 = var2_2;
                            }
                            catch (WG v10) {
                                throw x6_0.a(v10);
                            }
                        }
                        var5_5 = v0;
                    }
                    try {
                        v11 = var5_5;
                        if (var4_4 != 0) break block32;
                        if (v11 == null) break block33;
                    }
                    catch (WG v12) {
                        throw x6_0.a(v12);
                    }
                    v11 = var5_5;
                }
                try {
                    try {
                        if (var4_4 != 0) break block34;
                        if (v11.size() <= 0) break block33;
                    }
                    catch (WG v13) {
                        throw x6_0.a(v13);
                    }
                    v11 = var5_5;
                }
                catch (WG v14) {
                    throw x6_0.a(v14);
                }
            }
            for (Map.Entry<K, V> var7_7 : v11.entrySet()) {
                x6_0.M(var1_1, (String)var7_7.getKey(), var7_7.getValue());
                if (var4_4 == 0) continue;
            }
        }
    }

    public static boolean M(Object object, String string, Object object2) {
        try {
            if (object2 == c1_0.Z) {
                return false;
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw x6_0.a(noSuchMethodException);
        }
        try {
            String string2 = kp_0.W(string);
            kp_0.j(object, string2, new Object[]{object2});
            return true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            ne_1.g(x6_0.class, noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            ne_1.g(x6_0.class, invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            ne_1.g(x6_0.class, illegalAccessException);
        }
        try {
            Field field = kp_0.k(object.getClass(), string);
            field.setAccessible(true);
            field.set(object, object2);
            return true;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            ne_1.g(x6_0.class, noSuchFieldException);
            return false;
        }
        catch (IllegalAccessException illegalAccessException) {
            ne_1.g(x6_0.class, illegalAccessException);
            return false;
        }
    }

    public static Object Z(Object object, String string) {
        Class<?> clazz = object.getClass();
        try {
            Method method = kp_0.i(object, string);
            return method.invoke(object, new Object[0]);
        }
        catch (InvocationTargetException invocationTargetException) {
            ne_1.g(x6_0.class, invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            ne_1.g(x6_0.class, illegalAccessException);
        }
        try {
            Field field = kp_0.k(clazz, string);
            field.setAccessible(true);
            return field.get(object);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            ne_1.g(x6_0.class, noSuchFieldException);
            return null;
        }
        catch (IllegalAccessException illegalAccessException) {
            ne_1.g(x6_0.class, illegalAccessException);
            return null;
        }
    }

    public og_2 N(JComponent jComponent, String string) {
        og_2 og_22;
        String string2;
        int n10;
        block5: {
            block6: {
                n10 = x6_0.A();
                try {
                    string2 = string;
                    if (n10 != 0) break block5;
                    if (string2 == null) break block6;
                }
                catch (WG wG) {
                    throw x6_0.a(wG);
                }
                string2 = string;
                break block5;
            }
            string2 = this.D(jComponent).T().x();
        }
        String string3 = string2;
        ComponentUI componentUI = this.g(jComponent);
        try {
            og_22 = (og_2)x6_0.Z(componentUI, string3);
            if (n10 != 0) {
                ky_2.K(new String[5]);
            }
        }
        catch (WG wG) {
            throw x6_0.a(wG);
        }
        return og_22;
    }

    public String toString() {
        return this.P();
    }

    public static void x(int n10) {
        e = n10;
    }

    public static int B() {
        return e;
    }

    public static int A() {
        int n10 = x6_0.B();
        try {
            if (n10 == 0) {
                return 69;
            }
        }
        catch (WG wG) {
            throw x6_0.a(wG);
        }
        return 0;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "3H$\u00a3\u00ec\n\u00c0F\u009b\u00f4\u0017\u00ea\u0080\u00a4\u009e\u001cL&\u00ce\u008368\u00bf\u00f4\u00e3\u00cd\u00ff\u0012\u0086[ \u0005y1l\u0003MD\u0011\u00b9\u00ec\u0010\u00d1\u000b \u0017\u00a1H\u00b7/\u00be\u00ba\u00cf\u0004\u00a8+\u0011V\u000e\u00bb\u0003\u00f7zt\u00ea$\u00de\u00a2\u0093\u000bj2\u001c\u00ed\u0003\u0095\u00f2\u00e2\u0011\u00c7\u0015\u00ba\b?\u007f\u00ba\u00e8\u00d4!\u00feP\u00bd\u00f39\u00f6\u00b8\u001f\u00dd\u0000^D\u00fa\u00e4f\u00cb\u00c4Cs\u00c2y\u009d&\u00b6\b\u00dc\u00f6N\u00d4$\u001a\u009bX\u0015\u008e#_\u00f6v,\u00b2\u0095wS\u00d2\u0015\u00c4\u00c1\u00a1\u00ee\u0087R\u00ab\u0006\u00d0i\u009dfxW\u00be\u00d4O\u008f\u00f6\u009a\u00a7)Q5\u00f9F\n\u00af\u0097ST\u0089=TK?\u00dd\u00c3\u001f\u00b1\u0013V\u00aex\u0000\u00a9\u00a5*gP\u00ffm\u00c6\u00fc\u0093`\u00b0\u008c\f\u001b$\u00c9\u0007\u001f\u00a8\u00bc\r\u00c4\u00f03";
                var4_3 = "3H$\u00a3\u00ec\n\u00c0F\u009b\u00f4\u0017\u00ea\u0080\u00a4\u009e\u001cL&\u00ce\u008368\u00bf\u00f4\u00e3\u00cd\u00ff\u0012\u0086[ \u0005y1l\u0003MD\u0011\u00b9\u00ec\u0010\u00d1\u000b \u0017\u00a1H\u00b7/\u00be\u00ba\u00cf\u0004\u00a8+\u0011V\u000e\u00bb\u0003\u00f7zt\u00ea$\u00de\u00a2\u0093\u000bj2\u001c\u00ed\u0003\u0095\u00f2\u00e2\u0011\u00c7\u0015\u00ba\b?\u007f\u00ba\u00e8\u00d4!\u00feP\u00bd\u00f39\u00f6\u00b8\u001f\u00dd\u0000^D\u00fa\u00e4f\u00cb\u00c4Cs\u00c2y\u009d&\u00b6\b\u00dc\u00f6N\u00d4$\u001a\u009bX\u0015\u008e#_\u00f6v,\u00b2\u0095wS\u00d2\u0015\u00c4\u00c1\u00a1\u00ee\u0087R\u00ab\u0006\u00d0i\u009dfxW\u00be\u00d4O\u008f\u00f6\u009a\u00a7)Q5\u00f9F\n\u00af\u0097ST\u0089=TK?\u00dd\u00c3\u001f\u00b1\u0013V\u00aex\u0000\u00a9\u00a5*gP\u00ffm\u00c6\u00fc\u0093`\u00b0\u008c\f\u001b$\u00c9\u0007\u001f\u00a8\u00bc\r\u00c4\u00f03".length();
                x6_0.x(124);
                var1_4 = 17;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 61;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00be)\u00a7\u00f2\u00122\u00c9\u008a%eS='\u00b0(i1\u0082\u00a4`\u00fdM.\u00cf: \u001f\u00e1\u008c\u00c3\u00c2U\u0012\u0093x\u00f2C\u00d4\u00e4b:\u0082\u00930/\u0019`66\u00f3\u00da\u00c7\u008c8\u0016\u00cb\fM";
                    var4_3 = "\u00be)\u00a7\u00f2\u00122\u00c9\u008a%eS='\u00b0(i1\u0082\u00a4`\u00fdM.\u00cf: \u001f\u00e1\u008c\u00c3\u00c2U\u0012\u0093x\u00f2C\u00d4\u00e4b:\u0082\u00930/\u0019`66\u00f3\u00da\u00c7\u008c8\u0016\u00cb\fM".length();
                    var1_4 = 26;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 33;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 117;
                            break;
                        }
                        case 1: {
                            v15 = 18;
                            break;
                        }
                        case 2: {
                            v15 = 69;
                            break;
                        }
                        case 3: {
                            v15 = 81;
                            break;
                        }
                        case 4: {
                            v15 = 106;
                            break;
                        }
                        case 5: {
                            v15 = 8;
                            break;
                        }
                        default: {
                            v15 = 2;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        x6_0.a = var5;
        x6_0.b = new String[10];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF8F0D) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 245;
                    break;
                }
                case 1: {
                    n14 = 88;
                    break;
                }
                case 2: {
                    n14 = 91;
                    break;
                }
                case 3: {
                    n14 = 164;
                    break;
                }
                case 4: {
                    n14 = 149;
                    break;
                }
                case 5: {
                    n14 = 125;
                    break;
                }
                case 6: {
                    n14 = 249;
                    break;
                }
                case 7: {
                    n14 = 119;
                    break;
                }
                case 8: {
                    n14 = 209;
                    break;
                }
                case 9: {
                    n14 = 200;
                    break;
                }
                case 10: {
                    n14 = 182;
                    break;
                }
                case 11: {
                    n14 = 110;
                    break;
                }
                case 12: {
                    n14 = 171;
                    break;
                }
                case 13: {
                    n14 = 151;
                    break;
                }
                case 14: {
                    n14 = 120;
                    break;
                }
                case 15: {
                    n14 = 129;
                    break;
                }
                case 16: {
                    n14 = 141;
                    break;
                }
                case 17: {
                    n14 = 50;
                    break;
                }
                case 18: {
                    n14 = 115;
                    break;
                }
                case 19: {
                    n14 = 254;
                    break;
                }
                case 20: {
                    n14 = 65;
                    break;
                }
                case 21: {
                    n14 = 229;
                    break;
                }
                case 22: {
                    n14 = 71;
                    break;
                }
                case 23: {
                    n14 = 137;
                    break;
                }
                case 24: {
                    n14 = 198;
                    break;
                }
                case 25: {
                    n14 = 177;
                    break;
                }
                case 26: {
                    n14 = 221;
                    break;
                }
                case 27: {
                    n14 = 163;
                    break;
                }
                case 28: {
                    n14 = 103;
                    break;
                }
                case 29: {
                    n14 = 114;
                    break;
                }
                case 30: {
                    n14 = 85;
                    break;
                }
                case 31: {
                    n14 = 101;
                    break;
                }
                case 32: {
                    n14 = 180;
                    break;
                }
                case 33: {
                    n14 = 240;
                    break;
                }
                case 34: {
                    n14 = 75;
                    break;
                }
                case 35: {
                    n14 = 61;
                    break;
                }
                case 36: {
                    n14 = 184;
                    break;
                }
                case 37: {
                    n14 = 216;
                    break;
                }
                case 38: {
                    n14 = 98;
                    break;
                }
                case 39: {
                    n14 = 239;
                    break;
                }
                case 40: {
                    n14 = 46;
                    break;
                }
                case 41: {
                    n14 = 107;
                    break;
                }
                case 42: {
                    n14 = 203;
                    break;
                }
                case 43: {
                    n14 = 139;
                    break;
                }
                case 44: {
                    n14 = 253;
                    break;
                }
                case 45: {
                    n14 = 237;
                    break;
                }
                case 46: {
                    n14 = 4;
                    break;
                }
                case 47: {
                    n14 = 53;
                    break;
                }
                case 48: {
                    n14 = 56;
                    break;
                }
                case 49: {
                    n14 = 38;
                    break;
                }
                case 50: {
                    n14 = 210;
                    break;
                }
                case 51: {
                    n14 = 147;
                    break;
                }
                case 52: {
                    n14 = 90;
                    break;
                }
                case 53: {
                    n14 = 186;
                    break;
                }
                case 54: {
                    n14 = 250;
                    break;
                }
                case 55: {
                    n14 = 93;
                    break;
                }
                case 56: {
                    n14 = 159;
                    break;
                }
                case 57: {
                    n14 = 166;
                    break;
                }
                case 58: {
                    n14 = 82;
                    break;
                }
                case 59: {
                    n14 = 5;
                    break;
                }
                case 60: {
                    n14 = 235;
                    break;
                }
                case 61: {
                    n14 = 124;
                    break;
                }
                case 62: {
                    n14 = 97;
                    break;
                }
                case 63: {
                    n14 = 234;
                    break;
                }
                case 64: {
                    n14 = 111;
                    break;
                }
                case 65: {
                    n14 = 22;
                    break;
                }
                case 66: {
                    n14 = 23;
                    break;
                }
                case 67: {
                    n14 = 29;
                    break;
                }
                case 68: {
                    n14 = 11;
                    break;
                }
                case 69: {
                    n14 = 106;
                    break;
                }
                case 70: {
                    n14 = 19;
                    break;
                }
                case 71: {
                    n14 = 55;
                    break;
                }
                case 72: {
                    n14 = 12;
                    break;
                }
                case 73: {
                    n14 = 7;
                    break;
                }
                case 74: {
                    n14 = 153;
                    break;
                }
                case 75: {
                    n14 = 168;
                    break;
                }
                case 76: {
                    n14 = 156;
                    break;
                }
                case 77: {
                    n14 = 241;
                    break;
                }
                case 78: {
                    n14 = 6;
                    break;
                }
                case 79: {
                    n14 = 16;
                    break;
                }
                case 80: {
                    n14 = 70;
                    break;
                }
                case 81: {
                    n14 = 176;
                    break;
                }
                case 82: {
                    n14 = 26;
                    break;
                }
                case 83: {
                    n14 = 24;
                    break;
                }
                case 84: {
                    n14 = 145;
                    break;
                }
                case 85: {
                    n14 = 154;
                    break;
                }
                case 86: {
                    n14 = 170;
                    break;
                }
                case 87: {
                    n14 = 215;
                    break;
                }
                case 88: {
                    n14 = 201;
                    break;
                }
                case 89: {
                    n14 = 86;
                    break;
                }
                case 90: {
                    n14 = 100;
                    break;
                }
                case 91: {
                    n14 = 150;
                    break;
                }
                case 92: {
                    n14 = 212;
                    break;
                }
                case 93: {
                    n14 = 127;
                    break;
                }
                case 94: {
                    n14 = 89;
                    break;
                }
                case 95: {
                    n14 = 220;
                    break;
                }
                case 96: {
                    n14 = 49;
                    break;
                }
                case 97: {
                    n14 = 130;
                    break;
                }
                case 98: {
                    n14 = 58;
                    break;
                }
                case 99: {
                    n14 = 148;
                    break;
                }
                case 100: {
                    n14 = 246;
                    break;
                }
                case 101: {
                    n14 = 40;
                    break;
                }
                case 102: {
                    n14 = 45;
                    break;
                }
                case 103: {
                    n14 = 83;
                    break;
                }
                case 104: {
                    n14 = 140;
                    break;
                }
                case 105: {
                    n14 = 193;
                    break;
                }
                case 106: {
                    n14 = 13;
                    break;
                }
                case 107: {
                    n14 = 84;
                    break;
                }
                case 108: {
                    n14 = 196;
                    break;
                }
                case 109: {
                    n14 = 108;
                    break;
                }
                case 110: {
                    n14 = 118;
                    break;
                }
                case 111: {
                    n14 = 189;
                    break;
                }
                case 112: {
                    n14 = 172;
                    break;
                }
                case 113: {
                    n14 = 28;
                    break;
                }
                case 114: {
                    n14 = 251;
                    break;
                }
                case 115: {
                    n14 = 54;
                    break;
                }
                case 116: {
                    n14 = 10;
                    break;
                }
                case 117: {
                    n14 = 190;
                    break;
                }
                case 118: {
                    n14 = 57;
                    break;
                }
                case 119: {
                    n14 = 255;
                    break;
                }
                case 120: {
                    n14 = 77;
                    break;
                }
                case 121: {
                    n14 = 15;
                    break;
                }
                case 122: {
                    n14 = 248;
                    break;
                }
                case 123: {
                    n14 = 99;
                    break;
                }
                case 124: {
                    n14 = 112;
                    break;
                }
                case 125: {
                    n14 = 165;
                    break;
                }
                case 126: {
                    n14 = 21;
                    break;
                }
                case 127: {
                    n14 = 179;
                    break;
                }
                case 128: {
                    n14 = 32;
                    break;
                }
                case 129: {
                    n14 = 80;
                    break;
                }
                case 130: {
                    n14 = 102;
                    break;
                }
                case 131: {
                    n14 = 146;
                    break;
                }
                case 132: {
                    n14 = 181;
                    break;
                }
                case 133: {
                    n14 = 195;
                    break;
                }
                case 134: {
                    n14 = 35;
                    break;
                }
                case 135: {
                    n14 = 202;
                    break;
                }
                case 136: {
                    n14 = 218;
                    break;
                }
                case 137: {
                    n14 = 142;
                    break;
                }
                case 138: {
                    n14 = 34;
                    break;
                }
                case 139: {
                    n14 = 175;
                    break;
                }
                case 140: {
                    n14 = 60;
                    break;
                }
                case 141: {
                    n14 = 42;
                    break;
                }
                case 142: {
                    n14 = 27;
                    break;
                }
                case 143: {
                    n14 = 174;
                    break;
                }
                case 144: {
                    n14 = 81;
                    break;
                }
                case 145: {
                    n14 = 33;
                    break;
                }
                case 146: {
                    n14 = 2;
                    break;
                }
                case 147: {
                    n14 = 136;
                    break;
                }
                case 148: {
                    n14 = 66;
                    break;
                }
                case 149: {
                    n14 = 18;
                    break;
                }
                case 150: {
                    n14 = 51;
                    break;
                }
                case 151: {
                    n14 = 135;
                    break;
                }
                case 152: {
                    n14 = 59;
                    break;
                }
                case 153: {
                    n14 = 14;
                    break;
                }
                case 154: {
                    n14 = 232;
                    break;
                }
                case 155: {
                    n14 = 8;
                    break;
                }
                case 156: {
                    n14 = 144;
                    break;
                }
                case 157: {
                    n14 = 192;
                    break;
                }
                case 158: {
                    n14 = 208;
                    break;
                }
                case 159: {
                    n14 = 185;
                    break;
                }
                case 160: {
                    n14 = 41;
                    break;
                }
                case 161: {
                    n14 = 63;
                    break;
                }
                case 162: {
                    n14 = 1;
                    break;
                }
                case 163: {
                    n14 = 113;
                    break;
                }
                case 164: {
                    n14 = 67;
                    break;
                }
                case 165: {
                    n14 = 72;
                    break;
                }
                case 166: {
                    n14 = 69;
                    break;
                }
                case 167: {
                    n14 = 211;
                    break;
                }
                case 168: {
                    n14 = 247;
                    break;
                }
                case 169: {
                    n14 = 132;
                    break;
                }
                case 170: {
                    n14 = 92;
                    break;
                }
                case 171: {
                    n14 = 155;
                    break;
                }
                case 172: {
                    n14 = 223;
                    break;
                }
                case 173: {
                    n14 = 43;
                    break;
                }
                case 174: {
                    n14 = 158;
                    break;
                }
                case 175: {
                    n14 = 222;
                    break;
                }
                case 176: {
                    n14 = 123;
                    break;
                }
                case 177: {
                    n14 = 162;
                    break;
                }
                case 178: {
                    n14 = 238;
                    break;
                }
                case 179: {
                    n14 = 122;
                    break;
                }
                case 180: {
                    n14 = 207;
                    break;
                }
                case 181: {
                    n14 = 213;
                    break;
                }
                case 182: {
                    n14 = 109;
                    break;
                }
                case 183: {
                    n14 = 167;
                    break;
                }
                case 184: {
                    n14 = 3;
                    break;
                }
                case 185: {
                    n14 = 226;
                    break;
                }
                case 186: {
                    n14 = 206;
                    break;
                }
                case 187: {
                    n14 = 39;
                    break;
                }
                case 188: {
                    n14 = 236;
                    break;
                }
                case 189: {
                    n14 = 44;
                    break;
                }
                case 190: {
                    n14 = 20;
                    break;
                }
                case 191: {
                    n14 = 197;
                    break;
                }
                case 192: {
                    n14 = 79;
                    break;
                }
                case 193: {
                    n14 = 228;
                    break;
                }
                case 194: {
                    n14 = 30;
                    break;
                }
                case 195: {
                    n14 = 121;
                    break;
                }
                case 196: {
                    n14 = 126;
                    break;
                }
                case 197: {
                    n14 = 94;
                    break;
                }
                case 198: {
                    n14 = 105;
                    break;
                }
                case 199: {
                    n14 = 96;
                    break;
                }
                case 200: {
                    n14 = 104;
                    break;
                }
                case 201: {
                    n14 = 244;
                    break;
                }
                case 202: {
                    n14 = 74;
                    break;
                }
                case 203: {
                    n14 = 194;
                    break;
                }
                case 204: {
                    n14 = 217;
                    break;
                }
                case 205: {
                    n14 = 138;
                    break;
                }
                case 206: {
                    n14 = 227;
                    break;
                }
                case 207: {
                    n14 = 242;
                    break;
                }
                case 208: {
                    n14 = 9;
                    break;
                }
                case 209: {
                    n14 = 31;
                    break;
                }
                case 210: {
                    n14 = 17;
                    break;
                }
                case 211: {
                    n14 = 233;
                    break;
                }
                case 212: {
                    n14 = 187;
                    break;
                }
                case 213: {
                    n14 = 133;
                    break;
                }
                case 214: {
                    n14 = 47;
                    break;
                }
                case 215: {
                    n14 = 183;
                    break;
                }
                case 216: {
                    n14 = 62;
                    break;
                }
                case 217: {
                    n14 = 252;
                    break;
                }
                case 218: {
                    n14 = 231;
                    break;
                }
                case 219: {
                    n14 = 224;
                    break;
                }
                case 220: {
                    n14 = 52;
                    break;
                }
                case 221: {
                    n14 = 191;
                    break;
                }
                case 222: {
                    n14 = 64;
                    break;
                }
                case 223: {
                    n14 = 78;
                    break;
                }
                case 224: {
                    n14 = 95;
                    break;
                }
                case 225: {
                    n14 = 36;
                    break;
                }
                case 226: {
                    n14 = 230;
                    break;
                }
                case 227: {
                    n14 = 152;
                    break;
                }
                case 228: {
                    n14 = 157;
                    break;
                }
                case 229: {
                    n14 = 73;
                    break;
                }
                case 230: {
                    n14 = 128;
                    break;
                }
                case 231: {
                    n14 = 205;
                    break;
                }
                case 232: {
                    n14 = 131;
                    break;
                }
                case 233: {
                    n14 = 143;
                    break;
                }
                case 234: {
                    n14 = 161;
                    break;
                }
                case 235: {
                    n14 = 243;
                    break;
                }
                case 236: {
                    n14 = 68;
                    break;
                }
                case 237: {
                    n14 = 0;
                    break;
                }
                case 238: {
                    n14 = 199;
                    break;
                }
                case 239: {
                    n14 = 178;
                    break;
                }
                case 240: {
                    n14 = 204;
                    break;
                }
                case 241: {
                    n14 = 87;
                    break;
                }
                case 242: {
                    n14 = 134;
                    break;
                }
                case 243: {
                    n14 = 169;
                    break;
                }
                case 244: {
                    n14 = 76;
                    break;
                }
                case 245: {
                    n14 = 48;
                    break;
                }
                case 246: {
                    n14 = 188;
                    break;
                }
                case 247: {
                    n14 = 37;
                    break;
                }
                case 248: {
                    n14 = 117;
                    break;
                }
                case 249: {
                    n14 = 219;
                    break;
                }
                case 250: {
                    n14 = 173;
                    break;
                }
                case 251: {
                    n14 = 116;
                    break;
                }
                case 252: {
                    n14 = 160;
                    break;
                }
                case 253: {
                    n14 = 214;
                    break;
                }
                case 254: {
                    n14 = 225;
                    break;
                }
                default: {
                    n14 = 25;
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
            x6_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

