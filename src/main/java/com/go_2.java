/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.go
 */
public class go_2
extends gt_1 {
    private float Y = 5.0f;
    private float M = 1.0f;
    private float K = 0.0f;
    private int W = go_2.a(26798, 620179751183434260L);
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void F(float f10) {
        this.Y = f10;
    }

    public float y() {
        return this.Y;
    }

    public void o(float f10) {
        this.M = f10;
    }

    public float U() {
        return this.M;
    }

    public void C(float f10) {
        this.K = f10;
    }

    public float x() {
        return this.K;
    }

    public void V(int n10) {
        this.W = n10;
    }

    public int h() {
        return this.W;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected int[] K(int var1_1, int var2_2, int[] var3_3, Rectangle var4_4) {
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

    public String toString() {
        return a;
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
                v0 = "|L:+:/O\u0000{,)':_]\u0016mi".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 6;
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
                                v9 = 41;
                                break;
                            }
                            case 1: {
                                v9 = 62;
                                break;
                            }
                            case 2: {
                                v9 = 69;
                                break;
                            }
                            case 3: {
                                v9 = 65;
                                break;
                            }
                            case 4: {
                                v9 = 85;
                                break;
                            }
                            case 5: {
                                v9 = 83;
                                break;
                            }
                            default: {
                                v9 = 44;
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
                go_2.a = new String(v10).intern();
                var0_1 = 8833043335492498411L;
                var6_2 = new long[5];
                var3_3 = 0;
                var4_4 = "\u00c2\u00b6i\u00a3`\u0084\u00b1\u00ff2x\u008d\u0018=\u00ee\u00fb\u00b5\u00e85\u00e1\u00da\u00b4Z\u00de\u0095";
                var5_5 = "\u00c2\u00b6i\u00a3`\u0084\u00b1\u00ff2x\u008d\u0018=\u00ee\u00fb\u00b5\u00e85\u00e1\u00da\u00b4Z\u00de\u0095".length();
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
                    var4_4 = "\u00b7\u00b5Z\u00f0\u00b8\u00cfoG\u00c4\u00c1\u00f2\u0085\u00d8mtf";
                    var5_5 = "\u00b7\u00b5Z\u00f0\u00b8\u00cfoG\u00c4\u00c1\u00f2\u0085\u00d8mtf".length();
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
        go_2.b = var6_2;
        go_2.c = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2ABA;
        if (c[n11] == null) {
            go_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

