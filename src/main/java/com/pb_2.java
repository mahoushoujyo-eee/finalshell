/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C.L;
import com.C.M;
import com.D7;
import com.FJ;
import com.HQ;
import com.PY;
import com.W2;
import com.a9;
import com.cx_1;
import com.el_1;
import com.i2_0;
import com.kp_0;
import com.ne_1;
import com.ox_2;
import com.sa_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import javax.swing.JPopupMenu;
import javax.swing.border.Border;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.pb
 */
public class pb_2
extends JPopupMenu
implements D7,
W2,
sa_0,
cx_1 {
    private static int[] u;
    private static final String a;

    public pb_2() {
    }

    public pb_2(String string) {
        this.S(string);
    }

    @Override
    public void addSeparator() {
        this.add(new JPopupMenu.Separator());
    }

    public void o(int n10) {
        this.add((Component)new JPopupMenu.Separator(), n10);
    }

    public pb_2 n(Component component) {
        return this.X(component);
    }

    public pb_2 X(Component component) {
        this.z(el_1.aboveStart);
        this.show(component, 0, 0);
        return this;
    }

    public pb_2 S(Component component) {
        this.z(el_1.aboveMiddle);
        this.show(component, 0, 0);
        return this;
    }

    public pb_2 k(Component component) {
        this.z(el_1.aboveEnd);
        this.show(component, 0, 0);
        return this;
    }

    public pb_2 O(Component component) {
        return this.f(component);
    }

    public pb_2 f(Component component) {
        this.z(el_1.belowStart);
        this.show(component, 0, 0);
        return this;
    }

    public pb_2 r(Component component) {
        this.z(el_1.belowMiddle);
        this.show(component, 0, 0);
        return this;
    }

    public pb_2 l(Component component) {
        this.z(el_1.belowEnd);
        this.show(component, 0, 0);
        return this;
    }

    @Override
    public Insets getMargin() {
        return this.X().J();
    }

    public pb_2 p(Insets insets) {
        this.X().u(insets);
        return this;
    }

    public pb_2 s(int n10, int n11, int n12, int n13) {
        return this.p(new Insets(n10, n11, n12, n13));
    }

    public pb_2 X(int n10) {
        return this.s(n10, n10, n10, n10);
    }

    public HQ P() {
        return (HQ)ox_2.y(this);
    }

    public pb_2 B(L l2) {
        ox_2.b(this, l2);
        return this;
    }

    public int E() {
        return this.X().n();
    }

    @Override
    public pb_2 d(int n10) {
        this.X().q(n10);
        return this;
    }

    public boolean G() {
        return this.X().j();
    }

    public pb_2 i(boolean bl) {
        this.X().h(bl);
        return this;
    }

    public pb_2 z(el_1 el_12) {
        this.X().N(el_12);
        return this;
    }

    public M h() {
        return this.X().M();
    }

    public pb_2 M(M m10) {
        this.X().A(m10);
        return this;
    }

    @Override
    public void setBorder(Border border) {
    }

    public Color e() {
        return this.X().S();
    }

    public pb_2 I(Color color) {
        this.X().B(color);
        return this;
    }

    public int T() {
        return this.X().r();
    }

    public pb_2 I(int n10) {
        this.X().O(n10);
        return this;
    }

    public int y() {
        return this.X().G();
    }

    public pb_2 r(int n10) {
        this.X().T(n10);
        return this;
    }

    public float e() {
        return this.X().I();
    }

    public pb_2 f(float f10) {
        this.X().u(f10);
        return this;
    }

    public int Z() {
        return this.X().t();
    }

    public pb_2 c(int n10) {
        this.X().y(n10);
        return this;
    }

    public int C() {
        return this.X().p();
    }

    public void n(int n10) {
        ox_2.E(this, a, n10);
    }

    public float b() {
        return this.X().t();
    }

    public pb_2 V(float f10) {
        this.X().x(f10);
        return this;
    }

    @Override
    public String A() {
        return this.X().A();
    }

    @Override
    public void S(String string) {
        this.X().S(string);
    }

    @Override
    public Shape B() {
        return this.X().B();
    }

    public FJ X() {
        return (FJ)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block13: {
            block12: {
                block11: {
                    block14: {
                        var1_1 = pb_2.g();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw pb_2.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw pb_2.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof FJ)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw pb_2.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((FJ)kp_0.w(a9.zy, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new FJ());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw pb_2.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public int M() {
        return PY.f(this);
    }

    public pb_2 C(int n10) {
        return (pb_2)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public pb_2 f(int n10) {
        return (pb_2)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    public pb_2 s(int n10) {
        return (pb_2)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    @Override
    public pb_2 p(int n10) {
        return (pb_2)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public pb_2 F(int n10) {
        return (pb_2)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public pb_2 a(int n10) {
        return (pb_2)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public pb_2 D(int n10, int n11) {
        return (pb_2)PY.O(this, n10, n11);
    }

    @Override
    public void o(String string) {
        i2_0.f(this, string);
    }

    @Override
    public void I() {
        i2_0.p(this);
    }

    @Override
    public String q() {
        return i2_0.O(this);
    }

    @Override
    public Component W(int n10, int n11) {
        return this.D(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.a(n10);
    }

    @Override
    public Component p(int n10) {
        return this.F(n10);
    }

    @Override
    public Component D(int n10) {
        return this.p(n10);
    }

    @Override
    public Component V(int n10) {
        return this.s(n10);
    }

    @Override
    public Component x(int n10) {
        return this.f(n10);
    }

    @Override
    public Component O(int n10) {
        return this.C(n10);
    }

    public static void C(int[] nArray) {
        u = nArray;
    }

    public static int[] g() {
        return u;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
                if (pb_2.g() == null) {
                    pb_2.C(new int[3]);
                }
                char[] cArray3 = ":\u0017:Fm\u000b&5\u0011/Fe\u001c\t-".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 31;
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
                            n17 = 70;
                            break;
                        }
                        case 1: {
                            n17 = 103;
                            break;
                        }
                        case 2: {
                            n17 = 87;
                            break;
                        }
                        case 3: {
                            n17 = 55;
                            break;
                        }
                        case 4: {
                            n17 = 23;
                            break;
                        }
                        case 5: {
                            n17 = 102;
                            break;
                        }
                        default: {
                            n17 = 120;
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
        a = new String(cArray).intern();
    }
}

