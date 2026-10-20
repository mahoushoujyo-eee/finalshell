/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.I3;
import com.NG;
import com.XW;
import com.dr_1;
import com.ky_2;
import com.o6_0;
import com.xv_0;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

/*
 * Renamed from com.Xj
 */
public class xj_0
extends xv_0 {
    private int J;
    private int i;
    private int m;
    private boolean N;
    private o6_0 G;
    private dr_1 n;
    private I3 y;
    private int[] b;
    private Shape l;
    private static final String[] a;
    private static final String[] d;
    private static final long e;

    public int S() {
        return (Integer)this.C(xj_0.b(-25488, 13363), (int)e);
    }

    public void E(int n10) {
        this.Y(xj_0.b(-25479, -23085), n10);
    }

    public int M() {
        return (Integer)this.C(xj_0.b(-25480, 1673), 1);
    }

    public void q(int n10) {
        this.Y(xj_0.b(-25474, -12210), n10);
    }

    public int I() {
        return (Integer)this.C(xj_0.b(-25486, 20291), 4);
    }

    public void v(int n10) {
        this.Y(xj_0.b(-25473, 8082), n10);
    }

    public boolean B() {
        return (Boolean)this.C(xj_0.b(-25475, 4956), true);
    }

    public void h(boolean bl) {
        this.Y(xj_0.b(-25478, 29530), bl);
    }

    public o6_0 L() {
        return (o6_0)((Object)this.C(xj_0.b(-25476, -31629), (Object)o6_0.random));
    }

    public void P(o6_0 o6_02) {
        this.Y(xj_0.b(-25487, 16191), (Object)o6_02);
    }

    public I3 q() {
        return (I3)((Object)this.C(xj_0.b(-25485, 24426), (Object)I3.random));
    }

    public void T(I3 i3) {
        this.Y(xj_0.b(-25477, -23412), (Object)i3);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void X(XW var1_1) {
        block20: {
            block19: {
                block18: {
                    block16: {
                        block17: {
                            block13: {
                                block14: {
                                    block15: {
                                        this.J = this.S();
                                        this.i = this.M();
                                        this.m = this.I();
                                        this.N = this.B();
                                        this.G = NG.F(this.L());
                                        this.n = NG.q(this.A());
                                        var2_2 = o6_0.S();
                                        this.y = NG.R(this.q());
                                        v0 = this.n.Z();
                                        if (var2_2 == null) {
                                            v0 = v0 != 0 ? var1_1.getHeight() : var1_1.getWidth();
                                        }
                                        var3_3 = v0;
                                        v1 = var3_3 % this.J;
                                        if (var2_2 != null) ** GOTO lbl19
                                        if (v1 == 0) {
                                            v2 = var3_3;
                                        } else {
                                            v1 = var3_3 / this.J * this.J;
lbl19:
                                            // 2 sources

                                            v2 = v1 + this.J;
                                        }
                                        var4_4 = v2 / this.J;
                                        this.b = new int[var4_4];
                                        for (var5_5 = 0; var5_5 < var4_4; ++var5_5) {
                                            this.b[var5_5] = 0;
                                            if (var2_2 == null) {
                                                if (var2_2 == null) continue;
                                                ky_2.K(new String[4]);
                                                break;
                                            }
                                            break block13;
                                        }
                                        v3 = this;
                                        if (var2_2 != null) break block14;
                                        if (v3.n.equals((Object)dr_1.right)) break block15;
                                        v4 = this;
                                        if (var2_2 != null) break block16;
                                        if (!v4.n.equals((Object)dr_1.down)) break block17;
                                    }
                                    v3 = this;
                                }
                                v3.b[0] = this.m(var1_1, 0);
                            }
                            if (var2_2 == null) break block18;
                        }
                        v4 = this;
                    }
                    v4.b[var4_4 - 1] = this.m(var1_1, 0);
                }
                v5 = this;
                if (var2_2 != null) break block19;
                if (!v5.G.equals((Object)o6_0.fill)) break block20;
                v5 = this;
            }
            v5.l = this.P(this.b, var1_1);
        }
        var1_1.repaint();
    }

    @Override
    public boolean d(XW xW2) {
        int n10;
        String[] stringArray;
        int n11;
        block12: {
            int n12 = this.Y(xW2);
            n11 = 1;
            stringArray = o6_0.S();
            int n13 = this.b.length;
            for (int i2 = 0; i2 < n13; ++i2) {
                int n14;
                block16: {
                    block15: {
                        block13: {
                            block14: {
                                n10 = this.b[i2];
                                if (stringArray != null) break block12;
                                if (stringArray == null) {
                                    if (n10 >= n12) continue;
                                    n14 = this.b[i2];
                                }
                                if (stringArray != null) break block13;
                                if (n14 <= 0) break block14;
                                this.b[i2] = this.m(xW2, this.b[i2]);
                                if (stringArray == null) break block15;
                            }
                            n14 = this.E(i2, this.b, n12) ? 1 : 0;
                        }
                        if (stringArray != null) break block16;
                        if (n14 != 0) {
                            this.b[i2] = this.m(xW2, this.b[i2]);
                        }
                    }
                    n14 = n11;
                }
                if (stringArray == null) {
                    if (n14 == 0) continue;
                    n14 = this.b[i2];
                }
                if (stringArray == null) {
                    if (n14 >= n12) continue;
                    n14 = 0;
                }
                n11 = n14;
                if (stringArray == null) continue;
            }
            n10 = this.G.equals((Object)o6_0.fill) ? 1 : 0;
        }
        if (stringArray == null) {
            if (n10 != 0) {
                this.l = this.P(this.b, xW2);
            }
            n10 = n11;
        }
        if (stringArray == null) {
            if (n10 == 0) {
                xW2.repaint();
                return false;
            }
            this.l = null;
            this.G = null;
            n10 = 1;
        }
        return n10 != 0;
    }

    private int m(XW xW2, int n10) {
        int n11 = this.Y(xW2);
        return Math.min(n10 + this.c(n10, n11), n11);
    }

    private int Y(XW xW2) {
        String[] stringArray = o6_0.S();
        int n10 = this.G.equals((Object)o6_0.slide);
        if (stringArray == null) {
            if (n10 != 0) {
                int n11 = this.n.V();
                if (stringArray == null) {
                    n11 = n11 != 0 ? xW2.getHeight() : xW2.getWidth();
                }
                return n11;
            }
            n10 = this.J;
        }
        return n10;
    }

    private int c(int n10, int n11) {
        String[] stringArray = o6_0.S();
        int n12 = this.G.equals((Object)o6_0.slide);
        if (stringArray == null) {
            if (n12 != 0) {
                return Math.max(this.i, Math.round((float)this.m * (float)Math.sqrt((float)(n11 - n10) / (float)n11)));
            }
            n12 = this.m;
        }
        return n12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean E(int n10, int[] nArray, int n11) {
        int n12;
        String[] stringArray;
        block15: {
            block16: {
                int n13;
                block13: {
                    block14: {
                        stringArray = o6_0.S();
                        n13 = this.n.equals((Object)dr_1.right);
                        if (stringArray != null) break block13;
                        if (n13 != 0) break block14;
                        n12 = this.n.equals((Object)dr_1.down);
                        if (stringArray != null) break block15;
                        if (n12 == 0) break block16;
                    }
                    n13 = n10;
                }
                if (stringArray == null) {
                    if (n13 > 0) {
                        n13 = nArray[n10 - 1];
                        if (stringArray != null) return n13 != 0;
                        if (n13 > n11 / 4) return 1 != 0;
                    }
                    n13 = n10;
                }
                int n14 = 1;
                if (stringArray == null) {
                    if (n13 > n14) {
                        n13 = nArray[n10 - 2];
                        if (stringArray != null) return n13 != 0;
                        if (n13 > n11 * 2 / 4) return 1 != 0;
                    }
                    n13 = n10;
                    n14 = 2;
                }
                if (stringArray == null) {
                    if (n13 <= n14) return 0 != 0;
                    n13 = nArray[n10 - 3];
                    if (stringArray != null) return n13 != 0;
                    n14 = n11 * 3 / 4;
                }
                if (n13 <= n14) return 0 != 0;
                return 1 != 0;
            }
            n12 = n10;
        }
        int n15 = nArray.length - 1;
        if (stringArray == null) {
            if (n12 < n15) {
                n12 = nArray[n10 + 1];
                if (stringArray != null) return n12 != 0;
                if (n12 > n11 / 4) return 1 != 0;
            }
            n12 = n10;
            n15 = nArray.length - 2;
        }
        if (stringArray == null) {
            if (n12 < n15) {
                n12 = nArray[n10 + 2];
                if (stringArray != null) return n12 != 0;
                if (n12 > n11 * 2 / 4) return 1 != 0;
            }
            n12 = n10;
            n15 = nArray.length - 3;
        }
        if (stringArray == null) {
            if (n12 >= n15) return 0 != 0;
            n12 = nArray[n10 + 3];
            if (stringArray != null) return n12 != 0;
            n15 = n11 * 3 / 4;
        }
        if (n12 <= n15) return 0 != 0;
        return 1 != 0;
    }

    private Shape P(int[] nArray, XW xW2) {
        GeneralPath generalPath = new GeneralPath(0);
        String[] stringArray = o6_0.S();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (this.n.Z()) {
                generalPath.append(new Rectangle(0, i2 * this.J, xW2.getWidth(), nArray[i2]), false);
                if (stringArray == null) continue;
            }
            generalPath.append(new Rectangle(i2 * this.J, 0, nArray[i2], xW2.getHeight()), false);
            if (stringArray == null) continue;
        }
        return generalPath;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void D(Graphics2D var1_1, XW var2_2) {
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
        block22: {
            block21: {
                block20: {
                    var7 = new String[12];
                    var5_1 = 0;
                    var4_2 = "%;\u0084\u00af\u00aby'\u00dcK?i\u00a0\u0015\u00d1\u0010\u001a\u00cax\u00d5]I\u001a\u008d\u008a\u00fa\u0080\u001fu8@\u0080\u0016\u0014\u001e\u0017\u00e0\u00c4<P\u00bc\u0086\u00c5#\u0017\u00c5\u00f1[\u0000\u008de7k\u00a0T\u00b6\u009d\u008b\u00e6\f;\u008eG\u0019\u00d3\u00af(\u0006\u00bfl^\u00c3\f\u0088}1g\u001d`\u00f1\u00ff\u0084S9$\f>\u008d\u00e7y\u00c7\u00a3\u00aa\u0087\u00fdDR\u00dd\r\u0007\u00de\u00c0\u0013#\u00ee6.ix2r\u00f4\u0015\u0003\u00c9@\u00f13\u00b24\u00a57\u0010/I4i\u00e3\u00f6\u0092YL/U\fF\n\u00e8\u0089&\u00bd\u0096Dz<\u00a2\u00d2\f\u00e3\u00ae\\\u001d\u00b0/D\u0016'f\u00e4\u008b";
                    var6_3 = "%;\u0084\u00af\u00aby'\u00dcK?i\u00a0\u0015\u00d1\u0010\u001a\u00cax\u00d5]I\u001a\u008d\u008a\u00fa\u0080\u001fu8@\u0080\u0016\u0014\u001e\u0017\u00e0\u00c4<P\u00bc\u0086\u00c5#\u0017\u00c5\u00f1[\u0000\u008de7k\u00a0T\u00b6\u009d\u008b\u00e6\f;\u008eG\u0019\u00d3\u00af(\u0006\u00bfl^\u00c3\f\u0088}1g\u001d`\u00f1\u00ff\u0084S9$\f>\u008d\u00e7y\u00c7\u00a3\u00aa\u0087\u00fdDR\u00dd\r\u0007\u00de\u00c0\u0013#\u00ee6.ix2r\u00f4\u0015\u0003\u00c9@\u00f13\u00b24\u00a57\u0010/I4i\u00e3\u00f6\u0092YL/U\fF\n\u00e8\u0089&\u00bd\u0096Dz<\u00a2\u00d2\f\u00e3\u00ae\\\u001d\u00b0/D\u0016'f\u00e4\u008b".length();
                    var3_4 = 12;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 118;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "0K=\u00ba\u0087\u00c0\u00b9\u00f0\u0083\u00a4xl*p;\u0093\u00bb/U\\\u00a6\u00cd\u009a\r\u00d5\u008d\u0081b\u0010\u00dbK\u0093\u00dd\u00d4\u00bf\u00fc^";
                        var6_3 = "0K=\u00ba\u0087\u00c0\u00b9\u00f0\u0083\u00a4xl*p;\u0093\u00bb/U\\\u00a6\u00cd\u009a\r\u00d5\u008d\u0081b\u0010\u00dbK\u0093\u00dd\u00d4\u00bf\u00fc^".length();
                        var3_4 = 23;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 110;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 124;
                                break;
                            }
                            case 1: {
                                v15 = 38;
                                break;
                            }
                            case 2: {
                                v15 = 110;
                                break;
                            }
                            case 3: {
                                v15 = 31;
                                break;
                            }
                            case 4: {
                                v15 = 23;
                                break;
                            }
                            case 5: {
                                v15 = 64;
                                break;
                            }
                            default: {
                                v15 = 47;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            xj_0.a = var7;
            xj_0.d = new String[12];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 4651539579831302326L;
        ** while (true)
        xj_0.e = -622962026691184410L ^ var0_7;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9C79) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 111;
                    break;
                }
                case 1: {
                    n14 = 238;
                    break;
                }
                case 2: {
                    n14 = 66;
                    break;
                }
                case 3: {
                    n14 = 249;
                    break;
                }
                case 4: {
                    n14 = 250;
                    break;
                }
                case 5: {
                    n14 = 201;
                    break;
                }
                case 6: {
                    n14 = 218;
                    break;
                }
                case 7: {
                    n14 = 1;
                    break;
                }
                case 8: {
                    n14 = 51;
                    break;
                }
                case 9: {
                    n14 = 4;
                    break;
                }
                case 10: {
                    n14 = 122;
                    break;
                }
                case 11: {
                    n14 = 42;
                    break;
                }
                case 12: {
                    n14 = 230;
                    break;
                }
                case 13: {
                    n14 = 68;
                    break;
                }
                case 14: {
                    n14 = 169;
                    break;
                }
                case 15: {
                    n14 = 0;
                    break;
                }
                case 16: {
                    n14 = 234;
                    break;
                }
                case 17: {
                    n14 = 237;
                    break;
                }
                case 18: {
                    n14 = 131;
                    break;
                }
                case 19: {
                    n14 = 166;
                    break;
                }
                case 20: {
                    n14 = 40;
                    break;
                }
                case 21: {
                    n14 = 78;
                    break;
                }
                case 22: {
                    n14 = 89;
                    break;
                }
                case 23: {
                    n14 = 76;
                    break;
                }
                case 24: {
                    n14 = 113;
                    break;
                }
                case 25: {
                    n14 = 188;
                    break;
                }
                case 26: {
                    n14 = 124;
                    break;
                }
                case 27: {
                    n14 = 223;
                    break;
                }
                case 28: {
                    n14 = 32;
                    break;
                }
                case 29: {
                    n14 = 182;
                    break;
                }
                case 30: {
                    n14 = 123;
                    break;
                }
                case 31: {
                    n14 = 38;
                    break;
                }
                case 32: {
                    n14 = 107;
                    break;
                }
                case 33: {
                    n14 = 80;
                    break;
                }
                case 34: {
                    n14 = 9;
                    break;
                }
                case 35: {
                    n14 = 168;
                    break;
                }
                case 36: {
                    n14 = 100;
                    break;
                }
                case 37: {
                    n14 = 19;
                    break;
                }
                case 38: {
                    n14 = 75;
                    break;
                }
                case 39: {
                    n14 = 152;
                    break;
                }
                case 40: {
                    n14 = 118;
                    break;
                }
                case 41: {
                    n14 = 50;
                    break;
                }
                case 42: {
                    n14 = 2;
                    break;
                }
                case 43: {
                    n14 = 208;
                    break;
                }
                case 44: {
                    n14 = 27;
                    break;
                }
                case 45: {
                    n14 = 253;
                    break;
                }
                case 46: {
                    n14 = 195;
                    break;
                }
                case 47: {
                    n14 = 103;
                    break;
                }
                case 48: {
                    n14 = 171;
                    break;
                }
                case 49: {
                    n14 = 232;
                    break;
                }
                case 50: {
                    n14 = 141;
                    break;
                }
                case 51: {
                    n14 = 175;
                    break;
                }
                case 52: {
                    n14 = 252;
                    break;
                }
                case 53: {
                    n14 = 10;
                    break;
                }
                case 54: {
                    n14 = 156;
                    break;
                }
                case 55: {
                    n14 = 41;
                    break;
                }
                case 56: {
                    n14 = 184;
                    break;
                }
                case 57: {
                    n14 = 102;
                    break;
                }
                case 58: {
                    n14 = 39;
                    break;
                }
                case 59: {
                    n14 = 49;
                    break;
                }
                case 60: {
                    n14 = 6;
                    break;
                }
                case 61: {
                    n14 = 110;
                    break;
                }
                case 62: {
                    n14 = 164;
                    break;
                }
                case 63: {
                    n14 = 70;
                    break;
                }
                case 64: {
                    n14 = 170;
                    break;
                }
                case 65: {
                    n14 = 172;
                    break;
                }
                case 66: {
                    n14 = 30;
                    break;
                }
                case 67: {
                    n14 = 95;
                    break;
                }
                case 68: {
                    n14 = 245;
                    break;
                }
                case 69: {
                    n14 = 73;
                    break;
                }
                case 70: {
                    n14 = 77;
                    break;
                }
                case 71: {
                    n14 = 229;
                    break;
                }
                case 72: {
                    n14 = 247;
                    break;
                }
                case 73: {
                    n14 = 17;
                    break;
                }
                case 74: {
                    n14 = 94;
                    break;
                }
                case 75: {
                    n14 = 53;
                    break;
                }
                case 76: {
                    n14 = 48;
                    break;
                }
                case 77: {
                    n14 = 198;
                    break;
                }
                case 78: {
                    n14 = 174;
                    break;
                }
                case 79: {
                    n14 = 28;
                    break;
                }
                case 80: {
                    n14 = 233;
                    break;
                }
                case 81: {
                    n14 = 153;
                    break;
                }
                case 82: {
                    n14 = 129;
                    break;
                }
                case 83: {
                    n14 = 197;
                    break;
                }
                case 84: {
                    n14 = 242;
                    break;
                }
                case 85: {
                    n14 = 45;
                    break;
                }
                case 86: {
                    n14 = 63;
                    break;
                }
                case 87: {
                    n14 = 56;
                    break;
                }
                case 88: {
                    n14 = 151;
                    break;
                }
                case 89: {
                    n14 = 192;
                    break;
                }
                case 90: {
                    n14 = 82;
                    break;
                }
                case 91: {
                    n14 = 106;
                    break;
                }
                case 92: {
                    n14 = 225;
                    break;
                }
                case 93: {
                    n14 = 231;
                    break;
                }
                case 94: {
                    n14 = 35;
                    break;
                }
                case 95: {
                    n14 = 185;
                    break;
                }
                case 96: {
                    n14 = 203;
                    break;
                }
                case 97: {
                    n14 = 37;
                    break;
                }
                case 98: {
                    n14 = 143;
                    break;
                }
                case 99: {
                    n14 = 81;
                    break;
                }
                case 100: {
                    n14 = 121;
                    break;
                }
                case 101: {
                    n14 = 132;
                    break;
                }
                case 102: {
                    n14 = 108;
                    break;
                }
                case 103: {
                    n14 = 54;
                    break;
                }
                case 104: {
                    n14 = 187;
                    break;
                }
                case 105: {
                    n14 = 239;
                    break;
                }
                case 106: {
                    n14 = 3;
                    break;
                }
                case 107: {
                    n14 = 112;
                    break;
                }
                case 108: {
                    n14 = 179;
                    break;
                }
                case 109: {
                    n14 = 206;
                    break;
                }
                case 110: {
                    n14 = 34;
                    break;
                }
                case 111: {
                    n14 = 5;
                    break;
                }
                case 112: {
                    n14 = 140;
                    break;
                }
                case 113: {
                    n14 = 59;
                    break;
                }
                case 114: {
                    n14 = 101;
                    break;
                }
                case 115: {
                    n14 = 58;
                    break;
                }
                case 116: {
                    n14 = 87;
                    break;
                }
                case 117: {
                    n14 = 183;
                    break;
                }
                case 118: {
                    n14 = 29;
                    break;
                }
                case 119: {
                    n14 = 148;
                    break;
                }
                case 120: {
                    n14 = 21;
                    break;
                }
                case 121: {
                    n14 = 24;
                    break;
                }
                case 122: {
                    n14 = 90;
                    break;
                }
                case 123: {
                    n14 = 136;
                    break;
                }
                case 124: {
                    n14 = 22;
                    break;
                }
                case 125: {
                    n14 = 67;
                    break;
                }
                case 126: {
                    n14 = 97;
                    break;
                }
                case 127: {
                    n14 = 216;
                    break;
                }
                case 128: {
                    n14 = 109;
                    break;
                }
                case 129: {
                    n14 = 104;
                    break;
                }
                case 130: {
                    n14 = 155;
                    break;
                }
                case 131: {
                    n14 = 18;
                    break;
                }
                case 132: {
                    n14 = 190;
                    break;
                }
                case 133: {
                    n14 = 226;
                    break;
                }
                case 134: {
                    n14 = 44;
                    break;
                }
                case 135: {
                    n14 = 138;
                    break;
                }
                case 136: {
                    n14 = 204;
                    break;
                }
                case 137: {
                    n14 = 71;
                    break;
                }
                case 138: {
                    n14 = 167;
                    break;
                }
                case 139: {
                    n14 = 55;
                    break;
                }
                case 140: {
                    n14 = 173;
                    break;
                }
                case 141: {
                    n14 = 178;
                    break;
                }
                case 142: {
                    n14 = 219;
                    break;
                }
                case 143: {
                    n14 = 31;
                    break;
                }
                case 144: {
                    n14 = 33;
                    break;
                }
                case 145: {
                    n14 = 120;
                    break;
                }
                case 146: {
                    n14 = 160;
                    break;
                }
                case 147: {
                    n14 = 65;
                    break;
                }
                case 148: {
                    n14 = 127;
                    break;
                }
                case 149: {
                    n14 = 147;
                    break;
                }
                case 150: {
                    n14 = 64;
                    break;
                }
                case 151: {
                    n14 = 212;
                    break;
                }
                case 152: {
                    n14 = 69;
                    break;
                }
                case 153: {
                    n14 = 114;
                    break;
                }
                case 154: {
                    n14 = 207;
                    break;
                }
                case 155: {
                    n14 = 117;
                    break;
                }
                case 156: {
                    n14 = 163;
                    break;
                }
                case 157: {
                    n14 = 221;
                    break;
                }
                case 158: {
                    n14 = 222;
                    break;
                }
                case 159: {
                    n14 = 91;
                    break;
                }
                case 160: {
                    n14 = 144;
                    break;
                }
                case 161: {
                    n14 = 133;
                    break;
                }
                case 162: {
                    n14 = 116;
                    break;
                }
                case 163: {
                    n14 = 12;
                    break;
                }
                case 164: {
                    n14 = 165;
                    break;
                }
                case 165: {
                    n14 = 161;
                    break;
                }
                case 166: {
                    n14 = 125;
                    break;
                }
                case 167: {
                    n14 = 228;
                    break;
                }
                case 168: {
                    n14 = 119;
                    break;
                }
                case 169: {
                    n14 = 62;
                    break;
                }
                case 170: {
                    n14 = 217;
                    break;
                }
                case 171: {
                    n14 = 180;
                    break;
                }
                case 172: {
                    n14 = 248;
                    break;
                }
                case 173: {
                    n14 = 149;
                    break;
                }
                case 174: {
                    n14 = 134;
                    break;
                }
                case 175: {
                    n14 = 196;
                    break;
                }
                case 176: {
                    n14 = 142;
                    break;
                }
                case 177: {
                    n14 = 47;
                    break;
                }
                case 178: {
                    n14 = 177;
                    break;
                }
                case 179: {
                    n14 = 213;
                    break;
                }
                case 180: {
                    n14 = 8;
                    break;
                }
                case 181: {
                    n14 = 244;
                    break;
                }
                case 182: {
                    n14 = 209;
                    break;
                }
                case 183: {
                    n14 = 215;
                    break;
                }
                case 184: {
                    n14 = 193;
                    break;
                }
                case 185: {
                    n14 = 92;
                    break;
                }
                case 186: {
                    n14 = 25;
                    break;
                }
                case 187: {
                    n14 = 145;
                    break;
                }
                case 188: {
                    n14 = 157;
                    break;
                }
                case 189: {
                    n14 = 224;
                    break;
                }
                case 190: {
                    n14 = 99;
                    break;
                }
                case 191: {
                    n14 = 60;
                    break;
                }
                case 192: {
                    n14 = 200;
                    break;
                }
                case 193: {
                    n14 = 158;
                    break;
                }
                case 194: {
                    n14 = 115;
                    break;
                }
                case 195: {
                    n14 = 43;
                    break;
                }
                case 196: {
                    n14 = 36;
                    break;
                }
                case 197: {
                    n14 = 16;
                    break;
                }
                case 198: {
                    n14 = 189;
                    break;
                }
                case 199: {
                    n14 = 191;
                    break;
                }
                case 200: {
                    n14 = 235;
                    break;
                }
                case 201: {
                    n14 = 251;
                    break;
                }
                case 202: {
                    n14 = 20;
                    break;
                }
                case 203: {
                    n14 = 246;
                    break;
                }
                case 204: {
                    n14 = 135;
                    break;
                }
                case 205: {
                    n14 = 26;
                    break;
                }
                case 206: {
                    n14 = 211;
                    break;
                }
                case 207: {
                    n14 = 86;
                    break;
                }
                case 208: {
                    n14 = 57;
                    break;
                }
                case 209: {
                    n14 = 181;
                    break;
                }
                case 210: {
                    n14 = 11;
                    break;
                }
                case 211: {
                    n14 = 13;
                    break;
                }
                case 212: {
                    n14 = 83;
                    break;
                }
                case 213: {
                    n14 = 93;
                    break;
                }
                case 214: {
                    n14 = 159;
                    break;
                }
                case 215: {
                    n14 = 84;
                    break;
                }
                case 216: {
                    n14 = 85;
                    break;
                }
                case 217: {
                    n14 = 176;
                    break;
                }
                case 218: {
                    n14 = 15;
                    break;
                }
                case 219: {
                    n14 = 241;
                    break;
                }
                case 220: {
                    n14 = 162;
                    break;
                }
                case 221: {
                    n14 = 23;
                    break;
                }
                case 222: {
                    n14 = 205;
                    break;
                }
                case 223: {
                    n14 = 96;
                    break;
                }
                case 224: {
                    n14 = 128;
                    break;
                }
                case 225: {
                    n14 = 46;
                    break;
                }
                case 226: {
                    n14 = 255;
                    break;
                }
                case 227: {
                    n14 = 88;
                    break;
                }
                case 228: {
                    n14 = 14;
                    break;
                }
                case 229: {
                    n14 = 150;
                    break;
                }
                case 230: {
                    n14 = 243;
                    break;
                }
                case 231: {
                    n14 = 74;
                    break;
                }
                case 232: {
                    n14 = 240;
                    break;
                }
                case 233: {
                    n14 = 137;
                    break;
                }
                case 234: {
                    n14 = 227;
                    break;
                }
                case 235: {
                    n14 = 186;
                    break;
                }
                case 236: {
                    n14 = 194;
                    break;
                }
                case 237: {
                    n14 = 210;
                    break;
                }
                case 238: {
                    n14 = 139;
                    break;
                }
                case 239: {
                    n14 = 61;
                    break;
                }
                case 240: {
                    n14 = 7;
                    break;
                }
                case 241: {
                    n14 = 254;
                    break;
                }
                case 242: {
                    n14 = 126;
                    break;
                }
                case 243: {
                    n14 = 130;
                    break;
                }
                case 244: {
                    n14 = 199;
                    break;
                }
                case 245: {
                    n14 = 214;
                    break;
                }
                case 246: {
                    n14 = 72;
                    break;
                }
                case 247: {
                    n14 = 98;
                    break;
                }
                case 248: {
                    n14 = 154;
                    break;
                }
                case 249: {
                    n14 = 105;
                    break;
                }
                case 250: {
                    n14 = 220;
                    break;
                }
                case 251: {
                    n14 = 202;
                    break;
                }
                case 252: {
                    n14 = 146;
                    break;
                }
                case 253: {
                    n14 = 236;
                    break;
                }
                case 254: {
                    n14 = 52;
                    break;
                }
                default: {
                    n14 = 79;
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
            xj_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

