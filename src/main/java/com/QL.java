/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.DP;
import com.F5;
import com.G3;
import com.H;
import com.IB;
import com.NE;
import com.OR;
import com.U.O;
import com._d_0;
import com.aL;
import com.at_0;
import com.bw_0;
import com.cl_2;
import com.d0_0;
import com.d3_0;
import com.dj_1;
import com.eh_0;
import com.el_0;
import com.fs_0;
import com.fx_0;
import com.hd_0;
import com.ky_2;
import com.ln_2;
import com.nm_1;
import com.ry_2;
import com.sj_0;
import com.zU;
import java.awt.Component;
import java.awt.Container;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class QL
extends ky_2
implements d0_0,
eh_0,
SwingConstants {
    public static final ImageIcon G;
    public static final ImageIcon t;
    protected List P = new ArrayList(1);
    protected List V = new ArrayList(1);
    protected final String Z;
    protected el_0 T;
    protected BX g;
    protected OR e;
    protected ln_2 x;
    protected OR n;
    protected boolean v = true;
    protected boolean p = true;
    protected boolean O = false;
    protected boolean u = true;
    protected boolean Q = true;
    protected WeakReference f = new WeakReference<Object>(null);
    protected G3 h = null;
    private static final String[] a;
    private static final String[] b;

    public QL() {
        this((OR)null, (OR)null, (ln_2)null);
    }

    public QL(OR oR) {
        this(null, oR, null);
    }

    public QL(ln_2 ln_22) {
        this(null, null, ln_22);
    }

    public QL(OR oR, ln_2 ln_22) {
        this(null, oR, ln_22);
    }

    public QL(OR oR, OR oR2) {
        this(oR, oR2, null);
    }

    public QL(OR oR, OR oR2, ln_2 ln_22) {
        super("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53112 out of bounds for length 3");
        this.e = oR2;
        this.n = oR;
        String[] stringArray = BX.B();
        ln_2 ln_23 = ln_22;
        if (stringArray == null) {
            ln_23 = ln_23 != null ? ln_22 : this.g();
        }
        this.x = ln_23;
        this.Z = NE.E("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53118 out of bounds for length 3");
        this.U();
        zU zU2 = new zU(this);
        this.addAncestorListener(new fx_0(this, zU2));
        if (stringArray != null) {
            ky_2.K(new String[3]);
        }
    }

    protected ln_2 g() {
        return new bw_0();
    }

    public String c() {
        return this.Z;
    }

    public OR G() {
        return this.e;
    }

    public void c(OR oR) {
        this.e = oR;
        Iterator iterator = this.K().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            BX bX = (BX)iterator.next();
            bX.v(this);
            if (stringArray == null) continue;
        }
    }

    public ln_2 D() {
        return this.x;
    }

    public void L(ln_2 ln_22) {
        String[] stringArray = BX.B();
        ln_2 ln_23 = ln_22;
        if (stringArray == null) {
            ln_23 = ln_23 != null ? ln_22 : this.g();
        }
        this.x = ln_23;
        for (BX bX : this.K()) {
            bX.p();
            if (stringArray == null) continue;
        }
    }

    public OR P() {
        return this.n;
    }

    public void X(OR oR) {
        this.n = oR;
        String[] stringArray = BX.B();
        for (DP dP : this.E()) {
            dP.h(this);
            if (stringArray == null) continue;
        }
    }

    public boolean w() {
        return this.v;
    }

    public void z(boolean bl) {
        this.v = bl;
    }

    public boolean Y() {
        return this.p;
    }

    public void v(boolean bl) {
        this.p = bl;
    }

    public boolean V() {
        return this.O;
    }

    public void b(boolean bl) {
        this.O = bl;
    }

    public boolean X() {
        return this.u;
    }

    public void R(boolean bl) {
        this.u = bl;
    }

    public boolean W() {
        return this.Q;
    }

    public void t(boolean bl) {
        this.Q = bl;
    }

    public el_0 H() {
        return this.T;
    }

    public void s(el_0 el_02) {
        block6: {
            block5: {
                String[] stringArray = BX.B();
                el_0 el_03 = this.T;
                if (stringArray == null) {
                    if (el_03 != null) {
                        this.remove(this.T.u());
                    }
                    el_03 = el_02;
                }
                if (el_03 == null) break block5;
                this.add(el_02.u(), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53117 out of bounds for length 3");
                this.T = el_02;
                this.g = el_02.F();
                this.revalidate();
                this.repaint();
                if (stringArray == null) break block6;
            }
            this.U();
        }
    }

    protected void U() {
        BX bX = new BX(this);
        this.add((Component)bX.D(), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53116 out of bounds for length 3");
        this.T = bX;
        this.g = bX;
    }

    public void O(at_0 at_02, int n10) {
        BX bX = this.L(at_02);
        String[] stringArray = BX.B();
        BX bX2 = bX;
        if (stringArray == null && bX2 != null) {
            bX2 = this.e(bX, at_02, n10);
        }
    }

    /*
     * Exception decompiling
     */
    protected BX e(BX var1_1, at_0 var2_2, int var3_3) {
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

    public void Z(el_0 el_02) {
        block8: {
            block4: {
                block5: {
                    String[] stringArray;
                    block7: {
                        Container container;
                        block6: {
                            Container container2;
                            stringArray = BX.B();
                            if (stringArray != null) break block4;
                            if (!(el_02 instanceof BX)) break block5;
                            BX bX = (BX)el_02;
                            container = container2 = bX.D().getParent();
                            if (stringArray != null) break block6;
                            if (!(container instanceof O)) break block7;
                            container = container2;
                        }
                        O o2 = (O)container;
                        this.S(QL.D(o2));
                        this.revalidate();
                        this.repaint();
                    }
                    if (stringArray == null) break block8;
                }
                this.S((DP)el_02);
                this.revalidate();
            }
            this.repaint();
        }
        this.u();
    }

    protected void S(DP dP) {
        Object object;
        block36: {
            int n10;
            Object object2;
            block39: {
                Object object3;
                block38: {
                    String[] stringArray;
                    block37: {
                        Container container;
                        Object object4;
                        block34: {
                            block35: {
                                block33: {
                                    block31: {
                                        QL qL;
                                        block32: {
                                            el_0 el_02;
                                            el_0 el_03;
                                            block28: {
                                                Object object5;
                                                block22: {
                                                    el_0 el_04;
                                                    block30: {
                                                        boolean bl;
                                                        block29: {
                                                            block25: {
                                                                block26: {
                                                                    block27: {
                                                                        Object object6;
                                                                        boolean bl2;
                                                                        block23: {
                                                                            block24: {
                                                                                el_03 = dP.D();
                                                                                el_02 = dP.d();
                                                                                stringArray = BX.B();
                                                                                bl2 = QL.M(el_03);
                                                                                if (stringArray != null) break block23;
                                                                                if (bl2) break block24;
                                                                                bl = QL.M(el_02);
                                                                                if (stringArray != null) break block25;
                                                                                if (!bl) break block26;
                                                                            }
                                                                            object6 = el_03;
                                                                            if (stringArray != null) break block27;
                                                                            bl2 = QL.M((el_0)object6);
                                                                        }
                                                                        object6 = object = bl2 ? el_02 : el_03;
                                                                    }
                                                                    if (stringArray == null) break block28;
                                                                }
                                                                bl = el_03 instanceof DP;
                                                            }
                                                            if (stringArray != null) break block29;
                                                            if (bl) {
                                                                this.S((DP)el_03);
                                                                el_03 = dP.D();
                                                            }
                                                            el_04 = el_02;
                                                            if (stringArray != null) break block30;
                                                            bl = el_04 instanceof DP;
                                                        }
                                                        if (bl) {
                                                            this.S((DP)el_02);
                                                            el_02 = dP.d();
                                                        }
                                                        el_04 = el_03;
                                                    }
                                                    object4 = (BX)el_04;
                                                    object2 = (BX)el_02;
                                                    Object object7 = object4;
                                                    if (stringArray == null) {
                                                        object7 = ((BX)object7).o() > ((BX)object2).o() ? object4 : object2;
                                                    }
                                                    object3 = object7;
                                                    Object object8 = object4;
                                                    if (stringArray == null) {
                                                        object8 = ((BX)object8).o() > ((BX)object2).o() ? object2 : object4;
                                                    }
                                                    Object object9 = object8;
                                                    for (at_0 at_02 : aL.J((Collection)((BX)object9).a())) {
                                                        ((BX)object9).x(at_02);
                                                        object5 = object3;
                                                        if (stringArray == null) {
                                                            ((BX)object5).O(at_02);
                                                            if (stringArray == null) continue;
                                                        }
                                                        break block22;
                                                    }
                                                    object5 = object3;
                                                }
                                                object = object5;
                                            }
                                            qL = this;
                                            if (stringArray != null) break block31;
                                            if (qL.g == el_03) break block32;
                                            qL = this;
                                            if (stringArray != null) break block31;
                                            if (qL.g != el_02) break block33;
                                        }
                                        qL = this;
                                    }
                                    qL.g = object.F();
                                }
                                object4 = dP.g();
                                container = ((Component)object4).getParent();
                                if (stringArray != null) break block34;
                                if (container != this) break block35;
                                this.remove((Component)object4);
                                this.add(object.u(), "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53116 out of bounds for length 3");
                                this.T = object;
                                if (stringArray == null) break block36;
                            }
                            container = ((Component)object4).getParent();
                        }
                        object2 = (O)container;
                        object3 = QL.D((O)object2);
                        n10 = ((JSplitPane)object2).getDividerLocation();
                        if (stringArray != null) break block37;
                        if (((JSplitPane)object2).getLeftComponent() != object4) break block38;
                        ((DP)object3).X((el_0)object);
                    }
                    if (stringArray == null) break block39;
                }
                ((DP)object3).d((el_0)object);
            }
            ((JSplitPane)object2).setDividerLocation(n10);
        }
        this.A(dP, (el_0)object);
    }

    public BX G() {
        return this.g;
    }

    protected void h(BX bX) {
        block5: {
            BX bX2;
            block4: {
                String[] stringArray = BX.B();
                bX2 = bX;
                if (stringArray != null) break block4;
                if (bX2 == null) break block5;
                bX2 = bX;
            }
            if (bX2 != this.g) {
                this.g = bX;
                this.u();
            }
        }
    }

    protected void p(at_0 at_02) {
        this.h(this.L(at_02));
        this.D(at_02);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public at_0 G() {
        String[] stringArray = BX.B();
        BX bX = this.g;
        if (stringArray == null) {
            if (bX == null) return null;
            bX = this.g;
        }
        at_0 at_02 = bX.r();
        return at_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public at_0 I(int n10) {
        String[] stringArray = BX.B();
        BX bX = this.g;
        if (stringArray == null) {
            if (bX == null) return null;
            bX = this.g;
        }
        at_0 at_02 = bX.x(n10);
        return at_02;
    }

    public at_0 c(String string) {
        Iterator iterator = this.K().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            block4: {
                at_0 at_02;
                block3: {
                    at_0 at_03;
                    BX bX = (BX)iterator.next();
                    at_02 = at_03 = bX.H(string);
                    if (stringArray != null) break block3;
                    if (at_02 == null) break block4;
                    at_02 = at_03;
                }
                return at_02;
            }
            if (stringArray == null) continue;
        }
        return null;
    }

    public List o() {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = new ArrayList();
            String[] stringArray = BX.B();
            for (BX bX : this.K()) {
                arrayList = arrayList2;
                if (stringArray == null) {
                    arrayList.addAll(bX.a());
                    if (stringArray == null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public int Z() {
        int n10;
        block2: {
            int n11 = 0;
            String[] stringArray = BX.B();
            for (BX bX : this.K()) {
                n10 = n11 + bX.o();
                if (stringArray == null) {
                    n11 = n10;
                    if (stringArray == null) continue;
                }
                break block2;
            }
            n10 = n11;
        }
        return n10;
    }

    public List K() {
        ArrayList arrayList = new ArrayList();
        this.z(this.T, arrayList);
        return arrayList;
    }

    protected void z(el_0 el_02, List list) {
        block4: {
            el_0 el_03;
            block2: {
                block3: {
                    String[] stringArray = BX.B();
                    el_03 = el_02;
                    if (stringArray != null) break block2;
                    if (!(el_03 instanceof BX)) break block3;
                    list.add((BX)el_02);
                    if (stringArray == null) break block4;
                }
                el_03 = el_02;
            }
            DP dP = (DP)el_03;
            this.z(dP.D(), list);
            this.z(dP.d(), list);
        }
    }

    public List E() {
        ArrayList arrayList = new ArrayList();
        this.K(this.T, arrayList);
        return arrayList;
    }

    protected void K(el_0 el_02, List list) {
        block3: {
            el_0 el_03;
            block2: {
                String[] stringArray = BX.B();
                el_03 = el_02;
                if (stringArray != null) break block2;
                if (!(el_03 instanceof DP)) break block3;
                el_03 = el_02;
            }
            DP dP = (DP)el_03;
            list.add(dP);
            this.K(dP.D(), list);
            this.K(dP.d(), list);
        }
    }

    public BX L(at_0 at_02) {
        return this.i(at_02.B());
    }

    public BX i(String string) {
        Iterator iterator = this.K().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            block4: {
                BX bX;
                block3: {
                    BX bX2;
                    bX = bX2 = (BX)iterator.next();
                    if (stringArray != null) break block3;
                    if (!bX.p(string)) break block4;
                    bX = bX2;
                }
                return bX;
            }
            if (stringArray == null) continue;
        }
        return null;
    }

    public void s(int n10) {
        block3: {
            BX bX;
            block2: {
                String[] stringArray = BX.B();
                bX = this.g;
                if (stringArray != null) break block2;
                if (bX == null) break block3;
                bX = this.g;
            }
            bX.V(n10);
        }
    }

    public void G() {
        block3: {
            BX bX;
            block2: {
                String[] stringArray = BX.B();
                bX = this.g;
                if (stringArray != null) break block2;
                if (bX == null) break block3;
                bX = this.g;
            }
            bX.B();
        }
    }

    public void s() {
        block3: {
            BX bX;
            block2: {
                String[] stringArray = BX.B();
                bX = this.g;
                if (stringArray != null) break block2;
                if (bX == null) break block3;
                bX = this.g;
            }
            bX.U();
        }
    }

    public void D(at_0 at_02) {
        this.G(at_02.B());
    }

    public void G(String string) {
        Iterator iterator = this.K().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            block4: {
                BX bX;
                block3: {
                    bX = (BX)iterator.next();
                    at_0 at_02 = bX.H(string);
                    if (stringArray != null) break block3;
                    if (at_02 == null) break block4;
                    bX.q(at_02);
                }
                bX.O();
            }
            if (stringArray == null) continue;
        }
    }

    public boolean E(at_0 at_02) {
        return this.m(at_02.B());
    }

    public boolean m(String string) {
        boolean bl;
        block3: {
            Iterator iterator = this.K().iterator();
            String[] stringArray = BX.B();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl2;
                    block4: {
                        BX bX = (BX)iterator.next();
                        bl = bX.p(string);
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

    public void A(String string) {
        block3: {
            QL qL;
            block2: {
                String[] stringArray = BX.B();
                qL = this;
                if (stringArray != null) break block2;
                if (qL.h == null) break block3;
                qL = this;
            }
            qL.W(this.h.D(string));
        }
    }

    public void W(at_0 at_02) {
        block2: {
            BX bX;
            block5: {
                QL qL;
                String[] stringArray;
                block3: {
                    block4: {
                        stringArray = BX.B();
                        if (at_02 == null) break block2;
                        qL = this;
                        if (stringArray != null) break block3;
                        if (!qL.E(at_02)) break block4;
                        this.D(at_02);
                        if (stringArray == null) break block2;
                    }
                    qL = this;
                }
                bX = qL.g;
                if (stringArray != null) break block5;
                if (bX == null) break block2;
                this.g.u(at_02);
                bX = this.g;
            }
            bX.q(at_02);
        }
    }

    public void A(int n10) {
        block3: {
            BX bX;
            block2: {
                String[] stringArray = BX.B();
                bX = this.g;
                if (stringArray != null) break block2;
                if (bX == null) break block3;
                bX = this.g;
            }
            bX.Q(n10);
        }
    }

    public void L(String string) {
        Iterator iterator = this.K().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            BX bX = (BX)iterator.next();
            bX.w(string);
            if (stringArray == null) continue;
        }
    }

    public void F(at_0 at_02) {
        BX bX;
        Iterator iterator = this.K().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext() && (!(bX = (BX)iterator.next()).u(at_02) || stringArray != null) && stringArray == null) {
        }
    }

    public void M() {
        Iterator iterator = this.K().iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            BX bX = (BX)iterator.next();
            bX.J();
            if (stringArray == null) continue;
        }
    }

    protected void u() {
        block3: {
            QL qL;
            at_0 at_02;
            block4: {
                at_0 at_03;
                block2: {
                    at_02 = this.G();
                    String[] stringArray = BX.B();
                    at_03 = at_02;
                    if (stringArray != null) break block2;
                    if (at_03 == null) break block3;
                    qL = this;
                    if (stringArray != null) break block4;
                    at_03 = qL.f.get();
                }
                if (at_03 == at_02) break block3;
                this.f = new WeakReference<at_0>(at_02);
                qL = this;
            }
            BX bX = qL.L(at_02);
            this.h(at_02, bX, bX.K(at_02));
        }
    }

    public G3 A() {
        return this.h;
    }

    public void G(G3 g32) {
        this.h = g32;
    }

    public sj_0 i() {
        return this.H(this.T);
    }

    protected sj_0 H(el_0 el_02) {
        block6: {
            el_0 el_03;
            String[] stringArray;
            block5: {
                stringArray = BX.B();
                el_03 = el_02;
                if (stringArray != null) break block5;
                if (el_03 == null) break block6;
                el_03 = el_02;
            }
            if (stringArray == null) {
                if (el_03 instanceof BX) {
                    BX bX = (BX)el_02;
                    at_0 at_02 = bX.r();
                    return new sj_0(at_02 != null ? at_02.B() : null, bX.N());
                }
                el_03 = el_02;
            }
            DP dP = (DP)el_03;
            sj_0 sj_02 = this.H(dP.D());
            sj_0 sj_03 = this.H(dP.d());
            F5 f52 = new F5(sj_02, sj_03);
            return new sj_0(dP.i(), dP.v(), f52);
        }
        return null;
    }

    public void N(sj_0 sj_02) {
        block2: {
            List list = this.o();
            HashMap<String, at_0> hashMap = new HashMap<String, at_0>(list.size());
            String[] stringArray = BX.B();
            for (at_0 at_02 : list) {
                hashMap.put(at_02.B(), at_02);
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block2;
            }
            this.M();
            this.s(this.f(sj_02, hashMap));
        }
    }

    protected el_0 f(sj_0 sj_02, Map map) {
        Object object;
        block10: {
            String string;
            Iterator iterator;
            Object object2;
            block7: {
                sj_0 sj_03;
                block11: {
                    block12: {
                        Object object3;
                        Object object4;
                        String[] stringArray;
                        block9: {
                            sj_0 sj_04;
                            block8: {
                                stringArray = BX.B();
                                sj_04 = sj_02;
                                if (stringArray != null) break block8;
                                if (!sj_04.T().booleanValue()) break block9;
                                sj_04 = sj_02;
                            }
                            object2 = sj_04.d();
                            iterator = this.f((sj_0)((F5)object2).H(), map);
                            object4 = this.f((sj_0)((F5)object2).L(), map);
                            object3 = new DP(this, sj_02.Z(), (el_0)((Object)iterator), (el_0)object4);
                            ((DP)object3).g().addComponentListener(new ry_2(this, (DP)object3, sj_02));
                            object = object3;
                            if (stringArray == null) break block10;
                        }
                        object2 = new BX(this);
                        sj_03 = sj_02;
                        if (stringArray != null) break block11;
                        if (sj_03.n() == null) break block12;
                        iterator = sj_02.n().iterator();
                        while (iterator.hasNext()) {
                            block16: {
                                Object object5;
                                Map map2;
                                block15: {
                                    boolean bl;
                                    block14: {
                                        block13: {
                                            string = (String)iterator.next();
                                            if (stringArray != null) break block7;
                                            object4 = string;
                                            if (this.h == null) break block13;
                                            bl = map.containsKey(object4);
                                            if (stringArray != null) break block14;
                                            if (!bl) {
                                                map.put(object4, this.h.D((String)object4));
                                            }
                                        }
                                        map2 = map;
                                        object5 = object4;
                                        if (stringArray != null) break block15;
                                        bl = map2.containsKey(object5);
                                    }
                                    if (!bl) break block16;
                                    map2 = map;
                                    object5 = object4;
                                }
                                if ((object3 = (at_0)map2.get(object5)) != null) {
                                    ((BX)object2).u((at_0)object3);
                                }
                            }
                            if (stringArray == null) continue;
                        }
                    }
                    sj_03 = sj_02;
                }
                string = sj_03.e();
            }
            if ((iterator = string) != null && map.containsKey(iterator)) {
                ((BX)object2).q((at_0)map.get(iterator));
            }
            object = object2;
        }
        return object;
    }

    public void x(dj_1 dj_12) {
        this.V.add(dj_12);
    }

    public void Y(dj_1 dj_12) {
        this.V.remove(dj_12);
    }

    public void o(BX bX, DP dP) {
        Iterator iterator = aL.J((Collection)this.V).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            dj_1 dj_12 = (dj_1)iterator.next();
            dj_12.a(this, bX, dP);
            if (stringArray == null) continue;
        }
    }

    public void A(DP dP, el_0 el_02) {
        Iterator iterator = aL.J((Collection)this.V).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            dj_1 dj_12 = (dj_1)iterator.next();
            dj_12.v(this, dP, el_02);
            if (stringArray == null) continue;
        }
    }

    public void T(DP dP) {
        Iterator iterator = aL.J((Collection)this.V).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            dj_1 dj_12 = (dj_1)iterator.next();
            dj_12.c(this, dP);
            if (stringArray == null) continue;
        }
    }

    public void P(DP dP) {
        Iterator iterator = aL.J((Collection)this.V).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            dj_1 dj_12 = (dj_1)iterator.next();
            dj_12.S(this, dP);
            if (stringArray == null) continue;
        }
    }

    public void L(DP dP) {
        Iterator iterator = aL.J((Collection)this.V).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            dj_1 dj_12 = (dj_1)iterator.next();
            dj_12.w(this, dP);
            if (stringArray == null) continue;
        }
    }

    public void o(H h10) {
        this.P.add(h10);
    }

    public void Z(H h10) {
        this.P.remove(h10);
    }

    public void w(at_0 at_02, BX bX, int n10) {
        Iterator iterator = aL.J((Collection)this.P).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            H h10 = (H)iterator.next();
            h10.U(at_02, bX, n10);
            if (stringArray == null) continue;
        }
    }

    public void h(at_0 at_02, BX bX, int n10) {
        Iterator iterator = aL.J((Collection)this.P).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            H h10 = (H)iterator.next();
            h10.N(at_02, bX, n10);
            if (stringArray == null) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean l(at_0 var1_1, BX var2_2, int var3_3) {
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

    public void p(at_0 at_02, BX bX, int n10) {
        Iterator iterator = aL.J((Collection)this.P).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            H h10 = (H)iterator.next();
            h10.u(at_02, bX, n10);
            if (stringArray == null) continue;
        }
    }

    @Override
    public _d_0 Z(d3_0 d3_02) {
        return fs_0.P(this, d3_02);
    }

    @Override
    public _d_0 J(d3_0 d3_02) {
        return fs_0.l(this, d3_02);
    }

    @Override
    public _d_0 n(nm_1 nm_12) {
        return fs_0.H(this, nm_12);
    }

    @Override
    public _d_0 q(d3_0 d3_02) {
        return fs_0.b(this, d3_02);
    }

    @Override
    public void p(String string) {
        cl_2.c(this, string);
    }

    @Override
    public void a(String string, Class clazz) {
        cl_2.x(this, string, clazz);
    }

    @Override
    public void E(String string, Object object) {
        cl_2.e(this, string, object);
    }

    @Override
    public void n(String string, String string2) {
        cl_2.B(this, string, string2);
    }

    @Override
    public void I(String string, String string2, Class clazz) {
        cl_2.t(this, string, string2, clazz);
    }

    @Override
    public void H(String string, String string2, Object object) {
        cl_2.a(this, string, string2, object);
    }

    @Override
    public void S(String string, boolean bl, boolean bl2) {
        cl_2.l(this, string, bl, bl2);
    }

    @Override
    public void O(String string, Class clazz, boolean bl, boolean bl2) {
        cl_2.X(this, string, clazz, bl, bl2);
    }

    @Override
    public void h(String string, Object object, boolean bl, boolean bl2) {
        cl_2.A(this, string, object, bl, bl2);
    }

    @Override
    public void e(String string, String string2, Class clazz, boolean bl, boolean bl2) {
        cl_2.L(this, string, string2, clazz, bl, bl2);
    }

    @Override
    public void D(String string, String string2, Object object, boolean bl, boolean bl2) {
        cl_2.y(this, string, string2, object, bl, bl2);
    }

    @Override
    public void z(IB iB) {
        cl_2.a(this, iB);
    }

    @Override
    public void w() {
        cl_2.O(this);
    }

    @Override
    public void m() {
        cl_2.G(this);
    }

    @Override
    public void e() {
        cl_2.H(this);
    }

    public static BX h(hd_0 hd_02) {
        return (BX)hd_02.getClientProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53119 out of bounds for length 3");
    }

    public static DP D(O o2) {
        return (DP)o2.getClientProperty("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53113 out of bounds for length 3");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean M(el_0 el_02) {
        String[] stringArray = BX.B();
        int n10 = el_02 instanceof BX;
        if (stringArray == null) {
            if (n10 == 0) return 0 != 0;
            n10 = ((BX)el_02).o();
        }
        if (stringArray != null) return n10 != 0;
        if (n10 != 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[8];
                var3_1 = 0;
                var2_2 = "\u00b27\u00a7\u00f6q\u0006\u00d0(P\u00f5gI\u00a2\u00f4\u00ac\u00d3s\u00b1\u00033a\u00f1\u0006\u00e3WC\u00b0I\u00f8\u0006\u00c3IGs\u00c9\u0080\u0018\u00bd%\u00e6\"\u00ca\u00aew&I,)R\u00f8\u00fd\u001a\u0096\u00b7\u00a2\u00f6\u00f8i\u0006o\u00a3\u000f\u00b4\u00d3\u00c7\u00fc\u00eeu\u00f3]\u00d9C;\u00bc\u00b8B[";
                var4_3 = "\u00b27\u00a7\u00f6q\u0006\u00d0(P\u00f5gI\u00a2\u00f4\u00ac\u00d3s\u00b1\u00033a\u00f1\u0006\u00e3WC\u00b0I\u00f8\u0006\u00c3IGs\u00c9\u0080\u0018\u00bd%\u00e6\"\u00ca\u00aew&I,)R\u00f8\u00fd\u001a\u0096\u00b7\u00a2\u00f6\u00f8i\u0006o\u00a3\u000f\u00b4\u00d3\u00c7\u00fc\u00eeu\u00f3]\u00d9C;\u00bc\u00b8B[".length();
                var1_4 = 18;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 13;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "b\u0018<\u0092\u0083\u000b\u000f\b*p\u00a9x\u00faS&\u00a6\u00a3\u009e\r\u00c6\n\u00a8\u00d0\u0011C]\u0001cQ\u00e3\\\u00b3";
                    var4_3 = "b\u0018<\u0092\u0083\u000b\u000f\b*p\u00a9x\u00faS&\u00a6\u00a3\u009e\r\u00c6\n\u00a8\u00d0\u0011C]\u0001cQ\u00e3\\\u00b3".length();
                    var1_4 = 18;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 40;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
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
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 61;
                            break;
                        }
                        case 1: {
                            v15 = 97;
                            break;
                        }
                        case 2: {
                            v15 = 113;
                            break;
                        }
                        case 3: {
                            v15 = 103;
                            break;
                        }
                        case 4: {
                            v15 = 101;
                            break;
                        }
                        case 5: {
                            v15 = 38;
                            break;
                        }
                        default: {
                            v15 = 80;
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
lbl85:
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
lbl95:
                // 1 sources

                ** continue;
            }
        }
        QL.a = var5;
        QL.b = new String[8];
        QL.G = new ImageIcon(BX.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53114 out of bounds for length 3"));
        QL.t = new ImageIcon(BX.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53115 out of bounds for length 3"));
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x5F41) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 183;
                    break;
                }
                case 1: {
                    n14 = 76;
                    break;
                }
                case 2: {
                    n14 = 10;
                    break;
                }
                case 3: {
                    n14 = 173;
                    break;
                }
                case 4: {
                    n14 = 111;
                    break;
                }
                case 5: {
                    n14 = 172;
                    break;
                }
                case 6: {
                    n14 = 181;
                    break;
                }
                case 7: {
                    n14 = 32;
                    break;
                }
                case 8: {
                    n14 = 30;
                    break;
                }
                case 9: {
                    n14 = 164;
                    break;
                }
                case 10: {
                    n14 = 125;
                    break;
                }
                case 11: {
                    n14 = 200;
                    break;
                }
                case 12: {
                    n14 = 148;
                    break;
                }
                case 13: {
                    n14 = 40;
                    break;
                }
                case 14: {
                    n14 = 235;
                    break;
                }
                case 15: {
                    n14 = 202;
                    break;
                }
                case 16: {
                    n14 = 247;
                    break;
                }
                case 17: {
                    n14 = 94;
                    break;
                }
                case 18: {
                    n14 = 31;
                    break;
                }
                case 19: {
                    n14 = 100;
                    break;
                }
                case 20: {
                    n14 = 240;
                    break;
                }
                case 21: {
                    n14 = 1;
                    break;
                }
                case 22: {
                    n14 = 185;
                    break;
                }
                case 23: {
                    n14 = 150;
                    break;
                }
                case 24: {
                    n14 = 105;
                    break;
                }
                case 25: {
                    n14 = 255;
                    break;
                }
                case 26: {
                    n14 = 4;
                    break;
                }
                case 27: {
                    n14 = 222;
                    break;
                }
                case 28: {
                    n14 = 193;
                    break;
                }
                case 29: {
                    n14 = 253;
                    break;
                }
                case 30: {
                    n14 = 71;
                    break;
                }
                case 31: {
                    n14 = 182;
                    break;
                }
                case 32: {
                    n14 = 46;
                    break;
                }
                case 33: {
                    n14 = 131;
                    break;
                }
                case 34: {
                    n14 = 101;
                    break;
                }
                case 35: {
                    n14 = 190;
                    break;
                }
                case 36: {
                    n14 = 219;
                    break;
                }
                case 37: {
                    n14 = 163;
                    break;
                }
                case 38: {
                    n14 = 170;
                    break;
                }
                case 39: {
                    n14 = 152;
                    break;
                }
                case 40: {
                    n14 = 237;
                    break;
                }
                case 41: {
                    n14 = 104;
                    break;
                }
                case 42: {
                    n14 = 205;
                    break;
                }
                case 43: {
                    n14 = 123;
                    break;
                }
                case 44: {
                    n14 = 146;
                    break;
                }
                case 45: {
                    n14 = 144;
                    break;
                }
                case 46: {
                    n14 = 80;
                    break;
                }
                case 47: {
                    n14 = 229;
                    break;
                }
                case 48: {
                    n14 = 149;
                    break;
                }
                case 49: {
                    n14 = 95;
                    break;
                }
                case 50: {
                    n14 = 68;
                    break;
                }
                case 51: {
                    n14 = 126;
                    break;
                }
                case 52: {
                    n14 = 234;
                    break;
                }
                case 53: {
                    n14 = 249;
                    break;
                }
                case 54: {
                    n14 = 215;
                    break;
                }
                case 55: {
                    n14 = 67;
                    break;
                }
                case 56: {
                    n14 = 43;
                    break;
                }
                case 57: {
                    n14 = 22;
                    break;
                }
                case 58: {
                    n14 = 117;
                    break;
                }
                case 59: {
                    n14 = 194;
                    break;
                }
                case 60: {
                    n14 = 178;
                    break;
                }
                case 61: {
                    n14 = 89;
                    break;
                }
                case 62: {
                    n14 = 204;
                    break;
                }
                case 63: {
                    n14 = 230;
                    break;
                }
                case 64: {
                    n14 = 227;
                    break;
                }
                case 65: {
                    n14 = 79;
                    break;
                }
                case 66: {
                    n14 = 154;
                    break;
                }
                case 67: {
                    n14 = 236;
                    break;
                }
                case 68: {
                    n14 = 224;
                    break;
                }
                case 69: {
                    n14 = 134;
                    break;
                }
                case 70: {
                    n14 = 162;
                    break;
                }
                case 71: {
                    n14 = 192;
                    break;
                }
                case 72: {
                    n14 = 199;
                    break;
                }
                case 73: {
                    n14 = 64;
                    break;
                }
                case 74: {
                    n14 = 176;
                    break;
                }
                case 75: {
                    n14 = 50;
                    break;
                }
                case 76: {
                    n14 = 232;
                    break;
                }
                case 77: {
                    n14 = 51;
                    break;
                }
                case 78: {
                    n14 = 187;
                    break;
                }
                case 79: {
                    n14 = 207;
                    break;
                }
                case 80: {
                    n14 = 107;
                    break;
                }
                case 81: {
                    n14 = 13;
                    break;
                }
                case 82: {
                    n14 = 139;
                    break;
                }
                case 83: {
                    n14 = 220;
                    break;
                }
                case 84: {
                    n14 = 135;
                    break;
                }
                case 85: {
                    n14 = 49;
                    break;
                }
                case 86: {
                    n14 = 44;
                    break;
                }
                case 87: {
                    n14 = 16;
                    break;
                }
                case 88: {
                    n14 = 56;
                    break;
                }
                case 89: {
                    n14 = 155;
                    break;
                }
                case 90: {
                    n14 = 65;
                    break;
                }
                case 91: {
                    n14 = 15;
                    break;
                }
                case 92: {
                    n14 = 84;
                    break;
                }
                case 93: {
                    n14 = 195;
                    break;
                }
                case 94: {
                    n14 = 196;
                    break;
                }
                case 95: {
                    n14 = 206;
                    break;
                }
                case 96: {
                    n14 = 18;
                    break;
                }
                case 97: {
                    n14 = 216;
                    break;
                }
                case 98: {
                    n14 = 113;
                    break;
                }
                case 99: {
                    n14 = 159;
                    break;
                }
                case 100: {
                    n14 = 177;
                    break;
                }
                case 101: {
                    n14 = 86;
                    break;
                }
                case 102: {
                    n14 = 251;
                    break;
                }
                case 103: {
                    n14 = 133;
                    break;
                }
                case 104: {
                    n14 = 28;
                    break;
                }
                case 105: {
                    n14 = 203;
                    break;
                }
                case 106: {
                    n14 = 70;
                    break;
                }
                case 107: {
                    n14 = 39;
                    break;
                }
                case 108: {
                    n14 = 33;
                    break;
                }
                case 109: {
                    n14 = 191;
                    break;
                }
                case 110: {
                    n14 = 233;
                    break;
                }
                case 111: {
                    n14 = 75;
                    break;
                }
                case 112: {
                    n14 = 184;
                    break;
                }
                case 113: {
                    n14 = 186;
                    break;
                }
                case 114: {
                    n14 = 115;
                    break;
                }
                case 115: {
                    n14 = 9;
                    break;
                }
                case 116: {
                    n14 = 137;
                    break;
                }
                case 117: {
                    n14 = 129;
                    break;
                }
                case 118: {
                    n14 = 201;
                    break;
                }
                case 119: {
                    n14 = 238;
                    break;
                }
                case 120: {
                    n14 = 168;
                    break;
                }
                case 121: {
                    n14 = 244;
                    break;
                }
                case 122: {
                    n14 = 145;
                    break;
                }
                case 123: {
                    n14 = 241;
                    break;
                }
                case 124: {
                    n14 = 110;
                    break;
                }
                case 125: {
                    n14 = 19;
                    break;
                }
                case 126: {
                    n14 = 11;
                    break;
                }
                case 127: {
                    n14 = 156;
                    break;
                }
                case 128: {
                    n14 = 54;
                    break;
                }
                case 129: {
                    n14 = 213;
                    break;
                }
                case 130: {
                    n14 = 27;
                    break;
                }
                case 131: {
                    n14 = 214;
                    break;
                }
                case 132: {
                    n14 = 127;
                    break;
                }
                case 133: {
                    n14 = 93;
                    break;
                }
                case 134: {
                    n14 = 5;
                    break;
                }
                case 135: {
                    n14 = 161;
                    break;
                }
                case 136: {
                    n14 = 165;
                    break;
                }
                case 137: {
                    n14 = 248;
                    break;
                }
                case 138: {
                    n14 = 147;
                    break;
                }
                case 139: {
                    n14 = 171;
                    break;
                }
                case 140: {
                    n14 = 45;
                    break;
                }
                case 141: {
                    n14 = 157;
                    break;
                }
                case 142: {
                    n14 = 106;
                    break;
                }
                case 143: {
                    n14 = 166;
                    break;
                }
                case 144: {
                    n14 = 175;
                    break;
                }
                case 145: {
                    n14 = 252;
                    break;
                }
                case 146: {
                    n14 = 23;
                    break;
                }
                case 147: {
                    n14 = 78;
                    break;
                }
                case 148: {
                    n14 = 73;
                    break;
                }
                case 149: {
                    n14 = 231;
                    break;
                }
                case 150: {
                    n14 = 25;
                    break;
                }
                case 151: {
                    n14 = 61;
                    break;
                }
                case 152: {
                    n14 = 169;
                    break;
                }
                case 153: {
                    n14 = 108;
                    break;
                }
                case 154: {
                    n14 = 189;
                    break;
                }
                case 155: {
                    n14 = 246;
                    break;
                }
                case 156: {
                    n14 = 87;
                    break;
                }
                case 157: {
                    n14 = 6;
                    break;
                }
                case 158: {
                    n14 = 74;
                    break;
                }
                case 159: {
                    n14 = 47;
                    break;
                }
                case 160: {
                    n14 = 2;
                    break;
                }
                case 161: {
                    n14 = 26;
                    break;
                }
                case 162: {
                    n14 = 69;
                    break;
                }
                case 163: {
                    n14 = 102;
                    break;
                }
                case 164: {
                    n14 = 188;
                    break;
                }
                case 165: {
                    n14 = 132;
                    break;
                }
                case 166: {
                    n14 = 116;
                    break;
                }
                case 167: {
                    n14 = 58;
                    break;
                }
                case 168: {
                    n14 = 36;
                    break;
                }
                case 169: {
                    n14 = 8;
                    break;
                }
                case 170: {
                    n14 = 21;
                    break;
                }
                case 171: {
                    n14 = 212;
                    break;
                }
                case 172: {
                    n14 = 29;
                    break;
                }
                case 173: {
                    n14 = 120;
                    break;
                }
                case 174: {
                    n14 = 130;
                    break;
                }
                case 175: {
                    n14 = 223;
                    break;
                }
                case 176: {
                    n14 = 136;
                    break;
                }
                case 177: {
                    n14 = 245;
                    break;
                }
                case 178: {
                    n14 = 141;
                    break;
                }
                case 179: {
                    n14 = 243;
                    break;
                }
                case 180: {
                    n14 = 109;
                    break;
                }
                case 181: {
                    n14 = 254;
                    break;
                }
                case 182: {
                    n14 = 211;
                    break;
                }
                case 183: {
                    n14 = 121;
                    break;
                }
                case 184: {
                    n14 = 7;
                    break;
                }
                case 185: {
                    n14 = 250;
                    break;
                }
                case 186: {
                    n14 = 167;
                    break;
                }
                case 187: {
                    n14 = 60;
                    break;
                }
                case 188: {
                    n14 = 99;
                    break;
                }
                case 189: {
                    n14 = 52;
                    break;
                }
                case 190: {
                    n14 = 153;
                    break;
                }
                case 191: {
                    n14 = 37;
                    break;
                }
                case 192: {
                    n14 = 225;
                    break;
                }
                case 193: {
                    n14 = 62;
                    break;
                }
                case 194: {
                    n14 = 119;
                    break;
                }
                case 195: {
                    n14 = 151;
                    break;
                }
                case 196: {
                    n14 = 242;
                    break;
                }
                case 197: {
                    n14 = 218;
                    break;
                }
                case 198: {
                    n14 = 85;
                    break;
                }
                case 199: {
                    n14 = 63;
                    break;
                }
                case 200: {
                    n14 = 221;
                    break;
                }
                case 201: {
                    n14 = 114;
                    break;
                }
                case 202: {
                    n14 = 97;
                    break;
                }
                case 203: {
                    n14 = 92;
                    break;
                }
                case 204: {
                    n14 = 20;
                    break;
                }
                case 205: {
                    n14 = 59;
                    break;
                }
                case 206: {
                    n14 = 17;
                    break;
                }
                case 207: {
                    n14 = 209;
                    break;
                }
                case 208: {
                    n14 = 208;
                    break;
                }
                case 209: {
                    n14 = 34;
                    break;
                }
                case 210: {
                    n14 = 140;
                    break;
                }
                case 211: {
                    n14 = 226;
                    break;
                }
                case 212: {
                    n14 = 96;
                    break;
                }
                case 213: {
                    n14 = 197;
                    break;
                }
                case 214: {
                    n14 = 217;
                    break;
                }
                case 215: {
                    n14 = 210;
                    break;
                }
                case 216: {
                    n14 = 88;
                    break;
                }
                case 217: {
                    n14 = 103;
                    break;
                }
                case 218: {
                    n14 = 38;
                    break;
                }
                case 219: {
                    n14 = 198;
                    break;
                }
                case 220: {
                    n14 = 77;
                    break;
                }
                case 221: {
                    n14 = 158;
                    break;
                }
                case 222: {
                    n14 = 179;
                    break;
                }
                case 223: {
                    n14 = 55;
                    break;
                }
                case 224: {
                    n14 = 143;
                    break;
                }
                case 225: {
                    n14 = 82;
                    break;
                }
                case 226: {
                    n14 = 90;
                    break;
                }
                case 227: {
                    n14 = 128;
                    break;
                }
                case 228: {
                    n14 = 53;
                    break;
                }
                case 229: {
                    n14 = 0;
                    break;
                }
                case 230: {
                    n14 = 66;
                    break;
                }
                case 231: {
                    n14 = 72;
                    break;
                }
                case 232: {
                    n14 = 14;
                    break;
                }
                case 233: {
                    n14 = 142;
                    break;
                }
                case 234: {
                    n14 = 122;
                    break;
                }
                case 235: {
                    n14 = 12;
                    break;
                }
                case 236: {
                    n14 = 98;
                    break;
                }
                case 237: {
                    n14 = 35;
                    break;
                }
                case 238: {
                    n14 = 42;
                    break;
                }
                case 239: {
                    n14 = 3;
                    break;
                }
                case 240: {
                    n14 = 91;
                    break;
                }
                case 241: {
                    n14 = 160;
                    break;
                }
                case 242: {
                    n14 = 57;
                    break;
                }
                case 243: {
                    n14 = 41;
                    break;
                }
                case 244: {
                    n14 = 124;
                    break;
                }
                case 245: {
                    n14 = 138;
                    break;
                }
                case 246: {
                    n14 = 83;
                    break;
                }
                case 247: {
                    n14 = 48;
                    break;
                }
                case 248: {
                    n14 = 24;
                    break;
                }
                case 249: {
                    n14 = 112;
                    break;
                }
                case 250: {
                    n14 = 239;
                    break;
                }
                case 251: {
                    n14 = 81;
                    break;
                }
                case 252: {
                    n14 = 180;
                    break;
                }
                case 253: {
                    n14 = 174;
                    break;
                }
                case 254: {
                    n14 = 228;
                    break;
                }
                default: {
                    n14 = 118;
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
            QL.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

