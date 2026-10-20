/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FM;
import com.S0;
import com._y_0;
import com.aD;
import com.ar_0;
import com.cs_1;
import com.dv_1;
import com.fv_0;
import com.ky_2;
import com.pn_1;
import com.uR;
import com.w8_0;
import com.wf_1;
import com.wh_1;
import com.xn_2;
import com.xw_1;
import com.zK;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.DefaultFocusTraversalPolicy;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.function.Function;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Cn
 */
public abstract class cn_0
extends JPanel
implements FM,
cs_1 {
    private final Object p = new Object();
    private xn_2 V = null;
    private _y_0 M = null;
    private wh_1 Z;
    private final pn_1 F;
    private final List D = new ArrayList();
    private cs_1 g;
    private final Function o;
    private final JPanel U;
    private static String[] b;
    private static final String[] c;
    private static final String[] d;
    private static final long[] a;
    private static final Integer[] e;

    public cn_0(@NotNull pn_1 pn_12, @NotNull Function function) {
        super(new BorderLayout());
        String[] stringArray = cn_0.Q();
        this.F = pn_12;
        this.o = function;
        this.setFocusTraversalPolicy(new DefaultFocusTraversalPolicy());
        this.U = new JPanel(new BorderLayout());
        this.U.add((Component)this, cn_0.a(15628, -8935));
        String[] stringArray2 = stringArray;
        if (ky_2.F() != null) {
            cn_0.X(new String[1]);
        }
    }

    @Override
    public _y_0 f(fv_0 fv_02) {
        _y_0 _y_02 = this.R();
        this.z(fv_02, _y_02);
        return _y_02;
    }

    public void z(fv_0 fv_02, _y_0 _y_02) {
        block6: {
            cn_0 cn_02;
            block4: {
                block5: {
                    String[] stringArray = cn_0.Q();
                    _y_02.f(fv_02);
                    String[] stringArray2 = stringArray;
                    cn_02 = this;
                    if (stringArray2 == null) break block4;
                    if (cn_02.Z == null) break block5;
                    int n10 = this.Z.S(_y_02);
                    if (stringArray2 == null) break block6;
                    if (n10 != -1) {
                        this.Z.R(n10, this.t(_y_02, this.Z));
                    }
                }
                cn_02 = this;
            }
            cn_02.w(fv_02, _y_02);
        }
    }

    public _y_0 R() {
        _y_0 _y_02;
        block11: {
            cn_0 cn_02;
            block12: {
                wh_1 wh_12;
                block10: {
                    String[] stringArray;
                    block8: {
                        block9: {
                            _y_02 = this.x();
                            stringArray = cn_0.Q();
                            _y_02.Y(this);
                            cn_02 = this;
                            if (stringArray != null) {
                                if (cn_02.V != null) {
                                    _y_02.W(this.V);
                                }
                                cn_02 = this;
                            }
                            if (stringArray == null) break block8;
                            if (cn_02.M != null) break block9;
                            wh_12 = this.Z;
                            if (stringArray == null) break block10;
                            if (wh_12 != null) break block9;
                            this.M = _y_02;
                            Dimension dimension = _y_02.M().getSize();
                            this.add((Component)this.M.M(), cn_0.a(15630, 16688));
                            this.setSize(dimension);
                            cn_0 cn_03 = this;
                            if (stringArray != null) {
                                if (cn_03.V != null) {
                                    this.V.c(wf_1.User);
                                }
                                cn_03 = this;
                            }
                            cn_03.J();
                            if (stringArray != null) break block11;
                        }
                        cn_02 = this;
                    }
                    if (stringArray == null) break block12;
                    wh_12 = cn_02.Z;
                }
                if (wh_12 == null) {
                    this.Z = this.u();
                }
                cn_02 = this;
            }
            cn_02.m(_y_02, this.Z);
        }
        return _y_02;
    }

    public abstract _y_0 x();

    protected void w(fv_0 fv_02, _y_0 _y_02) {
        new S0(fv_02, Executors.newSingleThreadExecutor()).J(arg_0 -> this.lambda$setupTtyConnectorWaitFor$0(fv_02, _y_02, arg_0));
    }

    private void m(_y_0 _y_02, wh_1 wh_12) {
        String string = this.t(_y_02, wh_12);
        this.s(_y_02, wh_12, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    String J(@NotNull _y_0 _y_02) {
        String string;
        fv_0 fv_02 = _y_02.s();
        String[] stringArray = cn_0.Q();
        fv_0 fv_03 = fv_02;
        if (stringArray != null) {
            if (fv_03 == null) {
                string = cn_0.a(15631, 9645);
                return string;
            }
            fv_03 = fv_02;
        }
        string = fv_03.b();
        return string;
    }

    private String t(_y_0 _y_02, wh_1 wh_12) {
        return this.f(this.F.m(_y_02.s(), this.J(_y_02)), wh_12);
    }

    private void s(_y_0 _y_02, wh_1 wh_12, String string) {
        wh_12.G(string, _y_02);
        wh_12.v(wh_12.n() - 1, this.Z(wh_12, _y_02));
        wh_12.i(_y_02);
    }

    private String f(String string, wh_1 wh_12) {
        String string2;
        block3: {
            HashSet<String> hashSet = new HashSet<String>();
            String[] stringArray = cn_0.Q();
            for (int i2 = 0; i2 < wh_12.n(); ++i2) {
                hashSet.add(wh_12.r(i2));
                if (stringArray != null) continue;
            }
            String string3 = string;
            int n10 = 0;
            while (hashSet.contains(string3)) {
                string2 = string + cn_0.a(15629, 14597) + ++n10 + ")";
                if (stringArray != null) {
                    string3 = string2;
                    if (stringArray != null) continue;
                }
                break block3;
            }
            string2 = string3;
        }
        return string2;
    }

    private wh_1 u() {
        wh_1 wh_12 = this.m();
        wh_12.C(new zK(this));
        this.remove(this.M);
        this.m(this.M, wh_12);
        this.M = null;
        this.add((Component)wh_12.z(), cn_0.a(15630, 16688));
        return wh_12;
    }

    private void J() {
        block2: {
            _y_0 _y_02 = this.T();
            Iterator iterator = this.D.iterator();
            String[] stringArray = cn_0.Q();
            while (iterator.hasNext()) {
                ar_0 ar_02 = (ar_0)iterator.next();
                ar_02.T(_y_02);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block2;
            }
            _y_02.O().requestFocusInWindow();
        }
    }

    protected abstract wh_1 m();

    protected Component Z(wh_1 wh_12, _y_0 _y_02) {
        return new xw_1(this, wh_12, _y_02, null);
    }

    public void R(_y_0 _y_02) {
        block2: {
            cn_0 cn_02;
            block5: {
                String[] stringArray;
                block3: {
                    block4: {
                        stringArray = cn_0.Q();
                        if (_y_02 == null) break block2;
                        cn_02 = this;
                        if (stringArray == null) break block3;
                        if (cn_02.Z == null) break block4;
                        cn_02 = this;
                        if (stringArray == null) break block3;
                        if (cn_02.Z.S(_y_02) == -1) break block4;
                        SwingUtilities.invokeLater(() -> this.lambda$closeTab$1(_y_02));
                        this.l(_y_02);
                        if (stringArray != null) break block2;
                    }
                    cn_02 = this;
                }
                if (stringArray == null) break block5;
                if (cn_02.M != _y_02) break block2;
                this.M = null;
                cn_02 = this;
            }
            cn_02.l(_y_02);
        }
    }

    public void e() {
        _y_0 _y_02 = this.T();
        _y_02.q();
        this.R(_y_02);
    }

    public void Q() {
        Iterator iterator = this.j().iterator();
        String[] stringArray = cn_0.Q();
        while (iterator.hasNext()) {
            block4: {
                w8_0 w8_02;
                block3: {
                    w8_0 w8_03;
                    w8_02 = w8_03 = (w8_0)iterator.next();
                    if (stringArray == null) break block3;
                    if (w8_02 == null) break block4;
                    w8_02 = w8_03;
                }
                w8_02.q();
            }
            if (stringArray != null) continue;
        }
    }

    private List j() {
        ArrayList<_y_0> arrayList;
        block7: {
            cn_0 cn_02;
            block8: {
                block9: {
                    arrayList = new ArrayList<_y_0>();
                    String[] stringArray = cn_0.Q();
                    cn_02 = this;
                    if (stringArray == null) break block8;
                    if (cn_02.Z == null) break block9;
                    for (int i2 = 0; i2 < this.Z.n(); ++i2) {
                        arrayList.add(this.M(i2));
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block7;
                    }
                    if (stringArray != null) break block7;
                }
                cn_02 = this;
            }
            if (cn_02.M != null) {
                arrayList.add(this.M);
            }
        }
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void o(_y_0 _y_02) {
        Object object = this.p;
        synchronized (object) {
            String[] stringArray = cn_0.Q();
            Object object2 = this.Z;
            if (stringArray != null) {
                if (object2 != null) {
                    this.Z.S(_y_02);
                }
                this.J();
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    private void p() {
        this.M = this.M(0);
        this.Z.o();
        this.remove(this.Z.z());
        this.Z = null;
        this.add((Component)this.M.M(), cn_0.a(15630, 16688));
    }

    @Override
    public List n() {
        return List.of(new aD(this.F.c(), this::lambda$getActions$2).u(cn_0.a(20991, 4676639260673416930L)), new aD(this.F.t(), this::lambda$getActions$3).u(cn_0.a(11485, 1367516689157383105L)), new aD(this.F.b(), this::lambda$getActions$4).c(this::lambda$getActions$5), new aD(this.F.W(), this::lambda$getActions$6).c(this::lambda$getActions$7));
    }

    private void H() {
        this.Z.k(this.Z.z() - 1);
    }

    private void O() {
        this.Z.k(this.Z.z() + 1);
    }

    @Override
    public cs_1 c() {
        return this.g;
    }

    @Override
    public void Y(cs_1 cs_12) {
        this.g = cs_12;
    }

    private void G() {
        this.o.apply(this);
    }

    public wh_1 I() {
        return this.Z;
    }

    @Override
    public JComponent M() {
        return this.U;
    }

    /*
     * Enabled aggressive block sorting
     */
    public JComponent d() {
        JComponent jComponent;
        String[] stringArray = cn_0.Q();
        cn_0 cn_02 = this;
        if (stringArray != null) {
            if (cn_02.Z != null) {
                jComponent = this.Z.z();
                return jComponent;
            }
            cn_02 = this;
        }
        jComponent = cn_02.M;
        if (stringArray == null) return jComponent;
        if (jComponent != null) {
            jComponent = this.M;
            return jComponent;
        }
        jComponent = this;
        return jComponent;
    }

    @Override
    public JComponent h() {
        return this.d();
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void W(xn_2 xn_22) {
        block7: {
            block11: {
                cn_0 cn_02;
                block10: {
                    String[] stringArray;
                    block8: {
                        block9: {
                            stringArray = cn_0.Q();
                            cn_02 = this;
                            if (stringArray == null) break block8;
                            if (cn_02.Z == null) break block9;
                            for (int i2 = 0; i2 < this.Z.n(); ++i2) {
                                this.M(i2).W(xn_22);
                                if (stringArray != null) {
                                    if (stringArray != null) continue;
                                }
                                break block7;
                            }
                            if (stringArray != null) break block10;
                        }
                        cn_02 = this;
                    }
                    if (stringArray == null) break block11;
                    if (cn_02.M != null) {
                        this.M.W(xn_22);
                    }
                }
                cn_02 = this;
            }
            cn_02.V = xn_22;
        }
    }

    @NotNull
    public _y_0 T() {
        String[] stringArray = cn_0.Q();
        Object object = this.Z;
        if (stringArray != null) {
            if (object != null) {
                return this.M(this.Z.z());
            }
            object = Objects.requireNonNull(this.M);
        }
        return (_y_0)object;
    }

    @Override
    public dv_1 g() {
        return this.T().g();
    }

    @NotNull
    private _y_0 M(int n10) {
        Objects.checkIndex(n10, this.Z.n());
        return (_y_0)this.Z.u(n10);
    }

    public void x(ar_0 ar_02) {
        this.D.add(ar_02);
    }

    private void l(_y_0 _y_02) {
        Iterator iterator = this.D.iterator();
        String[] stringArray = cn_0.Q();
        while (iterator.hasNext()) {
            ar_0 ar_02 = (ar_0)iterator.next();
            ar_02.E(_y_02);
            if (stringArray != null) continue;
        }
    }

    @Override
    public void r(uR uR2) {
    }

    @Override
    public void T(uR uR2) {
    }

    public pn_1 f() {
        return this.F;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean lambda$getActions$7() {
        int n10;
        block5: {
            wh_1 wh_12;
            String[] stringArray;
            block4: {
                stringArray = cn_0.Q();
                wh_12 = this.Z;
                if (stringArray == null) break block4;
                if (wh_12 == null) break block5;
                wh_12 = this.Z;
            }
            n10 = wh_12.z();
            if (stringArray == null) return n10 != 0;
            if (n10 > 0) {
                n10 = 1;
                return n10 != 0;
            }
        }
        n10 = 0;
        return n10 != 0;
    }

    private boolean lambda$getActions$6(KeyEvent keyEvent) {
        this.H();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean lambda$getActions$5() {
        int n10;
        block5: {
            wh_1 wh_12;
            String[] stringArray;
            block4: {
                stringArray = cn_0.Q();
                wh_12 = this.Z;
                if (stringArray == null) break block4;
                if (wh_12 == null) break block5;
                wh_12 = this.Z;
            }
            n10 = wh_12.z();
            if (stringArray == null) return n10 != 0;
            if (n10 < this.Z.n() - 1) {
                n10 = 1;
                return n10 != 0;
            }
        }
        n10 = 0;
        return n10 != 0;
    }

    private boolean lambda$getActions$4(KeyEvent keyEvent) {
        this.O();
        return true;
    }

    private boolean lambda$getActions$3(KeyEvent keyEvent) {
        this.e();
        return true;
    }

    private boolean lambda$getActions$2(KeyEvent keyEvent) {
        this.G();
        return true;
    }

    private void lambda$closeTab$1(_y_0 _y_02) {
        this.o(_y_02);
    }

    private boolean lambda$setupTtyConnectorWaitFor$0(fv_0 fv_02, _y_0 _y_02, Integer n10) {
        String[] stringArray = cn_0.Q();
        boolean bl = this.F.H(fv_02);
        if (stringArray != null) {
            if (bl) {
                this.R(_y_02);
            }
            bl = true;
        }
        return bl;
    }

    static wh_1 l(cn_0 cn_02) {
        return cn_02.Z;
    }

    static void T(cn_0 cn_02) {
        cn_02.p();
    }

    static void b(cn_0 cn_02) {
        cn_02.J();
    }

    public static void X(String[] stringArray) {
        b = stringArray;
    }

    public static String[] Q() {
        return b;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "J\u00c4\u0003\u0005\u00faf8\u0006\u00f6\u00c1\u009b\u00a2[h";
                        var12_3 = "J\u00c4\u0003\u0005\u00faf8\u0006\u00f6\u00c1\u009b\u00a2[h".length();
                        cn_0.X(new String[4]);
                        var9_4 = 7;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 6;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
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
                            var10_2 = "v\n\u0006\u00c9\u0083\u00bf)\u001c\u00da";
                            var12_3 = "v\n\u0006\u00c9\u0083\u00bf)\u001c\u00da".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 33;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
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
                            break block22;
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
                                    v15 = 109;
                                    break;
                                }
                                case 1: {
                                    v15 = 77;
                                    break;
                                }
                                case 2: {
                                    v15 = 107;
                                    break;
                                }
                                case 3: {
                                    v15 = 72;
                                    break;
                                }
                                case 4: {
                                    v15 = 69;
                                    break;
                                }
                                case 5: {
                                    v15 = 123;
                                    break;
                                }
                                default: {
                                    v15 = 35;
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
                cn_0.c = var13;
                cn_0.d = new String[4];
                var0_7 = 3389687952227779110L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u0087+~bBQ\u00a1\u00b4\u008d\u00f1S\u00de\u0080\u00e0\u00dc\u008a";
                var5_11 = "\u0087+~bBQ\u00a1\u00b4\u008d\u00f1S\u00de\u0080\u00e0\u00dc\u008a".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl108:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        cn_0.a = var6_8;
        cn_0.e = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x3D0F) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 107;
                    break;
                }
                case 1: {
                    n14 = 119;
                    break;
                }
                case 2: {
                    n14 = 15;
                    break;
                }
                case 3: {
                    n14 = 214;
                    break;
                }
                case 4: {
                    n14 = 162;
                    break;
                }
                case 5: {
                    n14 = 159;
                    break;
                }
                case 6: {
                    n14 = 77;
                    break;
                }
                case 7: {
                    n14 = 139;
                    break;
                }
                case 8: {
                    n14 = 57;
                    break;
                }
                case 9: {
                    n14 = 12;
                    break;
                }
                case 10: {
                    n14 = 46;
                    break;
                }
                case 11: {
                    n14 = 93;
                    break;
                }
                case 12: {
                    n14 = 103;
                    break;
                }
                case 13: {
                    n14 = 41;
                    break;
                }
                case 14: {
                    n14 = 244;
                    break;
                }
                case 15: {
                    n14 = 251;
                    break;
                }
                case 16: {
                    n14 = 201;
                    break;
                }
                case 17: {
                    n14 = 68;
                    break;
                }
                case 18: {
                    n14 = 229;
                    break;
                }
                case 19: {
                    n14 = 58;
                    break;
                }
                case 20: {
                    n14 = 130;
                    break;
                }
                case 21: {
                    n14 = 219;
                    break;
                }
                case 22: {
                    n14 = 230;
                    break;
                }
                case 23: {
                    n14 = 89;
                    break;
                }
                case 24: {
                    n14 = 237;
                    break;
                }
                case 25: {
                    n14 = 221;
                    break;
                }
                case 26: {
                    n14 = 50;
                    break;
                }
                case 27: {
                    n14 = 182;
                    break;
                }
                case 28: {
                    n14 = 170;
                    break;
                }
                case 29: {
                    n14 = 131;
                    break;
                }
                case 30: {
                    n14 = 70;
                    break;
                }
                case 31: {
                    n14 = 240;
                    break;
                }
                case 32: {
                    n14 = 74;
                    break;
                }
                case 33: {
                    n14 = 59;
                    break;
                }
                case 34: {
                    n14 = 84;
                    break;
                }
                case 35: {
                    n14 = 49;
                    break;
                }
                case 36: {
                    n14 = 199;
                    break;
                }
                case 37: {
                    n14 = 133;
                    break;
                }
                case 38: {
                    n14 = 113;
                    break;
                }
                case 39: {
                    n14 = 72;
                    break;
                }
                case 40: {
                    n14 = 167;
                    break;
                }
                case 41: {
                    n14 = 192;
                    break;
                }
                case 42: {
                    n14 = 48;
                    break;
                }
                case 43: {
                    n14 = 254;
                    break;
                }
                case 44: {
                    n14 = 158;
                    break;
                }
                case 45: {
                    n14 = 90;
                    break;
                }
                case 46: {
                    n14 = 71;
                    break;
                }
                case 47: {
                    n14 = 112;
                    break;
                }
                case 48: {
                    n14 = 245;
                    break;
                }
                case 49: {
                    n14 = 173;
                    break;
                }
                case 50: {
                    n14 = 255;
                    break;
                }
                case 51: {
                    n14 = 52;
                    break;
                }
                case 52: {
                    n14 = 11;
                    break;
                }
                case 53: {
                    n14 = 61;
                    break;
                }
                case 54: {
                    n14 = 53;
                    break;
                }
                case 55: {
                    n14 = 24;
                    break;
                }
                case 56: {
                    n14 = 76;
                    break;
                }
                case 57: {
                    n14 = 75;
                    break;
                }
                case 58: {
                    n14 = 235;
                    break;
                }
                case 59: {
                    n14 = 34;
                    break;
                }
                case 60: {
                    n14 = 14;
                    break;
                }
                case 61: {
                    n14 = 136;
                    break;
                }
                case 62: {
                    n14 = 78;
                    break;
                }
                case 63: {
                    n14 = 232;
                    break;
                }
                case 64: {
                    n14 = 205;
                    break;
                }
                case 65: {
                    n14 = 203;
                    break;
                }
                case 66: {
                    n14 = 206;
                    break;
                }
                case 67: {
                    n14 = 108;
                    break;
                }
                case 68: {
                    n14 = 101;
                    break;
                }
                case 69: {
                    n14 = 238;
                    break;
                }
                case 70: {
                    n14 = 31;
                    break;
                }
                case 71: {
                    n14 = 207;
                    break;
                }
                case 72: {
                    n14 = 2;
                    break;
                }
                case 73: {
                    n14 = 23;
                    break;
                }
                case 74: {
                    n14 = 224;
                    break;
                }
                case 75: {
                    n14 = 248;
                    break;
                }
                case 76: {
                    n14 = 9;
                    break;
                }
                case 77: {
                    n14 = 37;
                    break;
                }
                case 78: {
                    n14 = 218;
                    break;
                }
                case 79: {
                    n14 = 99;
                    break;
                }
                case 80: {
                    n14 = 227;
                    break;
                }
                case 81: {
                    n14 = 228;
                    break;
                }
                case 82: {
                    n14 = 0;
                    break;
                }
                case 83: {
                    n14 = 147;
                    break;
                }
                case 84: {
                    n14 = 129;
                    break;
                }
                case 85: {
                    n14 = 250;
                    break;
                }
                case 86: {
                    n14 = 118;
                    break;
                }
                case 87: {
                    n14 = 226;
                    break;
                }
                case 88: {
                    n14 = 21;
                    break;
                }
                case 89: {
                    n14 = 171;
                    break;
                }
                case 90: {
                    n14 = 123;
                    break;
                }
                case 91: {
                    n14 = 180;
                    break;
                }
                case 92: {
                    n14 = 105;
                    break;
                }
                case 93: {
                    n14 = 106;
                    break;
                }
                case 94: {
                    n14 = 63;
                    break;
                }
                case 95: {
                    n14 = 20;
                    break;
                }
                case 96: {
                    n14 = 97;
                    break;
                }
                case 97: {
                    n14 = 153;
                    break;
                }
                case 98: {
                    n14 = 32;
                    break;
                }
                case 99: {
                    n14 = 239;
                    break;
                }
                case 100: {
                    n14 = 80;
                    break;
                }
                case 101: {
                    n14 = 157;
                    break;
                }
                case 102: {
                    n14 = 98;
                    break;
                }
                case 103: {
                    n14 = 69;
                    break;
                }
                case 104: {
                    n14 = 243;
                    break;
                }
                case 105: {
                    n14 = 54;
                    break;
                }
                case 106: {
                    n14 = 73;
                    break;
                }
                case 107: {
                    n14 = 142;
                    break;
                }
                case 108: {
                    n14 = 187;
                    break;
                }
                case 109: {
                    n14 = 126;
                    break;
                }
                case 110: {
                    n14 = 141;
                    break;
                }
                case 111: {
                    n14 = 200;
                    break;
                }
                case 112: {
                    n14 = 194;
                    break;
                }
                case 113: {
                    n14 = 110;
                    break;
                }
                case 114: {
                    n14 = 145;
                    break;
                }
                case 115: {
                    n14 = 168;
                    break;
                }
                case 116: {
                    n14 = 91;
                    break;
                }
                case 117: {
                    n14 = 86;
                    break;
                }
                case 118: {
                    n14 = 169;
                    break;
                }
                case 119: {
                    n14 = 197;
                    break;
                }
                case 120: {
                    n14 = 225;
                    break;
                }
                case 121: {
                    n14 = 17;
                    break;
                }
                case 122: {
                    n14 = 166;
                    break;
                }
                case 123: {
                    n14 = 121;
                    break;
                }
                case 124: {
                    n14 = 87;
                    break;
                }
                case 125: {
                    n14 = 249;
                    break;
                }
                case 126: {
                    n14 = 38;
                    break;
                }
                case 127: {
                    n14 = 51;
                    break;
                }
                case 128: {
                    n14 = 6;
                    break;
                }
                case 129: {
                    n14 = 149;
                    break;
                }
                case 130: {
                    n14 = 252;
                    break;
                }
                case 131: {
                    n14 = 42;
                    break;
                }
                case 132: {
                    n14 = 127;
                    break;
                }
                case 133: {
                    n14 = 83;
                    break;
                }
                case 134: {
                    n14 = 222;
                    break;
                }
                case 135: {
                    n14 = 148;
                    break;
                }
                case 136: {
                    n14 = 163;
                    break;
                }
                case 137: {
                    n14 = 102;
                    break;
                }
                case 138: {
                    n14 = 174;
                    break;
                }
                case 139: {
                    n14 = 209;
                    break;
                }
                case 140: {
                    n14 = 247;
                    break;
                }
                case 141: {
                    n14 = 164;
                    break;
                }
                case 142: {
                    n14 = 111;
                    break;
                }
                case 143: {
                    n14 = 40;
                    break;
                }
                case 144: {
                    n14 = 45;
                    break;
                }
                case 145: {
                    n14 = 161;
                    break;
                }
                case 146: {
                    n14 = 181;
                    break;
                }
                case 147: {
                    n14 = 44;
                    break;
                }
                case 148: {
                    n14 = 64;
                    break;
                }
                case 149: {
                    n14 = 47;
                    break;
                }
                case 150: {
                    n14 = 135;
                    break;
                }
                case 151: {
                    n14 = 66;
                    break;
                }
                case 152: {
                    n14 = 241;
                    break;
                }
                case 153: {
                    n14 = 16;
                    break;
                }
                case 154: {
                    n14 = 28;
                    break;
                }
                case 155: {
                    n14 = 210;
                    break;
                }
                case 156: {
                    n14 = 154;
                    break;
                }
                case 157: {
                    n14 = 82;
                    break;
                }
                case 158: {
                    n14 = 67;
                    break;
                }
                case 159: {
                    n14 = 155;
                    break;
                }
                case 160: {
                    n14 = 152;
                    break;
                }
                case 161: {
                    n14 = 39;
                    break;
                }
                case 162: {
                    n14 = 85;
                    break;
                }
                case 163: {
                    n14 = 30;
                    break;
                }
                case 164: {
                    n14 = 233;
                    break;
                }
                case 165: {
                    n14 = 177;
                    break;
                }
                case 166: {
                    n14 = 22;
                    break;
                }
                case 167: {
                    n14 = 88;
                    break;
                }
                case 168: {
                    n14 = 124;
                    break;
                }
                case 169: {
                    n14 = 175;
                    break;
                }
                case 170: {
                    n14 = 117;
                    break;
                }
                case 171: {
                    n14 = 196;
                    break;
                }
                case 172: {
                    n14 = 176;
                    break;
                }
                case 173: {
                    n14 = 43;
                    break;
                }
                case 174: {
                    n14 = 165;
                    break;
                }
                case 175: {
                    n14 = 60;
                    break;
                }
                case 176: {
                    n14 = 220;
                    break;
                }
                case 177: {
                    n14 = 223;
                    break;
                }
                case 178: {
                    n14 = 185;
                    break;
                }
                case 179: {
                    n14 = 120;
                    break;
                }
                case 180: {
                    n14 = 29;
                    break;
                }
                case 181: {
                    n14 = 81;
                    break;
                }
                case 182: {
                    n14 = 4;
                    break;
                }
                case 183: {
                    n14 = 146;
                    break;
                }
                case 184: {
                    n14 = 193;
                    break;
                }
                case 185: {
                    n14 = 183;
                    break;
                }
                case 186: {
                    n14 = 18;
                    break;
                }
                case 187: {
                    n14 = 213;
                    break;
                }
                case 188: {
                    n14 = 115;
                    break;
                }
                case 189: {
                    n14 = 137;
                    break;
                }
                case 190: {
                    n14 = 188;
                    break;
                }
                case 191: {
                    n14 = 7;
                    break;
                }
                case 192: {
                    n14 = 116;
                    break;
                }
                case 193: {
                    n14 = 8;
                    break;
                }
                case 194: {
                    n14 = 140;
                    break;
                }
                case 195: {
                    n14 = 36;
                    break;
                }
                case 196: {
                    n14 = 186;
                    break;
                }
                case 197: {
                    n14 = 94;
                    break;
                }
                case 198: {
                    n14 = 19;
                    break;
                }
                case 199: {
                    n14 = 27;
                    break;
                }
                case 200: {
                    n14 = 216;
                    break;
                }
                case 201: {
                    n14 = 10;
                    break;
                }
                case 202: {
                    n14 = 217;
                    break;
                }
                case 203: {
                    n14 = 189;
                    break;
                }
                case 204: {
                    n14 = 236;
                    break;
                }
                case 205: {
                    n14 = 198;
                    break;
                }
                case 206: {
                    n14 = 62;
                    break;
                }
                case 207: {
                    n14 = 178;
                    break;
                }
                case 208: {
                    n14 = 1;
                    break;
                }
                case 209: {
                    n14 = 35;
                    break;
                }
                case 210: {
                    n14 = 65;
                    break;
                }
                case 211: {
                    n14 = 92;
                    break;
                }
                case 212: {
                    n14 = 208;
                    break;
                }
                case 213: {
                    n14 = 95;
                    break;
                }
                case 214: {
                    n14 = 100;
                    break;
                }
                case 215: {
                    n14 = 134;
                    break;
                }
                case 216: {
                    n14 = 242;
                    break;
                }
                case 217: {
                    n14 = 96;
                    break;
                }
                case 218: {
                    n14 = 195;
                    break;
                }
                case 219: {
                    n14 = 204;
                    break;
                }
                case 220: {
                    n14 = 211;
                    break;
                }
                case 221: {
                    n14 = 138;
                    break;
                }
                case 222: {
                    n14 = 160;
                    break;
                }
                case 223: {
                    n14 = 151;
                    break;
                }
                case 224: {
                    n14 = 25;
                    break;
                }
                case 225: {
                    n14 = 253;
                    break;
                }
                case 226: {
                    n14 = 234;
                    break;
                }
                case 227: {
                    n14 = 56;
                    break;
                }
                case 228: {
                    n14 = 3;
                    break;
                }
                case 229: {
                    n14 = 231;
                    break;
                }
                case 230: {
                    n14 = 184;
                    break;
                }
                case 231: {
                    n14 = 172;
                    break;
                }
                case 232: {
                    n14 = 144;
                    break;
                }
                case 233: {
                    n14 = 26;
                    break;
                }
                case 234: {
                    n14 = 55;
                    break;
                }
                case 235: {
                    n14 = 191;
                    break;
                }
                case 236: {
                    n14 = 104;
                    break;
                }
                case 237: {
                    n14 = 122;
                    break;
                }
                case 238: {
                    n14 = 128;
                    break;
                }
                case 239: {
                    n14 = 109;
                    break;
                }
                case 240: {
                    n14 = 156;
                    break;
                }
                case 241: {
                    n14 = 190;
                    break;
                }
                case 242: {
                    n14 = 132;
                    break;
                }
                case 243: {
                    n14 = 79;
                    break;
                }
                case 244: {
                    n14 = 150;
                    break;
                }
                case 245: {
                    n14 = 33;
                    break;
                }
                case 246: {
                    n14 = 202;
                    break;
                }
                case 247: {
                    n14 = 114;
                    break;
                }
                case 248: {
                    n14 = 143;
                    break;
                }
                case 249: {
                    n14 = 13;
                    break;
                }
                case 250: {
                    n14 = 125;
                    break;
                }
                case 251: {
                    n14 = 212;
                    break;
                }
                case 252: {
                    n14 = 179;
                    break;
                }
                case 253: {
                    n14 = 5;
                    break;
                }
                case 254: {
                    n14 = 215;
                    break;
                }
                default: {
                    n14 = 246;
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
            cn_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4F1C;
        if (e[n11] == null) {
            cn_0.e[n11] = (int)(a[n11] ^ l2);
        }
        return e[n11];
    }
}

