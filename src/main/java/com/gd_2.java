/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.gy_2;
import com.iw_2;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/*
 * Renamed from com.gd
 */
public class gd_2
extends gy_2 {
    private float S = 0.0f;
    private float p = 0.0f;
    private float l;
    private float f;
    private float B;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public gd_2() {
        this.Y(0);
    }

    public void I(float f10) {
        this.p = f10;
    }

    public float z() {
        return this.p;
    }

    public void M(float f10) {
        this.S = f10;
    }

    public float p() {
        return this.S;
    }

    public void L(float f10) {
        this.B = f10;
    }

    public float E() {
        return this.B;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        Object object;
        int n10 = bufferedImage.getWidth();
        String[] stringArray = W5.q();
        int n11 = bufferedImage.getHeight();
        this.l = bufferedImage.getWidth();
        this.f = bufferedImage.getHeight();
        int n12 = bufferedImage.getType();
        this.U = new Rectangle(0, 0, n10, n11);
        this.r = new Rectangle(0, 0, n10, n11);
        this.T(this.r);
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                object = bufferedImage.getColorModel();
                bufferedImage2 = new BufferedImage((ColorModel)object, ((ColorModel)object).createCompatibleWritableRaster(this.r.width, this.r.height), ((ColorModel)object).isAlphaPremultiplied(), null);
            }
            bufferedImage3 = bufferedImage2;
        }
        object = bufferedImage3.getRaster();
        int[] nArray = this.l(bufferedImage, 0, 0, n10, n11, null);
        int n13 = this.P;
        if (stringArray != null) {
            if (n13 == 0) {
                return this.l(bufferedImage2, n10, n11, nArray, this.r);
            }
            n13 = n10;
        }
        int n14 = n13;
        int n15 = n11;
        int n16 = n10 - 1;
        int n17 = n11 - 1;
        int n18 = this.r.width;
        int n19 = this.r.height;
        boolean bl = false;
        int[] nArray2 = new int[n18];
        int n20 = this.r.x;
        int n21 = this.r.y;
        float[] fArray = new float[4];
        int n22 = 0;
        block0: while (true) {
            int n23 = n22;
            block1: while (n23 < n19) {
                for (int i2 = 0; i2 < n18; ++i2) {
                    int n24;
                    block17: {
                        block16: {
                            int n25;
                            int n26;
                            int n27;
                            int n28;
                            float f10;
                            float f11;
                            block15: {
                                int n29;
                                int n30;
                                int n31;
                                block13: {
                                    block14: {
                                        this.h(n20 + i2, n21 + n22, fArray);
                                        n31 = (int)Math.floor(fArray[0]);
                                        n30 = (int)Math.floor(fArray[1]);
                                        f11 = fArray[0] - (float)n31;
                                        f10 = fArray[1] - (float)n30;
                                        n23 = n31;
                                        if (stringArray == null) continue block1;
                                        if (stringArray == null) break block13;
                                        if (n23 < 0) break block14;
                                        n29 = n31;
                                        if (stringArray == null) break block13;
                                        if (n29 >= n16) break block14;
                                        n29 = n30;
                                        if (stringArray == null) break block13;
                                        if (n29 < 0) break block14;
                                        n29 = n30;
                                        if (stringArray == null) break block13;
                                        if (n29 >= n17) break block14;
                                        n24 = n14 * n30 + n31;
                                        n28 = nArray[n24];
                                        n27 = nArray[n24 + 1];
                                        n26 = nArray[n24 + n14];
                                        n25 = nArray[n24 + n14 + 1];
                                        if (stringArray != null) break block15;
                                    }
                                    n29 = this.t(nArray, n31, n30, n14, n15);
                                }
                                n28 = n29;
                                n27 = this.t(nArray, n31 + 1, n30, n14, n15);
                                n26 = this.t(nArray, n31, n30 + 1, n14, n15);
                                n25 = this.t(nArray, n31 + 1, n30 + 1, n14, n15);
                            }
                            n24 = NM.O(f11, f10, n28, n27, n26, n25);
                            int n32 = n24 >> gd_2.b(11332, 3529673341508132254L) & gd_2.b(3608, 1158789635315351491L);
                            int n33 = n24 >> gd_2.b(27974, 3520364395024047263L) & gd_2.b(27559, 1024126469707192955L);
                            int n34 = n24 & gd_2.b(27559, 1024126469707192955L);
                            float f12 = fArray[2];
                            n32 = (int)((float)n32 * f12);
                            n33 = (int)((float)n33 * f12);
                            n34 = (int)((float)n34 * f12);
                            n24 = n24 & gd_2.b(29278, 2501731748898882433L) | n32 << gd_2.b(18267, 4779584971666126470L) | n33 << gd_2.b(17140, 1265389466498396970L) | n34;
                            if (stringArray == null) break block16;
                            if (fArray[3] == 0.0f) break block17;
                            nArray2[i2] = iw_2.P(n24, nArray[n14 * n22 + i2], 1);
                        }
                        if (stringArray != null) continue;
                    }
                    nArray2[i2] = n24;
                    if (stringArray != null) continue;
                }
                this.E(bufferedImage2, 0, n22, this.r.width, 1, nArray2);
                ++n22;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return bufferedImage2;
    }

    private final int t(int[] nArray, int n10, int n11, int n12, int n13) {
        int n14;
        block10: {
            block11: {
                int n15;
                String[] stringArray;
                block8: {
                    block9: {
                        stringArray = W5.q();
                        n15 = n10;
                        if (stringArray == null) break block8;
                        if (n15 < 0) break block9;
                        n15 = n10;
                        if (stringArray == null) break block8;
                        if (n15 >= n12) break block9;
                        n15 = n11;
                        if (stringArray == null) break block8;
                        if (n15 < 0) break block9;
                        n14 = n11;
                        if (stringArray == null) break block10;
                        if (n14 < n13) break block11;
                    }
                    n15 = this.t;
                }
                if (stringArray != null) {
                    switch (n15) {
                        default: {
                            return 0;
                        }
                        case 2: {
                            return nArray[NM.r(n11, n13) * n12 + NM.r(n10, n12)];
                        }
                        case 1: 
                    }
                    n15 = nArray[NM.L(n11, 0, n13 - 1) * n12 + NM.L(n10, 0, n12 - 1)];
                }
                return n15;
            }
            n14 = nArray[n11 * n12 + n10];
        }
        return n14;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void h(int var1_1, int var2_2, float[] var3_3) {
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
                v0 = "4 \u00183\u0012\u0007-_\n\u001e5\u0011[w^".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 120;
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
                                v9 = 8;
                                break;
                            }
                            case 1: {
                                v9 = 49;
                                break;
                            }
                            case 2: {
                                v9 = 19;
                                break;
                            }
                            case 3: {
                                v9 = 63;
                                break;
                            }
                            case 4: {
                                v9 = 5;
                                break;
                            }
                            case 5: {
                                v9 = 13;
                                break;
                            }
                            default: {
                                v9 = 33;
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
                gd_2.a = new String(v10).intern();
                var0_1 = 1260000207302933890L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00d8\u00d9\u008c\u00fd\u00e2Z\u00fe\u0003\u00d7\u0001l\u000f\u00b0\u001d\u00ce\u00a0\u00bb\u001d_\u00e4\u001c\u00c1\u00cb\u0014t\u0015\u0018\u00a0Z\u00cdg\u0006\u00f4\u009cK\u00f9\u00e3U\u0082\u00be";
                var5_5 = "\u00d8\u00d9\u008c\u00fd\u00e2Z\u00fe\u0003\u00d7\u0001l\u000f\u00b0\u001d\u00ce\u00a0\u00bb\u001d_\u00e4\u001c\u00c1\u00cb\u0014t\u0015\u0018\u00a0Z\u00cdg\u0006\u00f4\u009cK\u00f9\u00e3U\u0082\u00be".length();
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
                    var4_4 = "\u0016\u00c3\u0086\u001c\u00b8\u00f7\u00a0\fk\u00bd\u00fa0\u00b8b\u00e1\u0015";
                    var5_5 = "\u0016\u00c3\u0086\u001c\u00b8\u00f7\u00a0\fk\u00bd\u00fa0\u00b8b\u00e1\u0015".length();
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
        gd_2.b = var6_2;
        gd_2.c = new Integer[7];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x31DF;
        if (c[n11] == null) {
            gd_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

