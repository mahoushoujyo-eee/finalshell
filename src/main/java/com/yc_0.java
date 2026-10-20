/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.FN;
import com.km_0;
import com.ky_2;
import com.nn_1;
import com.rq_0;
import com.wx_2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.LookAndFeel;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicListUI;

/*
 * Renamed from com.Yc
 */
public class yc_0
extends BasicListUI {
    protected boolean O = wx_2.S;
    protected boolean H = wx_2.a;
    protected int l = wx_2.n;
    protected int g = wx_2.y;
    protected boolean b = wx_2.H;
    protected Color u = wx_2.Q;
    protected Color d = wx_2.F;
    protected boolean V = wx_2.r;
    protected MouseAdapter X;
    protected ListSelectionListener x;
    protected int h = -1;
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new yc_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.list);
        String[] stringArray = CI.c();
        LookAndFeel.installProperty(this.list, a, Boolean.TRUE);
        this.list.setBackground(new ColorUIResource(wx_2.X));
        String[] stringArray2 = stringArray;
        this.list.setForeground(new ColorUIResource(wx_2.K));
        this.X = new nn_1(this);
        this.list.addMouseListener(this.X);
        this.list.addMouseMotionListener(this.X);
        this.x = new km_0(this);
        this.list.addListSelectionListener(this.x);
        if (ky_2.F() != null) {
            CI.p(new String[5]);
        }
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        this.list.removeMouseListener(this.X);
        this.list.removeMouseMotionListener(this.X);
        this.list.removeListSelectionListener(this.x);
        super.uninstallUI(jComponent);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected rq_0 A() {
        String[] stringArray = CI.c();
        JList jList = this.list;
        if (stringArray == null) {
            if (jList == null) return null;
            jList = this.list;
        }
        if (stringArray == null) {
            if (!(jList instanceof CI)) return null;
            jList = this.list;
        }
        rq_0 rq_02 = ((CI)jList).m();
        return rq_02;
    }

    public boolean e() {
        return this.O;
    }

    public void C(boolean bl) {
        this.O = bl;
    }

    public boolean u() {
        return this.H;
    }

    public void q(boolean bl) {
        this.H = bl;
    }

    public int j() {
        return this.l;
    }

    public void l(int n10) {
        this.l = n10;
    }

    public int y() {
        return this.g;
    }

    public void o(int n10) {
        this.g = n10;
    }

    public boolean L() {
        return this.b;
    }

    public void l(boolean bl) {
        this.b = bl;
    }

    public Color f() {
        return this.u;
    }

    public void h(Color color) {
        this.u = color;
    }

    public Color w() {
        return this.d;
    }

    public void E(Color color) {
        this.d = color;
    }

    public boolean M() {
        return this.V;
    }

    public void t(boolean bl) {
        this.V = bl;
    }

    /*
     * Exception decompiling
     */
    protected void paintCell(Graphics var1_1, int var2_2, Rectangle var3_3, ListCellRenderer var4_4, ListModel var5_5, ListSelectionModel var6_6, int var7_7) {
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

    static JList q(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList V(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList k(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList C(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList Q(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList T(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList l(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList o(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList W(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList i(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList b(yc_0 yc_02) {
        return yc_02.list;
    }

    static JList O(yc_0 yc_02) {
        return yc_02.list;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u001a9*' 6".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 82;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 39;
                            break;
                        }
                        case 1: {
                            n17 = 27;
                            break;
                        }
                        case 2: {
                            n17 = 25;
                            break;
                        }
                        case 3: {
                            n17 = 4;
                            break;
                        }
                        case 4: {
                            n17 = 7;
                            break;
                        }
                        case 5: {
                            n17 = 1;
                            break;
                        }
                        default: {
                            n17 = 60;
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

