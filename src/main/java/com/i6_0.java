/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GA;
import com.ch_1;
import com.ky_2;
import com.uA;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JSeparator;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSeparatorUI;

/*
 * Renamed from com.i6
 */
public class i6_0
extends BasicSeparatorUI {
    private static final float[] o;
    private Color R = uA.j;
    private Color L = uA.v;
    private Color P = uA.p;
    private Color g = uA.d;
    private boolean A = uA.m;
    private boolean B = uA.J;
    private boolean W = uA.Y;
    private Insets K = uA.X;
    private JSeparator z;
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new i6_0();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        this.z = (JSeparator)jComponent;
        FN.Y(this.z);
        LookAndFeel.installProperty(this.z, a, Boolean.FALSE);
        this.M();
    }

    @Override
    public void uninstallUI(JComponent jComponent) {
        this.z = null;
        super.uninstallUI(jComponent);
    }

    private void M() {
        block6: {
            JSeparator jSeparator;
            String string;
            block5: {
                string = ch_1.B();
                jSeparator = this.z;
                if (string == null) break block5;
                if (jSeparator == null) break block6;
                jSeparator = this.z;
            }
            boolean bl = FN.l(jSeparator);
            if (string != null) {
                if (bl) {
                    return;
                }
                bl = this.z.getComponentOrientation().isLeftToRight();
            }
            boolean bl2 = bl;
            Insets insets = new Insets(this.K.top, bl2 ? this.K.left : this.K.right, this.K.bottom, bl2 ? this.K.right : this.K.left);
            this.z.setBorder(GA.y(insets));
        }
    }

    public Color K() {
        return this.g;
    }

    public void p(Color color) {
        this.g = color;
    }

    public Color A() {
        return this.P;
    }

    public void k(Color color) {
        this.P = color;
    }

    public Color o() {
        return this.L;
    }

    public void m(Color color) {
        this.L = color;
    }

    public Color P() {
        return this.R;
    }

    public void y(Color color) {
        this.R = color;
    }

    public boolean X() {
        return this.A;
    }

    public void Z(boolean bl) {
        this.A = bl;
    }

    public boolean e() {
        return this.B;
    }

    public void m(boolean bl) {
        this.B = bl;
    }

    public boolean F() {
        return this.W;
    }

    public void r(boolean bl) {
        this.W = bl;
    }

    public Insets Z() {
        return this.K;
    }

    public void l(Insets insets) {
        this.K = insets;
        this.M();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void paint(Graphics var1_1, JComponent var2_2) {
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

    /*
     * Enabled aggressive block sorting
     */
    private Color[] h() {
        Color[] colorArray;
        String string = ch_1.B();
        int n10 = this.A;
        if (string != null) {
            if (n10 != 0) {
                Color[] colorArray2 = new Color[3];
                colorArray2[0] = this.P;
                colorArray2[1] = this.g;
                colorArray = colorArray2;
                colorArray2[2] = this.P;
                return colorArray;
            }
            n10 = 3;
        }
        Color[] colorArray3 = new Color[n10];
        colorArray3[0] = this.R;
        colorArray3[1] = Color.WHITE;
        colorArray = colorArray3;
        colorArray3[2] = this.R;
        return colorArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color[] O() {
        Color[] colorArray;
        String string = ch_1.B();
        int n10 = this.A;
        if (string != null) {
            if (n10 != 0) {
                Color[] colorArray2 = new Color[3];
                colorArray2[0] = this.R;
                colorArray2[1] = Color.WHITE;
                colorArray = colorArray2;
                colorArray2[2] = this.R;
                return colorArray;
            }
            n10 = 3;
        }
        Color[] colorArray3 = new Color[n10];
        colorArray3[0] = this.P;
        colorArray3[1] = this.g;
        colorArray = colorArray3;
        colorArray3[2] = this.P;
        return colorArray;
    }

    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        Insets insets = jComponent.getInsets();
        String string = ch_1.B();
        int n10 = this.B;
        if (string != null) {
            n10 = n10 != 0 ? 1 : 0;
        }
        int n12 = 1 + n10;
        n12 = this.W;
        if (string != null) {
            n12 = n12 != 0 ? 1 : 0;
        }
        int n13 = n11 + n12;
        if (((JSeparator)jComponent).getOrientation() == 1) {
            return new Dimension(insets.left + n13 + insets.right, insets.top + insets.bottom);
        }
        Dimension dimension = new Dimension(insets.left + insets.right, insets.top + n13 + insets.bottom);
        if (ky_2.F() != null) {
            ch_1.n("JsDttb");
        }
        return dimension;
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
                char[] cArray3 = "n\u0007\u0016#C\u0006".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 51;
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
                            n17 = 50;
                            break;
                        }
                        case 1: {
                            n17 = 68;
                            break;
                        }
                        case 2: {
                            n17 = 68;
                            break;
                        }
                        case 3: {
                            n17 = 97;
                            break;
                        }
                        case 4: {
                            n17 = 5;
                            break;
                        }
                        case 5: {
                            n17 = 80;
                            break;
                        }
                        default: {
                            n17 = 71;
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
        o = new float[]{0.0f, 0.5f, 1.0f};
    }
}

