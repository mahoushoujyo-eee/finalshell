/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from cH
 */
public class ch_1 {
    int T;
    boolean m;
    boolean H;
    boolean Z;
    boolean y;
    boolean i;
    boolean I;
    boolean W;
    boolean U;
    boolean R;
    boolean B;
    boolean x;
    boolean r;
    boolean V;
    boolean b;
    boolean C;
    boolean s;
    boolean p;
    boolean a;
    boolean G;
    boolean l;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Exception decompiling
     */
    public ch_1(int var1_1) {
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

    public ch_1() {
        this.m = false;
        this.H = false;
        this.Z = false;
        this.y = false;
        this.i = false;
        this.I = false;
        this.W = false;
        this.U = false;
        this.R = false;
        this.B = false;
        this.x = false;
        this.r = false;
        this.V = false;
        this.b = false;
        this.C = false;
        this.s = false;
        this.p = false;
        this.a = false;
        this.G = false;
        this.l = false;
    }

    public void A() {
        ch_1 ch_12;
        int n10;
        block24: {
            boolean bl;
            block23: {
                n10 = 0;
                boolean bl2 = F6.g();
                bl = this.m;
                if (!bl2) {
                    if (bl) {
                        n10 += 2048;
                    }
                    bl = this.H;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 1024;
                    }
                    bl = this.Z;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 256;
                    }
                    bl = this.y;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 128;
                    }
                    bl = this.i;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 64;
                    }
                    bl = this.I;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 32;
                    }
                    bl = this.W;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 16;
                    }
                    bl = this.U;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 8;
                    }
                    bl = this.R;
                }
                if (!bl2) {
                    if (bl) {
                        n10 += 4;
                    }
                    bl = this.B;
                }
                if (bl2) break block23;
                if (bl) {
                    n10 += 2;
                }
                ch_12 = this;
                if (bl2) break block24;
                bl = ch_12.x;
            }
            if (bl) {
                ++n10;
            }
            ch_12 = this;
        }
        ch_12.T = n10;
    }

    public int R() {
        return this.T;
    }

    public void I(int n10) {
        this.T = n10;
    }

    public boolean K() {
        return this.m;
    }

    public void H(boolean bl) {
        this.m = bl;
    }

    public boolean v() {
        return this.H;
    }

    public void R(boolean bl) {
        this.H = bl;
    }

    public boolean t() {
        return this.Z;
    }

    public void P(boolean bl) {
        this.Z = bl;
    }

    public boolean q() {
        return this.y;
    }

    public void W(boolean bl) {
        this.y = bl;
    }

    public boolean T() {
        return this.i;
    }

    public void d(boolean bl) {
        this.i = bl;
    }

    public boolean w() {
        return this.I;
    }

    public void T(boolean bl) {
        this.I = bl;
    }

    public boolean d() {
        return this.W;
    }

    public void j(boolean bl) {
        this.W = bl;
    }

    public boolean l() {
        return this.U;
    }

    public void g(boolean bl) {
        this.U = bl;
    }

    public boolean B() {
        return this.R;
    }

    public void t(boolean bl) {
        this.R = bl;
    }

    public boolean O() {
        return this.B;
    }

    public void C(boolean bl) {
        this.B = bl;
    }

    public boolean c() {
        return this.x;
    }

    public void Q(boolean bl) {
        this.x = bl;
    }

    public boolean f() {
        return this.r;
    }

    public void o(boolean bl) {
        this.r = bl;
    }

    public boolean I() {
        return this.V;
    }

    public void f(boolean bl) {
        this.V = bl;
    }

    public boolean h() {
        return this.b;
    }

    public void E(boolean bl) {
        this.b = bl;
    }

    public boolean n() {
        return this.C;
    }

    public void v(boolean bl) {
        this.C = bl;
    }

    public boolean P() {
        return this.s;
    }

    public void x(boolean bl) {
        this.s = bl;
    }

    public boolean X() {
        return this.p;
    }

    public void l(boolean bl) {
        this.p = bl;
    }

    public boolean o() {
        return this.a;
    }

    public void k(boolean bl) {
        this.a = bl;
    }

    public boolean E() {
        return this.G;
    }

    public void b(boolean bl) {
        this.G = bl;
    }

    public boolean u() {
        return this.l;
    }

    public void F(boolean bl) {
        this.l = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7427816954494712621L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u00dd\u00d9\u00f4\u00a0{\u00e5\u000fg\u00cbU/z\u00b7\u0015\b\u00a5-\u00df\u00adgW\u00d1Q0}\u0099,^\u00ab\u00ee\u00ac\u00cf\u0016L\u00c4\u00b3\u00e2y\u00ee\u00be\u00b0\u00e87\u00ed\u00e2K#\u00df";
                var5_4 = "\u00dd\u00d9\u00f4\u00a0{\u00e5\u000fg\u00cbU/z\u00b7\u0015\b\u00a5-\u00df\u00adgW\u00d1Q0}\u0099,^\u00ab\u00ee\u00ac\u00cf\u0016L\u00c4\u00b3\u00e2y\u00ee\u00be\u00b0\u00e87\u00ed\u00e2K#\u00df".length();
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
                    var4_3 = "\u008e;\u00bc\u009c\u0003|\u00d89B\u0007wZ\u0091\u0011f\u00e8";
                    var5_4 = "\u008e;\u00bc\u009c\u0003|\u00d89B\u0007wZ\u0091\u0011f\u00e8".length();
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
        ch_1.c = var6_1;
        ch_1.d = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x35BD;
        if (d[n11] == null) {
            ch_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

