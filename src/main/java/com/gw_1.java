/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.gW
 */
public class gw_1
extends gt_1 {
    private static final int[] T;
    private int[] v;
    private int D = gw_1.a(27645, 8361874596275343796L);
    private boolean Q = true;
    private boolean f = true;
    private int j = gw_1.a(29719, 5395795144619904592L);
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public gw_1() {
        this.U(T);
    }

    public void A(boolean bl) {
        this.Q = bl;
    }

    public boolean b() {
        return this.Q;
    }

    public void y(boolean bl) {
        this.f = bl;
    }

    public boolean F() {
        return this.f;
    }

    public void U(int[] nArray) {
        this.v = nArray;
        this.D = 0;
        String[] stringArray = W5.q();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            this.D += nArray[i2];
            if (stringArray != null) continue;
        }
    }

    public int[] B() {
        return this.v;
    }

    public void q(int n10) {
        this.j = n10;
    }

    public int n() {
        return this.j;
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
                v0 = "G\u0018{\u007f\u001aeo@\u001eqv\u001de)k\u00197T\u0001b(a\u00059>F".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 90;
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
                                v9 = 94;
                                break;
                            }
                            case 1: {
                                v9 = 45;
                                break;
                            }
                            case 2: {
                                v9 = 77;
                                break;
                            }
                            case 3: {
                                v9 = 74;
                                break;
                            }
                            case 4: {
                                v9 = 50;
                                break;
                            }
                            case 5: {
                                v9 = 76;
                                break;
                            }
                            default: {
                                v9 = 26;
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
                gw_1.a = new String(v10).intern();
                var0_1 = 2480984682911172291L;
                var6_2 = new long[15];
                var3_3 = 0;
                var4_4 = "\u00d6\u0010\u00da\u00f3\u0019\u0095\u00f4e:\u0097\u00e6\u00e9KM/\u0086\u00f8\u00e0\u00e1bL\u00c6\u00abf\u009a\u00c6\u0092\u008f\u00db{\u00d4\u00cdJ\u00ed:TD\rU\u0088\u0007\u000f\t1Zha\u00cd\u001d\u00ab \u000fC?\u00e8\u009eo@\u00d5\b\u0015\u00c3\u00c8\u0095\u00e0\u0093\u008f\u00b7\u00f6\u00c1\u00cf\u00c7\u0091\u00d6W\u00f1\u00f9A\u00d7g\u00be\u00fd,\u00dbJ\u00e0L\u00e4P\u00fclTE;\u0014j\u00a4\u00e4\u000eV\u0084\u0095{h";
                var5_5 = "\u00d6\u0010\u00da\u00f3\u0019\u0095\u00f4e:\u0097\u00e6\u00e9KM/\u0086\u00f8\u00e0\u00e1bL\u00c6\u00abf\u009a\u00c6\u0092\u008f\u00db{\u00d4\u00cdJ\u00ed:TD\rU\u0088\u0007\u000f\t1Zha\u00cd\u001d\u00ab \u000fC?\u00e8\u009eo@\u00d5\b\u0015\u00c3\u00c8\u0095\u00e0\u0093\u008f\u00b7\u00f6\u00c1\u00cf\u00c7\u0091\u00d6W\u00f1\u00f9A\u00d7g\u00be\u00fd,\u00dbJ\u00e0L\u00e4P\u00fclTE;\u0014j\u00a4\u00e4\u000eV\u0084\u0095{h".length();
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
                    var4_4 = "\u00f9\u0017=S\u009cF\u00a3q\u00bd\nz\u00e6\u00da1\u00b4\u00cb";
                    var5_5 = "\u00f9\u0017=S\u009cF\u00a3q\u00bd\nz\u00e6\u00da1\u00b4\u00cb".length();
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
        gw_1.b = var6_2;
        gw_1.c = new Integer[15];
        v16 = new int[gw_1.a(26886, 2723155418470044482L)];
        v16[0] = 0;
        v16[1] = 0;
        v16[2] = 0;
        v16[3] = 0;
        v16[4] = 0;
        v16[5] = gw_1.a(18657, 3245755286632198817L);
        v16[gw_1.a((int)2112, (long)4143465882010169870L)] = 3;
        v16[gw_1.a((int)6112, (long)2805580857280933282L)] = 5;
        v16[gw_1.a((int)23875, (long)6508546602740967174L)] = 1;
        gw_1.T = v16;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3A40;
        if (c[n11] == null) {
            gw_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

