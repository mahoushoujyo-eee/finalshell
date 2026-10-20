/*
 * Decompiled with CFR 0.152.
 */
package com.C;

import com.C.K;
import com.C.M;
import com.C.u;
import com.P9;
import com.RJ;
import com.RV;
import com.c;
import com.c.l_0;
import com.c.q_0;
import com.fk_0;
import com.ky_2;
import com.lz_0;
import com.o4_0;
import com.pf_1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class W
extends lz_0
implements RJ,
SwingConstants {
    protected M R = q_0.k;
    protected Color a = q_0.V;
    protected int J = q_0.o;
    protected int T = q_0.n;
    protected float I = q_0.w;
    protected int q = q_0.W;
    protected float M = q_0.L;
    protected boolean Y = true;
    protected int u = 1;
    protected int v = 0;
    protected int F = -1;
    private static int[] w;
    private static final String[] b;
    private static final String[] f;
    private static final long[] i;
    private static final Integer[] j;

    public M M() {
        return this.R;
    }

    public void b(M m10) {
        block3: {
            W w2;
            block4: {
                int[] nArray;
                block2: {
                    nArray = W.B();
                    w2 = this;
                    if (nArray != null) break block2;
                    if (w2.R == m10) break block3;
                    this.R = m10;
                    w2 = this;
                }
                if (nArray != null) break block4;
                if (!w2.Y) break block3;
                w2 = this;
            }
            w2.Z();
        }
    }

    public Color o() {
        return this.a;
    }

    public void M(Color color) {
        block3: {
            W w2;
            block4: {
                int[] nArray;
                block2: {
                    nArray = W.B();
                    w2 = this;
                    if (nArray != null) break block2;
                    if (w2.a == color) break block3;
                    this.a = color;
                    w2 = this;
                }
                if (nArray != null) break block4;
                if (!w2.Y) break block3;
                w2 = this;
            }
            w2.l();
        }
    }

    public int U() {
        return this.J;
    }

    public void p(int n10) {
        block3: {
            W w2;
            block4: {
                int n11;
                block2: {
                    int[] nArray = W.B();
                    n11 = this.J;
                    if (nArray != null) break block2;
                    if (n11 == n10) break block3;
                    this.J = n10;
                    w2 = this;
                    if (nArray != null) break block4;
                    n11 = w2.Y ? 1 : 0;
                }
                if (n11 == 0) break block3;
                w2 = this;
            }
            w2.l();
        }
    }

    public int j() {
        return this.T;
    }

    public void X(int n10) {
        block3: {
            W w2;
            block4: {
                int n11;
                block2: {
                    int[] nArray = W.B();
                    n11 = this.T;
                    if (nArray != null) break block2;
                    if (n11 == n10) break block3;
                    this.T = n10;
                    w2 = this;
                    if (nArray != null) break block4;
                    n11 = w2.Y ? 1 : 0;
                }
                if (n11 == 0) break block3;
                w2 = this;
            }
            w2.Z();
        }
    }

    public float A() {
        return this.I;
    }

    public void a(float f10) {
        block3: {
            W w2;
            block4: {
                float f11;
                block2: {
                    int[] nArray = W.B();
                    float f12 = this.I - f10;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (nArray != null) break block2;
                    if (f11 == false) break block3;
                    this.I = f10;
                    w2 = this;
                    if (nArray != null) break block4;
                    f11 = (float)w2.Y;
                }
                if (f11 == false) break block3;
                w2 = this;
            }
            w2.l();
        }
    }

    public int h() {
        return this.q;
    }

    public void O(int n10) {
        block3: {
            W w2;
            block4: {
                int n11;
                block2: {
                    int[] nArray = W.B();
                    n11 = this.q;
                    if (nArray != null) break block2;
                    if (n11 == n10) break block3;
                    this.q = n10;
                    w2 = this;
                    if (nArray != null) break block4;
                    n11 = w2.Y ? 1 : 0;
                }
                if (n11 == 0) break block3;
                w2 = this;
            }
            w2.Z();
        }
    }

    public float P() {
        return this.M;
    }

    public void N(float f10) {
        block3: {
            W w2;
            block4: {
                float f11;
                block2: {
                    int[] nArray = W.B();
                    float f12 = this.M - f10;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (nArray != null) break block2;
                    if (f11 == false) break block3;
                    this.M = f10;
                    w2 = this;
                    if (nArray != null) break block4;
                    f11 = (float)w2.Y;
                }
                if (f11 == false) break block3;
                w2 = this;
            }
            w2.l();
        }
    }

    public boolean Y() {
        return this.Y;
    }

    public void d(boolean bl) {
        block3: {
            W w2;
            block2: {
                int[] nArray = W.B();
                w2 = this;
                if (nArray != null) break block2;
                if (w2.Y == bl) break block3;
                this.Y = bl;
                w2 = this;
            }
            w2.Z();
        }
    }

    public int I() {
        return this.u;
    }

    public void l(int n10) {
        block3: {
            W w2;
            block4: {
                int n11;
                block2: {
                    int[] nArray = W.B();
                    n11 = this.u;
                    if (nArray != null) break block2;
                    if (n11 == n10) break block3;
                    this.u = n10;
                    w2 = this;
                    if (nArray != null) break block4;
                    n11 = w2.Y ? 1 : 0;
                }
                if (n11 == 0) break block3;
                w2 = this;
            }
            w2.l();
        }
    }

    public int i() {
        return this.v;
    }

    public void P(int n10) {
        block3: {
            W w2;
            block4: {
                int n11;
                block2: {
                    int[] nArray = W.B();
                    n11 = this.v;
                    if (nArray != null) break block2;
                    if (n11 == n10) break block3;
                    this.v = n10;
                    w2 = this;
                    if (nArray != null) break block4;
                    n11 = w2.Y ? 1 : 0;
                }
                if (n11 == 0) break block3;
                w2 = this;
            }
            w2.l();
        }
    }

    public int B() {
        return this.F;
    }

    public void f(int n10) {
        block3: {
            W w2;
            block4: {
                int n11;
                block2: {
                    int[] nArray = W.B();
                    n11 = this.F;
                    if (nArray != null) break block2;
                    if (n11 == n10) break block3;
                    this.F = n10;
                    w2 = this;
                    if (nArray != null) break block4;
                    n11 = w2.Y ? 1 : 0;
                }
                if (n11 == 0) break block3;
                w2 = this;
            }
            w2.l();
        }
    }

    public Shape g(JComponent jComponent, Rectangle rectangle) {
        return this.z(jComponent, rectangle.getSize(), false);
    }

    @Override
    public Boolean d(JComponent jComponent) {
        int[] nArray = W.B();
        boolean bl = this.Y;
        if (nArray == null) {
            bl = !bl;
        }
        return bl;
    }

    @Override
    public Insets B(JComponent jComponent) {
        Insets insets;
        block4: {
            block2: {
                block3: {
                    boolean bl = jComponent.getComponentOrientation().isLeftToRight();
                    int[] nArray = W.B();
                    insets = new Insets(this.U.top, bl ? this.U.left : this.U.right, this.U.bottom, bl ? this.U.right : this.U.left);
                    if (nArray != null) break block2;
                    if (!this.Y) break block3;
                    int n10 = this.c();
                    insets.top += n10 + 1;
                    insets.left += n10 + 1;
                    insets.bottom += n10 + 1;
                    insets.right += n10 + 1;
                    if (nArray == null) break block4;
                }
                ++insets.top;
                ++insets.left;
                ++insets.bottom;
            }
            ++insets.right;
        }
        return insets;
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        block9: {
            block4: {
                block5: {
                    Object object;
                    int[] nArray;
                    block8: {
                        W w2;
                        block6: {
                            block7: {
                                nArray = W.B();
                                if (nArray != null) break block4;
                                if (!cy_1.M) break block5;
                                object = RV.X(graphics2D);
                                w2 = this;
                                if (nArray != null) break block6;
                                if (!w2.Y) break block7;
                                this.C(graphics2D, jComponent);
                                if (nArray == null) break block8;
                            }
                            w2 = this;
                        }
                        w2.m(graphics2D, jComponent);
                    }
                    RV.X(graphics2D, object);
                    if (nArray == null) break block9;
                }
                graphics2D.setColor((Color)cy_1.H);
            }
            graphics2D.fillRect(0, 0, (int)rectangle.getWidth(), (int)rectangle.getHeight());
        }
    }

    protected void C(Graphics2D graphics2D, JComponent jComponent) {
        Dimension dimension = jComponent.getSize();
        this.E(graphics2D, jComponent, dimension);
        this.s(graphics2D, jComponent, dimension);
        this.S(graphics2D, jComponent, dimension);
    }

    protected void m(Graphics2D graphics2D, JComponent jComponent) {
        graphics2D.setColor(this.U(jComponent));
        graphics2D.fillRoundRect(1, 1, jComponent.getWidth() - 2, jComponent.getHeight() - 2, this.J * 2, this.J * 2);
        graphics2D.setColor(this.a);
        graphics2D.drawRoundRect(0, 0, jComponent.getWidth() - 1, jComponent.getHeight() - 1, this.J * 2, this.J * 2);
    }

    protected void E(Graphics2D graphics2D, JComponent jComponent, Dimension dimension) {
        block3: {
            int n10;
            block2: {
                int[] nArray = W.B();
                n10 = this.T;
                if (nArray != null) break block2;
                if (n10 <= 0) break block3;
                n10 = this.T;
            }
            pf_1 pf_12 = fk_0.I(n10, this.J * 2, this.j());
            pf_12.k(jComponent);
            pf_12.n(graphics2D, this.w(dimension));
        }
    }

    protected float j() {
        return this.I;
    }

    protected void s(Graphics2D graphics2D, JComponent jComponent, Dimension dimension) {
        block3: {
            block2: {
                Color color = this.U(jComponent);
                int[] nArray = W.B();
                if (nArray != null) break block2;
                if (color == null) break block3;
                graphics2D.setColor(color);
            }
            graphics2D.fill(this.z(jComponent, dimension, true));
        }
    }

    protected void S(Graphics2D graphics2D, JComponent jComponent, Dimension dimension) {
        block3: {
            block2: {
                int[] nArray = W.B();
                if (nArray != null) break block2;
                if (this.a == null) break block3;
                graphics2D.setPaint(this.a);
            }
            graphics2D.draw(this.z(jComponent, dimension, false));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected Color U(JComponent jComponent) {
        Color color;
        Color color2;
        block5: {
            int n10;
            block4: {
                color2 = this.t(jComponent);
                int[] nArray = W.B();
                n10 = this.Y;
                if (nArray != null) break block4;
                if (n10 == 0) break block5;
                float f10 = this.M - 1.0f;
                n10 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
            }
            if (n10 < 0) {
                color = P9.M(color2, Math.max(0, Math.min((int)(this.M * 255.0f), W.a(615, 5561332905992221973L))));
                return color;
            }
        }
        color = color2;
        return color;
    }

    protected Color t(JComponent jComponent) {
        return jComponent.getBackground();
    }

    protected Rectangle w(Dimension dimension) {
        switch (this.R) {
            case simple: {
                return new Rectangle(0, 0, dimension.width, dimension.height);
            }
            case dropdown: {
                int n10 = Math.max(0, this.q - this.T);
                return new Rectangle(n10, n10, dimension.width - n10 * 2, dimension.height - n10 * 2);
            }
        }
        return null;
    }

    protected Shape z(JComponent jComponent, Dimension dimension, boolean bl) {
        switch (this.R) {
            case simple: {
                return o4_0.k(jComponent, bl ? W.a(30367, 32490) : W.a(30363, 8664), new K(this, jComponent, dimension, bl), this.j(jComponent, dimension));
            }
            case dropdown: {
                return o4_0.k(jComponent, bl ? W.a(30366, -27350) : W.a(30365, 11346), new u(this, jComponent, dimension, bl), this.j(jComponent, dimension));
            }
        }
        return null;
    }

    protected Object[] j(JComponent jComponent, Dimension dimension) {
        Object[] objectArray = new Object[W.a(2100, 1832195399082049346L)];
        objectArray[0] = this.J;
        objectArray[1] = this.T;
        objectArray[2] = this.q;
        objectArray[3] = this.u;
        objectArray[4] = this.v;
        objectArray[5] = this.F;
        objectArray[W.a((int)30040, (long)817117853046538796L)] = dimension;
        objectArray[W.a((int)19129, (long)4763160731544829384L)] = jComponent.getComponentOrientation().isLeftToRight();
        return objectArray;
    }

    protected GeneralPath E(JComponent jComponent, Dimension dimension, boolean bl) {
        int[] nArray = W.B();
        int n10 = bl;
        if (nArray == null) {
            n10 = n10 != 0 ? 1 : 0;
        }
        int n11 = n10;
        GeneralPath generalPath = new GeneralPath(0);
        int n12 = this.T + n11;
        int n13 = this.T + n11;
        int n14 = dimension.height - 1 - this.T;
        int n15 = dimension.width - 1 - this.T;
        generalPath.moveTo(n13, n12 + this.J);
        generalPath.quadTo(n13, n12, n13 + this.J, n12);
        generalPath.lineTo(n15 - this.J, n12);
        generalPath.quadTo(n15, n12, n15, n12 + this.J);
        generalPath.lineTo(n15, n14 - this.J);
        generalPath.quadTo(n15, n14, n15 - this.J, n14);
        generalPath.lineTo(n13 + this.J, n14);
        generalPath.quadTo(n13, n14, n13, n14 - this.J);
        generalPath.closePath();
        if (ky_2.F() != null) {
            W.p(new int[3]);
        }
        return generalPath;
    }

    /*
     * Exception decompiling
     */
    protected GeneralPath a(JComponent var1_1, Dimension var2_2, boolean var3_3) {
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

    protected Shape d(JComponent jComponent, Dimension dimension, boolean bl) {
        return o4_0.k(jComponent, bl ? W.a(30364, 21365) : W.a(30362, 18941), new l_0(this, jComponent, dimension, bl), this.j(jComponent, dimension));
    }

    /*
     * Exception decompiling
     */
    protected GeneralPath G(JComponent var1_1, Dimension var2_2, boolean var3_3) {
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
    protected int c() {
        int n10;
        int[] nArray = W.B();
        W w2 = this;
        if (nArray == null) {
            if (w2.R == com.C.M.dropdown) {
                n10 = Math.max(this.q, this.T);
                return n10;
            }
            w2 = this;
        }
        n10 = w2.T;
        return n10;
    }

    @Override
    public Shape D(Component component, Rectangle rectangle) {
        return this.g((JComponent)component, rectangle);
    }

    public static void p(int[] nArray) {
        w = nArray;
    }

    public static int[] B() {
        return w;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[6];
                        var11_1 = 0;
                        var10_2 = "\u00d0/\u00ab~{\u00f1\u009b\u00bb\u00b3\u0084@\u00be\u000f\u000b+\u00f9#\u00dc \u00af\u00a33\u00e1\u0096\u00c3\u0014yu\u009e5\u00dd\u0098O\u0096)$\u0015\u0011a\u0010\u0094\u0092\u00fed\u00f1\u008b\u000f\u008e:`\u00dc\u0002\u00a5\u00b41V\u00d1\u00fa\u008e\u0096\u00e3!";
                        var12_3 = "\u00d0/\u00ab~{\u00f1\u009b\u00bb\u00b3\u0084@\u00be\u000f\u000b+\u00f9#\u00dc \u00af\u00a33\u00e1\u0096\u00c3\u0014yu\u009e5\u00dd\u0098O\u0096)$\u0015\u0011a\u0010\u0094\u0092\u00fed\u00f1\u008b\u000f\u008e:`\u00dc\u0002\u00a5\u00b41V\u00d1\u00fa\u008e\u0096\u00e3!".length();
                        var9_4 = 13;
                        var8_5 = -1;
                        W.p(null);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 114;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00bf\u0019/\u00d1\u0082m\u00cdA\u0010\u00b7[\n\u00c1\u001a\u00e9\u00ba<\u000eZa\u0010\u00b6\r\u00fc\u00cd\u00b03;;\u00a9\u00cc\u00cf\u009a\u00a1\u008b\u00e8";
                            var12_3 = "\u00bf\u0019/\u00d1\u0082m\u00cdA\u0010\u00b7[\n\u00c1\u001a\u00e9\u00ba<\u000eZa\u0010\u00b6\r\u00fc\u00cd\u00b03;;\u00a9\u00cc\u00cf\u009a\u00a1\u008b\u00e8".length();
                            var9_4 = 22;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 51;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 59;
                                    break;
                                }
                                case 1: {
                                    v15 = 71;
                                    break;
                                }
                                case 2: {
                                    v15 = 109;
                                    break;
                                }
                                case 3: {
                                    v15 = 3;
                                    break;
                                }
                                case 4: {
                                    v15 = 121;
                                    break;
                                }
                                case 5: {
                                    v15 = 115;
                                    break;
                                }
                                default: {
                                    v15 = 120;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                W.b = var13;
                W.f = new String[6];
                var0_7 = 8914948556394539063L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = "\u00e0\u0013\u008b\u00f6\u0095\u009c]\u00dd\u00bah\u00c80F\u00cc\u000fTI\u00fd\u00e0\u00a9\u0092\u00d8\u00e1>?\u00ee\u0005\u008au\u0016\u0095\u00f8a\u00cc\u00a2J\u0097\u00a4\u00d7}\u00f0s\u00f7x\u00f2\u00b6]s";
                var5_11 = "\u00e0\u0013\u008b\u00f6\u0095\u009c]\u00dd\u00bah\u00c80F\u00cc\u000fTI\u00fd\u00e0\u00a9\u0092\u00d8\u00e1>?\u00ee\u0005\u008au\u0016\u0095\u00f8a\u00cc\u00a2J\u0097\u00a4\u00d7}\u00f0s\u00f7x\u00f2\u00b6]s".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "f\u00d8\u00d2$,\u00bf*\u001d\u0085+bs\u0081\u008d'\\";
                    var5_11 = "f\u00d8\u00d2$,\u00bf*\u001d\u0085+bs\u0081\u008d'\\".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        W.i = var6_8;
        W.j = new Integer[8];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x769E) & 0xFFFF;
        if (f[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 59;
                    break;
                }
                case 1: {
                    n14 = 111;
                    break;
                }
                case 2: {
                    n14 = 178;
                    break;
                }
                case 3: {
                    n14 = 82;
                    break;
                }
                case 4: {
                    n14 = 181;
                    break;
                }
                case 5: {
                    n14 = 26;
                    break;
                }
                case 6: {
                    n14 = 255;
                    break;
                }
                case 7: {
                    n14 = 157;
                    break;
                }
                case 8: {
                    n14 = 180;
                    break;
                }
                case 9: {
                    n14 = 94;
                    break;
                }
                case 10: {
                    n14 = 161;
                    break;
                }
                case 11: {
                    n14 = 72;
                    break;
                }
                case 12: {
                    n14 = 117;
                    break;
                }
                case 13: {
                    n14 = 128;
                    break;
                }
                case 14: {
                    n14 = 56;
                    break;
                }
                case 15: {
                    n14 = 90;
                    break;
                }
                case 16: {
                    n14 = 173;
                    break;
                }
                case 17: {
                    n14 = 28;
                    break;
                }
                case 18: {
                    n14 = 176;
                    break;
                }
                case 19: {
                    n14 = 191;
                    break;
                }
                case 20: {
                    n14 = 155;
                    break;
                }
                case 21: {
                    n14 = 208;
                    break;
                }
                case 22: {
                    n14 = 87;
                    break;
                }
                case 23: {
                    n14 = 205;
                    break;
                }
                case 24: {
                    n14 = 40;
                    break;
                }
                case 25: {
                    n14 = 102;
                    break;
                }
                case 26: {
                    n14 = 120;
                    break;
                }
                case 27: {
                    n14 = 244;
                    break;
                }
                case 28: {
                    n14 = 38;
                    break;
                }
                case 29: {
                    n14 = 202;
                    break;
                }
                case 30: {
                    n14 = 182;
                    break;
                }
                case 31: {
                    n14 = 27;
                    break;
                }
                case 32: {
                    n14 = 168;
                    break;
                }
                case 33: {
                    n14 = 119;
                    break;
                }
                case 34: {
                    n14 = 83;
                    break;
                }
                case 35: {
                    n14 = 70;
                    break;
                }
                case 36: {
                    n14 = 211;
                    break;
                }
                case 37: {
                    n14 = 138;
                    break;
                }
                case 38: {
                    n14 = 251;
                    break;
                }
                case 39: {
                    n14 = 86;
                    break;
                }
                case 40: {
                    n14 = 153;
                    break;
                }
                case 41: {
                    n14 = 107;
                    break;
                }
                case 42: {
                    n14 = 242;
                    break;
                }
                case 43: {
                    n14 = 237;
                    break;
                }
                case 44: {
                    n14 = 73;
                    break;
                }
                case 45: {
                    n14 = 240;
                    break;
                }
                case 46: {
                    n14 = 192;
                    break;
                }
                case 47: {
                    n14 = 19;
                    break;
                }
                case 48: {
                    n14 = 33;
                    break;
                }
                case 49: {
                    n14 = 227;
                    break;
                }
                case 50: {
                    n14 = 241;
                    break;
                }
                case 51: {
                    n14 = 147;
                    break;
                }
                case 52: {
                    n14 = 69;
                    break;
                }
                case 53: {
                    n14 = 197;
                    break;
                }
                case 54: {
                    n14 = 37;
                    break;
                }
                case 55: {
                    n14 = 49;
                    break;
                }
                case 56: {
                    n14 = 127;
                    break;
                }
                case 57: {
                    n14 = 75;
                    break;
                }
                case 58: {
                    n14 = 71;
                    break;
                }
                case 59: {
                    n14 = 134;
                    break;
                }
                case 60: {
                    n14 = 238;
                    break;
                }
                case 61: {
                    n14 = 96;
                    break;
                }
                case 62: {
                    n14 = 171;
                    break;
                }
                case 63: {
                    n14 = 116;
                    break;
                }
                case 64: {
                    n14 = 9;
                    break;
                }
                case 65: {
                    n14 = 5;
                    break;
                }
                case 66: {
                    n14 = 232;
                    break;
                }
                case 67: {
                    n14 = 36;
                    break;
                }
                case 68: {
                    n14 = 95;
                    break;
                }
                case 69: {
                    n14 = 199;
                    break;
                }
                case 70: {
                    n14 = 185;
                    break;
                }
                case 71: {
                    n14 = 97;
                    break;
                }
                case 72: {
                    n14 = 47;
                    break;
                }
                case 73: {
                    n14 = 164;
                    break;
                }
                case 74: {
                    n14 = 48;
                    break;
                }
                case 75: {
                    n14 = 210;
                    break;
                }
                case 76: {
                    n14 = 11;
                    break;
                }
                case 77: {
                    n14 = 0;
                    break;
                }
                case 78: {
                    n14 = 141;
                    break;
                }
                case 79: {
                    n14 = 92;
                    break;
                }
                case 80: {
                    n14 = 201;
                    break;
                }
                case 81: {
                    n14 = 1;
                    break;
                }
                case 82: {
                    n14 = 77;
                    break;
                }
                case 83: {
                    n14 = 106;
                    break;
                }
                case 84: {
                    n14 = 194;
                    break;
                }
                case 85: {
                    n14 = 139;
                    break;
                }
                case 86: {
                    n14 = 249;
                    break;
                }
                case 87: {
                    n14 = 126;
                    break;
                }
                case 88: {
                    n14 = 125;
                    break;
                }
                case 89: {
                    n14 = 124;
                    break;
                }
                case 90: {
                    n14 = 32;
                    break;
                }
                case 91: {
                    n14 = 65;
                    break;
                }
                case 92: {
                    n14 = 230;
                    break;
                }
                case 93: {
                    n14 = 189;
                    break;
                }
                case 94: {
                    n14 = 115;
                    break;
                }
                case 95: {
                    n14 = 133;
                    break;
                }
                case 96: {
                    n14 = 145;
                    break;
                }
                case 97: {
                    n14 = 130;
                    break;
                }
                case 98: {
                    n14 = 217;
                    break;
                }
                case 99: {
                    n14 = 84;
                    break;
                }
                case 100: {
                    n14 = 170;
                    break;
                }
                case 101: {
                    n14 = 57;
                    break;
                }
                case 102: {
                    n14 = 188;
                    break;
                }
                case 103: {
                    n14 = 223;
                    break;
                }
                case 104: {
                    n14 = 246;
                    break;
                }
                case 105: {
                    n14 = 253;
                    break;
                }
                case 106: {
                    n14 = 137;
                    break;
                }
                case 107: {
                    n14 = 100;
                    break;
                }
                case 108: {
                    n14 = 152;
                    break;
                }
                case 109: {
                    n14 = 148;
                    break;
                }
                case 110: {
                    n14 = 216;
                    break;
                }
                case 111: {
                    n14 = 196;
                    break;
                }
                case 112: {
                    n14 = 158;
                    break;
                }
                case 113: {
                    n14 = 222;
                    break;
                }
                case 114: {
                    n14 = 146;
                    break;
                }
                case 115: {
                    n14 = 214;
                    break;
                }
                case 116: {
                    n14 = 129;
                    break;
                }
                case 117: {
                    n14 = 149;
                    break;
                }
                case 118: {
                    n14 = 51;
                    break;
                }
                case 119: {
                    n14 = 142;
                    break;
                }
                case 120: {
                    n14 = 34;
                    break;
                }
                case 121: {
                    n14 = 132;
                    break;
                }
                case 122: {
                    n14 = 67;
                    break;
                }
                case 123: {
                    n14 = 54;
                    break;
                }
                case 124: {
                    n14 = 231;
                    break;
                }
                case 125: {
                    n14 = 250;
                    break;
                }
                case 126: {
                    n14 = 179;
                    break;
                }
                case 127: {
                    n14 = 23;
                    break;
                }
                case 128: {
                    n14 = 74;
                    break;
                }
                case 129: {
                    n14 = 177;
                    break;
                }
                case 130: {
                    n14 = 151;
                    break;
                }
                case 131: {
                    n14 = 64;
                    break;
                }
                case 132: {
                    n14 = 89;
                    break;
                }
                case 133: {
                    n14 = 163;
                    break;
                }
                case 134: {
                    n14 = 233;
                    break;
                }
                case 135: {
                    n14 = 79;
                    break;
                }
                case 136: {
                    n14 = 53;
                    break;
                }
                case 137: {
                    n14 = 200;
                    break;
                }
                case 138: {
                    n14 = 220;
                    break;
                }
                case 139: {
                    n14 = 209;
                    break;
                }
                case 140: {
                    n14 = 21;
                    break;
                }
                case 141: {
                    n14 = 239;
                    break;
                }
                case 142: {
                    n14 = 247;
                    break;
                }
                case 143: {
                    n14 = 17;
                    break;
                }
                case 144: {
                    n14 = 187;
                    break;
                }
                case 145: {
                    n14 = 162;
                    break;
                }
                case 146: {
                    n14 = 91;
                    break;
                }
                case 147: {
                    n14 = 248;
                    break;
                }
                case 148: {
                    n14 = 226;
                    break;
                }
                case 149: {
                    n14 = 150;
                    break;
                }
                case 150: {
                    n14 = 8;
                    break;
                }
                case 151: {
                    n14 = 6;
                    break;
                }
                case 152: {
                    n14 = 195;
                    break;
                }
                case 153: {
                    n14 = 45;
                    break;
                }
                case 154: {
                    n14 = 169;
                    break;
                }
                case 155: {
                    n14 = 30;
                    break;
                }
                case 156: {
                    n14 = 41;
                    break;
                }
                case 157: {
                    n14 = 14;
                    break;
                }
                case 158: {
                    n14 = 136;
                    break;
                }
                case 159: {
                    n14 = 184;
                    break;
                }
                case 160: {
                    n14 = 154;
                    break;
                }
                case 161: {
                    n14 = 166;
                    break;
                }
                case 162: {
                    n14 = 112;
                    break;
                }
                case 163: {
                    n14 = 254;
                    break;
                }
                case 164: {
                    n14 = 243;
                    break;
                }
                case 165: {
                    n14 = 25;
                    break;
                }
                case 166: {
                    n14 = 29;
                    break;
                }
                case 167: {
                    n14 = 52;
                    break;
                }
                case 168: {
                    n14 = 43;
                    break;
                }
                case 169: {
                    n14 = 4;
                    break;
                }
                case 170: {
                    n14 = 31;
                    break;
                }
                case 171: {
                    n14 = 212;
                    break;
                }
                case 172: {
                    n14 = 204;
                    break;
                }
                case 173: {
                    n14 = 203;
                    break;
                }
                case 174: {
                    n14 = 224;
                    break;
                }
                case 175: {
                    n14 = 215;
                    break;
                }
                case 176: {
                    n14 = 46;
                    break;
                }
                case 177: {
                    n14 = 118;
                    break;
                }
                case 178: {
                    n14 = 104;
                    break;
                }
                case 179: {
                    n14 = 85;
                    break;
                }
                case 180: {
                    n14 = 219;
                    break;
                }
                case 181: {
                    n14 = 140;
                    break;
                }
                case 182: {
                    n14 = 225;
                    break;
                }
                case 183: {
                    n14 = 42;
                    break;
                }
                case 184: {
                    n14 = 229;
                    break;
                }
                case 185: {
                    n14 = 235;
                    break;
                }
                case 186: {
                    n14 = 68;
                    break;
                }
                case 187: {
                    n14 = 109;
                    break;
                }
                case 188: {
                    n14 = 10;
                    break;
                }
                case 189: {
                    n14 = 99;
                    break;
                }
                case 190: {
                    n14 = 62;
                    break;
                }
                case 191: {
                    n14 = 236;
                    break;
                }
                case 192: {
                    n14 = 12;
                    break;
                }
                case 193: {
                    n14 = 165;
                    break;
                }
                case 194: {
                    n14 = 245;
                    break;
                }
                case 195: {
                    n14 = 44;
                    break;
                }
                case 196: {
                    n14 = 61;
                    break;
                }
                case 197: {
                    n14 = 105;
                    break;
                }
                case 198: {
                    n14 = 78;
                    break;
                }
                case 199: {
                    n14 = 175;
                    break;
                }
                case 200: {
                    n14 = 98;
                    break;
                }
                case 201: {
                    n14 = 76;
                    break;
                }
                case 202: {
                    n14 = 55;
                    break;
                }
                case 203: {
                    n14 = 15;
                    break;
                }
                case 204: {
                    n14 = 58;
                    break;
                }
                case 205: {
                    n14 = 22;
                    break;
                }
                case 206: {
                    n14 = 63;
                    break;
                }
                case 207: {
                    n14 = 123;
                    break;
                }
                case 208: {
                    n14 = 221;
                    break;
                }
                case 209: {
                    n14 = 172;
                    break;
                }
                case 210: {
                    n14 = 13;
                    break;
                }
                case 211: {
                    n14 = 16;
                    break;
                }
                case 212: {
                    n14 = 206;
                    break;
                }
                case 213: {
                    n14 = 103;
                    break;
                }
                case 214: {
                    n14 = 193;
                    break;
                }
                case 215: {
                    n14 = 198;
                    break;
                }
                case 216: {
                    n14 = 228;
                    break;
                }
                case 217: {
                    n14 = 108;
                    break;
                }
                case 218: {
                    n14 = 93;
                    break;
                }
                case 219: {
                    n14 = 7;
                    break;
                }
                case 220: {
                    n14 = 66;
                    break;
                }
                case 221: {
                    n14 = 234;
                    break;
                }
                case 222: {
                    n14 = 60;
                    break;
                }
                case 223: {
                    n14 = 121;
                    break;
                }
                case 224: {
                    n14 = 122;
                    break;
                }
                case 225: {
                    n14 = 80;
                    break;
                }
                case 226: {
                    n14 = 167;
                    break;
                }
                case 227: {
                    n14 = 252;
                    break;
                }
                case 228: {
                    n14 = 114;
                    break;
                }
                case 229: {
                    n14 = 18;
                    break;
                }
                case 230: {
                    n14 = 110;
                    break;
                }
                case 231: {
                    n14 = 88;
                    break;
                }
                case 232: {
                    n14 = 144;
                    break;
                }
                case 233: {
                    n14 = 2;
                    break;
                }
                case 234: {
                    n14 = 3;
                    break;
                }
                case 235: {
                    n14 = 101;
                    break;
                }
                case 236: {
                    n14 = 131;
                    break;
                }
                case 237: {
                    n14 = 35;
                    break;
                }
                case 238: {
                    n14 = 190;
                    break;
                }
                case 239: {
                    n14 = 218;
                    break;
                }
                case 240: {
                    n14 = 113;
                    break;
                }
                case 241: {
                    n14 = 135;
                    break;
                }
                case 242: {
                    n14 = 50;
                    break;
                }
                case 243: {
                    n14 = 39;
                    break;
                }
                case 244: {
                    n14 = 81;
                    break;
                }
                case 245: {
                    n14 = 186;
                    break;
                }
                case 246: {
                    n14 = 156;
                    break;
                }
                case 247: {
                    n14 = 159;
                    break;
                }
                case 248: {
                    n14 = 143;
                    break;
                }
                case 249: {
                    n14 = 174;
                    break;
                }
                case 250: {
                    n14 = 160;
                    break;
                }
                case 251: {
                    n14 = 207;
                    break;
                }
                case 252: {
                    n14 = 183;
                    break;
                }
                case 253: {
                    n14 = 24;
                    break;
                }
                case 254: {
                    n14 = 20;
                    break;
                }
                default: {
                    n14 = 213;
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
            W.f[n12] = new String(cArray).intern();
        }
        return f[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7772;
        if (j[n11] == null) {
            W.j[n11] = (int)(i[n11] ^ l2);
        }
        return j[n11];
    }
}

