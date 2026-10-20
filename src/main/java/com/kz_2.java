/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DE;
import com.E7;
import com.FN;
import com.GR;
import com.I6;
import com.KD;
import com.ON;
import com.QA;
import com.QO;
import com.QW;
import com.R_;
import com.TJ;
import com.aL;
import com.b.V;
import com.c4_0;
import com.ck_2;
import com.cz_0;
import com.ex_0;
import com.ic_0;
import com.ir_2;
import com.is_2;
import com.kn_0;
import com.ky_2;
import com.ne_2;
import com.ou_0;
import com.pb_2;
import com.pc_1;
import com.qe_0;
import com.w6_0;
import com.xj_1;
import com.y_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JWindow;
import javax.swing.filechooser.FileSystemView;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.kz
 */
public class kz_2
extends ky_2 {
    protected static final ImageIcon Q;
    protected static final ImageIcon p;
    protected static final ImageIcon M;
    protected static FileSystemView U;
    protected List Y = new ArrayList(1);
    protected ky_2 k;
    protected ne_2 Z;
    protected FocusAdapter s;
    protected KD D = null;
    protected boolean u = true;
    protected JWindow d = null;
    protected int v = 0;
    protected pb_2 S = null;
    protected qe_0 W = null;
    protected V e = DE.Y;
    protected int r = -1;
    protected boolean y = true;
    protected File b;
    protected final c4_0 c;
    protected boolean o = false;
    private static String g;
    private static final String[] a;
    private static final String[] f;

    public kz_2() {
        this(cz_0.z()[0]);
    }

    public kz_2(String string) {
        this(new File(string));
    }

    public kz_2(File file) {
        super(true);
        this.C(-1);
        this.setOpaque(false);
        this.i(true);
        this.u(false);
        this.setBackground(Color.WHITE);
        this.setForeground(QO.V);
        this.setTransferHandler(new ex_0(this));
        this.k = new ky_2();
        this.k.setOpaque(false);
        this.k.setLayout(new TJ(0, true));
        this.add((Component)this.k, "\u0000ERR:ArrayIndexOutOfBoundsException:Index 22465 out of bounds for length 3");
        this.Z = ne_2.k(false);
        this.Z.setForeground(QO.V);
        this.Z.n(2);
        this.Z.addActionListener(new xj_1(this));
        this.Z.addKeyListener(new ou_0(this));
        this.s = new R_(this);
        this.Z.addCaretListener(new ic_0(this));
        this.k.addMouseListener(new pc_1(this));
        w6_0.h(this, this, GR.lR, new is_2(this), true);
        this.addComponentListener(new y_0(this));
        this.c = new ck_2(this);
        ON.b(this, this.c);
        this.N(file);
    }

    protected void m() {
        block3: {
            block6: {
                kz_2 kz_22;
                block4: {
                    block5: {
                        ne_2 ne_22;
                        String string;
                        block2: {
                            string = kz_2.M();
                            ne_22 = this.Z;
                            if (string == null) break block2;
                            if (ne_22.isFocusOwner()) break block3;
                            ne_22 = this.Z;
                        }
                        ne_22.setPreferredSize(new Dimension(1, this.k.getHeight()));
                        this.k.removeAll();
                        kz_22 = this;
                        if (string == null) break block4;
                        if (kz_22.b == null) break block5;
                        this.Z.setText(this.y());
                        if (string != null) break block6;
                    }
                    kz_22 = this;
                }
                kz_22.Z.setText("");
            }
            this.Z.selectAll();
            this.k.add(this.Z);
            this.k.revalidate();
            this.k.repaint();
            this.transferFocus();
            this.Z.addFocusListener(this.s);
        }
    }

    protected String y() {
        String string = this.b.getAbsolutePath();
        String string2 = kz_2.M();
        String string3 = string;
        if (string2 != null) {
            string3 = string3.endsWith(File.separator) ? string : string + File.separator;
        }
        string = string3;
        return string;
    }

    public boolean V() {
        return this.Z.isFocusOwner();
    }

    @Override
    public void setForeground(Color color) {
        block3: {
            kz_2 kz_22;
            block2: {
                String string = kz_2.M();
                super.setForeground(color);
                String string2 = string;
                kz_22 = this;
                if (string2 == null) break block2;
                if (!kz_22.isShowing()) break block3;
                FN.v(this.k, color);
                kz_22 = this;
            }
            kz_22.Z.setForeground(color);
        }
    }

    public boolean A() {
        return this.u;
    }

    public void W(boolean bl) {
        this.u = bl;
    }

    public V O() {
        return this.e;
    }

    public void F(V v2) {
        this.s(v2, true);
    }

    public void s(V v2, boolean bl) {
        block3: {
            kz_2 kz_22;
            block2: {
                String string = kz_2.M();
                kz_22 = this;
                if (string == null) break block2;
                kz_22.e = v2;
                if (!bl) break block3;
                kz_22 = this;
            }
            kz_22.P();
        }
    }

    public boolean G() {
        return this.y;
    }

    public void q(boolean bl) {
        this.y = bl;
    }

    public File G() {
        return this.b;
    }

    public void E(File file) {
        this.N(file);
    }

    public ne_2 H() {
        return this.Z;
    }

    public void P() {
        this.N(this.b);
    }

    /*
     * Exception decompiling
     */
    protected synchronized void N(File var1_1) {
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

    protected List q(File file, String string) {
        ArrayList<File> arrayList;
        block7: {
            File[] fileArray;
            String string2;
            String string3;
            block6: {
                string3 = string.toLowerCase();
                File[] fileArray2 = this.p(file);
                string2 = kz_2.M();
                arrayList = new ArrayList<File>();
                fileArray = fileArray2;
                if (string2 == null) break block6;
                if (fileArray == null) break block7;
                fileArray = fileArray2;
            }
            File[] fileArray3 = fileArray;
            int n10 = fileArray3.length;
            int n11 = 0;
            while (n11 < n10) {
                File file2 = fileArray3[n11];
                if (string2 != null) {
                    if (file2.getName().toLowerCase().contains(string3)) {
                        arrayList.add(file2);
                    }
                    ++n11;
                }
                if (string2 != null) continue;
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected File[] p(File file) {
        File[] fileArray;
        String string = kz_2.M();
        File file2 = file;
        if (string != null) {
            if (file2 == null) {
                fileArray = cz_0.z();
                return fileArray;
            }
            file2 = file;
        }
        fileArray = file2.listFiles(this.e);
        return fileArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean O() {
        String string = kz_2.M();
        int n10 = this.k.getPreferredSize().width;
        int n11 = this.k.getWidth();
        if (string != null) {
            if (n10 <= n11) return 0 != 0;
            n10 = this.k.getComponentCount();
            if (string == null) return n10 != 0;
            n11 = 5;
        }
        if (n10 <= n11) return 0 != 0;
        return 1 != 0;
    }

    protected KD l() {
        String string = kz_2.M();
        KD kD = this.D;
        if (string != null) {
            if (kD == null) {
                this.D = KD.y(cz_0.C());
                this.D.s(this.q());
                this.D.f(0);
                this.D.O(0);
                this.D.K(true);
                this.D.g(false);
                this.D.r(false);
                this.D.X(false);
                this.D.u(true);
                this.D.addActionListener(new I6(this));
            }
            kD = this.D;
        }
        return kD;
    }

    public pb_2 Q() {
        return this.S;
    }

    public int Z() {
        return this.v;
    }

    public void z(pb_2 pb_22, int n10) {
        this.S = pb_22;
        this.v = n10;
    }

    protected qe_0 B(boolean bl) {
        kz_2 kz_22;
        block9: {
            String string;
            block12: {
                qe_0 qe_02;
                block10: {
                    block11: {
                        block8: {
                            string = kz_2.M();
                            qe_02 = this.W;
                            if (string == null) break block10;
                            if (qe_02 != null) break block11;
                            this.S = new pb_2();
                            File[] fileArray = cz_0.z();
                            for (File file : cz_0.C(fileArray)) {
                                QW qW = new QW(cz_0.X(file));
                                qW.setIcon(cz_0.U(file, false));
                                qW.addActionListener(new E7(this, file));
                                this.S.add(qW);
                                ++this.v;
                                if (string != null) {
                                    if (string != null) continue;
                                }
                                break block8;
                            }
                            this.W = new qe_0();
                        }
                        this.W.setIcon(bl ? M : p);
                        this.W.setSelectedIcon(Q);
                        this.W.A(false);
                        this.W.k(0);
                        this.W.N(0);
                        this.W.G(true);
                        this.W.M(false);
                        this.W.setFocusable(false);
                        this.W.t(0);
                        this.W.K(0);
                        this.W.setComponentPopupMenu(this.S);
                        this.W.addActionListener(new ir_2(this));
                        this.S.addPopupMenuListener(new QA(this));
                        if (string != null) break block12;
                    }
                    qe_02 = this.W;
                }
                qe_02.setIcon(bl ? M : p);
            }
            while (this.S.getComponentCount() > this.v) {
                kz_22 = this;
                if (string != null) {
                    kz_22.S.remove(0);
                    if (string != null) continue;
                }
                break block9;
            }
            kz_22 = this;
        }
        return kz_22.W;
    }

    protected void X(File file) {
        file = cz_0.M(file);
        this.N(file);
        this.Q(file);
        this.transferFocus();
    }

    public void z(kn_0 kn_02) {
        this.Y.add(kn_02);
    }

    public void B(kn_0 kn_02) {
        this.Y.remove(kn_02);
    }

    protected void Q(File file) {
        Iterator iterator = aL.J((Collection)this.Y).iterator();
        String string = kz_2.M();
        while (iterator.hasNext()) {
            kn_0 kn_02 = (kn_0)iterator.next();
            kn_02.r(file);
            if (string != null) continue;
        }
    }

    @Override
    public void applyComponentOrientation(ComponentOrientation componentOrientation) {
        super.applyComponentOrientation(componentOrientation);
        this.P();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[6];
                var3_1 = 0;
                kz_2.r("exYf7b");
                var2_2 = "\u00b6\u00c3R\"\u00cf\u0002P\u0086\u000f\u00f8\u00d2v@\u0012h\u008b\tdO\b\u008fg\u00d2R\u0006J`N\u00ca\"=\u000e\u00e7P\u0095\u0010nb\u001aD\u008aw\u00aeI\u00bc\u0096";
                var4_3 = "\u00b6\u00c3R\"\u00cf\u0002P\u0086\u000f\u00f8\u00d2v@\u0012h\u008b\tdO\b\u008fg\u00d2R\u0006J`N\u00ca\"=\u000e\u00e7P\u0095\u0010nb\u001aD\u008aw\u00aeI\u00bc\u0096".length();
                var1_4 = 8;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 19;
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
                    var2_2 = "\u0082\u00ef\u00de\u00adT\u00f9)\u00f3\u000ek\u0007\u000e\u00f0\u0017t7\u0086=tazO\u00fa";
                    var4_3 = "\u0082\u00ef\u00de\u00adT\u00f9)\u00f3\u000ek\u0007\u000e\u00f0\u0017t7\u0086=tazO\u00fa".length();
                    var1_4 = 8;
                    var0_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 81;
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
                            v15 = 81;
                            break;
                        }
                        case 1: {
                            v15 = 56;
                            break;
                        }
                        case 2: {
                            v15 = 25;
                            break;
                        }
                        case 3: {
                            v15 = 13;
                            break;
                        }
                        case 4: {
                            v15 = 127;
                            break;
                        }
                        case 5: {
                            v15 = 60;
                            break;
                        }
                        default: {
                            v15 = 56;
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
        kz_2.a = var5;
        kz_2.f = new String[6];
        kz_2.Q = new ImageIcon(kz_2.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 22470 out of bounds for length 3"));
        kz_2.p = new ImageIcon(kz_2.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 22464 out of bounds for length 3"));
        kz_2.M = new ImageIcon(kz_2.class.getResource("\u0000ERR:ArrayIndexOutOfBoundsException:Index 22466 out of bounds for length 3"));
        kz_2.U = FileSystemView.getFileSystemView();
    }

    public static void r(String string) {
        g = string;
    }

    public static String M() {
        return g;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x2EDF) & 0xFFFF;
        if (f[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 209;
                    break;
                }
                case 1: {
                    n14 = 116;
                    break;
                }
                case 2: {
                    n14 = 104;
                    break;
                }
                case 3: {
                    n14 = 76;
                    break;
                }
                case 4: {
                    n14 = 121;
                    break;
                }
                case 5: {
                    n14 = 91;
                    break;
                }
                case 6: {
                    n14 = 35;
                    break;
                }
                case 7: {
                    n14 = 181;
                    break;
                }
                case 8: {
                    n14 = 161;
                    break;
                }
                case 9: {
                    n14 = 130;
                    break;
                }
                case 10: {
                    n14 = 17;
                    break;
                }
                case 11: {
                    n14 = 220;
                    break;
                }
                case 12: {
                    n14 = 7;
                    break;
                }
                case 13: {
                    n14 = 236;
                    break;
                }
                case 14: {
                    n14 = 105;
                    break;
                }
                case 15: {
                    n14 = 193;
                    break;
                }
                case 16: {
                    n14 = 238;
                    break;
                }
                case 17: {
                    n14 = 80;
                    break;
                }
                case 18: {
                    n14 = 18;
                    break;
                }
                case 19: {
                    n14 = 46;
                    break;
                }
                case 20: {
                    n14 = 99;
                    break;
                }
                case 21: {
                    n14 = 78;
                    break;
                }
                case 22: {
                    n14 = 227;
                    break;
                }
                case 23: {
                    n14 = 89;
                    break;
                }
                case 24: {
                    n14 = 182;
                    break;
                }
                case 25: {
                    n14 = 120;
                    break;
                }
                case 26: {
                    n14 = 160;
                    break;
                }
                case 27: {
                    n14 = 110;
                    break;
                }
                case 28: {
                    n14 = 55;
                    break;
                }
                case 29: {
                    n14 = 28;
                    break;
                }
                case 30: {
                    n14 = 189;
                    break;
                }
                case 31: {
                    n14 = 97;
                    break;
                }
                case 32: {
                    n14 = 186;
                    break;
                }
                case 33: {
                    n14 = 22;
                    break;
                }
                case 34: {
                    n14 = 0;
                    break;
                }
                case 35: {
                    n14 = 32;
                    break;
                }
                case 36: {
                    n14 = 244;
                    break;
                }
                case 37: {
                    n14 = 156;
                    break;
                }
                case 38: {
                    n14 = 164;
                    break;
                }
                case 39: {
                    n14 = 98;
                    break;
                }
                case 40: {
                    n14 = 228;
                    break;
                }
                case 41: {
                    n14 = 250;
                    break;
                }
                case 42: {
                    n14 = 232;
                    break;
                }
                case 43: {
                    n14 = 25;
                    break;
                }
                case 44: {
                    n14 = 234;
                    break;
                }
                case 45: {
                    n14 = 101;
                    break;
                }
                case 46: {
                    n14 = 108;
                    break;
                }
                case 47: {
                    n14 = 96;
                    break;
                }
                case 48: {
                    n14 = 223;
                    break;
                }
                case 49: {
                    n14 = 169;
                    break;
                }
                case 50: {
                    n14 = 20;
                    break;
                }
                case 51: {
                    n14 = 4;
                    break;
                }
                case 52: {
                    n14 = 103;
                    break;
                }
                case 53: {
                    n14 = 174;
                    break;
                }
                case 54: {
                    n14 = 150;
                    break;
                }
                case 55: {
                    n14 = 127;
                    break;
                }
                case 56: {
                    n14 = 201;
                    break;
                }
                case 57: {
                    n14 = 214;
                    break;
                }
                case 58: {
                    n14 = 249;
                    break;
                }
                case 59: {
                    n14 = 230;
                    break;
                }
                case 60: {
                    n14 = 36;
                    break;
                }
                case 61: {
                    n14 = 192;
                    break;
                }
                case 62: {
                    n14 = 65;
                    break;
                }
                case 63: {
                    n14 = 159;
                    break;
                }
                case 64: {
                    n14 = 239;
                    break;
                }
                case 65: {
                    n14 = 19;
                    break;
                }
                case 66: {
                    n14 = 177;
                    break;
                }
                case 67: {
                    n14 = 194;
                    break;
                }
                case 68: {
                    n14 = 67;
                    break;
                }
                case 69: {
                    n14 = 170;
                    break;
                }
                case 70: {
                    n14 = 171;
                    break;
                }
                case 71: {
                    n14 = 163;
                    break;
                }
                case 72: {
                    n14 = 179;
                    break;
                }
                case 73: {
                    n14 = 31;
                    break;
                }
                case 74: {
                    n14 = 106;
                    break;
                }
                case 75: {
                    n14 = 40;
                    break;
                }
                case 76: {
                    n14 = 75;
                    break;
                }
                case 77: {
                    n14 = 51;
                    break;
                }
                case 78: {
                    n14 = 226;
                    break;
                }
                case 79: {
                    n14 = 198;
                    break;
                }
                case 80: {
                    n14 = 77;
                    break;
                }
                case 81: {
                    n14 = 221;
                    break;
                }
                case 82: {
                    n14 = 215;
                    break;
                }
                case 83: {
                    n14 = 216;
                    break;
                }
                case 84: {
                    n14 = 148;
                    break;
                }
                case 85: {
                    n14 = 152;
                    break;
                }
                case 86: {
                    n14 = 5;
                    break;
                }
                case 87: {
                    n14 = 240;
                    break;
                }
                case 88: {
                    n14 = 149;
                    break;
                }
                case 89: {
                    n14 = 39;
                    break;
                }
                case 90: {
                    n14 = 246;
                    break;
                }
                case 91: {
                    n14 = 9;
                    break;
                }
                case 92: {
                    n14 = 207;
                    break;
                }
                case 93: {
                    n14 = 107;
                    break;
                }
                case 94: {
                    n14 = 206;
                    break;
                }
                case 95: {
                    n14 = 94;
                    break;
                }
                case 96: {
                    n14 = 33;
                    break;
                }
                case 97: {
                    n14 = 241;
                    break;
                }
                case 98: {
                    n14 = 58;
                    break;
                }
                case 99: {
                    n14 = 146;
                    break;
                }
                case 100: {
                    n14 = 251;
                    break;
                }
                case 101: {
                    n14 = 142;
                    break;
                }
                case 102: {
                    n14 = 129;
                    break;
                }
                case 103: {
                    n14 = 44;
                    break;
                }
                case 104: {
                    n14 = 199;
                    break;
                }
                case 105: {
                    n14 = 82;
                    break;
                }
                case 106: {
                    n14 = 167;
                    break;
                }
                case 107: {
                    n14 = 245;
                    break;
                }
                case 108: {
                    n14 = 125;
                    break;
                }
                case 109: {
                    n14 = 74;
                    break;
                }
                case 110: {
                    n14 = 140;
                    break;
                }
                case 111: {
                    n14 = 29;
                    break;
                }
                case 112: {
                    n14 = 172;
                    break;
                }
                case 113: {
                    n14 = 124;
                    break;
                }
                case 114: {
                    n14 = 154;
                    break;
                }
                case 115: {
                    n14 = 253;
                    break;
                }
                case 116: {
                    n14 = 157;
                    break;
                }
                case 117: {
                    n14 = 204;
                    break;
                }
                case 118: {
                    n14 = 34;
                    break;
                }
                case 119: {
                    n14 = 27;
                    break;
                }
                case 120: {
                    n14 = 218;
                    break;
                }
                case 121: {
                    n14 = 229;
                    break;
                }
                case 122: {
                    n14 = 112;
                    break;
                }
                case 123: {
                    n14 = 165;
                    break;
                }
                case 124: {
                    n14 = 138;
                    break;
                }
                case 125: {
                    n14 = 15;
                    break;
                }
                case 126: {
                    n14 = 176;
                    break;
                }
                case 127: {
                    n14 = 134;
                    break;
                }
                case 128: {
                    n14 = 14;
                    break;
                }
                case 129: {
                    n14 = 16;
                    break;
                }
                case 130: {
                    n14 = 118;
                    break;
                }
                case 131: {
                    n14 = 133;
                    break;
                }
                case 132: {
                    n14 = 115;
                    break;
                }
                case 133: {
                    n14 = 61;
                    break;
                }
                case 134: {
                    n14 = 243;
                    break;
                }
                case 135: {
                    n14 = 86;
                    break;
                }
                case 136: {
                    n14 = 155;
                    break;
                }
                case 137: {
                    n14 = 211;
                    break;
                }
                case 138: {
                    n14 = 187;
                    break;
                }
                case 139: {
                    n14 = 231;
                    break;
                }
                case 140: {
                    n14 = 47;
                    break;
                }
                case 141: {
                    n14 = 144;
                    break;
                }
                case 142: {
                    n14 = 41;
                    break;
                }
                case 143: {
                    n14 = 210;
                    break;
                }
                case 144: {
                    n14 = 63;
                    break;
                }
                case 145: {
                    n14 = 224;
                    break;
                }
                case 146: {
                    n14 = 70;
                    break;
                }
                case 147: {
                    n14 = 212;
                    break;
                }
                case 148: {
                    n14 = 72;
                    break;
                }
                case 149: {
                    n14 = 190;
                    break;
                }
                case 150: {
                    n14 = 185;
                    break;
                }
                case 151: {
                    n14 = 21;
                    break;
                }
                case 152: {
                    n14 = 54;
                    break;
                }
                case 153: {
                    n14 = 128;
                    break;
                }
                case 154: {
                    n14 = 217;
                    break;
                }
                case 155: {
                    n14 = 90;
                    break;
                }
                case 156: {
                    n14 = 137;
                    break;
                }
                case 157: {
                    n14 = 13;
                    break;
                }
                case 158: {
                    n14 = 188;
                    break;
                }
                case 159: {
                    n14 = 180;
                    break;
                }
                case 160: {
                    n14 = 1;
                    break;
                }
                case 161: {
                    n14 = 132;
                    break;
                }
                case 162: {
                    n14 = 60;
                    break;
                }
                case 163: {
                    n14 = 95;
                    break;
                }
                case 164: {
                    n14 = 113;
                    break;
                }
                case 165: {
                    n14 = 219;
                    break;
                }
                case 166: {
                    n14 = 123;
                    break;
                }
                case 167: {
                    n14 = 79;
                    break;
                }
                case 168: {
                    n14 = 247;
                    break;
                }
                case 169: {
                    n14 = 45;
                    break;
                }
                case 170: {
                    n14 = 195;
                    break;
                }
                case 171: {
                    n14 = 92;
                    break;
                }
                case 172: {
                    n14 = 52;
                    break;
                }
                case 173: {
                    n14 = 2;
                    break;
                }
                case 174: {
                    n14 = 147;
                    break;
                }
                case 175: {
                    n14 = 222;
                    break;
                }
                case 176: {
                    n14 = 100;
                    break;
                }
                case 177: {
                    n14 = 126;
                    break;
                }
                case 178: {
                    n14 = 166;
                    break;
                }
                case 179: {
                    n14 = 196;
                    break;
                }
                case 180: {
                    n14 = 173;
                    break;
                }
                case 181: {
                    n14 = 141;
                    break;
                }
                case 182: {
                    n14 = 254;
                    break;
                }
                case 183: {
                    n14 = 69;
                    break;
                }
                case 184: {
                    n14 = 111;
                    break;
                }
                case 185: {
                    n14 = 68;
                    break;
                }
                case 186: {
                    n14 = 66;
                    break;
                }
                case 187: {
                    n14 = 122;
                    break;
                }
                case 188: {
                    n14 = 252;
                    break;
                }
                case 189: {
                    n14 = 81;
                    break;
                }
                case 190: {
                    n14 = 136;
                    break;
                }
                case 191: {
                    n14 = 203;
                    break;
                }
                case 192: {
                    n14 = 87;
                    break;
                }
                case 193: {
                    n14 = 12;
                    break;
                }
                case 194: {
                    n14 = 84;
                    break;
                }
                case 195: {
                    n14 = 59;
                    break;
                }
                case 196: {
                    n14 = 237;
                    break;
                }
                case 197: {
                    n14 = 131;
                    break;
                }
                case 198: {
                    n14 = 119;
                    break;
                }
                case 199: {
                    n14 = 178;
                    break;
                }
                case 200: {
                    n14 = 184;
                    break;
                }
                case 201: {
                    n14 = 88;
                    break;
                }
                case 202: {
                    n14 = 24;
                    break;
                }
                case 203: {
                    n14 = 143;
                    break;
                }
                case 204: {
                    n14 = 8;
                    break;
                }
                case 205: {
                    n14 = 205;
                    break;
                }
                case 206: {
                    n14 = 85;
                    break;
                }
                case 207: {
                    n14 = 6;
                    break;
                }
                case 208: {
                    n14 = 117;
                    break;
                }
                case 209: {
                    n14 = 208;
                    break;
                }
                case 210: {
                    n14 = 145;
                    break;
                }
                case 211: {
                    n14 = 57;
                    break;
                }
                case 212: {
                    n14 = 248;
                    break;
                }
                case 213: {
                    n14 = 183;
                    break;
                }
                case 214: {
                    n14 = 11;
                    break;
                }
                case 215: {
                    n14 = 10;
                    break;
                }
                case 216: {
                    n14 = 50;
                    break;
                }
                case 217: {
                    n14 = 56;
                    break;
                }
                case 218: {
                    n14 = 109;
                    break;
                }
                case 219: {
                    n14 = 48;
                    break;
                }
                case 220: {
                    n14 = 153;
                    break;
                }
                case 221: {
                    n14 = 38;
                    break;
                }
                case 222: {
                    n14 = 102;
                    break;
                }
                case 223: {
                    n14 = 135;
                    break;
                }
                case 224: {
                    n14 = 151;
                    break;
                }
                case 225: {
                    n14 = 49;
                    break;
                }
                case 226: {
                    n14 = 73;
                    break;
                }
                case 227: {
                    n14 = 62;
                    break;
                }
                case 228: {
                    n14 = 213;
                    break;
                }
                case 229: {
                    n14 = 3;
                    break;
                }
                case 230: {
                    n14 = 23;
                    break;
                }
                case 231: {
                    n14 = 93;
                    break;
                }
                case 232: {
                    n14 = 37;
                    break;
                }
                case 233: {
                    n14 = 202;
                    break;
                }
                case 234: {
                    n14 = 242;
                    break;
                }
                case 235: {
                    n14 = 42;
                    break;
                }
                case 236: {
                    n14 = 168;
                    break;
                }
                case 237: {
                    n14 = 30;
                    break;
                }
                case 238: {
                    n14 = 233;
                    break;
                }
                case 239: {
                    n14 = 71;
                    break;
                }
                case 240: {
                    n14 = 43;
                    break;
                }
                case 241: {
                    n14 = 200;
                    break;
                }
                case 242: {
                    n14 = 158;
                    break;
                }
                case 243: {
                    n14 = 53;
                    break;
                }
                case 244: {
                    n14 = 139;
                    break;
                }
                case 245: {
                    n14 = 114;
                    break;
                }
                case 246: {
                    n14 = 64;
                    break;
                }
                case 247: {
                    n14 = 255;
                    break;
                }
                case 248: {
                    n14 = 191;
                    break;
                }
                case 249: {
                    n14 = 197;
                    break;
                }
                case 250: {
                    n14 = 225;
                    break;
                }
                case 251: {
                    n14 = 26;
                    break;
                }
                case 252: {
                    n14 = 83;
                    break;
                }
                case 253: {
                    n14 = 162;
                    break;
                }
                case 254: {
                    n14 = 175;
                    break;
                }
                default: {
                    n14 = 235;
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
            kz_2.f[n12] = new String(cArray).intern();
        }
        return f[n12];
    }
}

