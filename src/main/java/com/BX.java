/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DP;
import com.GR;
import com.HD;
import com.ON;
import com.OR;
import com.QL;
import com.U.O;
import com.aL;
import com.at_0;
import com.c0_0;
import com.c4_0;
import com.el_0;
import com.hd_0;
import com.ij_2;
import com.k__0;
import com.ky_2;
import com.lm_0;
import com.p0_0;
import com.p3_0;
import com.w6_0;
import com.wf_2;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BX
implements el_0,
SwingConstants {
    protected QL d;
    protected final hd_0 B;
    protected final c4_0 W;
    protected List Z;
    private static String[] T;
    private static final String a;

    public BX(QL qL) {
        String[] stringArray = BX.B();
        this.Z = new ArrayList();
        this.d = qL;
        this.B = new hd_0(ij_2.attached);
        this.B.putClientProperty(a, this);
        this.v(qL);
        w6_0.H(this.B, this.B, GR.s, new lm_0(this));
        String[] stringArray2 = stringArray;
        wf_2.V(this);
        this.B.addChangeListener(new p0_0(this));
        this.B.addMouseListener(new HD(this));
        this.W = new c0_0(this, true);
        ON.b(this.B, this.W);
        if (ky_2.F() != null) {
            BX.q(new String[4]);
        }
    }

    public void Z() {
        block3: {
            QL qL;
            block2: {
                QL qL2 = this.z();
                String[] stringArray = BX.B();
                qL = qL2;
                if (stringArray != null) break block2;
                if (qL == null) break block3;
                qL = qL2;
            }
            qL.u();
        }
    }

    protected void v(QL qL) {
        block3: {
            OR oR;
            block2: {
                OR oR2 = qL.G();
                String[] stringArray = BX.B();
                oR = oR2;
                if (stringArray != null) break block2;
                if (oR == null) break block3;
                oR = oR2;
            }
            oR.j(this.B);
        }
    }

    @Override
    public Component u() {
        return this.D();
    }

    @Override
    public BX F() {
        return this;
    }

    public QL z() {
        return this.d;
    }

    public void U(QL qL) {
        this.d = qL;
        this.v(qL);
        this.p();
    }

    public hd_0 D() {
        return this.B;
    }

    public List a() {
        return this.Z;
    }

    public List N() {
        ArrayList<String> arrayList;
        block2: {
            ArrayList<String> arrayList2 = new ArrayList<String>(this.Z.size());
            Iterator iterator = this.Z.iterator();
            String[] stringArray = BX.B();
            while (iterator.hasNext()) {
                at_0 at_02 = (at_0)iterator.next();
                arrayList = arrayList2;
                if (stringArray == null) {
                    arrayList.add(at_02.B());
                    if (stringArray == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public int o() {
        return this.Z.size();
    }

    public boolean T(at_0 at_02) {
        return this.p(at_02.B());
    }

    public boolean p(String string) {
        boolean bl;
        block3: {
            Iterator iterator = this.Z.iterator();
            String[] stringArray = BX.B();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl2;
                    block4: {
                        at_0 at_02 = (at_0)iterator.next();
                        bl = at_02.B().equals(string);
                        if (stringArray != null) break block3;
                        if (stringArray != null) break block4;
                        if (!bl) break block5;
                        bl2 = true;
                    }
                    return bl2;
                }
                if (stringArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public void O(at_0 at_02) {
        this.J(at_02, -1);
    }

    public void J(at_0 at_02, int n10) {
        String[] stringArray = BX.B();
        int n11 = n10;
        if (stringArray == null) {
            n11 = n11 != -1 ? n10 : this.B.getTabCount();
        }
        int n12 = n11;
        this.Z.add(n12, at_02);
        this.B.insertTab("", at_02.I(), at_02.c(), null, n12);
        this.B.setBackgroundAt(n12, at_02.d());
        this.B.setTabComponentAt(n12, this.q(at_02));
        at_02.f(new p3_0(this));
    }

    protected JComponent q(at_0 at_02) {
        return this.z().D().b(this, at_02);
    }

    public void p() {
        Iterator iterator = this.a().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            at_0 at_02 = (at_0)iterator.next();
            this.X(at_02);
            if (stringArray == null) continue;
        }
    }

    public void X(at_0 at_02) {
        this.D().setTabComponentAt(this.K(at_02), this.q(at_02));
    }

    public void I(at_0 at_02) {
        this.D().setBackgroundAt(this.K(at_02), at_02.d());
    }

    public void r(at_0 at_02) {
        this.D().setComponentAt(this.K(at_02), at_02.c());
    }

    public void u(at_0 at_02) {
        this.O(at_02);
        this.z().w(at_02, this, this.K(at_02));
    }

    public at_0 x(int n10) {
        return (at_0)this.Z.get(n10);
    }

    public at_0 H(String string) {
        Iterator iterator = this.Z.iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            block4: {
                at_0 at_02;
                block3: {
                    at_0 at_03;
                    at_02 = at_03 = (at_0)iterator.next();
                    if (stringArray != null) break block3;
                    if (!at_02.B().equals(string)) break block4;
                    at_02 = at_03;
                }
                return at_02;
            }
            if (stringArray == null) continue;
        }
        return null;
    }

    public at_0 r() {
        int n10 = this.B.getSelectedIndex();
        return n10 != -1 ? (at_0)this.Z.get(n10) : null;
    }

    public int M() {
        return this.B.getSelectedIndex();
    }

    public void d(String string) {
        this.V(this.m(string));
    }

    public void q(at_0 at_02) {
        this.V(this.K(at_02));
    }

    public void V(int n10) {
        block4: {
            hd_0 hd_02;
            block5: {
                int n11;
                block2: {
                    String[] stringArray;
                    block3: {
                        stringArray = BX.B();
                        n11 = 0;
                        if (stringArray != null) break block2;
                        if (n11 > n10) break block3;
                        n11 = n10;
                        if (stringArray != null) break block2;
                        if (n11 >= this.B.getTabCount()) break block3;
                        this.B.setSelectedIndex(n10);
                        if (stringArray == null) break block4;
                    }
                    hd_02 = this.B;
                    if (stringArray != null) break block5;
                    n11 = hd_02.getTabCount();
                }
                if (n11 <= 0) break block4;
                hd_02 = this.B;
            }
            hd_02.setSelectedIndex(0);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void B() {
        block3: {
            block2: {
                var2_1 = this.o();
                var1_2 = BX.B();
                v0 = var2_1;
                v1 = 1;
                if (var1_2 != null) break block2;
                if (v0 <= v1) break block3;
                v0 = this.M();
                v1 = 1;
            }
            v2 = var3_3 = v0 - v1;
            v3 = -1;
            if (var1_2 != null) ** GOTO lbl16
            if (v2 == v3) {
                v2 = var2_1;
                v3 = 1;
lbl16:
                // 2 sources

                v4 = v2 - v3;
            } else {
                v4 = var3_3;
            }
            this.V(v4);
        }
    }

    public void U() {
        block5: {
            int n10;
            int n11;
            int n12;
            String[] stringArray;
            int n13;
            block4: {
                n13 = this.o();
                stringArray = BX.B();
                n12 = n13;
                n11 = 1;
                if (stringArray != null) break block4;
                if (n12 <= n11) break block5;
                n12 = this.M();
                n11 = 1;
            }
            int n14 = n10 = n12 + n11;
            if (stringArray == null) {
                n14 = n14 == n13 ? 0 : n10;
            }
            this.V(n14);
        }
    }

    public int m(String string) {
        return this.K(this.H(string));
    }

    public int K(at_0 at_02) {
        return this.Z.indexOf(at_02);
    }

    public boolean a(int n10) {
        return this.x(this.x(n10));
    }

    public boolean A(String string) {
        return this.x(this.H(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean x(at_0 at_02) {
        int n10;
        String[] stringArray = BX.B();
        if (at_02 == null) return 0 != 0;
        int n11 = n10 = this.K(at_02);
        if (stringArray != null) return n11 != 0;
        if (n11 == -1) return 0 != 0;
        at_02.m(this.d(at_02));
        this.B.remove(n10);
        this.Z.remove(at_02);
        return true;
    }

    protected k__0 d(at_0 at_02) {
        List list = at_02.U();
        String[] stringArray = BX.B();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            block6: {
                BX bX;
                k__0 k__02;
                k__0 k__03;
                block5: {
                    k__02 = k__03 = (k__0)iterator.next();
                    if (stringArray != null) break block5;
                    if (!(k__02 instanceof p3_0)) break block6;
                    k__02 = k__03;
                }
                if ((bX = ((p3_0)k__02).m()) == this) {
                    return k__03;
                }
            }
            if (stringArray == null) continue;
        }
        return null;
    }

    public void J() {
        Iterator iterator = aL.J((Collection)this.Z).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            at_0 at_02 = (at_0)iterator.next();
            this.u(at_02);
            if (stringArray == null) continue;
        }
    }

    public boolean Q(int n10) {
        return this.u(this.x(n10));
    }

    public boolean w(String string) {
        return this.u(this.H(string));
    }

    public boolean u(at_0 at_02) {
        String[] stringArray = BX.B();
        if (at_02 != null) {
            QL qL = this.z();
            int n10 = this.K(at_02);
            boolean bl = qL.l(at_02, this, n10);
            if (stringArray == null) {
                if (bl) {
                    boolean bl2 = this.x(at_02);
                    this.e();
                    qL.p(at_02, this, n10);
                    return bl2;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public void R(at_0 at_02) {
        Iterator iterator = aL.J((Collection)this.Z).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            block6: {
                at_0 at_03;
                at_0 at_04;
                block5: {
                    at_03 = at_04 = (at_0)iterator.next();
                    if (stringArray != null) break block5;
                    if (at_03 == at_02) break block6;
                    at_03 = at_04;
                }
                boolean bl = at_03.J();
                if (stringArray == null && bl) {
                    bl = this.u(at_04);
                }
            }
            if (stringArray == null) continue;
        }
    }

    public void b() {
        at_0 at_02 = this.r();
        if (at_02 != null) {
            this.u(at_02);
        }
    }

    public void O() {
        block3: {
            QL qL;
            block2: {
                QL qL2 = this.z();
                String[] stringArray = BX.B();
                qL = qL2;
                if (stringArray != null) break block2;
                if (qL == null) break block3;
                qL = qL2;
            }
            qL.h(this);
        }
    }

    public boolean Q() {
        return this.z().G() == this;
    }

    public void f(at_0 at_02, int n10) {
        block3: {
            QL qL;
            block2: {
                QL qL2 = this.z();
                String[] stringArray = BX.B();
                qL = qL2;
                if (stringArray != null) break block2;
                if (qL == null) break block3;
                qL = qL2;
            }
            qL.e(this, at_02, n10);
        }
    }

    public void e() {
        block3: {
            BX bX;
            block2: {
                String[] stringArray = BX.B();
                bX = this;
                if (stringArray != null) break block2;
                if (bX.o() != 0) break block3;
                bX = this;
            }
            bX.w();
        }
    }

    public void d() {
        block3: {
            Container container;
            block2: {
                Container container2 = this.B.getParent();
                String[] stringArray = BX.B();
                container = container2;
                if (stringArray != null) break block2;
                if (!(container instanceof O)) break block3;
                container = container2;
            }
            DP dP = QL.D((O)container);
            dP.m();
        }
    }

    public void Y() {
        block3: {
            Container container;
            block2: {
                Container container2 = this.B.getParent();
                String[] stringArray = BX.B();
                container = container2;
                if (stringArray != null) break block2;
                if (!(container instanceof O)) break block3;
                container = container2;
            }
            DP dP = QL.D((O)container);
            dP.u();
        }
    }

    public void w() {
        block3: {
            QL qL;
            block2: {
                QL qL2 = this.z();
                String[] stringArray = BX.B();
                qL = qL2;
                if (stringArray != null) break block2;
                if (qL == null) break block3;
                qL = qL2;
            }
            qL.Z(this);
        }
    }

    public void z() {
        block3: {
            QL qL;
            QL qL2;
            block2: {
                qL2 = this.z();
                String[] stringArray = BX.B();
                qL = qL2;
                if (stringArray != null) break block2;
                if (qL == null) break block3;
                qL = qL2;
            }
            qL.Z(qL2.H());
        }
    }

    public static void q(String[] stringArray) {
        T = stringArray;
    }

    public static String[] B() {
        return T;
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
                if (BX.B() != null) {
                    BX.q(new String[5]);
                }
                char[] cArray3 = "S\u0007@?\u0001/JCFS+\u0002/\nS\tW+".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 58;
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
                            n17 = 13;
                            break;
                        }
                        case 1: {
                            n17 = 82;
                            break;
                        }
                        case 2: {
                            n17 = 25;
                            break;
                        }
                        case 3: {
                            n17 = 112;
                            break;
                        }
                        case 4: {
                            n17 = 86;
                            break;
                        }
                        case 5: {
                            n17 = 112;
                            break;
                        }
                        default: {
                            n17 = 30;
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

