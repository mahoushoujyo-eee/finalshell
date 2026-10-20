/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BC;
import com.E;
import com.IB;
import com.LX;
import com.T0;
import com.aL;
import com.bn_0;
import com.cl_2;
import com.do_1;
import com.eh_0;
import com.k3_0;
import com.kr_0;
import com.ky_2;
import com.pv_0;
import java.awt.Component;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.ks
 */
public class ks_2
extends ky_2
implements SwingConstants,
eh_0 {
    protected boolean v = BC.c;
    protected LX G = BC.Z;
    protected int T = BC.l;
    protected ImageIcon w = BC.q;
    protected ImageIcon i = BC.d;
    protected boolean e = BC.W;
    protected boolean r = BC.p;
    protected int F = BC.x;
    protected List H = new ArrayList(1);
    protected List y = new ArrayList();
    protected List C = new ArrayList();
    protected k3_0 j = null;

    public ks_2() {
        this.h(BC.Z);
    }

    public ks_2(LX lX) {
        this.h(lX);
    }

    protected void h(LX lX) {
        this.i(true);
        this.u(false);
        this.setLayout(new T0(this));
        this.m(lX);
    }

    public boolean w() {
        return this.v;
    }

    public void v(boolean bl) {
        this.v = bl;
        this.B();
    }

    protected void B() {
        Iterator iterator = this.y.iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            k3_0 k3_02 = (k3_0)iterator.next();
            k3_02.l(this.v);
            if (nArray != null) continue;
        }
    }

    public int Z() {
        return this.T;
    }

    public void o(int n10) {
        this.T = n10;
        this.t();
    }

    public ImageIcon B() {
        return this.w;
    }

    public void g(ImageIcon imageIcon) {
        this.w = imageIcon;
        this.c();
    }

    public ImageIcon r() {
        return this.i;
    }

    public void z(ImageIcon imageIcon) {
        this.i = imageIcon;
        this.c();
    }

    protected void c() {
        Iterator iterator = this.y.iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            k3_0 k3_02 = (k3_0)iterator.next();
            k3_02.x(this.w);
            k3_02.I(this.i);
            if (nArray != null) continue;
        }
    }

    public LX y() {
        return this.G;
    }

    public void m(LX lX) {
        this.G = lX;
        this.t();
    }

    public boolean H() {
        return this.e;
    }

    public void q(boolean bl) {
        this.e = bl;
        this.revalidate();
    }

    public boolean e() {
        return this.r;
    }

    public void g(boolean bl) {
        this.r = bl;
        this.H(-1, true);
    }

    protected void H(int n10, boolean n11) {
        block27: {
            block26: {
                int n12;
                block25: {
                    int n13;
                    int n14;
                    block15: {
                        int[] nArray;
                        block18: {
                            block19: {
                                block16: {
                                    block17: {
                                        n14 = 0;
                                        nArray = k3_0.L();
                                        n12 = n11;
                                        if (nArray == null) break block16;
                                        if (n12 == 0) break block17;
                                        n12 = this.r ? 1 : 0;
                                        if (nArray == null) break block18;
                                        if (n12 != 0) break block19;
                                        for (int i2 = 0; i2 < this.y.size(); ++i2) {
                                            int n15;
                                            k3_0 k3_02;
                                            block24: {
                                                int n16;
                                                block23: {
                                                    block20: {
                                                        block22: {
                                                            block21: {
                                                                k3_02 = (k3_0)this.y.get(i2);
                                                                int n13 = n10;
                                                                n13 = -1;
                                                                if (nArray == null) break block15;
                                                                if (nArray == null) break block20;
                                                                if (n12 != n13) break block21;
                                                                n15 = k3_02.Y() ? 1 : 0;
                                                                if (nArray == null) break block22;
                                                                if (n15 != 0) {
                                                                    n10 = i2;
                                                                }
                                                            }
                                                            n15 = n10;
                                                        }
                                                        n16 = -1;
                                                    }
                                                    if (nArray == null) break block23;
                                                    if (n15 == n16) continue;
                                                    n15 = i2;
                                                    if (nArray == null) break block24;
                                                    n16 = n10;
                                                }
                                                if (n15 == n16) continue;
                                                n15 = k3_02.Y() ? 1 : 0;
                                            }
                                            if (nArray == null || n15 == 0) continue;
                                            n14 = 1;
                                            n15 = k3_02.u(false) ? 1 : 0;
                                            if (nArray != null) continue;
                                        }
                                        if (nArray != null) break block19;
                                    }
                                    n12 = this.I();
                                }
                                if (nArray == null) break block18;
                                if (n12 == 0) {
                                    this.j.u(true);
                                }
                            }
                            n12 = n10;
                        }
                        if (nArray == null) break block25;
                        n13 = -1;
                    }
                    if (n12 != n13) break block26;
                    n12 = n14;
                }
                if (n12 == 0) break block27;
            }
            this.l();
        }
    }

    public int O() {
        return this.F;
    }

    public void k(int n10) {
        this.F = n10;
        this.revalidate();
    }

    public k3_0 V(String string, Component component) {
        return this.e(this.y.size(), string, component);
    }

    public k3_0 e(int n10, String string, Component component) {
        return this.I(n10, new k3_0(string, component));
    }

    public k3_0 d(Icon icon, String string, Component component) {
        return this.M(this.y.size(), icon, string, component);
    }

    public k3_0 M(int n10, Icon icon, String string, Component component) {
        return this.I(n10, new k3_0(icon, string, component));
    }

    public k3_0 A(Component component, Component component2) {
        return this.t(this.y.size(), component, component2);
    }

    public k3_0 t(int n10, Component component, Component component2) {
        k3_0 k3_02 = new k3_0("", component2);
        k3_02.u(component);
        return this.I(n10, k3_02);
    }

    protected k3_0 I(int n10, k3_0 k3_02) {
        k3_02.l(this.v);
        int[] nArray = k3_0.L();
        k3_02.x(this.w);
        k3_02.I(this.i);
        int[] nArray2 = nArray;
        if (nArray2 != null) {
            if (!this.r) {
                boolean bl = this.k();
                if (nArray2 != null && bl) {
                    bl = k3_02.x(false, false);
                }
            }
            k3_02.B(new kr_0(this, k3_02));
        }
        do_1 do_12 = new do_1(this);
        k3_02.m(do_12);
        this.C.add(do_12);
        this.f(n10, new Component[]{k3_02});
        this.y.add(n10, k3_02);
        this.t();
        this.l();
        return k3_02;
    }

    public void b(int n10) {
        this.m((k3_0)this.y.get(n10));
    }

    protected void m(k3_0 k3_02) {
        int n10 = this.y.indexOf(k3_02);
        int[] nArray = k3_0.L();
        if (nArray != null) {
            if (n10 == -1) {
                return;
            }
            k3_02.B((E)null);
            k3_02.B((pv_0)this.C.get(n10));
            this.C.remove(n10);
            this.remove(k3_02);
            this.y.remove(n10);
        }
        if (nArray != null) {
            if (k3_02 == this.j) {
                this.j = null;
            }
            this.t();
        }
    }

    public List n() {
        return aL.J((Collection)this.y);
    }

    public List N() {
        return this.y;
    }

    public k3_0 M(int n10) {
        return (k3_0)this.y.get(n10);
    }

    /*
     * Exception decompiling
     */
    protected void t() {
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

    public boolean k() {
        boolean bl;
        block3: {
            Iterator iterator = this.y.iterator();
            int[] nArray = k3_0.L();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl2;
                    block4: {
                        k3_0 k3_02 = (k3_0)iterator.next();
                        bl = k3_02.Y();
                        if (nArray == null) break block3;
                        if (nArray == null) break block4;
                        if (!bl) break block5;
                        bl2 = true;
                    }
                    return bl2;
                }
                if (nArray != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public int b() {
        int n10;
        block3: {
            Iterator iterator = this.y.iterator();
            int[] nArray = k3_0.L();
            while (iterator.hasNext()) {
                block5: {
                    int n11;
                    block4: {
                        k3_0 k3_02 = (k3_0)iterator.next();
                        n10 = k3_02.Y() ? 1 : 0;
                        if (nArray == null) break block3;
                        if (nArray == null) break block4;
                        if (n10 == 0) break block5;
                        n11 = this.y.indexOf(k3_02);
                    }
                    return n11;
                }
                if (nArray != null) continue;
            }
            n10 = -1;
        }
        return n10;
    }

    public int I() {
        int n10;
        block3: {
            int n11 = 0;
            int[] nArray = k3_0.L();
            for (k3_0 k3_02 : this.y) {
                n10 = k3_02.Y() ? 1 : 0;
                if (nArray != null) {
                    if (n10 != 0) {
                        ++n11;
                    }
                    if (nArray != null) continue;
                }
                break block3;
            }
            n10 = n11;
        }
        return n10;
    }

    public Icon L(int n10) {
        return ((k3_0)this.y.get(n10)).u();
    }

    public void B(int n10, Icon icon) {
        ((k3_0)this.y.get(n10)).C(icon);
    }

    public String d(int n10) {
        return ((k3_0)this.y.get(n10)).Q();
    }

    public void g(int n10, String string) {
        ((k3_0)this.y.get(n10)).u(string);
    }

    public Component a(int n10) {
        return ((k3_0)this.y.get(n10)).t();
    }

    public void H(int n10, Component component) {
        ((k3_0)this.y.get(n10)).u(component);
    }

    public Component b(int n10) {
        return ((k3_0)this.y.get(n10)).F();
    }

    public void d(int n10, Component component) {
        ((k3_0)this.y.get(n10)).V(component);
    }

    public Insets E(int n10) {
        return ((k3_0)this.y.get(n10)).h();
    }

    public void O(int n10, Insets insets) {
        ((k3_0)this.y.get(n10)).j(insets);
    }

    public void c(int n10, int n11, int n12, int n13, int n14) {
        this.O(n10, new Insets(n11, n12, n13, n14));
    }

    public void b(int n10, int n11) {
        this.c(n10, n11, n11, n11, n11);
    }

    public List s() {
        ArrayList<k3_0> arrayList = new ArrayList<k3_0>();
        Iterator iterator = this.y.iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            k3_0 k3_02 = (k3_0)iterator.next();
            boolean bl = k3_02.Y();
            if (nArray != null && bl) {
                bl = arrayList.add(k3_02);
            }
            if (nArray != null) continue;
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    public void G(List var1_1) {
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

    public List P() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < this.y.size(); ++i2) {
            boolean bl = ((k3_0)this.y.get(i2)).Y();
            if (nArray == null || !bl) continue;
            bl = arrayList.add(i2);
            if (nArray != null) continue;
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    public void h(List var1_1) {
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

    public List x() {
        return aL.J((Collection)this.H);
    }

    public void w(List list) {
        this.H = list;
    }

    public void j(bn_0 bn_02) {
        this.H.add(bn_02);
    }

    public void N(bn_0 bn_02) {
        this.H.remove(bn_02);
    }

    protected void l() {
        Iterator iterator = aL.J((Collection)this.H).iterator();
        int[] nArray = k3_0.L();
        while (iterator.hasNext()) {
            bn_0 bn_02 = (bn_0)iterator.next();
            bn_02.E();
            if (nArray != null) continue;
        }
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
}

