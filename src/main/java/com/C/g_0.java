/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import com.C.R;
import com.C.W;
import com._V;
import com.aC;
import com.ex_2;
import com.lz_0;
import com.o4_0;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;

/*
 * Renamed from com.C.g
 */
public class g_0
extends lz_0
implements aC {
    protected Color x = _V.C;
    protected Color S = _V.z;
    protected Color l = _V.O;
    protected Color e = _V.e;
    protected Color z = _V.G;
    protected Color Q = _V.M;
    protected Color B = _V.h;
    protected Color T = _V.a;
    protected ex_2 J;
    protected JScrollBar O;
    private static final String a;

    public g_0() {
        this.M(new Dimension(_V.s));
    }

    public Color Q() {
        return this.x;
    }

    public void k(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.x == color) break block3;
                this.x = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    public Color p() {
        return this.S;
    }

    public void C(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.S == color) break block3;
                this.S = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    public Color U() {
        return this.l;
    }

    public void w(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.l == color) break block3;
                this.l = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    public Color T() {
        return this.e;
    }

    public void f(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.e == color) break block3;
                this.e = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    public Color N() {
        return this.z;
    }

    public void d(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.z == color) break block3;
                this.z = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    public Color g() {
        return this.Q;
    }

    public void G(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.Q == color) break block3;
                this.Q = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    public Color K() {
        return this.B;
    }

    public void s(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.B == color) break block3;
                this.B = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    public Color d() {
        return this.T;
    }

    public void V(Color color) {
        block3: {
            g_0 g_02;
            block2: {
                int[] nArray = W.B();
                g_02 = this;
                if (nArray != null) break block2;
                if (g_02.T == color) break block3;
                this.T = color;
                g_02 = this;
            }
            g_02.l();
        }
    }

    @Override
    public void I(ex_2 ex_22) {
        this.J = ex_22;
    }

    @Override
    public void g(JScrollBar jScrollBar) {
        this.O = jScrollBar;
    }

    public Insets N(AbstractButton abstractButton) {
        boolean bl;
        int[] nArray = W.B();
        int n10 = this.O.getOrientation();
        if (nArray == null) {
            n10 = n10 == 1 ? 1 : 0;
        }
        int n11 = n10;
        boolean bl2 = bl = this.J == ex_2.decrease;
        if (n11 != 0) {
            return new Insets(bl ? 1 : 0, 1, bl ? 0 : 1, 1);
        }
        return new Insets(1, bl ? 1 : 0, 1, bl ? 0 : 1);
    }

    /*
     * Exception decompiling
     */
    public void Q(Graphics2D var1_1, Rectangle var2_2, AbstractButton var3_3) {
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

    protected Shape v(Rectangle rectangle, AbstractButton abstractButton) {
        return o4_0.k(abstractButton, a, new R(this, rectangle, abstractButton), this.W(abstractButton));
    }

    protected Object[] W(AbstractButton abstractButton) {
        return new Object[]{abstractButton.getSize(), abstractButton.getInsets(), this.J, abstractButton.getComponentOrientation().isLeftToRight(), this.O.getOrientation()};
    }

    protected Shape d(Rectangle rectangle, AbstractButton abstractButton) {
        GeneralPath generalPath;
        block5: {
            int n10;
            int n11;
            int n12;
            int n13;
            block6: {
                int n14;
                int n15;
                int[] nArray;
                block2: {
                    block3: {
                        block4: {
                            int n16 = this.O.getOrientation();
                            Insets insets = abstractButton.getInsets();
                            n13 = rectangle.x + insets.left;
                            nArray = W.B();
                            n12 = rectangle.y + insets.top;
                            n11 = rectangle.width - insets.left - insets.right - 1;
                            n10 = rectangle.height - insets.top - insets.bottom - 1;
                            n15 = n16;
                            if (nArray != null) break block2;
                            if (n15 != 1) break block3;
                            if (this.J != ex_2.decrease) break block4;
                            generalPath = new GeneralPath(0);
                            generalPath.moveTo(n13, n12 + n10);
                            generalPath.quadTo((float)n13 + (float)n11 / 2.0f, (float)n12 + (float)(n10 * 2) / 3.0f, n13 + n11, n12 + n10);
                            generalPath.lineTo((float)n13 + (float)n11 / 2.0f, n12);
                            generalPath.closePath();
                            if (nArray == null) break block5;
                        }
                        generalPath = new GeneralPath(0);
                        generalPath.moveTo(n13, n12);
                        generalPath.quadTo((float)n13 + (float)n11 / 2.0f, (float)n12 + (float)n10 / 3.0f, n13 + n11, n12);
                        generalPath.lineTo((float)n13 + (float)n11 / 2.0f, n12 + n10);
                        generalPath.closePath();
                        if (nArray == null) break block5;
                    }
                    n15 = this.O.getComponentOrientation().isLeftToRight() ? 1 : 0;
                }
                if (!((n14 = n15) != 0 ? this.J == ex_2.decrease : this.J == ex_2.increase)) break block6;
                generalPath = new GeneralPath(0);
                generalPath.moveTo(n13 + n11, n12);
                generalPath.quadTo((float)n13 + (float)(n11 * 2) / 3.0f, (float)n12 + (float)n10 / 2.0f, n13 + n11, n12 + n10);
                generalPath.lineTo(n13, (float)n12 + (float)n10 / 2.0f);
                generalPath.closePath();
                if (nArray == null) break block5;
            }
            generalPath = new GeneralPath(0);
            generalPath.moveTo(n13, n12);
            generalPath.quadTo((float)n13 + (float)n11 / 3.0f, (float)n12 + (float)n10 / 2.0f, n13, n12 + n10);
            generalPath.lineTo(n13 + n11, (float)n12 + (float)n10 / 2.0f);
            generalPath.closePath();
        }
        return generalPath;
    }

    @Override
    public Insets B(JComponent jComponent) {
        return this.N((AbstractButton)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.Q(graphics2D, rectangle, (AbstractButton)jComponent);
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
                char[] cArray3 = "A\u001c@\u0011\u0015z0U\u001aF\u0011\f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 66;
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
                            n17 = 98;
                            break;
                        }
                        case 1: {
                            n17 = 44;
                            break;
                        }
                        case 2: {
                            n17 = 112;
                            break;
                        }
                        case 3: {
                            n17 = 60;
                            break;
                        }
                        case 4: {
                            n17 = 32;
                            break;
                        }
                        case 5: {
                            n17 = 21;
                            break;
                        }
                        default: {
                            n17 = 16;
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

