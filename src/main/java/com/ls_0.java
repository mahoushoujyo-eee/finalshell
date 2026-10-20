/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LA;
import com.OK;
import com.lz_0;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Ls
 */
public class ls_0
extends LA
implements SwingConstants {
    protected int J = ls_0.a(986, 4646918253451563445L);
    protected int e = ls_0.a(18862, 3078307197075266499L);
    protected OK R = OK.onLine;
    protected Color D = null;
    protected Color Q = null;
    protected boolean z = true;
    protected int C;
    protected int S;
    protected String F;
    protected int G;
    protected int K;
    protected boolean r;
    protected FontMetrics f;
    protected int p;
    protected int s;
    protected int t;
    protected int m;
    protected double y;
    protected double Y;
    protected Shape a;
    protected boolean b;
    private static final long[] g;
    private static final Integer[] j;

    public ls_0() {
        this((String)null);
    }

    public ls_0(String string) {
        this(string, ls_0.a(20926, 1382016466012767184L));
    }

    public ls_0(String string, int n10) {
        this(string, n10, 1);
    }

    public ls_0(String string, int n10, int n11) {
        this.F = string;
        this.C = n10;
        this.S = n11;
    }

    public int h() {
        return this.J;
    }

    public void o(int n10) {
        this.J = n10;
        this.Z();
    }

    public int W() {
        return this.e;
    }

    public void u(int n10) {
        this.e = n10;
        this.Z();
    }

    public int s() {
        return this.S;
    }

    public void T(int n10) {
        this.S = n10;
        this.Z();
    }

    public int g() {
        return this.C;
    }

    public void S(int n10) {
        this.C = n10;
        this.l();
    }

    public OK n() {
        return this.R;
    }

    public void G(OK oK) {
        this.R = oK;
        this.l();
    }

    public Color d() {
        return this.D;
    }

    public void Q(Color color) {
        this.D = color;
        this.l();
    }

    public Color R() {
        return this.Q;
    }

    public void S(Color color) {
        this.Q = color;
        this.l();
    }

    public boolean x() {
        return this.z;
    }

    public void U(boolean bl) {
        this.z = bl;
        this.l();
    }

    public String e() {
        return this.F;
    }

    public void D(String string) {
        this.F = string;
        this.Z();
    }

    @Override
    public Insets B(JComponent jComponent) {
        Insets insets;
        block9: {
            int n10;
            int[] nArray;
            block8: {
                insets = super.B(jComponent);
                nArray = lz_0.M();
                n10 = this.k();
                if (nArray != null) break block8;
                if (n10 != 0) break block9;
                n10 = this.S;
            }
            switch (n10) {
                case 1: {
                    insets.top += this.Z(jComponent);
                    if (nArray == null) break;
                }
                case 2: {
                    insets.left += this.Z(jComponent);
                    if (nArray == null) break;
                }
                case 3: {
                    insets.bottom += this.Z(jComponent);
                    if (nArray == null) break;
                }
                case 4: {
                    insets.right += this.Z(jComponent);
                }
            }
        }
        return insets;
    }

    @Override
    public Dimension d(JComponent jComponent) {
        int[] nArray = lz_0.M();
        int n10 = this.k();
        if (nArray == null) {
            if (n10 != 0) {
                return super.d(jComponent);
            }
            n10 = this.Z(jComponent);
        }
        int n11 = n10;
        int n12 = jComponent.getFontMetrics(jComponent.getFont()).stringWidth(this.F);
        int n13 = Math.max(this.i, this.w);
        int n14 = Math.max(n11, n13);
        switch (this.S) {
            case 1: 
            case 3: {
                return new Dimension(n13 * 2 + n12 + this.J * 2 + this.e * 2, n14 + n13);
            }
            case 2: 
            case 4: {
                return new Dimension(n14 + n13, n13 * 2 + n12 + this.J * 2 + this.e * 2);
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void u(Graphics2D var1_1, Rectangle var2_2, JComponent var3_3) {
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

    protected int f(JComponent jComponent) {
        int n10;
        block19: {
            int n11;
            int n12;
            block17: {
                block18: {
                    int n13;
                    block16: {
                        int n14;
                        int n15;
                        block12: {
                            block13: {
                                int[] nArray;
                                boolean bl;
                                block14: {
                                    block15: {
                                        block9: {
                                            block11: {
                                                block10: {
                                                    int n16;
                                                    block8: {
                                                        int n17;
                                                        int n18;
                                                        block4: {
                                                            block5: {
                                                                block6: {
                                                                    block7: {
                                                                        bl = jComponent.getComponentOrientation().isLeftToRight();
                                                                        nArray = lz_0.M();
                                                                        n18 = this.C;
                                                                        n17 = 2;
                                                                        if (nArray != null) break block4;
                                                                        if (n18 == n17) break block5;
                                                                        n15 = this.C;
                                                                        n14 = ls_0.a(27132, 3878701385492872080L);
                                                                        if (nArray != null) break block6;
                                                                        if (n15 != n14) break block7;
                                                                        n16 = bl ? 1 : 0;
                                                                        if (nArray != null) break block8;
                                                                        if (n16 != 0) break block5;
                                                                    }
                                                                    n15 = this.C;
                                                                    n14 = ls_0.a(21876, 6684196394433054493L);
                                                                }
                                                                if (nArray != null) break block9;
                                                                if (n15 != n14) break block10;
                                                                n15 = bl ? 1 : 0;
                                                                if (nArray != null) break block11;
                                                                if (n15 != 0) break block10;
                                                            }
                                                            n18 = Math.max(this.i, this.w) + this.J;
                                                            n17 = this.e;
                                                        }
                                                        n16 = n18 + n17;
                                                    }
                                                    return n16;
                                                }
                                                n15 = this.C;
                                            }
                                            n14 = 4;
                                        }
                                        if (nArray != null) break block12;
                                        if (n15 == n14) break block13;
                                        n12 = this.C;
                                        n11 = ls_0.a(22830, 3292205106735680326L);
                                        if (nArray != null) break block14;
                                        if (n12 != n11) break block15;
                                        n13 = bl ? 1 : 0;
                                        if (nArray != null) break block16;
                                        if (n13 != 0) break block13;
                                    }
                                    n12 = this.C;
                                    n11 = ls_0.a(27132, 3878701385492872080L);
                                }
                                if (nArray != null) break block17;
                                if (n12 != n11) break block18;
                                n10 = bl ? 1 : 0;
                                if (nArray != null) break block19;
                                if (n10 != 0) break block18;
                            }
                            n15 = this.G - Math.max(this.i, this.w) - this.J - this.e;
                            n14 = this.s;
                        }
                        n13 = n15 - n14;
                    }
                    return n13;
                }
                n12 = this.G / 2;
                n11 = this.s / 2;
            }
            n10 = n12 - n11;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected int Y() {
        block11: {
            var1_1 = lz_0.M();
            v0 = this.f;
            if (var1_1 != null) ** GOTO lbl6
            if (v0 != null) {
                v0 = this.f;
lbl6:
                // 2 sources

                v1 = v0.getDescent();
            } else {
                v1 = 0;
            }
            var2_2 = v1;
            v2 = this.S;
            if (var1_1 != null) break block11;
            switch (v2) {
                case 1: {
                    v3 = this.R.equals((Object)OK.aboveLive);
                    if (var1_1 != null) ** GOTO lbl20
                    if (v3 != 0) {
                        v4 = this.p - this.i - var2_2;
                    } else {
                        v3 = this.p;
lbl20:
                        // 2 sources

                        v4 = v3 - var2_2;
                    }
                    return v4;
                }
                case 3: {
                    v5 = this.R.equals((Object)OK.belowLine);
                    if (var1_1 != null) ** GOTO lbl29
                    if (v5 != 0) {
                        v6 = this.K - this.i - var2_2;
                    } else {
                        v5 = this.K;
lbl29:
                        // 2 sources

                        v6 = v5 - var2_2;
                    }
                    return v6;
                }
                case 2: {
                    break;
                }
            }
            v2 = 0;
        }
        return v2;
    }

    protected double h() {
        ls_0 ls_02;
        block8: {
            boolean bl;
            block7: {
                int[] nArray = lz_0.M();
                bl = this.r;
                if (nArray == null) {
                    if (bl) {
                        return this.y;
                    }
                    bl = this.R.equals((Object)OK.onLine);
                }
                if (nArray != null) break block7;
                if (bl) {
                    return (double)this.p / 2.0;
                }
                ls_02 = this;
                if (nArray != null) break block8;
                bl = ls_02.R.equals((Object)OK.aboveLive);
            }
            if (bl) {
                return (double)this.p - this.y;
            }
            ls_02 = this;
        }
        return ls_02.y;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected int Z(JComponent jComponent) {
        int n10;
        int[] nArray = lz_0.M();
        int n11 = this.k();
        if (nArray == null) {
            if (n11 != 0) {
                return this.i;
            }
            n11 = jComponent.getFontMetrics(jComponent.getFont()).getHeight();
        }
        int n12 = n11;
        int n13 = this.R.equals((Object)OK.onLine);
        if (nArray == null) {
            if (n13 != 0) {
                n10 = n12;
                return n10;
            }
            n13 = n12;
        }
        n10 = n13 + this.i;
        return n10;
    }

    protected boolean k() {
        return this.F == null;
    }

    protected Shape F() {
        RectangularShape rectangularShape = null;
        switch (this.S) {
            case 1: {
                rectangularShape = new Rectangle2D.Double(this.y, this.Y, (double)this.G - this.y * 2.0, (double)this.K - this.Y - this.y);
                break;
            }
            case 2: {
                rectangularShape = new Rectangle2D.Double(this.Y, this.y, (double)this.G - this.Y - this.y, (double)this.K - this.y * 2.0);
                break;
            }
            case 3: {
                rectangularShape = new Rectangle2D.Double(this.y, this.y, (double)this.G - this.y * 2.0, (double)this.K - this.Y - this.y);
                break;
            }
            case 4: {
                rectangularShape = new Rectangle2D.Double(this.y, this.y, (double)this.G - this.Y - this.y, (double)this.K - this.y * 2.0);
            }
        }
        return this.w > 0 ? new RoundRectangle2D.Double(((RectangularShape)rectangularShape).getX(), ((RectangularShape)rectangularShape).getY(), ((RectangularShape)rectangularShape).getWidth(), ((RectangularShape)rectangularShape).getHeight(), this.w * 2, this.w * 2) : rectangularShape;
    }

    protected Shape A() {
        int[] nArray = lz_0.M();
        int n10 = this.r;
        if (nArray == null) {
            if (n10 != 0) {
                return null;
            }
            n10 = this.S;
        }
        switch (n10) {
            case 1: {
                return new RoundRectangle2D.Double(this.t - this.e, this.Y - (double)(this.p / 2), this.s + this.e * 2, this.p, 3.0, 3.0);
            }
            case 3: {
                return new RoundRectangle2D.Double(this.t - this.e, (double)this.K - this.Y - (double)(this.p / 2), this.s + this.e * 2, this.p, 3.0, 3.0);
            }
            case 2: {
                return null;
            }
            case 4: {
                return null;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2740504910442671185L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u00f9\u007f\u00ae\\\u001c8\u0017\u00cb\u00ec\u00dd\u00e3o3\u00157\u0091F\u00b5\u00b6\u009cnH\u00af\u008b\u0018\u00c8A\u0001\u00c9d}\u00e0";
                var5_4 = "\u00f9\u007f\u00ae\\\u001c8\u0017\u00cb\u00ec\u00dd\u00e3o3\u00157\u0091F\u00b5\u00b6\u009cnH\u00af\u008b\u0018\u00c8A\u0001\u00c9d}\u00e0".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00d5\u000b\u001d\u00b96\u0093'\u001c\u00d5\u0088\u009b\u00fc\u00ef\u0007+G";
                    var5_4 = "\u00d5\u000b\u001d\u00b96\u0093'\u001c\u00d5\u0088\u009b\u00fc\u00ef\u0007+G".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        ls_0.g = var6_1;
        ls_0.j = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x526C;
        if (j[n11] == null) {
            ls_0.j[n11] = (int)(g[n11] ^ l2);
        }
        return j[n11];
    }
}

