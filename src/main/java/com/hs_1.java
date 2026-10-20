/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hx_1;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hS
 */
public class hs_1
extends hx_1 {
    private float S = 0.5f;
    private static final String c;
    private static final long[] l;
    private static final Integer[] m;

    public hs_1() {
        this.e = 2.0f;
    }

    public void c(float f10) {
        this.S = f10;
    }

    public float w() {
        return this.S;
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
                v0 = "s\u0016/I\u007fx\u0004^\rt\u0015~".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 60;
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
                                v9 = 13;
                                break;
                            }
                            case 1: {
                                v9 = 70;
                                break;
                            }
                            case 2: {
                                v9 = 102;
                                break;
                            }
                            case 3: {
                                v9 = 7;
                                break;
                            }
                            case 4: {
                                v9 = 108;
                                break;
                            }
                            case 5: {
                                v9 = 3;
                                break;
                            }
                            default: {
                                v9 = 84;
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
                hs_1.c = new String(v10).intern();
                var0_1 = 5306751619391572988L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00a4\u00e7\u009d\u00cda\u00fd\u0000\u0094R\u001c\u00f0m\u007f\u0004\u00bb\u00d7\r\u00ae~yD\u00b0nCvE\u0093\u00f4\u00a2\u008c9\u008c\u00e3%\u00c2R9\u009e((";
                var5_5 = "\u00a4\u00e7\u009d\u00cda\u00fd\u0000\u0094R\u001c\u00f0m\u007f\u0004\u00bb\u00d7\r\u00ae~yD\u00b0nCvE\u0093\u00f4\u00a2\u008c9\u008c\u00e3%\u00c2R9\u009e((".length();
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
                    var4_4 = "\u00fd\u00a26\u008cG\u00d5\u0010t\u00db\u00916\u00b9\u00ac\u0089\u001c\u0086";
                    var5_5 = "\u00fd\u00a26\u008cG\u00d5\u0010t\u00db\u00916\u00b9\u00ac\u0089\u001c\u0086".length();
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
        hs_1.l = var6_2;
        hs_1.m = new Integer[7];
    }

    private static int c(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1AF4;
        if (m[n11] == null) {
            hs_1.m[n11] = (int)(l[n11] ^ l2);
        }
        return m[n11];
    }
}

