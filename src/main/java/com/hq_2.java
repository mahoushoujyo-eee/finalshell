/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hx_1;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hq
 */
public class hq_2
extends hx_1 {
    private static final String c;
    private static final long[] l;
    private static final Integer[] m;

    public hq_2() {
        this.e = 10.0f;
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
                v0 = "\u0012u\u0000\n\rP,7qU(Ck6~7[".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 9;
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
                                v9 = 89;
                                break;
                            }
                            case 1: {
                                v9 = 16;
                                break;
                            }
                            case 2: {
                                v9 = 124;
                                break;
                            }
                            case 3: {
                                v9 = 113;
                                break;
                            }
                            case 4: {
                                v9 = 43;
                                break;
                            }
                            case 5: {
                                v9 = 17;
                                break;
                            }
                            default: {
                                v9 = 76;
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
                hq_2.c = new String(v10).intern();
                var0_1 = 7177305606031596940L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00f0\u000fl\u00d2\u00e1\u0017\u00a3\u0081\u00a7\u00ac\u00f6\u00e3\u00c4\u00c1\u0013\u0083\u00c5\u00c3\u00a5Mh\u00a3\u0098!\u00ea\u0000\u00ac\u00bb%\u001a\u00f5\u00fe\u00cf\u0003K\u00c1\u00ccev\u0083";
                var5_5 = "\u00f0\u000fl\u00d2\u00e1\u0017\u00a3\u0081\u00a7\u00ac\u00f6\u00e3\u00c4\u00c1\u0013\u0083\u00c5\u00c3\u00a5Mh\u00a3\u0098!\u00ea\u0000\u00ac\u00bb%\u001a\u00f5\u00fe\u00cf\u0003K\u00c1\u00ccev\u0083".length();
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
                    var4_4 = "\u00c4\u00c1\u00c1l\u0098\u0011\u0015\u0093\u0093S\u00f5e>\u00e6\u00e4@";
                    var5_5 = "\u00c4\u00c1\u00c1l\u0098\u0011\u0015\u0093\u0093S\u00f5e>\u00e6\u00e4@".length();
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
        hq_2.l = var6_2;
        hq_2.m = new Integer[7];
    }

    private static int c(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x156C;
        if (m[n11] == null) {
            hq_2.m[n11] = (int)(l[n11] ^ l2);
        }
        return m[n11];
    }
}

