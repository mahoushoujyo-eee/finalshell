/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hg_1;
import com.iw_2;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

/*
 * Renamed from com.hX
 */
public class hx_1
extends hg_1 {
    protected float e;
    protected Kernel V;
    private static final String b;
    private static final long[] j;
    private static final Integer[] k;

    public hx_1() {
        this(2.0f);
    }

    public hx_1(float f10) {
        this.t(f10);
    }

    public void t(float f10) {
        this.e = f10;
        this.V = hx_1.n(f10);
    }

    public float C() {
        return this.e;
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

    public static void V(Kernel kernel, int[] nArray, int[] nArray2, int n10, int n11, boolean bl, boolean bl2, boolean n12, int n13) {
        float[] fArray = kernel.getKernelData(null);
        int n14 = kernel.getWidth();
        String[] stringArray = W5.q();
        int n15 = n14 / 2;
        int n16 = 0;
        block0: while (true) {
            int n17 = n16;
            block1: while (n17 < n11) {
                int n18 = n16;
                int n19 = n16 * n10;
                for (int i2 = 0; i2 < n10; ++i2) {
                    int n20;
                    int n21;
                    int n22;
                    int n23;
                    float f10;
                    float f11;
                    float f12;
                    float f13;
                    block26: {
                        block27: {
                            block15: {
                                f13 = 0.0f;
                                f12 = 0.0f;
                                f11 = 0.0f;
                                f10 = 0.0f;
                                int n24 = n15;
                                n17 = -n15;
                                if (stringArray == null) continue block1;
                                n23 = n17;
                                while (n23 <= n15) {
                                    block16: {
                                        block17: {
                                            int n25;
                                            float f14;
                                            block23: {
                                                block22: {
                                                    int n26;
                                                    block24: {
                                                        block25: {
                                                            block18: {
                                                                block19: {
                                                                    int n27;
                                                                    block20: {
                                                                        block21: {
                                                                            f14 = fArray[n24 + n23];
                                                                            if (stringArray == null) break block16;
                                                                            float f15 = f14 - 0.0f;
                                                                            n22 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                            if (stringArray == null) break block15;
                                                                            if (n22 == 0) break block17;
                                                                            n25 = n21 = i2 + n23;
                                                                            if (stringArray == null) break block18;
                                                                            if (n25 >= 0) break block19;
                                                                            int n27 = n13;
                                                                            n27 = Y;
                                                                            if (stringArray == null) break block20;
                                                                            if (n25 != n27) break block21;
                                                                            n21 = 0;
                                                                            if (stringArray != null) break block22;
                                                                        }
                                                                        n25 = n13;
                                                                        if (stringArray == null) break block23;
                                                                        n27 = M;
                                                                    }
                                                                    if (n25 != n27) break block22;
                                                                    n21 = (i2 + n10) % n10;
                                                                    if (stringArray != null) break block22;
                                                                }
                                                                n25 = n21;
                                                            }
                                                            if (stringArray == null) break block23;
                                                            if (n25 < n10) break block22;
                                                            int n26 = n13;
                                                            n26 = Y;
                                                            if (stringArray == null) break block24;
                                                            if (n25 != n26) break block25;
                                                            n21 = n10 - 1;
                                                            if (stringArray != null) break block22;
                                                        }
                                                        n25 = n13;
                                                        if (stringArray == null) break block23;
                                                        n26 = M;
                                                    }
                                                    if (n25 == n26) {
                                                        n21 = (i2 + n10) % n10;
                                                    }
                                                }
                                                n25 = nArray[n19 + n21];
                                            }
                                            n20 = n25;
                                            int n28 = n20 >> hx_1.b(32765, 1288259949857954669L) & hx_1.b(11983, 1525439035383056987L);
                                            int n29 = n20 >> hx_1.b(14682, 6214351987622452687L) & hx_1.b(29701, 417891550093791380L);
                                            int n30 = n20 >> hx_1.b(19886, 5877941911581387069L) & hx_1.b(29701, 417891550093791380L);
                                            int n31 = n20 & hx_1.b(29701, 417891550093791380L);
                                            if (stringArray != null) {
                                                if (bl2) {
                                                    float f16 = (float)n28 * 0.003921569f;
                                                    n29 = (int)((float)n29 * f16);
                                                    n30 = (int)((float)n30 * f16);
                                                    n31 = (int)((float)n31 * f16);
                                                }
                                                f10 += f14 * (float)n28;
                                                f13 += f14 * (float)n29;
                                                f12 += f14 * (float)n30;
                                            }
                                            f11 += f14 * (float)n31;
                                        }
                                        ++n23;
                                    }
                                    if (stringArray != null) continue;
                                }
                                n22 = n12;
                            }
                            if (stringArray == null) break block26;
                            if (n22 == 0) break block27;
                            float f16 = f10 - 0.0f;
                            n22 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                            if (stringArray == null) break block26;
                            if (n22 == 0) break block27;
                            float f17 = f10 - 255.0f;
                            n22 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                            if (stringArray == null) break block26;
                            if (n22 != 0) {
                                float f19 = 255.0f / f10;
                                f13 *= f19;
                                f12 *= f19;
                                f11 *= f19;
                            }
                        }
                        n22 = bl ? 1 : 0;
                    }
                    if (stringArray != null) {
                        n22 = n22 != 0 ? iw_2.e((int)((double)f10 + 0.5)) : hx_1.b(29701, 417891550093791380L);
                    }
                    n23 = n22;
                    int n32 = iw_2.e((int)((double)f13 + 0.5));
                    n21 = iw_2.e((int)((double)f12 + 0.5));
                    n20 = iw_2.e((int)((double)f11 + 0.5));
                    nArray2[n18] = n23 << hx_1.b(16216, 8868121051998493642L) | n32 << hx_1.b(26936, 3282374628055731631L) | n21 << hx_1.b(16624, 1505148010116375654L) | n20;
                    n18 += n11;
                    if (stringArray != null) continue;
                }
                ++n16;
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    public static Kernel n(float f10) {
        int n10;
        float f11;
        String[] stringArray;
        float[] fArray;
        int n11;
        block4: {
            int n12;
            int n13 = (int)Math.ceil(f10);
            n11 = n13 * 2 + 1;
            fArray = new float[n11];
            float f12 = f10 / 3.0f;
            float f13 = 2.0f * f12 * f12;
            float f14 = (float)Math.PI * 2 * f12;
            stringArray = W5.q();
            float f15 = (float)Math.sqrt(f14);
            float f16 = f10 * f10;
            f11 = 0.0f;
            int n14 = 0;
            for (n10 = -n13; n10 <= n13; ++n10) {
                block7: {
                    float f17;
                    block6: {
                        block5: {
                            f17 = n10 * n10;
                            if (stringArray == null) break block5;
                            n12 = f17 == f16 ? 0 : (f17 > f16 ? 1 : -1);
                            if (stringArray == null) break block4;
                            if (n12 <= 0) break block6;
                            fArray[n14] = 0.0f;
                        }
                        if (stringArray != null) break block7;
                    }
                    fArray[n14] = (float)Math.exp(-f17 / f13) / f15;
                }
                f11 += fArray[n14];
                ++n14;
                if (stringArray != null) continue;
            }
            n12 = n10 = 0;
        }
        while (n10 < n11) {
            int n15 = n10++;
            fArray[n15] = fArray[n15] / f11;
            if (stringArray != null) continue;
        }
        return new Kernel(n11, 1, fArray);
    }

    @Override
    public String toString() {
        return b;
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
                v0 = "Q1S\n.x:f.U\u0011`Q{Q1S\n/\u0011u".toCharArray();
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
                                v9 = 21;
                                break;
                            }
                            case 1: {
                                v9 = 91;
                                break;
                            }
                            case 2: {
                                v9 = 32;
                                break;
                            }
                            case 3: {
                                v9 = 126;
                                break;
                            }
                            case 4: {
                                v9 = 7;
                                break;
                            }
                            case 5: {
                                v9 = 57;
                                break;
                            }
                            default: {
                                v9 = 93;
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
                hx_1.b = new String(v10).intern();
                var0_1 = 4322380899049913772L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "'\u008e\u0013\u00bc\u00fc\u00b7 s:UA\u000f\u00a1H7\b\u00a3B\u00a5{\u008a\u00c9\u00f0\u0013A!\u00e2\u0091*\u0092\u00d9\u00c2Z\u009a\u00b0<B7\u00ed\u00c7\u0080\u0095\u00f8\u00a9\u0086h\u00e6\u00d9";
                var5_5 = "'\u008e\u0013\u00bc\u00fc\u00b7 s:UA\u000f\u00a1H7\b\u00a3B\u00a5{\u008a\u00c9\u00f0\u0013A!\u00e2\u0091*\u0092\u00d9\u00c2Z\u009a\u00b0<B7\u00ed\u00c7\u0080\u0095\u00f8\u00a9\u0086h\u00e6\u00d9".length();
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
                    var4_4 = "J\u00fe\u007f)u\u00fd\u00d4\u0099';Dh^E&~";
                    var5_5 = "J\u00fe\u007f)u\u00fd\u00d4\u0099';Dh^E&~".length();
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
        hx_1.j = var6_2;
        hx_1.k = new Integer[8];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2495;
        if (k[n11] == null) {
            hx_1.k[n11] = (int)(j[n11] ^ l2);
        }
        return k[n11];
    }
}

