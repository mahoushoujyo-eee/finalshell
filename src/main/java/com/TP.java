/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Map;
import java.util.WeakHashMap;

public class TP
extends T4 {
    protected boolean v;
    protected boolean e;
    protected boolean u;
    protected boolean z;
    protected int R;
    protected int b;
    protected int K;
    protected int o;
    protected Map s = new WeakHashMap();
    private static final String[] a;
    private static final String[] d;

    public TP() {
        this(false, true, 0, 0);
    }

    public TP(boolean bl, boolean bl2) {
        this(bl, bl2, 0, 0);
    }

    public TP(int n10, int n11) {
        this(false, true, n10, n11);
    }

    public TP(boolean bl, boolean bl2, int n10, int n11) {
        this.v = bl;
        this.e = bl2;
        this.K = n10;
        this.o = n11;
        this.u = false;
        this.z = false;
        this.R = 0;
        this.b = 0;
    }

    public boolean p() {
        return this.v;
    }

    public void Y(boolean bl) {
        this.v = bl;
    }

    public boolean s() {
        return this.e;
    }

    public void F(boolean bl) {
        this.e = bl;
    }

    public boolean q() {
        return this.u;
    }

    public void w(boolean bl) {
        this.u = bl;
    }

    public boolean U() {
        return this.z;
    }

    public void e(boolean bl) {
        this.z = bl;
    }

    public int r() {
        return this.R;
    }

    public void W(int n10) {
        this.R = n10;
    }

    public int i() {
        return this.b;
    }

    public void L(int n10) {
        this.b = n10;
    }

    public int E() {
        return this.K;
    }

    public void t(int n10) {
        this.K = n10;
    }

    public int B() {
        return this.o;
    }

    public void p(int n10) {
        this.o = n10;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void A(Component var1_1, Object var2_2) {
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
    public void F(Component component) {
        this.s.remove(component);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void layoutContainer(Container var1_1) {
        block31: {
            block41: {
                block36: {
                    block37: {
                        block38: {
                            block39: {
                                block40: {
                                    block32: {
                                        block33: {
                                            block34: {
                                                block35: {
                                                    var3_2 = var1_1.getComponentCount();
                                                    var2_3 = T4.O();
                                                    if (var3_2 <= 0) break block31;
                                                    var4_4 = FN.B(var1_1);
                                                    var5_5 = 0;
                                                    var6_6 = 0;
                                                    var7_7 = 0;
                                                    for (var8_8 = 0; var8_8 < var3_2; ++var8_8) {
                                                        var9_10 /* !! */  = var1_1.getComponent(var8_8);
                                                        var10_11 = (Dimension)var4_4.get(var9_10 /* !! */ );
                                                        if (var2_3 == 0) {
                                                            v0 = var7_7;
                                                            if (var2_3 == 0) {
                                                                if (v0 == 0) {
                                                                    v1 = ((String)this.s.get(var9_10 /* !! */ )).equals(TP.a(842, 19320));
                                                                    if (var2_3 == 0) {
                                                                        if (v1 != 0) {
                                                                            var7_7 = 0;
                                                                            if (var2_3 == 0) continue;
                                                                        }
                                                                        var5_5 = Math.max(var5_5, var10_11.width);
                                                                        v1 = var7_7 = 1;
                                                                    }
                                                                    if (var2_3 == 0) continue;
                                                                }
                                                                var6_6 = Math.max(var5_5, var10_11.width);
                                                                v0 = 0;
                                                            }
                                                            var7_7 = v0;
                                                            if (var2_3 == 0) continue;
                                                        }
                                                        break block31;
                                                    }
                                                    var8_9 = var1_1.getSize();
                                                    var9_10 /* !! */  = var1_1.getInsets();
                                                    v2 = this.v;
                                                    if (var2_3 != 0) break block32;
                                                    if (v2 == 0) break block33;
                                                    v2 = this.e;
                                                    if (var2_3 != 0) break block32;
                                                    if (v2 == 0) break block33;
                                                    v3 = var3_2;
                                                    v4 = 1;
                                                    if (var2_3 != 0) break block34;
                                                    if (v3 <= v4) break block35;
                                                    var6_6 = var5_5 = (var8_9.width - var9_10 /* !! */ .left - var9_10 /* !! */ .right - this.K) / 2;
                                                    if (var2_3 == 0) break block36;
                                                }
                                                v3 = var8_9.width - var9_10 /* !! */ .left;
                                                v4 = var9_10 /* !! */ .right;
                                            }
                                            var5_5 = v3 - v4;
                                            if (var2_3 == 0) break block36;
                                        }
                                        v2 = this.v;
                                    }
                                    if (var2_3 != 0) break block37;
                                    if (v2 == 0) break block38;
                                    v5 = var3_2;
                                    v6 = 1;
                                    if (var2_3 != 0) break block39;
                                    if (v5 <= v6) break block40;
                                    var5_5 = var8_9.width - var9_10 /* !! */ .left - var9_10 /* !! */ .right - this.K - var6_6;
                                    if (var2_3 == 0) break block36;
                                }
                                v5 = var8_9.width - var9_10 /* !! */ .left;
                                v6 = var9_10 /* !! */ .right;
                            }
                            var5_5 = v5 - v6;
                            if (var2_3 == 0) break block36;
                        }
                        v2 = var3_2;
                    }
                    if (var2_3 != 0) break block41;
                    if (v2 > 1) {
                        var6_6 = var8_9.width - var9_10 /* !! */ .left - var9_10 /* !! */ .right - this.K - var5_5;
                    }
                }
                v2 = var9_10 /* !! */ .left;
            }
            var10_12 = v2;
            var11_13 = var9_10 /* !! */ .left + var5_5 + this.K;
            var12_14 = var8_9.width - var9_10 /* !! */ .left - var9_10 /* !! */ .right;
            var13_15 = var9_10 /* !! */ .top;
            var7_7 = 0;
            for (var14_16 = 0; var14_16 < var3_2; ++var14_16) {
                block59: {
                    block54: {
                        block57: {
                            block58: {
                                block55: {
                                    block56: {
                                        block52: {
                                            block53: {
                                                block42: {
                                                    block43: {
                                                        block51: {
                                                            block46: {
                                                                block49: {
                                                                    block50: {
                                                                        block47: {
                                                                            block48: {
                                                                                block44: {
                                                                                    block45: {
                                                                                        var15_17 = var1_1.getComponent(var14_16);
                                                                                        var16_18 = (Dimension)var4_4.get(var15_17);
                                                                                        var17_19 = (String)this.s.get(var15_17);
                                                                                        v7 = var7_7;
                                                                                        if (var2_3 != 0) break block42;
                                                                                        if (v7 != 0) break block43;
                                                                                        v8 = var17_19.equals(TP.a(842, 19320));
                                                                                        if (var2_3 == 0) {
                                                                                            if (v8 != 0) {
                                                                                                var18_20 = var16_18.height;
                                                                                                var15_17.setBounds(var10_12, var13_15, var12_14, var18_20);
                                                                                                var13_15 += var18_20 + this.o;
                                                                                                var7_7 = 0;
                                                                                                if (var2_3 == 0) continue;
                                                                                            }
                                                                                            v8 = var3_2;
                                                                                        }
                                                                                        if (var2_3 == 0) {
                                                                                            v8 = v8 > var14_16 + 1 ? ((Dimension)var4_4.get((Object)var1_1.getComponent((int)(var14_16 + 1)))).height : 0;
                                                                                        }
                                                                                        var18_20 = v8;
                                                                                        var19_21 = Math.max(var16_18.height, var18_20);
                                                                                        v9 = this;
                                                                                        if (var2_3 != 0) ** GOTO lbl105
                                                                                        if (v9.u) {
                                                                                            v10 = var13_15;
                                                                                        } else {
                                                                                            v9 = this;
lbl105:
                                                                                            // 2 sources

                                                                                            v10 = v9.m(true, var13_15, var19_21, var16_18.height);
                                                                                        }
                                                                                        var20_22 = v10;
                                                                                        v11 = this.u;
                                                                                        if (var2_3 == 0) {
                                                                                            v11 = v11 != 0 ? var19_21 : var16_18.height;
                                                                                        }
                                                                                        var21_23 = v11;
                                                                                        var22_24 = Math.min(var16_18.width, var5_5);
                                                                                        v12 = var17_19.equals(TP.a(840, -28152));
                                                                                        if (var2_3 != 0) break block44;
                                                                                        if (!v12) break block45;
                                                                                        var15_17.setBounds(var10_12, var20_22, var22_24, var21_23);
                                                                                        if (var2_3 == 0) break block46;
                                                                                    }
                                                                                    v12 = var17_19.equals(TP.a(835, 27657));
                                                                                }
                                                                                if (var2_3 != 0) break block47;
                                                                                if (!v12) break block48;
                                                                                var15_17.setBounds(var10_12 + var5_5 / 2 - var22_24 / 2, var20_22, var22_24, var21_23);
                                                                                if (var2_3 == 0) break block46;
                                                                            }
                                                                            v12 = var17_19.equals(TP.a(834, -19475));
                                                                        }
                                                                        if (var2_3 != 0) break block49;
                                                                        if (!v12) break block50;
                                                                        var15_17.setBounds(var10_12 + var5_5 - var22_24, var20_22, var22_24, var21_23);
                                                                        if (var2_3 == 0) break block46;
                                                                    }
                                                                    v12 = var17_19.equals(TP.a(845, -7978));
                                                                }
                                                                if (var2_3 != 0) break block51;
                                                                if (v12) {
                                                                    var15_17.setBounds(var10_12, var20_22, var5_5, var21_23);
                                                                }
                                                            }
                                                            v12 = true;
                                                        }
                                                        var7_7 = (int)v12;
                                                        if (var2_3 == 0) continue;
                                                    }
                                                    v7 = ((Dimension)var4_4.get((Object)var1_1.getComponent((int)(var14_16 - 1)))).height;
                                                }
                                                var18_20 = v7;
                                                var19_21 = Math.max(var16_18.height, var18_20);
                                                v13 = this;
                                                if (var2_3 != 0) ** GOTO lbl153
                                                if (v13.z) {
                                                    v14 = var13_15;
                                                } else {
                                                    v13 = this;
lbl153:
                                                    // 2 sources

                                                    v14 = v13.m(false, var13_15, var19_21, var16_18.height);
                                                }
                                                var20_22 = v14;
                                                v15 = this.z;
                                                if (var2_3 == 0) {
                                                    v15 = v15 != 0 ? var19_21 : var16_18.height;
                                                }
                                                var21_23 = v15;
                                                var22_24 = Math.min(var16_18.width, var6_6);
                                                v16 = var17_19.equals(TP.a(843, -28574));
                                                if (var2_3 != 0) break block52;
                                                if (!v16) break block53;
                                                var15_17.setBounds(var11_13, var20_22, var22_24, var21_23);
                                                if (var2_3 == 0) break block54;
                                            }
                                            v16 = var17_19.equals(TP.a(847, -7337));
                                        }
                                        if (var2_3 != 0) break block55;
                                        if (!v16) break block56;
                                        var15_17.setBounds(var11_13 + var6_6 / 2 - var22_24 / 2, var20_22, var22_24, var21_23);
                                        if (var2_3 == 0) break block54;
                                    }
                                    v16 = var17_19.equals(TP.a(834, -19475));
                                }
                                if (var2_3 != 0) break block57;
                                if (!v16) break block58;
                                var15_17.setBounds(var11_13 + var6_6 - var22_24, var20_22, var22_24, var21_23);
                                if (var2_3 == 0) break block54;
                            }
                            v16 = var17_19.equals(TP.a(845, -7978));
                        }
                        if (var2_3 != 0) break block59;
                        if (v16) {
                            var15_17.setBounds(var11_13, var20_22, var6_6, var21_23);
                        }
                    }
                    var13_15 += var19_21 + this.o;
                    v16 = false;
                }
                var7_7 = (int)v16;
                if (var2_3 == 0) continue;
            }
        }
    }

    protected int m(boolean n10, int n11, int n12, int n13) {
        int n14;
        block18: {
            block19: {
                block20: {
                    int n15;
                    block16: {
                        block17: {
                            block13: {
                                block14: {
                                    block15: {
                                        block11: {
                                            block12: {
                                                block8: {
                                                    block9: {
                                                        block10: {
                                                            block6: {
                                                                block7: {
                                                                    n15 = T4.O();
                                                                    n14 = n10;
                                                                    if (n15 != 0) break block6;
                                                                    if (n14 == 0) break block7;
                                                                    n14 = this.R;
                                                                    if (n15 != 0) break block8;
                                                                    if (n14 != 0) break block9;
                                                                    break block10;
                                                                }
                                                                n14 = this.b;
                                                            }
                                                            if (n15 != 0) break block8;
                                                            if (n14 != 0) break block9;
                                                        }
                                                        return n11 + n12 / 2 - n13 / 2;
                                                    }
                                                    n14 = n10;
                                                }
                                                if (n15 != 0) break block11;
                                                if (n14 == 0) break block12;
                                                n14 = this.R;
                                                if (n15 != 0) break block13;
                                                if (n14 != 1) break block14;
                                                break block15;
                                            }
                                            n14 = this.b;
                                        }
                                        if (n15 != 0) break block13;
                                        if (n14 != 1) break block14;
                                    }
                                    return n11;
                                }
                                n14 = n10;
                            }
                            if (n15 != 0) break block16;
                            if (n14 == 0) break block17;
                            n14 = this.R;
                            if (n15 != 0) break block18;
                            if (n14 != 3) break block19;
                            break block20;
                        }
                        n14 = this.b;
                    }
                    if (n15 != 0) break block18;
                    if (n14 != 3) break block19;
                }
                return n11 + n12 - n13;
            }
            n14 = n11;
        }
        return n14;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Insets insets;
        block12: {
            int n10;
            int n11;
            int n12;
            int n13;
            block14: {
                int n14;
                block15: {
                    int n15;
                    block13: {
                        block11: {
                            int n16 = container.getComponentCount();
                            n15 = T4.O();
                            insets = container.getInsets();
                            if (n16 <= 0) break block12;
                            Map map = FN.B(container);
                            n13 = 0;
                            n12 = 0;
                            n11 = 0;
                            n10 = 0;
                            boolean n17 = false;
                            for (int i2 = 0; i2 < n16; ++i2) {
                                boolean bl;
                                Component component = container.getComponent(i2);
                                Dimension dimension = (Dimension)map.get(component);
                                n14 = bl;
                                if (n15 == 0) {
                                    boolean bl2;
                                    if (n15 == 0) {
                                        if (n14 == 0) {
                                            int n18 = ((String)this.s.get(component)).equals(TP.a(842, 19320));
                                            if (n15 == 0) {
                                                if (n18 != 0) {
                                                    n13 = Math.max(n13, dimension.width);
                                                    n10 += dimension.height + this.o;
                                                    bl = false;
                                                    if (n15 == 0) continue;
                                                }
                                                n12 = Math.max(n12, dimension.width);
                                                n18 = n16;
                                            }
                                            if (n15 == 0) {
                                                n18 = n18 > i2 + 1 ? ((Dimension)map.get((Object)container.getComponent((int)(i2 + 1)))).height : 0;
                                            }
                                            int n19 = n18;
                                            n10 += Math.max(dimension.height, n19) + this.o;
                                            bl = true;
                                            if (n15 == 0) continue;
                                        }
                                        n11 = Math.max(n11, dimension.width);
                                        bl2 = false;
                                    }
                                    bl = bl2;
                                    if (n15 == 0) continue;
                                }
                                break block11;
                            }
                            n10 -= this.o;
                            n14 = this.v;
                        }
                        if (n15 != 0) break block13;
                        if (n14 == 0) break block14;
                        n14 = this.e;
                    }
                    if (n15 != 0) break block15;
                    if (n14 == 0) break block14;
                    n14 = n12 = Math.max(n12, n11);
                }
                n11 = n14;
            }
            return new Dimension(insets.left + Math.max(n12 + this.K + n11, n13) + insets.right, insets.top + n10 + insets.bottom);
        }
        return new Dimension(insets.left + insets.right, insets.top + insets.bottom);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "\u00a7\u00f3\u000e\u00c4\u0004\u0000K\u00f2O\u0004\u0089\u009f\u008a\u00dc\u0004W\u00c7\u0010B\u0006\u008c}\u008d\u0015\u00e67\u0005hj+f\u000b\u0004\u00f9\u00af\u0084\u00da\u0004\u0007\u00b3\u0012P";
                var4_3 = "\u00a7\u00f3\u000e\u00c4\u0004\u0000K\u00f2O\u0004\u0089\u009f\u008a\u00dc\u0004W\u00c7\u0010B\u0006\u008c}\u008d\u0015\u00e67\u0005hj+f\u000b\u0004\u00f9\u00af\u0084\u00da\u0004\u0007\u00b3\u0012P".length();
                var1_4 = 4;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 121;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u00b9\u00b9:\u009c\u0001\u0017\u0005\u0089;\u0006]\u00bf";
                    var4_3 = "\u00b9\u00b9:\u009c\u0001\u0017\u0005\u0089;\u0006]\u00bf".length();
                    var1_4 = 6;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 35;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 122;
                            break;
                        }
                        case 1: {
                            v15 = 25;
                            break;
                        }
                        case 2: {
                            v15 = 100;
                            break;
                        }
                        case 3: {
                            v15 = 114;
                            break;
                        }
                        case 4: {
                            v15 = 75;
                            break;
                        }
                        case 5: {
                            v15 = 5;
                            break;
                        }
                        default: {
                            v15 = 17;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        TP.a = var5;
        TP.d = new String[10];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x34B) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 74;
                    break;
                }
                case 1: {
                    n14 = 143;
                    break;
                }
                case 2: {
                    n14 = 30;
                    break;
                }
                case 3: {
                    n14 = 9;
                    break;
                }
                case 4: {
                    n14 = 26;
                    break;
                }
                case 5: {
                    n14 = 95;
                    break;
                }
                case 6: {
                    n14 = 193;
                    break;
                }
                case 7: {
                    n14 = 239;
                    break;
                }
                case 8: {
                    n14 = 198;
                    break;
                }
                case 9: {
                    n14 = 18;
                    break;
                }
                case 10: {
                    n14 = 10;
                    break;
                }
                case 11: {
                    n14 = 240;
                    break;
                }
                case 12: {
                    n14 = 149;
                    break;
                }
                case 13: {
                    n14 = 181;
                    break;
                }
                case 14: {
                    n14 = 106;
                    break;
                }
                case 15: {
                    n14 = 111;
                    break;
                }
                case 16: {
                    n14 = 93;
                    break;
                }
                case 17: {
                    n14 = 156;
                    break;
                }
                case 18: {
                    n14 = 16;
                    break;
                }
                case 19: {
                    n14 = 178;
                    break;
                }
                case 20: {
                    n14 = 96;
                    break;
                }
                case 21: {
                    n14 = 209;
                    break;
                }
                case 22: {
                    n14 = 235;
                    break;
                }
                case 23: {
                    n14 = 124;
                    break;
                }
                case 24: {
                    n14 = 199;
                    break;
                }
                case 25: {
                    n14 = 133;
                    break;
                }
                case 26: {
                    n14 = 35;
                    break;
                }
                case 27: {
                    n14 = 97;
                    break;
                }
                case 28: {
                    n14 = 24;
                    break;
                }
                case 29: {
                    n14 = 82;
                    break;
                }
                case 30: {
                    n14 = 170;
                    break;
                }
                case 31: {
                    n14 = 204;
                    break;
                }
                case 32: {
                    n14 = 98;
                    break;
                }
                case 33: {
                    n14 = 17;
                    break;
                }
                case 34: {
                    n14 = 84;
                    break;
                }
                case 35: {
                    n14 = 38;
                    break;
                }
                case 36: {
                    n14 = 71;
                    break;
                }
                case 37: {
                    n14 = 70;
                    break;
                }
                case 38: {
                    n14 = 250;
                    break;
                }
                case 39: {
                    n14 = 19;
                    break;
                }
                case 40: {
                    n14 = 197;
                    break;
                }
                case 41: {
                    n14 = 25;
                    break;
                }
                case 42: {
                    n14 = 150;
                    break;
                }
                case 43: {
                    n14 = 237;
                    break;
                }
                case 44: {
                    n14 = 131;
                    break;
                }
                case 45: {
                    n14 = 77;
                    break;
                }
                case 46: {
                    n14 = 147;
                    break;
                }
                case 47: {
                    n14 = 80;
                    break;
                }
                case 48: {
                    n14 = 2;
                    break;
                }
                case 49: {
                    n14 = 122;
                    break;
                }
                case 50: {
                    n14 = 88;
                    break;
                }
                case 51: {
                    n14 = 110;
                    break;
                }
                case 52: {
                    n14 = 100;
                    break;
                }
                case 53: {
                    n14 = 37;
                    break;
                }
                case 54: {
                    n14 = 115;
                    break;
                }
                case 55: {
                    n14 = 68;
                    break;
                }
                case 56: {
                    n14 = 73;
                    break;
                }
                case 57: {
                    n14 = 39;
                    break;
                }
                case 58: {
                    n14 = 102;
                    break;
                }
                case 59: {
                    n14 = 45;
                    break;
                }
                case 60: {
                    n14 = 186;
                    break;
                }
                case 61: {
                    n14 = 48;
                    break;
                }
                case 62: {
                    n14 = 128;
                    break;
                }
                case 63: {
                    n14 = 4;
                    break;
                }
                case 64: {
                    n14 = 141;
                    break;
                }
                case 65: {
                    n14 = 177;
                    break;
                }
                case 66: {
                    n14 = 1;
                    break;
                }
                case 67: {
                    n14 = 201;
                    break;
                }
                case 68: {
                    n14 = 32;
                    break;
                }
                case 69: {
                    n14 = 152;
                    break;
                }
                case 70: {
                    n14 = 253;
                    break;
                }
                case 71: {
                    n14 = 160;
                    break;
                }
                case 72: {
                    n14 = 8;
                    break;
                }
                case 73: {
                    n14 = 57;
                    break;
                }
                case 74: {
                    n14 = 236;
                    break;
                }
                case 75: {
                    n14 = 52;
                    break;
                }
                case 76: {
                    n14 = 245;
                    break;
                }
                case 77: {
                    n14 = 230;
                    break;
                }
                case 78: {
                    n14 = 232;
                    break;
                }
                case 79: {
                    n14 = 23;
                    break;
                }
                case 80: {
                    n14 = 62;
                    break;
                }
                case 81: {
                    n14 = 176;
                    break;
                }
                case 82: {
                    n14 = 214;
                    break;
                }
                case 83: {
                    n14 = 66;
                    break;
                }
                case 84: {
                    n14 = 208;
                    break;
                }
                case 85: {
                    n14 = 194;
                    break;
                }
                case 86: {
                    n14 = 188;
                    break;
                }
                case 87: {
                    n14 = 195;
                    break;
                }
                case 88: {
                    n14 = 140;
                    break;
                }
                case 89: {
                    n14 = 129;
                    break;
                }
                case 90: {
                    n14 = 221;
                    break;
                }
                case 91: {
                    n14 = 210;
                    break;
                }
                case 92: {
                    n14 = 85;
                    break;
                }
                case 93: {
                    n14 = 187;
                    break;
                }
                case 94: {
                    n14 = 244;
                    break;
                }
                case 95: {
                    n14 = 91;
                    break;
                }
                case 96: {
                    n14 = 113;
                    break;
                }
                case 97: {
                    n14 = 206;
                    break;
                }
                case 98: {
                    n14 = 238;
                    break;
                }
                case 99: {
                    n14 = 99;
                    break;
                }
                case 100: {
                    n14 = 83;
                    break;
                }
                case 101: {
                    n14 = 203;
                    break;
                }
                case 102: {
                    n14 = 159;
                    break;
                }
                case 103: {
                    n14 = 47;
                    break;
                }
                case 104: {
                    n14 = 173;
                    break;
                }
                case 105: {
                    n14 = 166;
                    break;
                }
                case 106: {
                    n14 = 179;
                    break;
                }
                case 107: {
                    n14 = 172;
                    break;
                }
                case 108: {
                    n14 = 125;
                    break;
                }
                case 109: {
                    n14 = 233;
                    break;
                }
                case 110: {
                    n14 = 212;
                    break;
                }
                case 111: {
                    n14 = 54;
                    break;
                }
                case 112: {
                    n14 = 216;
                    break;
                }
                case 113: {
                    n14 = 155;
                    break;
                }
                case 114: {
                    n14 = 72;
                    break;
                }
                case 115: {
                    n14 = 49;
                    break;
                }
                case 116: {
                    n14 = 192;
                    break;
                }
                case 117: {
                    n14 = 130;
                    break;
                }
                case 118: {
                    n14 = 126;
                    break;
                }
                case 119: {
                    n14 = 196;
                    break;
                }
                case 120: {
                    n14 = 222;
                    break;
                }
                case 121: {
                    n14 = 89;
                    break;
                }
                case 122: {
                    n14 = 46;
                    break;
                }
                case 123: {
                    n14 = 76;
                    break;
                }
                case 124: {
                    n14 = 146;
                    break;
                }
                case 125: {
                    n14 = 36;
                    break;
                }
                case 126: {
                    n14 = 234;
                    break;
                }
                case 127: {
                    n14 = 157;
                    break;
                }
                case 128: {
                    n14 = 41;
                    break;
                }
                case 129: {
                    n14 = 243;
                    break;
                }
                case 130: {
                    n14 = 56;
                    break;
                }
                case 131: {
                    n14 = 167;
                    break;
                }
                case 132: {
                    n14 = 123;
                    break;
                }
                case 133: {
                    n14 = 53;
                    break;
                }
                case 134: {
                    n14 = 42;
                    break;
                }
                case 135: {
                    n14 = 120;
                    break;
                }
                case 136: {
                    n14 = 118;
                    break;
                }
                case 137: {
                    n14 = 5;
                    break;
                }
                case 138: {
                    n14 = 127;
                    break;
                }
                case 139: {
                    n14 = 55;
                    break;
                }
                case 140: {
                    n14 = 92;
                    break;
                }
                case 141: {
                    n14 = 59;
                    break;
                }
                case 142: {
                    n14 = 79;
                    break;
                }
                case 143: {
                    n14 = 107;
                    break;
                }
                case 144: {
                    n14 = 86;
                    break;
                }
                case 145: {
                    n14 = 231;
                    break;
                }
                case 146: {
                    n14 = 164;
                    break;
                }
                case 147: {
                    n14 = 40;
                    break;
                }
                case 148: {
                    n14 = 190;
                    break;
                }
                case 149: {
                    n14 = 69;
                    break;
                }
                case 150: {
                    n14 = 252;
                    break;
                }
                case 151: {
                    n14 = 13;
                    break;
                }
                case 152: {
                    n14 = 151;
                    break;
                }
                case 153: {
                    n14 = 21;
                    break;
                }
                case 154: {
                    n14 = 22;
                    break;
                }
                case 155: {
                    n14 = 7;
                    break;
                }
                case 156: {
                    n14 = 219;
                    break;
                }
                case 157: {
                    n14 = 51;
                    break;
                }
                case 158: {
                    n14 = 3;
                    break;
                }
                case 159: {
                    n14 = 31;
                    break;
                }
                case 160: {
                    n14 = 101;
                    break;
                }
                case 161: {
                    n14 = 224;
                    break;
                }
                case 162: {
                    n14 = 220;
                    break;
                }
                case 163: {
                    n14 = 61;
                    break;
                }
                case 164: {
                    n14 = 154;
                    break;
                }
                case 165: {
                    n14 = 139;
                    break;
                }
                case 166: {
                    n14 = 223;
                    break;
                }
                case 167: {
                    n14 = 211;
                    break;
                }
                case 168: {
                    n14 = 6;
                    break;
                }
                case 169: {
                    n14 = 183;
                    break;
                }
                case 170: {
                    n14 = 163;
                    break;
                }
                case 171: {
                    n14 = 63;
                    break;
                }
                case 172: {
                    n14 = 249;
                    break;
                }
                case 173: {
                    n14 = 251;
                    break;
                }
                case 174: {
                    n14 = 191;
                    break;
                }
                case 175: {
                    n14 = 27;
                    break;
                }
                case 176: {
                    n14 = 169;
                    break;
                }
                case 177: {
                    n14 = 81;
                    break;
                }
                case 178: {
                    n14 = 112;
                    break;
                }
                case 179: {
                    n14 = 60;
                    break;
                }
                case 180: {
                    n14 = 174;
                    break;
                }
                case 181: {
                    n14 = 242;
                    break;
                }
                case 182: {
                    n14 = 135;
                    break;
                }
                case 183: {
                    n14 = 218;
                    break;
                }
                case 184: {
                    n14 = 50;
                    break;
                }
                case 185: {
                    n14 = 138;
                    break;
                }
                case 186: {
                    n14 = 207;
                    break;
                }
                case 187: {
                    n14 = 43;
                    break;
                }
                case 188: {
                    n14 = 225;
                    break;
                }
                case 189: {
                    n14 = 144;
                    break;
                }
                case 190: {
                    n14 = 119;
                    break;
                }
                case 191: {
                    n14 = 215;
                    break;
                }
                case 192: {
                    n14 = 217;
                    break;
                }
                case 193: {
                    n14 = 87;
                    break;
                }
                case 194: {
                    n14 = 241;
                    break;
                }
                case 195: {
                    n14 = 28;
                    break;
                }
                case 196: {
                    n14 = 90;
                    break;
                }
                case 197: {
                    n14 = 162;
                    break;
                }
                case 198: {
                    n14 = 116;
                    break;
                }
                case 199: {
                    n14 = 226;
                    break;
                }
                case 200: {
                    n14 = 64;
                    break;
                }
                case 201: {
                    n14 = 15;
                    break;
                }
                case 202: {
                    n14 = 33;
                    break;
                }
                case 203: {
                    n14 = 168;
                    break;
                }
                case 204: {
                    n14 = 121;
                    break;
                }
                case 205: {
                    n14 = 44;
                    break;
                }
                case 206: {
                    n14 = 14;
                    break;
                }
                case 207: {
                    n14 = 12;
                    break;
                }
                case 208: {
                    n14 = 75;
                    break;
                }
                case 209: {
                    n14 = 104;
                    break;
                }
                case 210: {
                    n14 = 184;
                    break;
                }
                case 211: {
                    n14 = 136;
                    break;
                }
                case 212: {
                    n14 = 227;
                    break;
                }
                case 213: {
                    n14 = 255;
                    break;
                }
                case 214: {
                    n14 = 182;
                    break;
                }
                case 215: {
                    n14 = 165;
                    break;
                }
                case 216: {
                    n14 = 142;
                    break;
                }
                case 217: {
                    n14 = 103;
                    break;
                }
                case 218: {
                    n14 = 117;
                    break;
                }
                case 219: {
                    n14 = 153;
                    break;
                }
                case 220: {
                    n14 = 67;
                    break;
                }
                case 221: {
                    n14 = 108;
                    break;
                }
                case 222: {
                    n14 = 78;
                    break;
                }
                case 223: {
                    n14 = 20;
                    break;
                }
                case 224: {
                    n14 = 134;
                    break;
                }
                case 225: {
                    n14 = 11;
                    break;
                }
                case 226: {
                    n14 = 246;
                    break;
                }
                case 227: {
                    n14 = 29;
                    break;
                }
                case 228: {
                    n14 = 145;
                    break;
                }
                case 229: {
                    n14 = 200;
                    break;
                }
                case 230: {
                    n14 = 202;
                    break;
                }
                case 231: {
                    n14 = 180;
                    break;
                }
                case 232: {
                    n14 = 109;
                    break;
                }
                case 233: {
                    n14 = 248;
                    break;
                }
                case 234: {
                    n14 = 228;
                    break;
                }
                case 235: {
                    n14 = 158;
                    break;
                }
                case 236: {
                    n14 = 114;
                    break;
                }
                case 237: {
                    n14 = 132;
                    break;
                }
                case 238: {
                    n14 = 105;
                    break;
                }
                case 239: {
                    n14 = 205;
                    break;
                }
                case 240: {
                    n14 = 34;
                    break;
                }
                case 241: {
                    n14 = 189;
                    break;
                }
                case 242: {
                    n14 = 254;
                    break;
                }
                case 243: {
                    n14 = 0;
                    break;
                }
                case 244: {
                    n14 = 213;
                    break;
                }
                case 245: {
                    n14 = 171;
                    break;
                }
                case 246: {
                    n14 = 161;
                    break;
                }
                case 247: {
                    n14 = 94;
                    break;
                }
                case 248: {
                    n14 = 229;
                    break;
                }
                case 249: {
                    n14 = 175;
                    break;
                }
                case 250: {
                    n14 = 58;
                    break;
                }
                case 251: {
                    n14 = 137;
                    break;
                }
                case 252: {
                    n14 = 185;
                    break;
                }
                case 253: {
                    n14 = 65;
                    break;
                }
                case 254: {
                    n14 = 148;
                    break;
                }
                default: {
                    n14 = 247;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            TP.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

