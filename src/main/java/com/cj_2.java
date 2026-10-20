/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.WE;
import com._y_0;
import com.aW;
import com.c;
import com.cv_1;
import com.dm_2;
import com.fv_0;
import com.google.common.net.HostAndPort;
import com.ky_2;
import com.pc_0;
import com.xe_0;
import java.awt.Dimension;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.cj
 */
public abstract class cj_2
implements fv_0 {
    private InputStream O = null;
    private OutputStream I = null;
    private DI s;
    private dm_2 S;
    private AtomicBoolean g = new AtomicBoolean(false);
    private int K;
    private String V;
    private String u;
    private String d;
    private Dimension C;
    private Dimension G;
    private OutputStreamWriter Y;
    InputStreamReader W;
    boolean e;
    String c;
    public _y_0 R;
    public lv_2 U;
    boolean y;
    to_0 P;
    boolean r;
    private static String[] t;
    private static final String[] f;
    private static final String[] h;
    private static final long[] k;
    private static final Integer[] l;
    private static final long n;

    public cj_2(String string, String string2, String string3, lv_2 lv_22) {
        this(string, cj_2.a(31465, 6104758990046145127L), string2, string3, lv_22);
    }

    public cj_2(String string, int n10, String string2, String string3, lv_2 lv_22) {
        this.K = cj_2.a(24968, 4292383849043013895L);
        this.V = cj_2.b(9596, -7013);
        this.u = cj_2.b(9586, -14644);
        this.d = "";
        this.e = false;
        this.c = cj_2.b(9584, -27426);
        this.y = false;
        this.r = false;
        this.u = string;
        this.K = n10;
        this.V = string2;
        this.d = string3;
        this.U = lv_22;
    }

    @Override
    public void m(_y_0 _y_02) {
        this.R = _y_02;
    }

    @Override
    public _y_0 n() {
        return this.R;
    }

    @Override
    public void R(boolean bl) {
        this.y = bl;
    }

    @Override
    public boolean l() {
        return this.y;
    }

    public to_0 f() {
        return this.P;
    }

    public void W(to_0 to_02) {
        this.P = to_02;
    }

    public cj_2() {
        this.K = cj_2.a(31465, 6104758990046145127L);
        this.V = cj_2.b(9597, 19476);
        this.u = cj_2.b(9587, 11854);
        this.d = "";
        this.e = false;
        this.c = cj_2.b(9590, 15233);
        this.y = false;
        this.r = false;
    }

    @Override
    public void j(Dimension dimension, Dimension dimension2) {
        block5: {
            cj_2 cj_22;
            block4: {
                this.C = dimension;
                String[] stringArray = cj_2.v();
                try {
                    try {
                        this.G = dimension2;
                        cj_22 = this;
                        if (stringArray != null) break block4;
                        if (cj_22.S == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cj_2.a(illegalArgumentException);
                    }
                    cj_22 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cj_2.a(illegalArgumentException);
                }
            }
            cj_22.T();
        }
    }

    protected abstract void D(dm_2 var1, int var2, int var3, int var4, int var5);

    private void T() {
        block9: {
            block10: {
                cj_2 cj_22;
                Dimension dimension;
                block8: {
                    String[] stringArray = cj_2.v();
                    try {
                        try {
                            try {
                                dimension = this.C;
                                if (stringArray != null) break block8;
                                if (dimension == null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cj_2.a(illegalArgumentException);
                            }
                            cj_22 = this;
                            if (stringArray != null) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cj_2.a(illegalArgumentException);
                        }
                        dimension = cj_22.G;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cj_2.a(illegalArgumentException);
                    }
                }
                try {
                    if (dimension == null) break block9;
                    this.D(this.S, this.C.width, this.C.height, this.G.width, this.G.height);
                    this.C = null;
                    cj_22 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cj_2.a(illegalArgumentException);
                }
            }
            cj_22.G = null;
        }
    }

    /*
     * Exception decompiling
     */
    public void F() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[CATCHBLOCK]], but top level block is 6[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    @Override
    public void a() {
        this.F();
    }

    @Override
    public DI e() {
        return this.s;
    }

    protected abstract dm_2 i(DI var1) throws pc_0;

    protected abstract void U(dm_2 var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public boolean q(aW var1_1, ms_0 var2_2, lv_2 var3_3, DI var4_4, int var5_5, String var6_6) {
        this.c = var6_6;
        var7_7 = cj_2.v();
        try {
            v0 = var4_4 != null;
        }
        catch (IOException v1) {
            throw cj_2.a(v1);
        }
        var8_8 = v0;
        v2 = this;
        if (var7_7 != null) ** GOTO lbl20
        v2.i(var1_1);
        try {
            block14: {
                if (var4_4 != null) ** GOTO lbl16
                try {
                    this.s = this.Z(var1_1, var2_2, var3_3, var5_5);
                    if (var7_7 == null) break block14;
lbl16:
                    // 2 sources

                    v2 = this;
                }
                catch (IOException v3) {
                    throw cj_2.a(v3);
                }
lbl20:
                // 2 sources

                v2.s = var4_4;
            }
            this.S = this.i(this.s);
            this.U(this.S);
            this.O = this.S.s();
            this.P = new to_0(this.O);
            this.O = this.P;
            this.I = this.S.j();
            this.W = new TC(this.O, var6_6);
            if (!var8_8) {
                // empty if block
            }
            this.S.I();
            this.T();
            this.e = true;
            var9_9 = true;
            return var9_9;
        }
        catch (IOException var9_10) {
            var1_1.U(var9_10.getMessage());
            var10_13 = false;
            return var10_13;
        }
        catch (pc_0 var9_11) {
            var1_1.U(var9_11.getMessage());
            var10_14 = false;
            return var10_14;
        }
        catch (Exception var9_12) {
            var9_12.printStackTrace();
            var10_15 = false;
            return var10_15;
        }
        finally {
            this.g.set(true);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void i(aW var1_1) {
        var2_2 = cj_2.v();
        while (true) {
            block17: {
                block16: {
                    block15: {
                        if (this.u == null) {
                            try {
                                v0 = this;
                                if (var2_2 != null) break block15;
                                v0.u = var1_1.S(cj_2.b(9594, -11759), cj_2.b(9593, 13322));
                            }
                            catch (IllegalArgumentException v1) {
                                throw cj_2.a(v1);
                            }
                        }
                        v0 = this;
                    }
                    try {
                        v2 = v0.u;
                        if (var2_2 != null) break block16;
                        if (v2 == null) continue;
                    }
                    catch (IllegalArgumentException v3) {
                        throw cj_2.a(v3);
                    }
                    v2 = this.u;
                }
                if (var2_2 != null) ** GOTO lbl37
                try {
                    block18: {
                        if (v2.length() != 0) break block17;
                        break block18;
                        catch (IllegalArgumentException v4) {
                            throw cj_2.a(v4);
                        }
                    }
                    if (var2_2 == null) continue;
                }
                catch (IllegalArgumentException v5) {
                    throw cj_2.a(v5);
                }
            }
            try {
                v2 = this.u;
lbl37:
                // 2 sources

                var3_4 = HostAndPort.fromString(v2);
                this.u = var3_4.getHostText();
                this.K = var3_4.getPortOrDefault(this.K);
            }
            catch (IllegalArgumentException var3_3) {
                var1_1.U(var3_3.getMessage());
                this.u = var1_1.S(cj_2.b(9585, 26306), this.u);
                continue;
            }
            break;
        }
        try {
            if (this.V == null) {
                // empty if block
            }
        }
        catch (IllegalArgumentException v6) {
            throw cj_2.a(v6);
        }
    }

    public DI Z(aW aW2, ms_0 ms_02, lv_2 lv_22, int n10) throws Exception {
        DI dI;
        DI dI2;
        block10: {
            cv_1 cv_12;
            block11: {
                int n11;
                xe_0 xe_02 = new xe_0();
                String[] stringArray = cj_2.v();
                this.L(xe_02);
                try {
                    n11 = (Integer)lv_22.w();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (n11 == lv_2.n) {
                    // empty if block
                }
                dd_1.n = 1;
                xe_02.c((String)dd_1.X);
                this.s = dI2 = xe_02.J(this.V, this.u, this.K, ms_02, lv_22, n10);
                dI2.N(this.R);
                cv_12 = new cv_1(aW2);
                try {
                    try {
                        if (stringArray != null) break block10;
                        if (this.d == null) break block11;
                    }
                    catch (Exception exception) {
                        throw cj_2.a(exception);
                    }
                    dI2.z(this.d);
                    cv_12.M(this.d);
                }
                catch (Exception exception) {
                    throw cj_2.a(exception);
                }
            }
            dI2.Q(cv_12);
        }
        Properties properties = new Properties();
        try {
            properties.put(cj_2.b(9588, -24257), cj_2.b(9577, 32651));
            properties.put(cj_2.b(9598, -19438), cj_2.b(9599, 32546));
            this.S(dI2, properties);
            dI2.C();
            dI = dI2;
            if (ky_2.F() != null) {
                cj_2.p(new String[5]);
            }
        }
        catch (Exception exception) {
            throw cj_2.a(exception);
        }
        return dI;
    }

    protected void L(xe_0 xe_02) throws pc_0 {
    }

    protected void S(DI dI, Properties properties) throws pc_0 {
        dI.o(properties);
        dI.b(cj_2.b(9589, 4819), cj_2.b(9576, 25264));
        dI.b(cj_2.b(9591, 4621), cj_2.b(9579, -18684));
        dI.b(cj_2.b(9592, -17415), "9");
    }

    @Override
    public String b() {
        String string;
        block4: {
            block5: {
                String[] stringArray = cj_2.v();
                try {
                    try {
                        string = this.u;
                        if (stringArray != null) break block4;
                        if (string == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cj_2.a(illegalArgumentException);
                    }
                    string = this.u;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cj_2.a(illegalArgumentException);
                }
            }
            string = cj_2.b(9595, 17239);
        }
        return string;
    }

    @Override
    public int x(char[] cArray, int n10, int n11) throws IOException {
        int n12 = this.W.read(cArray, n10, n11);
        return n12;
    }

    public int Q(byte[] byArray, int n10, int n11) throws IOException {
        return this.O.read(byArray, n10, n11);
    }

    @Override
    public synchronized void q(byte[] byArray) throws IOException {
        block5: {
            OutputStream outputStream;
            block4: {
                String[] stringArray = cj_2.v();
                try {
                    try {
                        outputStream = this.I;
                        if (stringArray != null) break block4;
                        if (outputStream == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw cj_2.a(iOException);
                    }
                    this.I.write(byArray);
                    outputStream = this.I;
                }
                catch (IOException iOException) {
                    throw cj_2.a(iOException);
                }
            }
            outputStream.flush();
        }
    }

    @Override
    public synchronized void F(byte[] byArray) throws IOException {
        block5: {
            OutputStream outputStream;
            block4: {
                String[] stringArray = cj_2.v();
                try {
                    try {
                        outputStream = this.I;
                        if (stringArray != null) break block4;
                        if (outputStream == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw cj_2.a(iOException);
                    }
                    outputStream = this.I;
                }
                catch (IOException iOException) {
                    throw cj_2.a(iOException);
                }
            }
            outputStream.write(byArray);
        }
    }

    @Override
    public synchronized void v() throws IOException {
        block5: {
            OutputStream outputStream;
            block4: {
                String[] stringArray = cj_2.v();
                try {
                    try {
                        outputStream = this.I;
                        if (stringArray != null) break block4;
                        if (outputStream == null) break block5;
                    }
                    catch (IOException iOException) {
                        throw cj_2.a(iOException);
                    }
                    outputStream = this.I;
                }
                catch (IOException iOException) {
                    throw cj_2.a(iOException);
                }
            }
            outputStream.flush();
        }
    }

    @Override
    public boolean K() {
        boolean bl;
        block13: {
            block11: {
                String[] stringArray;
                block12: {
                    dm_2 dm_22;
                    block10: {
                        stringArray = cj_2.v();
                        try {
                            try {
                                dm_22 = this.S;
                                if (stringArray != null) break block10;
                                if (dm_22 == null) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw cj_2.a(illegalArgumentException);
                            }
                            dm_22 = this.S;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cj_2.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            bl = dm_22.L();
                            if (stringArray != null) break block12;
                            if (!bl) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cj_2.a(illegalArgumentException);
                        }
                        bl = this.e;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cj_2.a(illegalArgumentException);
                    }
                }
                try {
                    if (stringArray != null) break block13;
                    if (!bl) break block11;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cj_2.a(illegalArgumentException);
                }
                bl = true;
                break block13;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void E(String string) throws IOException {
        this.q(string.getBytes(this.c));
    }

    /*
     * Exception decompiling
     */
    @Override
    public int f() throws InterruptedException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private static boolean o(dm_2 dm_22) {
        int n10;
        block11: {
            block9: {
                String[] stringArray;
                block10: {
                    dm_2 dm_23;
                    block8: {
                        stringArray = cj_2.v();
                        try {
                            dm_23 = dm_22;
                            if (stringArray != null) break block8;
                            if (dm_23 == null) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cj_2.a(illegalArgumentException);
                        }
                        dm_23 = dm_22;
                    }
                    try {
                        try {
                            n10 = dm_23.o();
                            if (stringArray != null) break block10;
                            if (n10 >= 0) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw cj_2.a(illegalArgumentException);
                        }
                        n10 = dm_22.L() ? 1 : 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw cj_2.a(illegalArgumentException);
                    }
                }
                try {
                    if (stringArray != null) break block11;
                    if (n10 == 0) break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw cj_2.a(illegalArgumentException);
                }
                n10 = 1;
                break block11;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    @Override
    public boolean A() throws IOException {
        return false;
    }

    @Override
    public lv_2 E() {
        return this.U;
    }

    @Override
    public void M(lv_2 lv_22) {
        this.U = lv_22;
    }

    public void U() {
        this.O = null;
        this.I = null;
        this.s = null;
        this.g = null;
        this.V = null;
        this.u = null;
        this.d = null;
        this.C = null;
        this.G = null;
        this.Y = null;
        this.W = null;
        this.c = null;
        this.R = null;
        this.U = null;
        this.P = null;
    }

    public void X() {
        try {
            yt_1.F.W((Object)new WE(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public static void p(String[] stringArray) {
        t = stringArray;
    }

    public static String[] v() {
        return t;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            var15 = new String[19];
                            var13_1 = 0;
                            var12_2 = "\u000b!Z\u0096#\u009c]G\u0080\"\u00de\u0080w)\u0011\u00ca\u0093 h?\u009d\u0097\u0018\u00aaj\u0097\u0019\u00b6\u00cdP9\u00c5\u0006YeE\u00e2\u00950\u0006\u009bL~\u0097a\u00a3\u0004\u00db\u00193=\u0004\u00f8KWw\t\u00faF\u0018\u00a3\u00e2\u00bf\u00a5+\u007f\u000f\u00d7n\u0083\u00d7Kj\u0019\u00e6{\u00b5\u00ad\u0093\u00fe\u0094\u00b2\u0006\u00b4X\u009b\u0015\u00dd\u00f3\u0005P\u0018\u00a8\u0018*\u0007zH\u000b\u0010\u00a5\u00ae\u008d\u0007B^\f\u00d2E\u00f6\u0091\u000fx\u00a2vN\u00f5Y\u00ce\u0080\u0081y\u00f2\n\u0005\u00a7\u00cf\u000fT\u00a1\u00f3.EU\u00d8\u0001CI\u00aa\f\u000eg\u00ae\u000fku\u0014\u00b4\u00b9\u0006Gk\u00b0\u0004\u00d4\u00a5\u00d1RW\u0005\u0095Y\u00100=\t\u0014\u0019\u00c5HY\u00c2\u00d2\u0084\u0091";
                            var14_3 = "\u000b!Z\u0096#\u009c]G\u0080\"\u00de\u0080w)\u0011\u00ca\u0093 h?\u009d\u0097\u0018\u00aaj\u0097\u0019\u00b6\u00cdP9\u00c5\u0006YeE\u00e2\u00950\u0006\u009bL~\u0097a\u00a3\u0004\u00db\u00193=\u0004\u00f8KWw\t\u00faF\u0018\u00a3\u00e2\u00bf\u00a5+\u007f\u000f\u00d7n\u0083\u00d7Kj\u0019\u00e6{\u00b5\u00ad\u0093\u00fe\u0094\u00b2\u0006\u00b4X\u009b\u0015\u00dd\u00f3\u0005P\u0018\u00a8\u0018*\u0007zH\u000b\u0010\u00a5\u00ae\u008d\u0007B^\f\u00d2E\u00f6\u0091\u000fx\u00a2vN\u00f5Y\u00ce\u0080\u0081y\u00f2\n\u0005\u00a7\u00cf\u000fT\u00a1\u00f3.EU\u00d8\u0001CI\u00aa\f\u000eg\u00ae\u000fku\u0014\u00b4\u00b9\u0006Gk\u00b0\u0004\u00d4\u00a5\u00d1RW\u0005\u0095Y\u00100=\t\u0014\u0019\u00c5HY\u00c2\u00d2\u0084\u0091".length();
                            var11_4 = 14;
                            cj_2.p(null);
                            var10_5 = -1;
lbl8:
                            // 2 sources

                            while (true) {
                                v0 = 9;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block22;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "\u000b\u00f8\u000bY\u00c1\u00cc\u0012BS\u00c4\u007fIz=\u00f7\u00c4f\u00e7\u00ad\u0006$\u0094\u00c5b\u00b0\u000f\u001a\u00d8\u008eq\u0097\u008e\u0015\u00fbyn\u00a3\u00d8\u00a5\u008e\u00a0iw\u00b5\u0091\u00d7\u00c8kM,Y\u008dh";
                                var14_3 = "\u000b\u00f8\u000bY\u00c1\u00cc\u0012BS\u00c4\u007fIz=\u00f7\u00c4f\u00e7\u00ad\u0006$\u0094\u00c5b\u00b0\u000f\u001a\u00d8\u008eq\u0097\u008e\u0015\u00fbyn\u00a3\u00d8\u00a5\u008e\u00a0iw\u00b5\u0091\u00d7\u00c8kM,Y\u008dh".length();
                                var11_4 = 26;
                                var10_5 = -1;
lbl23:
                                // 2 sources

                                while (true) {
                                    v0 = 33;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block22;
                                    break;
                                }
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block23;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl86
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 121;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 110;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 28;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 13;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 34;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 2;
                                        break;
                                    }
                                    default: {
                                        v15 = 83;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    cj_2.f = var15;
                    cj_2.h = new String[19];
                    var2_7 = 1242875659404781158L;
                    var8_8 = new long[2];
                    var5_9 = 0;
                    var6_10 = ",\u00ef\u00a3g\u00a3\u0018\u0017wZ\u0012'\u0099\u00c3\u00df\u008c\u0017";
                    var7_11 = ",\u00ef\u00a3g\u00a3\u0018\u0017wZ\u0012'\u0099\u00c3\u00df\u008c\u0017".length();
                    var4_12 = 0;
                    while (true) {
                        break block24;
                        break;
                    }
lbl108:
                    // 1 sources

                    while (true) {
                        var8_8[v17] = (((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L) ^ var2_7;
                        if (var4_12 < var7_11) ** continue;
                        break block25;
                        break;
                    }
                }
                var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                v17 = var5_9++;
                ** while (true)
            }
            cj_2.k = var8_8;
            cj_2.l = new Integer[2];
            break block26;
lbl123:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 2232471078905741686L;
        ** while (true)
        cj_2.n = 2232471078905741586L ^ var0_14;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x2579) & 0xFFFF;
        if (h[n12] == null) {
            int n13;
            int n14;
            char[] cArray = f[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 246;
                    break;
                }
                case 1: {
                    n14 = 167;
                    break;
                }
                case 2: {
                    n14 = 251;
                    break;
                }
                case 3: {
                    n14 = 184;
                    break;
                }
                case 4: {
                    n14 = 39;
                    break;
                }
                case 5: {
                    n14 = 190;
                    break;
                }
                case 6: {
                    n14 = 157;
                    break;
                }
                case 7: {
                    n14 = 88;
                    break;
                }
                case 8: {
                    n14 = 104;
                    break;
                }
                case 9: {
                    n14 = 70;
                    break;
                }
                case 10: {
                    n14 = 236;
                    break;
                }
                case 11: {
                    n14 = 53;
                    break;
                }
                case 12: {
                    n14 = 175;
                    break;
                }
                case 13: {
                    n14 = 103;
                    break;
                }
                case 14: {
                    n14 = 33;
                    break;
                }
                case 15: {
                    n14 = 57;
                    break;
                }
                case 16: {
                    n14 = 15;
                    break;
                }
                case 17: {
                    n14 = 203;
                    break;
                }
                case 18: {
                    n14 = 119;
                    break;
                }
                case 19: {
                    n14 = 115;
                    break;
                }
                case 20: {
                    n14 = 126;
                    break;
                }
                case 21: {
                    n14 = 5;
                    break;
                }
                case 22: {
                    n14 = 77;
                    break;
                }
                case 23: {
                    n14 = 144;
                    break;
                }
                case 24: {
                    n14 = 255;
                    break;
                }
                case 25: {
                    n14 = 153;
                    break;
                }
                case 26: {
                    n14 = 9;
                    break;
                }
                case 27: {
                    n14 = 149;
                    break;
                }
                case 28: {
                    n14 = 51;
                    break;
                }
                case 29: {
                    n14 = 47;
                    break;
                }
                case 30: {
                    n14 = 45;
                    break;
                }
                case 31: {
                    n14 = 240;
                    break;
                }
                case 32: {
                    n14 = 105;
                    break;
                }
                case 33: {
                    n14 = 254;
                    break;
                }
                case 34: {
                    n14 = 200;
                    break;
                }
                case 35: {
                    n14 = 146;
                    break;
                }
                case 36: {
                    n14 = 248;
                    break;
                }
                case 37: {
                    n14 = 227;
                    break;
                }
                case 38: {
                    n14 = 134;
                    break;
                }
                case 39: {
                    n14 = 180;
                    break;
                }
                case 40: {
                    n14 = 14;
                    break;
                }
                case 41: {
                    n14 = 220;
                    break;
                }
                case 42: {
                    n14 = 232;
                    break;
                }
                case 43: {
                    n14 = 48;
                    break;
                }
                case 44: {
                    n14 = 18;
                    break;
                }
                case 45: {
                    n14 = 207;
                    break;
                }
                case 46: {
                    n14 = 179;
                    break;
                }
                case 47: {
                    n14 = 147;
                    break;
                }
                case 48: {
                    n14 = 95;
                    break;
                }
                case 49: {
                    n14 = 133;
                    break;
                }
                case 50: {
                    n14 = 114;
                    break;
                }
                case 51: {
                    n14 = 61;
                    break;
                }
                case 52: {
                    n14 = 19;
                    break;
                }
                case 53: {
                    n14 = 127;
                    break;
                }
                case 54: {
                    n14 = 16;
                    break;
                }
                case 55: {
                    n14 = 137;
                    break;
                }
                case 56: {
                    n14 = 30;
                    break;
                }
                case 57: {
                    n14 = 143;
                    break;
                }
                case 58: {
                    n14 = 13;
                    break;
                }
                case 59: {
                    n14 = 24;
                    break;
                }
                case 60: {
                    n14 = 54;
                    break;
                }
                case 61: {
                    n14 = 212;
                    break;
                }
                case 62: {
                    n14 = 214;
                    break;
                }
                case 63: {
                    n14 = 151;
                    break;
                }
                case 64: {
                    n14 = 91;
                    break;
                }
                case 65: {
                    n14 = 155;
                    break;
                }
                case 66: {
                    n14 = 86;
                    break;
                }
                case 67: {
                    n14 = 21;
                    break;
                }
                case 68: {
                    n14 = 233;
                    break;
                }
                case 69: {
                    n14 = 178;
                    break;
                }
                case 70: {
                    n14 = 96;
                    break;
                }
                case 71: {
                    n14 = 241;
                    break;
                }
                case 72: {
                    n14 = 37;
                    break;
                }
                case 73: {
                    n14 = 101;
                    break;
                }
                case 74: {
                    n14 = 201;
                    break;
                }
                case 75: {
                    n14 = 97;
                    break;
                }
                case 76: {
                    n14 = 196;
                    break;
                }
                case 77: {
                    n14 = 164;
                    break;
                }
                case 78: {
                    n14 = 117;
                    break;
                }
                case 79: {
                    n14 = 85;
                    break;
                }
                case 80: {
                    n14 = 253;
                    break;
                }
                case 81: {
                    n14 = 242;
                    break;
                }
                case 82: {
                    n14 = 229;
                    break;
                }
                case 83: {
                    n14 = 135;
                    break;
                }
                case 84: {
                    n14 = 111;
                    break;
                }
                case 85: {
                    n14 = 80;
                    break;
                }
                case 86: {
                    n14 = 219;
                    break;
                }
                case 87: {
                    n14 = 225;
                    break;
                }
                case 88: {
                    n14 = 112;
                    break;
                }
                case 89: {
                    n14 = 116;
                    break;
                }
                case 90: {
                    n14 = 148;
                    break;
                }
                case 91: {
                    n14 = 122;
                    break;
                }
                case 92: {
                    n14 = 215;
                    break;
                }
                case 93: {
                    n14 = 0;
                    break;
                }
                case 94: {
                    n14 = 67;
                    break;
                }
                case 95: {
                    n14 = 75;
                    break;
                }
                case 96: {
                    n14 = 71;
                    break;
                }
                case 97: {
                    n14 = 65;
                    break;
                }
                case 98: {
                    n14 = 7;
                    break;
                }
                case 99: {
                    n14 = 168;
                    break;
                }
                case 100: {
                    n14 = 109;
                    break;
                }
                case 101: {
                    n14 = 84;
                    break;
                }
                case 102: {
                    n14 = 174;
                    break;
                }
                case 103: {
                    n14 = 79;
                    break;
                }
                case 104: {
                    n14 = 189;
                    break;
                }
                case 105: {
                    n14 = 76;
                    break;
                }
                case 106: {
                    n14 = 17;
                    break;
                }
                case 107: {
                    n14 = 52;
                    break;
                }
                case 108: {
                    n14 = 68;
                    break;
                }
                case 109: {
                    n14 = 102;
                    break;
                }
                case 110: {
                    n14 = 218;
                    break;
                }
                case 111: {
                    n14 = 187;
                    break;
                }
                case 112: {
                    n14 = 40;
                    break;
                }
                case 113: {
                    n14 = 138;
                    break;
                }
                case 114: {
                    n14 = 73;
                    break;
                }
                case 115: {
                    n14 = 245;
                    break;
                }
                case 116: {
                    n14 = 145;
                    break;
                }
                case 117: {
                    n14 = 20;
                    break;
                }
                case 118: {
                    n14 = 244;
                    break;
                }
                case 119: {
                    n14 = 106;
                    break;
                }
                case 120: {
                    n14 = 226;
                    break;
                }
                case 121: {
                    n14 = 228;
                    break;
                }
                case 122: {
                    n14 = 141;
                    break;
                }
                case 123: {
                    n14 = 192;
                    break;
                }
                case 124: {
                    n14 = 222;
                    break;
                }
                case 125: {
                    n14 = 63;
                    break;
                }
                case 126: {
                    n14 = 150;
                    break;
                }
                case 127: {
                    n14 = 152;
                    break;
                }
                case 128: {
                    n14 = 10;
                    break;
                }
                case 129: {
                    n14 = 195;
                    break;
                }
                case 130: {
                    n14 = 158;
                    break;
                }
                case 131: {
                    n14 = 108;
                    break;
                }
                case 132: {
                    n14 = 165;
                    break;
                }
                case 133: {
                    n14 = 118;
                    break;
                }
                case 134: {
                    n14 = 231;
                    break;
                }
                case 135: {
                    n14 = 89;
                    break;
                }
                case 136: {
                    n14 = 161;
                    break;
                }
                case 137: {
                    n14 = 43;
                    break;
                }
                case 138: {
                    n14 = 50;
                    break;
                }
                case 139: {
                    n14 = 125;
                    break;
                }
                case 140: {
                    n14 = 211;
                    break;
                }
                case 141: {
                    n14 = 58;
                    break;
                }
                case 142: {
                    n14 = 120;
                    break;
                }
                case 143: {
                    n14 = 6;
                    break;
                }
                case 144: {
                    n14 = 26;
                    break;
                }
                case 145: {
                    n14 = 237;
                    break;
                }
                case 146: {
                    n14 = 193;
                    break;
                }
                case 147: {
                    n14 = 132;
                    break;
                }
                case 148: {
                    n14 = 29;
                    break;
                }
                case 149: {
                    n14 = 239;
                    break;
                }
                case 150: {
                    n14 = 23;
                    break;
                }
                case 151: {
                    n14 = 247;
                    break;
                }
                case 152: {
                    n14 = 221;
                    break;
                }
                case 153: {
                    n14 = 123;
                    break;
                }
                case 154: {
                    n14 = 92;
                    break;
                }
                case 155: {
                    n14 = 235;
                    break;
                }
                case 156: {
                    n14 = 210;
                    break;
                }
                case 157: {
                    n14 = 162;
                    break;
                }
                case 158: {
                    n14 = 156;
                    break;
                }
                case 159: {
                    n14 = 182;
                    break;
                }
                case 160: {
                    n14 = 69;
                    break;
                }
                case 161: {
                    n14 = 186;
                    break;
                }
                case 162: {
                    n14 = 107;
                    break;
                }
                case 163: {
                    n14 = 27;
                    break;
                }
                case 164: {
                    n14 = 172;
                    break;
                }
                case 165: {
                    n14 = 64;
                    break;
                }
                case 166: {
                    n14 = 160;
                    break;
                }
                case 167: {
                    n14 = 78;
                    break;
                }
                case 168: {
                    n14 = 243;
                    break;
                }
                case 169: {
                    n14 = 28;
                    break;
                }
                case 170: {
                    n14 = 224;
                    break;
                }
                case 171: {
                    n14 = 59;
                    break;
                }
                case 172: {
                    n14 = 202;
                    break;
                }
                case 173: {
                    n14 = 188;
                    break;
                }
                case 174: {
                    n14 = 185;
                    break;
                }
                case 175: {
                    n14 = 204;
                    break;
                }
                case 176: {
                    n14 = 25;
                    break;
                }
                case 177: {
                    n14 = 110;
                    break;
                }
                case 178: {
                    n14 = 66;
                    break;
                }
                case 179: {
                    n14 = 11;
                    break;
                }
                case 180: {
                    n14 = 42;
                    break;
                }
                case 181: {
                    n14 = 197;
                    break;
                }
                case 182: {
                    n14 = 128;
                    break;
                }
                case 183: {
                    n14 = 121;
                    break;
                }
                case 184: {
                    n14 = 60;
                    break;
                }
                case 185: {
                    n14 = 49;
                    break;
                }
                case 186: {
                    n14 = 32;
                    break;
                }
                case 187: {
                    n14 = 2;
                    break;
                }
                case 188: {
                    n14 = 191;
                    break;
                }
                case 189: {
                    n14 = 136;
                    break;
                }
                case 190: {
                    n14 = 93;
                    break;
                }
                case 191: {
                    n14 = 12;
                    break;
                }
                case 192: {
                    n14 = 8;
                    break;
                }
                case 193: {
                    n14 = 36;
                    break;
                }
                case 194: {
                    n14 = 46;
                    break;
                }
                case 195: {
                    n14 = 62;
                    break;
                }
                case 196: {
                    n14 = 22;
                    break;
                }
                case 197: {
                    n14 = 213;
                    break;
                }
                case 198: {
                    n14 = 41;
                    break;
                }
                case 199: {
                    n14 = 72;
                    break;
                }
                case 200: {
                    n14 = 176;
                    break;
                }
                case 201: {
                    n14 = 230;
                    break;
                }
                case 202: {
                    n14 = 35;
                    break;
                }
                case 203: {
                    n14 = 131;
                    break;
                }
                case 204: {
                    n14 = 194;
                    break;
                }
                case 205: {
                    n14 = 3;
                    break;
                }
                case 206: {
                    n14 = 208;
                    break;
                }
                case 207: {
                    n14 = 205;
                    break;
                }
                case 208: {
                    n14 = 198;
                    break;
                }
                case 209: {
                    n14 = 159;
                    break;
                }
                case 210: {
                    n14 = 206;
                    break;
                }
                case 211: {
                    n14 = 163;
                    break;
                }
                case 212: {
                    n14 = 183;
                    break;
                }
                case 213: {
                    n14 = 113;
                    break;
                }
                case 214: {
                    n14 = 171;
                    break;
                }
                case 215: {
                    n14 = 99;
                    break;
                }
                case 216: {
                    n14 = 98;
                    break;
                }
                case 217: {
                    n14 = 87;
                    break;
                }
                case 218: {
                    n14 = 216;
                    break;
                }
                case 219: {
                    n14 = 129;
                    break;
                }
                case 220: {
                    n14 = 31;
                    break;
                }
                case 221: {
                    n14 = 234;
                    break;
                }
                case 222: {
                    n14 = 4;
                    break;
                }
                case 223: {
                    n14 = 217;
                    break;
                }
                case 224: {
                    n14 = 140;
                    break;
                }
                case 225: {
                    n14 = 173;
                    break;
                }
                case 226: {
                    n14 = 55;
                    break;
                }
                case 227: {
                    n14 = 34;
                    break;
                }
                case 228: {
                    n14 = 199;
                    break;
                }
                case 229: {
                    n14 = 209;
                    break;
                }
                case 230: {
                    n14 = 139;
                    break;
                }
                case 231: {
                    n14 = 124;
                    break;
                }
                case 232: {
                    n14 = 170;
                    break;
                }
                case 233: {
                    n14 = 169;
                    break;
                }
                case 234: {
                    n14 = 238;
                    break;
                }
                case 235: {
                    n14 = 142;
                    break;
                }
                case 236: {
                    n14 = 74;
                    break;
                }
                case 237: {
                    n14 = 38;
                    break;
                }
                case 238: {
                    n14 = 1;
                    break;
                }
                case 239: {
                    n14 = 56;
                    break;
                }
                case 240: {
                    n14 = 249;
                    break;
                }
                case 241: {
                    n14 = 90;
                    break;
                }
                case 242: {
                    n14 = 252;
                    break;
                }
                case 243: {
                    n14 = 250;
                    break;
                }
                case 244: {
                    n14 = 44;
                    break;
                }
                case 245: {
                    n14 = 166;
                    break;
                }
                case 246: {
                    n14 = 177;
                    break;
                }
                case 247: {
                    n14 = 223;
                    break;
                }
                case 248: {
                    n14 = 100;
                    break;
                }
                case 249: {
                    n14 = 83;
                    break;
                }
                case 250: {
                    n14 = 154;
                    break;
                }
                case 251: {
                    n14 = 81;
                    break;
                }
                case 252: {
                    n14 = 94;
                    break;
                }
                case 253: {
                    n14 = 82;
                    break;
                }
                case 254: {
                    n14 = 130;
                    break;
                }
                default: {
                    n14 = 181;
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
            cj_2.h[n12] = new String(cArray).intern();
        }
        return h[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x508F;
        if (l[n11] == null) {
            cj_2.l[n11] = (int)(k[n11] ^ l2);
        }
        return l[n11];
    }
}

