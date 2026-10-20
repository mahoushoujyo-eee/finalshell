/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.RC;
import com.hi_0;
import com.nl_1;
import com.ym_1;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/*
 * Renamed from com.oN
 */
public class on_1
implements Closeable,
Flushable {
    private ym_1 F;
    private nl_1 q;
    private RC d;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public on_1(Writer writer) {
        this.F = new ym_1(writer);
        this.q = new nl_1(this.F);
    }

    public void O(EP eP, boolean bl) {
        this.F.k(eP, bl);
    }

    public void G() {
        on_1 on_12;
        block4: {
            block5: {
                String string = hi_0.C();
                try {
                    try {
                        on_12 = this;
                        if (string != null) break block4;
                        if (on_12.d == null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw on_1.a(hi_02);
                    }
                    this.J();
                }
                catch (hi_0 hi_03) {
                    throw on_1.a(hi_03);
                }
            }
            this.d = new RC(this.d, on_1.a(28642, 4188737048031171003L));
            on_12 = this;
        }
        on_12.F.write(on_1.a(901, 9133198515351125457L));
    }

    public void n() {
        this.F.write(on_1.a(25396, 7652739688652381545L));
        this.j();
    }

    public void Q(String string) {
        this.j(string);
    }

    public void o(Object object) {
        this.W(object);
    }

    public void j(String string) {
        this.A();
        this.q.l(string);
        this.d();
    }

    public void W(Object object) {
        this.A();
        this.q.B(object);
        this.d();
    }

    public void m() {
        on_1 on_12;
        block4: {
            block5: {
                String string = hi_0.C();
                try {
                    try {
                        on_12 = this;
                        if (string != null) break block4;
                        if (on_12.d == null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw on_1.a(hi_02);
                    }
                    this.J();
                }
                catch (hi_0 hi_03) {
                    throw on_1.a(hi_03);
                }
            }
            this.d = new RC(this.d, on_1.a(32163, 8809813507594257401L));
            on_12 = this;
        }
        on_12.F.write(on_1.a(2803, 12498422416766113L));
    }

    /*
     * Exception decompiling
     */
    private void J() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[SWITCH]
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

    public void I() {
        this.F.write(on_1.a(14623, 5063355052576458569L));
        this.j();
    }

    /*
     * Exception decompiling
     */
    private void j() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE]], but top level block is 2[TRYBLOCK]
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void A() {
        RC rC;
        String string;
        block17: {
            string = hi_0.C();
            try {
                rC = this.d;
                if (string != null) break block17;
                if (rC == null) {
                    return;
                }
            }
            catch (hi_0 hi_02) {
                throw on_1.a(hi_02);
            }
            rC = this.d;
        }
        try {
            try {
                try {
                    try {
                        switch (rC.S) {
                            case 1001: 
                            case 1004: {
                                if (string == null) return;
                            }
                            case 1002: {
                                this.F.write(on_1.a(13433, 1559066485048953388L));
                                if (string == null) return;
                            }
                            case 1003: {
                                this.F.write(on_1.a(23773, 6741049983396913804L));
                                if (string == null) return;
                            }
                            case 1005: {
                                this.F.write(on_1.a(23773, 6741049983396913804L));
                                return;
                            }
                        }
                        return;
                    }
                    catch (hi_0 hi_03) {
                        throw on_1.a(hi_03);
                    }
                }
                catch (hi_0 hi_04) {
                    throw on_1.a(hi_04);
                }
            }
            catch (hi_0 hi_05) {
                throw on_1.a(hi_05);
            }
        }
        catch (hi_0 hi_06) {
            throw on_1.a(hi_06);
        }
    }

    /*
     * Exception decompiling
     */
    private void d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
    public void flush() throws IOException {
        this.F.flush();
    }

    @Override
    public void close() throws IOException {
        this.F.close();
    }

    @Deprecated
    public void E() {
        this.G();
    }

    @Deprecated
    public void O() {
        this.n();
    }

    @Deprecated
    public void X() {
        this.m();
    }

    @Deprecated
    public void g() {
        this.I();
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "\u0015ucBzZg\\j{Fi^+F9".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 7;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 123;
                                break;
                            }
                            case 1: {
                                v9 = 30;
                                break;
                            }
                            case 2: {
                                v9 = 8;
                                break;
                            }
                            case 3: {
                                v9 = 32;
                                break;
                            }
                            case 4: {
                                v9 = 26;
                                break;
                            }
                            case 5: {
                                v9 = 60;
                                break;
                            }
                            default: {
                                v9 = 12;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                on_1.a = new String(v10).intern();
                var0_1 = 408931835321987548L;
                var6_2 = new long[16];
                var3_3 = 0;
                var4_4 = "\u00fdR\f\u00b3\u00d1\u00d0E&GM\u0013z\u0000\u001e\u00b6\u0081[\u00a3\u00ff\u00f1\u00cb\u00dd\u00df\u00b8l\u00b8\u0007+\u00e41\u0093|3\u00b4\u00dc\u00aa\u009d\u00c8\u00f6\u00c8}\u0086\u0016va\u00f7\u00fd7\u00b9\"\u00ee\u0019\u009f\u0017\u00ccv.\u001f\u00c8![8{\u00ca\u0016\u00c4\u00e7\u00c7\u001c/1\u00c9\u00bd\u001e\u00acF\u00e1\f\u0080\u00d4\u00b3s\u0085\u0005\u00b0\u0082\u00b5\u0018\u00b5\u0091z\u00a3\u0090\u00dd\u00a3\u008e5\u0097\u00ef\u009c\u00bb\u0096\u00a8.G\u00d5\\x7\u00df\u009fa";
                var5_5 = "\u00fdR\f\u00b3\u00d1\u00d0E&GM\u0013z\u0000\u001e\u00b6\u0081[\u00a3\u00ff\u00f1\u00cb\u00dd\u00df\u00b8l\u00b8\u0007+\u00e41\u0093|3\u00b4\u00dc\u00aa\u009d\u00c8\u00f6\u00c8}\u0086\u0016va\u00f7\u00fd7\u00b9\"\u00ee\u0019\u009f\u0017\u00ccv.\u001f\u00c8![8{\u00ca\u0016\u00c4\u00e7\u00c7\u001c/1\u00c9\u00bd\u001e\u00acF\u00e1\f\u0080\u00d4\u00b3s\u0085\u0005\u00b0\u0082\u00b5\u0018\u00b5\u0091z\u00a3\u0090\u00dd\u00a3\u008e5\u0097\u00ef\u009c\u00bb\u0096\u00a8.G\u00d5\\x7\u00df\u009fa".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "[\u009b%\f\u00f5\u00ba\u00c1s\u0091\u00bc\u00b0\u00a7\u0001\u001f\u00ac\u00c8";
                    var5_5 = "[\u009b%\f\u00f5\u00ba\u00c1s\u0091\u00bc\u00b0\u00a7\u0001\u001f\u00ac\u00c8".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        on_1.b = var6_2;
        on_1.c = new Integer[16];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7E52;
        if (c[n11] == null) {
            on_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

