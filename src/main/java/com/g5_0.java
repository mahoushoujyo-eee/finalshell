/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.g5
 */
public class g5_0
extends gt_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    private short r(short s2, short s3, short s4) {
        short s5;
        block10: {
            short s6;
            block9: {
                String[] stringArray = W5.q();
                s5 = s2;
                s6 = s3;
                if (stringArray != null) {
                    if (s5 < s6) {
                        s2 = (short)(s2 + 1);
                    }
                    s5 = s2;
                    s6 = s4;
                }
                if (stringArray != null) {
                    if (s5 < s6) {
                        s2 = (short)(s2 + 1);
                    }
                    s5 = s2;
                    s6 = s3;
                }
                if (stringArray == null) break block9;
                if (s5 > s6) {
                    s2 = (short)(s2 - 1);
                }
                s5 = s2;
                if (stringArray == null) break block10;
                s6 = s4;
            }
            if (s5 > s6) {
                s2 = (short)(s2 - 1);
            }
            s5 = s2;
        }
        return s5;
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
                v0 = "\u007f{\u0012\u001a<}<Ng\u0002\u000bxU<\u00139I".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 31;
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
                                v9 = 34;
                                break;
                            }
                            case 1: {
                                v9 = 8;
                                break;
                            }
                            case 2: {
                                v9 = 120;
                                break;
                            }
                            case 3: {
                                v9 = 119;
                                break;
                            }
                            case 4: {
                                v9 = 12;
                                break;
                            }
                            case 5: {
                                v9 = 38;
                                break;
                            }
                            default: {
                                v9 = 70;
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
                g5_0.a = new String(v10).intern();
                var0_1 = 2994476063676801050L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00b8+\u00b4\u0000\u00a2\u00c4\u00e2\b\u00ab5\u00e5u:M\u0019\u00fd,k`m\u00d1z>\u00b8\u0002\u000b]\u00ee\u00c4\u0097\"ke\u00fc\u000f\u00a9\u00e0\u00c0\u00b9\u0019";
                var5_5 = "\u00b8+\u00b4\u0000\u00a2\u00c4\u00e2\b\u00ab5\u00e5u:M\u0019\u00fd,k`m\u00d1z>\u00b8\u0002\u000b]\u00ee\u00c4\u0097\"ke\u00fc\u000f\u00a9\u00e0\u00c0\u00b9\u0019".length();
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
                    var4_4 = "\u00be\u0015@\u0092\u00fc\u0092\u00a5GK\u009e\u00d2\u0086\u0091\u00b1\u008a%";
                    var5_5 = "\u00be\u0015@\u0092\u00fc\u0092\u00a5GK\u009e\u00d2\u0086\u0091\u00b1\u008a%".length();
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
        g5_0.b = var6_2;
        g5_0.c = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7443;
        if (c[n11] == null) {
            g5_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

