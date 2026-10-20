/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XB;
import com.ky_2;
import com.lx_0;
import java.io.IOException;
import java.io.InputStream;

/*
 * Renamed from com.Rx
 */
public class rx_0 {
    public final byte[] l;
    private final int[] V;
    private final String[] q;
    private final int I;
    public final int b;
    private boolean c;
    private static final String[] a;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    /*
     * Exception decompiling
     */
    public rx_0(InputStream var1_1, boolean var2_2) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE]], but top level block is 6[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
    public void C(lx_0 var1_1) {
        block29: {
            block28: {
                block26: {
                    block24: {
                        var3_2 = new char[this.I];
                        var8_3 = 0;
                        var2_4 = XB.X();
                        v0 = this.c;
                        if (var2_4 != null) ** GOTO lbl21
                        if (v0 != 0) {
                            var6_5 = this.f();
                            for (var4_6 = this.m(var6_5); var4_6 > 0; --var4_6) {
                                var9_7 = this.l(var6_5 + 2, var3_2);
                                v1 = (int)rx_0.a(28796, -29771).equals(var9_7);
                                if (var2_4 == null) {
                                    if (var2_4 == null) {
                                        if (v1 != 0) {
                                            var8_3 = var6_5 + rx_0.a(12531, 4742160517747470033L);
                                            if (var2_4 == null) break;
                                        }
                                        v2 = var6_5 + (rx_0.a(13409, 3323115123623782981L) + this.X(var6_5 + 4));
                                    }
                                    var6_5 = v2;
                                    if (var2_4 == null) continue;
                                }
                                break;
                            }
                        } else {
                            v0 = this.b;
lbl21:
                            // 2 sources

                            var6_5 = v0;
                            v1 = this.m(var6_5 + rx_0.a(13409, 3323115123623782981L));
                        }
                        var9_8 = v1;
                        var6_5 += 8;
                        for (var4_6 = 0; var4_6 < var9_8; ++var4_6) {
                            var6_5 += 2;
                            if (var2_4 == null) continue;
                        }
                        var7_9 = var6_5;
                        var4_6 = this.m(var7_9);
                        var7_9 += 2;
                        while (var4_6 > 0) {
                            block25: {
                                var5_10 = this.m(var7_9 + rx_0.a(13409, 3323115123623782981L));
                                if (var2_4 != null) break block24;
                                var7_9 += 8;
                                while (var5_10 > 0) {
                                    var7_9 += rx_0.a(13409, 3323115123623782981L) + this.X(var7_9 + 2);
                                    --var5_10;
                                    if (var2_4 == null) {
                                        if (var2_4 == null) continue;
                                    }
                                    break block25;
                                }
                                --var4_6;
                            }
                            if (var2_4 == null) continue;
                        }
                        var4_6 = this.m(var7_9);
                    }
                    var7_9 += 2;
                    while (var4_6 > 0) {
                        block27: {
                            var5_10 = this.m(var7_9 + rx_0.a(13409, 3323115123623782981L));
                            if (var2_4 != null) break block26;
                            var7_9 += 8;
                            while (var5_10 > 0) {
                                var7_9 += rx_0.a(13409, 3323115123623782981L) + this.X(var7_9 + 2);
                                --var5_10;
                                if (var2_4 == null) {
                                    if (var2_4 == null) continue;
                                }
                                break block27;
                            }
                            --var4_6;
                        }
                        if (var2_4 == null) continue;
                    }
                    var4_6 = this.m(var7_9);
                }
                var7_9 += 2;
                while (var4_6 > 0) {
                    var7_9 += rx_0.a(13409, 3323115123623782981L) + this.X(var7_9 + 2);
                    --var4_6;
                    if (var2_4 == null) {
                        if (var2_4 == null) continue;
                    }
                    break block28;
                }
                v3 = var8_3;
                if (var2_4 != null) ** GOTO lbl80
                if (v3 != 0) {
                    var7_9 = var8_3 + 2;
                    for (var4_6 = this.m(var8_3); var4_6 > 0; --var4_6) {
                        var10_11 = this.l(var7_9, var3_2);
                        var1_1.R(var10_11);
                        if (var2_4 == null) {
                            if (var2_4 == null) continue;
                        }
                        break;
                    }
                } else {
                    v3 = this.m(var6_5);
lbl80:
                    // 2 sources

                    var4_6 = v3;
                }
            }
            var6_5 += 2;
            while (var4_6 > 0) {
                block30: {
                    var5_10 = this.m(var6_5 + rx_0.a(13409, 3323115123623782981L));
                    if (var2_4 != null) break block29;
                    var6_5 += 8;
                    while (var5_10 > 0) {
                        var6_5 += rx_0.a(13409, 3323115123623782981L) + this.X(var6_5 + 2);
                        --var5_10;
                        if (var2_4 == null) {
                            if (var2_4 == null) continue;
                        }
                        break block30;
                    }
                    --var4_6;
                }
                if (var2_4 == null) continue;
            }
            var4_6 = this.m(var6_5);
        }
        var6_5 += 2;
        while (var4_6 > 0) {
            var6_5 = this.A(var1_1, var3_2, var6_5);
            --var4_6;
            if (var2_4 == null) continue;
        }
        if (ky_2.F() != null) {
            XB.N(new int[5]);
        }
    }

    private int f() {
        int n10;
        block8: {
            int n11;
            int n12;
            int[] nArray;
            int n13;
            block6: {
                int n14;
                n13 = this.b + rx_0.a(12531, 4742160517747470033L) + this.m(this.b + rx_0.a(13409, 3323115123623782981L)) * 2;
                nArray = XB.X();
                n12 = this.m(n13);
                while (n12 > 0) {
                    block7: {
                        n14 = this.m(n13 + rx_0.a(12531, 4742160517747470033L));
                        if (nArray != null) break block6;
                        for (n11 = v4754347; n11 > 0; --n11) {
                            n13 += rx_0.a(13409, 3323115123623782981L) + this.X(n13 + rx_0.a(14884, 7657198279263413256L));
                            if (nArray == null) {
                                if (nArray == null) continue;
                            }
                            break block7;
                        }
                        n13 += 8;
                        --n12;
                    }
                    if (nArray == null) continue;
                }
                n14 = n12 = this.m(n13 += 2);
            }
            while (n12 > 0) {
                block9: {
                    n10 = this.m(n13 + rx_0.a(12531, 4742160517747470033L));
                    if (nArray != null) break block8;
                    for (n11 = v4754376; n11 > 0; --n11) {
                        n13 += rx_0.a(13409, 3323115123623782981L) + this.X(n13 + rx_0.a(23352, 4269116902259524887L));
                        if (nArray == null) {
                            if (nArray == null) continue;
                        }
                        break block9;
                    }
                    n13 += 8;
                    --n12;
                }
                if (nArray == null) continue;
            }
            n10 = n13 + 2;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    private int A(lx_0 var1_1, char[] var2_2, int var3_3) {
        block28: {
            block26: {
                block27: {
                    block30: {
                        block29: {
                            block25: {
                                var10_4 = this.m(var3_3);
                                var11_5 = this.l(var3_3 + 2, var2_2);
                                var12_6 = this.l(var3_3 + 4, var2_2);
                                var5_7 = 0;
                                var4_8 = XB.X();
                                var6_9 = 0;
                                var7_10 = this.m(var3_3 + rx_0.a(16835, 7344570157291872228L));
                                var3_3 += 8;
                                while (var7_10 > 0) {
                                    var8_11 = this.l(var3_3, var2_2);
                                    var13_12 = this.X(var3_3 + 2);
                                    var3_3 += 6;
                                    v0 = (int)var8_11.equals(rx_0.a(28799, -22709));
                                    if (var4_8 == null) {
                                        if (var4_8 == null) {
                                            if (v0 != 0) {
                                                var5_7 = var3_3;
                                            }
                                            v1 = var3_3 + var13_12;
                                        }
                                        var3_3 = v1;
                                        --var7_10;
                                        if (var4_8 == null) continue;
                                    }
                                    break block25;
                                }
                                v0 = var6_9;
                            }
                            if (var4_8 != null) break block29;
                            if (v0 == 0) break block30;
                            var6_9 += 2;
                            v0 = var7_10 = 0;
                        }
                        while (var7_10 < this.m(var6_9)) {
                            var6_9 += 2;
                            ++var7_10;
                            if (var4_8 == null) continue;
                        }
                    }
                    var13_13 = var1_1.g(var10_4, var11_5, var12_6);
                    if (var13_13 == null) break block26;
                    v2 = var5_7;
                    if (var4_8 != null) break block28;
                    if (v2 == 0) break block26;
                    var14_14 = this.X(var5_7 + 4);
                    var15_15 = var5_7 += 8;
                    var5_7 = var16_16 = var5_7 + var14_14;
                    var7_10 = this.m(var5_7);
                    var5_7 += 2;
                    while (var7_10 > 0) {
                        var5_7 += 8;
                        --var7_10;
                        if (var4_8 == null) {
                            if (var4_8 == null) continue;
                        }
                        break block26;
                    }
                    var17_17 = 0;
                    var18_18 = 0;
                    var7_10 = this.m(var5_7);
                    var5_7 += 2;
                    while (var7_10 > 0) {
                        block34: {
                            block33: {
                                block31: {
                                    block32: {
                                        var8_11 = this.l(var5_7, var2_2);
                                        v2 = (int)var8_11.equals(rx_0.a(28798, -29171));
                                        if (var4_8 != null) break block27;
                                        if (var4_8 != null) break block31;
                                        if (v2 == 0) break block32;
                                        var17_17 = var5_7 + rx_0.a(13409, 3323115123623782981L);
                                        if (var4_8 == null) break block33;
                                    }
                                    v3 = var8_11.equals(rx_0.a(28797, 12450));
                                }
                                if (var4_8 != null) break block34;
                                if (v3 != 0) {
                                    var18_18 = var5_7 + rx_0.a(13409, 3323115123623782981L);
                                }
                            }
                            v3 = var5_7 + (rx_0.a(13409, 3323115123623782981L) + this.X(var5_7 + 2));
                        }
                        var5_7 = v3;
                        --var7_10;
                        if (var4_8 == null) continue;
                    }
                    var5_7 = var15_15;
                    v2 = var17_17;
                }
                if (var4_8 != null) break block28;
                if (v2 == 0) break block26;
                v4 = var18_18;
                if (var4_8 != null) ** GOTO lbl95
                if (v4 != 0) {
                    var9_19 = this.m(var18_18) * 3;
                    var6_9 = var18_18 + 2;
                    var19_20 = new int[var9_19];
                    while (var9_19 > 0) {
                        var19_20[--var9_19] = var6_9 + rx_0.a(13409, 3323115123623782981L);
                        var19_20[--var9_19] = this.m(var6_9 + rx_0.a(12531, 4742160517747470033L));
                        var19_20[--var9_19] = this.m(var6_9);
                        var6_9 += 10;
                        if (var4_8 == null) {
                            if (var4_8 == null) continue;
                        }
                        break;
                    }
                } else {
                    v4 = this.m(var17_17);
lbl95:
                    // 2 sources

                    var9_19 = v4;
                }
                var6_9 = var17_17 + 2;
                while (var9_19 > 0) {
                    v2 = this.m(var6_9 + rx_0.a(12531, 4742160517747470033L));
                    if (var4_8 == null) {
                        var19_21 = v2;
                        var13_13.p(this.l(var6_9 + 4, var2_2), var19_21);
                        var6_9 += 10;
                        --var9_19;
                        if (var4_8 == null) continue;
                    }
                    break block28;
                }
            }
            v2 = var3_3;
        }
        return v2;
    }

    private int m(int n10) {
        byte[] byArray = this.l;
        return (byArray[n10] & rx_0.a(22789, 6668029864107345701L)) << rx_0.a(31416, 264108058789553302L) | byArray[n10 + 1] & rx_0.a(31964, 5021098413646848767L);
    }

    private int X(int n10) {
        byte[] byArray = this.l;
        return (byArray[n10] & rx_0.a(31964, 5021098413646848767L)) << rx_0.a(28557, 1003220879750312357L) | (byArray[n10 + 1] & rx_0.a(31964, 5021098413646848767L)) << rx_0.a(5798, 4700451335067945099L) | (byArray[n10 + 2] & rx_0.a(31964, 5021098413646848767L)) << rx_0.a(12531, 4742160517747470033L) | byArray[n10 + 3] & rx_0.a(31964, 5021098413646848767L);
    }

    private String l(int n10, char[] cArray) {
        int n11 = this.m(n10);
        String string = this.q[n11];
        int[] nArray = XB.X();
        String string2 = string;
        if (nArray == null) {
            if (string2 != null) {
                return string;
            }
            n10 = this.V[n11];
            string2 = this.C(n10 + 2, this.m(n10), cArray);
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     */
    private String C(int var1_1, int var2_2, char[] var3_3) {
        var5_4 = var1_1 + var2_2;
        var6_5 = this.l;
        var4_6 = XB.X();
        var7_7 = 0;
        var9_8 = 0;
        var10_9 = 0;
        while (var1_1 < var5_4) {
            var8_10 = var6_5[var1_1++];
            v0 = var9_8;
            if (var4_6 != null) ** GOTO lbl14
            switch (v0) {
                case 0: {
                    v0 = var8_10 &= rx_0.a(31964, 5021098413646848767L);
lbl14:
                    // 2 sources

                    v1 = rx_0.a(7102, 7992993624238245261L);
                    if (var4_6 == null) {
                        if (v0 < v1) {
                            var3_3[var7_7++] = (char)var8_10;
                            if (var4_6 == null) break;
                        }
                        v0 = var8_10;
                        v1 = rx_0.a(19735, 3728804318231892786L);
                    }
                    if (var4_6 == null) {
                        if (v0 < v1) {
                            v0 = var8_10;
                            v1 = rx_0.a(22212, 7230031104647039220L);
                            if (var4_6 == null) {
                                if (v0 > v1) {
                                    var10_9 = (char)(var8_10 & rx_0.a(15657, 4997657610210501384L));
                                    var9_8 = 1;
                                    if (var4_6 == null) break;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 4 sources

                        {
                            v0 = var8_10;
                            v1 = rx_0.a(12699, 4693544420591988669L);
                        }
                    }
                    var10_9 = (char)(v0 & v1);
                    var9_8 = 2;
                    if (var4_6 == null) break;
                }
                case 1: {
                    var3_3[var7_7++] = (char)(var10_9 << rx_0.a(13409, 3323115123623782981L) | var8_10 & rx_0.a(22151, 1598488468375996589L));
                    var9_8 = 0;
                    if (var4_6 == null) break;
                }
                case 2: {
                    var10_9 = (char)(var10_9 << rx_0.a(13409, 3323115123623782981L) | var8_10 & rx_0.a(27800, 3792734842716861107L));
                    var9_8 = 1;
                }
            }
            if (var4_6 == null) continue;
        }
        return new String(var3_3, 0, var7_7);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "s\u001a\u00b9@}\u00a4.\u00f3\u0096R\u0014B~\u00fc\u00f6F\u009c\u0002\u0012Kb\u00ab\u0019\u00ea\u00dbZ4\u00a8\u00a65\u00cbq\u00e7\u00e3\u00aa\u00e3\u001fU3\u00dcJe\u001d#\u000e\u0086\u009a\u00c1";
                        var12_3 = "s\u001a\u00b9@}\u00a4.\u00f3\u0096R\u0014B~\u00fc\u00f6F\u009c\u0002\u0012Kb\u00ab\u0019\u00ea\u00dbZ4\u00a8\u00a65\u00cbq\u00e7\u00e3\u00aa\u00e3\u001fU3\u00dcJe\u001d#\u000e\u0086\u009a\u00c1".length();
                        var9_4 = 22;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 57;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00d7{n\u00c2\u00120\u00ac{<\u008f\u0081\u00da\u00fd\u00a298\u0085Q\u00ae\u00a1\u00b4\u00ce\u0097";
                            var12_3 = "\u00d7{n\u00c2\u00120\u00ac{<\u008f\u0081\u00da\u00fd\u00a298\u0085Q\u00ae\u00a1\u00b4\u00ce\u0097".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 95;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 122;
                                    break;
                                }
                                case 1: {
                                    v15 = 70;
                                    break;
                                }
                                case 2: {
                                    v15 = 32;
                                    break;
                                }
                                case 3: {
                                    v15 = 54;
                                    break;
                                }
                                case 4: {
                                    v15 = 51;
                                    break;
                                }
                                case 5: {
                                    v15 = 111;
                                    break;
                                }
                                default: {
                                    v15 = 121;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                rx_0.a = var13;
                rx_0.d = new String[4];
                var0_7 = 2357545643367823399L;
                var6_8 = new long[20];
                var3_9 = 0;
                var4_10 = "/o\u00f0*>\u008d\u0016\u00feAd\u00c3\u00d8\u00e9\u0007\u00da'l\u000e\u00d4}\u00bfe\u00ff\u00fd\u0014oH\u00e4\u00b3*\u009b01\u00f2\u00f0u\u00e0S\u0097\u0095q7\b:\u0083\u00e4g\u00c5\ry\u008a\u00b2\u00bd\u00e7\u0092d\f\u00db\u00e1Y\u00ef\u0092\u00eb\u00f5i\u008d8\u00e6a\u00a9p\u00b5\u00fb\u009c\u00c2\u00935\u00d7\u00ca\u00ab\u00d8\u0083\u00d8\u0080\u00bep\u00c9\u009a\u0017d\u00adlJ.\u00d2\u00a9\u00ee\u00f41h\u00c4\u00cd\\\u00b9\u00df!\u0015\u00cd\u00b9~\u00fd<?7\u00ad\u0095d\u008f\u001c#\u0098\u00a8\u0086\u00b3X\t0\u00bcq8p\u00ce\u00b5\u0095\u00f4I1\u00aa\t-\u00d6\u001b\u00bd*";
                var5_11 = "/o\u00f0*>\u008d\u0016\u00feAd\u00c3\u00d8\u00e9\u0007\u00da'l\u000e\u00d4}\u00bfe\u00ff\u00fd\u0014oH\u00e4\u00b3*\u009b01\u00f2\u00f0u\u00e0S\u0097\u0095q7\b:\u0083\u00e4g\u00c5\ry\u008a\u00b2\u00bd\u00e7\u0092d\f\u00db\u00e1Y\u00ef\u0092\u00eb\u00f5i\u008d8\u00e6a\u00a9p\u00b5\u00fb\u009c\u00c2\u00935\u00d7\u00ca\u00ab\u00d8\u0083\u00d8\u0080\u00bep\u00c9\u009a\u0017d\u00adlJ.\u00d2\u00a9\u00ee\u00f41h\u00c4\u00cd\\\u00b9\u00df!\u0015\u00cd\u00b9~\u00fd<?7\u00ad\u0095d\u008f\u001c#\u0098\u00a8\u0086\u00b3X\t0\u00bcq8p\u00ce\u00b5\u0095\u00f4I1\u00aa\t-\u00d6\u001b\u00bd*".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0099\u008f\u00fd\u00e3-6plz\u00c0\u00f5\u00cf\u0017\u00bf=\u000f";
                    var5_11 = "\u0099\u008f\u00fd\u00e3-6plz\u00c0\u00f5\u00cf\u0017\u00bf=\u000f".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        rx_0.e = var6_8;
        rx_0.f = new Integer[20];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x707D) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 1;
                    break;
                }
                case 1: {
                    n14 = 181;
                    break;
                }
                case 2: {
                    n14 = 20;
                    break;
                }
                case 3: {
                    n14 = 29;
                    break;
                }
                case 4: {
                    n14 = 226;
                    break;
                }
                case 5: {
                    n14 = 7;
                    break;
                }
                case 6: {
                    n14 = 71;
                    break;
                }
                case 7: {
                    n14 = 229;
                    break;
                }
                case 8: {
                    n14 = 221;
                    break;
                }
                case 9: {
                    n14 = 179;
                    break;
                }
                case 10: {
                    n14 = 196;
                    break;
                }
                case 11: {
                    n14 = 211;
                    break;
                }
                case 12: {
                    n14 = 195;
                    break;
                }
                case 13: {
                    n14 = 172;
                    break;
                }
                case 14: {
                    n14 = 235;
                    break;
                }
                case 15: {
                    n14 = 145;
                    break;
                }
                case 16: {
                    n14 = 65;
                    break;
                }
                case 17: {
                    n14 = 103;
                    break;
                }
                case 18: {
                    n14 = 8;
                    break;
                }
                case 19: {
                    n14 = 167;
                    break;
                }
                case 20: {
                    n14 = 203;
                    break;
                }
                case 21: {
                    n14 = 180;
                    break;
                }
                case 22: {
                    n14 = 95;
                    break;
                }
                case 23: {
                    n14 = 250;
                    break;
                }
                case 24: {
                    n14 = 165;
                    break;
                }
                case 25: {
                    n14 = 132;
                    break;
                }
                case 26: {
                    n14 = 21;
                    break;
                }
                case 27: {
                    n14 = 187;
                    break;
                }
                case 28: {
                    n14 = 102;
                    break;
                }
                case 29: {
                    n14 = 246;
                    break;
                }
                case 30: {
                    n14 = 18;
                    break;
                }
                case 31: {
                    n14 = 55;
                    break;
                }
                case 32: {
                    n14 = 178;
                    break;
                }
                case 33: {
                    n14 = 58;
                    break;
                }
                case 34: {
                    n14 = 148;
                    break;
                }
                case 35: {
                    n14 = 97;
                    break;
                }
                case 36: {
                    n14 = 34;
                    break;
                }
                case 37: {
                    n14 = 85;
                    break;
                }
                case 38: {
                    n14 = 161;
                    break;
                }
                case 39: {
                    n14 = 182;
                    break;
                }
                case 40: {
                    n14 = 51;
                    break;
                }
                case 41: {
                    n14 = 220;
                    break;
                }
                case 42: {
                    n14 = 109;
                    break;
                }
                case 43: {
                    n14 = 16;
                    break;
                }
                case 44: {
                    n14 = 27;
                    break;
                }
                case 45: {
                    n14 = 252;
                    break;
                }
                case 46: {
                    n14 = 242;
                    break;
                }
                case 47: {
                    n14 = 207;
                    break;
                }
                case 48: {
                    n14 = 38;
                    break;
                }
                case 49: {
                    n14 = 2;
                    break;
                }
                case 50: {
                    n14 = 6;
                    break;
                }
                case 51: {
                    n14 = 130;
                    break;
                }
                case 52: {
                    n14 = 44;
                    break;
                }
                case 53: {
                    n14 = 89;
                    break;
                }
                case 54: {
                    n14 = 231;
                    break;
                }
                case 55: {
                    n14 = 225;
                    break;
                }
                case 56: {
                    n14 = 193;
                    break;
                }
                case 57: {
                    n14 = 78;
                    break;
                }
                case 58: {
                    n14 = 26;
                    break;
                }
                case 59: {
                    n14 = 233;
                    break;
                }
                case 60: {
                    n14 = 185;
                    break;
                }
                case 61: {
                    n14 = 122;
                    break;
                }
                case 62: {
                    n14 = 166;
                    break;
                }
                case 63: {
                    n14 = 105;
                    break;
                }
                case 64: {
                    n14 = 83;
                    break;
                }
                case 65: {
                    n14 = 175;
                    break;
                }
                case 66: {
                    n14 = 230;
                    break;
                }
                case 67: {
                    n14 = 4;
                    break;
                }
                case 68: {
                    n14 = 48;
                    break;
                }
                case 69: {
                    n14 = 140;
                    break;
                }
                case 70: {
                    n14 = 93;
                    break;
                }
                case 71: {
                    n14 = 157;
                    break;
                }
                case 72: {
                    n14 = 152;
                    break;
                }
                case 73: {
                    n14 = 218;
                    break;
                }
                case 74: {
                    n14 = 173;
                    break;
                }
                case 75: {
                    n14 = 59;
                    break;
                }
                case 76: {
                    n14 = 37;
                    break;
                }
                case 77: {
                    n14 = 150;
                    break;
                }
                case 78: {
                    n14 = 212;
                    break;
                }
                case 79: {
                    n14 = 224;
                    break;
                }
                case 80: {
                    n14 = 14;
                    break;
                }
                case 81: {
                    n14 = 227;
                    break;
                }
                case 82: {
                    n14 = 9;
                    break;
                }
                case 83: {
                    n14 = 3;
                    break;
                }
                case 84: {
                    n14 = 190;
                    break;
                }
                case 85: {
                    n14 = 119;
                    break;
                }
                case 86: {
                    n14 = 49;
                    break;
                }
                case 87: {
                    n14 = 125;
                    break;
                }
                case 88: {
                    n14 = 149;
                    break;
                }
                case 89: {
                    n14 = 228;
                    break;
                }
                case 90: {
                    n14 = 56;
                    break;
                }
                case 91: {
                    n14 = 176;
                    break;
                }
                case 92: {
                    n14 = 133;
                    break;
                }
                case 93: {
                    n14 = 138;
                    break;
                }
                case 94: {
                    n14 = 121;
                    break;
                }
                case 95: {
                    n14 = 101;
                    break;
                }
                case 96: {
                    n14 = 241;
                    break;
                }
                case 97: {
                    n14 = 54;
                    break;
                }
                case 98: {
                    n14 = 222;
                    break;
                }
                case 99: {
                    n14 = 28;
                    break;
                }
                case 100: {
                    n14 = 142;
                    break;
                }
                case 101: {
                    n14 = 79;
                    break;
                }
                case 102: {
                    n14 = 22;
                    break;
                }
                case 103: {
                    n14 = 15;
                    break;
                }
                case 104: {
                    n14 = 198;
                    break;
                }
                case 105: {
                    n14 = 57;
                    break;
                }
                case 106: {
                    n14 = 248;
                    break;
                }
                case 107: {
                    n14 = 139;
                    break;
                }
                case 108: {
                    n14 = 33;
                    break;
                }
                case 109: {
                    n14 = 99;
                    break;
                }
                case 110: {
                    n14 = 42;
                    break;
                }
                case 111: {
                    n14 = 170;
                    break;
                }
                case 112: {
                    n14 = 156;
                    break;
                }
                case 113: {
                    n14 = 236;
                    break;
                }
                case 114: {
                    n14 = 155;
                    break;
                }
                case 115: {
                    n14 = 208;
                    break;
                }
                case 116: {
                    n14 = 67;
                    break;
                }
                case 117: {
                    n14 = 217;
                    break;
                }
                case 118: {
                    n14 = 188;
                    break;
                }
                case 119: {
                    n14 = 45;
                    break;
                }
                case 120: {
                    n14 = 47;
                    break;
                }
                case 121: {
                    n14 = 23;
                    break;
                }
                case 122: {
                    n14 = 75;
                    break;
                }
                case 123: {
                    n14 = 234;
                    break;
                }
                case 124: {
                    n14 = 35;
                    break;
                }
                case 125: {
                    n14 = 10;
                    break;
                }
                case 126: {
                    n14 = 64;
                    break;
                }
                case 127: {
                    n14 = 159;
                    break;
                }
                case 128: {
                    n14 = 214;
                    break;
                }
                case 129: {
                    n14 = 144;
                    break;
                }
                case 130: {
                    n14 = 249;
                    break;
                }
                case 131: {
                    n14 = 12;
                    break;
                }
                case 132: {
                    n14 = 72;
                    break;
                }
                case 133: {
                    n14 = 143;
                    break;
                }
                case 134: {
                    n14 = 100;
                    break;
                }
                case 135: {
                    n14 = 153;
                    break;
                }
                case 136: {
                    n14 = 90;
                    break;
                }
                case 137: {
                    n14 = 69;
                    break;
                }
                case 138: {
                    n14 = 82;
                    break;
                }
                case 139: {
                    n14 = 206;
                    break;
                }
                case 140: {
                    n14 = 135;
                    break;
                }
                case 141: {
                    n14 = 189;
                    break;
                }
                case 142: {
                    n14 = 80;
                    break;
                }
                case 143: {
                    n14 = 184;
                    break;
                }
                case 144: {
                    n14 = 86;
                    break;
                }
                case 145: {
                    n14 = 131;
                    break;
                }
                case 146: {
                    n14 = 147;
                    break;
                }
                case 147: {
                    n14 = 0;
                    break;
                }
                case 148: {
                    n14 = 43;
                    break;
                }
                case 149: {
                    n14 = 39;
                    break;
                }
                case 150: {
                    n14 = 164;
                    break;
                }
                case 151: {
                    n14 = 177;
                    break;
                }
                case 152: {
                    n14 = 158;
                    break;
                }
                case 153: {
                    n14 = 87;
                    break;
                }
                case 154: {
                    n14 = 169;
                    break;
                }
                case 155: {
                    n14 = 247;
                    break;
                }
                case 156: {
                    n14 = 111;
                    break;
                }
                case 157: {
                    n14 = 160;
                    break;
                }
                case 158: {
                    n14 = 81;
                    break;
                }
                case 159: {
                    n14 = 115;
                    break;
                }
                case 160: {
                    n14 = 25;
                    break;
                }
                case 161: {
                    n14 = 53;
                    break;
                }
                case 162: {
                    n14 = 17;
                    break;
                }
                case 163: {
                    n14 = 183;
                    break;
                }
                case 164: {
                    n14 = 128;
                    break;
                }
                case 165: {
                    n14 = 24;
                    break;
                }
                case 166: {
                    n14 = 134;
                    break;
                }
                case 167: {
                    n14 = 237;
                    break;
                }
                case 168: {
                    n14 = 13;
                    break;
                }
                case 169: {
                    n14 = 186;
                    break;
                }
                case 170: {
                    n14 = 163;
                    break;
                }
                case 171: {
                    n14 = 209;
                    break;
                }
                case 172: {
                    n14 = 243;
                    break;
                }
                case 173: {
                    n14 = 74;
                    break;
                }
                case 174: {
                    n14 = 191;
                    break;
                }
                case 175: {
                    n14 = 126;
                    break;
                }
                case 176: {
                    n14 = 232;
                    break;
                }
                case 177: {
                    n14 = 61;
                    break;
                }
                case 178: {
                    n14 = 73;
                    break;
                }
                case 179: {
                    n14 = 254;
                    break;
                }
                case 180: {
                    n14 = 137;
                    break;
                }
                case 181: {
                    n14 = 91;
                    break;
                }
                case 182: {
                    n14 = 253;
                    break;
                }
                case 183: {
                    n14 = 240;
                    break;
                }
                case 184: {
                    n14 = 107;
                    break;
                }
                case 185: {
                    n14 = 194;
                    break;
                }
                case 186: {
                    n14 = 141;
                    break;
                }
                case 187: {
                    n14 = 251;
                    break;
                }
                case 188: {
                    n14 = 68;
                    break;
                }
                case 189: {
                    n14 = 192;
                    break;
                }
                case 190: {
                    n14 = 201;
                    break;
                }
                case 191: {
                    n14 = 41;
                    break;
                }
                case 192: {
                    n14 = 245;
                    break;
                }
                case 193: {
                    n14 = 255;
                    break;
                }
                case 194: {
                    n14 = 36;
                    break;
                }
                case 195: {
                    n14 = 46;
                    break;
                }
                case 196: {
                    n14 = 5;
                    break;
                }
                case 197: {
                    n14 = 110;
                    break;
                }
                case 198: {
                    n14 = 162;
                    break;
                }
                case 199: {
                    n14 = 174;
                    break;
                }
                case 200: {
                    n14 = 63;
                    break;
                }
                case 201: {
                    n14 = 127;
                    break;
                }
                case 202: {
                    n14 = 50;
                    break;
                }
                case 203: {
                    n14 = 202;
                    break;
                }
                case 204: {
                    n14 = 30;
                    break;
                }
                case 205: {
                    n14 = 106;
                    break;
                }
                case 206: {
                    n14 = 215;
                    break;
                }
                case 207: {
                    n14 = 146;
                    break;
                }
                case 208: {
                    n14 = 213;
                    break;
                }
                case 209: {
                    n14 = 239;
                    break;
                }
                case 210: {
                    n14 = 238;
                    break;
                }
                case 211: {
                    n14 = 204;
                    break;
                }
                case 212: {
                    n14 = 124;
                    break;
                }
                case 213: {
                    n14 = 62;
                    break;
                }
                case 214: {
                    n14 = 52;
                    break;
                }
                case 215: {
                    n14 = 136;
                    break;
                }
                case 216: {
                    n14 = 32;
                    break;
                }
                case 217: {
                    n14 = 98;
                    break;
                }
                case 218: {
                    n14 = 104;
                    break;
                }
                case 219: {
                    n14 = 66;
                    break;
                }
                case 220: {
                    n14 = 19;
                    break;
                }
                case 221: {
                    n14 = 40;
                    break;
                }
                case 222: {
                    n14 = 129;
                    break;
                }
                case 223: {
                    n14 = 76;
                    break;
                }
                case 224: {
                    n14 = 210;
                    break;
                }
                case 225: {
                    n14 = 244;
                    break;
                }
                case 226: {
                    n14 = 31;
                    break;
                }
                case 227: {
                    n14 = 11;
                    break;
                }
                case 228: {
                    n14 = 77;
                    break;
                }
                case 229: {
                    n14 = 112;
                    break;
                }
                case 230: {
                    n14 = 117;
                    break;
                }
                case 231: {
                    n14 = 114;
                    break;
                }
                case 232: {
                    n14 = 199;
                    break;
                }
                case 233: {
                    n14 = 223;
                    break;
                }
                case 234: {
                    n14 = 120;
                    break;
                }
                case 235: {
                    n14 = 123;
                    break;
                }
                case 236: {
                    n14 = 118;
                    break;
                }
                case 237: {
                    n14 = 200;
                    break;
                }
                case 238: {
                    n14 = 219;
                    break;
                }
                case 239: {
                    n14 = 96;
                    break;
                }
                case 240: {
                    n14 = 70;
                    break;
                }
                case 241: {
                    n14 = 84;
                    break;
                }
                case 242: {
                    n14 = 154;
                    break;
                }
                case 243: {
                    n14 = 205;
                    break;
                }
                case 244: {
                    n14 = 60;
                    break;
                }
                case 245: {
                    n14 = 88;
                    break;
                }
                case 246: {
                    n14 = 151;
                    break;
                }
                case 247: {
                    n14 = 94;
                    break;
                }
                case 248: {
                    n14 = 116;
                    break;
                }
                case 249: {
                    n14 = 197;
                    break;
                }
                case 250: {
                    n14 = 108;
                    break;
                }
                case 251: {
                    n14 = 216;
                    break;
                }
                case 252: {
                    n14 = 92;
                    break;
                }
                case 253: {
                    n14 = 168;
                    break;
                }
                case 254: {
                    n14 = 113;
                    break;
                }
                default: {
                    n14 = 171;
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
            rx_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E22;
        if (f[n11] == null) {
            rx_0.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

