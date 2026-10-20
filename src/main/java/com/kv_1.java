/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GO;
import com.KD;
import com.O_;
import com.X6;
import com.aL;
import com.ax_0;
import com.ch_1;
import com.di_0;
import com.dr_1;
import com.eg_2;
import com.ix_1;
import com.ky_2;
import com.lk_2;
import com.n8_0;
import com.ph_1;
import com.pu_2;
import com.qe_0;
import com.qj_0;
import com.uM;
import com.yl_0;
import com.zzzzN1Customizer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.kV
 */
public class kv_1
extends ky_2 {
    public static final ImageIcon E;
    public static final ImageIcon V;
    public static final ImageIcon d;
    public static final ImageIcon t;
    protected List Y = new ArrayList(1);
    protected SimpleDateFormat z;
    protected boolean B;
    protected boolean R;
    protected boolean h;
    protected Color O;
    protected Color o;
    protected Color S;
    protected zzzzN1Customizer u;
    protected Date x;
    protected Date k;
    protected Date l;
    protected KD i;
    protected KD I;
    protected O_ j;
    protected KD T;
    protected KD A;
    protected ky_2 C;
    protected ky_2 F;
    protected qj_0 f;
    protected qe_0 p;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;

    public kv_1() {
        this((Date)null);
    }

    public kv_1(Date date) {
        super(true);
        String[] stringArray = lk_2.N();
        this.z = new SimpleDateFormat(kv_1.b(-6393, -3611));
        this.B = false;
        this.R = true;
        this.h = true;
        this.O = new Color(kv_1.a(21608, 7800393622263842356L), kv_1.a(7254, 7964819955327733263L), kv_1.a(7254, 7964819955327733263L));
        this.o = Color.BLACK;
        this.S = new Color(kv_1.a(8684, 960162542884598692L), 0, 0);
        Date date2 = date;
        if (stringArray == null) {
            date2 = date2 != null ? new Date(date.getTime()) : null;
        }
        this.x = date2;
        Date date3 = date;
        if (stringArray == null) {
            date3 = date3 != null ? new Date(date.getTime()) : new Date();
        }
        this.k = date3;
        this.i(true);
        this.Y(GO.Fx);
        this.setLayout(new BorderLayout(0, 0));
        this.putClientProperty(kv_1.b(-6376, -31162), true);
        ky_2 ky_22 = new ky_2();
        ky_22.setOpaque(false);
        this.add((Component)ky_22, kv_1.b(-6383, 9595));
        ky_2 ky_23 = new ky_2();
        ky_23.setOpaque(false);
        this.add((Component)ky_23, kv_1.b(-6374, -9119));
        this.i = KD.K(E, GO.Fx, true);
        this.i.r(false);
        this.i.addActionListener(new n8_0(this));
        this.I = KD.K(V, GO.Fx, true);
        this.I.r(false);
        this.I.addActionListener(new yl_0(this));
        ky_2 ky_24 = new ky_2(new BorderLayout());
        ky_24.setOpaque(false);
        ky_24.add((Component)this.i, kv_1.b(-6371, -30694));
        ky_24.add((Component)this.I, kv_1.b(-6375, 7461));
        ky_23.add((Component)ky_24, kv_1.b(-6370, 16677));
        this.j = new O_();
        this.X();
        this.j.A();
        this.j.D(true);
        this.j.setHorizontalAlignment(0);
        this.j.setVerticalAlignment(0);
        ky_23.add((Component)this.j, kv_1.b(-6400, 22669));
        this.T = KD.K(d, GO.Fx, true);
        this.T.r(false);
        this.T.addActionListener(new ph_1(this));
        this.A = KD.K(t, GO.Fx, true);
        this.A.r(false);
        this.A.addActionListener(new di_0(this));
        ky_2 ky_25 = new ky_2(new BorderLayout());
        ky_25.setOpaque(false);
        ky_25.add((Component)this.T, kv_1.b(-6370, 16677));
        ky_25.add((Component)this.A, kv_1.b(-6372, -8272));
        ky_23.add((Component)ky_25, kv_1.b(-6372, -8272));
        this.C = new ky_2();
        this.C.T(false);
        this.C.I(true, false, true, false);
        this.C.D(0);
        this.C.setOpaque(false);
        this.C.N(GO.FG, GO.FG - 1, GO.FG + 1, GO.FG - 1);
        double[][] dArrayArray = new double[2][];
        double[] dArray = new double[kv_1.a(20797, 6819977196517409644L)];
        dArray[0] = -1.0;
        dArray[1] = -2.0;
        dArray[2] = -1.0;
        dArray[3] = -2.0;
        dArray[4] = -1.0;
        dArray[5] = -2.0;
        dArray[kv_1.a((int)18816, (long)2232308165756541907L)] = -1.0;
        dArray[kv_1.a((int)578, (long)1244756124417691666L)] = -2.0;
        dArray[kv_1.a((int)7947, (long)2056726305626131793L)] = -1.0;
        dArray[kv_1.a((int)9302, (long)3088318622700844553L)] = -2.0;
        dArray[kv_1.a((int)23244, (long)8381553973203421313L)] = -1.0;
        dArray[kv_1.a((int)2330, (long)1724842783892773703L)] = -2.0;
        dArray[kv_1.a((int)32063, (long)943965830966275946L)] = -1.0;
        dArrayArray[0] = dArray;
        dArrayArray[1] = new double[]{-2.0};
        this.C.setLayout(new ix_1(dArrayArray));
        ky_22.add((Component)this.C, kv_1.b(-6397, -25689));
        this.o();
        this.F = this.G();
        this.o(this.F);
        this.f = new qj_0(this.F);
        this.f.setOpaque(false);
        this.f.R(new uM(this));
        ky_22.add((Component)this.f, kv_1.b(-6400, 22669));
        if (stringArray != null) {
            ky_2.K(new String[4]);
        }
    }

    protected void X() {
        this.j.setText(this.z.format(this.k));
    }

    /*
     * Unable to fully structure code
     */
    protected void S(boolean var1_1) {
        block8: {
            block7: {
                block5: {
                    block6: {
                        var2_2 = lk_2.N();
                        if (var2_2 != null) break block5;
                        if (!var1_1) break block6;
                        v0 = this;
                        if (var2_2 != null) break block7;
                        if (!v0.O()) break block6;
                        this.F = this.G();
                        this.o(this.F);
                        var3_3 = this.getComponentOrientation().isLeftToRight();
                        var4_4 = new X6();
                        var4_4.r(eg_2.moveBoth);
                        v1 = this;
                        if (var2_2 != null) ** GOTO lbl18
                        if (v1.l.getTime() > this.k.getTime()) {
                            v2 = this.q(var3_3);
                        } else {
                            v1 = this;
lbl18:
                            // 2 sources

                            v2 = v1.l(var3_3);
                        }
                        var4_4.q(v2);
                        var4_4.o(kv_1.a(16444, 7852523885285998L));
                        this.f.N(var4_4);
                        this.f.L(this.F);
                        if (var2_2 == null) break block8;
                    }
                    this.o(this.F);
                }
                v0 = this;
            }
            v0.l();
        }
    }

    protected void P(int n10) {
        block3: {
            int n11;
            block2: {
                String[] stringArray = lk_2.N();
                n11 = this.getComponentOrientation().isLeftToRight();
                if (stringArray != null) break block2;
                if (n11 != 0) break block3;
                n11 = -n10;
            }
            n10 = n11;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.k);
        calendar.set(5, 1);
        calendar.set(2, calendar.get(2) + n10);
        this.a(calendar.getTime());
    }

    protected void S(int n10) {
        block3: {
            int n11;
            block2: {
                String[] stringArray = lk_2.N();
                n11 = this.getComponentOrientation().isLeftToRight();
                if (stringArray != null) break block2;
                if (n11 != 0) break block3;
                n11 = -n10;
            }
            n10 = n11;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.k);
        calendar.set(5, 1);
        calendar.set(1, calendar.get(1) + n10);
        this.a(calendar.getTime());
    }

    protected ky_2 G() {
        ky_2 ky_22 = new ky_2();
        ky_22.setOpaque(false);
        ky_22.N(GO.FG - 1, GO.FG - 1, GO.FG - 1, GO.FG - 1);
        double[][] dArrayArray = new double[2][];
        double[] dArray = new double[kv_1.a(6491, 4578116751186594581L)];
        dArray[0] = -1.0;
        dArray[1] = -2.0;
        dArray[2] = -1.0;
        dArray[3] = -2.0;
        dArray[4] = -1.0;
        dArray[5] = -2.0;
        dArray[kv_1.a((int)27608, (long)1088758563212917143L)] = -1.0;
        dArray[kv_1.a((int)16086, (long)5825112431313923201L)] = -2.0;
        dArray[kv_1.a((int)20356, (long)7062502137131621842L)] = -1.0;
        dArray[kv_1.a((int)7618, (long)6470853900303732636L)] = -2.0;
        dArray[kv_1.a((int)18369, (long)8480760900821374349L)] = -1.0;
        dArray[kv_1.a((int)1574, (long)8110339029497091186L)] = -2.0;
        dArray[kv_1.a((int)25759, (long)4318800780094994116L)] = -1.0;
        dArrayArray[0] = dArray;
        double[] dArray2 = new double[kv_1.a(18816, 2232308165756541907L)];
        dArray2[0] = -1.0;
        dArray2[1] = -1.0;
        dArray2[2] = -1.0;
        dArray2[3] = -1.0;
        dArray2[4] = -1.0;
        dArray2[5] = -1.0;
        dArrayArray[1] = dArray2;
        ix_1 ix_12 = new ix_1(dArrayArray);
        ix_12.q(0);
        ix_12.p(0);
        ky_22.setLayout(ix_12);
        return ky_22;
    }

    protected void l() {
        block3: {
            qe_0 qe_02;
            block2: {
                String[] stringArray = lk_2.N();
                qe_02 = this.p;
                if (stringArray != null) break block2;
                if (qe_02 == null) break block3;
                qe_02 = this.p;
            }
            qe_02.requestFocusInWindow();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected dr_1 q(boolean bl) {
        dr_1 dr_12;
        String[] stringArray = lk_2.N();
        boolean bl2 = this.h;
        if (stringArray == null) {
            if (!bl2) {
                dr_12 = dr_1.up;
                return dr_12;
            }
            bl2 = bl;
        }
        if (bl2) {
            dr_12 = dr_1.right;
            return dr_12;
        }
        dr_12 = dr_1.left;
        return dr_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected dr_1 l(boolean bl) {
        dr_1 dr_12;
        String[] stringArray = lk_2.N();
        boolean bl2 = this.h;
        if (stringArray == null) {
            if (!bl2) {
                dr_12 = dr_1.down;
                return dr_12;
            }
            bl2 = bl;
        }
        if (bl2) {
            dr_12 = dr_1.left;
            return dr_12;
        }
        dr_12 = dr_1.right;
        return dr_12;
    }

    /*
     * Unable to fully structure code
     */
    protected void o() {
        block5: {
            v0 = lk_2.N();
            this.C.removeAll();
            var1_1 = v0;
            var2_2 = 1;
            while (var2_2 <= kv_1.a(578, 1244756124417691666L)) {
                block8: {
                    block6: {
                        block7: {
                            v1 = this;
                            if (var1_1 != null) break block5;
                            v2 = v1.B;
                            if (var1_1 != null) break block6;
                            if (v2 != 0) break block7;
                            v3 = var2_2;
                            break block8;
                        }
                        v2 = var2_2;
                    }
                    v4 = 1;
                    if (var1_1 != null) ** GOTO lbl23
                    if (v2 == v4) {
                        v3 = kv_1.a(578, 1244756124417691666L);
                    } else {
                        v2 = var2_2;
                        v4 = 1;
lbl23:
                        // 2 sources

                        v3 = v2 - v4;
                    }
                }
                var3_3 = v3;
                var4_4 = new O_();
                var4_4.u(kv_1.b(-6378, -18671) + var3_3, new Object[0]);
                var4_4.D(true);
                var4_4.setHorizontalAlignment(0);
                var4_4.E(kv_1.a(23244, 8381553973203421313L), 1);
                this.C.add((Component)var4_4, (var2_2 - 1) * 2 + kv_1.b(-6380, -21944));
                if (var1_1 == null) {
                    if (var2_2 < kv_1.a(578, 1244756124417691666L)) {
                        this.C.add((Component)new ch_1(1), (var2_2 - 1) * 2 + 1 + kv_1.b(-6399, -7103));
                    }
                    ++var2_2;
                }
                if (var1_1 == null) continue;
            }
            v1 = this.C;
        }
        v1.revalidate();
    }

    /*
     * Exception decompiling
     */
    protected void o(JPanel var1_1) {
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

    public SimpleDateFormat u() {
        return this.z;
    }

    public void i(SimpleDateFormat simpleDateFormat) {
        this.z = simpleDateFormat;
        this.X();
    }

    public Date I() {
        return this.x;
    }

    public void N(Date date) {
        this.B(date, this.O());
    }

    public void B(Date date, boolean bl) {
        block3: {
            kv_1 kv_12;
            block2: {
                String[] stringArray = lk_2.N();
                kv_12 = this;
                if (stringArray != null) break block2;
                if (ax_0.Z(kv_12.x, new Object[]{date})) break block3;
                kv_12 = this;
            }
            kv_12.q(date, bl);
        }
    }

    protected void J(Date date) {
        this.q(date, this.O());
    }

    protected void q(Date date, boolean bl) {
        this.x = date;
        this.w(date, bl);
        this.Z(date);
    }

    public Date l() {
        return this.k;
    }

    public void a(Date date) {
        this.w(date, this.O());
    }

    public void w(Date date, boolean bl) {
        block6: {
            block5: {
                String[] stringArray = lk_2.N();
                if (stringArray == null) {
                    if (date == null) {
                        date = new Date();
                    }
                    this.l = this.k;
                    this.k = date;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(this.l);
                int n10 = calendar.get(2);
                int n11 = calendar.get(1);
                calendar.setTime(date);
                int n12 = calendar.get(2);
                int n13 = calendar.get(1);
                if (stringArray != null) break block5;
                if (n10 == n12 && n11 == n13) break block6;
                this.X();
            }
            this.S(bl);
        }
    }

    public boolean A() {
        return this.B;
    }

    public void J(boolean bl) {
        this.B = bl;
        this.o();
        this.o(this.F);
    }

    public boolean O() {
        return this.R;
    }

    public void y(boolean bl) {
        this.R = bl;
    }

    public boolean D() {
        return this.h;
    }

    public void T(boolean bl) {
        this.h = bl;
    }

    public Color Z() {
        return this.O;
    }

    public void P(Color color) {
        this.O = color;
        this.o(this.F);
    }

    public Color b() {
        return this.o;
    }

    public void R(Color color) {
        this.o = color;
        this.o(this.F);
    }

    public Color X() {
        return this.S;
    }

    public void p(Color color) {
        this.S = color;
        this.o(this.F);
    }

    public zzzzN1Customizer v() {
        return this.u;
    }

    public void A(zzzzN1Customizer zzzzN1Customizer2) {
        this.u = zzzzN1Customizer2;
        this.o(this.F);
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        FN.o(this, bl, true);
    }

    public void J(pu_2 pu_22) {
        this.Y.add(pu_22);
    }

    public void z(pu_2 pu_22) {
        this.Y.remove(pu_22);
    }

    public void Z(Date date) {
        Iterator iterator = aL.J((Collection)this.Y).iterator();
        String[] stringArray = lk_2.N();
        while (iterator.hasNext()) {
            pu_2 pu_22 = (pu_2)iterator.next();
            pu_22.i(date);
            if (stringArray == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[23];
                        var11_1 = 0;
                        var10_2 = "8\u00d9\u00a8\u007f\u0002D\u0007\u0017\u00e5\u00e9\u00c0\u00ed\u00be\u00bb\u0007/\u00b9!K\u00fa\u00cf\u0096\t5\u000fw?\u00ba\u00c3-6\u00ab\u0013\u00b9x\u00f6\u0097\u00fe]Nq>y\u0016w>x\u00c4I|UG\u0002\u00db\u00d0\u0007\u00e9J\u00b25\u0082\u0000\u00d2\u001d \u00a9\u0015i<\u0089\u0006\u008b\u007f|\u0002\u00d4\u0000P\u00fa\u008bw\u0012\\9\u00e3\u00c3R\u00a2BJ\u00b3\t\u00e4\u0004\u00ba\u00e7#<\u0014V\u00ee/\t\u00ff\u008b\u008b\u00b6!\u00c6q\u00cc(4\u00ea\u0014W\u0003\u00b1o\u000e\u00c5\u00a2y\u00cc\u000f6p\u001c\u00f9\u00d4\u009f\u00c1U\u00c3\u0005\u00d5\u0000\u00a5\u000f1\u0004=\u00ec\u0083\u00d9\u0004-/\u00d1%\u0007\u00ca1\u0010Z\u00d0\u00ed^\u0004p\u000f*\u00a5\u0002\u0089A\u0006qq\u0081j'\u00e6\u0005M\u0001\u00b6/S\u0017\u00d4\u00b2[\u00ceKv\u00e6\u0003\u00eb\u00c0$\u001e\u0096\u00d0#XQ\u0086\u008d\u0099]\u00c3\u009e\u0007(\u00bb\u00c8\u000b\u00cf\u00c79";
                        var12_3 = "8\u00d9\u00a8\u007f\u0002D\u0007\u0017\u00e5\u00e9\u00c0\u00ed\u00be\u00bb\u0007/\u00b9!K\u00fa\u00cf\u0096\t5\u000fw?\u00ba\u00c3-6\u00ab\u0013\u00b9x\u00f6\u0097\u00fe]Nq>y\u0016w>x\u00c4I|UG\u0002\u00db\u00d0\u0007\u00e9J\u00b25\u0082\u0000\u00d2\u001d \u00a9\u0015i<\u0089\u0006\u008b\u007f|\u0002\u00d4\u0000P\u00fa\u008bw\u0012\\9\u00e3\u00c3R\u00a2BJ\u00b3\t\u00e4\u0004\u00ba\u00e7#<\u0014V\u00ee/\t\u00ff\u008b\u008b\u00b6!\u00c6q\u00cc(4\u00ea\u0014W\u0003\u00b1o\u000e\u00c5\u00a2y\u00cc\u000f6p\u001c\u00f9\u00d4\u009f\u00c1U\u00c3\u0005\u00d5\u0000\u00a5\u000f1\u0004=\u00ec\u0083\u00d9\u0004-/\u00d1%\u0007\u00ca1\u0010Z\u00d0\u00ed^\u0004p\u000f*\u00a5\u0002\u0089A\u0006qq\u0081j'\u00e6\u0005M\u0001\u00b6/S\u0017\u00d4\u00b2[\u00ceKv\u00e6\u0003\u00eb\u00c0$\u001e\u0096\u00d0#XQ\u0086\u008d\u0099]\u00c3\u009e\u0007(\u00bb\u00c8\u000b\u00cf\u00c79".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 82;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u0097\u009a\u0012\u00eaC\u00d3\u00c6\u0096\u00ceS\u00a1M\u0007\u009bA\u0013f\u00a3\t\u00f7\u0092\u009c#\u00a7\u00fbj\u0004o";
                            var12_3 = "\u0097\u009a\u0012\u00eaC\u00d3\u00c6\u0096\u00ceS\u00a1M\u0007\u009bA\u0013f\u00a3\t\u00f7\u0092\u009c#\u00a7\u00fbj\u0004o".length();
                            var9_4 = 18;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 83;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 38;
                                    break;
                                }
                                case 1: {
                                    v15 = 87;
                                    break;
                                }
                                case 2: {
                                    v15 = 54;
                                    break;
                                }
                                case 3: {
                                    v15 = 11;
                                    break;
                                }
                                case 4: {
                                    v15 = 15;
                                    break;
                                }
                                case 5: {
                                    v15 = 90;
                                    break;
                                }
                                default: {
                                    v15 = 27;
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
lbl85:
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
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                kv_1.a = var13;
                kv_1.b = new String[23];
                var0_7 = 278386161558749845L;
                var6_8 = new long[21];
                var3_9 = 0;
                var4_10 = "LTK\u00de\u00fdZD\u00fb!\u00e8\u0085D\u00bdK\u0019\u00d9\u00b4\u00faV1\u00b7\u0016\r\u0000\u00d7\u0081\u00f1\u00b0\u0095V\u00b4\u0095r\u008b\n\u00dbs\u0092\u0091\u00b9=D\u00ad\u00d2\u00e7X\u008c\u00c0$\u00f3b4\u00a1\u0014\u000f\u00cc\u00d9u\u000b\b_%\u00f4]'y\u008f S1\u0016\u00ec\u00c6\nQ\u001c,\u00c1\u00ed\u00f3\u0093\u00d6\u00c1%K2\u00dfO\u00ba;\u0092_\u00935\u00ae\u0013l\u00e6\u001b\u00d4\u008d\u00f0\u0092\u0080\u00960\u0004\u00e9p\u00b7A\u00f4\u00dc\u00e33C\u001e\u00dd\u00d0\u00efZ\u00c9\u0001\u0006?\u0007Y@JN\u00cf\u0019\u0018b\u00d7\u0012\u001a%\u00ef<H\u0095\u00ca\u001e\u00c8fw\u00ce\u00c8\u00a6\t\u008d";
                var5_11 = "LTK\u00de\u00fdZD\u00fb!\u00e8\u0085D\u00bdK\u0019\u00d9\u00b4\u00faV1\u00b7\u0016\r\u0000\u00d7\u0081\u00f1\u00b0\u0095V\u00b4\u0095r\u008b\n\u00dbs\u0092\u0091\u00b9=D\u00ad\u00d2\u00e7X\u008c\u00c0$\u00f3b4\u00a1\u0014\u000f\u00cc\u00d9u\u000b\b_%\u00f4]'y\u008f S1\u0016\u00ec\u00c6\nQ\u001c,\u00c1\u00ed\u00f3\u0093\u00d6\u00c1%K2\u00dfO\u00ba;\u0092_\u00935\u00ae\u0013l\u00e6\u001b\u00d4\u008d\u00f0\u0092\u0080\u00960\u0004\u00e9p\u00b7A\u00f4\u00dc\u00e33C\u001e\u00dd\u00d0\u00efZ\u00c9\u0001\u0006?\u0007Y@JN\u00cf\u0019\u0018b\u00d7\u0012\u001a%\u00ef<H\u0095\u00ca\u001e\u00c8fw\u00ce\u00c8\u00a6\t\u008d".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00c9\u00f6\u00b7\u00fc `{\u0004L\u0089L\u00aa\u00f1]\u00b1\u0091";
                    var5_11 = "\u00c9\u00f6\u00b7\u00fc `{\u0004L\u0089L\u00aa\u00f1]\u00b1\u0091".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        kv_1.c = var6_8;
        kv_1.e = new Integer[21];
        kv_1.E = new ImageIcon(kv_1.class.getResource(kv_1.b(-6398, -5152)));
        kv_1.V = new ImageIcon(kv_1.class.getResource(kv_1.b(-6396, 30469)));
        kv_1.d = new ImageIcon(kv_1.class.getResource(kv_1.b(-6373, -27223)));
        kv_1.t = new ImageIcon(kv_1.class.getResource(kv_1.b(-6379, -21711)));
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFE711) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 134;
                    break;
                }
                case 1: {
                    n14 = 159;
                    break;
                }
                case 2: {
                    n14 = 117;
                    break;
                }
                case 3: {
                    n14 = 124;
                    break;
                }
                case 4: {
                    n14 = 210;
                    break;
                }
                case 5: {
                    n14 = 71;
                    break;
                }
                case 6: {
                    n14 = 14;
                    break;
                }
                case 7: {
                    n14 = 9;
                    break;
                }
                case 8: {
                    n14 = 116;
                    break;
                }
                case 9: {
                    n14 = 208;
                    break;
                }
                case 10: {
                    n14 = 56;
                    break;
                }
                case 11: {
                    n14 = 182;
                    break;
                }
                case 12: {
                    n14 = 96;
                    break;
                }
                case 13: {
                    n14 = 174;
                    break;
                }
                case 14: {
                    n14 = 34;
                    break;
                }
                case 15: {
                    n14 = 77;
                    break;
                }
                case 16: {
                    n14 = 113;
                    break;
                }
                case 17: {
                    n14 = 76;
                    break;
                }
                case 18: {
                    n14 = 132;
                    break;
                }
                case 19: {
                    n14 = 172;
                    break;
                }
                case 20: {
                    n14 = 13;
                    break;
                }
                case 21: {
                    n14 = 191;
                    break;
                }
                case 22: {
                    n14 = 196;
                    break;
                }
                case 23: {
                    n14 = 192;
                    break;
                }
                case 24: {
                    n14 = 179;
                    break;
                }
                case 25: {
                    n14 = 185;
                    break;
                }
                case 26: {
                    n14 = 183;
                    break;
                }
                case 27: {
                    n14 = 225;
                    break;
                }
                case 28: {
                    n14 = 110;
                    break;
                }
                case 29: {
                    n14 = 211;
                    break;
                }
                case 30: {
                    n14 = 173;
                    break;
                }
                case 31: {
                    n14 = 84;
                    break;
                }
                case 32: {
                    n14 = 229;
                    break;
                }
                case 33: {
                    n14 = 171;
                    break;
                }
                case 34: {
                    n14 = 220;
                    break;
                }
                case 35: {
                    n14 = 181;
                    break;
                }
                case 36: {
                    n14 = 123;
                    break;
                }
                case 37: {
                    n14 = 44;
                    break;
                }
                case 38: {
                    n14 = 130;
                    break;
                }
                case 39: {
                    n14 = 244;
                    break;
                }
                case 40: {
                    n14 = 178;
                    break;
                }
                case 41: {
                    n14 = 145;
                    break;
                }
                case 42: {
                    n14 = 2;
                    break;
                }
                case 43: {
                    n14 = 50;
                    break;
                }
                case 44: {
                    n14 = 189;
                    break;
                }
                case 45: {
                    n14 = 205;
                    break;
                }
                case 46: {
                    n14 = 126;
                    break;
                }
                case 47: {
                    n14 = 46;
                    break;
                }
                case 48: {
                    n14 = 111;
                    break;
                }
                case 49: {
                    n14 = 144;
                    break;
                }
                case 50: {
                    n14 = 218;
                    break;
                }
                case 51: {
                    n14 = 81;
                    break;
                }
                case 52: {
                    n14 = 93;
                    break;
                }
                case 53: {
                    n14 = 226;
                    break;
                }
                case 54: {
                    n14 = 21;
                    break;
                }
                case 55: {
                    n14 = 224;
                    break;
                }
                case 56: {
                    n14 = 142;
                    break;
                }
                case 57: {
                    n14 = 48;
                    break;
                }
                case 58: {
                    n14 = 45;
                    break;
                }
                case 59: {
                    n14 = 15;
                    break;
                }
                case 60: {
                    n14 = 31;
                    break;
                }
                case 61: {
                    n14 = 78;
                    break;
                }
                case 62: {
                    n14 = 19;
                    break;
                }
                case 63: {
                    n14 = 152;
                    break;
                }
                case 64: {
                    n14 = 198;
                    break;
                }
                case 65: {
                    n14 = 8;
                    break;
                }
                case 66: {
                    n14 = 203;
                    break;
                }
                case 67: {
                    n14 = 58;
                    break;
                }
                case 68: {
                    n14 = 115;
                    break;
                }
                case 69: {
                    n14 = 184;
                    break;
                }
                case 70: {
                    n14 = 69;
                    break;
                }
                case 71: {
                    n14 = 232;
                    break;
                }
                case 72: {
                    n14 = 63;
                    break;
                }
                case 73: {
                    n14 = 252;
                    break;
                }
                case 74: {
                    n14 = 254;
                    break;
                }
                case 75: {
                    n14 = 51;
                    break;
                }
                case 76: {
                    n14 = 108;
                    break;
                }
                case 77: {
                    n14 = 104;
                    break;
                }
                case 78: {
                    n14 = 143;
                    break;
                }
                case 79: {
                    n14 = 106;
                    break;
                }
                case 80: {
                    n14 = 175;
                    break;
                }
                case 81: {
                    n14 = 95;
                    break;
                }
                case 82: {
                    n14 = 38;
                    break;
                }
                case 83: {
                    n14 = 149;
                    break;
                }
                case 84: {
                    n14 = 238;
                    break;
                }
                case 85: {
                    n14 = 250;
                    break;
                }
                case 86: {
                    n14 = 98;
                    break;
                }
                case 87: {
                    n14 = 53;
                    break;
                }
                case 88: {
                    n14 = 24;
                    break;
                }
                case 89: {
                    n14 = 148;
                    break;
                }
                case 90: {
                    n14 = 188;
                    break;
                }
                case 91: {
                    n14 = 27;
                    break;
                }
                case 92: {
                    n14 = 43;
                    break;
                }
                case 93: {
                    n14 = 101;
                    break;
                }
                case 94: {
                    n14 = 66;
                    break;
                }
                case 95: {
                    n14 = 147;
                    break;
                }
                case 96: {
                    n14 = 88;
                    break;
                }
                case 97: {
                    n14 = 239;
                    break;
                }
                case 98: {
                    n14 = 118;
                    break;
                }
                case 99: {
                    n14 = 55;
                    break;
                }
                case 100: {
                    n14 = 73;
                    break;
                }
                case 101: {
                    n14 = 222;
                    break;
                }
                case 102: {
                    n14 = 107;
                    break;
                }
                case 103: {
                    n14 = 135;
                    break;
                }
                case 104: {
                    n14 = 41;
                    break;
                }
                case 105: {
                    n14 = 245;
                    break;
                }
                case 106: {
                    n14 = 234;
                    break;
                }
                case 107: {
                    n14 = 214;
                    break;
                }
                case 108: {
                    n14 = 133;
                    break;
                }
                case 109: {
                    n14 = 57;
                    break;
                }
                case 110: {
                    n14 = 109;
                    break;
                }
                case 111: {
                    n14 = 129;
                    break;
                }
                case 112: {
                    n14 = 37;
                    break;
                }
                case 113: {
                    n14 = 228;
                    break;
                }
                case 114: {
                    n14 = 86;
                    break;
                }
                case 115: {
                    n14 = 10;
                    break;
                }
                case 116: {
                    n14 = 230;
                    break;
                }
                case 117: {
                    n14 = 20;
                    break;
                }
                case 118: {
                    n14 = 249;
                    break;
                }
                case 119: {
                    n14 = 137;
                    break;
                }
                case 120: {
                    n14 = 60;
                    break;
                }
                case 121: {
                    n14 = 91;
                    break;
                }
                case 122: {
                    n14 = 213;
                    break;
                }
                case 123: {
                    n14 = 158;
                    break;
                }
                case 124: {
                    n14 = 202;
                    break;
                }
                case 125: {
                    n14 = 223;
                    break;
                }
                case 126: {
                    n14 = 251;
                    break;
                }
                case 127: {
                    n14 = 4;
                    break;
                }
                case 128: {
                    n14 = 0;
                    break;
                }
                case 129: {
                    n14 = 253;
                    break;
                }
                case 130: {
                    n14 = 22;
                    break;
                }
                case 131: {
                    n14 = 204;
                    break;
                }
                case 132: {
                    n14 = 248;
                    break;
                }
                case 133: {
                    n14 = 68;
                    break;
                }
                case 134: {
                    n14 = 42;
                    break;
                }
                case 135: {
                    n14 = 231;
                    break;
                }
                case 136: {
                    n14 = 80;
                    break;
                }
                case 137: {
                    n14 = 12;
                    break;
                }
                case 138: {
                    n14 = 25;
                    break;
                }
                case 139: {
                    n14 = 146;
                    break;
                }
                case 140: {
                    n14 = 40;
                    break;
                }
                case 141: {
                    n14 = 187;
                    break;
                }
                case 142: {
                    n14 = 87;
                    break;
                }
                case 143: {
                    n14 = 195;
                    break;
                }
                case 144: {
                    n14 = 28;
                    break;
                }
                case 145: {
                    n14 = 177;
                    break;
                }
                case 146: {
                    n14 = 221;
                    break;
                }
                case 147: {
                    n14 = 167;
                    break;
                }
                case 148: {
                    n14 = 233;
                    break;
                }
                case 149: {
                    n14 = 241;
                    break;
                }
                case 150: {
                    n14 = 54;
                    break;
                }
                case 151: {
                    n14 = 105;
                    break;
                }
                case 152: {
                    n14 = 18;
                    break;
                }
                case 153: {
                    n14 = 186;
                    break;
                }
                case 154: {
                    n14 = 49;
                    break;
                }
                case 155: {
                    n14 = 90;
                    break;
                }
                case 156: {
                    n14 = 99;
                    break;
                }
                case 157: {
                    n14 = 1;
                    break;
                }
                case 158: {
                    n14 = 131;
                    break;
                }
                case 159: {
                    n14 = 39;
                    break;
                }
                case 160: {
                    n14 = 23;
                    break;
                }
                case 161: {
                    n14 = 114;
                    break;
                }
                case 162: {
                    n14 = 102;
                    break;
                }
                case 163: {
                    n14 = 74;
                    break;
                }
                case 164: {
                    n14 = 161;
                    break;
                }
                case 165: {
                    n14 = 100;
                    break;
                }
                case 166: {
                    n14 = 164;
                    break;
                }
                case 167: {
                    n14 = 30;
                    break;
                }
                case 168: {
                    n14 = 16;
                    break;
                }
                case 169: {
                    n14 = 32;
                    break;
                }
                case 170: {
                    n14 = 70;
                    break;
                }
                case 171: {
                    n14 = 157;
                    break;
                }
                case 172: {
                    n14 = 240;
                    break;
                }
                case 173: {
                    n14 = 153;
                    break;
                }
                case 174: {
                    n14 = 33;
                    break;
                }
                case 175: {
                    n14 = 197;
                    break;
                }
                case 176: {
                    n14 = 5;
                    break;
                }
                case 177: {
                    n14 = 209;
                    break;
                }
                case 178: {
                    n14 = 180;
                    break;
                }
                case 179: {
                    n14 = 212;
                    break;
                }
                case 180: {
                    n14 = 92;
                    break;
                }
                case 181: {
                    n14 = 127;
                    break;
                }
                case 182: {
                    n14 = 136;
                    break;
                }
                case 183: {
                    n14 = 243;
                    break;
                }
                case 184: {
                    n14 = 47;
                    break;
                }
                case 185: {
                    n14 = 190;
                    break;
                }
                case 186: {
                    n14 = 165;
                    break;
                }
                case 187: {
                    n14 = 255;
                    break;
                }
                case 188: {
                    n14 = 163;
                    break;
                }
                case 189: {
                    n14 = 235;
                    break;
                }
                case 190: {
                    n14 = 200;
                    break;
                }
                case 191: {
                    n14 = 6;
                    break;
                }
                case 192: {
                    n14 = 169;
                    break;
                }
                case 193: {
                    n14 = 3;
                    break;
                }
                case 194: {
                    n14 = 65;
                    break;
                }
                case 195: {
                    n14 = 83;
                    break;
                }
                case 196: {
                    n14 = 236;
                    break;
                }
                case 197: {
                    n14 = 199;
                    break;
                }
                case 198: {
                    n14 = 62;
                    break;
                }
                case 199: {
                    n14 = 36;
                    break;
                }
                case 200: {
                    n14 = 194;
                    break;
                }
                case 201: {
                    n14 = 215;
                    break;
                }
                case 202: {
                    n14 = 82;
                    break;
                }
                case 203: {
                    n14 = 162;
                    break;
                }
                case 204: {
                    n14 = 139;
                    break;
                }
                case 205: {
                    n14 = 141;
                    break;
                }
                case 206: {
                    n14 = 154;
                    break;
                }
                case 207: {
                    n14 = 85;
                    break;
                }
                case 208: {
                    n14 = 247;
                    break;
                }
                case 209: {
                    n14 = 125;
                    break;
                }
                case 210: {
                    n14 = 201;
                    break;
                }
                case 211: {
                    n14 = 72;
                    break;
                }
                case 212: {
                    n14 = 121;
                    break;
                }
                case 213: {
                    n14 = 94;
                    break;
                }
                case 214: {
                    n14 = 140;
                    break;
                }
                case 215: {
                    n14 = 89;
                    break;
                }
                case 216: {
                    n14 = 227;
                    break;
                }
                case 217: {
                    n14 = 35;
                    break;
                }
                case 218: {
                    n14 = 207;
                    break;
                }
                case 219: {
                    n14 = 237;
                    break;
                }
                case 220: {
                    n14 = 97;
                    break;
                }
                case 221: {
                    n14 = 242;
                    break;
                }
                case 222: {
                    n14 = 150;
                    break;
                }
                case 223: {
                    n14 = 26;
                    break;
                }
                case 224: {
                    n14 = 155;
                    break;
                }
                case 225: {
                    n14 = 61;
                    break;
                }
                case 226: {
                    n14 = 122;
                    break;
                }
                case 227: {
                    n14 = 29;
                    break;
                }
                case 228: {
                    n14 = 176;
                    break;
                }
                case 229: {
                    n14 = 119;
                    break;
                }
                case 230: {
                    n14 = 156;
                    break;
                }
                case 231: {
                    n14 = 120;
                    break;
                }
                case 232: {
                    n14 = 67;
                    break;
                }
                case 233: {
                    n14 = 79;
                    break;
                }
                case 234: {
                    n14 = 52;
                    break;
                }
                case 235: {
                    n14 = 217;
                    break;
                }
                case 236: {
                    n14 = 128;
                    break;
                }
                case 237: {
                    n14 = 206;
                    break;
                }
                case 238: {
                    n14 = 75;
                    break;
                }
                case 239: {
                    n14 = 166;
                    break;
                }
                case 240: {
                    n14 = 168;
                    break;
                }
                case 241: {
                    n14 = 193;
                    break;
                }
                case 242: {
                    n14 = 59;
                    break;
                }
                case 243: {
                    n14 = 219;
                    break;
                }
                case 244: {
                    n14 = 103;
                    break;
                }
                case 245: {
                    n14 = 160;
                    break;
                }
                case 246: {
                    n14 = 151;
                    break;
                }
                case 247: {
                    n14 = 11;
                    break;
                }
                case 248: {
                    n14 = 7;
                    break;
                }
                case 249: {
                    n14 = 64;
                    break;
                }
                case 250: {
                    n14 = 17;
                    break;
                }
                case 251: {
                    n14 = 216;
                    break;
                }
                case 252: {
                    n14 = 170;
                    break;
                }
                case 253: {
                    n14 = 112;
                    break;
                }
                case 254: {
                    n14 = 246;
                    break;
                }
                default: {
                    n14 = 138;
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
            kv_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x125C;
        if (e[n11] == null) {
            kv_1.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

