/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aO;
import com.fm_0;
import com.pt_0;
import com.uE;
import com.xg_0;
import java.awt.Component;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/*
 * Renamed from com.as
 */
public class as_0
extends aO {
    public static List J;
    public static List O;
    protected int t = -1;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    @Override
    public void G() {
        var1_1 = uE.Z();
        v0 = this;
        if (var1_1) ** GOTO lbl8
        if (v0.A == pt_0.checked) {
            v1 = this.t + 1;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.t - 1;
        }
        this.t = v1;
    }

    @Override
    public void F() {
        this.t = this.D == pt_0.checked ? 3 : -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean B() {
        as_0 as_02;
        int n10;
        boolean bl;
        block5: {
            pt_0 pt_02;
            pt_0 pt_03;
            block4: {
                bl = uE.o();
                pt_03 = this.A;
                pt_02 = pt_0.unchecked;
                if (!bl) break block4;
                if (pt_03 == pt_02) {
                    n10 = this.t;
                    if (!bl) return n10 != 0;
                    if (n10 == -1) return 1 != 0;
                }
                as_02 = this;
                if (!bl) break block5;
                pt_03 = as_02.A;
                pt_02 = pt_0.checked;
            }
            if (pt_03 != pt_02) return 0 != 0;
            as_02 = this;
        }
        n10 = as_02.t;
        if (!bl) return n10 != 0;
        if (n10 != 3) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void l() {
        this.D = this.A;
        this.A = null;
    }

    @Override
    public int L() {
        return as_0.a(14935, 3337117774170216550L);
    }

    @Override
    public int u() {
        return as_0.a(14935, 3337117774170216550L);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void O(Component var1_1, Graphics2D var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
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

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block17: {
                block16: {
                    var8 = new String[3];
                    var12_1 = 0;
                    var11_2 = "c\u0014l\u000e\u0007$\u0007m\u0007Rg<\u001b\u001a\u0001`*I-<&&m\u0011\u000f,6>\u0005`\u0005D,q.\fg\nJf";
                    var13_3 = "c\u0014l\u000e\u0007$\u0007m\u0007Rg<\u001b\u001a\u0001`*I-<&&m\u0011\u000f,6>\u0005`\u0005D,q.\fg\nJf".length();
                    var10_4 = 4;
                    var9_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var8[var12_1++] = new String(v0).intern();
                        if ((var9_5 += var10_4) < var13_3) {
                            var10_4 = var11_2.charAt(var9_5);
                            ** continue;
                        }
                        break block16;
                        break;
                    }
                    v1 = ++var9_5;
                    v2 = var11_2.substring(v1, v1 + var10_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 39;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 106;
                                    break;
                                }
                                case 1: {
                                    v11 = 67;
                                    break;
                                }
                                case 2: {
                                    v11 = 37;
                                    break;
                                }
                                case 3: {
                                    v11 = 78;
                                    break;
                                }
                                case 4: {
                                    v11 = 6;
                                    break;
                                }
                                case 5: {
                                    v11 = 111;
                                    break;
                                }
                                default: {
                                    v11 = 120;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                var0_7 = 7229808570086258421L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u0000z\u008b\u000f\u00d2\u001e:\u00c5\u009e\u0005\u00bc\u001a\u0091\u001e.\u0083\u0011\u00f1\u0005\u000e\u0085\u0093\u00d2\u0093";
                var5_11 = "\u0000z\u008b\u000f\u00d2\u001e:\u00c5\u009e\u0005\u00bc\u001a\u0091\u001e.\u0083\u0011\u00f1\u0005\u000e\u0085\u0093\u00d2\u0093".length();
                var2_12 = 0;
                while (true) {
                    break block17;
                    break;
                }
lbl83:
                // 1 sources

                while (true) {
                    var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block18;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v12 = var3_9++;
            ** while (true)
        }
        as_0.a = var6_8;
        as_0.b = new Integer[3];
        as_0.J = new ArrayList<E>();
        as_0.O = new ArrayList<E>();
        for (var15_14 = 1; var15_14 <= 4; ++var15_14) {
            var16_15 = new ImageIcon(fm_0.class.getResource(var8[1] + var15_14 + var8[0]));
            as_0.J.add(var16_15);
            as_0.O.add(xg_0.H(var8[2] + var15_14, var16_15));
        }
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6230;
        if (b[n11] == null) {
            as_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

