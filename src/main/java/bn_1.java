/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Renamed from bN
 */
public class bn_1 {
    protected static volatile String C;
    protected static volatile xJ V;
    private static volatile long u;
    protected static volatile OutputStream y;
    protected static volatile InputStream J;
    protected static volatile int[] l;
    protected static int k;
    protected static int I;
    private static int j;
    private static final String[] d;
    private static final String[] e;
    private static final long[] h;
    private static final Integer[] p;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    protected static void E(int var0) throws InterruptedException {
        var2_1 = bn_1.l;
        synchronized (bn_1.l) {
            block9: {
                block10: {
                    block11: {
                        var1_2 = bn_1.C();
                        bn_1.l[0] = bn_1.l[0] + 1;
                        v0 = bn_1.l;
                        v1 = 0;
                        if (var1_2 != 0) break block10;
                        if (v0[v1] >= var0) ** GOTO lbl22
                        break block11;
                        catch (InterruptedException v2) {
                            throw bn_1.b(v2);
                        }
                    }
                    try {
                        block12: {
                            bn_1.l.wait();
                            if (var1_2 == 0) break block9;
                            break block12;
                            catch (InterruptedException v3) {
                                throw bn_1.b(v3);
                            }
                        }
                        v0 = bn_1.l;
                        v1 = 0;
                    }
                    catch (InterruptedException v4) {
                        throw bn_1.b(v4);
                    }
                }
                v0[v1] = 0;
                bn_1.l.notifyAll();
            }
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return;
        }
    }

    protected static void m() throws Exception {
        try {
            L2 l2 = L2.f(C);
            V = (xJ)l2.r("PureJavaCommTestSuite", bn_1.a(11602, 7318272813032031441L));
            y = V.E();
            J = V.S();
            bn_1.w(J);
        }
        catch (lq_1 lq_12) {
            bn_1.Z("could no open port '%s'", new Object[]{C});
        }
    }

    /*
     * Unable to fully structure code
     */
    protected static void Y() {
        block8: {
            var0 = bn_1.C();
            try {
                v0 = bn_1.V;
                if (var0 == 0) {
                    if (v0 == null) break block8;
                }
                ** GOTO lbl13
            }
            catch (IOException v1) {
                throw bn_1.b(v1);
            }
            try {
                bn_1.y.flush();
                v0 = bn_1.V;
lbl13:
                // 2 sources

                v0.W();
            }
            catch (IOException var1_1) {
                var1_1.printStackTrace();
            }
            finally {
                bn_1.V = null;
            }
        }
    }

    protected static void w(InputStream inputStream) throws Exception {
        int n10;
        int n11 = bn_1.Z();
        bn_1.D(bn_1.a(30734, 2259246585652679048L));
        int n12 = n11;
        while ((n10 = inputStream.available()) > 0) {
            block5: {
                for (int i2 = 0; i2 < n10; ++i2) {
                    try {
                        inputStream.read();
                        if (n12 != 0) {
                            if (n12 != 0) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (Exception exception) {
                        throw bn_1.b(exception);
                    }
                }
                bn_1.D(bn_1.a(25610, 7990617986803731854L));
            }
            if (n12 != 0) continue;
        }
    }

    static void r(String string) {
        System.out.printf("%-46s", string);
        k = bn_1.a(26247, 4467211618054344453L);
        u = System.currentTimeMillis();
        I = 0;
    }

    protected static void B() throws InterruptedException {
        bn_1.D(bn_1.a(5019, 4741806893637630494L));
    }

    /*
     * Exception decompiling
     */
    protected static void D(int var0) throws InterruptedException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    static void Z(String string, Object[] objectArray) throws jz_0 {
        System.out.println(" FAILED");
        System.out.println("------------------------------------------------------------");
        System.out.printf(string, objectArray);
        System.out.println();
        System.out.println("------------------------------------------------------------");
        throw new jz_0();
    }

    static void i() {
        bn_1.G("", new Object[0]);
    }

    static void G(String string, Object[] objectArray) {
        block2: {
            int n10 = bn_1.C();
            for (int i2 = 0; i2 < k; ++i2) {
                System.out.print(".");
                if (n10 == 0) {
                    if (n10 == 0) continue;
                }
                break block2;
            }
            System.out.printf(" OK " + string, objectArray);
            System.out.println();
        }
    }

    public static void x(String[] stringArray) {
        block3: {
            String[] stringArray2;
            block2: {
                C = "cu.usbserial-FTOXM3NX";
                int n10 = bn_1.Z();
                stringArray2 = stringArray;
                if (n10 == 0) break block2;
                if (stringArray2.length <= 0) break block3;
                stringArray2 = stringArray;
            }
            C = stringArray2[0];
        }
    }

    public static String p() {
        return C;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[8];
                        var11_1 = 0;
                        bn_1.k(87);
                        var10_2 = "\u00b1*\u00e6s\u00c3\u0007r\u0014N\u00cd2C\u00f0<1\u00f5\u00e6\u0093\u00a7\bf\u00eea\u001d\u0001\u00d8Z\u0089\u00a4\u009cT\u00be\u00f1\u00ad\u00acZ8\u008b*\n?\u00d3\b\u00d7\u00c1\u00d7C\u0080\u00fa\u00ff\u00f2?s\u009c\u0014\u0001m\u008dm\u009c\u00d6\u00e9H\u00d2\u00a4\u009a\u00b9(M\u0097F_\b\u00c6\u0015h\"Ibo*\u00b4D\u00f1M\u00eb_\u00c2{\u00ce\u00a6:\u00b7\u00f9\u0083\u0005\u0004\u0082\u0019Z-\u0015\u00f1\u00c3sN\u00c6\u00be\u009a\u00b1\u00a0q\u00da\u001f\u0010q\u00e5\u009b\u0097t|\u00fe\u0099";
                        var12_3 = "\u00b1*\u00e6s\u00c3\u0007r\u0014N\u00cd2C\u00f0<1\u00f5\u00e6\u0093\u00a7\bf\u00eea\u001d\u0001\u00d8Z\u0089\u00a4\u009cT\u00be\u00f1\u00ad\u00acZ8\u008b*\n?\u00d3\b\u00d7\u00c1\u00d7C\u0080\u00fa\u00ff\u00f2?s\u009c\u0014\u0001m\u008dm\u009c\u00d6\u00e9H\u00d2\u00a4\u009a\u00b9(M\u0097F_\b\u00c6\u0015h\"Ibo*\u00b4D\u00f1M\u00eb_\u00c2{\u00ce\u00a6:\u00b7\u00f9\u0083\u0005\u0004\u0082\u0019Z-\u0015\u00f1\u00c3sN\u00c6\u00be\u009a\u00b1\u00a0q\u00da\u001f\u0010q\u00e5\u009b\u0097t|\u00fe\u0099".length();
                        var9_4 = 5;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 76;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00ccF\u00f8\u00d0\u0000z\u00cf0\f\u00f0#Y\u00d5\u008b]L\u00bc\u0089+M--u\u00a9<\u00c1\u00d9\u0086h\u00d5\tV\u00b0\u0019\u00a8p\u0010\n\u00ee\u00d0\u000e\u00a4\u0092\u0091V\u00de[\b\u00d5R\u00bfN\u001bX\u00b0\u00b5E\u00b3\u00ac\u009a\u0004\u0080>C\u00c2l\u00b4\u001cE=\u00fb\u00a2{\u00b8\u00fe\u00c4a\u00cb)}\u00c9>\u00eay\u000e";
                            var12_3 = "\u00ccF\u00f8\u00d0\u0000z\u00cf0\f\u00f0#Y\u00d5\u008b]L\u00bc\u0089+M--u\u00a9<\u00c1\u00d9\u0086h\u00d5\tV\u00b0\u0019\u00a8p\u0010\n\u00ee\u00d0\u000e\u00a4\u0092\u0091V\u00de[\b\u00d5R\u00bfN\u001bX\u00b0\u00b5E\u00b3\u00ac\u009a\u0004\u0080>C\u00c2l\u00b4\u001cE=\u00fb\u00a2{\u00b8\u00fe\u00c4a\u00cb)}\u00c9>\u00eay\u000e".length();
                            var9_4 = 24;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 60;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 76;
                                    break;
                                }
                                case 1: {
                                    v15 = 107;
                                    break;
                                }
                                case 2: {
                                    v15 = 41;
                                    break;
                                }
                                case 3: {
                                    v15 = 32;
                                    break;
                                }
                                case 4: {
                                    v15 = 62;
                                    break;
                                }
                                case 5: {
                                    v15 = 30;
                                    break;
                                }
                                default: {
                                    v15 = 53;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                bn_1.d = var13;
                bn_1.e = new String[8];
                var0_7 = 4612511962808211323L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\u00a1\u009e!\n\u009c\u00bb\u00c6\u0097\u008e\u001d.K\u00b2\u00b8 \u00bf`nNx&$\u00da\u0091\u008b\u00ea\u001a\t\t\u00a8\u00adM";
                var5_11 = "\u00a1\u009e!\n\u009c\u00bb\u00c6\u0097\u008e\u001d.K\u00b2\u00b8 \u00bf`nNx&$\u00da\u0091\u008b\u00ea\u001a\t\t\u00a8\u00adM".length();
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
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00d1\u00f7\u0007\u0003w\u00cc\u00d8P\u00d0\u00b7\u001b\nW@\u0010B";
                    var5_11 = "\u00d1\u00f7\u0007\u0003w\u00cc\u00d8P\u00d0\u00b7\u001b\nW@\u0010B".length();
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
lbl126:
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
lbl137:
                // 1 sources

                ** continue;
            }
        }
        bn_1.h = var6_8;
        bn_1.p = new Integer[6];
        bn_1.l = new int[]{0};
    }

    public static void k(int n10) {
        j = n10;
    }

    public static int Z() {
        return j;
    }

    public static int C() {
        int n10 = bn_1.Z();
        if (n10 == 0) {
            return 124;
        }
        return 0;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC1F9) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 165;
                    break;
                }
                case 1: {
                    n14 = 251;
                    break;
                }
                case 2: {
                    n14 = 55;
                    break;
                }
                case 3: {
                    n14 = 64;
                    break;
                }
                case 4: {
                    n14 = 159;
                    break;
                }
                case 5: {
                    n14 = 193;
                    break;
                }
                case 6: {
                    n14 = 226;
                    break;
                }
                case 7: {
                    n14 = 214;
                    break;
                }
                case 8: {
                    n14 = 111;
                    break;
                }
                case 9: {
                    n14 = 100;
                    break;
                }
                case 10: {
                    n14 = 120;
                    break;
                }
                case 11: {
                    n14 = 70;
                    break;
                }
                case 12: {
                    n14 = 56;
                    break;
                }
                case 13: {
                    n14 = 199;
                    break;
                }
                case 14: {
                    n14 = 225;
                    break;
                }
                case 15: {
                    n14 = 141;
                    break;
                }
                case 16: {
                    n14 = 67;
                    break;
                }
                case 17: {
                    n14 = 238;
                    break;
                }
                case 18: {
                    n14 = 170;
                    break;
                }
                case 19: {
                    n14 = 9;
                    break;
                }
                case 20: {
                    n14 = 179;
                    break;
                }
                case 21: {
                    n14 = 104;
                    break;
                }
                case 22: {
                    n14 = 176;
                    break;
                }
                case 23: {
                    n14 = 119;
                    break;
                }
                case 24: {
                    n14 = 13;
                    break;
                }
                case 25: {
                    n14 = 166;
                    break;
                }
                case 26: {
                    n14 = 41;
                    break;
                }
                case 27: {
                    n14 = 140;
                    break;
                }
                case 28: {
                    n14 = 25;
                    break;
                }
                case 29: {
                    n14 = 215;
                    break;
                }
                case 30: {
                    n14 = 146;
                    break;
                }
                case 31: {
                    n14 = 233;
                    break;
                }
                case 32: {
                    n14 = 98;
                    break;
                }
                case 33: {
                    n14 = 203;
                    break;
                }
                case 34: {
                    n14 = 247;
                    break;
                }
                case 35: {
                    n14 = 4;
                    break;
                }
                case 36: {
                    n14 = 75;
                    break;
                }
                case 37: {
                    n14 = 174;
                    break;
                }
                case 38: {
                    n14 = 222;
                    break;
                }
                case 39: {
                    n14 = 196;
                    break;
                }
                case 40: {
                    n14 = 178;
                    break;
                }
                case 41: {
                    n14 = 232;
                    break;
                }
                case 42: {
                    n14 = 94;
                    break;
                }
                case 43: {
                    n14 = 189;
                    break;
                }
                case 44: {
                    n14 = 62;
                    break;
                }
                case 45: {
                    n14 = 40;
                    break;
                }
                case 46: {
                    n14 = 216;
                    break;
                }
                case 47: {
                    n14 = 181;
                    break;
                }
                case 48: {
                    n14 = 253;
                    break;
                }
                case 49: {
                    n14 = 79;
                    break;
                }
                case 50: {
                    n14 = 156;
                    break;
                }
                case 51: {
                    n14 = 219;
                    break;
                }
                case 52: {
                    n14 = 168;
                    break;
                }
                case 53: {
                    n14 = 54;
                    break;
                }
                case 54: {
                    n14 = 142;
                    break;
                }
                case 55: {
                    n14 = 206;
                    break;
                }
                case 56: {
                    n14 = 210;
                    break;
                }
                case 57: {
                    n14 = 254;
                    break;
                }
                case 58: {
                    n14 = 35;
                    break;
                }
                case 59: {
                    n14 = 81;
                    break;
                }
                case 60: {
                    n14 = 123;
                    break;
                }
                case 61: {
                    n14 = 116;
                    break;
                }
                case 62: {
                    n14 = 127;
                    break;
                }
                case 63: {
                    n14 = 7;
                    break;
                }
                case 64: {
                    n14 = 194;
                    break;
                }
                case 65: {
                    n14 = 148;
                    break;
                }
                case 66: {
                    n14 = 11;
                    break;
                }
                case 67: {
                    n14 = 26;
                    break;
                }
                case 68: {
                    n14 = 169;
                    break;
                }
                case 69: {
                    n14 = 118;
                    break;
                }
                case 70: {
                    n14 = 107;
                    break;
                }
                case 71: {
                    n14 = 0;
                    break;
                }
                case 72: {
                    n14 = 151;
                    break;
                }
                case 73: {
                    n14 = 31;
                    break;
                }
                case 74: {
                    n14 = 46;
                    break;
                }
                case 75: {
                    n14 = 162;
                    break;
                }
                case 76: {
                    n14 = 177;
                    break;
                }
                case 77: {
                    n14 = 30;
                    break;
                }
                case 78: {
                    n14 = 108;
                    break;
                }
                case 79: {
                    n14 = 14;
                    break;
                }
                case 80: {
                    n14 = 149;
                    break;
                }
                case 81: {
                    n14 = 136;
                    break;
                }
                case 82: {
                    n14 = 129;
                    break;
                }
                case 83: {
                    n14 = 38;
                    break;
                }
                case 84: {
                    n14 = 163;
                    break;
                }
                case 85: {
                    n14 = 204;
                    break;
                }
                case 86: {
                    n14 = 195;
                    break;
                }
                case 87: {
                    n14 = 175;
                    break;
                }
                case 88: {
                    n14 = 236;
                    break;
                }
                case 89: {
                    n14 = 74;
                    break;
                }
                case 90: {
                    n14 = 16;
                    break;
                }
                case 91: {
                    n14 = 52;
                    break;
                }
                case 92: {
                    n14 = 117;
                    break;
                }
                case 93: {
                    n14 = 154;
                    break;
                }
                case 94: {
                    n14 = 76;
                    break;
                }
                case 95: {
                    n14 = 128;
                    break;
                }
                case 96: {
                    n14 = 173;
                    break;
                }
                case 97: {
                    n14 = 19;
                    break;
                }
                case 98: {
                    n14 = 44;
                    break;
                }
                case 99: {
                    n14 = 58;
                    break;
                }
                case 100: {
                    n14 = 50;
                    break;
                }
                case 101: {
                    n14 = 245;
                    break;
                }
                case 102: {
                    n14 = 249;
                    break;
                }
                case 103: {
                    n14 = 42;
                    break;
                }
                case 104: {
                    n14 = 160;
                    break;
                }
                case 105: {
                    n14 = 106;
                    break;
                }
                case 106: {
                    n14 = 188;
                    break;
                }
                case 107: {
                    n14 = 231;
                    break;
                }
                case 108: {
                    n14 = 49;
                    break;
                }
                case 109: {
                    n14 = 93;
                    break;
                }
                case 110: {
                    n14 = 161;
                    break;
                }
                case 111: {
                    n14 = 228;
                    break;
                }
                case 112: {
                    n14 = 48;
                    break;
                }
                case 113: {
                    n14 = 143;
                    break;
                }
                case 114: {
                    n14 = 241;
                    break;
                }
                case 115: {
                    n14 = 252;
                    break;
                }
                case 116: {
                    n14 = 78;
                    break;
                }
                case 117: {
                    n14 = 87;
                    break;
                }
                case 118: {
                    n14 = 3;
                    break;
                }
                case 119: {
                    n14 = 150;
                    break;
                }
                case 120: {
                    n14 = 224;
                    break;
                }
                case 121: {
                    n14 = 99;
                    break;
                }
                case 122: {
                    n14 = 10;
                    break;
                }
                case 123: {
                    n14 = 192;
                    break;
                }
                case 124: {
                    n14 = 8;
                    break;
                }
                case 125: {
                    n14 = 172;
                    break;
                }
                case 126: {
                    n14 = 12;
                    break;
                }
                case 127: {
                    n14 = 101;
                    break;
                }
                case 128: {
                    n14 = 63;
                    break;
                }
                case 129: {
                    n14 = 152;
                    break;
                }
                case 130: {
                    n14 = 6;
                    break;
                }
                case 131: {
                    n14 = 155;
                    break;
                }
                case 132: {
                    n14 = 208;
                    break;
                }
                case 133: {
                    n14 = 109;
                    break;
                }
                case 134: {
                    n14 = 186;
                    break;
                }
                case 135: {
                    n14 = 105;
                    break;
                }
                case 136: {
                    n14 = 29;
                    break;
                }
                case 137: {
                    n14 = 60;
                    break;
                }
                case 138: {
                    n14 = 103;
                    break;
                }
                case 139: {
                    n14 = 182;
                    break;
                }
                case 140: {
                    n14 = 68;
                    break;
                }
                case 141: {
                    n14 = 126;
                    break;
                }
                case 142: {
                    n14 = 84;
                    break;
                }
                case 143: {
                    n14 = 221;
                    break;
                }
                case 144: {
                    n14 = 212;
                    break;
                }
                case 145: {
                    n14 = 191;
                    break;
                }
                case 146: {
                    n14 = 239;
                    break;
                }
                case 147: {
                    n14 = 187;
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
                    n14 = 32;
                    break;
                }
                case 151: {
                    n14 = 83;
                    break;
                }
                case 152: {
                    n14 = 167;
                    break;
                }
                case 153: {
                    n14 = 88;
                    break;
                }
                case 154: {
                    n14 = 17;
                    break;
                }
                case 155: {
                    n14 = 77;
                    break;
                }
                case 156: {
                    n14 = 240;
                    break;
                }
                case 157: {
                    n14 = 23;
                    break;
                }
                case 158: {
                    n14 = 237;
                    break;
                }
                case 159: {
                    n14 = 27;
                    break;
                }
                case 160: {
                    n14 = 112;
                    break;
                }
                case 161: {
                    n14 = 218;
                    break;
                }
                case 162: {
                    n14 = 202;
                    break;
                }
                case 163: {
                    n14 = 200;
                    break;
                }
                case 164: {
                    n14 = 133;
                    break;
                }
                case 165: {
                    n14 = 164;
                    break;
                }
                case 166: {
                    n14 = 217;
                    break;
                }
                case 167: {
                    n14 = 71;
                    break;
                }
                case 168: {
                    n14 = 85;
                    break;
                }
                case 169: {
                    n14 = 90;
                    break;
                }
                case 170: {
                    n14 = 22;
                    break;
                }
                case 171: {
                    n14 = 227;
                    break;
                }
                case 172: {
                    n14 = 80;
                    break;
                }
                case 173: {
                    n14 = 135;
                    break;
                }
                case 174: {
                    n14 = 137;
                    break;
                }
                case 175: {
                    n14 = 59;
                    break;
                }
                case 176: {
                    n14 = 36;
                    break;
                }
                case 177: {
                    n14 = 244;
                    break;
                }
                case 178: {
                    n14 = 246;
                    break;
                }
                case 179: {
                    n14 = 205;
                    break;
                }
                case 180: {
                    n14 = 1;
                    break;
                }
                case 181: {
                    n14 = 61;
                    break;
                }
                case 182: {
                    n14 = 5;
                    break;
                }
                case 183: {
                    n14 = 82;
                    break;
                }
                case 184: {
                    n14 = 28;
                    break;
                }
                case 185: {
                    n14 = 125;
                    break;
                }
                case 186: {
                    n14 = 209;
                    break;
                }
                case 187: {
                    n14 = 65;
                    break;
                }
                case 188: {
                    n14 = 211;
                    break;
                }
                case 189: {
                    n14 = 57;
                    break;
                }
                case 190: {
                    n14 = 242;
                    break;
                }
                case 191: {
                    n14 = 15;
                    break;
                }
                case 192: {
                    n14 = 39;
                    break;
                }
                case 193: {
                    n14 = 24;
                    break;
                }
                case 194: {
                    n14 = 51;
                    break;
                }
                case 195: {
                    n14 = 248;
                    break;
                }
                case 196: {
                    n14 = 110;
                    break;
                }
                case 197: {
                    n14 = 207;
                    break;
                }
                case 198: {
                    n14 = 21;
                    break;
                }
                case 199: {
                    n14 = 158;
                    break;
                }
                case 200: {
                    n14 = 255;
                    break;
                }
                case 201: {
                    n14 = 33;
                    break;
                }
                case 202: {
                    n14 = 131;
                    break;
                }
                case 203: {
                    n14 = 95;
                    break;
                }
                case 204: {
                    n14 = 134;
                    break;
                }
                case 205: {
                    n14 = 18;
                    break;
                }
                case 206: {
                    n14 = 115;
                    break;
                }
                case 207: {
                    n14 = 37;
                    break;
                }
                case 208: {
                    n14 = 114;
                    break;
                }
                case 209: {
                    n14 = 243;
                    break;
                }
                case 210: {
                    n14 = 96;
                    break;
                }
                case 211: {
                    n14 = 183;
                    break;
                }
                case 212: {
                    n14 = 147;
                    break;
                }
                case 213: {
                    n14 = 230;
                    break;
                }
                case 214: {
                    n14 = 229;
                    break;
                }
                case 215: {
                    n14 = 132;
                    break;
                }
                case 216: {
                    n14 = 124;
                    break;
                }
                case 217: {
                    n14 = 201;
                    break;
                }
                case 218: {
                    n14 = 53;
                    break;
                }
                case 219: {
                    n14 = 223;
                    break;
                }
                case 220: {
                    n14 = 130;
                    break;
                }
                case 221: {
                    n14 = 180;
                    break;
                }
                case 222: {
                    n14 = 43;
                    break;
                }
                case 223: {
                    n14 = 213;
                    break;
                }
                case 224: {
                    n14 = 45;
                    break;
                }
                case 225: {
                    n14 = 66;
                    break;
                }
                case 226: {
                    n14 = 235;
                    break;
                }
                case 227: {
                    n14 = 185;
                    break;
                }
                case 228: {
                    n14 = 145;
                    break;
                }
                case 229: {
                    n14 = 20;
                    break;
                }
                case 230: {
                    n14 = 157;
                    break;
                }
                case 231: {
                    n14 = 153;
                    break;
                }
                case 232: {
                    n14 = 138;
                    break;
                }
                case 233: {
                    n14 = 102;
                    break;
                }
                case 234: {
                    n14 = 144;
                    break;
                }
                case 235: {
                    n14 = 97;
                    break;
                }
                case 236: {
                    n14 = 121;
                    break;
                }
                case 237: {
                    n14 = 92;
                    break;
                }
                case 238: {
                    n14 = 122;
                    break;
                }
                case 239: {
                    n14 = 171;
                    break;
                }
                case 240: {
                    n14 = 91;
                    break;
                }
                case 241: {
                    n14 = 139;
                    break;
                }
                case 242: {
                    n14 = 47;
                    break;
                }
                case 243: {
                    n14 = 197;
                    break;
                }
                case 244: {
                    n14 = 72;
                    break;
                }
                case 245: {
                    n14 = 198;
                    break;
                }
                case 246: {
                    n14 = 184;
                    break;
                }
                case 247: {
                    n14 = 2;
                    break;
                }
                case 248: {
                    n14 = 73;
                    break;
                }
                case 249: {
                    n14 = 250;
                    break;
                }
                case 250: {
                    n14 = 113;
                    break;
                }
                case 251: {
                    n14 = 34;
                    break;
                }
                case 252: {
                    n14 = 86;
                    break;
                }
                case 253: {
                    n14 = 234;
                    break;
                }
                case 254: {
                    n14 = 220;
                    break;
                }
                default: {
                    n14 = 89;
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
            bn_1.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6986;
        if (p[n11] == null) {
            bn_1.p[n11] = (int)(h[n11] ^ l2);
        }
        return p[n11];
    }
}

