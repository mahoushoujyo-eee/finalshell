/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.yX
 */
public class yx_1
extends gt_1 {
    protected static final int[] V;
    private int o = yx_1.a(32109, 688847293996231935L);
    private boolean k;
    private int B = yx_1.a(22191, 3198772515552806710L);
    private boolean U = true;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void E(int n10) {
        this.B = Math.min(Math.max(n10, yx_1.a(9193, 7279093812482650745L)), yx_1.a(28473, 2410304285436214946L));
    }

    public int Q() {
        return this.B;
    }

    public void t(boolean bl) {
        this.k = bl;
    }

    public boolean c() {
        return this.k;
    }

    public void Z(boolean bl) {
        this.U = bl;
    }

    public boolean z() {
        return this.U;
    }

    /*
     * Exception decompiling
     */
    public void Q(int[] var1_1, int[] var2_2, int var3_3, int var4_4, int var5_5, boolean var6_6, boolean var7_7) {
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
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int[] nArray2 = new int[n10 * n11];
        this.Q(nArray, nArray2, n10, n11, this.B, this.k, this.U);
        return nArray2;
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
                v0 = "\u0018\u0019\u0006:\u0007\u0007\u001b\n\u0003\u000b;\u0001\u001dN>XD{".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 25;
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
                                v9 = 66;
                                break;
                            }
                            case 1: {
                                v9 = 111;
                                break;
                            }
                            case 2: {
                                v9 = 115;
                                break;
                            }
                            case 3: {
                                v9 = 76;
                                break;
                            }
                            case 4: {
                                v9 = 108;
                                break;
                            }
                            case 5: {
                                v9 = 109;
                                break;
                            }
                            default: {
                                v9 = 45;
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
                yx_1.a = new String(v10).intern();
                var0_1 = 7134814195777123248L;
                var6_2 = new long[12];
                var3_3 = 0;
                var4_4 = "\u00b2\u00f8+\u001aI\u00f0@\u00c0\u0089\u00bc<WZ\u0097\u00df_c\t\u00f1>*\u00fe(\u00e3\u00fdi\u001e\u00dc\u001ep\u0001\u00c1\u00c64]\u0083G%\u00d9\u00ceJ\u00f97\u0000\u00ea\u00bd\u00a1\n\u00e3\u00a1\u0087\u00d5\u0012sXU\u0019m\u00ea\u00f0\u009dB\u00f3\u00eb\u00f5\"\u00e42\u00a3\u00b3L\u0012#\u0015|\u0085\u00f6\u008fqr";
                var5_5 = "\u00b2\u00f8+\u001aI\u00f0@\u00c0\u0089\u00bc<WZ\u0097\u00df_c\t\u00f1>*\u00fe(\u00e3\u00fdi\u001e\u00dc\u001ep\u0001\u00c1\u00c64]\u0083G%\u00d9\u00ceJ\u00f97\u0000\u00ea\u00bd\u00a1\n\u00e3\u00a1\u0087\u00d5\u0012sXU\u0019m\u00ea\u00f0\u009dB\u00f3\u00eb\u00f5\"\u00e42\u00a3\u00b3L\u0012#\u0015|\u0085\u00f6\u008fqr".length();
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
                    var4_4 = "_\u00c7z\u00d7?{u\u0086T\u00b4\u0088\u00f3\u00fa\u00d2x\u00de";
                    var5_5 = "_\u00c7z\u00d7?{u\u0086T\u00b4\u0088\u00f3\u00fa\u00d2x\u00de".length();
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
        yx_1.b = var6_2;
        yx_1.c = new Integer[12];
        v16 = new int[yx_1.a(21329, 4937614986755883723L)];
        v16[0] = 0;
        v16[1] = 0;
        v16[2] = 0;
        v16[3] = 0;
        v16[4] = 0;
        v16[5] = yx_1.a(20936, 7770652602566918236L);
        v16[yx_1.a((int)23280, (long)1470117597472607080L)] = 3;
        v16[yx_1.a((int)31351, (long)4582434549338139618L)] = 5;
        v16[yx_1.a((int)9193, (long)7279093812482650745L)] = 1;
        yx_1.V = v16;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1193;
        if (c[n11] == null) {
            yx_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

