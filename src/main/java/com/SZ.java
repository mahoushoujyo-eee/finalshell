/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.PY;
import com.R8;
import com.W2;
import com.Y9;
import com.a9;
import com.cx_1;
import com.i2_0;
import com.kp_0;
import com.ne_1;
import com.sa_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SZ
extends JScrollPane
implements W2,
sa_0,
cx_1 {
    private static String V;
    private static final String b;

    public SZ(Component component) {
        this(component, true);
    }

    public SZ(Component component, boolean bl) {
        this(component, bl, true);
    }

    public SZ(Component component, boolean bl, boolean bl2) {
        block3: {
            SZ sZ;
            block2: {
                String string = SZ.L();
                super(component);
                String string2 = string;
                this.u(bl);
                this.A().L(bl2);
                sZ = this;
                if (string2 != null) break block2;
                sZ.i().L(bl2);
                if (bl2) break block3;
                sZ = this;
            }
            sZ.setCorner(b, null);
        }
    }

    public R8 Y() {
        return new R8(1);
    }

    public R8 W() {
        return new R8(0);
    }

    public R8 i() {
        return (R8)super.getVerticalScrollBar();
    }

    public R8 A() {
        return (R8)super.getHorizontalScrollBar();
    }

    public boolean l() {
        return this.u().k();
    }

    public SZ u(boolean bl) {
        this.u().Y(bl);
        return this;
    }

    public int X() {
        return this.u().R();
    }

    public SZ g(int n10) {
        this.u().Q(n10);
        return this;
    }

    public int B() {
        return this.u().C();
    }

    public SZ G(int n10) {
        this.u().R(n10);
        return this;
    }

    public Insets e() {
        return this.u().A();
    }

    public SZ K(Insets insets) {
        this.u().a(insets);
        return this;
    }

    public SZ x(int n10, int n11, int n12, int n13) {
        return this.K(new Insets(n10, n11, n12, n13));
    }

    public SZ Q(int n10) {
        return this.x(n10, n10, n10, n10);
    }

    public boolean z() {
        return this.u().D();
    }

    public SZ r(boolean bl) {
        this.u().B(bl);
        return this;
    }

    public boolean C() {
        return this.u().K();
    }

    public SZ L(boolean bl) {
        this.u().S(bl);
        return this;
    }

    public Color W() {
        return this.u().G();
    }

    public SZ L(Color color) {
        this.u().g(color);
        return this;
    }

    public Color o() {
        return this.u().z();
    }

    public SZ t(Color color) {
        this.u().d(color);
        return this;
    }

    public void O(boolean bl) {
        R8 r8;
        R8 r82 = this.A();
        String string = SZ.L();
        R8 r83 = r82;
        if (string == null) {
            if (r83 != null) {
                r82.s(bl);
            }
            r83 = this.i();
        }
        R8 r84 = r8 = r83;
        if (string == null && r84 != null) {
            r84 = r8.s(bl);
        }
    }

    public void u(String string) {
        GA.B(this, string);
    }

    @Override
    public Shape B() {
        return this.u().B();
    }

    public Y9 u() {
        return (Y9)this.getUI();
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
                        var1_1 = SZ.L();
                        v0 = this;
                        if (var1_1 != null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw SZ.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 != null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw SZ.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof Y9)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw SZ.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((Y9)kp_0.w(a9.zo, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new Y9());
                        if (var1_1 == null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw SZ.a(v5);
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

    public SZ m(int n10) {
        return (SZ)PY.Q(this, n10);
    }

    @Override
    public int m() {
        return PY.m(this);
    }

    public SZ I(int n10) {
        return (SZ)PY.j(this, n10);
    }

    @Override
    public int A() {
        return PY.S(this);
    }

    @Override
    public SZ O(int n10) {
        return (SZ)PY.N(this, n10);
    }

    @Override
    public int Q() {
        return PY.Z(this);
    }

    @Override
    public SZ p(int n10) {
        return (SZ)PY.w(this, n10);
    }

    @Override
    public int i() {
        return PY.J(this);
    }

    public SZ s(int n10) {
        return (SZ)PY.b(this, n10);
    }

    @Override
    public int a() {
        return PY.i(this);
    }

    public SZ X(int n10) {
        return (SZ)PY.y(this, n10);
    }

    @Override
    public Dimension getPreferredSize() {
        return PY.W(this, super.getPreferredSize());
    }

    public SZ v(int n10, int n11) {
        return (SZ)PY.O(this, n10, n11);
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
    public JScrollBar createVerticalScrollBar() {
        return this.Y();
    }

    @Override
    public JScrollBar createHorizontalScrollBar() {
        return this.W();
    }

    @Override
    public Component W(int n10, int n11) {
        return this.v(n10, n11);
    }

    @Override
    public Component d(int n10) {
        return this.X(n10);
    }

    @Override
    public Component p(int n10) {
        return this.s(n10);
    }

    @Override
    public Component D(int n10) {
        return this.p(n10);
    }

    @Override
    public Component V(int n10) {
        return this.O(n10);
    }

    @Override
    public Component x(int n10) {
        return this.I(n10);
    }

    @Override
    public Component O(int n10) {
        return this.m(n10);
    }

    public static void d(String string) {
        V = string;
    }

    public static String L() {
        return V;
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
                if (SZ.L() != null) {
                    SZ.d("e5XDRc");
                }
                char[] cArray3 = "AvQ(\u00136UD~N9\u001e*H_wC?".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 55;
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
                            n17 = 58;
                            break;
                        }
                        case 1: {
                            n17 = 14;
                            break;
                        }
                        case 2: {
                            n17 = 49;
                            break;
                        }
                        case 3: {
                            n17 = 90;
                            break;
                        }
                        case 4: {
                            n17 = 118;
                            break;
                        }
                        case 5: {
                            n17 = 94;
                            break;
                        }
                        default: {
                            n17 = 48;
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
    }
}

