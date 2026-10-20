/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hx_1;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hB
 */
public class hb_1
extends hx_1 {
    private float v = 0.5f;
    private int L = 1;
    private static final String c;
    private static final long[] l;
    private static final Integer[] m;

    public hb_1() {
        this.e = 2.0f;
    }

    public void N(int n10) {
        this.L = n10;
    }

    public int H() {
        return this.L;
    }

    public void Q(float f10) {
        this.v = f10;
    }

    public float X() {
        return this.v;
    }

    /*
     * Exception decompiling
     */
    @Override
    public BufferedImage filter(BufferedImage var1_1, BufferedImage var2_2) {
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

    @Override
    public String toString() {
        return c;
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
                v0 = "\u0014\u0005x#STZ%\u0001l#\f!y7\u001af\u007fR/".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 110;
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
                                v9 = 56;
                                break;
                            }
                            case 1: {
                                v9 = 7;
                                break;
                            }
                            case 2: {
                                v9 = 99;
                                break;
                            }
                            case 3: {
                                v9 = 63;
                                break;
                            }
                            case 4: {
                                v9 = 18;
                                break;
                            }
                            case 5: {
                                v9 = 111;
                                break;
                            }
                            default: {
                                v9 = 90;
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
                hb_1.c = new String(v10).intern();
                var0_1 = 7854271042684769411L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u0099Q\u00a8\u008a\u009e\u0003\u0006\u0013\u00bf\u00c8\u00f1B\u00925\u001e\u00d2\u00b1\u00c2\u00e9f\u00b5>+F\u00d9\r`j\u008cq}]\u00ff^\u00cb\u009eQO\u0096\u008d";
                var5_5 = "\u0099Q\u00a8\u008a\u009e\u0003\u0006\u0013\u00bf\u00c8\u00f1B\u00925\u001e\u00d2\u00b1\u00c2\u00e9f\u00b5>+F\u00d9\r`j\u008cq}]\u00ff^\u00cb\u009eQO\u0096\u008d".length();
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
                    var4_4 = "\u00fa\u009b\u00c0i8;\u00e4\u00ae\u0000PB\u0000\u0003\u0004\u00dc^";
                    var5_5 = "\u00fa\u009b\u00c0i8;\u00e4\u00ae\u0000PB\u0000\u0003\u0004\u00dc^".length();
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
        hb_1.l = var6_2;
        hb_1.m = new Integer[7];
    }

    private static int c(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6820;
        if (m[n11] == null) {
            hb_1.m[n11] = (int)(l[n11] ^ l2);
        }
        return m[n11];
    }
}

