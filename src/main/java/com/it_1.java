/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nv_2;
import com.ph_0;
import com.zzzzd4BeanInfo;
import java.util.Map;

/*
 * Renamed from com.iT
 */
class it_1 {
    static int s;
    static int w;
    static int S;
    private final ph_0[] c;
    private final String z;
    private final zzzzd4BeanInfo W;
    private final boolean Y;
    private Map O;
    private int H;
    private final boolean Z;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Exception decompiling
     */
    public it_1(ph_0[] var1_1, zzzzd4BeanInfo var2_2, String var3_3, boolean var4_4, boolean var5_5) {
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

    public int z(String string) {
        Integer n10 = (Integer)this.O.get(string);
        String string2 = nv_2.o();
        Integer n11 = n10;
        if (string2 != null) {
            if (n11 == null) {
                this.O.put(string, this.H++);
            }
            n11 = n10 = (Integer)this.O.get(string);
        }
        return n11;
    }

    public int G(String string, int n10) {
        Integer n11 = (Integer)this.O.get(string);
        String string2 = nv_2.o();
        Integer n12 = n11;
        if (string2 != null) {
            if (n12 == null) {
                this.O.put(string, this.H);
                this.H += n10;
            }
            n12 = n11 = (Integer)this.O.get(string);
        }
        return n12;
    }

    public int H(String string) {
        int n10;
        block4: {
            int n11 = -1;
            int n12 = 0;
            String string2 = nv_2.o();
            int n13 = this.c.length;
            while (n12 < n13) {
                ph_0 ph_02 = this.c[n12];
                if (string2 != null) {
                    n10 = ph_02.I.equals(string) ? 1 : 0;
                    if (string2 == null) break block4;
                    if (n10 != 0) {
                        n11 = n12;
                        if (string2 != null) break;
                    }
                    ++n12;
                }
                if (string2 != null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    static boolean Z(it_1 it_12) {
        return it_12.Y;
    }

    static int G(it_1 it_12) {
        return it_12.H;
    }

    static boolean I(it_1 it_12) {
        return it_12.Z;
    }

    static String D(it_1 it_12) {
        return it_12.z;
    }

    static zzzzd4BeanInfo c(it_1 it_12) {
        return it_12.W;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2921285818936924334L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00d3R\u0099\u001aT\u0005O6\u00bf\u0001\u00a3\u00ach\u00cf\f\u00d1";
                var5_4 = "\u00d3R\u0099\u001aT\u0005O6\u00bf\u0001\u00a3\u00ach\u00cf\f\u00d1".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00b10\u00cc\u00ee!Tc\u00b44\u00db\u0086\u00f03_l\u00ca";
                    var5_4 = "\u00b10\u00cc\u00ee!Tc\u00b44\u00db\u0086\u00f03_l\u00ca".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        it_1.a = var6_1;
        it_1.b = new Integer[4];
        it_1.s = it_1.a(14259, 5612501680661354398L);
        it_1.w = it_1.a(5197, 8508222112106837091L);
        it_1.S = it_1.a(6973, 5060763141614041874L);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x602D;
        if (b[n11] == null) {
            it_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

